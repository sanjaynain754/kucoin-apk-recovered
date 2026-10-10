package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fJ\u000e\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "lifecycleCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "dispatchOnFragmentActivityCreated", "", "f", "Landroidx/fragment/app/Fragment;", "savedInstanceState", "Landroid/os/Bundle;", "onlyRecursive", "", "dispatchOnFragmentAttached", "dispatchOnFragmentCreated", "dispatchOnFragmentDestroyed", "dispatchOnFragmentDetached", "dispatchOnFragmentPaused", "dispatchOnFragmentPreAttached", "dispatchOnFragmentPreCreated", "dispatchOnFragmentResumed", "dispatchOnFragmentSaveInstanceState", "outState", "dispatchOnFragmentStarted", "dispatchOnFragmentStopped", "dispatchOnFragmentViewCreated", "v", "Landroid/view/View;", "dispatchOnFragmentViewDestroyed", "registerFragmentLifecycleCallbacks", "cb", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "recursive", "unregisterFragmentLifecycleCallbacks", "FragmentLifecycleCallbacksHolder", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FragmentLifecycleCallbacksDispatcher {

    @NotNull
    private final FragmentManager fragmentManager;

    @NotNull
    private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> lifecycleCallbacks;

    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "", TUIConstants.TUIChat.CALL_BACK, "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "recursive", "", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "getCallback", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "getRecursive", "()Z", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class FragmentLifecycleCallbacksHolder {

        @NotNull
        private final FragmentManager.FragmentLifecycleCallbacks callback;
        private final boolean recursive;

        public FragmentLifecycleCallbacksHolder(@NotNull FragmentManager.FragmentLifecycleCallbacks callback, boolean z11) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
            this.recursive = z11;
        }

        @NotNull
        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }

        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void dispatchOnFragmentActivityCreated(@NotNull Fragment f11, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(f11, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentActivityCreated(this.fragmentManager, f11, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentAttached(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentAttached(this.fragmentManager, f11, context);
            }
        }
    }

    public final void dispatchOnFragmentCreated(@NotNull Fragment f11, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(f11, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentCreated(this.fragmentManager, f11, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentDestroyed(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentDestroyed(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentDetached(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentDetached(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentPaused(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentPaused(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentPreAttached(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentPreAttached(this.fragmentManager, f11, context);
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(@NotNull Fragment f11, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(f11, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentPreCreated(this.fragmentManager, f11, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentResumed(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentResumed(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(@NotNull Fragment f11, @NotNull Bundle outState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(f11, outState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentSaveInstanceState(this.fragmentManager, f11, outState);
            }
        }
    }

    public final void dispatchOnFragmentStarted(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentStarted(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentStopped(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentStopped(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentViewCreated(@NotNull Fragment f11, @NotNull View v11, @Nullable Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Intrinsics.checkNotNullParameter(v11, "v");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(f11, v11, savedInstanceState, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentViewCreated(this.fragmentManager, f11, v11, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(@NotNull Fragment f11, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(f11, true);
        }
        for (FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder : this.lifecycleCallbacks) {
            if (!onlyRecursive || fragmentLifecycleCallbacksHolder.getRecursive()) {
                fragmentLifecycleCallbacksHolder.getCallback().onFragmentViewDestroyed(this.fragmentManager, f11);
            }
        }
    }

    public final void registerFragmentLifecycleCallbacks(@NotNull FragmentManager.FragmentLifecycleCallbacks cb2, boolean recursive) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.lifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(cb2, recursive));
    }

    public final void unregisterFragmentLifecycleCallbacks(@NotNull FragmentManager.FragmentLifecycleCallbacks cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (this.lifecycleCallbacks.get(i11).getCallback() == cb2) {
                        this.lifecycleCallbacks.remove(i11);
                        break;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
