package com.sumsub.sns.internal.fingerprint.tools.threading;

import com.sumsub.sns.internal.fingerprint.C33061b;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.tools.threading.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33261a {
    /* JADX INFO: renamed from: a */
    public static final void m71613a(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: a */
    public static final Object m71612a(final C33061b c33061b) {
        try {
            Result.Companion companion = Result.INSTANCE;
            AbstractC33262b.f67803a.submit(new Runnable() { // from class: com.sumsub.sns.internal.fingerprint.tools.threading.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC33261a.m71613a(c33061b);
                }
            });
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
