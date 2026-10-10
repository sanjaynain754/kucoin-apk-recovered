package com.kubi.spot.knb;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import b00.InterfaceC4423g0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.R$string;
import com.kubi.spot.dialog.order.AmendOrderDialog;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.tradebase.BizType;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeTrade.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016JH\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016JJ\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0002J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0002J>\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\r2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0012\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u001eJZ\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010\r2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016R\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m90084d2 = {"Lcom/kubi/spot/knb/KCFlutterBridgeTrade;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeTradeCall;", "<init>", "()V", "isUtaTrading", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "LIVE_FEED_REFRESH_CARD", "", "getLIVE_FEED_REFRESH_CARD", "()Ljava/lang/String;", "modifyKlineOrder", "bizType", "orderInfo", "targetPrice", "refreshCardInfo", "isRefresh", "handleOrderModification", "activity", "Landroidx/fragment/app/FragmentActivity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/spot/entity/DelegationEntity;", "updateOrderPrice", "showAmendDialog", "parseOrderInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelKlineOrder", "orderId", "symbol", "tpslOrderInfo", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeTrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeTrade.kt\ncom/kubi/spot/knb/KCFlutterBridgeTrade\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,160:1\n196#2,3:161\n44#3,2:164\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeTrade.kt\ncom/kubi/spot/knb/KCFlutterBridgeTrade\n*L\n122#1:161,3\n129#1:164,2\n*E\n"})
public final class KCFlutterBridgeTrade implements InterfaceC4423g0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f50773a = "live_feed_refresh_card";

    @Override // b00.InterfaceC4423g0
    /* JADX INFO: renamed from: a */
    public void mo4127a(@NotNull Context ctx, @NotNull String bizType, @NotNull String orderInfo, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            MviExKt.m42518n(new KCFlutterBridgeTrade$modifyKlineOrder$1(orderInfo, bizType, this, ctx, str, callback, null));
        } else {
            callback.invoke(Boolean.FALSE, new ProtocolException("Invalid or Missing BaseActivity", null, null, false, 14, null));
        }
    }

    @Override // b00.InterfaceC4423g0
    /* JADX INFO: renamed from: b */
    public void mo4128b(@NotNull Context ctx, @NotNull String bizType, @NotNull String orderId, @NotNull String symbol, @Nullable String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(bizType, SearchCategory$Companion.FUTURES)) {
            IKuMexService.f28731a.get().mo33263L(ctx, orderId, str, str2, callback);
            return;
        }
        callback.invoke(Boolean.FALSE, new ProtocolException("Unsupported bizType: " + bizType, null, null, false, 14, null));
    }

    @Override // b00.InterfaceC4423g0
    /* JADX INFO: renamed from: c */
    public void mo4129c(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(IUnifyAccountService.f53155a.get().mo64979C()), null);
    }

    @Override // b00.InterfaceC4423g0
    /* JADX INFO: renamed from: d */
    public void mo4130d(@NotNull Context ctx, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (z11) {
            C12572a.m23695d(this.f50773a, Boolean.TRUE, 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m62152g(FragmentActivity fragmentActivity, DelegationEntity delegationEntity, String str, String str2, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        if (delegationEntity != null) {
            m62155j(delegationEntity, str2);
            m62154i(fragmentActivity, delegationEntity, str, function2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00a3, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public final Object m62153h(String str, Continuation<? super DelegationEntity> continuation) {
        KCFlutterBridgeTrade$parseOrderInfo$1 kCFlutterBridgeTrade$parseOrderInfo$1;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        DelegationEntity delegationEntity;
        if (continuation instanceof KCFlutterBridgeTrade$parseOrderInfo$1) {
            kCFlutterBridgeTrade$parseOrderInfo$1 = (KCFlutterBridgeTrade$parseOrderInfo$1) continuation;
            int i11 = kCFlutterBridgeTrade$parseOrderInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kCFlutterBridgeTrade$parseOrderInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kCFlutterBridgeTrade$parseOrderInfo$1 = new KCFlutterBridgeTrade$parseOrderInfo$1(this, continuation);
            }
        } else {
            kCFlutterBridgeTrade$parseOrderInfo$1 = new KCFlutterBridgeTrade$parseOrderInfo$1(this, continuation);
        }
        Object objM90914f0 = kCFlutterBridgeTrade$parseOrderInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kCFlutterBridgeTrade$parseOrderInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90914f0);
                Result.Companion companion = Result.INSTANCE;
                if (TextUtils.isEmpty(str)) {
                    ToastCompat.m66437C(R$string.auto_clean_not_support);
                    delegationEntity = null;
                } else {
                    C27099x c27099x = C27099x.f54458a;
                    InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C25463x3e8fe0a6(str, null)), C42911a.m94120b());
                    kCFlutterBridgeTrade$parseOrderInfo$1.L$0 = str;
                    kCFlutterBridgeTrade$parseOrderInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                    kCFlutterBridgeTrade$parseOrderInfo$1.L$2 = SpillingKt.nullOutSpilledVariable(str);
                    kCFlutterBridgeTrade$parseOrderInfo$1.L$3 = SpillingKt.nullOutSpilledVariable(kCFlutterBridgeTrade$parseOrderInfo$1);
                    kCFlutterBridgeTrade$parseOrderInfo$1.I$0 = 0;
                    kCFlutterBridgeTrade$parseOrderInfo$1.I$1 = 0;
                    kCFlutterBridgeTrade$parseOrderInfo$1.label = 1;
                    objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, kCFlutterBridgeTrade$parseOrderInfo$1);
                    if (objM90914f0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(delegationEntity);
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    ToastCompat.m66437C(R$string.auto_clean_not_support);
                    C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "parseOrderInfo orderInfo=" + str, false, null, 8, null), null, 2, null);
                }
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    return null;
                }
                return objM103844constructorimpl;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) kCFlutterBridgeTrade$parseOrderInfo$1.L$0;
            ResultKt.throwOnFailure(objM90914f0);
            delegationEntity = (DelegationEntity) objM90914f0;
            objM103844constructorimpl = Result.m103844constructorimpl(delegationEntity);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            ToastCompat.m66437C(R$string.auto_clean_not_support);
            C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "parseOrderInfo orderInfo=" + str, false, null, 8, null), null, 2, null);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            return null;
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: i */
    public final void m62154i(FragmentActivity fragmentActivity, DelegationEntity delegationEntity, String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        BizType bizType;
        if (Intrinsics.areEqual(str, SearchCategory$Companion.SPOT)) {
            bizType = BizType.SPOT;
        } else if (!Intrinsics.areEqual(str, ViewProps.MARGIN)) {
            return;
        } else {
            bizType = BizType.MARGIN;
        }
        AmendOrderDialog amendOrderDialogNewInstance = AmendOrderDialog.f50494z0.newInstance(delegationEntity, bizType);
        amendOrderDialogNewInstance.m61702a5(function2);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        amendOrderDialogNewInstance.show(supportFragmentManager, "AmendOrderDialog");
    }

    /* JADX INFO: renamed from: j */
    public final void m62155j(DelegationEntity delegationEntity, String str) {
        if (str != null) {
            delegationEntity.setTargetPrice(DowngradeExKt.m66535e(str, null, 1, null));
        }
    }
}
