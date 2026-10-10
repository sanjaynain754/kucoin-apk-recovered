package com.kubi.qrcode.lib;

import com.kubi.sdk.BaseFragment;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.qrcode.lib.d */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C21546d implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f40918c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BaseFragment f40919d;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return QrCodeProcessor.c(this.f40917b, this.f40918c, this.f40919d, ((Boolean) obj).booleanValue());
    }

    public /* synthetic */ C21546d(String str, boolean z11, BaseFragment baseFragment) {
        this.f40917b = str;
        this.f40918c = z11;
        this.f40919d = baseFragment;
    }
}
