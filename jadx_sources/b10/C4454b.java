package b10;

import android.webkit.WebResourceResponse;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.proxy.ProxyType;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b10.b */
/* JADX INFO: compiled from: IWebProxy.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lb10/b;", "Landroid/webkit/WebResourceResponse;", "Lcom/kubi/sdk/web/proxy/ProxyType;", "proxyType", "", "mimeType", "encoding", "Ljava/io/InputStream;", "data", "<init>", "(Lcom/kubi/sdk/web/proxy/ProxyType;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/web/proxy/ProxyType;", "()Lcom/kubi/sdk/web/proxy/ProxyType;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C4454b extends WebResourceResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ProxyType proxyType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4454b(@NotNull ProxyType proxyType, @NotNull String mimeType, @Nullable String str, @Nullable InputStream inputStream) {
        super(mimeType, str, inputStream);
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.proxyType = proxyType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ProxyType getProxyType() {
        return this.proxyType;
    }
}
