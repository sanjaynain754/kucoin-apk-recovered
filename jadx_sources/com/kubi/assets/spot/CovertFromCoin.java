package com.kubi.assets.spot;

import com.kubi.data.entity.CoinInfoEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.spot.i, reason: from toString */
/* JADX INFO: compiled from: AssetV2SpotContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/spot/AssetV2SpotContract$CovertFromCoin;", "", "isOpen", "", "fromCoins", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "<init>", "(ZLjava/util/List;)V", "()Z", "getFromCoins", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CovertFromCoin {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isOpen;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final List<CoinInfoEntity> fromCoins;

    /* JADX WARN: Multi-variable type inference failed */
    public CovertFromCoin() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CovertFromCoin)) {
            return false;
        }
        CovertFromCoin covertFromCoin = (CovertFromCoin) other;
        return this.isOpen == covertFromCoin.isOpen && Intrinsics.areEqual(this.fromCoins, covertFromCoin.fromCoins);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CovertFromCoin(boolean z11, @Nullable List<? extends CoinInfoEntity> list) {
        this.isOpen = z11;
        this.fromCoins = list;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<CoinInfoEntity> m19551a() {
        return this.fromCoins;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isOpen) * 31;
        List<CoinInfoEntity> list = this.fromCoins;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "CovertFromCoin(isOpen=" + this.isOpen + ", fromCoins=" + this.fromCoins + ')';
    }

    public /* synthetic */ CovertFromCoin(boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : list);
    }
}
