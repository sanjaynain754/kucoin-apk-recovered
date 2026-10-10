package com.sumsub.sns.internal.fingerprint;

import java.util.Map;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33065f implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SafeContinuation f67518a;

    public C33065f(SafeContinuation safeContinuation) {
        this.f67518a = safeContinuation;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f67518a.resumeWith(Result.m103844constructorimpl((Map) obj));
        return Unit.INSTANCE;
    }
}
