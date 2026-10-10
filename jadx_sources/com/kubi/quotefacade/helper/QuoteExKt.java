package com.kubi.quotefacade.helper;

import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.entity.FutureTradeItemBean;
import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import com.kubi.quotefacade.knb.KCFlutterPageDismissTransmit;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.wallet.api.IWalletService;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import f00.C37304a;
import g00.InterfaceC37765q;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: compiled from: QuoteEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0000¢\u0006\u0002\u0010\b\u001a\u0018\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012\u001a0\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u001a\u0010\u0010\u0013\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u001a \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u001a\u0006\u0010\u001b\u001a\u00020\u0006\u001a\"\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\f\u0010\u001d\u001a\u00020\n*\u00020\nH\u0000\u001a\u0014\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"launchIO", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "CHAIN_PAGE_FROM_TYPE_FAVORITE", "", "CHAIN_PAGE_FROM_TYPE_MARKET", "CHAIN_PAGE_FROM_TYPE_MARKET_HOT", "CHAIN_PAGE_FROM_TYPE_ALPHA_PREMIUM", "CHAIN_PAGE_FROM_TYPE_ALPHA_ONCHAIN", "jumpToChainFilterPage", "filterType", "chainFilterData", "Lcom/kubi/quotefacade/entity/ChainFilterData;", "jumpAlphaKlineDetail", InterfaceC33826o0.f71244p, "chain", "tokenBridgeId", "collectType", "checkWeb3AlertDialogAndJump", "redirectType", "", "showNewCoinDialog", "jumpWeb3CoinDetail", "checkPrice", "getFutureWsVolume", "", "Lcom/kubi/data/entity/TradeItemBean;", "wsEntity", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteEx.kt\ncom/kubi/quotefacade/helper/QuoteExKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,201:1\n47#2,4:202\n135#3,2:206\n126#3,2:208\n*S KotlinDebug\n*F\n+ 1 QuoteEx.kt\ncom/kubi/quotefacade/helper/QuoteExKt\n*L\n51#1:202,4\n128#1:206,2\n143#1:208,2\n*E\n"})
public final class QuoteExKt {

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.QuoteExKt$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 QuoteEx.kt\ncom/kubi/quotefacade/helper/QuoteExKt\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,49:1\n52#2:50\n53#2:58\n45#3,7:51\n*S KotlinDebug\n*F\n+ 1 QuoteEx.kt\ncom/kubi/quotefacade/helper/QuoteExKt\n*L\n52#1:51,7\n*E\n"})
    public static final class C22127a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C37266a.m83411b(exception, "QuoteEx");
        }

        public C22127a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m51857h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        BigDecimal bigDecimalM66671k = C27041f.m66671k(str);
        return (bigDecimalM66671k != null && bigDecimalM66671k.compareTo(BigDecimal.ZERO) <= 0) ? "--" : str;
    }

    /* JADX INFO: renamed from: i */
    public static final void m51858i(@NotNull final String token, @NotNull final String chain, final long j11) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!IWalletService.f54542a.get().mo66941a()) {
            ToastCompat.m66437C(R$string.kc_web3_not_support);
            return;
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.quotefacade.helper.j2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteExKt.m51860k((FragmentActivity) obj);
            }
        });
        if (C46392a.m102322d(QuoteKV.f42044a.m52051k(), false)) {
            m51871v(token, chain, j11);
        } else {
            C42899b.m94076f(DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.view_chain_dialog_web3_alert, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.quotefacade.helper.k2
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuoteExKt.m51862m(token, chain, j11, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            }), "quote_chain_dialog_web3_alert");
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m51859j(String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = 1;
        }
        m51858i(str, str2, j11);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m51860k(final FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.quotefacade.helper.l2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteExKt.m51861l(it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m51862m(final String str, final String str2, final long j11, final BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_left_btn);
        if (textView != null) {
            textView.setText(R$string.kc_platform_search_web3_alert_cancel);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.quotefacade.helper.m2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteExKt.m51863n(helper);
                }
            }, 1, null);
        }
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_right_btn);
        if (textView2 != null) {
            textView2.setText(R$string.kc_platform_search_web3_alert_continue);
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.quotefacade.helper.n2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteExKt.m51864o(helper, viewHolder, str, str2, j11);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final double m51865p(@NotNull TradeItemBean tradeItemBean, @NotNull WsFutureSnapshotEntity wsEntity) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        Intrinsics.checkNotNullParameter(wsEntity, "wsEntity");
        return ((tradeItemBean instanceof FutureTradeItemBean) && ((FutureTradeItemBean) tradeItemBean).getContract().isInverse()) ? wsEntity.getVolume() : wsEntity.getTurnover();
    }

    /* JADX INFO: renamed from: q */
    public static final void m51866q(@Nullable String str) {
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/alphaKline?tokenBridgeId=" + str, false, null, 6, null);
    }

    /* JADX INFO: renamed from: r */
    public static final void m51867r(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (Intrinsics.areEqual(str4, "highlights")) {
            m51866q(str3);
            return;
        }
        if (!Intrinsics.areEqual(str4, "chain_area") || str == null || StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2)) {
            return;
        }
        m51859j(str, str2, 0L, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m51868s(String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str4 = "highlights";
        }
        m51867r(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: t */
    public static final void m51869t(@NotNull String filterType, @NotNull ChainFilterData chainFilterData) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(chainFilterData, "chainFilterData");
        KCFlutterRouteManager.f46704a.m56849i("market/chainFilter?key_chain_page_from_type=" + filterType + "&key_chain_filter_data=" + C27099x.m66919i(chainFilterData, false, 2, null), false, new Function1() { // from class: com.kubi.quotefacade.helper.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuoteExKt.m51870u((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m51870u(Map map) {
        if (map == null) {
            return Unit.INSTANCE;
        }
        new KCFlutterPageDismissTransmit().m52216a(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m51871v(final String str, final String str2, final long j11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.helper.o2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteExKt.m51872w(str, str2, j11);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m51872w(String str, String str2, long j11) {
        InterfaceC37765q.a.m85188a(C37304a.f82764a, str, str2, j11, null, null, null, 56, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final InterfaceC41775x1 m51873x(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(interfaceC41709m0, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return C41696j.m91104d(interfaceC41709m0, C42911a.m94120b().plus(new C22127a(CoroutineExceptionHandler.INSTANCE)), null, new QuoteExKt$launchIO$2(block, null), 2, null);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m51861l(FragmentActivity fragmentActivity) {
        KeyboardUtils.m6036h(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m51863n(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m51864o(DialogFragmentHelper dialogFragmentHelper, BaseViewHolder baseViewHolder, String str, String str2, long j11) {
        dialogFragmentHelper.dismiss();
        CheckBox checkBox = (CheckBox) baseViewHolder.getView(R$id.cbNotShowAgain);
        if (checkBox != null && checkBox.isChecked()) {
            C46392a.m102328k(QuoteKV.f42044a.m52051k(), true);
        }
        m51871v(str, str2, j11);
        return Unit.INSTANCE;
    }
}
