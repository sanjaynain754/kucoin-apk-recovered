package x00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x00.d */
/* JADX INFO: compiled from: WebSsgInfo.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, m90084d2 = {"Lx00/d;", "", "", "matchPath", Constants.BIZ, "", "preFetch", "supportTheme", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getBiz", "c", "Z", "()Z", "d", "getSupportTheme", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45979d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String matchPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String biz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean preFetch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean supportTheme;

    public C45979d(@NotNull String matchPath, @Nullable String str, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(matchPath, "matchPath");
        this.matchPath = matchPath;
        this.biz = str;
        this.preFetch = z11;
        this.supportTheme = z12;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMatchPath() {
        return this.matchPath;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPreFetch() {
        return this.preFetch;
    }
}
