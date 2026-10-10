package com.kubi.qrcode.lib;

import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.qrcode.lib.h */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C21550h implements Function0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogFragmentHelper f40924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BaseFragment f40925c;

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return QrCodeProcessor.qrScanAlertWithDraw.1.i(this.f40924b, this.f40925c);
    }

    public /* synthetic */ C21550h(DialogFragmentHelper dialogFragmentHelper, BaseFragment baseFragment) {
        this.f40924b = dialogFragmentHelper;
        this.f40925c = baseFragment;
    }
}
