package com.kubi.margin.market.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
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
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.Tag;
import com.kubi.margin.entity.TagEntity;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43852m;
import p698vp.C45615e;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarginMarketCoinInfoAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0003J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/margin/market/info/MarginMarketCoinInfoAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/margin/market/info/MarketInfoEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "data", "", "<init>", "(Lcom/kubi/sdk/BaseFragment;Ljava/util/List;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "convert", "", "helper", "item", "convertIntro", "convertFAQ", "convertMore", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketCoinInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketCoinInfoAdapter.kt\ncom/kubi/margin/market/info/MarginMarketCoinInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,228:1\n1869#2,2:229\n827#2:236\n855#2,2:237\n827#2:239\n855#2,2:240\n827#2:242\n855#2,2:243\n827#2:245\n855#2,2:246\n774#2:248\n865#2,2:249\n1#3:231\n172#4,2:232\n172#4,2:234\n*S KotlinDebug\n*F\n+ 1 MarginMarketCoinInfoAdapter.kt\ncom/kubi/margin/market/info/MarginMarketCoinInfoAdapter\n*L\n88#1:229,2\n185#1:236\n185#1:237,2\n191#1:239\n191#1:240,2\n197#1:242\n197#1:243,2\n203#1:245\n203#1:246,2\n209#1:248\n209#1:249,2\n159#1:232,2\n164#1:234,2\n*E\n"})
public final class MarginMarketCoinInfoAdapter extends BaseMultiItemQuickAdapter<MarketInfoEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final BaseFragment f33290i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMarketCoinInfoAdapter(@NotNull BaseFragment fragment, @Nullable List<MarketInfoEntity> list) {
        super(list);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f33290i = fragment;
        addItemType(0, R$layout.bmargin_item_coin_info_intro);
        addItemType(1, R$layout.bmargin_item_coin_info_faq);
        addItemType(3, R$layout.bmargin_item_coin_info_more);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m39025m(MarginMarketCoinInfoAdapter marginMarketCoinInfoAdapter, Tag tag, int i11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        C43852m.m96590b("B4candle", "Label", String.valueOf(i11), TuplesKt.m90091to("LabelContent", C27041f.m66668h(tag.getTitle())));
        MarginMarketCoinInfoTagDialog marginMarketCoinInfoTagDialogNewInstance = MarginMarketCoinInfoTagDialog.f33308b0.newInstance(tag);
        FragmentManager childFragmentManager = marginMarketCoinInfoAdapter.f33290i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        marginMarketCoinInfoTagDialogNewInstance.show(childFragmentManager, "coin_info_tag");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m39026n(SuffixTextView suffixTextView, MarketInfoEntity marketInfoEntity, View view) {
        C43852m.m96591c("B4candle", "MoreArticles", null, null, 12, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context context = suffixTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.launch(context, MarginMarketCoinInfoDetailFragment.class, new C27051h().m66724h("coin", marketInfoEntity.getTradeItemBean().getSymbolInfoEntity().getBaseCurrency()).m66721e("data", marketInfoEntity.getInfo()).m66717a());
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m39027p(String url, int i11) {
        Intrinsics.checkNotNullParameter(url, "url");
        C43852m.m96591c("B4candle", "MoreInformation", "5", null, 8, null);
        Router.f46192a.m56184f(url).m4048k();
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
            m39030l(baseViewHolder, marketInfoEntity);
        } else if (f38450c == 1) {
            m39029k(baseViewHolder, marketInfoEntity);
        } else {
            if (f38450c != 3) {
                return;
            }
            m39031o(baseViewHolder, marketInfoEntity);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m39029k(BaseViewHolder baseViewHolder, MarketInfoEntity marketInfoEntity) {
        List<MarketCoinInfoFAQ> faqs;
        ConstraintLayout constraintLayout = (ConstraintLayout) baseViewHolder.getView(R$id.cl_root);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.f32665rv);
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
            MarginMarketCoinInfoFAQAdapter marginMarketCoinInfoFAQAdapter = new MarginMarketCoinInfoFAQAdapter();
            recyclerView.setAdapter(marginMarketCoinInfoFAQAdapter);
            marginMarketCoinInfoFAQAdapter.replaceData(C27024b.m66560c(info.getFaqs()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0104  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l */
    public final void m39030l(BaseViewHolder baseViewHolder, final MarketInfoEntity marketInfoEntity) {
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
        final SuffixTextView suffixTextView = (SuffixTextView) baseViewHolder.getView(R$id.tv_content);
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
            C45615e.m100704e(linearLayout, mContext, plates, new Function2() { // from class: com.kubi.margin.market.info.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginMarketCoinInfoAdapter.m39025m(this.f33330b, (Tag) obj, ((Integer) obj2).intValue());
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
        BigDecimal bigDecimalM66671k = C27041f.m66671k(info.getMarketCap());
        textView3.setText(C41014a.m89930d(bigDecimalM66671k != null ? new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalM66671k, "USD"))) : null, true));
        textView4.setText(C41014a.m89931e(C27041f.m66671k(info.getMaxSupply()), false, 1, null));
        textView5.setText(C41014a.m89931e(C27041f.m66671k(info.getCirculatingSupply()), false, 1, null));
        BigDecimal bigDecimalM66671k2 = C27041f.m66671k(info.getAth());
        textView6.setText(C27041f.m66669i(bigDecimalM66671k2 != null ? C41014a.m89950x(C41014a.m89940n(bigDecimalM66671k2, "USD"), null, null, 0, false, false, true, false, 95, null) : null, "--"));
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
        SpannableStringBuilder spannableStringBuilderM39123m = MarginCoinInfoHelper.f33327a.m39123m(info.getCurrencyIntroduction(), introFirstTitleIndex);
        if (spannableStringBuilderM39123m.length() == 0) {
            Intrinsics.checkNotNull(suffixTextView);
            ViewExtKt.m66577h(suffixTextView);
            return;
        }
        Intrinsics.checkNotNull(suffixTextView);
        ViewExtKt.m66594y(suffixTextView);
        suffixTextView.setMovementMethod(LinkMovementMethod.getInstance());
        suffixTextView.setText(spannableStringBuilderM39123m);
        suffixTextView.m54794k(info.getIntroTitleNum() > 1);
        suffixTextView.onMoreClick(new View.OnClickListener() { // from class: com.kubi.margin.market.info.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginMarketCoinInfoAdapter.m39026n(suffixTextView, marketInfoEntity, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m39031o(BaseViewHolder baseViewHolder, MarketInfoEntity marketInfoEntity) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List<String> codeAndCommunity;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
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
        ArrayList arrayList5 = null;
        if (info != null && (website = info.getWebsite()) != null) {
            arrayList = new ArrayList();
            for (Object obj : website) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            MarginCoinInfoHelper marginCoinInfoHelper = MarginCoinInfoHelper.f33327a;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            Intrinsics.checkNotNull(linearLayout);
            marginCoinInfoHelper.m39122k(mContext, linearLayout, arrayList, 0);
        } else {
            MarginCoinInfoHelper marginCoinInfoHelper2 = MarginCoinInfoHelper.f33327a;
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            Intrinsics.checkNotNull(linearLayout);
            marginCoinInfoHelper2.m39121j(mContext2, linearLayout);
        }
        if (info != null && (doc = info.getDoc()) != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : doc) {
                String str2 = (String) obj2;
                if (str2 != null && str2.length() != 0) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            MarginCoinInfoHelper marginCoinInfoHelper3 = MarginCoinInfoHelper.f33327a;
            Context mContext3 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
            Intrinsics.checkNotNull(linearLayout2);
            marginCoinInfoHelper3.m39122k(mContext3, linearLayout2, arrayList2, 1);
        } else {
            MarginCoinInfoHelper marginCoinInfoHelper4 = MarginCoinInfoHelper.f33327a;
            Context mContext4 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext4, "mContext");
            Intrinsics.checkNotNull(linearLayout2);
            marginCoinInfoHelper4.m39121j(mContext4, linearLayout2);
        }
        if (info != null && (explorer = info.getExplorer()) != null) {
            arrayList3 = new ArrayList();
            for (Object obj3 : explorer) {
                String str3 = (String) obj3;
                if (str3 != null && str3.length() != 0) {
                    arrayList3.add(obj3);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            MarginCoinInfoHelper marginCoinInfoHelper5 = MarginCoinInfoHelper.f33327a;
            Context mContext5 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext5, "mContext");
            Intrinsics.checkNotNull(linearLayout3);
            marginCoinInfoHelper5.m39122k(mContext5, linearLayout3, arrayList3, 2);
        } else {
            MarginCoinInfoHelper marginCoinInfoHelper6 = MarginCoinInfoHelper.f33327a;
            Context mContext6 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext6, "mContext");
            Intrinsics.checkNotNull(linearLayout3);
            marginCoinInfoHelper6.m39121j(mContext6, linearLayout3);
        }
        if (info != null && (contract = info.getContract()) != null) {
            arrayList4 = new ArrayList();
            for (Object obj4 : contract) {
                String str4 = (String) obj4;
                if (str4 != null && str4.length() != 0) {
                    arrayList4.add(obj4);
                }
            }
        } else {
            arrayList4 = null;
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            MarginCoinInfoHelper marginCoinInfoHelper7 = MarginCoinInfoHelper.f33327a;
            Context mContext7 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext7, "mContext");
            Intrinsics.checkNotNull(linearLayout4);
            marginCoinInfoHelper7.m39120h(mContext7, linearLayout4, arrayList4);
        } else {
            MarginCoinInfoHelper marginCoinInfoHelper8 = MarginCoinInfoHelper.f33327a;
            Context mContext8 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext8, "mContext");
            Intrinsics.checkNotNull(linearLayout4);
            marginCoinInfoHelper8.m39121j(mContext8, linearLayout4);
        }
        if (info != null && (codeAndCommunity = info.getCodeAndCommunity()) != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : codeAndCommunity) {
                String str5 = (String) obj5;
                if (str5 != null) {
                    boolValueOf = Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) AccessToken.DEFAULT_GRAPH_DOMAIN, true));
                } else {
                    boolValueOf = null;
                }
                if (!C27025c.m66566d(boolValueOf)) {
                    if (str5 != null) {
                        boolValueOf2 = Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "twitter", true));
                    } else {
                        boolValueOf2 = null;
                    }
                    if (!C27025c.m66566d(boolValueOf2)) {
                        if (str5 != null) {
                            boolValueOf3 = Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "t.me", true));
                        } else {
                            boolValueOf3 = null;
                        }
                        if (!C27025c.m66566d(boolValueOf3)) {
                            if (str5 != null) {
                                boolValueOf4 = Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "telegram.me", true));
                            } else {
                                boolValueOf4 = null;
                            }
                            if (!C27025c.m66566d(boolValueOf4)) {
                                if (str5 != null) {
                                    boolValueOf5 = Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "medium", true));
                                } else {
                                    boolValueOf5 = null;
                                }
                                if (!C27025c.m66566d(boolValueOf5)) {
                                    if (str5 != null) {
                                        boolValueOf6 = Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "reddit", true));
                                    } else {
                                        boolValueOf6 = null;
                                    }
                                    if (!C27025c.m66566d(boolValueOf6)) {
                                        if (str5 != null) {
                                            boolValueOf7 = Boolean.valueOf(StringsKt.contains((CharSequence) str5, (CharSequence) "github", true));
                                        } else {
                                            boolValueOf7 = null;
                                        }
                                        if (C27025c.m66566d(boolValueOf7)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList6.add(obj5);
            }
            arrayList5 = arrayList6;
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Intrinsics.checkNotNull(flexboxLayout);
            Context mContext9 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext9, "mContext");
            C45615e.m100702c(flexboxLayout, mContext9, arrayList5, new Function2() { // from class: com.kubi.margin.market.info.h
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return MarginMarketCoinInfoAdapter.m39027p((String) obj6, ((Integer) obj7).intValue());
                }
            });
            return;
        }
        MarginCoinInfoHelper marginCoinInfoHelper9 = MarginCoinInfoHelper.f33327a;
        Context mContext10 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext10, "mContext");
        Intrinsics.checkNotNull(flexboxLayout);
        marginCoinInfoHelper9.m39121j(mContext10, flexboxLayout);
    }
}
