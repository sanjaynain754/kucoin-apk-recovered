package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.z1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26446z1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Boolean f53002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f53003c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TransferVM f53004d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f53005e;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.w(this.f53002b, this.f53003c, this.f53004d, this.f53005e, (UIState) obj);
    }

    public /* synthetic */ C26446z1(Boolean bool, String str, TransferVM transferVM, int i11) {
        this.f53002b = bool;
        this.f53003c = str;
        this.f53004d = transferVM;
        this.f53005e = i11;
    }
}
