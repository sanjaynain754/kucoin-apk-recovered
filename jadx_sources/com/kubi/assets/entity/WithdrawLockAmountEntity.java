package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawLockAmountEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawLockAmountEntity;", "", "maxAvailableAmount", "", "lockedAmountItems", "", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getMaxAvailableAmount", "()Ljava/lang/String;", "getLockedAmountItems", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawLockAmountEntity {

    @Nullable
    private final Map<String, BigDecimal> lockedAmountItems;

    @Nullable
    private final String maxAvailableAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public WithdrawLockAmountEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawLockAmountEntity)) {
            return false;
        }
        WithdrawLockAmountEntity withdrawLockAmountEntity = (WithdrawLockAmountEntity) other;
        return Intrinsics.areEqual(this.maxAvailableAmount, withdrawLockAmountEntity.maxAvailableAmount) && Intrinsics.areEqual(this.lockedAmountItems, withdrawLockAmountEntity.lockedAmountItems);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WithdrawLockAmountEntity(@Nullable String str, @Nullable Map<String, ? extends BigDecimal> map) {
        this.maxAvailableAmount = str;
        this.lockedAmountItems = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawLockAmountEntity copy$default(WithdrawLockAmountEntity withdrawLockAmountEntity, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawLockAmountEntity.maxAvailableAmount;
        }
        if ((i11 & 2) != 0) {
            map = withdrawLockAmountEntity.lockedAmountItems;
        }
        return withdrawLockAmountEntity.copy(str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMaxAvailableAmount() {
        return this.maxAvailableAmount;
    }

    @Nullable
    public final Map<String, BigDecimal> component2() {
        return this.lockedAmountItems;
    }

    @NotNull
    public final WithdrawLockAmountEntity copy(@Nullable String maxAvailableAmount, @Nullable Map<String, ? extends BigDecimal> lockedAmountItems) {
        return new WithdrawLockAmountEntity(maxAvailableAmount, lockedAmountItems);
    }

    @Nullable
    public final Map<String, BigDecimal> getLockedAmountItems() {
        return this.lockedAmountItems;
    }

    @Nullable
    public final String getMaxAvailableAmount() {
        return this.maxAvailableAmount;
    }

    public int hashCode() {
        String str = this.maxAvailableAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, BigDecimal> map = this.lockedAmountItems;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawLockAmountEntity(maxAvailableAmount=" + this.maxAvailableAmount + ", lockedAmountItems=" + this.lockedAmountItems + ')';
    }

    public /* synthetic */ WithdrawLockAmountEntity(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : map);
    }
}
