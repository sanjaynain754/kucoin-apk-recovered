package io.trtc.tuikit.atomicxcore.hybridapi.bridge;

import androidx.exifinterface.media.ExifInterface;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.AudioEffectDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BarrageDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BaseBeautyDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.BattleDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoGuestDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.CoHostDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.DeviceDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.GiftDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LikeDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveAudienceDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveListDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSeatDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LiveSummaryDispatcher;
import io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LoginDispatcher;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&JJ\u0010'\u001a\u00020(\"\b\b\u0000\u0010)*\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H)0\n2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H)0.H\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u00100\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&J6\u00101\u001a\u00020(\"\b\b\u0000\u0010)*\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H)0\nH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/EventManager;", "", "eventEmitter", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "audioEffectDispatcher", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/AudioEffectDispatcher;", "barrageDispatcherMap", "", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BarrageDispatcher;", "baseBeautyDispatcher", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BaseBeautyDispatcher;", "battleDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/BattleDispatcher;", "coGuestDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoGuestDispatcher;", "coHostDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/CoHostDispatcher;", "deviceDispatcher", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/DeviceDispatcher;", "giftDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/GiftDispatcher;", "likeDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LikeDispatcher;", "liveAudienceDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveAudienceDispatcher;", "liveListDispatcher", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveListDispatcher;", "liveSeatDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSeatDispatcher;", "liveSummaryDispatcherMap", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LiveSummaryDispatcher;", "loginDispatcher", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;", "addListener", "key", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "addListenerForMapStore", "", ExifInterface.GPS_DIRECTION_TRUE, "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "storeName", "map", "factory", "Lkotlin/Function1;", "getStoreObserver", "removeListener", "removeListenerForMapStore", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class EventManager {

    @Nullable
    private AudioEffectDispatcher audioEffectDispatcher;

    @NotNull
    private final Map<String, BarrageDispatcher> barrageDispatcherMap;

    @Nullable
    private BaseBeautyDispatcher baseBeautyDispatcher;

    @NotNull
    private final Map<String, BattleDispatcher> battleDispatcherMap;

    @NotNull
    private final Map<String, CoGuestDispatcher> coGuestDispatcherMap;

    @NotNull
    private final Map<String, CoHostDispatcher> coHostDispatcherMap;

    @Nullable
    private DeviceDispatcher deviceDispatcher;

    @NotNull
    private final Function2<String, String, Unit> eventEmitter;

    @NotNull
    private final Map<String, GiftDispatcher> giftDispatcherMap;

    @NotNull
    private final Map<String, LikeDispatcher> likeDispatcherMap;

    @NotNull
    private final Map<String, LiveAudienceDispatcher> liveAudienceDispatcherMap;

    @Nullable
    private LiveListDispatcher liveListDispatcher;

    @NotNull
    private final Map<String, LiveSeatDispatcher> liveSeatDispatcherMap;

    @NotNull
    private final Map<String, LiveSummaryDispatcher> liveSummaryDispatcherMap;

    @Nullable
    private LoginDispatcher loginDispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public EventManager(@NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.likeDispatcherMap = new LinkedHashMap();
        this.giftDispatcherMap = new LinkedHashMap();
        this.battleDispatcherMap = new LinkedHashMap();
        this.coGuestDispatcherMap = new LinkedHashMap();
        this.coHostDispatcherMap = new LinkedHashMap();
        this.liveAudienceDispatcherMap = new LinkedHashMap();
        this.liveSeatDispatcherMap = new LinkedHashMap();
        this.liveSummaryDispatcherMap = new LinkedHashMap();
        this.barrageDispatcherMap = new LinkedHashMap();
        this.eventEmitter = eventEmitter;
    }

    public final void addListener(@NotNull HybridListenerKey key) {
        Dispatcher storeObserver;
        Intrinsics.checkNotNullParameter(key, "key");
        if (addListenerForMapStore(key, "LikeStore", this.likeDispatcherMap, new Function1<String, LikeDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.1
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final LikeDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new LikeDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "GiftStore", this.giftDispatcherMap, new Function1<String, GiftDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.2
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final GiftDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new GiftDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "BattleStore", this.battleDispatcherMap, new Function1<String, BattleDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.3
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final BattleDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new BattleDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "CoGuestStore", this.coGuestDispatcherMap, new Function1<String, CoGuestDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.4
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final CoGuestDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new CoGuestDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "CoHostStore", this.coHostDispatcherMap, new Function1<String, CoHostDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.5
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final CoHostDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new CoHostDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "LiveAudienceStore", this.liveAudienceDispatcherMap, new Function1<String, LiveAudienceDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.6
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final LiveAudienceDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new LiveAudienceDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "LiveSeatStore", this.liveSeatDispatcherMap, new Function1<String, LiveSeatDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.7
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final LiveSeatDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new LiveSeatDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "LiveSummaryStore", this.liveSummaryDispatcherMap, new Function1<String, LiveSummaryDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.8
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final LiveSummaryDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new LiveSummaryDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || addListenerForMapStore(key, "BarrageStore", this.barrageDispatcherMap, new Function1<String, BarrageDispatcher>() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.bridge.EventManager.addListener.9
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final BarrageDispatcher invoke(@NotNull String liveID) {
                Intrinsics.checkNotNullParameter(liveID, "liveID");
                return new BarrageDispatcher(liveID, EventManager.this.eventEmitter);
            }
        }) || (storeObserver = getStoreObserver(key)) == null) {
            return;
        }
        storeObserver.addListener(key);
    }

    public final void removeListener(@NotNull HybridListenerKey key) {
        Dispatcher storeObserver;
        Intrinsics.checkNotNullParameter(key, "key");
        if (removeListenerForMapStore(key, "LikeStore", this.likeDispatcherMap) || removeListenerForMapStore(key, "GiftStore", this.giftDispatcherMap) || removeListenerForMapStore(key, "BattleStore", this.battleDispatcherMap) || removeListenerForMapStore(key, "CoGuestStore", this.coGuestDispatcherMap) || removeListenerForMapStore(key, "CoHostStore", this.coHostDispatcherMap) || removeListenerForMapStore(key, "LiveAudienceStore", this.liveAudienceDispatcherMap) || removeListenerForMapStore(key, "LiveSeatStore", this.liveSeatDispatcherMap) || removeListenerForMapStore(key, "LiveSummaryStore", this.liveSummaryDispatcherMap) || removeListenerForMapStore(key, "BarrageStore", this.barrageDispatcherMap) || (storeObserver = getStoreObserver(key)) == null) {
            return;
        }
        storeObserver.removeListener(key);
    }

    private final <T extends Dispatcher> boolean addListenerForMapStore(HybridListenerKey key, String storeName, Map<String, T> map, Function1<? super String, ? extends T> factory) {
        if (!Intrinsics.areEqual(key.getStore(), storeName)) {
            return false;
        }
        String roomID = key.getRoomID();
        if (roomID == null) {
            return true;
        }
        T tInvoke = map.get(roomID);
        if (tInvoke == null) {
            tInvoke = factory.invoke(roomID);
            map.put(roomID, tInvoke);
        }
        tInvoke.addListener(key);
        return true;
    }

    private final Dispatcher getStoreObserver(HybridListenerKey key) {
        if (Intrinsics.areEqual(key.getStore(), "LiveListStore")) {
            if (this.liveListDispatcher == null) {
                this.liveListDispatcher = new LiveListDispatcher(this.eventEmitter);
            }
            return this.liveListDispatcher;
        }
        if (Intrinsics.areEqual(key.getStore(), "DeviceStore")) {
            if (this.deviceDispatcher == null) {
                this.deviceDispatcher = new DeviceDispatcher(this.eventEmitter);
            }
            return this.deviceDispatcher;
        }
        if (Intrinsics.areEqual(key.getStore(), "BaseBeautyStore")) {
            if (this.baseBeautyDispatcher == null) {
                this.baseBeautyDispatcher = new BaseBeautyDispatcher(this.eventEmitter);
            }
            return this.baseBeautyDispatcher;
        }
        if (Intrinsics.areEqual(key.getStore(), "AudioEffectStore")) {
            if (this.audioEffectDispatcher == null) {
                this.audioEffectDispatcher = new AudioEffectDispatcher(this.eventEmitter);
            }
            return this.audioEffectDispatcher;
        }
        if (Intrinsics.areEqual(key.getStore(), "LoginStore")) {
            if (this.loginDispatcher == null) {
                this.loginDispatcher = new LoginDispatcher(this.eventEmitter);
            }
            return this.loginDispatcher;
        }
        return null;
    }

    private final <T extends Dispatcher> boolean removeListenerForMapStore(HybridListenerKey key, String storeName, Map<String, T> map) {
        T t11;
        if (!Intrinsics.areEqual(key.getStore(), storeName)) {
            return false;
        }
        String roomID = key.getRoomID();
        if (roomID == null || (t11 = map.get(roomID)) == null) {
            return true;
        }
        t11.removeListener(key);
        if (!t11.hasListeners()) {
            map.remove(roomID);
        }
        return true;
    }
}
