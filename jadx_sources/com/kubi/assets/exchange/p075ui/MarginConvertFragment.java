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
import com.kubi.assets.exchange.contract.MarginConvertContract$UiIntent;
import com.kubi.assets.exchange.contract.UIState;
import com.kubi.assets.exchange.model.MarginConvertItem;
import com.kubi.assets.exchange.p075ui.adapter.MarginConvertAdapter;
import com.kubi.assets.exchange.p075ui.dialog.ConfirmConvertDialog;
import com.kubi.assets.exchange.viewmodel.MarginConvertViewModel;
import com.kubi.mvi.event.SingleEvent;
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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p637ta.C44858s0;
import p719wa.C45777c;
import p754xa.TokenItem;
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
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import va.C45484a;
import w00.C45681e;

/* JADX INFO: compiled from: MarginConvertFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0010H\u0014J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020)0(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/MarginConvertFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/exchange/contract/MarginConvertContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentMarginConvertBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentMarginConvertBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/exchange/ui/adapter/MarginConvertAdapter;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "loadData", "isRefresh", "", "updateBottomPanelStatus", "onItemClick", ViewProps.POSITION, "toggleSelectAll", "convertKCS", "getSelectedTokens", "", "Lcom/kubi/assets/exchange/model/TokenItem;", "getTotalEstimatedFee", "", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginConvertFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginConvertFragment.kt\ncom/kubi/assets/exchange/ui/MarginConvertFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n147#2,16:172\n808#3,11:188\n1740#3,3:199\n808#3,11:202\n1740#3,3:213\n1878#3,3:216\n808#3,11:219\n774#3:230\n865#3,2:231\n1#4:233\n*S KotlinDebug\n*F\n+ 1 MarginConvertFragment.kt\ncom/kubi/assets/exchange/ui/MarginConvertFragment\n*L\n34#1:172,16\n79#1:188,11\n80#1:199,3\n100#1:202,11\n103#1:213,3\n106#1:216,3\n136#1:219,11\n136#1:230\n136#1:231,2\n*E\n"})
public final class MarginConvertFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f17272W = {Reflection.property1(new PropertyReference1Impl(MarginConvertFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentMarginConvertBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17273U = C45681e.m100799e(this, new Function1<MarginConvertFragment, C44858s0>() { // from class: com.kubi.assets.exchange.ui.MarginConvertFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44858s0 invoke(@NotNull MarginConvertFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44858s0.m99240a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44858s0, Unit>() { // from class: com.kubi.assets.exchange.ui.MarginConvertFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44858s0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44858s0 c44858s0) {
            invoke(c44858s0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MarginConvertAdapter f17274V = new MarginConvertAdapter(new ArrayList());

    /* JADX INFO: renamed from: com.kubi.assets.exchange.ui.MarginConvertFragment$bindState$2 */
    /* JADX INFO: compiled from: MarginConvertFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/exchange/model/MarginConvertItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.exchange.ui.MarginConvertFragment$bindState$2", m90122f = "MarginConvertFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C98702 extends SuspendLambda implements Function2<List<? extends MarginConvertItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C98702(Continuation<? super C98702> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98702 c98702 = MarginConvertFragment.this.new C98702(continuation);
            c98702.L$0 = obj;
            return c98702;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends MarginConvertItem> list, Continuation<? super Unit> continuation) {
            return ((C98702) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetConvertBottomPanelView assetConvertBottomPanelView;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MarginConvertFragment.this.f17274V.setNewData(list);
            C44858s0 c44858s0M16480w3 = MarginConvertFragment.this.m16480w3();
            if (c44858s0M16480w3 != null && (assetConvertBottomPanelView = c44858s0M16480w3.f100764b) != null) {
                assetConvertBottomPanelView.setUIStatus(list == null || list.isEmpty());
            }
            MarginConvertFragment.this.m16479H3();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.exchange.ui.MarginConvertFragment$dispatchSingleEvent$1 */
    /* JADX INFO: compiled from: MarginConvertFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.exchange.ui.MarginConvertFragment$dispatchSingleEvent$1", m90122f = "MarginConvertFragment.kt", m90123i = {}, m90124l = {158}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C98711 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C98711(Continuation<? super C98711> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginConvertFragment.this.new C98711(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C98711) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            MarginConvertFragment.this.preformBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m16465F3(MarginConvertFragment marginConvertFragment) {
        marginConvertFragment.m16477z3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ void m16460A3(MarginConvertFragment marginConvertFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        marginConvertFragment.m16477z3(z11);
    }

    /* JADX INFO: renamed from: B3 */
    private final void m16461B3(int i11) {
        List<T> data = this.f17274V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        MarginConvertItem marginConvertItem = (MarginConvertItem) CollectionsKt.getOrNull(data, i11);
        if (marginConvertItem instanceof TokenItem) {
            TokenItem tokenItem = (TokenItem) marginConvertItem;
            tokenItem.m101621h(!tokenItem.getIsSelected());
            this.f17274V.notifyItemChanged(i11);
        }
        m16479H3();
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m16462C3(MarginConvertFragment marginConvertFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (i11 < 0 || i11 >= marginConvertFragment.f17274V.getData().size()) {
            return;
        }
        marginConvertFragment.m16461B3(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u3 */
    private final void m16474u3() {
        AssetConvertBottomPanelView assetConvertBottomPanelView;
        BigDecimal bigDecimalM16386f;
        ConfirmConvertDialog confirmConvertDialog = new ConfirmConvertDialog();
        C44858s0 c44858s0M16480w3 = m16480w3();
        confirmConvertDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("data", (c44858s0M16480w3 == null || (assetConvertBottomPanelView = c44858s0M16480w3.f100764b) == null || (bigDecimalM16386f = assetConvertBottomPanelView.m16386f(m16481x3())) == null) ? null : bigDecimalM16386f.toPlainString()), TuplesKt.m90091to("data_1", m16476y3()), TuplesKt.m90091to("data_2", ((UIState) getState()).getFeeRate()), TuplesKt.m90091to("page", "LEVER")));
        confirmConvertDialog.m16512q4(new Function0() { // from class: com.kubi.assets.exchange.ui.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginConvertFragment.m16475v3(this.f17284b);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        confirmConvertDialog.show(childFragmentManager, ConfirmConvertDialog.class.getSimpleName());
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m16475v3(MarginConvertFragment marginConvertFragment) {
        marginConvertFragment.sendIntent(new MarginConvertContract$UiIntent.MarginConvert(marginConvertFragment.m16481x3()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    private final void m16477z3(boolean z11) {
        if (!z11) {
            showLoading();
        }
        sendIntent(MarginConvertContract$UiIntent.QueryMarginConvertList.INSTANCE);
    }

    /* JADX INFO: renamed from: G3 */
    public final void m16478G3() {
        boolean z11;
        Collection data = this.f17274V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof TokenItem) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i11 = 0;
        if (arrayList.isEmpty()) {
            z11 = true;
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((TokenItem) it.next()).getIsSelected()) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        boolean z12 = !z11;
        Collection data2 = this.f17274V.getData();
        Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
        for (Object obj2 : data2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MarginConvertItem marginConvertItem = (MarginConvertItem) obj2;
            if (marginConvertItem instanceof TokenItem) {
                ((TokenItem) marginConvertItem).m101621h(z12);
                this.f17274V.notifyItemChanged(i11);
            }
            i11 = i12;
        }
        m16479H3();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m16479H3() {
        boolean z11;
        AssetConvertBottomPanelView assetConvertBottomPanelView;
        Collection data = this.f17274V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof TokenItem) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            z11 = false;
        } else {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((TokenItem) it.next()).getIsSelected()) {
                            z11 = false;
                        }
                    }
                }
            }
            z11 = true;
        }
        C44858s0 c44858s0M16480w3 = m16480w3();
        if (c44858s0M16480w3 == null || (assetConvertBottomPanelView = c44858s0M16480w3.f100764b) == null) {
            return;
        }
        assetConvertBottomPanelView.m16389j(m16481x3(), z11);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C45777c) {
            ToastCompat.m66441G(getString(R$string.exchange_success), new Object[0]);
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C98711(null));
        } else if (singleEvent instanceof SingleEvent.C19247c) {
            showContent();
            C44858s0 c44858s0M16480w3 = m16480w3();
            if (c44858s0M16480w3 == null || (kuCoinRefreshLayout = c44858s0M16480w3.f100765c) == null) {
                return;
            }
            kuCoinRefreshLayout.setRefreshing(false);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_fragment_margin_convert;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(MarginConvertViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        AssetConvertBottomPanelView assetConvertBottomPanelView;
        AssetConvertBottomPanelView assetConvertBottomPanelView2;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45484a.f102511a.m100442c();
        C44858s0 c44858s0M16480w3 = m16480w3();
        if (c44858s0M16480w3 != null && (recyclerView = c44858s0M16480w3.f100766d) != null) {
            recyclerView.setAdapter(this.f17274V);
        }
        MarginConvertAdapter marginConvertAdapter = this.f17274V;
        int i11 = R$layout.view_empty;
        C44858s0 c44858s0M16480w4 = m16480w3();
        marginConvertAdapter.setEmptyView(i11, c44858s0M16480w4 != null ? c44858s0M16480w4.f100766d : null);
        this.f17274V.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.exchange.ui.x
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i12) {
                MarginConvertFragment.m16462C3(this.f17318a, baseQuickAdapter, view2, i12);
            }
        });
        C44858s0 c44858s0M16480w5 = m16480w3();
        if (c44858s0M16480w5 != null && (assetConvertBottomPanelView2 = c44858s0M16480w5.f100764b) != null) {
            assetConvertBottomPanelView2.m16387g(new Action() { // from class: com.kubi.assets.exchange.ui.y
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MarginConvertFragment.m16463D3(this.f17319b);
                }
            });
        }
        C44858s0 c44858s0M16480w6 = m16480w3();
        if (c44858s0M16480w6 != null && (assetConvertBottomPanelView = c44858s0M16480w6.f100764b) != null) {
            assetConvertBottomPanelView.m16384c(new Action() { // from class: com.kubi.assets.exchange.ui.z
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MarginConvertFragment.m16464E3(this.f17320b);
                }
            });
        }
        C44858s0 c44858s0M16480w7 = m16480w3();
        if (c44858s0M16480w7 == null || (kuCoinRefreshLayout = c44858s0M16480w7.f100765c) == null) {
            return;
        }
        kuCoinRefreshLayout.m54650b(new Function0() { // from class: com.kubi.assets.exchange.ui.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginConvertFragment.m16465F3(this.f17280b);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final C44858s0 m16480w3() {
        return (C44858s0) this.f17273U.getValue(this, f17272W[0]);
    }

    /* JADX INFO: renamed from: x3 */
    public final List<TokenItem> m16481x3() {
        Collection data = this.f17274V.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof TokenItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TokenItem) obj2).getIsSelected()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m16463D3(MarginConvertFragment marginConvertFragment) {
        marginConvertFragment.m16478G3();
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m16464E3(MarginConvertFragment marginConvertFragment) {
        marginConvertFragment.m16474u3();
    }

    /* JADX INFO: renamed from: y3 */
    private final String m16476y3() {
        List<TokenItem> listM16481x3 = m16481x3();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it = listM16481x3.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(C41014a.m89922G(((TokenItem) it.next()).getEstimatedFee(), null, 1, null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        String plainString = bigDecimalValueOf.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return plainString;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.exchange.ui.MarginConvertFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new C98702(null));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m16479H3();
        m16460A3(this, false, 1, null);
    }
}
