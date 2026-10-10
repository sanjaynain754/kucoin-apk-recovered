package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.a */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6447a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BigDecimal m11724a(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}
