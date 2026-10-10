package com.kubi.spot.business.newCoin;

import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.business.newCoin.entity.NewCoinActivityEntity;
import com.kubi.spot.service.SpotDepend;
import com.kubi.user.api.IUserService;
import com.tencent.qcloud.tuicore.TUIConstants;
import f30.C37346q;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewCoinHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0012J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/spot/business/newCoin/NewCoinHelper;", "", "<init>", "()V", "repository", "Lcom/kubi/spot/business/newCoin/NewCoinRepository;", "getNewCoinRepository", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", FirebaseAnalytics.Param.CURRENCY, "", "showToast", "", "start", "Lkotlin/Function0;", "completion", "onSuccess", "Lkotlin/Function1;", "Lcom/kubi/spot/business/newCoin/entity/NewCoinActivityEntity;", "goToNewCoinReserve", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "canReserveNewCoin", "item", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NewCoinHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NewCoinHelper f50279a = new NewCoinHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final NewCoinRepository f50280b = new NewCoinRepository();

    /* JADX INFO: renamed from: f */
    public static final Unit m61279f(NewCoinActivityEntity newCoinActivityEntity) {
        Router.f46192a.m56184f(C37346q.m83939i("newcoin/reserve", false, 2, null)).m4038a("isWorldPremiere", String.valueOf(newCoinActivityEntity.isWorldPremiere())).m4038a("symbol", newCoinActivityEntity.getSymbol()).m4038a("iconUrl", newCoinActivityEntity.getIconUrl()).m4038a("currencyName", newCoinActivityEntity.getCurrencyName()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61280c(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getSymbolInfoEntity().isPreviewEnableShow();
    }

    /* JADX INFO: renamed from: d */
    public final void m61281d(@NotNull BaseFragment fragment, @NotNull String currency, boolean z11, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @NotNull Function1<? super NewCoinActivityEntity, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        LifecycleOwnerKt.getLifecycleScope(fragment).launchWhenStarted(new NewCoinHelper$getNewCoinRepository$1(currency, z11, function0, function1, onSuccess, null));
    }

    /* JADX INFO: renamed from: e */
    public final void m61282e(@NotNull final NewCoinActivityEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        if (Intrinsics.areEqual(entity.isAllowBook(), Boolean.TRUE)) {
            IUserService.O(SpotDepend.f51244a.m63036f(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.business.newCoin.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewCoinHelper.m61279f(entity);
                }
            }), 1, (Object) null);
        } else {
            Router.f46192a.m56184f(C37346q.m83938h("newcoin/home", false)).m4048k();
        }
    }
}
