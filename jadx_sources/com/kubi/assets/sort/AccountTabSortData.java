package com.kubi.assets.sort;

import com.kubi.p110rn.Constants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.sort.i, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: AccountTabSortData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortData;", "", Constants.BIZ, "Lcom/kubi/assets/sort/AccountBiz;", "isHide", "", "assetValue", "Ljava/math/BigDecimal;", "<init>", "(Lcom/kubi/assets/sort/AccountBiz;ZLjava/math/BigDecimal;)V", "getBiz", "()Lcom/kubi/assets/sort/AccountBiz;", "()Z", "getAssetValue", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountTabSortData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final AccountBiz biz;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean isHide;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final BigDecimal assetValue;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTabSortData)) {
            return false;
        }
        AccountTabSortData accountTabSortData = (AccountTabSortData) other;
        return Intrinsics.areEqual(this.biz, accountTabSortData.biz) && this.isHide == accountTabSortData.isHide && Intrinsics.areEqual(this.assetValue, accountTabSortData.assetValue);
    }

    public AccountTabSortData(@NotNull AccountBiz biz, boolean z11, @NotNull BigDecimal assetValue) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(assetValue, "assetValue");
        this.biz = biz;
        this.isHide = z11;
        this.assetValue = assetValue;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AccountTabSortData m19351b(AccountTabSortData accountTabSortData, AccountBiz accountBiz, boolean z11, BigDecimal bigDecimal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountBiz = accountTabSortData.biz;
        }
        if ((i11 & 2) != 0) {
            z11 = accountTabSortData.isHide;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = accountTabSortData.assetValue;
        }
        return accountTabSortData.m19352a(accountBiz, z11, bigDecimal);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AccountTabSortData m19352a(@NotNull AccountBiz biz, boolean z11, @NotNull BigDecimal assetValue) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(assetValue, "assetValue");
        return new AccountTabSortData(biz, z11, assetValue);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getAssetValue() {
        return this.assetValue;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final AccountBiz getBiz() {
        return this.biz;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsHide() {
        return this.isHide;
    }

    public int hashCode() {
        return (((this.biz.hashCode() * 31) + Boolean.hashCode(this.isHide)) * 31) + this.assetValue.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccountTabSortData(biz=" + this.biz + ", isHide=" + this.isHide + ", assetValue=" + this.assetValue + ')';
    }
}
