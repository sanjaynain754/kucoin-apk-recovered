package androidx.credentials.exceptions.domerrors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: OperationError.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/exceptions/domerrors/OperationError;", "Landroidx/credentials/exceptions/domerrors/DomError;", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class OperationError extends DomError {

    @NotNull
    public static final String TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPERATION_ERROR = "androidx.credentials.TYPE_OPERATION_ERROR";

    public OperationError() {
        super(TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPERATION_ERROR);
    }
}
