package p824z8;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import p789y8.C46400b;

/* JADX INFO: renamed from: z8.b */
/* JADX INFO: compiled from: ViewClickObservable.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C46731b extends Observable<Object> {

    /* JADX INFO: renamed from: b */
    public final View f104541b;

    /* JADX INFO: renamed from: z8.b$a */
    /* JADX INFO: compiled from: ViewClickObservable.java */
    public static final class a extends MainThreadDisposable implements View.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final View f104542b;

        /* JADX INFO: renamed from: c */
        public final Observer<? super Object> f104543c;

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f104542b.setOnClickListener(null);
        }

        public a(View view, Observer<? super Object> observer) {
            this.f104542b = view;
            this.f104543c = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!getDisposed()) {
                this.f104543c.onNext(Notification.INSTANCE);
            }
        }
    }

    public C46731b(View view) {
        this.f104541b = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Object> observer) {
        if (!C46400b.m102386a(observer)) {
            return;
        }
        a aVar = new a(this.f104541b, observer);
        observer.onSubscribe(aVar);
        this.f104541b.setOnClickListener(aVar);
    }
}
