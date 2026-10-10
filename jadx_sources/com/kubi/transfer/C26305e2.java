package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.e2 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26305e2 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.FetchCoinList f52673c;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.N(this.f52672b, this.f52673c, (UIState) obj);
    }

    public /* synthetic */ C26305e2(TransferVM transferVM, TransferStateContract$UiIntent.FetchCoinList fetchCoinList) {
        this.f52672b = transferVM;
        this.f52673c = fetchCoinList;
    }
}
