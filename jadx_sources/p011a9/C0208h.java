package p011a9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import p752x8.AbstractC46099a;

/* JADX INFO: renamed from: a9.h */
/* JADX INFO: compiled from: TextViewAfterTextChangeEventObservable.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C0208h extends AbstractC46099a<AbstractC0207g> {

    /* JADX INFO: renamed from: b */
    public final TextView f611b;

    /* JADX INFO: renamed from: a9.h$a */
    /* JADX INFO: compiled from: TextViewAfterTextChangeEventObservable.java */
    public static final class a extends MainThreadDisposable implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final TextView f612b;

        /* JADX INFO: renamed from: c */
        public final Observer<? super AbstractC0207g> f613c;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f613c.onNext(AbstractC0207g.m785a(this.f612b, editable));
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f612b.removeTextChangedListener(this);
        }

        public a(TextView textView, Observer<? super AbstractC0207g> observer) {
            this.f612b = textView;
            this.f613c = observer;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: c */
    public void mo776c(Observer<? super AbstractC0207g> observer) {
        a aVar = new a(this.f611b, observer);
        observer.onSubscribe(aVar);
        this.f611b.addTextChangedListener(aVar);
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC0207g mo775a() {
        TextView textView = this.f611b;
        return AbstractC0207g.m785a(textView, textView.getEditableText());
    }

    public C0208h(TextView textView) {
        this.f611b = textView;
    }
}
