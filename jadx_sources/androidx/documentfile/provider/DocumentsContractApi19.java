package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(19)
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    public static boolean canRead(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(getRawType(context, uri));
    }

    public static boolean canWrite(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int iQueryForInt = queryForInt(context, uri, "flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((iQueryForInt & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(rawType) || (iQueryForInt & 8) == 0) {
            return (TextUtils.isEmpty(rawType) || (iQueryForInt & 2) == 0) ? false : true;
        }
        return true;
    }

    private static int queryForInt(Context context, Uri uri, String str, int i11) {
        return (int) queryForLong(context, uri, str, i11);
    }

    private static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static long getFlags(Context context, Uri uri) {
        return queryForLong(context, uri, "flags", 0L);
    }

    @Nullable
    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    @Nullable
    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }

    private DocumentsContractApi19() {
    }

    public static boolean exists(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z11 = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
            if (cursorQuery.getCount() > 0) {
                z11 = true;
            }
            return z11;
        } catch (Exception e11) {
            Log.w(TAG, "Failed query: " + e11);
            return false;
        } finally {
            closeQuietly(cursorQuery);
        }
    }

    @Nullable
    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if (!"vnd.android.document/directory".equals(rawType) && !TextUtils.isEmpty(rawType)) {
            return true;
        }
        return false;
    }

    public static boolean isVirtual(Context context, Uri uri) {
        if (!DocumentsContract.isDocumentUri(context, uri) || (getFlags(context, uri) & 512) == 0) {
            return false;
        }
        return true;
    }

    private static long queryForLong(Context context, Uri uri, String str, long j11) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                return cursorQuery.getLong(0);
            }
            return j11;
        } catch (Exception e11) {
            Log.w(TAG, "Failed query: " + e11);
            return j11;
        } finally {
            closeQuietly(cursorQuery);
        }
    }

    @Nullable
    private static String queryForString(Context context, Uri uri, String str, @Nullable String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                return cursorQuery.getString(0);
            }
            return str2;
        } catch (Exception e11) {
            Log.w(TAG, "Failed query: " + e11);
            return str2;
        } finally {
            closeQuietly(cursorQuery);
        }
    }
}
