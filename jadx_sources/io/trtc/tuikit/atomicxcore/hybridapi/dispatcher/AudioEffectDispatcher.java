package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import io.trtc.tuikit.atomicxcore.api.device.AudioChangerType;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectState;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioReverbType;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
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

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "eventEmitter", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class AudioEffectDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$1", m90122f = "AudioEffectDispatcher.kt", m90123i = {}, m90124l = {21}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394101 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394101(Continuation<? super C394101> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioEffectDispatcher.this.new C394101(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394101) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<AudioChangerType> audioChangerType = AudioEffectStore.INSTANCE.shared().getAudioEffectState().getAudioChangerType();
                final AudioEffectDispatcher audioEffectDispatcher = AudioEffectDispatcher.this;
                InterfaceC41635f<? super AudioChangerType> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AudioChangerType) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull AudioChangerType audioChangerType2, @NotNull Continuation<? super Unit> continuation) {
                        audioEffectDispatcher.dispatchEvent(HybridListenerKey.copy$default(audioEffectDispatcher.baseKey, null, null, "audioChangerType", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("audioChangerType", Boxing.boxInt(audioChangerType2.getValue()))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (audioChangerType.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$2", m90122f = "AudioEffectDispatcher.kt", m90123i = {}, m90124l = {29}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394112 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394112(Continuation<? super C394112> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioEffectDispatcher.this.new C394112(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394112) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<AudioReverbType> audioReverbType = AudioEffectStore.INSTANCE.shared().getAudioEffectState().getAudioReverbType();
                final AudioEffectDispatcher audioEffectDispatcher = AudioEffectDispatcher.this;
                InterfaceC41635f<? super AudioReverbType> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AudioReverbType) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull AudioReverbType audioReverbType2, @NotNull Continuation<? super Unit> continuation) {
                        audioEffectDispatcher.dispatchEvent(HybridListenerKey.copy$default(audioEffectDispatcher.baseKey, null, null, "audioReverbType", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("audioReverbType", Boxing.boxInt(audioReverbType2.getValue()))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (audioReverbType.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$3 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$3", m90122f = "AudioEffectDispatcher.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394123 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394123(Continuation<? super C394123> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioEffectDispatcher.this.new C394123(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394123) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Boolean> interfaceC41678wIsEarMonitorOpened = AudioEffectStore.INSTANCE.shared().getAudioEffectState().isEarMonitorOpened();
                final AudioEffectDispatcher audioEffectDispatcher = AudioEffectDispatcher.this;
                InterfaceC41635f<? super Boolean> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher.startObserving.3.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z11, @NotNull Continuation<? super Unit> continuation) {
                        audioEffectDispatcher.dispatchEvent(HybridListenerKey.copy$default(audioEffectDispatcher.baseKey, null, null, "isEarMonitorOpened", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("isEarMonitorOpened", Boxing.boxBoolean(z11))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interfaceC41678wIsEarMonitorOpened.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$4 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher$startObserving$4", m90122f = "AudioEffectDispatcher.kt", m90123i = {}, m90124l = {45}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394134 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394134(Continuation<? super C394134> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AudioEffectDispatcher.this.new C394134(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394134) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Integer> earMonitorVolume = AudioEffectStore.INSTANCE.shared().getAudioEffectState().getEarMonitorVolume();
                final AudioEffectDispatcher audioEffectDispatcher = AudioEffectDispatcher.this;
                InterfaceC41635f<? super Integer> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher.startObserving.4.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i12, @NotNull Continuation<? super Unit> continuation) {
                        audioEffectDispatcher.dispatchEvent(HybridListenerKey.copy$default(audioEffectDispatcher.baseKey, null, null, "earMonitorVolume", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("earMonitorVolume", Boxing.boxInt(i12))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (earMonitorVolume.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEffectDispatcher(@NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.baseKey = new HybridListenerKey("state", "AudioEffectStore", "", null, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        AudioEffectState audioEffectState = AudioEffectStore.INSTANCE.shared().getAudioEffectState();
        String name = key.getName();
        int iHashCode = name.hashCode();
        if (iHashCode == -561772553) {
            if (name.equals("isEarMonitorOpened")) {
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("isEarMonitorOpened", audioEffectState.isEarMonitorOpened().getValue())));
            }
        } else if (iHashCode == -272785562) {
            if (name.equals("audioChangerType")) {
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("audioChangerType", Integer.valueOf(audioEffectState.getAudioChangerType().getValue().getValue()))));
            }
        } else if (iHashCode == 1082288478) {
            if (name.equals("earMonitorVolume")) {
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("earMonitorVolume", audioEffectState.getEarMonitorVolume().getValue())));
            }
        } else if (iHashCode == 1878055074 && name.equals("audioReverbType")) {
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("audioReverbType", Integer.valueOf(audioEffectState.getAudioReverbType().getValue().getValue()))));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394101(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394112(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394123(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394134(null), 2, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        getKeys().clear();
    }
}
