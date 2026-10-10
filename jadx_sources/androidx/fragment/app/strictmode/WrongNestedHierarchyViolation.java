package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WrongNestedHierarchyViolation.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;", "Landroidx/fragment/app/strictmode/Violation;", "fragment", "Landroidx/fragment/app/Fragment;", "expectedParentFragment", "containerId", "", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "getContainerId", "()I", "getExpectedParentFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;

    @NotNull
    private final Fragment expectedParentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(@NotNull Fragment fragment, @NotNull Fragment expectedParentFragment, int i11) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i11 + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.expectedParentFragment = expectedParentFragment;
        this.containerId = i11;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    @NotNull
    public final Fragment getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
