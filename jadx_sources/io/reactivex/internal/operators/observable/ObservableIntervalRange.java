package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableIntervalRange extends Observable<Long> {
    final long end;
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final long start;
    final TimeUnit unit;

    public static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final Observer<? super Long> downstream;
        final long end;

        public IntervalRangeObserver(Observer<? super Long> observer, long j11, long j12) {
            this.downstream = observer;
            this.count = j11;
            this.end = j12;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!getDisposed()) {
                long j11 = this.count;
                this.downstream.onNext(Long.valueOf(j11));
                if (j11 == this.end) {
                    DisposableHelper.dispose(this);
                    this.downstream.onComplete();
                } else {
                    this.count = j11 + 1;
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

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
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(observer, this.start, this.end);
        observer.onSubscribe(intervalRangeObserver);
        Scheduler scheduler = this.scheduler;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalRangeObserver.setResource(scheduler.schedulePeriodicallyDirect(intervalRangeObserver, this.initialDelay, this.period, this.unit));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        intervalRangeObserver.setResource(workerCreateWorker);
        workerCreateWorker.schedulePeriodically(intervalRangeObserver, this.initialDelay, this.period, this.unit);
    }

    public ObservableIntervalRange(long j11, long j12, long j13, long j14, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j13;
        this.period = j14;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.start = j11;
        this.end = j12;
    }
}
