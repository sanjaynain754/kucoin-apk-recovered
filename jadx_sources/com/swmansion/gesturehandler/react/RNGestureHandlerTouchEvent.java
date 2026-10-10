package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.gesturehandler.core.GestureHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNGestureHandlerTouchEvent.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerTouchEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "", "onDispose", "", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "", "getCoalescingKey", "()S", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "handler", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/react/bridge/WritableMap;", "extraData", ExifInterface.LATITUDE_SOUTH, "coalescingKey", "c", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNGestureHandlerTouchEvent extends Event<RNGestureHandlerTouchEvent> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Pools.SynchronizedPool<RNGestureHandlerTouchEvent> f68391d = new Pools.SynchronizedPool<>(7);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public WritableMap extraData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public short coalescingKey;

    /* JADX INFO: compiled from: RNGestureHandlerTouchEvent.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0010\u001a\u00020\u000f\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00122\u0006\u0010\u0013\u001a\u0002H\u0011¢\u0006\u0002\u0010\u0014J#\u0010\u0015\u001a\u00020\u0016\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00122\u0006\u0010\u0013\u001a\u0002H\u0011¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerTouchEvent$Companion;", "", "<init>", "()V", "EVENT_UNDETERMINED", "", "EVENT_TOUCH_DOWN", "EVENT_TOUCH_MOVE", "EVENT_TOUCH_UP", "EVENT_TOUCH_CANCELLED", "EVENT_NAME", "", "TOUCH_EVENTS_POOL_SIZE", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerTouchEvent;", "obtain", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerTouchEvent;", "createEventData", "Lcom/facebook/react/bridge/WritableMap;", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/facebook/react/bridge/WritableMap;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T extends GestureHandler<T>> WritableMap createEventData(@NotNull T handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("handlerTag", handler.getTag());
            writableMapCreateMap.putInt("state", handler.getState());
            writableMapCreateMap.putInt("numberOfTouches", handler.getTrackedPointersCount());
            writableMapCreateMap.putInt("eventType", handler.getTouchEventType());
            writableMapCreateMap.putInt("pointerType", handler.getPointerType());
            WritableArray writableArrayM71793r = handler.m71793r();
            if (writableArrayM71793r != null) {
                writableMapCreateMap.putArray("changedTouches", writableArrayM71793r);
            }
            WritableArray writableArrayM71791q = handler.m71791q();
            if (writableArrayM71791q != null) {
                writableMapCreateMap.putArray("allTouches", writableArrayM71791q);
            }
            if (handler.getIsAwaiting() && handler.getState() == 4) {
                writableMapCreateMap.putInt("state", 2);
            }
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        @NotNull
        public final <T extends GestureHandler<T>> RNGestureHandlerTouchEvent obtain(@NotNull T handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            RNGestureHandlerTouchEvent rNGestureHandlerTouchEvent = (RNGestureHandlerTouchEvent) RNGestureHandlerTouchEvent.f68391d.acquire();
            if (rNGestureHandlerTouchEvent == null) {
                rNGestureHandlerTouchEvent = new RNGestureHandlerTouchEvent(null);
            }
            rNGestureHandlerTouchEvent.m72056b(handler);
            return rNGestureHandlerTouchEvent;
        }
    }

    public /* synthetic */ RNGestureHandlerTouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.extraData = null;
        f68391d.release(this);
    }

    public RNGestureHandlerTouchEvent() {
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    /* JADX INFO: renamed from: getEventData, reason: from getter */
    public WritableMap getExtraData() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: b */
    public final <T extends GestureHandler<T>> void m72056b(T handler) {
        View view = handler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
        Intrinsics.checkNotNull(view);
        super.init(UIManagerHelper.getSurfaceId(view), view.getId());
        this.extraData = INSTANCE.createEventData(handler);
        this.coalescingKey = handler.getEventCoalescingKey();
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return "onGestureHandlerEvent";
    }
}
