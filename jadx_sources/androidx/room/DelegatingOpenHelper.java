package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.p023db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
interface DelegatingOpenHelper {
    @NonNull
    SupportSQLiteOpenHelper getDelegate();
}
