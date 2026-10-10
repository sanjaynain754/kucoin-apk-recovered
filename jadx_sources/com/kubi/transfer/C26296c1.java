package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.c1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26296c1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferStateContract$UiIntent.MultiAccountDialogCloseEvent f52657b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferVM f52658c;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.u(this.f52657b, this.f52658c, (UIState) obj);
    }

    public /* synthetic */ C26296c1(TransferStateContract$UiIntent.MultiAccountDialogCloseEvent multiAccountDialogCloseEvent, TransferVM transferVM) {
        this.f52657b = multiAccountDialogCloseEvent;
        this.f52658c = transferVM;
    }
}
