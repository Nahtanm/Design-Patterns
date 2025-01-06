package br.com.nahtanm.build.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "GPSNavigator{" +
                "route='" + route + '\'' +
                '}';
    }
}
