package com.example.gallerylibrary;

import android.os.Parcel;
import android.os.Parcelable;

public class images implements Parcelable{
    String name;

    public images(String name) {
        this.name = name;
    }

    protected images(Parcel in) {
        name = in.readString();
    }

    public static final Creator<images> CREATOR = new Creator<images>() {
        @Override
        public images createFromParcel(Parcel in) {
            return new images(in);
        }

        @Override
        public images[] newArray(int size) {
            return new images[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
