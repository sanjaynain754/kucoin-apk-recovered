package androidx.credentials.exceptions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CreateCredentialUnknownException.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Landroidx/credentials/exceptions/CreateCredentialUnknownException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "errorMessage", "", "<init>", "(Ljava/lang/CharSequence;)V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CreateCredentialUnknownException extends CreateCredentialException {

    @NotNull
    public static final String TYPE_CREATE_CREDENTIAL_UNKNOWN_EXCEPTION = "android.credentials.CreateCredentialException.TYPE_UNKNOWN";

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CreateCredentialUnknownException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreateCredentialUnknownException(CharSequence charSequence, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : charSequence);
    }

    @JvmOverloads
    public CreateCredentialUnknownException(@Nullable CharSequence charSequence) {
        super("android.credentials.CreateCredentialException.TYPE_UNKNOWN", charSequence);
    }
}
