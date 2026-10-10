package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.i1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26325i1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52704b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.CheckCoinInAccount f52705c;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.p(this.f52704b, this.f52705c, (String) obj);
    }

    public /* synthetic */ C26325i1(TransferVM transferVM, TransferStateContract$UiIntent.CheckCoinInAccount checkCoinInAccount) {
        this.f52704b = transferVM;
        this.f52705c = checkCoinInAccount;
    }
}
