package com.swmansion.rnscreens.bottomsheet;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DimmingViewPointerEvents.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/swmansion/rnscreens/bottomsheet/DimmingViewPointerEventsImpl;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "dimmingView", "Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/DimmingView;)V", "getDimmingView", "()Lcom/swmansion/rnscreens/bottomsheet/DimmingView;", "getPointerEvents", "Lcom/facebook/react/uimanager/PointerEvents;", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DimmingViewPointerEventsImpl implements ReactPointerEventsView {

    @NotNull
    private final DimmingView dimmingView;

    public DimmingViewPointerEventsImpl(@NotNull DimmingView dimmingView) {
        Intrinsics.checkNotNullParameter(dimmingView, "dimmingView");
        this.dimmingView = dimmingView;
    }

    @NotNull
    public final DimmingView getDimmingView() {
        return this.dimmingView;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return this.dimmingView.getBlockGestures$react_native_screens_release() ? PointerEvents.AUTO : PointerEvents.NONE;
    }
}
