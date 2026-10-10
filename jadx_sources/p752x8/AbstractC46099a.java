package p752x8;

import io.reactivex.Observable;
import io.reactivex.Observer;

/* JADX INFO: renamed from: x8.a */
/* JADX INFO: compiled from: InitialValueObservable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC46099a<T> extends Observable<T> {

    /* JADX INFO: renamed from: x8.a$a */
    /* JADX INFO: compiled from: InitialValueObservable.java */
    /* JADX INFO: loaded from: classes56.dex */
    public final class a extends Observable<T> {
        public a() {
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer<? super T> observer) {
            AbstractC46099a.this.mo776c(observer);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo775a();

    /* JADX INFO: renamed from: c */
    public abstract void mo776c(Observer<? super T> observer);

    /* JADX INFO: renamed from: b */
    public final Observable<T> m101605b() {
        return new a();
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(Observer<? super T> observer) {
        mo776c(observer);
        observer.onNext(mo775a());
    }
}
