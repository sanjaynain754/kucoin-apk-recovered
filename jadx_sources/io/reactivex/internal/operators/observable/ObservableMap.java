package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    final Function<? super T, ? extends U> function;

    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {
        final Function<? super T, ? extends U> mapper;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.downstream.onNext((Object) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public U poll() throws Exception {
            T tPoll = this.f87122qd.poll();
            if (tPoll != null) {
                return (U) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        public MapObserver(Observer<? super U> observer, Function<? super T, ? extends U> function) {
            super(observer);
            this.mapper = function;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return transitiveBoundaryFusion(i11);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new MapObserver(observer, this.function));
    }

    public ObservableMap(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.function = function;
    }
}
