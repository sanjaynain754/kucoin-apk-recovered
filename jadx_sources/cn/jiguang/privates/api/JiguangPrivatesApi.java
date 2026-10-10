package cn.jiguang.privates.api;

import android.content.Context;
import cn.jiguang.privates.analysis.api.JAnalysisPrivatesApi;
import cn.jiguang.privates.core.api.Address;
import cn.jiguang.privates.core.api.JCorePrivatesApi;
import cn.jiguang.privates.push.api.JPushPrivatesApi;

/* JADX INFO: loaded from: classes34.dex */
public class JiguangPrivatesApi {
    public static void configAddress(Context context, Address address) {
        JCorePrivatesApi.configAddress(context, address);
    }

    public static void configDebugMode(Context context, boolean z11) {
        JCorePrivatesApi.configDebugMode(context, z11);
    }

    public static void init(Context context) {
        JPushPrivatesApi.init(context);
        JAnalysisPrivatesApi.init(context);
    }
}
