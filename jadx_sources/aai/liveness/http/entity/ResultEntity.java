package aai.liveness.http.entity;

import ai.advance.common.entity.BaseResultEntity;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes23.dex */
public class ResultEntity extends BaseResultEntity implements Parcelable {
    public static final Parcelable.Creator<ResultEntity> CREATOR = new C0225a();

    /* JADX INFO: renamed from: aai.liveness.http.entity.ResultEntity$a */
    public class C0225a implements Parcelable.Creator<ResultEntity> {
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
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ResultEntity(Parcel parcel) {
        this.code = parcel.readString();
        this.success = parcel.readByte() != 0;
        this.data = parcel.readString();
        this.exception = (Exception) parcel.readSerializable();
        this.message = parcel.readString();
        this.extra = parcel.readString();
        this.transactionId = parcel.readString();
        this.pricingStrategy = parcel.readString();
    }

    public String toString() {
        return "ResultEntity{, code='" + this.code + "', success=" + this.success + ", data='" + this.data + "', exception=" + this.exception + ", message='" + this.message + "', extra='" + this.extra + "', transactionId='" + this.transactionId + "', pricingStrategy='" + this.pricingStrategy + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.code);
        parcel.writeByte(this.success ? (byte) 1 : (byte) 0);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.exception);
        parcel.writeString(this.message);
        parcel.writeString(this.extra);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.pricingStrategy);
    }
}
