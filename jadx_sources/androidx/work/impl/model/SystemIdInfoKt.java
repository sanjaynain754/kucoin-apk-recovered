package androidx.work.impl.model;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SystemIdInfo.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"systemIdInfo", "Landroidx/work/impl/model/SystemIdInfo;", "generationalId", "Landroidx/work/impl/model/WorkGenerationalId;", "systemId", "", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class SystemIdInfoKt {
    @NotNull
    public static final SystemIdInfo systemIdInfo(@NotNull WorkGenerationalId generationalId, int i11) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i11);
    }
}
