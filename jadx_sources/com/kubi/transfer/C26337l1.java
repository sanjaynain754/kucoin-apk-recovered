package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.l1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26337l1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f52725c;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.Q(this.f52724b, this.f52725c, (UIState) obj);
    }

    public /* synthetic */ C26337l1(TransferVM transferVM, String str) {
        this.f52724b = transferVM;
        this.f52725c = str;
    }
}
