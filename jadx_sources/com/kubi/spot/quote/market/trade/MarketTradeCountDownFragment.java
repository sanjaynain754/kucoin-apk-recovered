package com.kubi.spot.quote.market.trade;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.timepicker.TimeModel;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.util.CountDownCallback;
import com.kubi.sdk.util.CountDownFinishCallback;
import com.kubi.sdk.util.TimeSyncManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.helper.MarketHelper;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import d20.C36596a;
import e20.InterfaceC37053d;
import f30.C37347r;
import java.util.Arrays;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import t20.C44652m;
import w00.C45681e;

/* JADX INFO: compiled from: MarketTradeCountDownFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010(\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020-H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u00102\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u000103H\u0002J\b\u00104\u001a\u00020&H\u0016J\u0017\u00105\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0002\u00108J\b\u00109\u001a\u00020&H\u0002J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u000207H\u0016J\u0010\u0010<\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020&H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006@"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketTradeCountDownFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/sdk/util/CountDownCallback;", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "<init>", "()V", "preview", "Lcom/kubi/data/entity/SymbolPreviewEntity;", "taskId", "", "Ljava/lang/Integer;", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeCountDownBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeCountDownBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "api", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/spot/api/MarketApi;", "api$delegate", "Lkotlin/Lazy;", "tradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeBean", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeBean$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "tryFetchData", "fetchPreviewInfo", "data", "configUI", "isLegalData", "", "showFragment", TIMPushProvider.f75062n, "updateView", "getInfo", "updateSymbolInfo", "Lcom/kubi/spot/quote/market/info/MarketCoinInfo;", "onDestroyView", "registerTimerTask", "second", "", "(Ljava/lang/Long;)V", "unRegisterTimerTask", "countDown", "remainingSecond", "updateCountDown", "getFormat", "", "finish", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketTradeCountDownFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketTradeCountDownFragment.kt\ncom/kubi/spot/quote/market/trade/MarketTradeCountDownFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,232:1\n147#2,16:233\n*S KotlinDebug\n*F\n+ 1 MarketTradeCountDownFragment.kt\ncom/kubi/spot/quote/market/trade/MarketTradeCountDownFragment\n*L\n56#1:233,16\n*E\n"})
public final class MarketTradeCountDownFragment extends BaseFragment implements CountDownCallback, CountDownFinishCallback {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f51109Z = {Reflection.property1(new PropertyReference1Impl(MarketTradeCountDownFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketTradeCountDownBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @Nullable
    public SymbolPreviewEntity f51110U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public Integer f51111V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f51112W = C45681e.m100799e(this, new Function1<MarketTradeCountDownFragment, C44652m>() { // from class: com.kubi.spot.quote.market.trade.MarketTradeCountDownFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44652m invoke(@NotNull MarketTradeCountDownFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44652m.m98780a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44652m, Unit>() { // from class: com.kubi.spot.quote.market.trade.MarketTradeCountDownFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44652m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44652m c44652m) {
            invoke(c44652m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f51113X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.p0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeCountDownFragment.m62870r3();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f51114Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.q0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketTradeCountDownFragment.m62860C3(this.f51181b);
        }
    });

    /* JADX INFO: renamed from: t3 */
    public static final Unit m62871t3() {
        C12572a.m23695d("spot_k_line_jump_to_coin_detail", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.util.CountDownFinishCallback
    public void finish() {
        m62874B3(false);
        TradeItemBean tradeItemBeanM62861D0 = m62861D0();
        if (tradeItemBeanM62861D0 != null) {
            MarketHelper.m61817h(MarketHelper.f50590a, tradeItemBeanM62861D0.getSymbol(), null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final TradeItemBean m62861D0() {
        return (TradeItemBean) this.f51114Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public final InterfaceC37053d m62872v3() {
        return (InterfaceC37053d) this.f51113X.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public final void m62874B3(boolean z11) {
        ConstraintLayout constraintLayout;
        View viewFindViewById;
        int i11 = z11 ? 0 : 8;
        FragmentActivity activity = getActivity();
        if (activity != null && (viewFindViewById = activity.findViewById(R$id.fragment_count_down)) != null) {
            viewFindViewById.setVisibility(i11);
        }
        C44652m c44652mM62882w3 = m62882w3();
        if (c44652mM62882w3 != null && (constraintLayout = c44652mM62882w3.f99203e) != null) {
            constraintLayout.setVisibility(i11);
        }
        C12572a.m23695d("spot_k_line_update_count_state", Boolean.valueOf(z11), 0L, 4, null);
    }

    /* JADX INFO: renamed from: E3 */
    public final void m62876E3() {
        Integer num = this.f51111V;
        if (num != null) {
            TimeSyncManager.f48123a.m58369s(num.intValue());
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m62879H3(TradeItemBean tradeItemBean) {
        long j11;
        C44652m c44652mM62882w3 = m62882w3();
        if (c44652mM62882w3 == null) {
            return;
        }
        c44652mM62882w3.f99202d.setText(tradeItemBean.getShowSymbol());
        SymbolPreviewEntity symbolPreviewEntity = this.f51110U;
        long jM66652l = C27039d.m66652l(symbolPreviewEntity != null ? symbolPreviewEntity.getCountDownTime() : null);
        if (jM66652l != 0) {
            BaseTextView baseTextView = c44652mM62882w3.f99200b;
            int i11 = R$string.kc_preview_trade_time;
            StringBuilder sb2 = new StringBuilder();
            j11 = 0;
            sb2.append(C42179a.m92633f(jM66652l, null, false, false, null, 15, null));
            sb2.append(" (");
            sb2.append(C37347r.m83947g());
            sb2.append(')');
            baseTextView.setText(getString(i11, sb2.toString()));
        } else {
            j11 = 0;
        }
        SymbolPreviewEntity symbolPreviewEntity2 = this.f51110U;
        if (C27025c.m66566d(symbolPreviewEntity2 != null ? symbolPreviewEntity2.isAuctionEnabled() : null)) {
            c44652mM62882w3.f99200b.setText(getString(R$string.kc_preview_callaution_time, C42179a.m92633f(jM66652l, null, false, false, null, 15, null) + " (" + C37347r.m83947g() + ')'));
        }
        SymbolPreviewEntity symbolPreviewEntity3 = this.f51110U;
        if (C27039d.m66650j(symbolPreviewEntity3 != null ? symbolPreviewEntity3.getPreviewRemainSecond() : null) <= j11) {
            m62874B3(false);
        } else {
            m62873A3(Long.valueOf(jM66652l));
            m62877F3(jM66652l - TimeSyncManager.f48123a.m58366p());
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_trade_count_down, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.f51110U = arguments != null ? (SymbolPreviewEntity) RouteExKt.m56274t(arguments, "data_1") : null;
        m62875D3();
        m62880s3();
    }

    /* JADX INFO: renamed from: w3 */
    public final C44652m m62882w3() {
        return (C44652m) this.f51112W.getValue(this, f51109Z[0]);
    }

    /* JADX INFO: renamed from: x3 */
    public final String m62883x3() {
        return TimeModel.ZERO_LEADING_NUMBER_FORMAT;
    }

    /* JADX INFO: renamed from: z3 */
    public final boolean m62885z3() {
        Long countDownTime;
        SymbolPreviewEntity symbolPreviewEntity = this.f51110U;
        if (symbolPreviewEntity != null ? Intrinsics.areEqual(symbolPreviewEntity.getPreviewEnableShow(), Boolean.TRUE) : false) {
            long jM58366p = TimeSyncManager.f48123a.m58366p();
            SymbolPreviewEntity symbolPreviewEntity2 = this.f51110U;
            if (jM58366p < ((symbolPreviewEntity2 == null || (countDownTime = symbolPreviewEntity2.getCountDownTime()) == null) ? 0L : countDownTime.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C3 */
    public static final TradeItemBean m62860C3(MarketTradeCountDownFragment marketTradeCountDownFragment) {
        FragmentActivity activity = marketTradeCountDownFragment.getActivity();
        if (activity != null) {
            return C36596a.m81886a(activity);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final InterfaceC37053d m62870r3() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: A3 */
    public final void m62873A3(Long l11) {
        m62876E3();
        if (l11 != null) {
            this.f51111V = Integer.valueOf(TimeSyncManager.f48123a.m58359i(l11.longValue(), this, this));
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m62875D3() {
        TradeItemBean tradeItemBeanM62861D0 = m62861D0();
        if (tradeItemBeanM62861D0 != null && this.f51110U == null && tradeItemBeanM62861D0.needPullPreviewInfo()) {
            m62881u3(tradeItemBeanM62861D0);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m62877F3(long j11) {
        C44652m c44652mM62882w3 = m62882w3();
        if (c44652mM62882w3 == null) {
            return;
        }
        long j12 = 3600;
        long j13 = j11 / j12;
        long j14 = 24;
        long j15 = j13 / j14;
        long j16 = j13 % j14;
        long j17 = 60;
        long j18 = (j11 % j12) / j17;
        long j19 = j11 % j17;
        BaseTextView baseTextView = c44652mM62882w3.f99205g;
        String str = String.format(m62883x3(), Arrays.copyOf(new Object[]{Long.valueOf(j15)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        baseTextView.setText(str);
        BaseTextView baseTextView2 = c44652mM62882w3.f99207i;
        String str2 = String.format(m62883x3(), Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        baseTextView2.setText(str2);
        BaseTextView baseTextView3 = c44652mM62882w3.f99209k;
        String str3 = String.format(m62883x3(), Arrays.copyOf(new Object[]{Long.valueOf(j18)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        baseTextView3.setText(str3);
        BaseTextView baseTextView4 = c44652mM62882w3.f99211m;
        String str4 = String.format(m62883x3(), Arrays.copyOf(new Object[]{Long.valueOf(j19)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        baseTextView4.setText(str4);
    }

    /* JADX INFO: renamed from: G3 */
    public final void m62878G3(MarketCoinInfo marketCoinInfo) {
        String logo;
        Context context = getContext();
        if (context != null) {
            ImageView imageView = null;
            if (marketCoinInfo != null) {
                logo = marketCoinInfo.getLogo();
            } else {
                logo = null;
            }
            C44652m c44652mM62882w3 = m62882w3();
            if (c44652mM62882w3 != null) {
                imageView = c44652mM62882w3.f99201c;
            }
            C24277v.m58540e(context, logo, imageView);
        }
    }

    @Override // com.kubi.sdk.util.CountDownCallback
    /* JADX INFO: renamed from: l2 */
    public void mo20702l2(long j11) {
        m62877F3(j11);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m62876E3();
    }

    /* JADX INFO: renamed from: s3 */
    public final void m62880s3() {
        KcPrimaryButton kcPrimaryButton;
        TradeItemBean tradeItemBeanM62861D0 = m62861D0();
        if (m62885z3() && tradeItemBeanM62861D0 != null) {
            m62874B3(true);
            m62879H3(tradeItemBeanM62861D0);
            m62884y3(tradeItemBeanM62861D0);
            C44652m c44652mM62882w3 = m62882w3();
            if (c44652mM62882w3 != null && (kcPrimaryButton = c44652mM62882w3.f99204f) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.spot.quote.market.trade.o0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarketTradeCountDownFragment.m62871t3();
                    }
                }, 1, null);
                return;
            }
            return;
        }
        m62874B3(false);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m62881u3(TradeItemBean tradeItemBean) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new MarketTradeCountDownFragment$fetchPreviewInfo$1(this, tradeItemBean, null));
    }

    /* JADX INFO: renamed from: y3 */
    public final void m62884y3(TradeItemBean tradeItemBean) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new MarketTradeCountDownFragment$getInfo$1(this, tradeItemBean, null));
    }
}
