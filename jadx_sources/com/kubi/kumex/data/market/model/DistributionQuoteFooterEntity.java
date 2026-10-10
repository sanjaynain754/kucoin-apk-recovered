package com.kubi.kumex.data.market.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: DistributionQuoteEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/DistributionQuoteFooterEntity;", "Lcom/kubi/kumex/data/market/model/IDistributionData;", "isLoading", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DistributionQuoteFooterEntity implements IDistributionData {
    private final boolean isLoading;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DistributionQuoteFooterEntity) && this.isLoading == ((DistributionQuoteFooterEntity) other).isLoading;
    }

    public static /* synthetic */ DistributionQuoteFooterEntity copy$default(DistributionQuoteFooterEntity distributionQuoteFooterEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = distributionQuoteFooterEntity.isLoading;
        }
        return distributionQuoteFooterEntity.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public final DistributionQuoteFooterEntity copy(boolean isLoading) {
        return new DistributionQuoteFooterEntity(isLoading);
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        return "DistributionQuoteFooterEntity(isLoading=" + this.isLoading + ')';
    }

    public DistributionQuoteFooterEntity(boolean z11) {
        this.isLoading = z11;
    }
}
