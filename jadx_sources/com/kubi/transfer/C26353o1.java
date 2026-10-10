package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.o1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26353o1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferStateContract$UiIntent.CheckCoinInAccount f52844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f52845c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f52846d;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.b(this.f52844b, this.f52845c, this.f52846d, (UIState) obj);
    }

    public /* synthetic */ C26353o1(TransferStateContract$UiIntent.CheckCoinInAccount checkCoinInAccount, String str, String str2) {
        this.f52844b = checkCoinInAccount;
        this.f52845c = str;
        this.f52846d = str2;
    }
}
