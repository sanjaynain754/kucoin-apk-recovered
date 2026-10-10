package com.kubi.transfer;

import com.kubi.transfer.entity.RespMultiAccountBalance;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.n1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26349n1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f52838c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RespMultiAccountBalance f52839d;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.M(this.f52837b, this.f52838c, this.f52839d, (UIState) obj);
    }

    public /* synthetic */ C26349n1(TransferVM transferVM, String str, RespMultiAccountBalance respMultiAccountBalance) {
        this.f52837b = transferVM;
        this.f52838c = str;
        this.f52839d = respMultiAccountBalance;
    }
}
