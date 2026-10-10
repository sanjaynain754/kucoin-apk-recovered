package com.sumsub.sns.internal.util;

import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33407i {

    /* JADX INFO: renamed from: a */
    public static final Lazy f68112a = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.util.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AbstractC33407i.m71692a());
        }
    });

    /* JADX INFO: renamed from: a */
    public static final boolean m71692a() {
        try {
            Class.forName("androidx.test.platform.app.InstrumentationRegistry");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
