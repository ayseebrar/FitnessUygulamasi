package com.aselley.fitnesuygulamas;

import android.os.Parcel;
import android.os.Parcelable;

public class FitnesMove implements Parcelable {
    private static String fitnessName;

    private String fitnessPicture;
    private String fitnessDescription;
    private int fitnessCalorie;
    private static Parcel String;


    public static final Creator<FitnesMove> CREATOR = new Creator<FitnesMove>() {
        @Override
        public FitnesMove createFromParcel(Parcel in) {
            return new FitnesMove(in);
        }

        @Override
        public FitnesMove[] newArray(int size) {
            return new FitnesMove[size];
        }
    };

    public static String getFitnessName() {
        return fitnessName;
    }

    public static void setFitnessName(String fitnessName) {
        FitnesMove.fitnessName = fitnessName;
    }

    public String getFitnessPicture() {
        return fitnessPicture;
    }

    public void setFitnessPicture(String fitnessPicture) {
        this.fitnessPicture = fitnessPicture;
    }

    public String getFitnessDescription() {
        return fitnessDescription;
    }

    public void setFitnessDescription(String fitnessDescription) {
        this.fitnessDescription = fitnessDescription;
    }

    public int getFitnessCalorie() {
        return fitnessCalorie;
    }

    public void setFitnessCalorie(int fitnessCalorie) {
        this.fitnessCalorie = fitnessCalorie;
    }

    public FitnesMove(String fitnessPicture, String fitnessDescription, int fitnessCalorie) {
        this.fitnessPicture = fitnessPicture;
        this.fitnessDescription = fitnessDescription;
        this.fitnessCalorie = fitnessCalorie;
    }

    public FitnesMove(Parcel string, String fitnessPicture) {
        this.fitnessPicture = fitnessPicture;
    }

    protected FitnesMove(Parcel String) {
        fitnessName = String.readString();
        fitnessPicture = String.readString();
        fitnessDescription = String.readString();
        fitnessCalorie = String.readInt();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fitnessName);
        dest.writeString(fitnessPicture);
        dest.writeString(fitnessDescription);
        dest.writeInt(fitnessCalorie);

    }

}