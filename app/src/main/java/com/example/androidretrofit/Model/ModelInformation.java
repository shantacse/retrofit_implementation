package com.example.androidretrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelInformation {


    @SerializedName("developing")
    @Expose
    private String developing;
    @SerializedName("completed")
    @Expose
    private String completed;
    @SerializedName("inqueue")
    @Expose
    private String inqueue;
    @SerializedName("noofdeveloperfulltime")
    @Expose
    private String noofdeveloperfulltime;
    @SerializedName("noofdeveloperparttime")
    @Expose
    private String noofdeveloperparttime;
    @SerializedName("networktype")
    @Expose
    private String networktype;
    @SerializedName("bandwidth")
    @Expose
    private String bandwidth;
    @SerializedName("OfficeAddress")
    @Expose
    private String officeAddress;



    public String getDeveloping() {
        return developing;
    }

    public void setDeveloping(String developing) {
        this.developing = developing;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getInqueue() {
        return inqueue;
    }

    public void setInqueue(String inqueue) {
        this.inqueue = inqueue;
    }

    public String getNoofdeveloperfulltime() {
        return noofdeveloperfulltime;
    }

    public void setNoofdeveloperfulltime(String noofdeveloperfulltime) {
        this.noofdeveloperfulltime = noofdeveloperfulltime;
    }

    public String getNoofdeveloperparttime() {
        return noofdeveloperparttime;
    }

    public void setNoofdeveloperparttime(String noofdeveloperparttime) {
        this.noofdeveloperparttime = noofdeveloperparttime;
    }

    public String getNetworktype() {
        return networktype;
    }

    public void setNetworktype(String networktype) {
        this.networktype = networktype;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

}
