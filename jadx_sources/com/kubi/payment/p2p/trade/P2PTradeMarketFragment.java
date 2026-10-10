package com.kubi.payment.p2p.trade;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.otc.merchant.OtcAdPublishFragment;
import com.kubi.otc.service.OtcDepend;
import com.kubi.otc.view.OrderRemindView;
import com.kubi.otc.view.SelectLabelDialogView;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.base.BaseP2PFragment;
import com.kubi.payment.p2p.data.entities.P2PTradingPairInfo;
import com.kubi.payment.p2p.data.entities.TradeCurrencyFiat;
import com.kubi.payment.p2p.data.entities.TradeInfo;
import com.kubi.payment.p2p.trade.filter.P2PFilterDialog;
import com.kubi.payment.p2p.trade.view.P2PCryptoCurrencySelectPopup;
import com.kubi.payment.widget.RotateTextView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dz.C36993c;
import gf.C37890n;
import gu.C38033n;
import gu.C38037r;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import mt.SelectLabel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37698v1;
import p419l2.C42032f;
import p569qq.C43841b;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: P2PTradeMarketFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001WB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0016J\b\u00101\u001a\u000202H\u0014J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00107\u001a\u0002042\u0006\u00108\u001a\u00020\u00182\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00109\u001a\u000204H\u0016J\b\u0010:\u001a\u000204H\u0002J\b\u0010;\u001a\u000204H\u0002J\b\u0010<\u001a\u000204H\u0002J\b\u0010=\u001a\u000204H\u0016J\b\u0010>\u001a\u000204H\u0014J\b\u0010?\u001a\u000204H\u0002J\u0018\u0010@\u001a\u0002042\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010BH\u0002J\b\u0010D\u001a\u000204H\u0002J\b\u0010E\u001a\u000204H\u0002J\b\u0010F\u001a\u000204H\u0002J\b\u0010G\u001a\u000204H\u0002J\b\u0010H\u001a\u000204H\u0002J\b\u0010I\u001a\u000204H\u0007J\b\u0010J\u001a\u000204H\u0002J\b\u0010K\u001a\u00020\tH\u0016J\b\u0010L\u001a\u00020\tH\u0016J\b\u0010M\u001a\u00020\tH\u0016J\b\u0010N\u001a\u00020\tH\u0016J\n\u0010O\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010P\u001a\u0002042\b\u0010O\u001a\u0004\u0018\u00010\fH\u0016J\u0014\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0RH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010S\u001a\u0002042\u0006\u0010T\u001a\u00020\u0007H\u0016J\b\u0010U\u001a\u000204H\u0002J\b\u0010V\u001a\u000204H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b&\u0010'R\u001d\u0010)\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,¨\u0006X"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;", "Lcom/kubi/payment/p2p/base/BaseP2PFragment;", "Lcom/kubi/payment/p2p/trade/P2PTradeMarketViewModel;", "Lcom/kubi/payment/p2p/trade/ITradeData;", "<init>", "()V", "isBuy", "", "fiatCurrencyAmount", "", "selectPaymentMethodCodes", "p2PFilterData", "Lcom/kubi/payment/p2p/trade/filter/P2PFilterDialog$P2PFilterData;", "marketListFragment", "Lcom/kubi/payment/p2p/trade/P2PTradeMarketListFragment;", "tvCryptoCurrency", "Lcom/kubi/payment/widget/RotateTextView;", "tvFilterFiatAmount", "tvFilterPayMethod", "tvFiatCurrency", "Landroid/widget/TextView;", "ivFilter", "Landroid/widget/ImageView;", "viewDepend", "Landroid/view/View;", "cryptoCurrencySelectPopup", "Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;", "getCryptoCurrencySelectPopup", "()Lcom/kubi/payment/p2p/trade/view/P2PCryptoCurrencySelectPopup;", "cryptoCurrencySelectPopup$delegate", "Lkotlin/Lazy;", "fiatCurrencyAmountFilterPopup", "Lcom/kubi/payment/p2p/trade/view/P2PFiatCurrencyAmountFilterPopup;", "getFiatCurrencyAmountFilterPopup", "()Lcom/kubi/payment/p2p/trade/view/P2PFiatCurrencyAmountFilterPopup;", "fiatCurrencyAmountFilterPopup$delegate", "paymentMethodPopup", "Lcom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup;", "getPaymentMethodPopup", "()Lcom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup;", "paymentMethodPopup$delegate", "vb", "Lcom/kubi/otc/databinding/PaymentFragmentP2pTradeMarketBinding;", "getVb", "()Lcom/kubi/otc/databinding/PaymentFragmentP2pTradeMarketBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModelClass", "Lkotlin/reflect/KClass;", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "onTabChanged", "refreshTab", "initFindViews", "onResume", "observeData", "resetFilter", "refreshBanner", "bannerInfoList", "", "Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "initListener", "updateFilterView", "showSupportCurrencyFiatView", "getUserTradeInfoLooper", "refreshTradingPair", "refreshData", "clearAmountText", "getFiatCurrency", "getCryptoCurrency", "getFiatCurrencyAmount", "paymentMethodCodes", "p2pFilterData", "updateP2PFilterData", "getPayMethodIcons", "", "animRemindView", "isAnimIn", "showFraudDialogIfNeeded", "onDestroyView", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PTradeMarketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n147#2,16:516\n1563#3:532\n1634#3,3:533\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketFragment.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketFragment\n*L\n141#1:516,16\n412#1:532\n412#1:533,3\n*E\n"})
public final class P2PTradeMarketFragment extends BaseP2PFragment<P2PTradeMarketViewModel> implements ITradeData {

    /* JADX INFO: renamed from: Y */
    @Nullable
    public P2PFilterDialog.P2PFilterData f39983Y;

    /* JADX INFO: renamed from: Z */
    public P2PTradeMarketListFragment f39984Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public RotateTextView f39985a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public RotateTextView f39986b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public RotateTextView f39987c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public TextView f39988d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public ImageView f39989e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public View f39990f0;

    /* JADX INFO: renamed from: l0 */
    public static final /* synthetic */ KProperty<Object>[] f39979l0 = {Reflection.property1(new PropertyReference1Impl(P2PTradeMarketFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/PaymentFragmentP2pTradeMarketBinding;", 0))};

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f39978k0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    public boolean f39980V = true;

    /* JADX INFO: renamed from: W */
    @NotNull
    public String f39981W = "";

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f39982X = "";

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f39991g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P2PTradeMarketFragment.m49093a4(this.f40088b);
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f39992h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P2PTradeMarketFragment.m49096d4(this.f40090b);
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f39993i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.trade.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P2PTradeMarketFragment.m49070H4(this.f40093b);
        }
    });

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final InterfaceC24293a f39994j0 = C45681e.m100799e(this, new Function1<P2PTradeMarketFragment, C37698v1>() { // from class: com.kubi.payment.p2p.trade.P2PTradeMarketFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37698v1 invoke(@NotNull P2PTradeMarketFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37698v1.m84986a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37698v1, Unit>() { // from class: com.kubi.payment.p2p.trade.P2PTradeMarketFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37698v1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37698v1 c37698v1) {
            invoke(c37698v1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: P2PTradeMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment$Companion;", "", "<init>", "()V", "LOOPER_TRADE_INFO_TIME", "", "newInstance", "Lcom/kubi/payment/p2p/trade/P2PTradeMarketFragment;", "preSpmId", "", "side", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ P2PTradeMarketFragment newInstance$default(Companion companion, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return companion.newInstance(str, str2);
        }

        @NotNull
        public final P2PTradeMarketFragment newInstance(@Nullable String preSpmId, @Nullable String side) {
            P2PTradeMarketFragment p2PTradeMarketFragment = new P2PTradeMarketFragment();
            p2PTradeMarketFragment.setArguments(new C27051h().m66724h("spm", preSpmId).m66724h("key_side", side).m66717a());
            return p2PTradeMarketFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.P2PTradeMarketFragment$a */
    /* JADX INFO: compiled from: P2PTradeMarketFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21240a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39995b;

        public C21240a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39995b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f39995b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39995b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m49079M4(BannerInfo.Banner banner, P2PTradeMarketFragment p2PTradeMarketFragment) {
        String strM66668h = C27041f.m66668h(banner != null ? banner.getLinkUrl() : null);
        if (strM66668h.length() == 0) {
            return Unit.INSTANCE;
        }
        Router.f46192a.m56184f(strM66668h).m4048k();
        C43852m.m96590b(C27041f.m66668h(p2PTradeMarketFragment.getF18762X()), "p2pBanner", "1", TuplesKt.m90091to("bannerContent", C27041f.m66668h(banner != null ? banner.getId() : null)), TuplesKt.m90091to("pay_crypto_currency", p2PTradeMarketFragment.mo49119K2()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m49058B4(final P2PTradeMarketFragment p2PTradeMarketFragment, List list) throws Exception {
        if (list == null || list.isEmpty()) {
            ToastCompat.m66437C(R$string.pay_otc_un_available_market);
            return Unit.INSTANCE;
        }
        C38346y.m86538y(p2PTradeMarketFragment, C27041f.m66668h((String) CollectionsKt.firstOrNull(list)), new Consumer() { // from class: com.kubi.payment.p2p.trade.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                P2PTradeMarketFragment.m49060C4(this.f40041b, (ArrayList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public static final void m49060C4(P2PTradeMarketFragment p2PTradeMarketFragment, ArrayList arrayList) {
        BaseFragmentActivity.m56574n0(p2PTradeMarketFragment.mContext, p2PTradeMarketFragment.getStringRes(R$string.publish_ad, new Object[0]), OtcAdPublishFragment.class.getName(), new C27051h().m66725i("legals", ((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49327N().getValue()).m66722f("symbols", arrayList).m66717a());
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m49066F4(P2PTradeMarketFragment p2PTradeMarketFragment, Boolean bool) {
        P2PTradeMarketListFragment p2PTradeMarketListFragment = p2PTradeMarketFragment.f39984Z;
        if (p2PTradeMarketListFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("marketListFragment");
            p2PTradeMarketListFragment = null;
        }
        p2PTradeMarketListFragment.m49280s5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final C38037r m49070H4(final P2PTradeMarketFragment p2PTradeMarketFragment) {
        Context mContext = p2PTradeMarketFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        C38037r c38037r = new C38037r(mContext, new Function1() { // from class: com.kubi.payment.p2p.trade.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49074J4(this.f40044b, (String) obj);
            }
        });
        c38037r.m49375p(new Function0() { // from class: com.kubi.payment.p2p.trade.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketFragment.m49072I4(this.f40048b);
            }
        });
        return c38037r;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m49072I4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        RotateTextView rotateTextView = p2PTradeMarketFragment.f39987c0;
        if (rotateTextView != null) {
            rotateTextView.m49906d();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m49077L4(final P2PTradeMarketFragment p2PTradeMarketFragment, BGABanner bGABanner, ConstraintLayout itemView, final BannerInfo.Banner banner, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        TextView textView = (TextView) itemView.findViewById(R$id.tv_title);
        TextView textView2 = (TextView) itemView.findViewById(R$id.tv_content);
        ImageView imageView = (ImageView) itemView.findViewById(R$id.iv_icon);
        textView.setText(C27041f.m66668h(banner != null ? banner.getTitle() : null));
        textView2.setText(C27041f.m66668h(banner != null ? banner.getSubtitle() : null));
        if (C27041f.m66668h(banner != null ? banner.getIconUrl() : null).length() == 0) {
            Intrinsics.checkNotNull(imageView);
            C27046k.m66700o(imageView);
        } else {
            C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(p2PTradeMarketFragment.mContext).mo6634v(C27041f.m66668h(banner != null ? banner.getIconUrl() : null));
            C42032f c42032f = new C42032f();
            int i12 = R$mipmap.ic_placeholder;
            c46340cMo6634v.mo6606a(c42032f.mo92188b0(i12).mo92208m(i12)).m6594E0(imageView);
            Intrinsics.checkNotNull(imageView);
            C27046k.m66685H(imageView);
        }
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketFragment.m49079M4(banner, p2PTradeMarketFragment);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: a4 */
    public static final P2PCryptoCurrencySelectPopup m49093a4(final P2PTradeMarketFragment p2PTradeMarketFragment) {
        Context mContext = p2PTradeMarketFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        P2PCryptoCurrencySelectPopup p2PCryptoCurrencySelectPopup = new P2PCryptoCurrencySelectPopup(mContext, new Function1() { // from class: com.kubi.payment.p2p.trade.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49094b4(this.f40156b, (String) obj);
            }
        });
        p2PCryptoCurrencySelectPopup.m49375p(new Function0() { // from class: com.kubi.payment.p2p.trade.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketFragment.m49095c4(this.f40158b);
            }
        });
        return p2PCryptoCurrencySelectPopup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public static final Unit m49094b4(P2PTradeMarketFragment p2PTradeMarketFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49323J().getValue(), it)) {
            ((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49341c0(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m49095c4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        RotateTextView rotateTextView = p2PTradeMarketFragment.f39985a0;
        if (rotateTextView != null) {
            rotateTextView.m49906d();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final C38033n m49096d4(final P2PTradeMarketFragment p2PTradeMarketFragment) {
        Context mContext = p2PTradeMarketFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        C38033n c38033n = new C38033n(mContext, new Function1() { // from class: com.kubi.payment.p2p.trade.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49097e4(this.f40100b, (String) obj);
            }
        });
        c38033n.m49375p(new Function0() { // from class: com.kubi.payment.p2p.trade.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PTradeMarketFragment.m49098f4(this.f40102b);
            }
        });
        return c38033n;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m49097e4(P2PTradeMarketFragment p2PTradeMarketFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(p2PTradeMarketFragment.f39981W, it)) {
            p2PTradeMarketFragment.f39981W = it;
            if (it.length() == 0) {
                p2PTradeMarketFragment.m49131Z3();
            } else {
                RotateTextView rotateTextView = p2PTradeMarketFragment.f39986b0;
                if (rotateTextView != null) {
                    rotateTextView.setText(it);
                }
                RotateTextView rotateTextView2 = p2PTradeMarketFragment.f39986b0;
                if (rotateTextView2 != null) {
                    rotateTextView2.setTextColor(p2PTradeMarketFragment.getColorRes(R$color.c_text));
                }
            }
            p2PTradeMarketFragment.m49123N4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m49098f4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        RotateTextView rotateTextView = p2PTradeMarketFragment.f39986b0;
        if (rotateTextView != null) {
            rotateTextView.m49906d();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    private final void m49100n4() {
        TextView textView = this.f39988d0;
        if (textView != null) {
            C27046k.m66710y(textView, 500L, new Function0() { // from class: com.kubi.payment.p2p.trade.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketFragment.m49101o4(this.f40107b);
                }
            });
        }
        RotateTextView rotateTextView = this.f39985a0;
        if (rotateTextView != null) {
            C27046k.m66711z(rotateTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketFragment.m49102p4(this.f40111b);
                }
            }, 1, null);
        }
        RotateTextView rotateTextView2 = this.f39986b0;
        if (rotateTextView2 != null) {
            C27046k.m66711z(rotateTextView2, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketFragment.m49103q4(this.f40118b);
                }
            }, 1, null);
        }
        RotateTextView rotateTextView3 = this.f39987c0;
        if (rotateTextView3 != null) {
            C27046k.m66711z(rotateTextView3, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketFragment.m49104r4(this.f40146b);
                }
            }, 1, null);
        }
        ImageView imageView = this.f39989e0;
        if (imageView != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketFragment.m49105s4(this.f40152b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m49102p4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        RotateTextView rotateTextView = p2PTradeMarketFragment.f39985a0;
        if (rotateTextView != null) {
            rotateTextView.m49907e();
        }
        p2PTradeMarketFragment.m49134g4().m49376q(p2PTradeMarketFragment.getActivity(), p2PTradeMarketFragment.f39990f0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public static final Unit m49103q4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        RotateTextView rotateTextView = p2PTradeMarketFragment.f39986b0;
        if (rotateTextView != null) {
            rotateTextView.m49907e();
        }
        C38033n c38033nM49135h4 = p2PTradeMarketFragment.m49135h4();
        c38033nM49135h4.m85906v(p2PTradeMarketFragment.f39981W, C27041f.m66668h(((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49325L().getValue()));
        c38033nM49135h4.m49376q(p2PTradeMarketFragment.getActivity(), p2PTradeMarketFragment.f39990f0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m49105s4(final P2PTradeMarketFragment p2PTradeMarketFragment) {
        P2PFilterDialog.Companion companion = P2PFilterDialog.f40061v0;
        FragmentManager childFragmentManager = p2PTradeMarketFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, p2PTradeMarketFragment.f39983Y, new Function1() { // from class: com.kubi.payment.p2p.trade.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49106t4(this.f40051b, (P2PFilterDialog.P2PFilterData) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m49106t4(P2PTradeMarketFragment p2PTradeMarketFragment, P2PFilterDialog.P2PFilterData p2PFilterData) {
        p2PTradeMarketFragment.f39983Y = p2PFilterData;
        p2PTradeMarketFragment.m49129U4();
        p2PTradeMarketFragment.m49123N4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m49108u4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        if (p2PTradeMarketFragment.f39980V) {
            return Unit.INSTANCE;
        }
        p2PTradeMarketFragment.f39980V = true;
        p2PTradeMarketFragment.m49068G4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m49110v4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        if (!p2PTradeMarketFragment.f39980V) {
            return Unit.INSTANCE;
        }
        p2PTradeMarketFragment.f39980V = false;
        p2PTradeMarketFragment.m49068G4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public static final Unit m49112w4(P2PTradeMarketFragment p2PTradeMarketFragment, String str) {
        TextView textView = p2PTradeMarketFragment.f39988d0;
        if (textView != null) {
            textView.setText(str);
        }
        ((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49335V();
        P2PTradeMarketViewModel.m49311Y((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3(), false, 1, null);
        ((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49334U();
        p2PTradeMarketFragment.m49126Q4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m49114x4(P2PTradeMarketFragment p2PTradeMarketFragment, String str) {
        ImageView imageView;
        RotateTextView rotateTextView = p2PTradeMarketFragment.f39985a0;
        if (rotateTextView != null) {
            rotateTextView.setText(str);
        }
        C37890n c37890n = C37890n.f85269a;
        Intrinsics.checkNotNull(str);
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
        C37698v1 c37698v1M49139l4 = p2PTradeMarketFragment.m49139l4();
        if (c37698v1M49139l4 != null && (imageView = c37698v1M49139l4.f84757e) != null) {
            C24277v.m58540e(p2PTradeMarketFragment.mContext, C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null), imageView);
        }
        p2PTradeMarketFragment.m49123N4();
        p2PTradeMarketFragment.m49125P4();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.p2p.trade.ITradeData
    /* JADX INFO: renamed from: L, reason: from getter */
    public boolean getF39980V() {
        return this.f39980V;
    }

    @Override // com.kubi.payment.p2p.trade.ITradeData
    @NotNull
    /* JADX INFO: renamed from: N1, reason: from getter */
    public String getF39981W() {
        return this.f39981W;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m49124O4() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatTextView appCompatTextView8;
        if (this.f39980V) {
            C37698v1 c37698v1M49139l4 = m49139l4();
            if (c37698v1M49139l4 != null && (appCompatTextView8 = c37698v1M49139l4.f84759g) != null) {
                appCompatTextView8.setBackgroundResource(R$drawable.payment_shape_c_button_normal_99r);
            }
            C37698v1 c37698v1M49139l5 = m49139l4();
            if (c37698v1M49139l5 != null && (appCompatTextView7 = c37698v1M49139l5.f84759g) != null) {
                appCompatTextView7.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_textEmphasis));
            }
            C37698v1 c37698v1M49139l6 = m49139l4();
            if (c37698v1M49139l6 != null && (appCompatTextView6 = c37698v1M49139l6.f84764l) != null) {
                appCompatTextView6.setBackground(null);
            }
            C37698v1 c37698v1M49139l7 = m49139l4();
            if (c37698v1M49139l7 == null || (appCompatTextView5 = c37698v1M49139l7.f84764l) == null) {
                return;
            }
            appCompatTextView5.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_text));
            return;
        }
        C37698v1 c37698v1M49139l8 = m49139l4();
        if (c37698v1M49139l8 != null && (appCompatTextView4 = c37698v1M49139l8.f84759g) != null) {
            appCompatTextView4.setBackground(null);
        }
        C37698v1 c37698v1M49139l9 = m49139l4();
        if (c37698v1M49139l9 != null && (appCompatTextView3 = c37698v1M49139l9.f84759g) != null) {
            appCompatTextView3.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_text));
        }
        C37698v1 c37698v1M49139l10 = m49139l4();
        if (c37698v1M49139l10 != null && (appCompatTextView2 = c37698v1M49139l10.f84764l) != null) {
            appCompatTextView2.setBackgroundResource(R$drawable.payment_shape_c_button_normal_99r);
        }
        C37698v1 c37698v1M49139l11 = m49139l4();
        if (c37698v1M49139l11 == null || (appCompatTextView = c37698v1M49139l11.f84764l) == null) {
            return;
        }
        appCompatTextView.setTextColor(ContextCompat.getColor(this.mContext, R$color.c_textEmphasis));
    }

    /* JADX INFO: renamed from: P4 */
    public final void m49125P4() {
        P2PTradeMarketListFragment p2PTradeMarketListFragment = this.f39984Z;
        if (p2PTradeMarketListFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("marketListFragment");
            p2PTradeMarketListFragment = null;
        }
        p2PTradeMarketListFragment.m49245C5(mo49119K2(), mo49132e1(), P2PTradingPairInfo.TradeTypeEnum.BUY.getType());
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m49126Q4() {
        this.f39981W = "";
        this.f39982X = "";
        m49131Z3();
        RotateTextView rotateTextView = this.f39987c0;
        if (rotateTextView != null) {
            rotateTextView.setText("");
        }
        this.f39983Y = new P2PFilterDialog.P2PFilterData(!this.f39980V, false, null, false, 14, null);
        ImageView imageView = this.f39989e0;
        if (imageView != null) {
            imageView.setColorFilter(ContextCompat.getColor(this.mContext, R$color.c_text), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final void m49127R4() {
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48411c(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: renamed from: U4 */
    public final void m49129U4() {
        P2PFilterDialog.P2PFilterData p2PFilterData = this.f39983Y;
        if (!C27025c.m66566d(p2PFilterData != null ? Boolean.valueOf(p2PFilterData.getSwitchMerchantEnabled()) : null)) {
            P2PFilterDialog.P2PFilterData p2PFilterData2 = this.f39983Y;
            if (!C27025c.m66566d(p2PFilterData2 != null ? Boolean.valueOf(p2PFilterData2.getSwitchTradableEnabled()) : null)) {
                P2PFilterDialog.P2PFilterData p2PFilterData3 = this.f39983Y;
                if (!Intrinsics.areEqual(p2PFilterData3 != null ? p2PFilterData3.getSortCode() : null, "DEAL_ORDER")) {
                    P2PFilterDialog.P2PFilterData p2PFilterData4 = this.f39983Y;
                    if (!Intrinsics.areEqual(p2PFilterData4 != null ? p2PFilterData4.getSortCode() : null, "SUCC_RATE")) {
                        ImageView imageView = this.f39989e0;
                        if (imageView != null) {
                            imageView.setColorFilter(ContextCompat.getColor(this.mContext, R$color.c_text), PorterDuff.Mode.SRC_IN);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        ImageView imageView2 = this.f39989e0;
        if (imageView2 != null) {
            imageView2.setColorFilter(ContextCompat.getColor(this.mContext, R$color.brandGreen), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.kubi.payment.p2p.trade.ITradeData
    @Nullable
    /* JADX INFO: renamed from: Y1, reason: from getter */
    public P2PFilterDialog.P2PFilterData getF39983Y() {
        return this.f39983Y;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m49131Z3() {
        RotateTextView rotateTextView = this.f39986b0;
        if (rotateTextView != null) {
            rotateTextView.setText(getStringRes(R$string.amount, new Object[0]));
        }
        RotateTextView rotateTextView2 = this.f39986b0;
        if (rotateTextView2 != null) {
            rotateTextView2.setTextColor(getColorRes(R$color.c_text40));
        }
    }

    @Override // com.kubi.payment.p2p.trade.ITradeData
    /* JADX INFO: renamed from: g2 */
    public void mo49133g2(@Nullable P2PFilterDialog.P2PFilterData p2PFilterData) {
        this.f39983Y = p2PFilterData != null ? P2PFilterDialog.P2PFilterData.copy$default(p2PFilterData, false, false, null, false, 15, null) : null;
        m49129U4();
    }

    /* JADX INFO: renamed from: g4 */
    public final P2PCryptoCurrencySelectPopup m49134g4() {
        return (P2PCryptoCurrencySelectPopup) this.f39991g0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.payment_fragment_p2p_trade_market;
    }

    /* JADX INFO: renamed from: h4 */
    public final C38033n m49135h4() {
        return (C38033n) this.f39992h0.getValue();
    }

    /* JADX INFO: renamed from: i4 */
    public final C38037r m49136i4() {
        return (C38037r) this.f39993i0.getValue();
    }

    /* JADX INFO: renamed from: j4 */
    public final void m49137j4() {
        KuCoinLooper.INSTANCE.addTask(new C36993c.b("getUserTradeInfo").m82829i(30L).m82827g(this).m82826f(new Runnable() { // from class: com.kubi.payment.p2p.trade.j
            @Override // java.lang.Runnable
            public final void run() {
                P2PTradeMarketFragment.m49099k4(this.f40075b);
            }
        }).m82828h());
    }

    @Override // com.kubi.payment.p2p.trade.ITradeData
    @NotNull
    /* JADX INFO: renamed from: k1, reason: from getter */
    public String getF39982X() {
        return this.f39982X;
    }

    /* JADX INFO: renamed from: l4 */
    public final C37698v1 m49139l4() {
        return (C37698v1) this.f39994j0.getValue(this, f39979l0[0]);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m49140m4() {
        this.f39985a0 = (RotateTextView) findViewById(R$id.tv_currency_crypto);
        this.f39986b0 = (RotateTextView) findViewById(R$id.tv_filter_amount);
        this.f39987c0 = (RotateTextView) findViewById(R$id.tv_filter_pay_type);
        this.f39988d0 = (TextView) findViewById(R$id.tv_currency_fiat);
        this.f39989e0 = (ImageView) findViewById(R$id.iv_filter);
        this.f39990f0 = findViewById(R$id.view_line);
    }

    @Override // com.kubi.payment.base.BaseFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m49127R4();
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<P2PTradeMarketViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(P2PTradeMarketViewModel.class);
    }

    public P2PTradeMarketFragment() {
        setPageId("B7P2P");
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m49056A4(P2PTradeMarketFragment p2PTradeMarketFragment, Boolean bool) {
        if (bool.booleanValue()) {
            RotateTextView rotateTextView = p2PTradeMarketFragment.f39987c0;
            if (rotateTextView != null) {
                rotateTextView.m49907e();
            }
            p2PTradeMarketFragment.m49136i4().m49376q(p2PTradeMarketFragment.getActivity(), p2PTradeMarketFragment.f39990f0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m49062D4(P2PTradeMarketFragment p2PTradeMarketFragment, List list) {
        p2PTradeMarketFragment.m49120K4(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m49064E4(P2PTradeMarketFragment p2PTradeMarketFragment, TradeInfo tradeInfo) {
        OrderRemindView orderRemindView;
        C37698v1 c37698v1M49139l4 = p2PTradeMarketFragment.m49139l4();
        if (c37698v1M49139l4 != null && (orderRemindView = c37698v1M49139l4.f84766n) != null) {
            Intrinsics.checkNotNull(tradeInfo);
            orderRemindView.m45552s(tradeInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    private final void m49068G4() {
        P2PFilterDialog.P2PFilterData p2PFilterDataCopy$default;
        String str;
        m49124O4();
        P2PFilterDialog.P2PFilterData p2PFilterData = this.f39983Y;
        if (p2PFilterData != null) {
            p2PFilterDataCopy$default = P2PFilterDialog.P2PFilterData.copy$default(p2PFilterData, !this.f39980V, false, null, false, 14, null);
        } else {
            p2PFilterDataCopy$default = null;
        }
        this.f39983Y = p2PFilterDataCopy$default;
        m49123N4();
        m49125P4();
        if (this.f39980V) {
            str = "buy";
        } else {
            str = "sell";
        }
        C43852m.m96591c("B7P2P", str, "1", null, 8, null);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m49074J4(P2PTradeMarketFragment p2PTradeMarketFragment, String str) {
        String stringRes;
        p2PTradeMarketFragment.f39982X = C27041f.m66668h(str);
        RotateTextView rotateTextView = p2PTradeMarketFragment.f39987c0;
        if (rotateTextView != null) {
            if (str != null && str.length() != 0) {
                stringRes = p2PTradeMarketFragment.getStringRes(R$string.payment_method, new Object[0]);
            } else {
                stringRes = "";
            }
            rotateTextView.setText(stringRes);
        }
        p2PTradeMarketFragment.m49123N4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T4 */
    public static final void m49087T4(P2PTradeMarketFragment p2PTradeMarketFragment, BaseViewHolder baseViewHolder, SelectLabel selectLabel) {
        String strM66668h = C27041f.m66668h(selectLabel.getValue());
        if (!Intrinsics.areEqual(((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49325L().getValue(), strM66668h)) {
            ((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49342d0(strM66668h);
        }
        C43852m.m96590b("B7P2P", "fiatSelector", "1", TuplesKt.m90091to("fiat", strM66668h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static final void m49099k4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        ((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49339a0();
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m49101o4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        p2PTradeMarketFragment.m49128S4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public static final Unit m49104r4(P2PTradeMarketFragment p2PTradeMarketFragment) {
        ((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49337X(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public static final Unit m49116y4(P2PTradeMarketFragment p2PTradeMarketFragment, List list) {
        P2PCryptoCurrencySelectPopup p2PCryptoCurrencySelectPopupM49134g4 = p2PTradeMarketFragment.m49134g4();
        String strM66668h = C27041f.m66668h(((P2PTradeMarketViewModel) p2PTradeMarketFragment.m45631m3()).m49323J().getValue());
        Intrinsics.checkNotNull(list);
        p2PCryptoCurrencySelectPopupM49134g4.m49391w(strM66668h, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m49118z4(P2PTradeMarketFragment p2PTradeMarketFragment, List list) {
        C38037r c38037rM49136i4 = p2PTradeMarketFragment.m49136i4();
        Intrinsics.checkNotNull(list);
        c38037rM49136i4.m85915z(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.p2p.trade.ITradeData
    @NotNull
    /* JADX INFO: renamed from: K2 */
    public String mo49119K2() {
        return C27041f.m66668h(((P2PTradeMarketViewModel) m45631m3()).m49325L().getValue());
    }

    /* JADX INFO: renamed from: K4 */
    public final void m49120K4(List<BannerInfo.Banner> list) {
        C37698v1 c37698v1M49139l4 = m49139l4();
        if (c37698v1M49139l4 == null) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            CardView cardView = c37698v1M49139l4.f84755c;
            Intrinsics.checkNotNullExpressionValue(cardView, "cardView");
            C27046k.m66685H(cardView);
        } else {
            CardView cardView2 = c37698v1M49139l4.f84755c;
            Intrinsics.checkNotNullExpressionValue(cardView2, "cardView");
            C27046k.m66700o(cardView2);
        }
        BGABanner bGABanner = c37698v1M49139l4.f84754b;
        bGABanner.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.payment.p2p.trade.p
            @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
            /* JADX INFO: renamed from: a */
            public final void mo17775a(BGABanner bGABanner2, View view, Object obj, int i11) {
                P2PTradeMarketFragment.m49077L4(this.f40095a, bGABanner2, (ConstraintLayout) view, (BannerInfo.Banner) obj, i11);
            }
        });
        boolean z11 = true;
        if (C27024b.m66560c(list).size() <= 1) {
            z11 = false;
        }
        bGABanner.setAutoPlayAble(z11);
        bGABanner.setData(R$layout.payment_item_banner, list, (List<String>) null);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: N4 */
    public final void m49123N4() {
        if (mo49119K2().length() == 0 || mo49132e1().length() == 0) {
            return;
        }
        P2PTradeMarketListFragment p2PTradeMarketListFragment = this.f39984Z;
        if (p2PTradeMarketListFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("marketListFragment");
            p2PTradeMarketListFragment = null;
        }
        p2PTradeMarketListFragment.mo15906F3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public final void m49128S4() {
        List<TradeCurrencyFiat> listM49326M = ((P2PTradeMarketViewModel) m45631m3()).m49326M();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM49326M, 10));
        for (TradeCurrencyFiat tradeCurrencyFiat : listM49326M) {
            arrayList.add(new SelectLabel(C27041f.m66668h(tradeCurrencyFiat.getTypeCode()), C27041f.m66668h(tradeCurrencyFiat.getIcon()), Boolean.valueOf(Intrinsics.areEqual(tradeCurrencyFiat.getTypeCode(), ((P2PTradeMarketViewModel) m45631m3()).m49325L().getValue())), null, 8, null));
        }
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity != null && activity.isFinishing()) {
                return;
            }
            FragmentActivity activity2 = getActivity();
            if ((activity2 == null || !activity2.isDestroyed()) && !isRemoving()) {
                DialogFragmentHelper dialogFragmentHelperNewInstance$default = SelectLabelDialogView.Companion.newInstance$default(SelectLabelDialogView.f38176v0, arrayList, new BiConsumer() { // from class: com.kubi.payment.p2p.trade.e0
                    @Override // io.reactivex.functions.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        P2PTradeMarketFragment.m49087T4(this.f40054b, (BaseViewHolder) obj, (SelectLabel) obj2);
                    }
                }, null, 4, null);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                dialogFragmentHelperNewInstance$default.show(childFragmentManager, "currencyFiatDialog");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.p2p.trade.ITradeData
    @NotNull
    /* JADX INFO: renamed from: e1 */
    public String mo49132e1() {
        return C27041f.m66668h(((P2PTradeMarketViewModel) m45631m3()).m49323J().getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        P2PTradeMarketListFragment p2PTradeMarketListFragment;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        m49140m4();
        P2PTradeMarketListFragment p2PTradeMarketListFragment2 = new P2PTradeMarketListFragment();
        this.f39984Z = p2PTradeMarketListFragment2;
        p2PTradeMarketListFragment2.m49251J5(this);
        int i11 = R$id.fragment_trade_list;
        P2PTradeMarketListFragment p2PTradeMarketListFragment3 = this.f39984Z;
        String strM56285z = null;
        if (p2PTradeMarketListFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("marketListFragment");
            p2PTradeMarketListFragment = null;
        } else {
            p2PTradeMarketListFragment = p2PTradeMarketListFragment3;
        }
        C27032f.m66625p(this, i11, p2PTradeMarketListFragment, null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56285z = RouteExKt.m56285z(arguments, "key_side", "BUY");
        }
        this.f39980V = Intrinsics.areEqual(strM56285z, "BUY");
        this.f39983Y = new P2PFilterDialog.P2PFilterData(!this.f39980V, false, null, false, 14, null);
        C37698v1 c37698v1M49139l4 = m49139l4();
        if (c37698v1M49139l4 != null && (appCompatTextView2 = c37698v1M49139l4.f84759g) != null) {
            C27046k.m66711z(appCompatTextView2, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketFragment.m49108u4(this.f40081b);
                }
            }, 1, null);
        }
        C37698v1 c37698v1M49139l5 = m49139l4();
        if (c37698v1M49139l5 != null && (appCompatTextView = c37698v1M49139l5.f84764l) != null) {
            C27046k.m66711z(appCompatTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.trade.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PTradeMarketFragment.m49110v4(this.f40085b);
                }
            }, 1, null);
        }
        m49068G4();
        m49100n4();
        ((P2PTradeMarketViewModel) m45631m3()).m49333T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((P2PTradeMarketViewModel) m45631m3()).m49325L().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49112w4(this.f40114b, (String) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49323J().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49114x4(this.f40058b, (String) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49324K().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49116y4(this.f40073b, (List) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49329P().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49118z4(this.f40074b, (List) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49330Q().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49056A4(this.f40076b, (Boolean) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49327N().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49058B4(this.f40082b, (List) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49321H().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49062D4(this.f40086b, (List) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49331R().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49064E4(this.f40089b, (TradeInfo) obj);
            }
        }));
        ((P2PTradeMarketViewModel) m45631m3()).m49328O().observe(getViewLifecycleOwner(), new C21240a(new Function1() { // from class: com.kubi.payment.p2p.trade.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PTradeMarketFragment.m49066F4(this.f40091b, (Boolean) obj);
            }
        }));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C43841b.m96557d("B7p2p_load", "page_load_start", null, 4, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m49136i4().m49369i();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (OtcDepend.f38138a.m45466o()) {
            OtcUserManager.m45480l(OtcUserManager.f38144a, null, 1, null);
            m49137j4();
        }
    }

    @Override // com.kubi.payment.p2p.trade.ITradeData
    /* JADX INFO: renamed from: s2 */
    public void mo49141s2(boolean z11) {
        OrderRemindView orderRemindView;
        C37698v1 c37698v1M49139l4 = m49139l4();
        if (c37698v1M49139l4 != null && (orderRemindView = c37698v1M49139l4.f84766n) != null) {
            orderRemindView.m45550E(z11);
        }
    }
}
