package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class SubscriptionInfoEntity implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SubscriptionInfoEntity> CREATOR = new Parcelable.Creator<SubscriptionInfoEntity>() { // from class: com.kubi.data.entity.SubscriptionInfoEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubscriptionInfoEntity createFromParcel(Parcel parcel) {
            return new SubscriptionInfoEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubscriptionInfoEntity[] newArray(int i11) {
            return new SubscriptionInfoEntity[i11];
        }
    };
    private Boolean enableSubscribe;
    private String messagePushType;
    private String subscribeRecordId;

    public SubscriptionInfoEntity() {
        this.enableSubscribe = Boolean.FALSE;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Boolean getEnableSubscribe() {
        return this.enableSubscribe;
    }

    public String getMessagePushType() {
        return TextUtils.isEmpty(this.messagePushType) ? "" : this.messagePushType;
    }

    public String getSubscribeRecordId() {
        return TextUtils.isEmpty(this.subscribeRecordId) ? "" : this.subscribeRecordId;
    }

    public void setEnableSubscribe(Boolean bool) {
        this.enableSubscribe = bool;
    }

    public void setMessagePushType(String str) {
        this.messagePushType = str;
    }

    public void setSubscribeRecordId(String str) {
        this.subscribeRecordId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.enableSubscribe.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.subscribeRecordId);
        parcel.writeString(this.messagePushType);
    }

    public SubscriptionInfoEntity(Parcel parcel) {
        this.enableSubscribe = Boolean.FALSE;
        this.enableSubscribe = Boolean.valueOf(parcel.readByte() != 0);
        this.subscribeRecordId = parcel.readString();
        this.messagePushType = parcel.readString();
    }

    @NonNull
    @NotNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
