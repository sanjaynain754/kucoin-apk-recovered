package com.sumsub.sns.internal.fingerprint.tools.threading.safe;

import com.sumsub.sns.internal.fingerprint.tools.threading.AbstractC33262b;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.tools.threading.safe.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33266c {
    /* JADX INFO: renamed from: a */
    public static final Object m71615a(AtomicReference atomicReference, Function0 function0) {
        AbstractC33265b.f67806a.set(Boolean.TRUE);
        atomicReference.set(Thread.currentThread());
        try {
            return function0.invoke();
        } finally {
            ThreadLocal threadLocal = AbstractC33265b.f67806a;
            AbstractC33265b.f67806a.remove();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m71616a(final Function0 function0) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        StackTraceElement[] stackTrace;
        List listFilterNotNull = null;
        final AtomicReference atomicReference = new AtomicReference(null);
        Boolean bool = (Boolean) AbstractC33265b.f67806a.get();
        if (bool != null ? bool.booleanValue() : false) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("Safe", "logIllegalSafeWithTimeoutUsage", new IllegalStateException("logIllegalSafeWithTimeoutUsage"));
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(AbstractC33262b.f67803a.submit(new Callable() { // from class: com.sumsub.sns.internal.fingerprint.tools.threading.safe.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return AbstractC33266c.m71615a(atomicReference, function0);
                }
            }));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            Future future = (Future) objM103844constructorimpl;
            try {
                objM103844constructorimpl2 = Result.m103844constructorimpl(future.get(1000L, TimeUnit.MILLISECONDS));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
            if (thM103847exceptionOrNullimpl2 != null) {
                try {
                    if (thM103847exceptionOrNullimpl2 instanceof TimeoutException) {
                        TimeoutException timeoutException = (TimeoutException) thM103847exceptionOrNullimpl2;
                        Thread thread = (Thread) atomicReference.get();
                        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                            listFilterNotNull = ArraysKt.filterNotNull(stackTrace);
                        }
                        throw new C33264a(timeoutException, listFilterNotNull);
                    }
                    throw thM103847exceptionOrNullimpl2;
                } catch (Throwable th4) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
                }
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
                try {
                    Result.m103844constructorimpl(Boolean.valueOf(future.cancel(true)));
                } catch (Throwable th5) {
                    Result.Companion companion5 = Result.INSTANCE;
                    Result.m103844constructorimpl(ResultKt.createFailure(th5));
                }
            }
            return objM103844constructorimpl2;
        }
        return Result.m103844constructorimpl(ResultKt.createFailure(thM103847exceptionOrNullimpl));
    }
}
