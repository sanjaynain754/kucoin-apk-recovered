package com.reactnativepagerview.event;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PageSelectedEvent.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/reactnativepagerview/event/PageSelectedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "", "viewTag", "mPosition", "<init>", "(II)V", "Lcom/facebook/react/bridge/WritableMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/facebook/react/bridge/WritableMap;", "", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "I", "b", "Companion", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PageSelectedEvent extends Event<PageSelectedEvent> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int mPosition;

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    public PageSelectedEvent(int i11, int i12) {
        super(i11);
        this.mPosition = i12;
    }

    /* JADX INFO: renamed from: a */
    private final WritableMap m68174a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(ViewProps.POSITION, this.mPosition);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), m68174a());
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return "topPageSelected";
    }
}
