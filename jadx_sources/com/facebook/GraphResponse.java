package com.facebook;

import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: GraphResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\u0018\u0000 /2\u00020\u0001:\u00010BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(R\u0019\u0010*\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b\"\u0010\u0015R\u0019\u0010.\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010-¨\u00061"}, m90084d2 = {"Lcom/facebook/GraphResponse;", "", "Lcom/facebook/GraphRequest;", "request", "Ljava/net/HttpURLConnection;", "connection", "", "rawResponse", "Lorg/json/JSONObject;", "graphObject", "Lorg/json/JSONArray;", "graphObjectArray", "Lcom/facebook/FacebookRequestError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lcom/facebook/FacebookRequestError;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V", "graphObjects", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V", "c", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/GraphRequest;", "getRequest", "()Lcom/facebook/GraphRequest;", "b", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "Ljava/lang/String;", "getRawResponse", "d", "Lorg/json/JSONObject;", "e", "Lorg/json/JSONArray;", "f", "Lcom/facebook/FacebookRequestError;", "()Lcom/facebook/FacebookRequestError;", "g", "jsonObject", CmcdData.Factory.STREAMING_FORMAT_HLS, "getJsonArray", "()Lorg/json/JSONArray;", "jsonArray", "i", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class GraphResponse {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public static final String f7594j = GraphResponse.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final GraphRequest request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String rawResponse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final JSONObject graphObject;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final JSONArray graphObjectArray;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final FacebookRequestError error;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final JSONObject jsonObject;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final JSONArray jsonArray;

    /* JADX INFO: compiled from: GraphResponse.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$¨\u0006*"}, m90084d2 = {"Lcom/facebook/GraphResponse$Companion;", "", "<init>", "()V", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/GraphRequestBatch;", "requests", "", "Lcom/facebook/GraphResponse;", "fromHttpConnection$facebook_core_release", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "fromHttpConnection", "Ljava/io/InputStream;", "stream", "createResponsesFromStream$facebook_core_release", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "createResponsesFromStream", "", "responseString", "createResponsesFromString$facebook_core_release", "(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "createResponsesFromString", "Lcom/facebook/GraphRequest;", "Lcom/facebook/FacebookException;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "constructErrorResponses", "(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;", "sourceObject", "b", "(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "request", "originalResult", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/GraphResponse;", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "NON_JSON_RESPONSE_PROPERTY", "RESPONSE_LOG_TAG", "SUCCESS_KEY", "TAG", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGraphResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphResponse.kt\ncom/facebook/GraphResponse$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n1549#2:360\n1620#2,3:361\n*S KotlinDebug\n*F\n+ 1 GraphResponse.kt\ncom/facebook/GraphResponse$Companion\n*L\n355#1:360\n355#1:361,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final GraphResponse m7744a(GraphRequest request, HttpURLConnection connection, Object sourceObject, Object originalResult) throws JSONException {
            if (sourceObject instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) sourceObject;
                FacebookRequestError facebookRequestErrorCheckResponseAndCreateError = FacebookRequestError.INSTANCE.checkResponseAndCreateError(jSONObject, originalResult, connection);
                if (facebookRequestErrorCheckResponseAndCreateError != null) {
                    Log.e(GraphResponse.f7594j, facebookRequestErrorCheckResponseAndCreateError.toString());
                    if (facebookRequestErrorCheckResponseAndCreateError.getErrorCode() == 190 && C5760c.m10054V(request.getAccessToken())) {
                        if (facebookRequestErrorCheckResponseAndCreateError.getSubErrorCode() != 493) {
                            AccessToken.INSTANCE.setCurrentAccessToken(null);
                        } else {
                            AccessToken.Companion companion = AccessToken.INSTANCE;
                            AccessToken currentAccessToken = companion.getCurrentAccessToken();
                            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                                companion.expireCurrentAccessToken();
                            }
                        }
                    }
                    return new GraphResponse(request, connection, facebookRequestErrorCheckResponseAndCreateError);
                }
                Object objM10050N = C5760c.m10050N(jSONObject, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT");
                if (objM10050N instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objM10050N;
                    return new GraphResponse(request, connection, jSONObject2.toString(), jSONObject2);
                }
                if (objM10050N instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objM10050N;
                    return new GraphResponse(request, connection, jSONArray.toString(), jSONArray);
                }
                sourceObject = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(sourceObject, "NULL");
            }
            if (sourceObject == JSONObject.NULL) {
                return new GraphResponse(request, connection, sourceObject.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + sourceObject.getClass().getSimpleName());
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> fromHttpConnection$facebook_core_release(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            List<GraphResponse> listConstructErrorResponses;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            try {
                try {
                    try {
                        if (!C5501a.m7767C()) {
                            Log.e(GraphResponse.f7594j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        }
                        InputStream errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                        List<GraphResponse> listCreateResponsesFromStream$facebook_core_release = createResponsesFromStream$facebook_core_release(errorStream, connection, requests);
                        C5760c.m10071i(errorStream);
                        return listCreateResponsesFromStream$facebook_core_release;
                    } catch (FacebookException e11) {
                        Logger.INSTANCE.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e11);
                        listConstructErrorResponses = constructErrorResponses(requests, connection, e11);
                        C5760c.m10071i(null);
                        return listConstructErrorResponses;
                    }
                } catch (Exception e12) {
                    Logger.INSTANCE.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e12);
                    listConstructErrorResponses = constructErrorResponses(requests, connection, new FacebookException(e12));
                    C5760c.m10071i(null);
                    return listConstructErrorResponses;
                }
            } catch (Throwable th2) {
                C5760c.m10071i(null);
                throw th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public final List<GraphResponse> m7745b(HttpURLConnection connection, List<GraphRequest> requests, Object sourceObject) throws JSONException, FacebookException {
            Object obj;
            int responseCode;
            int size = requests.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TtmlNode.TAG_BODY, sourceObject);
                    if (connection != null) {
                        responseCode = connection.getResponseCode();
                    } else {
                        responseCode = 200;
                    }
                    jSONObject.put("code", responseCode);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e11) {
                    arrayList.add(new GraphResponse(graphRequest, connection, new FacebookRequestError(connection, e11)));
                    obj = sourceObject;
                } catch (JSONException e12) {
                    arrayList.add(new GraphResponse(graphRequest, connection, new FacebookRequestError(connection, e12)));
                    obj = sourceObject;
                }
            } else {
                obj = sourceObject;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        GraphRequest graphRequest2 = requests.get(i11);
                        try {
                            Object obj2 = ((JSONArray) obj).get(i11);
                            Intrinsics.checkNotNullExpressionValue(obj2, "obj");
                            arrayList.add(m7744a(graphRequest2, connection, obj2, sourceObject));
                        } catch (FacebookException e13) {
                            arrayList.add(new GraphResponse(graphRequest2, connection, new FacebookRequestError(connection, e13)));
                        } catch (JSONException e14) {
                            arrayList.add(new GraphResponse(graphRequest2, connection, new FacebookRequestError(connection, e14)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> constructErrorResponses(@NotNull List<GraphRequest> requests, @Nullable HttpURLConnection connection, @Nullable FacebookException error) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(requests, 10));
            Iterator<T> it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it.next(), connection, new FacebookRequestError(connection, error)));
            }
            return arrayList;
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> createResponsesFromStream$facebook_core_release(@Nullable InputStream stream, @Nullable HttpURLConnection connection, @NotNull GraphRequestBatch requests) throws Throwable {
            Intrinsics.checkNotNullParameter(requests, "requests");
            String strM10070h0 = C5760c.m10070h0(stream);
            Logger.INSTANCE.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strM10070h0.length()), strM10070h0);
            return createResponsesFromString$facebook_core_release(strM10070h0, connection, requests);
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> createResponsesFromString$facebook_core_release(@NotNull String responseString, @Nullable HttpURLConnection connection, @NotNull GraphRequestBatch requests) throws JSONException, FacebookException, IOException {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List<GraphResponse> listM7745b = m7745b(connection, requests, resultObject);
            Logger.INSTANCE.log(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.getId(), Integer.valueOf(responseString.length()), listM7745b);
            return listM7745b;
        }
    }

    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable JSONArray jSONArray, @Nullable FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FacebookRequestError getError() {
        return this.error;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.connection;
            str = String.format(locale, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull String rawResponse, @Nullable JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull String rawResponse, @NotNull JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
