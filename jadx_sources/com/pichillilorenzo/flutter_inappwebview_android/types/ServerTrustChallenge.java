package com.pichillilorenzo.flutter_inappwebview_android.types;

/* JADX INFO: loaded from: classes59.dex */
public class ServerTrustChallenge extends URLAuthenticationChallenge {
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
    public String toString() {
        return "ServerTrustChallenge{} " + super.toString();
    }

    public ServerTrustChallenge(URLProtectionSpace uRLProtectionSpace) {
        super(uRLProtectionSpace);
    }
}
