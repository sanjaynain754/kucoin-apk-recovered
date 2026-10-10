package com.kubi.kumex.market.tradingArea;

import android.os.Bundle;
import android.view.View;
import android.widget.ViewSwitcher;
import androidx.activity.result.ActivityResultCaller;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.market.ResetChildSortType;
import com.kubi.kumex.market.tradingArea.child.DrawerListFragment;
import com.kubi.kumex.market.tradingArea.child.FavoriteDrawerFragment;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36742c2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p274fx.C37727a;
import p569qq.C43841b;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ContractDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020#H\u0014J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0016J\u0018\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0012\u0010.\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\n\u00101\u001a\u0004\u0018\u000102H\u0014J\u0006\u00103\u001a\u00020\u001eJ\b\u00104\u001a\u000205H\u0016R\u001b\u0010\u0007\u001a\u00020\b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u00066"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/ContractDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/BaseTradingAreaFragment;", "Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaIntent;", "Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaState;", "Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaVM;", "<init>", "()V", "searchFragment", "Lcom/kubi/kumex/market/tradingArea/SearchDrawerFragment;", "getSearchFragment", "()Lcom/kubi/kumex/market/tradingArea/SearchDrawerFragment;", "searchFragment$delegate", "Lkotlin/Lazy;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentDrawerContractBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentDrawerContractBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getFavoriteFragment", "Landroidx/fragment/app/Fragment;", "getChildFragment", "type", "tradingArea", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "sectionPosition", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "initObserver", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "resetSortType", "sortName", "sortType", "executeSearch", "text", "", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getParentPageId", "onBackPressed", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractDrawerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/ContractDrawerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n147#2,16:186\n1869#3,2:202\n*S KotlinDebug\n*F\n+ 1 ContractDrawerFragment.kt\ncom/kubi/kumex/market/tradingArea/ContractDrawerFragment\n*L\n59#1:186,16\n147#1:202,2\n*E\n"})
public class ContractDrawerFragment extends BaseTradingAreaFragment<DrawerTradingAreaIntent, DrawerTradingAreaState, DrawerTradingAreaVM> {

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f29476h0 = {Reflection.property1(new PropertyReference1Impl(ContractDrawerFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentDrawerContractBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f29477f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final InterfaceC24293a f29478g0;

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$a */
    /* JADX INFO: compiled from: ContractDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/kumex/market/tradingArea/ContractDrawerFragment$getViewModeFactory$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16234a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new DrawerTradingAreaVM(false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$bindState$2 */
    /* JADX INFO: compiled from: ContractDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "area", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.ContractDrawerFragment$bindState$2", m90122f = "ContractDrawerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C162362 extends SuspendLambda implements Function2<Pair<? extends List<? extends AvailableTradeAreaEntity>, ? extends Integer>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends List<? extends AvailableTradeAreaEntity>, ? extends Integer> pair, Continuation<? super Unit> continuation) {
            return invoke2((Pair<? extends List<AvailableTradeAreaEntity>, Integer>) pair, continuation);
        }

        public C162362(Continuation<? super C162362> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162362 c162362 = ContractDrawerFragment.this.new C162362(continuation);
            c162362.L$0 = obj;
            return c162362;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Pair<? extends List<AvailableTradeAreaEntity>, Integer> pair, Continuation<? super Unit> continuation) {
            return ((C162362) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (pair == null) {
                return Unit.INSTANCE;
            }
            ContractDrawerFragment.this.showContentView();
            ContractDrawerFragment.this.m34421B3((List) pair.getFirst(), ((Number) pair.getSecond()).intValue());
            C43841b.m96557d("click_future_exchange", "data_load_finish", null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$bindState$4 */
    /* JADX INFO: compiled from: ContractDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.ContractDrawerFragment$bindState$4", m90122f = "ContractDrawerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C162384 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: f */
        public static final void m34441f(ContractDrawerFragment contractDrawerFragment, View view) {
            BaseFragment.showLoadingView$default(contractDrawerFragment, 0, 0, 3, null);
            contractDrawerFragment.sendIntent(new DrawerTradingAreaIntent.FetchComposeData(""));
        }

        public C162384(Continuation<? super C162384> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162384 c162384 = ContractDrawerFragment.this.new C162384(continuation);
            c162384.L$0 = obj;
            return c162384;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C162384) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 == null) {
                return Unit.INSTANCE;
            }
            final ContractDrawerFragment contractDrawerFragment = ContractDrawerFragment.this;
            BaseFragment.showFailView$default(contractDrawerFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.kumex.market.tradingArea.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContractDrawerFragment.C162384.m34441f(contractDrawerFragment, view);
                }
            }, 3, (Object) null);
            C43841b.m96555b("click_future_exchange", null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m34434V3(ContractDrawerFragment contractDrawerFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.m66584o(it, 0, 0, 0, C27029c.m66603f(contractDrawerFragment, -10));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m34435W3() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final SearchDrawerFragment m34436X3() {
        return new SearchDrawerFragment();
    }

    @Override // com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    /* JADX INFO: renamed from: E3 */
    public void mo34422E3(@NotNull String sortName, int i11) {
        List<Fragment> listM85030j;
        String str;
        int i12;
        ViewPager2 viewPager2;
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        super.mo34422E3(sortName, i11);
        C36742c2 c36742c2M34439T3 = m34439T3();
        RecyclerView.Adapter adapter = (c36742c2M34439T3 == null || (viewPager2 = c36742c2M34439T3.f79811d) == null) ? null : viewPager2.getAdapter();
        C37727a c37727a = adapter instanceof C37727a ? (C37727a) adapter : null;
        if (c37727a == null || (listM85030j = c37727a.m85030j()) == null) {
            return;
        }
        for (ActivityResultCaller activityResultCaller : listM85030j) {
            if (activityResultCaller instanceof ResetChildSortType) {
                str = sortName;
                i12 = i11;
                ResetChildSortType.m34404C((ResetChildSortType) activityResultCaller, str, i12, false, 4, null);
            } else {
                str = sortName;
                i12 = i11;
            }
            sortName = str;
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m34437Q3(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (!mo33753S3().getF29488U() && !mo33753S3().isAdded()) {
            mo33753S3().m34493P3(true);
            getChildFragmentManager().beginTransaction().add(R$id.searchContainer, mo33753S3()).commitAllowingStateLoss();
        }
        mo33753S3().onTextChanged(charSequence.toString());
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public SearchDrawerFragment mo33753S3() {
        return (SearchDrawerFragment) this.f29477f0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: T3 */
    public final C36742c2 m34439T3() {
        return (C36742c2) this.f29478g0.getValue(this, f29476h0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bkumex_fragment_drawer_contract;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        return new C16234a();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends DrawerTradingAreaVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(DrawerTradingAreaVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.setBackgroundResource(R$drawable.shape_kc_bottom_sheet_bg);
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.kumex.market.tradingArea.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractDrawerFragment.m34435W3();
            }
        }, 1, null);
        C36742c2 c36742c2M34439T3 = m34439T3();
        if (c36742c2M34439T3 != null) {
            ViewPager2 drawerPager = c36742c2M34439T3.f79811d;
            Intrinsics.checkNotNullExpressionValue(drawerPager, "drawerPager");
            SlidingTabLayout drawerTab = c36742c2M34439T3.f79813f;
            Intrinsics.checkNotNullExpressionValue(drawerTab, "drawerTab");
            m34423F3(drawerPager, drawerTab);
        }
        m34433U3();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        sendIntent(new DrawerTradingAreaIntent.FetchComposeData(""));
    }

    @Override // com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    @NotNull
    /* JADX INFO: renamed from: v3 */
    public Fragment mo33755v3(int i11, @NotNull String tradingArea, @NotNull AvailableTradeAreaEntity entity, int i12) {
        Intrinsics.checkNotNullParameter(tradingArea, "tradingArea");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return DrawerListFragment.f29513d0.newInstance(i11, tradingArea, entity, getF29467U(), getF29468V(), i12);
    }

    @Override // com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    @NotNull
    /* JADX INFO: renamed from: w3 */
    public Fragment mo33756w3() {
        return FavoriteDrawerFragment.f29517i0.newInstance(0, "favor", getF29467U(), getF29468V());
    }

    public ContractDrawerFragment() {
        setPageId(C17060n0.m36552b());
        this.f29477f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.tradingArea.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractDrawerFragment.m34436X3();
            }
        });
        this.f29478g0 = C45681e.m100799e(this, new Function1<ContractDrawerFragment, C36742c2>() { // from class: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36742c2 invoke(@NotNull ContractDrawerFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36742c2.m82335a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36742c2, Unit>() { // from class: com.kubi.kumex.market.tradingArea.ContractDrawerFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36742c2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36742c2 c36742c2) {
                invoke(c36742c2);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    private final void m34433U3() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new ContractDrawerFragment$initObserver$1(this, null));
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final String m34438R3() {
        return C17060n0.m36552b();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.kumex.market.tradingArea.ContractDrawerFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((DrawerTradingAreaState) obj).getDrawer();
            }
        }, new C162362(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.kumex.market.tradingArea.ContractDrawerFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((DrawerTradingAreaState) obj).getError();
            }
        }, new C162384(null));
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        ViewSwitcher viewSwitcher;
        ViewSwitcher viewSwitcher2;
        C36742c2 c36742c2M34439T3 = m34439T3();
        if (c36742c2M34439T3 == null || (viewSwitcher = c36742c2M34439T3.f79812e) == null || viewSwitcher.getDisplayedChild() != 1) {
            return false;
        }
        C27032f.m66620k(this, mo33753S3());
        C36742c2 c36742c2M34439T4 = m34439T3();
        if (c36742c2M34439T4 != null && (viewSwitcher2 = c36742c2M34439T4.f79812e) != null) {
            viewSwitcher2.setDisplayedChild(0);
        }
        return true;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        ClearEditText clearEditText;
        super.onShow();
        C36742c2 c36742c2M34439T3 = m34439T3();
        if (c36742c2M34439T3 != null && (clearEditText = c36742c2M34439T3.f79810c) != null) {
            clearEditText.setText((CharSequence) null);
        }
        mo33752G3(C46894j.f104736a.m103281t(), new Function1() { // from class: com.kubi.kumex.market.tradingArea.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContractDrawerFragment.m34434V3(this.f29575b, (View) obj);
            }
        });
    }
}
