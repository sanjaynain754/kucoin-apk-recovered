package com.kubi.assets.exchange.p075ui;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.RedeemableEntity;
import com.kubi.assets.exchange.contract.MainConvertContract$UiIntent;
import com.kubi.assets.exchange.contract.UIState;
import com.kubi.assets.exchange.p075ui.adapter.TradingConvertAdapter;
import com.kubi.assets.exchange.p075ui.dialog.ConfirmConvertDialog;
import com.kubi.assets.exchange.viewmodel.MainConvertViewModel;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p637ta.C44886w0;
import p719wa.C45775a;
import p719wa.C45776b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import va.C45484a;
import w00.C45681e;

/* JADX INFO: compiled from: MainConvertFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010(\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020*0)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/MainConvertFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/exchange/contract/MainConvertContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentTradingConvertBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentTradingConvertBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", TUIConstants.TUIContact.SELECTED_LIST, "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/RedeemableEntity;", "Lkotlin/collections/ArrayList;", "adapter", "Lcom/kubi/assets/exchange/ui/adapter/TradingConvertAdapter;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "loadData", "isRefresh", "", "updateBottomPanelStatus", "isAllSelected", "onItemClick", ViewProps.POSITION, "selectAll", "convertKCS", "getTotalEstimatedFee", "", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainConvertFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainConvertFragment.kt\ncom/kubi/assets/exchange/ui/MainConvertFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n147#2,16:162\n1#3:178\n1869#4,2:179\n*S KotlinDebug\n*F\n+ 1 MainConvertFragment.kt\ncom/kubi/assets/exchange/ui/MainConvertFragment\n*L\n33#1:162,16\n131#1:179,2\n*E\n"})
public final class MainConvertFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f17268X = {Reflection.property1(new PropertyReference1Impl(MainConvertFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentTradingConvertBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17269U = C45681e.m100799e(this, new Function1<MainConvertFragment, C44886w0>() { // from class: com.kubi.assets.exchange.ui.MainConvertFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44886w0 invoke(@NotNull MainConvertFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44886w0.m99296a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44886w0, Unit>() { // from class: com.kubi.assets.exchange.ui.MainConvertFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44886w0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44886w0 c44886w0) {
            invoke(c44886w0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ArrayList<RedeemableEntity> f17270V = new ArrayList<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final TradingConvertAdapter f17271W = new TradingConvertAdapter();

    /* JADX INFO: renamed from: com.kubi.assets.exchange.ui.MainConvertFragment$dispatchSingleEvent$1 */
    /* JADX INFO: compiled from: MainConvertFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.exchange.ui.MainConvertFragment$dispatchSingleEvent$1", m90122f = "MainConvertFragment.kt", m90123i = {}, m90124l = {143}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C98681 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C98681(Continuation<? super C98681> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainConvertFragment.this.new C98681(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C98681) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m90350b(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MainConvertFragment.this.preformBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m16442B3(MainConvertFragment mainConvertFragment) {
        mainConvertFragment.m16451v3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    private final void m16443C3() {
        ArrayList<RedeemableEntity> arrayList = this.f17270V;
        if (arrayList.size() == this.f17271W.getData().size()) {
            arrayList.clear();
        } else {
            arrayList.clear();
            arrayList.addAll(this.f17271W.getData());
        }
        this.f17271W.notifyDataSetChanged();
        m16455D3(this.f17270V.size() > 0);
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m16444E3(MainConvertFragment mainConvertFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mainConvertFragment.m16455D3(z11);
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m16450s3(MainConvertFragment mainConvertFragment) {
        mainConvertFragment.sendIntent(new MainConvertContract$UiIntent.MainConvert(mainConvertFragment.f17270V));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    private final void m16451v3(boolean z11) {
        if (!z11) {
            showLoading();
        }
        sendIntent(MainConvertContract$UiIntent.QueryMainConvertList.INSTANCE);
    }

    /* JADX INFO: renamed from: w3 */
    public static /* synthetic */ void m16452w3(MainConvertFragment mainConvertFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        mainConvertFragment.m16451v3(z11);
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m16453y3(MainConvertFragment mainConvertFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (i11 < 0 || i11 >= mainConvertFragment.f17271W.getData().size()) {
            return;
        }
        mainConvertFragment.m16459x3(i11);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        AssetConvertBottomPanelView assetConvertBottomPanelView;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C45775a) {
            ToastCompat.m66441G(getString(R$string.exchange_success), new Object[0]);
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C98681(null));
            return;
        }
        if (singleEvent instanceof C45776b) {
            this.f17270V.clear();
            C45776b c45776b = (C45776b) singleEvent;
            this.f17271W.setNewData(c45776b.m101099a());
            C44886w0 c44886w0M16457t3 = m16457t3();
            if (c44886w0M16457t3 != null && (assetConvertBottomPanelView = c44886w0M16457t3.f101034b) != null) {
                List<RedeemableEntity> listM101099a = c45776b.m101099a();
                assetConvertBottomPanelView.setUIStatus(listM101099a == null || listM101099a.isEmpty());
            }
            m16444E3(this, false, 1, null);
            showContent();
            C44886w0 c44886w0M16457t4 = m16457t3();
            if (c44886w0M16457t4 == null || (kuCoinRefreshLayout = c44886w0M16457t4.f101036d) == null) {
                return;
            }
            kuCoinRefreshLayout.setRefreshing(false);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_fragment_trading_convert;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(MainConvertViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        AssetConvertBottomPanelView assetConvertBottomPanelView;
        AssetConvertBottomPanelView assetConvertBottomPanelView2;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45484a.f102511a.m100441b();
        C44886w0 c44886w0M16457t3 = m16457t3();
        if (c44886w0M16457t3 != null && (recyclerView = c44886w0M16457t3.f101037e) != null) {
            recyclerView.setAdapter(this.f17271W);
        }
        TradingConvertAdapter tradingConvertAdapter = this.f17271W;
        int i11 = R$layout.view_empty;
        C44886w0 c44886w0M16457t4 = m16457t3();
        tradingConvertAdapter.setEmptyView(i11, c44886w0M16457t4 != null ? c44886w0M16457t4.f101037e : null);
        this.f17271W.m16504h(this.f17270V);
        this.f17271W.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.exchange.ui.s
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i12) {
                MainConvertFragment.m16453y3(this.f17313a, baseQuickAdapter, view2, i12);
            }
        });
        C44886w0 c44886w0M16457t5 = m16457t3();
        if (c44886w0M16457t5 != null && (assetConvertBottomPanelView2 = c44886w0M16457t5.f101034b) != null) {
            assetConvertBottomPanelView2.m16387g(new Action() { // from class: com.kubi.assets.exchange.ui.t
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MainConvertFragment.m16454z3(this.f17314b);
                }
            });
        }
        C44886w0 c44886w0M16457t6 = m16457t3();
        if (c44886w0M16457t6 != null && (assetConvertBottomPanelView = c44886w0M16457t6.f101034b) != null) {
            assetConvertBottomPanelView.m16384c(new Action() { // from class: com.kubi.assets.exchange.ui.u
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MainConvertFragment.m16441A3(this.f17315b);
                }
            });
        }
        C44886w0 c44886w0M16457t7 = m16457t3();
        if (c44886w0M16457t7 == null || (kuCoinRefreshLayout = c44886w0M16457t7.f101036d) == null) {
            return;
        }
        kuCoinRefreshLayout.m54650b(new Function0() { // from class: com.kubi.assets.exchange.ui.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainConvertFragment.m16442B3(this.f17316b);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final void m16456r3() {
        AssetConvertBottomPanelView assetConvertBottomPanelView;
        ConfirmConvertDialog confirmConvertDialog = new ConfirmConvertDialog();
        C44886w0 c44886w0M16457t3 = m16457t3();
        confirmConvertDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("data", (c44886w0M16457t3 == null || (assetConvertBottomPanelView = c44886w0M16457t3.f101034b) == null) ? null : assetConvertBottomPanelView.m16385e(this.f17270V)), TuplesKt.m90091to("data_1", m16458u3()), TuplesKt.m90091to("page", "MAIN")));
        confirmConvertDialog.m16512q4(new Function0() { // from class: com.kubi.assets.exchange.ui.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainConvertFragment.m16450s3(this.f17317b);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        confirmConvertDialog.show(childFragmentManager, ConfirmConvertDialog.class.getSimpleName());
    }

    /* JADX INFO: renamed from: t3 */
    public final C44886w0 m16457t3() {
        return (C44886w0) this.f17269U.getValue(this, f17268X[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final String m16458u3() {
        BigDecimal bigDecimal = new BigDecimal(0);
        Iterator<T> it = this.f17270V.iterator();
        while (it.hasNext()) {
            bigDecimal = bigDecimal.add(((RedeemableEntity) it.next()).getEstimatedFee());
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "add(...)");
        }
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return plainString;
    }

    /* JADX INFO: renamed from: x3 */
    public final void m16459x3(int i11) {
        List<RedeemableEntity> data = this.f17271W.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        RedeemableEntity redeemableEntity = (RedeemableEntity) CollectionsKt.getOrNull(data, i11);
        if (!TypeIntrinsics.asMutableCollection(this.f17270V).remove(redeemableEntity) && redeemableEntity != null) {
            this.f17270V.add(redeemableEntity);
        }
        this.f17271W.notifyItemChanged(i11);
        m16455D3(this.f17270V.size() == this.f17271W.getData().size());
    }

    /* JADX INFO: renamed from: A3 */
    public static final void m16441A3(MainConvertFragment mainConvertFragment) {
        mainConvertFragment.m16456r3();
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m16454z3(MainConvertFragment mainConvertFragment) {
        mainConvertFragment.m16443C3();
    }

    /* JADX INFO: renamed from: D3 */
    public final void m16455D3(boolean z11) {
        AssetConvertBottomPanelView assetConvertBottomPanelView;
        C44886w0 c44886w0M16457t3 = m16457t3();
        if (c44886w0M16457t3 != null && (assetConvertBottomPanelView = c44886w0M16457t3.f101034b) != null) {
            assetConvertBottomPanelView.m16388i(this.f17270V, z11);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m16444E3(this, false, 1, null);
        m16452w3(this, false, 1, null);
    }
}
