package com.tencent.imsdk.common;

/* JADX INFO: loaded from: classes59.dex */
public class HttpClient {
    private static final int CORE_POOL_SIZE = 0;
    private static final int CPU_COUNT = 0;
    public static final int HTTP_ACTION_REQUEST = 0;
    public static final int HTTP_ACTION_RESPONSE = 1;
    private static final long KEEP_ALIVE = 5;
    private static final int MAX_POOL_SIZE = 0;
    private static final int PROXY_TYPE_HTTP = 1;
    private static final int PROXY_TYPE_SOCKS5 = 2;
    private static final java.lang.String TAG = "HttpClient";
    private static boolean mNeedRollbackHttps2Http;
    private static java.lang.String mRollbackHttps2Http;
    private static final java.util.concurrent.Executor mThreadPoolExecutor = null;



    public static class BasicAuthenticator extends java.net.Authenticator {
        private java.lang.String password;
        private java.lang.String userName;

        public BasicAuthenticator(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.userName = r1
                r0.password = r2
                return
        }

        @Override // java.net.Authenticator
        public java.net.PasswordAuthentication getPasswordAuthentication() {
                r3 = this;
                java.net.PasswordAuthentication r0 = new java.net.PasswordAuthentication
                java.lang.String r1 = r3.userName
                java.lang.String r2 = r3.password
                char[] r2 = r2.toCharArray()
                r0.<init>(r1, r2)
                return r0
        }
    }

    public interface HttpRequestListener {
        void onCompleted(int r1, java.util.Map<java.lang.String, java.lang.String> r2, byte[] r3);

        void onProgress(int r1, int r2, int r3);

        void onStatistics(boolean r1, int r2, boolean r3, int r4, int r5, java.lang.String r6, int r7, int r8);
    }

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.tencent.imsdk.common.HttpClient.CPU_COUNT = r0
            int r2 = r0 + 1
            com.tencent.imsdk.common.HttpClient.CORE_POOL_SIZE = r2
            int r0 = r0 * 2
            int r3 = r0 + 1
            com.tencent.imsdk.common.HttpClient.MAX_POOL_SIZE = r3
            java.lang.String r0 = ""
            com.tencent.imsdk.common.HttpClient.mRollbackHttps2Http = r0
            r0 = 0
            com.tencent.imsdk.common.HttpClient.mNeedRollbackHttps2Http = r0
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            r4 = 5
            r1.<init>(r2, r3, r4, r6, r7)
            com.tencent.imsdk.common.HttpClient.mThreadPoolExecutor = r1
            return
    }

    public HttpClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = com.tencent.imsdk.common.HttpClient.mRollbackHttps2Http
            return r0
    }

    public static /* synthetic */ java.lang.String access$002(java.lang.String r0) {
            com.tencent.imsdk.common.HttpClient.mRollbackHttps2Http = r0
            return r0
    }

    public static /* synthetic */ boolean access$100() {
            boolean r0 = com.tencent.imsdk.common.HttpClient.mNeedRollbackHttps2Http
            return r0
    }

    public static /* synthetic */ boolean access$102(boolean r0) {
            com.tencent.imsdk.common.HttpClient.mNeedRollbackHttps2Http = r0
            return r0
    }

    public static /* synthetic */ boolean access$200(java.lang.String r0) {
            boolean r0 = needRollbackHttps2Http(r0)
            return r0
    }

    public static /* synthetic */ boolean access$300(java.net.Socket r0, java.lang.String r1) {
            boolean r0 = nativeSetHostname(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String access$400() {
            java.lang.String r0 = com.tencent.imsdk.common.HttpClient.TAG
            return r0
    }

    public static /* synthetic */ void access$500(int r0, int r1, int r2, long r3) {
            nativeProgressCallback(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void access$600(boolean r0, int r1, boolean r2, int r3, int r4, java.lang.String r5, int r6, int r7, long r8) {
            nativeStatisticsCallback(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ void access$700(int r0, java.lang.String[] r1, java.lang.String[] r2, byte[] r3, long r4) {
            nativeResponseCallback(r0, r1, r2, r3, r4)
            return
    }

    private static void httpRequest(java.lang.String r18, java.lang.String r19, boolean r20, java.util.Map<java.lang.String, java.lang.String> r21, byte[] r22, java.lang.String r23, java.lang.String r24, int r25, java.lang.String r26, int r27, java.lang.String r28, java.lang.String r29, int r30, int r31, java.lang.String r32, boolean r33, com.tencent.imsdk.common.HttpClient.HttpRequestListener r34) {
            com.tencent.imsdk.common.HttpClient$1 r0 = new com.tencent.imsdk.common.HttpClient$1
            r9 = r18
            r1 = r19
            r13 = r20
            r12 = r21
            r14 = r22
            r15 = r23
            r17 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r10 = r30
            r11 = r31
            r2 = r32
            r3 = r33
            r16 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.concurrent.Executor r1 = com.tencent.imsdk.common.HttpClient.mThreadPoolExecutor
            r1.execute(r0)
            return
    }

    private static void httpRequest(java.lang.String r20, java.lang.String r21, boolean r22, java.lang.String[] r23, java.lang.String[] r24, byte[] r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.String r32, int r33, int r34, java.lang.String r35, boolean r36, long r37) {
            r0 = r23
            r1 = r24
            if (r0 == 0) goto L21
            if (r1 == 0) goto L21
            int r2 = r0.length
            int r3 = r1.length
            if (r2 != r3) goto L21
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
        L12:
            int r4 = r0.length
            if (r3 >= r4) goto L1f
            r4 = r0[r3]
            r5 = r1[r3]
            r2.put(r4, r5)
            int r3 = r3 + 1
            goto L12
        L1f:
            r6 = r2
            goto L23
        L21:
            r2 = 0
            goto L1f
        L23:
            com.tencent.imsdk.common.HttpClient$2 r0 = new com.tencent.imsdk.common.HttpClient$2
            r1 = r37
            r0.<init>(r1)
            r3 = r20
            r4 = r21
            r5 = r22
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r16 = r34
            r17 = r35
            r18 = r36
            r19 = r0
            httpRequest(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
    }

    private static native void nativeProgressCallback(int r0, int r1, int r2, long r3);

    private static native void nativeResponseCallback(int r0, java.lang.String[] r1, java.lang.String[] r2, byte[] r3, long r4);

    private static native boolean nativeSetHostname(java.net.Socket r0, java.lang.String r1);

    private static native void nativeStatisticsCallback(boolean r0, int r1, boolean r2, int r3, int r4, java.lang.String r5, int r6, int r7, long r8);

    private static boolean needRollbackHttps2Http(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            goto L6b
        L8:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L19
            r0.<init>(r6)     // Catch: org.json.JSONException -> L19
            java.lang.String r6 = ""
            boolean r2 = com.tencent.imsdk.common.SystemUtil.isBrandOppo()     // Catch: org.json.JSONException -> L19
            if (r2 == 0) goto L1b
            java.lang.String r6 = "oppo"
            goto L40
        L19:
            r6 = move-exception
            goto L68
        L1b:
            boolean r2 = com.tencent.imsdk.common.SystemUtil.isBrandVivo()     // Catch: org.json.JSONException -> L19
            if (r2 == 0) goto L25
            java.lang.String r6 = "vivo"
            goto L40
        L25:
            boolean r2 = com.tencent.imsdk.common.SystemUtil.isBrandHuawei()     // Catch: org.json.JSONException -> L19
            if (r2 == 0) goto L2e
            java.lang.String r6 = "huawei"
            goto L40
        L2e:
            boolean r2 = com.tencent.imsdk.common.SystemUtil.isBrandXiaoMi()     // Catch: org.json.JSONException -> L19
            if (r2 == 0) goto L38
            java.lang.String r6 = "xiaomi"
            goto L40
        L38:
            boolean r2 = com.tencent.imsdk.common.SystemUtil.isBrandMeizu()     // Catch: org.json.JSONException -> L19
            if (r2 == 0) goto L40
            java.lang.String r6 = "meizu"
        L40:
            r2 = r1
        L41:
            int r3 = r0.length()     // Catch: org.json.JSONException -> L19
            if (r2 >= r3) goto L6b
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch: org.json.JSONException -> L19
            java.lang.String r4 = "brand"
            java.lang.String r4 = r3.getString(r4)     // Catch: org.json.JSONException -> L19
            java.lang.String r5 = "below_version"
            int r3 = r3.getInt(r5)     // Catch: org.json.JSONException -> L19
            boolean r4 = r6.equals(r4)     // Catch: org.json.JSONException -> L19
            if (r4 == 0) goto L65
            int r6 = com.tencent.imsdk.common.SystemUtil.getSDKVersion()     // Catch: org.json.JSONException -> L19
            if (r6 > r3) goto L6b
            r6 = 1
            return r6
        L65:
            int r2 = r2 + 1
            goto L41
        L68:
            r6.printStackTrace()
        L6b:
            return r1
    }
}
