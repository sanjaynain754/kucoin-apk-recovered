package com.kubi.core.biz.kline;

import af.C0296a;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultCaller;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import p768xo.InterfaceC46302c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45373b0;

/* JADX INFO: renamed from: com.kubi.core.biz.kline.c */
/* JADX INFO: compiled from: KLineNftToggleMenuExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0007"}, m90084d2 = {"updateToggleWhenExpandKLineChart", "", "Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;", "updateToggleWhenCloseKLineChart", "updateToggleWhenExpandNftChart", "updateToggleWhenCloseNftChart", "updateToggleWhenResetChart", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11899c {
    /* JADX INFO: renamed from: a */
    public static final void m21772a(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        C45373b0 c45373b0M21751Q3;
        RelativeLayout relativeLayout;
        View viewMo63550M2;
        View viewMo63564n1;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        if (C11898b.m21766e()) {
            ActivityResultCaller parentFragment = kLineNtfFragmentBase.getParentFragment();
            InterfaceC46302c interfaceC46302c = parentFragment instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment : null;
            if (interfaceC46302c != null && (viewMo63564n1 = interfaceC46302c.mo63564n1()) != null) {
                ViewExtKt.m66594y(viewMo63564n1);
            }
            ActivityResultCaller parentFragment2 = kLineNtfFragmentBase.getParentFragment();
            InterfaceC46302c interfaceC46302c2 = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
            if (interfaceC46302c2 != null && (viewMo63550M2 = interfaceC46302c2.mo63550M2()) != null) {
                C0296a.m1042d(viewMo63550M2, C11898b.m21768g(kLineNtfFragmentBase));
            }
        }
        if (!C11898b.m21769h() || (c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3()) == null || (relativeLayout = c45373b0M21751Q3.f102027e) == null) {
            return;
        }
        C0296a.m1042d(relativeLayout, C11919w.m21813k(kLineNtfFragmentBase));
    }

    /* JADX INFO: renamed from: b */
    public static final void m21773b(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        C45373b0 c45373b0M21751Q3;
        RelativeLayout relativeLayout;
        C45373b0 c45373b0M21751Q4;
        RelativeLayout relativeLayout2;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        if (C11898b.m21766e() && (c45373b0M21751Q4 = kLineNtfFragmentBase.m21751Q3()) != null && (relativeLayout2 = c45373b0M21751Q4.f102027e) != null) {
            C0296a.m1042d(relativeLayout2, true);
        }
        if (!C11898b.m21769h() || (c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3()) == null || (relativeLayout = c45373b0M21751Q3.f102027e) == null) {
            return;
        }
        C0296a.m1042d(relativeLayout, true);
    }

    /* JADX INFO: renamed from: c */
    public static final void m21774c(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        C45373b0 c45373b0M21751Q3;
        RelativeLayout relativeLayout;
        View viewMo63550M2;
        View viewMo63564n1;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        if (C11898b.m21766e()) {
            ActivityResultCaller parentFragment = kLineNtfFragmentBase.getParentFragment();
            InterfaceC46302c interfaceC46302c = parentFragment instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment : null;
            if (interfaceC46302c != null && (viewMo63564n1 = interfaceC46302c.mo63564n1()) != null) {
                ViewExtKt.m66594y(viewMo63564n1);
            }
            ActivityResultCaller parentFragment2 = kLineNtfFragmentBase.getParentFragment();
            InterfaceC46302c interfaceC46302c2 = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
            if (interfaceC46302c2 != null && (viewMo63550M2 = interfaceC46302c2.mo63550M2()) != null) {
                C0296a.m1042d(viewMo63550M2, false);
            }
        }
        if (!C11898b.m21769h() || (c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3()) == null || (relativeLayout = c45373b0M21751Q3.f102027e) == null) {
            return;
        }
        C0296a.m1042d(relativeLayout, false);
    }

    /* JADX INFO: renamed from: d */
    public static final void m21775d(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        RelativeLayout relativeLayout;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C45373b0 c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q3 == null || (relativeLayout = c45373b0M21751Q3.f102027e) == null) {
            return;
        }
        C0296a.m1042d(relativeLayout, true);
    }

    /* JADX INFO: renamed from: e */
    public static final void m21776e(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        InterfaceC46302c interfaceC46302c;
        View viewMo63564n1;
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        View viewMo63564n2;
        RelativeLayout relativeLayout2;
        BaseTextView baseTextView2;
        View viewMo63550M2;
        View viewMo63564n3;
        RelativeLayout relativeLayout3;
        BaseTextView baseTextView3;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        if (C11898b.m21766e() && C11898b.m21768g(kLineNtfFragmentBase)) {
            C45373b0 c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q3 != null && (baseTextView3 = c45373b0M21751Q3.f102028f) != null) {
                baseTextView3.setText(C11919w.m21811i(kLineNtfFragmentBase));
            }
            C45373b0 c45373b0M21751Q4 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q4 != null && (relativeLayout3 = c45373b0M21751Q4.f102027e) != null) {
                C0296a.m1042d(relativeLayout3, C11919w.m21813k(kLineNtfFragmentBase));
            }
            ActivityResultCaller parentFragment = kLineNtfFragmentBase.getParentFragment();
            InterfaceC46302c interfaceC46302c2 = parentFragment instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment : null;
            if (interfaceC46302c2 != null && (viewMo63564n3 = interfaceC46302c2.mo63564n1()) != null) {
                ViewExtKt.m66594y(viewMo63564n3);
            }
            ActivityResultCaller parentFragment2 = kLineNtfFragmentBase.getParentFragment();
            interfaceC46302c = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
            if (interfaceC46302c == null || (viewMo63550M2 = interfaceC46302c.mo63550M2()) == null) {
                return;
            }
            C0296a.m1042d(viewMo63550M2, C11898b.m21768g(kLineNtfFragmentBase));
            return;
        }
        if (C11898b.m21769h() && C11898b.m21768g(kLineNtfFragmentBase)) {
            C45373b0 c45373b0M21751Q5 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q5 != null && (baseTextView2 = c45373b0M21751Q5.f102028f) != null) {
                baseTextView2.setText(C11919w.m21811i(kLineNtfFragmentBase));
            }
            C45373b0 c45373b0M21751Q6 = kLineNtfFragmentBase.m21751Q3();
            if (c45373b0M21751Q6 != null && (relativeLayout2 = c45373b0M21751Q6.f102027e) != null) {
                C0296a.m1042d(relativeLayout2, C11919w.m21813k(kLineNtfFragmentBase));
            }
            ActivityResultCaller parentFragment3 = kLineNtfFragmentBase.getParentFragment();
            interfaceC46302c = parentFragment3 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment3 : null;
            if (interfaceC46302c == null || (viewMo63564n2 = interfaceC46302c.mo63564n1()) == null) {
                return;
            }
            ViewExtKt.m66577h(viewMo63564n2);
            return;
        }
        C45373b0 c45373b0M21751Q7 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q7 != null && (baseTextView = c45373b0M21751Q7.f102028f) != null) {
            baseTextView.setText(C11919w.m21811i(kLineNtfFragmentBase));
        }
        C45373b0 c45373b0M21751Q8 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q8 != null && (relativeLayout = c45373b0M21751Q8.f102027e) != null) {
            C0296a.m1042d(relativeLayout, C11919w.m21813k(kLineNtfFragmentBase));
        }
        ActivityResultCaller parentFragment4 = kLineNtfFragmentBase.getParentFragment();
        interfaceC46302c = parentFragment4 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment4 : null;
        if (interfaceC46302c == null || (viewMo63564n1 = interfaceC46302c.mo63564n1()) == null) {
            return;
        }
        ViewExtKt.m66577h(viewMo63564n1);
    }
}
