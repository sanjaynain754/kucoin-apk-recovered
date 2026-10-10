package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class CoinProperty implements Parcelable, Cloneable {
    public static final Parcelable.Creator<CoinProperty> CREATOR = new Parcelable.Creator<CoinProperty>() { // from class: com.kubi.data.entity.CoinProperty.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoinProperty createFromParcel(Parcel parcel) {
            return new CoinProperty(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoinProperty[] newArray(int i11) {
            return new CoinProperty[i11];
        }
    };
    private String chainName;
    private String coinType;
    private int confirmationCount;
    private String contractAddress;

    @SerializedName("DELISTING")
    private String delisting;
    private String depositRemark;

    @SerializedName("showStakingRemark")
    private boolean isStakingEnabled;
    private String isTransferEnabled;
    private String orgAddress;
    private String platform;
    private boolean showDepositRemark;
    private boolean showWithdrawRemark;

    @SerializedName("STABLE")
    private String stableCoin;
    private String stakingRemark;
    private String txUrl;
    private String userAddressName;
    private String withdrawRemark;

    public CoinProperty() {
        this.withdrawRemark = "";
        this.stakingRemark = "";
        this.isStakingEnabled = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChainName() {
        return this.chainName;
    }

    public String getCoinType() {
        return this.coinType;
    }

    public int getConfirmationCount() {
        return this.confirmationCount;
    }

    public String getContractAddress() {
        return this.contractAddress;
    }

    public String getDepositRemark() {
        return this.depositRemark;
    }

    public String getIsTransferEnabled() {
        return this.isTransferEnabled;
    }

    public String getOrgAddress() {
        return this.orgAddress;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getStableCoin() {
        return this.stableCoin;
    }

    public String getStakingRemark() {
        return this.stakingRemark;
    }

    public String getTxUrl() {
        return this.txUrl;
    }

    public String getUserAddressName() {
        return this.userAddressName;
    }

    public String getWithdrawRemark() {
        return this.withdrawRemark;
    }

    public boolean isContract() {
        return "contract".equals(this.platform);
    }

    public String isDelisting() {
        return this.delisting;
    }

    public boolean isShowDepositRemark() {
        return this.showDepositRemark;
    }

    public boolean isShowWithdrawRemark() {
        return this.showWithdrawRemark;
    }

    public boolean isStableCoin() {
        return "TRUE".equals(this.stableCoin);
    }

    public boolean isStakingEnabled() {
        return this.isStakingEnabled;
    }

    public void setChainName(String str) {
        this.chainName = str;
    }

    public void setCoinType(String str) {
        this.coinType = str;
    }

    public void setConfirmationCount(int i11) {
        this.confirmationCount = i11;
    }

    public void setContractAddress(String str) {
        this.contractAddress = str;
    }

    public void setDelisting(String str) {
        this.delisting = str;
    }

    public void setDepositRemark(String str) {
        this.depositRemark = str;
    }

    public void setIsTransferEnabled(String str) {
        this.isTransferEnabled = str;
    }

    public void setOrgAddress(String str) {
        this.orgAddress = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setShowDepositRemark(boolean z11) {
        this.showDepositRemark = z11;
    }

    public void setShowWithdrawRemark(boolean z11) {
        this.showWithdrawRemark = z11;
    }

    public void setStableCoin(String str) {
        this.stableCoin = str;
    }

    public void setStakingEnabled(boolean z11) {
        this.isStakingEnabled = z11;
    }

    public void setStakingRemark(String str) {
        this.stakingRemark = str;
    }

    public void setTxUrl(String str) {
        this.txUrl = str;
    }

    public void setUserAddressName(String str) {
        this.userAddressName = str;
    }

    public void setWithdrawRemark(String str) {
        this.withdrawRemark = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.coinType);
        parcel.writeString(this.txUrl);
        parcel.writeString(this.userAddressName);
        parcel.writeInt(this.confirmationCount);
        parcel.writeString(this.depositRemark);
        parcel.writeByte(this.showDepositRemark ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showWithdrawRemark ? (byte) 1 : (byte) 0);
        parcel.writeString(this.orgAddress);
        parcel.writeString(this.withdrawRemark);
        parcel.writeString(this.stakingRemark);
        parcel.writeByte(this.isStakingEnabled ? (byte) 1 : (byte) 0);
        parcel.writeString(this.platform);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.chainName);
        parcel.writeString(this.delisting);
        parcel.writeString(this.stableCoin);
        parcel.writeString(this.isTransferEnabled);
    }

    @NonNull
    @NotNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public CoinProperty(Parcel parcel) {
        this.withdrawRemark = "";
        this.stakingRemark = "";
        this.isStakingEnabled = false;
        this.coinType = parcel.readString();
        this.txUrl = parcel.readString();
        this.userAddressName = parcel.readString();
        this.confirmationCount = parcel.readInt();
        this.depositRemark = parcel.readString();
        this.showDepositRemark = parcel.readByte() != 0;
        this.showWithdrawRemark = parcel.readByte() != 0;
        this.orgAddress = parcel.readString();
        this.withdrawRemark = parcel.readString();
        this.stakingRemark = parcel.readString();
        this.isStakingEnabled = parcel.readByte() != 0;
        this.platform = parcel.readString();
        this.contractAddress = parcel.readString();
        this.chainName = parcel.readString();
        this.delisting = parcel.readString();
        this.stableCoin = parcel.readString();
        this.isTransferEnabled = parcel.readString();
    }
}
