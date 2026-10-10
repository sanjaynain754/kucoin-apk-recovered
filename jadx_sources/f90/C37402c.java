package f90;

import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: f90.c */
/* JADX INFO: compiled from: ChannelReader.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C37402c {
    /* JADX INFO: renamed from: b */
    public static Map<String, String> m84127b(File file) {
        try {
            String strM84128c = m84128c(file);
            if (strM84128c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM84128c);
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                map.put(string, jSONObject.getString(string));
            }
            return map;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C37401b m84126a(File file) {
        Map<String, String> mapM84127b = m84127b(file);
        if (mapM84127b == null) {
            return null;
        }
        String str = mapM84127b.get(AppsFlyerProperties.CHANNEL);
        mapM84127b.remove(AppsFlyerProperties.CHANNEL);
        return new C37401b(str, mapM84127b);
    }

    /* JADX INFO: renamed from: c */
    public static String m84128c(File file) {
        return C37404e.m84134d(file, 1903654775);
    }
}
