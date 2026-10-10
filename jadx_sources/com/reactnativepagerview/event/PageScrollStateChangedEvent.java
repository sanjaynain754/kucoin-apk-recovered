package com.reactnativepagerview.event;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PageScrollStateChangedEvent.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"Lcom/reactnativepagerview/event/PageScrollStateChangedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "", "viewTag", "", "mPageScrollState", "<init>", "(ILjava/lang/String;)V", "Lcom/facebook/react/bridge/WritableMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/facebook/react/bridge/WritableMap;", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Ljava/lang/String;", "b", "Companion", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PageScrollStateChangedEvent extends Event<PageScrollStateChangedEvent> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String mPageScrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageScrollStateChangedEvent(int i11, @NotNull String mPageScrollState) {
        super(i11);
        Intrinsics.checkNotNullParameter(mPageScrollState, "mPageScrollState");
        this.mPageScrollState = mPageScrollState;
    }

    /* JADX INFO: renamed from: a */
    private final WritableMap m68173a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("pageScrollState", this.mPageScrollState);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), m68173a());
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return "topPageScrollStateChanged";
    }
}
