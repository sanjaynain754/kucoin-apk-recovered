package com.kubi.advert;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;

/* JADX INFO: renamed from: com.kubi.advert.p */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9364p implements DeepLinkListener {
    @Override // com.appsflyer.deeplink.DeepLinkListener
    public final void onDeepLinking(DeepLinkResult deepLinkResult) {
        AppsFlyerUtil.a(deepLinkResult);
    }
}
