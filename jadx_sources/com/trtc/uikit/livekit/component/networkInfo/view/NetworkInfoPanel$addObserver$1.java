package com.trtc.uikit.livekit.component.networkInfo.view;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.trtc.uikit.livekit.component.networkInfo.store.NetworkInfoState;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.tensorflow.lite.schema.BuiltinOperator;
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

/* JADX INFO: compiled from: NetworkInfoPanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NetworkInfoPanel$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkInfoPanel this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$1 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$1", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {103}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359501 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$1$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77974b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77974b = networkInfoPanel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(NetworkInfoState.Status status, Continuation<? super Unit> continuation) {
                this.f77974b.m79887g0(status);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359501(NetworkInfoPanel networkInfoPanel, Continuation<? super C359501> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359501(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359501) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<NetworkInfoState.Status> interfaceC41669nM79807i = this.this$0.f77963p.m79807i();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79807i.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$10 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$10", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_MIN}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C3595110 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$10$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77975b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77975b = networkInfoPanel;
            }

            /* JADX INFO: renamed from: a */
            public final Object m79891a(boolean z11, Continuation<? super Unit> continuation) {
                this.f77975b.m79884d0(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m79891a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3595110(NetworkInfoPanel networkInfoPanel, Continuation<? super C3595110> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C3595110(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C3595110) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM79811m = this.this$0.f77963p.m79811m();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79811m.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$2 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$2", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {109}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359522 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$2$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77976b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77976b = networkInfoPanel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                this.f77976b.m79886f0(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359522(NetworkInfoPanel networkInfoPanel, Continuation<? super C359522> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359522(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359522) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<String> interfaceC41669nM79804f = this.this$0.f77963p.m79804f();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79804f.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$3 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$3", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {115}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359533 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$3$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77977b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77977b = networkInfoPanel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(NetworkInfoState.Status status, Continuation<? super Unit> continuation) {
                this.f77977b.m79880Z(status);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359533(NetworkInfoPanel networkInfoPanel, Continuation<? super C359533> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359533(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359533) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<NetworkInfoState.Status> interfaceC41669nM79801c = this.this$0.f77963p.m79801c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79801c.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$4 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$4", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {121}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359544 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$4$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77978b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77978b = networkInfoPanel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(TUIRoomDefine.AudioQuality audioQuality, Continuation<? super Unit> continuation) {
                this.f77978b.m79879Y(audioQuality);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359544(NetworkInfoPanel networkInfoPanel, Continuation<? super C359544> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359544(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359544) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<TUIRoomDefine.AudioQuality> interfaceC41669nM79800b = this.this$0.f77963p.m79800b();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79800b.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$5 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$5", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {127}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359555 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$5$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77979b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77979b = networkInfoPanel;
            }

            /* JADX INFO: renamed from: a */
            public final Object m79895a(int i11, Continuation<? super Unit> continuation) {
                this.f77979b.m79888h0(Boxing.boxInt(i11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m79895a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359555(NetworkInfoPanel networkInfoPanel, Continuation<? super C359555> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359555(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359555) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Integer> interfaceC41669nM79799a = this.this$0.f77963p.m79799a();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79799a.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$6 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$6", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {133}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359566 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$6$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77980b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77980b = networkInfoPanel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(NetworkQuality networkQuality, Continuation<? super Unit> continuation) {
                this.f77980b.m79882b0(networkQuality);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359566(NetworkInfoPanel networkInfoPanel, Continuation<? super C359566> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359566(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359566) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<NetworkQuality> interfaceC41669nM79803e = this.this$0.f77963p.m79803e();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79803e.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$7 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$7", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {139}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359577 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$7$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77981b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77981b = networkInfoPanel;
            }

            /* JADX INFO: renamed from: a */
            public final Object m79897a(int i11, Continuation<? super Unit> continuation) {
                this.f77981b.m79883c0(Boxing.boxInt(i11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m79897a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359577(NetworkInfoPanel networkInfoPanel, Continuation<? super C359577> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359577(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359577) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Integer> interfaceC41669nM79805g = this.this$0.f77963p.m79805g();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79805g.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$8 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$8", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {145}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359588 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$8$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77982b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77982b = networkInfoPanel;
            }

            /* JADX INFO: renamed from: a */
            public final Object m79898a(int i11, Continuation<? super Unit> continuation) {
                this.f77982b.m79885e0(Boxing.boxInt(i11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m79898a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359588(NetworkInfoPanel networkInfoPanel, Continuation<? super C359588> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359588(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359588) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Integer> interfaceC41669nM79806h = this.this$0.f77963p.m79806h();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79806h.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$9 */
    /* JADX INFO: compiled from: NetworkInfoPanel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$9", m90122f = "NetworkInfoPanel.kt", m90123i = {}, m90124l = {151}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359599 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoPanel this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.view.NetworkInfoPanel$addObserver$1$9$a */
        /* JADX INFO: compiled from: NetworkInfoPanel.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoPanel f77983b;

            public a(NetworkInfoPanel networkInfoPanel) {
                this.f77983b = networkInfoPanel;
            }

            /* JADX INFO: renamed from: a */
            public final Object m79899a(int i11, Continuation<? super Unit> continuation) {
                this.f77983b.m79881a0(Boxing.boxInt(i11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m79899a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359599(NetworkInfoPanel networkInfoPanel, Continuation<? super C359599> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoPanel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359599(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359599) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Integer> interfaceC41669nM79802d = this.this$0.f77963p.m79802d();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79802d.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInfoPanel$addObserver$1(NetworkInfoPanel networkInfoPanel, Continuation<? super NetworkInfoPanel$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = networkInfoPanel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkInfoPanel$addObserver$1 networkInfoPanel$addObserver$1 = new NetworkInfoPanel$addObserver$1(this.this$0, continuation);
        networkInfoPanel$addObserver$1.L$0 = obj;
        return networkInfoPanel$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NetworkInfoPanel$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359501(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359522(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359533(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359544(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359555(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359566(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359577(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359588(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359599(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C3595110(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
