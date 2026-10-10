package com.kubi.assets.setting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2SettingEntity;
import com.kubi.assets.entity.FiatCurrency;
import com.kubi.assets.view.C11273q;
import com.kubi.data.entity.CustomOrderEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.event.api.C12572a;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37885i;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rs.AbstractC44173c;
import rs.C44172b;
import sa.C44370a;
import y70.C46392a;

/* JADX INFO: compiled from: AssetV2SettingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0015J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0003J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0003J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0003R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/assets/entity/AssetV2SettingEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "switchClicked", "", "getSwitchClicked", "()Z", "setSwitchClicked", "(Z)V", "baseCurrency", "", "getBaseCurrency", "()Ljava/lang/String;", "setBaseCurrency", "(Ljava/lang/String;)V", "hideFlag", "getHideFlag", "setHideFlag", "isShowSubAccount", "()Ljava/lang/Boolean;", "setShowSubAccount", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "convert", "", "helper", "item", "handleFiatCurrency", "handleBaseCurrency", "handleSubHeader", "handleCustomHeader", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2SettingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SettingAdapter.kt\ncom/kubi/assets/setting/AssetV2SettingAdapter\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,200:1\n136#2:201\n136#2:202\n126#2,2:203\n126#2,2:205\n*S KotlinDebug\n*F\n+ 1 AssetV2SettingAdapter.kt\ncom/kubi/assets/setting/AssetV2SettingAdapter\n*L\n169#1:201\n153#1:202\n154#1:203,2\n157#1:205,2\n*E\n"})
public final class AssetV2SettingAdapter extends BaseMultiItemQuickAdapter<AssetV2SettingEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f18700i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f18701j;

    /* JADX INFO: renamed from: k */
    public boolean f18702k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Boolean f18703l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2SettingAdapter(@NotNull List<AssetV2SettingEntity> data) {
        super(data);
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = R$layout.item_setting_text;
        addItemType(1, i11);
        addItemType(2, i11);
        addItemType(3, R$layout.item_asset_setting_sub);
        addItemType(4, R$layout.view_divider_height8);
        int i12 = R$layout.item_text;
        addItemType(5, i12);
        addItemType(6, i12);
        addItemType(7, R$layout.item_asset_setting_custom_order);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m19211k(AssetV2SettingAdapter assetV2SettingAdapter) {
        C44370a c44370a = C44370a.f98030a;
        if (C46392a.m102322d(c44370a.m97869a(), true)) {
            C46392a.m102328k(c44370a.m97869a(), false);
            C12572a.m23695d("event_overview_custom_order", Boolean.FALSE, 0L, 4, null);
        } else {
            C46392a.m102328k(c44370a.m97869a(), true);
            C12572a.m23695d("event_overview_custom_order", Boolean.TRUE, 0L, 4, null);
        }
        assetV2SettingAdapter.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable AssetV2SettingEntity assetV2SettingEntity) {
        if (assetV2SettingEntity == null || baseViewHolder == null) {
            return;
        }
        int f38450c = assetV2SettingEntity.getF38450c();
        if (f38450c == 1) {
            m19213i(baseViewHolder, assetV2SettingEntity);
            return;
        }
        if (f38450c == 2) {
            m19215l(baseViewHolder, assetV2SettingEntity);
            return;
        }
        if (f38450c == 3) {
            m19216m(baseViewHolder, assetV2SettingEntity);
            return;
        }
        if (f38450c == 5) {
            baseViewHolder.setText(R$id.tv_title, this.mContext.getString(R$string.assetv2_unit));
        } else if (f38450c == 6) {
            baseViewHolder.setText(R$id.tv_title, this.mContext.getString(R$string.assetv2_fiat_unit));
        } else {
            if (f38450c != 7) {
                return;
            }
            m19214j(baseViewHolder, assetV2SettingEntity);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: i */
    public final void m19213i(BaseViewHolder baseViewHolder, AssetV2SettingEntity assetV2SettingEntity) {
        baseViewHolder.setGone(R$id.iv_icon, false);
        TextView textView = (TextView) baseViewHolder.getView(R$id.text);
        SelectEntity selectEntity = assetV2SettingEntity.getSelectEntity();
        textView.setText(selectEntity != null ? selectEntity.getLabel() : null);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        textView.setPaddingRelative((int) C27025c.m66565c(mContext, 8), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
        View view = baseViewHolder.getView(R$id.view_item);
        SelectEntity selectEntity2 = assetV2SettingEntity.getSelectEntity();
        view.setSelected(C27025c.m66566d(selectEntity2 != null ? Boolean.valueOf(selectEntity2.getIsChecked()) : null));
        View view2 = baseViewHolder.getView(R$id.image);
        SelectEntity selectEntity3 = assetV2SettingEntity.getSelectEntity();
        view2.setVisibility(C27025c.m66566d(selectEntity3 != null ? Boolean.valueOf(selectEntity3.getIsChecked()) : null) ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: j */
    public final void m19214j(BaseViewHolder baseViewHolder, AssetV2SettingEntity assetV2SettingEntity) {
        CustomOrderEntity customOrderEntity;
        BigDecimal totalBalance;
        String strM89950x;
        String strM85562a;
        ShowHideTextView showHideTextView = (ShowHideTextView) baseViewHolder.getView(R$id.first_currency);
        TextView textView = (TextView) baseViewHolder.getView(R$id.first_currency_unit);
        ShowHideTextView showHideTextView2 = (ShowHideTextView) baseViewHolder.getView(R$id.second_currency);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.second_currency_unit);
        ShapeImageView shapeImageView = (ShapeImageView) baseViewHolder.getView(R$id.order_switch);
        Intrinsics.checkNotNull(shapeImageView);
        C27046k.m66711z(shapeImageView, 0L, new Function0() { // from class: com.kubi.assets.setting.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SettingAdapter.m19211k(this.f18713b);
            }
        }, 1, null);
        showHideTextView.setHide(this.f18702k);
        showHideTextView2.setHide(this.f18702k);
        CustomOrderEntity customOrderEntity2 = assetV2SettingEntity.getCustomOrderEntity();
        String strM85562a2 = null;
        this.f18701j = customOrderEntity2 != null ? customOrderEntity2.getBaseCurrency() : null;
        SubAssetEntity subAssetEntity = assetV2SettingEntity.getSubAssetEntity();
        if (subAssetEntity != null ? Intrinsics.areEqual(subAssetEntity.getHasSubAccount(), Boolean.TRUE) : false) {
            Boolean bool = this.f18703l;
            SubAssetEntity subAssetEntity2 = assetV2SettingEntity.getSubAssetEntity();
            if (C27025c.m66567e(bool, C27025c.m66566d(subAssetEntity2 != null ? subAssetEntity2.getShowSubAccountBalanceSwitch() : null))) {
                customOrderEntity = assetV2SettingEntity.getCustomOrderEntity();
                if (customOrderEntity != null) {
                    totalBalance = customOrderEntity.getTotalBalance();
                } else {
                    totalBalance = null;
                }
            } else {
                CustomOrderEntity customOrderEntity3 = assetV2SettingEntity.getCustomOrderEntity();
                if (customOrderEntity3 != null) {
                    totalBalance = customOrderEntity3.getTotalBalanceMinusSub();
                } else {
                    totalBalance = null;
                }
            }
        } else {
            customOrderEntity = assetV2SettingEntity.getCustomOrderEntity();
            if (customOrderEntity != null) {
                totalBalance = customOrderEntity.getTotalBalance();
            } else {
                totalBalance = null;
            }
        }
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            Intrinsics.checkNotNull(showHideTextView);
            TextView textViewM97383c = C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
            if (totalBalance != null) {
                String str = this.f18701j;
                strM85562a = C37885i.m85562a(totalBalance, str, C11273q.m20046b(str));
            } else {
                strM85562a = null;
            }
            textViewM97383c.setText(C27041f.m66669i(strM85562a, "--"));
            textView.setText(C27041f.m66669i(this.f18701j, "--"));
            if (totalBalance != null) {
                CustomOrderEntity customOrderEntity4 = assetV2SettingEntity.getCustomOrderEntity();
                strM85562a2 = C41014a.m89950x(C41014a.m89940n(totalBalance, customOrderEntity4 != null ? customOrderEntity4.getBaseCurrency() : null), null, null, 0, false, true, false, true, 47, null);
            }
            showHideTextView2.setText(C27041f.m66669i(strM85562a2, "--"));
            Intrinsics.checkNotNull(textView2);
            ViewExtKt.m66577h(textView2);
            return;
        }
        Intrinsics.checkNotNull(showHideTextView);
        TextView textViewM97383c2 = C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        if (totalBalance != null) {
            CustomOrderEntity customOrderEntity5 = assetV2SettingEntity.getCustomOrderEntity();
            strM89950x = C41014a.m89950x(C41014a.m89940n(totalBalance, customOrderEntity5 != null ? customOrderEntity5.getBaseCurrency() : null), null, null, 0, false, true, false, true, 47, null);
        } else {
            strM89950x = null;
        }
        textViewM97383c2.setText(AssetExKt.m15117e(C27041f.m66668h(strM89950x)));
        textView.setText(C27041f.m66669i(C41016c.m89965c(), "--"));
        if (totalBalance != null) {
            String str2 = this.f18701j;
            strM85562a2 = C37885i.m85562a(totalBalance, str2, C11273q.m20046b(str2));
        }
        showHideTextView2.setText(C42828b.m93915p(C42828b.m93906g(C27041f.m66669i(strM85562a2, "--"), "≈", false, false, 6, null)));
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.m66594y(textView2);
        textView2.setText(C27041f.m66669i(this.f18701j, "--"));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: l */
    public final void m19215l(BaseViewHolder baseViewHolder, AssetV2SettingEntity assetV2SettingEntity) {
        int i11 = R$id.iv_icon;
        baseViewHolder.setGone(i11, true);
        Context context = this.mContext;
        FiatCurrency fiatCurrency = assetV2SettingEntity.getFiatCurrency();
        C24277v.m58540e(context, fiatCurrency != null ? fiatCurrency.getIcon() : null, (ImageView) baseViewHolder.getView(i11));
        TextView textView = (TextView) baseViewHolder.getView(R$id.text);
        FiatCurrency fiatCurrency2 = assetV2SettingEntity.getFiatCurrency();
        textView.setText(fiatCurrency2 != null ? fiatCurrency2.getName() : null);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        textView.setPaddingRelative((int) C27025c.m66565c(mContext, 8), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
        View view = baseViewHolder.getView(R$id.view_item);
        FiatCurrency fiatCurrency3 = assetV2SettingEntity.getFiatCurrency();
        view.setSelected(C27025c.m66566d(fiatCurrency3 != null ? Boolean.valueOf(fiatCurrency3.isChecked()) : null));
        View view2 = baseViewHolder.getView(R$id.image);
        FiatCurrency fiatCurrency4 = assetV2SettingEntity.getFiatCurrency();
        view2.setVisibility(C27025c.m66566d(fiatCurrency4 != null ? Boolean.valueOf(fiatCurrency4.isChecked()) : null) ? 0 : 8);
    }

    /* JADX INFO: renamed from: m */
    public final void m19216m(BaseViewHolder baseViewHolder, AssetV2SettingEntity assetV2SettingEntity) {
        int i11 = R$id.switch_sub;
        baseViewHolder.addOnClickListener(i11);
        baseViewHolder.addOnClickListener(R$id.tv_sub_account);
        if (this.f18700i) {
            return;
        }
        SwitchCompat switchCompat = (SwitchCompat) baseViewHolder.getView(i11);
        SubAssetEntity subAssetEntity = assetV2SettingEntity.getSubAssetEntity();
        switchCompat.setChecked(C27025c.m66566d(subAssetEntity != null ? subAssetEntity.getShowSubAccountBalanceSwitch() : null));
        SubAssetEntity subAssetEntity2 = assetV2SettingEntity.getSubAssetEntity();
        this.f18703l = Boolean.valueOf(C27025c.m66566d(subAssetEntity2 != null ? subAssetEntity2.getShowSubAccountBalanceSwitch() : null));
    }

    /* JADX INFO: renamed from: n */
    public final void m19217n(boolean z11) {
        this.f18702k = z11;
    }

    /* JADX INFO: renamed from: o */
    public final void m19218o(@Nullable Boolean bool) {
        this.f18703l = bool;
    }

    /* JADX INFO: renamed from: p */
    public final void m19219p(boolean z11) {
        this.f18700i = z11;
    }
}
