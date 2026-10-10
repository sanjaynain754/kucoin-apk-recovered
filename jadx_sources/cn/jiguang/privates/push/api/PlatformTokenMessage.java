package cn.jiguang.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class PlatformTokenMessage implements Parcelable {
    public static final Parcelable.Creator<PlatformTokenMessage> CREATOR = new Parcelable.Creator<PlatformTokenMessage>() { // from class: cn.jiguang.privates.push.api.PlatformTokenMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlatformTokenMessage createFromParcel(Parcel parcel) {
            return new PlatformTokenMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlatformTokenMessage[] newArray(int i11) {
            return new PlatformTokenMessage[i11];
        }
    };
    private byte platform;
    private String token;

    public PlatformTokenMessage() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PlatformTokenMessage(Parcel parcel) {
        this.platform = parcel.readByte();
        this.token = parcel.readString();
    }

    public byte getPlatform() {
        return this.platform;
    }

    public String getToken() {
        return this.token;
    }

    public PlatformTokenMessage setPlatform(byte b11) {
        this.platform = b11;
        return this;
    }

    public PlatformTokenMessage setToken(String str) {
        this.token = str;
        return this;
    }

    public String toString() {
        return "\n{\n  platform=" + ((int) this.platform) + ",\n  token=" + this.token + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.platform);
        parcel.writeString(this.token);
    }
}
