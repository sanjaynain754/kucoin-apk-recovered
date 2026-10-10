package com.kubi.quotefacade.alpha.list;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AlphaListVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class AlphaListVM$networkRecovery$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // p852kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    public AlphaListVM$networkRecovery$1(Object obj) {
        super(0, obj, AlphaListVM.class, "requestNetworkRecoveryRefresh", "requestNetworkRecoveryRefresh()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AlphaListVM) this.receiver).m50659q();
    }
}
