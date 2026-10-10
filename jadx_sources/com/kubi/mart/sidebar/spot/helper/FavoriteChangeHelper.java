package com.kubi.mart.sidebar.spot.helper;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.R$string;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavoriteChangeHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0086@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/FavoriteChangeHelper;", "", "<init>", "()V", "changeFavor", "", "item", "Lcom/kubi/data/entity/TradeItemBean;", "onFinish", "Lkotlin/Function0;", "(Lcom/kubi/data/entity/TradeItemBean;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FavoriteChangeHelper {
    /* JADX INFO: renamed from: c */
    public static final Unit m41448c(boolean z11, boolean z12) {
        if (z12) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(z11 ? R$string.cancel_favor_ok : R$string.add_favorites_ok, new Object[0]), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r2, r5, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0163, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r13, r4, r0) == r1) goto L48;
     */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m41449b(@NotNull TradeItemBean tradeItemBean, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        FavoriteChangeHelper$changeFavor$1 favoriteChangeHelper$changeFavor$1;
        UserInfo.LoginState loginStateD;
        TradeItemBean tradeItemBean2;
        boolean z11;
        BaseEntity baseEntity;
        Boolean boolBoxBoolean;
        int i11;
        if (continuation instanceof FavoriteChangeHelper$changeFavor$1) {
            favoriteChangeHelper$changeFavor$1 = (FavoriteChangeHelper$changeFavor$1) continuation;
            int i12 = favoriteChangeHelper$changeFavor$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                favoriteChangeHelper$changeFavor$1.label = i12 - Integer.MIN_VALUE;
            } else {
                favoriteChangeHelper$changeFavor$1 = new FavoriteChangeHelper$changeFavor$1(this, continuation);
            }
        } else {
            favoriteChangeHelper$changeFavor$1 = new FavoriteChangeHelper$changeFavor$1(this, continuation);
        }
        Object objM42830k = favoriteChangeHelper$changeFavor$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = favoriteChangeHelper$changeFavor$1.label;
        if (i13 != 0) {
            if (i13 == 1) {
                z11 = favoriteChangeHelper$changeFavor$1.Z$0;
                UserInfo.LoginState loginState = (UserInfo.LoginState) favoriteChangeHelper$changeFavor$1.L$2;
                Function0<Unit> function1 = (Function0) favoriteChangeHelper$changeFavor$1.L$1;
                tradeItemBean2 = (TradeItemBean) favoriteChangeHelper$changeFavor$1.L$0;
                ResultKt.throwOnFailure(objM42830k);
                loginStateD = loginState;
                function0 = function1;
                baseEntity = (BaseEntity) objM42830k;
                if (baseEntity != null) {
                    boolBoxBoolean = Boxing.boxBoolean(baseEntity.getSuccess());
                } else {
                    boolBoxBoolean = null;
                }
                if (C27025c.m66566d(boolBoxBoolean)) {
                    if (Intrinsics.areEqual(baseEntity != null ? baseEntity.getCode() : null, "420000")) {
                        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
                    }
                    return Unit.INSTANCE;
                }
                C27017c c27017c = C27017c.f54310a;
                if (z11) {
                    i11 = R$string.cancel_favor_ok;
                } else {
                    i11 = R$string.add_favorites_ok;
                }
                ToastCompat.m66441G(c27017c.m66516f(i11, new Object[0]), new Object[0]);
                tradeItemBean2.setFavor(!z11);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                FavoriteChangeHelper$changeFavor$2 favoriteChangeHelper$changeFavor$2 = new FavoriteChangeHelper$changeFavor$2(function0, null);
                favoriteChangeHelper$changeFavor$1.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBean2);
                favoriteChangeHelper$changeFavor$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
                favoriteChangeHelper$changeFavor$1.L$2 = SpillingKt.nullOutSpilledVariable(loginStateD);
                favoriteChangeHelper$changeFavor$1.L$3 = SpillingKt.nullOutSpilledVariable(baseEntity);
                favoriteChangeHelper$changeFavor$1.Z$0 = z11;
                favoriteChangeHelper$changeFavor$1.label = 2;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM42830k);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(objM42830k);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM42830k);
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        final boolean zMo50681F = companion.get().mo50681F(tradeItemBean);
        loginStateD = UserInfo.a.d();
        if (loginStateD == UserInfo.LoginState.Login) {
            InterfaceC41634e interfaceC41634eM91205b = RxConvertKt.m91205b(ISpotService.f49646a.get().addFavorSymbol(tradeItemBean.getSymbol()));
            favoriteChangeHelper$changeFavor$1.L$0 = tradeItemBean;
            favoriteChangeHelper$changeFavor$1.L$1 = function0;
            favoriteChangeHelper$changeFavor$1.L$2 = SpillingKt.nullOutSpilledVariable(loginStateD);
            favoriteChangeHelper$changeFavor$1.Z$0 = zMo50681F;
            favoriteChangeHelper$changeFavor$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM91205b, favoriteChangeHelper$changeFavor$1);
            if (objM42830k != coroutine_suspended) {
                tradeItemBean2 = tradeItemBean;
                z11 = zMo50681F;
                baseEntity = (BaseEntity) objM42830k;
                if (baseEntity != null) {
                    boolBoxBoolean = Boxing.boxBoolean(baseEntity.getSuccess());
                } else {
                    boolBoxBoolean = null;
                }
                if (C27025c.m66566d(boolBoxBoolean)) {
                    if (Intrinsics.areEqual(baseEntity != null ? baseEntity.getCode() : null, "420000")) {
                        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
                    }
                    return Unit.INSTANCE;
                }
                C27017c c27017c2 = C27017c.f54310a;
                if (z11) {
                    i11 = R$string.cancel_favor_ok;
                } else {
                    i11 = R$string.add_favorites_ok;
                }
                ToastCompat.m66441G(c27017c2.m66516f(i11, new Object[0]), new Object[0]);
                tradeItemBean2.setFavor(!z11);
                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                FavoriteChangeHelper$changeFavor$2 favoriteChangeHelper$changeFavor$3 = new FavoriteChangeHelper$changeFavor$2(function0, null);
                favoriteChangeHelper$changeFavor$1.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBean2);
                favoriteChangeHelper$changeFavor$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
                favoriteChangeHelper$changeFavor$1.L$2 = SpillingKt.nullOutSpilledVariable(loginStateD);
                favoriteChangeHelper$changeFavor$1.L$3 = SpillingKt.nullOutSpilledVariable(baseEntity);
                favoriteChangeHelper$changeFavor$1.Z$0 = z11;
                favoriteChangeHelper$changeFavor$1.label = 2;
            }
        } else {
            companion.get().mo50678C(tradeItemBean, new Function1() { // from class: com.kubi.mart.sidebar.spot.helper.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FavoriteChangeHelper.m41448c(zMo50681F, ((Boolean) obj).booleanValue());
                }
            });
            AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
            FavoriteChangeHelper$changeFavor$4 favoriteChangeHelper$changeFavor$4 = new FavoriteChangeHelper$changeFavor$4(function0, null);
            favoriteChangeHelper$changeFavor$1.L$0 = SpillingKt.nullOutSpilledVariable(tradeItemBean);
            favoriteChangeHelper$changeFavor$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
            favoriteChangeHelper$changeFavor$1.L$2 = SpillingKt.nullOutSpilledVariable(loginStateD);
            favoriteChangeHelper$changeFavor$1.Z$0 = zMo50681F;
            favoriteChangeHelper$changeFavor$1.label = 3;
        }
        return coroutine_suspended;
    }
}
