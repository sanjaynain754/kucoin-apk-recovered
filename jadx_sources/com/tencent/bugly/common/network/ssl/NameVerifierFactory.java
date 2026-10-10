package com.tencent.bugly.common.network.ssl;

import javax.net.ssl.HostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmField;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/bugly/common/network/ssl/NameVerifierFactory;", "", "()V", "DEFAULT_NAME_VERIFIER", "Ljavax/net/ssl/HostnameVerifier;", "value", "nameVerifier", "getNameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "setNameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class NameVerifierFactory {

    @JvmField
    @NotNull
    public static final HostnameVerifier DEFAULT_NAME_VERIFIER;

    @NotNull
    public static final NameVerifierFactory INSTANCE = new NameVerifierFactory();

    @Nullable
    private static HostnameVerifier nameVerifier;

    static {
        DefaultNameVerifier defaultNameVerifier = new DefaultNameVerifier();
        DEFAULT_NAME_VERIFIER = defaultNameVerifier;
        nameVerifier = defaultNameVerifier;
    }

    @Nullable
    public final HostnameVerifier getNameVerifier() {
        HostnameVerifier hostnameVerifier = nameVerifier;
        return hostnameVerifier == null ? DEFAULT_NAME_VERIFIER : hostnameVerifier;
    }

    public final void setNameVerifier(@Nullable HostnameVerifier hostnameVerifier) {
        synchronized (SslFactory.class) {
            nameVerifier = hostnameVerifier;
            Unit unit = Unit.INSTANCE;
        }
    }

    private NameVerifierFactory() {
    }
}
