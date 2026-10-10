package androidx.credentials.internal;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.C1958R;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ConversionUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007¨\u0006\u0011"}, m90084d2 = {"getFinalCreateCredentialData", "Landroid/os/Bundle;", "request", "Landroidx/credentials/CreateCredentialRequest;", "context", "Landroid/content/Context;", "toJetpackGetException", "Landroidx/credentials/exceptions/GetCredentialException;", "errorType", "", "errorMsg", "", "toJetpackCreateException", "Landroidx/credentials/exceptions/CreateCredentialException;", "isValidBase64Url", "", CmcdData.Factory.STREAMING_FORMAT_SS, "credentials"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ConversionUtilsKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final CreateCredentialException toJetpackCreateException(@NotNull String errorType, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -2055374133:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new CreateCredentialCancellationException(charSequence);
                }
                break;
            case -1166690414:
                if (errorType.equals(CreateCredentialUnsupportedException.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION)) {
                    return new CreateCredentialUnsupportedException(charSequence);
                }
                break;
            case -580283253:
                if (errorType.equals(CreateCredentialProviderConfigurationException.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION)) {
                    return new CreateCredentialProviderConfigurationException(charSequence);
                }
                break;
            case 1316905704:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new CreateCredentialUnknownException(charSequence);
                }
                break;
            case 2092588512:
                if (errorType.equals(CreateCredentialInterruptedException.TYPE_CREATE_CREDENTIAL_INTERRUPTED_EXCEPTION)) {
                    return new CreateCredentialInterruptedException(charSequence);
                }
                break;
            case 2131915191:
                if (errorType.equals(CreateCredentialNoCreateOptionException.TYPE_CREATE_CREDENTIAL_NO_CREATE_OPTION)) {
                    return new CreateCredentialNoCreateOptionException(charSequence);
                }
                break;
        }
        if (StringsKt.startsWith$default(errorType, CreatePublicKeyCredentialDomException.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false, 2, (Object) null)) {
            return CreatePublicKeyCredentialException.INSTANCE.createFrom(errorType, charSequence != null ? charSequence.toString() : null);
        }
        return new CreateCredentialCustomException(errorType, charSequence);
    }

    public static /* synthetic */ CreateCredentialException toJetpackCreateException$default(String str, CharSequence charSequence, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charSequence = null;
        }
        return toJetpackCreateException(str, charSequence);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final GetCredentialException toJetpackGetException(@NotNull String errorType, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -781118336:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (errorType.equals(GetCredentialUnsupportedException.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION)) {
                    return new GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (errorType.equals(GetCredentialInterruptedException.TYPE_GET_CREDENTIAL_INTERRUPTED_EXCEPTION)) {
                    return new GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (errorType.equals(GetCredentialProviderConfigurationException.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION)) {
                    return new GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (StringsKt.startsWith$default(errorType, GetPublicKeyCredentialDomException.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false, 2, (Object) null)) {
            return GetPublicKeyCredentialException.INSTANCE.createFrom(errorType, charSequence != null ? charSequence.toString() : null);
        }
        return new GetCredentialCustomException(errorType, charSequence);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Bundle getFinalCreateCredentialData(@NotNull CreateCredentialRequest request, @NotNull Context context) {
        int i11;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle credentialData = request.getCredentialData();
        Bundle bundle = request.getDisplayInfo().toBundle();
        if (request instanceof CreatePasswordRequest) {
            i11 = C1958R.drawable.adx_ic_password;
        } else if (request instanceof CreatePublicKeyCredentialRequest) {
            i11 = C1958R.drawable.adx_ic_passkey;
        } else {
            i11 = C1958R.drawable.adx_ic_other_sign_in;
        }
        bundle.putParcelable(CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_CREDENTIAL_TYPE_ICON, Icon.createWithResource(context, i11));
        credentialData.putBundle(CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_REQUEST_DISPLAY_INFO, bundle);
        return credentialData;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean isValidBase64Url(@NotNull String s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        try {
            Base64.decode(s11, 11);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
