package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.views.textinput.ReactContentSizeChangedEvent;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentSizeChangeEvent.kt */
/* JADX INFO: loaded from: classes45.dex */
@Deprecated(message = "Please define your own event for custom components")
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB!\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/react/uimanager/events/ContentSizeChangeEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "width", "height", "<init>", "(IIII)V", "(III)V", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ContentSizeChangeEvent extends Event<ContentSizeChangeEvent> {
    private final int height;
    private final int width;

    public ContentSizeChangeEvent(int i11, int i12, int i13, int i14) {
        super(i11, i12);
        this.width = i13;
        this.height = i14;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", PixelUtil.toDIPFromPixel(this.width));
        writableMapCreateMap.putDouble("height", PixelUtil.toDIPFromPixel(this.height));
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return ReactContentSizeChangedEvent.EVENT_NAME;
    }

    @Deprecated(message = "Please specify surfaceId explicitly in the constructor.", replaceWith = @ReplaceWith(expression = "constructor(surfaceId, viewTag, width, height)", imports = {}))
    public ContentSizeChangeEvent(int i11, int i12, int i13) {
        this(-1, i11, i12, i13);
    }
}
