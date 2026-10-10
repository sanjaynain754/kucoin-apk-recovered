package com.kubi.assets.finance.product;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.assets.finance.FinanceAnalyticsReporter;
import com.kubi.assets.finance.FinanceAutoRenewBinder;
import com.kubi.assets.finance.FinanceSettable;
import com.kubi.assets.finance.FinanceSettableKt;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.host.HostManager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FinanceVipProductChildAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B)\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceVipProductChildAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/ProductChildEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lcom/kubi/assets/finance/FinanceSettable;", "data", "", "isShowCategory", "", "hideSubNumber", "<init>", "(Ljava/util/List;ZZ)V", "convert", "", "helper", "item", "setCommonFields", "bindRevenueName", "bindCommonFields", "setCoinIcon", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "handleOldIconLogic", "", "itemClick", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceVipProductChildAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceVipProductChildAdapter.kt\ncom/kubi/assets/finance/product/FinanceVipProductChildAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
public class FinanceVipProductChildAdapter extends BaseQuickAdapter<ProductChildEntity, BaseViewHolder> implements FinanceSettable {

    /* JADX INFO: renamed from: i */
    public boolean f17473i;

    /* JADX INFO: renamed from: j */
    public boolean f17474j;

    /* JADX INFO: renamed from: l */
    private final String m16854l(ProductChildEntity productChildEntity) {
        if (!TextUtils.isEmpty(productChildEntity != null ? productChildEntity.getIcon() : null)) {
            return C27041f.m66668h(productChildEntity != null ? productChildEntity.getIcon() : null);
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(productChildEntity != null ? productChildEntity.getCurrency() : null));
        return C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Unit m16856n(final ProductChildEntity productChildEntity, final BaseViewHolder baseViewHolder) throws JSONException {
        if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getStatus() : null, EarnAccountItem.STATUS_DUAL_PENDING)) {
            ToastCompat.m66437C(R$string.earn_purchaseing);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getCategory() : null, "LOAN_PLEDGE")) {
            FinanceSettableKt.m16696a(productChildEntity, new Function0() { // from class: com.kubi.assets.finance.product.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceVipProductChildAdapter.m16857o(baseViewHolder, productChildEntity);
                }
            });
            return Unit.INSTANCE;
        }
        String jumpUrl = productChildEntity != null ? productChildEntity.getJumpUrl() : null;
        if (jumpUrl == null || jumpUrl.length() == 0) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(productChildEntity.getJumpType(), "H5")) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + C27041f.m66668h(productChildEntity.getJumpUrl()), null, 2L, Boolean.TRUE, null, null, null, 114, null);
        } else {
            Router.f46192a.m56184f(C27041f.m66668h(productChildEntity.getJumpUrl())).m4048k();
        }
        FinanceAnalyticsReporter.f17418a.m16762h(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1), C27041f.m66668h(productChildEntity.getCurrency()), C27041f.m66668h(productChildEntity.getType()));
        return Unit.INSTANCE;
    }

    public FinanceVipProductChildAdapter(@Nullable List<ProductChildEntity> list, boolean z11, boolean z12) {
        super(R$layout.asset_item_finance_vip_product_child, list);
        this.f17473i = z11;
        this.f17474j = z12;
    }

    /* JADX INFO: renamed from: i */
    private final void m16852i(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
        String personalLockPeriod;
        BaseViewHolder text = baseViewHolder.setText(R$id.tvName, C27041f.m66669i(productChildEntity != null ? productChildEntity.getName() : null, "--"));
        int i11 = R$id.tvCategory;
        text.setText(i11, C27041f.m66669i(productChildEntity != null ? productChildEntity.getCategoryText() : null, "--"));
        Double dValueOf = (productChildEntity == null || (personalLockPeriod = productChildEntity.getPersonalLockPeriod()) == null) ? null : Double.valueOf(DowngradeExKt.m66538h(personalLockPeriod, 0.0d, 1, null));
        if (dValueOf == null) {
            baseViewHolder.setGone(R$id.tvLabel, false);
        } else if (dValueOf.doubleValue() > 0.0d) {
            int i12 = R$id.tvLabel;
            baseViewHolder.setGone(i12, true);
            baseViewHolder.setText(i12, productChildEntity.getPersonalLockPeriod() + 'D');
        } else if (!Intrinsics.areEqual(dValueOf, 0.0d) || Intrinsics.areEqual(productChildEntity.getType(), "PWM_FUND")) {
            baseViewHolder.setGone(R$id.tvLabel, false);
        } else {
            int i13 = R$id.tvLabel;
            baseViewHolder.setGone(i13, true);
            baseViewHolder.setText(i13, R$string.soft_staking);
        }
        if (productChildEntity == null || !productChildEntity.getManualRedeemLocked()) {
            if (Intrinsics.areEqual(productChildEntity != null ? productChildEntity.getStatus() : null, "SETTLING")) {
                int i14 = R$id.tvStatusLabel;
                baseViewHolder.setText(i14, R$string.kc_earn_setting_state).setVisible(i14, true);
            } else {
                int i15 = R$id.tvStatusLabel;
                baseViewHolder.setText(i15, C33627eb.f69716f).setVisible(i15, false);
            }
        } else {
            int i16 = R$id.tvStatusLabel;
            baseViewHolder.setText(i16, R$string.kc_asset_staking_lock).setVisible(i16, true);
        }
        m16858p(productChildEntity, baseViewHolder);
        baseViewHolder.setGone(i11, this.f17473i);
    }

    /* JADX INFO: renamed from: j */
    private final void m16853j(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
        TextView textView = (TextView) baseViewHolder.itemView.findViewById(R$id.tvRevenueName);
        if (textView == null) {
            return;
        }
        String string = C27017c.f54310a.m66513b().getString(R$string.kc_earn_hold_profit);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (C27039d.m66650j(productChildEntity != null ? productChildEntity.getIncomeCurrencyCount() : null) > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append('(');
            sb2.append(productChildEntity != null ? productChildEntity.getIncomeCurrencyCount() : null);
            sb2.append(')');
            string = sb2.toString();
        }
        textView.setText(string);
    }

    /* JADX INFO: renamed from: m */
    private final void m16855m(final BaseViewHolder baseViewHolder, final ProductChildEntity productChildEntity) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.finance.product.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinanceVipProductChildAdapter.m16856n(productChildEntity, baseViewHolder);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m16857o(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) throws JSONException {
        FinanceAnalyticsReporter.f17418a.m16762h(String.valueOf(baseViewHolder.getBindingAdapterPosition() + 1), C27041f.m66668h(productChildEntity.getCurrency()), C27041f.m66668h(productChildEntity.getType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    private final void m16858p(ProductChildEntity productChildEntity, BaseViewHolder baseViewHolder) {
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(R$id.iv_icon);
        CoinAvatarView coinAvatarView2 = (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon1);
        CoinAvatarView coinAvatarView3 = (CoinAvatarView) baseViewHolder.getView(R$id.ivIcon2);
        coinAvatarView3.setStrokeColor(coinAvatarView3.getResources().getColor(R$color.c_overlay));
        if ((productChildEntity != null ? productChildEntity.getBigCurrencyIcon() : null) == null || productChildEntity.getSmallCurrencyIcon() == null) {
            C24277v.m58542g(coinAvatarView, C27041f.m66669i(productChildEntity != null ? productChildEntity.getBigCurrencyIcon() : null, m16854l(productChildEntity)));
            Intrinsics.checkNotNullExpressionValue(coinAvatarView, "apply(...)");
            ViewExtKt.m66594y(coinAvatarView);
            Intrinsics.checkNotNull(coinAvatarView2);
            ViewExtKt.m66577h(coinAvatarView2);
            Intrinsics.checkNotNull(coinAvatarView3);
            ViewExtKt.m66577h(coinAvatarView3);
            return;
        }
        Intrinsics.checkNotNull(coinAvatarView);
        ViewExtKt.m66577h(coinAvatarView);
        C24277v.m58542g(coinAvatarView2, productChildEntity.getBigCurrencyIcon());
        Intrinsics.checkNotNullExpressionValue(coinAvatarView2, "apply(...)");
        ViewExtKt.m66594y(coinAvatarView2);
        C24277v.m58542g(coinAvatarView3, productChildEntity.getSmallCurrencyIcon());
        Intrinsics.checkNotNullExpressionValue(coinAvatarView3, "apply(...)");
        ViewExtKt.m66594y(coinAvatarView3);
    }

    /* JADX INFO: renamed from: q */
    private final void m16859q(BaseViewHolder baseViewHolder, ProductChildEntity productChildEntity) {
        TextPaint paint;
        BaseViewHolder text = baseViewHolder.setText(R$id.tvHoldAmount, productChildEntity != null ? productChildEntity.getLockAmountWithCurrencyStr() : null).setText(R$id.tvRecentIncome, productChildEntity != null ? productChildEntity.getRecentIncomeAmountStr() : null).setText(R$id.tvAnnualized, productChildEntity != null ? productChildEntity.getTotalReturnStr() : null);
        int i11 = R$id.tvRevenue;
        text.setText(i11, productChildEntity != null ? productChildEntity.getIncomeSumStr() : null);
        BaseTextView baseTextView = (BaseTextView) baseViewHolder.getView(i11);
        if (baseTextView != null && (paint = baseTextView.getPaint()) != null) {
            paint.setShader(FinanceVipProductAdapter.f17470j.getShader());
        }
        m16853j(baseViewHolder, productChildEntity);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @Nullable ProductChildEntity productChildEntity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        m16859q(helper, productChildEntity);
        m16852i(helper, productChildEntity);
        m16855m(helper, productChildEntity);
        ShowHideTextView.m54778d(helper.itemView, this.f17474j);
        int i11 = R$id.tvRecentIncome;
        BaseViewHolder gone = helper.setGone(i11, false);
        int i12 = R$id.tvRecentIncomeName;
        BaseViewHolder gone2 = gone.setGone(i12, false);
        int i13 = R$id.tvAnnualized;
        BaseViewHolder gone3 = gone2.setGone(i13, false);
        int i14 = R$id.tvAnnualizedName;
        gone3.setGone(i14, false);
        String category = productChildEntity != null ? productChildEntity.getCategory() : null;
        if (category != null) {
            int iHashCode = category.hashCode();
            if (iHashCode != -111336386) {
                if (iHashCode != 281928680) {
                    if (iHashCode == 843191547 && category.equals("PWM_FIXED")) {
                        helper.setGone(i13, true).setGone(i14, true);
                        helper.setText(R$id.tvRevenueName, C27017c.f54310a.m66513b().getString(R$string.earn_total_profit));
                    }
                } else if (category.equals("LOAN_PLEDGE")) {
                    helper.setGone(i14, false).setGone(i13, false).setGone(i12, false).setGone(i11, false).setGone(R$id.tvRevenueName, false).setGone(R$id.tvRevenue, false);
                }
            } else if (category.equals("PWM_FUND")) {
                helper.setGone(i11, true).setGone(i12, true);
                helper.setText(R$id.tvRevenueName, C27017c.f54310a.m66513b().getString(R$string.kc_earn_hold_profit));
            }
        }
        FinanceAutoRenewBinder financeAutoRenewBinder = FinanceAutoRenewBinder.f17374a;
        financeAutoRenewBinder.m16619h(helper, productChildEntity);
        financeAutoRenewBinder.m16618f(helper, productChildEntity);
    }
}
