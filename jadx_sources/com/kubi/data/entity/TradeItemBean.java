package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.kubi.data.regulations.FinancialRegulationsEx;
import com.kubi.utils.NumberUtils;
import com.tencent.bugly.proguard.C33820nf;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nf.C42828b;
import p340if.C38527a;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TradeItemBean implements Parcelable {
    public static final Parcelable.Creator<TradeItemBean> CREATOR = new Parcelable.Creator<TradeItemBean>() { // from class: com.kubi.data.entity.TradeItemBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TradeItemBean createFromParcel(Parcel parcel) {
            return new TradeItemBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TradeItemBean[] newArray(int i11) {
            return new TradeItemBean[i11];
        }
    };
    private boolean alarm;
    private Double changeRate;
    private String coinLabel;
    public boolean empty;
    private boolean favor;

    @Nullable
    public BigDecimal fundingRate;
    public int index;
    public boolean isChecked;
    public boolean isEnableAuctionTrade;
    private double lastDealPrice;
    private int mark;

    @Nullable
    public BigDecimal marketCap;
    public MarketTicker marketTicker;
    private int maxLeverage;
    private int plus;
    private String showSymbol;
    private final Set<String> spotMarks;
    private String symbol;
    private SymbolInfoEntity symbolInfoEntity;

    @SerializedName("stick")
    private boolean top;
    private double value;

    public TradeItemBean(String str) {
        this.maxLeverage = -1;
        this.index = -1;
        this.symbol = "";
        this.isEnableAuctionTrade = false;
        this.coinLabel = "";
        this.spotMarks = new HashSet();
        this.marketTicker = new MarketTicker();
        if (!TextUtils.isEmpty(str) && str.contains("/")) {
            str = str.replace("/", C33820nf.f71144W);
        }
        this.symbol = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SymbolInfoEntity getSymbolInfoEntity() {
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        synchronized (this) {
            try {
                if (this.symbolInfoEntity == null) {
                    this.symbolInfoEntity = C37890n.f85269a.m85601B(this.symbol);
                }
                if (this.symbolInfoEntity == null) {
                    SymbolInfoEntity symbolInfoEntity3 = new SymbolInfoEntity();
                    this.symbolInfoEntity = symbolInfoEntity3;
                    String str = this.symbol;
                    if (str != null) {
                        symbolInfoEntity3.setSymbol(str);
                        this.symbolInfoEntity.setCode(this.symbol);
                        this.symbolInfoEntity.setEnableAuctionTrade(Boolean.valueOf(this.isEnableAuctionTrade));
                        String[] strArrSplit = this.symbol.split(C33820nf.f71144W);
                        if (strArrSplit.length > 1 && (symbolInfoEntity2 = this.symbolInfoEntity) != null) {
                            symbolInfoEntity2.setBaseCurrency(strArrSplit[0]);
                            this.symbolInfoEntity.setQuoteCurrency(strArrSplit[1]);
                            this.symbolInfoEntity.setBaseCurrencyName(strArrSplit[0]);
                            this.symbolInfoEntity.setQuoteCurrencyName(strArrSplit[1]);
                        }
                    }
                }
                symbolInfoEntity = this.symbolInfoEntity;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return symbolInfoEntity;
    }

    public void setSymbolInfoEntity(SymbolInfoEntity symbolInfoEntity) {
        synchronized (this) {
            this.symbolInfoEntity = symbolInfoEntity;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof TradeItemBean ? ((TradeItemBean) obj).getSymbol().equals(getSymbol()) : super.equals(obj);
    }

    @Nullable
    public Double getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public String getCoinLabel() {
        return this.coinLabel;
    }

    public String getInnerSymbol() {
        return this.symbol;
    }

    public double getLastDealPrice() {
        return this.lastDealPrice;
    }

    public int getMark() {
        return this.mark;
    }

    public int getMaxLeverage() {
        return this.maxLeverage;
    }

    public int getPlus() {
        return this.plus;
    }

    public String getShowSymbol() {
        if (TextUtils.isEmpty(this.showSymbol)) {
            this.showSymbol = getSymbolInfoEntity().getShowSymbol();
        }
        return this.showSymbol;
    }

    public double getValue() {
        return this.value;
    }

    public boolean isAlarm() {
        return this.alarm;
    }

    public boolean isEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    public boolean isFavor() {
        return this.favor;
    }

    public boolean isPlus() {
        return this.plus == 1;
    }

    public boolean isRWA() {
        Iterator<String> it = this.spotMarks.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(TradeMarkKt.RWA)) {
                return true;
            }
        }
        return false;
    }

    public boolean isTop() {
        return this.top;
    }

    public void setAlarm(boolean z11) {
        this.alarm = z11;
    }

    public void setChangeRate(Double d11) {
        this.changeRate = d11;
    }

    public void setCoinLabel(String str) {
        this.coinLabel = str;
    }

    public void setEnableAuctionTrade(boolean z11) {
        this.isEnableAuctionTrade = z11;
    }

    public void setFavor(boolean z11) {
        this.favor = z11;
    }

    public void setLastDealPrice(double d11) {
        this.lastDealPrice = d11;
    }

    public void setMark(int i11) {
        this.mark = i11;
    }

    public void setMaxLeverage(int i11) {
        this.maxLeverage = i11;
    }

    public void setPlus(int i11) {
        this.plus = i11;
    }

    public void setShowSymbol(String str) {
        this.showSymbol = str;
    }

    public void setSymbol(String str) {
        this.symbol = str;
    }

    public void setTop(boolean z11) {
        this.top = z11;
    }

    public void setValue(double d11) {
        this.value = d11;
    }

    public void updateSpotMarks(List<String> list) {
        this.spotMarks.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.spotMarks.addAll(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.isChecked ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.index);
        parcel.writeParcelable(this.symbolInfoEntity, i11);
        parcel.writeValue(this.changeRate);
        parcel.writeDouble(this.lastDealPrice);
        parcel.writeString(this.symbol);
        parcel.writeDouble(this.value);
        parcel.writeByte(this.alarm ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mark);
        parcel.writeByte(this.favor ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.plus);
        parcel.writeByte(this.top ? (byte) 1 : (byte) 0);
        parcel.writeString(this.showSymbol);
        parcel.writeString(this.coinLabel);
        parcel.writeParcelable(this.marketTicker, i11);
        parcel.writeByte(this.isEnableAuctionTrade ? (byte) 1 : (byte) 0);
    }

    @Deprecated
    public String getFormatChangeRate() {
        String str;
        if (getChangeRate() == null) {
            return "- -";
        }
        StringBuilder sb2 = new StringBuilder();
        if (getChangeRate().doubleValue() > 0.0d) {
            str = "+";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(NumberUtils.INSTANCE.formatPercent(getChangeRate(), 2));
        return C42828b.m93903d(sb2.toString());
    }

    public String getFormatChangeRateV2() {
        if (getChangeRate() == null) {
            return "--";
        }
        return FinancialRegulationsEx.f21492a.formatPercentRegular(new BigDecimal(getChangeRate().toString()), true);
    }

    public String getSymbol() {
        return getSymbolInfoEntity().getCode();
    }

    public boolean needPullPreviewInfo() {
        SymbolInfoEntity symbolInfoEntity = getSymbolInfoEntity();
        if (!symbolInfoEntity.isPreviewEnableShow()) {
            if (symbolInfoEntity.isEnableTrading() || symbolInfoEntity.getEnableAuctionTrade().booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isChecked = z11;
        this.index = parcel.readInt();
        this.symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(SymbolInfoEntity.class.getClassLoader());
        this.changeRate = (Double) parcel.readValue(Double.class.getClassLoader());
        this.lastDealPrice = parcel.readDouble();
        this.symbol = parcel.readString();
        this.value = parcel.readDouble();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.alarm = z12;
        this.mark = parcel.readInt();
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.favor = z13;
        this.plus = parcel.readInt();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.top = z14;
        this.showSymbol = parcel.readString();
        this.coinLabel = parcel.readString();
        this.marketTicker = (MarketTicker) parcel.readParcelable(MarketTicker.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z15 = true;
        }
        this.isEnableAuctionTrade = z15;
    }

    public TradeItemBean() {
        this.maxLeverage = -1;
        this.index = -1;
        this.symbol = "";
        this.isEnableAuctionTrade = false;
        this.coinLabel = "";
        this.spotMarks = new HashSet();
        this.marketTicker = new MarketTicker();
    }

    public TradeItemBean(Parcel parcel) {
        this.maxLeverage = -1;
        this.index = -1;
        this.symbol = "";
        this.isEnableAuctionTrade = false;
        this.coinLabel = "";
        this.spotMarks = new HashSet();
        this.marketTicker = new MarketTicker();
        this.isChecked = parcel.readByte() != 0;
        this.index = parcel.readInt();
        this.symbolInfoEntity = (SymbolInfoEntity) parcel.readParcelable(SymbolInfoEntity.class.getClassLoader());
        try {
            this.changeRate = (Double) parcel.readValue(Double.class.getClassLoader());
        } catch (Throwable th2) {
            this.changeRate = Double.valueOf(0.0d);
            C38527a.m87142a(th2, "TradeItemBean");
        }
        this.lastDealPrice = parcel.readDouble();
        this.symbol = parcel.readString();
        this.value = parcel.readDouble();
        this.alarm = parcel.readByte() != 0;
        this.mark = parcel.readInt();
        this.favor = parcel.readByte() != 0;
        this.plus = parcel.readInt();
        this.top = parcel.readByte() != 0;
        this.showSymbol = parcel.readString();
        this.coinLabel = parcel.readString();
        this.marketTicker = (MarketTicker) parcel.readParcelable(MarketTicker.class.getClassLoader());
        this.isEnableAuctionTrade = parcel.readByte() != 0;
    }
}
