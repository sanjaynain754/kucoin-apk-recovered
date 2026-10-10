package cn.jiguang.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class WakeMessage implements Parcelable {
    public static final int ACTIVITY = 8;
    public static final int BIND_SERVICE = 2;
    public static final int CONTENT_PROVIDER = 4;
    public static final Parcelable.Creator<WakeMessage> CREATOR = new Parcelable.Creator<WakeMessage>() { // from class: cn.jiguang.privates.core.api.WakeMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WakeMessage createFromParcel(Parcel parcel) {
            return new WakeMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WakeMessage[] newArray(int i11) {
            return new WakeMessage[i11];
        }
    };
    public static final int START_SERVICE = 1;
    private String packageName;
    private int type;

    public WakeMessage() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WakeMessage(Parcel parcel) {
        this.type = parcel.readInt();
        this.packageName = parcel.readString();
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getType() {
        return this.type;
    }

    public WakeMessage setPackageName(String str) {
        this.packageName = str;
        return this;
    }

    public WakeMessage setType(int i11) {
        this.type = i11;
        return this;
    }

    public String toString() {
        return "\n{\n  type=" + this.type + ",\n  packageName=" + this.packageName + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.type);
        parcel.writeString(this.packageName);
    }
}
