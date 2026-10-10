package p824z8;

import android.view.View;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import p752x8.AbstractC46099a;

/* JADX INFO: renamed from: z8.c */
/* JADX INFO: compiled from: ViewFocusChangeObservable.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C46732c extends AbstractC46099a<Boolean> {

    /* JADX INFO: renamed from: b */
    public final View f104544b;

    /* JADX INFO: renamed from: z8.c$a */
    /* JADX INFO: compiled from: ViewFocusChangeObservable.java */
    public static final class a extends MainThreadDisposable implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b */
        public final View f104545b;

        /* JADX INFO: renamed from: c */
        public final Observer<? super Boolean> f104546c;

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f104545b.setOnFocusChangeListener(null);
        }

        public a(View view, Observer<? super Boolean> observer) {
            this.f104545b = view;
            this.f104546c = observer;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            if (!isDisposed()) {
                this.f104546c.onNext(Boolean.valueOf(z11));
            }
        }
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: c */
    public void mo776c(Observer<? super Boolean> observer) {
        a aVar = new a(this.f104544b, observer);
        observer.onSubscribe(aVar);
        this.f104544b.setOnFocusChangeListener(aVar);
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo775a() {
        return Boolean.valueOf(this.f104544b.hasFocus());
    }

    public C46732c(View view) {
        this.f104544b = view;
    }
}
