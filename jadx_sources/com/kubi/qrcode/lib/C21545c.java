package com.kubi.qrcode.lib;

import android.net.Uri;
import com.kubi.sdk.BaseFragment;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.qrcode.lib.c */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C21545c implements Function0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uri f40915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BaseFragment f40916c;

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return QrCodeProcessor.d(this.f40915b, this.f40916c);
    }

    public /* synthetic */ C21545c(Uri uri, BaseFragment baseFragment) {
        this.f40915b = uri;
        this.f40916c = baseFragment;
    }
}
