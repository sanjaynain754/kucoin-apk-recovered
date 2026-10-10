package com.kubi.futures.trade.book;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.C4619k;
import bi.C4620l;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.dialog.FundingRateDialog;
import com.kubi.futures.trade.C14448y0;
import com.kubi.futures.trade.FuturesTradeViewModel;
import com.kubi.futures.trade.submit.panel.tradeType.y2;
import com.kubi.futures.trade.submit.panel.tradeType.z2;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$array;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.kumex.view.SubmitStubView;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.OrderBookType;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36766g2;
import fm.C37569d;
import gf.C37878b0;
import im.DisplayBook;
import im.DisplayBookItem;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import ki.C41050b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38214b;
import p314hi.C38219g;
import p314hi.InterfaceC38213a;
import p314hi.InterfaceC38217e;
import p314hi.InterfaceC38218f;
import p314hi.InterfaceC38220h;
import p343ii.C38649e;
import p429lf.C42180b;
import p569qq.C43852m;
import p801yl.C46527h0;
import p836zl.C46894j;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import t30.C44685e;
import w00.C45681e;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: FuturesBookFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00101\u001a\u0004\u0018\u000102J\b\u00103\u001a\u00020/H\u0002J\u0010\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020%H\u0002J\b\u00106\u001a\u00020/H\u0002J\u0010\u00107\u001a\u00020/2\u0006\u00108\u001a\u000209H\u0002J\u0018\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u0010\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020!H\u0002J\u0010\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020/2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020MH\u0002J(\u0010N\u001a\u00020/2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010PH\u0002J\u0012\u0010S\u001a\u00020/2\b\u0010T\u001a\u0004\u0018\u00010UH\u0002J\b\u0010V\u001a\u00020/H\u0002J\u0010\u0010W\u001a\u00020/2\u0006\u0010X\u001a\u00020\u0005H\u0002J\u0010\u0010Y\u001a\u00020<2\u0006\u0010Z\u001a\u00020GH\u0002J\b\u0010[\u001a\u00020/H\u0002J\u0017\u0010\\\u001a\u00020/2\b\u0010]\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010^J\u0012\u0010_\u001a\u00020/2\b\b\u0002\u0010`\u001a\u00020\u0005H\u0002J\u001c\u0010a\u001a\u00020/2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020d0cH\u0002J\u001b\u0010e\u001a\u0004\u0018\u00010f2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020/H\u0016J\b\u0010j\u001a\u00020/H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010#\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006k"}, m90084d2 = {"Lcom/kubi/futures/trade/book/FuturesBookFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesBookBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesBookBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/book/FuturesBookViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/book/FuturesBookViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "tradeViewModel", "Lcom/kubi/futures/trade/FuturesTradeViewModel;", "getTradeViewModel", "()Lcom/kubi/futures/trade/FuturesTradeViewModel;", "tradeViewModel$delegate", "futuresPanelViewModel", "Lcom/kubi/futures/trade/submit/panel/tradeType/FuturesPanelStreamViewModel;", "getFuturesPanelViewModel", "()Lcom/kubi/futures/trade/submit/panel/tradeType/FuturesPanelStreamViewModel;", "futuresPanelViewModel$delegate", "lastSettleTime", "", "Ljava/lang/Integer;", "bookItemCount", "orderBookType", "Lcom/kubi/resources/widget/OrderBookType;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getBookEntity", "Lcom/kubi/kumex/logic/book/BookEntity;", "initView", "onBookTypeChanged", "type", "showBookPrecisionDialog", "onBookPrecisionChanged", "text", "", "sendEvent", "side", "", "item", "Lcom/kubi/kumex/logic/book/DisplayBookItem;", "initObserver", "onBookItemCountChanged", "num", "onBookChanged", "it", "Lcom/kubi/kumex/logic/book/DisplayBook;", "onContractChanged", "contractConfig", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "onTickerChanged", "ticker", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "onPriceChanged", FirebaseAnalytics.Param.PRICE, "Lcom/kubi/kumex/data/market/model/PriceEntity;", "setBottomRate", "bids", "", "", "asks", "onPreferencesChanged", "settings", "Lcom/kubi/futures/trade/config/IFuturesPreferencesSetting;", "handleAmountUnit", "setAmountUnit", "isTotal", "getQtyUnit", "contract", "setAllPriceStub", "onFundingChange", "settleTime", "(Ljava/lang/Integer;)V", "handleFundingRate", "forceHide", "onSettleContractChanged", "pair", "Lkotlin/Pair;", "", "getBookDepthTickSize", "Ljava/math/BigDecimal;", "precision", "(Ljava/lang/Integer;)Ljava/math/BigDecimal;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesBookFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesBookFragment.kt\ncom/kubi/futures/trade/book/FuturesBookFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,676:1\n143#2,20:677\n106#3,15:697\n32#4:712\n67#4:713\n67#4:721\n23#4,2:722\n58#4,2:724\n76#5,7:714\n*S KotlinDebug\n*F\n+ 1 FuturesBookFragment.kt\ncom/kubi/futures/trade/book/FuturesBookFragment\n*L\n91#1:677,20\n92#1:697,15\n197#1:712\n254#1:713\n662#1:721\n191#1:722,2\n274#1:724,2\n339#1:714,7\n*E\n"})
public final class FuturesBookFragment extends BaseFragment {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f23648c0 = {Reflection.property1(new PropertyReference1Impl(FuturesBookFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesBookBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public boolean f23649U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f23650V = C45681e.m100799e(this, new Function1<FuturesBookFragment, C36766g2>() { // from class: com.kubi.futures.trade.book.FuturesBookFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36766g2 invoke(@NotNull FuturesBookFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36766g2.m82386a(fragment.requireView());
        }
    }, new Function1<C36766g2, Unit>() { // from class: com.kubi.futures.trade.book.FuturesBookFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36766g2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36766g2 c36766g2) {
            invoke(c36766g2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f23651W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f23652X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f23653Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public Integer f23654Z;

    /* JADX INFO: renamed from: a0 */
    public int f23655a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public OrderBookType f23656b0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.book.FuturesBookFragment$a */
    /* JADX INFO: compiled from: FuturesBookFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13624a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23657b;

        public C13624a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23657b = function;
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
            return this.f23657b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23657b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ BigDecimal m26750L3(FuturesBookFragment futuresBookFragment, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return futuresBookFragment.m26800K3(num);
    }

    /* JADX INFO: renamed from: O3 */
    private final FuturesTradeViewModel m26751O3() {
        return (FuturesTradeViewModel) this.f23652X.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m26752S3(FuturesBookFragment futuresBookFragment, int i11, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<unused var>");
        C37878b0.f85252a.m85543x(i11);
        futuresBookFragment.m26797D4(i11 == 0);
        futuresBookFragment.m26804Q3().m26906F0(futuresBookFragment.m26751O3().m26687Y0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m26754V3(FuturesBookFragment futuresBookFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        futuresBookFragment.m26806U3(z11);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m26758Z3(FuturesBookFragment futuresBookFragment, InterfaceC38220h interfaceC38220h) {
        futuresBookFragment.m26797D4(C37878b0.f85252a.m85530k() == 0);
        futuresBookFragment.m26804Q3().m26906F0(futuresBookFragment.m26751O3().m26687Y0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m26763e4(FuturesBookFragment futuresBookFragment, FundingRateEntity fundingRateEntity) {
        futuresBookFragment.m26811w4(futuresBookFragment.f23654Z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m26767i4(FuturesBookFragment futuresBookFragment, OrderBookType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        futuresBookFragment.m26810u4(it);
        C46392a.m102333p(C46894j.f104736a.m103279r(), OrderBookType.f43982a.asString(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m26771k4(FuturesBookFragment futuresBookFragment) {
        ISpotService iSpotService = ISpotService.f49646a.get();
        FragmentManager childFragmentManager = futuresBookFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iSpotService.mo60006s(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m26775m4(FuturesBookFragment futuresBookFragment) {
        if (com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I())) {
            return Unit.INSTANCE;
        }
        PriceEntity value = futuresBookFragment.m26804Q3().m26917m0().getValue();
        InterfaceC38213a value2 = futuresBookFragment.m26751O3().m26686X0().getValue();
        int iM66650j = C27039d.m66650j(value2 != null ? Integer.valueOf(C38214b.m86252a(value2)) : null);
        FragmentManager childFragmentManager = futuresBookFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C15943u.m33678U(value, iM66650j, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m26777n4(FuturesBookFragment futuresBookFragment, int i11, DisplayBookItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        futuresBookFragment.m26795B4("sell", item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m26779o4(FuturesBookFragment futuresBookFragment, int i11, DisplayBookItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        futuresBookFragment.m26795B4("buy", item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m26781p4(C36766g2 c36766g2) {
        CharSequence text = c36766g2.f80125j.getText();
        String string = text != null ? text.toString() : null;
        String name = C4620l.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12572a.m23695d(name, new C4620l(null, true, C27039d.m66656p(string != null ? C42180b.m92637b(string, null, 1, null) : null), 1, null), 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m26783q4(FuturesBookFragment futuresBookFragment) {
        if (com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I())) {
            return Unit.INSTANCE;
        }
        C43852m.m96591c(C17060n0.m36552b(), "FundingTips", null, null, 12, null);
        FundingRateEntity value = futuresBookFragment.m26804Q3().m26914i0().getValue();
        FundingRateDialog.Companion companion = FundingRateDialog.f22763w0;
        FragmentManager childFragmentManager = futuresBookFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        y2 y2VarM26802N3 = futuresBookFragment.m26802N3();
        InterfaceC38213a interfaceC38213aM26687Y0 = futuresBookFragment.m26751O3().m26687Y0();
        companion.show(childFragmentManager, value, y2VarM26802N3.f0(interfaceC38213aM26687Y0 != null ? interfaceC38213aM26687Y0.getSymbol() : null), futuresBookFragment.m26802N3().k0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m26795B4(String str, DisplayBookItem displayBookItem) {
        String name = C4620l.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String displayPrice = displayBookItem.getDisplayPrice();
        C12572a.m23695d(name, new C4620l(str, false, C27039d.m66656p(displayPrice != null ? C42180b.m92637b(displayPrice, null, 1, null) : null), 2, null), 0L, 4, null);
    }

    /* JADX INFO: renamed from: N3 */
    public final y2 m26802N3() {
        return (y2) this.f23653Y.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    public final C36766g2 m26803P3() {
        return (C36766g2) this.f23650V.getValue(this, f23648c0[0]);
    }

    /* JADX INFO: renamed from: Q3 */
    public final FuturesBookViewModel m26804Q3() {
        return (FuturesBookViewModel) this.f23651W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF23649U() {
        return this.f23649U;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ConstraintLayout root = C36766g2.m82387c(inflater, container, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m26755W3();
        C44685e.m98846e(view, null, 1, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f23649U = z11;
    }

    /* JADX INFO: renamed from: w4 */
    public final void m26811w4(Integer num) {
        BaseTextView baseTextView;
        if (com.kubi.futures.trade.submit.panel.premarket.g.a.o(C46527h0.f104291a.m102673I())) {
            C36766g2 c36766g2M26803P3 = m26803P3();
            if (c36766g2M26803P3 == null || (baseTextView = c36766g2M26803P3.f80123h) == null) {
                return;
            }
            baseTextView.setText("--/--");
            return;
        }
        this.f23654Z = num;
        FundingRateEntity value = m26804Q3().m26914i0().getValue();
        C27096v0 c27096v0 = new C27096v0();
        BigDecimal lastFundingRate = value != null ? value.getLastFundingRate() : null;
        if (lastFundingRate == null) {
            c27096v0.m66905e(getStringRes(R$string.stub, new Object[0]), getColorRes(R$color.c_text30));
        } else {
            String strM92642g = C42180b.m92642g(lastFundingRate, null, null, 4, false, false, true, 19, null);
            Context context = getContext();
            c27096v0.m66905e(strM92642g, context != null ? C22890g.m54279d(context, lastFundingRate.doubleValue(), 0, 2, null) : getColorRes(R$color.c_text30));
        }
        int i11 = R$color.c_text;
        c27096v0.m66905e(" / ", getColorRes(i11));
        if (num == null) {
            c27096v0.m66905e(getStringRes(R$string.stub, new Object[0]), getColorRes(R$color.c_text30));
        } else {
            c27096v0.m66905e(TimeUtils.m66432s(num.intValue()), getColorRes(i11));
        }
        C36766g2 c36766g2M26803P4 = m26803P3();
        if (c36766g2M26803P4 != null) {
            c36766g2M26803P4.f80123h.setText(c27096v0);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m26812x4(InterfaceC38217e interfaceC38217e) {
        if (interfaceC38217e == null) {
            return;
        }
        m26754V3(this, false, 1, null);
    }

    public FuturesBookFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.book.FuturesBookFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.book.FuturesBookFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f23651W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuturesBookViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.book.FuturesBookFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.book.FuturesBookFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.book.FuturesBookFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f23652X = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.book.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26747H4(this.f23683b);
            }
        });
        this.f23653Y = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.book.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26749J3(this.f23689b);
            }
        });
        this.f23655a0 = 6;
        this.f23656b0 = OrderBookType.C22935a.f43984b;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m26745G4(List list, InterfaceC38213a interfaceC38213a, FuturesBookFragment futuresBookFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < list.size()) {
            C46392a.m102329l(C46894j.f104736a.m103269g(interfaceC38213a.getSymbol()), DowngradeExKt.m66542l(interfaceC24339a.getValue(), 0));
            futuresBookFragment.m26809t4(interfaceC24339a.getLabel());
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static final FuturesTradeViewModel m26747H4(FuturesBookFragment futuresBookFragment) {
        return C14448y0.m28812a(futuresBookFragment);
    }

    /* JADX INFO: renamed from: J3 */
    public static final y2 m26749J3(FuturesBookFragment futuresBookFragment) {
        return z2.a(futuresBookFragment);
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m26753T3(FuturesBookFragment futuresBookFragment, DialogInterface dialogInterface) {
        AnimateDrawableEndView animateDrawableEndView;
        C36766g2 c36766g2M26803P3 = futuresBookFragment.m26803P3();
        if (c36766g2M26803P3 != null && (animateDrawableEndView = c36766g2M26803P3.f80117b) != null) {
            animateDrawableEndView.m28819j();
        }
    }

    /* JADX INFO: renamed from: W3 */
    private final void m26755W3() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m26751O3().m26686X0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26756X3(this.f23692b, (InterfaceC38213a) obj);
            }
        }));
        m26751O3().m26696h1().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26757Y3(this.f23698b, (InterfaceC38217e) obj);
            }
        }));
        m26751O3().m26702n1().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26758Z3(this.f23700b, (InterfaceC38220h) obj);
            }
        }));
        m26804Q3().m26916l0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26759a4(this.f23703b, (DisplayBook) obj);
            }
        }));
        m26804Q3().m26918n0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26760b4(this.f23705b, (TickerEntity) obj);
            }
        }));
        m26804Q3().m26917m0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26761c4(this.f23708b, (PriceEntity) obj);
            }
        }));
        m26751O3().m26685W0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26762d4(this.f23710b, (Integer) obj);
            }
        }));
        m26804Q3().m26914i0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26763e4(this.f23712b, (FundingRateEntity) obj);
            }
        }));
        m26751O3().m26701m1().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26764f4(this.f23717b, (Pair) obj);
            }
        }));
        String name = C4619k.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C12573b.f21598a.m23696a()) {
            name.length();
        }
        C12572a.m23692a(this, false, new C13625xe1f5fff(name, null, this));
        m26804Q3().m26911g0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26765g4(this.f23720b, (Pair) obj);
            }
        }));
        m26804Q3().m26915j0().observe(viewLifecycleOwner, new C13624a(new Function1() { // from class: com.kubi.futures.trade.book.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26766h4(this.f23695b, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m26756X3(FuturesBookFragment futuresBookFragment, InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNull(interfaceC38213a);
        futuresBookFragment.m26789v4(interfaceC38213a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m26757Y3(FuturesBookFragment futuresBookFragment, InterfaceC38217e interfaceC38217e) {
        futuresBookFragment.m26812x4(interfaceC38217e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m26759a4(FuturesBookFragment futuresBookFragment, DisplayBook displayBook) {
        Intrinsics.checkNotNull(displayBook);
        futuresBookFragment.m26807r4(displayBook);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m26760b4(FuturesBookFragment futuresBookFragment, TickerEntity tickerEntity) {
        Intrinsics.checkNotNull(tickerEntity);
        futuresBookFragment.m26794A4(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m26761c4(FuturesBookFragment futuresBookFragment, PriceEntity priceEntity) {
        Intrinsics.checkNotNull(priceEntity);
        futuresBookFragment.m26813y4(priceEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m26762d4(FuturesBookFragment futuresBookFragment, Integer num) {
        Intrinsics.checkNotNull(num);
        futuresBookFragment.m26808s4(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m26764f4(FuturesBookFragment futuresBookFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        futuresBookFragment.m26814z4(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m26765g4(FuturesBookFragment futuresBookFragment, Pair pair) {
        InterfaceC38218f c38649e;
        InterfaceC38218f interfaceC38218fM26699k1 = futuresBookFragment.m26751O3().m26699k1();
        if (interfaceC38218fM26699k1 == null) {
            c38649e = new C38649e(null, null, null, null, null, null, null, 127, null);
        } else {
            c38649e = interfaceC38218fM26699k1;
        }
        futuresBookFragment.m26751O3().m26698j1().postValue(InterfaceC38218f.m86274f(c38649e, (BigDecimal) ((Pair) pair.getFirst()).getFirst(), (BigDecimal) ((Pair) pair.getFirst()).getSecond(), (BigDecimal) ((Pair) pair.getSecond()).getFirst(), (BigDecimal) ((Pair) pair.getSecond()).getSecond(), null, null, null, 112, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m26766h4(FuturesBookFragment futuresBookFragment, Long l11) {
        futuresBookFragment.m26811w4(Integer.valueOf((int) l11.longValue()));
        return Unit.INSTANCE;
    }

    private final void initView() {
        final C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        Context context = c36766g2M26803P3.f80119d.getContext();
        AnimateDrawableEndView amountUnit = c36766g2M26803P3.f80117b;
        Intrinsics.checkNotNullExpressionValue(amountUnit, "amountUnit");
        C27046k.m66711z(amountUnit, 0L, new Function0() { // from class: com.kubi.futures.trade.book.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26773l4(this.f23687b);
            }
        }, 1, null);
        LinearLayout llMarkPrice = c36766g2M26803P3.f80126k;
        Intrinsics.checkNotNullExpressionValue(llMarkPrice, "llMarkPrice");
        C27046k.m66711z(llMarkPrice, 0L, new Function0() { // from class: com.kubi.futures.trade.book.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26775m4(this.f23715b);
            }
        }, 1, null);
        m26812x4(m26751O3().m26697i1());
        c36766g2M26803P3.f80130o.setHasFixedSize(true);
        RecyclerView sellList = c36766g2M26803P3.f80130o;
        Intrinsics.checkNotNullExpressionValue(sellList, "sellList");
        ViewExKt.m36476b(sellList);
        c36766g2M26803P3.f80130o.setLayoutManager(new LinearLayoutManager(context, 1, true));
        RecyclerView recyclerView = c36766g2M26803P3.f80130o;
        BookAdapter bookAdapter = new BookAdapter("sell");
        bookAdapter.m26929l(new Function2() { // from class: com.kubi.futures.trade.book.u
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FuturesBookFragment.m26777n4(this.f23730b, ((Integer) obj).intValue(), (DisplayBookItem) obj2);
            }
        });
        recyclerView.setAdapter(bookAdapter);
        c36766g2M26803P3.f80119d.setHasFixedSize(true);
        RecyclerView buyList = c36766g2M26803P3.f80119d;
        Intrinsics.checkNotNullExpressionValue(buyList, "buyList");
        ViewExKt.m36476b(buyList);
        c36766g2M26803P3.f80119d.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView2 = c36766g2M26803P3.f80119d;
        BookAdapter bookAdapter2 = new BookAdapter("buy");
        bookAdapter2.m26929l(new Function2() { // from class: com.kubi.futures.trade.book.v
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FuturesBookFragment.m26779o4(this.f23732b, ((Integer) obj).intValue(), (DisplayBookItem) obj2);
            }
        });
        recyclerView2.setAdapter(bookAdapter2);
        AutoTextView lastPrice = c36766g2M26803P3.f80125j;
        Intrinsics.checkNotNullExpressionValue(lastPrice, "lastPrice");
        C27046k.m66711z(lastPrice, 0L, new Function0() { // from class: com.kubi.futures.trade.book.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26781p4(c36766g2M26803P3);
            }
        }, 1, null);
        c36766g2M26803P3.f80122g.setNeedDash(true);
        c36766g2M26803P3.f80122g.setText(getStringRes(R$string.bkumex_funding, new Object[0]) + " / " + getStringRes(R$string.bkumex_countdown, new Object[0]));
        DashTextView fundingLabel = c36766g2M26803P3.f80122g;
        Intrinsics.checkNotNullExpressionValue(fundingLabel, "fundingLabel");
        C27046k.m66711z(fundingLabel, 0L, new Function0() { // from class: com.kubi.futures.trade.book.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26783q4(this.f23735b);
            }
        }, 1, null);
        c36766g2M26803P3.f80124i.setTypeChangeListener(new Function1() { // from class: com.kubi.futures.trade.book.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesBookFragment.m26767i4(this.f23737b, (OrderBookType) obj);
            }
        });
        AnimateDrawableEndView tickSize = c36766g2M26803P3.f80133r;
        Intrinsics.checkNotNullExpressionValue(tickSize, "tickSize");
        C27046k.m66711z(tickSize, 0L, new Function0() { // from class: com.kubi.futures.trade.book.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26769j4(this.f23739b);
            }
        }, 1, null);
        StorageId<String> storageIdM103279r = C46894j.f104736a.m103279r();
        OrderBookType.Companion companion = OrderBookType.f43982a;
        c36766g2M26803P3.f80124i.setType(companion.asType(C46392a.m102326h(storageIdM103279r, companion.asString(OrderBookType.C22935a.f43984b))));
        m26796C4();
        BuySellRatioView buySellRatioView = c36766g2M26803P3.f80120e;
        Intrinsics.checkNotNullExpressionValue(buySellRatioView, "buySellRatioView");
        C27046k.m66711z(buySellRatioView, 0L, new Function0() { // from class: com.kubi.futures.trade.book.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBookFragment.m26771k4(this.f23677b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m26769j4(FuturesBookFragment futuresBookFragment) {
        futuresBookFragment.m26799F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m26773l4(FuturesBookFragment futuresBookFragment) {
        futuresBookFragment.m26805R3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    private final void m26789v4(InterfaceC38213a interfaceC38213a) {
        String strM84684y;
        BookAdapter bookAdapter;
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        AnimateDrawableEndView animateDrawableEndView = c36766g2M26803P3.f80133r;
        BookAdapter bookAdapter2 = null;
        boolean z11 = true;
        BigDecimal bigDecimalM26750L3 = m26750L3(this, null, 1, null);
        if (bigDecimalM26750L3 == null || (strM84684y = C42180b.m92640e(bigDecimalM26750L3, null, 20, false, false, false, 0, null, 125, null)) == null) {
            strM84684y = C37569d.m84684y();
        }
        animateDrawableEndView.setText(strM84684y);
        m26751O3().m26698j1().postValue(C38219g.m86283a(m26751O3().m26699k1()).mo86275a(null, null, null, null, null, null, null));
        m26804Q3().m26902A0(interfaceC38213a);
        m26804Q3().m26906F0(interfaceC38213a);
        c36766g2M26803P3.f80129n.setText(getStringRes(R$string.price, new Object[0]) + "\n(" + C27041f.m66668h(interfaceC38213a.mo86239j()) + ')');
        if (C37878b0.f85252a.m85530k() != 0) {
            z11 = false;
        }
        m26797D4(z11);
        int iM86254c = C38214b.m86254c(interfaceC38213a);
        RecyclerView.Adapter adapter = c36766g2M26803P3.f80119d.getAdapter();
        if (adapter instanceof BookAdapter) {
            bookAdapter = (BookAdapter) adapter;
        } else {
            bookAdapter = null;
        }
        if (bookAdapter != null) {
            bookAdapter.m26930m(iM86254c);
        }
        RecyclerView.Adapter adapter2 = c36766g2M26803P3.f80130o.getAdapter();
        if (adapter2 instanceof BookAdapter) {
            bookAdapter2 = (BookAdapter) adapter2;
        }
        if (bookAdapter2 != null) {
            bookAdapter2.m26930m(iM86254c);
        }
        m26796C4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m26794A4(TickerEntity tickerEntity) {
        String symbol;
        C36766g2 c36766g2M26803P3;
        InterfaceC38213a interfaceC38213aM26687Y0 = m26751O3().m26687Y0();
        String strM92640e = null;
        Integer numValueOf = null;
        if (interfaceC38213aM26687Y0 != null) {
            symbol = interfaceC38213aM26687Y0.getSymbol();
        } else {
            symbol = null;
        }
        if ((symbol != null && !Intrinsics.areEqual(symbol, C27041f.m66668h(tickerEntity.getSymbol()))) || (c36766g2M26803P3 = m26803P3()) == null) {
            return;
        }
        m26751O3().m26698j1().postValue(InterfaceC38218f.m86274f(C38219g.m86283a(m26751O3().m26699k1()), tickerEntity.getBestBidPrice(), tickerEntity.getBestAskPrice(), null, null, null, tickerEntity.getPrice(), null, 92, null));
        InterfaceC38213a interfaceC38213aM26687Y1 = m26751O3().m26687Y0();
        AutoTextView autoTextView = c36766g2M26803P3.f80125j;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        autoTextView.setTextColor(C22890g.m54282g(contextRequireContext, C27039d.m66656p(tickerEntity.getPriceChgPct()), 0, 2, null));
        AutoTextView autoTextView2 = c36766g2M26803P3.f80125j;
        BigDecimal price = tickerEntity.getPrice();
        if (price != null) {
            if (interfaceC38213aM26687Y1 != null) {
                numValueOf = Integer.valueOf(C38214b.m86254c(interfaceC38213aM26687Y1));
            }
            strM92640e = C42180b.m92640e(price, null, C27039d.m66650j(numValueOf), true, false, true, 0, null, 105, null);
        }
        autoTextView2.setText(C27041f.m66669i(strM92640e, C37569d.m84684y()));
    }

    /* JADX INFO: renamed from: C4 */
    public final void m26796C4() {
        int i11;
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        OrderBookType orderBookType = this.f23656b0;
        OrderBookType.C22935a c22935a = OrderBookType.C22935a.f43984b;
        if (Intrinsics.areEqual(orderBookType, c22935a)) {
            i11 = this.f23655a0;
        } else {
            i11 = this.f23655a0 * 2;
        }
        if (Intrinsics.areEqual(this.f23656b0, c22935a) || Intrinsics.areEqual(this.f23656b0, OrderBookType.C22936b.f43985b)) {
            c36766g2M26803P3.f80121f.m36713a(i11);
            SubmitStubView buyStub = c36766g2M26803P3.f80121f;
            Intrinsics.checkNotNullExpressionValue(buyStub, "buyStub");
            ViewExtKt.m66594y(buyStub);
            RecyclerView buyList = c36766g2M26803P3.f80119d;
            Intrinsics.checkNotNullExpressionValue(buyList, "buyList");
            C27046k.m66703r(buyList);
        }
        if (Intrinsics.areEqual(this.f23656b0, c22935a) || Intrinsics.areEqual(this.f23656b0, OrderBookType.C22937c.f43986b)) {
            c36766g2M26803P3.f80131p.m36713a(i11);
            SubmitStubView sellStub = c36766g2M26803P3.f80131p;
            Intrinsics.checkNotNullExpressionValue(sellStub, "sellStub");
            ViewExtKt.m66594y(sellStub);
            RecyclerView sellList = c36766g2M26803P3.f80130o;
            Intrinsics.checkNotNullExpressionValue(sellList, "sellList");
            C27046k.m66703r(sellList);
        }
        c36766g2M26803P3.f80125j.setText(strM66516f);
        c36766g2M26803P3.f80128m.setText(strM66516f);
        c36766g2M26803P3.f80123h.setText("--/--");
        c36766g2M26803P3.f80120e.m54455h(null, null);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m26797D4(boolean z11) {
        C36766g2 c36766g2M26803P3;
        AnimateDrawableEndView animateDrawableEndView;
        StringBuilder sb2;
        InterfaceC38213a interfaceC38213aM26687Y0 = m26751O3().m26687Y0();
        if (interfaceC38213aM26687Y0 != null && (c36766g2M26803P3 = m26803P3()) != null && (animateDrawableEndView = c36766g2M26803P3.f80117b) != null) {
            if (z11) {
                sb2 = new StringBuilder();
                sb2.append(getStringRes(R$string.accumulation, new Object[0]));
            } else {
                sb2 = new StringBuilder();
                sb2.append(getStringRes(R$string.qty, new Object[0]));
            }
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append('(' + C41050b.f91264a.m90021d().mo90014h(interfaceC38213aM26687Y0) + ')');
            animateDrawableEndView.setText(sb2);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m26798E4(List<double[]> list, List<double[]> list2) {
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        c36766g2M26803P3.f80120e.m54454g(list, list2);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m26799F4() {
        boolean z11;
        final InterfaceC38213a interfaceC38213aM26687Y0 = m26751O3().m26687Y0();
        if (interfaceC38213aM26687Y0 == null) {
            return;
        }
        int iM102323e = C46392a.m102323e(C46894j.f104736a.m103269g(interfaceC38213aM26687Y0.getSymbol()), 0);
        BigDecimal bigDecimalMo86248s = interfaceC38213aM26687Y0.mo86248s();
        final ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 4; i11++) {
            BigDecimal bigDecimalMultiply = bigDecimalMo86248s.multiply(BigDecimal.TEN.pow(i11));
            Intrinsics.checkNotNull(bigDecimalMultiply);
            String strM92640e = C42180b.m92640e(bigDecimalMultiply, null, 20, false, false, false, 0, null, 125, null);
            if (iM102323e == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList.add(new SelectEntity(null, strM92640e, String.valueOf(i11), null, null, null, null, null, null, false, z11, null, 3065, null));
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.futures.trade.book.r
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                FuturesBookFragment.m26745G4(arrayList, interfaceC38213aM26687Y0, this, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "BookPrecisionDialog");
    }

    /* JADX INFO: renamed from: K3 */
    public final BigDecimal m26800K3(Integer num) {
        int iM102323e;
        InterfaceC38213a interfaceC38213aM26687Y0 = m26751O3().m26687Y0();
        if (interfaceC38213aM26687Y0 == null) {
            return null;
        }
        if (num != null) {
            iM102323e = num.intValue();
        } else {
            iM102323e = C46392a.m102323e(C46894j.f104736a.m103269g(interfaceC38213aM26687Y0.getSymbol()), 0);
        }
        return interfaceC38213aM26687Y0.mo86248s().multiply(BigDecimal.TEN.pow(iM102323e));
    }

    @Nullable
    /* JADX INFO: renamed from: M3 */
    public final BookEntity m26801M3() {
        return m26804Q3().getF23671i0().getF86707d();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m26805R3() {
        AnimateDrawableEndView animateDrawableEndView;
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 != null && (animateDrawableEndView = c36766g2M26803P3.f80117b) != null) {
            animateDrawableEndView.m28819j();
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = C15943u.m33705x(C37878b0.f85252a.m85530k(), ArraysKt.toList(getStringArrayRes(R$array.kucoin_all_or_single)), new Function2() { // from class: com.kubi.futures.trade.book.s
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FuturesBookFragment.m26752S3(this.f23726b, ((Integer) obj).intValue(), (CharSequence) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.futures.trade.book.t
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FuturesBookFragment.m26753T3(this.f23728b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "amount_unit_dialog");
    }

    /* JADX INFO: renamed from: U3 */
    public final void m26806U3(boolean z11) {
        Boolean boolValueOf;
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        InterfaceC38213a interfaceC38213aM26687Y0 = m26751O3().m26687Y0();
        InterfaceC38217e interfaceC38217eM26697i1 = m26751O3().m26697i1();
        if (!z11) {
            Boolean boolValueOf2 = null;
            if (interfaceC38217eM26697i1 != null) {
                boolValueOf = Boolean.valueOf(interfaceC38217eM26697i1.mo86272d());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                if (interfaceC38213aM26687Y0 != null) {
                    boolValueOf2 = Boolean.valueOf(interfaceC38213aM26687Y0.mo86247r());
                }
                if (C27025c.m66566d(boolValueOf2)) {
                    c36766g2M26803P3.f80122g.setEnabled(true);
                    DashTextView fundingLabel = c36766g2M26803P3.f80122g;
                    Intrinsics.checkNotNullExpressionValue(fundingLabel, "fundingLabel");
                    C27046k.m66685H(fundingLabel);
                    BaseTextView fundingValue = c36766g2M26803P3.f80123h;
                    Intrinsics.checkNotNullExpressionValue(fundingValue, "fundingValue");
                    C27046k.m66685H(fundingValue);
                    return;
                }
            }
        }
        c36766g2M26803P3.f80122g.setEnabled(false);
        DashTextView fundingLabel2 = c36766g2M26803P3.f80122g;
        Intrinsics.checkNotNullExpressionValue(fundingLabel2, "fundingLabel");
        ViewExtKt.m66577h(fundingLabel2);
        BaseTextView fundingValue2 = c36766g2M26803P3.f80123h;
        Intrinsics.checkNotNullExpressionValue(fundingValue2, "fundingValue");
        ViewExtKt.m66577h(fundingValue2);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m26804Q3().onHide();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        AnimateDrawableEndView animateDrawableEndView;
        super.onShow();
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 != null && (animateDrawableEndView = c36766g2M26803P3.f80133r) != null) {
            String strM92640e = null;
            BigDecimal bigDecimalM26750L3 = m26750L3(this, null, 1, null);
            if (bigDecimalM26750L3 != null) {
                strM92640e = C42180b.m92640e(bigDecimalM26750L3, null, 20, false, false, false, 0, null, 125, null);
            }
            animateDrawableEndView.setText(strM92640e);
        }
        m26804Q3().onShow();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m26807r4(DisplayBook displayBook) {
        String symbol;
        C36766g2 c36766g2M26803P3;
        InterfaceC38213a interfaceC38213aM26687Y0 = m26751O3().m26687Y0();
        if (interfaceC38213aM26687Y0 != null) {
            symbol = interfaceC38213aM26687Y0.getSymbol();
        } else {
            symbol = null;
        }
        if ((symbol != null && !Intrinsics.areEqual(symbol, C27041f.m66668h(displayBook.getSymbol()))) || (c36766g2M26803P3 = m26803P3()) == null) {
            return;
        }
        OrderBookType orderBookType = this.f23656b0;
        OrderBookType.C22935a c22935a = OrderBookType.C22935a.f43984b;
        if (Intrinsics.areEqual(orderBookType, c22935a) || Intrinsics.areEqual(this.f23656b0, OrderBookType.C22936b.f43985b)) {
            if (displayBook.m87451b().isEmpty()) {
                RecyclerView buyList = c36766g2M26803P3.f80119d;
                Intrinsics.checkNotNullExpressionValue(buyList, "buyList");
                C27046k.m66703r(buyList);
                SubmitStubView buyStub = c36766g2M26803P3.f80121f;
                Intrinsics.checkNotNullExpressionValue(buyStub, "buyStub");
                ViewExtKt.m66594y(buyStub);
            } else {
                RecyclerView.Adapter adapter = c36766g2M26803P3.f80119d.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.book.BookAdapter");
                ((BookAdapter) adapter).m26926h(displayBook.m87451b());
                RecyclerView buyList2 = c36766g2M26803P3.f80119d;
                Intrinsics.checkNotNullExpressionValue(buyList2, "buyList");
                ViewExtKt.m66594y(buyList2);
                SubmitStubView buyStub2 = c36766g2M26803P3.f80121f;
                Intrinsics.checkNotNullExpressionValue(buyStub2, "buyStub");
                C27046k.m66703r(buyStub2);
            }
        }
        if (Intrinsics.areEqual(this.f23656b0, c22935a) || Intrinsics.areEqual(this.f23656b0, OrderBookType.C22937c.f43986b)) {
            if (displayBook.m87450a().isEmpty()) {
                RecyclerView sellList = c36766g2M26803P3.f80130o;
                Intrinsics.checkNotNullExpressionValue(sellList, "sellList");
                C27046k.m66703r(sellList);
                SubmitStubView sellStub = c36766g2M26803P3.f80131p;
                Intrinsics.checkNotNullExpressionValue(sellStub, "sellStub");
                ViewExtKt.m66594y(sellStub);
            } else {
                RecyclerView.Adapter adapter2 = c36766g2M26803P3.f80130o.getAdapter();
                Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.kubi.futures.trade.book.BookAdapter");
                ((BookAdapter) adapter2).m26926h(displayBook.m87450a());
                RecyclerView sellList2 = c36766g2M26803P3.f80130o;
                Intrinsics.checkNotNullExpressionValue(sellList2, "sellList");
                ViewExtKt.m66594y(sellList2);
                SubmitStubView sellStub2 = c36766g2M26803P3.f80131p;
                Intrinsics.checkNotNullExpressionValue(sellStub2, "sellStub");
                C27046k.m66703r(sellStub2);
            }
        }
        m26798E4(displayBook.m87453d(), displayBook.m87452c());
    }

    /* JADX INFO: renamed from: s4 */
    public final void m26808s4(int i11) {
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        int iM66603f = C27029c.m66603f(this, C13635c.m26931a());
        int i12 = this.f23655a0 + i11;
        this.f23655a0 = i12;
        int i13 = iM66603f * i12;
        m26804Q3().getF23671i0().m87444h(i12);
        m26804Q3().m26910f0(null);
        RecyclerView sellList = c36766g2M26803P3.f80130o;
        Intrinsics.checkNotNullExpressionValue(sellList, "sellList");
        ViewExtKt.m66578i(sellList, i13);
        RecyclerView buyList = c36766g2M26803P3.f80119d;
        Intrinsics.checkNotNullExpressionValue(buyList, "buyList");
        ViewExtKt.m66578i(buyList, i13);
        c36766g2M26803P3.f80121f.m36713a(i12);
        c36766g2M26803P3.f80131p.m36713a(i12);
    }

    /* JADX INFO: renamed from: t4 */
    public final void m26809t4(CharSequence charSequence) {
        AnimateDrawableEndView animateDrawableEndView;
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 != null && (animateDrawableEndView = c36766g2M26803P3.f80133r) != null) {
            animateDrawableEndView.setText(charSequence);
        }
        m26804Q3().m26923z0();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m26810u4(OrderBookType orderBookType) {
        int i11;
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        if (Intrinsics.areEqual(orderBookType, OrderBookType.C22935a.f43984b)) {
            i11 = this.f23655a0;
            SubmitStubView buyStub = c36766g2M26803P3.f80121f;
            Intrinsics.checkNotNullExpressionValue(buyStub, "buyStub");
            ViewExtKt.m66594y(buyStub);
            RecyclerView buyList = c36766g2M26803P3.f80119d;
            Intrinsics.checkNotNullExpressionValue(buyList, "buyList");
            ViewExtKt.m66594y(buyList);
            SubmitStubView sellStub = c36766g2M26803P3.f80131p;
            Intrinsics.checkNotNullExpressionValue(sellStub, "sellStub");
            ViewExtKt.m66594y(sellStub);
            RecyclerView sellList = c36766g2M26803P3.f80130o;
            Intrinsics.checkNotNullExpressionValue(sellList, "sellList");
            ViewExtKt.m66594y(sellList);
        } else if (Intrinsics.areEqual(orderBookType, OrderBookType.C22936b.f43985b)) {
            i11 = this.f23655a0 * 2;
            SubmitStubView buyStub2 = c36766g2M26803P3.f80121f;
            Intrinsics.checkNotNullExpressionValue(buyStub2, "buyStub");
            ViewExtKt.m66594y(buyStub2);
            RecyclerView buyList2 = c36766g2M26803P3.f80119d;
            Intrinsics.checkNotNullExpressionValue(buyList2, "buyList");
            ViewExtKt.m66594y(buyList2);
            SubmitStubView sellStub2 = c36766g2M26803P3.f80131p;
            Intrinsics.checkNotNullExpressionValue(sellStub2, "sellStub");
            C27046k.m66700o(sellStub2);
            RecyclerView sellList2 = c36766g2M26803P3.f80130o;
            Intrinsics.checkNotNullExpressionValue(sellList2, "sellList");
            C27046k.m66700o(sellList2);
        } else if (Intrinsics.areEqual(orderBookType, OrderBookType.C22937c.f43986b)) {
            i11 = this.f23655a0 * 2;
            SubmitStubView buyStub3 = c36766g2M26803P3.f80121f;
            Intrinsics.checkNotNullExpressionValue(buyStub3, "buyStub");
            C27046k.m66700o(buyStub3);
            RecyclerView buyList3 = c36766g2M26803P3.f80119d;
            Intrinsics.checkNotNullExpressionValue(buyList3, "buyList");
            C27046k.m66700o(buyList3);
            SubmitStubView sellStub3 = c36766g2M26803P3.f80131p;
            Intrinsics.checkNotNullExpressionValue(sellStub3, "sellStub");
            ViewExtKt.m66594y(sellStub3);
            RecyclerView sellList3 = c36766g2M26803P3.f80130o;
            Intrinsics.checkNotNullExpressionValue(sellList3, "sellList");
            ViewExtKt.m66594y(sellList3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f23656b0 = orderBookType;
        m26804Q3().getF23671i0().m87444h(i11);
        m26804Q3().m26910f0(m26804Q3().getF23669g0());
        int iM66603f = C27029c.m66603f(this, C13635c.m26931a()) * i11;
        RecyclerView sellList4 = c36766g2M26803P3.f80130o;
        Intrinsics.checkNotNullExpressionValue(sellList4, "sellList");
        ViewExtKt.m66578i(sellList4, iM66603f);
        RecyclerView buyList4 = c36766g2M26803P3.f80119d;
        Intrinsics.checkNotNullExpressionValue(buyList4, "buyList");
        ViewExtKt.m66578i(buyList4, iM66603f);
        c36766g2M26803P3.f80121f.m36713a(i11);
        c36766g2M26803P3.f80131p.m36713a(i11);
    }

    /* JADX INFO: renamed from: y4 */
    public final void m26813y4(PriceEntity priceEntity) {
        String symbol;
        String strM92640e;
        View view;
        Integer numValueOf;
        InterfaceC38213a interfaceC38213aM26687Y0 = m26751O3().m26687Y0();
        String strM92640e2 = null;
        Integer numValueOf2 = null;
        if (interfaceC38213aM26687Y0 != null) {
            symbol = interfaceC38213aM26687Y0.getSymbol();
        } else {
            symbol = null;
        }
        if (symbol == null || Intrinsics.areEqual(symbol, C27041f.m66668h(priceEntity.getSymbol()))) {
            m26751O3().m26698j1().postValue(InterfaceC38218f.m86274f(C38219g.m86283a(m26751O3().m26699k1()), null, null, null, null, priceEntity.getMarkPrice(), null, priceEntity.getIndexPrice(), 47, null));
            InterfaceC38213a interfaceC38213aM26687Y1 = m26751O3().m26687Y0();
            C36766g2 c36766g2M26803P3 = m26803P3();
            if (c36766g2M26803P3 != null) {
                DashTextView markPrice = c36766g2M26803P3.f80128m;
                Intrinsics.checkNotNullExpressionValue(markPrice, "markPrice");
                markPrice.setNeedDash(true);
                BigDecimal markPrice2 = priceEntity.getMarkPrice();
                if (markPrice2 != null) {
                    if (interfaceC38213aM26687Y1 != null) {
                        numValueOf = Integer.valueOf(C38214b.m86252a(interfaceC38213aM26687Y1));
                    } else {
                        numValueOf = null;
                    }
                    strM92640e = C42180b.m92640e(markPrice2, null, C27039d.m66650j(numValueOf), true, false, true, 0, null, 105, null);
                } else {
                    strM92640e = null;
                }
                markPrice.setText(C27041f.m66669i(strM92640e, C37569d.m84684y()));
                Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("onFuturesFragmentMarkPriceClick");
                if (fragmentFindFragmentByTag != null && (view = fragmentFindFragmentByTag.getView()) != null) {
                    TextView textView = (TextView) view.findViewById(R$id.tvMarkPrice);
                    if (textView != null) {
                        textView.setText(markPrice.getText());
                    }
                    TextView textView2 = (TextView) view.findViewById(R$id.tvIndexPrice);
                    if (textView2 != null) {
                        BigDecimal indexPrice = priceEntity.getIndexPrice();
                        if (indexPrice != null) {
                            if (interfaceC38213aM26687Y1 != null) {
                                numValueOf2 = Integer.valueOf(C38214b.m86252a(interfaceC38213aM26687Y1));
                            }
                            strM92640e2 = C42180b.m92640e(indexPrice, null, C27039d.m66650j(numValueOf2), true, false, true, 0, null, 105, null);
                        }
                        textView2.setText(C27041f.m66669i(strM92640e2, C37569d.m84684y()));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m26814z4(Pair<Boolean, Long> pair) {
        C36766g2 c36766g2M26803P3 = m26803P3();
        if (c36766g2M26803P3 == null) {
            return;
        }
        if (pair.getFirst().booleanValue()) {
            BaseTextView settleTime = c36766g2M26803P3.f80132q;
            Intrinsics.checkNotNullExpressionValue(settleTime, "settleTime");
            C27046k.m66685H(settleTime);
            c36766g2M26803P3.f80132q.setText(getStringRes(R$string.distance_settlement_stub, TimeUtils.m66420g(pair.getSecond().longValue())));
            m26806U3(true);
            return;
        }
        BaseTextView settleTime2 = c36766g2M26803P3.f80132q;
        Intrinsics.checkNotNullExpressionValue(settleTime2, "settleTime");
        ViewExtKt.m66577h(settleTime2);
        m26754V3(this, false, 1, null);
    }
}
