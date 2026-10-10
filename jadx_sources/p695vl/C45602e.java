package p695vl;

import com.kubi.kucoin.widget.upload.RxUpload;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Consumer;

/* JADX INFO: renamed from: vl.e */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C45602e implements Consumer {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObservableEmitter f102726b;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        RxUpload.e(this.f102726b, (Throwable) obj);
    }
}
