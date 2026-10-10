package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceState;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveAudienceDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "liveID", "", "eventEmitter", "Lkotlin/Function2;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "eventListener", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveAudienceDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveAudienceDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveAudienceDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,107:1\n35#2,2:108\n*S KotlinDebug\n*F\n+ 1 LiveAudienceDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveAudienceDispatcher\n*L\n96#1:108,2\n*E\n"})
public final class LiveAudienceDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    @Nullable
    private LiveAudienceListener eventListener;

    @NotNull
    private final String liveID;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher$startObserving$1", m90122f = "LiveAudienceDispatcher.kt", m90123i = {}, m90124l = {27}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394501 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394501(Continuation<? super C394501> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveAudienceDispatcher.this.new C394501(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394501) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<LiveUserInfo>> audienceList = LiveAudienceStore.INSTANCE.create(LiveAudienceDispatcher.this.liveID).getLiveAudienceState().getAudienceList();
                final LiveAudienceDispatcher liveAudienceDispatcher = LiveAudienceDispatcher.this;
                InterfaceC41635f<? super List<LiveUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<LiveUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<LiveUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(liveAudienceDispatcher.baseKey, null, null, "audienceList", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        liveAudienceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("audienceList", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (audienceList.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher$startObserving$2", m90122f = "LiveAudienceDispatcher.kt", m90123i = {}, m90124l = {35}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394512 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394512(Continuation<? super C394512> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveAudienceDispatcher.this.new C394512(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394512) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Integer> audienceCount = LiveAudienceStore.INSTANCE.create(LiveAudienceDispatcher.this.liveID).getLiveAudienceState().getAudienceCount();
                final LiveAudienceDispatcher liveAudienceDispatcher = LiveAudienceDispatcher.this;
                InterfaceC41635f<? super Integer> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i12, @NotNull Continuation<? super Unit> continuation) {
                        liveAudienceDispatcher.dispatchEvent(HybridListenerKey.copy$default(liveAudienceDispatcher.baseKey, null, null, "audienceCount", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("audienceCount", Boxing.boxInt(i12))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (audienceCount.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAudienceDispatcher(@NotNull String liveID, @NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.liveID = liveID;
        this.baseKey = new HybridListenerKey("state", "LiveAudienceStore", "", liveID, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveAudienceState liveAudienceState = LiveAudienceStore.INSTANCE.create(this.liveID).getLiveAudienceState();
        String name = key.getName();
        if (!Intrinsics.areEqual(name, "audienceList")) {
            if (Intrinsics.areEqual(name, "audienceCount")) {
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("audienceCount", liveAudienceState.getAudienceCount().getValue())));
            }
        } else {
            String json = JsonParserKt.getSharedGson().toJson(liveAudienceState.getAudienceList().getValue());
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("audienceList", json)));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        LiveAudienceListener liveAudienceListener = this.eventListener;
        if (liveAudienceListener != null) {
            LiveAudienceStore.INSTANCE.create(this.liveID).removeLiveAudienceListener(liveAudienceListener);
            this.eventListener = null;
        }
        getKeys().clear();
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394501(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394512(null), 2, null);
        LiveAudienceListener liveAudienceListener = new LiveAudienceListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher.startObserving.3
            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
            public void onAudienceJoined(@NotNull LiveUserInfo audience) {
                Intrinsics.checkNotNullParameter(audience, "audience");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(LiveAudienceDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onAudienceJoined", null, null, 26, null);
                String json = JsonParserKt.getSharedGson().toJson(audience);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                LiveAudienceDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("audience", json)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
            public void onAudienceLeft(@NotNull LiveUserInfo audience) {
                Intrinsics.checkNotNullParameter(audience, "audience");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(LiveAudienceDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onAudienceLeft", null, null, 26, null);
                String json = JsonParserKt.getSharedGson().toJson(audience);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                LiveAudienceDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("audience", json)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
            public void onAudienceMessageDisabled(@NotNull LiveUserInfo audience, boolean isDisable) {
                Intrinsics.checkNotNullParameter(audience, "audience");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(LiveAudienceDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onAudienceMessageDisabled", null, null, 26, null);
                String json = JsonParserKt.getSharedGson().toJson(audience);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                LiveAudienceDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("audience", json), TuplesKt.m90091to("isDisable", Boolean.valueOf(isDisable))));
            }
        };
        this.eventListener = liveAudienceListener;
        LiveAudienceStore.INSTANCE.create(this.liveID).addLiveAudienceListener(liveAudienceListener);
    }
}
