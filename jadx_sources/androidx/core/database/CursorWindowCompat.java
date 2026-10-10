package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes23.dex */
public final class CursorWindowCompat {

    @RequiresApi(28)
    public static class Api28Impl {
        public static CursorWindow createCursorWindow(String str, long j11) {
            return new CursorWindow(str, j11);
        }

        private Api28Impl() {
        }
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j11) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.createCursorWindow(str, j11) : new CursorWindow(str);
    }

    private CursorWindowCompat() {
    }
}
