package com.sumsub.sns.internal.fingerprint;

import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33062c {

    /* JADX INFO: renamed from: a */
    public final Function0 f67515a;

    /* JADX INFO: renamed from: b */
    public final Lazy f67516b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C33062c.m71438a(this.f67747b);
        }
    });

    /* JADX INFO: renamed from: a */
    public static final Result m71438a(C33062c c33062c) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((C33064e) c33062c.f67515a.invoke());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m103843boximpl(objM103844constructorimpl);
    }

    public C33062c(Function0 function0) {
        this.f67515a = function0;
    }
}
