package p230ef;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ef.a */
/* JADX INFO: compiled from: CreateCredentialRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lef/a;", "", "", "origin", "", "isAutoSelectAllowed", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;ZZ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Z", "c", "()Z", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AbstractC37150a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String origin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isAutoSelectAllowed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean preferImmediatelyAvailableCredentials;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public AbstractC37150a(@Nullable String str, boolean z11, boolean z12) {
        this.origin = str;
        this.isAutoSelectAllowed = z11;
        this.preferImmediatelyAvailableCredentials = z12;
    }
}
