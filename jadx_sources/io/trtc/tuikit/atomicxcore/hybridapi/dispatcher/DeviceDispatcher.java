package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import io.trtc.tuikit.atomicxcore.api.device.AudioRoute;
import io.trtc.tuikit.atomicxcore.api.device.DeviceError;
import io.trtc.tuikit.atomicxcore.api.device.DeviceState;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.LinkedHashMap;
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
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "eventEmitter", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDeviceDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,203:1\n35#2,2:204\n*S KotlinDebug\n*F\n+ 1 DeviceDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher\n*L\n196#1:204,2\n*E\n"})
public final class DeviceDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$1", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {22}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394331 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394331(Continuation<? super C394331> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394331(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394331) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<DeviceStatus> microphoneStatus = DeviceStore.INSTANCE.shared().getDeviceState().getMicrophoneStatus();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super DeviceStatus> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DeviceStatus) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull DeviceStatus deviceStatus, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "microphoneStatus", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("microphoneStatus", Boxing.boxInt(deviceStatus.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (microphoneStatus.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$10 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$10", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {103}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C3943410 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C3943410(Continuation<? super C3943410> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C3943410(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C3943410) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<VideoQuality> localVideoQuality = DeviceStore.INSTANCE.shared().getDeviceState().getLocalVideoQuality();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super VideoQuality> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.10.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((VideoQuality) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull VideoQuality videoQuality, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "localVideoQuality", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("localVideoQuality", Boxing.boxInt(videoQuality.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (localVideoQuality.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$11 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$11", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {112}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C3943511 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C3943511(Continuation<? super C3943511> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C3943511(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C3943511) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<AudioRoute> currentAudioRoute = DeviceStore.INSTANCE.shared().getDeviceState().getCurrentAudioRoute();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super AudioRoute> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.11.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AudioRoute) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull AudioRoute audioRoute, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "currentAudioRoute", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("currentAudioRoute", Boxing.boxInt(audioRoute.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentAudioRoute.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$12 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$12", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {121}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C3943612 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C3943612(Continuation<? super C3943612> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C3943612(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C3943612) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<DeviceStatus> screenStatus = DeviceStore.INSTANCE.shared().getDeviceState().getScreenStatus();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super DeviceStatus> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.12.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DeviceStatus) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull DeviceStatus deviceStatus, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "screenStatus", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("screenStatus", Boxing.boxInt(deviceStatus.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (screenStatus.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$13 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$13", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {130}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C3943713 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C3943713(Continuation<? super C3943713> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C3943713(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C3943713) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<NetworkInfo> networkInfo = DeviceStore.INSTANCE.shared().getDeviceState().getNetworkInfo();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super NetworkInfo> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.13.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((NetworkInfo) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull NetworkInfo networkInfo2, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "networkInfo", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String json = JsonParserKt.getSharedGson().toJson(networkInfo2);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        linkedHashMap.put("networkInfo", json);
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (networkInfo.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$2", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {31}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394382 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394382(Continuation<? super C394382> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394382(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394382) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<DeviceError> microphoneLastError = DeviceStore.INSTANCE.shared().getDeviceState().getMicrophoneLastError();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super DeviceError> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DeviceError) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull DeviceError deviceError, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "microphoneLastError", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("microphoneLastError", Boxing.boxInt(deviceError.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (microphoneLastError.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$3 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$3", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {40}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394393 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394393(Continuation<? super C394393> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394393(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394393) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Integer> captureVolume = DeviceStore.INSTANCE.shared().getDeviceState().getCaptureVolume();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super Integer> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.3.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i12, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "captureVolume", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("captureVolume", Boxing.boxInt(i12));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (captureVolume.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$4 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$4", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {49}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394404 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394404(Continuation<? super C394404> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394404(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394404) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Integer> currentMicVolume = DeviceStore.INSTANCE.shared().getDeviceState().getCurrentMicVolume();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super Integer> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.4.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i12, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "currentMicVolume", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("currentMicVolume", Boxing.boxInt(i12));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentMicVolume.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$5 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$5", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {58}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394415 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394415(Continuation<? super C394415> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394415(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394415) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Integer> outputVolume = DeviceStore.INSTANCE.shared().getDeviceState().getOutputVolume();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super Integer> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.5.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i12, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "outputVolume", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("outputVolume", Boxing.boxInt(i12));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (outputVolume.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$6 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$6", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {67}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394426 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394426(Continuation<? super C394426> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394426(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394426) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<DeviceStatus> cameraStatus = DeviceStore.INSTANCE.shared().getDeviceState().getCameraStatus();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super DeviceStatus> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.6.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DeviceStatus) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull DeviceStatus deviceStatus, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "cameraStatus", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("cameraStatus", Boxing.boxInt(deviceStatus.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (cameraStatus.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$7 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$7", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394437 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394437(Continuation<? super C394437> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394437(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394437) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<DeviceError> cameraLastError = DeviceStore.INSTANCE.shared().getDeviceState().getCameraLastError();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super DeviceError> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.7.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DeviceError) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull DeviceError deviceError, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "cameraLastError", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("cameraLastError", Boxing.boxInt(deviceError.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (cameraLastError.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$8 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$8", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {85}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394448 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394448(Continuation<? super C394448> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394448(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394448) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Boolean> interfaceC41678wIsFrontCamera = DeviceStore.INSTANCE.shared().getDeviceState().isFrontCamera();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super Boolean> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.8.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z11, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "isFrontCamera", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("isFrontCamera", Boxing.boxBoolean(z11));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interfaceC41678wIsFrontCamera.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$9 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher$startObserving$9", m90122f = "DeviceDispatcher.kt", m90123i = {}, m90124l = {94}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394459 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394459(Continuation<? super C394459> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDispatcher.this.new C394459(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394459) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<MirrorType> localMirrorType = DeviceStore.INSTANCE.shared().getDeviceState().getLocalMirrorType();
                final DeviceDispatcher deviceDispatcher = DeviceDispatcher.this;
                InterfaceC41635f<? super MirrorType> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher.startObserving.9.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((MirrorType) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull MirrorType mirrorType, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(deviceDispatcher.baseKey, null, null, "localMirrorType", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("localMirrorType", Boxing.boxInt(mirrorType.getValue()));
                        deviceDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (localMirrorType.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDispatcher(@NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.baseKey = new HybridListenerKey("state", "DeviceStore", "", null, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DeviceState deviceState = DeviceStore.INSTANCE.shared().getDeviceState();
        String name = key.getName();
        switch (name.hashCode()) {
            case -1940952068:
                if (name.equals("networkInfo")) {
                    String json = JsonParserKt.getSharedGson().toJson(deviceState.getNetworkInfo().getValue());
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("networkInfo", json)));
                    break;
                }
                break;
            case -1936175684:
                if (name.equals("microphoneStatus")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("microphoneStatus", Integer.valueOf(deviceState.getMicrophoneStatus().getValue().getValue()))));
                    break;
                }
                break;
            case -1813122452:
                if (name.equals("currentAudioRoute")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("currentAudioRoute", Integer.valueOf(deviceState.getCurrentAudioRoute().getValue().getValue()))));
                    break;
                }
                break;
            case -1679197314:
                if (name.equals("screenStatus")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("screenStatus", Integer.valueOf(deviceState.getScreenStatus().getValue().getValue()))));
                    break;
                }
                break;
            case -1375786652:
                if (name.equals("localMirrorType")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("localMirrorType", Integer.valueOf(deviceState.getLocalMirrorType().getValue().getValue()))));
                    break;
                }
                break;
            case -1217227923:
                if (name.equals("cameraLastError")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("cameraLastError", Integer.valueOf(deviceState.getCameraLastError().getValue().getValue()))));
                    break;
                }
                break;
            case -933965961:
                if (name.equals("cameraStatus")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("cameraStatus", Integer.valueOf(deviceState.getCameraStatus().getValue().getValue()))));
                    break;
                }
                break;
            case -236339441:
                if (name.equals("localVideoQuality")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("localVideoQuality", Integer.valueOf(deviceState.getLocalVideoQuality().getValue().getValue()))));
                    break;
                }
                break;
            case -49256581:
                if (name.equals("outputVolume")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("outputVolume", deviceState.getOutputVolume().getValue())));
                    break;
                }
                break;
            case 242803400:
                if (name.equals("currentMicVolume")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("currentMicVolume", deviceState.getCurrentMicVolume().getValue())));
                    break;
                }
                break;
            case 565555976:
                if (name.equals("microphoneLastError")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("microphoneLastError", Integer.valueOf(deviceState.getMicrophoneLastError().getValue().getValue()))));
                    break;
                }
                break;
            case 610740004:
                if (name.equals("isFrontCamera")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("isFrontCamera", deviceState.isFrontCamera().getValue())));
                    break;
                }
                break;
            case 2042793472:
                if (name.equals("captureVolume")) {
                    dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("captureVolume", deviceState.getCaptureVolume().getValue())));
                    break;
                }
                break;
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394331(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394382(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394393(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394404(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394415(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394426(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394437(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394448(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394459(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C3943410(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C3943511(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C3943612(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C3943713(null), 2, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        getKeys().clear();
    }
}
