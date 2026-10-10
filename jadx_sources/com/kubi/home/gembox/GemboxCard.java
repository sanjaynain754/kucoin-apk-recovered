package com.kubi.home.gembox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.R$layout;
import com.kubi.home.newcoin.HomeRecommPosHelper;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.SimpleStateCard;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.ViewExtKt;
import fj.C37509b;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: GemboxCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0015J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010#\u001a\u00020\u0011H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxCard;", "Lcom/kubi/kucoin/home/cards/SimpleStateCard;", "Lcom/kubi/home/gembox/GemboxContract$UIState;", "<init>", "()V", "fragmentHomeCardGemboxBinding", "Lcom/kubi/home/databinding/FragmentHomeCardGemboxBinding;", "getFragmentHomeCardGemboxBinding", "()Lcom/kubi/home/databinding/FragmentHomeCardGemboxBinding;", "fragmentHomeCardGemboxBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "heatListAdapter", "Lcom/kubi/home/gembox/HeatListAdapter;", "textItemList", "", "Lcom/kubi/home/gembox/TextItem;", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "initView", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "getLayout", "", "handleData", "Lcom/kubi/home/gembox/GemboxCardData;", "realBindData", "Lcom/kubi/home/gembox/GemboxCardData$Data;", "getHeatList", "bindState", "onMoveStart", "onMoveStop", "bindHighLightState", "highLights", "jumpToRn", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/gembox/GemboxCardVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGemboxCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GemboxCard.kt\ncom/kubi/home/gembox/GemboxCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,169:1\n147#2,16:170\n*S KotlinDebug\n*F\n+ 1 GemboxCard.kt\ncom/kubi/home/gembox/GemboxCard\n*L\n31#1:170,16\n*E\n"})
public final class GemboxCard extends SimpleStateCard<UIState> {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f25642a0 = {Reflection.property1(new PropertyReference1Impl(GemboxCard.class, "fragmentHomeCardGemboxBinding", "getFragmentHomeCardGemboxBinding()Lcom/kubi/home/databinding/FragmentHomeCardGemboxBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @Nullable
    public HeatListAdapter f25644Y;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f25643X = C45681e.m100799e(this, new Function1<GemboxCard, C37509b>() { // from class: com.kubi.home.gembox.GemboxCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37509b invoke(@NotNull GemboxCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37509b.m84476a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37509b, Unit>() { // from class: com.kubi.home.gembox.GemboxCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37509b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37509b c37509b) {
            invoke(c37509b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public List<TextItem> f25645Z = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCard$bindState$2 */
    /* JADX INFO: compiled from: GemboxCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/gembox/HeatEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.gembox.GemboxCard$bindState$2", m90122f = "GemboxCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145602 extends SuspendLambda implements Function2<List<? extends HeatEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends HeatEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<HeatEntity>) list, continuation);
        }

        public C145602(Continuation<? super C145602> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145602 c145602 = GemboxCard.this.new C145602(continuation);
            c145602.L$0 = obj;
            return c145602;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<HeatEntity> list, Continuation<? super Unit> continuation) {
            return ((C145602) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeatListAdapter heatListAdapter = GemboxCard.this.f25644Y;
            if (heatListAdapter != null) {
                heatListAdapter.replaceData(list);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCard$bindState$4 */
    /* JADX INFO: compiled from: GemboxCard.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/home/gembox/GemboxCardData$Data;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.gembox.GemboxCard$bindState$4", m90122f = "GemboxCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145624 extends SuspendLambda implements Function2<GemboxCardData.Data, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(GemboxCardData.Data data, Continuation<? super Unit> continuation) {
            return ((C145624) create(data, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C145624(Continuation<? super C145624> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145624 c145624 = GemboxCard.this.new C145624(continuation);
            c145624.L$0 = obj;
            return c145624;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BaseTextView baseTextView;
            ShowHideTextView showHideTextView;
            ShowHideTextView showHideTextView2;
            GemboxCardData.Data data = (GemboxCardData.Data) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GemboxCard.this.m29167t3(data);
            C37509b c37509bM29163o3 = GemboxCard.this.m29163o3();
            if (c37509bM29163o3 != null && (showHideTextView2 = c37509bM29163o3.f83218g) != null) {
                showHideTextView2.setText(data.getChangeRateString());
            }
            C37509b c37509bM29163o4 = GemboxCard.this.m29163o3();
            if (c37509bM29163o4 != null && (showHideTextView = c37509bM29163o4.f83218g) != null) {
                Context contextM66513b = C27017c.f54310a.m66513b();
                BigDecimal changeRate = data.getChangeRate();
                showHideTextView.setTextColor(C22890g.m54279d(contextM66513b, changeRate != null ? changeRate.doubleValue() : 0.0d, 0, 2, null));
            }
            C37509b c37509bM29163o5 = GemboxCard.this.m29163o3();
            if (c37509bM29163o5 != null && (baseTextView = c37509bM29163o5.f83219h) != null) {
                baseTextView.setText(C42828b.m93917r(data.getPriceString(), data.getSymbolCode()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.gembox.GemboxCard$bindState$6 */
    /* JADX INFO: compiled from: GemboxCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/gembox/TextItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.gembox.GemboxCard$bindState$6", m90122f = "GemboxCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145646 extends SuspendLambda implements Function2<List<? extends TextItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TextItem> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TextItem>) list, continuation);
        }

        public C145646(Continuation<? super C145646> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145646 c145646 = GemboxCard.this.new C145646(continuation);
            c145646.L$0 = obj;
            return c145646;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TextItem> list, Continuation<? super Unit> continuation) {
            return ((C145646) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GemboxCard.this.m29162n3(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m29161r3(GemboxCard gemboxCard, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gemboxCard.m29166s3();
        gemboxCard.sendIntent(GemboxContract$UiIntent.TrackClickIntent.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo28980K1(data);
        if (data instanceof GemboxCardData) {
            m29165q3((GemboxCardData) data);
            C43841b.m96557d("event_load_home_gembox", "page_load_end", null, 4, null);
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.fragment_home_card_gembox;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @NotNull
    public KClass<GemboxCardVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(GemboxCardVM.class);
    }

    /* JADX INFO: renamed from: o3 */
    public final C37509b m29163o3() {
        return (C37509b) this.f25643X.getValue(this, f25642a0[0]);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m29165q3(GemboxCardData gemboxCardData) {
        sendIntent(new GemboxContract$UiIntent.BindGemboxData(gemboxCardData));
    }

    /* JADX INFO: renamed from: s3 */
    public final void m29166s3() {
        sendIntent(GemboxContract$UiIntent.JumpToRn.INSTANCE);
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        MarqueeView marqueeView;
        super.mo28981P();
        C37509b c37509bM29163o3 = m29163o3();
        if (c37509bM29163o3 != null && (marqueeView = c37509bM29163o3.f83216e) != null) {
            marqueeView.m29238j();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        MarqueeView marqueeView;
        super.mo28982Q();
        C37509b c37509bM29163o3 = m29163o3();
        if (c37509bM29163o3 != null && (marqueeView = c37509bM29163o3.f83216e) != null) {
            marqueeView.m29236h();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @SuppressLint({"SetTextI18n"})
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.gembox.GemboxCard.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getHeatEntityList();
            }
        }, new C145602(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.gembox.GemboxCard.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new C145624(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.home.gembox.GemboxCard.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getHighLights();
            }
        }, new C145646(null));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void initView() {
        RecyclerView recyclerView;
        super.initView();
        C37509b c37509bM29163o3 = m29163o3();
        if (c37509bM29163o3 != null && (recyclerView = c37509bM29163o3.f83214c) != null) {
            DisableRtlLinearLayoutManager disableRtlLinearLayoutManager = new DisableRtlLinearLayoutManager(recyclerView.getContext());
            disableRtlLinearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(disableRtlLinearLayoutManager);
            recyclerView.addItemDecoration(new GemboxHeatSpacesItemDecoration(C27040e.m66658b(1)));
            HeatListAdapter heatListAdapter = new HeatListAdapter();
            this.f25644Y = heatListAdapter;
            recyclerView.setAdapter(heatListAdapter);
        }
        View view = getView();
        if (view != null) {
            ViewExtKt.m66575f(view, new Function1() { // from class: com.kubi.home.gembox.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GemboxCard.m29161r3(this.f25672b, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final void m29162n3(List<TextItem> list) {
        MarqueeView marqueeView;
        MarqueeView marqueeView2;
        MarqueeView marqueeView3;
        if (list.isEmpty()) {
            C37509b c37509bM29163o3 = m29163o3();
            if (c37509bM29163o3 != null && (marqueeView3 = c37509bM29163o3.f83216e) != null) {
                ViewExtKt.m66577h(marqueeView3);
                return;
            }
            return;
        }
        C37509b c37509bM29163o4 = m29163o3();
        if (c37509bM29163o4 != null && (marqueeView2 = c37509bM29163o4.f83216e) != null) {
            ViewExtKt.m66594y(marqueeView2);
        }
        C37509b c37509bM29163o5 = m29163o3();
        if (c37509bM29163o5 != null && (marqueeView = c37509bM29163o5.f83216e) != null) {
            marqueeView.setData(list);
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        MarqueeView marqueeView;
        super.onHide();
        C37509b c37509bM29163o3 = m29163o3();
        if (c37509bM29163o3 != null && (marqueeView = c37509bM29163o3.f83216e) != null) {
            marqueeView.m29236h();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() {
        MarqueeView marqueeView;
        super.onShow();
        C37509b c37509bM29163o3 = m29163o3();
        if (c37509bM29163o3 != null && (marqueeView = c37509bM29163o3.f83216e) != null) {
            marqueeView.m29238j();
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m29164p3(GemboxCardData.Data data) {
        float f11;
        String heatValue = data.getHeatValue();
        if (heatValue != null && heatValue.length() != 0) {
            f11 = Float.parseFloat(data.getHeatValue());
        } else {
            f11 = 0.0f;
        }
        sendIntent(new GemboxContract$UiIntent.GetHeatListIntent(f11, 10));
    }

    /* JADX INFO: renamed from: t3 */
    public final void m29167t3(GemboxCardData.Data data) {
        CoinAvatarView coinAvatarView;
        BaseTextView baseTextView;
        C37509b c37509bM29163o3 = m29163o3();
        if (c37509bM29163o3 != null && (baseTextView = c37509bM29163o3.f83213b) != null) {
            baseTextView.setText(data.getName());
        }
        C37509b c37509bM29163o4 = m29163o3();
        if (c37509bM29163o4 != null && (coinAvatarView = c37509bM29163o4.f83215d) != null) {
            HomeRecommPosHelper.m29734f(HomeRecommPosHelper.f25930a, coinAvatarView, data.getIconUrl(), requireContext(), false, 4, null);
        }
        m29164p3(data);
    }
}
