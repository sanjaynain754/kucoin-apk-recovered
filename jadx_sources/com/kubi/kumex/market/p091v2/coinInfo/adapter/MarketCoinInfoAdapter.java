package com.kubi.kumex.market.p091v2.coinInfo.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.AccessToken;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.market.p091v2.coinInfo.C16425x;
import com.kubi.kumex.market.p091v2.coinInfo.CoinInfoHelper;
import com.kubi.kumex.market.p091v2.coinInfo.KuMexMarketCoinInfoDetailFragment;
import com.kubi.kumex.market.p091v2.coinInfo.adapter.MarketCoinInfoAdapter;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfo;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfoFAQ;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfoParagraph;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketInfoEntity;
import com.kubi.kumex.market.p091v2.coinInfo.entity.Tag;
import com.kubi.kumex.market.p091v2.coinInfo.entity.TagEntity;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarketCoinInfoAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0003J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "convertIntro", "convertFAQ", "convertMore", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketCoinInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,224:1\n1869#2,2:225\n827#2:232\n855#2,2:233\n827#2:235\n855#2,2:236\n827#2:238\n855#2,2:239\n827#2:241\n855#2,2:242\n774#2:244\n865#2,2:245\n1#3:227\n172#4,2:228\n172#4,2:230\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoAdapter\n*L\n91#1:225,2\n177#1:232\n177#1:233,2\n183#1:235\n183#1:236,2\n189#1:238\n189#1:239,2\n195#1:241\n195#1:242,2\n201#1:244\n201#1:245,2\n151#1:228,2\n156#1:230,2\n*E\n"})
public final class MarketCoinInfoAdapter extends BaseMultiItemQuickAdapter<MarketInfoEntity, BaseViewHolder> {
    public MarketCoinInfoAdapter() {
        super(null);
        addItemType(0, R$layout.bkumex_item_coin_info_intro);
        addItemType(1, R$layout.bkumex_item_coin_info_faq);
        addItemType(3, R$layout.bkumex_item_coin_info_more);
    }

    /* JADX INFO: renamed from: l */
    public static final void m35043l(MarketInfoEntity marketInfoEntity, View view) {
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.launch(context, KuMexMarketCoinInfoDetailFragment.class, BundleKt.bundleOf(TuplesKt.m90091to("coin", marketInfoEntity.getBaseCurrency()), TuplesKt.m90091to("data", marketInfoEntity.getInfo())));
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m35044n(String url, int i11) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (TextUtils.isEmpty(url)) {
            return Unit.INSTANCE;
        }
        if (!StringsKt.contains$default((CharSequence) url, (CharSequence) "http", false, 2, (Object) null)) {
            url = "https://" + url;
        }
        Router.f46192a.m56184f(StringsKt.trim((CharSequence) url).toString()).m4048k();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable MarketInfoEntity marketInfoEntity) {
        if (baseViewHolder == null || marketInfoEntity == null) {
            return;
        }
        int f38450c = marketInfoEntity.getF38450c();
        if (f38450c == 0) {
            m35047k(baseViewHolder, marketInfoEntity);
        } else if (f38450c == 1) {
            m35046j(baseViewHolder, marketInfoEntity);
        } else {
            if (f38450c != 3) {
                return;
            }
            m35048m(baseViewHolder, marketInfoEntity);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m35046j(BaseViewHolder baseViewHolder, MarketInfoEntity marketInfoEntity) {
        List<MarketCoinInfoFAQ> faqs;
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.f28672rv);
        MarketCoinInfo info = marketInfoEntity.getInfo();
        if (info == null || (faqs = info.getFaqs()) == null || faqs.isEmpty()) {
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66577h(textView);
            Intrinsics.checkNotNull(recyclerView);
            ViewExtKt.m66577h(recyclerView);
            Intrinsics.checkNotNull(constraintLayout);
            ViewExtKt.m66577h(constraintLayout);
            constraintLayout.setPadding(0, 0, 0, 0);
            return;
        }
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66594y(textView);
        Intrinsics.checkNotNull(recyclerView);
        ViewExtKt.m66594y(recyclerView);
        Intrinsics.checkNotNull(constraintLayout);
        ViewExtKt.m66594y(constraintLayout);
        int iM6236a = C5275i0.m6236a(16.0f);
        constraintLayout.setPadding(iM6236a, iM6236a, iM6236a, iM6236a);
        if (recyclerView.getAdapter() == null) {
            C22912t.m54410h(recyclerView, false, 1, null);
            MarketCoinInfoFAQAdapter marketCoinInfoFAQAdapter = new MarketCoinInfoFAQAdapter();
            recyclerView.setAdapter(marketCoinInfoFAQAdapter);
            marketCoinInfoFAQAdapter.replaceData(C27024b.m66560c(info.getFaqs()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ff  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public final void m35047k(BaseViewHolder baseViewHolder, final MarketInfoEntity marketInfoEntity) {
        String str;
        List<Tag> plates;
        MarketCoinInfo info = marketInfoEntity.getInfo();
        if (info == null) {
            return;
        }
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_icon);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_name);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_rank);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_market_value);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.tv_max_supply);
        TextView textView5 = (TextView) baseViewHolder.getView(R$id.tv_circulating);
        TextView textView6 = (TextView) baseViewHolder.getView(R$id.tv_ath);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) baseViewHolder.getView(R$id.ll_expand);
        LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R$id.ll_tag);
        TextView textView7 = (TextView) baseViewHolder.getView(R$id.tv_title);
        SuffixTextView suffixTextView = (SuffixTextView) baseViewHolder.getView(R$id.tv_content);
        String logo = info.getLogo();
        if (logo != null && logo.length() != 0) {
            C24277v.m58540e(imageView.getContext(), info.getLogo(), imageView);
        }
        textView.setText(C27041f.m66668h(info.getCoinName()) + '(' + marketInfoEntity.getBaseCurrency() + ')');
        TagEntity tags = marketInfoEntity.getTags();
        if (tags != null && (plates = tags.getPlates()) != null) {
            Iterator<T> it = plates.iterator();
            while (it.hasNext()) {
                ((Tag) it.next()).setDisplayType(1);
            }
            Intrinsics.checkNotNull(linearLayout);
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            C16425x.m35107f(linearLayout, mContext, plates, null, 4, null);
            Intrinsics.checkNotNull(horizontalScrollView);
            ViewExtKt.m66594y(horizontalScrollView);
        }
        String rank = info.getRank();
        if (rank != null) {
            str = '#' + rank;
            if (str == null) {
                str = "--";
            }
        } else {
            str = "--";
        }
        textView2.setText(str);
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(info.getMarketCap());
        textView3.setText(C41014a.m89930d(bigDecimalM66536f != null ? new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalM66536f, "USD"))) : null, true));
        textView4.setText(C41014a.m89931e(DowngradeExKt.m66536f(info.getMaxSupply()), false, 1, null));
        textView5.setText(C41014a.m89931e(DowngradeExKt.m66536f(info.getCirculatingSupply()), false, 1, null));
        BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(info.getAth());
        textView6.setText(C27041f.m66669i(bigDecimalM66536f2 != null ? C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f2, "USD"), null, null, 0, false, false, true, false, 95, null) : null, "--"));
        List<MarketCoinInfoParagraph> currencyIntroduction = info.getCurrencyIntroduction();
        if (currencyIntroduction == null || currencyIntroduction.isEmpty()) {
            Intrinsics.checkNotNull(textView7);
            ViewExtKt.m66577h(textView7);
            Intrinsics.checkNotNull(suffixTextView);
            ViewExtKt.m66577h(suffixTextView);
            return;
        }
        int introFirstTitleIndex = info.getIntroFirstTitleIndex();
        if (introFirstTitleIndex == -1) {
            Intrinsics.checkNotNull(textView7);
            ViewExtKt.m66577h(textView7);
        } else {
            Intrinsics.checkNotNull(textView7);
            ViewExtKt.m66594y(textView7);
            MarketCoinInfoParagraph marketCoinInfoParagraph = info.getCurrencyIntroduction().get(introFirstTitleIndex);
            textView7.setText(marketCoinInfoParagraph != null ? marketCoinInfoParagraph.getText() : null);
        }
        SpannableStringBuilder spannableStringBuilderM35061i = CoinInfoHelper.f29724a.m35061i(info.getCurrencyIntroduction(), introFirstTitleIndex);
        if (spannableStringBuilderM35061i.length() == 0) {
            Intrinsics.checkNotNull(suffixTextView);
            ViewExtKt.m66577h(suffixTextView);
            return;
        }
        Intrinsics.checkNotNull(suffixTextView);
        ViewExtKt.m66594y(suffixTextView);
        suffixTextView.setMovementMethod(LinkMovementMethod.getInstance());
        suffixTextView.setText(spannableStringBuilderM35061i);
        suffixTextView.m54794k(info.getIntroTitleNum() > 1);
        suffixTextView.onMoreClick(new View.OnClickListener() { // from class: lm.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarketCoinInfoAdapter.m35043l(marketInfoEntity, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m35048m(BaseViewHolder baseViewHolder, MarketInfoEntity marketInfoEntity) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        List<String> codeAndCommunity;
        List<String> contract;
        List<String> explorer;
        List<String> doc;
        List<String> website;
        MarketCoinInfo info = marketInfoEntity.getInfo();
        LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R$id.layout_website);
        LinearLayout linearLayout2 = (LinearLayout) baseViewHolder.getView(R$id.layout_doc);
        LinearLayout linearLayout3 = (LinearLayout) baseViewHolder.getView(R$id.layout_explorer);
        LinearLayout linearLayout4 = (LinearLayout) baseViewHolder.getView(R$id.layout_contract);
        FlexboxLayout flexboxLayout = (FlexboxLayout) baseViewHolder.getView(R$id.layout_community);
        if (info == null || (website = info.getWebsite()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : website) {
                String str2 = (String) obj;
                if (str2 != null && str2.length() != 0) {
                    arrayList6.add(obj);
                }
            }
            arrayList = arrayList6;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            CoinInfoHelper coinInfoHelper = CoinInfoHelper.f29724a;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            Intrinsics.checkNotNull(linearLayout);
            coinInfoHelper.m35059e(mContext, linearLayout);
        } else {
            CoinInfoHelper coinInfoHelper2 = CoinInfoHelper.f29724a;
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            Intrinsics.checkNotNull(linearLayout);
            CoinInfoHelper.m35056g(coinInfoHelper2, mContext2, linearLayout, arrayList, false, 8, null);
        }
        if (info == null || (doc = info.getDoc()) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj2 : doc) {
                String str3 = (String) obj2;
                if (str3 != null && str3.length() != 0) {
                    arrayList7.add(obj2);
                }
            }
            arrayList2 = arrayList7;
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            str = "mContext";
            CoinInfoHelper coinInfoHelper3 = CoinInfoHelper.f29724a;
            Context context = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context, str);
            Intrinsics.checkNotNull(linearLayout2);
            coinInfoHelper3.m35059e(context, linearLayout2);
        } else {
            CoinInfoHelper coinInfoHelper4 = CoinInfoHelper.f29724a;
            Context mContext3 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
            Intrinsics.checkNotNull(linearLayout2);
            str = "mContext";
            CoinInfoHelper.m35056g(coinInfoHelper4, mContext3, linearLayout2, arrayList2, false, 8, null);
        }
        if (info == null || (explorer = info.getExplorer()) == null) {
            arrayList3 = null;
        } else {
            ArrayList arrayList8 = new ArrayList();
            for (Object obj3 : explorer) {
                String str4 = (String) obj3;
                if (str4 != null && str4.length() != 0) {
                    arrayList8.add(obj3);
                }
            }
            arrayList3 = arrayList8;
        }
        if (arrayList3 == null || arrayList3.isEmpty()) {
            CoinInfoHelper coinInfoHelper5 = CoinInfoHelper.f29724a;
            Context context2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context2, str);
            Intrinsics.checkNotNull(linearLayout3);
            coinInfoHelper5.m35059e(context2, linearLayout3);
        } else {
            CoinInfoHelper coinInfoHelper6 = CoinInfoHelper.f29724a;
            Context context3 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context3, str);
            Intrinsics.checkNotNull(linearLayout3);
            CoinInfoHelper.m35056g(coinInfoHelper6, context3, linearLayout3, arrayList3, false, 8, null);
        }
        if (info == null || (contract = info.getContract()) == null) {
            arrayList4 = null;
        } else {
            arrayList4 = new ArrayList();
            for (Object obj4 : contract) {
                String str5 = (String) obj4;
                if (str5 != null && str5.length() != 0) {
                    arrayList4.add(obj4);
                }
            }
        }
        if (arrayList4 == null || arrayList4.isEmpty()) {
            CoinInfoHelper coinInfoHelper7 = CoinInfoHelper.f29724a;
            Context context4 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context4, str);
            Intrinsics.checkNotNull(linearLayout4);
            coinInfoHelper7.m35059e(context4, linearLayout4);
        } else {
            CoinInfoHelper coinInfoHelper8 = CoinInfoHelper.f29724a;
            Context context5 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context5, str);
            Intrinsics.checkNotNull(linearLayout4);
            coinInfoHelper8.m35058c(context5, linearLayout4, arrayList4);
        }
        if (info == null || (codeAndCommunity = info.getCodeAndCommunity()) == null) {
            arrayList5 = null;
        } else {
            arrayList5 = new ArrayList();
            for (Object obj5 : codeAndCommunity) {
                String str6 = (String) obj5;
                if (!C27025c.m66566d(str6 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str6, (CharSequence) AccessToken.DEFAULT_GRAPH_DOMAIN, true)) : null)) {
                    if (!C27025c.m66566d(str6 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str6, (CharSequence) "twitter", true)) : null)) {
                        if (!C27025c.m66566d(str6 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str6, (CharSequence) "t.me", true)) : null)) {
                            if (!C27025c.m66566d(str6 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str6, (CharSequence) "telegram.me", true)) : null)) {
                                if (!C27025c.m66566d(str6 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str6, (CharSequence) "medium", true)) : null)) {
                                    if (!C27025c.m66566d(str6 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str6, (CharSequence) "reddit", true)) : null)) {
                                        if (C27025c.m66566d(str6 != null ? Boolean.valueOf(StringsKt.contains((CharSequence) str6, (CharSequence) "github", true)) : null)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList5.add(obj5);
            }
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Intrinsics.checkNotNull(flexboxLayout);
            Context context6 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context6, str);
            C16425x.m35104c(flexboxLayout, context6, arrayList5, new Function2() { // from class: lm.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return MarketCoinInfoAdapter.m35044n((String) obj6, ((Integer) obj7).intValue());
                }
            });
            return;
        }
        CoinInfoHelper coinInfoHelper9 = CoinInfoHelper.f29724a;
        Context context7 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(context7, str);
        Intrinsics.checkNotNull(flexboxLayout);
        coinInfoHelper9.m35059e(context7, flexboxLayout);
    }
}
