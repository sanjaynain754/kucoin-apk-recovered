package androidx.datastore.migrations;

import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"MIGRATE_ALL_KEYS", "", "", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "datastore_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SharedPreferencesMigration_androidKt {

    @NotNull
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    @NotNull
    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }
}
