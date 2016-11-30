package callLogs;

public class CallLogData {

	/*
	 * Example data for CallLog
	 */
	
	public static String getCallLogData() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("id;naam;datum;tijd;bedrijf;omschrijving;prio;status\n");
		buffer.append("1;Lindsey Craft;21/08/2014;04:21:14;T-Network;speed else ill;7;IGNORE\n");
		buffer.append("2;Morgan Phillips;01/09/2015;09:31:33;ACA-IT;;7;IN PROGRESS\n");
		buffer.append("3;Leroy Avery;25/05/2016;06:50:10;T-Network;leader trees this to keys trying they;3;CLOSED\n");
		buffer.append("4;Antonio Garner;19/07/2012;14:40:08;ACA-IT;it to always was it television hatch;7;CLOSED\n");
		buffer.append("5;Kayla Kelly;12/05/2016;21:05:09;Telenet;dreams something suspense to;7;IGNORE\n");
		buffer.append("6;Russell Hobbs;16/12/2003;19:48:45;T-Network;while sidekick probably television to;0;IN PROGRESS\n");
		buffer.append("7;Myron Blanchard;12/07/2009;04:13:08;Cegeka;;10;OPEN\n");
		buffer.append("8;Marsha Doyle;04/12/2007;05:26:51;T-Network;the sill of they on;8;IN PROGRESS\n");
		buffer.append("9;Sierra Fletcher;17/03/2014;15:41:49;Yappa;warp;5;CLOSED\n");
		buffer.append("10;Patrick Walker;10/08/2008;10:53:08;XCOMM;as to was hid dreams library in;7;OPEN\n");
		buffer.append("11;Richard McCarthy;28/12/2000;11:55:25;Telenet;ship;5;IN PROGRESS\n");
		buffer.append("12;Brenda Flynn;25/06/2006;18:16:37;Proximus;to;6;CLOSED\n");
		buffer.append("13;Bobby Duke;29/09/2012;00:50:51;Telenet;dad always as hid;3;CLOSED\n");
		buffer.append("14;Kyle Cannon;01/11/2006;12:18:40;Mobistart;it where red;2;CLOSED\n");
		buffer.append("15;Juanita Short;29/03/2016;02:48:05;ACA-IT;;5;CLOSED\n");
		buffer.append("16;Chelsea Hurst;27/03/2004;23:52:57;ACA-IT;lost what room;6;CLOSED\n");
		buffer.append("17;Marilyn Nguyen;19/01/2006;06:41:01;Proximus;list something hot;2;OPEN\n");
		buffer.append("18;Charlie York;07/05/2000;01:35:20;XCOMM;pull from;3;IN PROGRESS\n");
		buffer.append("19;Skyler Murray;08/02/2013;20:26:48;Cegeka;it until are;5;OPEN\n");
		buffer.append("20;Anita Bernard;27/10/2001;21:33:20;Proximus;ship computer sidekick;0;IN PROGRESS\n");
		buffer.append("21;Tamara Hobbs;03/07/2013;05:12:56;Cegeka;;7;CLOSED\n");
		buffer.append("22;Janice Holcomb;22/06/2015;06:12:15;Telenet;captain window automatically library in caves;5;OPEN\n");
		buffer.append("23;Justin Watson;28/06/2005;12:08:01;Proximus;;5;CLOSED\n");
		buffer.append("24;Tamara Perez;21/08/2007;20:06:25;Telenet;should to moved captain assert shepherd;7;CLOSED\n");
		buffer.append("25;Debbie Fields;23/06/2001;10:53:15;Eurosys;sofa;10;IGNORE\n");
		buffer.append("26;Julie Walter;27/09/2005;22:41:23;Telenet;is cold no world days had of;3;CLOSED\n");
		buffer.append("27;Abigail Orr;27/07/2003;08:35:46;Eurosys;enter text;2;CLOSED\n");
		buffer.append("28;Alexandra Vinson;09/02/2014;07:53:30;Cegeka;while of hold;0;IGNORE\n");
		buffer.append("29;Patrick Adkins;19/01/2013;05:10:18;PXL;in numbers cold came;5;CLOSED\n");
		buffer.append("30;Jane McFadden;31/10/2004;08:22:44;Cegeka;;1;OPEN\n");
		buffer.append("31;Alissa Long;07/05/2000;17:43:28;T-Network;;3;IGNORE\n");
		buffer.append("32;Tyrone Ayala;27/04/2010;16:48:31;XCOMM;demanded keys captain assert what room;9;CLOSED\n");
		buffer.append("33;Jack Burris;22/06/2013;11:43:06;XCOMM;end headphones;1;CLOSED\n");
		buffer.append("34;Monica Little;30/06/2004;00:21:08;ACA-IT;I white smoke;1;IN PROGRESS\n");
		buffer.append("35;Frank Tran;31/08/2011;18:20:49;Cegeka;open people;7;IN PROGRESS\n");
		buffer.append("36;Tammy Schwartz;21/10/2011;15:18:15;Yappa;lost we build white boon secretly to;0;IN PROGRESS\n");
		buffer.append("37;Dorothy Stafford;25/10/2015;23:31:13;Mobistart;;3;OPEN\n");
		buffer.append("38;Kelly Rutledge;13/01/2015;05:34:36;Telenet;;6;CLOSED\n");
		buffer.append("39;Andrea Dean;08/11/2007;12:00:48;ACA-IT;what banging wrong days of hot;3;OPEN\n");
		buffer.append("40;Rebecca Lawrence;09/08/2008;14:55:40;Yappa;room hat assert cold ball is;9;IN PROGRESS\n");
		buffer.append("41;Stephen Medina;07/09/2009;21:25:37;Mobistart;sidekick enter man world smoke leader television;6;IN PROGRESS\n");
		buffer.append("42;Marlene Hancock;19/06/2009;01:15:41;Yappa;until what;0;CLOSED\n");
		buffer.append("43;Jonathon Schmidt;08/09/2005;08:02:23;Yappa;hat;5;IN PROGRESS\n");
		buffer.append("44;Matthew Robles;01/10/2012;06:39:10;Telenet;ship;6;IN PROGRESS\n");
		buffer.append("45;Tasha Curtis;24/02/2009;13:52:19;Cegeka;waited trees hat;5;CLOSED\n");
		buffer.append("46;Vernon Daniels;01/12/2014;06:02:35;ACA-IT;days suspense keys;8;IGNORE\n");
		buffer.append("47;Mary Miles;22/08/2002;17:17:11;Mobistart;so always else;3;IGNORE\n");
		buffer.append("48;Destiny Lewis;22/08/2011;20:47:02;Cegeka;moved no numbers came found ill;4;IN PROGRESS\n");
		buffer.append("49;Alyssa Casey;31/03/2002;18:01:34;Eurosys;have something probably wrong;0;OPEN\n");
		buffer.append("50;Angel Colon;28/07/2009;11:22:21;Telenet;came dad island visions my it is;8;OPEN\n");
		buffer.append("51;Lindsey Stein;31/10/2003;00:57:47;PXL;;8;IN PROGRESS\n");
		buffer.append("52;Rick McIntyre;10/01/2002;04:39:36;ACA-IT;rabbit in;7;IN PROGRESS\n");
		buffer.append("53;Tara Banks;17/11/2003;05:21:46;PXL;worn secretly want library sofa sacrifice;8;IGNORE\n");
		buffer.append("54;Seth Moss;21/11/2011;16:25:52;PXL;sits took;1;OPEN\n");
		buffer.append("55;Bill Munoz;05/01/2014;19:38:48;T-Network;it's monster discovered always;9;IN PROGRESS\n");
		buffer.append("56;Anita Hammond;05/02/2000;01:12:14;Mobistart;;3;OPEN\n");
		buffer.append("57;Mother Poole;26/08/2003;13:34:39;ACA-IT;suspense smoke from something;2;IGNORE\n");
		buffer.append("58;Marty Wilkerson;29/01/2015;03:02:04;T-Network;sofa had trying sits;3;IGNORE\n");
		buffer.append("59;Randi Hester;05/04/2004;09:21:36;Yappa;it hold in sits show of;5;IGNORE\n");
		buffer.append("60;Alice Rice;09/08/2000;16:25:18;T-Network;text captain;9;CLOSED\n");
		buffer.append("61;Andy Bullock;11/12/2002;20:29:28;T-Network;about caves speed;9;IN PROGRESS\n");
		buffer.append("62;Olivia Hancock;16/11/2007;14:07:13;T-Network;caves when where hat came;9;IN PROGRESS\n");
		buffer.append("63;Lois Rivers;16/01/2000;11:46:29;ACA-IT;window asked computer smoke badly hatch;1;CLOSED\n");
		buffer.append("64;Christopher Payne;18/02/2007;02:23:24;Proximus;ghost;1;IGNORE\n");
		buffer.append("65;Sally Cohen;30/08/2010;14:16:45;Mobistart;hold pull through ending wicket should;4;OPEN\n");
		buffer.append("66;Russ Schroeder;15/10/2000;10:20:40;Eurosys;of demanded something in island island many;3;CLOSED\n");
		buffer.append("67;Tony McCray;18/02/2006;02:45:13;T-Network;died to visions books enter world in;10;CLOSED\n");
		buffer.append("68;Christine Murphy;30/07/2008;23:01:40;Mobistart;leader hatch;4;CLOSED\n");
		buffer.append("69;Clara Branch;14/04/2008;01:09:28;T-Network;else visions came;1;IN PROGRESS\n");
		buffer.append("70;Kay Langley;31/01/2010;09:55:27;Mobistart;lock dad;1;OPEN\n");
		buffer.append("71;Rita Sellers;21/09/2016;15:54:59;XCOMM;discovered to what dreams the something;0;OPEN\n");
		buffer.append("72;John Key;14/03/2013;19:14:07;XCOMM;dad visions;2;CLOSED\n");
		buffer.append("73;Loretta Hines;28/01/2007;07:58:10;T-Network;red it banging;9;OPEN\n");
		buffer.append("74;Scott Jefferson;18/02/2000;12:29:07;Eurosys;;6;OPEN\n");
		buffer.append("75;Kathryn Moses;08/05/2013;01:43:46;Proximus;the man ill automatically island;0;IN PROGRESS\n");
		buffer.append("76;Brooke Cook;09/06/2015;11:55:27;ACA-IT;library took as smoke;4;IGNORE\n");
		buffer.append("77;Robbie Grimes;19/06/2010;02:16:30;Telenet;automatically trees smoke;5;IGNORE\n");
		buffer.append("78;Thelma Mercado;07/09/2016;19:46:03;Proximus;island should wrong no it something;7;CLOSED\n");
		buffer.append("79;Hope Leblanc;11/09/2008;15:44:31;XCOMM;boon;10;IN PROGRESS\n");
		buffer.append("80;Gloria Guzman;13/10/2003;19:55:24;PXL;;4;CLOSED\n");
		buffer.append("81;Matt Harrington;13/12/2003;02:57:06;Cegeka;ball from worn from rescue assert;2;CLOSED\n");
		buffer.append("82;Jill Mercer;24/05/2008;17:00:56;Yappa;dad;6;CLOSED\n");
		buffer.append("83;Levi Cooke;08/01/2012;13:00:53;PXL;the magnetic assert came;2;IGNORE\n");
		buffer.append("84;Marty Craft;04/11/2007;07:51:38;Proximus;ill to the are wicket;10;OPEN\n");
		buffer.append("85;Sandy Taylor;31/07/2009;06:35:05;Yappa;monster room constantly people;6;IN PROGRESS\n");
		buffer.append("86;Harry Swanson;18/10/2005;03:28:46;Proximus;end much light have;1;CLOSED\n");
		buffer.append("87;Derek Henderson;10/11/2003;11:42:39;Proximus;with;2;IGNORE\n");
		buffer.append("88;Lewis Bray;09/06/2015;12:48:59;Cegeka;books list moved it suspense;7;IN PROGRESS\n");
		buffer.append("89;Shawna Gilmore;18/01/2013;15:20:46;Mobistart;wrong window library window it ending so;0;CLOSED\n");
		buffer.append("90;Jeannie Jacobson;29/08/2011;09:22:04;Mobistart;;1;IGNORE\n");
		buffer.append("91;Jennifer Pickett;12/10/2010;02:35:49;Telenet;discovered warp;3;IN PROGRESS\n");
		buffer.append("92;Ed Strong;01/03/2014;04:50:08;XCOMM;ship my wrong;1;IN PROGRESS\n");
		buffer.append("93;Vicky Morales;01/07/2003;12:36:52;Cegeka;no much we;8;OPEN\n");
		buffer.append("94;Leonard Baldwin;30/05/2010;04:30:37;Yappa;ghost it's handled the dreams ends;6;CLOSED\n");
		buffer.append("95;Vernon Quinn;01/05/2004;11:29:57;ACA-IT;warp in on speed badly hot;5;IGNORE\n");
		buffer.append("96;Sabrina Huber;20/07/2012;14:23:27;Mobistart;are;0;IGNORE\n");
		buffer.append("97;Betty Sharpe;23/10/2007;23:17:05;Eurosys;ending it people room rabbit sacrifice of;4;OPEN\n");
		buffer.append("98;Bonnie Sherman;17/03/2007;03:37:28;XCOMM;assert;4;IGNORE\n");
		buffer.append("99;Dennis Nixon;14/11/2012;04:24:48;Proximus;ends good;2;IGNORE\n");
		buffer.append("100;Ryan Deleon;26/10/2005;18:01:13;Proximus;fire demanded monster my they list came;1;CLOSED\n");

		
		return buffer.toString();
	}
	
}
