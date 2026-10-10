package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: E2eeUnavailableException.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Landroidx/credentials/exceptions/restorecredential/E2eeUnavailableException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "errorMessage", "", "<init>", "(Ljava/lang/CharSequence;)V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class E2eeUnavailableException extends CreateCredentialException {

    @NotNull
    public static final String TYPE_E2EE_UNAVAILABLE_EXCEPTION = "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2eeUnavailableException(@NotNull CharSequence errorMessage) {
        super(TYPE_E2EE_UNAVAILABLE_EXCEPTION, errorMessage);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
