package com.trtc.uikit.livekit.p180kc.widget;

import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KCAudiencePreviewView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCAudiencePreviewView$startCountdown$1", m90122f = "KCAudiencePreviewView.kt", m90123i = {0, 0, 0, 0}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "countdownParts", "now", "remaining"}, m90127s = {"L$0", "L$1", "J$0", "J$1"})
public final class KCAudiencePreviewView$startCountdown$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KCAudiencePreviewView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCAudiencePreviewView$startCountdown$1(KCAudiencePreviewView kCAudiencePreviewView, Continuation<? super KCAudiencePreviewView$startCountdown$1> continuation) {
        super(2, continuation);
        this.this$0 = kCAudiencePreviewView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCAudiencePreviewView$startCountdown$1 kCAudiencePreviewView$startCountdown$1 = new KCAudiencePreviewView$startCountdown$1(this.this$0, continuation);
        kCAudiencePreviewView$startCountdown$1.L$0 = obj;
        return kCAudiencePreviewView$startCountdown$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCAudiencePreviewView$startCountdown$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        while (C41713n0.m91132h(interfaceC41709m0) && !this.this$0.f79230q) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCoerceAtLeast = RangesKt.coerceAtLeast(this.this$0.f79227n - jCurrentTimeMillis, 0L);
            CountdownParts countdownPartsM81707a = C36448c.m81707a(jCoerceAtLeast);
            this.this$0.m81639r(countdownPartsM81707a);
            if (jCoerceAtLeast == 0) {
                break;
            }
            this.L$0 = interfaceC41709m0;
            this.L$1 = SpillingKt.nullOutSpilledVariable(countdownPartsM81707a);
            this.J$0 = jCurrentTimeMillis;
            this.J$1 = jCoerceAtLeast;
            this.label = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
