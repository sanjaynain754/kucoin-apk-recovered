package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreMarketKey.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/PreMarketKey;", "Landroid/os/Parcelable;", "isClose", "", "granularity", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGranularity", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/kubi/kumex/data/market/model/PreMarketKey;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PreMarketKey implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PreMarketKey> CREATOR = new C15782a();

    @Nullable
    private final Long granularity;

    @Nullable
    private final Boolean isClose;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.PreMarketKey$a */
    /* JADX INFO: compiled from: PreMarketKey.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15782a implements Parcelable.Creator<PreMarketKey> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PreMarketKey createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PreMarketKey(boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PreMarketKey[] newArray(int i11) {
            return new PreMarketKey[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreMarketKey() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreMarketKey)) {
            return false;
        }
        PreMarketKey preMarketKey = (PreMarketKey) other;
        return Intrinsics.areEqual(this.isClose, preMarketKey.isClose) && Intrinsics.areEqual(this.granularity, preMarketKey.granularity);
    }

    public PreMarketKey(@Nullable Boolean bool, @Nullable Long l11) {
        this.isClose = bool;
        this.granularity = l11;
    }

    public static /* synthetic */ PreMarketKey copy$default(PreMarketKey preMarketKey, Boolean bool, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = preMarketKey.isClose;
        }
        if ((i11 & 2) != 0) {
            l11 = preMarketKey.granularity;
        }
        return preMarketKey.copy(bool, l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsClose() {
        return this.isClose;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getGranularity() {
        return this.granularity;
    }

    @NotNull
    public final PreMarketKey copy(@Nullable Boolean isClose, @Nullable Long granularity) {
        return new PreMarketKey(isClose, granularity);
    }

    @Nullable
    public final Long getGranularity() {
        return this.granularity;
    }

    public int hashCode() {
        Boolean bool = this.isClose;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l11 = this.granularity;
        return iHashCode + (l11 != null ? l11.hashCode() : 0);
    }

    @Nullable
    public final Boolean isClose() {
        return this.isClose;
    }

    @NotNull
    public String toString() {
        return "PreMarketKey(isClose=" + this.isClose + ", granularity=" + this.granularity + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.isClose;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l11 = this.granularity;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ PreMarketKey(Boolean bool, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? 0L : l11);
    }
}
