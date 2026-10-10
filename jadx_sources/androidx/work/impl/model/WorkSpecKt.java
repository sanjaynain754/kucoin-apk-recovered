package androidx.work.impl.model;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkSpec.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"generationalId", "Landroidx/work/impl/model/WorkGenerationalId;", "Landroidx/work/impl/model/WorkSpec;", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class WorkSpecKt {
    @NotNull
    public static final WorkGenerationalId generationalId(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.id, workSpec.getGeneration());
    }
}
