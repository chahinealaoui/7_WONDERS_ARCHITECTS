package com.example.wondersarchitects.JetonRLTD;

public class JetonsProgres {

    private String back;
    private String faceType;

    public JetonsProgres(String back, String faceType) {
        this.back = back;
        this.faceType = faceType;
    }



    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getFaceType() {
        return faceType;
    }

    public void setFaceType(String faceType) {
        this.faceType = faceType;
    }
}