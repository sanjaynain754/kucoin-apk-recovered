package cn.jiguang.privates.push.protocol;

import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.Outputer;

/* JADX INFO: loaded from: classes34.dex */
public class JPushProtocol {
    private static final String TAG = "JPushProtocol";

    public static byte[] packageMessageBody(int i11, long j11) {
        Outputer outputer = new Outputer(11);
        outputer.writeU16(0);
        outputer.writeU8((byte) i11);
        outputer.writeU64(j11);
        return outputer.toByteArray();
    }

    public static byte[] packageMobileNumberBody(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Outputer outputer = new Outputer(bytes.length + 2);
            outputer.writeU8(7);
            outputer.writeU8(1);
            outputer.writeByteArrayIncludeLength(bytes);
            return outputer.toByteArray();
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "packageMobileNumberBody failed " + th2.getMessage());
            return null;
        }
    }

    public static byte[] packageOperationBody(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Outputer outputer = new Outputer(bytes.length);
            outputer.writeByteArrayIncludeLength(bytes);
            return outputer.toByteArray();
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "packageAliasRequest failed " + th2.getMessage());
            return null;
        }
    }

    public static byte[] packagePlatformTokenBody(byte b11, String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Outputer outputer = new Outputer(bytes.length + 1);
            outputer.writeByteArrayIncludeLength(bytes);
            outputer.writeU8(b11);
            return outputer.toByteArray();
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "packagePlatformTokenBody failed " + th2.getMessage());
            return null;
        }
    }
}
