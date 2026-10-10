package androidx.lifecycle;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.runtime.C2657R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewTreeLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\b\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"setViewTreeLifecycleOwner", "", "Landroid/view/View;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "set", "findViewTreeLifecycleOwner", "get", "lifecycle-runtime_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@JvmName(name = "ViewTreeLifecycleOwner")
public final class ViewTreeLifecycleOwner {
    @JvmName(name = "get")
    @Nullable
    public static final LifecycleOwner get(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C2657R.id.view_tree_lifecycle_owner);
            LifecycleOwner lifecycleOwner = tag instanceof LifecycleOwner ? (LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    @JvmName(name = "set")
    public static final void set(@NotNull View view, @Nullable LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C2657R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
