package com.kubi.unify.funds;

import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.Constants;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.unify.funds.o, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UnifyFundsAddDialog.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyFundsAddDialog;", "", "<init>", "()V", TIMPushProvider.f75062n, "", FirebaseAnalytics.Param.CURRENCY, "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifyFundsAddDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UnifyFundsAddDialog f53255a = new UnifyFundsAddDialog();

    /* JADX INFO: renamed from: g */
    public static final Unit m65216g(final String str, BaseViewHolder helper, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.convertClick;
        helper.setGone(i11, C24129b.m58030b(SiteVisibleConfigKey.Convert));
        int i12 = R$id.fastTradeClick;
        helper.setGone(i12, C24129b.m58030b(SiteVisibleConfigKey.FastTrade));
        View view = helper.getView(R$id.transferClick);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.unify.funds.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsAddDialog.m65217h(str, dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.unify.funds.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsAddDialog.m65218i(str, dialogFragmentHelper);
            }
        }, 1, null);
        View view3 = helper.getView(R$id.depositClick);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.unify.funds.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsAddDialog.m65219j(str, dialogFragmentHelper);
            }
        }, 1, null);
        View view4 = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.unify.funds.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsAddDialog.m65220k(str, dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m65217h(String str, DialogFragmentHelper dialogFragmentHelper) {
        InterfaceC37749a.a.m85117l(C37304a.f82764a, C27041f.m66668h(str), "MAIN", "UNIFIED", null, null, null, null, 120, null);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m65218i(String str, DialogFragmentHelper dialogFragmentHelper) {
        C38184b c38184b = C38184b.f85884a;
        Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "convert").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_convert_rn").m4038a("route", Uri.encode("ConvertPage?from=" + (Intrinsics.areEqual(c38184b.m86146a(), str) ? "BTC" : c38184b.m86146a()) + "to=" + str)).m4048k();
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m65219j(String str, DialogFragmentHelper dialogFragmentHelper) {
        InterfaceC37749a.a.m85110e(C37304a.f82764a, str, null, null, null, null, null, 62, null);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m65220k(String str, DialogFragmentHelper dialogFragmentHelper) {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, str, null, null, null, null, 123, null);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m65221f(@Nullable final String str, @NotNull FragmentManager childFragmentManager, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.unify_dialog_add_funds, true).m54237f4(new Function2() { // from class: com.kubi.unify.funds.j
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UnifyFundsAddDialog.m65216g(str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(childFragmentManager, str2);
    }
}
