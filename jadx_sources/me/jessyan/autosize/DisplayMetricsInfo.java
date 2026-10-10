package me.jessyan.autosize;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes23.dex */
public class DisplayMetricsInfo implements Parcelable {
    public static final Parcelable.Creator<DisplayMetricsInfo> CREATOR = new Parcelable.Creator<DisplayMetricsInfo>() { // from class: me.jessyan.autosize.DisplayMetricsInfo.1
        @Override // android.os.Parcelable.Creator
        public DisplayMetricsInfo createFromParcel(Parcel parcel) {
            return new DisplayMetricsInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DisplayMetricsInfo[] newArray(int i11) {
            return new DisplayMetricsInfo[i11];
        }
    };
    private float density;
    private int densityDpi;
    private float scaledDensity;
    private float xdpi;

    public DisplayMetricsInfo(float f11, int i11, float f12, float f13) {
        this.density = f11;
        this.densityDpi = i11;
        this.scaledDensity = f12;
        this.xdpi = f13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDensity() {
        return this.density;
    }

    public int getDensityDpi() {
        return this.densityDpi;
    }

    public float getScaledDensity() {
        return this.scaledDensity;
    }

    public float getXdpi() {
        return this.xdpi;
    }

    public void setDensity(float f11) {
        this.density = f11;
    }

    public void setDensityDpi(int i11) {
        this.densityDpi = i11;
    }

    public void setScaledDensity(float f11) {
        this.scaledDensity = f11;
    }

    public void setXdpi(float f11) {
        this.xdpi = f11;
    }

    public String toString() {
        return "DisplayMetricsInfo{density=" + this.density + ", densityDpi=" + this.densityDpi + ", scaledDensity=" + this.scaledDensity + ", xdpi=" + this.xdpi + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.density);
        parcel.writeInt(this.densityDpi);
        parcel.writeFloat(this.scaledDensity);
        parcel.writeFloat(this.xdpi);
    }

    public DisplayMetricsInfo(Parcel parcel) {
        this.density = parcel.readFloat();
        this.densityDpi = parcel.readInt();
        this.scaledDensity = parcel.readFloat();
        this.xdpi = parcel.readFloat();
    }
}
