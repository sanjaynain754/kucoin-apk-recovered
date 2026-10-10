package com.kubi.assets.alpha;

import android.content.Context;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AlphaTopTokenInfo;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: AlphaRecommendAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaRecommendAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/AlphaTopTokenInfo;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "abbreviateAddress", "", "address", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaRecommendAdapter extends BaseQuickAdapter<AlphaTopTokenInfo, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable AlphaTopTokenInfo alphaTopTokenInfo) {
        BigDecimal priceRate;
        CoinAvatarView coinAvatarView = baseViewHolder != null ? (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon1) : null;
        CoinAvatarView coinAvatarView2 = baseViewHolder != null ? (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon2) : null;
        if (coinAvatarView2 != null) {
            coinAvatarView2.setStrokeColor(this.mContext.getColor(R$color.c_overlay));
        }
        C24277v.m58540e(this.mContext, alphaTopTokenInfo != null ? alphaTopTokenInfo.getTokenIcon() : null, coinAvatarView);
        C24277v.m58540e(this.mContext, alphaTopTokenInfo != null ? alphaTopTokenInfo.getChainIcon() : null, coinAvatarView2);
        if (baseViewHolder != null) {
            BaseViewHolder text = baseViewHolder.setText(R$id.tvCoinName, C27041f.m66668h(alphaTopTokenInfo != null ? alphaTopTokenInfo.getDisplayToken() : null));
            if (text != null) {
                BaseViewHolder text2 = text.setText(R$id.tvTokenContract, m15295g(C27041f.m66668h(alphaTopTokenInfo != null ? alphaTopTokenInfo.getToken() : null)));
                if (text2 != null) {
                    int i11 = R$id.tv_current_price;
                    BaseViewHolder text3 = text2.setText(i11, IQuoteFacadeService.f41383a.get().mo50693T(alphaTopTokenInfo != null ? alphaTopTokenInfo.getPrice() : null));
                    if (text3 != null) {
                        int i12 = R$id.tv_rate;
                        BaseViewHolder text4 = text3.setText(i12, C27041f.m66669i((alphaTopTokenInfo == null || (priceRate = alphaTopTokenInfo.getPriceRate()) == null) ? null : C42180b.m92642g(priceRate, null, null, 0, true, false, false, 55, null), "--"));
                        if (text4 != null) {
                            Context mContext = this.mContext;
                            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                            BaseViewHolder textColor = text4.setTextColor(i12, C22890g.m54279d(mContext, C27039d.m66647g(alphaTopTokenInfo != null ? alphaTopTokenInfo.getPriceRate() : null), 0, 2, null));
                            if (textColor != null) {
                                BaseViewHolder gone = textColor.setGone(i11, (alphaTopTokenInfo != null ? alphaTopTokenInfo.getPrice() : null) != null);
                                if (gone != null) {
                                    gone.setGone(i12, (alphaTopTokenInfo != null ? alphaTopTokenInfo.getPrice() : null) != null);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public AlphaRecommendAdapter() {
        super(R$layout.asset_item_alpha_recommend);
    }

    /* JADX INFO: renamed from: g */
    private final String m15295g(String str) {
        if (str.length() > 8) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append(Typography.ellipsis);
            sb2.append(StringsKt.takeLast(str, 4));
            return sb2.toString();
        }
        return str;
    }
}
