package cn.jiguang.privates.analysis.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.analysis.JAnalysis;
import cn.jiguang.privates.analysis.business.exposure.JExposureBusiness;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import cn.jiguang.privates.analysis.global.JAnalysisGlobal;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.JCore;
import cn.jiguang.privates.core.api.JCorePrivatesApi;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class JAnalysisPrivatesApi {
    public static int SDK_VERSION_CODE = 160;
    public static String SDK_VERSION_NAME = "1.6.0";
    private static final String TAG = "JAnalysisPrivatesApi";

    @Deprecated
    public static void setDebugMode(boolean z11) {
        JCorePrivatesApi.configDebugMode(null, z11);
    }

    public static void clearDynamicProperty(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "clearDynamicProperty context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.observer(context.getApplicationContext(), new JAnalysis());
            JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, JAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY, null);
        }
    }

    public static void clearStaticProperty(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "clearStaticProperty context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.observer(context.getApplicationContext(), new JAnalysis());
            JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, JAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY, null);
        }
    }

    public static void config(Context context, Config config) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setConfig context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JAnalysisGlobal.setConfig(config);
        }
    }

    public static void init(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "init context can't be null, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.init(context.getApplicationContext(), false);
            if (JGlobal.isMainProcess(context.getApplicationContext())) {
                JCommonPrivatesApi.observer(context.getApplicationContext(), new JCore());
                JCommonPrivatesApi.observer(context.getApplicationContext(), new JAnalysis());
                JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, 4001, null);
            }
        }
    }

    public static void onAccount(Context context, Account account) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "onAccount context can't be null, please check it");
            return;
        }
        if (account == null) {
            JCommonLog.m5431e(TAG, "onAccount account can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(JAnalysisConstants.Account.KEY_ACCOUNT, account);
            JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, 4003, bundle);
        }
    }

    public static void onEvent(Context context, Event event) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "onEvent context can't be null, please check it");
        }
        if (event == null) {
            JCommonLog.m5431e(TAG, "onEvent event can't be null, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            String name = event.getName();
            if (TextUtils.isEmpty(name)) {
                return;
            }
            name.getClass();
            switch (name) {
                case "exposure":
                    JExposureBusiness.getInstance().onExposure(context.getApplicationContext(), (ExposureEvent) event);
                    break;
                case "third_msg_status":
                case "active":
                case "active_launch":
                case "active_terminate":
                case "msg_status":
                case "custom_event":
                case "crash_log":
                case "identify_account":
                    JCommonLog.m5431e(TAG, "the event name [" + name + "] is invalid");
                    break;
                default:
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("event", event);
                    JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, 4002, bundle);
                    break;
            }
        }
    }

    public static void reportCache(Context context) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "reportCache context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, 4004, null);
        }
    }

    public static void setDynamicProperty(Context context, Map<String, Object> map) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setDynamicProperty context can't be null, please check it");
            return;
        }
        if (map == null) {
            JCommonLog.m5431e(TAG, "setDynamicProperty map can't be null, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Byte) {
                    bundle.putByte(key, ((Byte) value).byteValue());
                }
                if (value instanceof Short) {
                    bundle.putShort(key, ((Short) value).shortValue());
                }
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                }
                if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                }
                if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                }
                if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                }
                if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                }
                if (value instanceof String) {
                    bundle.putString(key, (String) value);
                }
            }
            JCommonPrivatesApi.observer(context.getApplicationContext(), new JAnalysis());
            JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, JAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY, bundle);
        }
    }

    public static void setStaticProperty(Context context, Map<String, Object> map) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "setStaticProperty context can't be null, please check it");
            return;
        }
        if (map == null) {
            JCommonLog.m5431e(TAG, "setStaticProperty map can't be null, please check it");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Byte) {
                    bundle.putByte(key, ((Byte) value).byteValue());
                }
                if (value instanceof Short) {
                    bundle.putShort(key, ((Short) value).shortValue());
                }
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                }
                if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                }
                if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                }
                if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                }
                if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                }
                if (value instanceof String) {
                    bundle.putString(key, (String) value);
                }
            }
            JCommonPrivatesApi.observer(context.getApplicationContext(), new JAnalysis());
            JCommonPrivatesApi.sendMessage(context.getApplicationContext(), JAnalysis.THREAD_ANALYSIS, JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY, bundle);
        }
    }

    @Deprecated
    public static void bindAccount(Context context, Account account) {
        onAccount(context.getApplicationContext(), account);
    }

    @Deprecated
    public static void clearCommonProperty(Context context) {
        clearStaticProperty(context);
    }

    @Deprecated
    public static void setAnalysisConfig(Context context, Config config) {
        config(context, config);
    }

    @Deprecated
    public static void setChannel(Context context, String str) {
        JCorePrivatesApi.configAppKey(context, str);
    }

    public static void setCommonProperty(Context context, Map<String, Object> map) {
        setStaticProperty(context, map);
    }

    @Deprecated
    public static void setConfig(Context context, Config config) {
        config(context, config);
    }

    @Deprecated
    public static void setReportInBgEnable(boolean z11) {
    }

    @Deprecated
    public static void startCrashHandler(Context context) {
    }

    @Deprecated
    public static void stopCrashHandler(Context context) {
    }

    @Deprecated
    public static void unbindAccount(Context context) {
    }
}
