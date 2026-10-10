package com.kubi.assets.alpha;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AlphaAssetEntity;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import e60.C37084b;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: AlphaAssetAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaAssetAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/AlphaAssetEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "filterText", "", "getFilterText", "()Ljava/lang/String;", "setFilterText", "(Ljava/lang/String;)V", "replaceData", "", "data", "", "convert", "helper", "item", "abbreviateAddress", "address", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaAssetAdapter extends BaseQuickAdapter<AlphaAssetEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f16426i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public String f16427j;

    public AlphaAssetAdapter() {
        super(R$layout.asset_item_alpha_asset);
        this.f16427j = "";
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m15247j(AlphaAssetEntity alphaAssetEntity, AlphaAssetAdapter alphaAssetAdapter) {
        C27057k.m66746b(C27041f.m66668h(alphaAssetEntity != null ? alphaAssetEntity.getTokenAddress() : null));
        Object systemService = alphaAssetAdapter.mContext.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.copy_success, new Object[0]), new Object[0]);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable final AlphaAssetEntity alphaAssetEntity) {
        TextView textView;
        BigDecimal changeRate;
        BigDecimal baseAmount;
        BigDecimal totalBalance;
        CoinAvatarView coinAvatarView = baseViewHolder != null ? (CoinAvatarView) baseViewHolder.getView(R$id.ivSubIcon) : null;
        C24277v.m58540e(this.mContext, C27041f.m66668h(alphaAssetEntity != null ? alphaAssetEntity.getIconUrl() : null), baseViewHolder != null ? (ImageView) baseViewHolder.getView(R$id.ivIcon) : null);
        C24277v.m58540e(this.mContext, C27041f.m66668h(alphaAssetEntity != null ? alphaAssetEntity.getChainIconUrl() : null), coinAvatarView);
        if (coinAvatarView != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            coinAvatarView.setStrokeColor(C27046k.m66699n(mContext, R$color.c_overlay));
        }
        if (baseViewHolder != null) {
            BaseViewHolder text = baseViewHolder.setText(R$id.tvCoinName, C27041f.m66669i(alphaAssetEntity != null ? alphaAssetEntity.getCurrencyName() : null, "--"));
            if (text != null) {
                BaseViewHolder text2 = text.setText(R$id.tvTokenContract, m15248h(C27041f.m66669i(alphaAssetEntity != null ? alphaAssetEntity.getTokenAddress() : null, "--")));
                if (text2 != null) {
                    BaseViewHolder text3 = text2.setText(R$id.tvAmount, C27041f.m66669i((alphaAssetEntity == null || (totalBalance = alphaAssetEntity.getTotalBalance()) == null) ? null : C37885i.m85562a(totalBalance, null, C27039d.m66651k(alphaAssetEntity.getPrecision(), 8)), "--"));
                    if (text3 != null) {
                        BaseViewHolder text4 = text3.setText(R$id.tvPrice, C27041f.m66669i((alphaAssetEntity == null || (baseAmount = alphaAssetEntity.getBaseAmount()) == null) ? null : C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(baseAmount, alphaAssetEntity.getBaseCurrency()))), null, null, 0, false, false, true, 31, null), "--"));
                        if (text4 != null) {
                            int i11 = R$id.tv_current_price;
                            BaseViewHolder text5 = text4.setText(i11, IQuoteFacadeService.f41383a.get().mo50693T(alphaAssetEntity != null ? alphaAssetEntity.getBaseCurrencyPrice() : null));
                            if (text5 != null) {
                                int i12 = R$id.tv_rate;
                                BaseViewHolder text6 = text5.setText(i12, C27041f.m66669i((alphaAssetEntity == null || (changeRate = alphaAssetEntity.getChangeRate()) == null) ? null : C42180b.m92642g(changeRate, null, null, 0, true, false, false, 55, null), "--"));
                                if (text6 != null) {
                                    Context mContext2 = this.mContext;
                                    Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                                    BaseViewHolder textColor = text6.setTextColor(i12, C22890g.m54279d(mContext2, C27039d.m66647g(alphaAssetEntity != null ? alphaAssetEntity.getChangeRate() : null), 0, 2, null));
                                    if (textColor != null) {
                                        BaseViewHolder gone = textColor.setGone(i11, (alphaAssetEntity != null ? alphaAssetEntity.getBaseCurrencyPrice() : null) != null);
                                        if (gone != null) {
                                            BaseViewHolder gone2 = gone.setGone(i12, (alphaAssetEntity != null ? alphaAssetEntity.getBaseCurrencyPrice() : null) != null);
                                            if (gone2 != null) {
                                                gone2.setGone(R$id.tv_current_price_name, (alphaAssetEntity != null ? alphaAssetEntity.getBaseCurrencyPrice() : null) != null);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (baseViewHolder != null) {
            View view = baseViewHolder.getView(R$id.ivCopy);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            View view2 = baseViewHolder.getView(R$id.tvTokenContract);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            C27046k.m66681D(new View[]{view, view2}, new Function0() { // from class: com.kubi.assets.alpha.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaAssetAdapter.m15247j(alphaAssetEntity, this);
                }
            });
        }
        ShowHideTextView.m54778d(baseViewHolder != null ? baseViewHolder.itemView : null, this.f16426i);
        if (StringsKt.isBlank(this.f16427j) || baseViewHolder == null || (textView = (TextView) baseViewHolder.getView(R$id.tvCoinName)) == null) {
            return;
        }
        C37084b.m83008c(textView, this.f16427j);
    }

    /* JADX INFO: renamed from: k */
    public final void m15250k(@NotNull Collection<AlphaAssetEntity> data, @NotNull String filterText) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filterText, "filterText");
        this.f16427j = filterText;
        super.replaceData(data);
    }

    /* JADX INFO: renamed from: l */
    public final void m15251l(boolean z11) {
        this.f16426i = z11;
    }

    /* JADX INFO: renamed from: h */
    public final String m15248h(String str) {
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
