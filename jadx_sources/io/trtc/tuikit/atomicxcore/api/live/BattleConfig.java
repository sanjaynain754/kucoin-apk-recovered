package io.trtc.tuikit.atomicxcore.api.live;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/BattleConfig;", "", TypedValues.TransitionType.S_DURATION, "", "needResponse", "", "extensionInfo", "", "(IZLjava/lang/String;)V", "getDuration", "()I", "setDuration", "(I)V", "getExtensionInfo", "()Ljava/lang/String;", "setExtensionInfo", "(Ljava/lang/String;)V", "getNeedResponse", "()Z", "setNeedResponse", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class BattleConfig {
    private int duration;

    @NotNull
    private String extensionInfo;
    private boolean needResponse;

    public BattleConfig() {
        this(0, false, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleConfig)) {
            return false;
        }
        BattleConfig battleConfig = (BattleConfig) other;
        return this.duration == battleConfig.duration && this.needResponse == battleConfig.needResponse && Intrinsics.areEqual(this.extensionInfo, battleConfig.extensionInfo);
    }

    public BattleConfig(int i11, boolean z11, @NotNull String extensionInfo) {
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        this.duration = i11;
        this.needResponse = z11;
        this.extensionInfo = extensionInfo;
    }

    public static /* synthetic */ BattleConfig copy$default(BattleConfig battleConfig, int i11, boolean z11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = battleConfig.duration;
        }
        if ((i12 & 2) != 0) {
            z11 = battleConfig.needResponse;
        }
        if ((i12 & 4) != 0) {
            str = battleConfig.extensionInfo;
        }
        return battleConfig.copy(i11, z11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNeedResponse() {
        return this.needResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExtensionInfo() {
        return this.extensionInfo;
    }

    @NotNull
    public final BattleConfig copy(int duration, boolean needResponse, @NotNull String extensionInfo) {
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        return new BattleConfig(duration, needResponse, extensionInfo);
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getExtensionInfo() {
        return this.extensionInfo;
    }

    public final boolean getNeedResponse() {
        return this.needResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.duration) * 31;
        boolean z11 = this.needResponse;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return this.extensionInfo.hashCode() + ((iHashCode + r11) * 31);
    }

    public final void setDuration(int i11) {
        this.duration = i11;
    }

    public final void setExtensionInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extensionInfo = str;
    }

    public final void setNeedResponse(boolean z11) {
        this.needResponse = z11;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BattleConfig(duration=");
        sb2.append(this.duration);
        sb2.append(", needResponse=");
        sb2.append(this.needResponse);
        sb2.append(", extensionInfo=");
        return AbstractC39392b.m88221a(sb2, this.extensionInfo, ')');
    }

    public /* synthetic */ BattleConfig(int i11, boolean z11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? "" : str);
    }
}
