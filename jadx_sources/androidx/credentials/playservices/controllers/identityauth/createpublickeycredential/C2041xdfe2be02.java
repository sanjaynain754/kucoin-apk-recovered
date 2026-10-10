package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 */
/* JADX INFO: compiled from: CredentialProviderCreatePublicKeyCredentialController.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* synthetic */ class C2041xdfe2be02 extends FunctionReferenceImpl implements Function2<String, String, CreateCredentialException> {
    @Override // p852kotlin.jvm.functions.Function2
    public final CreateCredentialException invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m2665x9c497ce7(str, str2);
    }

    public C2041xdfe2be02(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }
}
