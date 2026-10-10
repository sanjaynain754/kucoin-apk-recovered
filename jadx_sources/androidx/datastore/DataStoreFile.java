package androidx.datastore;

import android.content.Context;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataStoreFile.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"dataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", "fileName", "", "datastore_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmName(name = "DataStoreFile")
public final class DataStoreFile {
    @NotNull
    public static final File dataStoreFile(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
