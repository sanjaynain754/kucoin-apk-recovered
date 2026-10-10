package androidx.window.java.area;

import android.app.Activity;
import android.os.Binder;
import androidx.core.util.Consumer;
import androidx.window.area.WindowAreaController;
import androidx.window.area.WindowAreaInfo;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionCallback;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.java.core.CallbackToFlowAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowAreaControllerCallbackAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@ExperimentalWindowApi
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0007J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00102\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m90084d2 = {"Landroidx/window/java/area/WindowAreaControllerCallbackAdapter;", "Landroidx/window/area/WindowAreaController;", "controller", "Landroidx/window/java/core/CallbackToFlowAdapter;", "callbackToFlowAdapter", "<init>", "(Landroidx/window/area/WindowAreaController;Landroidx/window/java/core/CallbackToFlowAdapter;)V", "(Landroidx/window/area/WindowAreaController;)V", "Landroid/os/Binder;", InterfaceC33826o0.f71244p, "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/window/area/WindowAreaPresentationSessionCallback;", "windowAreaPresentationSessionCallback", "", "presentContentOnWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaPresentationSessionCallback;)V", "Landroidx/window/area/WindowAreaSessionCallback;", "windowAreaSessionCallback", "transferActivityToWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaSessionCallback;)V", "Landroidx/core/util/Consumer;", "", "Landroidx/window/area/WindowAreaInfo;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addWindowAreaInfoListListener", "(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "removeWindowAreaInfoListListener", "(Landroidx/core/util/Consumer;)V", "Landroidx/window/area/WindowAreaController;", "Landroidx/window/java/core/CallbackToFlowAdapter;", "Lkotlinx/coroutines/flow/e;", "getWindowAreaInfos", "()Lkotlinx/coroutines/flow/e;", "windowAreaInfos", "window-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WindowAreaControllerCallbackAdapter implements WindowAreaController {

    @NotNull
    private final CallbackToFlowAdapter callbackToFlowAdapter;

    @NotNull
    private final WindowAreaController controller;

    private WindowAreaControllerCallbackAdapter(WindowAreaController windowAreaController, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.controller = windowAreaController;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }

    public final void addWindowAreaInfoListListener(@NotNull Executor executor, @NotNull Consumer<List<WindowAreaInfo>> listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.callbackToFlowAdapter.connect(executor, listener, this.controller.getWindowAreaInfos());
    }

    @Override // androidx.window.area.WindowAreaController
    @NotNull
    public InterfaceC41634e<List<WindowAreaInfo>> getWindowAreaInfos() {
        return this.controller.getWindowAreaInfos();
    }

    public final void removeWindowAreaInfoListListener(@NotNull Consumer<List<WindowAreaInfo>> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.callbackToFlowAdapter.disconnect(listener);
    }

    @Override // androidx.window.area.WindowAreaController
    public void presentContentOnWindowArea(@NotNull Binder token, @NotNull Activity activity, @NotNull Executor executor, @NotNull WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        this.controller.presentContentOnWindowArea(token, activity, executor, windowAreaPresentationSessionCallback);
    }

    @Override // androidx.window.area.WindowAreaController
    public void transferActivityToWindowArea(@NotNull Binder token, @NotNull Activity activity, @NotNull Executor executor, @NotNull WindowAreaSessionCallback windowAreaSessionCallback) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(windowAreaSessionCallback, "windowAreaSessionCallback");
        this.controller.transferActivityToWindowArea(token, activity, executor, windowAreaSessionCallback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerCallbackAdapter(@NotNull WindowAreaController controller) {
        this(controller, new CallbackToFlowAdapter());
        Intrinsics.checkNotNullParameter(controller, "controller");
    }
}
