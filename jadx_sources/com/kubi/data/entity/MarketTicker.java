package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class MarketTicker implements Parcelable {
    public static final Parcelable.Creator<MarketTicker> CREATOR = new Parcelable.Creator<MarketTicker>() { // from class: com.kubi.data.entity.MarketTicker.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MarketTicker createFromParcel(Parcel parcel) {
            return new MarketTicker(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MarketTicker[] newArray(int i11) {
            return new MarketTicker[i11];
        }
    };
    private Double changePrice;
    private Double changeRate;
    private Double high;
    private Double lastDealPrice;
    private Double low;
    private Double value;

    public MarketTicker() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MarketTicker(Parcel parcel) {
        this.lastDealPrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.high = (Double) parcel.readValue(Double.class.getClassLoader());
        this.low = (Double) parcel.readValue(Double.class.getClassLoader());
        this.changeRate = (Double) parcel.readValue(Double.class.getClassLoader());
        this.changePrice = (Double) parcel.readValue(Double.class.getClassLoader());
        this.value = (Double) parcel.readValue(Double.class.getClassLoader());
    }

    @Nullable
    public Double getChangePrice() {
        return this.changePrice;
    }

    @Nullable
    public Double getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public Double getHigh() {
        return this.high;
    }

    @Nullable
    public Double getLastDealPrice() {
        return this.lastDealPrice;
    }

    @Nullable
    public Double getLow() {
        return this.low;
    }

    @Nullable
    public Double getValue() {
        return this.value;
    }

    public void setChangePrice(Double d11) {
        this.changePrice = d11;
    }

    public void setChangeRate(Double d11) {
        this.changeRate = d11;
    }

    public void setHigh(Double d11) {
        this.high = d11;
    }

    public void setLastDealPrice(Double d11) {
        this.lastDealPrice = d11;
    }

    public void setLow(Double d11) {
        this.low = d11;
    }

    public void setValue(Double d11) {
        this.value = d11;
    }

    public String toString() {
        return "MarketTicker{lastDealPrice=" + this.lastDealPrice + ", high=" + this.high + ", low=" + this.low + ", changeRate=" + this.changeRate + ", changePrice=" + this.changePrice + ", value=" + this.value + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeValue(this.lastDealPrice);
        parcel.writeValue(this.high);
        parcel.writeValue(this.low);
        parcel.writeValue(this.changeRate);
        parcel.writeValue(this.changePrice);
        parcel.writeValue(this.value);
    }
}
