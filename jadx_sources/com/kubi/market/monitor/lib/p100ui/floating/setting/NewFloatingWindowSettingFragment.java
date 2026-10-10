package com.kubi.market.monitor.lib.p100ui.floating.setting;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import aq.C4373b;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleVBStateContentFragment;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p265fl.C37565d;
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
import sl.C44515d;
import w00.C45681e;

/* JADX INFO: compiled from: NewFloatingWindowSettingFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\b\u0010 \u001a\u00020!H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020$0#X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006'"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/NewFloatingWindowSettingFragment;", "Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingSettingNewBinding;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/BaseFloatingSettingFragment;", "<init>", "()V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "initView", "", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "initBgAlphaSeekbar", "showThemeSelectDialog", "bindState", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "getBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingSettingNewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getBindingRootViewLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewFloatingWindowSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewFloatingWindowSettingFragment.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/NewFloatingWindowSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n143#2,20:183\n93#3,4:203\n1#4:207\n*S KotlinDebug\n*F\n+ 1 NewFloatingWindowSettingFragment.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/NewFloatingWindowSettingFragment\n*L\n171#1:183,20\n64#1:203,4\n*E\n"})
public final class NewFloatingWindowSettingFragment extends SimpleVBStateContentFragment<UIState, C44515d> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f34297Z = {Reflection.property1(new PropertyReference1Impl(NewFloatingWindowSettingFragment.class, "binding", "getBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentFloatingSettingNewBinding;", 0))};

    /* JADX INFO: renamed from: W */
    public boolean f34299W;

    /* JADX INFO: renamed from: V */
    @Nullable
    public String f34298V = "B3suspentionSetting";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f34300X = C45681e.m100799e(this, new Function1<NewFloatingWindowSettingFragment, C44515d>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44515d invoke(@NotNull NewFloatingWindowSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44515d.m98490a(fragment.requireView());
        }
    }, new Function1<C44515d, Unit>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44515d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44515d c44515d) {
            invoke(c44515d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final KClass<? extends AbstractC19290l<UIState>> f34301Y = Reflection.getOrCreateKotlinClass(FloatingWindowSettingVM.class);

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$a */
    /* JADX INFO: compiled from: NewFloatingWindowSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/setting/NewFloatingWindowSettingFragment$initBgAlphaSeekbar$2", "Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar$OnProgressChangedListener;", "onProgressChanged", "", "bubbleSeekBar", "Lcom/kubi/market/monitor/lib/ui/floating/setting/bubbleseekbar/SettingBubbleSeekBar;", "progress", "", "progressFloat", "", "fromUser", "", "getProgressOnActionUp", "getProgressOnFinally", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18639a implements SettingBubbleSeekBar.InterfaceC18669k {
        public C18639a() {
        }

        @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar.InterfaceC18669k
        /* JADX INFO: renamed from: b */
        public void mo40790b(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11) {
            NewFloatingWindowSettingFragment.this.sendIntent(new ChangeBgAlphaIntent(2, i11));
        }

        @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar.InterfaceC18669k
        /* JADX INFO: renamed from: c */
        public void mo40791c(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11, boolean z11) {
            NewFloatingWindowSettingFragment.this.sendIntent(new ChangeBgAlphaIntent(1, i11));
        }

        @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar.InterfaceC18669k
        /* JADX INFO: renamed from: a */
        public void mo40789a(SettingBubbleSeekBar settingBubbleSeekBar, int i11, float f11, boolean z11) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$2 */
    /* JADX INFO: compiled from: NewFloatingWindowSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$2", m90122f = "NewFloatingWindowSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186412 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C186412(Continuation<? super C186412> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186412 c186412 = NewFloatingWindowSettingFragment.this.new C186412(continuation);
            c186412.Z$0 = ((Boolean) obj).booleanValue();
            return c186412;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C186412) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44515d c44515dM40881x3 = NewFloatingWindowSettingFragment.this.m40881x3();
            if (c44515dM40881x3 != null) {
                c44515dM40881x3.f98638l.setChecked(z11);
                FloatingActionManager.m41289j1(FloatingActionManager.f34540a, c44515dM40881x3.f98638l.isChecked(), false, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$4 */
    /* JADX INFO: compiled from: NewFloatingWindowSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$4", m90122f = "NewFloatingWindowSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186434 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C186434(Continuation<? super C186434> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186434 c186434 = NewFloatingWindowSettingFragment.this.new C186434(continuation);
            c186434.L$0 = obj;
            return c186434;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C186434) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C44515d c44515dM40881x3 = NewFloatingWindowSettingFragment.this.m40881x3();
            if (c44515dM40881x3 != null && (textView = c44515dM40881x3.f98645s) != null) {
                textView.setText(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$6 */
    /* JADX INFO: compiled from: NewFloatingWindowSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$6", m90122f = "NewFloatingWindowSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186456 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C186456) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C186456(Continuation<? super C186456> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186456 c186456 = NewFloatingWindowSettingFragment.this.new C186456(continuation);
            c186456.I$0 = ((Number) obj).intValue();
            return c186456;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            TextView textView2;
            int i11 = this.I$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (C5303w0.m6511a()) {
                C44515d c44515dM40881x3 = NewFloatingWindowSettingFragment.this.m40881x3();
                if (c44515dM40881x3 != null && (textView2 = c44515dM40881x3.f98631e) != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('%');
                    sb2.append(i11);
                    textView2.setText(sb2.toString());
                }
            } else {
                C44515d c44515dM40881x4 = NewFloatingWindowSettingFragment.this.m40881x3();
                if (c44515dM40881x4 != null && (textView = c44515dM40881x4.f98631e) != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11);
                    sb3.append('%');
                    textView.setText(sb3.toString());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$8 */
    /* JADX INFO: compiled from: NewFloatingWindowSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment$bindState$8", m90122f = "NewFloatingWindowSettingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C186478 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C186478) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C186478(Continuation<? super C186478> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186478 c186478 = NewFloatingWindowSettingFragment.this.new C186478(continuation);
            c186478.I$0 = ((Number) obj).intValue();
            return c186478;
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
            C44515d c44515dM40881x3 = NewFloatingWindowSettingFragment.this.m40881x3();
            if (c44515dM40881x3 != null && (settingBubbleSeekBar = c44515dM40881x3.f98628b) != null) {
                settingBubbleSeekBar.setProgress(i11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m40868A3(C44515d c44515d, NewFloatingWindowSettingFragment newFloatingWindowSettingFragment) {
        boolean zIsChecked = c44515d.f98638l.isChecked();
        newFloatingWindowSettingFragment.sendIntent(new SwitchFloatingWindowIntent(!zIsChecked));
        if (!zIsChecked) {
            C37565d c37565d = C37565d.f83517a;
            if (c37565d.m84598d()) {
                c37565d.m84608p(newFloatingWindowSettingFragment);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m40869B3(NewFloatingWindowSettingFragment newFloatingWindowSettingFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        newFloatingWindowSettingFragment.sendIntent(new ShowSelectDialogIntent(5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m40879w3(NewFloatingWindowSettingFragment newFloatingWindowSettingFragment, ShowDialog showDialog, BottomSheetDialogHelper.InterfaceC24339a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        newFloatingWindowSettingFragment.sendIntent(new SelectItemIntent(showDialog.getF34407a(), item));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof ShowDialog) {
            final ShowDialog showDialog = (ShowDialog) singleEvent;
            C4373b.m3905g(null, this, showDialog.m40967a(), new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.v0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewFloatingWindowSettingFragment.m40879w3(this.f34418b, showDialog, (BottomSheetDialogHelper.InterfaceC24339a) obj);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF34289W() {
        return this.f34299W;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF34288V() {
        return this.f34298V;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return this.f34301Y;
    }

    @Override // com.kubi.mvi.state.SimpleVBStateContentFragment
    /* JADX INFO: renamed from: m3 */
    public int mo21545m3() {
        return R$layout.fragment_floating_setting_new;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f34299W = z11;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f34298V = str;
    }

    @Nullable
    /* JADX INFO: renamed from: x3 */
    public C44515d m40881x3() {
        return (C44515d) this.f34300X.getValue(this, f34297Z[0]);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m40870C3(NewFloatingWindowSettingFragment newFloatingWindowSettingFragment) {
        Context context = newFloatingWindowSettingFragment.getContext();
        if (context != null) {
            BaseActivity.Companion.launch$default(BaseActivity.INSTANCE, context, CustomFloatingWindowContentFragment.class, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m40871D3(NewFloatingWindowSettingFragment newFloatingWindowSettingFragment) {
        Context context = newFloatingWindowSettingFragment.getContext();
        if (context != null) {
            BaseActivity.Companion.launch$default(BaseActivity.INSTANCE, context, FloatingWindowMoreSettingFragment.class, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final String m40880z3(String str) {
        if (C5303w0.m6511a()) {
            return '%' + str;
        }
        return str + '%';
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getFloatingWindowSwitch());
            }
        }, new C186412(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getThemeText();
            }
        }, new C186434(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((UIState) obj).getFloatingWindowBgAlpha());
            }
        }, new C186456(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.NewFloatingWindowSettingFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((UIState) obj).getFloatingWindowBgAlphaSeekbarProgress());
            }
        }, new C186478(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        super.initView();
        final C44515d c44515dM40881x3 = m40881x3();
        if (c44515dM40881x3 != null) {
            FloatWindowSwitchButton floatingWindowSwitch = c44515dM40881x3.f98638l;
            Intrinsics.checkNotNullExpressionValue(floatingWindowSwitch, "floatingWindowSwitch");
            C27046k.m66711z(floatingWindowSwitch, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewFloatingWindowSettingFragment.m40868A3(c44515dM40881x3, this);
                }
            }, 1, null);
            ConstraintLayout themeSetting = c44515dM40881x3.f98644r;
            Intrinsics.checkNotNullExpressionValue(themeSetting, "themeSetting");
            ViewExtKt.m66575f(themeSetting, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewFloatingWindowSettingFragment.m40869B3(this.f34413b, (View) obj);
                }
            });
            TextView customShow = c44515dM40881x3.f98632f;
            Intrinsics.checkNotNullExpressionValue(customShow, "customShow");
            C27046k.m66711z(customShow, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewFloatingWindowSettingFragment.m40870C3(this.f34415b);
                }
            }, 1, null);
            TextView moreSetting = c44515dM40881x3.f98643q;
            Intrinsics.checkNotNullExpressionValue(moreSetting, "moreSetting");
            C27046k.m66711z(moreSetting, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.u0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewFloatingWindowSettingFragment.m40871D3(this.f34416b);
                }
            }, 1, null);
        }
        m40882y3();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m40882y3() {
        SettingBubbleSeekBar settingBubbleSeekBar;
        SettingBubbleSeekBar settingBubbleSeekBar2;
        SettingBubbleSeekBar settingBubbleSeekBar3;
        SettingBubbleSeekBar settingBubbleSeekBar4;
        C44515d c44515dM40881x3 = m40881x3();
        if (c44515dM40881x3 != null && (settingBubbleSeekBar4 = c44515dM40881x3.f98628b) != null) {
            settingBubbleSeekBar4.setShowCenterPoint(true);
        }
        C44515d c44515dM40881x4 = m40881x3();
        if (c44515dM40881x4 != null && (settingBubbleSeekBar3 = c44515dM40881x4.f98628b) != null) {
            settingBubbleSeekBar3.setProgressFormatCallback(new SettingBubbleSeekBar.InterfaceC18668j() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.w0
                @Override // com.kubi.market.monitor.lib.p100ui.floating.setting.bubbleseekbar.SettingBubbleSeekBar.InterfaceC18668j
                /* JADX INFO: renamed from: a */
                public final String mo40906a(String str) {
                    return NewFloatingWindowSettingFragment.m40880z3(str);
                }
            });
        }
        C44515d c44515dM40881x5 = m40881x3();
        if (c44515dM40881x5 != null && (settingBubbleSeekBar2 = c44515dM40881x5.f98628b) != null) {
            settingBubbleSeekBar2.setDefaultProgress(75.0f);
        }
        C44515d c44515dM40881x6 = m40881x3();
        if (c44515dM40881x6 != null && (settingBubbleSeekBar = c44515dM40881x6.f98628b) != null) {
            settingBubbleSeekBar.setOnProgressChangedListener(new C18639a());
        }
    }
}
