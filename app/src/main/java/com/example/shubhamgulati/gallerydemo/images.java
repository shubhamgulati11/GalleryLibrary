package com.example.shubhamgulati.gallerydemo;

import android.os.Parcel;
import android.os.Parcelable;

public class images implements Parcelable {
    int image;

    public images(int image) {
        this.image = image;
    }

    protected images(Parcel in) {
        image = in.readInt();
    }

    public images() {
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

    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
    }
}
