package x00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.hybird.OfflineUrlInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x00.a */
/* JADX INFO: compiled from: WebBizInfo.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014¨\u0006!"}, m90084d2 = {"Lx00/a;", "", "", "matchPath", Constants.BIZ, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "offlineSource", "", "indexEnable", "httpProxyEnable", "noWifiEnable", "indexHtmlName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "Lcom/kubi/sdk/pkg/hybird/a;", "d", "()Lcom/kubi/sdk/pkg/hybird/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getBiz", "c", "getOfflineSource", "e", "Z", "()Z", "f", "getHttpProxyEnable", "g", "getNoWifiEnable", CmcdData.Factory.STREAMING_FORMAT_HLS, "getIndexHtmlName", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45976a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String matchPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String biz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String packageName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String offlineSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean indexEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean httpProxyEnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean noWifiEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final String indexHtmlName;

    public C45976a(@NotNull String matchPath, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11, boolean z12, boolean z13, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(matchPath, "matchPath");
        this.matchPath = matchPath;
        this.biz = str;
        this.packageName = str2;
        this.offlineSource = str3;
        this.indexEnable = z11;
        this.httpProxyEnable = z12;
        this.noWifiEnable = z13;
        this.indexHtmlName = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIndexEnable() {
        return this.indexEnable;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMatchPath() {
        return this.matchPath;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final OfflineUrlInfo m101414d() {
        String str;
        String str2 = this.packageName;
        if (str2 == null || (str = this.offlineSource) == null) {
            return null;
        }
        return new OfflineUrlInfo(str2, str, this.noWifiEnable, this.biz);
    }

    public /* synthetic */ C45976a(String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? false : z13, (i11 & 128) != 0 ? null : str5);
    }
}
