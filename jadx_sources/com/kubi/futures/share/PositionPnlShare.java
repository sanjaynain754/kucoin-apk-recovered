package com.kubi.futures.share;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.share.PositionPnlShare;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.assets.model.ProfitShareEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.Persistence;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.futures.share.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PositionPnlShare.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0014¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/futures/share/PositionPnlShare;", "Lcom/kubi/futures/share/BasePositionShare;", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "Lcom/kubi/kumex/data/assets/model/ProfitShareEntity;", "<init>", "()V", FirebaseAnalytics.Event.SHARE, "", "fragment", "Lcom/kubi/sdk/BaseFragment;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "fallbackShare", "mergeProfitShare", "remoteShare", "buildShareParam", "Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "t", "p", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PositionPnlShare extends BasePositionShare<ProfitRecordEntity, ProfitShareEntity> {
    /* JADX INFO: renamed from: r */
    public static final Unit m26544r(BaseFragment baseFragment, PositionPnlShare positionPnlShare, ProfitRecordEntity profitRecordEntity, ProfitShareEntity profitShareEntity) {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        Intrinsics.checkNotNull(profitShareEntity);
        positionPnlShare.m26504d(baseFragment, positionPnlShare.m26548m(profitRecordEntity, profitShareEntity));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m26546t(BaseFragment baseFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        C17058m0.m36550e(baseFragment, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m26542p(PositionPnlShare positionPnlShare, BaseFragment baseFragment, ProfitRecordEntity profitRecordEntity, ProfitShareEntity profitShareEntity, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            profitShareEntity = null;
        }
        positionPnlShare.m26550o(baseFragment, profitRecordEntity, profitShareEntity);
    }

    /* JADX INFO: renamed from: q */
    public static final ProfitShareEntity m26543q(ProfitRecordEntity profitRecordEntity, PositionPnlShare positionPnlShare, ProfitShareEntity profitShareEntity) {
        return positionPnlShare.m26549n(MultiBizFacadeManager.m20258n(MultiBizFacadeManager.f19232a, null, 1, null).mo83055c(C27041f.m66668h(profitRecordEntity.getId()), C27039d.m66652l(profitRecordEntity.getCloseDate())), profitShareEntity);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public BasePositionShare.ShareParam m26548m(@NotNull ProfitRecordEntity t11, @NotNull ProfitShareEntity p11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        Intrinsics.checkNotNullParameter(p11, "p");
        String strM66668h = C27041f.m66668h(t11.getSymbol());
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(t11.getSymbol()), false, 2, null);
        String str = StringsKt.contains$default((CharSequence) C27041f.m66668h(t11.getType()), (CharSequence) SharedPositionInfo.SIDE_LONG, false, 2, (Object) null) ? "buy" : "sell";
        BigDecimal leverage = t11.getLeverage();
        BigDecimal realisedPnl = t11.getRealisedPnl();
        BigDecimal profitRate = p11.getProfitRate();
        if (profitRate == null) {
            profitRate = t11.getRoe();
        }
        BigDecimal openPrice = p11.getOpenPrice();
        BigDecimal closePrice = p11.getClosePrice();
        String currency = t11.getCurrency();
        Long closeDate = t11.getCloseDate();
        boolean zIsTrialFunds = t11.isTrialFunds();
        Persistence persistence = Persistence.f30799a;
        boolean zM36516a = persistence.m36516a("contract_share_show_pnl", false);
        boolean zM36516a2 = persistence.m36516a("contract_share_show_user", true);
        String prizeType = t11.getPrizeType();
        if (prizeType == null) {
            prizeType = "";
        }
        return new BasePositionShare.ShareParam(true, strM66668h, contractEntityM99529O, str, leverage, realisedPnl, profitRate, closeDate, openPrice, closePrice, currency, zM36516a2, zM36516a, zIsTrialFunds, prizeType);
    }

    /* JADX INFO: renamed from: n */
    public final ProfitShareEntity m26549n(ProfitShareEntity profitShareEntity, ProfitShareEntity profitShareEntity2) {
        if (profitShareEntity == null) {
            return profitShareEntity2 == null ? new ProfitShareEntity(null, null, null, 7, null) : profitShareEntity2;
        }
        if (profitShareEntity2 == null) {
            return profitShareEntity;
        }
        BigDecimal openPrice = profitShareEntity.getOpenPrice();
        if (openPrice == null) {
            openPrice = profitShareEntity2.getOpenPrice();
        }
        BigDecimal closePrice = profitShareEntity.getClosePrice();
        if (closePrice == null) {
            closePrice = profitShareEntity2.getClosePrice();
        }
        BigDecimal profitRate = profitShareEntity.getProfitRate();
        if (profitRate == null) {
            profitRate = profitShareEntity2.getProfitRate();
        }
        return new ProfitShareEntity(openPrice, closePrice, profitRate);
    }

    /* JADX INFO: renamed from: o */
    public final void m26550o(@NotNull final BaseFragment fragment, @NotNull final ProfitRecordEntity entity, @Nullable final ProfitShareEntity profitShareEntity) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entity, "entity");
        fragment.showLoadingDialog();
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: gi.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionPnlShare.m26543q(entity, this, profitShareEntity);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: gi.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionPnlShare.m26544r(fragment, this, entity, (ProfitShareEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: gi.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PositionPnlShare.m26545s(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: gi.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionPnlShare.m26546t(fragment, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: gi.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PositionPnlShare.m26547u(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, fragment.getDestroyDisposable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m26545s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m26547u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
