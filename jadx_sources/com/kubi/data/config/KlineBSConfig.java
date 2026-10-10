package com.kubi.data.config;

import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.annotations.SerializedName;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeCommonConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/data/config/KlineBSConfig;", "", "isSpotEnable", "", "isMarginEnable", "isFutureEnable", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/data/config/KlineBSConfig;", "equals", "other", "hashCode", "", "toString", "", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineBSConfig {

    @SerializedName(ClickCardReport.ReportData.CARD_TYPE_FUTURE)
    @Nullable
    private final Boolean isFutureEnable;

    @SerializedName(ViewProps.MARGIN)
    @Nullable
    private final Boolean isMarginEnable;

    @SerializedName(SearchCategory$Companion.SPOT)
    @Nullable
    private final Boolean isSpotEnable;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlineBSConfig)) {
            return false;
        }
        KlineBSConfig klineBSConfig = (KlineBSConfig) other;
        return Intrinsics.areEqual(this.isSpotEnable, klineBSConfig.isSpotEnable) && Intrinsics.areEqual(this.isMarginEnable, klineBSConfig.isMarginEnable) && Intrinsics.areEqual(this.isFutureEnable, klineBSConfig.isFutureEnable);
    }

    public static /* synthetic */ KlineBSConfig copy$default(KlineBSConfig klineBSConfig, Boolean bool, Boolean bool2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = klineBSConfig.isSpotEnable;
        }
        if ((i11 & 2) != 0) {
            bool2 = klineBSConfig.isMarginEnable;
        }
        if ((i11 & 4) != 0) {
            bool3 = klineBSConfig.isFutureEnable;
        }
        return klineBSConfig.copy(bool, bool2, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsSpotEnable() {
        return this.isSpotEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsMarginEnable() {
        return this.isMarginEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsFutureEnable() {
        return this.isFutureEnable;
    }

    @NotNull
    public final KlineBSConfig copy(@Nullable Boolean isSpotEnable, @Nullable Boolean isMarginEnable, @Nullable Boolean isFutureEnable) {
        return new KlineBSConfig(isSpotEnable, isMarginEnable, isFutureEnable);
    }

    public int hashCode() {
        Boolean bool = this.isSpotEnable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isMarginEnable;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFutureEnable;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFutureEnable() {
        return this.isFutureEnable;
    }

    @Nullable
    public final Boolean isMarginEnable() {
        return this.isMarginEnable;
    }

    @Nullable
    public final Boolean isSpotEnable() {
        return this.isSpotEnable;
    }

    @NotNull
    public String toString() {
        return "KlineBSConfig(isSpotEnable=" + this.isSpotEnable + ", isMarginEnable=" + this.isMarginEnable + ", isFutureEnable=" + this.isFutureEnable + ')';
    }

    public KlineBSConfig(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.isSpotEnable = bool;
        this.isMarginEnable = bool2;
        this.isFutureEnable = bool3;
    }
}
