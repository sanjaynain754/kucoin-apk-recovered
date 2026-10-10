package com.kubi.transfer;

import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.transfer.j1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26329j1 implements Function0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.CheckCoinInAccount f52710c;

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return TransferVM.G(this.f52709b, this.f52710c);
    }

    public /* synthetic */ C26329j1(TransferVM transferVM, TransferStateContract$UiIntent.CheckCoinInAccount checkCoinInAccount) {
        this.f52709b = transferVM;
        this.f52710c = checkCoinInAccount;
    }
}
