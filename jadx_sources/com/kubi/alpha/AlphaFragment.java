package com.kubi.alpha;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.network.restful.C19321b;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.ui.FlutterDelegateFragment;
import com.kubi.tradebase.business.kyc.KycViewModel;
import com.kubi.user.api.IUserService;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37050a;
import er.C37237b;
import f30.C37335f;
import gr.C38000b;
import gr.C38006h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlphaFragment.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006%"}, m90084d2 = {"Lcom/kubi/alpha/AlphaFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "<init>", "()V", "alphaLifecycleChannel", "Lcom/kubi/alpha/AlphaChannelRegister;", "kycViewModel", "Lcom/kubi/tradebase/business/kyc/KycViewModel;", "getKycViewModel", "()Lcom/kubi/tradebase/business/kyc/KycViewModel;", "kycViewModel$delegate", "Lkotlin/Lazy;", "restfulApi", "Lcom/kubi/spot/api/IRestfulApi;", "getRestfulApi", "()Lcom/kubi/spot/api/IRestfulApi;", "restfulApi$delegate", "protocolScope", "Lcom/kubi/spot/utils/ParentCoroutineScope;", "lastLoginState", "", "Ljava/lang/Boolean;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onArguments", "bundle", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "subscribe", "unSubscribe", "checkLoginState", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/alpha/AlphaFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,155:1\n76#2,7:156\n220#3,5:163\n*S KotlinDebug\n*F\n+ 1 AlphaFragment.kt\ncom/kubi/alpha/AlphaFragment\n*L\n73#1:156,7\n44#1:163,5\n*E\n"})
public final class AlphaFragment extends FlutterDelegateFragment {

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f15339d0 = new Companion(null);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AlphaChannelRegister f15340Y = new AlphaChannelRegister();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f15341Z = LazyKt.lazy(new Function0() { // from class: com.kubi.alpha.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaFragment.m14970v3(this.f15353b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f15342a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.alpha.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaFragment.m14971w3();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final C37335f f15343b0 = new C37335f(C42911a.m94120b());

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public Boolean f15344c0;

    /* JADX INFO: compiled from: AlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/alpha/AlphaFragment$Companion;", "", "<init>", "()V", "EVENT_KYC_AUTH", "", "newInstance", "Lcom/kubi/alpha/AlphaFragment;", "initialRoute", "currencySeq", "isBuy", "", "type", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/kubi/alpha/AlphaFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AlphaFragment newInstance(@NotNull String initialRoute, @Nullable String currencySeq, @Nullable Boolean isBuy, @Nullable Integer type) {
            Intrinsics.checkNotNullParameter(initialRoute, "initialRoute");
            AlphaFragment alphaFragment = new AlphaFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", initialRoute);
            bundle.putString("currencySeq", currencySeq);
            bundle.putBoolean("isBuy", isBuy != null ? isBuy.booleanValue() : true);
            bundle.putInt("type", type != null ? type.intValue() : -1);
            alphaFragment.setArguments(bundle);
            return alphaFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public final KycViewModel m14969t3() {
        return (KycViewModel) this.f15341Z.getValue();
    }

    /* JADX INFO: renamed from: v3 */
    public static final KycViewModel m14970v3(AlphaFragment alphaFragment) {
        return (KycViewModel) new ViewModelProvider(alphaFragment).get(KycViewModel.class);
    }

    /* JADX INFO: renamed from: w3 */
    public static final InterfaceC37050a m14971w3() {
        return (InterfaceC37050a) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37050a.class);
    }

    /* JADX INFO: renamed from: x3 */
    private final void m14972x3() {
        this.f15343b0.close();
        C41696j.m91104d(this.f15343b0, null, null, new AlphaFragment$subscribe$1(this, null), 3, null);
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getF46737W().m56760h(this.f15340Y);
        if (C12573b.f21598a.m23696a()) {
            "event_kyc_auth".length();
        }
        C12572a.m23692a(this, false, new AlphaFragment$onViewCreated$$inlined$bindFlowEvent$default$1("event_kyc_auth", null, this));
    }

    /* JADX INFO: renamed from: s3 */
    public final void m14973s3() {
        boolean zC = IUserService.a.get().c();
        if (Intrinsics.areEqual(this.f15344c0, Boolean.TRUE) && !zC) {
            this.f15340Y.m14959a();
        }
        this.f15344c0 = Boolean.valueOf(zC);
    }

    /* JADX INFO: renamed from: u3 */
    public final InterfaceC37050a m14974u3() {
        return (InterfaceC37050a) this.f15342a0.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m14975y3() {
        this.f15343b0.close();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        this.f15340Y.m14961c();
        m14973s3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        int iM56260m;
        String strM56284y;
        super.onArguments(bundle);
        if (bundle != null) {
            iM56260m = RouteExKt.m56260m(bundle, "type");
        } else {
            iM56260m = -1;
        }
        Boolean boolValueOf = null;
        if (bundle != null) {
            strM56284y = RouteExKt.m56284y(bundle, "currencySeq");
        } else {
            strM56284y = null;
        }
        if (bundle != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56252i(bundle, "isBuy", true));
        }
        if (iM56260m != -1) {
            this.f15340Y.m14962d(strM56284y, boolValueOf);
            if (bundle != null) {
                bundle.putInt("type", -1);
            }
            if (bundle != null) {
                bundle.putString("currencySeq", "");
            }
            if (bundle != null) {
                bundle.remove("isBuy");
            }
        }
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f15340Y.m14960b();
        m14975y3();
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m14972x3();
    }
}
