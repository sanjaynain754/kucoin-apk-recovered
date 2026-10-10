package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: WorkConstraintsCallback.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, m90084d2 = {"Landroidx/work/impl/constraints/WorkConstraintsCallback;", "", "onAllConstraintsMet", "", "workSpecs", "", "Landroidx/work/impl/model/WorkSpec;", "onAllConstraintsNotMet", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(@NotNull List<WorkSpec> workSpecs);

    void onAllConstraintsNotMet(@NotNull List<WorkSpec> workSpecs);
}
