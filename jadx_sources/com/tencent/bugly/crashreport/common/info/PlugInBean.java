package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new C33518a();

    /* JADX INFO: renamed from: b */
    public final String f68559b;

    /* JADX INFO: renamed from: c */
    public final String f68560c;

    /* JADX INFO: renamed from: d */
    public final String f68561d;

    /* JADX INFO: renamed from: com.tencent.bugly.crashreport.common.info.PlugInBean$a */
    /* JADX INFO: compiled from: BUGLY */
    public class C33518a implements Parcelable.Creator<PlugInBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlugInBean createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlugInBean[] newArray(int i11) {
            return new PlugInBean[i11];
        }
    }

    public PlugInBean(String str, String str2, String str3) {
        this.f68559b = str;
        this.f68560c = str2;
        this.f68561d = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f68559b + " plV:" + this.f68560c + " plUUID:" + this.f68561d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f68559b);
        parcel.writeString(this.f68560c);
        parcel.writeString(this.f68561d);
    }

    public PlugInBean(Parcel parcel) {
        this.f68559b = parcel.readString();
        this.f68560c = parcel.readString();
        this.f68561d = parcel.readString();
    }
}
