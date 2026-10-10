package io.flutter.embedding.android;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {

    @NonNull
    final WindowInfoTrackerCallbackAdapter adapter;

    public void addWindowLayoutInfoListener(@NonNull Activity activity, @NonNull Executor executor, @NonNull Consumer<WindowLayoutInfo> consumer) {
        this.adapter.addWindowLayoutInfoListener(activity, executor, consumer);
    }

    public void removeWindowLayoutInfoListener(@NonNull Consumer<WindowLayoutInfo> consumer) {
        this.adapter.removeWindowLayoutInfoListener(consumer);
    }

    public WindowInfoRepositoryCallbackAdapterWrapper(@NonNull WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.adapter = windowInfoTrackerCallbackAdapter;
    }
}
