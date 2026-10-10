package com.google.common.collect;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.common.collect.r0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes56.dex */
public final /* synthetic */ class C8307r0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((CollectCollectors.EnumMapAccumulator) obj).toImmutableMap();
    }
}
