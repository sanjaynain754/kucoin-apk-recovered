package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.live.LikeListener;
import io.trtc.tuikit.atomicxcore.api.live.LikeState;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LikeDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "liveID", "", "eventEmitter", "Lkotlin/Function2;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "eventListener", "Lio/trtc/tuikit/atomicxcore/api/live/LikeListener;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class LikeDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    @Nullable
    private LikeListener eventListener;

    @NotNull
    private final String liveID;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LikeDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LikeDispatcher$startObserving$1", m90122f = "LikeDispatcher.kt", m90123i = {}, m90124l = {27}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394481 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394481(Continuation<? super C394481> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LikeDispatcher.this.new C394481(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394481) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<Long> totalLikeCount = LikeStore.INSTANCE.create(LikeDispatcher.this.liveID).getLikeState().getTotalLikeCount();
                final LikeDispatcher likeDispatcher = LikeDispatcher.this;
                InterfaceC41635f<? super Long> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LikeDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).longValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(long j11, @NotNull Continuation<? super Unit> continuation) {
                        likeDispatcher.dispatchEvent(HybridListenerKey.copy$default(likeDispatcher.baseKey, null, null, "totalLikeCount", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("totalLikeCount", Boxing.boxLong(j11))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (totalLikeCount.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LikeDispatcher(@NotNull String liveID, @NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.liveID = liveID;
        this.baseKey = new HybridListenerKey("state", "LikeStore", "", liveID, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LikeState likeState = LikeStore.INSTANCE.create(this.liveID).getLikeState();
        if (Intrinsics.areEqual(key.getName(), "totalLikeCount")) {
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("totalLikeCount", likeState.getTotalLikeCount().getValue())));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        LikeListener likeListener = this.eventListener;
        if (likeListener != null) {
            LikeStore.INSTANCE.create(this.liveID).removeLikeListener(likeListener);
            this.eventListener = null;
        }
        getKeys().clear();
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394481(null), 2, null);
        LikeListener likeListener = new LikeListener() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LikeDispatcher.startObserving.2
            @Override // io.trtc.tuikit.atomicxcore.api.live.LikeListener
            public void onReceiveLikesMessage(@NotNull String liveID, long totalLikesReceived, @NotNull LiveUserInfo sender) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                Intrinsics.checkNotNullParameter(sender, "sender");
                HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(LikeDispatcher.this.baseKey, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null, "onReceiveLikesMessage", null, null, 26, null);
                Pair pairM90091to = TuplesKt.m90091to("liveID", liveID);
                Pair pairM90091to2 = TuplesKt.m90091to("totalLikesReceived", Long.valueOf(totalLikesReceived));
                String json = JsonParserKt.getSharedGson().toJson(sender);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                LikeDispatcher.this.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to(TUIConstants.TUICalling.SENDER, json)));
            }
        };
        this.eventListener = likeListener;
        LikeStore.INSTANCE.create(this.liveID).addLikeListener(likeListener);
    }
}
