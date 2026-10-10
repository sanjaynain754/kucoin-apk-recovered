package com.kubi.transfer;

import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.transfer.g1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26314g1 implements Function0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.FetchCoinList f52682c;

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return TransferVM.I(this.f52681b, this.f52682c);
    }

    public /* synthetic */ C26314g1(TransferVM transferVM, TransferStateContract$UiIntent.FetchCoinList fetchCoinList) {
        this.f52681b = transferVM;
        this.f52682c = fetchCoinList;
    }
}
