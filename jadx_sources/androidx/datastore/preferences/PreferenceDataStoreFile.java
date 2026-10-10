package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferenceDataStoreFile.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"preferencesDataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", "name", "", "datastore-preferences_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmName(name = "PreferenceDataStoreFile")
public final class PreferenceDataStoreFile {
    @NotNull
    public static final File preferencesDataStoreFile(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return DataStoreFile.dataStoreFile(context, name + ".preferences_pb");
    }
}
