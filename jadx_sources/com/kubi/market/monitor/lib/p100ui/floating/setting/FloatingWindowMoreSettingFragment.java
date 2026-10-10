package com.kubi.market.monitor.lib.p100ui.floating.setting;

import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq.C4373b;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar;
import com.kubi.mvi.common.C19244f;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleVBStateContentFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
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
import sl.C44514c;
import w00.C45681e;

/* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0014J\b\u0010\"\u001a\u00020\u0010H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020%0$X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006("}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowMoreSettingFragment;", "Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingMoreSettingBinding;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/BaseFloatingWindowMoreMoreSettingFragment;", "<init>", "()V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "showSelectDialog", "", "type", "", "initView", "initBgAlphaChangeListener", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "getBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingMoreSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getBindingRootViewLayout", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingWindowMoreSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingWindowMoreSettingFragment.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowMoreSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,202:1\n143#2,20:203\n93#3,4:223\n*S KotlinDebug\n*F\n+ 1 FloatingWindowMoreSettingFragment.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowMoreSettingFragment\n*L\n190#1:203,20\n125#1:223,4\n*E\n"})
public final class FloatingWindowMoreSettingFragment extends SimpleVBStateContentFragment<UIState, C44514c> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f34287Z = {Reflection.property1(new PropertyReference1Impl(FloatingWindowMoreSettingFragment.class, "binding", "getBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingMoreSettingBinding;", 0))};

    /* JADX INFO: renamed from: W */
    public boolean f34289W;

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f34288V = "B4moreShowSetting";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f34290X = C45681e.m100799e(this, new Function1<FloatingWindowMoreSettingFragment, C44514c>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44514c invoke(@NotNull FloatingWindowMoreSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44514c.m98488a(fragment.requireView());
        }
    }, new Function1<C44514c, Unit>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44514c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44514c c44514c) {
            invoke(c44514c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final KClass<? extends AbstractC19290l<UIState>> f34291Y = Reflection.getOrCreateKotlinClass(FloatingWindowSettingVM.class);

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$a */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowMoreSettingFragment$initBgAlphaChangeListener$1", "Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$OnProgressChangedListener;", "onProgressChanged", "", "bubbleSeekBar", "Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;", "progress", "", "progressFloat", "", "fromUser", "", "getProgressOnActionUp", "getProgressOnFinally", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18613a implements SettingBubbleSeekBar.InterfaceC18669k {
        public C18613a() {
        }

        @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar.InterfaceC18669k
        /* JADX INFO: renamed from: b */
        public void mo40790b(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11) {
            FloatingWindowMoreSettingFragment.this.sendIntent(new ChangePageCount(2, i11));
        }

        @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar.InterfaceC18669k
        /* JADX INFO: renamed from: c */
        public void mo40791c(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11, boolean z11) {
            FloatingWindowMoreSettingFragment.this.sendIntent(new ChangePageCount(1, i11));
        }

        @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar.InterfaceC18669k
        /* JADX INFO: renamed from: a */
        public void mo40789a(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11, boolean z11) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$10 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$10", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1861510 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1861510(Continuation<? super C1861510> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1861510 c1861510 = FloatingWindowMoreSettingFragment.this.new C1861510(continuation);
            c1861510.L$0 = obj;
            return c1861510;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C1861510) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (textView = c44514cM40786C3.f98612l) != null) {
                textView.setText(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$12 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$12", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1861712 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C1861712(Continuation<? super C1861712> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1861712 c1861712 = FloatingWindowMoreSettingFragment.this.new C1861712(continuation);
            c1861712.L$0 = obj;
            return c1861712;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C1861712) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (textView = c44514cM40786C3.f98625y) != null) {
                textView.setText(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$14 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$14", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1861914 extends SuspendLambda implements Function2<IntervalTime, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(IntervalTime intervalTime, Continuation<? super Unit> continuation) {
            return ((C1861914) create(intervalTime, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1861914(Continuation<? super C1861914> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1861914 c1861914 = FloatingWindowMoreSettingFragment.this.new C1861914(continuation);
            c1861914.L$0 = obj;
            return c1861914;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            TextView textView2;
            TextView textView3;
            TextView textView4;
            TextView textView5;
            TextView textView6;
            IntervalTime intervalTime = (IntervalTime) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (textView6 = c44514cM40786C3.f98614n) != null) {
                textView6.setText(intervalTime.getFirst());
            }
            C44514c c44514cM40786C4 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C4 != null && (textView5 = c44514cM40786C4.f98615o) != null) {
                textView5.setText(intervalTime.getSecond());
            }
            C44514c c44514cM40786C5 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C5 != null && (textView4 = c44514cM40786C5.f98613m) != null) {
                textView4.setText(intervalTime.getThree());
            }
            C44514c c44514cM40786C6 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C6 != null && (textView3 = c44514cM40786C6.f98614n) != null) {
                textView3.setSelected(intervalTime.getFirstSelect());
            }
            C44514c c44514cM40786C7 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C7 != null && (textView2 = c44514cM40786C7.f98615o) != null) {
                textView2.setSelected(intervalTime.getSecondSelect());
            }
            C44514c c44514cM40786C8 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C8 != null && (textView = c44514cM40786C8.f98613m) != null) {
                textView.setSelected(intervalTime.getThreeSelect());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$16 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/market/monitor/lib/ui/floating/setting/IntervalTime;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$16", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1862116 extends SuspendLambda implements Function2<IntervalTime, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(IntervalTime intervalTime, Continuation<? super Unit> continuation) {
            return ((C1862116) create(intervalTime, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1862116(Continuation<? super C1862116> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1862116 c1862116 = FloatingWindowMoreSettingFragment.this.new C1862116(continuation);
            c1862116.L$0 = obj;
            return c1862116;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            TextView textView2;
            TextView textView3;
            TextView textView4;
            TextView textView5;
            TextView textView6;
            IntervalTime intervalTime = (IntervalTime) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (textView6 = c44514cM40786C3.f98620t) != null) {
                textView6.setText(intervalTime.getFirst());
            }
            C44514c c44514cM40786C4 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C4 != null && (textView5 = c44514cM40786C4.f98621u) != null) {
                textView5.setText(intervalTime.getSecond());
            }
            C44514c c44514cM40786C5 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C5 != null && (textView4 = c44514cM40786C5.f98619s) != null) {
                textView4.setText(intervalTime.getThree());
            }
            C44514c c44514cM40786C6 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C6 != null && (textView3 = c44514cM40786C6.f98620t) != null) {
                textView3.setSelected(intervalTime.getFirstSelect());
            }
            C44514c c44514cM40786C7 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C7 != null && (textView2 = c44514cM40786C7.f98621u) != null) {
                textView2.setSelected(intervalTime.getSecondSelect());
            }
            C44514c c44514cM40786C8 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C8 != null && (textView = c44514cM40786C8.f98619s) != null) {
                textView.setSelected(intervalTime.getThreeSelect());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$18 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$18", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1862318 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C1862318(Continuation<? super C1862318> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1862318 c1862318 = FloatingWindowMoreSettingFragment.this.new C1862318(continuation);
            c1862318.Z$0 = ((Boolean) obj).booleanValue();
            return c1862318;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C1862318) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinearLayoutCompat linearLayoutCompat;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (linearLayoutCompat = c44514cM40786C3.f98598A) != null) {
                C19244f.m42542a(linearLayoutCompat, z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$2 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$2", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186252 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C186252(Continuation<? super C186252> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186252 c186252 = FloatingWindowMoreSettingFragment.this.new C186252(continuation);
            c186252.L$0 = obj;
            return c186252;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C186252) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (textView = c44514cM40786C3.f98618r) != null) {
                textView.setText(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$20 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$20", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1862620 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C1862620(Continuation<? super C1862620> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1862620 c1862620 = FloatingWindowMoreSettingFragment.this.new C1862620(continuation);
            c1862620.Z$0 = ((Boolean) obj).booleanValue();
            return c1862620;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C1862620) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinearLayoutCompat linearLayoutCompat;
            LinearLayoutCompat linearLayoutCompat2;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (linearLayoutCompat2 = c44514cM40786C3.f98622v) != null) {
                C19244f.m42542a(linearLayoutCompat2, z11);
            }
            C44514c c44514cM40786C4 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C4 != null && (linearLayoutCompat = c44514cM40786C4.f98604d) != null) {
                C19244f.m42542a(linearLayoutCompat, !z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$4 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$4", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186284 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C186284(Continuation<? super C186284> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186284 c186284 = FloatingWindowMoreSettingFragment.this.new C186284(continuation);
            c186284.L$0 = obj;
            return c186284;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C186284) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (textView = c44514cM40786C3.f98609i) != null) {
                textView.setText(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$6 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$6", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186306 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C186306(Continuation<? super C186306> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186306 c186306 = FloatingWindowMoreSettingFragment.this.new C186306(continuation);
            c186306.L$0 = obj;
            return c186306;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C186306) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (textView = c44514cM40786C3.f98610j) != null) {
                textView.setText(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$8 */
    /* JADX INFO: compiled from: FloatingWindowMoreSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment$bindState$8", m90122f = "FloatingWindowMoreSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186328 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C186328) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C186328(Continuation<? super C186328> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186328 c186328 = FloatingWindowMoreSettingFragment.this.new C186328(continuation);
            c186328.I$0 = ((Number) obj).intValue();
            return c186328;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SettingBubbleSeekBar settingBubbleSeekBar;
            int i11 = this.I$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44514c c44514cM40786C3 = FloatingWindowMoreSettingFragment.this.m40786C3();
            if (c44514cM40786C3 != null && (settingBubbleSeekBar = c44514cM40786C3.f98626z) != null) {
                settingBubbleSeekBar.setProgress(i11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m40765E3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.m40788O3(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m40766F3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.m40788O3(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m40767G3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.m40788O3(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m40768H3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.m40788O3(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m40764B3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment, ShowDialog showDialog, BottomSheetDialogHelper.InterfaceC24339a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        floatingWindowMoreSettingFragment.sendIntent(new SelectItemIntent(showDialog.getF34407a(), item));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m40769I3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.sendIntent(new ChangePagingTime(3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m40770J3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.sendIntent(new ChangePagingTime(5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m40771K3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.sendIntent(new ChangePagingTime(10));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m40772L3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.sendIntent(new ChangeDisplayModeScrollTime(3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m40773M3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.sendIntent(new ChangeDisplayModeScrollTime(5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m40774N3(FloatingWindowMoreSettingFragment floatingWindowMoreSettingFragment) {
        floatingWindowMoreSettingFragment.sendIntent(new ChangeDisplayModeScrollTime(10));
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: C3 */
    public C44514c m40786C3() {
        return (C44514c) this.f34290X.getValue(this, f34287Z[0]);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m40788O3(int i11) {
        sendIntent(new ShowSelectDialogIntent(i11));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof ShowDialog) {
            final ShowDialog showDialog = (ShowDialog) singleEvent;
            C4373b.m3905g(null, this, showDialog.m40967a(), new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingWindowMoreSettingFragment.m40764B3(this.f34385b, showDialog, (BottomSheetDialogHelper.InterfaceC24339a) obj);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF34289W() {
        return this.f34289W;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF34288V() {
        return this.f34288V;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return this.f34291Y;
    }

    @Override // com.kubi.mvi.state.SimpleVBStateContentFragment
    /* JADX INFO: renamed from: m3 */
    public int mo21545m3() {
        return R$layout.fragment_floating_more_setting;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f34289W = z11;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f34288V = str;
    }

    /* JADX INFO: renamed from: D3 */
    public final void m40787D3() {
        SettingBubbleSeekBar settingBubbleSeekBar;
        SettingBubbleSeekBar settingBubbleSeekBar2;
        SettingBubbleSeekBar settingBubbleSeekBar3;
        C44514c c44514cM40786C3 = m40786C3();
        if (c44514cM40786C3 != null && (settingBubbleSeekBar3 = c44514cM40786C3.f98626z) != null) {
            settingBubbleSeekBar3.setShowCenterPoint(true);
        }
        C44514c c44514cM40786C4 = m40786C3();
        if (c44514cM40786C4 != null && (settingBubbleSeekBar2 = c44514cM40786C4.f98626z) != null) {
            settingBubbleSeekBar2.setDefaultProgress(5.0f);
        }
        C44514c c44514cM40786C5 = m40786C3();
        if (c44514cM40786C5 != null && (settingBubbleSeekBar = c44514cM40786C5.f98626z) != null) {
            settingBubbleSeekBar.setOnProgressChangedListener(new C18613a());
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDataUpdateIntervalTimeText();
            }
        }, new C186252(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getDisplayModeText();
            }
        }, new C186284(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPageSizeText();
            }
        }, new C186306(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((UIState) obj).getPageSize());
            }
        }, new C186328(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPageModeText();
            }
        }, new C1861510(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getTextSizeModeText();
            }
        }, new C1861712(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.13
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getIntervalTime();
            }
        }, new C1861914(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.15
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getAutoScrollTime();
            }
        }, new C1862116(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.17
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getPagingIntervalLayoutVisible());
            }
        }, new C1862318(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.FloatingWindowMoreSettingFragment.bindState.19
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getScrollIntervalLayoutVisible());
            }
        }, new C1862620(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        super.initView();
        C44514c c44514cM40786C3 = m40786C3();
        if (c44514cM40786C3 != null && (constraintLayout4 = c44514cM40786C3.f98617q) != null) {
            C27046k.m66711z(constraintLayout4, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40765E3(this.f34382b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C4 = m40786C3();
        if (c44514cM40786C4 != null && (constraintLayout3 = c44514cM40786C4.f98608h) != null) {
            C27046k.m66711z(constraintLayout3, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40766F3(this.f34389b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C5 = m40786C3();
        if (c44514cM40786C5 != null && (constraintLayout2 = c44514cM40786C5.f98599B) != null) {
            C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40767G3(this.f34392b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C6 = m40786C3();
        if (c44514cM40786C6 != null && (constraintLayout = c44514cM40786C6.f98600C) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40768H3(this.f34393b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C7 = m40786C3();
        if (c44514cM40786C7 != null && (textView6 = c44514cM40786C7.f98614n) != null) {
            C27046k.m66711z(textView6, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40769I3(this.f34396b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C8 = m40786C3();
        if (c44514cM40786C8 != null && (textView5 = c44514cM40786C8.f98615o) != null) {
            C27046k.m66711z(textView5, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40770J3(this.f34399b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C9 = m40786C3();
        if (c44514cM40786C9 != null && (textView4 = c44514cM40786C9.f98613m) != null) {
            C27046k.m66711z(textView4, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40771K3(this.f34402b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C10 = m40786C3();
        if (c44514cM40786C10 != null && (textView3 = c44514cM40786C10.f98620t) != null) {
            C27046k.m66711z(textView3, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40772L3(this.f34405b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C11 = m40786C3();
        if (c44514cM40786C11 != null && (textView2 = c44514cM40786C11.f98621u) != null) {
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40773M3(this.f34409b);
                }
            }, 1, null);
        }
        C44514c c44514cM40786C12 = m40786C3();
        if (c44514cM40786C12 != null && (textView = c44514cM40786C12.f98619s) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowMoreSettingFragment.m40774N3(this.f34410b);
                }
            }, 1, null);
        }
        m40787D3();
    }
}
