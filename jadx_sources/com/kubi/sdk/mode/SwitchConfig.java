package com.kubi.sdk.mode;

import android.view.View;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SwitchConfig.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\u0006J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J}\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0013\u0010/\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00065"}, m90084d2 = {"Lcom/kubi/sdk/mode/SwitchConfig;", "", "fromAppMode", "Lcom/kubi/sdk/mode/AppMode;", "toAppMode", "showTab", "", "showTabBackground", "showContent", "animationDurationDelay", "", "animationDurationIn", "animationDurationHold", "animationDurationOut", "statusBar", "Landroid/view/View;", "rootBackground", "<init>", "(Lcom/kubi/sdk/mode/AppMode;Lcom/kubi/sdk/mode/AppMode;ZZZJJJJLandroid/view/View;Z)V", "getFromAppMode", "()Lcom/kubi/sdk/mode/AppMode;", "getToAppMode", "getShowTab", "()Z", "getShowTabBackground", "getShowContent", "getAnimationDurationDelay", "()J", "getAnimationDurationIn", "getAnimationDurationHold", "getAnimationDurationOut", "getStatusBar", "()Landroid/view/View;", "getRootBackground", "fromEqualTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SwitchConfig {
    private final long animationDurationDelay;
    private final long animationDurationHold;
    private final long animationDurationIn;
    private final long animationDurationOut;

    @Nullable
    private final AppMode fromAppMode;
    private final boolean rootBackground;
    private final boolean showContent;
    private final boolean showTab;
    private final boolean showTabBackground;

    @Nullable
    private final View statusBar;

    @Nullable
    private final AppMode toAppMode;

    public SwitchConfig() {
        this(null, null, false, false, false, 0L, 0L, 0L, 0L, null, false, 2047, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchConfig)) {
            return false;
        }
        SwitchConfig switchConfig = (SwitchConfig) other;
        return this.fromAppMode == switchConfig.fromAppMode && this.toAppMode == switchConfig.toAppMode && this.showTab == switchConfig.showTab && this.showTabBackground == switchConfig.showTabBackground && this.showContent == switchConfig.showContent && this.animationDurationDelay == switchConfig.animationDurationDelay && this.animationDurationIn == switchConfig.animationDurationIn && this.animationDurationHold == switchConfig.animationDurationHold && this.animationDurationOut == switchConfig.animationDurationOut && Intrinsics.areEqual(this.statusBar, switchConfig.statusBar) && this.rootBackground == switchConfig.rootBackground;
    }

    public SwitchConfig(@Nullable AppMode appMode, @Nullable AppMode appMode2, boolean z11, boolean z12, boolean z13, long j11, long j12, long j13, long j14, @Nullable View view, boolean z14) {
        this.fromAppMode = appMode;
        this.toAppMode = appMode2;
        this.showTab = z11;
        this.showTabBackground = z12;
        this.showContent = z13;
        this.animationDurationDelay = j11;
        this.animationDurationIn = j12;
        this.animationDurationHold = j13;
        this.animationDurationOut = j14;
        this.statusBar = view;
        this.rootBackground = z14;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppMode getFromAppMode() {
        return this.fromAppMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final View getStatusBar() {
        return this.statusBar;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getRootBackground() {
        return this.rootBackground;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppMode getToAppMode() {
        return this.toAppMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowTab() {
        return this.showTab;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowTabBackground() {
        return this.showTabBackground;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowContent() {
        return this.showContent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAnimationDurationDelay() {
        return this.animationDurationDelay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getAnimationDurationIn() {
        return this.animationDurationIn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getAnimationDurationHold() {
        return this.animationDurationHold;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getAnimationDurationOut() {
        return this.animationDurationOut;
    }

    @NotNull
    public final SwitchConfig copy(@Nullable AppMode fromAppMode, @Nullable AppMode toAppMode, boolean showTab, boolean showTabBackground, boolean showContent, long animationDurationDelay, long animationDurationIn, long animationDurationHold, long animationDurationOut, @Nullable View statusBar, boolean rootBackground) {
        return new SwitchConfig(fromAppMode, toAppMode, showTab, showTabBackground, showContent, animationDurationDelay, animationDurationIn, animationDurationHold, animationDurationOut, statusBar, rootBackground);
    }

    public final boolean fromEqualTo() {
        AppMode appMode = this.fromAppMode;
        String modeType = appMode != null ? appMode.getModeType() : null;
        AppMode appMode2 = this.toAppMode;
        return Intrinsics.areEqual(modeType, appMode2 != null ? appMode2.getModeType() : null);
    }

    public final long getAnimationDurationDelay() {
        return this.animationDurationDelay;
    }

    public final long getAnimationDurationHold() {
        return this.animationDurationHold;
    }

    public final long getAnimationDurationIn() {
        return this.animationDurationIn;
    }

    public final long getAnimationDurationOut() {
        return this.animationDurationOut;
    }

    @Nullable
    public final AppMode getFromAppMode() {
        return this.fromAppMode;
    }

    public final boolean getRootBackground() {
        return this.rootBackground;
    }

    public final boolean getShowContent() {
        return this.showContent;
    }

    public final boolean getShowTab() {
        return this.showTab;
    }

    public final boolean getShowTabBackground() {
        return this.showTabBackground;
    }

    @Nullable
    public final View getStatusBar() {
        return this.statusBar;
    }

    @Nullable
    public final AppMode getToAppMode() {
        return this.toAppMode;
    }

    public int hashCode() {
        AppMode appMode = this.fromAppMode;
        int iHashCode = (appMode == null ? 0 : appMode.hashCode()) * 31;
        AppMode appMode2 = this.toAppMode;
        int iHashCode2 = (((((((((((((((iHashCode + (appMode2 == null ? 0 : appMode2.hashCode())) * 31) + Boolean.hashCode(this.showTab)) * 31) + Boolean.hashCode(this.showTabBackground)) * 31) + Boolean.hashCode(this.showContent)) * 31) + Long.hashCode(this.animationDurationDelay)) * 31) + Long.hashCode(this.animationDurationIn)) * 31) + Long.hashCode(this.animationDurationHold)) * 31) + Long.hashCode(this.animationDurationOut)) * 31;
        View view = this.statusBar;
        return ((iHashCode2 + (view != null ? view.hashCode() : 0)) * 31) + Boolean.hashCode(this.rootBackground);
    }

    @NotNull
    public String toString() {
        return "SwitchConfig(fromAppMode=" + this.fromAppMode + ", toAppMode=" + this.toAppMode + ", showTab=" + this.showTab + ", showTabBackground=" + this.showTabBackground + ", showContent=" + this.showContent + ", animationDurationDelay=" + this.animationDurationDelay + ", animationDurationIn=" + this.animationDurationIn + ", animationDurationHold=" + this.animationDurationHold + ", animationDurationOut=" + this.animationDurationOut + ", statusBar=" + this.statusBar + ", rootBackground=" + this.rootBackground + ')';
    }

    public /* synthetic */ SwitchConfig(AppMode appMode, AppMode appMode2, boolean z11, boolean z12, boolean z13, long j11, long j12, long j13, long j14, View view, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? AppMode.Pro : appMode, (i11 & 2) != 0 ? AppMode.Pro : appMode2, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) == 0 ? z13 : true, (i11 & 32) != 0 ? 200L : j11, (i11 & 64) != 0 ? 500L : j12, (i11 & 128) != 0 ? 500L : j13, (i11 & 256) == 0 ? j14 : 500L, (i11 & 512) != 0 ? null : view, (i11 & 1024) != 0 ? false : z14);
    }
}
