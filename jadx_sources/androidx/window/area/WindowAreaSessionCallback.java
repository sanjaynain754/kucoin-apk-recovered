package androidx.window.area;

import androidx.window.core.ExperimentalWindowApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: WindowAreaSessionCallback.kt */
/* JADX INFO: loaded from: classes34.dex */
@ExperimentalWindowApi
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Landroidx/window/area/WindowAreaSessionCallback;", "", "onSessionEnded", "", "t", "", "onSessionStarted", "session", "Landroidx/window/area/WindowAreaSession;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface WindowAreaSessionCallback {
    void onSessionEnded(@Nullable Throwable t11);

    void onSessionStarted(@NotNull WindowAreaSession session);
}
