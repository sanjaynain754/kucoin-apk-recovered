package com.revolut.revolutpay.p123ui.navigator.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C27556b extends AbstractC27561g {

    @NotNull
    public static final Parcelable.Creator<C27556b> CREATOR = new a();

    /* JADX INFO: renamed from: c */
    @NotNull
    private final AbstractC27555a f56278c;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final String f56279d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private final Parcelable f56280e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private final Map<String, Object> f56281f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private final Integer f56282g;

    /* JADX INFO: renamed from: h */
    private final int f56283h;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.navigator.internal.b$a */
    public static final class a implements Parcelable.Creator<C27556b> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C27556b[] newArray(int i11) {
            return new C27556b[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27556b createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            AbstractC27555a abstractC27555a = (AbstractC27555a) parcel.readParcelable(C27556b.class.getClassLoader());
            String string = parcel.readString();
            Parcelable parcelable = parcel.readParcelable(C27556b.class.getClassLoader());
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(C27556b.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new C27556b(abstractC27555a, string, parcelable, linkedHashMap, numValueOf, parcel.readInt());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27556b(@NotNull AbstractC27555a destination, @NotNull String configName, @Nullable Parcelable parcelable, @Nullable Map<String, ? extends Object> map, @Nullable Integer num, int i11) {
        super(null);
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(configName, "configName");
        this.f56278c = destination;
        this.f56279d = configName;
        this.f56280e = parcelable;
        this.f56281f = map;
        this.f56282g = num;
        this.f56283h = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC27555a m68341a() {
        return this.f56278c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27556b)) {
            return false;
        }
        C27556b c27556b = (C27556b) obj;
        return Intrinsics.areEqual(this.f56278c, c27556b.f56278c) && Intrinsics.areEqual(this.f56279d, c27556b.f56279d) && Intrinsics.areEqual(this.f56280e, c27556b.f56280e) && Intrinsics.areEqual(this.f56281f, c27556b.f56281f) && Intrinsics.areEqual(this.f56282g, c27556b.f56282g) && this.f56283h == c27556b.f56283h;
    }

    public /* synthetic */ C27556b(AbstractC27555a abstractC27555a, String str, Parcelable parcelable, Map map, Integer num, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC27555a, (i12 & 2) != 0 ? "config" : str, (i12 & 4) != 0 ? null : parcelable, (i12 & 8) != 0 ? MapsKt.emptyMap() : map, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? 0 : i11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C27556b m68342a(@NotNull AbstractC27555a destination, @NotNull String configName, @Nullable Parcelable parcelable, @Nullable Map<String, ? extends Object> map, @Nullable Integer num, int i11) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(configName, "configName");
        return new C27556b(destination, configName, parcelable, map, num, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m68343b() {
        return this.f56279d;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Parcelable m68344c() {
        return this.f56280e;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m68345d() {
        return this.f56281f;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Integer m68346e() {
        return this.f56282g;
    }

    /* JADX INFO: renamed from: f */
    public final int m68347f() {
        return this.f56283h;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Parcelable m68348g() {
        return this.f56280e;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m68349h() {
        return this.f56279d;
    }

    public int hashCode() {
        int iHashCode = ((this.f56278c.hashCode() * 31) + this.f56279d.hashCode()) * 31;
        Parcelable parcelable = this.f56280e;
        int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Map<String, Object> map = this.f56281f;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f56282g;
        return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.f56283h);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final AbstractC27555a m68350i() {
        return this.f56278c;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Map<String, Object> m68351j() {
        return this.f56281f;
    }

    /* JADX INFO: renamed from: k */
    public final int m68352k() {
        return this.f56283h;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final Integer m68353l() {
        return this.f56282g;
    }

    @NotNull
    public String toString() {
        return "ActivityNavigateCommand(destination=" + this.f56278c + ", configName=" + this.f56279d + ", config=" + this.f56280e + ", extras=" + this.f56281f + ", requestCode=" + this.f56282g + ", flags=" + this.f56283h + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C27556b m68340a(C27556b c27556b, AbstractC27555a abstractC27555a, String str, Parcelable parcelable, Map map, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            abstractC27555a = c27556b.f56278c;
        }
        if ((i12 & 2) != 0) {
            str = c27556b.f56279d;
        }
        if ((i12 & 4) != 0) {
            parcelable = c27556b.f56280e;
        }
        if ((i12 & 8) != 0) {
            map = c27556b.f56281f;
        }
        if ((i12 & 16) != 0) {
            num = c27556b.f56282g;
        }
        if ((i12 & 32) != 0) {
            i11 = c27556b.f56283h;
        }
        Integer num2 = num;
        int i13 = i11;
        return c27556b.m68342a(abstractC27555a, str, parcelable, map, num2, i13);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f56278c, i11);
        out.writeString(this.f56279d);
        out.writeParcelable(this.f56280e, i11);
        Map<String, Object> map = this.f56281f;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeValue(entry.getValue());
            }
        }
        Integer num = this.f56282g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeInt(this.f56283h);
    }
}
