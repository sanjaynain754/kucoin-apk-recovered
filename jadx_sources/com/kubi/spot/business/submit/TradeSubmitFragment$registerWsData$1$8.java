package com.kubi.spot.business.submit;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeSubmitFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class TradeSubmitFragment$registerWsData$1$8 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    public static final TradeSubmitFragment$registerWsData$1$8 INSTANCE = new TradeSubmitFragment$registerWsData$1$8();

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    public TradeSubmitFragment$registerWsData$1$8() {
        super(1, Throwable.class, "printStackTrace", "printStackTrace()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        p11.printStackTrace();
    }
}
