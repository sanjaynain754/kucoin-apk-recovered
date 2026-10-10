package com.google.common.collect;

import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: com.google.common.collect.q0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes56.dex */
public final /* synthetic */ class C8303q0 implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((CollectCollectors.EnumMapAccumulator) obj).combine((CollectCollectors.EnumMapAccumulator) obj2);
    }
}
