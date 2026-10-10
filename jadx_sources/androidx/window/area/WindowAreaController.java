package androidx.window.area;

import android.app.Activity;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.window.area.utils.DeviceUtils;
import androidx.window.core.BuildConfig;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.WindowAreaComponent;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: WindowAreaController.kt */
/* JADX INFO: loaded from: classes34.dex */
@ExperimentalWindowApi
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Landroidx/window/area/WindowAreaController;", "", "Landroid/os/Binder;", InterfaceC33826o0.f71244p, "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/window/area/WindowAreaSessionCallback;", "windowAreaSessionCallback", "", "transferActivityToWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaSessionCallback;)V", "Landroidx/window/area/WindowAreaPresentationSessionCallback;", "windowAreaPresentationSessionCallback", "presentContentOnWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaPresentationSessionCallback;)V", "Lkotlinx/coroutines/flow/e;", "", "Landroidx/window/area/WindowAreaInfo;", "getWindowAreaInfos", "()Lkotlinx/coroutines/flow/e;", "windowAreaInfos", "Companion", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface WindowAreaController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: WindowAreaController.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\nH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/window/area/WindowAreaController$Companion;", "", "()V", "TAG", "", "decorator", "Landroidx/window/area/WindowAreaControllerDecorator;", "getOrCreate", "Landroidx/window/area/WindowAreaController;", "overrideDecorator", "", "overridingDecorator", "reset", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static final String TAG = Reflection.getOrCreateKotlinClass(WindowAreaController.class).getSimpleName();

        @NotNull
        private static WindowAreaControllerDecorator decorator = EmptyDecorator.INSTANCE;

        /* JADX WARN: Code duplicated, block: B:18:0x0058  */
        @JvmStatic
        @JvmName(name = "getOrCreate")
        @NotNull
        public final WindowAreaController getOrCreate() {
            WindowAreaController emptyWindowAreaControllerImpl;
            WindowAreaComponent windowAreaComponent = null;
            try {
                ClassLoader classLoader = Companion.class.getClassLoader();
                if (classLoader != null) {
                    windowAreaComponent = new SafeWindowAreaComponentProvider(classLoader).getWindowAreaComponent();
                }
            } catch (Throwable unused) {
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                    Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            if (Build.VERSION.SDK_INT <= 29 || windowAreaComponent == null) {
                emptyWindowAreaControllerImpl = new EmptyWindowAreaControllerImpl();
            } else {
                ExtensionsUtil extensionsUtil = ExtensionsUtil.INSTANCE;
                if (extensionsUtil.getSafeVendorApiLevel() < 3) {
                    DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
                    String MANUFACTURER = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                    String MODEL = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    if (!deviceUtils.hasDeviceMetrics$window_release(MANUFACTURER, MODEL)) {
                        emptyWindowAreaControllerImpl = new EmptyWindowAreaControllerImpl();
                    }
                }
                Intrinsics.checkNotNull(windowAreaComponent);
                emptyWindowAreaControllerImpl = new WindowAreaControllerImpl(windowAreaComponent, extensionsUtil.getSafeVendorApiLevel());
            }
            return decorator.decorate(emptyWindowAreaControllerImpl);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        private Companion() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(@NotNull WindowAreaControllerDecorator overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }
    }

    @NotNull
    InterfaceC41634e<List<WindowAreaInfo>> getWindowAreaInfos();

    void presentContentOnWindowArea(@NotNull Binder token, @NotNull Activity activity, @NotNull Executor executor, @NotNull WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback);

    void transferActivityToWindowArea(@NotNull Binder token, @NotNull Activity activity, @NotNull Executor executor, @NotNull WindowAreaSessionCallback windowAreaSessionCallback);

    @JvmStatic
    @JvmName(name = "getOrCreate")
    @NotNull
    static WindowAreaController getOrCreate() {
        return INSTANCE.getOrCreate();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void overrideDecorator(@NotNull WindowAreaControllerDecorator windowAreaControllerDecorator) {
        INSTANCE.overrideDecorator(windowAreaControllerDecorator);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void reset() {
        INSTANCE.reset();
    }
}
