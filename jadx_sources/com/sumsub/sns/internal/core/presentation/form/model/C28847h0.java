package com.sumsub.sns.internal.core.presentation.form.model;

import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28847h0 {

    /* JADX INFO: renamed from: a */
    public final Map f58676a = MapsKt.mapOf(TuplesKt.m90091to("&&", new Function2() { // from class: com.sumsub.sns.internal.core.presentation.form.model.j0
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C28847h0.m69658a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
        }
    }), TuplesKt.m90091to("||", new Function2() { // from class: com.sumsub.sns.internal.core.presentation.form.model.k0
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C28847h0.m69659b(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
        }
    }));

    /* JADX INFO: renamed from: a */
    public static final boolean m69658a(boolean z11, boolean z12) {
        return z11 && z12;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m69659b(boolean z11, boolean z12) {
        return z12 || z11;
    }
}
