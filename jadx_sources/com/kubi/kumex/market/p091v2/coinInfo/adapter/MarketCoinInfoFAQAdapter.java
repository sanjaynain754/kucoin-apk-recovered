package com.kubi.kumex.market.p091v2.coinInfo.adapter;

import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.market.p091v2.coinInfo.CoinInfoHelper;
import com.kubi.kumex.market.p091v2.coinInfo.adapter.MarketCoinInfoFAQAdapter;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfoFAQ;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfoParagraph;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketCoinInfoFAQAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoFAQAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfoFAQ;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "mExpandedPosition", "", "mPreviousExpandedPosition", "mCacheAnswer", "", "", "Lcom/kubi/utils/StyledText;", "convert", "", "helper", "item", "getCacheAnswer", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketCoinInfoFAQAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoFAQAdapter.kt\ncom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoFAQAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1869#2,2:102\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoFAQAdapter.kt\ncom/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoFAQAdapter\n*L\n71#1:102,2\n*E\n"})
public final class MarketCoinInfoFAQAdapter extends BaseQuickAdapter<MarketCoinInfoFAQ, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public int f29719i;

    /* JADX INFO: renamed from: j */
    public int f29720j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public Map<String, C27096v0> f29721k;

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.adapter.MarketCoinInfoFAQAdapter$a */
    /* JADX INFO: compiled from: MarketCoinInfoFAQAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/market/v2/coinInfo/adapter/MarketCoinInfoFAQAdapter$getCacheAnswer$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16388a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MarketCoinInfoParagraph f29722b;

        public C16388a(MarketCoinInfoParagraph marketCoinInfoParagraph) {
            this.f29722b = marketCoinInfoParagraph;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            String href = this.f29722b.getHref();
            if (href == null || href.length() == 0) {
                return;
            }
            InterfaceC37766r.a.m85190a(C37304a.f82764a, this.f29722b.getHref(), null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(C27017c.f54310a.m66512a(R$color.primary));
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable final BaseViewHolder baseViewHolder, @Nullable MarketCoinInfoFAQ marketCoinInfoFAQ) {
        if (baseViewHolder == null || marketCoinInfoFAQ == null) {
            return;
        }
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_question);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_answer);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_icon);
        View view = baseViewHolder.getView(R$id.dividerView);
        textView.setText(marketCoinInfoFAQ.getQuestion());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(m35052j(marketCoinInfoFAQ));
        if (baseViewHolder.getAdapterPosition() == this.f29719i) {
            this.f29720j = baseViewHolder.getAdapterPosition();
            baseViewHolder.itemView.setActivated(true);
            Intrinsics.checkNotNull(textView2);
            ViewExtKt.m66594y(textView2);
            imageView.setImageResource(R$mipmap.kucoin_icon_up);
        } else {
            baseViewHolder.itemView.setActivated(false);
            Intrinsics.checkNotNull(textView2);
            ViewExtKt.m66577h(textView2);
            imageView.setImageResource(R$mipmap.kucoin_icon_down);
        }
        Intrinsics.checkNotNull(textView);
        Intrinsics.checkNotNull(imageView);
        C27046k.m66681D(new View[]{textView, imageView}, new Function0() { // from class: lm.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketCoinInfoFAQAdapter.m35050i(this.f93691b, baseViewHolder);
            }
        });
        if (baseViewHolder.getAdapterPosition() == getData().size() - 1) {
            Intrinsics.checkNotNull(view);
            C27046k.m66700o(view);
        } else {
            Intrinsics.checkNotNull(view);
            C27046k.m66685H(view);
        }
    }

    public MarketCoinInfoFAQAdapter() {
        super(R$layout.bkumex_item_coin_info_faq_item);
        this.f29721k = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m35050i(MarketCoinInfoFAQAdapter marketCoinInfoFAQAdapter, BaseViewHolder baseViewHolder) {
        marketCoinInfoFAQAdapter.f29719i = marketCoinInfoFAQAdapter.f29719i == baseViewHolder.getAdapterPosition() ? -1 : baseViewHolder.getAdapterPosition();
        marketCoinInfoFAQAdapter.notifyItemChanged(marketCoinInfoFAQAdapter.f29720j);
        marketCoinInfoFAQAdapter.notifyItemChanged(baseViewHolder.getAdapterPosition());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public final C27096v0 m35052j(MarketCoinInfoFAQ marketCoinInfoFAQ) {
        if (this.f29721k.get(marketCoinInfoFAQ.getQuestion()) == null) {
            C27096v0 c27096v0 = new C27096v0();
            List<MarketCoinInfoParagraph> answer = marketCoinInfoFAQ.getAnswer();
            if (answer != null) {
                for (MarketCoinInfoParagraph marketCoinInfoParagraph : answer) {
                    String type = marketCoinInfoParagraph != null ? marketCoinInfoParagraph.getType() : null;
                    if (type != null) {
                        switch (type.hashCode()) {
                            case -767963127:
                                if (type.equals("RICHTEXT")) {
                                    c27096v0.append(CoinInfoHelper.f29724a.m35062j(marketCoinInfoParagraph.getSubText()));
                                }
                                break;
                            case 2336762:
                                if (type.equals("LINK")) {
                                    c27096v0.m66903c(marketCoinInfoParagraph.getText(), new C16388a(marketCoinInfoParagraph));
                                }
                                break;
                            case 2571565:
                                if (type.equals("TEXT")) {
                                    c27096v0.append(marketCoinInfoParagraph.getText());
                                }
                                break;
                            case 2672714:
                                if (type.equals("WRAP")) {
                                    c27096v0.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                }
                                break;
                            case 79833656:
                                if (type.equals("TITLE")) {
                                    c27096v0.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).append(marketCoinInfoParagraph.getText()).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                }
                                break;
                        }
                    }
                }
            }
            this.f29721k.put(marketCoinInfoFAQ.getQuestion(), c27096v0);
        }
        C27096v0 c27096v1 = this.f29721k.get(marketCoinInfoFAQ.getQuestion());
        Intrinsics.checkNotNull(c27096v1);
        return c27096v1;
    }
}
