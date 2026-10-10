package androidx.room.util;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.tencent.bugly.proguard.C33978va;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class CursorUtil {
    private static int findColumnIndexBySuffix(@NonNull Cursor cursor, @NonNull String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return findColumnIndexBySuffix(cursor.getColumnNames(), str);
        }
        return -1;
    }

    @NonNull
    public static Cursor copyAndClose(@NonNull Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i11 = 0; i11 < cursor.getColumnCount(); i11++) {
                    int type = cursor.getType(i11);
                    if (type == 0) {
                        objArr[i11] = null;
                    } else if (type == 1) {
                        objArr[i11] = Long.valueOf(cursor.getLong(i11));
                    } else if (type == 2) {
                        objArr[i11] = Double.valueOf(cursor.getDouble(i11));
                    } else if (type == 3) {
                        objArr[i11] = cursor.getString(i11);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i11] = cursor.getBlob(i11);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            cursor.close();
            return matrixCursor;
        } catch (Throwable th2) {
            cursor.close();
            throw th2;
        }
    }

    private CursorUtil() {
    }

    public static int getColumnIndex(@NonNull Cursor cursor, @NonNull String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return findColumnIndexBySuffix(cursor, str);
    }

    public static int getColumnIndexOrThrow(@NonNull Cursor cursor, @NonNull String str) {
        String string;
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            string = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e11) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e11);
            string = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }

    @VisibleForTesting(otherwise = 2)
    public static int findColumnIndexBySuffix(String[] strArr, String str) {
        String str2 = C33978va.f72339h + str;
        String str3 = C33978va.f72339h + str + "`";
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str4 = strArr[i11];
            if (str4.length() >= str.length() + 2 && (str4.endsWith(str2) || (str4.charAt(0) == '`' && str4.endsWith(str3)))) {
                return i11;
            }
        }
        return -1;
    }
}
