package cn.jiguang.privates.common.log;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import cn.jiguang.privates.common.constants.JCommonConstants;
import cn.jiguang.privates.common.global.JGlobal;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JCommonLog {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private static ILogHandler sHandler = null;

    public interface ILogHandler {
        /* JADX INFO: renamed from: d */
        void mo5434d(@NonNull String str, @NonNull String str2);

        /* JADX INFO: renamed from: e */
        void mo5435e(@NonNull String str, @NonNull String str2);

        /* JADX INFO: renamed from: i */
        void mo5436i(@NonNull String str, @NonNull String str2);

        void issue(@NonNull String str, @NonNull String str2, @NonNull Throwable th2);

        /* JADX INFO: renamed from: w */
        void mo5437w(@NonNull String str, @NonNull String str2);
    }

    public static String toLogString(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{ ");
            for (String str : bundle.keySet()) {
                sb2.append(str);
                sb2.append(C33844oi.f71346o);
                sb2.append(bundle.get(str));
                sb2.append(C33627eb.f69716f);
            }
            sb2.append("}");
            return sb2.toString();
        } catch (Throwable unused) {
            return bundle.toString();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5431e(@NonNull String str, @NonNull String str2) {
        ILogHandler iLogHandler = sHandler;
        if (iLogHandler != null) {
            iLogHandler.mo5435e(str, str2);
            return;
        }
        Log.e(getTag(), "[" + str + "] " + str2);
    }

    private static String getTag() {
        try {
            String name = Thread.currentThread().getName();
            if (TextUtils.isEmpty(name)) {
                return "JIGUANG-PRIVATES-SDK";
            }
            if (TextUtils.equals(name, Looper.getMainLooper().getThread().getName())) {
                return "JIGUANG-PRIVATES-MAIN";
            }
            if (name.startsWith(JCommonConstants.JIGUANG)) {
                return name;
            }
            return JCommonConstants.JIGUANG + name;
        } catch (Throwable unused) {
            return "JIGUANG-PRIVATES-SDK";
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m5432i(@NonNull String str, @NonNull String str2) {
        ILogHandler iLogHandler = sHandler;
        if (iLogHandler != null) {
            iLogHandler.mo5436i(str, str2);
            return;
        }
        Log.i(getTag(), "[" + str + "] " + str2);
    }

    public static void issue(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        ILogHandler iLogHandler = sHandler;
        if (iLogHandler != null) {
            iLogHandler.issue(str, str2, th2);
        } else {
            m5431e(str, str2);
        }
    }

    public static void setHandler(ILogHandler iLogHandler) {
        sHandler = iLogHandler;
    }

    /* JADX INFO: renamed from: d */
    public static void m5430d(@NonNull String str, @NonNull String str2) {
        if (!JGlobal.getDebugMode()) {
            return;
        }
        ILogHandler iLogHandler = sHandler;
        if (iLogHandler != null) {
            iLogHandler.mo5434d(str, str2);
            return;
        }
        Log.d(getTag(), "[" + str + "] " + str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m5433w(@NonNull String str, @NonNull String str2) {
        if (!JGlobal.getDebugMode()) {
            return;
        }
        ILogHandler iLogHandler = sHandler;
        if (iLogHandler != null) {
            iLogHandler.mo5437w(str, str2);
            return;
        }
        Log.w(getTag(), "[" + str + "] " + str2);
    }

    public static String toLogString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "null";
        }
        try {
            return LINE_SEPARATOR + jSONObject.toString(2);
        } catch (Throwable unused) {
            return jSONObject.toString();
        }
    }
}
