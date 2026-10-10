package com.revolut.revolutpay.p123ui.navigator.internal;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.f */
/* JADX INFO: loaded from: classes59.dex */
public final class C27560f extends AbstractC27555a {

    @NotNull
    public static final Parcelable.Creator<C27560f> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    @NotNull
    private final Class<?> f56294a;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.f$a */
    public static final class a implements Parcelable.Creator<C27560f> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27560f[] newArray(int i11) {
            return new C27560f[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27560f createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C27560f((Class) parcel.readSerializable());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C27560f m68377a(C27560f c27560f, Class cls, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cls = c27560f.f56294a;
        }
        return c27560f.m68378a(cls);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27560f) && Intrinsics.areEqual(this.f56294a, ((C27560f) obj).f56294a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27560f(@NotNull Class<?> clazz) {
        super(null);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.f56294a = clazz;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27560f m68378a(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return new C27560f(clazz);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Class<?> m68380b() {
        return this.f56294a;
    }

    public int hashCode() {
        return this.f56294a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExplicitActivityDestination(clazz=" + this.f56294a + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Class<?> m68379a() {
        return this.f56294a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeSerializable(this.f56294a);
    }
}
