package com.sensorsdata.abtest.util;

import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes23.dex */
public class UrlUtil {
    private static final String TAG = "SAB.UrlUtil";

    public static String getApiBaseUrl(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str2 = str.split("\\?")[0];
            SALog.m68589i(TAG, "baseUrl: " + str2);
            return str2;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return str2;
        }
    }

    public static String getProjectKey(String str) {
        String queryParameter = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            queryParameter = Uri.parse(str).getQueryParameter("project-key");
            SALog.m68589i(TAG, "key: " + queryParameter);
            return queryParameter;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return queryParameter;
        }
    }
}
