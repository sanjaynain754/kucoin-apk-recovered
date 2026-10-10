package com.kubi.core.biz.kline;

import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import p768xo.InterfaceC46302c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45373b0;

/* JADX INFO: renamed from: com.kubi.core.biz.kline.a */
/* JADX INFO: compiled from: KLineContentUIExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m90084d2 = {"showTopKLineContent", "", "Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;", "hideTopKLineContent", "showBottomKLineContent", "hideBottomKLineContent", "buildKlineFragment", "Lcom/kubi/sdk/BaseFragment;", "symbol", "", "precision", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11897a {
    /* JADX INFO: renamed from: b */
    public static final void m21758b(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        View viewMo63579x1;
        Fragment parentFragment;
        FrameLayout frameLayoutMo63561l1;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        ActivityResultCaller parentFragment2 = kLineNtfFragmentBase.getParentFragment();
        InterfaceC46302c interfaceC46302c = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
        if (interfaceC46302c != null && (frameLayoutMo63561l1 = interfaceC46302c.mo63561l1()) != null) {
            ViewExtKt.m66577h(frameLayoutMo63561l1);
        }
        BaseFragment f20404a0 = kLineNtfFragmentBase.getF20404a0();
        if (f20404a0 != null && (parentFragment = f20404a0.getParentFragment()) != null) {
            C27032f.m66622m(parentFragment, f20404a0);
        }
        ActivityResultCaller parentFragment3 = kLineNtfFragmentBase.getParentFragment();
        InterfaceC46302c interfaceC46302c2 = parentFragment3 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment3 : null;
        if (interfaceC46302c2 == null || (viewMo63579x1 = interfaceC46302c2.mo63579x1()) == null) {
            return;
        }
        ViewExtKt.m66577h(viewMo63579x1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m21759c(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        Fragment parentFragment;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        C45373b0 c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3();
        if (c45373b0M21751Q3 != null && (frameLayout = c45373b0M21751Q3.f102024b) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        BaseFragment f20404a0 = kLineNtfFragmentBase.getF20404a0();
        if (f20404a0 == null || (parentFragment = f20404a0.getParentFragment()) == null) {
            return;
        }
        C27032f.m66622m(parentFragment, f20404a0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m21760d(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        View viewMo63579x1;
        FrameLayout frameLayoutMo63561l1;
        View viewMo63564n1;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        ActivityResultCaller parentFragment = kLineNtfFragmentBase.getParentFragment();
        InterfaceC46302c interfaceC46302c = parentFragment instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment : null;
        if (interfaceC46302c != null && (viewMo63564n1 = interfaceC46302c.mo63564n1()) != null) {
            ViewExtKt.m66594y(viewMo63564n1);
        }
        SymbolInfoEntity symbolInfo = kLineNtfFragmentBase.m21753S3().getSymbolInfo();
        if (symbolInfo == null) {
            return;
        }
        ActivityResultCaller parentFragment2 = kLineNtfFragmentBase.getParentFragment();
        InterfaceC46302c interfaceC46302c2 = parentFragment2 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment2 : null;
        if (interfaceC46302c2 != null && (frameLayoutMo63561l1 = interfaceC46302c2.mo63561l1()) != null) {
            ViewExtKt.m66594y(frameLayoutMo63561l1);
            Fragment fragmentFindFragment = FragmentManager.findFragment(frameLayoutMo63561l1);
            Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "findFragment(...)");
            int id2 = frameLayoutMo63561l1.getId();
            String code = symbolInfo.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            C27032f.m66625p(fragmentFindFragment, id2, m21757a(kLineNtfFragmentBase, code, symbolInfo.getPriceIncrementPrecision()), null, 4, null);
        }
        if (C11898b.m21766e()) {
            ActivityResultCaller parentFragment3 = kLineNtfFragmentBase.getParentFragment();
            InterfaceC46302c interfaceC46302c3 = parentFragment3 instanceof InterfaceC46302c ? (InterfaceC46302c) parentFragment3 : null;
            if (interfaceC46302c3 == null || (viewMo63579x1 = interfaceC46302c3.mo63579x1()) == null) {
                return;
            }
            ViewExtKt.m66594y(viewMo63579x1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m21761e(@NotNull KLineNtfFragmentBase kLineNtfFragmentBase) {
        C45373b0 c45373b0M21751Q3;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(kLineNtfFragmentBase, "<this>");
        SymbolInfoEntity symbolInfo = kLineNtfFragmentBase.m21753S3().getSymbolInfo();
        if (symbolInfo == null || (c45373b0M21751Q3 = kLineNtfFragmentBase.m21751Q3()) == null || (frameLayout = c45373b0M21751Q3.f102024b) == null) {
            return;
        }
        ViewExtKt.m66594y(frameLayout);
        int id2 = frameLayout.getId();
        String code = symbolInfo.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        C27032f.m66625p(kLineNtfFragmentBase, id2, m21757a(kLineNtfFragmentBase, code, symbolInfo.getPriceIncrementPrecision()), null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static final BaseFragment m21757a(KLineNtfFragmentBase kLineNtfFragmentBase, String str, int i11) {
        Fragment parentFragment;
        BaseFragment f20404a0 = kLineNtfFragmentBase.getF20404a0();
        if (f20404a0 != null && f20404a0.isAdded() && (parentFragment = f20404a0.getParentFragment()) != null) {
            C27032f.m66622m(parentFragment, f20404a0);
        }
        BaseFragment baseFragmentMo59977u = ISpotCommonService.f49644a.get().mo59977u(str, i11);
        kLineNtfFragmentBase.m21756W3(baseFragmentMo59977u);
        return baseFragmentMo59977u;
    }
}
