package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.d1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26300d1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferStateContract$UiIntent.MultiAccountDialogCloseEvent f52664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferVM f52665c;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.S(this.f52664b, this.f52665c, (UIState) obj);
    }

    public /* synthetic */ C26300d1(TransferStateContract$UiIntent.MultiAccountDialogCloseEvent multiAccountDialogCloseEvent, TransferVM transferVM) {
        this.f52664b = multiAccountDialogCloseEvent;
        this.f52665c = transferVM;
    }
}
