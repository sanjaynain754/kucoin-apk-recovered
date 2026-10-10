package androidx.window.area;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.area.WindowAreaComponent;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RearDisplaySessionImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@ExperimentalWindowApi
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Landroidx/window/area/RearDisplaySessionImpl;", "Landroidx/window/area/WindowAreaSession;", "windowAreaComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "(Landroidx/window/extensions/area/WindowAreaComponent;)V", "close", "", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RearDisplaySessionImpl implements WindowAreaSession {

    @NotNull
    private final WindowAreaComponent windowAreaComponent;

    @Override // androidx.window.area.WindowAreaSession
    public void close() {
        this.windowAreaComponent.endRearDisplaySession();
    }

    public RearDisplaySessionImpl(@NotNull WindowAreaComponent windowAreaComponent) {
        Intrinsics.checkNotNullParameter(windowAreaComponent, "windowAreaComponent");
        this.windowAreaComponent = windowAreaComponent;
    }
}
