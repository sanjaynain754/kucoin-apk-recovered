package cn.jiguang.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class JProtocol implements Parcelable {
    public static final Parcelable.Creator<JProtocol> CREATOR = new Parcelable.Creator<JProtocol>() { // from class: cn.jiguang.privates.core.api.JProtocol.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JProtocol createFromParcel(Parcel parcel) {
            return new JProtocol(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JProtocol[] newArray(int i11) {
            return new JProtocol[i11];
        }
    };
    private byte[] body;
    private int command;
    private long rid;
    private String threadName;
    private int version;

    public JProtocol() {
        this.rid = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBody() {
        return this.body;
    }

    public int getCommand() {
        return this.command;
    }

    public long getRid() {
        return this.rid;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public int getVersion() {
        return this.version;
    }

    public JProtocol setBody(byte[] bArr) {
        this.body = bArr;
        return this;
    }

    public JProtocol setCommand(int i11) {
        this.command = i11;
        return this;
    }

    public JProtocol setRid(long j11) {
        this.rid = j11;
        return this;
    }

    public JProtocol setThreadName(String str) {
        this.threadName = str;
        return this;
    }

    public JProtocol setVersion(int i11) {
        this.version = i11;
        return this;
    }

    public String toString() {
        return "\n{\n  rid=" + this.rid + ",\n  command=" + this.command + ",\n  version=" + this.version + ",\n  body=" + this.body + ",\n  threadName=" + this.threadName + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.rid);
        parcel.writeInt(this.command);
        parcel.writeInt(this.version);
        parcel.writeByteArray(this.body);
        parcel.writeString(this.threadName);
    }

    public JProtocol(Parcel parcel) {
        this.rid = 0L;
        this.rid = parcel.readInt();
        this.command = parcel.readInt();
        this.version = parcel.readInt();
        this.body = parcel.createByteArray();
        this.threadName = parcel.readString();
    }
}
