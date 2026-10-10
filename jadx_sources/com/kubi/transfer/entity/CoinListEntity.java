package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchCoinEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/transfer/entity/CoinListEntity;", "", "primary", "", "", "", "Lcom/kubi/transfer/entity/AccountCoin;", "<init>", "(Ljava/util/Map;)V", "getPrimary", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CoinListEntity {

    @NotNull
    private final Map<String, List<AccountCoin>> primary;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoinListEntity) && Intrinsics.areEqual(this.primary, ((CoinListEntity) other).primary);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoinListEntity(@NotNull Map<String, ? extends List<AccountCoin>> primary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.primary = primary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinListEntity copy$default(CoinListEntity coinListEntity, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = coinListEntity.primary;
        }
        return coinListEntity.copy(map);
    }

    @NotNull
    public final Map<String, List<AccountCoin>> component1() {
        return this.primary;
    }

    @NotNull
    public final CoinListEntity copy(@NotNull Map<String, ? extends List<AccountCoin>> primary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        return new CoinListEntity(primary);
    }

    @NotNull
    public final Map<String, List<AccountCoin>> getPrimary() {
        return this.primary;
    }

    public int hashCode() {
        return this.primary.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoinListEntity(primary=" + this.primary + ')';
    }
}
