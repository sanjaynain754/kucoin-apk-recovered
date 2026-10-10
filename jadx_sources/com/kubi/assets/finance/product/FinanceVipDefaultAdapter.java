package com.kubi.assets.finance.product;

import android.view.View;
import android.widget.ImageView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.PwmFixedProd;
import com.kubi.assets.entity.QuantFundProd;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.host.HostManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33954u6;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceVipDefaultAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceVipDefaultAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "convert", "", C33954u6.f72238i, "item", "bindPWMDuration", "helper", "Lcom/kubi/assets/entity/PwmFixedProd;", "jumpUrl", "url", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinanceVipDefaultAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    /* JADX INFO: renamed from: i */
    public final void m16841i(BaseViewHolder baseViewHolder, PwmFixedProd pwmFixedProd) {
        String duration;
        Double dValueOf = null;
        if (pwmFixedProd != null && (duration = pwmFixedProd.getDuration()) != null) {
            dValueOf = Double.valueOf(DowngradeExKt.m66538h(duration, 0.0d, 1, null));
        }
        if (dValueOf == null) {
            baseViewHolder.setGone(R$id.tvLabel, false);
            return;
        }
        if (dValueOf.doubleValue() > 0.0d) {
            int i11 = R$id.tvLabel;
            baseViewHolder.setGone(i11, true);
            baseViewHolder.setText(i11, pwmFixedProd.getDuration() + 'D');
            return;
        }
        if (!Intrinsics.areEqual(dValueOf, 0.0d)) {
            baseViewHolder.setGone(R$id.tvLabel, false);
            return;
        }
        int i12 = R$id.tvLabel;
        baseViewHolder.setGone(i12, true);
        baseViewHolder.setText(i12, R$string.soft_staking);
    }

    /* JADX INFO: renamed from: k */
    public static final void m16839k(FinanceVipDefaultAdapter financeVipDefaultAdapter, MultiItemEntity multiItemEntity, View view) {
        financeVipDefaultAdapter.m16843m(((PwmFixedProd) multiItemEntity).getJumpUrl());
    }

    /* JADX INFO: renamed from: l */
    public static final void m16840l(FinanceVipDefaultAdapter financeVipDefaultAdapter, MultiItemEntity multiItemEntity, View view) {
        financeVipDefaultAdapter.m16843m(((QuantFundProd) multiItemEntity).getJumpUrl());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder holder, @NotNull final MultiItemEntity item) {
        String strM93903d;
        String strM85565d;
        String strM93903d2;
        String strM85565d2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof PwmFixedProd) {
            PwmFixedProd pwmFixedProd = (PwmFixedProd) item;
            holder.setText(R$id.tvName, pwmFixedProd.getName());
            int i11 = R$id.tvPercent;
            BigDecimal bigDecimalM66671k = C27041f.m66671k(pwmFixedProd.getApr());
            if (bigDecimalM66671k == null || (strM85565d2 = C37885i.m85565d(bigDecimalM66671k, 0, 0, 3, null)) == null) {
                strM93903d2 = null;
            } else {
                String str = strM85565d2 + '%';
                if (str != null) {
                    strM93903d2 = C42828b.m93903d(str);
                } else {
                    strM93903d2 = null;
                }
            }
            holder.setText(i11, C27041f.m66669i(strM93903d2, "--"));
            holder.setText(R$id.tvProduct, C27041f.m66669i(pwmFixedProd.getCategoryText(), "--"));
            C37890n c37890n = C37890n.f85269a;
            String currency = pwmFixedProd.getCurrency();
            CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency != null ? currency : "");
            C24277v.m58542g((ImageView) holder.getView(R$id.ivIcon), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
            m16841i(holder, pwmFixedProd);
            holder.setOnClickListener(R$id.itemRoot, new View.OnClickListener() { // from class: com.kubi.assets.finance.product.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FinanceVipDefaultAdapter.m16839k(this.f17486b, item, view);
                }
            });
            return;
        }
        if (item instanceof QuantFundProd) {
            QuantFundProd quantFundProd = (QuantFundProd) item;
            holder.setText(R$id.tvName, quantFundProd.getProductName());
            int i12 = R$id.tvPercent;
            BigDecimal bigDecimalM66671k2 = C27041f.m66671k(quantFundProd.getProfitRate());
            if (bigDecimalM66671k2 == null || (strM85565d = C37885i.m85565d(bigDecimalM66671k2, 0, 0, 3, null)) == null) {
                strM93903d = null;
            } else {
                String str2 = strM85565d + '%';
                if (str2 != null) {
                    strM93903d = C42828b.m93903d(str2);
                } else {
                    strM93903d = null;
                }
            }
            holder.setText(i12, C27041f.m66669i(strM93903d, "--"));
            holder.setText(R$id.tvProduct, quantFundProd.getCategoryText());
            C37890n c37890n2 = C37890n.f85269a;
            String currency2 = quantFundProd.getCurrency();
            CoinInfoEntity coinInfoEntityM85613u2 = c37890n2.m85613u(currency2 != null ? currency2 : "");
            C24277v.m58542g((ImageView) holder.getView(R$id.ivIcon), coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null);
            holder.setOnClickListener(R$id.itemRoot, new View.OnClickListener() { // from class: com.kubi.assets.finance.product.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FinanceVipDefaultAdapter.m16840l(this.f17488b, item, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16843m(String str) {
        Object objM103844constructorimpl;
        if (str != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(Router.f46192a.m56184f(HostManager.a.m() + str).m4048k()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Result.m103843boximpl(objM103844constructorimpl);
        }
    }

    public FinanceVipDefaultAdapter(@Nullable List<? extends MultiItemEntity> list) {
        super(list);
        int i11 = R$layout.asset_finance_vip_default_page_item;
        addItemType(1, i11);
        addItemType(2, i11);
    }
}
