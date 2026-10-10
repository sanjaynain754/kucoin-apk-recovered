package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes23.dex */
final class CallExecuteObservable<T> extends Observable<Response<T>> {
    private final Call<T> originalCall;

    public static final class CallDisposable implements Disposable {
        private final Call<?> call;
        private volatile boolean disposed;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        public CallDisposable(Call<?> call) {
            this.call = call;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Response<T>> observer) {
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        observer.onSubscribe(callDisposable);
        if (callDisposable.getDisposed()) {
            return;
        }
        boolean z11 = false;
        try {
            Response<T> responseExecute = callClone.execute();
            if (!callDisposable.getDisposed()) {
                observer.onNext(responseExecute);
            }
            if (callDisposable.getDisposed()) {
                return;
            }
            try {
                observer.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                Exceptions.throwIfFatal(th);
                if (z11) {
                    RxJavaPlugins.onError(th);
                    return;
                }
                if (callDisposable.getDisposed()) {
                    return;
                }
                try {
                    observer.onError(th);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }
}
