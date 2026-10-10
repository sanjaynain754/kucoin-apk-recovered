package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.i5 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes45.dex */
public final /* synthetic */ class C7263i5 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialDynamicColors f11808a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f11808a.highestSurface((DynamicScheme) obj);
    }

    public /* synthetic */ C7263i5(MaterialDynamicColors materialDynamicColors) {
        this.f11808a = materialDynamicColors;
    }
}
