package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.p023db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes34.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
    }
}
