package com.kubi.spot.business.delegation.delegateHistory;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.core.biz.order.record.history.C12036c;
import com.kubi.core.biz.order.record.history.ChooseSymbolView;
import com.kubi.core.biz.order.record.history.CoreDelegationHistoryFilterViewHelper;
import com.kubi.core.biz.order.record.history.DelegationTradeAccount;
import com.kubi.core.biz.order.record.history.HistoryDelegationContract$Intent;
import com.kubi.core.biz.order.record.history.MixAccountHistoryDelegationVM;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.businessTrack.DurationTrackManager;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.InterfaceC41775x1;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p569qq.C43852m;
import p660ud.FilterData;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
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
import p852kotlin.text.StringsKt;
import qe0.C43724b;
import t20.C44647j0;
import v30.C45413z;
import w00.C45681e;

/* JADX INFO: compiled from: DelegationHistoryFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0090\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0090\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010L\u001a\u00020MH\u0014J\b\u0010N\u001a\u00020MH\u0014J\b\u0010O\u001a\u00020\u0006H\u0016J\b\u0010P\u001a\u00020\u0006H\u0016J\b\u0010Q\u001a\u00020RH\u0016J\u001c\u0010S\u001a\u00020R2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010\u0002H\u0014J&\u0010W\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020Y\u0018\u00010X2\u0006\u0010Z\u001a\u00020M2\u0006\u0010[\u001a\u00020MH\u0014J\u0010\u0010^\u001a\u00020(2\u0006\u0010_\u001a\u00020(H\u0002J\u001a\u0010`\u001a\u00020R2\u0006\u0010a\u001a\u00020b2\b\u0010c\u001a\u0004\u0018\u00010dH\u0016J\b\u0010e\u001a\u00020RH\u0014J\b\u0010f\u001a\u00020RH\u0016J\b\u0010g\u001a\u00020\u0006H\u0014J\b\u0010h\u001a\u00020MH\u0014J\b\u0010i\u001a\u00020RH\u0016J\u0018\u0010j\u001a\u00020R2\u0006\u0010k\u001a\u00020M2\u0006\u0010l\u001a\u00020MH\u0016J\"\u0010j\u001a\u00020R2\u0006\u0010k\u001a\u00020M2\u0006\u0010l\u001a\u00020M2\b\u0010m\u001a\u0004\u0018\u00010nH\u0016J\b\u0010j\u001a\u00020RH\u0016J\b\u0010o\u001a\u00020RH\u0016J\b\u0010p\u001a\u00020qH\u0002J\u0010\u0010r\u001a\u00020R2\u0006\u0010s\u001a\u00020tH\u0002JP\u0010u\u001a\u00020R2\n\b\u0002\u00103\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010(2\n\b\u0002\u00105\u001a\u0004\u0018\u00010(2\n\b\u0002\u00104\u001a\u0004\u0018\u00010(2\n\b\u0002\u00106\u001a\u0004\u0018\u00010(2\n\b\u0002\u00102\u001a\u0004\u0018\u00010(H\u0002J\b\u0010w\u001a\u00020\u0006H\u0002J$\u0010x\u001a\u00020R2\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010(2\u0006\u0010|\u001a\u00020(H\u0002J\b\u0010}\u001a\u00020RH\u0002J\b\u0010~\u001a\u00020RH\u0002J\b\u0010\u007f\u001a\u00020RH\u0002J\t\u0010\u0080\u0001\u001a\u00020RH\u0002J\t\u0010\u0081\u0001\u001a\u00020RH\u0002J\u0014\u0010\u0082\u0001\u001a\u00020R2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010(H\u0002J\u0013\u0010\u0084\u0001\u001a\u00020R2\b\u00104\u001a\u0004\u0018\u00010(H\u0002J\u0014\u0010\u0085\u0001\u001a\u00020R2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010(H\u0002J\t\u0010\u0087\u0001\u001a\u00020RH\u0002J\r\u0010\u0088\u0001\u001a\u00020R*\u00020zH\u0002J\r\u0010\u0089\u0001\u001a\u00020R*\u00020zH\u0002J\u0007\u0010\u008a\u0001\u001a\u00020RJ\u0007\u0010\u008b\u0001\u001a\u00020RJ\u001e\u0010\u008c\u0001\u001a\u00020R2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u0006H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR#\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010-\u001a\u001e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0.j\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(`/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b0\u0010\bR\u000e\u00102\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001b\u0010@\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0010\u001a\u0004\bA\u0010?R\u001b\u0010C\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bD\u0010?R\u001b\u0010F\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u0010\u001a\u0004\bG\u0010?R\u001b\u0010I\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u0010\u001a\u0004\bJ\u0010?R\u000e\u0010\\\u001a\u00020]X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0091\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/spot/entity/DelegationEntity;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "utaMixAccountBizVm", "Lcom/kubi/core/biz/order/record/history/MixAccountHistoryDelegationVM;", "getUtaMixAccountBizVm", "()Lcom/kubi/core/biz/order/record/history/MixAccountHistoryDelegationVM;", "utaMixAccountBizVm$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/spot/databinding/KucoinFragmentDelegationHistoryBinding;", "getBinding", "()Lcom/kubi/spot/databinding/KucoinFragmentDelegationHistoryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "filterBinding", "Lcom/kubi/tradecorebiz/databinding/HistoryOrdersFilterToolbarLayoutBinding;", "getFilterBinding", "()Lcom/kubi/tradecorebiz/databinding/HistoryOrdersFilterToolbarLayoutBinding;", "filterBinding$delegate", "mTradeApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/spot/api/MarketApi;", "mTradeApi$delegate", "tradeType", "", "getTradeType", "()Ljava/lang/String;", "tradeType$delegate", "isUpGreen", "hashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isTrade", "isTrade$delegate", "orderTypeString", "symbol", "side", "timeType", "filterStatus", "filterViewHelper", "Lcom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper;", "getFilterViewHelper", "()Lcom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper;", "filterViewHelper$delegate", "mAccountFilterPopup", "Lcom/zyyoona7/popup/EasyPopup;", "getMAccountFilterPopup", "()Lcom/zyyoona7/popup/EasyPopup;", "mPairPopup", "getMPairPopup", "mPairPopup$delegate", "mSidePopup", "getMSidePopup", "mSidePopup$delegate", "mTypePopup", "getMTypePopup", "mTypePopup$delegate", "mFilterPopup", "getMFilterPopup", "mFilterPopup$delegate", "getLayout", "", "getItemLayout", "canLoad", "needAutoLoad", "onLoad", "", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getStart", "value", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setHeader", "refreshData", "needDefaultBackground", "getEndFooterText", "showLoading", "showEmpty", "res1", "res2", "onClickListener", "Landroid/view/View$OnClickListener;", "showContent", "startCollectData", "Lkotlinx/coroutines/Job;", "resetFilterArgsFromMixAccountVM", "filterData", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "updateFilterArgsForMixAccountVM", "status", "isMixAccountMode", "setPopupTextAndColor", "bindingText", "Landroid/widget/TextView;", "text", "defaultText", "initFilterView", "initMixAccountFilterView", "onPairClick", "onSideClick", "onTypeClick", "updatePairTextColor", "pair", "updateSideTextColor", "updateTypeTextColor", "type", "onTimeAndStatusClick", "aroundIconAndTintColor", "defaultAroundIconAndTintColor", "initData", "reloadData", "onTradeSymbolRefresh", "symbolInfo", "Lcom/kubi/data/entity/TradeItemBean;", "checked", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationHistoryFragment.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n106#2,15:604\n147#3,16:619\n1#4:635\n*S KotlinDebug\n*F\n+ 1 DelegationHistoryFragment.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment\n*L\n75#1:604,15\n77#1:619,16\n*E\n"})
public final class DelegationHistoryFragment extends BasePagingFragment<DelegationEntity> {

    /* JADX INFO: renamed from: Z */
    public boolean f50001Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f50002a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC24293a f50003b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f50004c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f50005d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f50006e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f50007f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f50008g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final HashMap<String, String> f50009h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f50010i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public String f50011j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public String f50012k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public String f50013l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public String f50014m0;

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public String f50015n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final Lazy f50016o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final Lazy f50017p0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f50018q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f50019r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f50020s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public TimeUtils.C27004b f50021t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f50000v0 = {Reflection.property1(new PropertyReference1Impl(DelegationHistoryFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/KucoinFragmentDelegationHistoryBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f49999u0 = new Companion(null);

    /* JADX INFO: compiled from: DelegationHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment$Companion;", "", "<init>", "()V", "DEFAULT_TIME_TYPE", "", "DEFAULT_FILTER_STATUS", "DEFAULT_SYMBOL", "DEFAULT_SIDE", "DEFAULT_ORDER_TYPE_STRING", "newInstance", "Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryFragment;", "tradeType", "fromSymbol", "side", "isTrade", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ DelegationHistoryFragment newInstance$default(Companion companion, String str, String str2, String str3, boolean z11, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return companion.newInstance(str, str2, str3, z11);
        }

        @NotNull
        public final DelegationHistoryFragment newInstance(@Nullable String tradeType, @Nullable String fromSymbol, @Nullable String side, boolean isTrade) {
            DelegationHistoryFragment delegationHistoryFragment = new DelegationHistoryFragment();
            delegationHistoryFragment.setArguments(new C27051h().m66719c("isTrade", isTrade).m66724h("fromSymbol", fromSymbol).m66724h("tradeType", tradeType).m66724h("side", side).m66717a());
            return delegationHistoryFragment;
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m60836F4(DelegationHistoryFragment delegationHistoryFragment, List list) {
        delegationHistoryFragment.f50014m0 = ((FilterType.InterfaceC23033b) list.get(0)).getF44545b();
        String f44545b = ((FilterType.InterfaceC23033b) list.get(1)).getF44545b();
        delegationHistoryFragment.f50015n0 = f44545b;
        if (Intrinsics.areEqual(f44545b, "ALL")) {
            delegationHistoryFragment.f50015n0 = "";
        }
        delegationHistoryFragment.mo15906F3();
        m60870a5(delegationHistoryFragment, null, null, delegationHistoryFragment.f50014m0, null, delegationHistoryFragment.f50015n0, null, 43, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: B3 */
    public boolean mo21464B3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int res1, int res2) {
        super.showEmpty(res1, res2);
        WrapperLoadingView wrapperLoadingViewM60878n4 = m60878n4();
        if (wrapperLoadingViewM60878n4 != null) {
            wrapperLoadingViewM60878n4.showEmpty(res1, res2, (View.OnClickListener) null);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final C43724b m60835E4(final DelegationHistoryFragment delegationHistoryFragment) {
        delegationHistoryFragment.f50015n0 = Intrinsics.areEqual(delegationHistoryFragment.f50015n0, "TRIGGERED") ? "" : delegationHistoryFragment.f50015n0;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM60899m4 = delegationHistoryFragment.m60899m4();
        FragmentActivity activity = delegationHistoryFragment.getActivity();
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        return CoreDelegationHistoryFilterViewHelper.m22209v(coreDelegationHistoryFilterViewHelperM60899m4, activity, c45413zM60898l4 != null ? c45413zM60898l4.f102421b : null, delegationHistoryFragment.f50014m0, delegationHistoryFragment.f50015n0, null, new Consumer() { // from class: com.kubi.spot.business.delegation.delegateHistory.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationHistoryFragment.m60836F4(this.f50046b, (List) obj);
            }
        }, 16, null);
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m60839H4(DelegationHistoryFragment delegationHistoryFragment, ChooseSymbolView.FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getName();
        Context context = delegationHistoryFragment.mContext;
        delegationHistoryFragment.f50012k0 = !Intrinsics.areEqual(name, context != null ? context.getString(R$string.all) : null) ? it.getCode() : "";
        delegationHistoryFragment.m60891b5(it.getName());
        m60870a5(delegationHistoryFragment, delegationHistoryFragment.f50012k0, null, null, null, null, null, 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m60843J4(DelegationHistoryFragment delegationHistoryFragment, FilterType.C23032a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        delegationHistoryFragment.f50013l0 = it.getF44545b();
        delegationHistoryFragment.m60892c5(it.getF44544a());
        m60870a5(delegationHistoryFragment, null, null, null, delegationHistoryFragment.f50013l0, null, null, 55, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m60849M4(DelegationHistoryFragment delegationHistoryFragment, FilterType.C23032a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String f44545b = it.getF44545b();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = f44545b.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        delegationHistoryFragment.f50011j0 = lowerCase;
        delegationHistoryFragment.m60893d5(it.getF44544a());
        m60870a5(delegationHistoryFragment, null, null, null, null, null, delegationHistoryFragment.f50011j0, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m60870a5(DelegationHistoryFragment delegationHistoryFragment, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            str5 = null;
        }
        if ((i11 & 32) != 0) {
            str6 = null;
        }
        delegationHistoryFragment.m60890Z4(str, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m60872c4(DelegationHistoryFragment delegationHistoryFragment, FilterType.C23032a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        delegationHistoryFragment.m60906w4().m22244r(new HistoryDelegationContract$Intent.ChangeDelegationTradeAccount(C12036c.m22245a(it.getF44545b())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final CoreDelegationHistoryFilterViewHelper m60877j4() {
        return new CoreDelegationHistoryFilterViewHelper();
    }

    /* JADX INFO: renamed from: n4 */
    private final WrapperLoadingView m60878n4() {
        return (WrapperLoadingView) this.f50004c0.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    private final InterfaceC37053d m60879s4() {
        return (InterfaceC37053d) this.f50006e0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final boolean m60882A4() {
        if (IUnifyAccountService.f53155a.get().mo64991e()) {
            return (Intrinsics.areEqual(m60905v4(), "TRADE") || Intrinsics.areEqual(m60905v4(), "MARGIN_TRADE")) && !m60883B4();
        }
        return false;
    }

    /* JADX INFO: renamed from: B4 */
    public final boolean m60883B4() {
        return ((Boolean) this.f50010i0.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f50021t0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    /* JADX INFO: renamed from: N4 */
    public final void m60884N4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        CharSequence text;
        BaseTextView baseTextView4;
        if (this.f50012k0.length() > 0) {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(this.f50012k0);
            C45413z c45413zM60898l4 = m60898l4();
            String string = null;
            if (c45413zM60898l4 != null && (baseTextView4 = c45413zM60898l4.f102423d) != null) {
                baseTextView4.setText(C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, StringsKt.replace$default(this.f50012k0, C33820nf.f71144W, "/", false, 4, (Object) null)));
            }
            C45413z c45413zM60898l5 = m60898l4();
            if (c45413zM60898l5 != null && (baseTextView3 = c45413zM60898l5.f102423d) != null && (text = baseTextView3.getText()) != null) {
                string = text.toString();
            }
            m60891b5(string);
            C45413z c45413zM60898l6 = m60898l4();
            if (c45413zM60898l6 != null && (baseTextView2 = c45413zM60898l6.f102423d) != null) {
                m60896h4(baseTextView2);
            }
        }
        C45413z c45413zM60898l7 = m60898l4();
        if (c45413zM60898l7 == null || (baseTextView = c45413zM60898l7.f102423d) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60852O4(this.f50036b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: P4 */
    public final void m60885P4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        CharSequence text;
        BaseTextView baseTextView4;
        if (this.f50013l0.length() > 0) {
            C45413z c45413zM60898l4 = m60898l4();
            if (c45413zM60898l4 != null && (baseTextView4 = c45413zM60898l4.f102424e) != null) {
                baseTextView4.setText(m60899m4().m22214F().get(this.f50013l0));
            }
            C45413z c45413zM60898l5 = m60898l4();
            m60892c5((c45413zM60898l5 == null || (baseTextView3 = c45413zM60898l5.f102424e) == null || (text = baseTextView3.getText()) == null) ? null : text.toString());
            C45413z c45413zM60898l6 = m60898l4();
            if (c45413zM60898l6 != null && (baseTextView2 = c45413zM60898l6.f102424e) != null) {
                m60896h4(baseTextView2);
            }
        }
        C45413z c45413zM60898l7 = m60898l4();
        if (c45413zM60898l7 == null || (baseTextView = c45413zM60898l7.f102424e) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60855Q4(this.f50039b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m60886R4() {
        C45413z c45413zM60898l4;
        ImageView imageView;
        ImageView imageView2;
        if ((!Intrinsics.areEqual(this.f50014m0, "THREE_MONTH") || !Intrinsics.areEqual(this.f50015n0, "")) && !Intrinsics.areEqual(this.f50015n0, "TRIGGERED") && (c45413zM60898l4 = m60898l4()) != null && (imageView = c45413zM60898l4.f102421b) != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            C27046k.m66701p(imageView, C27046k.m66699n(mContext, R$color.brandGreen));
        }
        C45413z c45413zM60898l5 = m60898l4();
        if (c45413zM60898l5 == null || (imageView2 = c45413zM60898l5.f102421b) == null) {
            return;
        }
        C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60858S4(this.f50038b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m60887T4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        CharSequence text;
        BaseTextView baseTextView4;
        if (this.f50011j0.length() > 0) {
            String str = this.f50011j0;
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = str.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            C45413z c45413zM60898l4 = m60898l4();
            if (c45413zM60898l4 != null && (baseTextView4 = c45413zM60898l4.f102426g) != null) {
                baseTextView4.setText(m60899m4().m22228z(DelegationTradeAccount.a.f20619a).get(upperCase));
            }
            C45413z c45413zM60898l5 = m60898l4();
            m60893d5((c45413zM60898l5 == null || (baseTextView3 = c45413zM60898l5.f102426g) == null || (text = baseTextView3.getText()) == null) ? null : text.toString());
            C45413z c45413zM60898l6 = m60898l4();
            if (c45413zM60898l6 != null && (baseTextView2 = c45413zM60898l6.f102426g) != null) {
                m60896h4(baseTextView2);
            }
        }
        C45413z c45413zM60898l7 = m60898l4();
        if (c45413zM60898l7 == null || (baseTextView = c45413zM60898l7.f102426g) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60861U4(this.f50037b);
            }
        }, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX INFO: renamed from: W4 */
    public final void m60889W4(TextView textView, String str, String str2) {
        if (str == null || str.length() == 0) {
            if (textView != null) {
                textView.setText(str2);
            }
            if (textView != null) {
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                textView.setTextColor(C27046k.m66699n(mContext, R$color.c_text40));
            }
            if (textView != null) {
                m60896h4(textView);
            }
        } else {
            Context context = this.mContext;
            if (Intrinsics.areEqual(str, context != null ? context.getString(R$string.all) : null)) {
                if (textView != null) {
                    textView.setText(str2);
                }
                if (textView != null) {
                    Context mContext2 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                    textView.setTextColor(C27046k.m66699n(mContext2, R$color.c_text40));
                }
                if (textView != null) {
                    m60896h4(textView);
                }
            } else {
                if (textView != null) {
                    textView.setText(str);
                }
                if (textView != null) {
                    Context mContext3 = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
                    textView.setTextColor(C27046k.m66699n(mContext3, R$color.brandGreen));
                }
                if (textView != null) {
                    m60896h4(textView);
                }
            }
        }
        mo15906F3();
    }

    /* JADX INFO: renamed from: b5 */
    public final void m60891b5(String str) {
        if (str == null || str.length() == 0) {
            this.f50012k0 = "";
        }
        C45413z c45413zM60898l4 = m60898l4();
        BaseTextView baseTextView = c45413zM60898l4 != null ? c45413zM60898l4.f102423d : null;
        String string = this.mContext.getString(R$string.trade_pair);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m60889W4(baseTextView, str, string);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m60892c5(String str) {
        if (str == null || str.length() == 0) {
            this.f50013l0 = "";
        }
        C45413z c45413zM60898l4 = m60898l4();
        BaseTextView baseTextView = c45413zM60898l4 != null ? c45413zM60898l4.f102424e : null;
        String string = this.mContext.getString(R$string.direction);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m60889W4(baseTextView, str, string);
    }

    /* JADX INFO: renamed from: d5 */
    public final void m60893d5(String str) {
        if (str == null || str.length() == 0) {
            this.f50011j0 = "";
        }
        C45413z c45413zM60898l4 = m60898l4();
        BaseTextView baseTextView = c45413zM60898l4 != null ? c45413zM60898l4.f102426g : null;
        String string = this.mContext.getString(R$string.type);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m60889W4(baseTextView, str, string);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m60894f4(TextView textView) {
        C27046k.m66694i(textView, R$drawable.ic_triangle_top_12, C5275i0.m6236a(5.0f), 0, 4, null);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C27046k.m66702q(textView, C27046k.m66699n(context, R$color.brandGreen));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: g4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable DelegationEntity delegationEntity) {
        if (baseViewHolder == null || delegationEntity == null) {
            return;
        }
        C24844a0.m60912a(delegationEntity).mo60911a(baseViewHolder, delegationEntity, this.f50008g0, m60883B4(), this);
        if (Intrinsics.areEqual(m60905v4(), "TRADE")) {
            DurationTrackManager.Companion companion = DurationTrackManager.f49767c;
            String strM60321f = companion.getInstance().m60321f(delegationEntity.getOrderId());
            if (strM60321f != null) {
                C43841b.m96556c("click_submit_spot_order", "data_load_finish", strM60321f);
                companion.getInstance().m60325k(delegationEntity.getOrderId());
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_delegation_history;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF50001Z() {
        return this.f50001Z;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m60896h4(TextView textView) {
        C27046k.m66694i(textView, com.kubi.tradecorebiz.R$drawable.ic_triangle_bottom_12, C5275i0.m6236a(5.0f), 0, 4, null);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C27046k.m66702q(textView, C27046k.m66699n(context, com.kubi.tradecorebiz.R$color.c_icon60));
    }

    /* JADX INFO: renamed from: k4 */
    public final C44647j0 m60897k4() {
        return (C44647j0) this.f50003b0.getValue(this, f50000v0[0]);
    }

    /* JADX INFO: renamed from: l4 */
    public final C45413z m60898l4() {
        return (C45413z) this.f50005d0.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    public final CoreDelegationHistoryFilterViewHelper m60899m4() {
        return (CoreDelegationHistoryFilterViewHelper) this.f50016o0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WrapperLoadingView wrapperLoadingViewM60878n4 = m60878n4();
        if (wrapperLoadingViewM60878n4 != null) {
            LoadingViewUtils.f48255a.m58510c(wrapperLoadingViewM60878n4);
        }
        Bundle arguments = getArguments();
        this.f50012k0 = C27041f.m66668h(arguments != null ? arguments.getString("fromSymbol") : null);
        Bundle arguments2 = getArguments();
        this.f50013l0 = C27041f.m66668h(arguments2 != null ? arguments2.getString("side") : null);
        C44647j0 c44647j0M60897k4 = m60897k4();
        if (c44647j0M60897k4 != null && (swipeRefreshRecyclerView = c44647j0M60897k4.f99149e) != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
        }
        if (m60882A4()) {
            m60888V4(m60906w4().m22241o().getValue().getFilterData());
            m60907x4();
            m60865X4();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return IUserService.a.get().c();
    }

    /* JADX INFO: renamed from: p4 */
    public final C43724b m60901p4() {
        return (C43724b) this.f50020s0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    public final C43724b m60902q4() {
        return (C43724b) this.f50017p0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<DelegationEntity>> mo16440r3(int i11, int i12) {
        this.f50009h0.clear();
        if (this.f50012k0.length() > 0) {
            this.f50009h0.put("symbol", this.f50012k0);
        }
        this.f50009h0.put("status", "done");
        if (!TextUtils.isEmpty(this.f50011j0)) {
            this.f50009h0.put("type", this.f50011j0);
        }
        this.f50009h0.put("start", m60880u4(this.f50014m0));
        this.f50009h0.put("end", this.f50021t0.f54265b);
        if (!TextUtils.isEmpty(this.f50013l0)) {
            this.f50009h0.put("side", this.f50013l0);
        }
        if (!TextUtils.isEmpty(this.f50015n0) && !Intrinsics.areEqual(this.f50015n0, "TRIGGERED")) {
            HashMap<String, String> map = this.f50009h0;
            String str = this.f50015n0;
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = str.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put("filledStatus", lowerCase);
        }
        this.f50009h0.put("page", String.valueOf(i11));
        this.f50009h0.put("size", String.valueOf(i12));
        this.f50009h0.put("tradeType", m60905v4());
        return InterfaceC37053d.m82914P(m60879s4(), this.f50009h0, false, false, 6, null).compose(C24217a1.m58389m());
    }

    /* JADX INFO: renamed from: r4 */
    public final C43724b m60903r4() {
        return (C43724b) this.f50018q0.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f50001Z = z11;
    }

    /* JADX INFO: renamed from: t4 */
    public final C43724b m60904t4() {
        return (C43724b) this.f50019r0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.delegation_no_more_data;
    }

    @NotNull
    /* JADX INFO: renamed from: v4 */
    public final String m60905v4() {
        return (String) this.f50007f0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final MixAccountHistoryDelegationVM m60906w4() {
        return (MixAccountHistoryDelegationVM) this.f50002a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.trade_core_item_delegation_view;
    }

    public DelegationHistoryFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60875e5(this.f50034b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$special$$inlined$viewModels$default$1
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
        this.f50002a0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MixAccountHistoryDelegationVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$special$$inlined$viewModels$default$4
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
        this.f50003b0 = C45681e.m100799e(this, new Function1<DelegationHistoryFragment, C44647j0>() { // from class: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44647j0 invoke(@NotNull DelegationHistoryFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C44647j0.m98770a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C44647j0, Unit>() { // from class: com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C44647j0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44647j0 c44647j0) {
                invoke(c44647j0);
                return Unit.INSTANCE;
            }
        });
        this.f50004c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60834D4(this.f50047b);
            }
        });
        this.f50005d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60876i4(this.f50048b);
            }
        });
        this.f50006e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60845K4();
            }
        });
        this.f50007f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60867Y4(this.f50049b);
            }
        });
        this.f50008g0 = DayNightThemeManager.f28592a.m33189n();
        this.f50009h0 = new HashMap<>();
        this.f50010i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(DelegationHistoryFragment.m60833C4(this.f50050b));
            }
        });
        this.f50011j0 = "";
        this.f50012k0 = "";
        this.f50013l0 = "";
        this.f50014m0 = "THREE_MONTH";
        this.f50015n0 = "";
        this.f50016o0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60877j4();
            }
        });
        this.f50017p0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60837G4(this.f50051b);
            }
        });
        this.f50018q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60841I4(this.f50052b);
            }
        });
        this.f50019r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60847L4(this.f50035b);
            }
        });
        this.f50020s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryFragment.m60835E4(this.f50045b);
            }
        });
        this.f50021t0 = new TimeUtils.C27004b();
    }

    /* JADX INFO: renamed from: C4 */
    public static final boolean m60833C4(DelegationHistoryFragment delegationHistoryFragment) {
        Boolean boolValueOf;
        Bundle arguments = delegationHistoryFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isTrade"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: D4 */
    public static final WrapperLoadingView m60834D4(DelegationHistoryFragment delegationHistoryFragment) {
        FrameLayout frameLayout;
        C44647j0 c44647j0M60897k4 = delegationHistoryFragment.m60897k4();
        if (c44647j0M60897k4 != null) {
            frameLayout = c44647j0M60897k4.f99147c;
        } else {
            frameLayout = null;
        }
        return WrapperLoadingView.injectView(frameLayout);
    }

    /* JADX INFO: renamed from: G4 */
    public static final C43724b m60837G4(final DelegationHistoryFragment delegationHistoryFragment) {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM60899m4 = delegationHistoryFragment.m60899m4();
        FragmentActivity activity = delegationHistoryFragment.getActivity();
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null) {
            baseTextView = c45413zM60898l4.f102423d;
        } else {
            baseTextView = null;
        }
        return coreDelegationHistoryFilterViewHelperM60899m4.m22212A(activity, baseTextView, delegationHistoryFragment.m60905v4(), delegationHistoryFragment.f50012k0, new Function1() { // from class: com.kubi.spot.business.delegation.delegateHistory.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationHistoryFragment.m60839H4(this.f50041b, (ChooseSymbolView.FilterChooseData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public static final C43724b m60841I4(final DelegationHistoryFragment delegationHistoryFragment) {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM60899m4 = delegationHistoryFragment.m60899m4();
        FragmentActivity activity = delegationHistoryFragment.getActivity();
        String str = delegationHistoryFragment.f50013l0;
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null) {
            baseTextView = c45413zM60898l4.f102424e;
        } else {
            baseTextView = null;
        }
        return coreDelegationHistoryFilterViewHelperM60899m4.m22215G(activity, str, baseTextView, new Function1() { // from class: com.kubi.spot.business.delegation.delegateHistory.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationHistoryFragment.m60843J4(this.f50042b, (FilterType.C23032a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public static final InterfaceC37053d m60845K4() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: L4 */
    public static final C43724b m60847L4(final DelegationHistoryFragment delegationHistoryFragment) {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM60899m4 = delegationHistoryFragment.m60899m4();
        FragmentActivity activity = delegationHistoryFragment.getActivity();
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null) {
            baseTextView = c45413zM60898l4.f102426g;
        } else {
            baseTextView = null;
        }
        return CoreDelegationHistoryFilterViewHelper.m22191P(coreDelegationHistoryFilterViewHelperM60899m4, activity, null, baseTextView, delegationHistoryFragment.f50011j0, new Function1() { // from class: com.kubi.spot.business.delegation.delegateHistory.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationHistoryFragment.m60849M4(this.f50043b, (FilterType.C23032a) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m60852O4(DelegationHistoryFragment delegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null && (baseTextView = c45413zM60898l4.f102423d) != null) {
            delegationHistoryFragment.m60894f4(baseTextView);
        }
        C43724b c43724bM60902q4 = delegationHistoryFragment.m60902q4();
        C45413z c45413zM60898l5 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l5 != null) {
            relativeLayout = c45413zM60898l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM60902q4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m60855Q4(DelegationHistoryFragment delegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null && (baseTextView = c45413zM60898l4.f102424e) != null) {
            delegationHistoryFragment.m60894f4(baseTextView);
        }
        C43724b c43724bM60903r4 = delegationHistoryFragment.m60903r4();
        C45413z c45413zM60898l5 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l5 != null) {
            relativeLayout = c45413zM60898l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM60903r4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m60858S4(DelegationHistoryFragment delegationHistoryFragment) {
        RelativeLayout relativeLayout;
        ImageView imageView;
        if (!Intrinsics.areEqual(delegationHistoryFragment.m60905v4(), "TRADE")) {
            C43852m.m96591c("B4TradeHistory", "filter", "1", null, 8, null);
        }
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null && (imageView = c45413zM60898l4.f102421b) != null) {
            Context mContext = delegationHistoryFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            C27046k.m66701p(imageView, C27046k.m66699n(mContext, R$color.brandGreen));
        }
        C43724b c43724bM60901p4 = delegationHistoryFragment.m60901p4();
        C45413z c45413zM60898l5 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l5 != null) {
            relativeLayout = c45413zM60898l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM60901p4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m60861U4(DelegationHistoryFragment delegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null && (baseTextView = c45413zM60898l4.f102426g) != null) {
            delegationHistoryFragment.m60894f4(baseTextView);
        }
        C43724b c43724bM60904t4 = delegationHistoryFragment.m60904t4();
        C45413z c45413zM60898l5 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l5 != null) {
            relativeLayout = c45413zM60898l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM60904t4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    private final InterfaceC41775x1 m60865X4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new DelegationHistoryFragment$startCollectData$1(this, null));
    }

    /* JADX INFO: renamed from: Y4 */
    public static final String m60867Y4(DelegationHistoryFragment delegationHistoryFragment) {
        String string;
        Bundle arguments = delegationHistoryFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tradeType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "TRADE");
    }

    /* JADX INFO: renamed from: e5 */
    public static final ViewModelStoreOwner m60875e5(DelegationHistoryFragment delegationHistoryFragment) {
        Fragment fragmentRequireParentFragment = delegationHistoryFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: i4 */
    public static final C45413z m60876i4(DelegationHistoryFragment delegationHistoryFragment) {
        C45413z c45413z;
        C44647j0 c44647j0M60897k4 = delegationHistoryFragment.m60897k4();
        if (c44647j0M60897k4 != null && (c45413z = c44647j0M60897k4.f99150f) != null) {
            return C45413z.m100363a(c45413z.getRoot());
        }
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    private final String m60880u4(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1480287667) {
            if (iHashCode != -170154913) {
                if (iHashCode == 1346794279 && str.equals("ONE_MONTH")) {
                    return String.valueOf(this.f50021t0.m66434a(30, 6));
                }
                return "";
            }
            if (str.equals("THREE_MONTH")) {
                return String.valueOf(this.f50021t0.m66434a(90, 6));
            }
            return "";
        }
        if (str.equals("ONE_WEEK")) {
            return String.valueOf(this.f50021t0.m66434a(7, 6));
        }
        return "";
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m60881z4(DelegationHistoryFragment delegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM60898l4 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l4 != null && (baseTextView = c45413zM60898l4.f102425f) != null) {
            delegationHistoryFragment.m60894f4(baseTextView);
        }
        C43724b c43724bM60900o4 = delegationHistoryFragment.m60900o4();
        C45413z c45413zM60898l5 = delegationHistoryFragment.m60898l4();
        if (c45413zM60898l5 != null) {
            relativeLayout = c45413zM60898l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM60900o4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        View view;
        KuCheckBox kuCheckBox;
        if (m60883B4()) {
            C44647j0 c44647j0M60897k4 = m60897k4();
            if (c44647j0M60897k4 != null && (kuCheckBox = c44647j0M60897k4.f99146b) != null) {
                ViewExtKt.m66594y(kuCheckBox);
            }
            C44647j0 c44647j0M60897k5 = m60897k4();
            if (c44647j0M60897k5 != null && (view = c44647j0M60897k5.f99148d) != null) {
                ViewExtKt.m66594y(view);
            }
            C44647j0 c44647j0M60897k6 = m60897k4();
            if (c44647j0M60897k6 != null && (swipeRefreshRecyclerView = c44647j0M60897k6.f99149e) != null) {
                swipeRefreshRecyclerView.setEnabled(false);
            }
            this.f46495W.addHeaderView(new View(getContext()));
            LinearLayout headerLayout = this.f46495W.getHeaderLayout();
            int i11 = R$id.rc_hide_divider;
            Boolean bool = Boolean.TRUE;
            headerLayout.setTag(i11, bool);
            this.f46495W.addFooterView(new View(getContext()));
            this.f46495W.removeAllFooterView();
            this.f46495W.getFooterLayout().setTag(i11, bool);
            return;
        }
        m60907x4();
    }

    /* JADX INFO: renamed from: V4 */
    public final void m60888V4(FilterData filterData) {
        this.f50011j0 = filterData.getOrderType();
        this.f50012k0 = filterData.getSymbol();
        this.f50013l0 = filterData.getSide();
        this.f50014m0 = filterData.getTimeType();
        this.f50015n0 = filterData.getFilterStatus();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m60890Z4(String str, String str2, String str3, String str4, String str5, String str6) {
        if (m60882A4()) {
            FilterData filterData = m60906w4().m22240n().getFilterData();
            if (str == null) {
                str = filterData.getSymbol();
            }
            String str7 = str;
            if (str2 == null) {
                str2 = filterData.getStatus();
            }
            String str8 = str2;
            if (str3 == null) {
                str3 = filterData.getTimeType();
            }
            String str9 = str3;
            if (str4 == null) {
                str4 = filterData.getSide();
            }
            String str10 = str4;
            if (str5 == null) {
                str5 = filterData.getFilterStatus();
            }
            String str11 = str5;
            if (str6 == null) {
                str6 = filterData.getOrderType();
            }
            m60906w4().m22244r(new HistoryDelegationContract$Intent.UpdateRequestArgs(new FilterData(str7, str8, str9, str10, str11, str6)));
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final C43724b m60900o4() {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM60899m4 = m60899m4();
        FragmentActivity activity = getActivity();
        DelegationTradeAccount account = m60906w4().m22240n().getAccount();
        C45413z c45413zM60898l4 = m60898l4();
        if (c45413zM60898l4 != null) {
            baseTextView = c45413zM60898l4.f102425f;
        } else {
            baseTextView = null;
        }
        return coreDelegationHistoryFilterViewHelperM60899m4.m22218L(activity, account, baseTextView, new Function1() { // from class: com.kubi.spot.business.delegation.delegateHistory.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationHistoryFragment.m60872c4(this.f50044b, (FilterType.C23032a) obj);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        if (!m60883B4()) {
            mo15906F3();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        WrapperLoadingView wrapperLoadingViewM60878n4 = m60878n4();
        if (wrapperLoadingViewM60878n4 != null) {
            wrapperLoadingViewM60878n4.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int res1, int res2, @Nullable View.OnClickListener onClickListener) {
        super.showEmpty(res1, res2, onClickListener);
        WrapperLoadingView wrapperLoadingViewM60878n4 = m60878n4();
        if (wrapperLoadingViewM60878n4 != null) {
            wrapperLoadingViewM60878n4.showEmpty(res1, res2, onClickListener);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        super.showLoading();
        WrapperLoadingView wrapperLoadingViewM60878n4 = m60878n4();
        if (wrapperLoadingViewM60878n4 != null) {
            wrapperLoadingViewM60878n4.showLoading();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m60907x4() {
        RelativeLayout relativeLayout;
        C45413z c45413zM60898l4 = m60898l4();
        if (c45413zM60898l4 != null && (relativeLayout = c45413zM60898l4.f102422c) != null) {
            ViewExtKt.m66594y(relativeLayout);
        }
        this.f46495W.addHeaderView(new View(getContext()));
        LinearLayout headerLayout = this.f46495W.getHeaderLayout();
        int i11 = R$id.rc_hide_divider;
        Boolean bool = Boolean.TRUE;
        headerLayout.setTag(i11, bool);
        this.f46495W.addFooterView(new View(getContext()));
        this.f46495W.removeAllFooterView();
        this.f46495W.getFooterLayout().setTag(i11, bool);
        m60884N4();
        m60885P4();
        m60887T4();
        m60886R4();
        m60908y4();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m60908y4() {
        View view;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        ImageView imageView;
        View view2;
        BaseTextView baseTextView4;
        if (m60882A4()) {
            C45413z c45413zM60898l4 = m60898l4();
            if (c45413zM60898l4 != null) {
                baseTextView2 = c45413zM60898l4.f102425f;
            } else {
                baseTextView2 = null;
            }
            m60889W4(baseTextView2, C27017c.f54310a.m66516f(R$string.uta_account_spot, new Object[0]), DelegationTradeAccount.a.f20619a.getName());
            C45413z c45413zM60898l5 = m60898l4();
            if (c45413zM60898l5 != null && (baseTextView4 = c45413zM60898l5.f102425f) != null) {
                ViewExtKt.m66594y(baseTextView4);
            }
            C45413z c45413zM60898l6 = m60898l4();
            if (c45413zM60898l6 != null && (view2 = c45413zM60898l6.f102427h) != null) {
                ViewExtKt.m66594y(view2);
            }
            C45413z c45413zM60898l7 = m60898l4();
            if (c45413zM60898l7 != null && (imageView = c45413zM60898l7.f102421b) != null) {
                ViewExtKt.m66594y(imageView);
            }
            C45413z c45413zM60898l8 = m60898l4();
            if (c45413zM60898l8 != null && (baseTextView3 = c45413zM60898l8.f102425f) != null) {
                C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DelegationHistoryFragment.m60881z4(this.f50040b);
                    }
                }, 1, null);
                return;
            }
            return;
        }
        C45413z c45413zM60898l9 = m60898l4();
        if (c45413zM60898l9 != null && (baseTextView = c45413zM60898l9.f102425f) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        C45413z c45413zM60898l10 = m60898l4();
        if (c45413zM60898l10 != null && (view = c45413zM60898l10.f102427h) != null) {
            ViewExtKt.m66577h(view);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        super.showEmpty();
        WrapperLoadingView wrapperLoadingViewM60878n4 = m60878n4();
        if (wrapperLoadingViewM60878n4 != null) {
            wrapperLoadingViewM60878n4.showEmpty(R$string.no_order, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }
}
