package yb0;

import android.database.Cursor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zb0.C46750a;

/* JADX INFO: renamed from: yb0.f0 */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes23.dex */
public class C46438f0 {
    /* JADX INFO: renamed from: a */
    public static List<Object> m102437a(Cursor cursor, int i11) {
        String name;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            Object objM102438b = m102438b(cursor, i12);
            if (C46750a.f104575c) {
                if (objM102438b == null) {
                    name = null;
                } else if (objM102438b.getClass().isArray()) {
                    name = "array(" + objM102438b.getClass().getComponentType().getName() + ")";
                } else {
                    name = objM102438b.getClass().getName();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i12);
                sb2.append(C33627eb.f69716f);
                sb2.append(cursor.getType(i12));
                sb2.append(": ");
                sb2.append(objM102438b);
                sb2.append(name == null ? "" : " (" + name + ")");
                Log.d("Sqflite", sb2.toString());
            }
            arrayList.add(objM102438b);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static Object m102438b(Cursor cursor, int i11) {
        int type = cursor.getType(i11);
        if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        return null;
                    }
                    return cursor.getBlob(i11);
                }
                return cursor.getString(i11);
            }
            return Double.valueOf(cursor.getDouble(i11));
        }
        return Long.valueOf(cursor.getLong(i11));
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: c */
    public static Locale m102439c(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: renamed from: d */
    public static Locale m102440d(String str) {
        return m102439c(str);
    }
}
