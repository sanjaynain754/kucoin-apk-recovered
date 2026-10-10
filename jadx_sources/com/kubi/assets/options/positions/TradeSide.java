package com.kubi.assets.options.positions;

import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.options.positions.h, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: OptionsPositionEntityExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/options/positions/TradeSide;", "", "textColorInt", "", "bgDrawable", "Landroid/graphics/drawable/Drawable;", "textRes", "<init>", "(ILandroid/graphics/drawable/Drawable;I)V", "getTextColorInt", "()I", "getBgDrawable", "()Landroid/graphics/drawable/Drawable;", "getTextRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeSide {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int textColorInt;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final Drawable bgDrawable;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int textRes;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeSide)) {
            return false;
        }
        TradeSide tradeSide = (TradeSide) other;
        return this.textColorInt == tradeSide.textColorInt && Intrinsics.areEqual(this.bgDrawable, tradeSide.bgDrawable) && this.textRes == tradeSide.textRes;
    }

    public TradeSide(@ColorInt int i11, @NotNull Drawable bgDrawable, @StringRes int i12) {
        Intrinsics.checkNotNullParameter(bgDrawable, "bgDrawable");
        this.textColorInt = i11;
        this.bgDrawable = bgDrawable;
        this.textRes = i12;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Drawable getBgDrawable() {
        return this.bgDrawable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTextColorInt() {
        return this.textColorInt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTextRes() {
        return this.textRes;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.textColorInt) * 31) + this.bgDrawable.hashCode()) * 31) + Integer.hashCode(this.textRes);
    }

    @NotNull
    public String toString() {
        return "TradeSide(textColorInt=" + this.textColorInt + ", bgDrawable=" + this.bgDrawable + ", textRes=" + this.textRes + ')';
    }
}
