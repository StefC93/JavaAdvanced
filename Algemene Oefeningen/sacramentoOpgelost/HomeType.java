package sacramentoOpgelost;

public enum HomeType {
    Residential("Residential"),
    Condo("Condo"),
    Unknown("Unknown"),
    MultiFamily("Multi-Family");

    private String text;

    HomeType(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static HomeType fromString(String text) {

        if (text != null) {
            for (HomeType b : HomeType.values()) {
                if (text.equalsIgnoreCase(b.text)) {
                    return b;
                }
            }
        }

        return HomeType.Unknown;
    }

}
