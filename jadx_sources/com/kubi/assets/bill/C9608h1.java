package com.kubi.assets.bill;

import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.bill.h1 */
/* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m90084d2 = {"toSearchCoinItemInfo", "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;", "Lcom/kubi/data/entity/CoinInfoEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9608h1 {
    /* JADX INFO: renamed from: b */
    public static final AccountBillSearchCoinDialog.SearchCoinItemInfo m15809b(CoinInfoEntity coinInfoEntity) {
        C37890n c37890n = C37890n.f85269a;
        String code = coinInfoEntity.getCode();
        if (code == null) {
            code = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(code);
        String iconUrl = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null;
        String code2 = coinInfoEntity.getCode();
        Intrinsics.checkNotNullExpressionValue(code2, "getCode(...)");
        String strM66677q = C27041f.m66677q(coinInfoEntity.getCurrency());
        String currency = coinInfoEntity.getCurrency();
        Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
        String strM66669i = C27041f.m66669i(strM66677q, currency);
        String name = coinInfoEntity.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new AccountBillSearchCoinDialog.SearchCoinItemInfo(code2, strM66669i, name, iconUrl, Boolean.valueOf(coinInfoEntity.isMarginEnabled()), Boolean.valueOf(coinInfoEntity.isIsolatedEnabled()), Boolean.valueOf(Intrinsics.areEqual(coinInfoEntity.getProperties().getPlatform(), "contract")), Boolean.valueOf(coinInfoEntity.isEarnEnabled()), false);
    }
}
