package com.kubi.data.entity;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.kubi.utils.C27021e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@SuppressLint({"KCCyclomaticComplexityCheck"})
public class CoinInfoEntity implements Parcelable, Cloneable {
    public static final Parcelable.Creator<CoinInfoEntity> CREATOR = new Parcelable.Creator<CoinInfoEntity>() { // from class: com.kubi.data.entity.CoinInfoEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoinInfoEntity createFromParcel(Parcel parcel) {
            return new CoinInfoEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoinInfoEntity[] newArray(int i11) {
            return new CoinInfoEntity[i11];
        }
    };
    private double availableBalance;
    private String code;
    private CoinInfoEntity contractCoin;
    private String currency;
    private String currencyType;
    private String depositDisabledTip;
    private long depositEnableAt;
    private String iconUrl;
    private double innerWithdrawMinFee;
    private boolean isDebitEnabled;
    private boolean isDepositEnabled;
    private boolean isDigital;
    private boolean isDisplayDeposit;
    private boolean isDisplayWithdraw;
    private boolean isEarnEnabled;
    private boolean isIsolatedEnabled;
    private boolean isMarginEnabled;
    private boolean isPoolXEnabled;
    private boolean isWithdrawEnabled;
    private String name;
    private int precision;
    private CoinProperty properties;
    private int status;
    private SubscriptionInfoEntity subscriptionInfo;
    private int type;
    private String withdrawDisabledTip;
    private long withdrawEnableAt;
    private double withdrawMinFee;
    private double withdrawMinSize;

    public CoinInfoEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CoinInfoEntity(Parcel parcel) {
        this.code = parcel.readString();
        this.currency = parcel.readString();
        this.name = parcel.readString();
        this.precision = parcel.readInt();
        this.status = parcel.readInt();
        this.withdrawMinFee = parcel.readDouble();
        this.withdrawMinSize = parcel.readDouble();
        this.iconUrl = parcel.readString();
        this.isWithdrawEnabled = parcel.readByte() != 0;
        this.isDepositEnabled = parcel.readByte() != 0;
        this.properties = (CoinProperty) parcel.readParcelable(CoinProperty.class.getClassLoader());
        this.type = parcel.readInt();
        this.currencyType = parcel.readString();
        this.innerWithdrawMinFee = parcel.readDouble();
        this.isDisplayWithdraw = parcel.readByte() != 0;
        this.isDisplayDeposit = parcel.readByte() != 0;
        this.withdrawEnableAt = parcel.readLong();
        this.depositEnableAt = parcel.readLong();
        this.withdrawDisabledTip = parcel.readString();
        this.depositDisabledTip = parcel.readString();
        this.isMarginEnabled = parcel.readByte() != 0;
        this.isDebitEnabled = parcel.readByte() != 0;
        this.isPoolXEnabled = parcel.readByte() != 0;
        this.contractCoin = (CoinInfoEntity) parcel.readParcelable(CoinInfoEntity.class.getClassLoader());
        this.availableBalance = parcel.readDouble();
        this.isIsolatedEnabled = parcel.readByte() != 0;
        this.isEarnEnabled = parcel.readByte() != 0;
        this.isDigital = parcel.readByte() != 0;
        this.subscriptionInfo = (SubscriptionInfoEntity) parcel.readParcelable(SubscriptionInfoEntity.class.getClassLoader());
    }

    @NonNull
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CoinInfoEntity m103791clone() throws CloneNotSupportedException {
        CoinInfoEntity coinInfoEntity = (CoinInfoEntity) super.clone();
        coinInfoEntity.properties = (CoinProperty) coinInfoEntity.getProperties().clone();
        coinInfoEntity.subscriptionInfo = (SubscriptionInfoEntity) coinInfoEntity.getSubscriptionInfo().clone();
        return coinInfoEntity;
    }

    public double getAvailableBalance() {
        return this.availableBalance;
    }

    public double getAvailableBalanceIncludeContract() {
        CoinInfoEntity coinInfoEntity = this.contractCoin;
        return coinInfoEntity != null ? C27021e.m66522a(this.availableBalance, coinInfoEntity.availableBalance) : this.availableBalance;
    }

    public String getCode() {
        return this.code;
    }

    public CoinInfoEntity getContractCoin() {
        return this.contractCoin;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCurrencyType() {
        return this.currencyType;
    }

    public String getDepositDisabledTip() {
        return this.depositDisabledTip;
    }

    public long getDepositEnableAt() {
        return this.depositEnableAt;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public double getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
    }

    public String getName() {
        return this.name;
    }

    public int getPrecision() {
        return this.precision;
    }

    public CoinProperty getProperties() {
        if (this.properties == null) {
            this.properties = new CoinProperty();
        }
        return this.properties;
    }

    public int getStatus() {
        return this.status;
    }

    public SubscriptionInfoEntity getSubscriptionInfo() {
        if (this.subscriptionInfo == null) {
            this.subscriptionInfo = new SubscriptionInfoEntity();
        }
        return this.subscriptionInfo;
    }

    public int getType() {
        return this.type;
    }

    public String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    public long getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    public double getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    public double getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    public boolean isDebitEnabled() {
        return this.isDebitEnabled;
    }

    public boolean isDepositEnabled() {
        return this.isDepositEnabled;
    }

    public boolean isDigital() {
        return this.isDigital;
    }

    public boolean isDisplayDeposit() {
        return this.isDisplayDeposit;
    }

    public boolean isDisplayWithdraw() {
        return this.isDisplayWithdraw;
    }

    public boolean isEarnEnabled() {
        return this.isEarnEnabled;
    }

    public boolean isEtfCoin() {
        return "MARGIN_FUND".equals(this.currencyType);
    }

    public boolean isIsolatedEnabled() {
        return this.isIsolatedEnabled;
    }

    public boolean isMarginEnabled() {
        return this.isMarginEnabled;
    }

    public boolean isPoolEnabled() {
        return this.isPoolXEnabled;
    }

    public boolean isPoolXEnabled() {
        return this.isPoolXEnabled;
    }

    public boolean isWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    public void setAvailableBalance(double d11) {
        this.availableBalance = d11;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setContractCoin(CoinInfoEntity coinInfoEntity) {
        this.contractCoin = coinInfoEntity;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setCurrencyType(String str) {
        this.currencyType = str;
    }

    public void setDebitEnabled(boolean z11) {
        this.isDebitEnabled = z11;
    }

    public void setDepositDisabledTip(String str) {
        this.depositDisabledTip = str;
    }

    public void setDepositEnableAt(long j11) {
        this.depositEnableAt = j11;
    }

    public void setDepositEnabled(boolean z11) {
        this.isDepositEnabled = z11;
    }

    public void setDigital(boolean z11) {
        this.isDigital = z11;
    }

    public void setDisplayDeposit(boolean z11) {
        this.isDisplayDeposit = z11;
    }

    public void setDisplayWithdraw(boolean z11) {
        this.isDisplayWithdraw = z11;
    }

    public void setEarnEnabled(boolean z11) {
        this.isEarnEnabled = z11;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setInnerWithdrawMinFee(double d11) {
        this.innerWithdrawMinFee = d11;
    }

    public void setIsolatedEnabled(boolean z11) {
        this.isIsolatedEnabled = z11;
    }

    public void setMarginEnabled(boolean z11) {
        this.isMarginEnabled = z11;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPoolEnabled(boolean z11) {
        this.isPoolXEnabled = z11;
    }

    public void setPoolXEnabled(boolean z11) {
        this.isPoolXEnabled = z11;
    }

    public void setPrecision(int i11) {
        this.precision = i11;
    }

    public void setProperties(CoinProperty coinProperty) {
        this.properties = coinProperty;
    }

    public void setStatus(int i11) {
        this.status = i11;
    }

    public void setSubscriptionInfo(SubscriptionInfoEntity subscriptionInfoEntity) {
        this.subscriptionInfo = subscriptionInfoEntity;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public void setWithdrawDisabledTip(String str) {
        this.withdrawDisabledTip = str;
    }

    public void setWithdrawEnableAt(long j11) {
        this.withdrawEnableAt = j11;
    }

    public void setWithdrawEnabled(boolean z11) {
        this.isWithdrawEnabled = z11;
    }

    public void setWithdrawMinFee(double d11) {
        this.withdrawMinFee = d11;
    }

    public void setWithdrawMinSize(double d11) {
        this.withdrawMinSize = d11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.code);
        parcel.writeString(this.currency);
        parcel.writeString(this.name);
        parcel.writeInt(this.precision);
        parcel.writeInt(this.status);
        parcel.writeDouble(this.withdrawMinFee);
        parcel.writeDouble(this.withdrawMinSize);
        parcel.writeString(this.iconUrl);
        parcel.writeByte(this.isWithdrawEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDepositEnabled ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.properties, i11);
        parcel.writeInt(this.type);
        parcel.writeString(this.currencyType);
        parcel.writeDouble(this.innerWithdrawMinFee);
        parcel.writeByte(this.isDisplayWithdraw ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDisplayDeposit ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.withdrawEnableAt);
        parcel.writeLong(this.depositEnableAt);
        parcel.writeString(this.withdrawDisabledTip);
        parcel.writeString(this.depositDisabledTip);
        parcel.writeByte(this.isMarginEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDebitEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isPoolXEnabled ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.contractCoin, i11);
        parcel.writeDouble(this.availableBalance);
        parcel.writeByte(this.isIsolatedEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEarnEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDigital ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.subscriptionInfo, i11);
    }

    public String getHeader() {
        if (getProperties().isContract()) {
            return "KUMEX";
        }
        return "KUCOIN";
    }
}
