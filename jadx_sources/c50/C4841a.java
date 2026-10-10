package c50;

import com.kubi.tradingbotkit.business.spot.observer.CountBalanceObserver;
import com.kubi.tradingbotkit.model.CurrencyBalanceModel;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c50.a */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes51.dex */
public final /* synthetic */ class C4841a implements Function1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CountBalanceObserver f4909b;

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return CountBalanceObserver.b(this.f4909b, (CurrencyBalanceModel) obj);
    }
}
