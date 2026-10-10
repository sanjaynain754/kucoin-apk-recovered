package io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog;

import ag0.ThemeState;
import android.widget.LinearLayout;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.DesignTokenSet;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicAlertDialog.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog$show$2", m90122f = "AtomicAlertDialog.kt", m90123i = {}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AtomicAlertDialog$show$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AtomicPopover $panel;
    int label;
    final /* synthetic */ AtomicAlertDialog this$0;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog$show$2$1 */
    /* JADX INFO: compiled from: AtomicAlertDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lio/trtc/tuikit/atomicx/theme/ThemeState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog$show$2$1", m90122f = "AtomicAlertDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C393551 extends SuspendLambda implements Function2<ThemeState, Continuation<? super Unit>, Object> {
        final /* synthetic */ AtomicPopover $panel;
        int label;
        final /* synthetic */ AtomicAlertDialog this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ThemeState themeState, Continuation<? super Unit> continuation) {
            return ((C393551) create(themeState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C393551(AtomicPopover atomicPopover, AtomicAlertDialog atomicAlertDialog, Continuation<? super C393551> continuation) {
            super(2, continuation);
            this.$panel = atomicPopover;
            this.this$0 = atomicAlertDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C393551(this.$panel, this.this$0, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$panel.isShowing()) {
                    AtomicAlertDialog atomicAlertDialog = this.this$0;
                    DesignTokenSet designTokenSetM88064t = atomicAlertDialog.m88064t(atomicAlertDialog.f87420a);
                    AtomicAlertDialog atomicAlertDialog2 = this.this$0;
                    LinearLayout linearLayout = atomicAlertDialog2.f87423d;
                    AtomicAlertDialog.DialogConfig dialogConfig = null;
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
                        linearLayout = null;
                    }
                    AtomicAlertDialog.DialogConfig dialogConfig2 = this.this$0.f87424e;
                    if (dialogConfig2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("config");
                    } else {
                        dialogConfig = dialogConfig2;
                    }
                    atomicAlertDialog2.m88056L(linearLayout, dialogConfig, this.$panel, designTokenSetM88064t);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomicAlertDialog$show$2(AtomicAlertDialog atomicAlertDialog, AtomicPopover atomicPopover, Continuation<? super AtomicAlertDialog$show$2> continuation) {
        super(2, continuation);
        this.this$0 = atomicAlertDialog;
        this.$panel = atomicPopover;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AtomicAlertDialog$show$2(this.this$0, this.$panel, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AtomicAlertDialog$show$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41678w<ThemeState> interfaceC41678wM87980c = ThemeStore.f87316e.shared(this.this$0.f87420a).m87980c();
            C393551 c393551 = new C393551(this.$panel, this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41678wM87980c, c393551, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
