package com.tencent.liteav.txcplayer.ext.host;

import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class HostEngine {
    public static final String TAG = "HostEngine";
    private static HostEngine mInstance;
    private Context mAppContext;
    private boolean mIsInit = false;

    public synchronized void init(Context context) {
        LiteavLog.m76079d(TAG, "[init], appContext=" + context + " ,mIsInit=" + this.mIsInit);
        if (this.mIsInit) {
            return;
        }
        this.mAppContext = context;
        onCreate();
        this.mIsInit = true;
    }

    public static HostEngine getInstance() {
        if (mInstance == null) {
            synchronized (HostEngine.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new HostEngine();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mInstance;
    }

    public boolean checkAndLoadPlugin(int i11) {
        LiteavLog.m76087i(TAG, "[checkAndLoadPlugin], pluginId=".concat(String.valueOf(i11)));
        return PluginManager.getInstance().checkAndLoadPlugin(i11);
    }

    public Context getAppContext() {
        return this.mAppContext;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b A[PHI: r7
      0x008b: PHI (r7v7 com.tencent.liteav.sdk.common.HouseBuilder$a) = 
      (r7v1 com.tencent.liteav.sdk.common.HouseBuilder$a)
      (r7v2 com.tencent.liteav.sdk.common.HouseBuilder$a)
      (r7v3 com.tencent.liteav.sdk.common.HouseBuilder$a)
      (r7v4 com.tencent.liteav.sdk.common.HouseBuilder$a)
      (r7v5 com.tencent.liteav.sdk.common.HouseBuilder$a)
     binds: [B:36:0x0089, B:39:0x0091, B:42:0x0098, B:45:0x009f, B:48:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    public void handleSyncRequestHandleByHost(int i11, Map<String, Object> map, Map<String, Object> map2) {
        HouseBuilder.EnumC34765a enumC34765a;
        LiteavLog.m76093w(TAG, "[handleSyncRequestHandleByHost], functionId=" + i11 + " ,inParams=" + map + " ,outParams=" + map2);
        if (i11 == 1) {
            int vodLicenseFeature = RenderProcessService.getInstance().getVodLicenseFeature();
            if (map2 != null) {
                map2.put("KEY_RET_PARAM1", Integer.valueOf(vodLicenseFeature));
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4 && map != null) {
                    Object obj = map.get(EngineConst.ArgsKey.KEY_PARAM1);
                    ITXVCubePlayer iTXVCubePlayer = obj instanceof ITXVCubePlayer ? (ITXVCubePlayer) obj : null;
                    Object obj2 = map.get(EngineConst.ArgsKey.KEY_PARAM2);
                    int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : -1;
                    Object obj3 = map.get(EngineConst.ArgsKey.KEY_PARAM3);
                    RenderProcessService.getInstance().postEventWithPlayer(iTXVCubePlayer, iIntValue, obj3 instanceof Bundle ? (Bundle) obj3 : null);
                    return;
                }
                return;
            }
            if (map == null || map2 == null) {
                return;
            }
            Object obj4 = map.get(EngineConst.ArgsKey.KEY_PARAM1);
            int iIntValue2 = (obj4 == null || !(obj4 instanceof Integer)) ? 0 : ((Integer) obj4).intValue();
            HouseBuilder.EnumC34765a enumC34765a2 = HouseBuilder.EnumC34765a.PLAYER_STANDARD;
            if (iIntValue2 != enumC34765a2.value) {
                enumC34765a2 = HouseBuilder.EnumC34765a.PLAYER_MONET;
                if (iIntValue2 != enumC34765a2.value) {
                    enumC34765a2 = HouseBuilder.EnumC34765a.PLAYER_PREMIUM;
                    if (iIntValue2 != enumC34765a2.value) {
                        enumC34765a2 = HouseBuilder.EnumC34765a.PLAYER_ENTERPRISE;
                        if (iIntValue2 != enumC34765a2.value) {
                            enumC34765a2 = HouseBuilder.EnumC34765a.PLAYER_PROJECTION;
                            enumC34765a = iIntValue2 == enumC34765a2.value ? enumC34765a2 : null;
                        }
                    }
                }
            }
            boolean zM76238a = C34811c.m76238a(enumC34765a);
            LiteavLog.m76087i(TAG, "[CHECK_FEATURE_AUTH], feature=" + iIntValue2 + " ,functionType=" + enumC34765a + " ,result=" + zM76238a);
            map2.put("KEY_RET_PARAM1", Boolean.valueOf(zM76238a));
        }
    }

    public void onCreate() {
        LiteavLog.m76079d(TAG, "[onCreate]");
        PluginManager.getInstance().loadPlugin();
    }

    public void onDestroy() {
        LiteavLog.m76079d(TAG, "[onDestroy]");
        PluginManager.getInstance().unLoadPlugin();
    }

    private HostEngine() {
    }

    public void sendAsyncRequestToPlugin(int i11, int i12, Map<String, Object> map, PluginCallback pluginCallback) {
        IPluginBase pluginInstance = PluginManager.getInstance().getPluginInstance(i11);
        if (pluginInstance != null) {
            pluginInstance.handleAsyncRequest(i11, i12, map, pluginCallback);
            return;
        }
        LiteavLog.m76093w(TAG, "[sendAsyncRequestToPlugin], destPluginId=" + i11 + " is not loaded");
    }

    public void sendSyncRequestHandleByHost(int i11, Map<String, Object> map, Map<String, Object> map2) {
        handleSyncRequestHandleByHost(i11, map, map2);
    }

    public void sendSyncRequestToPlugin(int i11, int i12, Map<String, Object> map, Map<String, Object> map2) {
        IPluginBase pluginInstance = PluginManager.getInstance().getPluginInstance(i11);
        if (pluginInstance != null) {
            pluginInstance.handleSyncRequest(i11, i12, map, map2);
            return;
        }
        LiteavLog.m76093w(TAG, "[sendSyncRequestToPlugin], destPluginId=" + i11 + " is not loaded");
    }
}
