package com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CoHostForegroundWidgetsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView$addObserver$1", m90122f = "CoHostForegroundWidgetsView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CoHostForegroundWidgetsView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoHostForegroundWidgetsView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView$addObserver$1$1 */
    /* JADX INFO: compiled from: CoHostForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView$addObserver$1$1", m90122f = "CoHostForegroundWidgetsView.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361591 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CoHostForegroundWidgetsView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361591(CoHostForegroundWidgetsView coHostForegroundWidgetsView, Continuation<? super C361591> continuation) {
            super(2, continuation);
            this.this$0 = coHostForegroundWidgetsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361591(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361591) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CoHostForegroundWidgetsView coHostForegroundWidgetsView = this.this$0;
                this.label = 1;
                if (coHostForegroundWidgetsView.m80568o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView$addObserver$1$2 */
    /* JADX INFO: compiled from: CoHostForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView$addObserver$1$2", m90122f = "CoHostForegroundWidgetsView.kt", m90123i = {}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361602 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CoHostForegroundWidgetsView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361602(CoHostForegroundWidgetsView coHostForegroundWidgetsView, Continuation<? super C361602> continuation) {
            super(2, continuation);
            this.this$0 = coHostForegroundWidgetsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361602(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361602) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CoHostForegroundWidgetsView coHostForegroundWidgetsView = this.this$0;
                this.label = 1;
                if (coHostForegroundWidgetsView.m80569p(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView$addObserver$1$3 */
    /* JADX INFO: compiled from: CoHostForegroundWidgetsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.widgets.CoHostForegroundWidgetsView$addObserver$1$3", m90122f = "CoHostForegroundWidgetsView.kt", m90123i = {}, m90124l = {78}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361613 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CoHostForegroundWidgetsView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361613(CoHostForegroundWidgetsView coHostForegroundWidgetsView, Continuation<? super C361613> continuation) {
            super(2, continuation);
            this.this$0 = coHostForegroundWidgetsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361613(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361613) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                CoHostForegroundWidgetsView coHostForegroundWidgetsView = this.this$0;
                this.label = 1;
                if (coHostForegroundWidgetsView.m80570q(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoHostForegroundWidgetsView$addObserver$1(CoHostForegroundWidgetsView coHostForegroundWidgetsView, Continuation<? super CoHostForegroundWidgetsView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = coHostForegroundWidgetsView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoHostForegroundWidgetsView$addObserver$1 coHostForegroundWidgetsView$addObserver$1 = new CoHostForegroundWidgetsView$addObserver$1(this.this$0, continuation);
        coHostForegroundWidgetsView$addObserver$1.L$0 = obj;
        return coHostForegroundWidgetsView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CoHostForegroundWidgetsView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361591(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361602(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361613(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
