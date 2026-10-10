package androidx.camera.core.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static String getAbsolutePathFromUri(ContentResolver contentResolver, Uri uri) throws Throwable {
        Throwable th2;
        Uri uri2;
        RuntimeException runtimeException;
        Cursor cursorQuery = null;
        try {
            try {
                uri2 = uri;
                try {
                    cursorQuery = contentResolver.query(uri2, new String[]{"_data"}, null, null, null);
                    Cursor cursor = (Cursor) Preconditions.checkNotNull(cursorQuery);
                    try {
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                        cursor.moveToFirst();
                        String string = cursor.getString(columnIndexOrThrow);
                        cursor.close();
                        return string;
                    } catch (RuntimeException e11) {
                        runtimeException = e11;
                        cursorQuery = cursor;
                        Logger.m1868e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return "";
                    } catch (Throwable th3) {
                        th2 = th3;
                        cursorQuery = cursor;
                        if (cursorQuery == null) {
                            throw th2;
                        }
                        cursorQuery.close();
                        throw th2;
                    }
                } catch (RuntimeException e12) {
                    e = e12;
                    runtimeException = e;
                    Logger.m1868e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri2.toString(), runtimeException.toString()));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return "";
                }
            } catch (RuntimeException e13) {
                e = e13;
                uri2 = uri;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private VideoUtil() {
    }
}
