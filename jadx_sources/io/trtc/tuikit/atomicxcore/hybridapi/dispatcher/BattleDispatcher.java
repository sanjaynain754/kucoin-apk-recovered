package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.trtc.tuikit.atomicxcore.api.live.BattleEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleListener;
import io.trtc.tuikit.atomicxcore.api.live.BattleState;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
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
import p852kotlin.Pair;
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
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "liveID", "", "eventEmitter", "Lkotlin/Function2;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "eventListener", "Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBattleDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,235:1\n35#2,2:236\n35#2,2:238\n35#2,2:240\n*S KotlinDebug\n*F\n+ 1 BattleDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher\n*L\n220#1:236,2\n224#1:238,2\n228#1:240,2\n*E\n"})
public final class BattleDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    @Nullable
    private BattleListener eventListener;

    @NotNull
    private final String liveID;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher$startObserving$1", m90122f = "BattleDispatcher.kt", m90123i = {}, m90124l = {29}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394181 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394181(Continuation<? super C394181> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BattleDispatcher.this.new C394181(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394181) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<BattleInfo> currentBattleInfo = BattleStore.INSTANCE.create(BattleDispatcher.this.liveID).getBattleState().getCurrentBattleInfo();
                final BattleDispatcher battleDispatcher = BattleDispatcher.this;
                InterfaceC41635f<? super BattleInfo> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((BattleInfo) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
                    @Nullable
                    public final Object emit(@Nullable BattleInfo battleInfo, @NotNull Continuation<? super Unit> continuation) {
                        String json;
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(battleDispatcher.baseKey, null, null, "currentBattleInfo", null, null, 27, null);
                        if (battleInfo != null) {
                            json = JsonParserKt.getSharedGson().toJson(battleInfo);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            if (json == null) {
                                json = "null";
                            }
                        } else {
                            json = "null";
                        }
                        battleDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("currentBattleInfo", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentBattleInfo.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher$startObserving$2", m90122f = "BattleDispatcher.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394192 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394192(Continuation<? super C394192> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BattleDispatcher.this.new C394192(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394192) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<List<SeatUserInfo>> battleUsers = BattleStore.INSTANCE.create(BattleDispatcher.this.liveID).getBattleState().getBattleUsers();
                final BattleDispatcher battleDispatcher = BattleDispatcher.this;
                InterfaceC41635f<? super List<SeatUserInfo>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<SeatUserInfo>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<SeatUserInfo> list, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(battleDispatcher.baseKey, null, null, "battleUsers", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(list);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        battleDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("battleUsers", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (battleUsers.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher$startObserving$3 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher$startObserving$3", m90122f = "BattleDispatcher.kt", m90123i = {}, m90124l = {45}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394203 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394203(Continuation<? super C394203> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BattleDispatcher.this.new C394203(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394203) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Map<String, Integer>> battleScore = BattleStore.INSTANCE.create(BattleDispatcher.this.liveID).getBattleState().getBattleScore();
                final BattleDispatcher battleDispatcher = BattleDispatcher.this;
                InterfaceC41635f<? super Map<String, Integer>> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher.startObserving.3.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Map<String, Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull Map<String, Integer> map, @NotNull Continuation<? super Unit> continuation) {
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(battleDispatcher.baseKey, null, null, "battleScore", null, null, 27, null);
                        String json = JsonParserKt.getSharedGson().toJson(map);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        battleDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("battleScore", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (battleScore.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BattleDispatcher(@NotNull String liveID, @NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.liveID = liveID;
        this.baseKey = new HybridListenerKey("state", "BattleStore", "", liveID, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        String json;
        Intrinsics.checkNotNullParameter(key, "key");
        BattleState battleState = BattleStore.INSTANCE.create(this.liveID).getBattleState();
        String name = key.getName();
        int iHashCode = name.hashCode();
        if (iHashCode == -1296964641) {
            if (name.equals("currentBattleInfo")) {
                BattleInfo value = battleState.getCurrentBattleInfo().getValue();
                if (value != null) {
                    json = JsonParserKt.getSharedGson().toJson(value);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    if (json == null) {
                        json = "null";
                    }
                } else {
                    json = "null";
                }
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("currentBattleInfo", json)));
                return;
            }
            return;
        }
        if (iHashCode == -760893254) {
            if (name.equals("battleScore")) {
                String json2 = JsonParserKt.getSharedGson().toJson(battleState.getBattleScore().getValue());
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("battleScore", json2)));
                return;
            }
            return;
        }
        if (iHashCode == -758579152 && name.equals("battleUsers")) {
            String json3 = JsonParserKt.getSharedGson().toJson(battleState.getBattleUsers().getValue());
            Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("battleUsers", json3)));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        BattleListener battleListener = this.eventListener;
        if (battleListener != null) {
            BattleStore.INSTANCE.create(this.liveID).removeBattleListener(battleListener);
            this.eventListener = null;
        }
        getKeys().clear();
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394181(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394192(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394203(null), 2, null);
        BattleListener battleListener = new BattleListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher.startObserving.4
            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onBattleEnded(@NotNull BattleInfo battleInfo, @Nullable BattleEndedReason reason) {
                Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onBattleEnded", null, null, 26, null);
                String json = JsonParserKt.getSharedGson().toJson(battleInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("battleInfo", json), TuplesKt.m90091to("reason", Integer.valueOf(reason != null ? reason.getValue() : -1))));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onBattleRequestAccept(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(battleID, "battleID");
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onBattleRequestAccept", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("battleID", battleID);
                String json = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Pair pairM90091to2 = TuplesKt.m90091to("inviter", json);
                String json2 = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("invitee", json2)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onBattleRequestCancelled(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(battleID, "battleID");
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onBattleRequestCancelled", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("battleID", battleID);
                String json = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Pair pairM90091to2 = TuplesKt.m90091to("inviter", json);
                String json2 = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("invitee", json2)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onBattleRequestReceived(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(battleID, "battleID");
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onBattleRequestReceived", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("battleID", battleID);
                String json = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Pair pairM90091to2 = TuplesKt.m90091to("inviter", json);
                String json2 = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("invitee", json2)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onBattleRequestReject(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(battleID, "battleID");
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onBattleRequestReject", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("battleID", battleID);
                String json = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Pair pairM90091to2 = TuplesKt.m90091to("inviter", json);
                String json2 = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("invitee", json2)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onBattleRequestTimeout(@NotNull String battleID, @NotNull SeatUserInfo inviter, @NotNull SeatUserInfo invitee) {
                Intrinsics.checkNotNullParameter(battleID, "battleID");
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(invitee, "invitee");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onBattleRequestTimeout", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("battleID", battleID);
                String json = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Pair pairM90091to2 = TuplesKt.m90091to("inviter", json);
                String json2 = JsonParserKt.getSharedGson().toJson(invitee);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("invitee", json2)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onBattleStarted(@NotNull BattleInfo battleInfo, @NotNull SeatUserInfo inviter, @NotNull List<SeatUserInfo> invitees) {
                Intrinsics.checkNotNullParameter(battleInfo, "battleInfo");
                Intrinsics.checkNotNullParameter(inviter, "inviter");
                Intrinsics.checkNotNullParameter(invitees, "invitees");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onBattleStarted", null, null, 26, null);
                String json = JsonParserKt.getSharedGson().toJson(battleInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Pair pairM90091to = TuplesKt.m90091to("battleInfo", json);
                String json2 = JsonParserKt.getSharedGson().toJson(inviter);
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                Pair pairM90091to2 = TuplesKt.m90091to("inviter", json2);
                String json3 = JsonParserKt.getSharedGson().toJson(invitees);
                Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("invitees", json3)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onUserExitBattle(@NotNull String battleID, @NotNull SeatUserInfo battleUser) {
                Intrinsics.checkNotNullParameter(battleID, "battleID");
                Intrinsics.checkNotNullParameter(battleUser, "battleUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onUserExitBattle", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("battleID", battleID);
                String json = JsonParserKt.getSharedGson().toJson(battleUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, TuplesKt.m90091to("battleUser", json)));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.live.BattleListener
            public void onUserJoinBattle(@NotNull String battleID, @NotNull SeatUserInfo battleUser) {
                Intrinsics.checkNotNullParameter(battleID, "battleID");
                Intrinsics.checkNotNullParameter(battleUser, "battleUser");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(BattleDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onUserJoinBattle", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("battleID", battleID);
                String json = JsonParserKt.getSharedGson().toJson(battleUser);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                BattleDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, TuplesKt.m90091to("battleUser", json)));
            }
        };
        this.eventListener = battleListener;
        BattleStore.INSTANCE.create(this.liveID).addBattleListener(battleListener);
    }
}
