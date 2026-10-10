package com.kubi.spot.business.marketChanges;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.business.discover.MarketChangeHelper;
import com.kubi.spot.business.discover.MarketChangeSettingManager;
import com.kubi.spot.business.discover.entity.MarketChangesItemEntity;
import com.kubi.spot.kline.KuCoinKlineFragment;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
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
import t20.C44633c0;
import w00.C45681e;

/* JADX INFO: compiled from: MarketChangeKlineEntranceFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, m90084d2 = {"Lcom/kubi/spot/business/marketChanges/MarketChangeKlineEntranceFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/spot/business/marketChanges/KlineMarketChangeContract$UIState;", "<init>", "()V", "fragmentMatketChangeKlineEntranceBinding", "Lcom/kubi/spot/databinding/FragmentMatketChangeKlineEntranceBinding;", "getFragmentMatketChangeKlineEntranceBinding", "()Lcom/kubi/spot/databinding/FragmentMatketChangeKlineEntranceBinding;", "fragmentMatketChangeKlineEntranceBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isMarketChangeShow", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/spot/business/marketChanges/MarketChangeAdapter;", "getAdapter", "()Lcom/kubi/spot/business/marketChanges/MarketChangeAdapter;", "getLayout", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "handleRootView", "bindState", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketChangeKlineEntranceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketChangeKlineEntranceFragment.kt\ncom/kubi/spot/business/marketChanges/MarketChangeKlineEntranceFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,151:1\n147#2,16:152\n*S KotlinDebug\n*F\n+ 1 MarketChangeKlineEntranceFragment.kt\ncom/kubi/spot/business/marketChanges/MarketChangeKlineEntranceFragment\n*L\n28#1:152,16\n*E\n"})
public final class MarketChangeKlineEntranceFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f50242Y = {Reflection.property1(new PropertyReference1Impl(MarketChangeKlineEntranceFragment.class, "fragmentMatketChangeKlineEntranceBinding", "getFragmentMatketChangeKlineEntranceBinding()Lcom/kubi/spot/databinding/FragmentMatketChangeKlineEntranceBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50243U = C45681e.m100799e(this, new Function1<MarketChangeKlineEntranceFragment, C44633c0>() { // from class: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44633c0 invoke(@NotNull MarketChangeKlineEntranceFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44633c0.m98744a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44633c0, Unit>() { // from class: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44633c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44633c0 c44633c0) {
            invoke(c44633c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public boolean f50244V = MarketChangeSettingManager.f50135a.m61011d("SPOT_KLINE");

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50245W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.marketChanges.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketChangeKlineEntranceFragment.m61203B3(this.f50251b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MarketChangeAdapter f50246X = new MarketChangeAdapter();

    /* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$bindState$2 */
    /* JADX INFO: compiled from: MarketChangeKlineEntranceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "supportSymbol", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$bindState$2", m90122f = "MarketChangeKlineEntranceFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250192 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C250192) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C250192(Continuation<? super C250192> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250192 c250192 = MarketChangeKlineEntranceFragment.this.new C250192(continuation);
            c250192.L$0 = obj;
            return c250192;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConstraintLayout constraintLayout;
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (bool != null) {
                MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment = MarketChangeKlineEntranceFragment.this;
                if (bool.booleanValue() && marketChangeKlineEntranceFragment.f50244V) {
                    C43852m.m96595g("B5candle", "volatile", "1", null, 8, null);
                    marketChangeKlineEntranceFragment.m61217y3();
                    marketChangeKlineEntranceFragment.sendIntent(new KlineMarketChangeContract$UiIntent.GetMarketChangeData(C27041f.m66668h(marketChangeKlineEntranceFragment.m61213x3())));
                    C12572a.m23695d("market_change_display", Boxing.boxBoolean(true), 0L, 4, null);
                } else {
                    C44633c0 c44633c0M61216w3 = marketChangeKlineEntranceFragment.m61216w3();
                    if (c44633c0M61216w3 != null && (constraintLayout = c44633c0M61216w3.f99005e) != null) {
                        ViewExtKt.m66577h(constraintLayout);
                    }
                    C12572a.m23695d("market_change_display", Boxing.boxBoolean(false), 0L, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$bindState$4 */
    /* JADX INFO: compiled from: MarketChangeKlineEntranceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "requestResult", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$bindState$4", m90122f = "MarketChangeKlineEntranceFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250214 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C250214) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C250214(Continuation<? super C250214> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final void m61219f(MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment, View view) {
            marketChangeKlineEntranceFragment.sendIntent(new KlineMarketChangeContract$UiIntent.GetMarketChangeData(C27041f.m66668h(marketChangeKlineEntranceFragment.m61213x3())));
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250214 c250214 = MarketChangeKlineEntranceFragment.this.new C250214(continuation);
            c250214.L$0 = obj;
            return c250214;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (MarketChangeKlineEntranceFragment.m61208q3(MarketChangeKlineEntranceFragment.this).getSupportSymbol() != null) {
                final MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment = MarketChangeKlineEntranceFragment.this;
                if (bool == null) {
                    marketChangeKlineEntranceFragment.showLoading();
                } else if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    marketChangeKlineEntranceFragment.showContentView();
                } else {
                    BaseFragment.showFailView$default(marketChangeKlineEntranceFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.spot.business.marketChanges.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MarketChangeKlineEntranceFragment.C250214.m61219f(marketChangeKlineEntranceFragment, view);
                        }
                    }, 3, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$bindState$6 */
    /* JADX INFO: compiled from: MarketChangeKlineEntranceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment$bindState$6", m90122f = "MarketChangeKlineEntranceFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250236 extends SuspendLambda implements Function2<List<? extends MarketChangesItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MarketChangesItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MarketChangesItemEntity>) list, continuation);
        }

        public C250236(Continuation<? super C250236> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250236 c250236 = MarketChangeKlineEntranceFragment.this.new C250236(continuation);
            c250236.L$0 = obj;
            return c250236;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MarketChangesItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C250236) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinearLayoutCompat linearLayoutCompat;
            BaseTextView baseTextView;
            RecyclerView recyclerView;
            LinearLayoutCompat linearLayoutCompat2;
            BaseTextView baseTextView2;
            RecyclerView recyclerView2;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment = MarketChangeKlineEntranceFragment.this;
                marketChangeKlineEntranceFragment.m61217y3();
                if (list.isEmpty()) {
                    C44633c0 c44633c0M61216w3 = marketChangeKlineEntranceFragment.m61216w3();
                    if (c44633c0M61216w3 != null && (recyclerView2 = c44633c0M61216w3.f99004d) != null) {
                        ViewExtKt.m66577h(recyclerView2);
                    }
                    C44633c0 c44633c0M61216w4 = marketChangeKlineEntranceFragment.m61216w3();
                    if (c44633c0M61216w4 != null && (baseTextView2 = c44633c0M61216w4.f99007g) != null) {
                        ViewExtKt.m66577h(baseTextView2);
                    }
                    C44633c0 c44633c0M61216w5 = marketChangeKlineEntranceFragment.m61216w3();
                    if (c44633c0M61216w5 != null && (linearLayoutCompat2 = c44633c0M61216w5.f99003c) != null) {
                        ViewExtKt.m66594y(linearLayoutCompat2);
                    }
                } else {
                    C44633c0 c44633c0M61216w6 = marketChangeKlineEntranceFragment.m61216w3();
                    if (c44633c0M61216w6 != null && (recyclerView = c44633c0M61216w6.f99004d) != null) {
                        ViewExtKt.m66594y(recyclerView);
                    }
                    C44633c0 c44633c0M61216w7 = marketChangeKlineEntranceFragment.m61216w3();
                    if (c44633c0M61216w7 != null && (baseTextView = c44633c0M61216w7.f99007g) != null) {
                        ViewExtKt.m66594y(baseTextView);
                    }
                    C44633c0 c44633c0M61216w8 = marketChangeKlineEntranceFragment.m61216w3();
                    if (c44633c0M61216w8 != null && (linearLayoutCompat = c44633c0M61216w8.f99003c) != null) {
                        ViewExtKt.m66577h(linearLayoutCompat);
                    }
                }
                marketChangeKlineEntranceFragment.getF50246X().setNewData(list);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m61202A3(MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        MarketChangeHelper.m61014e(MarketChangeHelper.f50139a, null, C27041f.m66668h(marketChangeKlineEntranceFragment.m61213x3()), "SPOT", null, null, 25, null);
        MarketChangeKlineEntranceClickPoint.f50250a.m61220a(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public final String m61213x3() {
        return (String) this.f50245W.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m61214z3(MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment, View it) throws JSONException {
        Intrinsics.checkNotNullParameter(it, "it");
        MarketChangeHelper.m61014e(MarketChangeHelper.f50139a, null, C27041f.m66668h(marketChangeKlineEntranceFragment.m61213x3()), "SPOT", null, null, 25, null);
        MarketChangeKlineEntranceClickPoint.f50250a.m61220a(null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_matket_change_kline_entrance;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(KlineMarketChangeVM.class);
    }

    @NotNull
    /* JADX INFO: renamed from: v3, reason: from getter */
    public final MarketChangeAdapter getF50246X() {
        return this.f50246X;
    }

    /* JADX INFO: renamed from: w3 */
    public final C44633c0 m61216w3() {
        return (C44633c0) this.f50243U.getValue(this, f50242Y[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public static final String m61203B3(MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment) {
        KuCoinKlineFragment.InterfaceC25353a interfaceC25353a;
        TradeItemBean f49727v;
        KeyEventDispatcher.Component activity = marketChangeKlineEntranceFragment.getActivity();
        if (activity instanceof KuCoinKlineFragment.InterfaceC25353a) {
            interfaceC25353a = (KuCoinKlineFragment.InterfaceC25353a) activity;
        } else {
            interfaceC25353a = null;
        }
        if (interfaceC25353a == null || (f49727v = interfaceC25353a.getF49727V()) == null) {
            return null;
        }
        return f49727v.getSymbol();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q3 */
    public static final /* synthetic */ UIState m61208q3(MarketChangeKlineEntranceFragment marketChangeKlineEntranceFragment) {
        return (UIState) marketChangeKlineEntranceFragment.getState();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSupportSymbol();
            }
        }, new C250192(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getRequestResult();
            }
        }, new C250214(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.marketChanges.MarketChangeKlineEntranceFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new C250236(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.initView();
        C44633c0 c44633c0M61216w3 = m61216w3();
        if (c44633c0M61216w3 != null && (recyclerView2 = c44633c0M61216w3.f99004d) != null) {
            recyclerView2.setAdapter(this.f50246X);
        }
        C44633c0 c44633c0M61216w4 = m61216w3();
        if (c44633c0M61216w4 != null && (recyclerView = c44633c0M61216w4.f99004d) != null) {
            recyclerView.setItemAnimator(null);
        }
        C44633c0 c44633c0M61216w5 = m61216w3();
        if (c44633c0M61216w5 != null && (baseTextView2 = c44633c0M61216w5.f99007g) != null) {
            ViewExtKt.m66575f(baseTextView2, new Function1() { // from class: com.kubi.spot.business.marketChanges.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketChangeKlineEntranceFragment.m61214z3(this.f50252b, (View) obj);
                }
            });
        }
        C44633c0 c44633c0M61216w6 = m61216w3();
        if (c44633c0M61216w6 != null && (baseTextView = c44633c0M61216w6.f99006f) != null) {
            ViewExtKt.m66575f(baseTextView, new Function1() { // from class: com.kubi.spot.business.marketChanges.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketChangeKlineEntranceFragment.m61202A3(this.f50253b, (View) obj);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m61217y3();
        sendIntent(new KlineMarketChangeContract$UiIntent.SymbolSupport(C27041f.m66668h(m61213x3())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y3 */
    public final void m61217y3() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        if (!Intrinsics.areEqual(((UIState) getState()).getSupportSymbol(), Boolean.TRUE)) {
            C44633c0 c44633c0M61216w3 = m61216w3();
            if (c44633c0M61216w3 != null && (constraintLayout3 = c44633c0M61216w3.f99005e) != null) {
                ViewExtKt.m66577h(constraintLayout3);
                return;
            }
            return;
        }
        if (((UIState) getState()).getData() == null) {
            C44633c0 c44633c0M61216w4 = m61216w3();
            if (c44633c0M61216w4 != null && (constraintLayout2 = c44633c0M61216w4.f99005e) != null) {
                C27046k.m66703r(constraintLayout2);
                return;
            }
            return;
        }
        C44633c0 c44633c0M61216w5 = m61216w3();
        if (c44633c0M61216w5 != null && (constraintLayout = c44633c0M61216w5.f99005e) != null) {
            ViewExtKt.m66594y(constraintLayout);
        }
    }
}
