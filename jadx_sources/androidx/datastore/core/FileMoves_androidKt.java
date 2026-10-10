package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileMoves.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, m90084d2 = {"atomicMoveTo", "", "Ljava/io/File;", "toFile", "datastore-core_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(@NotNull File file, @NotNull File toFile) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.INSTANCE.move(file, toFile) : file.renameTo(toFile);
    }
}
