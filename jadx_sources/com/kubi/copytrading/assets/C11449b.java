package com.kubi.copytrading.assets;

import com.kubi.user.config.UserInfo;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.copytrading.assets.b */
/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0002"}, m90084d2 = {"noNullCurrency", "", "CopyTradingLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11449b {
    /* JADX INFO: renamed from: b */
    public static final String m20668b(String str) {
        return (str == null || str.length() == 0 || StringsKt.equals("null", str, true)) ? UserInfo.c().getBalanceCurrency() : str;
    }
}
