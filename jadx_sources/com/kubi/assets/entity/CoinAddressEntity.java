package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.data.coin.AccountType;

/* JADX INFO: loaded from: classes6.dex */
public class CoinAddressEntity implements Parcelable {
    public static final Parcelable.Creator<CoinAddressEntity> CREATOR = new Parcelable.Creator<CoinAddressEntity>() { // from class: com.kubi.assets.entity.CoinAddressEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoinAddressEntity createFromParcel(Parcel parcel) {
            return new CoinAddressEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoinAddressEntity[] newArray(int i11) {
            return new CoinAddressEntity[i11];
        }
    };
    private String accountTag;
    private String accountType;
    private String address;
    private String addressId;
    private boolean autoTransfer;
    private long lastDepositAt;
    private String memo;
    private boolean multipleAddress;
    private int number;
    private String remark;
    private String toAccountTag;
    private String toAccountType;
    private String toSubUserId;
    private String toSubUserName;

    public CoinAddressEntity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CoinAddressEntity(Parcel parcel) {
        this.accountTag = parcel.readString();
        this.accountType = parcel.readString();
        this.address = parcel.readString();
        this.addressId = parcel.readString();
        this.autoTransfer = parcel.readByte() != 0;
        this.lastDepositAt = parcel.readLong();
        this.number = parcel.readInt();
        this.remark = parcel.readString();
        this.toSubUserId = parcel.readString();
        this.toAccountTag = parcel.readString();
        this.toSubUserName = parcel.readString();
        this.memo = parcel.readString();
        this.toAccountType = parcel.readString();
        this.multipleAddress = parcel.readByte() != 0;
    }

    public String getAccountTag() {
        return this.accountTag;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public long getLastDepositAt() {
        return this.lastDepositAt;
    }

    public String getMemo() {
        return this.memo;
    }

    public int getNumber() {
        return this.number;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getToAccountTag() {
        return this.toAccountTag;
    }

    public AccountType getToAccountType() {
        return AccountType.INSTANCE.ofName(this.toAccountType);
    }

    public String getToSubUserId() {
        return this.toSubUserId;
    }

    public String getToSubUserName() {
        return this.toSubUserName;
    }

    public boolean isAutoTransfer() {
        return this.autoTransfer;
    }

    public boolean isMultipleAddress() {
        return this.multipleAddress;
    }

    public void setAccountTag(String str) {
        this.accountTag = str;
    }

    public void setAccountType(String str) {
        this.accountType = str;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setAddressId(String str) {
        this.addressId = str;
    }

    public void setAutoTransfer(boolean z11) {
        this.autoTransfer = z11;
    }

    public void setLastDepositAt(long j11) {
        this.lastDepositAt = j11;
    }

    public void setMemo(String str) {
        this.memo = str;
    }

    public void setMultipleAddress(boolean z11) {
        this.multipleAddress = z11;
    }

    public void setNumber(int i11) {
        this.number = i11;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setToAccountTag(String str) {
        this.toAccountTag = str;
    }

    public void setToAccountType(String str) {
        this.toAccountType = str;
    }

    public void setToSubUserId(String str) {
        this.toSubUserId = str;
    }

    public void setToSubUserName(String str) {
        this.toSubUserName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.accountTag);
        parcel.writeString(this.accountType);
        parcel.writeString(this.address);
        parcel.writeString(this.addressId);
        parcel.writeByte(this.autoTransfer ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.lastDepositAt);
        parcel.writeInt(this.number);
        parcel.writeString(this.remark);
        parcel.writeString(this.memo);
        parcel.writeString(this.toAccountType);
        parcel.writeString(this.toSubUserId);
        parcel.writeString(this.toAccountTag);
        parcel.writeString(this.toSubUserName);
        parcel.writeByte(this.multipleAddress ? (byte) 1 : (byte) 0);
    }
}
