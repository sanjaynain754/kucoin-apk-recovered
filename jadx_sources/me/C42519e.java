package me;

import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.user.api.IUserService;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: me.e */
/* JADX INFO: compiled from: LoginIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/LoginIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/IOrderIntercept;", "<init>", "()V", "checkPreInterceptFailed", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "isMaintenance", "fm", "Landroidx/fragment/app/FragmentManager;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42519e implements InterfaceC42516c {
    /* JADX INFO: renamed from: c */
    public static final Unit m93242c() {
        return Unit.INSTANCE;
    }

    @Override // me.InterfaceC42516c
    /* JADX INFO: renamed from: a */
    public boolean mo93235a(@NotNull TradeItemBean tradeItemBean, boolean z11, @Nullable FragmentManager fragmentManager) throws JSONException {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        if (IUserService.a.get().c()) {
            return false;
        }
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_LOGIN, SpotBusinessTracker.SpotFailReason.NOT_LOGIN);
        IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: me.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42519e.m93242c();
            }
        }), 1, (Object) null);
        return true;
    }
}
