package com.kubi.transfer;

import com.kubi.data.coin.AccountType;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.f1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26310f1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransferStateContract$UiIntent.FetchBalanceList f52677c;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.P(this.f52676b, this.f52677c, (AccountType) obj);
    }

    public /* synthetic */ C26310f1(TransferVM transferVM, TransferStateContract$UiIntent.FetchBalanceList fetchBalanceList) {
        this.f52676b = transferVM;
        this.f52677c = fetchBalanceList;
    }
}
