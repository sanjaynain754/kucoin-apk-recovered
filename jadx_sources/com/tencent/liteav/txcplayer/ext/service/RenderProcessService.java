package com.tencent.liteav.txcplayer.ext.service;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.ext.host.EngineConst;
import com.tencent.liteav.txcplayer.ext.host.HostEngine;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes59.dex */
public class RenderProcessService {
    private static final String TAG = "HostEngine-RenderProcessService";
    private static RenderProcessService mInstance;
    private int mCurrentModel = 0;
    private ConcurrentHashMap<ITXVCubePlayer, WeakReference<IRenderServiceEventListener>> mEventListenerMap = new ConcurrentHashMap<>();

    public interface IRenderServiceEventListener {
        void onRenderServiceEvent(ITXVCubePlayer iTXVCubePlayer, int i11, Bundle bundle);
    }

    public boolean connectPlayer(ITXVCubePlayer iTXVCubePlayer, Surface surface, int i11, Map<String, Object> map) {
        if (iTXVCubePlayer == null || surface == null) {
            LiteavLog.m76093w(TAG, "connectPlayer invalid param player or surface is null !!!");
            return false;
        }
        if (!canRenderProcessWork(iTXVCubePlayer)) {
            LiteavLog.m76093w(TAG, "connectPlayer，postProcessService does not need to work");
            return false;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map2.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        map2.put(EngineConst.ArgsKey.KEY_PARAM2, surface);
        map2.put(EngineConst.ArgsKey.KEY_PARAM3, Integer.valueOf(i11));
        map2.put(EngineConst.ArgsKey.KEY_PARAM4, map);
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 100, map2, map3);
        Boolean bool = Boolean.FALSE;
        Object obj = map3.get("KEY_RET_PARAM1");
        if (obj != null && (obj instanceof Boolean)) {
            bool = (Boolean) obj;
        }
        return bool.booleanValue();
    }

    public boolean setSurfaceBufferSize(ITXVCubePlayer iTXVCubePlayer) {
        if (iTXVCubePlayer == null) {
            LiteavLog.m76093w(TAG, "setSurfaceBufferSize invalid param player is null !!!");
            return false;
        }
        if (!canRenderProcessWork(iTXVCubePlayer)) {
            LiteavLog.m76093w(TAG, "setSurfaceBufferSize，postProcessService does not need to work");
            return false;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 101, map, map2);
        Boolean bool = Boolean.FALSE;
        Object obj = map2.get("KEY_RET_PARAM1");
        if (obj != null && (obj instanceof Boolean)) {
            bool = (Boolean) obj;
        }
        return bool.booleanValue();
    }

    public static RenderProcessService getInstance() {
        if (mInstance == null) {
            synchronized (RenderProcessService.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new RenderProcessService();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mInstance;
    }

    public boolean canRenderProcessWork(ITXVCubePlayer iTXVCubePlayer) {
        if (iTXVCubePlayer != null && !iTXVCubePlayer.isEnableRenderProcess()) {
            LiteavLog.m76087i(TAG, "[canRenderProcessWork],isEnableRenderProcess == false !!!");
            return false;
        }
        if (!HostEngine.getInstance().checkAndLoadPlugin(2)) {
            LiteavLog.m76087i(TAG, "[canRenderProcessWork],isEnableRenderProcess == false !!!");
            return false;
        }
        int i11 = this.mCurrentModel;
        if (i11 == 1 || i11 == 2) {
            HashMap map = new HashMap();
            HostEngine.getInstance().sendSyncRequestToPlugin(2, 104, null, map);
            Object obj = map.get("KEY_RET_PARAM1");
            if (!((obj == null || !(obj instanceof Boolean)) ? false : ((Boolean) obj).booleanValue())) {
                LiteavLog.m76087i(TAG, "[canRenderProcessWork],IS_SUPPORT_RESOLUTION == false !!!");
                return false;
            }
        }
        LiteavLog.m76087i(TAG, "[canRenderProcessWork], finally return true");
        return true;
    }

    public void doAction(ITXVCubePlayer iTXVCubePlayer, String str, Object obj) {
        if (iTXVCubePlayer == null) {
            LiteavLog.m76093w(TAG, "doAction invalid param player or surface is null !!!");
            return;
        }
        if (!canRenderProcessWork(iTXVCubePlayer)) {
            LiteavLog.m76093w(TAG, "doAction，postProcessService does not need to work");
            return;
        }
        HashMap map = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        map.put(EngineConst.ArgsKey.KEY_PARAM2, str);
        if (obj != null) {
            map.put(EngineConst.ArgsKey.KEY_PARAM3, obj);
        }
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 107, map, null);
    }

    public void postEventWithPlayer(ITXVCubePlayer iTXVCubePlayer, int i11, Bundle bundle) {
        WeakReference<IRenderServiceEventListener> weakReference;
        IRenderServiceEventListener iRenderServiceEventListener;
        if (iTXVCubePlayer == null || (weakReference = this.mEventListenerMap.get(iTXVCubePlayer)) == null || (iRenderServiceEventListener = weakReference.get()) == null) {
            return;
        }
        iRenderServiceEventListener.onRenderServiceEvent(iTXVCubePlayer, i11, bundle);
    }

    public void sendPlayerEventToPlugin(ITXVCubePlayer iTXVCubePlayer, int i11, Bundle bundle) {
        if (iTXVCubePlayer == null) {
            LiteavLog.m76093w(TAG, "sendPlayerEventToPlugin invalid param player is null !!!");
            return;
        }
        if (canRenderProcessWork(iTXVCubePlayer)) {
            HashMap map = new HashMap();
            map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
            map.put(EngineConst.ArgsKey.KEY_PARAM2, Integer.valueOf(i11));
            map.put(EngineConst.ArgsKey.KEY_PARAM3, bundle);
            HostEngine.getInstance().sendSyncRequestToPlugin(2, 106, map, null);
        }
    }

    public void setRenderServiceEventListener(ITXVCubePlayer iTXVCubePlayer, IRenderServiceEventListener iRenderServiceEventListener) {
        if (iTXVCubePlayer != null) {
            if (iRenderServiceEventListener != null) {
                this.mEventListenerMap.put(iTXVCubePlayer, new WeakReference<>(iRenderServiceEventListener));
            } else {
                this.mEventListenerMap.remove(iTXVCubePlayer);
            }
        }
    }

    public void updateRenderProcessMode(ITXVCubePlayer iTXVCubePlayer, int i11) {
        this.mCurrentModel = i11;
        if (!canRenderProcessWork(iTXVCubePlayer)) {
            LiteavLog.m76093w(TAG, "updatePostProcessMode，postProcessService does not need to work");
            return;
        }
        if (iTXVCubePlayer == null) {
            LiteavLog.m76093w(TAG, "updatePostProcessMode invalid param player is null !!!");
            return;
        }
        HashMap map = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        map.put(EngineConst.ArgsKey.KEY_PARAM2, Integer.valueOf(i11));
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 102, map, null);
    }

    private RenderProcessService() {
    }

    public void checkInit(Context context) {
        HostEngine.getInstance().init(context);
    }

    public int getVodLicenseFeature() {
        boolean z11;
        if (HostEngine.getInstance().getAppContext() == null) {
            LiteavLog.m76093w(TAG, "Host engine not init!!");
            return 0;
        }
        if (C34811c.m76239b(HouseBuilder.EnumC34765a.PLAYER_MONET) == HouseBuilder.EnumC34768d.OK) {
            z11 = true;
        } else {
            z11 = false;
        }
        LiteavLog.m76087i("VodLicenseCheck", "checkValidForPlayerMonet = ".concat(String.valueOf(z11)));
        if (!z11) {
            return 0;
        }
        return 1;
    }

    public boolean onTouchEvent(ITXVCubePlayer iTXVCubePlayer, MotionEvent motionEvent) {
        if (!canRenderProcessWork(iTXVCubePlayer)) {
            return false;
        }
        int i11 = this.mCurrentModel;
        if (i11 != 11 && i11 != 12) {
            return false;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        map.put(EngineConst.ArgsKey.KEY_PARAM2, motionEvent);
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 105, map, map2);
        Object obj = map2.get("KEY_RET_PARAM1");
        if (obj == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public void stopRenderProcess(ITXVCubePlayer iTXVCubePlayer) {
        if (!canRenderProcessWork(iTXVCubePlayer)) {
            return;
        }
        if (iTXVCubePlayer == null) {
            LiteavLog.m76093w(TAG, "stopRenderProcess invalid param player is null !!!");
            return;
        }
        HashMap map = new HashMap();
        map.put(EngineConst.ArgsKey.KEY_PARAM1, iTXVCubePlayer);
        HostEngine.getInstance().sendSyncRequestToPlugin(2, 103, map, null);
    }
}
