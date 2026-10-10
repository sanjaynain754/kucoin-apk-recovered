package com.kubi.quotefacade.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.adapter.HoldingsListAdapter;
import com.kubi.quotefacade.chain.C21781i;
import com.kubi.quotefacade.entity.HoldingEntity;
import com.kubi.quotefacade.helper.C22212u1;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ChainCoinLogoView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.TradePairFlexboxView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37886j;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41015b;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: HoldingsListAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\tJ\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0014\u0010\u0011\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0014\u0010\u0012\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u001c\u0010\u0013\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/HoldingsListAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/quotefacade/entity/HoldingEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "holdingsType", "", "<init>", "(Ljava/lang/String;)V", "isCombinedHoldingsTab", "", "isNotBindRecyclerView", "convert", "", "helper", "item", "isAlphaItem", "bindCombinedCryptoIcon", "bindCombinedAlphaItemView", "bindDefaultAlphaItemView", "bindAlphaPriceAndRate", "uniqueCode", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HoldingsListAdapter extends BaseMultiItemQuickAdapter<HoldingEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f41052i;

    /* JADX INFO: renamed from: j */
    public final boolean f41053j;

    /* JADX INFO: renamed from: p */
    private final boolean m50208p(HoldingEntity holdingEntity) {
        if (holdingEntity == null) {
            return false;
        }
        String str = this.f41052i;
        if (Intrinsics.areEqual(str, "ALPHA")) {
            return true;
        }
        if (Intrinsics.areEqual(str, "ALL")) {
            return holdingEntity.isAlphaItem();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingsListAdapter(@NotNull String holdingsType) {
        super(new ArrayList());
        Intrinsics.checkNotNullParameter(holdingsType, "holdingsType");
        this.f41052i = holdingsType;
        boolean zAreEqual = Intrinsics.areEqual(holdingsType, "ALL");
        this.f41053j = zAreEqual;
        if (zAreEqual) {
            addItemType(1, R$layout.market_holdings_all_item_view);
            addItemType(2, R$layout.market_holdings_all_alpha_item);
        } else {
            addItemType(1, R$layout.market_holdings_item_view);
            addItemType(2, R$layout.item_list_alpha_coin);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m50209i(BaseViewHolder baseViewHolder, HoldingEntity holdingEntity, String str) {
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tvPrice);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setSameSymbol(Boolean.valueOf(upDownColorTextView.getTag() != null && upDownColorTextView.getTag().equals(str)));
        upDownColorTextView.setTag(str);
        upDownColorTextView.setText(C22212u1.m52119a(holdingEntity.getCurrentPrice()));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvRate);
        if (textView != null) {
            C27046k.m66685H(textView);
            textView.setText(C21781i.m50835a(holdingEntity.getChangeRate(), false));
            double dDoubleValue = C27039d.m66654n(C41014a.m89922G(holdingEntity.getChangeRate(), null, 1, null)).doubleValue();
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView.setBackground(C22890g.m54286k(dDoubleValue, mContext));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m50210j(final BaseViewHolder baseViewHolder, final HoldingEntity holdingEntity) {
        C27100x0.m66923d(new Function0() { // from class: yu.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsListAdapter.m50206k(holdingEntity, baseViewHolder, this);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m50211l(BaseViewHolder baseViewHolder, HoldingEntity holdingEntity) {
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(R$id.coin_icon);
        if (coinAvatarView != null) {
            C24277v.m58542g(coinAvatarView, holdingEntity.getLogoUrl());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m50212m(final BaseViewHolder baseViewHolder, final HoldingEntity holdingEntity) {
        C27100x0.m66923d(new Function0() { // from class: yu.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsListAdapter.m50207n(holdingEntity, baseViewHolder, this);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable HoldingEntity holdingEntity) {
        String strM85579c;
        SpannableStringBuilder spannableStringBuilderM89960g;
        if (baseViewHolder == null || holdingEntity == null) {
            return;
        }
        if (m50208p(holdingEntity)) {
            if (this.f41053j) {
                m50210j(baseViewHolder, holdingEntity);
                return;
            } else {
                m50212m(baseViewHolder, holdingEntity);
                return;
            }
        }
        if (this.f41053j) {
            m50211l(baseViewHolder, holdingEntity);
        }
        CharSequence charSequence = "--";
        baseViewHolder.setText(R$id.tv_trade_pair, Intrinsics.areEqual(this.f41052i, "FUTURES") ? IKuMexService.m33249T(IKuMexService.f28731a.get(), C27041f.m66668h(holdingEntity.getSymbol()), false, 2, null) : C27041f.m66669i(holdingEntity.getDisplayCrypto(), "--"));
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setVisibleToUser(false);
        BigDecimal currentPrice = holdingEntity.getCurrentPrice();
        if (currentPrice == null || (strM85579c = C37886j.m85579c(currentPrice, holdingEntity.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null)) == null) {
            strM85579c = "--";
        }
        upDownColorTextView.setText(strM85579c);
        int i11 = R$id.tv_money_price;
        BigDecimal currentPrice2 = holdingEntity.getCurrentPrice();
        if (currentPrice2 != null && (spannableStringBuilderM89960g = C41015b.m89960g(new BigDecimal(String.valueOf(C41014a.m89940n(currentPrice2, holdingEntity.getQuoteCurrency()))), null, null, 0, 7, null)) != null) {
            charSequence = spannableStringBuilderM89960g;
        }
        baseViewHolder.setText(i11, charSequence);
        BigDecimal changeRate = holdingEntity.getChangeRate();
        String strM92647l = C42180b.m92647l(changeRate != null ? C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(changeRate, null, null, C41014a.m89951y(changeRate), true, false, false, 19, null))) : null);
        int i12 = R$id.tv_change_rate;
        BaseViewHolder text = baseViewHolder.setText(i12, strM92647l);
        Intrinsics.checkNotNullExpressionValue(text, "setText(...)");
        double dM66647g = C27039d.m66647g(holdingEntity.getChangeRate());
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C22890g.m54293r(text, i12, C22890g.m54286k(dM66647g, context));
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m50206k(HoldingEntity holdingEntity, BaseViewHolder baseViewHolder, HoldingsListAdapter holdingsListAdapter) {
        boolean z11;
        boolean z12;
        List<String> alphaMarks;
        BaseTextView tradePairView;
        Context context;
        String uniqueCode = holdingEntity.getUniqueCode();
        ChainCoinLogoView chainCoinLogoView = (ChainCoinLogoView) baseViewHolder.getView(R$id.logoView);
        if (chainCoinLogoView != null) {
            String strM66668h = C27041f.m66668h(holdingEntity.getLogoUrl());
            String strM66668h2 = C27041f.m66668h(holdingEntity.getChainLogo());
            String strM66668h3 = C27041f.m66668h(holdingEntity.getSymbol());
            RecyclerView recyclerView = holdingsListAdapter.getRecyclerView();
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            ChainCoinLogoView.m54460h(chainCoinLogoView, strM66668h, strM66668h2, strM66668h3, null, null, context, 24, null);
        }
        TradePairFlexboxView tradePairFlexboxView = (TradePairFlexboxView) baseViewHolder.getView(R$id.tradePairFlexboxView);
        if (tradePairFlexboxView != null && (tradePairView = tradePairFlexboxView.getTradePairView()) != null) {
            tradePairView.setText(C27041f.m66668h(holdingEntity.getSymbol()));
        }
        if (QuoteConfigHelper.f41987a.m51938r() && (alphaMarks = holdingEntity.getAlphaMarks()) != null && alphaMarks.contains("Ondo")) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = R$id.tv_label_stock_token;
        baseViewHolder.setGone(i11, z11);
        if (z11) {
            baseViewHolder.setText(i11, holdingsListAdapter.mContext.getString(R$string.market_alpha_ondo_coin_tag));
        }
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tv_price);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        if (upDownColorTextView.getTag() != null && upDownColorTextView.getTag().equals(uniqueCode)) {
            z12 = true;
        } else {
            z12 = false;
        }
        upDownColorTextView.setSameSymbol(Boolean.valueOf(z12));
        upDownColorTextView.setTag(uniqueCode);
        upDownColorTextView.setText(C22212u1.m52119a(holdingEntity.getCurrentPrice()));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_change_rate);
        if (textView != null) {
            C27046k.m66685H(textView);
            textView.setText(C21781i.m50835a(holdingEntity.getChangeRate(), false));
            double dDoubleValue = C27039d.m66654n(C41014a.m89922G(holdingEntity.getChangeRate(), null, 1, null)).doubleValue();
            Context mContext = holdingsListAdapter.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView.setBackground(C22890g.m54286k(dDoubleValue, mContext));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m50207n(HoldingEntity holdingEntity, BaseViewHolder baseViewHolder, HoldingsListAdapter holdingsListAdapter) {
        BaseTextView tradePairView;
        String uniqueCode = holdingEntity.getUniqueCode();
        ChainCoinLogoView chainCoinLogoView = (ChainCoinLogoView) baseViewHolder.getView(R$id.logoView);
        if (chainCoinLogoView != null) {
            ChainCoinLogoView.m54462k(chainCoinLogoView, C27041f.m66668h(holdingEntity.getLogoUrl()), C27041f.m66668h(holdingEntity.getChainLogo()), null, null, null, 28, null);
        }
        TradePairFlexboxView tradePairFlexboxView = (TradePairFlexboxView) baseViewHolder.getView(R$id.tradePairFlexboxView);
        if (tradePairFlexboxView != null && (tradePairView = tradePairFlexboxView.getTradePairView()) != null) {
            tradePairView.setText(C27041f.m66668h(holdingEntity.getSymbol()));
        }
        List<String> alphaMarks = holdingEntity.getAlphaMarks();
        boolean z11 = false;
        if (alphaMarks != null && alphaMarks.contains("Ondo")) {
            z11 = true;
        }
        int i11 = R$id.tv_label_stock_token;
        baseViewHolder.setGone(i11, z11);
        if (z11) {
            baseViewHolder.setText(i11, holdingsListAdapter.mContext.getString(R$string.market_alpha_ondo_coin_tag));
        }
        baseViewHolder.setText(R$id.tvVol, C22212u1.m52120b(String.valueOf(holdingEntity.getValue())));
        holdingsListAdapter.m50209i(baseViewHolder, holdingEntity, uniqueCode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m50214q() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }
}
