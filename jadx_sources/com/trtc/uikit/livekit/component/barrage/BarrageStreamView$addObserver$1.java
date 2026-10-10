package com.trtc.uikit.livekit.component.barrage;

import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageState;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BarrageStreamView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.barrage.BarrageStreamView$addObserver$1", m90122f = "BarrageStreamView.kt", m90123i = {}, m90124l = {88}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BarrageStreamView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BarrageStreamView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.BarrageStreamView$addObserver$1$a */
    /* JADX INFO: compiled from: BarrageStreamView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35882a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BarrageStreamView f77621b;

        public C35882a(BarrageStreamView barrageStreamView) {
            this.f77621b = barrageStreamView;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<Barrage> list, Continuation<? super Unit> continuation) {
            this.f77621b.m79476m(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarrageStreamView$addObserver$1(BarrageStreamView barrageStreamView, Continuation<? super BarrageStreamView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = barrageStreamView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BarrageStreamView$addObserver$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BarrageStreamView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BarrageState barrageState;
        InterfaceC41678w<List<Barrage>> messageList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            BarrageStore barrageStore = this.this$0.f77618j;
            if (barrageStore != null && (barrageState = barrageStore.getBarrageState()) != null && (messageList = barrageState.getMessageList()) != null) {
                C35882a c35882a = new C35882a(this.this$0);
                this.label = 1;
                if (messageList.collect(c35882a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        throw new KotlinNothingValueException();
    }
}
