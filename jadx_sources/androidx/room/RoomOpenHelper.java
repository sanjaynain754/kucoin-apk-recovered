package androidx.room;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.p023db.SimpleSQLiteQuery;
import androidx.sqlite.p023db.SupportSQLiteDatabase;
import androidx.sqlite.p023db.SupportSQLiteOpenHelper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    @Nullable
    private DatabaseConfiguration mConfiguration;

    @NonNull
    private final Delegate mDelegate;

    @NonNull
    private final String mIdentityHash;

    @NonNull
    private final String mLegacyHash;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class Delegate {
        public final int version;

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        @Deprecated
        public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public Delegate(int i11) {
            this.version = i11;
        }

        @NonNull
        public ValidationResult onValidateSchema(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            validateMigration(supportSQLiteDatabase);
            return new ValidationResult(true, null);
        }

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    public RoomOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration, @NonNull Delegate delegate, @NonNull String str, @NonNull String str2) {
        super(delegate.version);
        this.mConfiguration = databaseConfiguration;
        this.mDelegate = delegate;
        this.mIdentityHash = str;
        this.mLegacyHash = str2;
    }

    /* JADX INFO: loaded from: classes34.dex */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class ValidationResult {

        @Nullable
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z11, @Nullable String str) {
            this.isValid = z11;
            this.expectedFoundMsg = str;
        }
    }

    private void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    private static boolean hasEmptySchema(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) == 0) {
                z11 = true;
            }
            return z11;
        } finally {
            cursorQuery.close();
        }
    }

    private static boolean hasRoomMasterTable(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z11 = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0) {
                z11 = true;
            }
            return z11;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i11, int i12) {
        List<Migration> listFindMigrationPath;
        DatabaseConfiguration databaseConfiguration = this.mConfiguration;
        if (databaseConfiguration == null || (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i11, i12)) == null) {
            DatabaseConfiguration databaseConfiguration2 = this.mConfiguration;
            if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(i11, i12)) {
                this.mDelegate.dropAllTables(supportSQLiteDatabase);
                this.mDelegate.createAllTables(supportSQLiteDatabase);
                return;
            }
            throw new IllegalStateException("A migration from " + i11 + " to " + i12 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.mDelegate.onPreMigrate(supportSQLiteDatabase);
        Iterator<Migration> it = listFindMigrationPath.iterator();
        while (it.hasNext()) {
            it.next().migrate(supportSQLiteDatabase);
        }
        ValidationResult validationResultOnValidateSchema = this.mDelegate.onValidateSchema(supportSQLiteDatabase);
        if (validationResultOnValidateSchema.isValid) {
            this.mDelegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg);
        }
    }

    private void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        String string;
        if (hasRoomMasterTable(supportSQLiteDatabase)) {
            Cursor cursorQuery = supportSQLiteDatabase.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
            try {
                if (cursorQuery.moveToFirst()) {
                    string = cursorQuery.getString(0);
                } else {
                    string = null;
                }
                cursorQuery.close();
                if (!this.mIdentityHash.equals(string) && !this.mLegacyHash.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        ValidationResult validationResultOnValidateSchema = this.mDelegate.onValidateSchema(supportSQLiteDatabase);
        if (validationResultOnValidateSchema.isValid) {
            this.mDelegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
        } else {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
        }
    }

    private void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.mIdentityHash));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onConfigure(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        boolean zHasEmptySchema = hasEmptySchema(supportSQLiteDatabase);
        this.mDelegate.createAllTables(supportSQLiteDatabase);
        if (!zHasEmptySchema) {
            ValidationResult validationResultOnValidateSchema = this.mDelegate.onValidateSchema(supportSQLiteDatabase);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(supportSQLiteDatabase);
        this.mDelegate.onCreate(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i11, int i12) {
        onUpgrade(supportSQLiteDatabase, i11, i12);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onOpen(supportSQLiteDatabase);
        checkIdentity(supportSQLiteDatabase);
        this.mDelegate.onOpen(supportSQLiteDatabase);
        this.mConfiguration = null;
    }

    public RoomOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration, @NonNull Delegate delegate, @NonNull String str) {
        this(databaseConfiguration, delegate, "", str);
    }
}
