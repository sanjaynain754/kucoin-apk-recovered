package com.sensorsdata.analytics.android.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.credentials.provider.CredentialEntry;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.exceptions.ConnectErrorException;
import com.sensorsdata.analytics.android.sdk.exceptions.DebugModeException;
import com.sensorsdata.analytics.android.sdk.exceptions.InvalidDataException;
import com.sensorsdata.analytics.android.sdk.exceptions.ResponseErrorException;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
class AnalyticsMessages {
    private static final int DELETE_ALL = 4;
    private static final int FLUSH_QUEUE = 3;
    private static final int FLUSH_SCHEDULE = 5;
    private static final Map<Context, AnalyticsMessages> S_INSTANCES = new HashMap();
    private static final String TAG = "SA.AnalyticsMessages";
    private final Context mContext;
    private SensorsDataAPI mSensorsDataAPI;
    private final DbAdapter mDbAdapter = DbAdapter.getInstance();
    private final Worker mWorker = new Worker();

    public class Worker {
        private Handler mHandler;
        private final Object mHandlerLock = new Object();

        public class AnalyticsMessageHandler extends Handler {
            public AnalyticsMessageHandler(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) throws Throwable {
                try {
                    int i11 = message.what;
                    if (i11 == 3) {
                        AnalyticsMessages.this.sendData();
                    } else if (i11 == 4) {
                        try {
                            AnalyticsMessages.this.mDbAdapter.deleteAllEvents();
                        } catch (Exception e11) {
                            SALog.printStackTrace(e11);
                        }
                    } else if (i11 == 5) {
                        AnalyticsMessages.this.flushScheduled();
                        AnalyticsMessages.this.sendData();
                    } else {
                        SALog.m68589i(AnalyticsMessages.TAG, "Unexpected message received by SensorsData worker: " + message);
                    }
                } catch (RuntimeException e12) {
                    SALog.m68590i(AnalyticsMessages.TAG, "Worker threw an unhandled exception", e12);
                }
            }
        }

        public Worker() {
            HandlerThread handlerThread = new HandlerThread("com.sensorsdata.analytics.android.sdk.AnalyticsMessages.Worker", 1);
            handlerThread.start();
            this.mHandler = new AnalyticsMessageHandler(handlerThread.getLooper());
        }

        public void runMessage(Message message) {
            synchronized (this.mHandlerLock) {
                try {
                    Handler handler = this.mHandler;
                    if (handler == null) {
                        SALog.m68589i(AnalyticsMessages.TAG, "Dead worker dropping a message: " + message.what);
                    } else {
                        handler.sendMessage(message);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void runMessageOnce(Message message, long j11) {
            synchronized (this.mHandlerLock) {
                try {
                    Handler handler = this.mHandler;
                    if (handler == null) {
                        SALog.m68589i(AnalyticsMessages.TAG, "Dead worker dropping a message: " + message.what);
                    } else if (!handler.hasMessages(message.what)) {
                        this.mHandler.sendMessageDelayed(message, j11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void closeStream(BufferedOutputStream bufferedOutputStream, OutputStream outputStream, InputStream inputStream, HttpURLConnection httpURLConnection) {
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (Exception e11) {
                SALog.m68589i(TAG, e11.getMessage());
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception e12) {
                SALog.m68589i(TAG, e12.getMessage());
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e13) {
                SALog.m68589i(TAG, e13.getMessage());
            }
        }
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e14) {
                SALog.m68589i(TAG, e14.getMessage());
            }
        }
    }

    private String encodeData(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.getBytes("UTF-8").length);
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes("UTF-8"));
                    gZIPOutputStream2.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    String str2 = new String(Base64Coder.encode(byteArray));
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return str2;
                } catch (IOException e11) {
                    e = e11;
                    gZIPOutputStream = gZIPOutputStream2;
                    throw new InvalidDataException(e);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static AnalyticsMessages getInstance(Context context, SensorsDataAPI sensorsDataAPI) {
        AnalyticsMessages analyticsMessages;
        Map<Context, AnalyticsMessages> map = S_INSTANCES;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (map.containsKey(applicationContext)) {
                    analyticsMessages = map.get(applicationContext);
                } else {
                    analyticsMessages = new AnalyticsMessages(applicationContext, sensorsDataAPI);
                    map.put(applicationContext, analyticsMessages);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return analyticsMessages;
    }

    private boolean isDeleteEventsByCode(int i11) {
        if (i11 == 404 || i11 == 403) {
            return false;
        }
        return i11 < 500 || i11 >= 600;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0361 */
    /* JADX WARN: Code duplicated, block: B:190:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0322  */
    /* JADX WARN: Code duplicated, block: B:199:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x032c A[Catch: Exception -> 0x0330, TryCatch #0 {Exception -> 0x0330, blocks: (B:197:0x0326, B:200:0x032c, B:203:0x0332), top: B:220:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI.mIsMainProcess == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendData() throws Throwable {
        String[] strArrGenerateDataString;
        AnalyticsMessages analyticsMessages;
        Throwable th2;
        boolean zIsDeleteEventsByCode;
        String str;
        String str2;
        String str3;
        String str4;
        boolean zIsDebugMode;
        try {
            if (!this.mSensorsDataAPI.isNetworkRequestEnable()) {
                SALog.m68589i(TAG, "NetworkRequest 已关闭，不发送数据！");
                return;
            }
            if (TextUtils.isEmpty(this.mSensorsDataAPI.getServerUrl())) {
                SALog.m68589i(TAG, "Server url is null or empty.");
                return;
            }
            if (NetworkUtils.isNetworkAvailable(this.mContext)) {
                String strNetworkType = NetworkUtils.networkType(this.mContext);
                if (!NetworkUtils.isShouldFlush(strNetworkType, this.mSensorsDataAPI.getFlushNetworkPolicy())) {
                    SALog.m68589i(TAG, String.format("您当前网络为 %s，无法发送数据，请确认您的网络发送策略！", strNetworkType));
                    return;
                }
                if (AbstractSensorsDataAPI.getConfigOptions().isMultiProcessFlush()) {
                    if (!DbAdapter.getInstance().isSubProcessFlushing()) {
                        DbAdapter.getInstance().commitSubProcessFlushState(true);
                        int iCleanupEvents = 100;
                        Toast toastMakeText = null;
                        while (true) {
                            int iCleanupEvents2 = 0;
                            if (iCleanupEvents <= 0) {
                                if (AbstractSensorsDataAPI.getConfigOptions().isMultiProcessFlush()) {
                                    DbAdapter.getInstance().commitSubProcessFlushState(false);
                                    return;
                                }
                                return;
                            }
                            synchronized (this.mDbAdapter) {
                                try {
                                    strArrGenerateDataString = this.mSensorsDataAPI.isDebugMode() ? this.mDbAdapter.generateDataString(DbParams.TABLE_EVENTS, 1) : this.mDbAdapter.generateDataString(DbParams.TABLE_EVENTS, 50);
                                } catch (Throwable th3) {
                                    th = th3;
                                    while (true) {
                                        throw th;
                                    }
                                }
                            }
                            if (strArrGenerateDataString == null) {
                                DbAdapter.getInstance().commitSubProcessFlushState(false);
                                return;
                            }
                            String str5 = strArrGenerateDataString[0];
                            String str6 = strArrGenerateDataString[1];
                            String str7 = strArrGenerateDataString[2];
                            try {
                                String strEncodeData = "1".equals(str7) ? encodeData(str6) : str6;
                                if (TextUtils.isEmpty(strEncodeData)) {
                                    analyticsMessages = this;
                                } else {
                                    analyticsMessages = this;
                                    try {
                                        try {
                                            analyticsMessages.sendHttpRequest(this.mSensorsDataAPI.getServerUrl(), strEncodeData, str7, str6, false);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            zIsDeleteEventsByCode = true;
                                            th2 = th;
                                            zIsDebugMode = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                            if (!TextUtils.isEmpty(null) && (zIsDebugMode || SALog.isLogEnabled())) {
                                                SALog.m68589i(TAG, (String) null);
                                                if (zIsDebugMode && AbstractSensorsDataAPI.SHOW_DEBUG_INFO_VIEW) {
                                                    try {
                                                        if (Build.VERSION.SDK_INT != 25) {
                                                            if (toastMakeText != null) {
                                                                toastMakeText.cancel();
                                                            }
                                                            Toast.makeText(analyticsMessages.mContext, (CharSequence) null, 0).show();
                                                        }
                                                    } catch (Exception e11) {
                                                        SALog.printStackTrace(e11);
                                                    }
                                                }
                                            }
                                            if (zIsDeleteEventsByCode && !zIsDebugMode) {
                                                throw th2;
                                            }
                                            SALog.m68589i(TAG, String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(analyticsMessages.mDbAdapter.cleanupEvents(str5))));
                                            throw th2;
                                        }
                                    } catch (ConnectErrorException e12) {
                                        e = e12;
                                        String str8 = "Connection error: " + e.getMessage();
                                        boolean zIsDebugMode2 = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                        if (!TextUtils.isEmpty(str8) && (zIsDebugMode2 || SALog.isLogEnabled())) {
                                            SALog.m68589i(TAG, str8);
                                            if (zIsDebugMode2 && AbstractSensorsDataAPI.SHOW_DEBUG_INFO_VIEW) {
                                                try {
                                                    if (Build.VERSION.SDK_INT != 25) {
                                                        if (toastMakeText != null) {
                                                            toastMakeText.cancel();
                                                        }
                                                        toastMakeText = Toast.makeText(analyticsMessages.mContext, str8, 0);
                                                        toastMakeText.show();
                                                    }
                                                } catch (Exception e13) {
                                                    SALog.printStackTrace(e13);
                                                }
                                            }
                                        }
                                        if (zIsDebugMode2) {
                                            iCleanupEvents2 = analyticsMessages.mDbAdapter.cleanupEvents(str5);
                                            str = TAG;
                                            str2 = String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(iCleanupEvents2));
                                            SALog.m68589i(str, str2);
                                        }
                                        iCleanupEvents = iCleanupEvents2;
                                    } catch (InvalidDataException e14) {
                                        e = e14;
                                        String str9 = "Invalid data: " + e.getMessage();
                                        boolean zIsDebugMode3 = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                        if (!TextUtils.isEmpty(str9) && (zIsDebugMode3 || SALog.isLogEnabled())) {
                                            SALog.m68589i(TAG, str9);
                                            if (zIsDebugMode3 && AbstractSensorsDataAPI.SHOW_DEBUG_INFO_VIEW) {
                                                try {
                                                    if (Build.VERSION.SDK_INT != 25) {
                                                        if (toastMakeText != null) {
                                                            toastMakeText.cancel();
                                                        }
                                                        toastMakeText = Toast.makeText(analyticsMessages.mContext, str9, 0);
                                                        toastMakeText.show();
                                                    }
                                                } catch (Exception e15) {
                                                    SALog.printStackTrace(e15);
                                                }
                                            }
                                        }
                                        iCleanupEvents = analyticsMessages.mDbAdapter.cleanupEvents(str5);
                                        str3 = TAG;
                                        str4 = String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(iCleanupEvents));
                                    } catch (ResponseErrorException e16) {
                                        e = e16;
                                        zIsDeleteEventsByCode = isDeleteEventsByCode(e.getHttpCode());
                                        try {
                                            String str10 = "ResponseErrorException: " + e.getMessage();
                                            boolean zIsDebugMode4 = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                            if (!TextUtils.isEmpty(str10) && (zIsDebugMode4 || SALog.isLogEnabled())) {
                                                SALog.m68589i(TAG, str10);
                                                if (zIsDebugMode4 && AbstractSensorsDataAPI.SHOW_DEBUG_INFO_VIEW) {
                                                    try {
                                                        if (Build.VERSION.SDK_INT != 25) {
                                                            if (toastMakeText != null) {
                                                                toastMakeText.cancel();
                                                            }
                                                            toastMakeText = Toast.makeText(analyticsMessages.mContext, str10, 0);
                                                            toastMakeText.show();
                                                        }
                                                    } catch (Exception e17) {
                                                        SALog.printStackTrace(e17);
                                                    }
                                                }
                                            }
                                            if (zIsDeleteEventsByCode || zIsDebugMode4) {
                                                iCleanupEvents2 = analyticsMessages.mDbAdapter.cleanupEvents(str5);
                                                str = TAG;
                                                str2 = String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(iCleanupEvents2));
                                                SALog.m68589i(str, str2);
                                            }
                                            iCleanupEvents = iCleanupEvents2;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th2 = th;
                                            zIsDebugMode = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                            if (!TextUtils.isEmpty(null)) {
                                                SALog.m68589i(TAG, (String) null);
                                                if (zIsDebugMode) {
                                                    if (Build.VERSION.SDK_INT != 25) {
                                                        if (toastMakeText != null) {
                                                            toastMakeText.cancel();
                                                        }
                                                        Toast.makeText(analyticsMessages.mContext, (CharSequence) null, 0).show();
                                                    }
                                                }
                                            }
                                            if (zIsDeleteEventsByCode) {
                                            }
                                            SALog.m68589i(TAG, String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(analyticsMessages.mDbAdapter.cleanupEvents(str5))));
                                            throw th2;
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                        try {
                                            String str11 = "Exception: " + e.getMessage();
                                            boolean zIsDebugMode5 = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                            if (!TextUtils.isEmpty(str11) && (zIsDebugMode5 || SALog.isLogEnabled())) {
                                                SALog.m68589i(TAG, str11);
                                                if (zIsDebugMode5 && AbstractSensorsDataAPI.SHOW_DEBUG_INFO_VIEW) {
                                                    try {
                                                        if (Build.VERSION.SDK_INT != 25) {
                                                            if (toastMakeText != null) {
                                                                toastMakeText.cancel();
                                                            }
                                                            toastMakeText = Toast.makeText(analyticsMessages.mContext, str11, 0);
                                                            toastMakeText.show();
                                                        }
                                                    } catch (Exception e19) {
                                                        SALog.printStackTrace(e19);
                                                    }
                                                }
                                            }
                                            if (zIsDebugMode5) {
                                                iCleanupEvents2 = analyticsMessages.mDbAdapter.cleanupEvents(str5);
                                                str = TAG;
                                                str2 = String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(iCleanupEvents2));
                                                SALog.m68589i(str, str2);
                                            }
                                            iCleanupEvents = iCleanupEvents2;
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            zIsDeleteEventsByCode = false;
                                            zIsDebugMode = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                            if (!TextUtils.isEmpty(null)) {
                                                SALog.m68589i(TAG, (String) null);
                                                if (zIsDebugMode) {
                                                    if (Build.VERSION.SDK_INT != 25) {
                                                        if (toastMakeText != null) {
                                                            toastMakeText.cancel();
                                                        }
                                                        Toast.makeText(analyticsMessages.mContext, (CharSequence) null, 0).show();
                                                    }
                                                }
                                            }
                                            if (zIsDeleteEventsByCode) {
                                            }
                                            SALog.m68589i(TAG, String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(analyticsMessages.mDbAdapter.cleanupEvents(str5))));
                                            throw th2;
                                        }
                                    }
                                }
                                boolean zIsDebugMode6 = analyticsMessages.mSensorsDataAPI.isDebugMode();
                                if (!TextUtils.isEmpty(null) && (zIsDebugMode6 || SALog.isLogEnabled())) {
                                    SALog.m68589i(TAG, (String) null);
                                    if (zIsDebugMode6 && AbstractSensorsDataAPI.SHOW_DEBUG_INFO_VIEW) {
                                        try {
                                            if (Build.VERSION.SDK_INT != 25) {
                                                if (toastMakeText != null) {
                                                    toastMakeText.cancel();
                                                }
                                                toastMakeText = Toast.makeText(analyticsMessages.mContext, (CharSequence) null, 0);
                                                toastMakeText.show();
                                            }
                                        } catch (Exception e21) {
                                            SALog.printStackTrace(e21);
                                        }
                                    }
                                }
                                iCleanupEvents = analyticsMessages.mDbAdapter.cleanupEvents(str5);
                                str3 = TAG;
                                str4 = String.format(Locale.CHINA, "Events flushed. [left = %d]", Integer.valueOf(iCleanupEvents));
                            } catch (ConnectErrorException e22) {
                                e = e22;
                                analyticsMessages = this;
                            } catch (InvalidDataException e23) {
                                e = e23;
                                analyticsMessages = this;
                            } catch (ResponseErrorException e24) {
                                e = e24;
                                analyticsMessages = this;
                            } catch (Exception e25) {
                                e = e25;
                                analyticsMessages = this;
                            } catch (Throwable th7) {
                                th = th7;
                                analyticsMessages = this;
                            }
                            SALog.m68589i(str3, str4);
                        }
                    }
                }
            }
        } catch (Exception e26) {
            SALog.printStackTrace(e26);
        }
    }

    private void sendHttpRequest(String str, String str2, String str3, String str4, boolean z11) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        IOException iOException;
        BufferedOutputStream bufferedOutputStream;
        InputStream errorStream;
        SSLSocketFactory sSLSocketFactory;
        BufferedOutputStream bufferedOutputStream2 = null;
        bufferedOutputStream2 = null;
        bufferedOutputStream2 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            try {
                if (httpURLConnection == null) {
                    SALog.m68590i(TAG, String.format("can not connect %s, it shouldn't happen", url.toString()), null);
                    closeStream(null, null, null, httpURLConnection);
                    return;
                }
                int i11 = SensorsDataAPI.VTRACK_SUPPORTED_MIN_API;
                SAConfigOptions configOptions = AbstractSensorsDataAPI.getConfigOptions();
                if (configOptions != null && (sSLSocketFactory = configOptions.mSSLSocketFactory) != null && (httpURLConnection instanceof HttpsURLConnection)) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                if (this.mSensorsDataAPI.getDebugMode() == SensorsDataAPI.DebugMode.DEBUG_ONLY) {
                    httpURLConnection.addRequestProperty("Dry-Run", CredentialEntry.TRUE_STRING);
                }
                String cookie = this.mSensorsDataAPI.getCookie(false);
                if (!TextUtils.isEmpty(cookie)) {
                    httpURLConnection.setRequestProperty(HttpHeaders.COOKIE, cookie);
                }
                Uri.Builder builder = new Uri.Builder();
                if (!TextUtils.isEmpty(str2)) {
                    builder.appendQueryParameter("crc", String.valueOf(str2.hashCode()));
                }
                builder.appendQueryParameter("gzip", str3);
                builder.appendQueryParameter("data_list", str2);
                String encodedQuery = builder.build().getEncodedQuery();
                if (TextUtils.isEmpty(encodedQuery)) {
                    closeStream(null, null, null, httpURLConnection);
                    return;
                }
                httpURLConnection.setFixedLengthStreamingMode(encodedQuery.getBytes("UTF-8").length);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                outputStream = httpURLConnection.getOutputStream();
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStream);
                    try {
                        bufferedOutputStream.write(encodedQuery.getBytes("UTF-8"));
                        bufferedOutputStream.flush();
                        int responseCode = httpURLConnection.getResponseCode();
                        SALog.m68589i(TAG, "responseCode: " + responseCode);
                        if (!z11 && NetworkUtils.needRedirects(responseCode)) {
                            String location = NetworkUtils.getLocation(httpURLConnection, str);
                            if (!TextUtils.isEmpty(location)) {
                                closeStream(bufferedOutputStream, outputStream, null, httpURLConnection);
                                sendHttpRequest(location, str2, str3, str4, true);
                                closeStream(bufferedOutputStream, outputStream, null, httpURLConnection);
                                return;
                            }
                        }
                        try {
                            errorStream = httpURLConnection.getInputStream();
                        } catch (FileNotFoundException unused) {
                            errorStream = httpURLConnection.getErrorStream();
                        }
                        try {
                            byte[] bArrSlurp = slurp(errorStream);
                            errorStream.close();
                            String str5 = new String(bArrSlurp, "UTF-8");
                            if (SALog.isLogEnabled()) {
                                String json = JSONUtils.formatJson(str4);
                                if (responseCode < 200 || responseCode >= 300) {
                                    SALog.m68589i(TAG, "invalid message: \n" + json);
                                    Locale locale = Locale.CHINA;
                                    SALog.m68589i(TAG, String.format(locale, "ret_code: %d", Integer.valueOf(responseCode)));
                                    SALog.m68589i(TAG, String.format(locale, "ret_content: %s", str5));
                                } else {
                                    SALog.m68589i(TAG, "valid message: \n" + json);
                                }
                            }
                            if (responseCode < 200 || responseCode >= 300) {
                                throw new ResponseErrorException(String.format("flush failure with response '%s', the response code is '%d'", str5, Integer.valueOf(responseCode)), responseCode);
                            }
                            closeStream(bufferedOutputStream, outputStream, null, httpURLConnection);
                        } catch (IOException e11) {
                            inputStream = errorStream;
                            iOException = e11;
                            httpURLConnection2 = httpURLConnection;
                            try {
                                throw new ConnectErrorException(iOException);
                            } catch (Throwable th3) {
                                th2 = th3;
                                httpURLConnection = httpURLConnection2;
                                bufferedOutputStream2 = bufferedOutputStream;
                                closeStream(bufferedOutputStream2, outputStream, inputStream, httpURLConnection);
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            inputStream = errorStream;
                            th2 = th4;
                            bufferedOutputStream2 = bufferedOutputStream;
                            closeStream(bufferedOutputStream2, outputStream, inputStream, httpURLConnection);
                            throw th2;
                        }
                    } catch (IOException e12) {
                        iOException = e12;
                        inputStream = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        inputStream = null;
                    }
                } catch (IOException e13) {
                    iOException = e13;
                    inputStream = null;
                    bufferedOutputStream = null;
                } catch (Throwable th6) {
                    th2 = th6;
                    inputStream = null;
                    closeStream(bufferedOutputStream2, outputStream, inputStream, httpURLConnection);
                    throw th2;
                }
            } catch (IOException e14) {
                iOException = e14;
                inputStream = null;
                outputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th7) {
                th2 = th7;
                inputStream = null;
                outputStream = null;
            }
        } catch (IOException e15) {
            iOException = e15;
            inputStream = null;
            outputStream = null;
            bufferedOutputStream = null;
        } catch (Throwable th8) {
            th2 = th8;
            inputStream = null;
            httpURLConnection = null;
            outputStream = null;
        }
    }

    private static byte[] slurp(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i11 = inputStream.read(bArr, 0, 8192);
            if (i11 == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    public void enqueueEventMessage(String str, JSONObject jSONObject) {
        try {
            synchronized (this.mDbAdapter) {
                try {
                    int iAddJSON = this.mDbAdapter.addJSON(jSONObject);
                    if (iAddJSON < 0) {
                        String str2 = "Failed to enqueue the event: " + jSONObject;
                        if (this.mSensorsDataAPI.isDebugMode()) {
                            throw new DebugModeException(str2);
                        }
                        SALog.m68589i(TAG, str2);
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 3;
                    if (this.mSensorsDataAPI.isDebugMode() || iAddJSON == -2 || str.equals("track_signup") || iAddJSON > this.mSensorsDataAPI.getFlushBulkSize()) {
                        this.mWorker.runMessage(messageObtain);
                    } else {
                        this.mWorker.runMessageOnce(messageObtain, this.mSensorsDataAPI.getFlushInterval());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            SALog.m68589i(TAG, "enqueueEventMessage error:" + e11);
        }
    }

    private AnalyticsMessages(Context context, SensorsDataAPI sensorsDataAPI) {
        this.mContext = context;
        this.mSensorsDataAPI = sensorsDataAPI;
    }

    public void deleteAll() {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            this.mWorker.runMessage(messageObtain);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void flush() {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            this.mWorker.runMessage(messageObtain);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public void flushScheduled() {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = 5;
            this.mWorker.runMessageOnce(messageObtain, this.mSensorsDataAPI.getFlushInterval());
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
