package com.kubi.assets.utils;

import java.math.BigDecimal;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Calculator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class Calculator$evaluatePostfix$4 extends FunctionReferenceImpl implements Function2<BigDecimal, BigDecimal, BigDecimal> {
    public static final Calculator$evaluatePostfix$4 INSTANCE = new Calculator$evaluatePostfix$4();

    public Calculator$evaluatePostfix$4() {
        super(2, BigDecimal.class, "min", "min(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final BigDecimal invoke(BigDecimal p11, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return p11.min(bigDecimal);
    }
}
