package com.kubi.utils.netdiagno;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import ro.C44127a;

/* JADX INFO: loaded from: classes54.dex */
public abstract class LDNetAsyncTaskEx<Params, Progress, Result> {

    /* JADX INFO: renamed from: d */
    public static final HandlerC27069e f54351d = new HandlerC27069e(null);

    /* JADX INFO: renamed from: a */
    public volatile Status f54352a = Status.PENDING;

    /* JADX INFO: renamed from: b */
    public final AbstractCallableC27070f<Params, Result> f54353b;

    /* JADX INFO: renamed from: c */
    public final FutureTask<Result> f54354c;

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetAsyncTaskEx$a */
    public class C27065a extends AbstractCallableC27070f<Params, Result> {
        public C27065a() {
            super(null);
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            return (Result) LDNetAsyncTaskEx.this.mo66776h(this.f54361b);
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetAsyncTaskEx$b */
    public class C27066b extends FutureTask<Result> {
        public C27066b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            Result result = null;
            try {
                result = get();
            } catch (InterruptedException e11) {
                C44127a.m97247g(getClass().getSimpleName(), e11);
            } catch (CancellationException unused) {
                LDNetAsyncTaskEx.f54351d.obtainMessage(3, new C27068d(LDNetAsyncTaskEx.this, null)).sendToTarget();
                return;
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occured while executing doInBackground()", e12.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occured while executing doInBackground()", th2);
            }
            LDNetAsyncTaskEx.f54351d.obtainMessage(1, new C27068d(LDNetAsyncTaskEx.this, result)).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetAsyncTaskEx$e */
    public static class HandlerC27069e extends Handler {
        public HandlerC27069e() {
        }

        public /* synthetic */ HandlerC27069e(C27065a c27065a) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C27068d c27068d = (C27068d) message.obj;
            int i11 = message.what;
            if (i11 == 1) {
                c27068d.f54359a.m66778j(c27068d.f54360b[0]);
            } else if (i11 == 2) {
                c27068d.f54359a.mo66784p(c27068d.f54360b);
            } else {
                if (i11 != 3) {
                    return;
                }
                c27068d.f54359a.mo66781m();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetAsyncTaskEx$f */
    public static abstract class AbstractCallableC27070f<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: b */
        public Params[] f54361b;

        public AbstractCallableC27070f() {
        }

        public /* synthetic */ AbstractCallableC27070f(C27065a c27065a) {
            this();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract Result mo66776h(Params... paramsArr);

    /* JADX INFO: renamed from: k */
    public abstract ThreadPoolExecutor mo66779k();

    /* JADX INFO: renamed from: m */
    public abstract void mo66781m();

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetAsyncTaskEx$c */
    public static /* synthetic */ class C27067c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54358a;

        static {
            int[] iArr = new int[Status.values().length];
            f54358a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54358a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetAsyncTaskEx$d */
    public static class C27068d<Data> {

        /* JADX INFO: renamed from: a */
        public final LDNetAsyncTaskEx f54359a;

        /* JADX INFO: renamed from: b */
        public final Data[] f54360b;

        public C27068d(LDNetAsyncTaskEx lDNetAsyncTaskEx, Data... dataArr) {
            this.f54359a = lDNetAsyncTaskEx;
            this.f54360b = dataArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m66775g(boolean z11) {
        return this.f54354c.cancel(z11);
    }

    /* JADX INFO: renamed from: i */
    public final LDNetAsyncTaskEx<Params, Progress, Result> m66777i(Params... paramsArr) {
        if (this.f54352a != Status.PENDING) {
            int i11 = C27067c.f54358a[this.f54352a.ordinal()];
            if (i11 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i11 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f54352a = Status.RUNNING;
        m66783o();
        this.f54353b.f54361b = paramsArr;
        ThreadPoolExecutor threadPoolExecutorMo66779k = mo66779k();
        if (threadPoolExecutorMo66779k == null) {
            return null;
        }
        threadPoolExecutorMo66779k.execute(this.f54354c);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m66780l() {
        return this.f54354c.isCancelled();
    }

    /* JADX INFO: renamed from: q */
    public final void m66785q(Progress... progressArr) {
        f54351d.obtainMessage(2, new C27068d(this, progressArr)).sendToTarget();
    }

    public LDNetAsyncTaskEx() {
        C27065a c27065a = new C27065a();
        this.f54353b = c27065a;
        this.f54354c = new C27066b(c27065a);
    }

    /* JADX INFO: renamed from: j */
    public void m66778j(Result result) {
        if (m66780l()) {
            result = null;
        }
        mo66782n(result);
        this.f54352a = Status.FINISHED;
    }

    /* JADX INFO: renamed from: o */
    public void m66783o() {
    }

    /* JADX INFO: renamed from: n */
    public void mo66782n(Result result) {
    }

    /* JADX INFO: renamed from: p */
    public void mo66784p(Progress... progressArr) {
    }
}
