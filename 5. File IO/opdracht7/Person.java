package opdracht7;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Serializable {

	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	// transient zorgt ervoor dat het niet geserialiseerd wordt
	// Timer creeërt een eigen thread en kan dus ook niet geserialiseerd worden
	// indien je dit toch probeert krijg je een exception
	private transient Timer heartbeat;

	public Person(String firstName, String lastName, LocalDate birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		heartbeat = new Timer(true);
		heartbeat.scheduleAtFixedRate(new Heartbeat(), 0, 10);
	}

	private class Heartbeat extends TimerTask {
		public void run() {
			System.out.println("*");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "voornaam: " + firstName + "\nachternaam: " + lastName + "\ngeboortedatum: " + birthDay + "\n";
	}

}
