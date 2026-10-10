package p011a9;

import android.widget.RadioGroup;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import p752x8.AbstractC46099a;
import p789y8.C46400b;

/* JADX INFO: renamed from: a9.c */
/* JADX INFO: compiled from: RadioGroupCheckedChangeObservable.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C0203c extends AbstractC46099a<Integer> {

    /* JADX INFO: renamed from: b */
    public final RadioGroup f607b;

    /* JADX INFO: renamed from: a9.c$a */
    /* JADX INFO: compiled from: RadioGroupCheckedChangeObservable.java */
    public static final class a extends MainThreadDisposable implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b */
        public final RadioGroup f608b;

        /* JADX INFO: renamed from: c */
        public final Observer<? super Integer> f609c;

        /* JADX INFO: renamed from: d */
        public int f610d = -1;

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f608b.setOnCheckedChangeListener(null);
        }

        public a(RadioGroup radioGroup, Observer<? super Integer> observer) {
            this.f608b = radioGroup;
            this.f609c = observer;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i11) {
            if (!isDisposed() && i11 != this.f610d) {
                this.f610d = i11;
                this.f609c.onNext(Integer.valueOf(i11));
            }
        }
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Integer mo775a() {
        return Integer.valueOf(this.f607b.getCheckedRadioButtonId());
    }

    public C0203c(RadioGroup radioGroup) {
        this.f607b = radioGroup;
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: c */
    public void mo776c(Observer<? super Integer> observer) {
        if (!C46400b.m102386a(observer)) {
            return;
        }
        a aVar = new a(this.f607b, observer);
        this.f607b.setOnCheckedChangeListener(aVar);
        observer.onSubscribe(aVar);
    }
}
