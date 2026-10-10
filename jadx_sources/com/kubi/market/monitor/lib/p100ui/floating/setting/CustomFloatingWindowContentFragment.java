package com.kubi.market.monitor.lib.p100ui.floating.setting;

import android.widget.CompoundButton;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleVBStateContentFragment;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
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
import sl.C44513b;
import w00.C45681e;

/* JADX INFO: compiled from: CustomFloatingWindowContentFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001eX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/CustomFloatingWindowContentFragment;", "Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingCustomContentBinding;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/BaseCustomFloatingWindowContentFragment;", "<init>", "()V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "initView", "", "bindState", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "getBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingCustomContentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getBindingRootViewLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCustomFloatingWindowContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomFloatingWindowContentFragment.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/CustomFloatingWindowContentFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,81:1\n143#2,20:82\n*S KotlinDebug\n*F\n+ 1 CustomFloatingWindowContentFragment.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/CustomFloatingWindowContentFragment\n*L\n69#1:82,20\n*E\n"})
public final class CustomFloatingWindowContentFragment extends SimpleVBStateContentFragment<UIState, C44513b> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f34282Z = {Reflection.property1(new PropertyReference1Impl(CustomFloatingWindowContentFragment.class, "binding", "getBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingCustomContentBinding;", 0))};

    /* JADX INFO: renamed from: W */
    public boolean f34284W;

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f34283V = "B4susShowSetting";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f34285X = C45681e.m100799e(this, new Function1<CustomFloatingWindowContentFragment, C44513b>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44513b invoke(@NotNull CustomFloatingWindowContentFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44513b.m98486a(fragment.requireView());
        }
    }, new Function1<C44513b, Unit>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44513b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44513b c44513b) {
            invoke(c44513b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final KClass<? extends AbstractC19290l<UIState>> f34286Y = Reflection.getOrCreateKotlinClass(FloatingWindowSettingVM.class);

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$2 */
    /* JADX INFO: compiled from: CustomFloatingWindowContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$2", m90122f = "CustomFloatingWindowContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186042 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C186042(Continuation<? super C186042> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186042 c186042 = CustomFloatingWindowContentFragment.this.new C186042(continuation);
            c186042.Z$0 = ((Boolean) obj).booleanValue();
            return c186042;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C186042) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KcSwitchButton kcSwitchButton;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44513b c44513bM40762t3 = CustomFloatingWindowContentFragment.this.m40762t3();
            if (c44513bM40762t3 != null && (kcSwitchButton = c44513bM40762t3.f98591e) != null) {
                kcSwitchButton.setChecked(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$4 */
    /* JADX INFO: compiled from: CustomFloatingWindowContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$4", m90122f = "CustomFloatingWindowContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186064 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C186064(Continuation<? super C186064> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186064 c186064 = CustomFloatingWindowContentFragment.this.new C186064(continuation);
            c186064.Z$0 = ((Boolean) obj).booleanValue();
            return c186064;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C186064) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KcSwitchButton kcSwitchButton;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44513b c44513bM40762t3 = CustomFloatingWindowContentFragment.this.m40762t3();
            if (c44513bM40762t3 != null && (kcSwitchButton = c44513bM40762t3.f98594h) != null) {
                kcSwitchButton.setChecked(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$6 */
    /* JADX INFO: compiled from: CustomFloatingWindowContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$6", m90122f = "CustomFloatingWindowContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186086 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C186086(Continuation<? super C186086> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186086 c186086 = CustomFloatingWindowContentFragment.this.new C186086(continuation);
            c186086.Z$0 = ((Boolean) obj).booleanValue();
            return c186086;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C186086) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KcSwitchButton kcSwitchButton;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44513b c44513bM40762t3 = CustomFloatingWindowContentFragment.this.m40762t3();
            if (c44513bM40762t3 != null && (kcSwitchButton = c44513bM40762t3.f98592f) != null) {
                kcSwitchButton.setChecked(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$8 */
    /* JADX INFO: compiled from: CustomFloatingWindowContentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment$bindState$8", m90122f = "CustomFloatingWindowContentFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186108 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C186108(Continuation<? super C186108> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186108 c186108 = CustomFloatingWindowContentFragment.this.new C186108(continuation);
            c186108.Z$0 = ((Boolean) obj).booleanValue();
            return c186108;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C186108) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KcSwitchButton kcSwitchButton;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44513b c44513bM40762t3 = CustomFloatingWindowContentFragment.this.m40762t3();
            if (c44513bM40762t3 != null && (kcSwitchButton = c44513bM40762t3.f98595i) != null) {
                kcSwitchButton.setChecked(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m40758u3(CustomFloatingWindowContentFragment customFloatingWindowContentFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        customFloatingWindowContentFragment.sendIntent(new FloatingWindowActionBarSwitchIntent(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m40759v3(CustomFloatingWindowContentFragment customFloatingWindowContentFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        customFloatingWindowContentFragment.sendIntent(new FloatingWindowChangePercentSwitchIntent(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m40760w3(CustomFloatingWindowContentFragment customFloatingWindowContentFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        customFloatingWindowContentFragment.sendIntent(new FloatingWindowCurrencyNameSwitchIntent(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m40761x3(CustomFloatingWindowContentFragment customFloatingWindowContentFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        customFloatingWindowContentFragment.sendIntent(new FloatingWindowFiatPriceSwitchIntent(z11));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF34284W() {
        return this.f34284W;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF34283V() {
        return this.f34283V;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return this.f34286Y;
    }

    @Override // com.kubi.mvi.state.SimpleVBStateContentFragment
    /* JADX INFO: renamed from: m3 */
    public int mo21545m3() {
        return R$layout.fragment_floating_custom_content;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f34284W = z11;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f34283V = str;
    }

    @Nullable
    /* JADX INFO: renamed from: t3 */
    public C44513b m40762t3() {
        return (C44513b) this.f34285X.getValue(this, f34282Z[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getActionBarShow());
            }
        }, new C186042(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getCurrencyNameShow());
            }
        }, new C186064(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getQuoteChangeShow());
            }
        }, new C186086(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.CustomFloatingWindowContentFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getPriceShow());
            }
        }, new C186108(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        KcSwitchButton kcSwitchButton;
        KcSwitchButton kcSwitchButton2;
        KcSwitchButton kcSwitchButton3;
        KcSwitchButton kcSwitchButton4;
        super.initView();
        C44513b c44513bM40762t3 = m40762t3();
        if (c44513bM40762t3 != null && (kcSwitchButton4 = c44513bM40762t3.f98591e) != null) {
            C27046k.m66708w(kcSwitchButton4, new Function2() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.c
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CustomFloatingWindowContentFragment.m40758u3(this.f34369b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C44513b c44513bM40762t4 = m40762t3();
        if (c44513bM40762t4 != null && (kcSwitchButton3 = c44513bM40762t4.f98592f) != null) {
            C27046k.m66708w(kcSwitchButton3, new Function2() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.d
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CustomFloatingWindowContentFragment.m40759v3(this.f34372b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C44513b c44513bM40762t5 = m40762t3();
        if (c44513bM40762t5 != null && (kcSwitchButton2 = c44513bM40762t5.f98594h) != null) {
            C27046k.m66708w(kcSwitchButton2, new Function2() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.e
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CustomFloatingWindowContentFragment.m40760w3(this.f34374b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C44513b c44513bM40762t6 = m40762t3();
        if (c44513bM40762t6 != null && (kcSwitchButton = c44513bM40762t6.f98595i) != null) {
            C27046k.m66708w(kcSwitchButton, new Function2() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CustomFloatingWindowContentFragment.m40761x3(this.f34377b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
    }
}
