package com.kubi.assets.bill;

import android.content.Context;
import com.kubi.assets.R$string;
import com.kubi.utils.C27017c;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.bill.x */
/* JADX INFO: compiled from: AccountBillCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0006"}, m90084d2 = {"getTimeStr", "", "getBizTypeStr", "accountType", "getSideStr", "getFundsTypeStr", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9657x {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m15810a(@Nullable String str, @Nullable String str2) {
        Context contextM66513b = C27017c.f54310a.m66513b();
        BizTypeFilterHelper bizTypeFilterHelper = BizTypeFilterHelper.f16688a;
        if (str2 == null) {
            str2 = "MAIN";
        }
        Map<String, String> mapM15719i = bizTypeFilterHelper.m15719i(str2);
        String str3 = mapM15719i != null ? mapM15719i.get(str) : null;
        if (str3 != null && str3.length() != 0) {
            return str3;
        }
        String string = contextM66513b.getString(R$string.type);
        Intrinsics.checkNotNull(string);
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m15811b(@Nullable String str) {
        if (Intrinsics.areEqual(str, "trialFunds")) {
            String string = C27017c.f54310a.m66513b().getString(R$string.kumex_trial_balance);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        String string2 = C27017c.f54310a.m66513b().getString(R$string.kumex_self_balance);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m15812c(@Nullable String str) {
        Context contextM66513b = C27017c.f54310a.m66513b();
        if (Intrinsics.areEqual(str, "IN")) {
            String string = contextM66513b.getString(R$string.in_account);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (Intrinsics.areEqual(str, "OUT")) {
            String string2 = contextM66513b.getString(R$string.out_account);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = contextM66513b.getString(R$string.direction);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m15813d(@Nullable String str) {
        Context contextM66513b = C27017c.f54310a.m66513b();
        if (str != null) {
            switch (str.hashCode()) {
                case -1480228202:
                    if (str.equals("ONE_YEAR")) {
                        String string = contextM66513b.getString(R$string.one_year);
                        Intrinsics.checkNotNull(string);
                        return string;
                    }
                    break;
                case -601958909:
                    if (str.equals("ONE_DAY")) {
                        String string2 = contextM66513b.getString(R$string.one_day);
                        Intrinsics.checkNotNull(string2);
                        return string2;
                    }
                    break;
                case -170154913:
                    if (str.equals("THREE_MONTH")) {
                        String string3 = contextM66513b.getString(R$string.three_month);
                        Intrinsics.checkNotNull(string3);
                        return string3;
                    }
                    break;
                case 1346794279:
                    if (str.equals("ONE_MONTH")) {
                        String string4 = contextM66513b.getString(R$string.one_month);
                        Intrinsics.checkNotNull(string4);
                        return string4;
                    }
                    break;
            }
        }
        String string5 = contextM66513b.getString(R$string.time);
        Intrinsics.checkNotNull(string5);
        return string5;
    }
}
