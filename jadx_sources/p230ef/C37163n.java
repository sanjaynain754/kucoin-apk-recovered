package p230ef;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.n */
/* JADX INFO: compiled from: PublicKeyCredential.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m90084d2 = {"Lef/n;", "Lef/g;", "", "authenticationResponseJson", "<init>", "(Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37163n extends AbstractC37156g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String authenticationResponseJson;

    public C37163n(@NotNull String authenticationResponseJson) {
        Intrinsics.checkNotNullParameter(authenticationResponseJson, "authenticationResponseJson");
        this.authenticationResponseJson = authenticationResponseJson;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }
}
