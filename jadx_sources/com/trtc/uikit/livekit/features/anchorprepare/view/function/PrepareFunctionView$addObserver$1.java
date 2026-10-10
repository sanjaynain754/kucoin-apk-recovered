package com.trtc.uikit.livekit.features.anchorprepare.view.function;

import be0.C4579a;
import kotlinx.coroutines.C41696j;
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

/* JADX INFO: compiled from: PrepareFunctionView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1", m90122f = "PrepareFunctionView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PrepareFunctionView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PrepareFunctionView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$1 */
    /* JADX INFO: compiled from: PrepareFunctionView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$1", m90122f = "PrepareFunctionView.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361821 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PrepareFunctionView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$1$a */
        /* JADX INFO: compiled from: PrepareFunctionView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PrepareFunctionView f78497b;

            public a(PrepareFunctionView prepareFunctionView) {
                this.f78497b = prepareFunctionView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80675a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78497b.m80671w(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80675a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361821(PrepareFunctionView prepareFunctionView, Continuation<? super C361821> continuation) {
            super(2, continuation);
            this.this$0 = prepareFunctionView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361821(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361821) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM4446b = C4579a.f4058a.m4446b();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM4446b.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$2 */
    /* JADX INFO: compiled from: PrepareFunctionView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$2", m90122f = "PrepareFunctionView.kt", m90123i = {}, m90124l = {61}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361832 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PrepareFunctionView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$2$a */
        /* JADX INFO: compiled from: PrepareFunctionView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PrepareFunctionView f78498b;

            public a(PrepareFunctionView prepareFunctionView) {
                this.f78498b = prepareFunctionView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80676a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78498b.m80672x(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80676a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361832(PrepareFunctionView prepareFunctionView, Continuation<? super C361832> continuation) {
            super(2, continuation);
            this.this$0 = prepareFunctionView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361832(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361832) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM4447c = C4579a.f4058a.m4447c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM4447c.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$3 */
    /* JADX INFO: compiled from: PrepareFunctionView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$3", m90122f = "PrepareFunctionView.kt", m90123i = {}, m90124l = {67}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C361843 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PrepareFunctionView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.function.PrepareFunctionView$addObserver$1$3$a */
        /* JADX INFO: compiled from: PrepareFunctionView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PrepareFunctionView f78499b;

            public a(PrepareFunctionView prepareFunctionView) {
                this.f78499b = prepareFunctionView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m80677a(boolean z11, Continuation<? super Unit> continuation) {
                this.f78499b.m80673y(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m80677a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C361843(PrepareFunctionView prepareFunctionView, Continuation<? super C361843> continuation) {
            super(2, continuation);
            this.this$0 = prepareFunctionView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361843(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C361843) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM4448d = C4579a.f4058a.m4448d();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM4448d.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepareFunctionView$addObserver$1(PrepareFunctionView prepareFunctionView, Continuation<? super PrepareFunctionView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = prepareFunctionView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PrepareFunctionView$addObserver$1 prepareFunctionView$addObserver$1 = new PrepareFunctionView$addObserver$1(this.this$0, continuation);
        prepareFunctionView$addObserver$1.L$0 = obj;
        return prepareFunctionView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PrepareFunctionView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361821(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361832(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C361843(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
