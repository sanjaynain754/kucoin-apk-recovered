package androidx.datastore.core;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InterProcessCoordinator.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "file", "Ljava/io/File;", "datastore-core_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class InterProcessCoordinator_jvmKt {
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
