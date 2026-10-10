package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackend;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NotImplementedError;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/e;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/e;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/e;", "Companion", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWindowInfoTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfoTracker.kt\nandroidx/window/layout/WindowInfoTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public interface WindowInfoTracker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: WindowInfoTracker.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0007J\b\u0010\u0017\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "()V", "DEBUG", "", "TAG", "", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "extensionBackend", "Landroidx/window/layout/adapter/WindowBackend;", "getExtensionBackend$window_release$annotations", "getExtensionBackend$window_release", "()Landroidx/window/layout/adapter/WindowBackend;", "extensionBackend$delegate", "Lkotlin/Lazy;", "getOrCreate", "Landroidx/window/layout/WindowInfoTracker;", "context", "Landroid/content/Context;", "overrideDecorator", "", "overridingDecorator", "reset", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static final String TAG = Reflection.getOrCreateKotlinClass(WindowInfoTracker.class).getSimpleName();

        /* JADX INFO: renamed from: extensionBackend$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy<WindowBackend> extensionBackend = LazyKt.lazy(new Function0<WindowBackend>() { // from class: androidx.window.layout.WindowInfoTracker$Companion$extensionBackend$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final WindowBackend invoke() {
                WindowLayoutComponent windowLayoutComponent;
                try {
                    ClassLoader loader = WindowInfoTracker.class.getClassLoader();
                    SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = loader != null ? new SafeWindowLayoutComponentProvider(loader, new ConsumerAdapter(loader)) : null;
                    if (safeWindowLayoutComponentProvider == null || (windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent()) == null) {
                        return null;
                    }
                    ExtensionWindowBackend.Companion companion = ExtensionWindowBackend.Companion;
                    Intrinsics.checkNotNullExpressionValue(loader, "loader");
                    return companion.newInstance(windowLayoutComponent, new ConsumerAdapter(loader));
                } catch (Throwable unused) {
                    if (WindowInfoTracker.Companion.DEBUG) {
                        Log.d(WindowInfoTracker.Companion.TAG, "Failed to load WindowExtensions");
                    }
                    return null;
                }
            }
        });

        @NotNull
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        @Nullable
        public final WindowBackend getExtensionBackend$window_release() {
            return extensionBackend.getValue();
        }

        @JvmStatic
        @JvmName(name = "getOrCreate")
        @NotNull
        public final WindowInfoTracker getOrCreate(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WindowBackend extensionBackend$window_release = getExtensionBackend$window_release();
            if (extensionBackend$window_release == null) {
                extensionBackend$window_release = SidecarWindowBackend.INSTANCE.getInstance(context);
            }
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, extensionBackend$window_release));
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(@NotNull WindowInfoTrackerDecorator overridingDecorator) {
            Intrinsics.checkNotNullParameter(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        private Companion() {
        }

        public static /* synthetic */ void getExtensionBackend$window_release$annotations() {
        }
    }

    @NotNull
    InterfaceC41634e<WindowLayoutInfo> windowLayoutInfo(@NotNull Activity activity);

    @NotNull
    default InterfaceC41634e<WindowLayoutInfo> windowLayoutInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        InterfaceC41634e<WindowLayoutInfo> interfaceC41634eWindowLayoutInfo = activity != null ? windowLayoutInfo(activity) : null;
        if (interfaceC41634eWindowLayoutInfo != null) {
            return interfaceC41634eWindowLayoutInfo;
        }
        throw new NotImplementedError("Must override windowLayoutInfo(context) and provide an implementation.");
    }

    @JvmStatic
    @JvmName(name = "getOrCreate")
    @NotNull
    static WindowInfoTracker getOrCreate(@NotNull Context context) {
        return INSTANCE.getOrCreate(context);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void overrideDecorator(@NotNull WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        INSTANCE.overrideDecorator(windowInfoTrackerDecorator);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    static void reset() {
        INSTANCE.reset();
    }
}
