package cn.jiguang.privates.core.business.report;

import androidx.annotation.Nullable;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.utils.FileUtil;
import java.io.File;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class JsonCacheFileHelper {
    private static final String TAG = "JsonCacheFileHelper";

    private JsonCacheFileHelper() {
    }

    @Nullable
    public static JSONArray read(File file) {
        String strAtomicFileRead = FileUtil.atomicFileRead(file);
        try {
            if (strAtomicFileRead.isEmpty()) {
                return new JSONArray();
            }
            return new JSONArray(strAtomicFileRead);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONArray readAndClean(File file) throws Throwable {
        JSONArray jSONArray = read(file);
        if (jSONArray != null && jSONArray.length() <= 0) {
            return jSONArray;
        }
        FileUtil.atomicFileWrite(file, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        return jSONArray;
    }

    public static void write(File file, JSONObject jSONObject) throws Throwable {
        JSONArray jSONArray = read(file);
        if (jSONArray == null) {
            try {
                jSONArray = new JSONArray();
            } catch (Exception e11) {
                JCommonLog.issue(TAG, "array to json", e11);
                return;
            }
        }
        jSONArray.put(jSONObject);
        FileUtil.atomicFileWrite(file, jSONArray.toString());
    }
}
