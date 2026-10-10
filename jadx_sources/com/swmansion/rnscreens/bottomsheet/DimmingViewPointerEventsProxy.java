package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: DimmingViewPointerEvents.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000b"}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsProxy;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "pointerEventsImpl", "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsImpl;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsImpl;)V", "getPointerEventsImpl", "()Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsImpl;", "setPointerEventsImpl", "getPointerEvents", "Lcom/facebook/react/uimanager/PointerEvents;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DimmingViewPointerEventsProxy implements ReactPointerEventsView {

    @Nullable
    private DimmingViewPointerEventsImpl pointerEventsImpl;

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        PointerEvents pointerEvents;
        DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl = this.pointerEventsImpl;
        return (dimmingViewPointerEventsImpl == null || (pointerEvents = dimmingViewPointerEventsImpl.getPointerEvents()) == null) ? PointerEvents.NONE : pointerEvents;
    }

    @Nullable
    public final DimmingViewPointerEventsImpl getPointerEventsImpl() {
        return this.pointerEventsImpl;
    }

    public final void setPointerEventsImpl(@Nullable DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl) {
        this.pointerEventsImpl = dimmingViewPointerEventsImpl;
    }

    public DimmingViewPointerEventsProxy(@Nullable DimmingViewPointerEventsImpl dimmingViewPointerEventsImpl) {
        this.pointerEventsImpl = dimmingViewPointerEventsImpl;
    }
}
