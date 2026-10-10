package com.kubi.spot.business.delegation;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.CoinProperty;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.network.websocket.model.Message;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.Resource;
import com.kubi.sdk.Status;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import com.kubi.spot.helper.TradeModel;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g10.C37787r;
import gf.C37890n;
import gf.InterfaceC37888l;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import t20.C44639f0;
import w00.C45681e;

/* JADX INFO: compiled from: TradeFundsListFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u0013!\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0017J\b\u0010.\u001a\u00020,H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020,H\u0002J\u0015\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\u0018H\u0000¢\u0006\u0002\b9J\u0016\u0010:\u001a\u00020,2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110<H\u0002J\u0016\u0010=\u001a\u00020,2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110<H\u0002J\u0015\u0010?\u001a\u00020,2\u0006\u00108\u001a\u00020\u0018H\u0000¢\u0006\u0002\b@J\b\u0010A\u001a\u00020,H\u0002J\u000e\u0010B\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020\u0011J\u0016\u0010E\u001a\u00020,2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00180<H\u0002J\u0010\u0010G\u001a\u00020,2\u0006\u0010H\u001a\u00020IH\u0002J\u000e\u0010J\u001a\u00020,2\u0006\u0010H\u001a\u00020IR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b4\u00105¨\u0006L"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TradeFundsListFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/FragmentTradeFundsListBinding;", "getBinding", "()Lcom/kubi/spot/databinding/FragmentTradeFundsListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tradeFundsListViewModel", "Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;", "getTradeFundsListViewModel", "()Lcom/kubi/spot/business/delegation/TradeFundsListViewModel;", "tradeFundsListViewModel$delegate", "Lkotlin/Lazy;", "currentTradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "fundsListAdapter", "com/kubi/spot/business/delegation/TradeFundsListFragment$fundsListAdapter$1", "Lcom/kubi/spot/business/delegation/TradeFundsListFragment$fundsListAdapter$1;", "isShowSymbolOfflineAlert", "", "item", "Lcom/kubi/spot/business/delegation/AccountItemEntityWrapper;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "wsDataHelper$delegate", "tradeMarketDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "tradeMarketDialogAdapter", "com/kubi/spot/business/delegation/TradeFundsListFragment$tradeMarketDialogAdapter$1", "Lcom/kubi/spot/business/delegation/TradeFundsListFragment$tradeMarketDialogAdapter$1;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "getTestBinding", "initViewModels", "showSelectSortRuleDialog", "tradeModel", "Lcom/kubi/spot/helper/TradeModel;", "getTradeModel", "()Lcom/kubi/spot/helper/TradeModel;", "tradeModel$delegate", "onBuySellBtnClick", "entityWrapper", "onBuySellBtnClick$SpotLib_googleRelease", "subscribeMarketWs", "tradeItemList", "", "showTradeMarketDialog", "dataList", "onAddFundsBtnClick", "onAddFundsBtnClick$SpotLib_googleRelease", "showSmallTipsDialog", "fetchCurrencyList", "updateCurrentSymbol", "tradeItem", "updateAdapterList", "filter", "showEditTradeAvgCostBottomSheet", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "jumpToCoinDetailPage", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeFundsListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFundsListFragment.kt\ncom/kubi/spot/business/delegation/TradeFundsListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n147#2,16:499\n106#3,15:515\n158#4,2:530\n1563#5:532\n1634#5,3:533\n808#5,11:540\n1869#5:551\n1870#5:553\n160#6,4:536\n1#7:552\n*S KotlinDebug\n*F\n+ 1 TradeFundsListFragment.kt\ncom/kubi/spot/business/delegation/TradeFundsListFragment\n*L\n82#1:499,16\n86#1:515,15\n223#1:530,2\n312#1:532\n312#1:533,3\n360#1:540,11\n363#1:551\n363#1:553\n355#1:536,4\n*E\n"})
public final class TradeFundsListFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f49918U = C45681e.m100799e(this, new Function1<TradeFundsListFragment, C44639f0>() { // from class: com.kubi.spot.business.delegation.TradeFundsListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44639f0 invoke(@NotNull TradeFundsListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44639f0.m98755a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44639f0, Unit>() { // from class: com.kubi.spot.business.delegation.TradeFundsListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44639f0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44639f0 c44639f0) {
            invoke(c44639f0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f49919V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public TradeItemBean f49920W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final TradeFundsListFragment$fundsListAdapter$1 f49921X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f49922Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public DialogFragmentHelper f49923Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final TradeFundsListFragment$tradeMarketDialogAdapter$1 f49924a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f49925b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f49917d0 = {Reflection.property1(new PropertyReference1Impl(TradeFundsListFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/FragmentTradeFundsListBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f49916c0 = new Companion(null);

    /* JADX INFO: compiled from: TradeFundsListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/TradeFundsListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/business/delegation/TradeFundsListFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TradeFundsListFragment newInstance() {
            Bundle bundle = new Bundle();
            TradeFundsListFragment tradeFundsListFragment = new TradeFundsListFragment();
            tradeFundsListFragment.setArguments(bundle);
            return tradeFundsListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeFundsListFragment$b */
    /* JADX INFO: compiled from: TradeFundsListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24797b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f49926b;

        public C24797b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f49926b = function;
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
            return this.f49926b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49926b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeFundsListFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C24798c extends TypeToken<WsMarketSnapshotEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeFundsListFragment$a */
    /* JADX INFO: compiled from: TradeFundsListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24796a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final List m60606A4(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj : it) {
            if (obj instanceof WsMarketSnapshotEntity) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B4 */
    public static final List m60608B4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: C4 */
    public static final List m60610C4(List list, List it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) it2.next();
            Iterator it3 = list.iterator();
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
        return list;
    }

    /* JADX INFO: renamed from: D4 */
    public static final List m60612D4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m60614E4(TradeFundsListFragment tradeFundsListFragment, List list) {
        DialogFragmentHelper dialogFragmentHelper = tradeFundsListFragment.f49923Z;
        if (dialogFragmentHelper != null && true == dialogFragmentHelper.isVisible()) {
            tradeFundsListFragment.f49924a0.replaceData(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final TradeModel m60622I4() {
        return new TradeModel();
    }

    /* JADX INFO: renamed from: L4 */
    public static final C37787r m60626L4(TradeFundsListFragment tradeFundsListFragment) {
        return new C37787r(tradeFundsListFragment);
    }

    /* JADX INFO: renamed from: W3 */
    private final C37787r m60633W3() {
        return (C37787r) this.f49922Y.getValue();
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m60637a4(TradeFundsListFragment tradeFundsListFragment, Integer num) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        if (num != null && num.intValue() == 0) {
            C44639f0 c44639f0M60675T3 = tradeFundsListFragment.m60675T3();
            if (c44639f0M60675T3 != null && (appCompatImageView2 = c44639f0M60675T3.f99065e) != null) {
                appCompatImageView2.setSelected(false);
            }
        } else {
            C44639f0 c44639f0M60675T4 = tradeFundsListFragment.m60675T3();
            if (c44639f0M60675T4 != null && (appCompatImageView = c44639f0M60675T4.f99065e) != null) {
                appCompatImageView.setSelected(true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m60639c4(TradeFundsListFragment tradeFundsListFragment, CompoundButton compoundButton, boolean z11) {
        TradeItemBean tradeItemBean = tradeFundsListFragment.f49920W;
        if (tradeItemBean != null) {
            tradeFundsListFragment.m60676U3().m60747T(z11, tradeItemBean);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m60641h4(TradeFundsListFragment tradeFundsListFragment, AccountItemEntity accountItemEntity, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((RecyclerView) helper.getView(R$id.recyclerview)).setAdapter(new TradeFundsListFragment$onAddFundsBtnClick$1$1(accountItemEntity, dialogFragmentHelper, R$layout.bkucoin_spot_trade_add_funds_item, tradeFundsListFragment.m60676U3().m60739F(accountItemEntity)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m60649n4(TradeFundsListFragment tradeFundsListFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        TradeItemBean tradeItemBean = tradeFundsListFragment.f49920W;
        if (tradeItemBean != null) {
            tradeFundsListFragment.m60676U3().m60748U(Integer.parseInt(interfaceC24339a.getId()), tradeItemBean);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m60652p4(TradeFundsListFragment tradeFundsListFragment, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((RecyclerView) helper.getView(R$id.recyclerview)).setAdapter(tradeFundsListFragment.f49924a0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final CharSequence m60657s4(TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String symbol = it.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return symbol;
    }

    /* JADX INFO: renamed from: u4 */
    public static final boolean m60661u4(TradeFundsListFragment tradeFundsListFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DialogFragmentHelper dialogFragmentHelper = tradeFundsListFragment.f49923Z;
        if (dialogFragmentHelper != null) {
            return dialogFragmentHelper.isVisible();
        }
        return false;
    }

    /* JADX INFO: renamed from: v4 */
    public static final boolean m60663v4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: w4 */
    public static final Object m60665w4(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C24798c().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) objM66914d;
        return wsMarketSnapshotEntity == null ? new Object() : wsMarketSnapshotEntity;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Object m60667x4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: y4 */
    public static final boolean m60669y4(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() > 0;
    }

    /* JADX INFO: renamed from: z4 */
    public static final boolean m60671z4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: J4 */
    public final void m60672J4(List<AccountItemEntityWrapper> list) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        this.f49921X.replaceData(list);
        if (this.f49921X.getData().isEmpty()) {
            C44639f0 c44639f0M60675T3 = m60675T3();
            if (c44639f0M60675T3 == null || (constraintLayout2 = c44639f0M60675T3.f99064d) == null) {
                return;
            }
            ViewExtKt.m66577h(constraintLayout2);
            return;
        }
        C44639f0 c44639f0M60675T4 = m60675T3();
        if (c44639f0M60675T4 == null || (constraintLayout = c44639f0M60675T4.f99064d) == null) {
            return;
        }
        ViewExtKt.m66594y(constraintLayout);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m60673K4(@NotNull TradeItemBean tradeItem) {
        Intrinsics.checkNotNullParameter(tradeItem, "tradeItem");
        this.f49920W = tradeItem;
        if (!isAdded() || isDetached()) {
            return;
        }
        m60674S3(tradeItem);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m60674S3(@NotNull TradeItemBean currentTradeItem) {
        Intrinsics.checkNotNullParameter(currentTradeItem, "currentTradeItem");
        if (getContext() == null) {
            return;
        }
        if (IUserService.a.get().c()) {
            m60676U3().m60737D(currentTradeItem);
        } else {
            BaseFragment.showFailView$default(this, R$string.no_order, R$drawable.ic2_common_empty, (View.OnClickListener) null, 4, (Object) null);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final C44639f0 m60675T3() {
        return (C44639f0) this.f49918U.getValue(this, f49917d0[0]);
    }

    /* JADX INFO: renamed from: U3 */
    public final TradeFundsListViewModel m60676U3() {
        return (TradeFundsListViewModel) this.f49919V.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    public final TradeModel m60677V3() {
        return (TradeModel) this.f49925b0.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m60679f4(@NotNull AccountItemEntity entity) throws JSONException {
        Intrinsics.checkNotNullParameter(entity, "entity");
        C37304a c37304a = C37304a.f82764a;
        String currency = entity.getCurrency();
        InterfaceC37749a.a.m85109d(c37304a, currency == null ? "" : currency, 2L, null, null, null, 28, null);
        JSONObject jSONObject = new JSONObject();
        String currency2 = entity.getCurrency();
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency2 != null ? currency2 : "");
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B5trading", "spotFundsCoin", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m60680g4(@NotNull AccountItemEntityWrapper entityWrapper) {
        Intrinsics.checkNotNullParameter(entityWrapper, "entityWrapper");
        final AccountItemEntity accountItemEntity = entityWrapper.getAccountItemEntity();
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bkucoin_spot_trade_add_funds, true).m54237f4(new Function2() { // from class: com.kubi.spot.business.delegation.m0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TradeFundsListFragment.m60641h4(this.f50082b, accountItemEntity, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "spot_trade_add_funds");
    }

    /* JADX INFO: renamed from: i4 */
    public final void m60681i4(@NotNull AccountItemEntityWrapper entityWrapper) {
        Intrinsics.checkNotNullParameter(entityWrapper, "entityWrapper");
        showLoadingDialog();
        String currency = entityWrapper.getAccountItemEntity().getCurrency();
        if (currency == null) {
            currency = "";
        }
        List listM85584f = InterfaceC37888l.m85584f(C37890n.f85269a, currency, false, false, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85584f, 10));
        Iterator it = listM85584f.iterator();
        while (it.hasNext()) {
            arrayList.add(((SymbolInfoEntity) it.next()).getCode());
        }
        if (arrayList.isEmpty()) {
            ToastCompat.m66437C(R$string.coin_no_data);
            BaseFragment.hideLoadingDialog$default(this, false, 1, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new TradeFundsListFragment$onBuySellBtnClick$1(this, CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1() { // from class: com.kubi.spot.business.delegation.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeFundsListFragment.m60643j4((String) obj);
                }
            }, 31, null), null), 2, null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60682k4(AccountItemEntity accountItemEntity) {
        final TradeItemBean tradeItemBean = this.f49920W;
        if (tradeItemBean == null) {
            return;
        }
        IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        String currency = accountItemEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        iAssetsCenterService.mo15352r(this, currency, accountItemEntity.getCostUsdt(), new Function0() { // from class: com.kubi.spot.business.delegation.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment.m60646l4(this.f50080b, tradeItemBean);
            }
        }, "B5trading", "spotFundsEditAvgCost");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX INFO: renamed from: m4 */
    public final void m60683m4() {
        boolean z11;
        boolean z12;
        boolean z13;
        Integer value = m60676U3().m60741L().getValue();
        String string = getString(R$string.kc_trade_funds_default_sort);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SelectEntity selectEntity = new SelectEntity("0", string, null, null, null, null, null, null, null, false, value != null && value.intValue() == 0, null, 3068, null);
        String string2 = getString(R$string.kumex_pnln_sort_by_value);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (value != null) {
            z11 = true;
            if (value.intValue() == 1) {
                z12 = true;
            }
            SelectEntity selectEntity2 = new SelectEntity("1", string2, null, null, null, null, null, null, null, false, z12, null, 3068, null);
            String string3 = getString(R$string.kumex_pnln_sort_by_abc);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            if (value == null && value.intValue() == 2) {
                z13 = z11;
            } else {
                z13 = false;
            }
            DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, CollectionsKt.listOf((Object[]) new SelectEntity[]{selectEntity, selectEntity2, new SelectEntity("2", string3, null, null, null, null, null, null, null, false, z13, null, 3068, null)}), new BiConsumer() { // from class: com.kubi.spot.business.delegation.n0
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    TradeFundsListFragment.m60649n4(this.f50085b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
                }
            }, false, null, null, false, 60, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM58944B.show(childFragmentManager, "trade_funds_sort_dialog");
        }
        z11 = true;
        z12 = false;
        SelectEntity selectEntity3 = new SelectEntity("1", string2, null, null, null, null, null, null, null, false, z12, null, 3068, null);
        String string4 = getString(R$string.kumex_pnln_sort_by_abc);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        if (value == null) {
            z13 = false;
        } else {
            z13 = z11;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B2 = BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, CollectionsKt.listOf((Object[]) new SelectEntity[]{selectEntity, selectEntity3, new SelectEntity("2", string4, null, null, null, null, null, null, null, false, z13, null, 3068, null)}), new BiConsumer() { // from class: com.kubi.spot.business.delegation.n0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TradeFundsListFragment.m60649n4(this.f50085b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B2.show(childFragmentManager2, "trade_funds_sort_dialog");
    }

    /* JADX INFO: renamed from: o4 */
    public final void m60684o4(List<? extends TradeItemBean> list) throws Exception {
        this.f49924a0.replaceData(list);
        m60685r4(list);
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bkucoin_market_bottom_dialog, true).m54237f4(new Function2() { // from class: com.kubi.spot.business.delegation.n
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TradeFundsListFragment.m60652p4(this.f50084b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        this.f49923Z = dialogFragmentHelperM54237f4;
        if (dialogFragmentHelperM54237f4 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM54237f4.show(childFragmentManager, "spot_trade_market_dialog");
        }
        DialogFragmentHelper dialogFragmentHelper = this.f49923Z;
        if (dialogFragmentHelper != null) {
            dialogFragmentHelper.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.spot.business.delegation.o
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TradeFundsListFragment.m60654q4(this.f50086b, dialogInterface);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_trade_funds_list, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m60638b4();
        m60634X3();
        TradeFundsListFragment$fundsListAdapter$1 tradeFundsListFragment$fundsListAdapter$1 = this.f49921X;
        C44639f0 c44639f0M60675T3 = m60675T3();
        tradeFundsListFragment$fundsListAdapter$1.bindToRecyclerView(c44639f0M60675T3 != null ? c44639f0M60675T3.f99066f : null);
        TradeFundsListFragment$fundsListAdapter$1 tradeFundsListFragment$fundsListAdapter$2 = this.f49921X;
        int i11 = R$layout.view_empty;
        C44639f0 c44639f0M60675T4 = m60675T3();
        tradeFundsListFragment$fundsListAdapter$2.setEmptyView(i11, c44639f0M60675T4 != null ? c44639f0M60675T4.f99066f : null);
        if (IUserService.a.get().c()) {
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        } else {
            showContentView();
            this.f49921X.replaceData(CollectionsKt.emptyList());
            C44639f0 c44639f0M60675T5 = m60675T3();
            if (c44639f0M60675T5 != null && (constraintLayout = c44639f0M60675T5.f99064d) != null) {
                ViewExtKt.m66577h(constraintLayout);
            }
        }
        if (C12573b.f21598a.m23696a()) {
            "event_overview_custom_order".length();
        }
        C12572a.m23692a(this, true, new TradeFundsListFragment$onViewCreated$$inlined$bindFlowEvent$1("event_overview_custom_order", null, this));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m60685r4(final List<? extends TradeItemBean> list) throws Exception {
        final String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.kubi.spot.business.delegation.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60657s4((TradeItemBean) obj);
            }
        }, 30, null);
        m60633W3().m85234g(new Action() { // from class: com.kubi.spot.business.delegation.q
            @Override // io.reactivex.functions.Action
            public final void run() {
                TradeFundsListFragment.m60659t4(this.f50092b, strJoinToString$default, list);
            }
        });
    }

    public TradeFundsListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.spot.business.delegation.TradeFundsListFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.spot.business.delegation.TradeFundsListFragment$special$$inlined$viewModels$default$2
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
        this.f49919V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TradeFundsListViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.business.delegation.TradeFundsListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.business.delegation.TradeFundsListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.business.delegation.TradeFundsListFragment$special$$inlined$viewModels$default$5
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
        this.f49921X = new TradeFundsListFragment$fundsListAdapter$1(this, R$layout.item_trade_funds_list);
        this.f49922Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment.m60626L4(this.f50069b);
            }
        });
        this.f49924a0 = new TradeFundsListFragment$tradeMarketDialogAdapter$1(this, R$layout.bkucon_trade_market_list_item, new ArrayList());
        this.f49925b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment.m60622I4();
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m60616F4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m60618G4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m60620H4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    private final void m60634X3() {
        m60676U3().m60742M().observe(getViewLifecycleOwner(), new C24797b(new Function1() { // from class: com.kubi.spot.business.delegation.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60635Y3(this.f50077b, (Boolean) obj);
            }
        }));
        m60676U3().m60740K().observe(getViewLifecycleOwner(), new C24797b(new Function1() { // from class: com.kubi.spot.business.delegation.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60636Z3(this.f50126b, (Resource) obj);
            }
        }));
        m60676U3().m60741L().observe(getViewLifecycleOwner(), new C24797b(new Function1() { // from class: com.kubi.spot.business.delegation.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60637a4(this.f50067b, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m60635Y3(TradeFundsListFragment tradeFundsListFragment, Boolean bool) {
        KuCheckBox kuCheckBox;
        C44639f0 c44639f0M60675T3 = tradeFundsListFragment.m60675T3();
        if (c44639f0M60675T3 != null && (kuCheckBox = c44639f0M60675T3.f99062b) != null) {
            Intrinsics.checkNotNull(bool);
            kuCheckBox.setChecked(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m60636Z3(TradeFundsListFragment tradeFundsListFragment, Resource resource) {
        tradeFundsListFragment.showContentView();
        if (C24796a.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
            String string = tradeFundsListFragment.getString(R$string.network_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            BaseFragment.showFailView$default(tradeFundsListFragment, string, 0, (View.OnClickListener) null, 6, (Object) null);
        } else {
            List<AccountItemEntityWrapper> listEmptyList = (List) resource.m56500a();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            tradeFundsListFragment.m60672J4(listEmptyList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    private final void m60638b4() {
        if (m60675T3() == null) {
            return;
        }
        C44639f0 c44639f0M60675T3 = m60675T3();
        Intrinsics.checkNotNull(c44639f0M60675T3);
        c44639f0M60675T3.f99062b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.spot.business.delegation.j0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                TradeFundsListFragment.m60639c4(this.f50072b, compoundButton, z11);
            }
        });
        c44639f0M60675T3.f99065e.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.spot.business.delegation.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeFundsListFragment.m60640d4(this.f50075b, view);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m60640d4(TradeFundsListFragment tradeFundsListFragment, View view) {
        tradeFundsListFragment.m60683m4();
    }

    /* JADX INFO: renamed from: j4 */
    public static final CharSequence m60643j4(String str) {
        Intrinsics.checkNotNull(str);
        return str;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m60646l4(TradeFundsListFragment tradeFundsListFragment, TradeItemBean tradeItemBean) {
        tradeFundsListFragment.m60676U3().m60737D(tradeItemBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m60654q4(TradeFundsListFragment tradeFundsListFragment, DialogInterface dialogInterface) {
        C44128b.m97259c(tradeFundsListFragment.getTAG(), "showTradeMarketDialog: 清理交易行情弹窗资源");
        tradeFundsListFragment.m60633W3().m85237j("/market/snapshot_app:%s");
        tradeFundsListFragment.getVisibleDisposable().clear();
        tradeFundsListFragment.f49923Z = null;
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m60659t4(final TradeFundsListFragment tradeFundsListFragment, String str, final List list) {
        tradeFundsListFragment.getVisibleDisposable().clear();
        tradeFundsListFragment.m60633W3().m85233f("/market/snapshot_app:%s", str);
        CompositeDisposable visibleDisposable = tradeFundsListFragment.getVisibleDisposable();
        PublishSubject<Message> publishSubjectM85231d = tradeFundsListFragment.m60633W3().m85231d();
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.delegation.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeFundsListFragment.m60661u4(this.f50098b, (Message) obj));
            }
        };
        Observable<Message> observableObserveOn = publishSubjectM85231d.filter(new Predicate() { // from class: com.kubi.spot.business.delegation.x
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeFundsListFragment.m60663v4(function1, obj);
            }
        }).observeOn(C42916f.m94127f());
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.business.delegation.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60665w4((Message) obj);
            }
        };
        Observable observableBuffer = observableObserveOn.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.business.delegation.z
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeFundsListFragment.m60667x4(function2, obj);
            }
        }).buffer(1200L, TimeUnit.MILLISECONDS);
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.business.delegation.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TradeFundsListFragment.m60669y4((List) obj));
            }
        };
        Observable observableFilter = observableBuffer.filter(new Predicate() { // from class: com.kubi.spot.business.delegation.b0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeFundsListFragment.m60671z4(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.business.delegation.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60606A4((List) obj);
            }
        };
        Observable observableObserveOn2 = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.business.delegation.d0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeFundsListFragment.m60608B4(function4, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function5 = new Function1() { // from class: com.kubi.spot.business.delegation.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60610C4(list, (List) obj);
            }
        };
        Observable observableObserveOn3 = observableObserveOn2.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.business.delegation.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TradeFundsListFragment.m60612D4(function5, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function6 = new Function1() { // from class: com.kubi.spot.business.delegation.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60614E4(this.f50100b, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.business.delegation.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeFundsListFragment.m60616F4(function6, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.spot.business.delegation.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeFundsListFragment.m60618G4((Throwable) obj);
            }
        };
        visibleDisposable.add(observableObserveOn3.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.business.delegation.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeFundsListFragment.m60620H4(function7, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m60678e4(AccountItemEntityWrapper accountItemEntityWrapper) {
        String strIsDelisting;
        CoinProperty properties;
        String currency = accountItemEntityWrapper.getAccountItemEntity().getCurrency();
        if (currency != null) {
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(currency);
            if (coinInfoEntityM85613u != null && (properties = coinInfoEntityM85613u.getProperties()) != null) {
                strIsDelisting = properties.isDelisting();
            } else {
                strIsDelisting = null;
            }
            return Intrinsics.areEqual("TRUE", strIsDelisting);
        }
        return false;
    }
}
