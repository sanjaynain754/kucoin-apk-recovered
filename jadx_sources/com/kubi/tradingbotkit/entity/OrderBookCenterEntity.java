package com.kubi.tradingbotkit.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes51.dex */
@Keep
public class OrderBookCenterEntity implements Parcelable {
    public static final Parcelable.Creator<OrderBookCenterEntity> CREATOR = new C26216a();
    private double bestAsk;
    private double bestAskSize;
    private double bestBid;
    private double bestBidSize;
    private double price;
    private long sequence;
    private double size;
    private String symbol;
    private long time;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.OrderBookCenterEntity$a */
    public class C26216a implements Parcelable.Creator<OrderBookCenterEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OrderBookCenterEntity createFromParcel(Parcel parcel) {
            return new OrderBookCenterEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OrderBookCenterEntity[] newArray(int i11) {
            return new OrderBookCenterEntity[i11];
        }
    }

    public OrderBookCenterEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public OrderBookCenterEntity(Parcel parcel) {
        this.bestAsk = parcel.readDouble();
        this.bestAskSize = parcel.readDouble();
        this.bestBid = parcel.readDouble();
        this.bestBidSize = parcel.readDouble();
        this.price = parcel.readDouble();
        this.sequence = parcel.readLong();
        this.size = parcel.readDouble();
        this.symbol = parcel.readString();
        this.time = parcel.readLong();
    }

    public void clear(String str) {
        setBestAsk(0.0d);
        setBestAskSize(0.0d);
        setBestBid(0.0d);
        setBestBidSize(0.0d);
        setPrice(0.0d);
        setSequence(0L);
        setSize(0.0d);
        setSymbol(str);
        setTime(0L);
    }

    public OrderBookCenterEntity covert(OrderBookCenterEntity orderBookCenterEntity) {
        setBestAsk(orderBookCenterEntity.bestAsk);
        setBestAskSize(orderBookCenterEntity.bestAskSize);
        setBestBid(orderBookCenterEntity.bestBid);
        setBestBidSize(orderBookCenterEntity.bestBidSize);
        setPrice(orderBookCenterEntity.price);
        setSequence(orderBookCenterEntity.sequence);
        setSize(orderBookCenterEntity.size);
        setSymbol(orderBookCenterEntity.symbol);
        setTime(orderBookCenterEntity.time);
        return this;
    }

    public double getBestAsk() {
        return this.bestAsk;
    }

    public double getBestAskSize() {
        return this.bestAskSize;
    }

    public double getBestBid() {
        return this.bestBid;
    }

    public double getBestBidSize() {
        return this.bestBidSize;
    }

    public double getPrice() {
        return this.price;
    }

    public long getSequence() {
        return this.sequence;
    }

    public double getSize() {
        return this.size;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public long getTime() {
        return this.time;
    }

    public void setBestAsk(double d11) {
        this.bestAsk = d11;
    }

    public void setBestAskSize(double d11) {
        this.bestAskSize = d11;
    }

    public void setBestBid(double d11) {
        this.bestBid = d11;
    }

    public void setBestBidSize(double d11) {
        this.bestBidSize = d11;
    }

    public void setPrice(double d11) {
        this.price = d11;
    }

    public void setSequence(long j11) {
        this.sequence = j11;
    }

    public void setSize(double d11) {
        this.size = d11;
    }

    public void setSymbol(String str) {
        this.symbol = str;
    }

    public void setTime(long j11) {
        this.time = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeDouble(this.bestAsk);
        parcel.writeDouble(this.bestAskSize);
        parcel.writeDouble(this.bestBid);
        parcel.writeDouble(this.bestBidSize);
        parcel.writeDouble(this.price);
        parcel.writeLong(this.sequence);
        parcel.writeDouble(this.size);
        parcel.writeString(this.symbol);
        parcel.writeLong(this.time);
    }
}
