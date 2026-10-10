package com.trtc.uikit.livekit.component.dashboard;

import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import io.trtc.tuikit.atomicxcore.api.live.AVStatistics;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import java.util.List;
import kd0.C41009a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StreamDashboardDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$addObserver$1", m90122f = "StreamDashboardDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StreamDashboardDialog$addObserver$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StreamDashboardDialog this$0;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$addObserver$1$1 */
    /* JADX INFO: compiled from: StreamDashboardDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$addObserver$1$1", m90122f = "StreamDashboardDialog.kt", m90123i = {}, m90124l = {141}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C359061 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ StreamDashboardDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$addObserver$1$1$a */
        /* JADX INFO: compiled from: StreamDashboardDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ StreamDashboardDialog f77721b;

            public a(StreamDashboardDialog streamDashboardDialog) {
                this.f77721b = streamDashboardDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(NetworkInfo networkInfo, Continuation<? super Unit> continuation) {
                this.f77721b.m79613N(networkInfo.getDelay(), networkInfo.getUpLoss(), networkInfo.getDownLoss());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359061(StreamDashboardDialog streamDashboardDialog, Continuation<? super C359061> continuation) {
            super(2, continuation);
            this.this$0 = streamDashboardDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359061(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359061) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$addObserver$1$2 */
    /* JADX INFO: compiled from: StreamDashboardDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$addObserver$1$2", m90122f = "StreamDashboardDialog.kt", m90123i = {0}, m90124l = {BuiltinOperator.RANDOM_UNIFORM}, m90125m = "invokeSuspend", m90126n = {"liveSeatStore"}, m90127s = {"L$0"})
    public static final class C359072 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ StreamDashboardDialog this$0;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog$addObserver$1$2$a */
        /* JADX INFO: compiled from: StreamDashboardDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ StreamDashboardDialog f77722b;

            public a(StreamDashboardDialog streamDashboardDialog) {
                this.f77722b = streamDashboardDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<AVStatistics> list, Continuation<? super Unit> continuation) {
                C41009a c41009a = this.f77722b.f77714t;
                if (c41009a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    c41009a = null;
                }
                c41009a.m89895i(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C359072(StreamDashboardDialog streamDashboardDialog, Continuation<? super C359072> continuation) {
            super(2, continuation);
            this.this$0 = streamDashboardDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C359072(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C359072) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                LiveSeatStore liveSeatStoreCreate = LiveSeatStore.INSTANCE.create(this.this$0.getF77707m());
                InterfaceC41678w<List<AVStatistics>> avStatistics = liveSeatStoreCreate.getLiveSeatState().getAvStatistics();
                a aVar = new a(this.this$0);
                this.L$0 = SpillingKt.nullOutSpilledVariable(liveSeatStoreCreate);
                this.label = 1;
                if (avStatistics.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamDashboardDialog$addObserver$1(StreamDashboardDialog streamDashboardDialog, Continuation<? super StreamDashboardDialog$addObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = streamDashboardDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StreamDashboardDialog$addObserver$1 streamDashboardDialog$addObserver$1 = new StreamDashboardDialog$addObserver$1(this.this$0, continuation);
        streamDashboardDialog$addObserver$1.L$0 = obj;
        return streamDashboardDialog$addObserver$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((StreamDashboardDialog$addObserver$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359061(this.this$0, null), 3, null);
        C41696j.m91104d(interfaceC41709m0, null, null, new C359072(this.this$0, null), 3, null);
        return Unit.INSTANCE;
    }
}
