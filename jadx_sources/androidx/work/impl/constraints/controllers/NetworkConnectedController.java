package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, m90084d2 = {"Landroidx/work/impl/constraints/controllers/NetworkConnectedController;", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "Landroidx/work/impl/constraints/NetworkState;", "tracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "hasConstraint", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "isConstrained", "value", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class NetworkConnectedController extends ConstraintController<NetworkState> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(@NotNull NetworkState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.isConnected() && value.isValidated()) ? false : true;
        }
        return !value.isConnected();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkConnectedController(@NotNull ConstraintTracker<NetworkState> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (workSpec.constraints.getRequiredNetworkType() == NetworkType.CONNECTED) {
            return true;
        }
        return false;
    }
}
