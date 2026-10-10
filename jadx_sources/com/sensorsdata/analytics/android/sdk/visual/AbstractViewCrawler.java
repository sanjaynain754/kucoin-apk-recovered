package com.sensorsdata.analytics.android.sdk.visual;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.webkit.internal.AssetHelper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.AppStateManager;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import com.sensorsdata.analytics.android.sdk.visual.model.SnapInfo;
import com.sensorsdata.analytics.android.sdk.visual.model.WebNodeInfo;
import com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager;
import com.sensorsdata.analytics.android.sdk.visual.snap.EditProtocol;
import com.sensorsdata.analytics.android.sdk.visual.snap.EditState;
import com.sensorsdata.analytics.android.sdk.visual.snap.ResourceReader;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@TargetApi(14)
public abstract class AbstractViewCrawler implements VTrack {
    private static final int MESSAGE_SEND_STATE_FOR_EDITING = 1;
    private static final String TAG = "SA.AbstractViewCrawler";
    public static final String TYPE_HEAT_MAP = "heat_map";
    public static final String TYPE_VISUAL = "visual";
    private final Activity mActivity;
    private String mAppVersion;
    private final EditState mEditState;
    private String mFeatureCode;
    private final LifecycleCallbacks mLifecycleCallbacks;
    private JSONObject mMessageObject;
    private final ViewCrawlerHandler mMessageThreadHandler;
    private String mPostUrl;
    private boolean mServiceRunning = false;
    private String mType;

    public class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private LifecycleCallbacks() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractViewCrawler.this.mEditState.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractViewCrawler.this.mEditState.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    public class ViewCrawlerHandler extends Handler {
        private String mAppId;
        private StringBuilder mLastImageHash;
        private final EditProtocol mProtocol;
        private ViewSnapshot mSnapshot;
        private boolean mUseGzip;

        /* JADX WARN: Code duplicated, block: B:100:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:113:0x030a A[Catch: all -> 0x02fa, IOException -> 0x02fe, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x02fa, blocks: (B:105:0x02e2, B:113:0x030a, B:116:0x033d, B:118:0x0345, B:120:0x0351, B:122:0x035b, B:123:0x0376, B:125:0x0380, B:126:0x039b, B:128:0x039f, B:130:0x03a5, B:131:0x03b3, B:134:0x03bb, B:135:0x03be, B:138:0x03c8, B:140:0x03d8, B:144:0x03ee, B:146:0x0474, B:147:0x047c), top: B:257:0x02e2 }] */
        /* JADX WARN: Code duplicated, block: B:149:0x0487  */
        /* JADX WARN: Code duplicated, block: B:241:0x04a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:247:0x052e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:249:0x049b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:257:0x02e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:261:0x050a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:267:0x0514 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:270:0x0491 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:279:0x0538 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:281:0x0289 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:287:0x0542 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:291:0x0500 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x02b1  */
        /* JADX WARN: Code duplicated, block: B:98:0x02b6 A[Catch: all -> 0x01cb, IOException -> 0x02a5, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x01cb, blocks: (B:51:0x0198, B:53:0x01ac, B:90:0x0289, B:98:0x02b6), top: B:272:0x0198 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:113:0x030a, please report this as an issue */
        private void sendSnapshot(JSONObject jSONObject) throws Throwable {
            String str;
            Throwable th2;
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2;
            SnapInfo snapInfo;
            Throwable th3;
            IOException e11;
            ByteArrayOutputStream byteArrayOutputStream3;
            SnapInfo snapInfo2;
            SnapInfo snapInfoSnapshots;
            String str2;
            String fragmentScreenName;
            String str3 = "Can't close payload_out.";
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                if (jSONObject2.has("config")) {
                    this.mSnapshot = this.mProtocol.readSnapshotConfig(jSONObject2);
                }
                if (this.mSnapshot == null) {
                    SALog.m68589i(AbstractViewCrawler.TAG, "Snapshot should be initialize at first calling.");
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream4);
                try {
                    try {
                        outputStreamWriter.write("{");
                        outputStreamWriter.write("\"type\": \"snapshot_response\",");
                        outputStreamWriter.write("\"feature_code\": \"" + AbstractViewCrawler.this.mFeatureCode + "\",");
                        outputStreamWriter.write("\"app_version\": \"" + AbstractViewCrawler.this.mAppVersion + "\",");
                        outputStreamWriter.write("\"lib_version\": \"5.4.4\",");
                        outputStreamWriter.write("\"os\": \"Android\",");
                        outputStreamWriter.write("\"lib\": \"Android\",");
                        outputStreamWriter.write("\"app_id\": \"" + this.mAppId + "\",");
                        String visualConfigVersion = VisualPropertiesManager.getInstance().getVisualConfigVersion();
                        if (!TextUtils.isEmpty(visualConfigVersion)) {
                            try {
                                outputStreamWriter.write("\"config_version\": \"" + visualConfigVersion + "\",");
                            } catch (Throwable th4) {
                                th3 = th4;
                                str = "Can't close writer.";
                                gZIPOutputStream = null;
                                byteArrayOutputStream = null;
                                byteArrayOutputStream2 = null;
                                th2 = th3;
                                if (byteArrayOutputStream != null) {
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception e12) {
                                        SALog.m68590i(AbstractViewCrawler.TAG, "Can't close os.", e12);
                                    }
                                }
                                if (gZIPOutputStream != null) {
                                    try {
                                        gZIPOutputStream.close();
                                    } catch (Exception e13) {
                                        SALog.m68590i(AbstractViewCrawler.TAG, "Can't close gos.", e13);
                                    }
                                }
                                if (byteArrayOutputStream2 != null) {
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Exception e14) {
                                        SALog.m68590i(AbstractViewCrawler.TAG, str3, e14);
                                    }
                                }
                                try {
                                    outputStreamWriter.close();
                                    throw th2;
                                } catch (IOException e15) {
                                    SALog.m68590i(AbstractViewCrawler.TAG, str, e15);
                                    throw th2;
                                }
                            }
                        }
                        if (!this.mUseGzip) {
                            str = "Can't close writer.";
                            str3 = "Can't close payload_out.";
                            try {
                                try {
                                    outputStreamWriter.write("\"payload\": {");
                                    outputStreamWriter.write("\"activities\":");
                                    outputStreamWriter.flush();
                                    snapInfoSnapshots = this.mSnapshot.snapshots(AbstractViewCrawler.this.mEditState, byteArrayOutputStream4, this.mLastImageHash);
                                    try {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                        outputStreamWriter.write(",\"snapshot_time_millis\": ");
                                        outputStreamWriter.write(Long.toString(jCurrentTimeMillis2));
                                        outputStreamWriter.write("}");
                                        byteArrayOutputStream2 = null;
                                        byteArrayOutputStream3 = null;
                                        gZIPOutputStream = null;
                                        if (TextUtils.isEmpty(snapInfoSnapshots.screenName)) {
                                            str2 = null;
                                        } else {
                                            outputStreamWriter.write(",\"screen_name\": \"" + snapInfoSnapshots.screenName + "\"");
                                            str2 = snapInfoSnapshots.screenName;
                                        }
                                        if (snapInfoSnapshots.hasFragment) {
                                            fragmentScreenName = AppStateManager.getInstance().getFragmentScreenName();
                                            if (!TextUtils.isEmpty(fragmentScreenName)) {
                                                str2 = fragmentScreenName;
                                            }
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        byteArrayOutputStream2 = byteArrayOutputStream2;
                                        sb2.append("page_name： ");
                                        sb2.append(str2);
                                        SALog.m68589i(AbstractViewCrawler.TAG, sb2.toString());
                                        if (!TextUtils.isEmpty(str2)) {
                                            outputStreamWriter.write(",\"page_name\": \"" + str2 + "\"");
                                        }
                                        if (!TextUtils.isEmpty(snapInfoSnapshots.activityTitle)) {
                                            outputStreamWriter.write(",\"title\": \"" + snapInfoSnapshots.activityTitle + "\"");
                                        }
                                        outputStreamWriter.write(",\"is_webview\": " + snapInfoSnapshots.isWebView);
                                        if (snapInfoSnapshots.isWebView) {
                                            snapInfo = snapInfoSnapshots;
                                        } else {
                                            snapInfo = snapInfoSnapshots;
                                        }
                                        outputStreamWriter.write("}");
                                        outputStreamWriter.flush();
                                        if (byteArrayOutputStream3 != null) {
                                            byteArrayOutputStream3.close();
                                        }
                                        if (gZIPOutputStream != null) {
                                            gZIPOutputStream.close();
                                        }
                                        if (byteArrayOutputStream2 != null) {
                                            byteArrayOutputStream2.close();
                                        }
                                        outputStreamWriter.close();
                                    } catch (IOException e16) {
                                        e = e16;
                                        str = str;
                                        str3 = str3;
                                        snapInfo = snapInfoSnapshots;
                                        gZIPOutputStream = null;
                                        byteArrayOutputStream = null;
                                        byteArrayOutputStream2 = null;
                                        SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.close();
                                        }
                                        if (gZIPOutputStream != null) {
                                            gZIPOutputStream.close();
                                        }
                                        if (byteArrayOutputStream2 != null) {
                                            byteArrayOutputStream2.close();
                                        }
                                        outputStreamWriter.close();
                                        onSnapFinished(snapInfo);
                                        postSnapshot(byteArrayOutputStream4);
                                    }
                                } catch (IOException e17) {
                                    e = e17;
                                    str = str;
                                    str3 = str3;
                                    gZIPOutputStream = null;
                                    byteArrayOutputStream = null;
                                    byteArrayOutputStream2 = null;
                                    snapInfo = null;
                                    SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream2 != null) {
                                        byteArrayOutputStream2.close();
                                    }
                                    outputStreamWriter.close();
                                    onSnapFinished(snapInfo);
                                    postSnapshot(byteArrayOutputStream4);
                                }
                                onSnapFinished(snapInfo);
                                postSnapshot(byteArrayOutputStream4);
                            } catch (Throwable th5) {
                                th = th5;
                                str = str;
                                str3 = str3;
                                th2 = th;
                                gZIPOutputStream = null;
                                byteArrayOutputStream = null;
                                byteArrayOutputStream2 = null;
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                if (byteArrayOutputStream2 != null) {
                                    byteArrayOutputStream2.close();
                                }
                                outputStreamWriter.close();
                                throw th2;
                            }
                        }
                        try {
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(byteArrayOutputStream2);
                                outputStreamWriter2.write("{\"activities\":");
                                outputStreamWriter2.flush();
                                str = "Can't close writer.";
                                try {
                                    str3 = "Can't close payload_out.";
                                    try {
                                        try {
                                            SnapInfo snapInfoSnapshots2 = this.mSnapshot.snapshots(AbstractViewCrawler.this.mEditState, byteArrayOutputStream2, this.mLastImageHash);
                                            try {
                                                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                outputStreamWriter2.write(",\"snapshot_time_millis\": ");
                                                outputStreamWriter2.write(Long.toString(jCurrentTimeMillis3));
                                                String debugInfo = VisualizedAutoTrackService.getInstance().getDebugInfo();
                                                if (!TextUtils.isEmpty(debugInfo)) {
                                                    try {
                                                        outputStreamWriter2.write(",");
                                                        outputStreamWriter2.write("\"event_debug\": ");
                                                        outputStreamWriter2.write(debugInfo);
                                                    } catch (IOException e18) {
                                                        e = e18;
                                                        snapInfo = snapInfoSnapshots2;
                                                        gZIPOutputStream = null;
                                                        byteArrayOutputStream = null;
                                                        try {
                                                            SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (Exception e19) {
                                                                    SALog.m68590i(AbstractViewCrawler.TAG, "Can't close os.", e19);
                                                                }
                                                            }
                                                            if (gZIPOutputStream != null) {
                                                                try {
                                                                    gZIPOutputStream.close();
                                                                } catch (Exception e21) {
                                                                    SALog.m68590i(AbstractViewCrawler.TAG, "Can't close gos.", e21);
                                                                }
                                                            }
                                                            if (byteArrayOutputStream2 != null) {
                                                                try {
                                                                    byteArrayOutputStream2.close();
                                                                } catch (Exception e22) {
                                                                    SALog.m68590i(AbstractViewCrawler.TAG, str3, e22);
                                                                }
                                                            }
                                                            try {
                                                                outputStreamWriter.close();
                                                            } catch (IOException e23) {
                                                                e11 = e23;
                                                                SALog.m68590i(AbstractViewCrawler.TAG, str, e11);
                                                            }
                                                            onSnapFinished(snapInfo);
                                                            postSnapshot(byteArrayOutputStream4);
                                                        } catch (Throwable th6) {
                                                            th3 = th6;
                                                            th2 = th3;
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            if (gZIPOutputStream != null) {
                                                                gZIPOutputStream.close();
                                                            }
                                                            if (byteArrayOutputStream2 != null) {
                                                                byteArrayOutputStream2.close();
                                                            }
                                                            outputStreamWriter.close();
                                                            throw th2;
                                                        }
                                                    }
                                                }
                                                String visualLogInfo = VisualizedAutoTrackService.getInstance().getVisualLogInfo();
                                                if (!TextUtils.isEmpty(visualLogInfo)) {
                                                    outputStreamWriter2.write(",");
                                                    outputStreamWriter2.write("\"log_info\":");
                                                    outputStreamWriter2.write(visualLogInfo);
                                                }
                                                outputStreamWriter2.write("}");
                                                outputStreamWriter2.flush();
                                                byteArrayOutputStream2.close();
                                                byte[] bytes = byteArrayOutputStream2.toString().getBytes();
                                                byteArrayOutputStream3 = new ByteArrayOutputStream(bytes.length);
                                                try {
                                                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream3);
                                                    try {
                                                        try {
                                                            gZIPOutputStream.write(bytes);
                                                            gZIPOutputStream.close();
                                                            byte[] byteArray = byteArrayOutputStream3.toByteArray();
                                                            byteArrayOutputStream3.close();
                                                            StringBuilder sb3 = new StringBuilder();
                                                            snapInfo2 = snapInfoSnapshots2;
                                                            try {
                                                                sb3.append("\"gzip_payload\": \"");
                                                                sb3.append(new String(Base64Coder.encode(byteArray)));
                                                                sb3.append("\"");
                                                                outputStreamWriter.write(sb3.toString());
                                                                snapInfoSnapshots = snapInfo2;
                                                                try {
                                                                    if (TextUtils.isEmpty(snapInfoSnapshots.screenName)) {
                                                                        try {
                                                                            outputStreamWriter.write(",\"screen_name\": \"" + snapInfoSnapshots.screenName + "\"");
                                                                            str2 = snapInfoSnapshots.screenName;
                                                                        } catch (IOException e24) {
                                                                            e = e24;
                                                                            snapInfo = snapInfoSnapshots;
                                                                            byteArrayOutputStream2 = byteArrayOutputStream2;
                                                                            byteArrayOutputStream = byteArrayOutputStream3;
                                                                            str = str;
                                                                            str3 = str3;
                                                                            SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            if (gZIPOutputStream != null) {
                                                                                gZIPOutputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream2 != null) {
                                                                                byteArrayOutputStream2.close();
                                                                            }
                                                                            outputStreamWriter.close();
                                                                            onSnapFinished(snapInfo);
                                                                            postSnapshot(byteArrayOutputStream4);
                                                                        }
                                                                    } else {
                                                                        str2 = null;
                                                                    }
                                                                    if (snapInfoSnapshots.hasFragment) {
                                                                        fragmentScreenName = AppStateManager.getInstance().getFragmentScreenName();
                                                                        if (!TextUtils.isEmpty(fragmentScreenName)) {
                                                                            str2 = fragmentScreenName;
                                                                        }
                                                                    }
                                                                    StringBuilder sb4 = new StringBuilder();
                                                                    byteArrayOutputStream2 = byteArrayOutputStream2;
                                                                    try {
                                                                        try {
                                                                            sb4.append("page_name： ");
                                                                            sb4.append(str2);
                                                                            SALog.m68589i(AbstractViewCrawler.TAG, sb4.toString());
                                                                            if (!TextUtils.isEmpty(str2)) {
                                                                                try {
                                                                                    try {
                                                                                        outputStreamWriter.write(",\"page_name\": \"" + str2 + "\"");
                                                                                    } catch (Throwable th7) {
                                                                                        th2 = th7;
                                                                                        byteArrayOutputStream = byteArrayOutputStream3;
                                                                                        str = str;
                                                                                        str3 = str3;
                                                                                        if (byteArrayOutputStream != null) {
                                                                                            byteArrayOutputStream.close();
                                                                                        }
                                                                                        if (gZIPOutputStream != null) {
                                                                                            gZIPOutputStream.close();
                                                                                        }
                                                                                        if (byteArrayOutputStream2 != null) {
                                                                                            byteArrayOutputStream2.close();
                                                                                        }
                                                                                        outputStreamWriter.close();
                                                                                        throw th2;
                                                                                    }
                                                                                } catch (IOException e25) {
                                                                                    e = e25;
                                                                                    snapInfo = snapInfoSnapshots;
                                                                                    byteArrayOutputStream = byteArrayOutputStream3;
                                                                                    str = str;
                                                                                    str3 = str3;
                                                                                    SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                                                                    if (byteArrayOutputStream != null) {
                                                                                        byteArrayOutputStream.close();
                                                                                    }
                                                                                    if (gZIPOutputStream != null) {
                                                                                        gZIPOutputStream.close();
                                                                                    }
                                                                                    if (byteArrayOutputStream2 != null) {
                                                                                        byteArrayOutputStream2.close();
                                                                                    }
                                                                                    outputStreamWriter.close();
                                                                                    onSnapFinished(snapInfo);
                                                                                    postSnapshot(byteArrayOutputStream4);
                                                                                }
                                                                            }
                                                                            if (!TextUtils.isEmpty(snapInfoSnapshots.activityTitle)) {
                                                                                outputStreamWriter.write(",\"title\": \"" + snapInfoSnapshots.activityTitle + "\"");
                                                                            }
                                                                            outputStreamWriter.write(",\"is_webview\": " + snapInfoSnapshots.isWebView);
                                                                            if (snapInfoSnapshots.isWebView || TextUtils.isEmpty(snapInfoSnapshots.webViewUrl)) {
                                                                                snapInfo = snapInfoSnapshots;
                                                                            } else {
                                                                                WebNodeInfo webPageInfo = WebNodesManager.getInstance().getWebPageInfo(snapInfoSnapshots.webViewUrl);
                                                                                if (webPageInfo != null) {
                                                                                    if (!TextUtils.isEmpty(webPageInfo.getUrl())) {
                                                                                        outputStreamWriter.write(",\"h5_url\": \"" + webPageInfo.getUrl() + "\"");
                                                                                    }
                                                                                    if (!TextUtils.isEmpty(webPageInfo.getTitle())) {
                                                                                        outputStreamWriter.write(",\"h5_title\": \"" + webPageInfo.getTitle() + "\"");
                                                                                    }
                                                                                }
                                                                                List<WebNodeInfo.AlertInfo> list = snapInfoSnapshots.alertInfos;
                                                                                if (list == null || list.size() <= 0) {
                                                                                    snapInfo = snapInfoSnapshots;
                                                                                } else {
                                                                                    outputStreamWriter.write(",\"app_alert_infos\":");
                                                                                    outputStreamWriter.flush();
                                                                                    outputStreamWriter.write("[");
                                                                                    int i11 = 0;
                                                                                    while (i11 < list.size()) {
                                                                                        if (i11 > 0) {
                                                                                            outputStreamWriter.write(",");
                                                                                        }
                                                                                        WebNodeInfo.AlertInfo alertInfo = list.get(i11);
                                                                                        if (alertInfo != null) {
                                                                                            snapInfo = snapInfoSnapshots;
                                                                                            try {
                                                                                                if (TextUtils.equals(AbstractViewCrawler.TYPE_HEAT_MAP, AbstractViewCrawler.this.mType)) {
                                                                                                    alertInfo.title = alertInfo.title.replace("可视化全埋点", "点击分析");
                                                                                                }
                                                                                                outputStreamWriter.write("{");
                                                                                                outputStreamWriter.write("\"title\":");
                                                                                                outputStreamWriter.write("\"" + alertInfo.title + "\"");
                                                                                                outputStreamWriter.write(",");
                                                                                                outputStreamWriter.write("\"message\":");
                                                                                                outputStreamWriter.write("\"" + alertInfo.message + "\"");
                                                                                                outputStreamWriter.write(",");
                                                                                                outputStreamWriter.write("\"link_text\":");
                                                                                                outputStreamWriter.write("\"" + alertInfo.linkText + "\"");
                                                                                                outputStreamWriter.write(",");
                                                                                                outputStreamWriter.write("\"link_url\":");
                                                                                                outputStreamWriter.write("\"" + alertInfo.linkUrl + "\"");
                                                                                                outputStreamWriter.write("}");
                                                                                            } catch (IOException e26) {
                                                                                                e = e26;
                                                                                                byteArrayOutputStream = byteArrayOutputStream3;
                                                                                                str = str;
                                                                                                str3 = str3;
                                                                                                SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                                                                                if (byteArrayOutputStream != null) {
                                                                                                    byteArrayOutputStream.close();
                                                                                                }
                                                                                                if (gZIPOutputStream != null) {
                                                                                                    gZIPOutputStream.close();
                                                                                                }
                                                                                                if (byteArrayOutputStream2 != null) {
                                                                                                    byteArrayOutputStream2.close();
                                                                                                }
                                                                                                outputStreamWriter.close();
                                                                                                onSnapFinished(snapInfo);
                                                                                                postSnapshot(byteArrayOutputStream4);
                                                                                            }
                                                                                        } else {
                                                                                            snapInfo = snapInfoSnapshots;
                                                                                            i11 = i11;
                                                                                        }
                                                                                        i11++;
                                                                                        snapInfoSnapshots = snapInfo;
                                                                                        list = list;
                                                                                    }
                                                                                    snapInfo = snapInfoSnapshots;
                                                                                    outputStreamWriter.write("]");
                                                                                    outputStreamWriter.flush();
                                                                                }
                                                                            }
                                                                            try {
                                                                                outputStreamWriter.write("}");
                                                                                outputStreamWriter.flush();
                                                                                if (byteArrayOutputStream3 != null) {
                                                                                    try {
                                                                                        byteArrayOutputStream3.close();
                                                                                    } catch (Exception e27) {
                                                                                        SALog.m68590i(AbstractViewCrawler.TAG, "Can't close os.", e27);
                                                                                    }
                                                                                }
                                                                                if (gZIPOutputStream != null) {
                                                                                    try {
                                                                                        gZIPOutputStream.close();
                                                                                    } catch (Exception e28) {
                                                                                        SALog.m68590i(AbstractViewCrawler.TAG, "Can't close gos.", e28);
                                                                                    }
                                                                                }
                                                                                if (byteArrayOutputStream2 != null) {
                                                                                    try {
                                                                                        byteArrayOutputStream2.close();
                                                                                    } catch (Exception e29) {
                                                                                        SALog.m68590i(AbstractViewCrawler.TAG, str3, e29);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    outputStreamWriter.close();
                                                                                } catch (IOException e31) {
                                                                                    e11 = e31;
                                                                                    str = str;
                                                                                    SALog.m68590i(AbstractViewCrawler.TAG, str, e11);
                                                                                }
                                                                            } catch (IOException e32) {
                                                                                e = e32;
                                                                                str = str;
                                                                                str3 = str3;
                                                                                byteArrayOutputStream = byteArrayOutputStream3;
                                                                                SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                                                                if (byteArrayOutputStream != null) {
                                                                                    byteArrayOutputStream.close();
                                                                                }
                                                                                if (gZIPOutputStream != null) {
                                                                                    gZIPOutputStream.close();
                                                                                }
                                                                                if (byteArrayOutputStream2 != null) {
                                                                                    byteArrayOutputStream2.close();
                                                                                }
                                                                                outputStreamWriter.close();
                                                                            }
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                            str = str;
                                                                            str3 = str3;
                                                                            th2 = th;
                                                                            byteArrayOutputStream = byteArrayOutputStream3;
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            if (gZIPOutputStream != null) {
                                                                                gZIPOutputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream2 != null) {
                                                                                byteArrayOutputStream2.close();
                                                                            }
                                                                            outputStreamWriter.close();
                                                                            throw th2;
                                                                        }
                                                                    } catch (IOException e33) {
                                                                        e = e33;
                                                                        snapInfo = snapInfoSnapshots;
                                                                    }
                                                                } catch (IOException e34) {
                                                                    e = e34;
                                                                    snapInfo = snapInfoSnapshots;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream2;
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream2;
                                                                }
                                                            } catch (IOException e35) {
                                                                e = e35;
                                                                byteArrayOutputStream2 = byteArrayOutputStream2;
                                                                byteArrayOutputStream = byteArrayOutputStream3;
                                                                str = str;
                                                                str3 = str3;
                                                                snapInfo = snapInfo2;
                                                                SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                if (gZIPOutputStream != null) {
                                                                    gZIPOutputStream.close();
                                                                }
                                                                if (byteArrayOutputStream2 != null) {
                                                                    byteArrayOutputStream2.close();
                                                                }
                                                                outputStreamWriter.close();
                                                                onSnapFinished(snapInfo);
                                                                postSnapshot(byteArrayOutputStream4);
                                                            }
                                                        } catch (Throwable th10) {
                                                            th2 = th10;
                                                            byteArrayOutputStream2 = byteArrayOutputStream2;
                                                            byteArrayOutputStream = byteArrayOutputStream3;
                                                            str = str;
                                                            str3 = str3;
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            if (gZIPOutputStream != null) {
                                                                gZIPOutputStream.close();
                                                            }
                                                            if (byteArrayOutputStream2 != null) {
                                                                byteArrayOutputStream2.close();
                                                            }
                                                            outputStreamWriter.close();
                                                            throw th2;
                                                        }
                                                    } catch (IOException e36) {
                                                        e = e36;
                                                        snapInfo2 = snapInfoSnapshots2;
                                                    }
                                                } catch (IOException e37) {
                                                    e = e37;
                                                    byteArrayOutputStream2 = byteArrayOutputStream2;
                                                    byteArrayOutputStream = byteArrayOutputStream3;
                                                    str = str;
                                                    str3 = str3;
                                                    snapInfo = snapInfoSnapshots2;
                                                    gZIPOutputStream = null;
                                                } catch (Throwable th11) {
                                                    th2 = th11;
                                                    byteArrayOutputStream2 = byteArrayOutputStream2;
                                                    byteArrayOutputStream = byteArrayOutputStream3;
                                                    str = str;
                                                    str3 = str3;
                                                    gZIPOutputStream = null;
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    if (gZIPOutputStream != null) {
                                                        gZIPOutputStream.close();
                                                    }
                                                    if (byteArrayOutputStream2 != null) {
                                                        byteArrayOutputStream2.close();
                                                    }
                                                    outputStreamWriter.close();
                                                    throw th2;
                                                }
                                            } catch (IOException e38) {
                                                e = e38;
                                                snapInfo = snapInfoSnapshots2;
                                            }
                                        } catch (Throwable th12) {
                                            th2 = th12;
                                            str = str;
                                            str3 = str3;
                                            gZIPOutputStream = null;
                                            byteArrayOutputStream = null;
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            if (gZIPOutputStream != null) {
                                                gZIPOutputStream.close();
                                            }
                                            if (byteArrayOutputStream2 != null) {
                                                byteArrayOutputStream2.close();
                                            }
                                            outputStreamWriter.close();
                                            throw th2;
                                        }
                                    } catch (IOException e39) {
                                        e = e39;
                                        str = str;
                                        str3 = str3;
                                        gZIPOutputStream = null;
                                        byteArrayOutputStream = null;
                                        snapInfo = null;
                                        SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.close();
                                        }
                                        if (gZIPOutputStream != null) {
                                            gZIPOutputStream.close();
                                        }
                                        if (byteArrayOutputStream2 != null) {
                                            byteArrayOutputStream2.close();
                                        }
                                        outputStreamWriter.close();
                                        onSnapFinished(snapInfo);
                                        postSnapshot(byteArrayOutputStream4);
                                    }
                                } catch (IOException e41) {
                                    e = e41;
                                    str = str;
                                    gZIPOutputStream = null;
                                    byteArrayOutputStream = null;
                                    snapInfo = null;
                                    SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream2 != null) {
                                        byteArrayOutputStream2.close();
                                    }
                                    outputStreamWriter.close();
                                    onSnapFinished(snapInfo);
                                    postSnapshot(byteArrayOutputStream4);
                                } catch (Throwable th13) {
                                    th = th13;
                                    th2 = th;
                                    str = str;
                                    gZIPOutputStream = null;
                                    byteArrayOutputStream = null;
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    if (gZIPOutputStream != null) {
                                        gZIPOutputStream.close();
                                    }
                                    if (byteArrayOutputStream2 != null) {
                                        byteArrayOutputStream2.close();
                                    }
                                    outputStreamWriter.close();
                                    throw th2;
                                }
                            } catch (IOException e42) {
                                e = e42;
                                str = "Can't close writer.";
                            } catch (Throwable th14) {
                                th = th14;
                                str = "Can't close writer.";
                            }
                        } catch (IOException e43) {
                            e = e43;
                            str = "Can't close writer.";
                            gZIPOutputStream = null;
                            byteArrayOutputStream = null;
                            byteArrayOutputStream2 = null;
                            snapInfo = null;
                            SALog.m68590i(AbstractViewCrawler.TAG, "Can't write snapshot request to server", e);
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            outputStreamWriter.close();
                            onSnapFinished(snapInfo);
                            postSnapshot(byteArrayOutputStream4);
                        } catch (Throwable th15) {
                            th2 = th15;
                            str = "Can't close writer.";
                            gZIPOutputStream = null;
                            byteArrayOutputStream = null;
                            byteArrayOutputStream2 = null;
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            outputStreamWriter.close();
                            throw th2;
                        }
                        onSnapFinished(snapInfo);
                        postSnapshot(byteArrayOutputStream4);
                    } catch (Throwable th16) {
                        th = th16;
                        str = "Can't close writer.";
                    }
                } catch (IOException e44) {
                    e = e44;
                    str = "Can't close writer.";
                }
            } catch (EditProtocol.BadInstructionsException e45) {
                SALog.m68590i(AbstractViewCrawler.TAG, "VisualizedAutoTrack server sent malformed message with snapshot request", e45);
            } catch (JSONException e46) {
                SALog.m68590i(AbstractViewCrawler.TAG, "Payload with snapshot config required with snapshot request", e46);
            }
        }

        private ViewCrawlerHandler(Context context, Looper looper, String str) {
            super(looper);
            this.mSnapshot = null;
            this.mProtocol = new EditProtocol(new ResourceReader.Ids(str, context));
            this.mLastImageHash = new StringBuilder();
            this.mUseGzip = true;
            this.mAppId = AppInfoUtils.getProcessName(context);
        }

        private void onSnapFinished(SnapInfo snapInfo) {
            if (snapInfo == null || WebNodesManager.getInstance().hasWebView()) {
                return;
            }
            WebNodesManager.getInstance().clear();
        }

        /* JADX WARN: Code duplicated, block: B:134:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x01c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:155:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x0182 A[Catch: Exception -> 0x0153, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0153, blocks: (B:68:0x014f, B:93:0x0182), top: B:131:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x0187  */
        /* JADX WARN: Code duplicated, block: B:96:0x019b  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        private void postSnapshot(ByteArrayOutputStream byteArrayOutputStream) throws Throwable {
            InputStream inputStream;
            OutputStream outputStream;
            boolean z11;
            boolean z12;
            ?? r11 = "UTF-8";
            if (TextUtils.isEmpty(AbstractViewCrawler.this.mFeatureCode) || TextUtils.isEmpty(AbstractViewCrawler.this.mPostUrl)) {
                return;
            }
            BufferedOutputStream bufferedOutputStream = null;
            errorStream = null;
            InputStream errorStream = null;
            bufferedOutputStream = null;
            bufferedOutputStream = null;
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(AbstractViewCrawler.this.mPostUrl).openConnection()));
                    SAConfigOptions configOptions = AbstractSensorsDataAPI.getConfigOptions();
                    if (configOptions != null) {
                        if (configOptions.isDisableSDK()) {
                            AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    return;
                                } catch (Exception e11) {
                                    SALog.printStackTrace(e11);
                                    return;
                                }
                            }
                            return;
                        }
                        SSLSocketFactory sSLSocketFactory = configOptions.mSSLSocketFactory;
                        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
                            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                        }
                    }
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-type", AssetHelper.DEFAULT_MIME_TYPE);
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(outputStream);
                        try {
                            try {
                                bufferedOutputStream2.write(byteArrayOutputStream.toString().getBytes("UTF-8"));
                                bufferedOutputStream2.flush();
                                int responseCode = httpURLConnection.getResponseCode();
                                try {
                                    errorStream = httpURLConnection.getInputStream();
                                } catch (FileNotFoundException unused) {
                                    errorStream = httpURLConnection.getErrorStream();
                                }
                                String str = new String(slurp(errorStream), "UTF-8");
                                SALog.m68589i(AbstractViewCrawler.TAG, "responseCode=" + responseCode);
                                SALog.m68589i(AbstractViewCrawler.TAG, "response=" + str);
                                JSONObject jSONObject = new JSONObject(str);
                                if (responseCode == 200) {
                                    boolean z13 = jSONObject.getInt("delay") >= 0;
                                    try {
                                        String strOptString = jSONObject.optString("visualized_sdk_config");
                                        boolean zOptBoolean = jSONObject.optBoolean("visualized_config_disabled");
                                        if (!TextUtils.isEmpty(strOptString) || zOptBoolean) {
                                            VisualPropertiesManager.getInstance().save2Cache(strOptString);
                                        }
                                        VisualizedAutoTrackService.getInstance().setDebugModeEnabled(jSONObject.optBoolean("visualized_debug_mode_enabled"));
                                        z12 = z13;
                                    } catch (Exception e12) {
                                        e = e12;
                                        inputStream = errorStream;
                                        z11 = z13;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        r11 = z11;
                                        try {
                                            SALog.printStackTrace(e);
                                            if (bufferedOutputStream != null) {
                                                try {
                                                    bufferedOutputStream.close();
                                                } catch (Exception e13) {
                                                    SALog.printStackTrace(e13);
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e14) {
                                                    SALog.printStackTrace(e14);
                                                }
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception e15) {
                                                    SALog.printStackTrace(e15);
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                                r11 = r11;
                                            }
                                            if (r11 != 0) {
                                                AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
                                            } else {
                                                AbstractViewCrawler.this.stopUpdates(true);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (bufferedOutputStream != null) {
                                                try {
                                                    bufferedOutputStream.close();
                                                } catch (Exception e16) {
                                                    SALog.printStackTrace(e16);
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e17) {
                                                    SALog.printStackTrace(e17);
                                                }
                                            }
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Exception e18) {
                                                    SALog.printStackTrace(e18);
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                throw th;
                                            }
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th;
                                            } catch (Exception e19) {
                                                SALog.printStackTrace(e19);
                                                throw th;
                                            }
                                        }
                                    }
                                } else {
                                    z12 = true;
                                }
                                try {
                                    bufferedOutputStream2.close();
                                } catch (Exception e21) {
                                    SALog.printStackTrace(e21);
                                }
                                if (errorStream != null) {
                                    try {
                                        errorStream.close();
                                    } catch (Exception e22) {
                                        SALog.printStackTrace(e22);
                                    }
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Exception e23) {
                                        SALog.printStackTrace(e23);
                                    }
                                }
                                byteArrayOutputStream.close();
                                r11 = z12;
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = errorStream;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    throw th;
                                }
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (Exception e24) {
                            e = e24;
                            inputStream = errorStream;
                            z11 = true;
                        }
                    } catch (Exception e25) {
                        e = e25;
                        inputStream = null;
                        r11 = 1;
                        SALog.printStackTrace(e);
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                            r11 = r11;
                        }
                        if (r11 != 0) {
                            AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
                        } else {
                            AbstractViewCrawler.this.stopUpdates(true);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                } catch (Exception e26) {
                    SALog.printStackTrace(e26);
                }
            } catch (Exception e27) {
                e = e27;
                inputStream = null;
                outputStream = null;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                outputStream = null;
            }
            if (r11 != 0) {
                AbstractViewCrawler.this.mMessageThreadHandler.sendMessageDelayed(AbstractViewCrawler.this.mMessageThreadHandler.obtainMessage(1), 1000L);
            } else {
                AbstractViewCrawler.this.stopUpdates(true);
            }
        }

        private byte[] slurp(InputStream inputStream) throws IOException {
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

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            if (message.what != 1) {
                return;
            }
            sendSnapshot(AbstractViewCrawler.this.mMessageObject);
        }

        public void start() {
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.VTrack
    public boolean isServiceRunning() {
        return this.mServiceRunning;
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.VTrack
    public void startUpdates() {
        try {
            if (TextUtils.isEmpty(this.mFeatureCode) || TextUtils.isEmpty(this.mPostUrl)) {
                return;
            }
            ((Application) this.mActivity.getApplicationContext()).registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            this.mMessageThreadHandler.start();
            ViewCrawlerHandler viewCrawlerHandler = this.mMessageThreadHandler;
            viewCrawlerHandler.sendMessage(viewCrawlerHandler.obtainMessage(1));
            this.mServiceRunning = true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.visual.VTrack
    public void stopUpdates(boolean z11) {
        if (z11) {
            try {
                this.mFeatureCode = null;
                this.mPostUrl = null;
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                return;
            }
        }
        this.mMessageThreadHandler.removeMessages(1);
        ((Application) this.mActivity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        this.mServiceRunning = false;
    }

    public AbstractViewCrawler(Activity activity, String str, String str2, String str3, String str4) {
        this.mActivity = activity;
        this.mFeatureCode = str2;
        EditState editState = new EditState();
        this.mEditState = editState;
        this.mType = str4;
        editState.add(activity);
        this.mLifecycleCallbacks = new LifecycleCallbacks();
        try {
            this.mPostUrl = URLDecoder.decode(str3, "UTF-8");
            this.mMessageObject = new JSONObject("{\"type\":\"snapshot_request\",\"payload\":{\"config\":{\"classes\":[{\"name\":\"android.view.View\",\"properties\":[{\"name\":\"importantForAccessibility\",\"get\":{\"selector\":\"isImportantForAccessibility\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}},{\"name\":\"clickable\",\"get\":{\"selector\":\"isClickable\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}}]},{\"name\":\"android.widget.TextView\",\"properties\":[{\"name\":\"importantForAccessibility\",\"get\":{\"selector\":\"isImportantForAccessibility\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}},{\"name\":\"clickable\",\"get\":{\"selector\":\"isClickable\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}}]},{\"name\":\"android.widget.ImageView\",\"properties\":[{\"name\":\"importantForAccessibility\",\"get\":{\"selector\":\"isImportantForAccessibility\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}},{\"name\":\"clickable\",\"get\":{\"selector\":\"isClickable\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}}]}]}}}");
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            this.mMessageObject = null;
        }
        ((Application) this.mActivity.getApplicationContext()).registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        try {
            this.mAppVersion = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            this.mAppVersion = "";
        }
        HandlerThread handlerThread = new HandlerThread(VisualizedAutoTrackViewCrawler.class.getCanonicalName(), 10);
        handlerThread.start();
        this.mMessageThreadHandler = new ViewCrawlerHandler(this.mActivity, handlerThread.getLooper(), str);
    }
}
