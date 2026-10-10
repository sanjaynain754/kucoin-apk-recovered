package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.trtc.tuikit.atomicxcore.api.live.DeviceControlPolicy;
import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatState;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "liveID", "", "eventEmitter", "Lkotlin/Function2;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "eventListener", "Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatListener;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveSeatDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveSeatDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,120:1\n35#2,2:121\n35#2,2:123\n35#2,2:125\n*S KotlinDebug\n*F\n+ 1 LiveSeatDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher\n*L\n105#1:121,2\n109#1:123,2\n113#1:125,2\n*E\n"})
public final class LiveSeatDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    @Nullable
    private LiveSeatListener eventListener;

    @NotNull
    private final String liveID;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher$startObserving$1", m90122f = "LiveSeatDispatcher.kt", m90123i = {}, m90124l = {27}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394571 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394571(Continuation<? super C394571> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveSeatDispatcher.this.new C394571(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394571) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<List<SeatInfo>> seatList = LiveSeatStore.INSTANCE.create(LiveSeatDispatcher.this.liveID).getLiveSeatState().getSeatList();
                final LiveSeatDispatcher liveSeatDispatcher = LiveSeatDispatcher.this;
                InterfaceC41635f<? super List<SeatInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<SeatInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<SeatInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(liveSeatDispatcher.baseKey, null, null, "seatList", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        liveSeatDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("seatList", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (seatList.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher$startObserving$2", m90122f = "LiveSeatDispatcher.kt", m90123i = {}, m90124l = {35}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394582 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394582(Continuation<? super C394582> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveSeatDispatcher.this.new C394582(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394582) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<LiveCanvas> canvas = LiveSeatStore.INSTANCE.create(LiveSeatDispatcher.this.liveID).getLiveSeatState().getCanvas();
                final LiveSeatDispatcher liveSeatDispatcher = LiveSeatDispatcher.this;
                InterfaceC41635f<? super LiveCanvas> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((LiveCanvas) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull LiveCanvas liveCanvas, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(liveSeatDispatcher.baseKey, null, null, "canvas", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(liveCanvas);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        liveSeatDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("canvas", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (canvas.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher$startObserving$3 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher$startObserving$3", m90122f = "LiveSeatDispatcher.kt", m90123i = {}, m90124l = {43}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394593 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394593(Continuation<? super C394593> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveSeatDispatcher.this.new C394593(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394593) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<Map<String, Integer>> speakingUsers = LiveSeatStore.INSTANCE.create(LiveSeatDispatcher.this.liveID).getLiveSeatState().getSpeakingUsers();
                final LiveSeatDispatcher liveSeatDispatcher = LiveSeatDispatcher.this;
                InterfaceC41635f<? super Map<String, Integer>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher.startObserving.3.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Map<String, Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull Map<String, Integer> map, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(liveSeatDispatcher.baseKey, null, null, "speakingUsers", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(map);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        liveSeatDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("speakingUsers", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (speakingUsers.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSeatDispatcher(@NotNull String liveID, @NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.liveID = liveID;
        this.baseKey = new HybridListenerKey("state", "LiveSeatStore", "", liveID, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSeatState liveSeatState = LiveSeatStore.INSTANCE.create(this.liveID).getLiveSeatState();
        String name = key.getName();
        int iHashCode = name.hashCode();
        if (iHashCode == -1367706280) {
            if (name.equals("canvas")) {
                String json = JsonParserKt.getSharedGson().toJson(liveSeatState.getCanvas().getValue());
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("canvas", json)));
                return;
            }
            return;
        }
        if (iHashCode == -735268584) {
            if (name.equals("speakingUsers")) {
                String json2 = JsonParserKt.getSharedGson().toJson(liveSeatState.getSpeakingUsers().getValue());
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("speakingUsers", json2)));
                return;
            }
            return;
        }
        if (iHashCode == 889808963 && name.equals("seatList")) {
            String json3 = JsonParserKt.getSharedGson().toJson(liveSeatState.getSeatList().getValue());
            Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("seatList", json3)));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        LiveSeatListener liveSeatListener = this.eventListener;
        if (liveSeatListener != null) {
            LiveSeatStore.INSTANCE.create(this.liveID).removeLiveSeatEventListener(liveSeatListener);
            this.eventListener = null;
        }
        getKeys().clear();
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394571(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394582(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394593(null), 2, null);
        LiveSeatListener liveSeatListener = new LiveSeatListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher.startObserving.4
            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
            public void onLocalCameraClosedByAdmin() {
                LiveSeatDispatcher.this.dispatchEvent(HybridListenerKey.copy$default(LiveSeatDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onLocalCameraClosedByAdmin", null, null, 26, null), MapsKt.emptyMap());
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
            public void onLocalCameraOpenedByAdmin(@NotNull DeviceControlPolicy policy) {
                Intrinsics.checkNotNullParameter(policy, "policy");
                LiveSeatDispatcher.this.dispatchEvent(HybridListenerKey.copy$default(LiveSeatDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onLocalCameraOpenedByAdmin", null, null, 26, null), MapsKt.mapOf(TuplesKt.m90091to("policy", Integer.valueOf(policy.getValue()))));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
            public void onLocalMicrophoneClosedByAdmin() {
                LiveSeatDispatcher.this.dispatchEvent(HybridListenerKey.copy$default(LiveSeatDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onLocalMicrophoneClosedByAdmin", null, null, 26, null), MapsKt.emptyMap());
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener
            public void onLocalMicrophoneOpenedByAdmin(@NotNull DeviceControlPolicy policy) {
                Intrinsics.checkNotNullParameter(policy, "policy");
                LiveSeatDispatcher.this.dispatchEvent(HybridListenerKey.copy$default(LiveSeatDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onLocalMicrophoneOpenedByAdmin", null, null, 26, null), MapsKt.mapOf(TuplesKt.m90091to("policy", Integer.valueOf(policy.getValue()))));
            }
        };
        this.eventListener = liveSeatListener;
        LiveSeatStore.INSTANCE.create(this.liveID).addLiveSeatEventListener(liveSeatListener);
    }
}
