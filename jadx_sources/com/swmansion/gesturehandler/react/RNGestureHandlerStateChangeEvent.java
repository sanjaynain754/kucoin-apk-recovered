package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.gesturehandler.core.GestureHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import tb0.AbstractC44918b;

/* JADX INFO: compiled from: RNGestureHandlerStateChangeEvent.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u001a\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006\""}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerStateChangeEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "", "onDispose", "", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "", "getCoalescingKey", "()S", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "handler", "", "newState", "oldState", "Ltb0/b;", "dataBuilder", "b", "(Lcom/swmansion/gesturehandler/core/GestureHandler;IILtb0/b;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ltb0/b;", "I", "c", "d", "Companion", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNGestureHandlerStateChangeEvent extends Event<RNGestureHandlerStateChangeEvent> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Pools.SynchronizedPool<RNGestureHandlerStateChangeEvent> f68386e = new Pools.SynchronizedPool<>(7);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public AbstractC44918b<?> dataBuilder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int newState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int oldState;

    /* JADX INFO: compiled from: RNGestureHandlerStateChangeEvent.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\f\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerStateChangeEvent$Companion;", "", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "handler", "", "newState", "oldState", "Ltb0/b;", "dataBuilder", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerStateChangeEvent;", "obtain", "(Lcom/swmansion/gesturehandler/core/GestureHandler;IILtb0/b;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerStateChangeEvent;", "Lcom/facebook/react/bridge/WritableMap;", "createEventData", "(Ltb0/b;II)Lcom/facebook/react/bridge/WritableMap;", "", "EVENT_NAME", "Ljava/lang/String;", "TOUCH_EVENTS_POOL_SIZE", "I", "Landroidx/core/util/Pools$SynchronizedPool;", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final WritableMap createEventData(@NotNull AbstractC44918b<?> dataBuilder, int newState, int oldState) {
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNull(writableMapCreateMap);
            dataBuilder.mo99350a(writableMapCreateMap);
            writableMapCreateMap.putInt("state", newState);
            writableMapCreateMap.putInt("oldState", oldState);
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        @NotNull
        public final <T extends GestureHandler<T>> RNGestureHandlerStateChangeEvent obtain(@NotNull T handler, int newState, int oldState, @NotNull AbstractC44918b<T> dataBuilder) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            RNGestureHandlerStateChangeEvent rNGestureHandlerStateChangeEvent = (RNGestureHandlerStateChangeEvent) RNGestureHandlerStateChangeEvent.f68386e.acquire();
            if (rNGestureHandlerStateChangeEvent == null) {
                rNGestureHandlerStateChangeEvent = new RNGestureHandlerStateChangeEvent(null);
            }
            rNGestureHandlerStateChangeEvent.m72054b(handler, newState, oldState, dataBuilder);
            return rNGestureHandlerStateChangeEvent;
        }
    }

    public /* synthetic */ RNGestureHandlerStateChangeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.dataBuilder = null;
        this.newState = 0;
        this.oldState = 0;
        f68386e.release(this);
    }

    public RNGestureHandlerStateChangeEvent() {
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public WritableMap getEventData() {
        Companion companion = INSTANCE;
        AbstractC44918b<?> abstractC44918b = this.dataBuilder;
        Intrinsics.checkNotNull(abstractC44918b);
        return companion.createEventData(abstractC44918b, this.newState, this.oldState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final <T extends GestureHandler<T>> void m72054b(T handler, int newState, int oldState, AbstractC44918b<T> dataBuilder) {
        View view = handler.getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
        Intrinsics.checkNotNull(view);
        super.init(UIManagerHelper.getSurfaceId(view), view.getId());
        this.dataBuilder = dataBuilder;
        this.newState = newState;
        this.oldState = oldState;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }
}
