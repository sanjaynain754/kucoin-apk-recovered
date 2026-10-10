package com.kubi.quotefacade.alpha.homerank;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.chain.C21781i;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.helper.C22212u1;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ChainCoinLogoView;
import com.kubi.resources.widget.TradePairFlexboxView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.C44172b;

/* JADX INFO: compiled from: AlphaRankAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/homerank/AlphaRankAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "renderItem", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaRankAdapter extends BaseQuickAdapter<AlphaItemEntity, BaseViewHolder> {
    public AlphaRankAdapter() {
        super(R$layout.item_list_alpha_coin_rank);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m50510l(BaseViewHolder baseViewHolder, AlphaItemEntity alphaItemEntity, AlphaRankAdapter alphaRankAdapter) {
        ChainCoinLogoView chainCoinLogoView = (ChainCoinLogoView) baseViewHolder.getView(R$id.logoView);
        if (chainCoinLogoView != null) {
            ChainCoinLogoView.m54462k(chainCoinLogoView, C27041f.m66668h(alphaItemEntity.getTokenIcon()), C27041f.m66668h(alphaItemEntity.getChainIcon()), null, null, null, 28, null);
        }
        TradePairFlexboxView tradePairFlexboxView = (TradePairFlexboxView) baseViewHolder.getView(R$id.tradePairFlexboxView);
        if (tradePairFlexboxView != null) {
            BaseTextView tradePairView = tradePairFlexboxView.getTradePairView();
            if (tradePairView != null) {
                tradePairView.setText(C27041f.m66668h(alphaItemEntity.getDisplayToken()));
            }
            ImageView labelViewHot = tradePairFlexboxView.getLabelViewHot();
            if (labelViewHot != null) {
                labelViewHot.setVisibility(Intrinsics.areEqual(alphaItemEntity.getHot(), Boolean.TRUE) ? 0 : 8);
            }
        }
        baseViewHolder.setText(R$id.tvVol, C22212u1.m52120b(String.valueOf(alphaItemEntity.getTradingVolume())));
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tvPrice);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setSameSymbol(Boolean.valueOf(upDownColorTextView.getTag() != null && upDownColorTextView.getTag().equals(alphaItemEntity.getToken())));
        upDownColorTextView.setTag(alphaItemEntity.getToken());
        upDownColorTextView.setText(C22212u1.m52119a(alphaItemEntity.getPrice()));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvRate);
        if (textView != null) {
            C27046k.m66685H(textView);
            textView.setText(C21781i.m50835a(alphaItemEntity.getPriceRate(), false));
            double dDoubleValue = C27039d.m66654n(C41014a.m89922G(alphaItemEntity.getPriceRate(), null, 1, null)).doubleValue();
            Context mContext = alphaRankAdapter.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            textView.setBackground(C22890g.m54286k(dDoubleValue, mContext));
        }
        ViewGroup viewGroup = (ViewGroup) baseViewHolder.getView(R$id.root_view);
        if (viewGroup != null) {
            viewGroup.setPaddingRelative(C27040e.m66658b(12), 0, C27040e.m66658b(12), 0);
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable final AlphaItemEntity alphaItemEntity) {
        if (baseViewHolder == null || alphaItemEntity == null) {
            return;
        }
        m50512k(baseViewHolder, alphaItemEntity);
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.quotefacade.alpha.homerank.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaRankAdapter.m50509j(alphaItemEntity);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m50512k(final BaseViewHolder baseViewHolder, final AlphaItemEntity alphaItemEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.homerank.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaRankAdapter.m50510l(baseViewHolder, alphaItemEntity, this);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m50509j(AlphaItemEntity alphaItemEntity) {
        if (alphaItemEntity.getTokenBridgeId() != null) {
            QuoteExKt.m51866q(alphaItemEntity.getTokenBridgeId());
        }
        return Unit.INSTANCE;
    }
}
