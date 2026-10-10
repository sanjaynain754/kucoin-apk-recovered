package com.revolut.revolutpay.p123ui.picker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.revolutpay.domain.model.CountryCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.model.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27572a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C27572a> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    @NotNull
    private final String f56313a;

    /* JADX INFO: renamed from: b */
    @NotNull
    private final String f56314b;

    /* JADX INFO: renamed from: c */
    @NotNull
    private final String f56315c;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.picker.model.a$a */
    public static final class a implements Parcelable.Creator<C27572a> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27572a[] newArray(int i11) {
            return new C27572a[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27572a createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C27572a(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C27572a m68407a(C27572a c27572a, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c27572a.f56313a;
        }
        if ((i11 & 2) != 0) {
            str2 = c27572a.f56314b;
        }
        if ((i11 & 4) != 0) {
            str3 = c27572a.f56315c;
        }
        return c27572a.m68408a(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27572a)) {
            return false;
        }
        C27572a c27572a = (C27572a) obj;
        return Intrinsics.areEqual(this.f56313a, c27572a.f56313a) && Intrinsics.areEqual(this.f56314b, c27572a.f56314b) && Intrinsics.areEqual(this.f56315c, c27572a.f56315c);
    }

    public C27572a(@NotNull String code, @NotNull String name, @NotNull String dialingCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dialingCode, "dialingCode");
        this.f56313a = code;
        this.f56314b = name;
        this.f56315c = dialingCode;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27572a m68408a(@NotNull String code, @NotNull String name, @NotNull String dialingCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dialingCode, "dialingCode");
        return new C27572a(code, name, dialingCode);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m68410b() {
        return this.f56314b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m68411c() {
        return this.f56315c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m68412d() {
        return this.f56313a;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final CountryCode m68413e() {
        return CountryCode.INSTANCE.fromValue(this.f56313a);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m68414f() {
        return this.f56315c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m68415g() {
        return this.f56314b;
    }

    public int hashCode() {
        return (((this.f56313a.hashCode() * 31) + this.f56314b.hashCode()) * 31) + this.f56315c.hashCode();
    }

    @NotNull
    public String toString() {
        return "CountryInfo(code=" + this.f56313a + ", name=" + this.f56314b + ", dialingCode=" + this.f56315c + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m68409a() {
        return this.f56313a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f56313a);
        out.writeString(this.f56314b);
        out.writeString(this.f56315c);
    }
}
