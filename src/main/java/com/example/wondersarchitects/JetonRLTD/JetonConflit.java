package com.example.wondersarchitects.JetonRLTD;

public class JetonConflit {

    private String FacePaix;

    private String FaceBataille;

    public JetonConflit(String facePaix, String faceBataille) {
        this.FaceBataille = faceBataille;
        this.FacePaix = facePaix;
    }


    public String getFacePaix() {
        return FacePaix;
    }

    public void setFacePaix(String facePaix) {
        FacePaix = facePaix;
    }

    public String getFaceBataille() {
        return FaceBataille;
    }

    public void setFaceBataille(String faceBataille) {
        FaceBataille = faceBataille;
    }
}
