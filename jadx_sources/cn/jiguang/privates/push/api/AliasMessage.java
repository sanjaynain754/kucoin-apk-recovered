package cn.jiguang.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class AliasMessage implements Parcelable {
    public static final Parcelable.Creator<AliasMessage> CREATOR = new Parcelable.Creator<AliasMessage>() { // from class: cn.jiguang.privates.push.api.AliasMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AliasMessage createFromParcel(Parcel parcel) {
            return new AliasMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AliasMessage[] newArray(int i11) {
            return new AliasMessage[i11];
        }
    };
    private String alias;
    private int code;
    private int sequence;

    public AliasMessage() {
        this.sequence = 0;
        this.code = -1;
        this.alias = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getCode() {
        return this.code;
    }

    public int getSequence() {
        return this.sequence;
    }

    public AliasMessage setAlias(String str) {
        this.alias = str;
        return this;
    }

    public AliasMessage setCode(int i11) {
        this.code = i11;
        return this;
    }

    public AliasMessage setSequence(int i11) {
        this.sequence = i11;
        return this;
    }

    public String toString() {
        return "\n{\n  sequence=" + this.sequence + ",\n  code=" + this.code + ",\n  alias=" + this.alias + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.code);
        parcel.writeString(this.alias);
    }

    public AliasMessage(Parcel parcel) {
        this.sequence = 0;
        this.code = -1;
        this.alias = "";
        this.sequence = parcel.readInt();
        this.code = parcel.readInt();
        this.alias = parcel.readString();
    }
}
