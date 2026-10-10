package cn.jiguang.privates.push.business.message.platform;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.trusted.C0671f;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObserver;
import cn.jiguang.privates.core.api.JProtocol;
import cn.jiguang.privates.core.api.JReporter;
import cn.jiguang.privates.core.constants.JCoreConstants;
import cn.jiguang.privates.core.global.JCoreGlobal;
import cn.jiguang.privates.push.JPush;
import cn.jiguang.privates.push.api.PlatformTokenMessage;
import cn.jiguang.privates.push.business.message.JMessageBusiness;
import cn.jiguang.privates.push.cache.JPushConfig;
import cn.jiguang.privates.push.cache.PlatformConfig;
import cn.jiguang.privates.push.constants.JPushConstants;
import cn.jiguang.privates.push.platform.google.JGoogle;
import cn.jiguang.privates.push.protocol.JPushProtocol;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JPlatformBusiness extends JMessageBusiness {
    private static final String PLATFORM_CHANNEL_ID = "JPush_Private";
    private static final String PLATFORM_CHANNEL_NAME = "Notification";
    private static final String TAG = "JPlatformBusiness";
    private static volatile JPlatformBusiness instance;
    private final ConcurrentMap<Long, PlatformTokenMessage> platformTokenMap = new ConcurrentHashMap();

    public void onPlatformNode(Context context, Bundle bundle) {
        try {
            byte b11 = bundle.getByte("platform");
            int i11 = bundle.getInt("code");
            int i12 = bundle.getInt(JPushConstants.PlatformNode.KEY_M_CODE);
            int i13 = bundle.getInt("type");
            int i14 = bundle.getInt("from");
            String platformToken = JPushConfig.getPlatformToken(context, b11);
            JCommonLog.m5430d(TAG, "onPlatformNode platform=" + ((int) b11) + " code=" + i11 + " m_code=" + i12 + " mToken=" + platformToken + " type=" + i13 + " currentFrom=" + i14);
            if (3900 != i13) {
                onPlatformNode(context, b11, i11, i12, platformToken);
                if (3901 == i13) {
                    PlatformConfig.setPlatformTokenFailedFrom(context, 0);
                    PlatformConfig.setPlatformTokenFailed(context, "");
                    return;
                }
                return;
            }
            int platformTokenFailedFrom = PlatformConfig.getPlatformTokenFailedFrom(context);
            int i15 = platformTokenFailedFrom ^ i14;
            if (i15 == 3) {
                JCommonLog.m5430d(TAG, "onTokenFailed, all method obtain orFrom=" + i15 + " lastFrom=" + platformTokenFailedFrom + " currentFrom=" + i14);
                onPlatformNode(context, b11, 3005, i12, platformToken);
                PlatformConfig.setPlatformTokenFailedFrom(context, 0);
                PlatformConfig.setPlatformTokenFailed(context, "");
                return;
            }
            PlatformConfig.setPlatformTokenFailedFrom(context, i14);
            PlatformConfig.setPlatformTokenFailed(context, ((int) b11) + "_" + i11 + "_" + i12);
            JCommonLog.m5430d(TAG, "oneTokenFailed, one method obtain, orFrom=" + i15 + " lastFrom=" + platformTokenFailedFrom + " currentFrom=" + i14);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "reportPlatformNode failed " + th2.getMessage());
        }
    }

    public static JPlatformBusiness getInstance() {
        if (instance == null) {
            synchronized (JPlatformBusiness.class) {
                instance = new JPlatformBusiness();
            }
        }
        return instance;
    }

    private void initChannel(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager.getNotificationChannel(PLATFORM_CHANNEL_ID) != null) {
            return;
        }
        notificationManager.createNotificationChannel(C0671f.m1622a(PLATFORM_CHANNEL_ID, PLATFORM_CHANNEL_NAME, 3));
    }

    private void observerGoogle(Context context, String str) {
        try {
            JCommonPrivatesApi.observer(context, (JObserver) JGoogle.class.newInstance());
        } catch (Throwable unused) {
            JCommonLog.m5430d(TAG, "not integrated google.aar");
            onPlatformNode(context, (byte) 8, 3001, 0, "");
        }
    }

    private void observerHuawei(Context context, String str) {
        if (TextUtils.equals(str, JPushConstants.Manufacturer.HUAWEI) || TextUtils.equals(str, JPushConstants.Manufacturer.HONOR)) {
            try {
                JCommonPrivatesApi.observer(context, (JObserver) Class.forName("cn.jiguang.privates.push.platform.huawei.JHuawei").newInstance());
            } catch (Throwable unused) {
                JCommonLog.m5430d(TAG, "not integrated huawei.aar");
                onPlatformNode(context, (byte) 2, 3001, 0, "");
            }
        }
    }

    private void observerMz(Context context, String str) {
        if (TextUtils.equals(str, JPushConstants.Manufacturer.MEIZU)) {
            try {
                JCommonPrivatesApi.observer(context, (JObserver) Class.forName("cn.jiguang.privates.push.platform.meizu.JMeizu").newInstance());
            } catch (Throwable unused) {
                JCommonLog.m5430d(TAG, "not integrated meizu.aar");
                onPlatformNode(context, (byte) 3, 3001, 0, "");
            }
        }
    }

    private void observerOppo(Context context, String str) {
        if (TextUtils.equals(str, JPushConstants.Manufacturer.OPPO) || TextUtils.equals(str, JPushConstants.Manufacturer.REALME) || TextUtils.equals(str, JPushConstants.Manufacturer.ONEPLUS)) {
            try {
                JCommonPrivatesApi.observer(context, (JObserver) Class.forName("cn.jiguang.privates.push.platform.oppo.JOppo").newInstance());
            } catch (Throwable unused) {
                JCommonLog.m5430d(TAG, "not integrated oppo.aar");
                onPlatformNode(context, (byte) 4, 3001, 0, "");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0086  */
    public void init(Context context) {
        Context context2;
        JCommonLog.m5430d(TAG, "on_tcp_connected init");
        try {
            int platformTokenFailedFrom = PlatformConfig.getPlatformTokenFailedFrom(context);
            JCommonLog.m5430d(TAG, "lastFrom:" + platformTokenFailedFrom);
            if (platformTokenFailedFrom > 0) {
                String platformTokenFailed = PlatformConfig.getPlatformTokenFailed(context);
                if (TextUtils.isEmpty(platformTokenFailed)) {
                    context2 = context;
                } else {
                    String[] strArrSplit = platformTokenFailed.split("_");
                    byte b11 = Byte.parseByte(strArrSplit[0]);
                    int iIntValue = Integer.valueOf(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.valueOf(strArrSplit[2]).intValue();
                    JCommonLog.m5430d(TAG, "init lastPlatformNode platform=" + ((int) b11) + " code=" + iIntValue + " m_code=" + iIntValue2);
                    context2 = context;
                    try {
                        onPlatformNode(context2, b11, iIntValue, iIntValue2, "");
                        PlatformConfig.setPlatformTokenFailed(context2, "");
                    } catch (Throwable th2) {
                        th = th2;
                        JCommonLog.m5433w(TAG, "lastFrom failed " + th.getMessage());
                    }
                }
            } else {
                context2 = context;
            }
        } catch (Throwable th3) {
            th = th3;
            context2 = context;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return;
        }
        String countryCode = JGlobal.getCountryCode(context2);
        JCommonLog.m5430d(TAG, "manufacturer is " + lowerCase + ", region:" + countryCode);
        initChannel(context2);
        observerGoogle(context2, countryCode);
        observerHuawei(context2, lowerCase);
        observerMi(context2, lowerCase);
        observerMz(context2, lowerCase);
        observerOppo(context2, lowerCase);
        observerVivo(context2, lowerCase);
        JCommonPrivatesApi.sendMessageToMainProcess(context2, 3101, null);
    }

    public void onPlatformTokenFailed(Context context, Bundle bundle) {
        long rid = ((JProtocol) bundle.getParcelable("protocol")).getRid();
        if (this.platformTokenMap.containsKey(Long.valueOf(rid))) {
            PlatformTokenMessage platformTokenMessage = this.platformTokenMap.get(Long.valueOf(rid));
            this.platformTokenMap.remove(Long.valueOf(rid));
            byte platform = platformTokenMessage.getPlatform();
            String token = platformTokenMessage.getToken();
            JCommonLog.m5430d(TAG, "onPlatformTokenFailed, rid:" + rid + ", platformToken:" + platformTokenMessage.toString());
            if (TextUtils.equals(token, JPushConfig.getPlatformToken(context, platform))) {
                JCommonLog.m5430d(TAG, "no need update platform state");
                onPlatformNode(context, platform, 3006, 0, token);
                return;
            }
            byte platformState = (byte) (JCoreGlobal.getPlatformState(context) | platform);
            byte b11 = (byte) (platform == 8 ? platformState & 223 : platformState | 128);
            JCommonLog.m5430d(TAG, "set platform state:" + ((int) b11));
            JCoreGlobal.setPlatformState(context, b11);
            onPlatformNode(context, platform, 3006, 0, token);
        }
    }

    public void onPlatformTokenSuccess(Context context, Bundle bundle) {
        JProtocol jProtocol = (JProtocol) bundle.getParcelable("protocol");
        long rid = jProtocol.getRid();
        short s11 = ByteBuffer.wrap(jProtocol.getBody()).getShort();
        if (!this.platformTokenMap.containsKey(Long.valueOf(rid))) {
            JCommonLog.m5430d(TAG, "onPlatformTokenFailed, rid:" + rid + ", internal error");
            return;
        }
        PlatformTokenMessage platformTokenMessage = this.platformTokenMap.get(Long.valueOf(rid));
        this.platformTokenMap.remove(Long.valueOf(rid));
        byte platform = platformTokenMessage.getPlatform();
        String token = platformTokenMessage.getToken();
        if (s11 != 0) {
            JCommonLog.m5430d(TAG, "onPlatformTokenFailed, rid:" + rid + ", code:" + ((int) s11));
            onPlatformNode(context, platform, 3006, s11, token);
            return;
        }
        JCommonLog.m5430d(TAG, "onPlatformTokenSuccess, rid:" + rid + ", platformToken:" + platformTokenMessage.toString());
        if (TextUtils.equals(token, JPushConfig.getPlatformToken(context, platform))) {
            JCommonLog.m5430d(TAG, "no need update platform state");
            onPlatformNode(context, platform, 3007, 0, token);
            return;
        }
        JPushConfig.setPlatformToken(context, platform, token);
        byte platformState = (byte) (JCoreGlobal.getPlatformState(context) | platform);
        byte b11 = (byte) (platform == 8 ? platformState | 32 : platformState & 127);
        JCommonLog.m5430d(TAG, "set platform state:" + ((int) b11));
        JCoreGlobal.setPlatformState(context, b11);
        onPlatformNode(context, platform, 3007, 0, token);
    }

    public void processMainToken(Context context, Bundle bundle) {
        JCommonReceiver commonReceiver;
        PlatformTokenMessage platformTokenMessage = (PlatformTokenMessage) bundle.getParcelable("message");
        if (platformTokenMessage == null || (commonReceiver = JGlobal.getCommonReceiver(context)) == null) {
            return;
        }
        String token = platformTokenMessage.getToken();
        JPushConfig.setPlatformToken(context, platformTokenMessage.getPlatform(), token);
        JCommonLog.m5430d(TAG, "processMainToken:" + token);
        commonReceiver.onPlatformToken(context, platformTokenMessage);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JPushConstants.RemoteWhat.ON_PLATFORM_TOKEN, bundle);
    }

    public void processRemoteToken(Context context, Bundle bundle) {
        bundle.setClassLoader(PlatformTokenMessage.class.getClassLoader());
        PlatformTokenMessage platformTokenMessage = (PlatformTokenMessage) bundle.getParcelable("message");
        long rid = JCoreGlobal.getRid();
        this.platformTokenMap.put(Long.valueOf(rid), platformTokenMessage);
        JCommonLog.m5430d(TAG, "send platformToken, rid:" + rid + ", platformToken:" + platformTokenMessage.toString());
        JProtocol threadName = new JProtocol().setRid(rid).setCommand(27).setVersion(1).setBody(JPushProtocol.packagePlatformTokenBody(platformTokenMessage.getPlatform(), platformTokenMessage.getToken())).setThreadName(JPush.THREAD_PUSH);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protocol", threadName);
        JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.UPLOAD, bundle2);
    }

    private String getManufacturerSystemVersion(Context context, String str) {
        str.getClass();
        switch (str) {
            case "blackshark":
                return getPropertiesStringValue(context, "ro.joyui.ui.version.code");
            case "oneplus":
                String propertiesStringValue = getPropertiesStringValue(context, "ro.rom.version");
                if (TextUtils.isEmpty(propertiesStringValue)) {
                    return getPropertiesStringValue(context, "ro.build.version.opporom");
                }
                return propertiesStringValue;
            case "huawei":
                String propertiesStringValue2 = getPropertiesStringValue(context, "ro.build.version.emui");
                if (TextUtils.isEmpty(propertiesStringValue2)) {
                    return getPropertiesStringValue(context, "hw_sc.build.platform.version");
                }
                return propertiesStringValue2;
            case "realme":
                return getPropertiesStringValue(context, "ro.build.version.realmeui");
            case "xiaomi":
                return getPropertiesStringValue(context, "ro.miui.ui.version.name");
            case "oppo":
                return getPropertiesStringValue(context, "ro.build.version.opporom");
            case "vivo":
                return getPropertiesStringValue(context, "ro.vivo.os.build.display.id");
            case "honor":
                return getPropertiesStringValue(context, "ro.build.version.magic");
            case "meizu":
                return getPropertiesStringValue(context, "ro.flyme.version.id");
            default:
                return "";
        }
    }

    private String getPropertiesStringValue(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "getPropertiesStringValue failed " + th2.getMessage());
            return "";
        }
    }

    private void observerMi(Context context, String str) {
        if (TextUtils.equals(str, JPushConstants.Manufacturer.XIAOMI) || TextUtils.equals(str, JPushConstants.Manufacturer.BLACKSHARK)) {
            try {
                JCommonPrivatesApi.observer(context, (JObserver) Class.forName("cn.jiguang.privates.push.platform.mi.JMi").newInstance());
            } catch (Throwable unused) {
                JCommonLog.m5430d(TAG, "not integrated mi.aar");
                onPlatformNode(context, (byte) 1, 3001, 0, "");
            }
        }
    }

    private void observerVivo(Context context, String str) {
        if (TextUtils.equals(str, JPushConstants.Manufacturer.VIVO)) {
            try {
                JCommonPrivatesApi.observer(context, (JObserver) Class.forName("cn.jiguang.privates.push.platform.vivo.JVivo").newInstance());
            } catch (Throwable unused) {
                JCommonLog.m5430d(TAG, "not integrated vivo.aar");
                onPlatformNode(context, (byte) 5, 3001, 0, "");
            }
        }
    }

    private void onPlatformNode(Context context, byte b11, int i11, int i12, String str) {
        try {
            byte platformState = JCoreGlobal.getPlatformState(context);
            String countryCode = JGlobal.getCountryCode(context);
            String str2 = Build.PRODUCT;
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            String str3 = Build.VERSION.RELEASE;
            String manufacturerSystemVersion = getManufacturerSystemVersion(context, lowerCase);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", (int) b11);
            jSONObject.put("code", i11);
            jSONObject.put("m_code", i12);
            jSONObject.put("m_flag", (int) platformState);
            jSONObject.put("m_token", str);
            jSONObject.put("country_code", countryCode);
            jSONObject.put("product", str2);
            jSONObject.put("manufacturer", lowerCase);
            jSONObject.put("system_version", str3);
            jSONObject.put("m_system_version", manufacturerSystemVersion);
            JReporter content = new JReporter().setType("platform_node").setContent(jSONObject.toString());
            Bundle bundle = new Bundle();
            bundle.putParcelable("protocol", content);
            JCommonPrivatesApi.sendMessageToRemoteProcess(context, JCoreConstants.RemoteWhat.REPORT, bundle);
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "reportPlatformNode failed " + th2.getMessage());
        }
    }
}
