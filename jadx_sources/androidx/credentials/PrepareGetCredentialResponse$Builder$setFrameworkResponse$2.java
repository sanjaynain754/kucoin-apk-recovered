package androidx.credentials;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: PrepareGetCredentialResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$2 extends FunctionReferenceImpl implements Function0<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p852kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((PrepareGetCredentialResponse.Builder) this.receiver).hasAuthenticationResults());
    }

    public PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(Object obj) {
        super(0, obj, PrepareGetCredentialResponse.Builder.class, "hasAuthenticationResults", "hasAuthenticationResults()Z", 0);
    }
}
