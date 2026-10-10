package com.trtc.uikit.livekit.features.endstatistics;

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
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1", m90122f = "AnchorEndStatisticsView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AnchorEndStatisticsView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchorEndStatisticsView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$1 */
    /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$1", m90122f = "AnchorEndStatisticsView.kt", m90123i = {}, m90124l = {85}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363601 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorEndStatisticsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$1$a */
        /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorEndStatisticsView f79009b;

            public a(AnchorEndStatisticsView anchorEndStatisticsView) {
                this.f79009b = anchorEndStatisticsView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81334a(long j11, Continuation<? super Unit> continuation) {
                this.f79009b.m81330q(j11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81334a(((Number) obj).longValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363601(AnchorEndStatisticsView anchorEndStatisticsView, Continuation<? super C363601> continuation) {
            super(2, continuation);
            this.this$0 = anchorEndStatisticsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363601(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363601) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Long> interfaceC41669nM85501d = this.this$0.f79000d.m85501d();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM85501d.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$2 */
    /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$2", m90122f = "AnchorEndStatisticsView.kt", m90123i = {}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363612 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorEndStatisticsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$2$a */
        /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorEndStatisticsView f79010b;

            public a(AnchorEndStatisticsView anchorEndStatisticsView) {
                this.f79010b = anchorEndStatisticsView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81335a(long j11, Continuation<? super Unit> continuation) {
                this.f79010b.m81331r(j11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81335a(((Number) obj).longValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363612(AnchorEndStatisticsView anchorEndStatisticsView, Continuation<? super C363612> continuation) {
            super(2, continuation);
            this.this$0 = anchorEndStatisticsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363612(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363612) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Long> interfaceC41669nM85502e = this.this$0.f79000d.m85502e();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM85502e.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$3 */
    /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$3", m90122f = "AnchorEndStatisticsView.kt", m90123i = {}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363623 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorEndStatisticsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$3$a */
        /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorEndStatisticsView f79011b;

            public a(AnchorEndStatisticsView anchorEndStatisticsView) {
                this.f79011b = anchorEndStatisticsView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81336a(long j11, Continuation<? super Unit> continuation) {
                this.f79011b.m81332s(j11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81336a(((Number) obj).longValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363623(AnchorEndStatisticsView anchorEndStatisticsView, Continuation<? super C363623> continuation) {
            super(2, continuation);
            this.this$0 = anchorEndStatisticsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363623(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363623) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Long> interfaceC41669nM85503f = this.this$0.f79000d.m85503f();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM85503f.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$4 */
    /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$4", m90122f = "AnchorEndStatisticsView.kt", m90123i = {}, m90124l = {103}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363634 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorEndStatisticsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$4$a */
        /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorEndStatisticsView f79012b;

            public a(AnchorEndStatisticsView anchorEndStatisticsView) {
                this.f79012b = anchorEndStatisticsView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81337a(long j11, Continuation<? super Unit> continuation) {
                this.f79012b.m81329p(j11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81337a(((Number) obj).longValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363634(AnchorEndStatisticsView anchorEndStatisticsView, Continuation<? super C363634> continuation) {
            super(2, continuation);
            this.this$0 = anchorEndStatisticsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363634(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363634) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Long> interfaceC41669nM85500c = this.this$0.f79000d.m85500c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM85500c.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$5 */
    /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$5", m90122f = "AnchorEndStatisticsView.kt", m90123i = {}, m90124l = {109}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363645 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorEndStatisticsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$5$a */
        /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorEndStatisticsView f79013b;

            public a(AnchorEndStatisticsView anchorEndStatisticsView) {
                this.f79013b = anchorEndStatisticsView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81338a(long j11, Continuation<? super Unit> continuation) {
                this.f79013b.m81327n(j11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81338a(((Number) obj).longValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363645(AnchorEndStatisticsView anchorEndStatisticsView, Continuation<? super C363645> continuation) {
            super(2, continuation);
            this.this$0 = anchorEndStatisticsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363645(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363645) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Long> interfaceC41669nM85498a = this.this$0.f79000d.m85498a();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM85498a.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$6 */
    /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$6", m90122f = "AnchorEndStatisticsView.kt", m90123i = {}, m90124l = {115}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C363656 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AnchorEndStatisticsView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.endstatistics.AnchorEndStatisticsView$addObserver$1$6$a */
        /* JADX INFO: compiled from: AnchorEndStatisticsView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AnchorEndStatisticsView f79014b;

            public a(AnchorEndStatisticsView anchorEndStatisticsView) {
                this.f79014b = anchorEndStatisticsView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m81339a(long j11, Continuation<? super Unit> continuation) {
                this.f79014b.m81328o(j11);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m81339a(((Number) obj).longValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C363656(AnchorEndStatisticsView anchorEndStatisticsView, Continuation<? super C363656> continuation) {
            super(2, continuation);
            this.this$0 = anchorEndStatisticsView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C363656(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C363656) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Long> interfaceC41669nM85499b = this.this$0.f79000d.m85499b();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM85499b.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorEndStatisticsView$addObserver$1(AnchorEndStatisticsView anchorEndStatisticsView, Continuation<? super AnchorEndStatisticsView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = anchorEndStatisticsView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnchorEndStatisticsView$addObserver$1 anchorEndStatisticsView$addObserver$1 = new AnchorEndStatisticsView$addObserver$1(this.this$0, continuation);
        anchorEndStatisticsView$addObserver$1.L$0 = obj;
        return anchorEndStatisticsView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AnchorEndStatisticsView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363601(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363612(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363623(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363634(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363645(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C363656(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
