package com.tencent.liteav.txcplayer.ext.host;

import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.txcplayer.ext.config.PluginConfigCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes59.dex */
public class PluginManager {
    private static final String TAG = "HostEngine-PluginManager";
    private static PluginManager mInstance;
    private List<PluginInfo> mPluginConfigList;
    private ConcurrentHashMap<Integer, IPluginBase> mPluginMap = new ConcurrentHashMap<>();

    private boolean _doLoadPlugin(PluginInfo pluginInfo) {
        int i11 = pluginInfo.mPluginId;
        if (this.mPluginMap.containsKey(Integer.valueOf(i11))) {
            LiteavLog.m76093w(TAG, "[loadPlugin], pluginId has been loaded!!, pluginId=".concat(String.valueOf(i11)));
            return true;
        }
        IPluginBase iPluginBaseCreatePluginInstance = createPluginInstance(i11, pluginInfo.mPluginClazzName);
        if (iPluginBaseCreatePluginInstance == null) {
            LiteavLog.m76093w(TAG, "[loadPlugin], pluginId=" + i11 + " is not exist, do not load!!");
            return false;
        }
        iPluginBaseCreatePluginInstance.onCreate(HostEngine.getInstance().getAppContext());
        this.mPluginMap.put(Integer.valueOf(i11), iPluginBaseCreatePluginInstance);
        LiteavLog.m76079d(TAG, "[loadPlugin], succeed loading pluginId=" + i11 + " ,pluginClazzName=" + pluginInfo.mPluginClazzName);
        return true;
    }

    private IPluginBase createPluginInstance(int i11, String str) {
        LiteavLog.m76087i(TAG, "[createPluginInstance],pluginId|" + i11 + "|clazzName|" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (IPluginBase) Class.forName(str).newInstance();
        } catch (Exception unused) {
            LiteavLog.m76093w(TAG, "create pluginInstance exception, pluginId|" + i11 + "|clazzName|" + str + " is not install in dex!!");
            return null;
        }
    }

    private void doLoadPlugin() {
        for (PluginInfo pluginInfo : this.mPluginConfigList) {
            LiteavLog.m76079d(TAG, "[loadPlugin], pluginId=" + pluginInfo.mPluginId + " ,pluginClazzName=" + pluginInfo.mPluginClazzName);
            if (pluginInfo.mIsCorePlugin) {
                _doLoadPlugin(pluginInfo);
            } else {
                LiteavLog.m76079d(TAG, "[loadPlugin], pluginId=" + pluginInfo.mPluginId + " is not core plugin, do not load by default");
            }
        }
    }

    public static PluginManager getInstance() {
        if (mInstance == null) {
            synchronized (PluginManager.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new PluginManager();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mInstance;
    }

    private void loadPluginConfig() {
        if (this.mPluginConfigList == null) {
            this.mPluginConfigList = new ArrayList();
        }
        PluginConfigCenter.loadPluginConfig(this.mPluginConfigList);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d A[RETURN] */
    public boolean checkAndLoadPlugin(int i11) {
        if (this.mPluginMap.containsKey(Integer.valueOf(i11))) {
            return true;
        }
        for (PluginInfo pluginInfo : this.mPluginConfigList) {
            if (pluginInfo.mPluginId == i11) {
                if (pluginInfo != null) {
                    return _doLoadPlugin(pluginInfo);
                }
                return false;
            }
        }
        pluginInfo = null;
        if (pluginInfo != null) {
            return _doLoadPlugin(pluginInfo);
        }
        return false;
    }

    public IPluginBase getPluginInstance(int i11) {
        return this.mPluginMap.get(Integer.valueOf(i11));
    }

    public void unLoadPlugin() {
        Iterator<PluginInfo> it = this.mPluginConfigList.iterator();
        while (it.hasNext()) {
            int i11 = it.next().mPluginId;
            LiteavLog.m76093w(TAG, "[unLoadPlugin], unLoadPlugin=".concat(String.valueOf(i11)));
            IPluginBase iPluginBase = this.mPluginMap.get(Integer.valueOf(i11));
            if (iPluginBase != null) {
                iPluginBase.onDestroy();
                this.mPluginMap.remove(Integer.valueOf(i11));
            }
        }
    }

    private PluginManager() {
    }

    public void loadPlugin() {
        loadPluginConfig();
        doLoadPlugin();
    }
}
