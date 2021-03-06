package com.google.code.geocoder.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:panchmp@gmail.com">Michael Panchenko</a>
 */
public class GeocoderAddressComponent implements Serializable {
    private static final long serialVersionUID = 1L;

    private String longName;
    private String shortName;
    private List<String> types;

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeocoderAddressComponent that = (GeocoderAddressComponent) o;

        if (longName != null ? !longName.equals(that.longName) : that.longName != null) return false;
        if (shortName != null ? !shortName.equals(that.shortName) : that.shortName != null) return false;
        if (types != null ? !types.equals(that.types) : that.types != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = longName != null ? longName.hashCode() : 0;
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (types != null ? types.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GeocoderAddressComponent{" +
                "longName='" + longName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", types=" + types +
                '}';
    }
}