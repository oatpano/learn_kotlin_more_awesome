package com.example.oatrice.learnkotlinmoreawesome.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelJava {

    @Expose
    @SerializedName("dataList")
    private List<Data> datalist;

    public List<Data> getDatalist() {
        return datalist;
    }

    public void setDatalist(List<Data> datalist) {
        this.datalist = datalist;
    }

    public static class Data {
        @Expose
        @SerializedName("LATITUDE")
        private double latitude;
        @Expose
        @SerializedName("LONGITUDE")
        private double longitude;
        @Expose
        @SerializedName("FACILITYID")
        private int facilityid;
        @Expose
        @SerializedName("FACILITY_SUBTYPE")
        private String facilitySubtype;
        @Expose
        @SerializedName("WEBLINK")
        private String weblink;
        @Expose
        @SerializedName("FACILITY_TYPE")
        private String facilityType;
        @Expose
        @SerializedName("NAME")
        private String name;
        @Expose
        @SerializedName("LOCATION")
        private String location;
        @Expose
        @SerializedName("json_featuretype")
        private String jsonFeaturetype;

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public int getFacilityid() {
            return facilityid;
        }

        public void setFacilityid(int facilityid) {
            this.facilityid = facilityid;
        }

        public String getFacilitySubtype() {
            return facilitySubtype;
        }

        public void setFacilitySubtype(String facilitySubtype) {
            this.facilitySubtype = facilitySubtype;
        }

        public String getWeblink() {
            return weblink;
        }

        public void setWeblink(String weblink) {
            this.weblink = weblink;
        }

        public String getFacilityType() {
            return facilityType;
        }

        public void setFacilityType(String facilityType) {
            this.facilityType = facilityType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getJsonFeaturetype() {
            return jsonFeaturetype;
        }

        public void setJsonFeaturetype(String jsonFeaturetype) {
            this.jsonFeaturetype = jsonFeaturetype;
        }
    }
}
