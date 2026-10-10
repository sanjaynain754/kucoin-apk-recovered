package com.kubi.transfer;

import com.kubi.data.coin.AccountType;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.transfer.k1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C26333k1 implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransferVM f52718b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AccountType f52719c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TransferStateContract$UiIntent.FetchBalanceList f52720d;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TransferVM.U(this.f52718b, this.f52719c, this.f52720d, (UIState) obj);
    }

    public /* synthetic */ C26333k1(TransferVM transferVM, AccountType accountType, TransferStateContract$UiIntent.FetchBalanceList fetchBalanceList) {
        this.f52718b = transferVM;
        this.f52719c = accountType;
        this.f52720d = fetchBalanceList;
    }
}
