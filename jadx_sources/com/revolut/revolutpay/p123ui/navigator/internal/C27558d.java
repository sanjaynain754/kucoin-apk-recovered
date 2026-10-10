package com.revolut.revolutpay.p123ui.navigator.internal;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C27558d extends AbstractC27561g {

    @NotNull
    public static final Parcelable.Creator<C27558d> CREATOR = new a();

    /* JADX INFO: renamed from: c */
    @NotNull
    private final EnumC27559e f56285c;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final String f56286d;

    /* JADX INFO: renamed from: e */
    @NotNull
    private final String f56287e;

    /* JADX INFO: renamed from: f */
    @NotNull
    private final String f56288f;

    /* JADX INFO: renamed from: g */
    private final boolean f56289g;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.d$a */
    public static final class a implements Parcelable.Creator<C27558d> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27558d[] newArray(int i11) {
            return new C27558d[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27558d createFromParcel(@NotNull Parcel parcel) {
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            EnumC27559e enumC27559eValueOf = EnumC27559e.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new C27558d(enumC27559eValueOf, string, string2, string3, z11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C27558d m68362a(C27558d c27558d, EnumC27559e enumC27559e, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enumC27559e = c27558d.f56285c;
        }
        if ((i11 & 2) != 0) {
            str = c27558d.f56286d;
        }
        if ((i11 & 4) != 0) {
            str2 = c27558d.f56287e;
        }
        if ((i11 & 8) != 0) {
            str3 = c27558d.f56288f;
        }
        if ((i11 & 16) != 0) {
            z11 = c27558d.f56289g;
        }
        boolean z12 = z11;
        String str4 = str2;
        return c27558d.m68363a(enumC27559e, str, str4, str3, z12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27558d)) {
            return false;
        }
        C27558d c27558d = (C27558d) obj;
        return this.f56285c == c27558d.f56285c && Intrinsics.areEqual(this.f56286d, c27558d.f56286d) && Intrinsics.areEqual(this.f56287e, c27558d.f56287e) && Intrinsics.areEqual(this.f56288f, c27558d.f56288f) && this.f56289g == c27558d.f56289g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27558d(@NotNull EnumC27559e destination, @NotNull String token, @NotNull String sessionToken, @NotNull String publicKey, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.f56285c = destination;
        this.f56286d = token;
        this.f56287e = sessionToken;
        this.f56288f = publicKey;
        this.f56289g = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27558d m68363a(@NotNull EnumC27559e destination, @NotNull String token, @NotNull String sessionToken, @NotNull String publicKey, boolean z11) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        return new C27558d(destination, token, sessionToken, publicKey, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m68365b() {
        return this.f56286d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m68366c() {
        return this.f56287e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m68367d() {
        return this.f56288f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m68368e() {
        return this.f56289g;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final EnumC27559e m68369f() {
        return this.f56285c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m68370g() {
        return this.f56288f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m68371h() {
        return this.f56289g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.f56285c.hashCode() * 31) + this.f56286d.hashCode()) * 31) + this.f56287e.hashCode()) * 31) + this.f56288f.hashCode()) * 31;
        boolean z11 = this.f56289g;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode + r11;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m68372i() {
        return this.f56287e;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m68373j() {
        return this.f56286d;
    }

    @NotNull
    public String toString() {
        return "ConfirmationCommand(destination=" + this.f56285c + ", token=" + this.f56286d + ", sessionToken=" + this.f56287e + ", publicKey=" + this.f56288f + ", requestShipping=" + this.f56289g + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final EnumC27559e m68364a() {
        return this.f56285c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f56285c.name());
        out.writeString(this.f56286d);
        out.writeString(this.f56287e);
        out.writeString(this.f56288f);
        out.writeInt(this.f56289g ? 1 : 0);
    }
}
