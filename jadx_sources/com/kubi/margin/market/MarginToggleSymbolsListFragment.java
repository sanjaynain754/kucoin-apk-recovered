package com.kubi.margin.market;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.LeverSymbol;
import com.kubi.margin.entity.LeverSymbolMarket;
import com.kubi.margin.entity.WsMarketSnapshotEntity;
import com.kubi.margin.helper.MarginSortHelper;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mp.C42579a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p206dp.C36943v;
import p402kf.C41016c;
import p569qq.C43852m;
import p698vp.C45612b;
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
import w00.C45681e;

/* JADX INFO: compiled from: MarginToggleSymbolsListFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010(\u001a\u00020\fH\u0014J\u001a\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J$\u0010A\u001a\u00020<2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020D0C2\u0006\u0010E\u001a\u00020\fH\u0002J\b\u0010F\u001a\u00020<H\u0016J\b\u0010G\u001a\u00020<H\u0016J\b\u0010H\u001a\u00020<H\u0016J\b\u0010I\u001a\u00020<H\u0016J\b\u0010J\u001a\u00020<H\u0002J\u0010\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020:H\u0016J\b\u0010M\u001a\u00020<H\u0016J\u0016\u0010N\u001a\u00020<2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170OH\u0002J\u0016\u0010P\u001a\u00020<2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RH\u0002J\u0012\u0010T\u001a\u00020<2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010VJ\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00170X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00170OH\u0002J\b\u0010Z\u001a\u00020<H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b!\u0010\u0014R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b+\u0010,R#\u0010.\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b1\u00102R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u001707j\b\u0012\u0004\u0012\u00020\u0017`8X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\\"}, m90084d2 = {"Lcom/kubi/margin/market/MarginToggleSymbolsListFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "<init>", "()V", "bmarginFragmentLayoutToggleSymbolsBinding", "Lcom/kubi/margin/databinding/BmarginFragmentLayoutToggleSymbolsBinding;", "getBmarginFragmentLayoutToggleSymbolsBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentLayoutToggleSymbolsBinding;", "bmarginFragmentLayoutToggleSymbolsBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "tabCode", "", "getTabCode", "()Ljava/lang/String;", "tabCode$delegate", "currentTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getCurrentTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "currentTradeItemBean$delegate", "mSortHelper", "Lcom/kubi/margin/helper/MarginSortHelper;", "getMSortHelper", "()Lcom/kubi/margin/helper/MarginSortHelper;", "mSortHelper$delegate", "relationCode", "getRelationCode", "relationCode$delegate", "model", "Lcom/kubi/margin/market/MarginTradeListModel;", "getModel", "()Lcom/kubi/margin/market/MarginTradeListModel;", "model$delegate", "getLayout", "tradeListAdapter", "Lcom/kubi/margin/market/MarginSymbolsListAdapter;", "getTradeListAdapter", "()Lcom/kubi/margin/market/MarginSymbolsListAdapter;", "tradeListAdapter$delegate", "mPop", "Lcom/zyyoona7/popup/EasyPopup;", "kotlin.jvm.PlatformType", "getMPop", "()Lcom/zyyoona7/popup/EasyPopup;", "mPop$delegate", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hasInit", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initPopView", "adapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", ViewProps.POSITION, "showEmpty", "showContent", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "loadData", "getRestfulData", "resetWs", "registerWsData", "registerFavorAndRelationWsData", "", "collectQuoteSnapshot", "msgObs", "Lio/reactivex/subjects/PublishSubject;", "Lcom/kubi/network/websocket/model/Message;", "sortFilterData", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "sortData", "", "list", "onDestroyView", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginToggleSymbolsListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginToggleSymbolsListFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,565:1\n147#2,16:566\n1#3:582\n1869#4,2:583\n774#4:585\n865#4,2:586\n808#4,11:592\n1869#4,2:603\n808#4,11:609\n1869#4,2:620\n160#5,4:588\n160#5,4:605\n*S KotlinDebug\n*F\n+ 1 MarginToggleSymbolsListFragment.kt\ncom/kubi/margin/market/MarginToggleSymbolsListFragment\n*L\n74#1:566,16\n480#1:583,2\n539#1:585\n539#1:586,2\n454#1:592,11\n456#1:603,2\n507#1:609,11\n510#1:620,2\n449#1:588,4\n503#1:605,4\n*E\n"})
public final class MarginToggleSymbolsListFragment extends OldBaseFragment implements InterfaceC37770a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33223U = C45681e.m100799e(this, new Function1<MarginToggleSymbolsListFragment, C36943v>() { // from class: com.kubi.margin.market.MarginToggleSymbolsListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36943v invoke(@NotNull MarginToggleSymbolsListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36943v.m82756a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36943v, Unit>() { // from class: com.kubi.margin.market.MarginToggleSymbolsListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36943v it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36943v c36943v) {
            invoke(c36943v);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33224V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.n1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginToggleSymbolsListFragment.m38931c6(this.f33378b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33225W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.y1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsListFragment.m38925a6(this.f33589b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33226X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.j2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsListFragment.m38903Q4(this.f33354b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33227Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.u2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsListFragment.m38957n5(this.f33573b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f33228Z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.f3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsListFragment.m38906R5(this.f33273b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f33229a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.q3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsListFragment.m38960o5();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f33230b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.x3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsListFragment.m38928b6(this.f33586b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f33231c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.y3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginToggleSymbolsListFragment.m38954m5(this.f33590b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final C37787r f33232d0 = new C37787r(this);

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final ArrayList<TradeItemBean> f33233e0 = new ArrayList<>();

    /* JADX INFO: renamed from: f0 */
    public boolean f33234f0;

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f33222h0 = {Reflection.property1(new PropertyReference1Impl(MarginToggleSymbolsListFragment.class, "bmarginFragmentLayoutToggleSymbolsBinding", "getBmarginFragmentLayoutToggleSymbolsBinding()Lcom/kubi/margin/databinding/BmarginFragmentLayoutToggleSymbolsBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f33221g0 = new Companion(null);

    /* JADX INFO: compiled from: MarginToggleSymbolsListFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/margin/market/MarginToggleSymbolsListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/MarginToggleSymbolsListFragment;", "tabCode", "", "tradeType", "", "relationCode", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "PAGE_ID", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ MarginToggleSymbolsListFragment newInstance$default(Companion companion, String str, int i11, String str2, TradeItemBean tradeItemBean, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                str2 = null;
            }
            if ((i12 & 8) != 0) {
                tradeItemBean = null;
            }
            return companion.newInstance(str, i11, str2, tradeItemBean);
        }

        @JvmStatic
        @NotNull
        public final MarginToggleSymbolsListFragment newInstance(@NotNull String tabCode, int tradeType, @Nullable String relationCode, @Nullable TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tabCode, "tabCode");
            MarginToggleSymbolsListFragment marginToggleSymbolsListFragment = new MarginToggleSymbolsListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("data", tabCode);
            bundle.putParcelable("data_1", tradeItemBean);
            bundle.putInt("tradeType", tradeType);
            bundle.putString("coin", relationCode);
            marginToggleSymbolsListFragment.setArguments(bundle);
            return marginToggleSymbolsListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsListFragment$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17787a extends TypeToken<WsMarketSnapshotEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsListFragment$b */
    /* JADX INFO: compiled from: MarginToggleSymbolsListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/market/MarginToggleSymbolsListFragment$loadData$1$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17788b extends C24223c1 {
        public C17788b() {
            super(null, false);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable throwable) throws Exception {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (MarginToggleSymbolsListFragment.this.isDetached() || MarginToggleSymbolsListFragment.this.getParentFragment() == null) {
                return;
            }
            FragmentActivity activity = MarginToggleSymbolsListFragment.this.getActivity();
            if (C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null)) {
                return;
            }
            super.accept(throwable);
            if (MarginToggleSymbolsListFragment.this.f33233e0.isEmpty()) {
                final MarginToggleSymbolsListFragment marginToggleSymbolsListFragment = MarginToggleSymbolsListFragment.this;
                marginToggleSymbolsListFragment.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_network_error, new View.OnClickListener() { // from class: com.kubi.margin.market.b4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MarginToggleSymbolsListFragment.C17788b.m39006f(marginToggleSymbolsListFragment, view);
                    }
                });
            }
            MarginToggleSymbolsListFragment.this.mo22379g(true);
        }

        /* JADX INFO: renamed from: f */
        public static final void m39006f(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, View view) {
            marginToggleSymbolsListFragment.m38939g5();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsListFragment$c */
    /* JADX INFO: compiled from: MarginToggleSymbolsListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/margin/market/MarginToggleSymbolsListFragment$onViewCreated$8", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17789c extends RecyclerView.OnScrollListener {
        public C17789c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (MarginToggleSymbolsListFragment.this.m38998T4().m96299I()) {
                MarginToggleSymbolsListFragment.this.m38998T4().m96331y();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.MarginToggleSymbolsListFragment$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17790d extends TypeToken<WsMarketSnapshotEntity> {
    }

    /* JADX INFO: renamed from: A5 */
    public static final CharSequence m38858A5(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String symbol = it.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return symbol;
    }

    /* JADX INFO: renamed from: C4 */
    public static final boolean m38861C4(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return marginToggleSymbolsListFragment.isShowing() && ((Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot")) || (Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "relation") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot")) || Intrinsics.areEqual(it.getTopic(), DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{marginToggleSymbolsListFragment.m39002X4()}, null, 2, null)));
    }

    /* JADX INFO: renamed from: D4 */
    public static final boolean m38864D4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: D5 */
    public static final boolean m38865D5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return marginToggleSymbolsListFragment.isShowing() && ((Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot")) || (Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "relation") && Intrinsics.areEqual(it.getSubject(), "trade.snapshot")) || Intrinsics.areEqual(it.getTopic(), DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{marginToggleSymbolsListFragment.m39002X4()}, null, 2, null)));
    }

    /* JADX INFO: renamed from: E4 */
    public static final Object m38867E4(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C17787a().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) objM66914d;
        return wsMarketSnapshotEntity == null ? new Object() : wsMarketSnapshotEntity;
    }

    /* JADX INFO: renamed from: E5 */
    public static final boolean m38868E5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: F4 */
    public static final Object m38870F4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: F5 */
    public static final Object m38871F5(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C17790d().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) objM66914d;
        return wsMarketSnapshotEntity == null ? new Object() : wsMarketSnapshotEntity;
    }

    /* JADX INFO: renamed from: G4 */
    public static final boolean m38873G4(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: G5 */
    public static final Object m38874G5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: H4 */
    public static final boolean m38876H4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: H5 */
    public static final boolean m38877H5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: I4 */
    public static final List m38879I4(List it) {
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
    public static final boolean m38880I5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: J4 */
    public static final List m38882J4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: J5 */
    public static final List m38883J5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj : it) {
            if (obj instanceof WsMarketSnapshotEntity) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Collection m38885K4(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, List it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) it2.next();
            Iterator<T> it3 = marginToggleSymbolsListFragment.f33233e0.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!Intrinsics.areEqual(((TradeItemBean) next).getSymbol(), wsMarketSnapshotEntity.getSymbolCode()));
            TradeItemBean tradeItemBean = (TradeItemBean) next;
            if (tradeItemBean != null) {
                wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
            }
        }
        return marginToggleSymbolsListFragment.m38999U4().m38382L(marginToggleSymbolsListFragment.f33233e0, Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor"), marginToggleSymbolsListFragment.getTradeType());
    }

    /* JADX INFO: renamed from: K5 */
    public static final List m38886K5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: L4 */
    public static final Collection m38888L4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: L5 */
    public static final Collection m38889L5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, List it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) it2.next();
            Iterator<T> it3 = marginToggleSymbolsListFragment.f33233e0.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!Intrinsics.areEqual(((TradeItemBean) next).getSymbol(), wsMarketSnapshotEntity.getSymbolCode()));
            TradeItemBean tradeItemBean = (TradeItemBean) next;
            if (tradeItemBean != null) {
                wsMarketSnapshotEntity.covertToTradeItemBean(tradeItemBean);
            }
        }
        return marginToggleSymbolsListFragment.m38999U4().m38382L(marginToggleSymbolsListFragment.f33233e0, Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor"), marginToggleSymbolsListFragment.getTradeType());
    }

    /* JADX INFO: renamed from: M5 */
    public static final Collection m38892M5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: T5 */
    public static /* synthetic */ void m38909T5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = null;
        }
        marginToggleSymbolsListFragment.m38997S5(action);
    }

    /* JADX INFO: renamed from: U5 */
    public static final Collection m38911U5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return marginToggleSymbolsListFragment.m38999U4().m38382L(it, Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor"), marginToggleSymbolsListFragment.getTradeType());
    }

    /* JADX INFO: renamed from: V5 */
    public static final Collection m38913V5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m38924a5(final MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, final TradeItemBean tradeItemBean, final BaseQuickAdapter baseQuickAdapter, final int i11) throws Exception {
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c()) {
            Observable<Object> observableM39011b = marginToggleSymbolsListFragment.m39000V4().m39011b(tradeItemBean != null ? tradeItemBean.getSymbol() : null);
            if (observableM39011b != null) {
                Consumer<? super Object> consumer = new Consumer() { // from class: com.kubi.margin.market.m2
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        MarginToggleSymbolsListFragment.m38927b5(this.f33369b, tradeItemBean, baseQuickAdapter, i11, obj);
                    }
                };
                final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.n2
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginToggleSymbolsListFragment.m38930c5((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableM39011b.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.o2
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MarginToggleSymbolsListFragment.m38933d5(function1, obj);
                    }
                });
                if (disposableSubscribe != null) {
                    DisposableKt.addTo(disposableSubscribe, marginToggleSymbolsListFragment.getDestroyDisposable());
                }
            }
        } else if (TextUtils.isEmpty(c42579a.m93347g().d0().id) || !c42579a.m93347g().o()) {
            c42579a.m93345e().mo50678C(tradeItemBean, new Function1() { // from class: com.kubi.margin.market.q2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38937f5(this.f33391b, tradeItemBean, ((Boolean) obj).booleanValue());
                }
            });
            if (C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C45612b.m100697c(tradeItemBean)) : null) || !Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor")) {
                if (C27025c.m66566d(Boolean.valueOf(C45612b.m100697c(tradeItemBean)))) {
                    C43852m.m96591c("B4sidebar", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", true), 4, null);
                } else {
                    C43852m.m96591c("B4sidebar", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
                }
                baseQuickAdapter.notifyItemChanged(i11);
            } else {
                marginToggleSymbolsListFragment.f33233e0.remove(tradeItemBean);
                baseQuickAdapter.remove(i11);
                if (marginToggleSymbolsListFragment.f33233e0.isEmpty()) {
                    marginToggleSymbolsListFragment.showEmpty();
                    marginToggleSymbolsListFragment.f33232d0.m85236i(false);
                } else {
                    marginToggleSymbolsListFragment.m38994B5();
                }
                C43852m.m96591c("B4sidebar", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
            }
        } else {
            IUserService.O(c42579a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.market.p2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginToggleSymbolsListFragment.m38935e5();
                }
            }), 1, (Object) null);
        }
        marginToggleSymbolsListFragment.m38998T4().m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final void m38927b5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, TradeItemBean tradeItemBean, BaseQuickAdapter baseQuickAdapter, int i11, Object obj) throws Exception {
        MarginToggleSymbolsFragment marginToggleSymbolsFragment;
        ToastCompat.m66441G(marginToggleSymbolsListFragment.mContext.getString(C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C45612b.m100697c(tradeItemBean)) : null) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
        if (tradeItemBean != null) {
            tradeItemBean.setFavor(!C27025c.m66566d(Boolean.valueOf(C45612b.m100697c(tradeItemBean))));
        }
        if (C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C45612b.m100697c(tradeItemBean)) : null) || !Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor")) {
            if (C27025c.m66566d(Boolean.valueOf(C45612b.m100697c(tradeItemBean)))) {
                C43852m.m96591c("B4sidebar", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", true), 4, null);
            } else {
                C43852m.m96591c("B4sidebar", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
            }
            baseQuickAdapter.notifyItemChanged(i11);
        } else {
            C43852m.m96591c("B4sidebar", "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", false), 4, null);
            marginToggleSymbolsListFragment.f33233e0.remove(tradeItemBean);
            if (marginToggleSymbolsListFragment.f33233e0.isEmpty()) {
                marginToggleSymbolsListFragment.showEmpty();
                marginToggleSymbolsListFragment.f33232d0.m85236i(false);
            } else {
                marginToggleSymbolsListFragment.m38994B5();
            }
        }
        if (marginToggleSymbolsListFragment.isDetached() || marginToggleSymbolsListFragment.getParentFragment() == null || (marginToggleSymbolsFragment = (MarginToggleSymbolsFragment) marginToggleSymbolsListFragment.getParentFragment()) == null) {
            return;
        }
        marginToggleSymbolsFragment.updateFavor(tradeItemBean);
    }

    /* JADX INFO: renamed from: b6 */
    public static final MarginSymbolsListAdapter m38928b6(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        Bundle arguments;
        int tradeType = marginToggleSymbolsListFragment.getTradeType();
        String strM39002X4 = marginToggleSymbolsListFragment.m39002X4();
        Fragment parentFragment = marginToggleSymbolsListFragment.getParentFragment();
        return new MarginSymbolsListAdapter(marginToggleSymbolsListFragment, tradeType, strM39002X4, C27025c.m66566d((parentFragment == null || (arguments = parentFragment.getArguments()) == null) ? null : Boolean.valueOf(arguments.getBoolean("isMarket"))), marginToggleSymbolsListFragment.m38996S4());
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m38930c5(Throwable th2) {
        if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "420000")) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, 150), new Object[0]);
        }
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m38935e5() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m38937f5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, TradeItemBean tradeItemBean, boolean z11) {
        if (z11) {
            ToastCompat.m66441G(marginToggleSymbolsListFragment.mContext.getString(C27025c.m66566d(tradeItemBean != null ? Boolean.valueOf(C45612b.m100697c(tradeItemBean)) : null) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    private final int getTradeType() {
        return ((Number) this.f33224V.getValue()).intValue();
    }

    /* JADX INFO: renamed from: h5 */
    public static final CharSequence m38941h5(LeverSymbol it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getSymbolCode());
    }

    /* JADX INFO: renamed from: j5 */
    public static final Collection m38945j5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor")) {
            C42579a.f94275a.m93345e().mo50704g(it);
        }
        return marginToggleSymbolsListFragment.m38999U4().m38382L(it, Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor"), marginToggleSymbolsListFragment.getTradeType());
    }

    /* JADX INFO: renamed from: k5 */
    public static final Collection m38948k5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Collection) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m5 */
    public static final C43724b m38954m5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        Context mContext = marginToggleSymbolsListFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        return new BubbleEasyPopup(mContext).m96307Q(R$layout.bmargin_popup_favor).m96316Z(true).m96322p();
    }

    /* JADX INFO: renamed from: n5 */
    public static final MarginSortHelper m38957n5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        C36943v c36943vM38995R4 = marginToggleSymbolsListFragment.m38995R4();
        Intrinsics.checkNotNull(c36943vM38995R4);
        FrameLayout llSort = c36943vM38995R4.f82009k;
        Intrinsics.checkNotNullExpressionValue(llSort, "llSort");
        return new MarginSortHelper(llSort);
    }

    /* JADX INFO: renamed from: o5 */
    public static final MarginTradeListModel m38960o5() {
        return new MarginTradeListModel();
    }

    /* JADX INFO: renamed from: s5 */
    public static final boolean m38972s5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        RecyclerView recyclerView;
        view.setBackgroundResource(R$color.emphasis4);
        if (marginToggleSymbolsListFragment.getTradeListAdapter().getF33217n() != -1) {
            marginToggleSymbolsListFragment.getTradeListAdapter().notifyItemChanged(marginToggleSymbolsListFragment.getTradeListAdapter().getF33217n());
        }
        marginToggleSymbolsListFragment.getTradeListAdapter().m38842n(i11);
        marginToggleSymbolsListFragment.m39003Y4(marginToggleSymbolsListFragment.getTradeListAdapter(), i11);
        C36943v c36943vM38995R4 = marginToggleSymbolsListFragment.m38995R4();
        RecyclerView.LayoutManager layoutManager = (c36943vM38995R4 == null || (recyclerView = c36943vM38995R4.f82010l) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            boolean z11 = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == i11 || linearLayoutManager.findFirstVisibleItemPosition() == i11;
            ((BubbleLinearLayout) marginToggleSymbolsListFragment.m38998T4().m96332z(R$id.bbLayout)).setArrowDirection(z11 ? BubbleStyle.ArrowDirection.Up : BubbleStyle.ArrowDirection.Down);
            marginToggleSymbolsListFragment.m38998T4().m96320e0(view, z11 ? 2 : 1, 0, 0, 0);
        }
        return true;
    }

    /* JADX INFO: renamed from: t5 */
    public static final Unit m38975t5() {
        C43852m.m96591c("B4sidebar", "sideMarketLogin", null, null, 12, null);
        IUserService.O(C42579a.f94275a.m93347g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.margin.market.x1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginToggleSymbolsListFragment.m38978u5();
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m38978u5() {
        InterfaceC37754f.a.m85140l(C37304a.f82764a, null, null, null, null, null, null, 63, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B5 */
    public void m38994B5() throws Exception {
        this.f33232d0.m85234g(new Action() { // from class: com.kubi.margin.market.l2
            @Override // io.reactivex.functions.Action
            public final void run() {
                MarginToggleSymbolsListFragment.m38862C5(this.f33363b);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public final C36943v m38995R4() {
        return (C36943v) this.f33223U.getValue(this, f33222h0[0]);
    }

    /* JADX INFO: renamed from: S4 */
    public final TradeItemBean m38996S4() {
        return (TradeItemBean) this.f33226X.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    public final C43724b m38998T4() {
        return (C43724b) this.f33231c0.getValue();
    }

    /* JADX INFO: renamed from: U4 */
    public final MarginSortHelper m38999U4() {
        return (MarginSortHelper) this.f33227Y.getValue();
    }

    /* JADX INFO: renamed from: V4 */
    public final MarginTradeListModel m39000V4() {
        return (MarginTradeListModel) this.f33229a0.getValue();
    }

    /* JADX INFO: renamed from: W4 */
    public final String m39001W4() {
        return (String) this.f33228Z.getValue();
    }

    /* JADX INFO: renamed from: X4 */
    public final String m39002X4() {
        return (String) this.f33225W.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_layout_toggle_symbols;
    }

    public final MarginSymbolsListAdapter getTradeListAdapter() {
        return (MarginSymbolsListAdapter) this.f33230b0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        KcPrimaryButton kcPrimaryButton;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView recyclerView4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36943v c36943vM38995R4 = m38995R4();
        if (c36943vM38995R4 != null && (recyclerView4 = c36943vM38995R4.f82010l) != null) {
            recyclerView4.setAdapter(getTradeListAdapter());
        }
        C36943v c36943vM38995R5 = m38995R4();
        if (c36943vM38995R5 != null && (recyclerView3 = c36943vM38995R5.f82010l) != null && (itemAnimator = recyclerView3.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(0L);
        }
        C36943v c36943vM38995R6 = m38995R4();
        if (c36943vM38995R6 != null && (recyclerView2 = c36943vM38995R6.f82010l) != null) {
            recyclerView2.setHasFixedSize(true);
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.o1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38990y5(this.f33381b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.margin.market.p1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginToggleSymbolsListFragment.m38963p5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.q1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38966q5((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.r1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginToggleSymbolsListFragment.m38969r5(function2, obj);
            }
        }));
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        showLoadingView(C27046k.m66699n(mContext, R$color.c_bulletLayer), 17);
        getTradeListAdapter().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.margin.market.s1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                return MarginToggleSymbolsListFragment.m38972s5(this.f33449a, baseQuickAdapter, view2, i11);
            }
        });
        C36943v c36943vM38995R7 = m38995R4();
        if (c36943vM38995R7 != null && (kcPrimaryButton = c36943vM38995R7.f82013o) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.margin.market.t1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginToggleSymbolsListFragment.m38975t5();
                }
            }, 1, null);
        }
        C36943v c36943vM38995R8 = m38995R4();
        if (c36943vM38995R8 != null && (linearLayout3 = c36943vM38995R8.f82008j) != null) {
            C27046k.m66711z(linearLayout3, 0L, new Function0() { // from class: com.kubi.margin.market.u1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginToggleSymbolsListFragment.m38981v5(this.f33572b);
                }
            }, 1, null);
        }
        C36943v c36943vM38995R9 = m38995R4();
        if (c36943vM38995R9 != null && (linearLayout2 = c36943vM38995R9.f82003e) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.margin.market.v1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginToggleSymbolsListFragment.m38984w5(this.f33576b);
                }
            }, 1, null);
        }
        C36943v c36943vM38995R10 = m38995R4();
        if (c36943vM38995R10 != null && (linearLayout = c36943vM38995R10.f82002d) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.margin.market.w1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginToggleSymbolsListFragment.m38987x5(this.f33580b);
                }
            }, 1, null);
        }
        C36943v c36943vM38995R11 = m38995R4();
        if (c36943vM38995R11 == null || (recyclerView = c36943vM38995R11.f82010l) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C17789c());
    }

    /* JADX INFO: renamed from: z5 */
    public final void m39004z5(List<? extends TradeItemBean> list) {
        List listChunked = CollectionsKt.chunked(list, 80);
        getVisibleDisposable().clear();
        Iterator it = listChunked.iterator();
        while (it.hasNext()) {
            this.f33232d0.m85233f("/market/snapshot_app:%s", CollectionsKt.joinToString$default((List) it.next(), ",", null, null, 0, null, new Function1() { // from class: com.kubi.margin.market.h3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38858A5((TradeItemBean) obj);
                }
            }, 30, null));
        }
        m38993B4(this.f33232d0.m85231d());
    }

    /* JADX INFO: renamed from: C5 */
    public static final void m38862C5(final MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        if (!Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "favor") && !Intrinsics.areEqual(marginToggleSymbolsListFragment.m39002X4(), "relation")) {
            marginToggleSymbolsListFragment.getVisibleDisposable().clear();
            CompositeDisposable visibleDisposable = marginToggleSymbolsListFragment.getVisibleDisposable();
            PublishSubject<Message> publishSubjectM85233f = marginToggleSymbolsListFragment.f33232d0.m85233f("/market/snapshot_app:%s", marginToggleSymbolsListFragment.m39002X4());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.r2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginToggleSymbolsListFragment.m38865D5(this.f33399b, (Message) obj));
                }
            };
            Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.market.x2
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginToggleSymbolsListFragment.m38868E5(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.y2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38871F5((Message) obj);
                }
            };
            Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.margin.market.z2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginToggleSymbolsListFragment.m38874G5(function2, obj);
                }
            }).buffer(1200L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94127f());
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.market.a3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginToggleSymbolsListFragment.m38877H5((List) obj));
                }
            };
            Observable observableFilter2 = observableObserveOn.filter(new Predicate() { // from class: com.kubi.margin.market.b3
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginToggleSymbolsListFragment.m38880I5(function3, obj);
                }
            });
            final Function1 function4 = new Function1() { // from class: com.kubi.margin.market.c3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38883J5((List) obj);
                }
            };
            Observable map = observableFilter2.map(new Function() { // from class: com.kubi.margin.market.d3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginToggleSymbolsListFragment.m38886K5(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.margin.market.e3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38889L5(this.f33266b, (List) obj);
                }
            };
            Observable observableObserveOn2 = map.map(new Function() { // from class: com.kubi.margin.market.g3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginToggleSymbolsListFragment.m38892M5(function5, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function6 = new Function1() { // from class: com.kubi.margin.market.s2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38895N5(this.f33450b, (Collection) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.t2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginToggleSymbolsListFragment.m38898O5(function6, obj);
                }
            };
            final Function1 function7 = new Function1() { // from class: com.kubi.margin.market.v2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38901P5((Throwable) obj);
                }
            };
            visibleDisposable.add(observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.w2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginToggleSymbolsListFragment.m38904Q5(function7, obj);
                }
            }));
            return;
        }
        marginToggleSymbolsListFragment.m39004z5(marginToggleSymbolsListFragment.f33233e0);
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m38891M4(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Collection collection) {
        if (!marginToggleSymbolsListFragment.isDetached() && marginToggleSymbolsListFragment.getParentFragment() != null) {
            marginToggleSymbolsListFragment.showContent();
            marginToggleSymbolsListFragment.getTradeListAdapter().replaceData(collection);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m38894N4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N5 */
    public static final Unit m38895N5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Collection collection) {
        if (!marginToggleSymbolsListFragment.isDetached() && marginToggleSymbolsListFragment.getParentFragment() != null) {
            marginToggleSymbolsListFragment.showContent();
            marginToggleSymbolsListFragment.getTradeListAdapter().replaceData(collection);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m38897O4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O5 */
    public static final void m38898O5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m38900P4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m38901P5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final TradeItemBean m38903Q4(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marginToggleSymbolsListFragment.getArguments();
        if (arguments != null) {
            tradeItemBean = (TradeItemBean) arguments.getParcelable("data_1");
        } else {
            tradeItemBean = null;
        }
        Intrinsics.checkNotNull(tradeItemBean);
        return tradeItemBean;
    }

    /* JADX INFO: renamed from: Q5 */
    public static final void m38904Q5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R5 */
    public static final String m38906R5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        String string;
        Bundle arguments = marginToggleSymbolsListFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("coin");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: W5 */
    public static final Unit m38915W5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Action action, Collection collection) throws Exception {
        marginToggleSymbolsListFragment.getTradeListAdapter().replaceData(collection);
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X5 */
    public static final void m38917X5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y5 */
    public static final Unit m38919Y5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final void m38921Z4(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        if (marginToggleSymbolsListFragment.getTradeListAdapter().getF33217n() != -1) {
            marginToggleSymbolsListFragment.getTradeListAdapter().notifyItemChanged(marginToggleSymbolsListFragment.getTradeListAdapter().getF33217n());
        }
        marginToggleSymbolsListFragment.getTradeListAdapter().m38842n(-1);
    }

    /* JADX INFO: renamed from: Z5 */
    public static final void m38922Z5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a6 */
    public static final String m38925a6(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        String string;
        Bundle arguments = marginToggleSymbolsListFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: c6 */
    public static final int m38931c6(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        Integer numValueOf;
        Bundle arguments = marginToggleSymbolsListFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: d5 */
    public static final void m38933d5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public final void m38939g5() {
        final String strM39002X4;
        MarginToggleSymbolsFragment marginToggleSymbolsFragment;
        ArrayList<LeverSymbolMarket> leverSymbolList;
        LeverSymbolMarket leverSymbolMarketPrevious;
        List<LeverSymbol> symbols;
        if (!Intrinsics.areEqual(m39002X4(), "favor") && !Intrinsics.areEqual(m39002X4(), "relation")) {
            Fragment parentFragment = getParentFragment();
            String strJoinToString$default = null;
            if (parentFragment instanceof MarginToggleSymbolsFragment) {
                marginToggleSymbolsFragment = (MarginToggleSymbolsFragment) parentFragment;
            } else {
                marginToggleSymbolsFragment = null;
            }
            if (marginToggleSymbolsFragment != null && (leverSymbolList = marginToggleSymbolsFragment.getLeverSymbolList()) != null) {
                ListIterator<LeverSymbolMarket> listIterator = leverSymbolList.listIterator(leverSymbolList.size());
                do {
                    if (listIterator.hasPrevious()) {
                        leverSymbolMarketPrevious = listIterator.previous();
                    } else {
                        leverSymbolMarketPrevious = null;
                        break;
                    }
                } while (!Intrinsics.areEqual(leverSymbolMarketPrevious.getMarketCode(), C27041f.m66668h(m39002X4())));
                LeverSymbolMarket leverSymbolMarket = leverSymbolMarketPrevious;
                if (leverSymbolMarket != null && (symbols = leverSymbolMarket.getSymbols()) != null) {
                    strJoinToString$default = CollectionsKt.joinToString$default(symbols, null, null, null, 0, null, new Function1() { // from class: com.kubi.margin.market.z3
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MarginToggleSymbolsListFragment.m38941h5((LeverSymbol) obj);
                        }
                    }, 31, null);
                }
            }
            strM39002X4 = C27041f.m66668h(strJoinToString$default);
        } else {
            strM39002X4 = m39002X4();
        }
        if (strM39002X4.length() == 0) {
            showEmpty();
            return;
        }
        Fragment parentFragment2 = getParentFragment();
        Intrinsics.checkNotNull(parentFragment2, "null cannot be cast to non-null type com.kubi.margin.market.MarginToggleSymbolsFragment");
        getTradeListAdapter().m38843o(((MarginToggleSymbolsFragment) parentFragment2).getTradeItemBean());
        getTradeListAdapter().m38842n(-1);
        C42579a.f94275a.m93346f().mo59985B(new Consumer() { // from class: com.kubi.margin.market.a4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginToggleSymbolsListFragment.m38943i5(this.f33242b, strM39002X4, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public static final void m38943i5(final MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, String str, List list) {
        Observable<List<TradeItemBean>> observableObserveOn = marginToggleSymbolsListFragment.m39000V4().m39012c(str, false, "android/" + DataInitManager.f21486a.m23668i().mo23678f() + "_slide_symbols", marginToggleSymbolsListFragment.m39001W4(), marginToggleSymbolsListFragment.getTradeType()).observeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.h2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38945j5(this.f33283b, (List) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.map(new Function() { // from class: com.kubi.margin.market.i2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginToggleSymbolsListFragment.m38948k5(function1, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.kubi.margin.market.k2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                MarginToggleSymbolsListFragment.m38951l5(this.f33359b, (Collection) obj);
            }
        }, marginToggleSymbolsListFragment.new C17788b());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, marginToggleSymbolsListFragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m38951l5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Collection collection) throws Exception {
        if (!marginToggleSymbolsListFragment.isDetached() && marginToggleSymbolsListFragment.getParentFragment() != null) {
            marginToggleSymbolsListFragment.f33234f0 = true;
            marginToggleSymbolsListFragment.f33233e0.clear();
            marginToggleSymbolsListFragment.f33233e0.addAll(collection);
            if (marginToggleSymbolsListFragment.f33233e0.isEmpty()) {
                marginToggleSymbolsListFragment.showEmpty();
                marginToggleSymbolsListFragment.f33232d0.m85236i(false);
            } else {
                marginToggleSymbolsListFragment.showContent();
                marginToggleSymbolsListFragment.getTradeListAdapter().replaceData(collection);
                marginToggleSymbolsListFragment.mo22379g(true);
            }
        }
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m38963p5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m38966q5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m38969r5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m38981v5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        marginToggleSymbolsListFragment.m38999U4().m38379C();
        m38909T5(marginToggleSymbolsListFragment, null, 1, null);
        C43852m.m96591c("B4sidebar", "sideMarketNameSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m38984w5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        marginToggleSymbolsListFragment.m38999U4().m38381G();
        m38909T5(marginToggleSymbolsListFragment, null, 1, null);
        C43852m.m96591c("B4sidebar", "sideMarketPriceSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m38987x5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment) {
        marginToggleSymbolsListFragment.m38999U4().m38390w();
        m38909T5(marginToggleSymbolsListFragment, null, 1, null);
        C43852m.m96591c("B4sidebar", "sideMarketChangeSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m38990y5(MarginToggleSymbolsListFragment marginToggleSymbolsListFragment, Boolean bool) {
        marginToggleSymbolsListFragment.getTradeListAdapter().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m38993B4(PublishSubject<Message> publishSubject) {
        CompositeDisposable visibleDisposable = getVisibleDisposable();
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.i3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarginToggleSymbolsListFragment.m38861C4(this.f33289b, (Message) obj));
            }
        };
        Observable<Message> observableObserveOn = publishSubject.filter(new Predicate() { // from class: com.kubi.margin.market.n3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarginToggleSymbolsListFragment.m38864D4(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.o3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38867E4((Message) obj);
            }
        };
        Observable observableBuffer = observableObserveOn.map(new Function() { // from class: com.kubi.margin.market.p3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginToggleSymbolsListFragment.m38870F4(function2, obj);
            }
        }).buffer(1200L, TimeUnit.MILLISECONDS);
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.market.r3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarginToggleSymbolsListFragment.m38873G4((List) obj));
            }
        };
        Observable observableFilter = observableBuffer.filter(new Predicate() { // from class: com.kubi.margin.market.s3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarginToggleSymbolsListFragment.m38876H4(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.market.t3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38879I4((List) obj);
            }
        };
        Observable observableObserveOn2 = observableFilter.map(new Function() { // from class: com.kubi.margin.market.u3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginToggleSymbolsListFragment.m38882J4(function4, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function5 = new Function1() { // from class: com.kubi.margin.market.v3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38885K4(this.f33577b, (List) obj);
            }
        };
        Observable observableObserveOn3 = observableObserveOn2.map(new Function() { // from class: com.kubi.margin.market.w3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginToggleSymbolsListFragment.m38888L4(function5, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function6 = new Function1() { // from class: com.kubi.margin.market.j3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38891M4(this.f33355b, (Collection) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.k3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginToggleSymbolsListFragment.m38894N4(function6, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.margin.market.l3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginToggleSymbolsListFragment.m38897O4((Throwable) obj);
            }
        };
        visibleDisposable.add(observableObserveOn3.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.m3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginToggleSymbolsListFragment.m38900P4(function7, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S5 */
    public final void m38997S5(@Nullable final Action action) {
        if (!isDetached() && getParentFragment() != null) {
            Observable observableObserveOn = Observable.just(this.f33233e0).observeOn(C42916f.m94126e());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.b2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38911U5(this.f33247b, (ArrayList) obj);
                }
            };
            Observable observableObserveOn2 = observableObserveOn.map(new Function() { // from class: com.kubi.margin.market.c2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginToggleSymbolsListFragment.m38913V5(function1, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.d2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38915W5(this.f33257b, action, (Collection) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.e2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginToggleSymbolsListFragment.m38917X5(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.market.f2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginToggleSymbolsListFragment.m38919Y5((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.g2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginToggleSymbolsListFragment.m38922Z5(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m39003Y4(final BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter, final int i11) {
        LinearLayout linearLayout;
        ImageView imageView;
        int i12;
        final TradeItemBean item = baseQuickAdapter.getItem(i11);
        if (item != null && m38998T4().m96292A() != null) {
            View viewM96292A = m38998T4().m96292A();
            if (viewM96292A != null && (imageView = (ImageView) viewM96292A.findViewById(R$id.ivFavor)) != null) {
                if (C27025c.m66566d(Boolean.valueOf(C45612b.m100697c(item)))) {
                    i12 = R$mipmap.ic_favor;
                } else {
                    i12 = R$drawable.ic_unfav_white;
                }
                imageView.setImageResource(i12);
            }
            m38998T4().m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.margin.market.z1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    MarginToggleSymbolsListFragment.m38921Z4(this.f33593b);
                }
            });
            View viewM96292A2 = m38998T4().m96292A();
            if (viewM96292A2 != null && (linearLayout = (LinearLayout) viewM96292A2.findViewById(R$id.llFavor)) != null) {
                C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.margin.market.a2
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginToggleSymbolsListFragment.m38924a5(this.f33238b, item, baseQuickAdapter, i11);
                    }
                }, 1, null);
            }
        }
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
        if (!C27025c.m66566d(boolValueOf) && m39002X4().length() != 0 && z11) {
            m38994B5();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (m38998T4().m96299I()) {
            m38998T4().m96315Y(null);
            m38998T4().m96331y();
        }
        super.onDestroyView();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m38998T4().m96331y();
        this.f33232d0.m85236i(false);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m38939g5();
        this.f33232d0.m85236i(true);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        LinearLayout linearLayout;
        RecyclerView recyclerView;
        super.showContent();
        m38999U4().m38387t(true);
        C36943v c36943vM38995R4 = m38995R4();
        if (c36943vM38995R4 != null && (recyclerView = c36943vM38995R4.f82010l) != null) {
            recyclerView.setVisibility(0);
        }
        C36943v c36943vM38995R5 = m38995R4();
        if (c36943vM38995R5 != null && (linearLayout = c36943vM38995R5.f82007i) != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        if (Intrinsics.areEqual(m39002X4(), "favor")) {
            showContentView();
            C36943v c36943vM38995R4 = m38995R4();
            if (c36943vM38995R4 != null && (linearLayout = c36943vM38995R4.f82007i) != null) {
                linearLayout.setVisibility(0);
            }
            C36943v c36943vM38995R5 = m38995R4();
            if (c36943vM38995R5 != null && (recyclerView = c36943vM38995R5.f82010l) != null) {
                recyclerView.setVisibility(8);
            }
            if (C42579a.f94275a.m93347g().c()) {
                C36943v c36943vM38995R6 = m38995R4();
                if (c36943vM38995R6 != null && (kcPrimaryButton2 = c36943vM38995R6.f82013o) != null) {
                    kcPrimaryButton2.setVisibility(8);
                }
            } else {
                C36943v c36943vM38995R7 = m38995R4();
                if (c36943vM38995R7 != null && (kcPrimaryButton = c36943vM38995R7.f82013o) != null) {
                    kcPrimaryButton.setVisibility(0);
                }
            }
        } else {
            showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, null);
        }
        m38999U4().m38387t(false);
    }
}
