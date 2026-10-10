package com.tencent.liteav.txcplayer.ext.config;

import com.tencent.liteav.txcplayer.ext.host.EngineConst;
import com.tencent.liteav.txcplayer.ext.host.PluginInfo;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class PluginConfigCenter {
    private static final int[] sPluginIds = {2};
    private static final String[] sPluginName = {EngineConst.PluginName.MONET_PLUGIN_NAME};
    private static final int[] sPluginVersion = {1};
    private static final String[] sPluginClazzName = {EngineConst.PluginClazzName.MONET_PLUGIN_CLAZZ_NAME};
    private static final boolean[] sIsCorePlugin = {true};

    public static void loadPluginConfig(List<PluginInfo> list) {
        int i11 = 0;
        while (true) {
            int[] iArr = sPluginIds;
            if (i11 >= iArr.length) {
                return;
            }
            PluginInfo pluginInfo = new PluginInfo();
            pluginInfo.mPluginId = iArr[i11];
            pluginInfo.mPluginName = sPluginName[i11];
            pluginInfo.mPluginVersion = sPluginVersion[i11];
            pluginInfo.mPluginClazzName = sPluginClazzName[i11];
            pluginInfo.mIsCorePlugin = sIsCorePlugin[i11];
            list.add(pluginInfo);
            i11++;
        }
    }
}
