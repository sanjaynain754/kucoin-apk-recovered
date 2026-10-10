package com.jumio.core.network;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import com.jumio.commons.log.Log;
import com.jumio.core.network.AWSTrustManager;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jumio.core.AbstractC40585Q3;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0002¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001aH\u0002J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0016¢\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006%"}, m90084d2 = {"Lcom/jumio/core/network/AWSTrustManager;", "Lcom/jumio/core/network/TrustManagerInterface;", "<init>", "()V", "defaultTrustManager", "Ljavax/net/ssl/X509TrustManager;", "hostname", "", "getHostname", "()Ljava/lang/String;", "setHostname", "(Ljava/lang/String;)V", "keyPinning", "Lkotlin/Function0;", "", "getKeyPinning", "()Lkotlin/jvm/functions/Function0;", "setKeyPinning", "(Lkotlin/jvm/functions/Function0;)V", "awsRootPins", "", "", "[[B", "checkServerTrusted", "", "chain", "Ljava/security/cert/X509Certificate;", "authType", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkClientTrusted", "checkCertificateChain", "x509Certificates", "([Ljava/security/cert/X509Certificate;)V", "checkCertificate", "x509Certificate", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CustomX509TrustManager"})
@SourceDebugExtension({"SMAP\nAWSTrustManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AWSTrustManager.kt\ncom/jumio/core/network/AWSTrustManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,92:1\n12567#2,2:93\n488#3,11:95\n*S KotlinDebug\n*F\n+ 1 AWSTrustManager.kt\ncom/jumio/core/network/AWSTrustManager\n*L\n63#1:93,2\n66#1:95,11\n*E\n"})
public final class AWSTrustManager implements TrustManagerInterface {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f14403a;

    /* JADX INFO: renamed from: b */
    public String f14404b = "";

    /* JADX INFO: renamed from: c */
    public Function0 f14405c = new Function0() { // from class: t9.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AWSTrustManager.m14571a());
        }
    };

    /* JADX INFO: renamed from: d */
    public final byte[][] f14406d = {AbstractC40585Q3.m89228a("fbe3018031f9586bcbf41727e417b7d1c45c2f47f93be372a17b96b50757d5a2"), AbstractC40585Q3.m89228a("7f4296fc5b6a4e3b35d3c369623e364ab1af381d8fa7121533c9d6c633ea2461"), AbstractC40585Q3.m89228a("36abc32656acfc645c61b71613c4bf21c787f5cabbee48348d58597803d7abc9"), AbstractC40585Q3.m89228a("f7ecded5c66047d28ed6466b543c40e0743abe81d109254dcf845d4c2c7853c5"), AbstractC40585Q3.m89228a("2b071c59a0a0ae76b0eadb2bad23bad4580b69c3601b630c2eaf0613afa83f92")};

    /* JADX INFO: renamed from: a */
    public static final boolean m14571a() {
        return true;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        this.f14403a.checkClientTrusted(chain, authType);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        if (chain.length < 2) {
            throw new CertificateException("SSL Certificate Chain is not sufficient");
        }
        new X509TrustManagerExtensions(this.f14403a).checkServerTrusted(chain, authType, getF14404b());
        if (getKeyPinning().invoke().booleanValue()) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(chain[chain.length - 1].getPublicKey().getEncoded());
            for (byte[] bArr : this.f14406d) {
                if (MessageDigest.isEqual(bArrDigest, bArr)) {
                    X509Certificate x509Certificate = chain[0];
                    try {
                        try {
                            x509Certificate.checkValidity();
                        } catch (CertificateNotYetValidException e11) {
                            Log.m14485w("JumioTrustManager", "SSL Certificate is not yet valid", e11);
                        }
                        String name = x509Certificate.getSubjectDN().getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        StringBuilder sb2 = new StringBuilder();
                        for (int i11 = 0; i11 < name.length(); i11++) {
                            char cCharAt = name.charAt(i11);
                            if (!CharsKt.isWhitespace(cCharAt)) {
                                sb2.append(cCharAt);
                            }
                        }
                        if (!StringsKt.contains((CharSequence) sb2.toString(), (CharSequence) ("CN=" + getF14404b()), true)) {
                            throw new CertificateException("Certificate pinning failed");
                        }
                        return;
                    } catch (Exception e12) {
                        throw new CertificateException("SSL Certificate match error", e12);
                    }
                }
            }
            throw new CertificateException("Certificate pinning failed");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f14403a.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    @Override // com.jumio.core.network.TrustManagerInterface
    @NotNull
    /* JADX INFO: renamed from: getHostname, reason: from getter */
    public String getF14404b() {
        return this.f14404b;
    }

    @Override // com.jumio.core.network.TrustManagerInterface
    @NotNull
    public Function0<Boolean> getKeyPinning() {
        return this.f14405c;
    }

    @Override // com.jumio.core.network.TrustManagerInterface
    public void setHostname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f14404b = str;
    }

    @Override // com.jumio.core.network.TrustManagerInterface
    public void setKeyPinning(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f14405c = function0;
    }

    public AWSTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager trustManager = trustManagerFactory.getTrustManagers()[0];
        Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        this.f14403a = (X509TrustManager) trustManager;
    }
}
