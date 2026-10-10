package p322hw;

import android.database.Cursor;

/* JADX INFO: renamed from: hw.b */
/* JADX INFO: compiled from: CloseHelper.java */
/* JADX INFO: loaded from: classes13.dex */
public class C38361b {
    /* JADX INFO: renamed from: a */
    public static void m86560a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
