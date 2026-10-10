package com.sumsub.sns.internal.p126ml.core;

import android.os.SystemClock;
import com.sumsub.sns.internal.core.common.C28435a1;
import com.sumsub.sns.internal.log.C33272c;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.InterpreterApi;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33329h implements InterfaceC33336o {

    /* JADX INFO: renamed from: a */
    public final String f67960a;

    /* JADX INFO: renamed from: c */
    public InterpreterApi f67962c;

    /* JADX INFO: renamed from: f */
    public volatile boolean f67965f;

    /* JADX INFO: renamed from: b */
    public final C28435a1 f67961b = new C28435a1();

    /* JADX INFO: renamed from: d */
    public final Lazy f67963d = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.ml.core.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC33329h.m71655d(this.f67980b);
        }
    });

    /* JADX INFO: renamed from: e */
    public final Lazy f67964e = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.ml.core.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC33329h.m71650a(this.f67981b);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final Thread m71651b(AbstractC33329h abstractC33329h, Runnable runnable) {
        return new Thread(runnable, abstractC33329h.mo71640d() + "Thread");
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m71654c(AbstractC33329h abstractC33329h) {
        if (abstractC33329h.f67962c == null) {
            InterpreterApi interpreterApiM71659e = abstractC33329h.m71659e();
            abstractC33329h.f67962c = interpreterApiM71659e;
            abstractC33329h.mo71658a(interpreterApiM71659e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final ExecutorService m71655d(final AbstractC33329h abstractC33329h) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.sumsub.sns.internal.ml.core.x
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC33329h.m71651b(this.f67985b, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public long mo71635a() {
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo71636a(Object obj, long j11);

    /* JADX INFO: renamed from: a */
    public abstract Object[] mo71637a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract AbstractC33324c mo71638b();

    /* JADX INFO: renamed from: c */
    public abstract Map mo71639c();

    /* JADX INFO: renamed from: d */
    public abstract String mo71640d();

    /* JADX INFO: renamed from: b */
    public static final boolean m71653b(final AbstractC33329h abstractC33329h) {
        C28435a1 c28435a1 = abstractC33329h.f67961b;
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.ml.core.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33329h.m71654c(this.f67982b);
            }
        };
        c28435a1.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        function0.invoke();
        c28435a1.f57949a.add(Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        c28435a1.f57950b = false;
        C33272c.f67816e.f67810a.mo68955d(abstractC33329h.f67960a, "preloadModel finished", null);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void mo71658a(InterpreterApi interpreterApi) {
    }

    /* JADX INFO: renamed from: e */
    public final InterpreterApi m71659e() {
        C33272c.f67816e.f67810a.mo68955d(this.f67960a, "initInterpreter: " + mo71638b(), null);
        ByteBuffer byteBufferMo71643a = mo71638b().mo71643a();
        InterpreterApi.Options options = new InterpreterApi.Options();
        options.setNumThreads(-1);
        options.setCancellable(true);
        return InterpreterApi.create(byteBufferMo71643a, options);
    }

    public final void finalize() throws InterruptedException {
        C41690i.m91067b(null, new C33327f(this, null), 1, null);
    }

    public AbstractC33329h(String str) {
        this.f67960a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC33335n m71644a(final AbstractC33329h abstractC33329h, final Function0 function0, InterfaceC41709m0 interfaceC41709m0) {
        Future futureSubmit = ((ExecutorService) abstractC33329h.f67963d.getValue()).submit(new Callable() { // from class: com.sumsub.sns.internal.ml.core.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC33329h.m71645a(function0, abstractC33329h);
            }
        });
        if (abstractC33329h.mo71635a() <= 0) {
            return (AbstractC33335n) futureSubmit.get();
        }
        try {
            return (AbstractC33335n) futureSubmit.get(abstractC33329h.mo71635a(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            abstractC33329h.f67965f = true;
            C33272c.f67816e.f67810a.mo68956e(abstractC33329h.f67960a, "MlSolution timeout (" + abstractC33329h.mo71640d() + ")", null);
            return new C33334m();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71652b(AbstractC33329h abstractC33329h, Object obj) {
        InterpreterApi interpreterApiM71659e = abstractC33329h.f67962c;
        if (interpreterApiM71659e == null) {
            interpreterApiM71659e = abstractC33329h.m71659e();
            abstractC33329h.f67962c = interpreterApiM71659e;
            abstractC33329h.mo71658a(interpreterApiM71659e);
        }
        interpreterApiM71659e.runForMultipleInputsOutputs(abstractC33329h.mo71637a(obj), abstractC33329h.mo71639c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC41710m1 m71650a(final AbstractC33329h abstractC33329h) {
        return C41718o1.m91179c(Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.sumsub.sns.internal.ml.core.y
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC33329h.m71649a(this.f67986b, runnable);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static final Thread m71649a(AbstractC33329h abstractC33329h, Runnable runnable) {
        return new Thread(runnable, abstractC33329h.mo71640d() + "CoroutineThread");
    }

    /* JADX INFO: renamed from: a */
    public final Object m71656a(SuspendLambda suspendLambda) {
        C33272c.f67816e.f67810a.mo68955d(this.f67960a, "preloadModel", null);
        return m71657a(new Function0() { // from class: com.sumsub.sns.internal.ml.core.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AbstractC33329h.m71653b(this.f67968b));
            }
        }, suspendLambda);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m71646a(final AbstractC33329h abstractC33329h, final Object obj) {
        C28435a1 c28435a1 = abstractC33329h.f67961b;
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.ml.core.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC33329h.m71652b(this.f67978b, obj);
            }
        };
        c28435a1.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        function0.invoke();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        c28435a1.f57949a.add(Long.valueOf(jElapsedRealtime2));
        c28435a1.f57950b = false;
        return abstractC33329h.mo71636a(obj, jElapsedRealtime2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m71648a(AbstractC33329h abstractC33329h, ContinuationImpl continuationImpl) {
        C33325d c33325d;
        if (continuationImpl instanceof C33325d) {
            c33325d = (C33325d) continuationImpl;
            int i11 = c33325d.f67956d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33325d.f67956d = i11 - Integer.MIN_VALUE;
            } else {
                c33325d = new C33325d(abstractC33329h, continuationImpl);
            }
        } else {
            c33325d = new C33325d(abstractC33329h, continuationImpl);
        }
        Object obj = c33325d.f67954b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33325d.f67956d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC41710m1 abstractC41710m1 = (AbstractC41710m1) abstractC33329h.f67964e.getValue();
            C33326e c33326e = new C33326e(abstractC33329h, null);
            c33325d.f67953a = abstractC33329h;
            c33325d.f67956d = 1;
            if (C41686h.m91049g(abstractC41710m1, c33326e, c33325d) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC33329h = c33325d.f67953a;
            ResultKt.throwOnFailure(obj);
        }
        ((ExecutorService) abstractC33329h.f67963d.getValue()).shutdown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Object m71657a(final Function0 function0, ContinuationImpl continuationImpl) {
        return C41686h.m91049g((AbstractC41710m1) this.f67964e.getValue(), new C33328g(new Function1() { // from class: com.sumsub.sns.internal.ml.core.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC33329h.m71644a(this.f67976b, function0, (InterfaceC41709m0) obj);
            }
        }), continuationImpl);
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC33335n m71645a(Function0 function0, AbstractC33329h abstractC33329h) {
        try {
            Object objInvoke = function0.invoke();
            abstractC33329h.f67965f = false;
            return new C33333l(objInvoke);
        } catch (C33330i e11) {
            abstractC33329h.f67965f = true;
            C33272c.f67816e.f67810a.mo68956e(abstractC33329h.f67960a, "Error while loading ML model", e11);
            return new C33331j(e11);
        } catch (UnsatisfiedLinkError e12) {
            abstractC33329h.f67965f = true;
            C33272c.f67816e.f67810a.mo68956e(abstractC33329h.f67960a, "Can't find Native TensorFlow library", e12);
            return new C33331j(e12);
        } catch (Throwable th2) {
            abstractC33329h.f67965f = true;
            C33272c.f67816e.f67810a.mo68956e(abstractC33329h.f67960a, "Error while executing ML model", th2);
            return new C33331j(th2);
        }
    }
}
