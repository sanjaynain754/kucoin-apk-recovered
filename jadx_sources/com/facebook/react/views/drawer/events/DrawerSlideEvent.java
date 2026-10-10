package com.facebook.react.views.drawer.events;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawerSlideEvent.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\tJ\u0006\u0010\n\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/react/views/drawer/events/DrawerSlideEvent;", "Lcom/facebook/react/uimanager/events/Event;", "viewId", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "<init>", "(IF)V", "surfaceId", "(IIF)V", "getOffset", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DrawerSlideEvent extends Event<DrawerSlideEvent> {

    @NotNull
    public static final String EVENT_NAME = "topDrawerSlide";
    private final float offset;

    @Deprecated(message = "Use constructor with surfaceId", replaceWith = @ReplaceWith(expression = "DrawerSlideEvent(surfaceId, viewId, offset)", imports = {}))
    public DrawerSlideEvent(int i11, float f11) {
        this(-1, i11, f11);
    }

    public DrawerSlideEvent(int i11, int i12, float f11) {
        super(i11, i12);
        this.offset = f11;
    }

    public final float getOffset() {
        return this.offset;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble(TypedValues.CycleType.S_WAVE_OFFSET, getOffset());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }
}
