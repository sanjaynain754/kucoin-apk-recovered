package com.kubi.transfer;

import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.transfer.x1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26440x1 implements Function0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.UpdateSymbolInfo f52986c;

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return TransferVM.a0(this.f52985b, this.f52986c);
    }

    public /* synthetic */ C26440x1(TransferVM transferVM, TransferStateContract$UiIntent.UpdateSymbolInfo updateSymbolInfo) {
        this.f52985b = transferVM;
        this.f52986c = updateSymbolInfo;
    }
}
