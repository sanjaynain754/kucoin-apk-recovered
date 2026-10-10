package cn.jiguang.privates.core.protocol;

import android.content.Context;
import android.os.Build;
import cn.jiguang.privates.common.cache.JCommonConfig;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;
import cn.jiguang.privates.common.observer.JObserver;
import cn.jiguang.privates.common.utils.DeviceUtil;
import cn.jiguang.privates.common.utils.StringUtil;
import cn.jiguang.privates.common.utils.SystemUtil;
import cn.jiguang.privates.core.api.Outputer;
import cn.jiguang.privates.core.cache.JCoreConfig;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class JCoreProtocol {
    private static final String TAG = "JCoreProtocol";

    private static String getClientInfo(Context context) {
        return Build.VERSION.RELEASE.toLowerCase() + "," + Build.VERSION.SDK_INT + "$$" + Build.MODEL.toLowerCase() + "$$$$" + Build.DEVICE.toLowerCase() + "$$" + JGlobal.getAppChannel(context) + "$$" + getRegisterSdkVersion() + "$$" + SystemUtil.isSystemApp(context) + "$$" + DeviceUtil.getResolution(context) + "$$" + Build.MANUFACTURER.toLowerCase();
    }

    public static byte[] packageHeartbeatBody(Context context) {
        Outputer outputer = new Outputer(1);
        outputer.writeU8(getSdkFlag());
        return outputer.toByteArray();
    }

    public static byte[] packageRegisterBody(Context context) {
        JCoreConfig.setUserId(context, 0L);
        JCoreConfig.setRegistrationId(context, "");
        JCoreConfig.setPassword(context, "");
        JCoreConfig.setSeedId(context, 0);
        JCoreConfig.setServerTime(context, 0L);
        String str = " $$ $$" + context.getPackageName() + "$$" + JGlobal.getAppKey(context);
        String appVersionName = JGlobal.getAppVersionName(context);
        String clientInfo = getClientInfo(context);
        String deviceInfo = getDeviceInfo(context);
        short sdkFlag = getSdkFlag();
        JCommonLog.m5430d(TAG, "register with clientInfo:" + clientInfo + ", deviceInfo:" + deviceInfo);
        byte[] bytes = str.getBytes();
        byte[] bytes2 = appVersionName.getBytes();
        byte[] bytes3 = clientInfo.getBytes();
        byte[] bytes4 = deviceInfo.getBytes();
        byte[] bytes5 = "".getBytes();
        Outputer outputer = new Outputer(bytes.length + bytes2.length + bytes3.length + 1 + bytes4.length + 4 + bytes5.length);
        outputer.writeByteArrayIncludeLength(bytes);
        outputer.writeByteArrayIncludeLength(bytes2);
        outputer.writeByteArrayIncludeLength(bytes3);
        outputer.writeU8(0);
        outputer.writeByteArrayIncludeLength(bytes4);
        outputer.writeU32(sdkFlag);
        outputer.writeByteArrayIncludeLength(bytes5);
        return outputer.toByteArray();
    }

    private static String getDeviceInfo(Context context) {
        return "0$$" + JGlobal.getDeviceId(context) + "$$ $$ $$ $$ ";
    }

    private static String getLoginSdkVersion() {
        int sdkPriority;
        int i11 = 0;
        for (JObserver jObserver : JObservable.getInstance().observeQueue) {
            if (jObserver.isSdk() && i11 < (sdkPriority = jObserver.getSdkPriority())) {
                i11 = sdkPriority;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 1; i12 <= i11; i12++) {
            for (JObserver jObserver2 : JObservable.getInstance().observeQueue) {
                if (jObserver2.isSdk() && jObserver2.getSdkPriority() == i12) {
                    String[] strArrSplit = jObserver2.getSdkVersion().split("\\.");
                    sb2.append((Integer.parseInt(strArrSplit[0]) << 16) + (Integer.parseInt(strArrSplit[1]) << 8) + Integer.parseInt(strArrSplit[2]));
                }
            }
        }
        return sb2.toString();
    }

    private static String getRegisterSdkVersion() {
        int sdkPriority;
        int i11 = 0;
        for (JObserver jObserver : JObservable.getInstance().observeQueue) {
            if (jObserver.isSdk() && i11 < (sdkPriority = jObserver.getSdkPriority())) {
                i11 = sdkPriority;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 <= i11; i12++) {
            for (JObserver jObserver2 : JObservable.getInstance().observeQueue) {
                if (jObserver2.isSdk() && jObserver2.getSdkPriority() == i12) {
                    sb2.append(jObserver2.getSdkVersion());
                    sb2.append("|");
                }
            }
        }
        return sb2.substring(0, sb2.length() - 1);
    }

    private static short getSdkFlag() {
        int sdkPriority;
        int i11 = 0;
        for (JObserver jObserver : JObservable.getInstance().observeQueue) {
            if (jObserver.isSdk() && i11 < (sdkPriority = jObserver.getSdkPriority())) {
                i11 = sdkPriority;
            }
        }
        short sdkFlag = 0;
        for (int i12 = 0; i12 <= i11; i12++) {
            for (JObserver jObserver2 : JObservable.getInstance().observeQueue) {
                if (jObserver2.isSdk() && jObserver2.getSdkPriority() == i12) {
                    sdkFlag = (short) (sdkFlag | jObserver2.getSdkFlag());
                }
            }
        }
        return sdkFlag;
    }

    public static byte[] packageLoginBody(Context context) {
        String md5 = StringUtil.toMD5(JCoreConfig.getPassword(context));
        String loginSdkVersion = getLoginSdkVersion();
        String str = StringUtil.get32MD5String(JGlobal.getAppKey(context));
        short sdkFlag = getSdkFlag();
        byte platformState = JCoreConfig.getPlatformState(context);
        int networkType = JGlobal.getNetworkType();
        String deviceId = JCommonConfig.getDeviceId(context);
        String countryCode = JGlobal.getCountryCode(context);
        JCommonLog.m5430d(TAG, "login with uid:" + JCoreConfig.getUserId(context) + ", registrationId:" + JCoreConfig.getRegistrationId(context) + ", platform:" + ((int) platformState));
        byte[] bytes = md5.getBytes();
        byte[] bytes2 = loginSdkVersion.getBytes();
        byte[] bytes3 = str.getBytes();
        byte[] bytes4 = deviceId.getBytes();
        byte[] bytes5 = "".getBytes();
        byte[] bytes6 = countryCode.getBytes();
        byte[] bytes7 = "".getBytes();
        Outputer outputer = new Outputer(bytes.length + 4 + bytes2.length + bytes3.length + 7 + bytes4.length + bytes5.length + bytes6.length + bytes7.length);
        outputer.writeU8(97);
        outputer.writeU8(0);
        outputer.writeU16(0);
        outputer.writeByteArrayIncludeLength(bytes);
        outputer.writeByteArrayIncludeLength(bytes2);
        outputer.writeByteArrayIncludeLength(bytes3);
        outputer.writeU8(0);
        outputer.writeU32(sdkFlag);
        outputer.writeU8(platformState);
        outputer.writeU8(networkType);
        outputer.writeByteArrayIncludeLength(bytes4);
        outputer.writeByteArrayIncludeLength(bytes5);
        outputer.writeByteArrayIncludeLength(bytes6);
        outputer.writeByteArrayIncludeLength(bytes7);
        return outputer.toByteArray();
    }

    public static int parseLoginBody(Context context, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        short s11 = byteBufferWrap.getShort();
        JCoreConfig.setLoginCode(context, s11);
        if (s11 != 0) {
            if (s11 != 108) {
                JCommonLog.m5431e(TAG, "login failed code:" + ((int) s11) + ", message:" + StringUtil.getTlv2(byteBufferWrap));
                return s11;
            }
            JCoreConfig.setUserId(context, 0L);
            JCoreConfig.setRegistrationId(context, "");
            JCoreConfig.setPassword(context, "");
            JCoreConfig.setSeedId(context, 0);
            JCoreConfig.setServerTime(context, 0L);
            JCommonLog.m5431e(TAG, "onLoginFailed, will re-register");
            return s11;
        }
        int i11 = byteBufferWrap.getInt();
        byteBufferWrap.getShort();
        StringUtil.getTlv2(byteBufferWrap);
        int i12 = byteBufferWrap.getInt();
        byteBufferWrap.get();
        JCoreConfig.setSeedId(context, i11);
        JCoreConfig.setServerTime(context, i12);
        JCommonLog.m5430d(TAG, "onLoginSuccess seedId:" + i11 + ", serverTime:" + i12);
        return s11;
    }

    public static int parseRegisterBody(Context context, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        short s11 = byteBufferWrap.getShort();
        JCoreConfig.setRegisterCode(context, s11);
        if (s11 != 0) {
            JCommonLog.m5431e(TAG, "onRegisterFailed code:" + ((int) s11) + ", message:" + StringUtil.getTlv2(byteBufferWrap));
            return s11;
        }
        long j11 = byteBufferWrap.getLong();
        String tlv2 = StringUtil.getTlv2(byteBufferWrap);
        String tlv3 = StringUtil.getTlv2(byteBufferWrap);
        JCoreConfig.setUserId(context, j11);
        JCoreConfig.setRegistrationId(context, tlv3);
        JCoreConfig.setPassword(context, tlv2);
        JCommonLog.m5430d(TAG, "onRegisterSuccess uid:" + j11 + ", registrationId:" + tlv3 + ", password:" + tlv2);
        return s11;
    }
}
