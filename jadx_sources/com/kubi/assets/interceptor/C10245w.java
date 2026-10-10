package com.kubi.assets.interceptor;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.coin.AccountType;
import com.kubi.search.searchresult.SearchCategory$Companion;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.assets.interceptor.w */
/* JADX INFO: compiled from: SmallCoinExchangeInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0003"}, m90084d2 = {"toAccountType", "Lcom/kubi/data/coin/AccountType;", "", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C10245w {
    /* JADX INFO: renamed from: b */
    public static final AccountType m17461b(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1081309778) {
                if (iHashCode != 3343801) {
                    if (iHashCode == 3537154 && str.equals(SearchCategory$Companion.SPOT)) {
                        return AccountType.TRADE;
                    }
                } else if (str.equals("main")) {
                    return AccountType.MAIN;
                }
            } else if (str.equals(ViewProps.MARGIN)) {
                return AccountType.LEVER;
            }
        }
        return AccountType.MAIN;
    }
}
