package com.kubi.search.utils;

import android.text.style.BackgroundColorSpan;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.KeyboardUtils;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.search.R$color;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.R$string;
import com.kubi.search.SearchActivity;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.exception.SearchException;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.wallet.api.IWalletService;
import f00.C37304a;
import g00.InterfaceC37752d;
import gf.C37886j;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: SearchEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0000¢\u0006\u0002\u0010\b\u001a\b\u0010\t\u001a\u00020\nH\u0000\u001a\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0000\u001a\u001e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u0015H\u0000\u001a\b\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\b\u0010\u001d\u001a\u00020\u001cH\u0000\u001a\u001a\u0010\u001e\u001a\u00020\u0006*\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0000\u001a\f\u0010 \u001a\u00020\u000e*\u00020!H\u0000\u001a\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0002\u001a\u001f\u0010%\u001a\u00020\u000e*\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\u0010(\u001a\u000e\u0010)\u001a\u00020\u0006*\u0004\u0018\u00010\u000eH\u0000\u001a\u0010\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000e\u001a\u000e\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u000e\u001a\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000eH\u0002\u001a\f\u00100\u001a\u00020\u001c*\u000201H\u0000\"\u001a\u0010\u0016\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00062"}, m90084d2 = {"launchIO", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "getKeywordBgColor", "", "keywordsTheSameHighlight", "Lcom/kubi/utils/StyledText;", "chainToken", "", "highlights", "", "keywordsHighlight", "currencyName", "styledTextForSpot", "jump", "Lcom/kubi/search/entity/ExtendEntity;", "fromWhere", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "(Ljava/lang/String;)V", "searchForTradePair", "", "enableWeb3Result", "goMarketFuture", "spmId", "formatSearchCount", "Ljava/math/BigDecimal;", "maxOneScale", "value", "divisor", "dealPrice", "", "coinOrSymbol", "(Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/String;", "log", "checkWeb3AlertDialogAndJump", "web3Route", "jumpAlphaKline", "tokenBridgeId", "jumpWeb3CoinDetail", "web3RouteUrl", "scrollToTop", "Landroidx/recyclerview/widget/RecyclerView;", "SearchLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchEx.kt\ncom/kubi/search/utils/SearchExKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,367:1\n47#2,4:368\n1869#3,2:372\n1869#3,2:374\n135#4,2:376\n126#4,2:378\n*S KotlinDebug\n*F\n+ 1 SearchEx.kt\ncom/kubi/search/utils/SearchExKt\n*L\n62#1:368,4\n177#1:372,2\n186#1:374,2\n311#1:376,2\n326#1:378,2\n*E\n"})
public final class SearchExKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static String f49140a = "HOME";

    /* JADX INFO: renamed from: com.kubi.search.utils.SearchExKt$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SearchEx.kt\ncom/kubi/search/utils/SearchExKt\n+ 3 SearchIssue.kt\ncom/kubi/search/exception/SearchIssueKt\n*L\n1#1,49:1\n63#2:50\n64#2:53\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 SearchEx.kt\ncom/kubi/search/utils/SearchExKt\n*L\n63#1:51,2\n*E\n"})
    public static final class C24500a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new SearchException(exception, "SearchExt", false, null, 8, null), null, 2, null);
        }

        public C24500a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m59507A() {
        C5258a.m6119b(SearchActivity.class);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final C27096v0 m59508B(@NotNull String currencyName, @NotNull List<String> highlights) {
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        return m59518L(highlights, currencyName);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final C27096v0 m59509C(@NotNull String chainToken, @NotNull List<String> highlights) {
        Intrinsics.checkNotNullParameter(chainToken, "chainToken");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        if (!highlights.contains(chainToken)) {
            C27096v0 c27096v0Append = new C27096v0().append(chainToken);
            Intrinsics.checkNotNullExpressionValue(c27096v0Append, "append(...)");
            return c27096v0Append;
        }
        C27096v0 c27096v0Append2 = new C27096v0().append(chainToken);
        c27096v0Append2.setSpan(new BackgroundColorSpan(m59538t()), 0, chainToken.length(), 33);
        Intrinsics.checkNotNullExpressionValue(c27096v0Append2, "apply(...)");
        return c27096v0Append2;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public static final InterfaceC41775x1 m59510D(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(interfaceC41709m0, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return C41696j.m91104d(interfaceC41709m0, C42911a.m94120b().plus(new C24500a(CoroutineExceptionHandler.INSTANCE)), null, new SearchExKt$launchIO$2(block, null), 2, null);
    }

    /* JADX INFO: renamed from: E */
    public static final void m59511E(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        C44128b.m97259c("MainSearch", str);
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m59513G(@NotNull final RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        return recyclerView.post(new Runnable() { // from class: com.kubi.search.utils.o
            @Override // java.lang.Runnable
            public final void run() {
                SearchExKt.m59514H(recyclerView);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static final void m59514H(final RecyclerView recyclerView) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.utils.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchExKt.m59515I(recyclerView);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m59516J() {
        return !Intrinsics.areEqual(f49140a, "HOME");
    }

    /* JADX INFO: renamed from: K */
    public static final void m59517K(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f49140a = str;
    }

    /* JADX INFO: renamed from: L */
    public static final C27096v0 m59518L(List<String> list, String str) {
        ArrayList<Pair> arrayList = new ArrayList();
        for (String str2 : list) {
            String str3 = str;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str3, str2, 0, true, 2, (Object) null);
            if (iIndexOf$default >= 0) {
                arrayList.add(TuplesKt.m90091to(Integer.valueOf(iIndexOf$default), Integer.valueOf(str2.length() + iIndexOf$default)));
            }
            str = str3;
        }
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(str);
        for (Pair pair : arrayList) {
            c27096v0.setSpan(new BackgroundColorSpan(m59538t()), ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 33);
        }
        return c27096v0;
    }

    /* JADX INFO: renamed from: k */
    public static final void m59529k(@Nullable final String str) {
        if (str == null) {
            return;
        }
        if (!IWalletService.f54542a.get().mo66941a()) {
            ToastCompat.m66437C(R$string.kc_web3_not_support);
            return;
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.search.utils.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchExKt.m59533o((FragmentActivity) obj);
            }
        });
        if (C46392a.m102322d(SearchKV.f49147a.m59589a(), false)) {
            m59543y(str);
        } else {
            C42899b.m94076f(DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.search_dialog_web3_alert, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.search.utils.i
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchExKt.m59530l(str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            }), "search_dialog_web3_alert");
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m59530l(final String str, final BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_left_btn);
        if (textView != null) {
            textView.setText(R$string.kc_platform_search_web3_alert_cancel);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.search.utils.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchExKt.m59531m(helper);
                }
            }, 1, null);
        }
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_right_btn);
        if (textView2 != null) {
            textView2.setText(R$string.kc_platform_search_web3_alert_continue);
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.search.utils.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchExKt.m59532n(helper, viewHolder, str);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m59533o(final FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.utils.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchExKt.m59534p(it);
            }
        });
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final String m59535q(@Nullable Double d11, @Nullable String str) {
        BigDecimal bigDecimalM66671k;
        return (d11 == null || (bigDecimalM66671k = C27041f.m66671k(d11.toString())) == null) ? "--" : C37886j.m85579c(bigDecimalM66671k, str, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m59536r() {
        return (Intrinsics.areEqual(f49140a, "HOME") || Intrinsics.areEqual(f49140a, "MARKET")) && C24129b.m58030b(SiteVisibleConfigKey.Web3Wallet);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final String m59537s(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimal2 = new BigDecimal(1000);
        BigDecimal bigDecimal3 = new BigDecimal(1000000);
        BigDecimal bigDecimal4 = new BigDecimal(1000000000);
        BigDecimal bigDecimal5 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal5) < 0) {
            return "--";
        }
        BigDecimal bigDecimal6 = BigDecimal.ONE;
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimal.compareTo(bigDecimalSubtract) <= 0 && bigDecimal.compareTo(bigDecimal5) >= 0) {
            String plainString = bigDecimal.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            return plainString;
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(bigDecimal6);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            if (bigDecimal.compareTo(bigDecimalSubtract2) <= 0) {
                return m59512F(bigDecimal, bigDecimal2).toPlainString() + "K+";
            }
        }
        if (bigDecimal.compareTo(bigDecimal3) >= 0) {
            BigDecimal bigDecimalSubtract3 = bigDecimal4.subtract(bigDecimal6);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
            if (bigDecimal.compareTo(bigDecimalSubtract3) <= 0) {
                return m59512F(bigDecimal, bigDecimal3).toPlainString() + "M+";
            }
        }
        return m59512F(bigDecimal, bigDecimal4).toPlainString() + "B+";
    }

    /* JADX INFO: renamed from: t */
    public static final int m59538t() {
        return DayNightThemeManager.f28592a.m33187l() ? C27017c.f54310a.m66512a(R$color.c_aaffd6) : C27017c.f54310a.m66512a(R$color.brandGreen40);
    }

    /* JADX INFO: renamed from: u */
    public static final void m59539u(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        InterfaceC37752d.a.m85122a(C37304a.f82764a, str, str2, null, null, 12, null);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static final Object m59540v(@NotNull final ExtendEntity extendEntity) {
        Intrinsics.checkNotNullParameter(extendEntity, "<this>");
        final String jumpUrl = extendEntity.getJumpUrl();
        if (jumpUrl == null) {
            return null;
        }
        if (!EarnProductCategory.DUAL.nameEqual(extendEntity.getProductCategory())) {
            IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.search.utils.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchExKt.m59541w(extendEntity, jumpUrl);
                }
            }, 1, (Object) null);
            return Unit.INSTANCE;
        }
        return Boolean.valueOf(Router.f46192a.m56184f(HostManager.a.m() + jumpUrl).m4048k());
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m59541w(ExtendEntity extendEntity, String str) {
        if (EarnProductCategory.B2C_LENDING.nameEqual(extendEntity.getProductCategory())) {
            Router.f46192a.m56184f(str).m4048k();
        } else {
            Router.f46192a.m56184f(HostManager.a.m() + str).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m59542x(@NotNull String tokenBridgeId) {
        Intrinsics.checkNotNullParameter(tokenBridgeId, "tokenBridgeId");
        IQuoteFacadeService.f41383a.get().mo50709l(tokenBridgeId);
    }

    /* JADX INFO: renamed from: y */
    public static final void m59543y(final String str) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.utils.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchExKt.m59544z(str);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static final BigDecimal m59512F(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2);
        BigDecimal bigDecimalM11724a = C6447a.m11724a(bigDecimalDivide.setScale(RangesKt.coerceAtMost(bigDecimalDivide.scale(), 2), RoundingMode.DOWN));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return bigDecimalM11724a;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m59515I(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m59531m(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m59532n(DialogFragmentHelper dialogFragmentHelper, BaseViewHolder baseViewHolder, String str) {
        dialogFragmentHelper.dismiss();
        CheckBox checkBox = (CheckBox) baseViewHolder.getView(R$id.cbNotShowAgain);
        if (checkBox != null && checkBox.isChecked()) {
            C46392a.m102328k(SearchKV.f49147a.m59589a(), true);
        }
        m59543y(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m59534p(FragmentActivity fragmentActivity) {
        KeyboardUtils.m6036h(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m59544z(String str) {
        RouteExKt.m56217H(str);
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.utils.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchExKt.m59507A();
            }
        });
        return Unit.INSTANCE;
    }
}
