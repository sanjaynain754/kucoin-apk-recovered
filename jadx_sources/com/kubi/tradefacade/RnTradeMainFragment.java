package com.kubi.tradefacade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.eventhub.EventHubTechStack;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import my.C42677p;
import my.InterfaceC42678q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import w30.C45714a;
import y70.C46392a;

/* JADX INFO: compiled from: RnTradeMainFragment.kt */
/* JADX INFO: loaded from: classes49.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\n\u0010%\u001a\u0004\u0018\u00010\u000eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/tradefacade/RnTradeMainFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/tradefacade/databinding/KucoinFragmentRnTradeMainBinding;", "getViewBinding", "()Lcom/kubi/tradefacade/databinding/KucoinFragmentRnTradeMainBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "rnFragment", "currentRouteArgs", "Landroid/os/Bundle;", "navigationObserverToken", "", "isRnRootPage", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onArguments", "bundle", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onDestroyView", "refreshKycLead", "observeRnNavigationLevel", "updateKycLeadForNavigationLevel", FirebaseAnalytics.Param.LEVEL, "", "restoreOrAddRnFragment", "resolveKycTrackPageId", "Companion", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnTradeMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnTradeMainFragment.kt\ncom/kubi/tradefacade/RnTradeMainFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,187:1\n147#2,16:188\n136#3:204\n*S KotlinDebug\n*F\n+ 1 RnTradeMainFragment.kt\ncom/kubi/tradefacade/RnTradeMainFragment\n*L\n28#1:188,16\n150#1:204\n*E\n"})
public final class RnTradeMainFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @Nullable
    public BaseFragment f51848V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Bundle f51849W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f51850X;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f51846a0 = {Reflection.property1(new PropertyReference1Impl(RnTradeMainFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/tradefacade/databinding/KucoinFragmentRnTradeMainBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f51845Z = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51847U = C45681e.m100799e(this, new Function1<RnTradeMainFragment, C45714a>() { // from class: com.kubi.tradefacade.RnTradeMainFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45714a invoke(@NotNull RnTradeMainFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45714a.m100911a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45714a, Unit>() { // from class: com.kubi.tradefacade.RnTradeMainFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45714a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45714a c45714a) {
            invoke(c45714a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public boolean f51851Y = true;

    /* JADX INFO: compiled from: RnTradeMainFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/tradefacade/RnTradeMainFragment$Companion;", "", "<init>", "()V", "TAG_RN_TRADE_MAIN", "", "KEY_SOURCE", "KEY_PAYLOAD", "KEY_CONTAINER_ID", "KEY_TECH_STACK", "KEY_LEVEL", "KEY_ACTIVE_DOMAIN", "KEY_TRADE_DOMAIN", "KEY_MARGIN_MODE", "DOMAIN_MARGIN", "DOMAIN_ALPHA", "MARGIN_MODE_ISOLATED", "MARGIN_MODE_CROSS", "PAGE_SPOT", "PAGE_MARGIN_CROSS", "PAGE_MARGIN_ISOLATED", "ROOT_PAGE_LEVEL", "", "SECONDARY_PAGE_LEVEL", "newInstance", "Lcom/kubi/tradefacade/RnTradeMainFragment;", "rnArgs", "Landroid/os/Bundle;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final RnTradeMainFragment newInstance(@NotNull Bundle rnArgs) {
            Intrinsics.checkNotNullParameter(rnArgs, "rnArgs");
            RnTradeMainFragment rnTradeMainFragment = new RnTradeMainFragment();
            rnTradeMainFragment.setArguments(rnArgs);
            return rnTradeMainFragment;
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m63452v3(int i11) {
        SpotKycLeadView spotKycLeadView;
        if (i11 >= 2) {
            this.f51851Y = false;
            C45714a c45714aM63447n3 = m63447n3();
            if (c45714aM63447n3 == null || (spotKycLeadView = c45714aM63447n3.f103056b) == null) {
                return;
            }
            ViewExtKt.m66577h(spotKycLeadView);
            return;
        }
        if (i11 == 1) {
            boolean z11 = this.f51851Y;
            this.f51851Y = true;
            if (z11 || !isShowing()) {
                return;
            }
            m63449r3();
        }
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m63444p3(final RnTradeMainFragment rnTradeMainFragment, Map envelope) {
        String rnContainerId;
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        Object obj = envelope.get("source");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(map.get("techStack"), EventHubTechStack.RN.getValue())) {
            return Unit.INSTANCE;
        }
        Object obj2 = map.get("containerId");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            return Unit.INSTANCE;
        }
        ActivityResultCaller activityResultCaller = rnTradeMainFragment.f51848V;
        InterfaceC42678q interfaceC42678q = activityResultCaller instanceof InterfaceC42678q ? (InterfaceC42678q) activityResultCaller : null;
        if (interfaceC42678q == null || (rnContainerId = interfaceC42678q.getRnContainerId()) == null) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(str, rnContainerId)) {
            return Unit.INSTANCE;
        }
        Object obj3 = envelope.get("payload");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map2 == null) {
            return Unit.INSTANCE;
        }
        Object obj4 = map2.get(FirebaseAnalytics.Param.LEVEL);
        Number number = obj4 instanceof Number ? (Number) obj4 : null;
        if (number == null) {
            return Unit.INSTANCE;
        }
        final int iIntValue = number.intValue();
        View view = rnTradeMainFragment.getView();
        if (view != null) {
            view.post(new Runnable() { // from class: com.kubi.tradefacade.c
                @Override // java.lang.Runnable
                public final void run() {
                    RnTradeMainFragment.m63445q3(this.f51958b, iIntValue);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final boolean m63446s3(RnTradeMainFragment rnTradeMainFragment) {
        return rnTradeMainFragment.f51851Y;
    }

    /* JADX INFO: renamed from: n3 */
    public final C45714a m63447n3() {
        return (C45714a) this.f51847U.getValue(this, f51846a0[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m63448o3() {
        this.f51850X = C42677p.f94436a.m93485c("kc.navigation.state", new Function1() { // from class: com.kubi.tradefacade.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RnTradeMainFragment.m63444p3(this.f51957b, (Map) obj);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_rn_trade_main, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        String str = this.f51850X;
        if (str != null) {
            C42677p.f94436a.m93495o("kc.navigation.state", str);
        }
        this.f51850X = null;
        super.onDestroyView();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f51849W = getArguments();
        m63451u3();
        m63448o3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m63449r3() {
        SpotKycLeadHelper spotKycLeadHelper = SpotKycLeadHelper.f51852a;
        C45714a c45714aM63447n3 = m63447n3();
        SpotKycLeadView spotKycLeadView = c45714aM63447n3 != null ? c45714aM63447n3.f103056b : null;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        spotKycLeadHelper.m63457c(spotKycLeadView, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), new RnTradeMainFragment$refreshKycLead$1(this), new Function0() { // from class: com.kubi.tradefacade.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(RnTradeMainFragment.m63446s3(this.f51876b));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX INFO: renamed from: t3 */
    public final String m63450t3() {
        String string;
        Bundle bundle = this.f51849W;
        if (bundle == null || (string = bundle.getString("activeDomain")) == null) {
            Bundle bundle2 = this.f51849W;
            string = bundle2 != null ? bundle2.getString("tradeDomain") : null;
        }
        if (!Intrinsics.areEqual(string, ViewProps.MARGIN)) {
            if (Intrinsics.areEqual(string, "alpha")) {
                return null;
            }
            return "B5trading";
        }
        Bundle bundle3 = this.f51849W;
        String string2 = bundle3 != null ? bundle3.getString("marginMode") : null;
        boolean zM102322d = false;
        if (string2 == null) {
            zM102322d = C46392a.m102322d(ISpotService.f49646a.get().mo59987D(), false);
        } else {
            int iHashCode = string2.hashCode();
            if (iHashCode != 94935104) {
                if (iHashCode == 575780121 && string2.equals("isolated")) {
                    zM102322d = true;
                } else {
                    zM102322d = C46392a.m102322d(ISpotService.f49646a.get().mo59987D(), false);
                }
            } else if (!string2.equals("cross")) {
                zM102322d = C46392a.m102322d(ISpotService.f49646a.get().mo59987D(), false);
            }
        }
        return zM102322d ? "B4tradingIsolated" : "B4tradingCross";
    }

    /* JADX INFO: renamed from: q3 */
    public static final void m63445q3(RnTradeMainFragment rnTradeMainFragment, int i11) {
        rnTradeMainFragment.m63452v3(i11);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        super.onArguments(bundle);
        this.f51849W = bundle;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        SpotKycLeadView spotKycLeadView;
        super.onShow();
        if (!this.f51851Y) {
            C45714a c45714aM63447n3 = m63447n3();
            if (c45714aM63447n3 != null && (spotKycLeadView = c45714aM63447n3.f103056b) != null) {
                ViewExtKt.m66577h(spotKycLeadView);
                return;
            }
            return;
        }
        m63449r3();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m63451u3() {
        BaseFragment baseFragment;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("rn_trade_main");
        if (fragmentFindFragmentByTag instanceof BaseFragment) {
            baseFragment = (BaseFragment) fragmentFindFragmentByTag;
        } else {
            baseFragment = null;
        }
        this.f51848V = baseFragment;
        if (baseFragment != null) {
            return;
        }
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(getArguments());
        this.f51848V = rnRootFragment;
        getChildFragmentManager().beginTransaction().add(R$id.rnTradeMainContainer, rnRootFragment, "rn_trade_main").commitNowAllowingStateLoss();
    }
}
