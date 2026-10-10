package com.kubi.core.biz.bottomtab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import be.InterfaceC4578a;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.base.utils.C11677d;
import com.kubi.core.biz.bottomtab.order.BottomOrderTabsFragment;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.utils.C12462a;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.trade.core.biz.api.ITradeCoreService;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import i60.InterfaceC38459b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import v30.C45372b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: TradeBottomContainerFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 @2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\b\u0010$\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0014J \u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002J \u0010-\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\b\u00101\u001a\u0004\u0018\u00010*H\u0002J\b\u00102\u001a\u000203H\u0002J\n\u00104\u001a\u0004\u0018\u000103H\u0002J\u0012\u00105\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u000200H\u0002J\u0016\u00107\u001a\u0002082\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u001e\u00109\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010:\u001a\u00020\u0019H\u0002J\u0018\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020 H\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/TradeBottomContainerFragment;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiIntent;", "Lcom/kubi/core/biz/bottomtab/BottomBizGroupContract$UiState;", "Lcom/kubi/core/biz/bottomtab/TradeBottomVM;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/BkcoinCoreOrderFundsViewpagerBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreOrderFundsViewpagerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "getLayout", "", "allDelegationView", "Landroid/view/View;", "actionTab", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "curPageIndex", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onRefresh", "bindState", "notifySymbolChange", "baseCurrency", "", "quoteCurrency", "symbol", "updateTitle", "tabs", "", "Lcom/kubi/core/biz/bottomtab/Tabs;", "delegationCount", "getTodoDelegationFragment", "Lcom/kubi/sdk/BaseFragment;", "getFundsFragment", "getBizFragment", "tab", "getPageAdapter", "Lcom/kubi/utils/InnerPagerAdapter;", "initOrderAndAssetsUI", "default", "changePageIndexVisible", "index", ViewProps.VISIBLE, "", "notifyChildFragmentHide", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeBottomContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeBottomContainerFragment.kt\ncom/kubi/core/biz/bottomtab/TradeBottomContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n147#2,16:266\n774#3:282\n865#3,2:283\n808#3,11:285\n1869#3,2:296\n774#3:298\n865#3,2:299\n808#3,11:301\n1869#3,2:312\n1563#3:314\n1634#3,3:315\n1617#3,9:319\n1869#3:328\n1870#3:331\n1626#3:332\n774#3:333\n865#3,2:334\n808#3,11:336\n774#3:347\n865#3,2:348\n808#3,11:350\n1869#3,2:361\n32#4:318\n1#5:329\n1#5:330\n*S KotlinDebug\n*F\n+ 1 TradeBottomContainerFragment.kt\ncom/kubi/core/biz/bottomtab/TradeBottomContainerFragment\n*L\n39#1:266,16\n88#1:282\n88#1:283,2\n89#1:285,11\n90#1:296,2\n138#1:298\n138#1:299,2\n139#1:301,11\n139#1:312,2\n151#1:314\n151#1:315,3\n193#1:319,9\n193#1:328\n193#1:331\n193#1:332\n225#1:333\n225#1:334,2\n225#1:336,11\n233#1:347\n233#1:348,2\n234#1:350,11\n235#1:361,2\n170#1:318\n193#1:330\n*E\n"})
public final class TradeBottomContainerFragment extends AbsTradeBaseBizFragment<BottomBizGroupContract$UiIntent, UiState, TradeBottomVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f20183Y = C45681e.m100799e(this, new Function1<TradeBottomContainerFragment, C45372b>() { // from class: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45372b invoke(@NotNull TradeBottomContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45372b.m100274a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45372b, Unit>() { // from class: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45372b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45372b c45372b) {
            invoke(c45372b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @Nullable
    public View f20184Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public SlidingTabLayout f20185a0;

    /* JADX INFO: renamed from: b0 */
    public int f20186b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f20182d0 = {Reflection.property1(new PropertyReference1Impl(TradeBottomContainerFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreOrderFundsViewpagerBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f20181c0 = new Companion(null);

    /* JADX INFO: compiled from: TradeBottomContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/TradeBottomContainerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/bottomtab/TradeBottomContainerFragment;", "tradeType", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ TradeBottomContainerFragment newInstance$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "SPOT";
            }
            return companion.newInstance(str);
        }

        @NotNull
        public final TradeBottomContainerFragment newInstance(@NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            TradeBottomContainerFragment tradeBottomContainerFragment = new TradeBottomContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("tradeType", tradeType);
            tradeBottomContainerFragment.setArguments(bundle);
            return tradeBottomContainerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$a */
    /* JADX INFO: compiled from: TradeBottomContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/biz/bottomtab/TradeBottomContainerFragment$initOrderAndAssetsUI$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11712a extends ViewPager.SimpleOnPageChangeListener {
        public C11712a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            C43852m.m96591c(C12462a.m23402a(), "shiftOrder", String.valueOf(position + 1), null, 8, null);
            TradeBottomContainerFragment tradeBottomContainerFragment = TradeBottomContainerFragment.this;
            tradeBottomContainerFragment.m21326S3(tradeBottomContainerFragment.f20186b0, false);
            TradeBottomContainerFragment.this.m21326S3(position, true);
            TradeBottomContainerFragment.this.f20186b0 = position;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$bindState$2 */
    /* JADX INFO: compiled from: TradeBottomContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "symbolData", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$bindState$2", m90122f = "TradeBottomContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117132 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C117132) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C117132(Continuation<? super C117132> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117132 c117132 = TradeBottomContainerFragment.this.new C117132(continuation);
            c117132.L$0 = obj;
            return c117132;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            View view = TradeBottomContainerFragment.this.f20184Z;
            if (view != null) {
                final TradeBottomContainerFragment tradeBottomContainerFragment = TradeBottomContainerFragment.this;
                C11677d.m21216d(view, 0L, new Function1() { // from class: com.kubi.core.biz.bottomtab.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TradeBottomContainerFragment.C117132.m21338f(tradeBottomContainerFragment, symbolBizUiState, (View) obj2);
                    }
                }, 1, null);
            }
            SymbolInfoEntity symbolInfo = symbolBizUiState.getSymbolInfo();
            if (symbolInfo != null) {
                TradeBottomContainerFragment tradeBottomContainerFragment2 = TradeBottomContainerFragment.this;
                String baseCurrency = symbolInfo.getBaseCurrency();
                Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
                String quoteCurrency = symbolInfo.getQuoteCurrency();
                Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
                String symbol = symbolInfo.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                tradeBottomContainerFragment2.m21335b4(baseCurrency, quoteCurrency, symbol);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m21338f(TradeBottomContainerFragment tradeBottomContainerFragment, SymbolBizUiState symbolBizUiState, View view) {
            TradeBottomVM tradeBottomVMM21011A3 = tradeBottomContainerFragment.m21011A3();
            if (tradeBottomVMM21011A3 != null) {
                Context contextRequireContext = tradeBottomContainerFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                tradeBottomVMM21011A3.m21353D(new BottomBizGroupContract$UiIntent.JumpOrderRecordPage(contextRequireContext, symbolBizUiState.getSymbol()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$bindState$4 */
    /* JADX INFO: compiled from: TradeBottomContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/biz/bottomtab/Tabs;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$bindState$4", m90122f = "TradeBottomContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117154 extends SuspendLambda implements Function2<List<? extends Tabs>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C117154(Continuation<? super C117154> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117154 c117154 = TradeBottomContainerFragment.this.new C117154(continuation);
            c117154.L$0 = obj;
            return c117154;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Tabs> list, Continuation<? super Unit> continuation) {
            return ((C117154) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TradeBottomContainerFragment tradeBottomContainerFragment = TradeBottomContainerFragment.this;
            tradeBottomContainerFragment.m21333Z3(list, TradeBottomContainerFragment.m21320M3(tradeBottomContainerFragment).getDefaultTabIndex());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$bindState$6 */
    /* JADX INFO: compiled from: TradeBottomContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.TradeBottomContainerFragment$bindState$6", m90122f = "TradeBottomContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117176 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C117176(Continuation<? super C117176> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117176 c117176 = TradeBottomContainerFragment.this.new C117176(continuation);
            c117176.L$0 = obj;
            return c117176;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C117176) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TradeBottomContainerFragment tradeBottomContainerFragment = TradeBottomContainerFragment.this;
            tradeBottomContainerFragment.m21336c4(TradeBottomContainerFragment.m21320M3(tradeBottomContainerFragment).getSupportTabs(), str);
            UiState uiStateM21320M3 = TradeBottomContainerFragment.m21320M3(TradeBottomContainerFragment.this);
            IReactNativeService.Companion companion = IReactNativeService.INSTANCE;
            IReactNativeService iReactNativeService = companion.get();
            if (iReactNativeService != null) {
                iReactNativeService.nativeNotifyRn("onOrderCntUpdated", MapsKt.hashMapOf(TuplesKt.m90091to("basicOrderCount", Boxing.boxInt(uiStateM21320M3.getBasicOrderCount())), TuplesKt.m90091to("advancedOrderCount", Boxing.boxInt(uiStateM21320M3.getAdvancedOrderCount()))));
            }
            IReactNativeService.nativeNotifyRn$default(companion.get(), "orderCenterRefresh", null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static final String m21325R3(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public TradeBottomVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new TradeBottomVM(manager);
    }

    /* JADX INFO: renamed from: U3 */
    public final C45372b m21328U3() {
        return (C45372b) this.f20183Y.getValue(this, f20182d0[0]);
    }

    /* JADX INFO: renamed from: V3 */
    public final BaseFragment m21329V3(Tabs tabs) {
        if (tabs instanceof Tabs.a) {
            return m21332Y3();
        }
        if (tabs instanceof Tabs.b) {
            return m21330W3();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: X3 */
    public final C27103z m21331X3(List<? extends Tabs> list) {
        ArrayList arrayList = new ArrayList();
        for (Tabs tabs : list) {
            BaseFragment baseFragmentM21329V3 = m21329V3(tabs);
            Pair pairM90091to = baseFragmentM21329V3 != null ? TuplesKt.m90091to(baseFragmentM21329V3, getString(tabs.mo21360b())) : null;
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        Pair pairUnzip = CollectionsKt.unzip(arrayList);
        List list2 = (List) pairUnzip.component1();
        List list3 = (List) pairUnzip.component2();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return new C27103z(childFragmentManager, new ArrayList(list2), list3);
    }

    /* JADX INFO: renamed from: Y3 */
    public final BaseFragment m21332Y3() {
        String string;
        if (!IUnifyAccountService.f53155a.get().mo64980D()) {
            return BottomOrderTabsFragment.f20206c0.newInstance();
        }
        Bundle arguments = getArguments();
        String str = "SPOT";
        if (arguments != null && (string = arguments.getString("tradeType", "SPOT")) != null) {
            str = string;
        }
        return ITradeCoreService.f51346a.get().mo63102a(str, C46392a.m102326h(m21013D3().m22738r(), "BTC-USDT"));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m21336c4(List<? extends Tabs> list, String str) {
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        PagerAdapter adapter;
        String string;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Tabs tabs : list) {
            if (tabs instanceof Tabs.a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getString(R$string.todo_delegation));
                String str2 = ' ' + str + ' ';
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                string = sb2.toString();
            } else {
                string = getString(tabs.mo21360b());
                Intrinsics.checkNotNull(string);
            }
            arrayList.add(string);
        }
        int size = arrayList.size();
        C45372b c45372bM21328U3 = m21328U3();
        if (size != C27039d.m66651k((c45372bM21328U3 == null || (customViewPager2 = c45372bM21328U3.f102022b) == null || (adapter = customViewPager2.getAdapter()) == null) ? null : Integer.valueOf(adapter.getCount()), 0)) {
            return;
        }
        C45372b c45372bM21328U4 = m21328U3();
        PagerAdapter adapter2 = (c45372bM21328U4 == null || (customViewPager = c45372bM21328U4.f102022b) == null) ? null : customViewPager.getAdapter();
        C27103z c27103z = adapter2 instanceof C27103z ? (C27103z) adapter2 : null;
        if (c27103z != null) {
            c27103z.m66940b(arrayList);
        }
        SlidingTabLayout slidingTabLayout = this.f20185a0;
        if (slidingTabLayout != null) {
            slidingTabLayout.m55291w();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bkcoin_core_order_funds_viewpager;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<TradeBottomVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(TradeBottomVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCLongMethodCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ActivityResultCaller parentFragment = getParentFragment();
        IOrderAndFunTitleHeaderUI iOrderAndFunTitleHeaderUI = parentFragment instanceof IOrderAndFunTitleHeaderUI ? (IOrderAndFunTitleHeaderUI) parentFragment : null;
        if (iOrderAndFunTitleHeaderUI != null) {
            this.f20185a0 = iOrderAndFunTitleHeaderUI.mo21358Y2();
            this.f20184Z = iOrderAndFunTitleHeaderUI.mo21359t1();
        }
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3 */
    public InterfaceC4578a getF20711Z() {
        return InterfaceC4578a.a.f4046a;
    }

    public TradeBottomContainerFragment() {
        setPageId(C12462a.m23402a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public static final /* synthetic */ UiState m21320M3(TradeBottomContainerFragment tradeBottomContainerFragment) {
        return (UiState) tradeBottomContainerFragment.getState();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m21326S3(int i11, boolean z11) {
        PagerAdapter adapter;
        C27103z c27103z;
        Fragment item;
        CustomViewPager customViewPager;
        C45372b c45372bM21328U3 = m21328U3();
        Object obj = null;
        if (c45372bM21328U3 != null && (customViewPager = c45372bM21328U3.f102022b) != null) {
            adapter = customViewPager.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof C27103z) {
            c27103z = (C27103z) adapter;
        } else {
            c27103z = null;
        }
        if (c27103z != null) {
            item = c27103z.getItem(i11);
        } else {
            item = null;
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : fragments) {
            if (((Fragment) obj2).isAdded()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof BaseFragment) {
                arrayList2.add(obj3);
            }
        }
        for (Object obj4 : arrayList2) {
            if (Intrinsics.areEqual((BaseFragment) obj4, item)) {
                obj = obj4;
                break;
            }
        }
        BaseFragment baseFragment = (BaseFragment) obj;
        if (baseFragment != null) {
            if (z11) {
                baseFragment.onShow();
            } else {
                baseFragment.onHide();
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final BaseFragment m21330W3() {
        String baseCurrency;
        SymbolInfoEntity symbolInfo = m21013D3().m22740t().getSymbolInfo();
        String quoteCurrency = null;
        if (symbolInfo != null) {
            baseCurrency = symbolInfo.getBaseCurrency();
        } else {
            baseCurrency = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("BASE_CURRENCY", baseCurrency);
        if (symbolInfo != null) {
            quoteCurrency = symbolInfo.getQuoteCurrency();
        }
        return IUnifyAccountService.f53155a.get().mo64978B(BundleKt.bundleOf(pairM90091to, TuplesKt.m90091to("QUOTE_CURRENCY", quoteCurrency)));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m21333Z3(List<? extends Tabs> list, int i11) {
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        CustomViewPager customViewPager3;
        Integer numValueOf;
        CustomViewPager customViewPager4;
        PagerAdapter adapter;
        CustomViewPager customViewPager5;
        C45372b c45372bM21328U3 = m21328U3();
        if (c45372bM21328U3 != null && (customViewPager5 = c45372bM21328U3.f102022b) != null) {
            customViewPager5.setAdapter(m21331X3(list));
        }
        C45372b c45372bM21328U4 = m21328U3();
        CustomViewPager customViewPager6 = null;
        if (c45372bM21328U4 != null && (customViewPager3 = c45372bM21328U4.f102022b) != null) {
            C45372b c45372bM21328U5 = m21328U3();
            if (c45372bM21328U5 != null && (customViewPager4 = c45372bM21328U5.f102022b) != null && (adapter = customViewPager4.getAdapter()) != null) {
                numValueOf = Integer.valueOf(adapter.getCount());
            } else {
                numValueOf = null;
            }
            customViewPager3.setOffscreenPageLimit(C27039d.m66651k(numValueOf, 2));
        }
        C45372b c45372bM21328U6 = m21328U3();
        if (c45372bM21328U6 != null && (customViewPager2 = c45372bM21328U6.f102022b) != null) {
            customViewPager2.addOnPageChangeListener(new C11712a());
        }
        C45372b c45372bM21328U7 = m21328U3();
        if (c45372bM21328U7 != null && (customViewPager = c45372bM21328U7.f102022b) != null) {
            customViewPager.setCurrentItem(i11);
        }
        SlidingTabLayout slidingTabLayout = this.f20185a0;
        if (slidingTabLayout != null) {
            slidingTabLayout.setNeedBold(true);
        }
        SlidingTabLayout slidingTabLayout2 = this.f20185a0;
        if (slidingTabLayout2 != null) {
            C45372b c45372bM21328U8 = m21328U3();
            if (c45372bM21328U8 != null) {
                customViewPager6 = c45372bM21328U8.f102022b;
            }
            slidingTabLayout2.setViewPager(customViewPager6);
        }
        SlidingTabLayout slidingTabLayout3 = this.f20185a0;
        if (slidingTabLayout3 != null) {
            slidingTabLayout3.m55291w();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m21334a4() {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (((Fragment) obj).isAdded()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof BaseFragment) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((BaseFragment) it.next()).onHide();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m21335b4(String str, String str2, String str3) {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            Fragment fragment = (Fragment) obj;
            if (fragment.isAdded() && fragment.getView() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<InterfaceC38459b> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC38459b) {
                arrayList2.add(obj2);
            }
        }
        for (InterfaceC38459b interfaceC38459b : arrayList2) {
            interfaceC38459b.mo21309B2(new Pair<>(str, str2));
            interfaceC38459b.mo21311x(str3);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        m21016u3(C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.bottomtab.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeBottomContainerFragment.m21325R3((SymbolBizUiState) obj);
            }
        }), new C117132(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getSupportTabs();
            }
        }, new C117154(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.bottomtab.TradeBottomContainerFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getDelegationCount();
            }
        }, new C117176(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        TradeBottomVM tradeBottomVMM21011A3 = m21011A3();
        if (tradeBottomVMM21011A3 != null) {
            tradeBottomVMM21011A3.m21353D(BottomBizGroupContract$UiIntent.PageHide.INSTANCE);
        }
        m21334a4();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        TradeBottomVM tradeBottomVMM21011A3 = m21011A3();
        if (tradeBottomVMM21011A3 != null) {
            tradeBottomVMM21011A3.m21353D(BottomBizGroupContract$UiIntent.RefreshData.INSTANCE);
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (((Fragment) obj).isAdded()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof SwipeRefreshLayout.OnRefreshListener) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((SwipeRefreshLayout.OnRefreshListener) it.next()).onRefresh();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        TradeBottomVM tradeBottomVMM21011A3 = m21011A3();
        if (tradeBottomVMM21011A3 != null) {
            tradeBottomVMM21011A3.m21353D(BottomBizGroupContract$UiIntent.RefreshData.INSTANCE);
        }
    }
}
