package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.trtc.tuikit.atomicxcore.api.live.CoHostListener;
import io.trtc.tuikit.atomicxcore.api.live.CoHostState;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStatus;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import java.util.LinkedHashMap;
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
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "liveID", "", "eventEmitter", "Lkotlin/Function2;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "eventListener", "Lio/trtc/tuikit/atomicxcore/api/live/CoHostListener;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoHostDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoHostDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,185:1\n35#2,2:186\n35#2,2:188\n35#2,2:190\n*S KotlinDebug\n*F\n+ 1 CoHostDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher\n*L\n170#1:186,2\n174#1:188,2\n178#1:190,2\n*E\n"})
public final class CoHostDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    @Nullable
    private CoHostListener eventListener;

    @NotNull
    private final String liveID;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$1", m90122f = "CoHostDispatcher.kt", m90123i = {}, m90124l = {28}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394281 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394281(Continuation<? super C394281> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoHostDispatcher.this.new C394281(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394281) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<CoHostStatus> coHostStatus = CoHostStore.INSTANCE.create(CoHostDispatcher.this.liveID).getCoHostState().getCoHostStatus();
                final CoHostDispatcher coHostDispatcher = CoHostDispatcher.this;
                InterfaceC41635f<? super CoHostStatus> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CoHostStatus) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull CoHostStatus coHostStatus2, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coHostDispatcher.baseKey, null, null, "coHostStatus", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("coHostStatus", Boxing.boxInt(coHostStatus2.getValue()));
                        coHostDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (coHostStatus.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$2", m90122f = "CoHostDispatcher.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394292 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394292(Continuation<? super C394292> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoHostDispatcher.this.new C394292(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394292) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = CoHostStore.INSTANCE.create(CoHostDispatcher.this.liveID).getCoHostState().getConnected();
                final CoHostDispatcher coHostDispatcher = CoHostDispatcher.this;
                InterfaceC41635f<? super List<SeatUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<SeatUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<SeatUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coHostDispatcher.baseKey, null, null, "connected", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        linkedHashMap.put("connected", json);
                        coHostDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (connected.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$3 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$3", m90122f = "CoHostDispatcher.kt", m90123i = {}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394303 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394303(Continuation<? super C394303> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoHostDispatcher.this.new C394303(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394303) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> invitees = CoHostStore.INSTANCE.create(CoHostDispatcher.this.liveID).getCoHostState().getInvitees();
                final CoHostDispatcher coHostDispatcher = CoHostDispatcher.this;
                InterfaceC41635f<? super List<SeatUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher.startObserving.3.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<SeatUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<SeatUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coHostDispatcher.baseKey, null, null, "invitees", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        linkedHashMap.put("invitees", json);
                        coHostDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (invitees.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$4 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher$startObserving$4", m90122f = "CoHostDispatcher.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394314 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394314(Continuation<? super C394314> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoHostDispatcher.this.new C394314(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394314) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<SeatUserInfo> applicant = CoHostStore.INSTANCE.create(CoHostDispatcher.this.liveID).getCoHostState().getApplicant();
                final CoHostDispatcher coHostDispatcher = CoHostDispatcher.this;
                InterfaceC41635f<? super SeatUserInfo> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher.startObserving.4.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SeatUserInfo) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Code duplicated, block: B:6:0x002a  */
                    @Nullable
                    public final Object emit(@Nullable SeatUserInfo seatUserInfo, @NotNull Continuation<? super Unit> continuation) {
                        String json;
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coHostDispatcher.baseKey, null, null, "applicant", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (seatUserInfo != null) {
                            json = JsonParserKt.getSharedGson().toJson(seatUserInfo);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            if (json == null) {
                                json = "null";
                            }
                        } else {
                            json = "null";
                        }
                        linkedHashMap.put("applicant", json);
                        coHostDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (applicant.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoHostDispatcher(@NotNull String liveID, @NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.liveID = liveID;
        this.baseKey = new HybridListenerKey("state", "CoHostStore", "", liveID, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        String json;
        Intrinsics.checkNotNullParameter(key, "key");
        CoHostState coHostState = CoHostStore.INSTANCE.create(this.liveID).getCoHostState();
        String name = key.getName();
        int iHashCode = name.hashCode();
        if (iHashCode == -2090000638) {
            if (name.equals("applicant")) {
                SeatUserInfo value = coHostState.getApplicant().getValue();
                if (value != null) {
                    json = JsonParserKt.getSharedGson().toJson(value);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    if (json == null) {
                        json = "null";
                    }
                } else {
                    json = "null";
                }
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("applicant", json)));
                return;
            }
            return;
        }
        if (iHashCode == -1109580474) {
            if (name.equals("coHostStatus")) {
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("coHostStatus", Integer.valueOf(coHostState.getCoHostStatus().getValue().getValue()))));
                return;
            }
            return;
        }
        if (iHashCode == -579210487) {
            if (name.equals("connected")) {
                String json2 = JsonParserKt.getSharedGson().toJson(coHostState.getConnected().getValue());
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("connected", json2)));
                return;
            }
            return;
        }
        if (iHashCode == 631414135 && name.equals("invitees")) {
            String json3 = JsonParserKt.getSharedGson().toJson(coHostState.getInvitees().getValue());
            Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("invitees", json3)));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        CoHostListener coHostListener = this.eventListener;
        if (coHostListener != null) {
            CoHostStore.INSTANCE.create(this.liveID).removeCoHostListener(coHostListener);
            this.eventListener = null;
        }
        getKeys().clear();
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394281(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394292(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394303(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394314(null), 2, null);
        CoHostListener coHostListener = new CoHostListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher.startObserving.5
            @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
            public void onCoHostRequestAccepted(@NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoHostDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onCoHostRequestAccepted", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("invitee", json);
                CoHostDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            /* JADX WARN: Code duplicated, block: B:6:0x003e  */
            @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
            public void onCoHostRequestCancelled(@NotNull SeatUserInfo inviter, @Nullable SeatUserInfo invitee) {
                String json;
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoHostDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onCoHostRequestCancelled", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json2 = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                linkedHashMap.put("inviter", json2);
                if (invitee != null) {
                    json = JsonParserKt.getSharedGson().toJson(invitee);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    if (json == null) {
                        json = "null";
                    }
                } else {
                    json = "null";
                }
                linkedHashMap.put("invitee", json);
                CoHostDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
            public void onCoHostRequestReceived(@NotNull SeatUserInfo inviter, @NotNull String extensionInfo) {
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoHostDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onCoHostRequestReceived", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("inviter", json);
                linkedHashMap.put("extensionInfo", extensionInfo);
                CoHostDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
            public void onCoHostRequestRejected(@NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoHostDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onCoHostRequestRejected", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("invitee", json);
                CoHostDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
            public void onCoHostRequestTimeout(@NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoHostDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onCoHostRequestTimeout", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("inviter", json);
                String json2 = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                linkedHashMap.put("invitee", json2);
                CoHostDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
            public void onCoHostUserJoined(@NotNull SeatUserInfo userInfo) {
                Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoHostDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onCoHostUserJoined", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(userInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("userInfo", json);
                CoHostDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.CoHostListener
            public void onCoHostUserLeft(@NotNull SeatUserInfo userInfo) {
                Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoHostDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onCoHostUserLeft", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(userInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("userInfo", json);
                CoHostDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }
        };
        this.eventListener = coHostListener;
        CoHostStore.INSTANCE.create(this.liveID).addCoHostListener(coHostListener);
    }
}
