package com.revolut.revolutpay.p123ui.navigator.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C27557c extends AbstractC27561g {

    @NotNull
    public static final Parcelable.Creator<C27557c> CREATOR = new a();

    /* JADX INFO: renamed from: c */
    @NotNull
    private final Uri f56284c;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.c$a */
    public static final class a implements Parcelable.Creator<C27557c> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27557c[] newArray(int i11) {
            return new C27557c[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27557c createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C27557c((Uri) parcel.readParcelable(C27557c.class.getClassLoader()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Uri m68357a() {
        return this.f56284c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27557c) && Intrinsics.areEqual(this.f56284c, ((C27557c) obj).f56284c);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27557c m68358a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new C27557c(uri);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Uri m68359b() {
        return this.f56284c;
    }

    public int hashCode() {
        return this.f56284c.hashCode();
    }

    @NotNull
    public String toString() {
        return "BrowserCommand(uri=" + this.f56284c + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27557c(@NotNull Uri uri) {
        super(null);
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f56284c = uri;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C27557c m68356a(C27557c c27557c, Uri uri, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            uri = c27557c.f56284c;
        }
        return c27557c.m68358a(uri);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f56284c, i11);
    }
}
