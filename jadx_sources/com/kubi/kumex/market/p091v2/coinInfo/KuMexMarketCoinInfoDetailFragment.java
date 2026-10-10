package com.kubi.kumex.market.p091v2.coinInfo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfo;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfoParagraph;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36844t2;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexMarketCoinInfoDetailFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoDetailFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentMarketCoinInfoDetailBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentMarketCoinInfoDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mCoin", "", "getMCoin", "()Ljava/lang/String;", "mCoin$delegate", "Lkotlin/Lazy;", "mData", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", "getMData", "()Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", "mData$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexMarketCoinInfoDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexMarketCoinInfoDetailFragment.kt\ncom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n147#2,16:90\n1869#3,2:106\n*S KotlinDebug\n*F\n+ 1 KuMexMarketCoinInfoDetailFragment.kt\ncom/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoDetailFragment\n*L\n35#1:90,16\n54#1:106,2\n*E\n"})
public final class KuMexMarketCoinInfoDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f29705X = {Reflection.property1(new PropertyReference1Impl(KuMexMarketCoinInfoDetailFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentMarketCoinInfoDetailBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29706U = C45681e.m100799e(this, new Function1<KuMexMarketCoinInfoDetailFragment, C36844t2>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36844t2 invoke(@NotNull KuMexMarketCoinInfoDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36844t2.m82553a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36844t2, Unit>() { // from class: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36844t2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36844t2 c36844t2) {
            invoke(c36844t2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29707V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketCoinInfoDetailFragment.m34996p3(this.f29728b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29708W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketCoinInfoDetailFragment.m34997q3(this.f29733b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.KuMexMarketCoinInfoDetailFragment$a */
    /* JADX INFO: compiled from: KuMexMarketCoinInfoDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/market/v2/coinInfo/KuMexMarketCoinInfoDetailFragment$onViewCreated$2$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16371a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MarketCoinInfoParagraph f29709b;

        public C16371a(MarketCoinInfoParagraph marketCoinInfoParagraph) {
            this.f29709b = marketCoinInfoParagraph;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            String href = this.f29709b.getHref();
            if (href == null || href.length() == 0) {
                return;
            }
            InterfaceC37766r.a.m85190a(C37304a.f82764a, this.f29709b.getHref(), null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(C27017c.f54310a.m66512a(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final C36844t2 m34999m3() {
        return (C36844t2) this.f29706U.getValue(this, f29705X[0]);
    }

    /* JADX INFO: renamed from: n3 */
    public final String m35000n3() {
        return (String) this.f29707V.getValue();
    }

    /* JADX INFO: renamed from: o3 */
    public final MarketCoinInfo m35001o3() {
        return (MarketCoinInfo) this.f29708W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_market_coin_info_detail, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        List<MarketCoinInfoParagraph> currencyIntroduction;
        BaseTextView baseTextView3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TitleBar titleBar = getTitleBar();
        StringBuilder sb2 = new StringBuilder();
        MarketCoinInfo marketCoinInfoM35001o3 = m35001o3();
        sb2.append(C27041f.m66668h(marketCoinInfoM35001o3 != null ? marketCoinInfoM35001o3.getCoinName() : null));
        sb2.append('(');
        sb2.append(C27041f.m66668h(m35000n3()));
        sb2.append(')');
        titleBar.setTitle(sb2.toString());
        C36844t2 c36844t2M34999m3 = m34999m3();
        if (c36844t2M34999m3 != null && (baseTextView3 = c36844t2M34999m3.f81070c) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexMarketCoinInfoDetailFragment.m34998r3(this.f29727b);
                }
            }, 1, null);
        }
        C27096v0 c27096v0 = new C27096v0();
        MarketCoinInfo marketCoinInfoM35001o4 = m35001o3();
        if (marketCoinInfoM35001o4 != null && (currencyIntroduction = marketCoinInfoM35001o4.getCurrencyIntroduction()) != null) {
            for (MarketCoinInfoParagraph marketCoinInfoParagraph : currencyIntroduction) {
                String type = marketCoinInfoParagraph != null ? marketCoinInfoParagraph.getType() : null;
                if (type != null) {
                    switch (type.hashCode()) {
                        case -767963127:
                            if (type.equals("RICHTEXT")) {
                                C27096v0 c27096v0Append = c27096v0.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                String text = marketCoinInfoParagraph.getText();
                                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis));
                                Context context = view.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                c27096v0Append.m66903c(text, foregroundColorSpan, new AbsoluteSizeSpan((int) C27025c.m66568f(context, 16))).append("\n\n").append(CoinInfoHelper.f29724a.m35062j(marketCoinInfoParagraph.getSubText()));
                            }
                            break;
                        case 2336762:
                            if (type.equals("LINK")) {
                                c27096v0.m66903c(marketCoinInfoParagraph.getText(), new C16371a(marketCoinInfoParagraph));
                            }
                            break;
                        case 2571565:
                            if (type.equals("TEXT")) {
                                c27096v0.append(marketCoinInfoParagraph.getText());
                            }
                            break;
                        case 2672714:
                            if (type.equals("WRAP")) {
                                c27096v0.append("\n\n");
                            }
                            break;
                        case 79833656:
                            if (type.equals("TITLE")) {
                                C27096v0 c27096v0Append2 = c27096v0.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                String text2 = marketCoinInfoParagraph.getText();
                                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis));
                                Context context2 = view.getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                c27096v0Append2.m66903c(text2, foregroundColorSpan2, new AbsoluteSizeSpan((int) C27025c.m66568f(context2, 16))).append("\n\n");
                            }
                            break;
                    }
                }
            }
        }
        C36844t2 c36844t2M34999m4 = m34999m3();
        if (c36844t2M34999m4 != null && (baseTextView2 = c36844t2M34999m4.f81069b) != null) {
            baseTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C36844t2 c36844t2M34999m5 = m34999m3();
        if (c36844t2M34999m5 == null || (baseTextView = c36844t2M34999m5.f81069b) == null) {
            return;
        }
        baseTextView.setText(c27096v0);
    }

    /* JADX INFO: renamed from: p3 */
    public static final String m34996p3(KuMexMarketCoinInfoDetailFragment kuMexMarketCoinInfoDetailFragment) {
        Bundle arguments = kuMexMarketCoinInfoDetailFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "coin");
        }
        return null;
    }

    /* JADX INFO: renamed from: q3 */
    public static final MarketCoinInfo m34997q3(KuMexMarketCoinInfoDetailFragment kuMexMarketCoinInfoDetailFragment) {
        Bundle arguments = kuMexMarketCoinInfoDetailFragment.getArguments();
        if (arguments != null) {
            return (MarketCoinInfo) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m34998r3(KuMexMarketCoinInfoDetailFragment kuMexMarketCoinInfoDetailFragment) {
        kuMexMarketCoinInfoDetailFragment.preformBackPressed();
        return Unit.INSTANCE;
    }
}
