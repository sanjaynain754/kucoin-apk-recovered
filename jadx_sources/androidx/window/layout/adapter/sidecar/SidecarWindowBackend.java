package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.Version;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.WindowBackend;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SidecarWindowBackend.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0016\u0010\u001d\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m90084d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;", "Landroidx/window/layout/adapter/WindowBackend;", "windowExtension", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "(Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;)V", "getWindowExtension", "()Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "setWindowExtension", "windowLayoutChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "getWindowLayoutChangeCallbacks$annotations", "()V", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "callbackRemovedForActivity", "", "activity", "Landroid/app/Activity;", "isActivityRegistered", "", "registerLayoutChangeCallback", "context", "Landroid/content/Context;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "unregisterLayoutChangeCallback", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSidecarWindowBackend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SidecarWindowBackend.kt\nandroidx/window/layout/adapter/sidecar/SidecarWindowBackend\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n288#2,2:253\n1747#2,3:255\n1747#2,3:258\n*S KotlinDebug\n*F\n+ 1 SidecarWindowBackend.kt\nandroidx/window/layout/adapter/sidecar/SidecarWindowBackend\n*L\n84#1:253,2\n98#1:255,3\n135#1:258,3\n*E\n"})
public final class SidecarWindowBackend implements WindowBackend {
    public static final boolean DEBUG = false;

    @NotNull
    private static final String TAG = "WindowServer";

    @Nullable
    private static volatile SidecarWindowBackend globalInstance;

    @GuardedBy("globalLock")
    @VisibleForTesting
    @Nullable
    private ExtensionInterfaceCompat windowExtension;

    @NotNull
    private final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$Companion;", "", "()V", "DEBUG", "", "TAG", "", "globalInstance", "Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "context", "Landroid/content/Context;", "initAndVerifyExtension", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "isSidecarVersionSupported", "sidecarVersion", "Landroidx/window/core/Version;", "resetInstance", "", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public final boolean isSidecarVersionSupported(@Nullable Version sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(Version.INSTANCE.getVERSION_0_1()) >= 0;
        }

        @VisibleForTesting
        public final void resetInstance() {
            SidecarWindowBackend.globalInstance = null;
        }

        private Companion() {
        }

        @NotNull
        public final SidecarWindowBackend getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (SidecarWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = SidecarWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (SidecarWindowBackend.globalInstance == null) {
                        SidecarWindowBackend.globalInstance = new SidecarWindowBackend(SidecarWindowBackend.INSTANCE.initAndVerifyExtension(context));
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            SidecarWindowBackend sidecarWindowBackend = SidecarWindowBackend.globalInstance;
            Intrinsics.checkNotNull(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        @Nullable
        public final ExtensionInterfaceCompat initAndVerifyExtension(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                if (isSidecarVersionSupported(SidecarCompat.INSTANCE.getSidecarVersion())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.validateExtensionInterface()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "(Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;)V", "onWindowLayoutChanged", "", "activity", "Landroid/app/Activity;", "newLayout", "Landroidx/window/layout/WindowLayoutInfo;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @VisibleForTesting
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        public ExtensionListenerImpl() {
        }

        @Override // androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(@NotNull Activity activity, @NotNull WindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : SidecarWindowBackend.this.getWindowLayoutChangeCallbacks()) {
                if (Intrinsics.areEqual(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    windowLayoutChangeCallbackWrapper.accept(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m90084d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "activity", "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "getActivity", "()Landroid/app/Activity;", "getCallback", "()Landroidx/core/util/Consumer;", "lastInfo", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo", "(Landroidx/window/layout/WindowLayoutInfo;)V", "accept", "", "newLayoutInfo", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class WindowLayoutChangeCallbackWrapper {

        @NotNull
        private final Activity activity;

        @NotNull
        private final Consumer<WindowLayoutInfo> callback;

        @NotNull
        private final Executor executor;

        @Nullable
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        public final void accept(@NotNull final WindowLayoutInfo newLayoutInfo) {
            Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.adapter.sidecar.b
                @Override // java.lang.Runnable
                public final void run() {
                    SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.accept$lambda$0(this.f3718b, newLayoutInfo);
                }
            });
        }

        @NotNull
        public final Activity getActivity() {
            return this.activity;
        }

        @NotNull
        public final Consumer<WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        @Nullable
        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(@Nullable WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void accept$lambda$0(WindowLayoutChangeCallbackWrapper this$0, WindowLayoutInfo newLayoutInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
            this$0.callback.accept(newLayoutInfo);
        }
    }

    @GuardedBy("sLock")
    private final void callbackRemovedForActivity(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
        if (extensionInterfaceCompat != null) {
            extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
        }
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    @NotNull
    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.window.layout.adapter.WindowBackend
    public void registerLayoutChangeCallback(@NotNull Context context, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> callback) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Unit unit = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = globalLock;
            reentrantLock.lock();
            try {
                ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
                if (extensionInterfaceCompat == null) {
                    callback.accept(new WindowLayoutInfo(CollectionsKt.emptyList()));
                    reentrantLock.unlock();
                    return;
                }
                boolean zIsActivityRegistered = isActivityRegistered(activity);
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, callback);
                this.windowLayoutChangeCallbacks.add(windowLayoutChangeCallbackWrapper);
                if (zIsActivityRegistered) {
                    Iterator<T> it = this.windowLayoutChangeCallbacks.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(activity, ((WindowLayoutChangeCallbackWrapper) next).getActivity()));
                    WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) next;
                    WindowLayoutInfo lastInfo = windowLayoutChangeCallbackWrapper2 != null ? windowLayoutChangeCallbackWrapper2.getLastInfo() : null;
                    if (lastInfo != null) {
                        windowLayoutChangeCallbackWrapper.accept(lastInfo);
                    }
                } else {
                    extensionInterfaceCompat.onWindowLayoutChangeListenerAdded(activity);
                }
                Unit unit2 = Unit.INSTANCE;
                reentrantLock.unlock();
                unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (unit == null) {
            callback.accept(new WindowLayoutInfo(CollectionsKt.emptyList()));
        }
    }

    public final void setWindowExtension(@Nullable ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public void unregisterLayoutChangeCallback(@NotNull Consumer<WindowLayoutInfo> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (globalLock) {
            try {
                if (this.windowExtension == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (WindowLayoutChangeCallbackWrapper callbackWrapper : this.windowLayoutChangeCallbacks) {
                    if (callbackWrapper.getCallback() == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.windowLayoutChangeCallbacks.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    callbackRemovedForActivity(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public SidecarWindowBackend(@Nullable ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 != null) {
            extensionInterfaceCompat2.setExtensionCallback(new ExtensionListenerImpl());
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }
}
