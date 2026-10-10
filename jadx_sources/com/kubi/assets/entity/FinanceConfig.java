package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.kubi.assets.R$string;
import com.kubi.utils.C27017c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/entity/FinanceConfig;", "", "accountDetailUrl", "Lcom/kubi/assets/entity/AccountDetailUrl;", "earnAnalysisUrl", "Lcom/kubi/assets/entity/EarnAnalysisUrl;", "menuList", "", "Lcom/kubi/assets/entity/Menu;", "<init>", "(Lcom/kubi/assets/entity/AccountDetailUrl;Lcom/kubi/assets/entity/EarnAnalysisUrl;Ljava/util/List;)V", "getAccountDetailUrl", "()Lcom/kubi/assets/entity/AccountDetailUrl;", "getEarnAnalysisUrl", "()Lcom/kubi/assets/entity/EarnAnalysisUrl;", "getMenuList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FinanceConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final AccountDetailUrl accountDetailUrl;

    @Nullable
    private final EarnAnalysisUrl earnAnalysisUrl;

    @Nullable
    private final List<Menu> menuList;

    /* JADX INFO: compiled from: FinanceEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/entity/FinanceConfig$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/entity/FinanceConfig;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final FinanceConfig newInstance() {
            return new FinanceConfig(new AccountDetailUrl(null, null, 3, null), new EarnAnalysisUrl(null, null, 3, null), CollectionsKt.listOf(new Menu("ic2_earn_pig_20", null, null, null, Boolean.TRUE, null, "H5", "/earn-h5?isBanner=1&loading=2&needLogin=true", C27017c.f54310a.m66516f(R$string.account_earn, new Object[0]), 46, null)));
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinanceConfig)) {
            return false;
        }
        FinanceConfig financeConfig = (FinanceConfig) other;
        return Intrinsics.areEqual(this.accountDetailUrl, financeConfig.accountDetailUrl) && Intrinsics.areEqual(this.earnAnalysisUrl, financeConfig.earnAnalysisUrl) && Intrinsics.areEqual(this.menuList, financeConfig.menuList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinanceConfig copy$default(FinanceConfig financeConfig, AccountDetailUrl accountDetailUrl, EarnAnalysisUrl earnAnalysisUrl, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountDetailUrl = financeConfig.accountDetailUrl;
        }
        if ((i11 & 2) != 0) {
            earnAnalysisUrl = financeConfig.earnAnalysisUrl;
        }
        if ((i11 & 4) != 0) {
            list = financeConfig.menuList;
        }
        return financeConfig.copy(accountDetailUrl, earnAnalysisUrl, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountDetailUrl getAccountDetailUrl() {
        return this.accountDetailUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EarnAnalysisUrl getEarnAnalysisUrl() {
        return this.earnAnalysisUrl;
    }

    @Nullable
    public final List<Menu> component3() {
        return this.menuList;
    }

    @NotNull
    public final FinanceConfig copy(@Nullable AccountDetailUrl accountDetailUrl, @Nullable EarnAnalysisUrl earnAnalysisUrl, @Nullable List<Menu> menuList) {
        return new FinanceConfig(accountDetailUrl, earnAnalysisUrl, menuList);
    }

    @Nullable
    public final AccountDetailUrl getAccountDetailUrl() {
        return this.accountDetailUrl;
    }

    @Nullable
    public final EarnAnalysisUrl getEarnAnalysisUrl() {
        return this.earnAnalysisUrl;
    }

    @Nullable
    public final List<Menu> getMenuList() {
        return this.menuList;
    }

    public int hashCode() {
        AccountDetailUrl accountDetailUrl = this.accountDetailUrl;
        int iHashCode = (accountDetailUrl == null ? 0 : accountDetailUrl.hashCode()) * 31;
        EarnAnalysisUrl earnAnalysisUrl = this.earnAnalysisUrl;
        int iHashCode2 = (iHashCode + (earnAnalysisUrl == null ? 0 : earnAnalysisUrl.hashCode())) * 31;
        List<Menu> list = this.menuList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FinanceConfig(accountDetailUrl=" + this.accountDetailUrl + ", earnAnalysisUrl=" + this.earnAnalysisUrl + ", menuList=" + this.menuList + ')';
    }

    public FinanceConfig(@Nullable AccountDetailUrl accountDetailUrl, @Nullable EarnAnalysisUrl earnAnalysisUrl, @Nullable List<Menu> list) {
        this.accountDetailUrl = accountDetailUrl;
        this.earnAnalysisUrl = earnAnalysisUrl;
        this.menuList = list;
    }
}
