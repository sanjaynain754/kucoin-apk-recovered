package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.p023db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes34.dex */
final class AutoClosingRoomOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    @NonNull
    private final AutoCloser mAutoCloser;

    @NonNull
    private final SupportSQLiteOpenHelper.Factory mDelegate;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NonNull
    public AutoClosingRoomOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        return new AutoClosingRoomOpenHelper(this.mDelegate.create(configuration), this.mAutoCloser);
    }

    public AutoClosingRoomOpenHelperFactory(@NonNull SupportSQLiteOpenHelper.Factory factory, @NonNull AutoCloser autoCloser) {
        this.mDelegate = factory;
        this.mAutoCloser = autoCloser;
    }
}
