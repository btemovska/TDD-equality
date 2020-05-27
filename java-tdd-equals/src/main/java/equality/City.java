package equality;

public class City {

    private String cityName;
    private String state;

    public City(String cityName, String state) {
        this.cityName = cityName;
        this.state = state;
    }

    public String getCityName() {
        return cityName;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isACity = obj instanceof City;
        if (obj == null || !isACity) {
            return false;
        }
        City theOther = (City) obj;
        return theOther.cityName.equals(cityName) && theOther.state.equals(state);
    }

    @Override
    public int hashCode() {
        return cityName.hashCode();
    }
}
