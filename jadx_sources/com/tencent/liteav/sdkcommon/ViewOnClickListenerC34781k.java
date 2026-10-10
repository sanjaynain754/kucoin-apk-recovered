package com.tencent.liteav.sdkcommon;

import android.view.View;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.k */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class ViewOnClickListenerC34781k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final C34777g f73665a;

    /* JADX INFO: renamed from: a */
    public static View.OnClickListener m76181a(C34777g c34777g) {
        return new ViewOnClickListenerC34781k(c34777g);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f73665a.m76175a(false);
    }

    private ViewOnClickListenerC34781k(C34777g c34777g) {
        this.f73665a = c34777g;
    }
}
