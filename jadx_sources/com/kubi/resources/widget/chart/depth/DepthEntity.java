package com.kubi.resources.widget.chart.depth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class DepthEntity implements Parcelable, Comparable<DepthEntity> {
    public static final Parcelable.Creator<DepthEntity> CREATOR = new C23023a();
    private boolean isSell;
    private double price;
    private double volume;

    /* JADX INFO: renamed from: x */
    private float f44477x;

    /* JADX INFO: renamed from: y */
    private float f44478y;

    /* JADX INFO: renamed from: com.kubi.resources.widget.chart.depth.DepthEntity$a */
    public class C23023a implements Parcelable.Creator<DepthEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DepthEntity createFromParcel(Parcel parcel) {
            return new DepthEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DepthEntity[] newArray(int i11) {
            return new DepthEntity[i11];
        }
    }

    public DepthEntity(double d11, double d12, boolean z11) {
        this.price = d11;
        this.volume = d12;
        this.isSell = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull DepthEntity depthEntity) {
        double price = getPrice() - depthEntity.getPrice();
        if (price > 0.0d) {
            return 1;
        }
        return price < 0.0d ? -1 : 0;
    }

    public double getPrice() {
        return this.price;
    }

    public double getVolume() {
        return this.volume;
    }

    public float getX() {
        return this.f44477x;
    }

    public float getY() {
        return this.f44478y;
    }

    public boolean isSell() {
        return this.isSell;
    }

    public void setPrice(double d11) {
        this.price = d11;
    }

    public void setSell(boolean z11) {
        this.isSell = z11;
    }

    public void setVolume(double d11) {
        this.volume = d11;
    }

    public void setX(float f11) {
        this.f44477x = f11;
    }

    public void setY(float f11) {
        this.f44478y = f11;
    }

    public String toString() {
        return "DepthEntity{price=" + this.price + ", volume=" + this.volume + ", x=" + this.f44477x + ", y=" + this.f44478y + ", isSell=" + this.isSell + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeDouble(this.price);
        parcel.writeDouble(this.volume);
        parcel.writeFloat(this.f44477x);
        parcel.writeFloat(this.f44478y);
        parcel.writeByte(this.isSell ? (byte) 1 : (byte) 0);
    }

    public DepthEntity() {
    }

    public DepthEntity(Parcel parcel) {
        this.price = parcel.readDouble();
        this.volume = parcel.readDouble();
        this.f44477x = parcel.readFloat();
        this.f44478y = parcel.readFloat();
        this.isSell = parcel.readByte() != 0;
    }
}
