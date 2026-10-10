package com.kubi.core.spot.business.holder;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import ro.C44128b;

/* JADX INFO: compiled from: LimitOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class LimitOrderHolder$initPriceObs$9 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    public static final LimitOrderHolder$initPriceObs$9 INSTANCE = new LimitOrderHolder$initPriceObs$9();

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    public LimitOrderHolder$initPriceObs$9() {
        super(1, C44128b.class, "loge", "loge(Ljava/lang/Throwable;)V", 1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        C44128b.m97264h(th2);
    }
}
