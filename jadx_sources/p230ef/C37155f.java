package p230ef;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.f */
/* JADX INFO: compiled from: CreatePublicKeyCredentialResponse.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m90084d2 = {"Lef/f;", "Lef/b;", "", "registrationResponseJson", "<init>", "(Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37155f extends AbstractC37151b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String registrationResponseJson;

    public C37155f(@NotNull String registrationResponseJson) {
        Intrinsics.checkNotNullParameter(registrationResponseJson, "registrationResponseJson");
        this.registrationResponseJson = registrationResponseJson;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRegistrationResponseJson() {
        return this.registrationResponseJson;
    }
}
