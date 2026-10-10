package com.kubi.margin.delegation;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.menu.more.MoreDialogSectionTab;
import com.kubi.core.utils.C12464c;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$font;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.R$string;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.helper.DepositTransferDialogHelper;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import f30.C37330a;
import gf.C37886j;
import gf.C37890n;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p830zf.InterfaceC46789b0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v30.C45375c0;
import v30.C45377d0;

/* JADX INFO: renamed from: com.kubi.margin.delegation.i0 */
/* JADX INFO: compiled from: MarginTradeGuideExt.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a*\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0002H\u0000\u001a\u0016\u0010\f\u001a\u00020\r*\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0002\u001a(\u0010\u0011\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\f\u0010\u0013\u001a\u00020\r*\u00020\u0014H\u0002¨\u0006\u0015"}, m90084d2 = {"showGuideAddFundsLayout", "", "Lcom/kubi/margin/delegation/MarginDelegationChildFragment;", "totalBalance", "", FirebaseAnalytics.Param.CURRENCY, "", "showGuideTradeLayout", "availableBalanceDisplayStr", "currencyName", "getMinQuoteSize", "Ljava/math/BigDecimal;", "matchMiniTradeQuoteSize", "", "availableBalance", "showGuideLayout", "isTrade", "getBalanceDisplayStr", "balance", "supportGuideAddFundMode", "", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginTradeGuideExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginTradeGuideExt.kt\ncom/kubi/margin/delegation/MarginTradeGuideExtKt\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n17#2,2:158\n1#3:160\n*S KotlinDebug\n*F\n+ 1 MarginTradeGuideExt.kt\ncom/kubi/margin/delegation/MarginTradeGuideExtKt\n*L\n58#1:158,2\n*E\n"})
public final class C17549i0 {
    /* JADX INFO: renamed from: d */
    public static final String m38176d(MarginDelegationChildFragment marginDelegationChildFragment, BigDecimal bigDecimal, String str, String str2) {
        String strM85578b = C37886j.m85578b(bigDecimal, str, null, false, false, false, 0, null, 0, 254, null);
        String string = marginDelegationChildFragment.getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return C42828b.m93906g(C27041f.m66669i(strM85578b, string), C27041f.m66668h(str2), true, false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final BigDecimal m38177e(@NotNull MarginDelegationChildFragment marginDelegationChildFragment) {
        BigDecimal bigDecimalValueOf;
        Intrinsics.checkNotNullParameter(marginDelegationChildFragment, "<this>");
        Fragment parentFragment = marginDelegationChildFragment.getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        BaseMarginFragment baseMarginFragment = parentFragment2 instanceof BaseMarginFragment ? (BaseMarginFragment) parentFragment2 : null;
        if (baseMarginFragment != null && (bigDecimalValueOf = BigDecimal.valueOf(C37890n.f85269a.m85618z(baseMarginFragment.mo39722N().getQuoteCurrency()))) != null) {
            return bigDecimalValueOf;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m38178f(@NotNull MarginDelegationChildFragment marginDelegationChildFragment, @Nullable BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(marginDelegationChildFragment, "<this>");
        return bigDecimal != null && bigDecimal.compareTo(m38177e(marginDelegationChildFragment)) >= 0;
    }

    /* JADX INFO: renamed from: g */
    public static final void m38179g(@NotNull final MarginDelegationChildFragment marginDelegationChildFragment, @Nullable CharSequence charSequence, @Nullable final String str) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        Intrinsics.checkNotNullParameter(marginDelegationChildFragment, "<this>");
        m38182j(marginDelegationChildFragment, false);
        if (charSequence == null) {
            charSequence = marginDelegationChildFragment.getString(R$string.stub);
            Intrinsics.checkNotNullExpressionValue(charSequence, "getString(...)");
        }
        C45375c0 c45375c0M38073o4 = marginDelegationChildFragment.m38073o4();
        if (c45375c0M38073o4 != null && (baseTextView6 = c45375c0M38073o4.f102035c) != null) {
            baseTextView6.setText(marginDelegationChildFragment.getStringRes(R$string.kc_trade_brand_opt_available, charSequence));
        }
        C45375c0 c45375c0M38073o5 = marginDelegationChildFragment.m38073o4();
        if (c45375c0M38073o5 != null && (baseTextView5 = c45375c0M38073o5.f102036d) != null) {
            ViewExtKt.m66594y(baseTextView5);
        }
        C45375c0 c45375c0M38073o6 = marginDelegationChildFragment.m38073o4();
        if (c45375c0M38073o6 != null && (baseTextView4 = c45375c0M38073o6.f102036d) != null) {
            ViewExtKt.m66575f(baseTextView4, new Function1() { // from class: com.kubi.margin.delegation.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17549i0.m38180h(marginDelegationChildFragment, str, (View) obj);
                }
            });
        }
        C45375c0 c45375c0M38073o7 = marginDelegationChildFragment.m38073o4();
        if (c45375c0M38073o7 != null && (baseTextView3 = c45375c0M38073o7.f102037e) != null) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46789b0.class, SiteInfoManager.f47913a.m58109c());
            C37330a.m83912d(baseTextView3, objM56186h != null ? ((InterfaceC46789b0) objM56186h).mo103116a() : false);
        }
        C45375c0 c45375c0M38073o8 = marginDelegationChildFragment.m38073o4();
        if (c45375c0M38073o8 != null && (baseTextView2 = c45375c0M38073o8.f102037e) != null) {
            baseTextView2.setText(marginDelegationChildFragment.getString(R$string.kc_trade_brand_opt_margin_tutorial));
        }
        C45375c0 c45375c0M38073o9 = marginDelegationChildFragment.m38073o4();
        if (c45375c0M38073o9 == null || (baseTextView = c45375c0M38073o9.f102037e) == null) {
            return;
        }
        ViewExtKt.m66575f(baseTextView, new Function1() { // from class: com.kubi.margin.delegation.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17549i0.m38181i(marginDelegationChildFragment, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m38180h(MarginDelegationChildFragment marginDelegationChildFragment, String str, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = marginDelegationChildFragment.getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        BaseMarginFragment baseMarginFragment = parentFragment2 instanceof BaseMarginFragment ? (BaseMarginFragment) parentFragment2 : null;
        if (baseMarginFragment == null) {
            return Unit.INSTANCE;
        }
        AccountType accountType = baseMarginFragment.mo39705A0() == 2 ? AccountType.ISOLATED : AccountType.MARGIN;
        DepositTransferDialogHelper depositTransferDialogHelper = DepositTransferDialogHelper.f50572a;
        AccountType accountType2 = AccountType.MAIN;
        SymbolInfoEntity symbolInfoEntityMo39722N = baseMarginFragment.mo39722N();
        FragmentManager childFragmentManager = baseMarginFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        depositTransferDialogHelper.m61802d(accountType2, accountType, str, false, symbolInfoEntityMo39722N, childFragmentManager, (64 & 64) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m38181i(MarginDelegationChildFragment marginDelegationChildFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = marginDelegationChildFragment.getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        BaseMarginFragment baseMarginFragment = parentFragment2 instanceof BaseMarginFragment ? (BaseMarginFragment) parentFragment2 : null;
        if (baseMarginFragment != null) {
            baseMarginFragment.m39710C6(MoreDialogSectionTab.b.f20521a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m38183k(@NotNull final MarginDelegationChildFragment marginDelegationChildFragment, @Nullable CharSequence charSequence, @Nullable String str, @Nullable String str2) {
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ImageView imageView;
        ImageView imageView2;
        Intrinsics.checkNotNullParameter(marginDelegationChildFragment, "<this>");
        m38182j(marginDelegationChildFragment, true);
        C45377d0 c45377d0M38074p4 = marginDelegationChildFragment.m38074p4();
        if (c45377d0M38074p4 != null && (imageView2 = c45377d0M38074p4.f102042c) != null) {
            imageView2.setLayoutDirection(0);
        }
        C45377d0 c45377d0M38074p5 = marginDelegationChildFragment.m38074p4();
        if (c45377d0M38074p5 != null && (imageView = c45377d0M38074p5.f102042c) != null) {
            imageView.setImageResource(R$mipmap.kc_margin_trade_guide_icon);
        }
        C45377d0 c45377d0M38074p6 = marginDelegationChildFragment.m38074p4();
        if (c45377d0M38074p6 != null && (baseTextView2 = c45377d0M38074p6.f102043d) != null) {
            int i11 = R$string.kc_trade_brand_opt_available;
            if (charSequence == null) {
                charSequence = marginDelegationChildFragment.getString(R$string.stub);
                Intrinsics.checkNotNullExpressionValue(charSequence, "getString(...)");
            }
            baseTextView2.setText(marginDelegationChildFragment.getStringRes(i11, charSequence));
        }
        C45377d0 c45377d0M38074p7 = marginDelegationChildFragment.m38074p4();
        if (c45377d0M38074p7 != null && (baseTextView = c45377d0M38074p7.f102044e) != null) {
            C12464c.m23404a(baseTextView, R$string.kc_trade_brand_opt_welcome_to_margin_trade, m38176d(marginDelegationChildFragment, m38177e(marginDelegationChildFragment), str, str2), ResourcesCompat.getFont(baseTextView.getContext(), R$font.medium), ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        }
        C45377d0 c45377d0M38074p8 = marginDelegationChildFragment.m38074p4();
        if (c45377d0M38074p8 == null || (kcPrimaryButton = c45377d0M38074p8.f102041b) == null) {
            return;
        }
        ViewExtKt.m66575f(kcPrimaryButton, new Function1() { // from class: com.kubi.margin.delegation.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17549i0.m38184l(marginDelegationChildFragment, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m38184l(MarginDelegationChildFragment marginDelegationChildFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = marginDelegationChildFragment.getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        BaseMarginFragment baseMarginFragment = parentFragment2 instanceof BaseMarginFragment ? (BaseMarginFragment) parentFragment2 : null;
        if (baseMarginFragment != null) {
            BaseMarginFragment.m39685t6(baseMarginFragment, 0, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m38182j(MarginDelegationChildFragment marginDelegationChildFragment, boolean z11) {
        ConstraintLayout root;
        ConstraintLayout root2;
        int i11;
        C45375c0 c45375c0M38073o4 = marginDelegationChildFragment.m38073o4();
        int i12 = 8;
        if (c45375c0M38073o4 != null && (root2 = c45375c0M38073o4.getRoot()) != null) {
            if (!z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            root2.setVisibility(i11);
        }
        C45377d0 c45377d0M38074p4 = marginDelegationChildFragment.m38074p4();
        if (c45377d0M38074p4 != null && (root = c45377d0M38074p4.getRoot()) != null) {
            if (z11) {
                i12 = 0;
            }
            root.setVisibility(i12);
        }
    }
}
