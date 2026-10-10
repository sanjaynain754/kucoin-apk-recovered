package fa0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: fa0.a */
/* JADX INFO: compiled from: AsyncLocalStorageUtil.java */
/* JADX INFO: loaded from: classes59.dex */
public class C37407a {
    /* JADX INFO: renamed from: a */
    public static String m84141a(int i11) {
        String[] strArr = new String[i11];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    /* JADX INFO: renamed from: b */
    public static String[] m84142b(ReadableArray readableArray, int i11, int i12) {
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            strArr[i13] = readableArray.getString(i11 + i13);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m84146f(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }

    /* JADX INFO: renamed from: c */
    public static void m84143c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(next);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null) {
                m84143c(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
                jSONObject.put(next, jSONObjectOptJSONObject2);
            } else {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m84144d(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorQuery = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!cursorQuery.moveToFirst()) {
                return null;
            }
            return cursorQuery.getString(0);
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m84145e(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String strM84144d = m84144d(sQLiteDatabase, str);
        if (strM84144d != null) {
            JSONObject jSONObject = new JSONObject(strM84144d);
            m84143c(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return m84146f(sQLiteDatabase, str, str2);
    }
}
