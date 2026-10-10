package com.trtc.uikit.livekit.component.networkInfo;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.api.live.AVStatistics;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkInfoView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1", m90122f = "NetworkInfoView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NetworkInfoView$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkInfoView this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$1 */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$1", m90122f = "NetworkInfoView.kt", m90123i = {}, m90124l = {99}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359381 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$1$a */
        /* JADX INFO: compiled from: NetworkInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoView f77904b;

            public a(NetworkInfoView networkInfoView) {
                this.f77904b = networkInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(NetworkQuality networkQuality, Continuation<? super Unit> continuation) {
                this.f77904b.m79790w(networkQuality);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359381(NetworkInfoView networkInfoView, Continuation<? super C359381> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359381(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359381) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<NetworkQuality> interfaceC41669nM79803e = this.this$0.f77894e.m79803e();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79803e.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$2 */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$2", m90122f = "NetworkInfoView.kt", m90123i = {}, m90124l = {105}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359392 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$2$a */
        /* JADX INFO: compiled from: NetworkInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoView f77905b;

            public a(NetworkInfoView networkInfoView) {
                this.f77905b = networkInfoView;
            }

            /* JADX INFO: renamed from: a */
            public final Object m79795a(boolean z11, Continuation<? super Unit> continuation) {
                this.f77905b.m79791x(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m79795a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359392(NetworkInfoView networkInfoView, Continuation<? super C359392> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359392(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359392) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41669n<Boolean> interfaceC41669nM79809k = this.this$0.f77894e.m79809k();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41669nM79809k.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$3 */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$3", m90122f = "NetworkInfoView.kt", m90123i = {}, m90124l = {111}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359403 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$3$a */
        /* JADX INFO: compiled from: NetworkInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoView f77906b;

            public a(NetworkInfoView networkInfoView) {
                this.f77906b = networkInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<AVStatistics> list, Continuation<? super Unit> continuation) {
                this.f77906b.f77893d.m79829m(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359403(NetworkInfoView networkInfoView, Continuation<? super C359403> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359403(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359403) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                LiveSeatStore.Companion companion = LiveSeatStore.INSTANCE;
                LiveInfo liveInfo = this.this$0.f77900k;
                if (liveInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                    liveInfo = null;
                }
                InterfaceC41678w<List<AVStatistics>> avStatistics = companion.create(liveInfo.getLiveID()).getLiveSeatState().getAvStatistics();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (avStatistics.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$4 */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$4", m90122f = "NetworkInfoView.kt", m90123i = {}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359414 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$4$a */
        /* JADX INFO: compiled from: NetworkInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoView f77907b;

            public a(NetworkInfoView networkInfoView) {
                this.f77907b = networkInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SeatInfo> list, Continuation<? super Unit> continuation) {
                this.f77907b.f77893d.m79828l(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359414(NetworkInfoView networkInfoView, Continuation<? super C359414> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359414(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359414) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                LiveSeatStore.Companion companion = LiveSeatStore.INSTANCE;
                LiveInfo liveInfo = this.this$0.f77900k;
                if (liveInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("liveInfo");
                    liveInfo = null;
                }
                InterfaceC41678w<List<SeatInfo>> seatList = companion.create(liveInfo.getLiveID()).getLiveSeatState().getSeatList();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (seatList.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$5 */
    /* JADX INFO: compiled from: NetworkInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$5", m90122f = "NetworkInfoView.kt", m90123i = {}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359425 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NetworkInfoView this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.networkInfo.NetworkInfoView$addObserver$1$5$a */
        /* JADX INFO: compiled from: NetworkInfoView.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ NetworkInfoView f77908b;

            public a(NetworkInfoView networkInfoView) {
                this.f77908b = networkInfoView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(NetworkInfo networkInfo, Continuation<? super Unit> continuation) {
                this.f77908b.f77893d.m79827k(networkInfo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359425(NetworkInfoView networkInfoView, Continuation<? super C359425> continuation) {
            super(2, continuation);
            this.this$0 = networkInfoView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359425(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359425) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<NetworkInfo> networkInfo = DeviceStore.INSTANCE.shared().getDeviceState().getNetworkInfo();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (networkInfo.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkInfoView$addObserver$1(NetworkInfoView networkInfoView, Continuation<? super NetworkInfoView$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = networkInfoView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkInfoView$addObserver$1 networkInfoView$addObserver$1 = new NetworkInfoView$addObserver$1(this.this$0, continuation);
        networkInfoView$addObserver$1.L$0 = obj;
        return networkInfoView$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NetworkInfoView$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359381(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359392(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359403(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359414(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359425(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
