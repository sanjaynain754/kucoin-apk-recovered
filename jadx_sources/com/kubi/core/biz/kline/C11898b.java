package com.kubi.core.biz.kline;

import com.kubi.utils.C27063n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.kline.b */
/* JADX INFO: compiled from: KLineNftContentExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a\b\u0010\n\u001a\u00020\bH\u0000\u001a\b\u0010\u000b\u001a\u00020\bH\u0000\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\r"}, m90084d2 = {"refreshChartUI", "", "Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;", "expandKLineView", "closeKLineView", "closeNftView", "expandNftView", "isSupportKLine", "", "isHideKLineMode", "isTopKLineMode", "isBottomKLineMode", "updateContentWhenChartReset", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11898b {
    /* JADX INFO: renamed from: e */
    public static final boolean m21766e() {
        return C27063n.m66765c("k_panel_position", 0, 1, null) == 1;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m21767f() {
        return C27063n.m66765c("k_panel_position", 0, 1, null) == 2;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m21769h() {
        return C27063n.m66765c("k_panel_position", 0, 1, null) == 0;
    }

    /* JADX INFO: renamed from: a */
    public static final void m21762a(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        if (m21766e()) {
            C11897a.m21758b(kLineNtfFragmentBase);
        }
        if (m21769h()) {
            C11897a.m21759c(kLineNtfFragmentBase);
        }
        C11899c.m21772a(kLineNtfFragmentBase);
    }

    /* JADX INFO: renamed from: b */
    public static final void m21763b(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C11899c.m21773b(kLineNtfFragmentBase);
        C11919w.m21812j(kLineNtfFragmentBase);
    }

    /* JADX INFO: renamed from: c */
    public static final void m21764c(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C11899c.m21774c(kLineNtfFragmentBase);
        if (m21766e()) {
            C11897a.m21760d(kLineNtfFragmentBase);
        }
        if (m21769h()) {
            C11897a.m21761e(kLineNtfFragmentBase);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21765d(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C11899c.m21775d(kLineNtfFragmentBase);
        C11919w.m21806d(kLineNtfFragmentBase);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m21768g(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        return (kLineNtfFragmentBase.m21753S3().isInCallAuctionTrade() || m21767f()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static final void m21770i(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C11899c.m21776e(kLineNtfFragmentBase);
        m21771j(kLineNtfFragmentBase);
        if (kLineNtfFragmentBase.m21755U3().getIsShowKLineContent() && m21768g(kLineNtfFragmentBase)) {
            m21764c(kLineNtfFragmentBase);
        } else if (kLineNtfFragmentBase.m21755U3().getIsShowNftContent() && C11919w.m21813k(kLineNtfFragmentBase)) {
            m21765d(kLineNtfFragmentBase);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m21771j(KLineNtfFragmentBase kLineNtfFragmentBase) {
        C11897a.m21758b(kLineNtfFragmentBase);
        C11897a.m21759c(kLineNtfFragmentBase);
        C11919w.m21812j(kLineNtfFragmentBase);
        C11919w.m21815m(kLineNtfFragmentBase, null, 1, null);
    }
}
