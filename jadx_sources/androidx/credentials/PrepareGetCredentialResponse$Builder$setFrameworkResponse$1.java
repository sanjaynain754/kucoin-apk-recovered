package androidx.credentials;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrepareGetCredentialResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$1 extends FunctionReferenceImpl implements Function1<String, Boolean> {
    @Override // p852kotlin.jvm.functions.Function1
    public final Boolean invoke(String p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return Boolean.valueOf(((PrepareGetCredentialResponse.Builder) this.receiver).hasCredentialType(p11));
    }

    public PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(Object obj) {
        super(1, obj, PrepareGetCredentialResponse.Builder.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
    }
}
