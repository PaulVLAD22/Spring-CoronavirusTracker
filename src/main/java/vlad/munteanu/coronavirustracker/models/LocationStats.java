package vlad.munteanu.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int lastCaseNumber) {
        this.latestTotalCases = lastCaseNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
