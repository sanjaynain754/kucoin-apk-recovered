package com.kubi.qrcode.lib;

import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import io.chad.library.adapter.base.BaseViewHolder;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.qrcode.lib.g */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C21549g implements Function2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BaseFragment f40923c;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return QrCodeProcessor.qrScanAlertWithDraw.1.f(this.f40922b, this.f40923c, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
    }

    public /* synthetic */ C21549g(String str, BaseFragment baseFragment) {
        this.f40922b = str;
        this.f40923c = baseFragment;
    }
}
