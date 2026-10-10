package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveKickedOutReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListState;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.List;
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
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "eventEmitter", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "eventListener", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveListDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveListDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,105:1\n35#2,2:106\n35#2,2:108\n*S KotlinDebug\n*F\n+ 1 LiveListDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher\n*L\n90#1:106,2\n98#1:108,2\n*E\n"})
public final class LiveListDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    @Nullable
    private LiveListListener eventListener;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher$startObserving$1", m90122f = "LiveListDispatcher.kt", m90123i = {}, m90124l = {27}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394531 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394531(Continuation<? super C394531> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveListDispatcher.this.new C394531(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394531) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<LiveInfo>> liveList = LiveListStore.INSTANCE.shared().getLiveState().getLiveList();
                final LiveListDispatcher liveListDispatcher = LiveListDispatcher.this;
                InterfaceC41635f<? super List<LiveInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<LiveInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<LiveInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(liveListDispatcher.baseKey, null, null, "liveList", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        liveListDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("liveList", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (liveList.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher$startObserving$2", m90122f = "LiveListDispatcher.kt", m90123i = {}, m90124l = {35}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394542 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394542(Continuation<? super C394542> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveListDispatcher.this.new C394542(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394542) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<String> liveListCursor = LiveListStore.INSTANCE.shared().getLiveState().getLiveListCursor();
                final LiveListDispatcher liveListDispatcher = LiveListDispatcher.this;
                InterfaceC41635f<? super String> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                        liveListDispatcher.dispatchEvent(HybridListenerKey.copy$default(liveListDispatcher.baseKey, null, null, "liveListCursor", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("liveListCursor", str)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (liveListCursor.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher$startObserving$3 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher$startObserving$3", m90122f = "LiveListDispatcher.kt", m90123i = {}, m90124l = {43}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394553 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394553(Continuation<? super C394553> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveListDispatcher.this.new C394553(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394553) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<LiveInfo> currentLive = LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive();
                final LiveListDispatcher liveListDispatcher = LiveListDispatcher.this;
                InterfaceC41635f<? super LiveInfo> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher.startObserving.3.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((LiveInfo) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull LiveInfo liveInfo, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(liveListDispatcher.baseKey, null, null, "currentLive", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(liveInfo);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        liveListDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("currentLive", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentLive.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveListDispatcher(@NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.baseKey = new HybridListenerKey("state", "LiveListStore", "", null, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveListState liveState = LiveListStore.INSTANCE.shared().getLiveState();
        String name = key.getName();
        int iHashCode = name.hashCode();
        if (iHashCode == -658532448) {
            if (name.equals("liveListCursor")) {
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("liveListCursor", liveState.getLiveListCursor().getValue())));
                return;
            }
            return;
        }
        if (iHashCode == 600997381) {
            if (name.equals("currentLive")) {
                String json = JsonParserKt.getSharedGson().toJson(liveState.getCurrentLive().getValue());
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("currentLive", json)));
                return;
            }
            return;
        }
        if (iHashCode == 1417445290 && name.equals("liveList")) {
            String json2 = JsonParserKt.getSharedGson().toJson(liveState.getLiveList().getValue());
            Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("liveList", json2)));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394531(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394542(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394553(null), 2, null);
        LiveListListener liveListListener = new LiveListListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher.startObserving.4
            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
            public void onKickedOutOfLive(@NotNull String liveID, @NotNull LiveKickedOutReason reason, @NotNull String message) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                Intrinsics.checkNotNullParameter(reason, "reason");
                Intrinsics.checkNotNullParameter(message, "message");
                LiveListDispatcher.this.dispatchEvent(HybridListenerKey.copy$default(LiveListDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onKickedOutOfLive", null, null, 26, null), MapsKt.mapOf(TuplesKt.m90091to("liveID", liveID), TuplesKt.m90091to("reason", Integer.valueOf(reason.getValue())), TuplesKt.m90091to("message", message)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
            public void onLiveEnded(@NotNull String liveID, @NotNull LiveEndedReason reason, @NotNull String message) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                Intrinsics.checkNotNullParameter(reason, "reason");
                Intrinsics.checkNotNullParameter(message, "message");
                LiveListDispatcher.this.dispatchEvent(HybridListenerKey.copy$default(LiveListDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onLiveEnded", null, null, 26, null), MapsKt.mapOf(TuplesKt.m90091to("liveID", liveID), TuplesKt.m90091to("reason", Integer.valueOf(reason.getValue())), TuplesKt.m90091to("message", message)));
            }
        };
        this.eventListener = liveListListener;
        LiveListStore.INSTANCE.shared().addLiveListListener(liveListListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        getKeys().clear();
        LiveListListener liveListListener = this.eventListener;
        if (liveListListener != null) {
            LiveListStore.INSTANCE.shared().removeLiveListListener(liveListListener);
            this.eventListener = null;
        }
    }
}
