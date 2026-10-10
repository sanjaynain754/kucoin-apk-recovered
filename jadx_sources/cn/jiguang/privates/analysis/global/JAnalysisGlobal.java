package cn.jiguang.privates.analysis.global;

import cn.jiguang.privates.analysis.api.Config;

/* JADX INFO: loaded from: classes34.dex */
public class JAnalysisGlobal {
    private static final String TAG = "JAnalysisGlobal";
    private static Config config;

    public static Config getConfig() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static void setConfig(Config config2) {
        config = config2;
    }
}
