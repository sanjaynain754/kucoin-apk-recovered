package p011a9;

import android.view.KeyEvent;
import android.widget.TextView;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.functions.Predicate;
import p789y8.C46400b;

/* JADX INFO: renamed from: a9.i */
/* JADX INFO: compiled from: TextViewEditorActionObservable.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C0209i extends Observable<Integer> {

    /* JADX INFO: renamed from: b */
    public final TextView f614b;

    /* JADX INFO: renamed from: c */
    public final Predicate<? super Integer> f615c;

    /* JADX INFO: renamed from: a9.i$a */
    /* JADX INFO: compiled from: TextViewEditorActionObservable.java */
    public static final class a extends MainThreadDisposable implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: b */
        public final TextView f616b;

        /* JADX INFO: renamed from: c */
        public final Observer<? super Integer> f617c;

        /* JADX INFO: renamed from: d */
        public final Predicate<? super Integer> f618d;

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f616b.setOnEditorActionListener(null);
        }

        public a(TextView textView, Observer<? super Integer> observer, Predicate<? super Integer> predicate) {
            this.f616b = textView;
            this.f617c = observer;
            this.f618d = predicate;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            try {
                if (!getDisposed() && this.f618d.test(Integer.valueOf(i11))) {
                    this.f617c.onNext(Integer.valueOf(i11));
                    return true;
                }
                return false;
            } catch (Exception e11) {
                this.f617c.onError(e11);
                dispose();
                return false;
            }
        }
    }

    public C0209i(TextView textView, Predicate<? super Integer> predicate) {
        this.f614b = textView;
        this.f615c = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Integer> observer) {
        if (!C46400b.m102386a(observer)) {
            return;
        }
        a aVar = new a(this.f614b, observer, this.f615c);
        observer.onSubscribe(aVar);
        this.f614b.setOnEditorActionListener(aVar);
    }
}
