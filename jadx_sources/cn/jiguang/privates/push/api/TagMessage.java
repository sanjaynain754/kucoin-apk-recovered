package cn.jiguang.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class TagMessage implements Parcelable {
    public static final Parcelable.Creator<TagMessage> CREATOR = new Parcelable.Creator<TagMessage>() { // from class: cn.jiguang.privates.push.api.TagMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TagMessage createFromParcel(Parcel parcel) {
            return new TagMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TagMessage[] newArray(int i11) {
            return new TagMessage[i11];
        }
    };
    private int code;
    private String queryTag;
    private boolean queryTagValid;
    private int sequence;
    private String[] tags;

    public TagMessage() {
        this.sequence = 0;
        this.code = -1;
        this.tags = new String[0];
        this.queryTag = "";
        this.queryTagValid = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static Parcelable.Creator<TagMessage> getCREATOR() {
        return CREATOR;
    }

    public int getCode() {
        return this.code;
    }

    public String getQueryTag() {
        return this.queryTag;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String[] getTags() {
        return this.tags;
    }

    public boolean isQueryTagValid() {
        return this.queryTagValid;
    }

    public TagMessage setCode(int i11) {
        this.code = i11;
        return this;
    }

    public TagMessage setQueryTag(String str) {
        this.queryTag = str;
        return this;
    }

    public TagMessage setQueryTagValid(boolean z11) {
        this.queryTagValid = z11;
        return this;
    }

    public TagMessage setSequence(int i11) {
        this.sequence = i11;
        return this;
    }

    public TagMessage setTags(String[] strArr) {
        this.tags = strArr;
        return this;
    }

    public String toString() {
        return "\n{\n  sequence=" + this.sequence + ",\n  code=" + this.code + ",\n  tag=" + Arrays.toString(this.tags) + ",\n  queryTag=" + this.queryTag + ",\n  queryTagValid=" + this.queryTagValid + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.code);
        parcel.writeStringArray(this.tags);
        parcel.writeString(this.queryTag);
        parcel.writeByte(this.queryTagValid ? (byte) 1 : (byte) 0);
    }

    public TagMessage(Parcel parcel) {
        this.sequence = 0;
        this.code = -1;
        this.tags = new String[0];
        this.queryTag = "";
        this.queryTagValid = false;
        this.sequence = parcel.readInt();
        this.code = parcel.readInt();
        this.tags = parcel.createStringArray();
        this.queryTag = parcel.readString();
        this.queryTagValid = parcel.readByte() != 0;
    }
}
