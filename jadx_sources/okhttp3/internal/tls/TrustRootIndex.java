package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: TrustRootIndex.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m90084d2 = {"Lokhttp3/internal/tls/TrustRootIndex;", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "okhttp"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface TrustRootIndex {
    @Nullable
    X509Certificate findByIssuerAndSignature(@NotNull X509Certificate cert);
}
