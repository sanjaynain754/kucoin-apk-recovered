package com.kubi.assets.sort;

import com.kubi.assets.R$string;
import com.kubi.data.coin.AccountType;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.sort.j */
/* JADX INFO: compiled from: AccountTabSortData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, m90084d2 = {"getAccountNameStrRes", "", "Lcom/kubi/assets/sort/AccountBiz;", "getAccountName", "", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C10995j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m19356a(@NotNull AccountBiz accountBiz) {
        Intrinsics.checkNotNullParameter(accountBiz, "<this>");
        return C27017c.f54310a.m66516f(m19357b(accountBiz), new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public static final int m19357b(@NotNull AccountBiz accountBiz) {
        Intrinsics.checkNotNullParameter(accountBiz, "<this>");
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10963e.f18735b)) {
            return R$string.save_account_label;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10968j.f18745b)) {
            return R$string.trading;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10969k.f18747b)) {
            return R$string.kc_unify_account;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10965g.f18739b)) {
            return R$string.lever_margin;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10964f.f18737b)) {
            return R$string.futures;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10959a.f18727b)) {
            return R$string.asset_alpha_title;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10960b.f18729b)) {
            return R$string.kc_tb_asset_bot;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10962d.f18733b)) {
            return AccountType.FINANCE.getNickNameRes();
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10967i.f18743b)) {
            return R$string.kc_options_title;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10961c.f18731b)) {
            return R$string.copytd_copy_trading;
        }
        if (Intrinsics.areEqual(accountBiz, AccountBiz.C10966h.f18741b)) {
            return R$string.kc_account_name_mining;
        }
        throw new NoWhenBranchMatchedException();
    }
}
