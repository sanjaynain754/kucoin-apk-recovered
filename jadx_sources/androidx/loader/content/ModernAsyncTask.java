package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes34.dex */
abstract class ModernAsyncTask<Result> {
    private static final String LOG_TAG = "AsyncTask";
    private static Handler sHandler;
    private volatile Status mStatus = Status.PENDING;
    final AtomicBoolean mCancelled = new AtomicBoolean();
    final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final FutureTask<Result> mFuture = new FutureTask<Result>(new Callable<Result>() { // from class: androidx.loader.content.ModernAsyncTask.1
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
        @Override // java.util.concurrent.Callable
        public Result call() {
            ModernAsyncTask.this.mTaskInvoked.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.doInBackground();
                Binder.flushPendingCommands();
                ModernAsyncTask.this.postResult(result);
                return result;
            } catch (Throwable th2) {
                try {
                    ModernAsyncTask.this.mCancelled.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    ModernAsyncTask.this.postResult(result);
                    throw th3;
                }
            }
        }
    }) { // from class: androidx.loader.content.ModernAsyncTask.2
        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                ModernAsyncTask.this.postResultIfNotInvoked(get());
            } catch (InterruptedException e11) {
                Log.w(ModernAsyncTask.LOG_TAG, e11);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.postResultIfNotInvoked(null);
            } catch (ExecutionException e12) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    };

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public abstract Result doInBackground();

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$4 */
    public static /* synthetic */ class C26704 {
        static final /* synthetic */ int[] $SwitchMap$androidx$loader$content$ModernAsyncTask$Status;

        static {
            int[] iArr = new int[Status.values().length];
            $SwitchMap$androidx$loader$content$ModernAsyncTask$Status = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$loader$content$ModernAsyncTask$Status[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static Handler getHandler() {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (sHandler == null) {
                    sHandler = new Handler(Looper.getMainLooper());
                }
                handler = sHandler;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean cancel(boolean z11) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(z11);
    }

    public final void executeOnExecutor(@NonNull Executor executor) {
        if (this.mStatus == Status.PENDING) {
            this.mStatus = Status.RUNNING;
            executor.execute(this.mFuture);
            return;
        }
        int i11 = C26704.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[this.mStatus.ordinal()];
        if (i11 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    public void postResultIfNotInvoked(Result result) {
        if (this.mTaskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    public void finish(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.mStatus = Status.FINISHED;
    }

    public void postResult(final Result result) {
        getHandler().post(new Runnable() { // from class: androidx.loader.content.ModernAsyncTask.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                ModernAsyncTask.this.finish(result);
            }
        });
    }

    public void onCancelled(Result result) {
    }

    public void onPostExecute(Result result) {
    }
}
