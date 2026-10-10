package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes60.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Disposable andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i11 = 0; i11 < length; i11++) {
                Disposable disposable = get(i11);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (disposable != disposableHelper && (andSet = getAndSet(i11, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    public ArrayCompositeDisposable(int i11) {
        super(i11);
    }

    public Disposable replaceResource(int i11, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = get(i11);
            if (disposable2 == DisposableHelper.DISPOSED) {
                disposable.dispose();
                return null;
            }
        } while (!compareAndSet(i11, disposable2, disposable));
        return disposable2;
    }

    public boolean setResource(int i11, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = get(i11);
            if (disposable2 == DisposableHelper.DISPOSED) {
                disposable.dispose();
                return false;
            }
        } while (!compareAndSet(i11, disposable2, disposable));
        if (disposable2 != null) {
            disposable2.dispose();
            return true;
        }
        return true;
    }
}
