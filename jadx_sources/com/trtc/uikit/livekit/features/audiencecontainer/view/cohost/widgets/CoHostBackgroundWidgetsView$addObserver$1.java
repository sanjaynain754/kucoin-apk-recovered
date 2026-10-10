package com.trtc.uikit.livekit.features.audiencecontainer.view.cohost.widgets;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CoHostBackgroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.audiencecontainer.view.cohost.widgets.CoHostBackgroundWidgetsView$addObserver$1", m90122f = "CoHostBackgroundWidgetsView.kt", m90123i = {}, m90124l = {53}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CoHostBackgroundWidgetsView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CoHostBackgroundWidgetsView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.cohost.widgets.CoHostBackgroundWidgetsView$addObserver$1$a */
    /* JADX INFO: compiled from: CoHostBackgroundWidgetsView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36321a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CoHostBackgroundWidgetsView f78908b;

        public C36321a(CoHostBackgroundWidgetsView coHostBackgroundWidgetsView) {
            this.f78908b = coHostBackgroundWidgetsView;
        }

        /* JADX INFO: renamed from: a */
        public final Object m81205a(boolean z11, Continuation<? super Unit> continuation) {
            this.f78908b.m81202j(Boxing.boxBoolean(z11));
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m81205a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoHostBackgroundWidgetsView$addObserver$1(CoHostBackgroundWidgetsView coHostBackgroundWidgetsView, Continuation<? super CoHostBackgroundWidgetsView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = coHostBackgroundWidgetsView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoHostBackgroundWidgetsView$addObserver$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CoHostBackgroundWidgetsView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41669n<Boolean> interfaceC41669nM83111e = this.this$0.getMediaState().m83111e();
            C36321a c36321a = new C36321a(this.this$0);
            this.label = 1;
            if (interfaceC41669nM83111e.collect(c36321a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
