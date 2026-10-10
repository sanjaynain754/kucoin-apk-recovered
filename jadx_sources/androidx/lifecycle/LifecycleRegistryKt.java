package androidx.lifecycle;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LifecycleRegistry.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u0007"}, m90084d2 = {"checkLifecycleStateTransition", "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "current", "Landroidx/lifecycle/Lifecycle$State;", "next", "lifecycle-runtime_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LifecycleRegistryKt {
    public static final void checkLifecycleStateTransition(@Nullable LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State current, @NotNull Lifecycle.State next) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == Lifecycle.State.INITIALIZED && next == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + next + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        if (current != state || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + state + "' and cannot be moved to `" + next + "` in component " + lifecycleOwner).toString());
    }
}
