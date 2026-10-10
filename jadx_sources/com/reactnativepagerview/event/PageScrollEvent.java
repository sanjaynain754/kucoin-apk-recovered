package com.reactnativepagerview.event;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PageScrollEvent.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/reactnativepagerview/event/PageScrollEvent;", "Lcom/facebook/react/uimanager/events/Event;", "", "viewTag", "mPosition", "", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(IIF)V", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/bridge/WritableMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/facebook/react/bridge/WritableMap;", "I", "b", "F", "mOffset", "c", "Companion", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PageScrollEvent extends Event<PageScrollEvent> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int mPosition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float mOffset;

    public PageScrollEvent(int i11, int i12, float f11) {
        super(i11);
        this.mPosition = i12;
        this.mOffset = (Float.isInfinite(f11) || Float.isNaN(f11)) ? 0.0f : f11;
    }

    /* JADX INFO: renamed from: a */
    public final WritableMap m68172a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(ViewProps.POSITION, this.mPosition);
        writableMapCreateMap.putDouble(TypedValues.CycleType.S_WAVE_OFFSET, this.mOffset);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), m68172a());
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return "topPageScroll";
    }
}
