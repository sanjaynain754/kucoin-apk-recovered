package com.tencent.imsdk.common;

import android.text.TextUtils;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.proguard.C33820nf;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class HttpClient {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static final int HTTP_ACTION_REQUEST = 0;
    public static final int HTTP_ACTION_RESPONSE = 1;
    private static final long KEEP_ALIVE = 5;
    private static final int MAX_POOL_SIZE;
    private static final int PROXY_TYPE_HTTP = 1;
    private static final int PROXY_TYPE_SOCKS5 = 2;
    private static final String TAG = "HttpClient";
    private static boolean mNeedRollbackHttps2Http;
    private static String mRollbackHttps2Http;
    private static final Executor mThreadPoolExecutor;

    public static class BasicAuthenticator extends Authenticator {
        private String password;
        private String userName;

        @Override // java.net.Authenticator
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(this.userName, this.password.toCharArray());
        }

        public BasicAuthenticator(String str, String str2) {
            this.userName = str;
            this.password = str2;
        }
    }

    public interface HttpRequestListener {
        void onCompleted(int i11, Map<String, String> map, byte[] bArr);

        void onProgress(int i11, int i12, int i13);

        void onStatistics(boolean z11, int i11, boolean z12, int i12, int i13, String str, int i14, int i15);
    }

    private static void httpRequest(final String str, final String str2, final boolean z11, final Map<String, String> map, final byte[] bArr, final String str3, final String str4, final int i11, final String str5, final int i12, final String str6, final String str7, final int i13, final int i14, final String str8, final boolean z12, final HttpRequestListener httpRequestListener) {
        mThreadPoolExecutor.execute(new Runnable() { // from class: com.tencent.imsdk.common.HttpClient.1
            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21381. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instruction units count: 2138
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.imsdk.common.HttpClient.RunnableC342961.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProgressCallback(int i11, int i12, int i13, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeResponseCallback(int i11, String[] strArr, String[] strArr2, byte[] bArr, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeSetHostname(Socket socket, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeStatisticsCallback(boolean z11, int i11, boolean z12, int i12, int i13, String str, int i14, int i15, long j11);

    public static /* synthetic */ String access$000() {
        return mRollbackHttps2Http;
    }

    public static /* synthetic */ String access$002(String str) {
        mRollbackHttps2Http = str;
        return str;
    }

    public static /* synthetic */ boolean access$100() {
        return mNeedRollbackHttps2Http;
    }

    public static /* synthetic */ boolean access$102(boolean z11) {
        mNeedRollbackHttps2Http = z11;
        return z11;
    }

    public static /* synthetic */ String access$400() {
        return TAG;
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i11 = iAvailableProcessors + 1;
        CORE_POOL_SIZE = i11;
        int i12 = (iAvailableProcessors * 2) + 1;
        MAX_POOL_SIZE = i12;
        mRollbackHttps2Http = "";
        mNeedRollbackHttps2Http = false;
        mThreadPoolExecutor = new ThreadPoolExecutor(i11, i12, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static /* synthetic */ boolean access$200(String str) {
        return needRollbackHttps2Http(str);
    }

    private static void httpRequest(String str, String str2, boolean z11, String[] strArr, String[] strArr2, byte[] bArr, String str3, String str4, int i11, String str5, int i12, String str6, String str7, int i13, int i14, String str8, boolean z12, final long j11) {
        HashMap map;
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            map = null;
        } else {
            map = new HashMap();
            for (int i15 = 0; i15 < strArr.length; i15++) {
                map.put(strArr[i15], strArr2[i15]);
            }
        }
        httpRequest(str, str2, z11, map, bArr, str3, str4, i11, str5, i12, str6, str7, i13, i14, str8, z12, new HttpRequestListener() { // from class: com.tencent.imsdk.common.HttpClient.2
            @Override // com.tencent.imsdk.common.HttpClient.HttpRequestListener
            public void onCompleted(int i16, Map<String, String> map2, byte[] bArr2) {
                String[] strArr3;
                String[] strArr4;
                if (j11 != 0) {
                    if (map2 != null) {
                        String[] strArr5 = new String[map2.size()];
                        String[] strArr6 = new String[map2.size()];
                        int i17 = 0;
                        for (Map.Entry<String, String> entry : map2.entrySet()) {
                            strArr5[i17] = entry.getKey();
                            strArr6[i17] = entry.getValue();
                            i17++;
                        }
                        strArr3 = strArr5;
                        strArr4 = strArr6;
                    } else {
                        strArr3 = null;
                        strArr4 = null;
                    }
                    HttpClient.nativeResponseCallback(i16, strArr3, strArr4, bArr2, j11);
                }
            }

            @Override // com.tencent.imsdk.common.HttpClient.HttpRequestListener
            public void onProgress(int i16, int i17, int i18) {
                long j12 = j11;
                if (j12 != 0) {
                    HttpClient.nativeProgressCallback(i16, i17, i18, j12);
                }
            }

            @Override // com.tencent.imsdk.common.HttpClient.HttpRequestListener
            public void onStatistics(boolean z13, int i16, boolean z14, int i17, int i18, String str9, int i19, int i21) {
                long j12 = j11;
                if (j12 != 0) {
                    HttpClient.nativeStatisticsCallback(z13, i16, z14, i17, i18, str9, i19, i21, j12);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needRollbackHttps2Http(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                String str2 = "";
                if (SystemUtil.isBrandOppo()) {
                    str2 = JPushConstants.Manufacturer.OPPO;
                } else if (SystemUtil.isBrandVivo()) {
                    str2 = JPushConstants.Manufacturer.VIVO;
                } else if (SystemUtil.isBrandHuawei()) {
                    str2 = JPushConstants.Manufacturer.HUAWEI;
                } else if (SystemUtil.isBrandXiaoMi()) {
                    str2 = JPushConstants.Manufacturer.XIAOMI;
                } else if (SystemUtil.isBrandMeizu()) {
                    str2 = JPushConstants.Manufacturer.MEIZU;
                }
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    String string = jSONObject.getString(C33820nf.f71125D);
                    int i12 = jSONObject.getInt("below_version");
                    if (str2.equals(string)) {
                        if (SystemUtil.getSDKVersion() <= i12) {
                            return true;
                        }
                    }
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }
}
