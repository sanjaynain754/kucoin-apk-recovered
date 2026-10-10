package p387k;

import ai.advance.common.entity.BaseResultEntity;
import android.text.TextUtils;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.sensorsdata.abtest.entity.AppConstants;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes23.dex */
public class C40832g {
    /* JADX INFO: renamed from: a */
    public static String m89346a(Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        boolean z11 = true;
        for (Object obj : iterable) {
            if (!z11) {
                sb2.append(",");
            }
            if (obj instanceof String) {
                sb2.append("\"");
                sb2.append(obj);
            } else {
                if ((obj instanceof Number) || (obj instanceof Boolean)) {
                    sb2.append(obj);
                } else if (obj instanceof Enum) {
                    sb2.append("\"");
                    sb2.append(((Enum) obj).name());
                } else {
                    sb2.append(m89348c(obj, new HashSet()));
                }
                z11 = false;
            }
            sb2.append("\"");
            z11 = false;
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m89347b(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            Object obj2 = Array.get(obj, i11);
            if (obj2 instanceof String) {
                sb2.append("\"");
                sb2.append(obj2);
            } else {
                if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                    sb2.append(obj2);
                } else if (obj2 instanceof Enum) {
                    sb2.append("\"");
                    sb2.append(((Enum) obj2).name());
                } else {
                    sb2.append(m89348c(obj2, new HashSet()));
                }
                if (i11 < length - 1) {
                    sb2.append(",");
                }
            }
            sb2.append("\"");
            if (i11 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: Exception -> 0x0054, TRY_LEAVE, TryCatch #0 {Exception -> 0x0054, blocks: (B:14:0x0031, B:16:0x004c, B:36:0x0090, B:38:0x0097, B:40:0x009b, B:20:0x0056, B:22:0x005a, B:26:0x0061, B:28:0x006b, B:29:0x0070, B:31:0x0074, B:32:0x007b, B:34:0x007f, B:35:0x008c, B:37:0x0094), top: B:46:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static String m89348c(Object obj, Set<Object> set) {
        String strM89348c;
        if (obj == null) {
            return "null";
        }
        if (set.contains(obj)) {
            return "\"<circular reference>\"";
        }
        set.add(obj);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (int i11 = 0; i11 < declaredFields.length; i11++) {
            declaredFields[i11].setAccessible(true);
            try {
                sb2.append("\"");
                sb2.append(declaredFields[i11].getName());
                sb2.append("\":");
                Object obj2 = declaredFields[i11].get(obj);
                if (obj2 instanceof String) {
                    sb2.append("\"");
                    sb2.append(obj2);
                } else {
                    if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                        sb2.append(obj2);
                    } else {
                        if (obj2 != null) {
                            if (obj2.getClass().isArray()) {
                                strM89348c = m89347b(obj2);
                            } else if (obj2 instanceof Iterable) {
                                strM89348c = m89346a((Iterable) obj2);
                            } else if (obj2 instanceof Enum) {
                                sb2.append("\"");
                                sb2.append(((Enum) obj2).name());
                            } else {
                                strM89348c = m89348c(obj2, set);
                            }
                            sb2.append(strM89348c);
                        }
                    }
                    if (i11 < declaredFields.length - 1) {
                        sb2.append(",");
                    }
                }
                strM89348c = "\"";
                sb2.append(strM89348c);
                if (i11 < declaredFields.length - 1) {
                    sb2.append(",");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        sb2.append("}");
        set.remove(obj);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static JSONObject m89356k(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (Object obj : map.keySet()) {
                try {
                    jSONObject.put(obj.toString(), m89347b(map.get(obj)));
                } catch (Exception e11) {
                    C40833h.m89361e(C40832g.class.getName(), e11.getMessage());
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static int m89349d(JSONObject jSONObject, String str) {
        return jSONObject.optInt(str);
    }

    /* JADX INFO: renamed from: e */
    public static JSONArray m89350e(JSONObject jSONObject, String str) {
        return jSONObject.optJSONArray(str);
    }

    /* JADX INFO: renamed from: f */
    public static String m89351f(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m89352g(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("{") && str.endsWith("}")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static <T extends BaseResultEntity> T m89353h(String str, Class<? extends T> cls) {
        T tNewInstance;
        try {
            tNewInstance = cls.newInstance();
        } catch (Exception unused) {
            tNewInstance = null;
        }
        if (m89352g(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strM89351f = m89351f(jSONObject, "code");
                tNewInstance.success = strM89351f.equals(AppConstants.AB_TEST_SUCCESS);
                tNewInstance.code = strM89351f;
                tNewInstance.extra = m89351f(jSONObject, JAnalysisConstants.ACCOUNT_EXTRA_ATTR);
                tNewInstance.message = m89351f(jSONObject, "message");
                tNewInstance.transactionId = m89351f(jSONObject, "transactionId");
                tNewInstance.pricingStrategy = m89351f(jSONObject, "pricingStrategy");
                tNewInstance.data = m89351f(jSONObject, "data");
            } catch (Exception e11) {
                C40833h.m89361e(C40832g.class.getName(), e11.getMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            tNewInstance.code = "NO_RESPONSE";
            tNewInstance.message = "NO_RESPONSE".toLowerCase(Locale.ENGLISH);
        }
        return tNewInstance;
    }

    /* JADX INFO: renamed from: i */
    public static void m89354i(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.putOpt(str, obj);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m89355j(Map map) {
        return m89356k(map).toString();
    }
}
