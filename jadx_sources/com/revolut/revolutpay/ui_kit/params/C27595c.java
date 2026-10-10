package com.revolut.revolutpay.ui_kit.params;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import wa0.C45782c;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.params.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C27595c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C27595c> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    @NotNull
    private final String f56384a;

    /* JADX INFO: renamed from: b */
    @NotNull
    private final String f56385b;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.params.c$a */
    public static final class a implements Parcelable.Creator<C27595c> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27595c[] newArray(int i11) {
            return new C27595c[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27595c createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C27595c(parcel.readString(), parcel.readString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C27595c m68525a(C27595c c27595c, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c27595c.f56384a;
        }
        if ((i11 & 2) != 0) {
            str2 = c27595c.f56385b;
        }
        return c27595c.m68526a(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27595c)) {
            return false;
        }
        C27595c c27595c = (C27595c) obj;
        return Intrinsics.areEqual(this.f56384a, c27595c.f56384a) && Intrinsics.areEqual(this.f56385b, c27595c.f56385b);
    }

    public C27595c(@NotNull String countryCode, @NotNull String number) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f56384a = countryCode;
        this.f56385b = number;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27595c m68526a(@NotNull String countryCode, @NotNull String number) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(number, "number");
        return new C27595c(countryCode, number);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m68528b() {
        return this.f56385b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m68529c() {
        return this.f56384a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m68530d() {
        return this.f56385b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m68531e() {
        String str = this.f56384a + this.f56385b;
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return C45782c.m101107a(str);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m68532f() {
        String str = this.f56384a + ' ' + this.f56385b;
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public int hashCode() {
        return (this.f56384a.hashCode() * 31) + this.f56385b.hashCode();
    }

    @NotNull
    public String toString() {
        return "PhoneInputData(countryCode=" + this.f56384a + ", number=" + this.f56385b + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m68527a() {
        return this.f56384a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f56384a);
        out.writeString(this.f56385b);
    }
}
