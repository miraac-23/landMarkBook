package com.basarsoft.landmarkbookjava;

public class Singleton {
    private Landmark selectedLandmark;
    private static Singleton singleton;

    public Singleton(){

    }

    public Landmark getSelectedLandmark(){
        return selectedLandmark;
    }

    public void setChosenLandmark(Landmark selectedLandmark){
        this.selectedLandmark = selectedLandmark;
    }

    public  static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();

        }
        return  singleton;

    }

    public static class getInstance extends Singleton {
    }
}
