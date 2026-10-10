package p230ef;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.j */
/* JADX INFO: compiled from: GetCredentialResponse.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m90084d2 = {"Lef/j;", "", "Lef/g;", URLCredentialContract.FeedEntry.TABLE_NAME, "<init>", "(Lef/g;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lef/g;", "()Lef/g;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37159j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC37156g credential;

    public C37159j(@NotNull AbstractC37156g credential) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        this.credential = credential;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC37156g getCredential() {
        return this.credential;
    }
}
