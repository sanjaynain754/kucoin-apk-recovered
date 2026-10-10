package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.m1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26341m1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.UpdateSymbolInfo f52806c;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.x(this.f52805b, this.f52806c, (String) obj);
    }

    public /* synthetic */ C26341m1(TransferVM transferVM, TransferStateContract$UiIntent.UpdateSymbolInfo updateSymbolInfo) {
        this.f52805b = transferVM;
        this.f52806c = updateSymbolInfo;
    }
}
