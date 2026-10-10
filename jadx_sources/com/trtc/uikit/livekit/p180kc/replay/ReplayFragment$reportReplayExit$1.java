package com.trtc.uikit.livekit.p180kc.replay;

import com.trtc.uikit.livekit.p180kc.helper.LiveHelper;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: ReplayFragment.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.replay.ReplayFragment$reportReplayExit$1", m90122f = "ReplayFragment.kt", m90123i = {}, m90124l = {218}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ReplayFragment$reportReplayExit$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReplayFragment this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.replay.ReplayFragment$reportReplayExit$1$1 */
    /* JADX INFO: compiled from: ReplayFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.replay.ReplayFragment$reportReplayExit$1$1", m90122f = "ReplayFragment.kt", m90123i = {}, m90124l = {220}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C364101 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ReplayFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C364101(ReplayFragment replayFragment, Continuation<? super C364101> continuation) {
            super(2, continuation);
            this.this$0 = replayFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C364101(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C364101) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LiveHelper liveHelper = LiveHelper.f79157a;
                    String strM81547r3 = this.this$0.m81547r3();
                    String strM81554q3 = this.this$0.m81554q3();
                    this.label = 1;
                    if (liveHelper.m81513e(strM81547r3, strM81554q3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                C44128b.m97266j("Live", "ReplayFragment: Report replay success");
            } catch (Exception e11) {
                C44128b.m97261e("Live", "ReplayFragment: Report replay failed - " + e11.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayFragment$reportReplayExit$1(ReplayFragment replayFragment, Continuation<? super ReplayFragment$reportReplayExit$1> continuation) {
        super(2, continuation);
        this.this$0 = replayFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReplayFragment$reportReplayExit$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ReplayFragment$reportReplayExit$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C41685g2 c41685g2 = C41685g2.f91735b;
            C364101 c364101 = new C364101(this.this$0, null);
            this.label = 1;
            if (C41686h.m91049g(c41685g2, c364101, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
