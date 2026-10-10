package androidx.credentials;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FederatedCredential.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/FederatedCredential;", "Landroidx/credentials/Credential;", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class FederatedCredential extends Credential {

    @NotNull
    public static final String TYPE_FEDERATED_CREDENTIAL = "type.federated_credential";

    private FederatedCredential() {
        super(TYPE_FEDERATED_CREDENTIAL, new Bundle());
    }
}
