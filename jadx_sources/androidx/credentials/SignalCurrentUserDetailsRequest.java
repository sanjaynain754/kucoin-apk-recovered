package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RequiresPermission;
import androidx.credentials.internal.ConversionUtilsKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignalCurrentUserDetailsRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tB\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\n¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/SignalCurrentUserDetailsRequest;", "Landroidx/credentials/SignalCredentialStateRequest;", "requestJson", "", "requestData", "Landroid/os/Bundle;", "origin", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SignalCurrentUserDetailsRequest extends SignalCredentialStateRequest {

    @NotNull
    private static final String NAME_KEY = "name";

    @NotNull
    public static final String SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE = "androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE";

    @NotNull
    private static final String TAG = "SignalUserDetailsReq";

    @NotNull
    private static final String USER_ID_KEY = "userId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String RP_ID_KEY = "rpId";

    @NotNull
    private static final String DISPLAY_NAME_KEY = "displayName";

    @NotNull
    private static final List<String> REQUIRED_KEYS = CollectionsKt.listOf((Object[]) new String[]{RP_ID_KEY, "userId", "name", DISPLAY_NAME_KEY});

    /* JADX INFO: compiled from: SignalCurrentUserDetailsRequest.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/SignalCurrentUserDetailsRequest$Companion;", "", "<init>", "()V", "SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE", "", "TAG", "RP_ID_KEY", "USER_ID_KEY", "NAME_KEY", "DISPLAY_NAME_KEY", "REQUIRED_KEYS", "", "isValidRequestJson", "", "requestJson", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
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
                Iterator it = SignalCurrentUserDetailsRequest.REQUIRED_KEYS.iterator();
                while (it.hasNext()) {
                    if (!jSONObject.has((String) it.next())) {
                        return false;
                    }
                }
                String string = jSONObject.getString("userId");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                if (!ConversionUtilsKt.isValidBase64Url(string)) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public /* synthetic */ SignalCurrentUserDetailsRequest(String str, Bundle bundle, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, (i11 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCurrentUserDetailsRequest(@NotNull String requestJson, @NotNull Bundle requestData, @Nullable String str) {
        super(SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE, requestJson, requestData, str);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        if (INSTANCE.isValidRequestJson(requestJson)) {
            return;
        }
        throw new IllegalArgumentException(("Structural/type validation failed for JSON: '" + requestJson + '\'').toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalCurrentUserDetailsRequest(@NotNull String requestJson) {
        this(requestJson, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresPermission(conditional = true, value = "android.permission.CREDENTIAL_MANAGER_SET_ORIGIN")
    public SignalCurrentUserDetailsRequest(@NotNull String requestJson, @Nullable String str) {
        this(requestJson, SignalAllAcceptedCredentialIdsRequest.INSTANCE.toRequestData(requestJson), str);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }
}
