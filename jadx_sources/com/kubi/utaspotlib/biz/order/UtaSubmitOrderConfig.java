package com.kubi.utaspotlib.biz.order;

import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.kubi.core.biz.submit.SubmitOrderConfig;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.core.spot.business.holder.intercept.input.LimitPriceProtectVerifyIntercept;
import com.kubi.spot.api.ISpotCommonService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import m30.C42422c;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p496od.C43023d;
import p557qe.InterfaceC43720b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UtaSubmitOrderConfig.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u001a\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/order/UtaSubmitOrderConfig;", "Lcom/kubi/core/biz/submit/SubmitOrderConfig;", "<init>", "()V", "isSupportEtfTrade", "", "cancelOrderLimitOneHundred", "isKycErrorCode", "code", "", "consumeErrorCode", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "baseCurrency", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "isCheckAvailable", "getTradeInterceptTaskChain", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "getSupportTradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "isCallAuction", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UtaSubmitOrderConfig implements SubmitOrderConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UtaSubmitOrderConfig f54174a = new UtaSubmitOrderConfig();

    @Override // com.kubi.core.biz.submit.SubmitOrderConfig
    /* JADX INFO: renamed from: a */
    public boolean mo22537a() {
        return false;
    }

    @Override // com.kubi.core.biz.submit.SubmitOrderConfig
    /* JADX INFO: renamed from: c */
    public boolean mo22539c() {
        return true;
    }

    @Override // com.kubi.core.biz.submit.SubmitOrderConfig
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<TradeTypeUiData> mo22540d(boolean z11) {
        if (z11) {
            return CollectionsKt.listOf(new TradeTypeUiData.Limit(false, 1, null));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TradeTypeUiData.Limit(false, 1, null));
        arrayList.add(new TradeTypeUiData.Market(false, 1, null));
        arrayList.add(new TradeTypeUiData.AdvancedLimit(false, 1, null));
        arrayList.add(new TradeTypeUiData.StopLimit(false, 1, null));
        arrayList.add(new TradeTypeUiData.StopMarket(false, 1, null));
        if (C42422c.f94040a.m93121d()) {
            arrayList.add(new TradeTypeUiData.Segment(false, 1, null));
        }
        return arrayList;
    }

    @Override // com.kubi.core.biz.submit.SubmitOrderConfig
    /* JADX INFO: renamed from: g */
    public boolean mo22543g() {
        return false;
    }

    @Override // com.kubi.core.biz.submit.SubmitOrderConfig
    @NotNull
    /* JADX INFO: renamed from: b */
    public LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> mo22538b() {
        final LimitPriceProtectVerifyIntercept limitPriceProtectVerifyIntercept = new LimitPriceProtectVerifyIntercept();
        UtaOrderInfoConfirmVerifyIntercept utaOrderInfoConfirmVerifyIntercept = new UtaOrderInfoConfirmVerifyIntercept();
        final LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> linkedList = new LinkedList<>();
        ISpotCommonService.f49644a.get().mo59962f(new Function0() { // from class: com.kubi.utaspotlib.biz.order.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaSubmitOrderConfig.m66182i(linkedList, limitPriceProtectVerifyIntercept);
            }
        });
        linkedList.add(utaOrderInfoConfirmVerifyIntercept);
        return linkedList;
    }

    @Override // com.kubi.core.biz.submit.SubmitOrderConfig
    /* JADX INFO: renamed from: e */
    public boolean mo22541e(@Nullable Throwable th2, @Nullable String str, @NotNull FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        if (str == null) {
            str = "";
        }
        return C43023d.m94501b(th2, childFragmentManager, str, true);
    }

    @Override // com.kubi.core.biz.submit.SubmitOrderConfig
    /* JADX INFO: renamed from: f */
    public boolean mo22542f(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return C43023d.m94504e(true, code);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m66182i(LinkedList linkedList, LimitPriceProtectVerifyIntercept limitPriceProtectVerifyIntercept) {
        linkedList.add(limitPriceProtectVerifyIntercept);
        return Unit.INSTANCE;
    }
}
