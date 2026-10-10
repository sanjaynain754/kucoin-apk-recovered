package com.kubi.core.biz.bottomtab.order;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import be.InterfaceC4578a;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.utils.C11677d;
import com.kubi.core.biz.bottomtab.BottomBizGroupContract$UiIntent;
import com.kubi.core.biz.bottomtab.TradeBottomVM;
import com.kubi.core.biz.bottomtab.order.child.AbsBottomOrderListFragmentFactory;
import com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment;
import com.kubi.core.biz.bottomtab.order.child.BottomOrderListListFragmentFactory;
import com.kubi.core.biz.bottomtab.order.child.IOnlyCurrentSymbolState;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.utils.C12462a;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229ed.C37134b;
import p569qq.C43852m;
import p671uq.C45290a;
import p722wd.C45796e;
import p756xc.BalanceData;
import p756xc.TradeSymbolBalance;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import v30.C45408u;
import w00.C45681e;

/* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 H2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001HB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020/H\u0014J\u001a\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u000201H\u0014J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000201H\u0016J\b\u0010:\u001a\u000201H\u0016J\b\u0010;\u001a\u000201H\u0016J\b\u0010<\u001a\u000201H\u0002J\b\u0010=\u001a\u000201H\u0002J\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0016*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000201H\u0002J\u0010\u0010C\u001a\u0002012\u0006\u0010D\u001a\u000208H\u0002J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0G*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006I"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiIntent;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsContract$UiState;", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsSharedVM;", "Lcom/kubi/core/biz/bottomtab/order/child/IOnlyCurrentSymbolState;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "bottomContainerVM", "Lcom/kubi/core/biz/bottomtab/TradeBottomVM;", "getBottomContainerVM", "()Lcom/kubi/core/biz/bottomtab/TradeBottomVM;", "bottomContainerVM$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeOpenOrdersBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeOpenOrdersBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "delegationList", "", "Lcom/kubi/core/biz/bottomtab/order/child/AbsBottomOrderListFragmentFactory;", "getDelegationList", "()Ljava/util/List;", "delegationList$delegate", "currentFragment", "Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment;", "getCurrentFragment", "()Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment;", "currentDelegateType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "getCurrentDelegateType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "isOnly", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onRefresh", "refreshCurrentTabData", "startCollectBalanceChangeEvent", "getTitleList", "", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "updateTitleBar", "updateCancelBtnVisible", "isVisible", "initDelegationFactoryList", "getFragmentList", "Ljava/util/ArrayList;", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomOrderTabsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomOrderTabsFragment.kt\ncom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,276:1\n106#2,15:277\n147#3,16:292\n808#4,11:308\n1869#4,2:319\n1563#4:326\n1634#4,3:327\n1563#4:330\n1634#4,3:331\n17#5:321\n19#5:325\n46#6:322\n51#6:324\n105#7:323\n46#8,14:334\n*S KotlinDebug\n*F\n+ 1 BottomOrderTabsFragment.kt\ncom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment\n*L\n58#1:277,15\n60#1:292,16\n195#1:308,11\n196#1:319,2\n221#1:326\n221#1:327,3\n273#1:330\n273#1:331,3\n208#1:321\n208#1:325\n208#1:322\n208#1:324\n208#1:323\n117#1:334,14\n*E\n"})
public final class BottomOrderTabsFragment extends AbsTradeBaseBizFragment<BottomOrderTabsContract$UiIntent, UiState, BottomOrderTabsSharedVM> implements IOnlyCurrentSymbolState, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f20208Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f20209Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f20210a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC4578a f20211b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f20207d0 = {Reflection.property1(new PropertyReference1Impl(BottomOrderTabsFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeOpenOrdersBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f20206c0 = new Companion(null);

    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BottomOrderTabsFragment newInstance() {
            Bundle bundle = new Bundle();
            BottomOrderTabsFragment bottomOrderTabsFragment = new BottomOrderTabsFragment();
            bottomOrderTabsFragment.setArguments(bundle);
            return bottomOrderTabsFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$a */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment$onViewCreated$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11730a extends ViewPager.SimpleOnPageChangeListener {
        public C11730a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            BottomOrderTabsFragment.this.m21394n4();
            OrderLevelType f20256c = ((AbsBottomOrderListFragmentFactory) BottomOrderTabsFragment.this.m21390f4().get(position)).getF20256c();
            BottomOrderTabsFragment.this.m21387c4().m21353D(new BottomBizGroupContract$UiIntent.SelectedTabBiz(f20256c));
            if (Intrinsics.areEqual(f20256c, OrderLevelType.Normal.INSTANCE)) {
                BottomOrderTabsFragment bottomOrderTabsFragment = BottomOrderTabsFragment.this;
                bottomOrderTabsFragment.m21396q4(BottomOrderTabsFragment.m21371S3(bottomOrderTabsFragment).getCancelAllActiveEnable());
            } else {
                BottomOrderTabsFragment bottomOrderTabsFragment2 = BottomOrderTabsFragment.this;
                bottomOrderTabsFragment2.m21396q4(BottomOrderTabsFragment.m21371S3(bottomOrderTabsFragment2).getCancelAllAdvancedEnable());
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$11 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$11", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1173211 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        public C1173211(Continuation<? super C1173211> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BottomOrderTabsFragment.this.new C1173211(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C1173211) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BottomOrderTabsFragment.this.m21394n4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$13 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$13", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1173413 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return ((C1173413) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1173413(Continuation<? super C1173413> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BottomOrderTabsFragment.this.new C1173413(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BottomOrderTabsFragment.this.m21397r4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$15 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$15", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1173615 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return ((C1173615) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1173615(Continuation<? super C1173615> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BottomOrderTabsFragment.this.new C1173615(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BottomOrderTabsFragment.this.m21397r4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$2 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/data/entity/SymbolInfoEntity;", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$2", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117372 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super SymbolInfoEntity>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C117372(Continuation<? super C117372> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super SymbolInfoEntity> continuation) {
            return ((C117372) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117372 c117372 = new C117372(continuation);
            c117372.L$0 = obj;
            return c117372;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return symbolBizUiState.getSymbolInfo();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$3 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$3", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117383 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
            return ((C117383) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C117383(Continuation<? super C117383> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117383 c117383 = BottomOrderTabsFragment.this.new C117383(continuation);
            c117383.L$0 = obj;
            return c117383;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BottomOrderTabsFragment.this.m21011A3().m21415F(new BottomOrderTabsContract$UiIntent.ChangeSymbol(symbolInfoEntity));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$5 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/arch/api/data/BalanceData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$5", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117405 extends SuspendLambda implements Function2<BalanceData, Continuation<? super Unit>, Object> {
        int label;

        public C117405(Continuation<? super C117405> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BottomOrderTabsFragment.this.new C117405(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(BalanceData balanceData, Continuation<? super Unit> continuation) {
            return ((C117405) create(balanceData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BottomOrderTabsFragment.this.m21395o4();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$7 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$7", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117427 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C117427(Continuation<? super C117427> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117427 c117427 = BottomOrderTabsFragment.this.new C117427(continuation);
            c117427.Z$0 = ((Boolean) obj).booleanValue();
            return c117427;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C117427) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(BottomOrderTabsFragment.this.m21388d4(), OrderLevelType.Normal.INSTANCE)) {
                BottomOrderTabsFragment.this.m21396q4(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$9 */
    /* JADX INFO: compiled from: BottomOrderTabsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$bindState$9", m90122f = "BottomOrderTabsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117449 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C117449(Continuation<? super C117449> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117449 c117449 = BottomOrderTabsFragment.this.new C117449(continuation);
            c117449.Z$0 = ((Boolean) obj).booleanValue();
            return c117449;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C117449) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(BottomOrderTabsFragment.this.m21388d4(), OrderLevelType.Advanced.INSTANCE)) {
                BottomOrderTabsFragment.this.m21396q4(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final String m21376X3(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    /* JADX INFO: renamed from: h4 */
    private final C27103z m21379h4() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return new C27103z(childFragmentManager, m21391g4(m21390f4()), m21392i4(m21390f4()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static final Unit m21380k4(final BottomOrderTabsFragment bottomOrderTabsFragment, View it) {
        AppCompatCheckBox appCompatCheckBox;
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C12462a.m23402a(), "openOrderTabCancelAll", null, null, 12, null);
        C45408u c45408uM21386b4 = bottomOrderTabsFragment.m21386b4();
        final String symbol = (c45408uM21386b4 == null || (appCompatCheckBox = c45408uM21386b4.f102345c) == null || !appCompatCheckBox.isChecked()) ? null : ((UiState) bottomOrderTabsFragment.getState()).getSymbol();
        BottomOrderListFragment bottomOrderListFragmentM21389e4 = bottomOrderTabsFragment.m21389e4();
        if (bottomOrderListFragmentM21389e4 != null) {
            C37134b.m83060c(bottomOrderListFragmentM21389e4, bottomOrderTabsFragment.m21388d4(), new DialogInterface.OnClickListener() { // from class: com.kubi.core.biz.bottomtab.order.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    BottomOrderTabsFragment.m21381l4(this.f20270b, symbol, dialogInterface, i11);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m21381l4(BottomOrderTabsFragment bottomOrderTabsFragment, String str, DialogInterface dialogInterface, int i11) {
        if ("unified_spot_cancel_order".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(unified_spot_cancel_order) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("type", TtmlNode.COMBINE_ALL);
            C45290a.f101823a.m100101b("unified_spot_cancel_order", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        BottomOrderListFragment bottomOrderListFragmentM21389e4 = bottomOrderTabsFragment.m21389e4();
        if (bottomOrderListFragmentM21389e4 != null) {
            bottomOrderListFragmentM21389e4.m21482x4(str);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m21382m4(BottomOrderTabsFragment bottomOrderTabsFragment, CompoundButton compoundButton, boolean z11) {
        AppCompatCheckBox appCompatCheckBox;
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C45408u c45408uM21386b4 = bottomOrderTabsFragment.m21386b4();
        if (c45408uM21386b4 != null && (appCompatCheckBox = c45408uM21386b4.f102345c) != null) {
            appCompatCheckBox.setChecked(z11);
        }
        bottomOrderTabsFragment.m21394n4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final TradeSymbolBalance m21383p4(C45796e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getF103217a();
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public BottomOrderTabsSharedVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new BottomOrderTabsSharedVM(manager);
    }

    /* JADX INFO: renamed from: b4 */
    public final C45408u m21386b4() {
        return (C45408u) this.f20209Z.getValue(this, f20207d0[0]);
    }

    /* JADX INFO: renamed from: c4 */
    public final TradeBottomVM m21387c4() {
        return (TradeBottomVM) this.f20208Y.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    public final List<AbsBottomOrderListFragmentFactory> m21390f4() {
        return (List) this.f20210a0.getValue();
    }

    /* JADX INFO: renamed from: g4 */
    public final ArrayList<BottomOrderListFragment> m21391g4(List<? extends AbsBottomOrderListFragmentFactory> list) {
        ArrayList<BottomOrderListFragment> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbsBottomOrderListFragmentFactory) it.next()).mo21488b());
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_core_trade_open_orders;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<BottomOrderTabsSharedVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(BottomOrderTabsSharedVM.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final List<String> m21392i4(List<? extends AbsBottomOrderListFragmentFactory> list) {
        String strMo21487a;
        UiState uiState;
        UiState uiState2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AbsBottomOrderListFragmentFactory absBottomOrderListFragmentFactory : list) {
            Integer advanceOrdersNum = null;
            if (Intrinsics.areEqual(absBottomOrderListFragmentFactory.getF20256c(), OrderLevelType.Normal.INSTANCE)) {
                BottomOrderTabsSharedVM bottomOrderTabsSharedVMM21011A3 = m21011A3();
                if (bottomOrderTabsSharedVMM21011A3 != null && (uiState2 = (UiState) bottomOrderTabsSharedVMM21011A3.getState()) != null) {
                    advanceOrdersNum = uiState2.getOpenOrdersNum();
                }
                strMo21487a = absBottomOrderListFragmentFactory.mo21487a(advanceOrdersNum);
            } else {
                BottomOrderTabsSharedVM bottomOrderTabsSharedVMM21011A4 = m21011A3();
                if (bottomOrderTabsSharedVMM21011A4 != null && (uiState = (UiState) bottomOrderTabsSharedVMM21011A4.getState()) != null) {
                    advanceOrdersNum = uiState.getAdvanceOrdersNum();
                }
                strMo21487a = absBottomOrderListFragmentFactory.mo21487a(advanceOrdersNum);
            }
            arrayList.add(strMo21487a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j4 */
    public final List<AbsBottomOrderListFragmentFactory> m21393j4() {
        ArrayList arrayList = new ArrayList();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        arrayList.add(new BottomOrderListListFragmentFactory(contextRequireContext, R$string.open_order, OrderLevelType.Normal.INSTANCE));
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        arrayList.add(new BottomOrderListListFragmentFactory(contextRequireContext2, R$string.advanced_order, OrderLevelType.Advanced.INSTANCE));
        return arrayList;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AppCompatCheckBox appCompatCheckBox;
        BaseTextView baseTextView;
        CustomViewPager customViewPager;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        CustomViewPager customViewPager2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45408u c45408uM21386b4 = m21386b4();
        if (c45408uM21386b4 != null && (customViewPager2 = c45408uM21386b4.f102349g) != null) {
            customViewPager2.setAdapter(m21379h4());
        }
        C45408u c45408uM21386b5 = m21386b4();
        if (c45408uM21386b5 != null && (slidingTabLayout2 = c45408uM21386b5.f102347e) != null) {
            slidingTabLayout2.setNeedBold(true);
        }
        C45408u c45408uM21386b6 = m21386b4();
        if (c45408uM21386b6 != null && (slidingTabLayout = c45408uM21386b6.f102347e) != null) {
            C45408u c45408uM21386b7 = m21386b4();
            slidingTabLayout.setViewPager(c45408uM21386b7 != null ? c45408uM21386b7.f102349g : null);
        }
        C45408u c45408uM21386b8 = m21386b4();
        if (c45408uM21386b8 != null && (customViewPager = c45408uM21386b8.f102349g) != null) {
            customViewPager.addOnPageChangeListener(new C11730a());
        }
        C45408u c45408uM21386b9 = m21386b4();
        if (c45408uM21386b9 != null && (baseTextView = c45408uM21386b9.f102344b) != null) {
            C11677d.m21216d(baseTextView, 0L, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderTabsFragment.m21380k4(this.f20226b, (View) obj);
                }
            }, 1, null);
        }
        C45408u c45408uM21386b10 = m21386b4();
        if (c45408uM21386b10 == null || (appCompatCheckBox = c45408uM21386b10.f102345c) == null) {
            return;
        }
        C27046k.m66708w(appCompatCheckBox, new Function2() { // from class: com.kubi.core.biz.bottomtab.order.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomOrderTabsFragment.m21382m4(this.f20267b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public final void m21396q4(boolean z11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (z11) {
            C45408u c45408uM21386b4 = m21386b4();
            if (c45408uM21386b4 == null || (baseTextView2 = c45408uM21386b4.f102344b) == null) {
                return;
            }
            ViewExtKt.m66594y(baseTextView2);
            return;
        }
        C45408u c45408uM21386b5 = m21386b4();
        if (c45408uM21386b5 == null || (baseTextView = c45408uM21386b5.f102344b) == null) {
            return;
        }
        ViewExtKt.m66577h(baseTextView);
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20211b0() {
        return this.f20211b0;
    }

    public BottomOrderTabsFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.biz.bottomtab.order.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomOrderTabsFragment.m21377Y3(this.f20268b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$special$$inlined$viewModels$default$1
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
        this.f20208Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TradeBottomVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$special$$inlined$viewModels$default$4
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
        this.f20209Z = C45681e.m100799e(this, new Function1<BottomOrderTabsFragment, C45408u>() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45408u invoke(@NotNull BottomOrderTabsFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C45408u.m100353a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C45408u, Unit>() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C45408u it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45408u c45408u) {
                invoke(c45408u);
                return Unit.INSTANCE;
            }
        });
        this.f20210a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.bottomtab.order.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomOrderTabsFragment.m21378a4(this.f20269b);
            }
        });
        this.f20211b0 = InterfaceC4578a.g.f4052a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public static final /* synthetic */ UiState m21371S3(BottomOrderTabsFragment bottomOrderTabsFragment) {
        return (UiState) bottomOrderTabsFragment.getState();
    }

    /* JADX INFO: renamed from: Y3 */
    public static final ViewModelStoreOwner m21377Y3(BottomOrderTabsFragment bottomOrderTabsFragment) {
        Fragment fragmentRequireParentFragment = bottomOrderTabsFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: a4 */
    public static final List m21378a4(BottomOrderTabsFragment bottomOrderTabsFragment) {
        return bottomOrderTabsFragment.m21393j4();
    }

    @Override // com.kubi.core.biz.bottomtab.order.child.IOnlyCurrentSymbolState
    /* JADX INFO: renamed from: X1 */
    public boolean mo21384X1() {
        AppCompatCheckBox appCompatCheckBox;
        C45408u c45408uM21386b4 = m21386b4();
        if (c45408uM21386b4 == null || (appCompatCheckBox = c45408uM21386b4.f102345c) == null || !appCompatCheckBox.isChecked()) {
            return false;
        }
        return true;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        m21016u3(C41636g.m90881E(C41636g.m90892P(C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.bottomtab.order.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomOrderTabsFragment.m21376X3((SymbolBizUiState) obj);
            }
        }), new C117372(null))), new C117383(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment.bindState.4
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getQuoteBalance();
            }
        }, new C117405(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment.bindState.6
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UiState) obj).getCancelAllActiveEnable());
            }
        }, new C117427(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment.bindState.8
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UiState) obj).getCancelAllAdvancedEnable());
            }
        }, new C117449(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment.bindState.10
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getSymbol();
            }
        }, new C1173211(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment.bindState.12
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getOpenOrdersNum();
            }
        }, new C1173413(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment.bindState.14
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getAdvanceOrdersNum();
            }
        }, new C1173615(null));
    }

    /* JADX INFO: renamed from: d4 */
    public final OrderLevelType m21388d4() {
        CustomViewPager customViewPager;
        C45408u c45408uM21386b4 = m21386b4();
        if (c45408uM21386b4 != null && (customViewPager = c45408uM21386b4.f102349g) != null) {
            AbsBottomOrderListFragmentFactory absBottomOrderListFragmentFactory = (AbsBottomOrderListFragmentFactory) CollectionsKt.getOrNull(m21390f4(), customViewPager.getCurrentItem());
            if (absBottomOrderListFragmentFactory != null) {
                return absBottomOrderListFragmentFactory.getF20256c();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e4 */
    public final BottomOrderListFragment m21389e4() {
        CustomViewPager customViewPager;
        PagerAdapter adapter;
        C27103z c27103z;
        Fragment item;
        CustomViewPager customViewPager2;
        C45408u c45408uM21386b4 = m21386b4();
        if (c45408uM21386b4 != null && (customViewPager = c45408uM21386b4.f102349g) != null) {
            int currentItem = customViewPager.getCurrentItem();
            C45408u c45408uM21386b5 = m21386b4();
            if (c45408uM21386b5 != null && (customViewPager2 = c45408uM21386b5.f102349g) != null) {
                adapter = customViewPager2.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter instanceof C27103z) {
                c27103z = (C27103z) adapter;
            } else {
                c27103z = null;
            }
            if (c27103z != null) {
                item = c27103z.getItem(currentItem);
            } else {
                item = null;
            }
            if (item instanceof BottomOrderListFragment) {
                return (BottomOrderListFragment) item;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m21394n4() {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BottomOrderListFragment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BottomOrderListFragment) it.next()).mo15906F3();
        }
        BottomOrderTabsSharedVM bottomOrderTabsSharedVMM21011A3 = m21011A3();
        if (bottomOrderTabsSharedVMM21011A3 != null) {
            bottomOrderTabsSharedVMM21011A3.m21415F(BottomOrderTabsContract$UiIntent.RefreshData.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m21395o4() {
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(m21020z3().m21736o());
        m21016u3(C41636g.m90941x(new InterfaceC41634e<C45796e>() { // from class: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$startCollectBalanceChangeEvent$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$startCollectBalanceChangeEvent$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BottomOrderTabsFragment.kt\ncom/kubi/core/biz/bottomtab/order/BottomOrderTabsFragment\n*L\n1#1,49:1\n18#2:50\n19#2:53\n209#3,2:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20215b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ BottomOrderTabsFragment f20216c;

                /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$startCollectBalanceChangeEvent$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment$startCollectBalanceChangeEvent$$inlined$filter$1$2", m90122f = "BottomOrderTabsFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f, BottomOrderTabsFragment bottomOrderTabsFragment) {
                    this.f20215b = interfaceC41635f;
                    this.f20216c = bottomOrderTabsFragment;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BalanceData quote;
                    BalanceData base;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20215b;
                        C45796e c45796e = (C45796e) obj;
                        TradeSymbolBalance f103217a = c45796e.getF103217a();
                        String currencyCode = (f103217a == null || (base = f103217a.getBase()) == null) ? null : base.getCurrencyCode();
                        BalanceData baseBalance = BottomOrderTabsFragment.m21371S3(this.f20216c).getBaseBalance();
                        if (Intrinsics.areEqual(currencyCode, baseBalance != null ? baseBalance.getCurrencyCode() : null)) {
                            TradeSymbolBalance f103217a2 = c45796e.getF103217a();
                            String currencyCode2 = (f103217a2 == null || (quote = f103217a2.getQuote()) == null) ? null : quote.getCurrencyCode();
                            BalanceData quoteBalance = BottomOrderTabsFragment.m21371S3(this.f20216c).getQuoteBalance();
                            if (Intrinsics.areEqual(currencyCode2, quoteBalance != null ? quoteBalance.getCurrencyCode() : null)) {
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super C45796e> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new AnonymousClass2(interfaceC41635f, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomOrderTabsFragment.m21383p4((C45796e) obj);
            }
        }), new BottomOrderTabsFragment$startCollectBalanceChangeEvent$3(this, null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        BottomOrderTabsSharedVM bottomOrderTabsSharedVMM21011A3 = m21011A3();
        if (bottomOrderTabsSharedVMM21011A3 != null) {
            bottomOrderTabsSharedVMM21011A3.m21415F(BottomOrderTabsContract$UiIntent.StopSubBalance.INSTANCE);
        }
        BottomOrderTabsSharedVM bottomOrderTabsSharedVMM21011A4 = m21011A3();
        if (bottomOrderTabsSharedVMM21011A4 != null) {
            bottomOrderTabsSharedVMM21011A4.m21415F(BottomOrderTabsContract$UiIntent.StopSubOrderChange.INSTANCE);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        m21394n4();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m21394n4();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m21397r4() {
        PagerAdapter adapter;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager;
        C45408u c45408uM21386b4 = m21386b4();
        C27103z c27103z = null;
        if (c45408uM21386b4 != null && (customViewPager = c45408uM21386b4.f102349g) != null) {
            adapter = customViewPager.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof C27103z) {
            c27103z = (C27103z) adapter;
        }
        if (c27103z != null) {
            c27103z.m66940b(m21392i4(m21390f4()));
        }
        C45408u c45408uM21386b5 = m21386b4();
        if (c45408uM21386b5 != null && (slidingTabLayout = c45408uM21386b5.f102347e) != null) {
            slidingTabLayout.m55291w();
        }
    }
}
