package cn.jiguang.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class MobileNumberMessage implements Parcelable {
    public static final Parcelable.Creator<MobileNumberMessage> CREATOR = new Parcelable.Creator<MobileNumberMessage>() { // from class: cn.jiguang.privates.push.api.MobileNumberMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MobileNumberMessage createFromParcel(Parcel parcel) {
            return new MobileNumberMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MobileNumberMessage[] newArray(int i11) {
            return new MobileNumberMessage[i11];
        }
    };
    private int code;
    private String mobileNumber;
    private int sequence;

    public MobileNumberMessage() {
        this.sequence = 0;
        this.code = -1;
        this.mobileNumber = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public int getSequence() {
        return this.sequence;
    }

    public MobileNumberMessage setCode(int i11) {
        this.code = i11;
        return this;
    }

    public MobileNumberMessage setMobileNumber(String str) {
        this.mobileNumber = str;
        return this;
    }

    public MobileNumberMessage setSequence(int i11) {
        this.sequence = i11;
        return this;
    }

    public String toString() {
        return "\n{\n  sequence=" + this.sequence + ",\n  code=" + this.code + ",\n  mobileNumber=" + this.mobileNumber + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.code);
        parcel.writeString(this.mobileNumber);
    }

    public MobileNumberMessage(Parcel parcel) {
        this.sequence = 0;
        this.code = -1;
        this.mobileNumber = "";
        this.sequence = parcel.readInt();
        this.code = parcel.readInt();
        this.mobileNumber = parcel.readString();
    }
}
