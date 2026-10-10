package com.google.android.p066a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.a.c */
/* JADX INFO: compiled from: Codecs.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6959c {
    /* JADX INFO: renamed from: b */
    public static void m12810b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    static {
        C6959c.class.getClassLoader();
    }

    /* JADX INFO: renamed from: c */
    public static void m12811c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    private C6959c() {
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m12809a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
