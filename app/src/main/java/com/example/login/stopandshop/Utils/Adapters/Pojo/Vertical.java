package com.example.login.stopandshop.Utils.Adapters.Pojo;

/**
 * Created by Login on 3/20/2018.
 */

public class Vertical {

    private String header, subHeader;
    private int image;
    private Boolean signup;

    public Vertical( ) {

    }

    public Vertical(String header, String subHeader, int image) {
        this.header = header;
        this.subHeader = subHeader;
        this.image = image;
    }

    public Vertical(String header){
        this.header = header;
    }

    public Vertical(String header,Boolean signup){
        this.header = header;
        this.signup = signup;
    }

    public Boolean getSignup(){
        return signup;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSubHeader() {
        return subHeader;
    }

    public void setSubHeader(String subHeader) {
        this.subHeader = subHeader;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setSignup(boolean signup){
        this.signup = signup;
    }
}
