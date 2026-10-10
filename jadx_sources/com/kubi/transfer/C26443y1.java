package com.kubi.transfer;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.y1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26443y1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Boolean f52993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f52994c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TransferVM f52995d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f52996e;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.W(this.f52993b, this.f52994c, this.f52995d, this.f52996e, (UIState) obj);
    }

    public /* synthetic */ C26443y1(Boolean bool, String str, TransferVM transferVM, int i11) {
        this.f52993b = bool;
        this.f52994c = str;
        this.f52995d = transferVM;
        this.f52996e = i11;
    }
}
