package com.kubi.unify.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreRepayEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/unify/entity/PreRepayRequestBody;", "", "liabilityCurrency", "Lcom/kubi/unify/entity/CurrencyItem;", "assetCurrencyList", "", "<init>", "(Lcom/kubi/unify/entity/CurrencyItem;Ljava/util/List;)V", "getLiabilityCurrency", "()Lcom/kubi/unify/entity/CurrencyItem;", "getAssetCurrencyList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PreRepayRequestBody {

    @NotNull
    private final List<CurrencyItem> assetCurrencyList;

    @NotNull
    private final CurrencyItem liabilityCurrency;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreRepayRequestBody)) {
            return false;
        }
        PreRepayRequestBody preRepayRequestBody = (PreRepayRequestBody) other;
        return Intrinsics.areEqual(this.liabilityCurrency, preRepayRequestBody.liabilityCurrency) && Intrinsics.areEqual(this.assetCurrencyList, preRepayRequestBody.assetCurrencyList);
    }

    public PreRepayRequestBody(@NotNull CurrencyItem liabilityCurrency, @NotNull List<CurrencyItem> assetCurrencyList) {
        Intrinsics.checkNotNullParameter(liabilityCurrency, "liabilityCurrency");
        Intrinsics.checkNotNullParameter(assetCurrencyList, "assetCurrencyList");
        this.liabilityCurrency = liabilityCurrency;
        this.assetCurrencyList = assetCurrencyList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreRepayRequestBody copy$default(PreRepayRequestBody preRepayRequestBody, CurrencyItem currencyItem, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            currencyItem = preRepayRequestBody.liabilityCurrency;
        }
        if ((i11 & 2) != 0) {
            list = preRepayRequestBody.assetCurrencyList;
        }
        return preRepayRequestBody.copy(currencyItem, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CurrencyItem getLiabilityCurrency() {
        return this.liabilityCurrency;
    }

    @NotNull
    public final List<CurrencyItem> component2() {
        return this.assetCurrencyList;
    }

    @NotNull
    public final PreRepayRequestBody copy(@NotNull CurrencyItem liabilityCurrency, @NotNull List<CurrencyItem> assetCurrencyList) {
        Intrinsics.checkNotNullParameter(liabilityCurrency, "liabilityCurrency");
        Intrinsics.checkNotNullParameter(assetCurrencyList, "assetCurrencyList");
        return new PreRepayRequestBody(liabilityCurrency, assetCurrencyList);
    }

    @NotNull
    public final List<CurrencyItem> getAssetCurrencyList() {
        return this.assetCurrencyList;
    }

    @NotNull
    public final CurrencyItem getLiabilityCurrency() {
        return this.liabilityCurrency;
    }

    public int hashCode() {
        return (this.liabilityCurrency.hashCode() * 31) + this.assetCurrencyList.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreRepayRequestBody(liabilityCurrency=" + this.liabilityCurrency + ", assetCurrencyList=" + this.assetCurrencyList + ')';
    }
}
