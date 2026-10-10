package com.kubi.market.monitor.lib.p100ui.floating.setting;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;", "", "first", "", "second", "three", "firstSelect", "", "secondSelect", "threeSelect", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getFirst", "()Ljava/lang/String;", "getSecond", "getThree", "getFirstSelect", "()Z", "getSecondSelect", "getThreeSelect", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IntervalTime {

    @NotNull
    private final String first;
    private final boolean firstSelect;

    @NotNull
    private final String second;
    private final boolean secondSelect;

    @NotNull
    private final String three;
    private final boolean threeSelect;

    public IntervalTime() {
        this(null, null, null, false, false, false, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntervalTime)) {
            return false;
        }
        IntervalTime intervalTime = (IntervalTime) other;
        return Intrinsics.areEqual(this.first, intervalTime.first) && Intrinsics.areEqual(this.second, intervalTime.second) && Intrinsics.areEqual(this.three, intervalTime.three) && this.firstSelect == intervalTime.firstSelect && this.secondSelect == intervalTime.secondSelect && this.threeSelect == intervalTime.threeSelect;
    }

    public IntervalTime(@NotNull String first, @NotNull String second, @NotNull String three, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        Intrinsics.checkNotNullParameter(three, "three");
        this.first = first;
        this.second = second;
        this.three = three;
        this.firstSelect = z11;
        this.secondSelect = z12;
        this.threeSelect = z13;
    }

    public static /* synthetic */ IntervalTime copy$default(IntervalTime intervalTime, String str, String str2, String str3, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = intervalTime.first;
        }
        if ((i11 & 2) != 0) {
            str2 = intervalTime.second;
        }
        if ((i11 & 4) != 0) {
            str3 = intervalTime.three;
        }
        if ((i11 & 8) != 0) {
            z11 = intervalTime.firstSelect;
        }
        if ((i11 & 16) != 0) {
            z12 = intervalTime.secondSelect;
        }
        if ((i11 & 32) != 0) {
            z13 = intervalTime.threeSelect;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return intervalTime.copy(str, str2, str3, z11, z14, z15);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirst() {
        return this.first;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecond() {
        return this.second;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThree() {
        return this.three;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getFirstSelect() {
        return this.firstSelect;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSecondSelect() {
        return this.secondSelect;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getThreeSelect() {
        return this.threeSelect;
    }

    @NotNull
    public final IntervalTime copy(@NotNull String first, @NotNull String second, @NotNull String three, boolean firstSelect, boolean secondSelect, boolean threeSelect) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        Intrinsics.checkNotNullParameter(three, "three");
        return new IntervalTime(first, second, three, firstSelect, secondSelect, threeSelect);
    }

    @NotNull
    public final String getFirst() {
        return this.first;
    }

    public final boolean getFirstSelect() {
        return this.firstSelect;
    }

    @NotNull
    public final String getSecond() {
        return this.second;
    }

    public final boolean getSecondSelect() {
        return this.secondSelect;
    }

    @NotNull
    public final String getThree() {
        return this.three;
    }

    public final boolean getThreeSelect() {
        return this.threeSelect;
    }

    public int hashCode() {
        return (((((((((this.first.hashCode() * 31) + this.second.hashCode()) * 31) + this.three.hashCode()) * 31) + Boolean.hashCode(this.firstSelect)) * 31) + Boolean.hashCode(this.secondSelect)) * 31) + Boolean.hashCode(this.threeSelect);
    }

    @NotNull
    public String toString() {
        return "IntervalTime(first=" + this.first + ", second=" + this.second + ", three=" + this.three + ", firstSelect=" + this.firstSelect + ", secondSelect=" + this.secondSelect + ", threeSelect=" + this.threeSelect + ')';
    }

    public /* synthetic */ IntervalTime(String str, String str2, String str3, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13);
    }
}
