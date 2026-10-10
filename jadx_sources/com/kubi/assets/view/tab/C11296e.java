package com.kubi.assets.view.tab;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.R$string;
import com.kubi.data.coin.AccountType;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.view.tab.e */
/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001¨\u0006\t"}, m90084d2 = {"getTabKey", "", "getAccountAssets", "Ljava/math/BigDecimal;", "data", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "isCustom", "", "toSortAccountName", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11296e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:93:0x013b  */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a */
    public static final java.math.BigDecimal m20094a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable com.kubi.assets.entity.AssetV2OverviewEntity r3) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.assets.view.tab.C11296e.m20094a(java.lang.String, com.kubi.assets.entity.AssetV2OverviewEntity):java.math.BigDecimal");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m20095b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1690185748:
                return !str.equals("copyTrading") ? "UNKNOWN" : "copyTrading";
            case -1081309778:
                return !str.equals(ViewProps.MARGIN) ? "UNKNOWN" : ViewProps.MARGIN;
            case -1074038704:
                return !str.equals("mining") ? "UNKNOWN" : "mining";
            case -1010136971:
                return !str.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT) ? "UNKNOWN" : TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT;
            case -286932590:
                return !str.equals("unified") ? "UNKNOWN" : "unified";
            case 3105752:
                return !str.equals(SearchCategory$Companion.EARN) ? "UNKNOWN" : "finance";
            case 3343801:
                return !str.equals("main") ? "UNKNOWN" : "main";
            case 92909918:
                return !str.equals("alpha") ? "UNKNOWN" : "alpha";
            case 102410294:
                return !str.equals("kumex") ? "UNKNOWN" : SearchCategory$Companion.FUTURES;
            case 108685930:
                return !str.equals("robot") ? "UNKNOWN" : "bots";
            case 110621028:
                return !str.equals("trade") ? "UNKNOWN" : "trade";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m20096c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.areEqual(str, "MANUAL");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m20097d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1690185748:
                if (str.equals("copyTrading")) {
                    return C27017c.f54310a.m66516f(R$string.copytd_copy_trading, new Object[0]);
                }
                break;
            case -1081309778:
                if (str.equals(ViewProps.MARGIN)) {
                    return C27017c.f54310a.m66516f(R$string.lever_margin, new Object[0]);
                }
                break;
            case -1074038704:
                if (str.equals("mining")) {
                    return C27017c.f54310a.m66516f(R$string.kc_account_name_mining, new Object[0]);
                }
                break;
            case -1010136971:
                if (str.equals(TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT)) {
                    return C27017c.f54310a.m66516f(R$string.kc_options_title, new Object[0]);
                }
                break;
            case -286932590:
                if (str.equals("unified")) {
                    return C27017c.f54310a.m66516f(R$string.kc_unify_account, new Object[0]);
                }
                break;
            case 3105752:
                if (str.equals(SearchCategory$Companion.EARN)) {
                    return C27017c.f54310a.m66516f(AccountType.FINANCE.getNickNameRes(), new Object[0]);
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    return C27017c.f54310a.m66516f(R$string.save_account_label, new Object[0]);
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    return C27017c.f54310a.m66516f(R$string.asset_alpha_title, new Object[0]);
                }
                break;
            case 102410294:
                if (str.equals("kumex")) {
                    return C27017c.f54310a.m66516f(R$string.futures, new Object[0]);
                }
                break;
            case 108685930:
                if (str.equals("robot")) {
                    return C27017c.f54310a.m66516f(R$string.kc_tb_asset_bot, new Object[0]);
                }
                break;
            case 110621028:
                if (str.equals("trade")) {
                    return C27017c.f54310a.m66516f(R$string.trading, new Object[0]);
                }
                break;
        }
        return C27017c.f54310a.m66516f(R$string.deposit_other_account, new Object[0]);
    }
}
