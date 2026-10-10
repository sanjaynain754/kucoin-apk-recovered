package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewMarketConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/NewMarketConfig;", "", "marketOpportunityVisible", "", "marketGreedVisible", "marketAdvanceDeclineVisible", "marketEmotionBorrowVisible", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getMarketOpportunityVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarketGreedVisible", "getMarketAdvanceDeclineVisible", "getMarketEmotionBorrowVisible", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/quotefacade/entity/NewMarketConfig;", "equals", "other", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewMarketConfig {

    @SerializedName("market_advance_decline_visible")
    @Nullable
    private final Boolean marketAdvanceDeclineVisible;

    @SerializedName("market_emotion_borrow_visible")
    @Nullable
    private final Boolean marketEmotionBorrowVisible;

    @SerializedName("market_greed_visible")
    @Nullable
    private final Boolean marketGreedVisible;

    @SerializedName("market_opportunity_visible")
    @Nullable
    private final Boolean marketOpportunityVisible;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMarketConfig)) {
            return false;
        }
        NewMarketConfig newMarketConfig = (NewMarketConfig) other;
        return Intrinsics.areEqual(this.marketOpportunityVisible, newMarketConfig.marketOpportunityVisible) && Intrinsics.areEqual(this.marketGreedVisible, newMarketConfig.marketGreedVisible) && Intrinsics.areEqual(this.marketAdvanceDeclineVisible, newMarketConfig.marketAdvanceDeclineVisible) && Intrinsics.areEqual(this.marketEmotionBorrowVisible, newMarketConfig.marketEmotionBorrowVisible);
    }

    public static /* synthetic */ NewMarketConfig copy$default(NewMarketConfig newMarketConfig, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = newMarketConfig.marketOpportunityVisible;
        }
        if ((i11 & 2) != 0) {
            bool2 = newMarketConfig.marketGreedVisible;
        }
        if ((i11 & 4) != 0) {
            bool3 = newMarketConfig.marketAdvanceDeclineVisible;
        }
        if ((i11 & 8) != 0) {
            bool4 = newMarketConfig.marketEmotionBorrowVisible;
        }
        return newMarketConfig.copy(bool, bool2, bool3, bool4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getMarketOpportunityVisible() {
        return this.marketOpportunityVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getMarketGreedVisible() {
        return this.marketGreedVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getMarketAdvanceDeclineVisible() {
        return this.marketAdvanceDeclineVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getMarketEmotionBorrowVisible() {
        return this.marketEmotionBorrowVisible;
    }

    @NotNull
    public final NewMarketConfig copy(@Nullable Boolean marketOpportunityVisible, @Nullable Boolean marketGreedVisible, @Nullable Boolean marketAdvanceDeclineVisible, @Nullable Boolean marketEmotionBorrowVisible) {
        return new NewMarketConfig(marketOpportunityVisible, marketGreedVisible, marketAdvanceDeclineVisible, marketEmotionBorrowVisible);
    }

    @Nullable
    public final Boolean getMarketAdvanceDeclineVisible() {
        return this.marketAdvanceDeclineVisible;
    }

    @Nullable
    public final Boolean getMarketEmotionBorrowVisible() {
        return this.marketEmotionBorrowVisible;
    }

    @Nullable
    public final Boolean getMarketGreedVisible() {
        return this.marketGreedVisible;
    }

    @Nullable
    public final Boolean getMarketOpportunityVisible() {
        return this.marketOpportunityVisible;
    }

    public int hashCode() {
        Boolean bool = this.marketOpportunityVisible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.marketGreedVisible;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.marketAdvanceDeclineVisible;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.marketEmotionBorrowVisible;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewMarketConfig(marketOpportunityVisible=" + this.marketOpportunityVisible + ", marketGreedVisible=" + this.marketGreedVisible + ", marketAdvanceDeclineVisible=" + this.marketAdvanceDeclineVisible + ", marketEmotionBorrowVisible=" + this.marketEmotionBorrowVisible + ')';
    }

    public NewMarketConfig(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        this.marketOpportunityVisible = bool;
        this.marketGreedVisible = bool2;
        this.marketAdvanceDeclineVisible = bool3;
        this.marketEmotionBorrowVisible = bool4;
    }
}
