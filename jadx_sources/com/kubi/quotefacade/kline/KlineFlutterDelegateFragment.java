package com.kubi.quotefacade.kline;

import android.os.Bundle;
import android.view.View;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.sdk.flutter.delegate.FuturesPositionHandlerChannel;
import com.kubi.sdk.flutter.ui.FlutterDelegateLifecycleFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KlineFlutterDelegateFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u0005H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineFlutterDelegateFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateLifecycleFragment;", "<init>", "()V", "getTextureMode", "", "quickOrderStateChannel", "Lcom/kubi/quotefacade/kline/QuickOrderStateChannel;", "getQuickOrderStateChannel", "()Lcom/kubi/quotefacade/kline/QuickOrderStateChannel;", "quickOrderStateChannel$delegate", "Lkotlin/Lazy;", "lowLiquidityStateChannel", "Lcom/kubi/quotefacade/kline/KlineLowLiquidityStateChannel;", "getLowLiquidityStateChannel", "()Lcom/kubi/quotefacade/kline/KlineLowLiquidityStateChannel;", "lowLiquidityStateChannel$delegate", "positionChannel", "Lcom/kubi/sdk/flutter/delegate/FuturesPositionHandlerChannel;", "getPositionChannel", "()Lcom/kubi/sdk/flutter/delegate/FuturesPositionHandlerChannel;", "positionChannel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindFlowEvents", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "sendPosition", JPushConstants.Analysis.KEY_JSON, "", "isLegalState", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineFlutterDelegateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineFlutterDelegateFragment.kt\ncom/kubi/quotefacade/kline/KlineFlutterDelegateFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,70:1\n76#2,7:71\n76#2,7:78\n76#2,7:85\n*S KotlinDebug\n*F\n+ 1 KlineFlutterDelegateFragment.kt\ncom/kubi/quotefacade/kline/KlineFlutterDelegateFragment\n*L\n36#1:71,7\n42#1:78,7\n52#1:85,7\n*E\n"})
public final class KlineFlutterDelegateFragment extends FlutterDelegateLifecycleFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f42134Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.kline.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KlineFlutterDelegateFragment.m52158A3();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f42135Z = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.kline.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KlineFlutterDelegateFragment.m52166y3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f42136a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.kline.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KlineFlutterDelegateFragment.m52167z3();
        }
    });

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment
    /* JADX INFO: renamed from: l3 */
    public boolean mo37561l3() {
        return true;
    }

    /* JADX INFO: renamed from: A3 */
    public static final QuickOrderStateChannel m52158A3() {
        return new QuickOrderStateChannel();
    }

    /* JADX INFO: renamed from: y3 */
    public static final KlineLowLiquidityStateChannel m52166y3() {
        return new KlineLowLiquidityStateChannel();
    }

    /* JADX INFO: renamed from: z3 */
    public static final FuturesPositionHandlerChannel m52167z3() {
        return new FuturesPositionHandlerChannel();
    }

    /* JADX INFO: renamed from: B3 */
    public final void m52168B3(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        C44128b.m97259c(getTAG(), "sendPosition: " + json);
        m52171v3().m56777b(json);
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getF46737W().m56760h(m52172w3());
        getF46737W().m56760h(m52170u3());
    }

    /* JADX INFO: renamed from: u3 */
    public final KlineLowLiquidityStateChannel m52170u3() {
        return (KlineLowLiquidityStateChannel) this.f42135Z.getValue();
    }

    /* JADX INFO: renamed from: v3 */
    public final FuturesPositionHandlerChannel m52171v3() {
        return (FuturesPositionHandlerChannel) this.f42136a0.getValue();
    }

    /* JADX INFO: renamed from: w3 */
    public final QuickOrderStateChannel m52172w3() {
        return (QuickOrderStateChannel) this.f42134Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public final boolean m52165x3() {
        if (getView() != null && !isDetached() && !isRemoving()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getF46737W().m56760h(m52171v3());
        m52169t3();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m52169t3() {
        C44128b.m97259c(getTAG(), "bindEvent: binding Flutter events");
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "kline_quick_order_state_event".length();
        }
        C12572a.m23692a(this, false, new C22244x9ebe0e8a("kline_quick_order_state_event", null, this));
        if (c12573b.m23696a()) {
            "kline_low_liquidity_state_event".length();
        }
        C12572a.m23692a(this, false, new C22245x9ebe0e8b("kline_low_liquidity_state_event", null, this));
        if (c12573b.m23696a()) {
            "kline_positions_list_update".length();
        }
        C12572a.m23692a(this, false, new C22246x9ebe0e8c("kline_positions_list_update", null, this));
    }
}
