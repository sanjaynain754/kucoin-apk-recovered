package com.kubi.spot.quote.market;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.R$string;
import com.kubi.spot.business.market.ToggleSymbolsFragment;
import com.kubi.spot.entity.MarketsEntity;
import com.kubi.spot.helper.C25307a;
import com.kubi.spot.quote.market.symbolListItemView.SymbolsListAdapter;
import com.kubi.spot.service.SpotDepend;
import com.kubi.spot.utils.SpotSortAndQuotesHelper;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import g10.C37787r;
import g10.InterfaceC37770a;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p402kf.C41016c;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import qe0.C43724b;
import ro.C44128b;
import t20.C44631b0;
import t20.C44661q0;
import w00.C45681e;

/* JADX INFO: compiled from: ToggleSymbolsListFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001*\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010#\u001a\u00020\u0011H\u0014J\u001a\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0017J$\u0010L\u001a\u00020G2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020O0N2\u0006\u0010P\u001a\u00020\u0011H\u0003J\b\u0010Q\u001a\u00020GH\u0016J\u0010\u0010R\u001a\u00020G2\u0006\u0010S\u001a\u00020@H\u0014J\b\u0010T\u001a\u00020GH\u0016J\b\u0010U\u001a\u00020GH\u0016J\u0010\u0010V\u001a\u00020G2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020@H\u0016J\b\u0010Y\u001a\u00020GH\u0016J\u0016\u0010Z\u001a\u00020G2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0[H\u0002J\u0016\u0010\\\u001a\u00020G2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^H\u0002J\u0014\u0010`\u001a\u00020G2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010bH\u0002J\b\u0010c\u001a\u00020GH\u0016J\b\u0010d\u001a\u00020GH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0015R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010!R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b0\u00101R#\u00103\u001a\n 5*\u0004\u0018\u000104048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0017\u001a\u0004\b6\u00107R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u0012\u0012\u0004\u0012\u00020=0<j\b\u0012\u0004\u0012\u00020=`>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u0017\u001a\u0004\bC\u0010D¨\u0006f"}, m90084d2 = {"Lcom/kubi/spot/quote/market/ToggleSymbolsListFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "<init>", "()V", "popBinding", "Lcom/kubi/spot/databinding/KucoinPopupFavorBinding;", "getPopBinding", "()Lcom/kubi/spot/databinding/KucoinPopupFavorBinding;", "popBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "binding", "Lcom/kubi/spot/databinding/FragmentLayoutToggleSymbolsBinding;", "getBinding", "()Lcom/kubi/spot/databinding/FragmentLayoutToggleSymbolsBinding;", "binding$delegate", "indexToggleQuote", "", "symbols", "", "getSymbols", "()Ljava/lang/String;", "symbols$delegate", "Lkotlin/Lazy;", "tabCode", "getTabCode", "tabCode$delegate", "relationCode", "getRelationCode", "relationCode$delegate", "model", "Lcom/kubi/spot/quote/market/TradeListModel;", "getModel", "()Lcom/kubi/spot/quote/market/TradeListModel;", "model$delegate", "getLayout", "tradeListAdapter", "Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;", "getTradeListAdapter", "()Lcom/kubi/spot/quote/market/symbolListItemView/SymbolsListAdapter;", "tradeListAdapter$delegate", "mQuotesAdapter", "com/kubi/spot/quote/market/ToggleSymbolsListFragment$mQuotesAdapter$2$1", "getMQuotesAdapter", "()Lcom/kubi/spot/quote/market/ToggleSymbolsListFragment$mQuotesAdapter$2$1;", "mQuotesAdapter$delegate", "symbolsEntity", "Lcom/kubi/spot/entity/MarketsEntity;", "getSymbolsEntity", "()Lcom/kubi/spot/entity/MarketsEntity;", "symbolsEntity$delegate", "mPop", "Lcom/zyyoona7/popup/EasyPopup;", "kotlin.jvm.PlatformType", "getMPop", "()Lcom/zyyoona7/popup/EasyPopup;", "mPop$delegate", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "dataList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "Lkotlin/collections/ArrayList;", "hasInit", "", "mSortHelper", "Lcom/kubi/spot/utils/SpotSortAndQuotesHelper;", "getMSortHelper", "()Lcom/kubi/spot/utils/SpotSortAndQuotesHelper;", "mSortHelper$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initPopView", "adapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", ViewProps.POSITION, "showEmpty", "onViewHideOrShowToggle", TIMPushProvider.f75062n, "lazyLoad", "showContent", "updateQuotes", "getRestfulData", "resetWs", "registerWsData", "registerFavorAndRelationWsData", "", "collectQuoteSnapshot", "msgObs", "Lio/reactivex/subjects/PublishSubject;", "Lcom/kubi/network/websocket/model/Message;", "sortFilterData", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroyView", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nToggleSymbolsListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleSymbolsListFragment.kt\ncom/kubi/spot/quote/market/ToggleSymbolsListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,652:1\n147#2,16:653\n147#2,16:669\n1573#3:685\n1604#3,4:686\n1869#3,2:690\n774#3:692\n865#3,2:693\n808#3,11:695\n1869#3:706\n1870#3:708\n808#3,11:709\n1869#3,2:720\n1#4:707\n*S KotlinDebug\n*F\n+ 1 ToggleSymbolsListFragment.kt\ncom/kubi/spot/quote/market/ToggleSymbolsListFragment\n*L\n77#1:653,16\n79#1:669,16\n495#1:685\n495#1:686,4\n578#1:690,2\n244#1:692\n244#1:693,2\n552#1:695,11\n554#1:706\n554#1:708\n610#1:709,11\n613#1:720,2\n*E\n"})
public final class ToggleSymbolsListFragment extends OldBaseFragment implements InterfaceC37770a {

    /* JADX INFO: renamed from: W */
    public int f50887W;

    /* JADX INFO: renamed from: h0 */
    public boolean f50898h0;

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ KProperty<Object>[] f50884k0 = {Reflection.property1(new PropertyReference1Impl(ToggleSymbolsListFragment.class, "popBinding", "getPopBinding()Lcom/kubi/spot/databinding/KucoinPopupFavorBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ToggleSymbolsListFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/FragmentLayoutToggleSymbolsBinding;", 0))};

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f50883j0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50885U = C45681e.m100799e(this, new Function1<ToggleSymbolsListFragment, C44661q0>() { // from class: com.kubi.spot.quote.market.ToggleSymbolsListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44661q0 invoke(@NotNull ToggleSymbolsListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM96292A = this.this$0.m62408R4().m96292A();
            Intrinsics.checkNotNullExpressionValue(viewM96292A, "getContentView(...)");
            return C44661q0.m98798a(viewM96292A);
        }

        {
            super(1);
        }
    }, new Function1<C44661q0, Unit>() { // from class: com.kubi.spot.quote.market.ToggleSymbolsListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44661q0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44661q0 c44661q0) {
            invoke(c44661q0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f50886V = C45681e.m100799e(this, new Function1<ToggleSymbolsListFragment, C44631b0>() { // from class: com.kubi.spot.quote.market.ToggleSymbolsListFragment$special$$inlined$viewBindingFragment$4
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44631b0 invoke(@NotNull ToggleSymbolsListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44631b0.m98740a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44631b0, Unit>() { // from class: com.kubi.spot.quote.market.ToggleSymbolsListFragment$special$$inlined$viewBindingFragment$3
        public final void invoke(@NotNull C44631b0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44631b0 c44631b0) {
            invoke(c44631b0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50888X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.r0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62439d6(this.f51019b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f50889Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.c1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62442e6(this.f50907b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f50890Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.n1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62413T5(this.f51012b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f50891a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.u1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62471p5();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f50892b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.v1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62445f6(this.f51209b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f50893c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.w1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62465n5();
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f50894d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.x1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62436c6(this.f51214b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f50895e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62462m5(this.f51006b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final C37787r f50896f0 = new C37787r(this);

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final ArrayList<TradeItemBean> f50897g0 = new ArrayList<>();

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f50899i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToggleSymbolsListFragment.m62468o5(this.f51008b);
        }
    });

    /* JADX INFO: compiled from: ToggleSymbolsListFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/ToggleSymbolsListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/market/ToggleSymbolsListFragment;", "quoteCurrency", "Lcom/kubi/spot/entity/MarketsEntity;", "relationCode", "", "PAGE_ID", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ ToggleSymbolsListFragment newInstance$default(Companion companion, MarketsEntity marketsEntity, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return companion.newInstance(marketsEntity, str);
        }

        @JvmStatic
        @NotNull
        public final ToggleSymbolsListFragment newInstance(@NotNull MarketsEntity quoteCurrency, @Nullable String relationCode) {
            Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
            ToggleSymbolsListFragment toggleSymbolsListFragment = new ToggleSymbolsListFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", quoteCurrency);
            bundle.putString("coin", relationCode);
            toggleSymbolsListFragment.setArguments(bundle);
            return toggleSymbolsListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.ToggleSymbolsListFragment$a */
    /* JADX INFO: compiled from: ToggleSymbolsListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/quote/market/ToggleSymbolsListFragment$lazyLoad$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25558a extends C24223c1 {
        public C25558a() {
            super(null, false);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) throws Exception {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (ToggleSymbolsListFragment.this.isDetached() || ToggleSymbolsListFragment.this.getParentFragment() == null) {
                return;
            }
            FragmentActivity activity = ToggleSymbolsListFragment.this.getActivity();
            if (C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null)) {
                return;
            }
            super.accept(throwable);
            if (ToggleSymbolsListFragment.this.f50897g0.isEmpty()) {
                final ToggleSymbolsListFragment toggleSymbolsListFragment = ToggleSymbolsListFragment.this;
                toggleSymbolsListFragment.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_network_error, new View.OnClickListener() { // from class: com.kubi.spot.quote.market.z1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ToggleSymbolsListFragment.C25558a.m62512f(toggleSymbolsListFragment, view);
                    }
                });
            }
            ToggleSymbolsListFragment.this.mo22379g(true);
        }

        /* JADX INFO: renamed from: f */
        public static final void m62512f(ToggleSymbolsListFragment toggleSymbolsListFragment, View view) {
            toggleSymbolsListFragment.lazyLoad();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.ToggleSymbolsListFragment$b */
    /* JADX INFO: compiled from: ToggleSymbolsListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/spot/quote/market/ToggleSymbolsListFragment$onViewCreated$9", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25559b extends RecyclerView.OnScrollListener {
        public C25559b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (ToggleSymbolsListFragment.this.m62408R4().m96299I()) {
                ToggleSymbolsListFragment.this.m62408R4().m96331y();
            }
        }
    }

    /* JADX INFO: renamed from: B5 */
    private final void m62363B5(List<? extends TradeItemBean> list) {
        List listChunked = CollectionsKt.chunked(list, 80);
        getVisibleDisposable().clear();
        Iterator it = listChunked.iterator();
        while (it.hasNext()) {
            this.f50896f0.m85233f("/market/snapshot_app:%s", CollectionsKt.joinToString$default((List) it.next(), ",", null, null, 0, null, new Function1() { // from class: com.kubi.spot.quote.market.e1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62366C5((TradeItemBean) obj);
                }
            }, 30, null));
        }
        m62362B4(this.f50896f0.m85231d());
    }

    /* JADX INFO: renamed from: C4 */
    public static final boolean m62365C4(ToggleSymbolsListFragment toggleSymbolsListFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z11 = Intrinsics.areEqual(toggleSymbolsListFragment.m62426Z4(), "favor") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot");
        boolean z12 = Intrinsics.areEqual(toggleSymbolsListFragment.m62426Z4(), "relation") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot");
        String topic = it.getTopic();
        String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{toggleSymbolsListFragment.m62426Z4()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return toggleSymbolsListFragment.isShowing() && (z11 || z12 || Intrinsics.areEqual(topic, str));
    }

    /* JADX INFO: renamed from: C5 */
    public static final CharSequence m62366C5(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String symbol = it.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return symbol;
    }

    /* JADX INFO: renamed from: D4 */
    public static final boolean m62368D4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: E4 */
    public static final Object m62370E4(Message s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        try {
            return C27099x.m66913c(s11.getData(), WsMarketSnapshotEntity.class);
        } catch (Exception e11) {
            C44128b.m97263g("ToggleSymbolsListFragment", e11);
            return new Object();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final Object m62373F4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: F5 */
    public static final boolean m62374F5(ToggleSymbolsListFragment toggleSymbolsListFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z11 = Intrinsics.areEqual(toggleSymbolsListFragment.m62426Z4(), "favor") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot");
        boolean z12 = Intrinsics.areEqual(toggleSymbolsListFragment.m62426Z4(), "relation") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot");
        String topic = it.getTopic();
        String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{toggleSymbolsListFragment.m62426Z4()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return toggleSymbolsListFragment.isShowing() && (z11 || z12 || Intrinsics.areEqual(topic, str));
    }

    /* JADX INFO: renamed from: G4 */
    public static final boolean m62376G4(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: G5 */
    public static final boolean m62377G5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: H4 */
    public static final boolean m62379H4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: H5 */
    public static final Object m62380H5(Message s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        try {
            return C27099x.m66913c(s11.getData(), WsMarketSnapshotEntity.class);
        } catch (Exception e11) {
            C44128b.m97263g("ToggleSymbolsListFragment", e11);
            return new Object();
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static final List m62382I4(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj : it) {
            if (obj instanceof WsMarketSnapshotEntity) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: I5 */
    public static final Object m62383I5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: J4 */
    public static final List m62385J4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: J5 */
    public static final boolean m62386J5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Collection m62388K4(ToggleSymbolsListFragment toggleSymbolsListFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = it.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                return SpotSortAndQuotesHelper.m63071u(toggleSymbolsListFragment.m62505T4(), toggleSymbolsListFragment.f50897g0, false, 2, null);
            }
            WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) it2.next();
            for (Object obj2 : toggleSymbolsListFragment.f50897g0) {
                if (Intrinsics.areEqual(((TradeItemBean) obj2).getSymbol(), wsMarketSnapshotEntity.getSymbolCode())) {
                    obj = obj2;
                    break;
                }
            }
            TradeItemBean tradeItemBean = (TradeItemBean) obj;
            if (tradeItemBean != null) {
                wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
            }
        }
    }

    /* JADX INFO: renamed from: K5 */
    public static final boolean m62389K5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: L4 */
    public static final Collection m62391L4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: L5 */
    public static final List m62392L5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj : it) {
            if (obj instanceof WsMarketSnapshotEntity) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M5 */
    public static final List m62395M5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: N5 */
    public static final Collection m62398N5(ToggleSymbolsListFragment toggleSymbolsListFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = it.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                return SpotSortAndQuotesHelper.m63071u(toggleSymbolsListFragment.m62505T4(), toggleSymbolsListFragment.f50897g0, false, 2, null);
            }
            WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) it2.next();
            for (Object obj2 : toggleSymbolsListFragment.f50897g0) {
                if (Intrinsics.areEqual(((TradeItemBean) obj2).getSymbol(), wsMarketSnapshotEntity.getSymbolCode())) {
                    obj = obj2;
                    break;
                }
            }
            TradeItemBean tradeItemBean = (TradeItemBean) obj;
            if (tradeItemBean != null) {
                wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m62400O4(Throwable th2) {
        C44128b.m97263g("ToggleSymbolsListFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O5 */
    public static final Collection m62401O5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public final C43724b m62408R4() {
        return (C43724b) this.f50895e0.getValue();
    }

    /* JADX INFO: renamed from: R5 */
    public static final Unit m62409R5(Throwable th2) {
        C44128b.m97263g("ToggleSymbolsListFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V5 */
    public static /* synthetic */ void m62417V5(ToggleSymbolsListFragment toggleSymbolsListFragment, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = null;
        }
        toggleSymbolsListFragment.m62415U5(action);
    }

    /* JADX INFO: renamed from: W4 */
    private final String m62419W4() {
        return (String) this.f50890Z.getValue();
    }

    /* JADX INFO: renamed from: W5 */
    public static final Collection m62420W5(ToggleSymbolsListFragment toggleSymbolsListFragment, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SpotSortAndQuotesHelper.m63071u(toggleSymbolsListFragment.m62505T4(), it, false, 2, null);
    }

    /* JADX INFO: renamed from: X5 */
    public static final Collection m62422X5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Z4 */
    private final String m62426Z4() {
        return (String) this.f50889Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public final SymbolsListAdapter m62429a5() {
        return (SymbolsListAdapter) this.f50892b0.getValue();
    }

    /* JADX INFO: renamed from: a6 */
    public static final Unit m62430a6(Throwable th2) {
        C44128b.m97263g("ToggleSymbolsListFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m62438d5(final ToggleSymbolsListFragment toggleSymbolsListFragment, final TradeItemBean tradeItemBean, final BaseQuickAdapter baseQuickAdapter, final int i11) throws Exception {
        SpotDepend spotDepend = SpotDepend.f51244a;
        if (spotDepend.m63036f().c()) {
            Observable<Object> observableM62521c = toggleSymbolsListFragment.m62506U4().m62521c(tradeItemBean != null ? tradeItemBean.getSymbol() : null);
            Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.spot.quote.market.y0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    ToggleSymbolsListFragment.m62441e5(this.f51216b, tradeItemBean, baseQuickAdapter, i11, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.z0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62444f5((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableM62521c.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.a1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ToggleSymbolsListFragment.m62447g5(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, toggleSymbolsListFragment.getDestroyDisposable());
        } else if (TextUtils.isEmpty(spotDepend.m63036f().d0().id) || !spotDepend.m63036f().o()) {
            IQuoteFacadeService.f41383a.get().mo50678C(tradeItemBean, new Function1() { // from class: com.kubi.spot.quote.market.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62451i5(this.f50919b, tradeItemBean, ((Boolean) obj).booleanValue());
                }
            });
            if (C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C25307a.m61759a(tradeItemBean)) : null) || !Intrinsics.areEqual(toggleSymbolsListFragment.m62508X4(), "favor")) {
                if (C27025c.m66566d(Boolean.valueOf(C25307a.m61759a(tradeItemBean)))) {
                    C43852m.m96591c("B5trading", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", true), 4, null);
                } else {
                    C43852m.m96591c("B5trading", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
                }
                baseQuickAdapter.notifyItemChanged(i11);
            } else {
                C43852m.m96591c("B5trading", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
                toggleSymbolsListFragment.f50897g0.remove(tradeItemBean);
                if (toggleSymbolsListFragment.f50897g0.isEmpty()) {
                    toggleSymbolsListFragment.showEmpty();
                    toggleSymbolsListFragment.f50896f0.m85236i(false);
                } else {
                    toggleSymbolsListFragment.m62502D5();
                }
            }
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.quote.market.b1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToggleSymbolsListFragment.m62449h5();
                }
            }), 1, (Object) null);
        }
        toggleSymbolsListFragment.m62408R4().m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final void m62441e5(ToggleSymbolsListFragment toggleSymbolsListFragment, TradeItemBean tradeItemBean, BaseQuickAdapter baseQuickAdapter, int i11, Object obj) throws Exception {
        ToggleSymbolsFragment toggleSymbolsFragment;
        ToastCompat.m66441G(toggleSymbolsListFragment.mContext.getString(C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C25307a.m61759a(tradeItemBean)) : null) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
        if (tradeItemBean != null) {
            tradeItemBean.setFavor(!C27025c.m66566d(Boolean.valueOf(C25307a.m61759a(tradeItemBean))));
        }
        if (C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C25307a.m61759a(tradeItemBean)) : null) || !Intrinsics.areEqual(toggleSymbolsListFragment.m62508X4(), "favor")) {
            if (C27025c.m66566d(Boolean.valueOf(C25307a.m61759a(tradeItemBean)))) {
                C43852m.m96591c("B5trading", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", true), 4, null);
            } else {
                C43852m.m96591c("B5trading", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
            }
            baseQuickAdapter.notifyItemChanged(i11);
        } else {
            C43852m.m96591c("B5trading", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
            toggleSymbolsListFragment.f50897g0.remove(tradeItemBean);
            if (toggleSymbolsListFragment.f50897g0.isEmpty()) {
                toggleSymbolsListFragment.showEmpty();
                toggleSymbolsListFragment.f50896f0.m85236i(false);
            } else {
                toggleSymbolsListFragment.m62502D5();
            }
        }
        if (toggleSymbolsListFragment.isDetached() || toggleSymbolsListFragment.getParentFragment() == null || (toggleSymbolsFragment = (ToggleSymbolsFragment) toggleSymbolsListFragment.getParentFragment()) == null) {
            return;
        }
        toggleSymbolsFragment.updateFavor(tradeItemBean);
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m62444f5(Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f6 */
    public static final SymbolsListAdapter m62445f6(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        Bundle arguments;
        Fragment parentFragment = toggleSymbolsListFragment.getParentFragment();
        return new SymbolsListAdapter(toggleSymbolsListFragment, C27025c.m66566d((parentFragment == null || (arguments = parentFragment.getArguments()) == null) ? null : Boolean.valueOf(arguments.getBoolean("isMarket"))), toggleSymbolsListFragment.m62508X4(), null, 8, null);
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m62449h5() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m62451i5(ToggleSymbolsListFragment toggleSymbolsListFragment, TradeItemBean tradeItemBean, boolean z11) {
        if (z11) {
            ToastCompat.m66441G(toggleSymbolsListFragment.mContext.getString(C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C25307a.m61759a(tradeItemBean)) : null) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final Collection m62453j5(ToggleSymbolsListFragment toggleSymbolsListFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(toggleSymbolsListFragment.m62426Z4(), "favor")) {
            IQuoteFacadeService.f41383a.get().mo50704g(it);
        }
        return toggleSymbolsListFragment.m62505T4().m63085t(it, false);
    }

    /* JADX INFO: renamed from: k5 */
    public static final Collection m62456k5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m5 */
    public static final C43724b m62462m5(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        Context mContext = toggleSymbolsListFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        return new BubbleEasyPopup(mContext).m96307Q(R$layout.kucoin_popup_favor).m96316Z(true).m96322p();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.kubi.spot.quote.market.ToggleSymbolsListFragment$mQuotesAdapter$2$1] */
    /* JADX INFO: renamed from: n5 */
    public static final ToggleSymbolsListFragment$mQuotesAdapter$2$1 m62465n5() {
        final int i11 = R$layout.kucoin_item_toggle_quote;
        return new BaseQuickAdapter<SelectEntity, BaseViewHolder>(i11) { // from class: com.kubi.spot.quote.market.ToggleSymbolsListFragment$mQuotesAdapter$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, SelectEntity item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                int i12 = R$id.tv_toggle_quote;
                helper.setText(i12, item.getLabel());
                if (item.getIsChecked()) {
                    helper.setTextColor(i12, C27017c.f54310a.m66512a(R$color.emphasis));
                    helper.itemView.setBackgroundResource(R$drawable.bg_emphasis4_4r);
                } else {
                    helper.itemView.setBackground(null);
                    helper.setTextColor(i12, C27017c.f54310a.m66512a(R$color.c_bulletLayer));
                }
            }
        };
    }

    /* JADX INFO: renamed from: o5 */
    public static final SpotSortAndQuotesHelper m62468o5(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        C44631b0 c44631b0M62503Q4 = toggleSymbolsListFragment.m62503Q4();
        return new SpotSortAndQuotesHelper(c44631b0M62503Q4 != null ? c44631b0M62503Q4.f98986l : null);
    }

    /* JADX INFO: renamed from: p5 */
    public static final TradeListModel m62471p5() {
        return new TradeListModel();
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m62480s5(Throwable th2) {
        C44128b.m97263g("ToggleSymbolsListFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u5 */
    public static final boolean m62486u5(ToggleSymbolsListFragment toggleSymbolsListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        RecyclerView recyclerView;
        view.setBackgroundResource(R$color.emphasis4);
        if (toggleSymbolsListFragment.m62429a5().getF51073m() != -1) {
            toggleSymbolsListFragment.m62429a5().notifyItemChanged(toggleSymbolsListFragment.m62429a5().getF51073m());
        }
        toggleSymbolsListFragment.m62429a5().m62739m(i11);
        toggleSymbolsListFragment.m62432b5(toggleSymbolsListFragment.m62429a5(), i11);
        C44631b0 c44631b0M62503Q4 = toggleSymbolsListFragment.m62503Q4();
        RecyclerView.LayoutManager layoutManager = (c44631b0M62503Q4 == null || (recyclerView = c44631b0M62503Q4.f98987m) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            boolean z11 = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == i11 || linearLayoutManager.findFirstVisibleItemPosition() == i11;
            ((BubbleLinearLayout) toggleSymbolsListFragment.m62408R4().m96332z(R$id.bbLayout)).setArrowDirection(z11 ? BubbleStyle.ArrowDirection.Up : BubbleStyle.ArrowDirection.Down);
            toggleSymbolsListFragment.m62408R4().m96320e0(view, z11 ? 2 : 1, 0, 0, 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m62489v5() {
        C43852m.m96591c("B5trading", "sideMarketLogin", null, null, 12, null);
        IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.quote.market.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ToggleSymbolsListFragment.m62492w5();
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m62492w5() {
        InterfaceC37754f.a.m85140l(C37304a.f82764a, null, null, null, null, null, null, 63, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D5 */
    public void m62502D5() throws Exception {
        this.f50896f0.m85234g(new Action() { // from class: com.kubi.spot.quote.market.i0
            @Override // io.reactivex.functions.Action
            public final void run() {
                ToggleSymbolsListFragment.m62371E5(this.f50937b);
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public final C44631b0 m62503Q4() {
        return (C44631b0) this.f50886V.getValue(this, f50884k0[1]);
    }

    /* JADX INFO: renamed from: S4 */
    public final ToggleSymbolsListFragment$mQuotesAdapter$2$1 m62504S4() {
        return (ToggleSymbolsListFragment$mQuotesAdapter$2$1) this.f50893c0.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    public final SpotSortAndQuotesHelper m62505T4() {
        return (SpotSortAndQuotesHelper) this.f50899i0.getValue();
    }

    /* JADX INFO: renamed from: U4 */
    public final TradeListModel m62506U4() {
        return (TradeListModel) this.f50891a0.getValue();
    }

    /* JADX INFO: renamed from: V4 */
    public final C44661q0 m62507V4() {
        return (C44661q0) this.f50885U.getValue(this, f50884k0[0]);
    }

    /* JADX INFO: renamed from: X4 */
    public final String m62508X4() {
        return (String) this.f50888X.getValue();
    }

    /* JADX INFO: renamed from: Y4 */
    public final MarketsEntity m62509Y4() {
        return (MarketsEntity) this.f50894d0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_layout_toggle_symbols;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCCyclomaticComplexityCheck", "KCLongMethodCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        BaseTextView baseTextView;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView recyclerView6;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44631b0 c44631b0M62503Q4 = m62503Q4();
        if (c44631b0M62503Q4 != null && (recyclerView6 = c44631b0M62503Q4.f98987m) != null) {
            recyclerView6.setAdapter(m62429a5());
        }
        C44631b0 c44631b0M62503Q5 = m62503Q4();
        if (c44631b0M62503Q5 != null && (recyclerView5 = c44631b0M62503Q5.f98987m) != null && (itemAnimator = recyclerView5.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(0L);
        }
        C44631b0 c44631b0M62503Q6 = m62503Q4();
        if (c44631b0M62503Q6 != null && (recyclerView4 = c44631b0M62503Q6.f98987m) != null) {
            recyclerView4.setHasFixedSize(true);
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62474q5(this.f51010b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.spot.quote.market.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToggleSymbolsListFragment.m62477r5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62480s5((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToggleSymbolsListFragment.m62483t5(function2, obj);
            }
        }));
        showLoading();
        m62429a5().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.spot.quote.market.r
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                return ToggleSymbolsListFragment.m62486u5(this.f51018a, baseQuickAdapter, view2, i11);
            }
        });
        C44631b0 c44631b0M62503Q7 = m62503Q4();
        if (c44631b0M62503Q7 != null && (baseTextView = c44631b0M62503Q7.f98991q) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.quote.market.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToggleSymbolsListFragment.m62489v5();
                }
            }, 1, null);
        }
        C44631b0 c44631b0M62503Q8 = m62503Q4();
        if (c44631b0M62503Q8 != null && (linearLayout3 = c44631b0M62503Q8.f98984j) != null) {
            C27046k.m66711z(linearLayout3, 0L, new Function0() { // from class: com.kubi.spot.quote.market.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToggleSymbolsListFragment.m62495x5(this.f51074b);
                }
            }, 1, null);
        }
        C44631b0 c44631b0M62503Q9 = m62503Q4();
        if (c44631b0M62503Q9 != null && (linearLayout2 = c44631b0M62503Q9.f98979e) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.spot.quote.market.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToggleSymbolsListFragment.m62498y5(this.f51206b);
                }
            }, 1, null);
        }
        C44631b0 c44631b0M62503Q10 = m62503Q4();
        if (c44631b0M62503Q10 != null && (linearLayout = c44631b0M62503Q10.f98978d) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToggleSymbolsListFragment.m62501z5(this.f51210b);
                }
            }, 1, null);
        }
        C44631b0 c44631b0M62503Q11 = m62503Q4();
        if (c44631b0M62503Q11 != null && (recyclerView3 = c44631b0M62503Q11.f98988n) != null) {
            recyclerView3.setAdapter(m62504S4());
        }
        C44631b0 c44631b0M62503Q12 = m62503Q4();
        if (c44631b0M62503Q12 != null && (recyclerView2 = c44631b0M62503Q12.f98988n) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        m62504S4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.spot.quote.market.x
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                ToggleSymbolsListFragment.m62360A5(this.f51212a, baseQuickAdapter, view2, i11);
            }
        });
        C44631b0 c44631b0M62503Q13 = m62503Q4();
        if (c44631b0M62503Q13 == null || (recyclerView = c44631b0M62503Q13.f98987m) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C25559b());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        this.f50896f0.m85236i(show);
    }

    /* JADX INFO: renamed from: A5 */
    public static final void m62360A5(ToggleSymbolsListFragment toggleSymbolsListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object item = baseQuickAdapter.getItem(i11);
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.kubi.sdk.widget.dialog.SelectEntity");
        SelectEntity selectEntity = (SelectEntity) item;
        C43852m.m96591c("B5trading", "sideMarketStableCoinTab", null, new JSONObject().put("sidemarketsubtab", selectEntity.getLabel()), 4, null);
        if (selectEntity.getIsChecked()) {
            return;
        }
        toggleSymbolsListFragment.f50887W = i11;
        toggleSymbolsListFragment.m62429a5().m62739m(-1);
        for (Object obj : baseQuickAdapter.getData()) {
            if (obj instanceof SelectEntity) {
                ((SelectEntity) obj).setChecked(false);
            }
        }
        selectEntity.setChecked(true);
        toggleSymbolsListFragment.m62504S4().notifyDataSetChanged();
        if (i11 == 0) {
            toggleSymbolsListFragment.m62505T4().m63076k("");
            toggleSymbolsListFragment.m62429a5().replaceData(toggleSymbolsListFragment.f50897g0);
            return;
        }
        toggleSymbolsListFragment.m62505T4().m63076k(selectEntity.getLabel().toString());
        ArrayList<TradeItemBean> arrayList = toggleSymbolsListFragment.f50897g0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (Intrinsics.areEqual(((TradeItemBean) obj2).getSymbolInfoEntity().getQuoteCurrency(), selectEntity.getLabel())) {
                arrayList2.add(obj2);
            }
        }
        toggleSymbolsListFragment.m62429a5().replaceData(arrayList2);
    }

    /* JADX INFO: renamed from: B4 */
    private final void m62362B4(PublishSubject<Message> publishSubject) {
        CompositeDisposable visibleDisposable = getVisibleDisposable();
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ToggleSymbolsListFragment.m62365C4(this.f50927b, (Message) obj));
            }
        };
        Observable<Message> observableObserveOn = publishSubject.filter(new Predicate() { // from class: com.kubi.spot.quote.market.k1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ToggleSymbolsListFragment.m62368D4(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62370E4((Message) obj);
            }
        };
        Observable observableBuffer = observableObserveOn.map(new Function() { // from class: com.kubi.spot.quote.market.m1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ToggleSymbolsListFragment.m62373F4(function2, obj);
            }
        }).buffer(1200L, TimeUnit.MILLISECONDS);
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ToggleSymbolsListFragment.m62376G4((List) obj));
            }
        };
        Observable observableFilter = observableBuffer.filter(new Predicate() { // from class: com.kubi.spot.quote.market.p1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return ToggleSymbolsListFragment.m62379H4(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.quote.market.q1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62382I4((List) obj);
            }
        };
        Observable observableObserveOn2 = observableFilter.map(new Function() { // from class: com.kubi.spot.quote.market.r1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ToggleSymbolsListFragment.m62385J4(function4, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.quote.market.s1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62388K4(this.f51068b, (List) obj);
            }
        };
        Observable map = observableObserveOn2.map(new Function() { // from class: com.kubi.spot.quote.market.t1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ToggleSymbolsListFragment.m62391L4(function5, obj);
            }
        });
        final Function1 function6 = new Function1() { // from class: com.kubi.spot.quote.market.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62394M4(this.f50930b, (Collection) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToggleSymbolsListFragment.m62397N4(function6, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.spot.quote.market.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62400O4((Throwable) obj);
            }
        };
        visibleDisposable.add(map.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.j1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ToggleSymbolsListFragment.m62403P4(function7, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E5 */
    public static final void m62371E5(final ToggleSymbolsListFragment toggleSymbolsListFragment) {
        if (!Intrinsics.areEqual(toggleSymbolsListFragment.m62426Z4(), "favor") && !Intrinsics.areEqual(toggleSymbolsListFragment.m62426Z4(), "relation")) {
            toggleSymbolsListFragment.getVisibleDisposable().clear();
            CompositeDisposable visibleDisposable = toggleSymbolsListFragment.getVisibleDisposable();
            PublishSubject<Message> publishSubjectM85233f = toggleSymbolsListFragment.f50896f0.m85233f("/market/snapshot_app:%s", toggleSymbolsListFragment.m62426Z4());
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ToggleSymbolsListFragment.m62374F5(this.f51001b, (Message) obj));
                }
            };
            Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.spot.quote.market.o0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return ToggleSymbolsListFragment.m62377G5(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.p0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62380H5((Message) obj);
                }
            };
            Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.spot.quote.market.q0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ToggleSymbolsListFragment.m62383I5(function2, obj);
                }
            }).buffer(1200L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94127f());
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ToggleSymbolsListFragment.m62386J5((List) obj));
                }
            };
            Observable observableFilter2 = observableObserveOn.filter(new Predicate() { // from class: com.kubi.spot.quote.market.t0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return ToggleSymbolsListFragment.m62389K5(function3, obj);
                }
            });
            final Function1 function4 = new Function1() { // from class: com.kubi.spot.quote.market.u0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62392L5((List) obj);
                }
            };
            Observable map = observableFilter2.map(new Function() { // from class: com.kubi.spot.quote.market.v0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ToggleSymbolsListFragment.m62395M5(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.spot.quote.market.w0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62398N5(this.f51211b, (List) obj);
                }
            };
            Observable observableObserveOn2 = map.map(new Function() { // from class: com.kubi.spot.quote.market.x0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ToggleSymbolsListFragment.m62401O5(function5, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function6 = new Function1() { // from class: com.kubi.spot.quote.market.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62404P5(this.f51004b, (Collection) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.l0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ToggleSymbolsListFragment.m62406Q5(function6, obj);
                }
            };
            final Function1 function7 = new Function1() { // from class: com.kubi.spot.quote.market.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62409R5((Throwable) obj);
                }
            };
            visibleDisposable.add(observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.n0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ToggleSymbolsListFragment.m62411S5(function7, obj);
                }
            }));
            return;
        }
        toggleSymbolsListFragment.m62363B5(toggleSymbolsListFragment.f50897g0);
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m62394M4(ToggleSymbolsListFragment toggleSymbolsListFragment, Collection collection) {
        if (!toggleSymbolsListFragment.isDetached() && toggleSymbolsListFragment.getParentFragment() != null) {
            toggleSymbolsListFragment.showContent();
            toggleSymbolsListFragment.m62429a5().replaceData(collection);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m62397N4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m62403P4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m62404P5(ToggleSymbolsListFragment toggleSymbolsListFragment, Collection collection) {
        if (!toggleSymbolsListFragment.isDetached() && toggleSymbolsListFragment.getParentFragment() != null) {
            toggleSymbolsListFragment.showContent();
            toggleSymbolsListFragment.m62429a5().replaceData(collection);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q5 */
    public static final void m62406Q5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S5 */
    public static final void m62411S5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T5 */
    public static final String m62413T5(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        String string;
        Bundle arguments = toggleSymbolsListFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("coin");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: U5 */
    private final void m62415U5(final Action action) {
        if (!isDetached() && getParentFragment() != null) {
            Observable observableObserveOn = Observable.just(this.f50897g0).observeOn(C42916f.m94126e());
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62420W5(this.f50904b, (ArrayList) obj);
                }
            };
            Observable observableObserveOn2 = observableObserveOn.map(new Function() { // from class: com.kubi.spot.quote.market.c0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ToggleSymbolsListFragment.m62422X5(function1, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62424Y5(this.f50917b, action, (Collection) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ToggleSymbolsListFragment.m62427Z5(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ToggleSymbolsListFragment.m62430a6((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.h0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ToggleSymbolsListFragment.m62433b6(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public static final Unit m62424Y5(ToggleSymbolsListFragment toggleSymbolsListFragment, Action action, Collection collection) throws Exception {
        toggleSymbolsListFragment.m62429a5().replaceData(collection);
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z5 */
    public static final void m62427Z5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: b5 */
    private final void m62432b5(final BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter, final int i11) {
        LinearLayout linearLayout;
        ImageView imageView;
        int i12;
        final TradeItemBean item = baseQuickAdapter.getItem(i11);
        if (item != null && m62408R4().m96292A() != null) {
            C44661q0 c44661q0M62507V4 = m62507V4();
            if (c44661q0M62507V4 != null && (imageView = c44661q0M62507V4.f99291c) != null) {
                if (C27025c.m66566d(Boolean.valueOf(C25307a.m61759a(item)))) {
                    i12 = R$mipmap.ic_favor;
                } else {
                    i12 = R$drawable.ic_unfav_white;
                }
                imageView.setImageResource(i12);
            }
            m62408R4().m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.spot.quote.market.y
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ToggleSymbolsListFragment.m62435c5(this.f51215b);
                }
            });
            C44661q0 c44661q0M62507V5 = m62507V4();
            if (c44661q0M62507V5 != null && (linearLayout = c44661q0M62507V5.f99292d) != null) {
                C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.spot.quote.market.z
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ToggleSymbolsListFragment.m62438d5(this.f51222b, item, baseQuickAdapter, i11);
                    }
                }, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: b6 */
    public static final void m62433b6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c5 */
    public static final void m62435c5(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        if (toggleSymbolsListFragment.m62429a5().getF51073m() != -1) {
            toggleSymbolsListFragment.m62429a5().notifyItemChanged(toggleSymbolsListFragment.m62429a5().getF51073m());
        }
        toggleSymbolsListFragment.m62429a5().m62739m(-1);
    }

    /* JADX INFO: renamed from: c6 */
    public static final MarketsEntity m62436c6(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        MarketsEntity marketsEntity;
        Bundle arguments = toggleSymbolsListFragment.getArguments();
        if (arguments != null) {
            marketsEntity = (MarketsEntity) arguments.getParcelable("data");
        } else {
            marketsEntity = null;
        }
        Intrinsics.checkNotNull(marketsEntity);
        return marketsEntity;
    }

    /* JADX INFO: renamed from: d6 */
    public static final String m62439d6(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        return C27041f.m66668h(toggleSymbolsListFragment.m62509Y4().getName());
    }

    /* JADX INFO: renamed from: e6 */
    public static final String m62442e6(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        return C27041f.m66668h(toggleSymbolsListFragment.m62509Y4().getName());
    }

    /* JADX INFO: renamed from: g5 */
    public static final void m62447g5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m62459l5(ToggleSymbolsListFragment toggleSymbolsListFragment, Collection collection) throws Exception {
        if (!toggleSymbolsListFragment.isDetached() && toggleSymbolsListFragment.getParentFragment() != null) {
            toggleSymbolsListFragment.f50898h0 = true;
            toggleSymbolsListFragment.f50897g0.clear();
            toggleSymbolsListFragment.f50897g0.addAll(collection);
            if (toggleSymbolsListFragment.f50897g0.isEmpty()) {
                toggleSymbolsListFragment.showEmpty();
                toggleSymbolsListFragment.f50896f0.m85236i(false);
                return;
            }
            toggleSymbolsListFragment.showContent();
            if (TextUtils.isEmpty(toggleSymbolsListFragment.m62505T4().getF51255b())) {
                toggleSymbolsListFragment.m62429a5().replaceData(collection);
            } else {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(toggleSymbolsListFragment), C42911a.m94120b(), null, new ToggleSymbolsListFragment$lazyLoad$2$1(collection, toggleSymbolsListFragment.m62505T4().getF51255b(), toggleSymbolsListFragment, null), 2, null);
            }
            toggleSymbolsListFragment.mo22379g(true);
        }
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m62474q5(ToggleSymbolsListFragment toggleSymbolsListFragment, Boolean bool) {
        toggleSymbolsListFragment.m62429a5().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public static final void m62477r5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public static final void m62483t5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m62495x5(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        toggleSymbolsListFragment.m62505T4().m63082q();
        m62417V5(toggleSymbolsListFragment, null, 1, null);
        C43852m.m96591c("B5trading", "sideMarketNameSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m62498y5(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        toggleSymbolsListFragment.m62505T4().m63084s();
        m62417V5(toggleSymbolsListFragment, null, 1, null);
        C43852m.m96591c("B5trading", "sideMarketPriceSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z5 */
    public static final Unit m62501z5(ToggleSymbolsListFragment toggleSymbolsListFragment) {
        toggleSymbolsListFragment.m62505T4().m63080o();
        m62417V5(toggleSymbolsListFragment, null, 1, null);
        C43852m.m96591c("B5trading", "sideMarketChangeSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // g10.InterfaceC37770a
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        Boolean boolValueOf;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            boolValueOf = Boolean.valueOf(activity.isFinishing());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf) && m62426Z4().length() != 0 && z11) {
            m62502D5();
        }
    }

    /* JADX INFO: renamed from: g6 */
    public final void m62510g6(MarketsEntity marketsEntity) {
        RecyclerView recyclerView;
        boolean z11;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        String name = marketsEntity.getName();
        Locale locale = Locale.ROOT;
        String upperCase = name.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (!TextUtils.equals(upperCase, "USDS")) {
            String upperCase2 = marketsEntity.getName().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (!TextUtils.equals(upperCase2, "ALTS")) {
                C44631b0 c44631b0M62503Q4 = m62503Q4();
                if (c44631b0M62503Q4 != null && (recyclerView3 = c44631b0M62503Q4.f98988n) != null) {
                    recyclerView3.setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (!marketsEntity.getQuotes().isEmpty()) {
            C44631b0 c44631b0M62503Q5 = m62503Q4();
            if (c44631b0M62503Q5 != null && (recyclerView2 = c44631b0M62503Q5.f98988n) != null) {
                recyclerView2.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, marketsEntity.getDisplayName());
            arrayList.addAll(marketsEntity.getQuotes());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int i11 = 0;
            for (Object obj : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (i11 == this.f50887W) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList2.add(new SelectEntity(null, str, null, null, null, null, null, null, null, false, z11, null, 3069, null));
                i11 = i12;
            }
            m62504S4().replaceData(arrayList2);
            return;
        }
        C44631b0 c44631b0M62503Q6 = m62503Q4();
        if (c44631b0M62503Q6 != null && (recyclerView = c44631b0M62503Q6.f98988n) != null) {
            recyclerView.setVisibility(8);
        }
        m62505T4().m63076k("");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        ToggleSymbolsFragment toggleSymbolsFragment;
        if (m62426Z4().length() == 0) {
            showEmpty();
            return;
        }
        Fragment parentFragment = getParentFragment();
        TradeItemBean tradeItemBean = null;
        if (parentFragment instanceof ToggleSymbolsFragment) {
            toggleSymbolsFragment = (ToggleSymbolsFragment) parentFragment;
        } else {
            toggleSymbolsFragment = null;
        }
        SymbolsListAdapter symbolsListAdapterM62429a5 = m62429a5();
        if (toggleSymbolsFragment != null) {
            tradeItemBean = toggleSymbolsFragment.getTradeItemBean();
        }
        symbolsListAdapterM62429a5.m62740n(tradeItemBean);
        m62429a5().m62739m(-1);
        if (this.f50898h0) {
            m62505T4().m63078m();
        }
        Observable<List<TradeItemBean>> observableObserveOn = m62506U4().m62522d(m62426Z4(), true, "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_slide_symbols", m62419W4()).observeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToggleSymbolsListFragment.m62453j5(this.f51003b, (List) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.map(new Function() { // from class: com.kubi.spot.quote.market.v
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ToggleSymbolsListFragment.m62456k5(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.kubi.spot.quote.market.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                ToggleSymbolsListFragment.m62459l5(this.f50929b, (Collection) obj);
            }
        }, new C25558a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (m62408R4().m96299I()) {
            m62408R4().m96315Y(null);
            m62408R4().m96331y();
        }
        super.onDestroyView();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m62408R4().m96331y();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        LinearLayout linearLayout;
        RecyclerView recyclerView;
        super.showContent();
        m62505T4().m63077l(true);
        m62510g6(m62509Y4());
        C44631b0 c44631b0M62503Q4 = m62503Q4();
        if (c44631b0M62503Q4 != null && (recyclerView = c44631b0M62503Q4.f98987m) != null) {
            recyclerView.setVisibility(0);
        }
        C44631b0 c44631b0M62503Q5 = m62503Q4();
        if (c44631b0M62503Q5 != null && (linearLayout = c44631b0M62503Q5.f98983i) != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        LinearLayout linearLayout;
        RecyclerView recyclerView2;
        if (Intrinsics.areEqual(m62508X4(), "favor")) {
            C44631b0 c44631b0M62503Q4 = m62503Q4();
            if (c44631b0M62503Q4 != null && (recyclerView2 = c44631b0M62503Q4.f98987m) != null) {
                recyclerView2.setVisibility(8);
            }
            showContentView();
            C44631b0 c44631b0M62503Q5 = m62503Q4();
            if (c44631b0M62503Q5 != null && (linearLayout = c44631b0M62503Q5.f98983i) != null) {
                linearLayout.setVisibility(0);
            }
            if (!SpotDepend.f51244a.m63036f().c()) {
                C44631b0 c44631b0M62503Q6 = m62503Q4();
                if (c44631b0M62503Q6 != null && (baseTextView2 = c44631b0M62503Q6.f98991q) != null) {
                    baseTextView2.setVisibility(0);
                }
            } else {
                C44631b0 c44631b0M62503Q7 = m62503Q4();
                if (c44631b0M62503Q7 != null && (baseTextView = c44631b0M62503Q7.f98991q) != null) {
                    baseTextView.setVisibility(8);
                }
            }
        } else {
            showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, null);
        }
        m62505T4().m63077l(false);
        C44631b0 c44631b0M62503Q8 = m62503Q4();
        if (c44631b0M62503Q8 != null && (recyclerView = c44631b0M62503Q8.f98988n) != null) {
            recyclerView.setVisibility(8);
        }
    }
}
