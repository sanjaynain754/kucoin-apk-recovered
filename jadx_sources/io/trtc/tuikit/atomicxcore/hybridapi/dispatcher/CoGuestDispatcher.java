package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestState;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.HostListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.NoResponseReason;
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
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "liveID", "", "eventEmitter", "Lkotlin/Function2;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "guestListener", "Lio/trtc/tuikit/atomicxcore/api/live/GuestListener;", "hostListener", "Lio/trtc/tuikit/atomicxcore/api/live/HostListener;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoGuestDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoGuestDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,233:1\n35#2,2:234\n35#2,2:236\n35#2,2:238\n35#2,2:240\n*S KotlinDebug\n*F\n+ 1 CoGuestDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher\n*L\n214#1:234,2\n218#1:236,2\n222#1:238,2\n226#1:240,2\n*E\n"})
public final class CoGuestDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    @Nullable
    private GuestListener guestListener;

    @Nullable
    private HostListener hostListener;

    @NotNull
    private final String liveID;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$1", m90122f = "CoGuestDispatcher.kt", m90123i = {}, m90124l = {30}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394221 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394221(Continuation<? super C394221> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoGuestDispatcher.this.new C394221(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394221) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> connected = CoGuestStore.INSTANCE.create(CoGuestDispatcher.this.liveID).getCoGuestState().getConnected();
                final CoGuestDispatcher coGuestDispatcher = CoGuestDispatcher.this;
                InterfaceC41635f<? super List<SeatUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<SeatUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<SeatUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coGuestDispatcher.baseKey, null, null, "connected", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        linkedHashMap.put("connected", json);
                        coGuestDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
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

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$2", m90122f = "CoGuestDispatcher.kt", m90123i = {}, m90124l = {39}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394232 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394232(Continuation<? super C394232> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoGuestDispatcher.this.new C394232(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394232) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<LiveUserInfo>> invitees = CoGuestStore.INSTANCE.create(CoGuestDispatcher.this.liveID).getCoGuestState().getInvitees();
                final CoGuestDispatcher coGuestDispatcher = CoGuestDispatcher.this;
                InterfaceC41635f<? super List<LiveUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<LiveUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<LiveUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coGuestDispatcher.baseKey, null, null, "invitees", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        linkedHashMap.put("invitees", json);
                        coGuestDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
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

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$3 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$3", m90122f = "CoGuestDispatcher.kt", m90123i = {}, m90124l = {48}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394243 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394243(Continuation<? super C394243> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoGuestDispatcher.this.new C394243(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394243) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<LiveUserInfo>> applicants = CoGuestStore.INSTANCE.create(CoGuestDispatcher.this.liveID).getCoGuestState().getApplicants();
                final CoGuestDispatcher coGuestDispatcher = CoGuestDispatcher.this;
                InterfaceC41635f<? super List<LiveUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher.startObserving.3.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<LiveUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<LiveUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coGuestDispatcher.baseKey, null, null, "applicants", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        linkedHashMap.put("applicants", json);
                        coGuestDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (applicants.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$4 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher$startObserving$4", m90122f = "CoGuestDispatcher.kt", m90123i = {}, m90124l = {57}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394254 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394254(Continuation<? super C394254> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoGuestDispatcher.this.new C394254(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394254) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<LiveUserInfo>> candidates = CoGuestStore.INSTANCE.create(CoGuestDispatcher.this.liveID).getCoGuestState().getCandidates();
                final CoGuestDispatcher coGuestDispatcher = CoGuestDispatcher.this;
                InterfaceC41635f<? super List<LiveUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher.startObserving.4.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<LiveUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<LiveUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(coGuestDispatcher.baseKey, null, null, "candidates", null, null, 27, null);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        linkedHashMap.put("candidates", json);
                        coGuestDispatcher.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (candidates.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoGuestDispatcher(@NotNull String liveID, @NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.liveID = liveID;
        this.baseKey = new HybridListenerKey("state", "CoGuestStore", "", liveID, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoGuestState coGuestState = CoGuestStore.INSTANCE.create(this.liveID).getCoGuestState();
        String name = key.getName();
        int iHashCode = name.hashCode();
        if (iHashCode == -1411310768) {
            if (name.equals("candidates")) {
                String json = JsonParserKt.getSharedGson().toJson(coGuestState.getCandidates().getValue());
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("candidates", json)));
                return;
            }
            return;
        }
        if (iHashCode == -579210487) {
            if (name.equals("connected")) {
                String json2 = JsonParserKt.getSharedGson().toJson(coGuestState.getConnected().getValue());
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("connected", json2)));
                return;
            }
            return;
        }
        if (iHashCode == -365510223) {
            if (name.equals("applicants")) {
                String json3 = JsonParserKt.getSharedGson().toJson(coGuestState.getApplicants().getValue());
                Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("applicants", json3)));
                return;
            }
            return;
        }
        if (iHashCode == 631414135 && name.equals("invitees")) {
            String json4 = JsonParserKt.getSharedGson().toJson(coGuestState.getInvitees().getValue());
            Intrinsics.checkNotNullExpressionValue(json4, "toJson(...)");
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("invitees", json4)));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        HostListener hostListener = this.hostListener;
        if (hostListener != null) {
            CoGuestStore.INSTANCE.create(this.liveID).removeHostListener(hostListener);
            this.hostListener = null;
        }
        GuestListener guestListener = this.guestListener;
        if (guestListener != null) {
            CoGuestStore.INSTANCE.create(this.liveID).removeGuestListener(guestListener);
            this.guestListener = null;
        }
        getKeys().clear();
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394221(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394232(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394243(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394254(null), 2, null);
        this.hostListener = new HostListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher.startObserving.5
            @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
            public void onGuestApplicationCancelled(@NotNull LiveUserInfo guestUser) {
                Intrinsics.checkNotNullParameter(guestUser, "guestUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onGuestApplicationCancelled", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(guestUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("guestUser", json);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
            public void onGuestApplicationProcessedByOtherHost(@NotNull LiveUserInfo guestUser, @NotNull LiveUserInfo hostUser) {
                Intrinsics.checkNotNullParameter(guestUser, "guestUser");
                Intrinsics.checkNotNullParameter(hostUser, "hostUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onGuestApplicationProcessedByOtherHost", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(guestUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("guestUser", json);
                String json2 = JsonParserKt.getSharedGson().toJson(hostUser);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                linkedHashMap.put("hostUser", json2);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
            public void onGuestApplicationReceived(@NotNull LiveUserInfo guestUser) {
                Intrinsics.checkNotNullParameter(guestUser, "guestUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onGuestApplicationReceived", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(guestUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("guestUser", json);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
            public void onHostInvitationNoResponse(@NotNull LiveUserInfo guestUser, @NotNull NoResponseReason reason) {
                Intrinsics.checkNotNullParameter(guestUser, "guestUser");
                Intrinsics.checkNotNullParameter(reason, "reason");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onHostInvitationNoResponse", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(guestUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("guestUser", json);
                linkedHashMap.put("reason", Integer.valueOf(reason.getValue()));
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.HostListener
            public void onHostInvitationResponded(boolean isAccept, @NotNull LiveUserInfo guestUser) {
                Intrinsics.checkNotNullParameter(guestUser, "guestUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onHostInvitationResponded", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("isAccept", Boolean.valueOf(isAccept));
                String json = JsonParserKt.getSharedGson().toJson(guestUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("guestUser", json);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }
        };
        this.guestListener = new GuestListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher.startObserving.6
            @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
            public void onGuestApplicationNoResponse(@NotNull NoResponseReason reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onGuestApplicationNoResponse", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("reason", Integer.valueOf(reason.getValue()));
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
            public void onGuestApplicationResponded(boolean isAccept, @NotNull LiveUserInfo hostUser) {
                Intrinsics.checkNotNullParameter(hostUser, "hostUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onGuestApplicationResponded", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("isAccept", Boolean.valueOf(isAccept));
                String json = JsonParserKt.getSharedGson().toJson(hostUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("hostUser", json);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
            public void onHostInvitationCancelled(@NotNull LiveUserInfo hostUser) {
                Intrinsics.checkNotNullParameter(hostUser, "hostUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onHostInvitationCancelled", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(hostUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("hostUser", json);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
            public void onHostInvitationReceived(@NotNull LiveUserInfo hostUser) {
                Intrinsics.checkNotNullParameter(hostUser, "hostUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onHostInvitationReceived", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String json = JsonParserKt.getSharedGson().toJson(hostUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("hostUser", json);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
            public void onKickedOffSeat(int seatIndex, @NotNull LiveUserInfo hostUser) {
                Intrinsics.checkNotNullParameter(hostUser, "hostUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(CoGuestDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onKickedOffSeat", null, null, 26, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("seatIndex", Integer.valueOf(seatIndex));
                String json = JsonParserKt.getSharedGson().toJson(hostUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                linkedHashMap.put("hostUser", json);
                CoGuestDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, linkedHashMap);
            }
        };
        HostListener hostListener = this.hostListener;
        if (hostListener != null) {
            CoGuestStore.INSTANCE.create(this.liveID).addHostListener(hostListener);
        }
        GuestListener guestListener = this.guestListener;
        if (guestListener != null) {
            CoGuestStore.INSTANCE.create(this.liveID).addGuestListener(guestListener);
        }
    }
}
