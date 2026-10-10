package com.swmansion.rnscreens.events;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ScreenEventEmitter.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m90084d2 = {"Lcom/swmansion/rnscreens/events/ScreenEventEmitter;", "", "screen", "Lcom/swmansion/rnscreens/Screen;", "<init>", "(Lcom/swmansion/rnscreens/Screen;)V", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "reactEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactSurfaceId", "", "getReactSurfaceId", "()I", "dispatchOnWillAppear", "", "()Lkotlin/Unit;", "dispatchOnAppear", "dispatchOnWillDisappear", "dispatchOnDisappear", "dispatchOnDismissed", "dispatchTransitionProgress", "progress", "", "isExitAnimation", "", "isGoingForward", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreenEventEmitter {

    @NotNull
    private final Screen screen;

    public final void dispatchTransitionProgress(float progress, boolean isExitAnimation, boolean isGoingForward) {
        float fCoerceIn = RangesKt.coerceIn(progress, 0.0f, 1.0f);
        short coalescingKey = ScreenFragment.INSTANCE.getCoalescingKey(fCoerceIn);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new ScreenTransitionProgressEvent(getReactSurfaceId(), this.screen.getId(), fCoerceIn, isExitAnimation, isGoingForward, coalescingKey));
        }
    }

    @Nullable
    public final EventDispatcher getReactEventDispatcher() {
        return this.screen.getReactEventDispatcher();
    }

    public final int getReactSurfaceId() {
        return UIManagerHelper.getSurfaceId(this.screen);
    }

    @NotNull
    public final Screen getScreen() {
        return this.screen;
    }

    public ScreenEventEmitter(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
    }

    @Nullable
    public final Unit dispatchOnAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new ScreenAppearEvent(getReactSurfaceId(), this.screen.getId()));
            return Unit.INSTANCE;
        }
        return null;
    }

    @Nullable
    public final Unit dispatchOnDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new ScreenDisappearEvent(getReactSurfaceId(), this.screen.getId()));
            return Unit.INSTANCE;
        }
        return null;
    }

    @Nullable
    public final Unit dispatchOnDismissed() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new ScreenDismissedEvent(getReactSurfaceId(), this.screen.getId()));
            return Unit.INSTANCE;
        }
        return null;
    }

    @Nullable
    public final Unit dispatchOnWillAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new ScreenWillAppearEvent(getReactSurfaceId(), this.screen.getId()));
            return Unit.INSTANCE;
        }
        return null;
    }

    @Nullable
    public final Unit dispatchOnWillDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new ScreenWillDisappearEvent(getReactSurfaceId(), this.screen.getId()));
            return Unit.INSTANCE;
        }
        return null;
    }
}
