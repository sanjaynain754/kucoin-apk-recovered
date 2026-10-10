package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.p023db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public abstract void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);

    public Migration(int i11, int i12) {
        this.startVersion = i11;
        this.endVersion = i12;
    }
}
