package cn.jiguang.privates.common.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import cn.jiguang.privates.common.log.JCommonLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class JHandler {
    private static final int DEFAULT_RELEASE_INTERVAL = 300000;
    private static final String TAG = "JHandler";
    private static volatile JHandler instance;
    private final ConcurrentHashMap<String, HandlerThread> handlerThreadMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, CommonHandler> handlerMap = new ConcurrentHashMap<>();

    public CommonHandler buildHandler(Context context, String str) {
        return buildHandler(context, str, DEFAULT_RELEASE_INTERVAL);
    }

    public static JHandler getInstance() {
        if (instance == null) {
            synchronized (JHandler.class) {
                instance = new JHandler();
            }
        }
        return instance;
    }

    public synchronized CommonHandler buildHandler(Context context, String str, int i11) {
        CommonHandler commonHandler;
        try {
            HandlerThread handlerThread = this.handlerThreadMap.get(str);
            if (handlerThread == null) {
                handlerThread = new HandlerThread(str);
                this.handlerThreadMap.put(str, handlerThread);
            }
            if (handlerThread.getState() == Thread.State.NEW) {
                handlerThread.start();
            }
            commonHandler = this.handlerMap.get(str);
            if (handlerThread.getState() == Thread.State.TERMINATED) {
                if (commonHandler != null) {
                    commonHandler.removeCallbacksAndMessages(null);
                }
                handlerThread = new HandlerThread(str);
                handlerThread.start();
                this.handlerThreadMap.put(str, handlerThread);
                commonHandler = new CommonHandler(handlerThread.getLooper(), context, i11);
                this.handlerMap.put(str, commonHandler);
                JCommonLog.m5430d(TAG, "buildHandler：" + str);
            }
            if (commonHandler == null) {
                commonHandler = new CommonHandler(handlerThread.getLooper(), context, i11);
                this.handlerMap.put(str, commonHandler);
                JCommonLog.m5430d(TAG, "buildHandler：" + str);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "buildHandler failed " + th2.getMessage());
            return null;
        }
        return commonHandler;
    }

    public void releaseHandler(Context context, String str) {
        try {
            if (this.handlerMap.containsKey(str)) {
                CommonHandler commonHandler = this.handlerMap.get(str);
                if (commonHandler != null) {
                    JCommonLog.m5430d(TAG, "releaseHandler:" + str);
                    commonHandler.removeCallbacksAndMessages(null);
                }
                this.handlerMap.remove(str);
            }
            if (this.handlerThreadMap.containsKey(str)) {
                HandlerThread handlerThread = this.handlerThreadMap.get(str);
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.handlerThreadMap.remove(str);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "releaseHandler failed " + th2.getMessage());
        }
    }

    public void removeMessages(Context context, String str, int i11) {
        try {
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler != null) {
                commonHandlerBuildHandler.removeMessages(i11);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "removeMessages failed " + th2.getMessage());
        }
    }

    public void sendMessage(Context context, String str, int i11, Bundle bundle) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = 0;
            messageObtain.obj = str;
            messageObtain.what = i11;
            messageObtain.setData(bundle);
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler != null) {
                commonHandlerBuildHandler.sendMessage(messageObtain);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "sendMessage failed " + th2.getMessage());
        }
    }

    public void sendMessageDelayed(Context context, String str, int i11, Bundle bundle, long j11) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.arg1 = 1;
            messageObtain.obj = str;
            messageObtain.what = i11;
            messageObtain.setData(bundle);
            CommonHandler commonHandlerBuildHandler = buildHandler(context, str);
            if (commonHandlerBuildHandler != null) {
                commonHandlerBuildHandler.sendMessageDelayed(messageObtain, j11);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "sendMessageDelayed failed " + th2.getMessage());
        }
    }
}
