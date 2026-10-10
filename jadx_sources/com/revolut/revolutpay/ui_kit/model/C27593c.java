package com.revolut.revolutpay.ui_kit.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.model.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C27593c extends AbstractC27592b {

    @NotNull
    public static final Parcelable.Creator<C27593c> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    @NotNull
    private final String f56379a;

    /* JADX INFO: renamed from: b */
    private final boolean f56380b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private final Integer f56381c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final Object f56382d;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.model.c$a */
    public static final class a implements Parcelable.Creator<C27593c> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27593c[] newArray(int i11) {
            return new C27593c[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27593c createFromParcel(@NotNull Parcel parcel) {
            boolean z11;
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new C27593c(string, z11, numValueOf, parcel.readValue(C27593c.class.getClassLoader()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27593c(@NotNull String id2, boolean z11, @ColorInt @Nullable Integer num, @Nullable Object obj) {
        super(null);
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f56379a = id2;
        this.f56380b = z11;
        this.f56381c = num;
        this.f56382d = obj;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C27593c m68511a(C27593c c27593c, String str, boolean z11, Integer num, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = c27593c.f56379a;
        }
        if ((i11 & 2) != 0) {
            z11 = c27593c.f56380b;
        }
        if ((i11 & 4) != 0) {
            num = c27593c.f56381c;
        }
        if ((i11 & 8) != 0) {
            obj = c27593c.f56382d;
        }
        return c27593c.m68512a(str, z11, num, obj);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27593c)) {
            return false;
        }
        C27593c c27593c = (C27593c) obj;
        return Intrinsics.areEqual(this.f56379a, c27593c.f56379a) && this.f56380b == c27593c.f56380b && Intrinsics.areEqual(this.f56381c, c27593c.f56381c) && Intrinsics.areEqual(this.f56382d, c27593c.f56382d);
    }

    public /* synthetic */ C27593c(String str, boolean z11, Integer num, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : obj);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27593c m68512a(@NotNull String id2, boolean z11, @ColorInt @Nullable Integer num, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new C27593c(id2, z11, num, obj);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m68514b() {
        return this.f56380b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Integer m68515c() {
        return this.f56381c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m68516d() {
        return this.f56382d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Integer m68517e() {
        return this.f56381c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m68518f() {
        return this.f56379a;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m68519g() {
        return this.f56382d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m68520h() {
        return this.f56380b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = this.f56379a.hashCode() * 31;
        boolean z11 = this.f56380b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        Integer num = this.f56381c;
        int iHashCode2 = (i11 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f56382d;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Click(id=" + this.f56379a + ", isLinkUnderlined=" + this.f56380b + ", color=" + this.f56381c + ", parcel=" + this.f56382d + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m68513a() {
        return this.f56379a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f56379a);
        out.writeInt(this.f56380b ? 1 : 0);
        Integer num = this.f56381c;
        if (num == null) {
            iIntValue = 0;
        } else {
            out.writeInt(1);
            iIntValue = num.intValue();
        }
        out.writeInt(iIntValue);
        out.writeValue(this.f56382d);
    }
}
