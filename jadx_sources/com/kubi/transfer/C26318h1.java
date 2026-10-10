package com.kubi.transfer;

import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.transfer.h1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26318h1 implements Function2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52687b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.CheckCoinInAccount f52688c;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return TransferVM.d(this.f52687b, this.f52688c, (String) obj, (String) obj2);
    }

    public /* synthetic */ C26318h1(TransferVM transferVM, TransferStateContract$UiIntent.CheckCoinInAccount checkCoinInAccount) {
        this.f52687b = transferVM;
        this.f52688c = checkCoinInAccount;
    }
}
