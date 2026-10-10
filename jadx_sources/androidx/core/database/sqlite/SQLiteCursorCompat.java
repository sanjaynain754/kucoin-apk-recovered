package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
public final class SQLiteCursorCompat {

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static void setFillWindowForwardOnly(SQLiteCursor sQLiteCursor, boolean z11) {
            sQLiteCursor.setFillWindowForwardOnly(z11);
        }
    }

    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor sQLiteCursor, boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setFillWindowForwardOnly(sQLiteCursor, z11);
        }
    }

    private SQLiteCursorCompat() {
    }
}
