package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "path", "Lokio/Path;", "datastore-core-okio"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class OkioStorageKt {
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(path.normalized().toString());
    }
}
