package com.kubi.assets.dialog.payment;

import com.kubi.assets.exception.AssetsException;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.utils.extensions.C27041f;
import cy.InterfaceC36555b;
import p026ay.C4400a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.dialog.payment.d */
/* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a$\u0010\b\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, m90084d2 = {"jumpRoute", "", "redirectUrl", "", "id", "tradeType", "isLastUse", "", "clickExpose", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetMultiPaymentContentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetMultiPaymentContentAdapter.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentContentAdapterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,258:1\n1#2:259\n44#3,2:260\n*S KotlinDebug\n*F\n+ 1 AssetMultiPaymentContentAdapter.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentContentAdapterKt\n*L\n205#1:260,2\n*E\n"})
public final class C9829d {
    /* JADX INFO: renamed from: b */
    public static final void m16372b(String str, String str2, boolean z11) {
        if (Intrinsics.areEqual(str2, FastQuoteModel.PAY_RECHARGE)) {
            C43852m.m96590b("B1selectDepositMethod", "depositPopup", String.valueOf(str), TuplesKt.m90091to("norm_version", 1), TuplesKt.m90091to("clickType", z11 ? "lastUse" : ""));
        } else if (Intrinsics.areEqual(str2, "WITHDRAW")) {
            C43852m.m96590b("B1selectWithdrawalMethod", "withdrawalPopup", String.valueOf(str), TuplesKt.m90091to("norm_version", 1), TuplesKt.m90091to("clickType", z11 ? "lastUse" : ""));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16373c(String str, String str2, String str3, boolean z11) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m16372b(str2, str3, z11);
            C4400a c4400aM56184f = Router.f46192a.m56184f(C27041f.m66668h(str));
            IRedirect iRedirectM4044g = c4400aM56184f.m4044g();
            if (iRedirectM4044g != null) {
                c4400aM56184f.m4049l(iRedirectM4044g);
            }
            InterfaceC36555b interfaceC36555bM4046i = c4400aM56184f.m4046i();
            if (interfaceC36555bM4046i != null) {
                c4400aM56184f.m4051n(interfaceC36555bM4046i);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(c4400aM56184f.m4048k()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "jumpRouteFailed", false, null, 8, null), null, 2, null);
        }
    }
}
