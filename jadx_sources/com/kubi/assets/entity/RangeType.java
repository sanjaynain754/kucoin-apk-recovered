package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LineChartEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/entity/RangeType;", "", SessionDescription.ATTR_RANGE, "", "name", "selected", "", "selectColor", "", "endDividerVisible", ViewProps.PADDING_START, ViewProps.PADDING_END, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZIZII)V", "getRange", "()Ljava/lang/String;", "getName", "getSelected", "()Z", "getSelectColor", "()I", "getEndDividerVisible", "getPaddingStart", "getPaddingEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RangeType {
    private final boolean endDividerVisible;

    @Nullable
    private final String name;
    private final int paddingEnd;
    private final int paddingStart;

    @Nullable
    private final String range;
    private final int selectColor;
    private final boolean selected;

    public RangeType() {
        this(null, null, false, 0, false, 0, 0, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeType)) {
            return false;
        }
        RangeType rangeType = (RangeType) other;
        return Intrinsics.areEqual(this.range, rangeType.range) && Intrinsics.areEqual(this.name, rangeType.name) && this.selected == rangeType.selected && this.selectColor == rangeType.selectColor && this.endDividerVisible == rangeType.endDividerVisible && this.paddingStart == rangeType.paddingStart && this.paddingEnd == rangeType.paddingEnd;
    }

    public RangeType(@Nullable String str, @Nullable String str2, boolean z11, int i11, boolean z12, int i12, int i13) {
        this.range = str;
        this.name = str2;
        this.selected = z11;
        this.selectColor = i11;
        this.endDividerVisible = z12;
        this.paddingStart = i12;
        this.paddingEnd = i13;
    }

    public static /* synthetic */ RangeType copy$default(RangeType rangeType, String str, String str2, boolean z11, int i11, boolean z12, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = rangeType.range;
        }
        if ((i14 & 2) != 0) {
            str2 = rangeType.name;
        }
        if ((i14 & 4) != 0) {
            z11 = rangeType.selected;
        }
        if ((i14 & 8) != 0) {
            i11 = rangeType.selectColor;
        }
        if ((i14 & 16) != 0) {
            z12 = rangeType.endDividerVisible;
        }
        if ((i14 & 32) != 0) {
            i12 = rangeType.paddingStart;
        }
        if ((i14 & 64) != 0) {
            i13 = rangeType.paddingEnd;
        }
        int i15 = i12;
        int i16 = i13;
        boolean z13 = z12;
        boolean z14 = z11;
        return rangeType.copy(str, str2, z14, i11, z13, i15, i16);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRange() {
        return this.range;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSelectColor() {
        return this.selectColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEndDividerVisible() {
        return this.endDividerVisible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPaddingStart() {
        return this.paddingStart;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    @NotNull
    public final RangeType copy(@Nullable String range, @Nullable String name, boolean selected, int selectColor, boolean endDividerVisible, int paddingStart, int paddingEnd) {
        return new RangeType(range, name, selected, selectColor, endDividerVisible, paddingStart, paddingEnd);
    }

    public final boolean getEndDividerVisible() {
        return this.endDividerVisible;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    @Nullable
    public final String getRange() {
        return this.range;
    }

    public final int getSelectColor() {
        return this.selectColor;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        String str = this.range;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return ((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.selected)) * 31) + Integer.hashCode(this.selectColor)) * 31) + Boolean.hashCode(this.endDividerVisible)) * 31) + Integer.hashCode(this.paddingStart)) * 31) + Integer.hashCode(this.paddingEnd);
    }

    @NotNull
    public String toString() {
        return "RangeType(range=" + this.range + ", name=" + this.name + ", selected=" + this.selected + ", selectColor=" + this.selectColor + ", endDividerVisible=" + this.endDividerVisible + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ')';
    }

    public /* synthetic */ RangeType(String str, String str2, boolean z11, int i11, boolean z12, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? false : z11, (i14 & 8) != 0 ? R$color.primary : i11, (i14 & 16) != 0 ? false : z12, (i14 & 32) != 0 ? 16 : i12, (i14 & 64) != 0 ? 16 : i13);
    }
}
