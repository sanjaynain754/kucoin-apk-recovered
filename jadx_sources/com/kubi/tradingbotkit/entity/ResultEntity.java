package com.kubi.tradingbotkit.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes51.dex */
@Keep
public class ResultEntity implements Parcelable {
    public static final Parcelable.Creator<ResultEntity> CREATOR = new C26218a();
    private String reason;
    private int status;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.ResultEntity$a */
    public class C26218a implements Parcelable.Creator<ResultEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultEntity createFromParcel(Parcel parcel) {
            return new ResultEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultEntity[] newArray(int i11) {
            return new ResultEntity[i11];
        }
    }

    public ResultEntity() {
        this.status = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReason() {
        return this.reason;
    }

    public int getStatus() {
        return this.status;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setStatus(int i11) {
        this.status = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.reason);
        parcel.writeInt(this.status);
    }

    public ResultEntity(Parcel parcel) {
        this.status = -1;
        this.reason = parcel.readString();
        this.status = parcel.readInt();
    }
}
