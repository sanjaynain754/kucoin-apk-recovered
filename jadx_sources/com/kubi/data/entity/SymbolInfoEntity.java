package com.kubi.data.entity;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.kubi.utils.NumberUtils;
import com.tencent.bugly.proguard.C33820nf;

/* JADX INFO: loaded from: classes.dex */
@Keep
@SuppressLint({"KCCyclomaticComplexityCheck"})
public class SymbolInfoEntity implements Parcelable {
    public static final Parcelable.Creator<SymbolInfoEntity> CREATOR = new Parcelable.Creator<SymbolInfoEntity>() { // from class: com.kubi.data.entity.SymbolInfoEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SymbolInfoEntity createFromParcel(Parcel parcel) {
            return new SymbolInfoEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SymbolInfoEntity[] newArray(int i11) {
            return new SymbolInfoEntity[i11];
        }
    };
    private String baseCurrency;
    private String baseCurrencyName;
    private String baseIncrement;
    private int baseIncrementPrecision;
    private int baseIncrementPrecisionTrade;
    private double baseMaxSize;
    private double baseMinSize;
    private int board;
    private String code;
    private String disabledTip;
    private boolean display;
    private boolean enableTrading;
    private String feeCode;
    private boolean isBotEnabled;
    private Boolean isEnableAuctionTrade;
    private boolean isEnabled;
    private boolean isIsolatedMarginEnabled;
    private boolean isIsolatedMarginTradeEnabled;
    private boolean isMarginEnabled;
    private double makerFeeRate;
    private int mark;
    private String market;
    private boolean previewEnableShow;
    private int previewRemainSecond;
    private Long previewTime;
    private String priceIncrement;
    private int priceIncrementPrecision;
    private int priceIncrementPrecisionTrade;
    private double priceLimitRate;
    private double priceProtectionRate;
    private String quoteCurrency;
    private String quoteCurrencyName;
    private String quoteIncrement;
    private int quoteIncrementPrecision;
    private int quoteIncrementPrecisionTrade;
    private double quoteMaxSize;
    private double quoteMinSize;
    private String showSymbol;
    private String symbol;
    private double takerFeeRate;
    private boolean tradeEnableShow;
    private String type;
    private long unionUpdatedAt;
    private int weight;

    public SymbolInfoEntity() {
        this.code = "";
        this.symbol = "";
        this.quoteCurrencyName = "";
        this.quoteIncrementPrecision = -1;
        this.quoteIncrementPrecisionTrade = -1;
        this.baseIncrementPrecision = -1;
        this.baseIncrementPrecisionTrade = -1;
        this.priceIncrementPrecision = -1;
        this.priceIncrementPrecisionTrade = -1;
        this.priceLimitRate = 0.1d;
        this.previewTime = 0L;
        this.isEnableAuctionTrade = Boolean.FALSE;
        this.isEnabled = true;
        this.unionUpdatedAt = 0L;
        this.priceProtectionRate = 0.05d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBaseCurrency() {
        if (this.baseCurrency == null) {
            this.baseCurrency = "";
        }
        return this.baseCurrency;
    }

    public String getBaseCurrencyName() {
        if (this.baseCurrencyName == null) {
            this.baseCurrencyName = this.symbol.split(C33820nf.f71144W)[0];
        }
        return this.baseCurrencyName;
    }

    public String getBaseIncrement() {
        if (TextUtils.isEmpty(this.baseIncrement)) {
            this.baseIncrement = "0.00000001";
        }
        return this.baseIncrement;
    }

    public int getBaseIncrementPrecision() {
        if (this.baseIncrementPrecision == -1) {
            setBaseIncrementPrecision(NumberUtils.m66403b(getBaseIncrement()));
        }
        return this.baseIncrementPrecision;
    }

    public int getBaseIncrementPrecisionTrade() {
        if (this.baseIncrementPrecisionTrade == -1) {
            setBaseIncrementPrecisionTrade(NumberUtils.m66402a(getBaseIncrement()));
        }
        return this.baseIncrementPrecisionTrade;
    }

    public double getBaseMaxSize() {
        return this.baseMaxSize;
    }

    public double getBaseMinSize() {
        return this.baseMinSize;
    }

    public int getBoard() {
        return this.board;
    }

    public String getCode() {
        return this.code;
    }

    public String getDisabledTip() {
        return this.disabledTip;
    }

    public Boolean getEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    public String getFeeCode() {
        return this.feeCode;
    }

    public double getMakerFeeRate() {
        return this.makerFeeRate;
    }

    public int getMark() {
        return this.mark;
    }

    public String getMarket() {
        return this.market;
    }

    public int getPreviewRemainSecond() {
        return this.previewRemainSecond;
    }

    public Long getPreviewTime() {
        return this.previewTime;
    }

    public String getPriceIncrement() {
        if (TextUtils.isEmpty(this.priceIncrement)) {
            this.priceIncrement = "0.00000001";
        }
        return this.priceIncrement;
    }

    public int getPriceIncrementPrecision() {
        if (this.priceIncrementPrecision == -1) {
            setPriceIncrementPrecision(NumberUtils.m66403b(getPriceIncrement()));
        }
        return this.priceIncrementPrecision;
    }

    public int getPriceIncrementPrecisionTrade() {
        if (this.priceIncrementPrecisionTrade == -1) {
            setPriceIncrementPrecisionTrade(NumberUtils.m66402a(getPriceIncrement()));
        }
        return this.priceIncrementPrecisionTrade;
    }

    public double getPriceLimitRate() {
        if (this.priceLimitRate == 0.0d) {
            this.priceLimitRate = 0.1d;
        }
        return this.priceLimitRate;
    }

    public double getPriceProtectionRate() {
        return this.priceProtectionRate;
    }

    public String getQuoteCurrency() {
        if (this.quoteCurrency == null) {
            this.quoteCurrency = "";
        }
        return this.quoteCurrency;
    }

    public String getQuoteCurrencyName() {
        if (TextUtils.isEmpty(this.quoteCurrencyName) && this.symbol.contains(C33820nf.f71144W)) {
            String[] strArrSplit = this.symbol.split(C33820nf.f71144W);
            if (strArrSplit.length > 1) {
                this.quoteCurrencyName = strArrSplit[1];
            }
        }
        return this.quoteCurrencyName;
    }

    public String getQuoteIncrement() {
        if (TextUtils.isEmpty(this.quoteIncrement)) {
            this.quoteIncrement = "0.00000001";
        }
        return this.quoteIncrement;
    }

    public int getQuoteIncrementPrecision() {
        if (this.quoteIncrementPrecision == -1) {
            setQuoteIncrementPrecision(NumberUtils.m66403b(getQuoteIncrement()));
        }
        return this.quoteIncrementPrecision;
    }

    public int getQuoteIncrementPrecisionTrade() {
        if (this.quoteIncrementPrecisionTrade == -1) {
            setQuoteIncrementPrecisionTrade(NumberUtils.m66402a(getQuoteIncrement()));
        }
        return this.quoteIncrementPrecisionTrade;
    }

    public double getQuoteMaxSize() {
        return this.quoteMaxSize;
    }

    public double getQuoteMinSize() {
        return this.quoteMinSize;
    }

    public String getShowSymbol() {
        if (TextUtils.isEmpty(this.showSymbol)) {
            this.showSymbol = getSymbol().replace(C33820nf.f71144W, "/");
        }
        return this.showSymbol;
    }

    public String getSymbol() {
        if (this.symbol == null) {
            this.symbol = "";
        }
        return this.symbol;
    }

    public double getTakerFeeRate() {
        if (this.takerFeeRate == 0.0d) {
            this.takerFeeRate = 0.001d;
        }
        return this.takerFeeRate;
    }

    public String getType() {
        return this.type;
    }

    public Long getUnionUpdatedAt() {
        return Long.valueOf(this.unionUpdatedAt);
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isBotEnabled() {
        return this.isBotEnabled;
    }

    public boolean isDisplay() {
        return this.display;
    }

    public boolean isEnableTrading() {
        return this.enableTrading;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean isEtfSymbol() {
        return "MARGIN_FUND".equals(this.type);
    }

    public boolean isIsolatedMarginEnabled() {
        return this.isIsolatedMarginEnabled;
    }

    public boolean isIsolatedMarginTradeEnabled() {
        return this.isIsolatedMarginTradeEnabled;
    }

    public boolean isMarginEnabled() {
        return this.isMarginEnabled;
    }

    public boolean isPreviewEnableShow() {
        return this.previewEnableShow;
    }

    public boolean isShowMarginLeverLabel() {
        return this.isMarginEnabled || this.isIsolatedMarginEnabled;
    }

    public boolean isTradeEnableShow() {
        return this.tradeEnableShow;
    }

    public void setBaseCurrency(String str) {
        this.baseCurrency = str;
    }

    public void setBaseCurrencyName(String str) {
        this.baseCurrencyName = str;
    }

    public void setBaseIncrement(String str) {
        this.baseIncrement = str;
    }

    public void setBaseIncrementPrecision(int i11) {
        this.baseIncrementPrecision = i11;
    }

    public void setBaseIncrementPrecisionTrade(int i11) {
        this.baseIncrementPrecisionTrade = i11;
    }

    public void setBaseMaxSize(double d11) {
        this.baseMaxSize = d11;
    }

    public void setBaseMinSize(double d11) {
        this.baseMinSize = d11;
    }

    public void setBoard(int i11) {
        this.board = i11;
    }

    public void setBotEnabled(boolean z11) {
        this.isBotEnabled = z11;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setDisabledTip(String str) {
        this.disabledTip = str;
    }

    public void setDisplay(boolean z11) {
        this.display = z11;
    }

    public void setEnableAuctionTrade(Boolean bool) {
        this.isEnableAuctionTrade = bool;
    }

    public void setEnableTrading(boolean z11) {
        this.enableTrading = z11;
    }

    public void setFeeCode(String str) {
        this.feeCode = str;
    }

    public void setIsolatedMarginEnabled(boolean z11) {
        this.isIsolatedMarginEnabled = z11;
    }

    public void setIsolatedMarginTradeEnabled(boolean z11) {
        this.isIsolatedMarginTradeEnabled = z11;
    }

    public void setMakerFeeRate(double d11) {
        this.makerFeeRate = d11;
    }

    public void setMarginEnabled(boolean z11) {
        this.isMarginEnabled = z11;
    }

    public void setMark(int i11) {
        this.mark = i11;
    }

    public void setMarket(String str) {
        this.market = str;
    }

    public void setPreviewEnableShow(boolean z11) {
        this.previewEnableShow = z11;
    }

    public void setPreviewRemainSecond(int i11) {
        this.previewRemainSecond = i11;
    }

    public void setPreviewTime(Long l11) {
        this.previewTime = l11;
    }

    public void setPriceIncrement(String str) {
        this.priceIncrement = str;
    }

    public void setPriceIncrementPrecision(int i11) {
        this.priceIncrementPrecision = i11;
    }

    public void setPriceIncrementPrecisionTrade(int i11) {
        this.priceIncrementPrecisionTrade = i11;
    }

    public void setPriceLimitRate(double d11) {
        this.priceLimitRate = d11;
    }

    public void setPriceProtectionRate(double d11) {
        this.priceProtectionRate = d11;
    }

    public void setQuoteCurrency(String str) {
        this.quoteCurrency = str;
    }

    public void setQuoteCurrencyName(String str) {
        this.quoteCurrencyName = str;
    }

    public void setQuoteIncrement(String str) {
        this.quoteIncrement = str;
    }

    public void setQuoteIncrementPrecision(int i11) {
        this.quoteIncrementPrecision = i11;
    }

    public void setQuoteIncrementPrecisionTrade(int i11) {
        this.quoteIncrementPrecisionTrade = i11;
    }

    public void setQuoteMaxSize(double d11) {
        this.quoteMaxSize = d11;
    }

    public void setQuoteMinSize(double d11) {
        this.quoteMinSize = d11;
    }

    public void setShowSymbol(String str) {
        this.showSymbol = str;
    }

    public void setSymbol(String str) {
        this.symbol = str;
    }

    public void setTakerFeeRate(double d11) {
        this.takerFeeRate = d11;
    }

    public void setTradeEnableShow(boolean z11) {
        this.tradeEnableShow = z11;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnionUpdatedAt(long j11) {
        this.unionUpdatedAt = j11;
    }

    public void setWeight(int i11) {
        this.weight = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.code);
        parcel.writeString(this.symbol);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.quoteCurrencyName);
        parcel.writeString(this.baseCurrencyName);
        parcel.writeInt(this.mark);
        parcel.writeInt(this.board);
        parcel.writeInt(this.weight);
        parcel.writeByte(this.enableTrading ? (byte) 1 : (byte) 0);
        parcel.writeString(this.disabledTip);
        parcel.writeByte(this.display ? (byte) 1 : (byte) 0);
        parcel.writeString(this.market);
        parcel.writeString(this.feeCode);
        parcel.writeByte(this.isMarginEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isIsolatedMarginEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isIsolatedMarginTradeEnabled ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.makerFeeRate);
        parcel.writeDouble(this.takerFeeRate);
        parcel.writeString(this.quoteIncrement);
        parcel.writeInt(this.quoteIncrementPrecision);
        parcel.writeInt(this.quoteIncrementPrecisionTrade);
        parcel.writeString(this.baseIncrement);
        parcel.writeString(this.type);
        parcel.writeInt(this.baseIncrementPrecision);
        parcel.writeInt(this.baseIncrementPrecisionTrade);
        parcel.writeString(this.priceIncrement);
        parcel.writeInt(this.priceIncrementPrecision);
        parcel.writeInt(this.priceIncrementPrecisionTrade);
        parcel.writeDouble(this.quoteMinSize);
        parcel.writeDouble(this.quoteMaxSize);
        parcel.writeDouble(this.baseMinSize);
        parcel.writeDouble(this.baseMaxSize);
        parcel.writeDouble(this.priceLimitRate);
        parcel.writeByte(this.isBotEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.previewEnableShow ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.previewRemainSecond);
        parcel.writeValue(this.previewTime);
        parcel.writeByte(this.tradeEnableShow ? (byte) 1 : (byte) 0);
        parcel.writeString(this.showSymbol);
        parcel.writeByte(this.isEnableAuctionTrade.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnabled ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.unionUpdatedAt);
        parcel.writeDouble(this.priceProtectionRate);
    }

    public void readFromParcel(Parcel parcel) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        this.code = parcel.readString();
        this.symbol = parcel.readString();
        this.baseCurrency = parcel.readString();
        this.quoteCurrency = parcel.readString();
        this.quoteCurrencyName = parcel.readString();
        this.baseCurrencyName = parcel.readString();
        this.mark = parcel.readInt();
        this.board = parcel.readInt();
        this.weight = parcel.readInt();
        boolean z18 = false;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.enableTrading = z11;
        this.disabledTip = parcel.readString();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.display = z12;
        this.market = parcel.readString();
        this.feeCode = parcel.readString();
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.isMarginEnabled = z13;
        this.makerFeeRate = parcel.readDouble();
        this.takerFeeRate = parcel.readDouble();
        this.quoteIncrement = parcel.readString();
        this.quoteIncrementPrecision = parcel.readInt();
        this.quoteIncrementPrecisionTrade = parcel.readInt();
        this.baseIncrement = parcel.readString();
        this.type = parcel.readString();
        this.baseIncrementPrecision = parcel.readInt();
        this.baseIncrementPrecisionTrade = parcel.readInt();
        this.priceIncrement = parcel.readString();
        this.priceIncrementPrecision = parcel.readInt();
        this.priceIncrementPrecisionTrade = parcel.readInt();
        this.quoteMinSize = parcel.readDouble();
        this.quoteMaxSize = parcel.readDouble();
        this.baseMinSize = parcel.readDouble();
        this.baseMaxSize = parcel.readDouble();
        this.priceLimitRate = parcel.readDouble();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.isBotEnabled = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.previewEnableShow = z15;
        this.previewRemainSecond = parcel.readInt();
        this.previewTime = (Long) parcel.readValue(Long.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.tradeEnableShow = z16;
        this.showSymbol = parcel.readString();
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.isEnableAuctionTrade = Boolean.valueOf(z17);
        if (parcel.readByte() != 0) {
            z18 = true;
        }
        this.isEnabled = z18;
        this.unionUpdatedAt = parcel.readLong();
    }

    public SymbolInfoEntity(Parcel parcel) {
        this.code = "";
        this.symbol = "";
        this.quoteCurrencyName = "";
        this.quoteIncrementPrecision = -1;
        this.quoteIncrementPrecisionTrade = -1;
        this.baseIncrementPrecision = -1;
        this.baseIncrementPrecisionTrade = -1;
        this.priceIncrementPrecision = -1;
        this.priceIncrementPrecisionTrade = -1;
        this.priceLimitRate = 0.1d;
        this.previewTime = 0L;
        this.isEnableAuctionTrade = Boolean.FALSE;
        this.isEnabled = true;
        this.unionUpdatedAt = 0L;
        this.priceProtectionRate = 0.05d;
        this.code = parcel.readString();
        this.symbol = parcel.readString();
        this.baseCurrency = parcel.readString();
        this.quoteCurrency = parcel.readString();
        this.quoteCurrencyName = parcel.readString();
        this.baseCurrencyName = parcel.readString();
        this.mark = parcel.readInt();
        this.board = parcel.readInt();
        this.weight = parcel.readInt();
        this.enableTrading = parcel.readByte() != 0;
        this.disabledTip = parcel.readString();
        this.display = parcel.readByte() != 0;
        this.market = parcel.readString();
        this.feeCode = parcel.readString();
        this.isMarginEnabled = parcel.readByte() != 0;
        this.isIsolatedMarginEnabled = parcel.readByte() != 0;
        this.isIsolatedMarginTradeEnabled = parcel.readByte() != 0;
        this.makerFeeRate = parcel.readDouble();
        this.takerFeeRate = parcel.readDouble();
        this.quoteIncrement = parcel.readString();
        this.quoteIncrementPrecision = parcel.readInt();
        this.quoteIncrementPrecisionTrade = parcel.readInt();
        this.baseIncrement = parcel.readString();
        this.type = parcel.readString();
        this.baseIncrementPrecision = parcel.readInt();
        this.baseIncrementPrecisionTrade = parcel.readInt();
        this.priceIncrement = parcel.readString();
        this.priceIncrementPrecision = parcel.readInt();
        this.priceIncrementPrecisionTrade = parcel.readInt();
        this.quoteMinSize = parcel.readDouble();
        this.quoteMaxSize = parcel.readDouble();
        this.baseMinSize = parcel.readDouble();
        this.baseMaxSize = parcel.readDouble();
        this.priceLimitRate = parcel.readDouble();
        this.isBotEnabled = parcel.readByte() != 0;
        this.previewEnableShow = parcel.readByte() != 0;
        this.previewRemainSecond = parcel.readInt();
        this.previewTime = (Long) parcel.readValue(Long.class.getClassLoader());
        this.tradeEnableShow = parcel.readByte() != 0;
        this.showSymbol = parcel.readString();
        this.isEnableAuctionTrade = Boolean.valueOf(parcel.readByte() != 0);
        this.isEnabled = parcel.readByte() != 0;
        this.unionUpdatedAt = parcel.readLong();
        this.priceProtectionRate = parcel.readDouble();
    }
}
