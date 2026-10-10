package p011a9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import p752x8.AbstractC46099a;

/* JADX INFO: renamed from: a9.j */
/* JADX INFO: compiled from: TextViewTextObservable.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0210j extends AbstractC46099a<CharSequence> {

    /* JADX INFO: renamed from: b */
    public final TextView f619b;

    /* JADX INFO: renamed from: a9.j$a */
    /* JADX INFO: compiled from: TextViewTextObservable.java */
    public static final class a extends MainThreadDisposable implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final TextView f620b;

        /* JADX INFO: renamed from: c */
        public final Observer<? super CharSequence> f621c;

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f620b.removeTextChangedListener(this);
        }

        public a(TextView textView, Observer<? super CharSequence> observer) {
            this.f620b = textView;
            this.f621c = observer;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (!isDisposed()) {
                this.f621c.onNext(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: c */
    public void mo776c(Observer<? super CharSequence> observer) {
        a aVar = new a(this.f619b, observer);
        observer.onSubscribe(aVar);
        this.f619b.addTextChangedListener(aVar);
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CharSequence mo775a() {
        return this.f619b.getText();
    }

    public C0210j(TextView textView) {
        this.f619b = textView;
    }
}
