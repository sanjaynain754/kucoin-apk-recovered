package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.a2 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26267a2 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f52535c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f52536d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f52537e;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.X(this.f52534b, this.f52535c, this.f52536d, this.f52537e, (UIState) obj);
    }

    public /* synthetic */ C26267a2(TransferVM transferVM, String str, String str2, String str3) {
        this.f52534b = transferVM;
        this.f52535c = str;
        this.f52536d = str2;
        this.f52537e = str3;
    }
}
