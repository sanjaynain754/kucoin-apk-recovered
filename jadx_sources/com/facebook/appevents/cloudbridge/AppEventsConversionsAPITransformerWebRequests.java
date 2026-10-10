package com.facebook.appevents.cloudbridge;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.UninitializedPropertyAccessException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.IntRange;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0015\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00120\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u00020\b2\u001a\u0010\u0017\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0087\u0001\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u000f2<\u0010#\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u001fH\u0000¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000f0(j\b\u0012\u0004\u0012\u00020\u000f`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u000f0(j\b\u0012\u0004\u0012\u00020\u000f`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\"\u00104\u001a\u00020.8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R4\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012058\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b0\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0019R\"\u0010@\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests;", "", "<init>", "()V", "", "datasetID", "url", "accessKey", "", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/GraphRequest;", "request", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/facebook/GraphRequest;)V", "", "responseCode", "", "", "processedEvents", "maxRetryCount", "g", "(Ljava/lang/Integer;Ljava/util/List;I)V", DbParams.TABLE_EVENTS, "c", "(Ljava/util/List;)V", "urlStr", "requestMethod", "jsonBodyStr", "requestProperties", "timeOutInterval", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "requestResult", "requestCallback", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/functions/Function2;)V", "k", "(Lcom/facebook/GraphRequest;)Ljava/util/List;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "ACCEPTABLE_HTTP_RESPONSE", "RETRY_EVENTS_HTTP_RESPONSE", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "e", "()Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "i", "(Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;)V", "credentials", "", "Ljava/util/List;", "f", "()Ljava/util/List;", "j", "transformedEvents", "I", "getCurrentRetryCount$facebook_core_release", "()I", "setCurrentRetryCount$facebook_core_release", "(I)V", "currentRetryCount", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppEventsConversionsAPITransformerWebRequests.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEventsConversionsAPITransformerWebRequests.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1855#2,2:292\n1#3:294\n*S KotlinDebug\n*F\n+ 1 AppEventsConversionsAPITransformerWebRequests.kt\ncom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests\n*L\n239#1:292,2\n*E\n"})
public final class AppEventsConversionsAPITransformerWebRequests {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppEventsConversionsAPITransformerWebRequests f7723a = new AppEventsConversionsAPITransformerWebRequests();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = SetsKt.hashSetOf(200, 202);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = SetsKt.hashSetOf(503, 504, 429);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static CloudBridgeCredentials credentials;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static List<Map<String, Object>> transformedEvents;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static int currentRetryCount;

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$a, reason: from toString */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "", "", "datasetID", "cloudBridgeURL", "accessKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "c", "b", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class CloudBridgeCredentials {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String datasetID;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String cloudBridgeURL;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String accessKey;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloudBridgeCredentials)) {
                return false;
            }
            CloudBridgeCredentials cloudBridgeCredentials = (CloudBridgeCredentials) other;
            return Intrinsics.areEqual(this.datasetID, cloudBridgeCredentials.datasetID) && Intrinsics.areEqual(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && Intrinsics.areEqual(this.accessKey, cloudBridgeCredentials.accessKey);
        }

        public CloudBridgeCredentials(@NotNull String datasetID, @NotNull String cloudBridgeURL, @NotNull String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.datasetID = datasetID;
            this.cloudBridgeURL = cloudBridgeURL;
            this.accessKey = accessKey;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessKey() {
            return this.accessKey;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDatasetID() {
            return this.datasetID;
        }

        public int hashCode() {
            return (((this.datasetID.hashCode() * 31) + this.cloudBridgeURL.hashCode()) * 31) + this.accessKey.hashCode();
        }

        @NotNull
        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.datasetID + ", cloudBridgeURL=" + this.cloudBridgeURL + ", accessKey=" + this.accessKey + ')';
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m7979d(@NotNull String datasetID, @NotNull String url, @NotNull String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = f7723a;
        appEventsConversionsAPITransformerWebRequests.m7987i(new CloudBridgeCredentials(datasetID, url, accessKey));
        appEventsConversionsAPITransformerWebRequests.m7988j(new ArrayList());
    }

    /* JADX INFO: renamed from: m */
    public static final void m7981m(GraphRequest request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "$request");
        String graphPath = request.getGraphPath();
        List listSplit$default = graphPath != null ? StringsKt.split$default((CharSequence) graphPath, new String[]{"/"}, false, 0, 6, (Object) null) : null;
        if (listSplit$default == null || listSplit$default.size() != 2) {
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = f7723a;
            String str = appEventsConversionsAPITransformerWebRequests.m7983e().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.m7983e().getDatasetID() + "/events";
            List<Map<String, Object>> listM7989k = appEventsConversionsAPITransformerWebRequests.m7989k(request);
            if (listM7989k == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.m7982c(listM7989k);
            int iMin = Math.min(appEventsConversionsAPITransformerWebRequests.m7984f().size(), 10);
            List listSlice = CollectionsKt.slice((List) appEventsConversionsAPITransformerWebRequests.m7984f(), new IntRange(0, iMin - 1));
            appEventsConversionsAPITransformerWebRequests.m7984f().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listSlice);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.m7983e().getAccessKey());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            Logger.Companion companion = Logger.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String string = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(string, "jsonBodyStr.toString(2)");
            companion.log(loggingBehavior, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, string);
            appEventsConversionsAPITransformerWebRequests.m7986h(str, "POST", jSONObject.toString(), MapsKt.mapOf(TuplesKt.m90091to("Content-Type", "application/json")), 60000, new C5512xf719cce4(listSlice));
        } catch (UninitializedPropertyAccessException e11) {
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7982c(@Nullable List<? extends Map<String, ? extends Object>> events) {
        if (events != null) {
            m7984f().addAll(events);
        }
        int iMax = Math.max(0, m7984f().size() - 1000);
        if (iMax > 0) {
            List listDrop = CollectionsKt.drop(m7984f(), iMax);
            Intrinsics.checkNotNull(listDrop, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            m7988j(TypeIntrinsics.asMutableList(listDrop));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final CloudBridgeCredentials m7983e() {
        CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentials");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<Map<String, Object>> m7984f() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m7986h(@NotNull String urlStr, @NotNull String requestMethod, @Nullable String jsonBodyStr, @Nullable Map<String, String> requestProperties, int timeOutInterval, @Nullable Function2<? super String, ? super Integer, Unit> requestCallback) {
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlStr).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (requestProperties != null && (setKeySet = requestProperties.keySet()) != null) {
                for (String str : setKeySet) {
                    httpURLConnection.setRequestProperty(str, requestProperties.get(str));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(timeOutInterval);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
            bufferedWriter.write(jsonBodyStr);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(bufferedReader, th2);
                            throw th3;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader, null);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "connResponseSB.toString()");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (requestCallback != null) {
                requestCallback.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e11) {
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e11.toString());
            if (requestCallback != null) {
                requestCallback.invoke(null, 503);
            }
        } catch (IOException e12) {
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e12.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7987i(@NotNull CloudBridgeCredentials cloudBridgeCredentials) {
        Intrinsics.checkNotNullParameter(cloudBridgeCredentials, "<set-?>");
        credentials = cloudBridgeCredentials;
    }

    /* JADX INFO: renamed from: j */
    public final void m7988j(@NotNull List<Map<String, Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        transformedEvents = list;
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m7980l(@NotNull final GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C5760c.m10079p0(new Runnable() { // from class: com.facebook.appevents.cloudbridge.c
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                AppEventsConversionsAPITransformerWebRequests.m7981m(request);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m7985g(@Nullable Integer responseCode, @NotNull List<? extends Map<String, ? extends Object>> processedEvents, int maxRetryCount) {
        Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        if (CollectionsKt.contains(RETRY_EVENTS_HTTP_RESPONSE, responseCode)) {
            if (currentRetryCount >= maxRetryCount) {
                m7984f().clear();
                currentRetryCount = 0;
            } else {
                m7984f().addAll(0, processedEvents);
                currentRetryCount++;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final List<Map<String, Object>> m7989k(GraphRequest request) {
        JSONObject graphObject = request.getGraphObject();
        if (graphObject != null) {
            Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(C5760c.m10076n(graphObject));
            Object tag = request.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Any");
            mutableMap.put("custom_events", tag);
            StringBuilder sb2 = new StringBuilder();
            for (String str : mutableMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                sb2.append(mutableMap.get(str));
                sb2.append(System.getProperty("line.separator"));
            }
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
            return AppEventsConversionsAPITransformer.f7713a.m7965e(mutableMap);
        }
        return null;
    }
}
