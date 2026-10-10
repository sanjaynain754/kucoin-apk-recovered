package p011a9;

import android.widget.CompoundButton;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import p752x8.AbstractC46099a;
import p789y8.C46400b;

/* JADX INFO: renamed from: a9.b */
/* JADX INFO: compiled from: CompoundButtonCheckedChangeObservable.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C0202b extends AbstractC46099a<Boolean> {

    /* JADX INFO: renamed from: b */
    public final CompoundButton f604b;

    /* JADX INFO: renamed from: a9.b$a */
    /* JADX INFO: compiled from: CompoundButtonCheckedChangeObservable.java */
    public static final class a extends MainThreadDisposable implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: b */
        public final CompoundButton f605b;

        /* JADX INFO: renamed from: c */
        public final Observer<? super Boolean> f606c;

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f605b.setOnCheckedChangeListener(null);
        }

        public a(CompoundButton compoundButton, Observer<? super Boolean> observer) {
            this.f605b = compoundButton;
            this.f606c = observer;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (!isDisposed()) {
                this.f606c.onNext(Boolean.valueOf(z11));
            }
        }
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo775a() {
        return Boolean.valueOf(this.f604b.isChecked());
    }

    public C0202b(CompoundButton compoundButton) {
        this.f604b = compoundButton;
    }

    @Override // p752x8.AbstractC46099a
    /* JADX INFO: renamed from: c */
    public void mo776c(Observer<? super Boolean> observer) {
        if (!C46400b.m102386a(observer)) {
            return;
        }
        a aVar = new a(this.f604b, observer);
        observer.onSubscribe(aVar);
        this.f604b.setOnCheckedChangeListener(aVar);
    }
}
