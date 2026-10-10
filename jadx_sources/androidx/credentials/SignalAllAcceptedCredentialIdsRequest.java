package androidx.credentials;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import androidx.credentials.internal.ConversionUtilsKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignalAllAcceptedCredentialIdsRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tB\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\n¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/SignalAllAcceptedCredentialIdsRequest;", "Landroidx/credentials/SignalCredentialStateRequest;", "requestJson", "", "requestData", "Landroid/os/Bundle;", "origin", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SignalAllAcceptedCredentialIdsRequest extends SignalCredentialStateRequest {

    @NotNull
    public static final String SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE = "androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE";

    @NotNull
    private static final String TAG = "SignalAcceptedIdsReq";

    @NotNull
    private static final String USER_ID_KEY = "userId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String RP_ID_KEY = "rpId";

    @NotNull
    private static final String ACCEPTED_CREDENTIAL_IDS_KEY = "allAcceptedCredentialIds";

    @NotNull
    private static final List<String> REQUIRED_KEYS = CollectionsKt.listOf((Object[]) new String[]{RP_ID_KEY, "userId", ACCEPTED_CREDENTIAL_IDS_KEY});

    /* JADX INFO: compiled from: SignalAllAcceptedCredentialIdsRequest.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Landroidx/credentials/SignalAllAcceptedCredentialIdsRequest$Companion;", "", "<init>", "()V", "SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE", "", "TAG", "RP_ID_KEY", "USER_ID_KEY", "ACCEPTED_CREDENTIAL_IDS_KEY", "REQUIRED_KEYS", "", "toRequestData", "Landroid/os/Bundle;", "requestJson", "isValidRequestJson", "", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isValidRequestJson(@NotNull String requestJson) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(requestJson);
                for (String str : SignalAllAcceptedCredentialIdsRequest.REQUIRED_KEYS) {
                    if (!jSONObject.has(str)) {
                        Log.e(SignalAllAcceptedCredentialIdsRequest.TAG, "Request json is missing required key " + str);
                        return false;
                    }
                }
                String string = jSONObject.getString("userId");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                if (!ConversionUtilsKt.isValidBase64Url(string)) {
                    return false;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(SignalAllAcceptedCredentialIdsRequest.ACCEPTED_CREDENTIAL_IDS_KEY);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = jSONArray.get(i11);
                    if (!(obj instanceof String) || !ConversionUtilsKt.isValidBase64Url((String) obj)) {
                        return false;
                    }
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        @NotNull
        public final Bundle toRequestData(@NotNull String requestJson) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.signal_request_json_key", requestJson);
            return bundle;
        }
    }

    public /* synthetic */ SignalAllAcceptedCredentialIdsRequest(String str, Bundle bundle, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, (i11 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(@NotNull String requestJson, @NotNull Bundle requestData, @Nullable String str) {
        super(SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE, requestJson, requestData, str);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        if (INSTANCE.isValidRequestJson(requestJson)) {
            return;
        }
        throw new IllegalArgumentException(("Structural/type validation failed for JSON: '" + requestJson + '\'').toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalAllAcceptedCredentialIdsRequest(@NotNull String requestJson) {
        this(requestJson, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresPermission(conditional = true, value = "android.permission.CREDENTIAL_MANAGER_SET_ORIGIN")
    public SignalAllAcceptedCredentialIdsRequest(@NotNull String requestJson, @Nullable String str) {
        this(requestJson, INSTANCE.toRequestData(requestJson), str);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }
}
