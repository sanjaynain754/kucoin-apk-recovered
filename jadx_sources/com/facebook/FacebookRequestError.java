package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.net.HttpURLConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FacebookRequestError.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003IHJB\u0083\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u0016\u0010\u001bB%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u001dB\u0011\b\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0016\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010)R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b1\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b<\u0010\"R(\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010=\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010F\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u0010\"¨\u0006K"}, m90084d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "requestStatusCode", "errorCode", "subErrorCode", "", "errorType", "errorMessageField", "errorUserTitle", "errorUserMessage", "Lorg/json/JSONObject;", "requestResultBody", "requestResult", "", "batchRequestResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookException;", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "errorMessage", "(ILjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "toString", "()Ljava/lang/String;", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "I", "getRequestStatusCode", "getErrorCode", "getSubErrorCode", "Ljava/lang/String;", "getErrorType", "getErrorUserTitle", "getErrorUserMessage", "Lorg/json/JSONObject;", "getRequestResultBody", "()Lorg/json/JSONObject;", "getRequestResult", "Ljava/lang/Object;", "getBatchRequestResult", "()Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "getErrorMessage", "<set-?>", "Lcom/facebook/FacebookException;", "getException", "()Lcom/facebook/FacebookException;", "Lcom/facebook/FacebookRequestError$Category;", "category", "Lcom/facebook/FacebookRequestError$Category;", "getCategory", "()Lcom/facebook/FacebookRequestError$Category;", "errorRecoveryMessage", "getErrorRecoveryMessage", "Companion", "Category", "b", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FacebookRequestError implements Parcelable {

    @NotNull
    private static final String BODY_KEY = "body";

    @NotNull
    private static final String CODE_KEY = "code";

    @NotNull
    private static final String ERROR_CODE_FIELD_KEY = "code";

    @NotNull
    private static final String ERROR_CODE_KEY = "error_code";

    @NotNull
    private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";

    @NotNull
    private static final String ERROR_KEY = "error";

    @NotNull
    private static final String ERROR_MESSAGE_FIELD_KEY = "message";

    @NotNull
    private static final String ERROR_MSG_KEY = "error_msg";

    @NotNull
    private static final String ERROR_REASON_KEY = "error_reason";

    @NotNull
    private static final String ERROR_SUB_CODE_KEY = "error_subcode";

    @NotNull
    private static final String ERROR_TYPE_FIELD_KEY = "type";

    @NotNull
    private static final String ERROR_USER_MSG_KEY = "error_user_msg";

    @NotNull
    private static final String ERROR_USER_TITLE_KEY = "error_user_title";
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;

    @Nullable
    private final Object batchRequestResult;

    @NotNull
    private final Category category;

    @Nullable
    private final HttpURLConnection connection;
    private final int errorCode;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String errorRecoveryMessage;

    @Nullable
    private final String errorType;

    @Nullable
    private final String errorUserMessage;

    @Nullable
    private final String errorUserTitle;

    @Nullable
    private FacebookException exception;

    @Nullable
    private final JSONObject requestResult;

    @Nullable
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final C5486b HTTP_RANGE_SUCCESS = new C5486b(200, 299);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C5485a();

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/FacebookRequestError$Category;", "", "(Ljava/lang/String;I)V", "LOGIN_RECOVERABLE", "OTHER", "TRANSIENT", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0014\u0010&\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0014\u0010(\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, m90084d2 = {"Lcom/facebook/FacebookRequestError$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "singleResult", "batchResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookRequestError;", "checkResponseAndCreateError", "(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;", "Lcom/facebook/FacebookRequestError$b;", "HTTP_RANGE_SUCCESS", "Lcom/facebook/FacebookRequestError$b;", "getHTTP_RANGE_SUCCESS$facebook_core_release", "()Lcom/facebook/FacebookRequestError$b;", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "getErrorClassification", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "errorClassification", "", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ERROR_CODE_FIELD_KEY", "ERROR_CODE_KEY", "ERROR_IS_TRANSIENT_KEY", "ERROR_KEY", "ERROR_MESSAGE_FIELD_KEY", "ERROR_MSG_KEY", "ERROR_REASON_KEY", "ERROR_SUB_CODE_KEY", "ERROR_TYPE_FIELD_KEY", "ERROR_USER_MSG_KEY", "ERROR_USER_TITLE_KEY", "", "INVALID_ERROR_CODE", "I", "INVALID_HTTP_STATUS_CODE", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final synchronized FacebookRequestErrorClassification getErrorClassification() {
            FetchedAppSettings fetchedAppSettingsM9975f = FetchedAppSettingsManager.m9975f(C5501a.m7800n());
            if (fetchedAppSettingsM9975f == null) {
                return FacebookRequestErrorClassification.INSTANCE.getDefaultErrorClassification();
            }
            return fetchedAppSettingsM9975f.getErrorClassification();
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final FacebookRequestError checkResponseAndCreateError(@NotNull JSONObject singleResult, @Nullable Object batchResult, @Nullable HttpURLConnection connection) {
            String strOptString;
            int iOptInt;
            String str;
            boolean zOptBoolean;
            String strOptString2;
            String strOptString3;
            String str2 = "body";
            Intrinsics.checkNotNullParameter(singleResult, "singleResult");
            try {
                if (singleResult.has("code")) {
                    int i11 = singleResult.getInt("code");
                    Object objM10050N = C5760c.m10050N(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objM10050N == null || !(objM10050N instanceof JSONObject)) {
                        str2 = "body";
                    } else {
                        boolean z11 = true;
                        int iOptInt2 = -1;
                        if (((JSONObject) objM10050N).has("error")) {
                            JSONObject jSONObject = (JSONObject) C5760c.m10050N((JSONObject) objM10050N, "error", null);
                            String strOptString4 = jSONObject != null ? jSONObject.optString("type", null) : null;
                            strOptString = jSONObject != null ? jSONObject.optString("message", null) : null;
                            int iOptInt3 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            iOptInt2 = jSONObject != null ? jSONObject.optInt(FacebookRequestError.ERROR_SUB_CODE_KEY, -1) : -1;
                            strOptString3 = jSONObject != null ? jSONObject.optString(FacebookRequestError.ERROR_USER_MSG_KEY, null) : null;
                            iOptInt = iOptInt2;
                            iOptInt2 = iOptInt3;
                            str = strOptString4;
                            strOptString2 = jSONObject != null ? jSONObject.optString(FacebookRequestError.ERROR_USER_TITLE_KEY, null) : null;
                            zOptBoolean = jSONObject != null ? jSONObject.optBoolean(FacebookRequestError.ERROR_IS_TRANSIENT_KEY, false) : false;
                        } else if (((JSONObject) objM10050N).has("error_code") || ((JSONObject) objM10050N).has(FacebookRequestError.ERROR_MSG_KEY) || ((JSONObject) objM10050N).has(FacebookRequestError.ERROR_REASON_KEY)) {
                            String strOptString5 = ((JSONObject) objM10050N).optString(FacebookRequestError.ERROR_REASON_KEY, null);
                            strOptString = ((JSONObject) objM10050N).optString(FacebookRequestError.ERROR_MSG_KEY, null);
                            iOptInt2 = ((JSONObject) objM10050N).optInt("error_code", -1);
                            iOptInt = ((JSONObject) objM10050N).optInt(FacebookRequestError.ERROR_SUB_CODE_KEY, -1);
                            str = strOptString5;
                            zOptBoolean = false;
                            strOptString2 = null;
                            strOptString3 = null;
                        } else {
                            z11 = false;
                            zOptBoolean = false;
                            iOptInt = -1;
                            str = null;
                            strOptString2 = null;
                            strOptString = null;
                            strOptString3 = null;
                        }
                        if (z11) {
                            return new FacebookRequestError(i11, iOptInt2, iOptInt, str, strOptString, strOptString2, strOptString3, (JSONObject) objM10050N, singleResult, batchResult, connection, null, zOptBoolean, null);
                        }
                    }
                    if (!getHTTP_RANGE_SUCCESS$facebook_core_release().m7634a(i11)) {
                        return new FacebookRequestError(i11, -1, -1, null, null, null, null, singleResult.has(str2) ? (JSONObject) C5760c.m10050N(singleResult, str2, "FACEBOOK_NON_JSON_RESULT") : null, singleResult, batchResult, connection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        @NotNull
        public final C5486b getHTTP_RANGE_SUCCESS$facebook_core_release() {
            return FacebookRequestError.HTTP_RANGE_SUCCESS;
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$a */
    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/FacebookRequestError$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcel;", "parcel", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Parcel;)Lcom/facebook/FacebookRequestError;", "", "size", "", "b", "(I)[Lcom/facebook/FacebookRequestError;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5485a implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int size) {
            return new FacebookRequestError[size];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$b */
    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/facebook/FacebookRequestError$b;", "", "", "start", "end", "<init>", "(II)V", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Z", "I", "b", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5486b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int start;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int end;

        /* JADX INFO: renamed from: a */
        public final boolean m7634a(int value) {
            return value <= this.end && this.start <= value;
        }

        public C5486b(int i11, int i12) {
            this.start = i11;
            this.end = i12;
        }
    }

    public /* synthetic */ FacebookRequestError(int i11, int i12, int i13, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @JvmStatic
    @Nullable
    public static final FacebookRequestError checkResponseAndCreateError(@NotNull JSONObject jSONObject, @Nullable Object obj, @Nullable HttpURLConnection httpURLConnection) {
        return INSTANCE.checkResponseAndCreateError(jSONObject, obj, httpURLConnection);
    }

    @JvmStatic
    @NotNull
    public static final synchronized FacebookRequestErrorClassification getErrorClassification() {
        return INSTANCE.getErrorClassification();
    }

    @Nullable
    public final Object getBatchRequestResult() {
        return this.batchRequestResult;
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Nullable
    public final String getErrorRecoveryMessage() {
        return this.errorRecoveryMessage;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getErrorUserMessage() {
        return this.errorUserMessage;
    }

    @Nullable
    public final String getErrorUserTitle() {
        return this.errorUserTitle;
    }

    @Nullable
    public final FacebookException getException() {
        return this.exception;
    }

    @Nullable
    public final JSONObject getRequestResult() {
        return this.requestResult;
    }

    @Nullable
    public final JSONObject getRequestResultBody() {
        return this.requestResultBody;
    }

    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    @NotNull
    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    private FacebookRequestError(int i11, int i12, int i13, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z11) {
        Category categoryM9932c;
        this.requestStatusCode = i11;
        this.errorCode = i12;
        this.subErrorCode = i13;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            categoryM9932c = Category.OTHER;
        } else {
            this.exception = new FacebookServiceException(this, getErrorMessage());
            categoryM9932c = INSTANCE.getErrorClassification().m9932c(i12, i13, z11);
        }
        this.category = categoryM9932c;
        this.errorRecoveryMessage = INSTANCE.getErrorClassification().m9933d(categoryM9932c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(getErrorMessage());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    @VisibleForTesting(otherwise = 4)
    public FacebookRequestError(@Nullable HttpURLConnection httpURLConnection, @Nullable Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i11, @Nullable String str, @Nullable String str2) {
        this(-1, i11, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
