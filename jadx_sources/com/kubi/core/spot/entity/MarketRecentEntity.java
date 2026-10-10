package com.kubi.core.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class MarketRecentEntity implements Parcelable {
    public static final Parcelable.Creator<MarketRecentEntity> CREATOR = new C12428a();
    private double price;
    private long sequence;
    private String side;
    private double size;
    private long time;

    /* JADX INFO: renamed from: com.kubi.core.spot.entity.MarketRecentEntity$a */
    public class C12428a implements Parcelable.Creator<MarketRecentEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MarketRecentEntity createFromParcel(Parcel parcel) {
            return new MarketRecentEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MarketRecentEntity[] newArray(int i11) {
            return new MarketRecentEntity[i11];
        }
    }

    public MarketRecentEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MarketRecentEntity(Parcel parcel) {
        this.sequence = parcel.readLong();
        this.size = parcel.readDouble();
        this.price = parcel.readDouble();
        this.side = parcel.readString();
        this.time = parcel.readLong();
    }

    public double getPrice() {
        return this.price;
    }

    public long getSequence() {
        return this.sequence;
    }

    public String getSide() {
        return this.side;
    }

    public double getSize() {
        return this.size;
    }

    public long getTime() {
        return this.time;
    }

    public void setPrice(double d11) {
        this.price = d11;
    }

    public void setSequence(long j11) {
        this.sequence = j11;
    }

    public void setSide(String str) {
        this.side = str;
    }

    public void setSize(double d11) {
        this.size = d11;
    }

    public void setTime(long j11) {
        this.time = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.sequence);
        parcel.writeDouble(this.size);
        parcel.writeDouble(this.price);
        parcel.writeString(this.side);
        parcel.writeLong(this.time);
    }
}
