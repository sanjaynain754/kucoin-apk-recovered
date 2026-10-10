package com.kubi.kumex.constant;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineConstant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/kumex/constant/KlineScrollOffset;", "Landroid/os/Parcelable;", TypedValues.CycleType.S_WAVE_OFFSET, "", "symbol", "", "<init>", "(DLjava/lang/String;)V", "getOffset", "()D", "setOffset", "(D)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineScrollOffset implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KlineScrollOffset> CREATOR = new C15769a();
    private double offset;

    @NotNull
    private String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.constant.KlineScrollOffset$a */
    /* JADX INFO: compiled from: KlineConstant.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15769a implements Parcelable.Creator<KlineScrollOffset> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KlineScrollOffset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KlineScrollOffset(parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KlineScrollOffset[] newArray(int i11) {
            return new KlineScrollOffset[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlineScrollOffset)) {
            return false;
        }
        KlineScrollOffset klineScrollOffset = (KlineScrollOffset) other;
        return Double.compare(this.offset, klineScrollOffset.offset) == 0 && Intrinsics.areEqual(this.symbol, klineScrollOffset.symbol);
    }

    public KlineScrollOffset(double d11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.offset = d11;
        this.symbol = symbol;
    }

    public static /* synthetic */ KlineScrollOffset copy$default(KlineScrollOffset klineScrollOffset, double d11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = klineScrollOffset.offset;
        }
        if ((i11 & 2) != 0) {
            str = klineScrollOffset.symbol;
        }
        return klineScrollOffset.copy(d11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getOffset() {
        return this.offset;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final KlineScrollOffset copy(double offset, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new KlineScrollOffset(offset, symbol);
    }

    public final double getOffset() {
        return this.offset;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (Double.hashCode(this.offset) * 31) + this.symbol.hashCode();
    }

    public final void setOffset(double d11) {
        this.offset = d11;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "KlineScrollOffset(offset=" + this.offset + ", symbol=" + this.symbol + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.offset);
        dest.writeString(this.symbol);
    }
}
