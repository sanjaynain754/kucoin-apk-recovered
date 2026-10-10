package cn.jiguang.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class JReporter implements Parcelable {
    public static final Parcelable.Creator<JReporter> CREATOR = new Parcelable.Creator<JReporter>() { // from class: cn.jiguang.privates.core.api.JReporter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JReporter createFromParcel(Parcel parcel) {
            return new JReporter(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JReporter[] newArray(int i11) {
            return new JReporter[i11];
        }
    };
    private String content;
    private String type;

    public JReporter() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JReporter(Parcel parcel) {
        this.type = parcel.readString();
        this.content = parcel.readString();
    }

    public String getContent() {
        return this.content;
    }

    public String getType() {
        return this.type;
    }

    public JReporter setContent(String str) {
        this.content = str;
        return this;
    }

    public JReporter setType(String str) {
        this.type = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.type);
        parcel.writeString(this.content);
    }
}
