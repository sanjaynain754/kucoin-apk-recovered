package io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog;

import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AtomicAlertDialog.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog$startCountdown$1", m90122f = "AtomicAlertDialog.kt", m90123i = {0}, m90124l = {TypedValues.CycleType.TYPE_WAVE_PERIOD}, m90125m = "invokeSuspend", m90126n = {"remaining"}, m90127s = {"J$0"})
public final class AtomicAlertDialog$startCountdown$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $durationSeconds;
    long J$0;
    int label;
    final /* synthetic */ AtomicAlertDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomicAlertDialog$startCountdown$1(long j11, AtomicAlertDialog atomicAlertDialog, Continuation<? super AtomicAlertDialog$startCountdown$1> continuation) {
        super(2, continuation);
        this.$durationSeconds = j11;
        this.this$0 = atomicAlertDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AtomicAlertDialog$startCountdown$1(this.$durationSeconds, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AtomicAlertDialog$startCountdown$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0066 -> B:21:0x0069). Please report as a decompilation issue!!! */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j11;
        AtomicPopover atomicPopover;
        AtomicPopover atomicPopover2;
        AtomicPopover atomicPopover3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                j11 = this.J$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            j11 = this.$durationSeconds;
            if (j11 >= 1 || (atomicPopover3 = this.this$0.f87425f) == null || !atomicPopover3.isShowing()) {
                atomicPopover = this.this$0.f87425f;
                if (atomicPopover != null && atomicPopover.isShowing() && (atomicPopover2 = this.this$0.f87425f) != null) {
                    atomicPopover2.dismiss();
                }
                return Unit.INSTANCE;
            }
            TextView textView = this.this$0.f87428i;
            if (textView != null) {
                textView.setText(this.this$0.f87429j + " (" + j11 + ')');
            }
            this.J$0 = j11;
            this.label = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        j11--;
        if (j11 >= 1) {
        }
        atomicPopover = this.this$0.f87425f;
        if (atomicPopover != null) {
            atomicPopover2.dismiss();
        }
        return Unit.INSTANCE;
    }
}
