package com.google.android.gms.identitycredentials;

import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\nB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/ClearCredentialStateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ClearCredentialStateException extends Exception {

    @NotNull
    public static final String ERROR_TYPE_CUSTOM = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_CUSTOM_EXCEPTION";

    @NotNull
    public static final String ERROR_TYPE_INTERRUPTED = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION";

    @NotNull
    public static final String ERROR_TYPE_PROVIDER_CONFIGURATION = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION";

    @NotNull
    public static final String ERROR_TYPE_UNKNOWN = "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN";

    @NotNull
    public static final String ERROR_TYPE_UNSUPPORTED = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION";

    @NotNull
    private final String type;

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearCredentialStateException(@NonNull String type, @Nullable String str) {
        super(str);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }
}
