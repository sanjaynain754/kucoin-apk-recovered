package com.kubi.transfer;

import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.transfer.b1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26270b1 implements Function2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.UpdateSymbolInfo f52621c;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return TransferVM.V(this.f52620b, this.f52621c, (String) obj, (String) obj2);
    }

    public /* synthetic */ C26270b1(TransferVM transferVM, TransferStateContract$UiIntent.UpdateSymbolInfo updateSymbolInfo) {
        this.f52620b = transferVM;
        this.f52621c = updateSymbolInfo;
    }
}
