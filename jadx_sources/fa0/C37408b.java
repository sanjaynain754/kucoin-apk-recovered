package fa0;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: renamed from: fa0.b */
/* JADX INFO: compiled from: AsyncStorageErrorUtil.java */
/* JADX INFO: loaded from: classes59.dex */
public class C37408b {
    /* JADX INFO: renamed from: a */
    public static WritableMap m84147a(String str) {
        return m84148b(str, "Database Error");
    }

    /* JADX INFO: renamed from: c */
    public static WritableMap m84149c(String str) {
        return m84148b(str, "Invalid key");
    }

    /* JADX INFO: renamed from: d */
    public static WritableMap m84150d(String str) {
        return m84148b(str, "Invalid Value");
    }

    /* JADX INFO: renamed from: b */
    public static WritableMap m84148b(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str2);
        if (str != null) {
            writableMapCreateMap.putString("key", str);
        }
        return writableMapCreateMap;
    }
}
