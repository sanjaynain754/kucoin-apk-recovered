package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.jni.TPDownloadProxyNative;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes63.dex */
public class TPCGIRequester {
    private static final String FILE_NAME = "TPCGIRequester";
    private static final int MAX_RETRY_TIMES = 3;
    private static final int MSG_CONFIG_URL = 2011;
    private static final int MSG_REPORT_URL = 2010;
    private static final int MSG_WUJI_CONFIG_URL = 2013;
    private static final int RETRY_INTERVAL = 3000;
    private static final int TIMEOUT = 3000;
    private static volatile ExecutorService mCustomExecutor;
    private static TPCGIRequester mRequester;
    private LinkedBlockingQueue<TPRequestItem> mRetryQueue = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<TPRequestItem> mRequestQueue = new LinkedBlockingQueue<>();
    private TimerTask mTimerTask = new TimerTask() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPCGIRequester.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            while (TPCGIRequester.this.mRetryQueue.peek() != null && System.currentTimeMillis() - ((TPRequestItem) TPCGIRequester.this.mRetryQueue.peek()).getRequestFailedTime() > 3000) {
                TPCGIRequester tPCGIRequester = TPCGIRequester.this;
                tPCGIRequester.addNotifyReqQueue((TPRequestItem) tPCGIRequester.mRetryQueue.poll());
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void addNotifyReqQueue(TPRequestItem tPRequestItem) {
        try {
            this.mRequestQueue.put(tPRequestItem);
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "RequestQueue add failed:" + th2.toString());
        }
    }

    public static TPCGIRequester getInstance() {
        if (mRequester == null) {
            synchronized (TPCGIRequester.class) {
                try {
                    if (mRequester == null) {
                        mRequester = new TPCGIRequester();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mRequester;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea A[DONT_GENERATE] */
    public boolean handleRequestItem(TPRequestItem tPRequestItem) {
        boolean z11;
        HttpURLConnection httpURLConnection = null;
        boolean z12 = false;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(tPRequestItem.getUrl()).openConnection()));
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setConnectTimeout(3000);
                httpURLConnection2.connect();
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode == 200 || responseCode == 206) {
                    try {
                        if (tPRequestItem.getRequestType() == 2011 || tPRequestItem.getRequestType() == 2013) {
                            StringBuffer stringBuffer = new StringBuffer();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream(), "UTF-8"));
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                stringBuffer.append(line);
                                stringBuffer.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                            }
                            bufferedReader.close();
                            String strReplace = stringBuffer.toString().replace("QZOutputJson=", "");
                            JSONObject jSONObject = new JSONObject(strReplace);
                            TPDLProxyLog.m78075i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "start update config. responce data: ".concat(String.valueOf(strReplace)));
                            if (tPRequestItem.getRequestType() == 2013) {
                                if (jSONObject.getInt("code") == 0) {
                                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, jSONObject.getString("data"));
                                }
                            } else if (jSONObject.getInt("ret") == 0) {
                                TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, jSONObject.getJSONObject("config").toString());
                            }
                        }
                        z12 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = httpURLConnection2;
                        z11 = true;
                        try {
                            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "Send Request Routine error:" + th.toString());
                            return z11;
                        } finally {
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        }
                    }
                }
                httpURLConnection2.disconnect();
                return z12;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                z11 = false;
                TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "Send Request Routine error:" + th.toString());
                return z11;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static ExecutorService obtainThreadExcutor() {
        if (mCustomExecutor == null) {
            synchronized (TPCGIRequester.class) {
                try {
                    if (mCustomExecutor == null) {
                        mCustomExecutor = Executors.newSingleThreadExecutor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mCustomExecutor;
    }

    private TPCGIRequester() {
        new Timer(true).scheduleAtFixedRate(this.mTimerTask, 0L, 1000L);
        process();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRetryRequestItem(TPRequestItem tPRequestItem) {
        try {
            if (tPRequestItem.getRequestTimes() <= 3) {
                this.mRetryQueue.put(tPRequestItem);
            }
        } catch (Throwable th2) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "retry queue add failed" + th2.toString());
        }
    }

    private void process() {
        obtainThreadExcutor().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPCGIRequester.2
            /* JADX INFO: Infinite loop detected, blocks: 12, insns: 0 */
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        TPRequestItem tPRequestItem = (TPRequestItem) TPCGIRequester.this.mRequestQueue.take();
                        if (!TPCGIRequester.this.handleRequestItem(tPRequestItem)) {
                            tPRequestItem.updateFailedTime();
                            TPCGIRequester.this.addRetryRequestItem(tPRequestItem);
                        }
                    } catch (Throwable th2) {
                        TPDLProxyLog.m78074e(TPCGIRequester.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "request queue take failed: " + th2.toString());
                    }
                }
            }
        });
    }

    public void addRequestItem(String str, int i11) {
        if (str.isEmpty()) {
            TPDLProxyLog.m78074e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "request url null");
        } else {
            addNotifyReqQueue(new TPRequestItem(str, i11));
        }
    }
}
