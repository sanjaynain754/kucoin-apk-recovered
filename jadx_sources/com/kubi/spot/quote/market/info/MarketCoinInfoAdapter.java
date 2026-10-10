package com.kubi.spot.quote.market.info;

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
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.AccessToken;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.entity.Tag;
import com.kubi.spot.entity.TagEntity;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import f30.C37346q;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43852m;
import p830zf.InterfaceC46829y;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarketCoinInfoAdapter.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0003J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/spot/quote/market/info/MarketInfoEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "symbol", "", "data", "", "<init>", "(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;Ljava/util/List;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getSymbol", "()Ljava/lang/String;", "convert", "", "helper", "item", "convertIntro", "convertFAQ", "convertMore", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketCoinInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,249:1\n1869#2,2:250\n827#2:257\n855#2,2:258\n827#2:260\n855#2,2:261\n827#2:263\n855#2,2:264\n827#2:266\n855#2,2:267\n774#2:269\n865#2,2:270\n1#3:252\n172#4,2:253\n172#4,2:255\n25#5,3:272\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoAdapter.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoAdapter\n*L\n101#1:250,2\n199#1:257\n199#1:258,2\n205#1:260\n205#1:261,2\n211#1:263\n211#1:264,2\n217#1:266\n217#1:267,2\n223#1:269\n223#1:270,2\n173#1:253,2\n178#1:255,2\n109#1:272,3\n*E\n"})
public final class MarketCoinInfoAdapter extends BaseMultiItemQuickAdapter<MarketInfoEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final BaseFragment f50939i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final String f50940j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinInfoAdapter(@NotNull BaseFragment fragment, @NotNull String symbol, @Nullable List<MarketInfoEntity> list) {
        super(list);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f50939i = fragment;
        this.f50940j = symbol;
        addItemType(0, R$layout.bkucoin_item_coin_info_intro);
        addItemType(1, R$layout.bkucoin_item_coin_info_faq);
        addItemType(3, R$layout.bkucoin_item_coin_info_more);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m62532m(MarketCoinInfoAdapter marketCoinInfoAdapter, Tag tag, int i11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        C43852m.m96590b("B5candle", "Label", String.valueOf(i11), TuplesKt.m90091to("LabelContent", C27041f.m66668h(tag.getTitle())));
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46829y.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            FragmentManager childFragmentManager = marketCoinInfoAdapter.f50939i.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            ((InterfaceC46829y) objM56186h).m103161a(tag, childFragmentManager, "coin_info_tag");
        } else {
            MarketCoinInfoTagDialog marketCoinInfoTagDialogNewInstance = MarketCoinInfoTagDialog.f50960b0.newInstance(tag);
            FragmentManager childFragmentManager2 = marketCoinInfoAdapter.f50939i.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            marketCoinInfoTagDialogNewInstance.show(childFragmentManager2, "coin_info_tag");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m62533n(MarketCoinInfoAdapter marketCoinInfoAdapter, MarketInfoEntity marketInfoEntity, View view) {
        C43852m.m96591c("B5candle", "MoreArticles", null, null, 12, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context mContext = marketCoinInfoAdapter.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        companion.launch(mContext, MarketCoinInfoDetailFragment.class, new C27051h().m66724h("coin", marketInfoEntity.getTradeItemBean().getSymbolInfoEntity().getBaseCurrency()).m66721e("data", marketInfoEntity.getInfo()).m66717a());
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m62534p(MarketCoinInfoAdapter marketCoinInfoAdapter, String url, int i11) throws JSONException {
        Intrinsics.checkNotNullParameter(url, "url");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", marketCoinInfoAdapter.f50940j);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5candle", "MoreInformation", "5", jSONObject);
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
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable MarketInfoEntity marketInfoEntity) {
        if (baseViewHolder == null || marketInfoEntity == null) {
            return;
        }
        int f38450c = marketInfoEntity.getF38450c();
        if (f38450c == 0) {
            m62537l(baseViewHolder, marketInfoEntity);
        } else if (f38450c == 1) {
            m62536k(baseViewHolder, marketInfoEntity);
        } else {
            if (f38450c != 3) {
                return;
            }
            m62538o(baseViewHolder, marketInfoEntity);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m62536k(BaseViewHolder baseViewHolder, MarketInfoEntity marketInfoEntity) {
        List<MarketCoinInfoFAQ> faqs;
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.f49578rv);
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

    /* JADX WARN: Code duplicated, block: B:25:0x0104  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l */
    public final void m62537l(BaseViewHolder baseViewHolder, final MarketInfoEntity marketInfoEntity) {
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
        textView.setText(C27041f.m66668h(info.getCoinName()) + '(' + marketInfoEntity.getTradeItemBean().getSymbolInfoEntity().getBaseCurrencyName() + ')');
        TagEntity tags = marketInfoEntity.getTags();
        if (tags != null && (plates = tags.getPlates()) != null) {
            Iterator<T> it = plates.iterator();
            while (it.hasNext()) {
                ((Tag) it.next()).setDisplayType(1);
            }
            Intrinsics.checkNotNull(linearLayout);
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            C37346q.m83936f(linearLayout, mContext, plates, new Function2() { // from class: com.kubi.spot.quote.market.info.i
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarketCoinInfoAdapter.m62532m(this.f50982b, (Tag) obj, ((Integer) obj2).intValue());
                }
            });
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
        SpannableStringBuilder spannableStringBuilderM62627o = CoinInfoHelper.f50977a.m62627o(info.getCurrencyIntroduction(), introFirstTitleIndex);
        if (spannableStringBuilderM62627o.length() == 0) {
            Intrinsics.checkNotNull(suffixTextView);
            ViewExtKt.m66577h(suffixTextView);
            return;
        }
        Intrinsics.checkNotNull(suffixTextView);
        ViewExtKt.m66594y(suffixTextView);
        suffixTextView.setMovementMethod(LinkMovementMethod.getInstance());
        suffixTextView.setText(spannableStringBuilderM62627o);
        suffixTextView.m54794k(info.getIntroTitleNum() > 1);
        suffixTextView.onMoreClick(new View.OnClickListener() { // from class: com.kubi.spot.quote.market.info.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarketCoinInfoAdapter.m62533n(this.f50983b, marketInfoEntity, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m62538o(BaseViewHolder baseViewHolder, MarketInfoEntity marketInfoEntity) {
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
            CoinInfoHelper coinInfoHelper = CoinInfoHelper.f50977a;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            Intrinsics.checkNotNull(linearLayout);
            coinInfoHelper.m62625k(mContext, linearLayout);
        } else {
            CoinInfoHelper coinInfoHelper2 = CoinInfoHelper.f50977a;
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            Intrinsics.checkNotNull(linearLayout);
            CoinInfoHelper.m62621m(coinInfoHelper2, mContext2, linearLayout, arrayList, 0, false, 16, null);
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
            CoinInfoHelper coinInfoHelper3 = CoinInfoHelper.f50977a;
            Context context = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context, str);
            Intrinsics.checkNotNull(linearLayout2);
            coinInfoHelper3.m62625k(context, linearLayout2);
        } else {
            CoinInfoHelper coinInfoHelper4 = CoinInfoHelper.f50977a;
            Context mContext3 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
            Intrinsics.checkNotNull(linearLayout2);
            str = "mContext";
            CoinInfoHelper.m62621m(coinInfoHelper4, mContext3, linearLayout2, arrayList2, 1, false, 16, null);
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
            CoinInfoHelper coinInfoHelper5 = CoinInfoHelper.f50977a;
            Context context2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context2, str);
            Intrinsics.checkNotNull(linearLayout3);
            coinInfoHelper5.m62625k(context2, linearLayout3);
        } else {
            CoinInfoHelper coinInfoHelper6 = CoinInfoHelper.f50977a;
            Context context3 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context3, str);
            Intrinsics.checkNotNull(linearLayout3);
            CoinInfoHelper.m62621m(coinInfoHelper6, context3, linearLayout3, arrayList3, 2, false, 16, null);
        }
        if (info == null || (contract = info.getContract()) == null) {
            arrayList4 = null;
        } else {
            ArrayList arrayList9 = new ArrayList();
            for (Object obj4 : contract) {
                String str5 = (String) obj4;
                if (str5 != null && str5.length() != 0) {
                    arrayList9.add(obj4);
                }
            }
            arrayList4 = arrayList9;
        }
        if (arrayList4 == null || arrayList4.isEmpty()) {
            CoinInfoHelper coinInfoHelper7 = CoinInfoHelper.f50977a;
            Context context4 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context4, str);
            Intrinsics.checkNotNull(linearLayout4);
            coinInfoHelper7.m62625k(context4, linearLayout4);
        } else {
            CoinInfoHelper coinInfoHelper8 = CoinInfoHelper.f50977a;
            Context context5 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(context5, str);
            Intrinsics.checkNotNull(linearLayout4);
            CoinInfoHelper.m62619i(coinInfoHelper8, context5, linearLayout4, arrayList4, false, 8, null);
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
            C37346q.m83934d(flexboxLayout, context6, arrayList5, new Function2() { // from class: com.kubi.spot.quote.market.info.h
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return MarketCoinInfoAdapter.m62534p(this.f50981b, (String) obj6, ((Integer) obj7).intValue());
                }
            });
            return;
        }
        CoinInfoHelper coinInfoHelper9 = CoinInfoHelper.f50977a;
        Context context7 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(context7, str);
        Intrinsics.checkNotNull(flexboxLayout);
        coinInfoHelper9.m62625k(context7, flexboxLayout);
    }
}
