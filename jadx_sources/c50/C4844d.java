package c50;

import com.kubi.tradingbotkit.business.spot.observer.CountBalanceObserver;
import io.reactivex.functions.Consumer;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c50.d */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C4844d implements Consumer {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f4911b;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        CountBalanceObserver.c(this.f4911b, obj);
    }
}
