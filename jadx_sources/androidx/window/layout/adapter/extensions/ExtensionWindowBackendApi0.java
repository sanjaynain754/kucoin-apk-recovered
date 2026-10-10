package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExtensionWindowBackendApi0.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\r"}, m90084d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi0;", "Landroidx/window/layout/adapter/WindowBackend;", "()V", "registerLayoutChangeCallback", "", "context", "Landroid/content/Context;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "unregisterLayoutChangeCallback", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ExtensionWindowBackendApi0 implements WindowBackend {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerLayoutChangeCallback$lambda$0(Consumer callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.accept(new WindowLayoutInfo(CollectionsKt.emptyList()));
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(@NotNull Context context, @NotNull Executor executor, @NotNull final Consumer<WindowLayoutInfo> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executor.execute(new Runnable() { // from class: androidx.window.layout.adapter.extensions.a
            @Override // java.lang.Runnable
            public final void run() {
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0(callback);
            }
        });
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(@NotNull Consumer<WindowLayoutInfo> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
