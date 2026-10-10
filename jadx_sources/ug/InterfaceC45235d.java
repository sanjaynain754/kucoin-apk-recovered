package ug;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.entity.BalanceEntity;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ug.d */
/* JADX INFO: compiled from: IIsolatedBizInterface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/isolated/IMultiIsolatedSocketApi;", "Lcom/kubi/function/IMultiFunction;", "observeFreezeBalance", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/entity/BalanceEntity;", "isTrial", "", FirebaseAnalytics.Param.CURRENCY, "", "observeRiskLimit", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45235d extends InterfaceC43729a {
    @NotNull
    /* JADX INFO: renamed from: N0 */
    Observable<Object> mo93827N0(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: t0 */
    Observable<BalanceEntity> mo93830t0(boolean z11, @NotNull String str);
}
