package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableRangeLong extends Observable<Long> {
    private final long count;
    private final long start;

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final Observer<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Long poll() throws Exception {
            long j11 = this.index;
            if (j11 != this.end) {
                this.index = 1 + j11;
                return Long.valueOf(j11);
            }
            lazySet(1);
            return null;
        }

        public void run() {
            if (this.fused) {
                return;
            }
            Observer<? super Long> observer = this.downstream;
            long j11 = this.end;
            for (long j12 = this.index; j12 != j11 && get() == 0; j12++) {
                observer.onNext(Long.valueOf(j12));
            }
            if (get() == 0) {
                lazySet(1);
                observer.onComplete();
            }
        }

        public RangeDisposable(Observer<? super Long> observer, long j11, long j12) {
            this.downstream = observer;
            this.index = j11;
            this.end = j12;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        long j11 = this.start;
        RangeDisposable rangeDisposable = new RangeDisposable(observer, j11, this.count + j11);
        observer.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }

    public ObservableRangeLong(long j11, long j12) {
        this.start = j11;
        this.count = j12;
    }
}
