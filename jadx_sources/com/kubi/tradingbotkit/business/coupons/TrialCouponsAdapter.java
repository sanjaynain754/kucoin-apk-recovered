package com.kubi.tradingbotkit.business.coupons;

import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.model.TrialCouponItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: TrialCouponsAdapter.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/TrialCouponsAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/tradingbotkit/model/TrialCouponItemModel;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TrialCouponsAdapter extends BaseQuickAdapter<TrialCouponItemModel, BaseViewHolder> {
    public TrialCouponsAdapter() {
        super(R$layout.btrading_bot_kit_item_trial_coupons);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable TrialCouponItemModel trialCouponItemModel) {
        if (baseViewHolder != null) {
            BaseViewHolder text = baseViewHolder.setText(R$id.tvNumber, C27041f.m66668h(trialCouponItemModel != null ? trialCouponItemModel.getAmount() : null));
            if (text != null) {
                BaseViewHolder text2 = text.setText(R$id.tv_title, C27041f.m66668h(trialCouponItemModel != null ? trialCouponItemModel.getTitle() : null));
                if (text2 != null) {
                    BaseViewHolder text3 = text2.setText(R$id.tvContent, C27041f.m66668h(trialCouponItemModel != null ? trialCouponItemModel.getContent() : null));
                    if (text3 != null) {
                        BaseViewHolder text4 = text3.setText(R$id.tvCoin, C27041f.m66668h(trialCouponItemModel != null ? trialCouponItemModel.getCurrency() : null));
                        if (text4 != null) {
                            int i11 = R$id.tvExpirationMessage;
                            BaseViewHolder text5 = text4.setText(i11, C27041f.m66668h(trialCouponItemModel != null ? trialCouponItemModel.getExpirationMessage() : null));
                            if (text5 != null) {
                                BaseViewHolder textColor = text5.setTextColor(i11, C27017c.f54310a.m66512a(C27039d.m66652l(trialCouponItemModel != null ? trialCouponItemModel.getRemainder() : null) > 0 ? R$color.c_text40 : R$color.complementary));
                                if (textColor != null) {
                                    textColor.addOnClickListener(R$id.bt_use_coupons);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
