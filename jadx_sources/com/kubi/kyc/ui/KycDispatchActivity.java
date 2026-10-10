package com.kubi.kyc.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.host.HostManager;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.data.KycPrecheckRepository;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import gn.InterfaceC37974a;
import hn.C38234d;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p507on.AbstractC43158a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KycDispatchActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0003J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kyc/ui/KycDispatchActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", Constants.BIZ, "", "getBiz", "()Ljava/lang/String;", "biz$delegate", "Lkotlin/Lazy;", "from", "getFrom", "from$delegate", "kycPrecheckRepository", "Lcom/kubi/kyc/data/KycPrecheckRepository;", "getKycPrecheckRepository", "()Lcom/kubi/kyc/data/KycPrecheckRepository;", "kycPrecheckRepository$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configKycAbTest", "precheck", "handlePrecheckDestination", FirebaseAnalytics.Param.DESTINATION, "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination;", "jumpH5Kyc", "disableNavigationAnim", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycDispatchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycDispatchActivity.kt\ncom/kubi/kyc/ui/KycDispatchActivity\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n25#2,2:143\n27#2:146\n1#3:145\n*S KotlinDebug\n*F\n+ 1 KycDispatchActivity.kt\ncom/kubi/kyc/ui/KycDispatchActivity\n*L\n58#1:143,2\n58#1:146\n*E\n"})
public final class KycDispatchActivity extends BaseActivity {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f31288l = 0;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f31289i = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycDispatchActivity.m36875Y(this.f31393b);
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f31290j = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycDispatchActivity.m36876b0(this.f31396b);
        }
    });

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f31291k = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycDispatchActivity.m36878h0();
        }
    });

    /* JADX INFO: renamed from: d0 */
    private final String m36877d0() {
        return (String) this.f31290j.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    public static final KycPrecheckRepository m36878h0() {
        return KycPrecheckRepository.f31211b.getInstance();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: Z */
    public final void m36879Z() {
        Object objM103844constructorimpl;
        Router router = Router.f46192a;
        Object objM56186h = router.m56186h(InterfaceC37974a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC37974a) objM56186h).mo4568b(m36881c0(), m36877d0(), this);
            return;
        }
        if (C38234d.f85931a.m86313g()) {
            m36885i0();
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            router.m56184f("flutter?route=" + Uri.encode("kyc/redirect") + "&needLogin=true&from=" + m36877d0() + "&biz=" + m36881c0()).m4048k();
            finish();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        Result.m103843boximpl(objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: c0 */
    public final String m36881c0() {
        return (String) this.f31289i.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    public final KycPrecheckRepository m36882e0() {
        return (KycPrecheckRepository) this.f31291k.getValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m36883f0(AbstractC43158a abstractC43158a) {
        if (Intrinsics.areEqual(abstractC43158a, AbstractC43158a.d.f95316a)) {
            ToastCompat.m66437C(R$string.common_network_error);
            m36880a0();
            return;
        }
        if (Intrinsics.areEqual(abstractC43158a, AbstractC43158a.c.f95315a)) {
            KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "kyc/kyb", true, null, 4, null);
            m36880a0();
        } else if (abstractC43158a instanceof AbstractC43158a.ClearPage) {
            KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, ((AbstractC43158a.ClearPage) abstractC43158a).getFlutterRoute(), true, null, 4, null);
            m36880a0();
        } else {
            if (!Intrinsics.areEqual(abstractC43158a, AbstractC43158a.b.f95314a)) {
                throw new NoWhenBranchMatchedException();
            }
            m36884g0();
            m36880a0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m36884g0() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/account/kyc/setup/country-of-issue?transparentTitle=true", null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: Y */
    public static final String m36875Y(KycDispatchActivity kycDispatchActivity) {
        Intent intent = kycDispatchActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return RouteExKt.m56282x(intent, Constants.BIZ, "DEFAULT");
    }

    /* JADX INFO: renamed from: b0 */
    public static final String m36876b0(KycDispatchActivity kycDispatchActivity) {
        Intent intent = kycDispatchActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return RouteExKt.m56282x(intent, "from", "");
    }

    /* JADX INFO: renamed from: a0 */
    public final void m36880a0() {
        finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m36885i0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KycDispatchActivity$precheck$1(this, null), 3, null);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.busercenter_activity_kyc_dispatch);
        ViewExtKt.m66577h(getTitleBar());
        m36879Z();
    }
}
