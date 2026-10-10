package com.tencent.bugly.common.network.ssl;

import com.tencent.bugly.proguard.C33759kh;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/bugly/common/network/ssl/DefaultSslContextBuilder;", "Lcom/tencent/bugly/common/network/ssl/ISslContextBuilder;", "()V", "sslContext", "Ljavax/net/ssl/SSLContext;", "getSslContext", "()Ljavax/net/ssl/SSLContext;", "sslContext$delegate", "Lkotlin/Lazy;", "build", "initSslContext", "", "ssl", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class DefaultSslContextBuilder implements ISslContextBuilder {

    @NotNull
    public static final String TAG = "Bugly_common_DefaultSslContextBuilder";

    /* JADX INFO: renamed from: sslContext$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sslContext = LazyKt.lazy(new Function0<SSLContext>() { // from class: com.tencent.bugly.common.network.ssl.DefaultSslContextBuilder$sslContext$2
        {
            super(0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        @Nullable
        public final SSLContext invoke() {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
                this.this$0.initSslContext(sSLContext);
                return sSLContext;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return null;
            }
        }
    });

    @Override // com.tencent.bugly.common.network.ssl.ISslContextBuilder
    @Nullable
    public SSLContext getSslContext() {
        return (SSLContext) this.sslContext.getValue();
    }

    @Override // com.tencent.bugly.common.network.ssl.ISslContextBuilder
    @Nullable
    public SSLContext build() {
        return getSslContext();
    }

    @Override // com.tencent.bugly.common.network.ssl.ISslContextBuilder
    public void initSslContext(@NotNull SSLContext ssl) throws KeyManagementException {
        Intrinsics.checkNotNullParameter(ssl, "ssl");
        X509TrustManager x509TrustManagerM73820a = C33759kh.m73820a();
        if (x509TrustManagerM73820a != null) {
            ssl.init(null, new X509TrustManager[]{x509TrustManagerM73820a}, null);
        } else {
            ssl.init(null, null, null);
        }
    }
}
