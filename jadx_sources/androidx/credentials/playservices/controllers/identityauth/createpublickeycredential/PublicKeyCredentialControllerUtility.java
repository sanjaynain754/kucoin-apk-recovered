package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.AbortError;
import androidx.credentials.exceptions.domerrors.ConstraintError;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NetworkError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.NotReadableError;
import androidx.credentials.exceptions.domerrors.NotSupportedError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.domerrors.TimeoutError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PublicKeyCredentialControllerUtility.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility;", "", "<init>", "()V", "Companion", "GetGMSVersion", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;

    @NotNull
    private static final String TAG = "PublicKeyUtility";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";

    @NotNull
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";

    @NotNull
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";

    @NotNull
    private static final String JSON_KEY_SIGNATURE = TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE;

    @NotNull
    private static final String JSON_KEY_USER_HANDLE = "userHandle";

    @NotNull
    private static final String JSON_KEY_RESPONSE = "response";

    @NotNull
    private static final String JSON_KEY_ID = "id";

    @NotNull
    private static final String JSON_KEY_RAW_ID = "rawId";

    @NotNull
    private static final String JSON_KEY_TYPE = "type";

    @NotNull
    private static final String JSON_KEY_RPID = "rpId";

    @NotNull
    private static final String JSON_KEY_CHALLENGE = ClientData.KEY_CHALLENGE;

    @NotNull
    private static final String JSON_KEY_APPID = AppsFlyerProperties.APP_ID;

    @NotNull
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";

    @NotNull
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";

    @NotNull
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";

    @NotNull
    private static final String JSON_KEY_RES_KEY = "residentKey";

    @NotNull
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";

    @NotNull
    private static final String JSON_KEY_TIMEOUT = "timeout";

    @NotNull
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";

    @NotNull
    private static final String JSON_KEY_TRANSPORTS = "transports";

    @NotNull
    private static final String JSON_KEY_RP = "rp";

    @NotNull
    private static final String JSON_KEY_NAME = "name";

    @NotNull
    private static final String JSON_KEY_ICON = TUIConstants.TUIChat.INPUT_MORE_ICON;

    @NotNull
    private static final String JSON_KEY_ALG = "alg";

    @NotNull
    private static final String JSON_KEY_USER = "user";

    @NotNull
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";

    @NotNull
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";

    @NotNull
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";

    @NotNull
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";

    @NotNull
    private static final String JSON_KEY_EXTENSTIONS = "extensions";

    @NotNull
    private static final String JSON_KEY_ATTESTATION = "attestation";

    @NotNull
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";

    @NotNull
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";

    @NotNull
    private static final String JSON_KEY_RK = "rk";

    @NotNull
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    @NotNull
    private static final LinkedHashMap<ErrorCode, DomError> orderedErrorCodeToExceptions = MapsKt.linkedMapOf(TuplesKt.m90091to(ErrorCode.UNKNOWN_ERR, new UnknownError()), TuplesKt.m90091to(ErrorCode.ABORT_ERR, new AbortError()), TuplesKt.m90091to(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new NotReadableError()), TuplesKt.m90091to(ErrorCode.CONSTRAINT_ERR, new ConstraintError()), TuplesKt.m90091to(ErrorCode.DATA_ERR, new DataError()), TuplesKt.m90091to(ErrorCode.INVALID_STATE_ERR, new InvalidStateError()), TuplesKt.m90091to(ErrorCode.ENCODING_ERR, new EncodingError()), TuplesKt.m90091to(ErrorCode.NETWORK_ERR, new NetworkError()), TuplesKt.m90091to(ErrorCode.NOT_ALLOWED_ERR, new NotAllowedError()), TuplesKt.m90091to(ErrorCode.NOT_SUPPORTED_ERR, new NotSupportedError()), TuplesKt.m90091to(ErrorCode.SECURITY_ERR, new SecurityError()), TuplesKt.m90091to(ErrorCode.TIMEOUT_ERR, new TimeoutError()));

    /* JADX INFO: compiled from: PublicKeyCredentialControllerUtility.kt */
    @Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\bG\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SH\u0007J\u0018\u0010T\u001a\u00020U2\u0006\u0010R\u001a\u00020S2\u0006\u0010V\u001a\u00020MH\u0002J\u0015\u0010W\u001a\u00020O2\u0006\u0010X\u001a\u00020YH\u0000¢\u0006\u0002\bZJ7\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020^2\u000e\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050a2\u0006\u0010X\u001a\u00020YH\u0000¢\u0006\u0004\bb\u0010cJ\u000e\u0010d\u001a\u00020\u00052\u0006\u0010e\u001a\u00020fJ\u000e\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jJ\u0010\u0010k\u001a\u00020l2\u0006\u0010i\u001a\u00020jH\u0007J\u0010\u0010m\u001a\u00020^2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010e\u001a\u00020pJ\u001f\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\b\u0010u\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\bvJ\u001d\u0010w\u001a\u00020\\2\u0006\u0010X\u001a\u00020Y2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0002\bzJ\u001d\u0010{\u001a\u00020\\2\u0006\u0010X\u001a\u00020Y2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0002\b|J\u001d\u0010}\u001a\u00020\\2\u0006\u0010X\u001a\u00020Y2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0002\b~J\u001e\u0010\u007f\u001a\u00020\\2\u0006\u0010X\u001a\u00020Y2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0003\b\u0080\u0001J\u001f\u0010\u0081\u0001\u001a\u00020\\2\u0006\u0010X\u001a\u00020Y2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0003\b\u0082\u0001J\u001f\u0010\u0083\u0001\u001a\u00020\\2\u0006\u0010X\u001a\u00020Y2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0003\b\u0084\u0001J\u0010\u0010\u0085\u0001\u001a\u00020^2\u0007\u0010\u0086\u0001\u001a\u00020\u0005J\u0010\u0010\u0087\u0001\u001a\u00020\u00052\u0007\u0010\u0088\u0001\u001a\u00020^J\u0011\u0010\u0089\u0001\u001a\u00020U2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0014\u0010.\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0014\u00102\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0014\u00104\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0014\u00106\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0014\u00108\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0014\u0010:\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0014\u0010<\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0014\u0010>\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0014\u0010@\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0014\u0010B\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007R\u0014\u0010D\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0007R\u0014\u0010F\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0007R\u0014\u0010H\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0007R\u0014\u0010J\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007R\u000e\u0010L\u001a\u00020MX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u008c\u0001\u001a\u00030\u008b\u0001X\u0082T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R7\u0010\u008e\u0001\u001a\"\u0012\u0004\u0012\u00020t\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u0001j\u0010\u0012\u0004\u0012\u00020t\u0012\u0005\u0012\u00030\u0090\u0001`\u0091\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0094\u0001"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$Companion;", "", "<init>", "()V", "JSON_KEY_CLIENT_DATA", "", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth", "AUTH_MIN_VERSION_JSON_CREATE", "", "convert", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "request", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", "context", "Landroid/content/Context;", "isDeviceGMSVersionOlderThan", "", "version", "convertJSON", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "convertJSON$credentials_play_services_auth", "addAuthenticatorAttestationResponse", "", "clientDataJSON", "", "attestationObject", "transportArray", "", "addAuthenticatorAttestationResponse$credentials_play_services_auth", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "toAssertPasskeyResponse", "cred", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "convertToPlayAuthPasskeyJsonRequest", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Landroidx/credentials/GetPublicKeyCredentialOption;", "convertToPlayAuthPasskeyRequest", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "getChallenge", "publicKeyCredentialResponseContainsError", "Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "beginSignInPublicKeyCredentialResponseContainsError", "Landroidx/credentials/exceptions/GetCredentialException;", "code", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "msg", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth", "parseOptionalExtensions", "builder", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;", "parseOptionalExtensions$credentials_play_services_auth", "parseOptionalAuthenticatorSelection", "parseOptionalAuthenticatorSelection$credentials_play_services_auth", "parseOptionalTimeout", "parseOptionalTimeout$credentials_play_services_auth", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth", "parseRequiredRpAndParams", "parseRequiredRpAndParams$credentials_play_services_auth", "parseRequiredChallengeAndUser", "parseRequiredChallengeAndUser$credentials_play_services_auth", "b64Decode", "str", "b64Encode", "data", "checkAlgSupported", "alg", "", "FLAGS", "TAG", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "Landroidx/credentials/exceptions/domerrors/DomError;", "Lkotlin/collections/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth", "()Ljava/util/LinkedHashMap;", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: addAuthenticatorAttestationResponse$credentials_play_services_auth */
        public final void m2667x27780706(@NotNull byte[] clientDataJSON, @NotNull byte[] attestationObject, @NotNull String[] transportArray, @NotNull JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
            Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
            Intrinsics.checkNotNullParameter(transportArray, "transportArray");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth(), b64Encode(clientDataJSON));
            jSONObject.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth(), jSONObject);
        }

        @NotNull
        public final String b64Encode(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            String strEncodeToString = Base64.encodeToString(data, 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }

        @NotNull
        /* JADX INFO: renamed from: beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth */
        public final GetCredentialException m2668x4dea1c7f(@NotNull ErrorCode code, @Nullable String msg) {
            Intrinsics.checkNotNullParameter(code, "code");
            DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(code);
            if (domError != null) {
                return (code == ErrorCode.NOT_ALLOWED_ERR && msg != null && StringsKt.contains$default((CharSequence) msg, (CharSequence) "Unable to get sync account", false, 2, (Object) null)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(domError, msg);
            }
            return new GetPublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - " + msg);
        }

        @NotNull
        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth(@NotNull JSONObject json) throws JSONException, CreatePublicKeyCredentialDomException {
            Intrinsics.checkNotNullParameter(json, "json");
            PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
            parseRequiredChallengeAndUser$credentials_play_services_auth(json, builder);
            parseRequiredRpAndParams$credentials_play_services_auth(json, builder);
            m2673xa6f4fa12(json, builder);
            parseOptionalTimeout$credentials_play_services_auth(json, builder);
            m2672x6e902079(json, builder);
            parseOptionalExtensions$credentials_play_services_auth(json, builder);
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialCreationOptionsBuild, "build(...)");
            return publicKeyCredentialCreationOptionsBuild;
        }

        /* JADX INFO: renamed from: parseOptionalAuthenticatorSelection$credentials_play_services_auth */
        public final void m2672x6e902079(@NotNull JSONObject json, @NotNull PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth());
                AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
                boolean zOptBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth(), false);
                String strOptString = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth(), "");
                Intrinsics.checkNotNull(strOptString);
                builder2.setRequireResidentKey(Boolean.valueOf(zOptBoolean)).setResidentKeyRequirement(strOptString.length() > 0 ? ResidentKeyRequirement.fromString(strOptString) : null);
                String strOptString2 = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth(), "");
                Intrinsics.checkNotNull(strOptString2);
                if (strOptString2.length() > 0) {
                    builder2.setAttachment(Attachment.fromString(strOptString2));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth(@NotNull JSONObject json, @NotNull PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth());
                AuthenticationExtensions.Builder builder2 = new AuthenticationExtensions.Builder();
                String strOptString = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth(), "");
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() > 0) {
                    builder2.setFido2Extension(new FidoAppIdExtension(strOptString));
                }
                if (jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth(), false)) {
                    builder2.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    builder2.setUserVerificationMethodExtension(new UserVerificationMethodExtension(true));
                }
                builder.setAuthenticationExtensions(builder2.build());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth(@NotNull JSONObject json, @NotNull PublicKeyCredentialCreationOptions.Builder builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth())) {
                builder.setTimeoutSeconds(Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth()) / ((double) 1000)));
            }
        }

        /* JADX INFO: renamed from: parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth */
        public final void m2673xa6f4fa12(@NotNull JSONObject json, @NotNull PublicKeyCredentialCreationOptions.Builder builder) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth())) {
                JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth());
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    byte[] bArrB64Decode = b64Decode(string);
                    String string2 = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth());
                    Intrinsics.checkNotNull(string2);
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth());
                        int length2 = jSONArray2.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            try {
                                arrayList.add(Transport.fromString(jSONArray2.getString(i12)));
                            } catch (Transport.UnsupportedTransportException e11) {
                                throw new CreatePublicKeyCredentialDomException(new EncodingError(), e11.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(string2, bArrB64Decode, arrayList));
                }
            }
            builder.setExcludeList(arrayList2);
            String strOptString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth(), "none");
            Intrinsics.checkNotNull(strOptString);
            builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(strOptString.length() != 0 ? strOptString : "none"));
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth(@NotNull JSONObject json, @NotNull PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.setChallenge(getChallenge(json));
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            byte[] bArrB64Decode = b64Decode(string);
            String string2 = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth());
            String string3 = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            Intrinsics.checkNotNull(string3);
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            Intrinsics.checkNotNull(string2);
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new PublicKeyCredentialUserEntity(bArrB64Decode, string2, strOptString, string3));
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth(@NotNull JSONObject json, @NotNull PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth());
            String strOptString = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth(), "");
            String strOptString2 = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth(), "");
            Intrinsics.checkNotNull(strOptString2);
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            Intrinsics.checkNotNull(string);
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new PublicKeyCredentialRpEntity(string, strOptString, strOptString2));
            JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                int i12 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth());
                String strOptString3 = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth(), "");
                Intrinsics.checkNotNull(strOptString3);
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i12)) {
                    arrayList.add(new PublicKeyCredentialParameters(strOptString3, i12));
                }
            }
            builder.setParameters(arrayList);
        }

        @Nullable
        public final CreateCredentialException publicKeyCredentialResponseContainsError(@NotNull PublicKeyCredential cred) {
            Intrinsics.checkNotNullParameter(cred, "cred");
            AuthenticatorResponse response = cred.getResponse();
            Intrinsics.checkNotNullExpressionValue(response, "getResponse(...)");
            if (!(response instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
            ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
            DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth().get(errorCode);
            String errorMessage = authenticatorErrorResponse.getErrorMessage();
            if (domError != null) {
                return (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && StringsKt.contains$default((CharSequence) errorMessage, (CharSequence) "Unable to get sync account", false, 2, (Object) null)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(domError, errorMessage);
            }
            return new CreatePublicKeyCredentialDomException(new UnknownError(), "unknown fido gms exception - " + errorMessage);
        }

        @NotNull
        public final String toAssertPasskeyResponse(@NotNull SignInCredential cred) throws GetCredentialException {
            Intrinsics.checkNotNullParameter(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
            AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
            Intrinsics.checkNotNull(response);
            if (response instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
                throw m2668x4dea1c7f(errorCode, authenticatorErrorResponse.getErrorMessage());
            }
            if (!(response instanceof AuthenticatorAssertionResponse)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: " + response.getClass().getName());
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            try {
                String json = publicKeyCredential.toJson();
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                return json;
            } catch (Throwable th2) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
            }
        }

        private final byte[] getChallenge(JSONObject json) throws JSONException {
            String strOptString = json.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth(), "");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() != 0) {
                return b64Decode(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long version) throws PackageManager.NameNotFoundException {
            long versionLong;
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
                versionLong = GetGMSVersion.getVersionLong(packageInfo);
            } else {
                versionLong = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (versionLong <= version) {
                return false;
            }
            return true;
        }

        @NotNull
        public final byte[] b64Decode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            return bArrDecode;
        }

        public final boolean checkAlgSupported(int alg) {
            try {
                COSEAlgorithmIdentifier.fromCoseValue(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @JvmStatic
        @NotNull
        public final PublicKeyCredentialCreationOptions convert(@NotNull CreatePublicKeyCredentialRequest request, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            if (isDeviceGMSVersionOlderThan(context, PublicKeyCredentialControllerUtility.AUTH_MIN_VERSION_JSON_CREATE)) {
                return new PublicKeyCredentialCreationOptions(request.getRequestJson());
            }
            return convertJSON$credentials_play_services_auth(new JSONObject(request.getRequestJson()));
        }

        @NotNull
        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(@NotNull GetPublicKeyCredentialOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsBuild = new BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true).setRequestJson(option.getRequestJson()).build();
            Intrinsics.checkNotNullExpressionValue(passkeyJsonRequestOptionsBuild, "build(...)");
            return passkeyJsonRequestOptionsBuild;
        }

        @Deprecated(message = "Upgrade GMS version so 'convertToPlayAuthPasskeyJsonRequest' is used")
        @NotNull
        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(@NotNull GetPublicKeyCredentialOption option) throws JSONException {
            Intrinsics.checkNotNullParameter(option, "option");
            JSONObject jSONObject = new JSONObject(option.getRequestJson());
            String strOptString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth(), "");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() != 0) {
                BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsBuild = new BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(strOptString).setChallenge(getChallenge(jSONObject)).build();
                Intrinsics.checkNotNullExpressionValue(passkeysRequestOptionsBuild, "build(...)");
                return passkeysRequestOptionsBuild;
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        @NotNull
        public final String getJSON_KEY_ALG$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        @NotNull
        public final String getJSON_KEY_APPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        @NotNull
        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        @NotNull
        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        @NotNull
        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        @NotNull
        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        @NotNull
        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        @NotNull
        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        @NotNull
        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        @NotNull
        /* JADX INFO: renamed from: getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth */
        public final String m2669x33d67862() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        @NotNull
        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        @NotNull
        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        @NotNull
        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        @NotNull
        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        @NotNull
        public final String getJSON_KEY_ICON$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        @NotNull
        public final String getJSON_KEY_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        @NotNull
        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        @NotNull
        /* JADX INFO: renamed from: getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth */
        public final String m2670x56b069f3() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        @NotNull
        public final String getJSON_KEY_NAME$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        @NotNull
        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        @NotNull
        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        @NotNull
        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        @NotNull
        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        @NotNull
        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        @NotNull
        public final String getJSON_KEY_RK$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        @NotNull
        public final String getJSON_KEY_RP$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        @NotNull
        public final String getJSON_KEY_RPID$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        @NotNull
        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        @NotNull
        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        @NotNull
        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        @NotNull
        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        @NotNull
        public final String getJSON_KEY_TYPE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        @NotNull
        public final String getJSON_KEY_USER$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        @NotNull
        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        @NotNull
        /* JADX INFO: renamed from: getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth */
        public final String m2671x9cc8a1b3() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        @NotNull
        public final LinkedHashMap<ErrorCode, DomError> getOrderedErrorCodeToExceptions$credentials_play_services_auth() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }
    }

    /* JADX INFO: compiled from: PublicKeyCredentialControllerUtility.kt */
    @RequiresApi(28)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$GetGMSVersion;", "", "<init>", "()V", "getVersionLong", "", "info", "Landroid/content/pm/PackageInfo;", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class GetGMSVersion {

        @NotNull
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        @JvmStatic
        public static final long getVersionLong(@NotNull PackageInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            return info.getLongVersionCode();
        }

        private GetGMSVersion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final PublicKeyCredentialCreationOptions convert(@NotNull CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, @NotNull Context context) {
        return INSTANCE.convert(createPublicKeyCredentialRequest, context);
    }
}
