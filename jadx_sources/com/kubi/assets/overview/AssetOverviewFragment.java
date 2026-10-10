package com.kubi.assets.overview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetSyncManager;
import com.kubi.assets.AssetTotalNotifier;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.dialog.payment.C9835j;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.DynamicsEntity;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.entity.OldOverviewEntity;
import com.kubi.assets.entity.RollbackEntity;
import com.kubi.assets.overview.account.AccountSettingDialog;
import com.kubi.assets.overview.account.AssetAccountFragment;
import com.kubi.assets.overview.coin.AssetCoinFragment;
import com.kubi.assets.overview.coin.SmallAssetHideDialog;
import com.kubi.assets.overview.ongoing.AssetOnGoingFragment;
import com.kubi.assets.rollback.RollbackFragment;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.sort.AccountTabSortManager;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetEmptyView;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.IAssetV2OverviewEntityGet;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37754f;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41014a;
import p569qq.C43841b;
import p569qq.C43852m;
import p637ta.C44840p3;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;
import y70.C46396e;

/* JADX INFO: compiled from: AssetOverviewFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001YB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\t\u00106\u001a\u00020(H\u0082\bJ\b\u00107\u001a\u000208H\u0014J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020:H\u0014J\b\u0010>\u001a\u00020:H\u0016J\b\u0010?\u001a\u00020:H\u0015J\b\u0010@\u001a\u00020:H\u0002J\u0010\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020(H\u0014J\b\u0010C\u001a\u00020:H\u0015J\b\u0010D\u001a\u00020:H\u0002J\u0012\u0010E\u001a\u00020:2\b\u0010F\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010G\u001a\u00020:2\u0006\u0010F\u001a\u00020\u0011H\u0002J\b\u0010H\u001a\u00020:H\u0002J\b\u0010I\u001a\u00020:H\u0002J\u0012\u0010J\u001a\u00020:2\b\u0010F\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u000208H\u0002J\b\u0010M\u001a\u00020:H\u0002J\b\u0010N\u001a\u00020:H\u0016J\u0010\u0010O\u001a\u00020:2\u0006\u0010P\u001a\u00020(H\u0002J\u0006\u0010Q\u001a\u00020:J\b\u0010R\u001a\u00020:H\u0016J\n\u0010X\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020(X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010S\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020U0T8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetOverviewFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/view/IAssetV2OverviewEntityGet;", "<init>", "()V", "lastRotation", "", "binding", "Lcom/kubi/assets/databinding/FragmentAssetOverviewBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetOverviewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "getOverviewEntity", "()Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "setOverviewEntity", "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V", "fragmentList", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/BaseFragment;", "Lkotlin/collections/ArrayList;", "dynamicsAdapter", "Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;", "getDynamicsAdapter", "()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;", "dynamicsAdapter$delegate", "Lkotlin/Lazy;", "mDynamicsBarList", "", "Lcom/kubi/assets/entity/DynamicsEntity;", "mDynamicsBarIdSet", "", "", "mDynamicsCardList", "isOnCoinPage", "", "isFirst", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "newOverviewEntity", "Lcom/kubi/assets/entity/NewOverviewEntity;", "oldOverviewEntity", "Lcom/kubi/assets/entity/OldOverviewEntity;", "isMiniChartVisible", "checkFragmentValid", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindFlowEvent", "lazyLoad", "initView", "loadData", "onViewHideOrShowToggle", TIMPushProvider.f75062n, "bindState", "lineChartBindState", "onAssetsGet", "myAssetEntity", "sendLineChartEvent", "bindLineChartFlowEvent", "goCoinGuide", "updateNewView", "showFilterIcon", ViewProps.POSITION, "hideRefresh", "onRefresh", "showOrHideDynamicsBar", ViewProps.VISIBLE, "adjustHeaderBottomSpace", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "assetV2OverviewEntityGet", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n147#2,16:766\n158#3,2:782\n158#3,2:784\n158#3,2:786\n81#3,2:788\n158#3,2:790\n153#3,7:792\n81#3,2:818\n158#3,2:820\n81#3,2:822\n81#3,2:824\n135#4,2:799\n135#4,2:801\n135#4,2:803\n808#5,11:805\n1869#5,2:816\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n98#1:766,16\n160#1:782,2\n170#1:784,2\n175#1:786,2\n179#1:788,2\n185#1:790,2\n190#1:792,7\n619#1:818,2\n628#1:820,2\n642#1:822,2\n647#1:824,2\n433#1:799,2\n434#1:801,2\n452#1:803,2\n581#1:805,11\n581#1:816,2\n*E\n"})
public final class AssetOverviewFragment extends SimpleStateFragment<UIState> implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener, IAssetV2OverviewEntityGet {

    /* JADX INFO: renamed from: V */
    @Nullable
    public AssetV2OverviewEntity f18182V;

    /* JADX INFO: renamed from: W */
    public ArrayList<BaseFragment> f18183W;

    /* JADX INFO: renamed from: b0 */
    public boolean f18188b0;

    /* JADX INFO: renamed from: d0 */
    public boolean f18190d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public WrapperLoadingView f18191e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public NewOverviewEntity f18192f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public OldOverviewEntity f18193g0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f18180j0 = {Reflection.property1(new PropertyReference1Impl(AssetOverviewFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetOverviewBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f18179i0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18181U = C45681e.m100799e(this, new Function1<AssetOverviewFragment, C44840p3>() { // from class: com.kubi.assets.overview.AssetOverviewFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44840p3 invoke(@NotNull AssetOverviewFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44840p3.m99206a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44840p3, Unit>() { // from class: com.kubi.assets.overview.AssetOverviewFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44840p3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44840p3 c44840p3) {
            invoke(c44840p3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18184X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOverviewFragment.m18227b4(this.f18544b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public List<DynamicsEntity> f18185Y = new ArrayList();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public Set<String> f18186Z = new LinkedHashSet();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public List<DynamicsEntity> f18187a0 = new ArrayList();

    /* JADX INFO: renamed from: c0 */
    public boolean f18189c0 = true;

    /* JADX INFO: renamed from: h0 */
    public boolean f18194h0 = true;

    /* JADX INFO: compiled from: AssetOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;", "", "<init>", "()V", "PAGE_ID_NEW", "", "PAGE_ID", "SHOW_NEW_GUIDE", "value", "lineChartRange", "getLineChartRange", "()Ljava/lang/String;", "setLineChartRange", "(Ljava/lang/String;)V", "newInstance", "Lcom/kubi/assets/overview/AssetOverviewFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$Companion\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,765:1\n32#2:766\n23#2,2:767\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$Companion\n*L\n141#1:766\n144#1:767,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final String getLineChartRange() {
            return C46392a.m102326h(C42153h.f93593a.m92529s(), "LAST_1_DAY");
        }

        @NotNull
        public final AssetOverviewFragment newInstance() {
            return new AssetOverviewFragment();
        }

        public final void setLineChartRange(@Nullable String str) {
            C46392a.m102333p(C42153h.f93593a.m92529s(), C27041f.m66669i(str, "LAST_1_DAY"));
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$a */
    /* JADX INFO: compiled from: AssetOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/overview/AssetOverviewFragment$initView$11", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10566a extends ViewPager.SimpleOnPageChangeListener {
        public C10566a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            SlidingTabLayout slidingTabLayout;
            ImageView imageView;
            boolean z11;
            ImageView imageView2;
            boolean z12;
            super.onPageSelected(position);
            C46396e.m102355l("asset", "key_overview_tab_position", position);
            C44840p3 c44840p3M18267c4 = AssetOverviewFragment.this.m18267c4();
            boolean z13 = false;
            if (c44840p3M18267c4 != null && (imageView2 = c44840p3M18267c4.f100608k) != null) {
                if (position == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AssetExKt.m15138z(imageView2, z12);
            }
            C44840p3 c44840p3M18267c5 = AssetOverviewFragment.this.m18267c4();
            if (c44840p3M18267c5 != null && (imageView = c44840p3M18267c5.f100607j) != null) {
                if (position == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AssetExKt.m15138z(imageView, z11);
            }
            AssetOverviewFragment assetOverviewFragment = AssetOverviewFragment.this;
            if (position == 0) {
                z13 = true;
            }
            assetOverviewFragment.f18188b0 = z13;
            AssetOverviewFragment.this.m18261B4(position);
            OverviewAnalyticsReporter.f18247a.m18420r(position);
            if (position == 1) {
                AccountTabSortManager accountTabSortManager = AccountTabSortManager.f18789a;
                if (accountTabSortManager.m19367j()) {
                    C44840p3 c44840p3M18267c6 = AssetOverviewFragment.this.m18267c4();
                    if (c44840p3M18267c6 != null && (slidingTabLayout = c44840p3M18267c6.f100618u) != null) {
                        slidingTabLayout.m55290u(1);
                    }
                    accountTabSortManager.m19364g();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$b */
    /* JADX INFO: compiled from: AssetOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/overview/AssetOverviewFragment$initView$12", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10567b extends C45938b {
        public C10567b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            String str;
            SlidingTabLayout slidingTabLayout;
            super.mo18273b(i11);
            if (i11 == 1) {
                AccountTabSortManager accountTabSortManager = AccountTabSortManager.f18789a;
                if (accountTabSortManager.m19367j()) {
                    C44840p3 c44840p3M18267c4 = AssetOverviewFragment.this.m18267c4();
                    if (c44840p3M18267c4 != null && (slidingTabLayout = c44840p3M18267c4.f100618u) != null) {
                        slidingTabLayout.m55290u(1);
                    }
                    accountTabSortManager.m19364g();
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    str = "ongoing";
                } else {
                    str = JAnalysisConstants.Account.KEY_ACCOUNT;
                }
            } else {
                str = "coin";
            }
            OverviewAnalyticsReporter overviewAnalyticsReporter = OverviewAnalyticsReporter.f18247a;
            overviewAnalyticsReporter.m18425x(str);
            overviewAnalyticsReporter.m18426y(i11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindState$2", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$2\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n130#2:766\n808#3,11:767\n1869#3,2:778\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$2\n*L\n471#1:766\n476#1:767,11\n477#1:778,2\n*E\n"})
    public static final class C105742 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C105742(Continuation<? super C105742> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105742 c105742 = AssetOverviewFragment.this.new C105742(continuation);
            c105742.Z$0 = ((Boolean) obj).booleanValue();
            return c105742;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C105742) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetV2OverviewHeaderView assetV2OverviewHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            AccountInfoHeaderView accountInfoHeaderView;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewFragment assetOverviewFragment = AssetOverviewFragment.this;
            if (!assetOverviewFragment.isAdded() || assetOverviewFragment.isDetached()) {
                return Unit.INSTANCE;
            }
            C44840p3 c44840p3M18267c4 = AssetOverviewFragment.this.m18267c4();
            ArrayList arrayList = null;
            if (c44840p3M18267c4 != null && (accountInfoHeaderView = c44840p3M18267c4.f100599b) != null) {
                IAssetAccountView.m20180c(accountInfoHeaderView, null, Boxing.boxBoolean(z11), 1, null);
            }
            C44840p3 c44840p3M18267c5 = AssetOverviewFragment.this.m18267c4();
            if (c44840p3M18267c5 != null && (assetV2OverviewHeaderView = c44840p3M18267c5.f100615r) != null && (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            C44840p3 c44840p3M18267c6 = AssetOverviewFragment.this.m18267c4();
            ShowHideTextView.m54778d(c44840p3M18267c6 != null ? c44840p3M18267c6.f100615r : null, z11);
            C44840p3 c44840p3M18267c7 = AssetOverviewFragment.this.m18267c4();
            ShowHideTextView.m54778d(c44840p3M18267c7 != null ? c44840p3M18267c7.f100599b : null, z11);
            ArrayList arrayList2 = AssetOverviewFragment.this.f18183W;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            } else {
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof AssetV2OverviewAdapter.InterfaceC10586a) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((AssetV2OverviewAdapter.InterfaceC10586a) it.next()).mo16633T2(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindState$4", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$4\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,765:1\n130#2:766\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$4\n*L\n482#1:766\n*E\n"})
    public static final class C105764 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C105764(Continuation<? super C105764> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105764 c105764 = AssetOverviewFragment.this.new C105764(continuation);
            c105764.Z$0 = ((Boolean) obj).booleanValue();
            return c105764;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C105764) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetV2OverviewHeaderView assetV2OverviewHeaderView;
            AlertTipsTextView rollbackTipView;
            AssetV2OverviewHeaderView assetV2OverviewHeaderView2;
            AlertTipsTextView rollbackTipView2;
            AssetV2OverviewHeaderView assetV2OverviewHeaderView3;
            AlertTipsTextView rollbackTipView3;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewFragment assetOverviewFragment = AssetOverviewFragment.this;
            if (!assetOverviewFragment.isAdded() || assetOverviewFragment.isDetached()) {
                return Unit.INSTANCE;
            }
            if (z11) {
                C44840p3 c44840p3M18267c4 = AssetOverviewFragment.this.m18267c4();
                if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView3 = c44840p3M18267c4.f100615r) != null && (rollbackTipView3 = assetV2OverviewHeaderView3.getRollbackTipView()) != null) {
                    ViewExtKt.m66594y(rollbackTipView3);
                }
                C44840p3 c44840p3M18267c5 = AssetOverviewFragment.this.m18267c4();
                if (c44840p3M18267c5 != null && (assetV2OverviewHeaderView2 = c44840p3M18267c5.f100615r) != null && (rollbackTipView2 = assetV2OverviewHeaderView2.getRollbackTipView()) != null) {
                    final AssetOverviewFragment assetOverviewFragment2 = AssetOverviewFragment.this;
                    C27046k.m66711z(rollbackTipView2, 0L, new Function0() { // from class: com.kubi.assets.overview.z
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AssetOverviewFragment.C105764.m18275f(assetOverviewFragment2);
                        }
                    }, 1, null);
                }
                AssetsProfitLossAnalysisManager assetsProfitLossAnalysisManager = AssetsProfitLossAnalysisManager.f40608a;
                int iM49942d = assetsProfitLossAnalysisManager.m49942d();
                assetsProfitLossAnalysisManager.m49949k(iM49942d + 1);
                Boxing.boxInt(iM49942d);
            } else {
                C44840p3 c44840p3M18267c6 = AssetOverviewFragment.this.m18267c4();
                if (c44840p3M18267c6 != null && (assetV2OverviewHeaderView = c44840p3M18267c6.f100615r) != null && (rollbackTipView = assetV2OverviewHeaderView.getRollbackTipView()) != null) {
                    ViewExtKt.m66577h(rollbackTipView);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m18275f(AssetOverviewFragment assetOverviewFragment) {
            Context context = assetOverviewFragment.getContext();
            if (context != null) {
                RollbackFragment.Companion companion = RollbackFragment.f18563X;
                List<RollbackEntity> rollbackList = AssetOverviewFragment.m18215N3(assetOverviewFragment).getRollbackList();
                if (rollbackList == null) {
                    return Unit.INSTANCE;
                }
                companion.startRollbackFragment(context, new ArrayList<>(rollbackList));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/DynamicsEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindState$6", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$6\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n130#2:766\n774#3:767\n865#3:768\n1761#3,3:769\n866#3:772\n774#3:773\n865#3,2:774\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$6\n*L\n499#1:766\n503#1:767\n503#1:768\n504#1:769,3\n503#1:772\n506#1:773\n506#1:774,2\n*E\n"})
    public static final class C105786 extends SuspendLambda implements Function2<List<? extends DynamicsEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends DynamicsEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<DynamicsEntity>) list, continuation);
        }

        public C105786(Continuation<? super C105786> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105786 c105786 = AssetOverviewFragment.this.new C105786(continuation);
            c105786.L$0 = obj;
            return c105786;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<DynamicsEntity> list, Continuation<? super Unit> continuation) {
            return ((C105786) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewFragment assetOverviewFragment = AssetOverviewFragment.this;
            if (!assetOverviewFragment.isAdded() || assetOverviewFragment.isDetached()) {
                return Unit.INSTANCE;
            }
            if (list != null) {
                AssetOverviewFragment assetOverviewFragment2 = AssetOverviewFragment.this;
                assetOverviewFragment2.f18185Y.clear();
                assetOverviewFragment2.f18185Y.addAll(list);
                Set set = assetOverviewFragment2.f18186Z;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    String str = (String) obj2;
                    List list2 = assetOverviewFragment2.f18185Y;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(C27041f.m66668h(((DynamicsEntity) it.next()).getId()), str)) {
                                arrayList.add(obj2);
                                break;
                            }
                        }
                    }
                }
                assetOverviewFragment2.f18186Z = CollectionsKt.toMutableSet(arrayList);
                List list3 = assetOverviewFragment2.f18185Y;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (!assetOverviewFragment2.f18186Z.contains(C27041f.m66668h(((DynamicsEntity) obj3).getId()))) {
                        arrayList2.add(obj3);
                    }
                }
                assetOverviewFragment2.f18185Y = CollectionsKt.toMutableList((Collection) arrayList2);
                if (assetOverviewFragment2.f18185Y.isEmpty()) {
                    assetOverviewFragment2.m18262C4(false);
                } else {
                    assetOverviewFragment2.m18262C4(true);
                    assetOverviewFragment2.m18268d4().replaceData(assetOverviewFragment2.f18185Y);
                    for (DynamicsEntity dynamicsEntity : assetOverviewFragment2.f18185Y) {
                        OverviewAnalyticsReporter.f18247a.m18414l(C27039d.m66650j(dynamicsEntity.getDynamicsType()), C27041f.m66668h(dynamicsEntity.getStyle()));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetOverviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/DynamicsEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$bindState$8", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$8\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,765:1\n130#2:766\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$bindState$8\n*L\n524#1:766\n*E\n"})
    public static final class C105808 extends SuspendLambda implements Function2<List<? extends DynamicsEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends DynamicsEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<DynamicsEntity>) list, continuation);
        }

        public C105808(Continuation<? super C105808> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105808 c105808 = AssetOverviewFragment.this.new C105808(continuation);
            c105808.L$0 = obj;
            return c105808;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<DynamicsEntity> list, Continuation<? super Unit> continuation) {
            return ((C105808) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetDynamicsCardView assetDynamicsCardView;
            AssetDynamicsCardView assetDynamicsCardView2;
            AssetDynamicsCardView assetDynamicsCardView3;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewFragment assetOverviewFragment = AssetOverviewFragment.this;
            if (!assetOverviewFragment.isAdded() || assetOverviewFragment.isDetached()) {
                return Unit.INSTANCE;
            }
            if (list != null) {
                AssetOverviewFragment assetOverviewFragment2 = AssetOverviewFragment.this;
                assetOverviewFragment2.f18187a0.clear();
                assetOverviewFragment2.f18187a0.addAll(list);
                if (list.isEmpty()) {
                    C44840p3 c44840p3M18267c4 = assetOverviewFragment2.m18267c4();
                    if (c44840p3M18267c4 != null && (assetDynamicsCardView3 = c44840p3M18267c4.f100603f) != null) {
                        AssetExKt.m15138z(assetDynamicsCardView3, false);
                    }
                    assetOverviewFragment2.m18265Z3();
                } else {
                    C44840p3 c44840p3M18267c5 = assetOverviewFragment2.m18267c4();
                    if (c44840p3M18267c5 != null && (assetDynamicsCardView2 = c44840p3M18267c5.f100603f) != null) {
                        AssetExKt.m15138z(assetDynamicsCardView2, true);
                    }
                    assetOverviewFragment2.m18265Z3();
                    C44840p3 c44840p3M18267c6 = assetOverviewFragment2.m18267c4();
                    if (c44840p3M18267c6 != null && (assetDynamicsCardView = c44840p3M18267c6.f100603f) != null) {
                        assetDynamicsCardView.m18201e((DynamicsEntity) CollectionsKt.getOrNull(list, 0));
                    }
                    OverviewAnalyticsReporter overviewAnalyticsReporter = OverviewAnalyticsReporter.f18247a;
                    DynamicsEntity dynamicsEntity = (DynamicsEntity) CollectionsKt.getOrNull(list, 0);
                    int iM66650j = C27039d.m66650j(dynamicsEntity != null ? dynamicsEntity.getDynamicsType() : null);
                    DynamicsEntity dynamicsEntity2 = (DynamicsEntity) CollectionsKt.getOrNull(list, 0);
                    overviewAnalyticsReporter.m18414l(iM66650j, C27041f.m66668h(dynamicsEntity2 != null ? dynamicsEntity2.getStyle() : null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m18248t4(Boolean bool) {
        C12572a.m23695d("event_hide_small_asset", bool, 0L, 4, null);
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m18252v4(Boolean bool) {
        C12572a.m23695d("EVENT_HIDE_SMALL_ASSET_ACCOUNT", bool, 0L, 4, null);
    }

    /* JADX INFO: renamed from: y4 */
    private final void m18257y4() {
        CustomViewPager customViewPager;
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        C44840p3 c44840p3M18267c4 = m18267c4();
        int currentItem = (c44840p3M18267c4 == null || (customViewPager = c44840p3M18267c4.f100623z) == null) ? -1 : customViewPager.getCurrentItem();
        if (CollectionsKt.listOf((Object[]) new Integer[]{0, 2}).contains(Integer.valueOf(currentItem))) {
            ArrayList<BaseFragment> arrayList = this.f18183W;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                arrayList = null;
            }
            Object orNull = CollectionsKt.getOrNull(arrayList, currentItem);
            SwipeRefreshLayout.OnRefreshListener onRefreshListener = orNull instanceof SwipeRefreshLayout.OnRefreshListener ? (SwipeRefreshLayout.OnRefreshListener) orNull : null;
            if (onRefreshListener != null) {
                onRefreshListener.onRefresh();
            }
        }
        sendIntent(AssetV2OverviewContract$UiIntent.GetDynamicsData.INSTANCE);
    }

    /* JADX INFO: renamed from: b4 */
    public static final AssetDynamicsBarAdapter m18227b4(AssetOverviewFragment assetOverviewFragment) {
        return new AssetDynamicsBarAdapter(assetOverviewFragment);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m18228h4(AssetOverviewFragment assetOverviewFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetOverviewFragment.sendIntent(new AssetV2OverviewContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m18229i4() {
        C43852m.m96590b("B1overview", ChannelKycRequest.SCENE_DEPOSIT, "zeroBalance", TuplesKt.m90091to("after_page_id", "B1depositCoinList"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.m19137F(AssetsHelper.f18684a, C43852m.m96601m("B1overview", ChannelKycRequest.SCENE_DEPOSIT, "zeroBalance"), 0, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m18230j4() {
        C43852m.m96590b("B1overview", "buyFiat", "zeroBalance", TuplesKt.m90091to("after_page_id", "B7FastTrade"), TuplesKt.m90091to("norm_version", "1"));
        AssetsHelper.f18684a.m19177z(C43852m.m96601m("B1overview", "buyFiat", "zeroBalance"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m18231k4() {
        C43852m.m96590b("B1overview", "buyP2P", "zeroBalance", TuplesKt.m90091to("after_page_id", "B7FastTrade"), TuplesKt.m90091to("norm_version", "1"));
        AssetsHelper.m19138K(AssetsHelper.f18684a, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m18232l4() {
        C43852m.m96590b("B1overview", "depositFiat", "zeroBalance", TuplesKt.m90091to("after_page_id", "B7FiatList"), TuplesKt.m90091to("norm_version", "1"), TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.f18684a.m19152E(C43852m.m96601m("B1overview", "depositFiat", "zeroBalance"), 1, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m18234m4() {
        AssetsHelper.f18684a.m19157L();
        C43841b.m96557d("B1overview_charge_record_load", "page_load_start", null, 4, null);
        C43852m.m96591c("B1overview", "record", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m18236n4(AssetOverviewFragment assetOverviewFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetOverviewFragment.sendIntent(new AssetV2OverviewContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m18240p4(AssetOverviewFragment assetOverviewFragment, AppBarLayout appBarLayout, int i11) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        KuCoinRefreshLayout kuCoinRefreshLayout2;
        if (i11 == 0) {
            C44840p3 c44840p3M18267c4 = assetOverviewFragment.m18267c4();
            if (c44840p3M18267c4 == null || (kuCoinRefreshLayout2 = c44840p3M18267c4.f100616s) == null) {
                return;
            }
            kuCoinRefreshLayout2.setEnableRefresh(true);
            return;
        }
        C44840p3 c44840p3M18267c5 = assetOverviewFragment.m18267c4();
        if (c44840p3M18267c5 == null || (kuCoinRefreshLayout = c44840p3M18267c5.f100616s) == null) {
            return;
        }
        kuCoinRefreshLayout.setEnableRefresh(false);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m18242q4(AssetOverviewFragment assetOverviewFragment) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_assets_coin_intro).m54156M4(assetOverviewFragment.getString(R$string.kc_assets_coin_desc_1) + '\n' + assetOverviewFragment.getString(R$string.kc_assets_coin_desc_2) + '\n' + assetOverviewFragment.getStringRes(R$string.kc_assets_coin_desc_site_3, C38184b.f85884a.m86146a())).m54162S4(R$string.already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.overview.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AssetOverviewFragment.m18244r4(dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = assetOverviewFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "AlertDialogFragmentHelper");
        OverviewAnalyticsReporter.f18247a.m18425x("info");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m18246s4(AssetOverviewFragment assetOverviewFragment) {
        SmallAssetHideDialog smallAssetHideDialog = new SmallAssetHideDialog(new Consumer() { // from class: com.kubi.assets.overview.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetOverviewFragment.m18248t4((Boolean) obj);
            }
        });
        FragmentManager childFragmentManager = assetOverviewFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        smallAssetHideDialog.show(childFragmentManager, "SmallAssetHideDialog");
        OverviewAnalyticsReporter.f18247a.m18425x(TIMPushProvider.f75063o);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m18250u4(AssetOverviewFragment assetOverviewFragment) {
        AccountSettingDialog accountSettingDialog = new AccountSettingDialog(new Consumer() { // from class: com.kubi.assets.overview.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetOverviewFragment.m18252v4((Boolean) obj);
            }
        });
        FragmentManager childFragmentManager = assetOverviewFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        accountSettingDialog.show(childFragmentManager, "AccountSettingDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m18254w4(AssetOverviewFragment assetOverviewFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Integer dynamicsType;
        Integer dynamicsType2;
        Integer dynamicsType3;
        if (i11 < 0 || i11 > baseQuickAdapter.getData().size() - 1) {
            return;
        }
        DynamicsEntity item = assetOverviewFragment.m18268d4().getItem(i11);
        assetOverviewFragment.f18186Z.add(C27041f.m66668h(item != null ? item.getId() : null));
        C46396e.m102359p("asset", "key_overview_dynamics_bar", assetOverviewFragment.f18186Z);
        TypeIntrinsics.asMutableCollection(assetOverviewFragment.f18185Y).remove(item);
        String url = item != null ? item.getUrl() : null;
        if (url != null && url.length() != 0) {
            RouteExKt.m56217H(C27041f.m66668h(item != null ? item.getUrl() : null));
        } else if ((item != null && (dynamicsType3 = item.getDynamicsType()) != null && dynamicsType3.intValue() == 0) || (item != null && (dynamicsType2 = item.getDynamicsType()) != null && dynamicsType2.intValue() == 1)) {
            InterfaceC37749a.a.m85113h(C37304a.f82764a, C27041f.m66668h(item.getId()), item.getDynamicsType().toString(), null, null, null, 28, null);
        } else if (item != null && (dynamicsType = item.getDynamicsType()) != null && dynamicsType.intValue() == 2) {
            InterfaceC37754f.a.m85130b(C37304a.f82764a, "finance", null, null, null, 14, null);
        }
        OverviewAnalyticsReporter.f18247a.m18408f(C27039d.m66650j(item != null ? item.getDynamicsType() : null), C27041f.m66668h(item != null ? item.getStyle() : null));
    }

    /* JADX INFO: renamed from: A4 */
    public final void m18260A4(AssetV2OverviewEntity assetV2OverviewEntity) {
        BigDecimal bigDecimalM89916A;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        if (this.f18194h0) {
            String lineChartRange = f18179i0.getLineChartRange();
            if (lineChartRange == null) {
                lineChartRange = "LAST_1_DAY";
            }
            sendIntent(new AssetV2OverviewContract$UiIntent.GetLineChartPoint(lineChartRange));
        }
        AssetsProfitLossAnalysisManager assetsProfitLossAnalysisManager = AssetsProfitLossAnalysisManager.f40608a;
        assetsProfitLossAnalysisManager.m49953o();
        BigDecimal totalAssetValue = assetV2OverviewEntity.getTotalAssetValue();
        if (totalAssetValue != null) {
            AssetV2OverviewEntity assetV2OverviewEntity2 = this.f18182V;
            bigDecimalM89916A = C41014a.m89916A(totalAssetValue, assetV2OverviewEntity2 != null ? assetV2OverviewEntity2.getBaseCurrency() : null, C38184b.f85884a.m86146a());
        } else {
            bigDecimalM89916A = null;
        }
        assetsProfitLossAnalysisManager.m49952n(C41014a.m89922G(bigDecimalM89916A, null, 1, null), assetV2OverviewEntity.getBaseCurrency());
        String lineChartRange2 = f18179i0.getLineChartRange();
        sendIntent(new AssetV2OverviewContract$UiIntent.GetProfitLoss(lineChartRange2 != null ? lineChartRange2 : "LAST_1_DAY"));
        C44840p3 c44840p3M18267c4 = m18267c4();
        if (c44840p3M18267c4 == null || (assetV2OverviewHeaderView = c44840p3M18267c4.f100615r) == null || (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) == null) {
            return;
        }
        accountInfoHeader.m19944G(this.f18192f0, this.f18182V);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m18261B4(int i11) {
        ShapeImageView shapeImageView;
        ShapeImageView shapeImageView2;
        AssetV2OverviewEntity assetV2OverviewEntity = this.f18182V;
        if (C27025c.m66567e(assetV2OverviewEntity != null ? Boolean.valueOf(assetV2OverviewEntity.hasZeroAccount()) : null, true) && i11 == 1) {
            C44840p3 c44840p3M18267c4 = m18267c4();
            if (c44840p3M18267c4 == null || (shapeImageView2 = c44840p3M18267c4.f100606i) == null) {
                return;
            }
            AssetExKt.m15138z(shapeImageView2, true);
            return;
        }
        C44840p3 c44840p3M18267c5 = m18267c4();
        if (c44840p3M18267c5 == null || (shapeImageView = c44840p3M18267c5.f100606i) == null) {
            return;
        }
        AssetExKt.m15138z(shapeImageView, false);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m18263D4(AssetV2OverviewEntity assetV2OverviewEntity) {
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalBalance;
        AccountInfoHeaderView accountInfoHeaderView2;
        BigDecimal totalBalance2;
        BigDecimal totalBalance3;
        LinearLayoutCompat linearLayoutCompat;
        CoordinatorLayout coordinatorLayout;
        C44840p3 c44840p3M18267c4 = m18267c4();
        if (c44840p3M18267c4 != null && (coordinatorLayout = c44840p3M18267c4.f100601d) != null) {
            coordinatorLayout.setVisibility(8);
        }
        C44840p3 c44840p3M18267c5 = m18267c4();
        if (c44840p3M18267c5 != null && (linearLayoutCompat = c44840p3M18267c5.f100602e) != null) {
            linearLayoutCompat.setVisibility(0);
        }
        if (assetV2OverviewEntity != null) {
            AssetSingleEntity total = assetV2OverviewEntity.getTotal();
            String plainString = null;
            String strM66669i = C27041f.m66669i((total == null || (totalBalance3 = total.getTotalBalance()) == null) ? null : C37885i.m85562a(totalBalance3, assetV2OverviewEntity.getBaseCurrency(), C11273q.m20046b(assetV2OverviewEntity.getBaseCurrency())), "--");
            AssetSingleEntity total2 = assetV2OverviewEntity.getTotal();
            String strM66668h = C27041f.m66668h((total2 == null || (totalBalance2 = total2.getTotalBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(totalBalance2, assetV2OverviewEntity.getBaseCurrency()), null, null, 0, false, true, false, true, 47, null));
            C44840p3 c44840p3M18267c6 = m18267c4();
            if (c44840p3M18267c6 != null && (accountInfoHeaderView2 = c44840p3M18267c6.f100599b) != null) {
                accountInfoHeaderView2.m19942B(assetV2OverviewEntity, strM66669i, strM66668h);
            }
            AssetSyncManager assetSyncManager = AssetSyncManager.f16327a;
            HomeAssetInfo homeAssetInfoM15157f = assetSyncManager.m15157f();
            AssetSingleEntity total3 = assetV2OverviewEntity.getTotal();
            if (total3 != null && (totalBalance = total3.getTotalBalance()) != null) {
                plainString = totalBalance.toPlainString();
            }
            homeAssetInfoM15157f.setOriginalTotalAsset(plainString);
            homeAssetInfoM15157f.setTotalAsset(strM66669i);
            homeAssetInfoM15157f.setFiatValue(AssetExKt.m15117e(strM66668h));
            String baseCurrencyName = assetV2OverviewEntity.getBaseCurrencyName();
            if (baseCurrencyName == null) {
                baseCurrencyName = "";
            }
            homeAssetInfoM15157f.setBalanceCurrency(baseCurrencyName);
            homeAssetInfoM15157f.setTimestamp(assetV2OverviewEntity.getTimestamp());
            assetSyncManager.m15161j(homeAssetInfoM15157f);
            C44840p3 c44840p3M18267c7 = m18267c4();
            if (c44840p3M18267c7 == null || (accountInfoHeaderView = c44840p3M18267c7.f100599b) == null) {
                return;
            }
            accountInfoHeaderView.setZeroBalanceImgVisible(true);
        }
    }

    @Override // com.kubi.assets.view.IAssetV2OverviewEntityGet
    @Nullable
    /* JADX INFO: renamed from: N2, reason: from getter */
    public AssetV2OverviewEntity getF18182V() {
        return this.f18182V;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m18266a4() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "touch_line_chart".length();
        }
        C12572a.m23692a(this, true, new C10569xab318cf9("touch_line_chart", null, this));
        if (c12573b.m23696a()) {
            "no_touch_line_chart".length();
        }
        C12572a.m23692a(this, true, new C10570xab318cfa("no_touch_line_chart", null, this));
        if (c12573b.m23696a()) {
            "update_range".length();
        }
        C12572a.m23692a(this, true, new C10571xab318cfb("update_range", null, this));
        if (c12573b.m23696a()) {
            "change_mini_chart_visible".length();
        }
        C12572a.m23692a(this, true, new C10572xab318cfc("change_mini_chart_visible", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.AssetOverviewFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C105742(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.AssetOverviewFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getIsShowRollBackTip());
            }
        }, new C105764(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.AssetOverviewFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDynamicsBarList();
            }
        }, new C105786(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.AssetOverviewFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDynamicsCardList();
            }
        }, new C105808(null));
        m18272x4();
    }

    /* JADX INFO: renamed from: c4 */
    public final C44840p3 m18267c4() {
        return (C44840p3) this.f18181U.getValue(this, f18180j0[0]);
    }

    /* JADX INFO: renamed from: d4 */
    public final AssetDynamicsBarAdapter m18268d4() {
        return (AssetDynamicsBarAdapter) this.f18184X.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: e4 */
    public final AssetV2OverviewEntity m18269e4() {
        return this.f18182V;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m18270f4() {
        if (this.f18189c0) {
            this.f18189c0 = false;
            AssetGuideHelper assetGuideHelper = AssetGuideHelper.f18389a;
            C44840p3 c44840p3M18267c4 = m18267c4();
            assetGuideHelper.m18646c(c44840p3M18267c4 != null ? c44840p3M18267c4.f100618u : null, this);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_asset_overview;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18407W() {
        return this.f18190d0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetOverviewViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged", "KCLongMethodCheck", "KCCyclomaticComplexityCheck"})
    public void initView() {
        ShapeImageView shapeImageView;
        ImageView imageView;
        ImageView imageView2;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        AppBarLayout appBarLayout;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        AccountInfoHeaderView accountInfoHeaderView;
        AccountInfoHeaderView accountInfoHeaderView2;
        AccountInfoHeaderView accountInfoHeaderView3;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        LinearLayoutCompat linearLayoutCompat5;
        LinearLayoutCompat linearLayoutCompat6;
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat7;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView2;
        ImageView imageView3;
        ImageView imageView4;
        CustomViewPager customViewPager2;
        C44840p3 c44840p3M18267c4;
        SlidingTabLayout slidingTabLayout2;
        SlidingTabLayout slidingTabLayout3;
        CustomViewPager customViewPager3;
        CustomViewPager customViewPager4;
        RecyclerView recyclerView;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView3;
        AccountInfoHeaderView accountInfoHeader2;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView4;
        AccountInfoHeaderView accountInfoHeader3;
        SlidingTabLayout slidingTabLayout4;
        boolean z11 = true;
        C44840p3 c44840p3M18267c5 = m18267c4();
        this.f18191e0 = WrapperLoadingView.injectView(c44840p3M18267c5 != null ? c44840p3M18267c5.f100614q : null);
        this.f18183W = CollectionsKt.arrayListOf(AssetCoinFragment.f18251c0.newInstance(), AssetAccountFragment.f18224a0.newInstance());
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R$string.coin));
        arrayList.add(getString(R$string.asset_account));
        if (C24129b.m58030b(SiteVisibleConfigKey.ONGOING)) {
            ArrayList<BaseFragment> arrayList2 = this.f18183W;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                arrayList2 = null;
            }
            arrayList2.add(AssetOnGoingFragment.f18403Z.newInstance());
            arrayList.add(getString(R$string.kc_assets_ongoing));
        }
        C44840p3 c44840p3M18267c6 = m18267c4();
        if (c44840p3M18267c6 != null && (slidingTabLayout4 = c44840p3M18267c6.f100618u) != null) {
            slidingTabLayout4.setNeedBold(true);
        }
        C44840p3 c44840p3M18267c7 = m18267c4();
        if (c44840p3M18267c7 != null && (assetV2OverviewHeaderView4 = c44840p3M18267c7.f100615r) != null && (accountInfoHeader3 = assetV2OverviewHeaderView4.getAccountInfoHeader()) != null) {
            accountInfoHeader3.m19949V(this.f18194h0);
        }
        boolean z12 = C24129b.m58030b(SiteVisibleConfigKey.AiAssets) && AssetRemoteConfig.f18903a.m19567j();
        C44840p3 c44840p3M18267c8 = m18267c4();
        if (c44840p3M18267c8 != null && (assetV2OverviewHeaderView3 = c44840p3M18267c8.f100615r) != null && (accountInfoHeader2 = assetV2OverviewHeaderView3.getAccountInfoHeader()) != null) {
            accountInfoHeader2.m19948T(z12);
        }
        C44840p3 c44840p3M18267c9 = m18267c4();
        if (c44840p3M18267c9 != null && (recyclerView = c44840p3M18267c9.f100604g) != null) {
            recyclerView.setAdapter(m18268d4());
        }
        m18268d4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.overview.r
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                AssetOverviewFragment.m18254w4(this.f18546a, baseQuickAdapter, view, i11);
            }
        });
        this.f18186Z = C46396e.m102352i("asset", "key_overview_dynamics_bar", this.f18186Z);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList<BaseFragment> arrayList3 = this.f18183W;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList3 = null;
        }
        C27103z c27103z = new C27103z(childFragmentManager, arrayList3, arrayList);
        C44840p3 c44840p3M18267c10 = m18267c4();
        if (c44840p3M18267c10 != null && (customViewPager4 = c44840p3M18267c10.f100623z) != null) {
            customViewPager4.setAdapter(c27103z);
        }
        C44840p3 c44840p3M18267c11 = m18267c4();
        if (c44840p3M18267c11 != null && (customViewPager3 = c44840p3M18267c11.f100623z) != null) {
            ArrayList<BaseFragment> arrayList4 = this.f18183W;
            if (arrayList4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                arrayList4 = null;
            }
            customViewPager3.setOffscreenPageLimit(arrayList4.size());
        }
        C44840p3 c44840p3M18267c12 = m18267c4();
        if (c44840p3M18267c12 != null && (slidingTabLayout3 = c44840p3M18267c12.f100618u) != null) {
            C44840p3 c44840p3M18267c13 = m18267c4();
            slidingTabLayout3.setViewPager(c44840p3M18267c13 != null ? c44840p3M18267c13.f100623z : null);
        }
        if (AccountTabSortManager.f18789a.m19367j() && (c44840p3M18267c4 = m18267c4()) != null && (slidingTabLayout2 = c44840p3M18267c4.f100618u) != null) {
            slidingTabLayout2.m55281G(1);
        }
        int iM102348e = C46396e.m102348e("asset", "key_overview_tab_position", 1);
        C44840p3 c44840p3M18267c14 = m18267c4();
        if (c44840p3M18267c14 != null && (customViewPager2 = c44840p3M18267c14.f100623z) != null) {
            customViewPager2.setCurrentItem(iM102348e);
        }
        this.f18188b0 = iM102348e == 0;
        C44840p3 c44840p3M18267c15 = m18267c4();
        if (c44840p3M18267c15 != null && (imageView4 = c44840p3M18267c15.f100608k) != null) {
            AssetExKt.m15138z(imageView4, this.f18188b0);
        }
        C44840p3 c44840p3M18267c16 = m18267c4();
        if (c44840p3M18267c16 != null && (imageView3 = c44840p3M18267c16.f100607j) != null) {
            AssetExKt.m15138z(imageView3, this.f18188b0);
        }
        m18261B4(iM102348e);
        C44840p3 c44840p3M18267c17 = m18267c4();
        if (c44840p3M18267c17 != null && (assetV2OverviewHeaderView2 = c44840p3M18267c17.f100615r) != null) {
            assetV2OverviewHeaderView2.m18320f(this);
        }
        C44840p3 c44840p3M18267c18 = m18267c4();
        if (c44840p3M18267c18 != null && (assetV2OverviewHeaderView = c44840p3M18267c18.f100615r) != null && (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.overview.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetOverviewFragment.m18228h4(this.f18554b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44840p3 c44840p3M18267c19 = m18267c4();
        if (c44840p3M18267c19 != null && (linearLayoutCompat7 = c44840p3M18267c19.f100611n) != null) {
            C27046k.m66711z(linearLayoutCompat7, 0L, new Function0() { // from class: com.kubi.assets.overview.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOverviewFragment.m18229i4();
                }
            }, 1, null);
        }
        C44840p3 c44840p3M18267c20 = m18267c4();
        if (c44840p3M18267c20 != null && (baseTextView = c44840p3M18267c20.f100620w) != null) {
            if (!C24129b.m58030b(SiteVisibleConfigKey.FastTrade) && !C24129b.m58030b(SiteVisibleConfigKey.P2P) && !C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit)) {
                z11 = false;
            }
            AssetExKt.m15138z(baseTextView, z11);
        }
        C44840p3 c44840p3M18267c21 = m18267c4();
        if (c44840p3M18267c21 != null && (linearLayoutCompat6 = c44840p3M18267c21.f100609l) != null) {
            AssetExKt.m15138z(linearLayoutCompat6, C24129b.m58030b(SiteVisibleConfigKey.FastTrade));
        }
        C44840p3 c44840p3M18267c22 = m18267c4();
        if (c44840p3M18267c22 != null && (linearLayoutCompat5 = c44840p3M18267c22.f100609l) != null) {
            C27046k.m66711z(linearLayoutCompat5, 0L, new Function0() { // from class: com.kubi.assets.overview.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOverviewFragment.m18230j4();
                }
            }, 1, null);
        }
        C44840p3 c44840p3M18267c23 = m18267c4();
        if (c44840p3M18267c23 != null && (linearLayoutCompat4 = c44840p3M18267c23.f100610m) != null) {
            AssetExKt.m15138z(linearLayoutCompat4, C24129b.m58030b(SiteVisibleConfigKey.P2P));
        }
        C44840p3 c44840p3M18267c24 = m18267c4();
        if (c44840p3M18267c24 != null && (linearLayoutCompat3 = c44840p3M18267c24.f100610m) != null) {
            C27046k.m66711z(linearLayoutCompat3, 0L, new Function0() { // from class: com.kubi.assets.overview.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOverviewFragment.m18231k4();
                }
            }, 1, null);
        }
        C44840p3 c44840p3M18267c25 = m18267c4();
        if (c44840p3M18267c25 != null && (linearLayoutCompat2 = c44840p3M18267c25.f100612o) != null) {
            AssetExKt.m15138z(linearLayoutCompat2, C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit));
        }
        C44840p3 c44840p3M18267c26 = m18267c4();
        if (c44840p3M18267c26 != null && (linearLayoutCompat = c44840p3M18267c26.f100612o) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.assets.overview.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOverviewFragment.m18232l4();
                }
            }, 1, null);
        }
        C44840p3 c44840p3M18267c27 = m18267c4();
        if (c44840p3M18267c27 != null && (accountInfoHeaderView3 = c44840p3M18267c27.f100599b) != null) {
            accountInfoHeaderView3.mo19955d(this, "B1overview");
        }
        C44840p3 c44840p3M18267c28 = m18267c4();
        if (c44840p3M18267c28 != null && (accountInfoHeaderView2 = c44840p3M18267c28.f100599b) != null) {
            AccountInfoHeaderView.m19940y(accountInfoHeaderView2, new Action() { // from class: com.kubi.assets.overview.j
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetOverviewFragment.m18234m4();
                }
            }, null, R$drawable.ic2_history_20, 0, 0, null, false, false, 186, null);
        }
        C44840p3 c44840p3M18267c29 = m18267c4();
        if (c44840p3M18267c29 != null && (accountInfoHeaderView = c44840p3M18267c29.f100599b) != null) {
            IAssetAccountView.m20180c(accountInfoHeaderView, new Consumer() { // from class: com.kubi.assets.overview.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetOverviewFragment.m18236n4(this.f18395b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44840p3 c44840p3M18267c30 = m18267c4();
        if (c44840p3M18267c30 != null && (kuCoinRefreshLayout = c44840p3M18267c30.f100616s) != null) {
            kuCoinRefreshLayout.m54650b(new Function0() { // from class: com.kubi.assets.overview.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOverviewFragment.m18238o4(this.f18396b);
                }
            });
        }
        C44840p3 c44840p3M18267c31 = m18267c4();
        if (c44840p3M18267c31 != null && (appBarLayout = c44840p3M18267c31.f100600c) != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.kubi.assets.overview.m
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                    AssetOverviewFragment.m18240p4(this.f18397a, appBarLayout2, i11);
                }
            });
        }
        C44840p3 c44840p3M18267c32 = m18267c4();
        if (c44840p3M18267c32 != null && (customViewPager = c44840p3M18267c32.f100623z) != null) {
            customViewPager.addOnPageChangeListener(new C10566a());
        }
        C44840p3 c44840p3M18267c33 = m18267c4();
        if (c44840p3M18267c33 != null && (slidingTabLayout = c44840p3M18267c33.f100618u) != null) {
            slidingTabLayout.setOnTabSelectListener(new C10567b());
        }
        C44840p3 c44840p3M18267c34 = m18267c4();
        if (c44840p3M18267c34 != null && (imageView2 = c44840p3M18267c34.f100608k) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.assets.overview.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOverviewFragment.m18242q4(this.f18548b);
                }
            }, 1, null);
        }
        C44840p3 c44840p3M18267c35 = m18267c4();
        if (c44840p3M18267c35 != null && (imageView = c44840p3M18267c35.f100607j) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.overview.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOverviewFragment.m18246s4(this.f18550b);
                }
            }, 1, null);
        }
        C44840p3 c44840p3M18267c36 = m18267c4();
        if (c44840p3M18267c36 == null || (shapeImageView = c44840p3M18267c36.f100606i) == null) {
            return;
        }
        C27046k.m66711z(shapeImageView, 0L, new Function0() { // from class: com.kubi.assets.overview.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetOverviewFragment.m18250u4(this.f18552b);
            }
        }, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        RecyclerView recyclerViewM18395H3;
        CustomViewPager customViewPager;
        ArrayList<BaseFragment> arrayList = this.f18183W;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList = null;
        }
        C44840p3 c44840p3M18267c4 = m18267c4();
        BaseFragment baseFragment = (BaseFragment) CollectionsKt.getOrNull(arrayList, C27039d.m66650j((c44840p3M18267c4 == null || (customViewPager = c44840p3M18267c4.f100623z) == null) ? null : Integer.valueOf(customViewPager.getCurrentItem())));
        if (baseFragment instanceof AssetCoinFragment) {
            AssetCoinFragment assetCoinFragment = baseFragment != null ? (AssetCoinFragment) baseFragment : null;
            if (assetCoinFragment != null) {
                recyclerViewM18395H3 = assetCoinFragment.m18465C3();
            } else {
                recyclerViewM18395H3 = null;
            }
        } else if (baseFragment instanceof AssetAccountFragment) {
            AssetAccountFragment assetAccountFragment = baseFragment != null ? (AssetAccountFragment) baseFragment : null;
            if (assetAccountFragment != null) {
                recyclerViewM18395H3 = assetAccountFragment.m18395H3();
            } else {
                recyclerViewM18395H3 = null;
            }
        } else {
            recyclerViewM18395H3 = null;
        }
        if (recyclerViewM18395H3 != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            C44840p3 c44840p3M18267c5 = m18267c4();
            assetsHelper.m19174t(recyclerViewM18395H3, c44840p3M18267c5 != null ? c44840p3M18267c5.f100600c : null, new Action() { // from class: com.kubi.assets.overview.h
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetOverviewFragment.m18259z4(this.f18391b);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18190d0 = z11;
    }

    /* JADX INFO: renamed from: x4 */
    public final void m18272x4() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.AssetOverviewFragment$lineChartBindState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getLineChartPointList();
            }
        }, new AssetOverviewFragment$lineChartBindState$2(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.AssetOverviewFragment$lineChartBindState$3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getNewOverviewEntity();
            }
        }, new AssetOverviewFragment$lineChartBindState$4(this, null));
    }

    public AssetOverviewFragment() {
        setPageId("B1overview");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public static final /* synthetic */ UIState m18215N3(AssetOverviewFragment assetOverviewFragment) {
        return (UIState) assetOverviewFragment.getState();
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m18238o4(AssetOverviewFragment assetOverviewFragment) {
        assetOverviewFragment.m18257y4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m18259z4(AssetOverviewFragment assetOverviewFragment) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44840p3 c44840p3M18267c4 = assetOverviewFragment.m18267c4();
        if (c44840p3M18267c4 != null && (kuCoinRefreshLayout = c44840p3M18267c4.f100616s) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        assetOverviewFragment.m18257y4();
    }

    /* JADX INFO: renamed from: C4 */
    public final void m18262C4(boolean z11) {
        View view;
        RecyclerView recyclerView;
        C44840p3 c44840p3M18267c4 = m18267c4();
        if (c44840p3M18267c4 != null && (recyclerView = c44840p3M18267c4.f100604g) != null) {
            AssetExKt.m15138z(recyclerView, z11);
        }
        m18265Z3();
        C44840p3 c44840p3M18267c5 = m18267c4();
        if (c44840p3M18267c5 != null && (view = c44840p3M18267c5.f100621x) != null) {
            AssetExKt.m15138z(view, z11);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m18265Z3() {
        C44840p3 c44840p3M18267c4;
        RecyclerView recyclerView;
        Space space;
        AssetDynamicsCardView assetDynamicsCardView;
        C44840p3 c44840p3M18267c5 = m18267c4();
        boolean z11 = true;
        if ((c44840p3M18267c5 == null || (assetDynamicsCardView = c44840p3M18267c5.f100603f) == null || !ViewExtKt.m66581l(assetDynamicsCardView)) && ((c44840p3M18267c4 = m18267c4()) == null || (recyclerView = c44840p3M18267c4.f100604g) == null || !ViewExtKt.m66581l(recyclerView))) {
            z11 = false;
        }
        C44840p3 c44840p3M18267c6 = m18267c4();
        if (c44840p3M18267c6 != null && (space = c44840p3M18267c6.f100605h) != null) {
            AssetExKt.m15138z(space, z11);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "event_network_failed".length();
        }
        C12572a.m23692a(this, true, new AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1("event_network_failed", null, this));
        if (c12573b.m23696a()) {
            "event_network_succeed".length();
        }
        C12572a.m23692a(this, true, new AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$2("event_network_succeed", null, this));
        if (c12573b.m23696a()) {
            "show_coin_guide".length();
        }
        C12572a.m23692a(this, true, new AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$3("show_coin_guide", null, this));
        if (c12573b.m23696a()) {
            "event_ongoing_tab".length();
        }
        C12572a.m23692a(this, true, new AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$4("event_ongoing_tab", null, this));
        m18266a4();
        if (c12573b.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$5(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
        if (c12573b.m23696a()) {
            "AUTO_EARN_STATE_REFRESH".length();
        }
        C12572a.m23692a(this, false, new C10568x8d3c36fc("AUTO_EARN_STATE_REFRESH", null, this));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m18271g4() {
        C44840p3 c44840p3M18267c4;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        if (isShowing() && (c44840p3M18267c4 = m18267c4()) != null && (kuCoinRefreshLayout = c44840p3M18267c4.f100616s) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        sendIntent(AssetV2OverviewContract$UiIntent.GetDynamicsData.INSTANCE);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (this.f18185Y.isEmpty()) {
            m18262C4(false);
        } else {
            m18262C4(true);
            m18268d4().replaceData(this.f18185Y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeaderView;
        BigDecimal totalBalance;
        C44840p3 c44840p3M18267c4;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView2;
        AssetV2OverviewEntity assetV2OverviewEntity;
        AssetSingleEntity total;
        SubAssetEntity subAsset;
        super.onViewHideOrShowToggle(show);
        if (show && getContext() != null) {
            C44840p3 c44840p3M18267c5 = m18267c4();
            if (c44840p3M18267c5 != null) {
                kuCoinRefreshLayout = c44840p3M18267c5.f100616s;
            } else {
                kuCoinRefreshLayout = null;
            }
            if (kuCoinRefreshLayout != null) {
                C44840p3 c44840p3M18267c6 = m18267c4();
                if (c44840p3M18267c6 != null) {
                    assetV2OverviewHeaderView = c44840p3M18267c6.f100615r;
                } else {
                    assetV2OverviewHeaderView = null;
                }
                C42153h c42153h = C42153h.f93593a;
                boolean zAreEqual = false;
                ShowHideTextView.m54778d(assetV2OverviewHeaderView, C46392a.m102322d(c42153h.m92500D(), false));
                C44840p3 c44840p3M18267c7 = m18267c4();
                if (c44840p3M18267c7 != null) {
                    accountInfoHeaderView = c44840p3M18267c7.f100599b;
                } else {
                    accountInfoHeaderView = null;
                }
                ShowHideTextView.m54778d(accountInfoHeaderView, C46392a.m102322d(c42153h.m92500D(), false));
                HomeAssetInfo homeAssetInfoM15157f = AssetSyncManager.f16327a.m15157f();
                String originalTotalAsset = homeAssetInfoM15157f.getOriginalTotalAsset();
                if (originalTotalAsset != null && ((assetV2OverviewEntity = this.f18182V) == null || (subAsset = assetV2OverviewEntity.getSubAsset()) == null || !C27025c.m66566d(subAsset.getHasSubAccount()) || C27025c.m66566d(subAsset.getShowSubAccountBalanceSwitch()))) {
                    AssetV2OverviewEntity assetV2OverviewEntity2 = this.f18182V;
                    if (assetV2OverviewEntity2 != null && (total = assetV2OverviewEntity2.getTotal()) != null) {
                        total.setTotalBalance(DowngradeExKt.m66536f(originalTotalAsset));
                    }
                    NewOverviewEntity newOverviewEntity = this.f18192f0;
                    if (newOverviewEntity != null) {
                        newOverviewEntity.setPreTotal(DowngradeExKt.m66536f(homeAssetInfoM15157f.getPreTotal()));
                    }
                }
                AssetV2OverviewEntity assetV2OverviewEntity3 = this.f18182V;
                if (assetV2OverviewEntity3 != null) {
                    sendIntent(new AssetV2OverviewContract$UiIntent.HideOrShowNumber(C46392a.m102322d(c42153h.m92500D(), false)));
                    AssetSingleEntity total2 = assetV2OverviewEntity3.getTotal();
                    if (total2 != null) {
                        totalBalance = total2.getTotalBalance();
                    } else {
                        totalBalance = null;
                    }
                    if (C41014a.m89922G(totalBalance, null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
                        AssetSingleEntity total3 = assetV2OverviewEntity3.getTotal();
                        if (total3 != null) {
                            zAreEqual = Intrinsics.areEqual(total3.getExecute(), Boolean.TRUE);
                        }
                        if (zAreEqual) {
                            C43852m.m96595g("B1overview", "guideIcon", "1", null, 8, null);
                            m18263D4(this.f18182V);
                        } else {
                            c44840p3M18267c4 = m18267c4();
                            if (c44840p3M18267c4 != null) {
                                assetV2OverviewHeaderView2.m18321g(assetV2OverviewEntity3);
                            }
                        }
                    } else {
                        c44840p3M18267c4 = m18267c4();
                        if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView2 = c44840p3M18267c4.f100615r) != null) {
                            assetV2OverviewHeaderView2.m18321g(assetV2OverviewEntity3);
                        }
                    }
                    sendIntent(AssetV2OverviewContract$UiIntent.GetRollbackData.INSTANCE);
                    m18260A4(assetV2OverviewEntity3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        BigDecimal bigDecimalM89916A;
        BigDecimal totalBalance;
        C44840p3 c44840p3M18267c4;
        C44840p3 c44840p3M18267c5;
        C44840p3 c44840p3M18267c6;
        C44840p3 c44840p3M18267c7;
        AccountInfoHeaderView accountInfoHeaderView;
        LinearLayoutCompat linearLayoutCompat;
        CoordinatorLayout coordinatorLayout;
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        boolean zAreEqual;
        AssetEmptyView assetEmptyView;
        m18271g4();
        if (assetV2OverviewEntity != null) {
            this.f18182V = assetV2OverviewEntity;
            if (isShowing()) {
                AssetTotalNotifier assetTotalNotifier = AssetTotalNotifier.f17602a;
                BigDecimal totalAssetValue = assetV2OverviewEntity.getTotalAssetValue();
                if (totalAssetValue != null) {
                    bigDecimalM89916A = C41014a.m89916A(totalAssetValue, assetV2OverviewEntity.getBaseCurrency(), C38184b.f85884a.m86146a());
                } else {
                    bigDecimalM89916A = null;
                }
                assetTotalNotifier.m17043g(bigDecimalM89916A);
                WrapperLoadingView wrapperLoadingView = this.f18191e0;
                if (wrapperLoadingView != null) {
                    wrapperLoadingView.showContent();
                }
                C44840p3 c44840p3M18267c8 = m18267c4();
                if (c44840p3M18267c8 != null && (assetEmptyView = c44840p3M18267c8.f100622y) != null) {
                    ViewExtKt.m66577h(assetEmptyView);
                }
                ArrayList<BaseFragment> arrayList = this.f18183W;
                if (arrayList == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                    arrayList = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof AssetV2Fragment.InterfaceC9449a) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AssetV2Fragment.InterfaceC9449a) it.next()).mo15196r2(this.f18182V);
                }
                AssetSingleEntity total = assetV2OverviewEntity.getTotal();
                if (total != null) {
                    totalBalance = total.getTotalBalance();
                } else {
                    totalBalance = null;
                }
                if (C41014a.m89922G(totalBalance, null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
                    AssetSingleEntity total2 = assetV2OverviewEntity.getTotal();
                    if (total2 != null) {
                        zAreEqual = Intrinsics.areEqual(total2.getExecute(), Boolean.TRUE);
                    } else {
                        zAreEqual = false;
                    }
                    if (zAreEqual) {
                        m18263D4(assetV2OverviewEntity);
                    } else {
                        c44840p3M18267c4 = m18267c4();
                        if (c44840p3M18267c4 != null) {
                            assetV2OverviewHeaderView.m18321g(assetV2OverviewEntity);
                        }
                        c44840p3M18267c5 = m18267c4();
                        if (c44840p3M18267c5 != null) {
                            coordinatorLayout.setVisibility(0);
                        }
                        c44840p3M18267c6 = m18267c4();
                        if (c44840p3M18267c6 != null) {
                            linearLayoutCompat.setVisibility(8);
                        }
                        c44840p3M18267c7 = m18267c4();
                        if (c44840p3M18267c7 != null) {
                            accountInfoHeaderView.setZeroBalanceImgVisible(false);
                        }
                        AssetsProfitLossAnalysisManager assetsProfitLossAnalysisManager = AssetsProfitLossAnalysisManager.f40608a;
                        assetsProfitLossAnalysisManager.m49949k(assetsProfitLossAnalysisManager.m49942d() + 1);
                    }
                } else {
                    c44840p3M18267c4 = m18267c4();
                    if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView = c44840p3M18267c4.f100615r) != null) {
                        assetV2OverviewHeaderView.m18321g(assetV2OverviewEntity);
                    }
                    c44840p3M18267c5 = m18267c4();
                    if (c44840p3M18267c5 != null && (coordinatorLayout = c44840p3M18267c5.f100601d) != null) {
                        coordinatorLayout.setVisibility(0);
                    }
                    c44840p3M18267c6 = m18267c4();
                    if (c44840p3M18267c6 != null && (linearLayoutCompat = c44840p3M18267c6.f100602e) != null) {
                        linearLayoutCompat.setVisibility(8);
                    }
                    c44840p3M18267c7 = m18267c4();
                    if (c44840p3M18267c7 != null && (accountInfoHeaderView = c44840p3M18267c7.f100599b) != null) {
                        accountInfoHeaderView.setZeroBalanceImgVisible(false);
                    }
                    AssetsProfitLossAnalysisManager assetsProfitLossAnalysisManager2 = AssetsProfitLossAnalysisManager.f40608a;
                    assetsProfitLossAnalysisManager2.m49949k(assetsProfitLossAnalysisManager2.m49942d() + 1);
                }
                sendIntent(AssetV2OverviewContract$UiIntent.GetRollbackData.INSTANCE);
                m18260A4(assetV2OverviewEntity);
                return;
            }
            return;
        }
        WrapperLoadingView wrapperLoadingView2 = this.f18191e0;
        if (wrapperLoadingView2 != null) {
            wrapperLoadingView2.showLoading();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m18244r4(DialogInterface dialogInterface, int i11) {
    }
}
