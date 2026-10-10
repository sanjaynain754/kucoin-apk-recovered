package com.kubi.unify.funds;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.assets.AssetApiRemoteConfig;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.CoinProperty;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.C22890g;
import com.kubi.resources.CollateralStatusUiHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24277v;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyStoreIds;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.unify.entity.UnifyConfig;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.stream.UnifyDataStreamManager;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import gf.C37890n;
import gf.InterfaceC37888l;
import i60.InterfaceC38460c;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import nf.C42827a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: UnifyFundsInfoAdapter.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\"\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010(\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u001e\u0010)\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\nR#\u0010\"\u001a\n $*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b%\u0010&¨\u0006-"}, m90084d2 = {"Lcom/kubi/unify/funds/UnifyFundsInfoAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/unify/funds/UnifyFundsInfoFragment;", "<init>", "(Lcom/kubi/unify/funds/UnifyFundsInfoFragment;)V", "isFutures", "", "()Z", "isFutures$delegate", "Lkotlin/Lazy;", "convert", "", "helper", "item", "openEditAvgCost", "isShowSymbolOfflineAlert", "onShowEquityDetailDialog", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "onPotentialBorrowClick", "onHoldBalanceClick", "onAvailableEquityClick", "onAvailableClick", "onUnPnlClick", "onLiabilityClick", "onEquityClick", "onRepayClick", "context", "Landroid/content/Context;", "api", "Lcom/kubi/unify/api/UnifyApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/api/UnifyApi;", "api$delegate", "onBuySellClick", "showTradeDialog", "dataList", "", "Lcom/kubi/data/entity/TradeItemBean;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyFundsInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyFundsInfoAdapter.kt\ncom/kubi/unify/funds/UnifyFundsInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,423:1\n1563#2:424\n1634#2,3:425\n153#3,2:428\n178#4:430\n*S KotlinDebug\n*F\n+ 1 UnifyFundsInfoAdapter.kt\ncom/kubi/unify/funds/UnifyFundsInfoAdapter\n*L\n352#1:424\n352#1:425,3\n115#1:428,2\n115#1:430\n*E\n"})
public final class UnifyFundsInfoAdapter extends BaseQuickAdapter<UnifyFundsInfoEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final UnifyFundsInfoFragment f53182i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f53183j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f53184k;

    /* JADX INFO: renamed from: w0 */
    public static final Unit m65146w0(CoinInfoEntity coinInfoEntity, UnifyFundsInfoEntity unifyFundsInfoEntity, View view, final UnifyFundsInfoAdapter unifyFundsInfoAdapter, BaseViewHolder helper) {
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(helper, "helper");
        String currency = coinInfoEntity != null ? coinInfoEntity.getCurrency() : null;
        String currency2 = unifyFundsInfoEntity.getCurrency();
        if (currency2 == null) {
            currency2 = "";
        }
        String strM66669i = C27041f.m66669i(currency, currency2);
        C24277v.m58542g((CoinAvatarView) helper.getView(R$id.coinAvatar), coinInfoEntity != null ? coinInfoEntity.getIconUrl() : null);
        helper.setText(R$id.tvCurrency, strM66669i);
        int i11 = R$id.tvEquityValue;
        BigDecimal equity = unifyFundsInfoEntity.getEquity();
        helper.setText(i11, C42180b.m92647l(equity != null ? C37886j.m85578b(equity, unifyFundsInfoEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null));
        int i12 = R$id.tvEquityValueLegal;
        BigDecimal equity2 = unifyFundsInfoEntity.getEquity();
        helper.setText(i12, C42180b.m92647l((equity2 == null || (bigDecimalAbs = equity2.abs()) == null) ? null : C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalAbs, unifyFundsInfoEntity.getCurrency()))), null, null, 0, false, false, true, 31, null)));
        int i13 = R$id.tvAvailableValue;
        BigDecimal balance = unifyFundsInfoEntity.getBalance();
        helper.setText(i13, C42828b.m93910k(C42180b.m92647l(balance != null ? C37886j.m85578b(balance, unifyFundsInfoEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i, null, 2, null));
        int i14 = R$id.tvAvailableEquityValue;
        BigDecimal availableEquity = unifyFundsInfoEntity.getAvailableEquity();
        helper.setText(i14, C42828b.m93910k(C42180b.m92647l(availableEquity != null ? C37886j.m85578b(availableEquity, unifyFundsInfoEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i, null, 2, null));
        int i15 = R$id.tvHoldBalanceValue;
        BigDecimal occupiedEquity = unifyFundsInfoEntity.getOccupiedEquity();
        helper.setText(i15, C42828b.m93910k(C42180b.m92647l(occupiedEquity != null ? C37886j.m85578b(occupiedEquity, unifyFundsInfoEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i, null, 2, null));
        int i16 = R$id.tvUnPnlValue;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C27039d.m66644d(unifyFundsInfoEntity.getUnrealisedPnl()));
        BigDecimal unrealisedPnl = unifyFundsInfoEntity.getUnrealisedPnl();
        sb2.append(C42180b.m92647l(unrealisedPnl != null ? C37886j.m85578b(unrealisedPnl, unifyFundsInfoEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null));
        helper.setText(i16, C42828b.m93910k(sb2.toString(), strM66669i, null, 2, null));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        helper.setTextColor(i16, C22890g.m54282g(context, C41014a.m89922G(unifyFundsInfoEntity.getUnrealisedPnl(), null, 1, null), 0, 2, null));
        int i17 = R$id.tvLiabilityValue;
        BigDecimal liability = unifyFundsInfoEntity.getLiability();
        helper.setText(i17, C42828b.m93910k(C42180b.m92647l(liability != null ? C37886j.m85578b(liability, unifyFundsInfoEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i, null, 2, null));
        int i18 = R$id.tvPotentialBorrowValue;
        BigDecimal potentialBorrowing = unifyFundsInfoEntity.getPotentialBorrowing();
        helper.setText(i18, C42828b.m93910k(C42180b.m92647l(potentialBorrowing != null ? C37886j.m85578b(potentialBorrowing, unifyFundsInfoEntity.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i, null, 2, null));
        View view2 = helper.getView(R$id.tvEquity);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.unify.funds.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65148x0(this.f53226b);
            }
        }, 1, null);
        View view3 = helper.getView(R$id.tvLiability);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.unify.funds.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65150y0(this.f53230b);
            }
        }, 1, null);
        View view4 = helper.getView(R$id.tvUnPnl);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.unify.funds.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65151z0(this.f53234b);
            }
        }, 1, null);
        View view5 = helper.getView(R$id.tvAvailable);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C27046k.m66711z(view5, 0L, new Function0() { // from class: com.kubi.unify.funds.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65088A0(this.f53239b);
            }
        }, 1, null);
        View view6 = helper.getView(R$id.tvAvailableEquity);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        C27046k.m66711z(view6, 0L, new Function0() { // from class: com.kubi.unify.funds.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65090B0(this.f53243b);
            }
        }, 1, null);
        View view7 = helper.getView(R$id.tvHoldBalance);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C27046k.m66711z(view7, 0L, new Function0() { // from class: com.kubi.unify.funds.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65092C0(this.f53251b);
            }
        }, 1, null);
        View view8 = helper.getView(R$id.tvPotentialBorrow);
        Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
        C27046k.m66711z(view8, 0L, new Function0() { // from class: com.kubi.unify.funds.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65094D0(this.f53254b);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final UnifyFundsInfoEntity item) {
        boolean z11;
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C37890n c37890n = C37890n.f85269a;
        String currency = item.getCurrency();
        if (currency == null) {
            currency = "";
        }
        final CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        String currency2 = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null;
        String currency3 = item.getCurrency();
        String strM66669i = C27041f.m66669i(currency2, currency3 != null ? currency3 : "");
        int bindingAdapterPosition = helper.getBindingAdapterPosition() - getHeaderLayoutCount();
        int i11 = R$id.tvAssetsType;
        if (Intrinsics.areEqual(this.f53182i.m65182r3().m65205q().getValue(), "default")) {
            if (bindingAdapterPosition != 0) {
                if (bindingAdapterPosition != (m65156c0() ? 1 : 2)) {
                    z11 = false;
                }
            }
            z11 = true;
        } else {
            z11 = false;
        }
        helper.setGone(i11, z11);
        helper.setText(i11, bindingAdapterPosition == 0 ? R$string.unify_fund_current_pair : R$string.unify_fund_other_pair);
        C24277v.m58542g((CoinAvatarView) helper.getView(R$id.coinAvatar), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
        helper.setText(R$id.tvCurrency, strM66669i);
        CollateralStatusUiHelper.m54264g(CollateralStatusUiHelper.f43602a, (ImageView) helper.getView(R$id.ivCurrencyCollateralStatus), item.getCollateralStatus(), this.f53182i.getChildFragmentManager(), "UnifyFundsCollateralStatusDialog", null, 16, null);
        int i12 = R$id.tvEquityValue;
        BigDecimal equity = item.getEquity();
        helper.setText(i12, C42180b.m92647l(equity != null ? C37886j.m85578b(equity, item.getCurrency(), null, false, true, false, 2, null, 0, InterfaceC33568bf.f69245q, null) : null));
        int i13 = R$id.tvEquityValueLegal;
        BigDecimal equity2 = item.getEquity();
        helper.setText(i13, C42180b.m92647l((equity2 == null || (bigDecimalAbs = equity2.abs()) == null) ? null : C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalAbs, item.getCurrency()))), null, null, 0, false, false, true, 31, null)));
        AssetApiRemoteConfig assetApiRemoteConfig = AssetApiRemoteConfig.f17838a;
        boolean z12 = (!assetApiRemoteConfig.m17476e() || C42827a.f94887a.m93899a(item.getCurrency()) || C41014a.m89917B(item.getEquity())) ? false : true;
        final boolean z13 = assetApiRemoteConfig.m17475d() && z12;
        int i14 = R$id.tvAvgCost;
        helper.setGone(i14, z12);
        int i15 = R$id.tvAvgCostValue;
        helper.setGone(i15, z12);
        int i16 = R$id.iv_edit_avg_cost;
        helper.setGone(i16, z13);
        helper.setText(i15, item.getCostPriceStr());
        if (z12) {
            View view = helper.getView(i14);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.unify.funds.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyFundsInfoAdapter.m65110S(this.f53259b, z13, item);
                }
            }, 1, null);
        }
        View view2 = helper.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.unify.funds.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65112U(z13, this, item);
            }
        }, 1, null);
        View view3 = helper.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.unify.funds.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65113V(z13, this, item);
            }
        }, 1, null);
        int i17 = R$id.tvHoldBalanceValue;
        BigDecimal occupiedEquity = item.getOccupiedEquity();
        helper.setText(i17, C42180b.m92647l(occupiedEquity != null ? C37886j.m85578b(occupiedEquity, item.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null));
        int i18 = R$id.tvLiabilityValue;
        BigDecimal liability = item.getLiability();
        helper.setText(i18, C42828b.m93910k(C42180b.m92647l(liability != null ? C37886j.m85578b(liability, item.getCurrency(), null, false, true, false, 2, null, 0, InterfaceC33568bf.f69245q, null) : null), strM66669i, null, 2, null));
        int i19 = R$id.tvPotentialBorrowValue;
        BigDecimal potentialBorrowing = item.getPotentialBorrowing();
        helper.setText(i19, C42828b.m93910k(C42180b.m92647l(potentialBorrowing != null ? C37886j.m85578b(potentialBorrowing, item.getCurrency(), null, false, false, false, 2, null, 0, 222, null) : null), strM66669i, null, 2, null));
        View view4 = helper.getView(R$id.btnBuySell);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.unify.funds.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65114W(this.f53262b, helper, item);
            }
        }, 1, null);
        int i21 = R$id.btnRepay;
        View view5 = helper.getView(i21);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C27046k.m66711z(view5, 0L, new Function0() { // from class: com.kubi.unify.funds.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65115X(this.f53266b, helper, item);
            }
        }, 1, null);
        View view6 = helper.getView(R$id.btnAddFunds);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        C27046k.m66711z(view6, 0L, new Function0() { // from class: com.kubi.unify.funds.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65116Y(item, this);
            }
        }, 1, null);
        View view7 = helper.getView(R$id.tvEquity);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C27046k.m66711z(view7, 0L, new Function0() { // from class: com.kubi.unify.funds.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65117Z(this.f53275b, helper, item, coinInfoEntityM85613u);
            }
        }, 1, null);
        int i22 = R$id.tvLiability;
        View view8 = helper.getView(i22);
        Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
        C27046k.m66711z(view8, 0L, new Function0() { // from class: com.kubi.unify.funds.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65118a0(this.f53280b);
            }
        }, 1, null);
        int i23 = R$id.tvHoldBalance;
        View view9 = helper.getView(i23);
        Intrinsics.checkNotNullExpressionValue(view9, "getView(...)");
        C27046k.m66711z(view9, 0L, new Function0() { // from class: com.kubi.unify.funds.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65107P(this.f53282b);
            }
        }, 1, null);
        boolean z14 = !C41014a.m89919D(C41014a.m89922G(item.getOccupiedEquity(), null, 1, null));
        helper.setGone(i23, z14);
        helper.setGone(i17, z14);
        boolean z15 = !C41014a.m89919D(C41014a.m89922G(item.getLiability(), null, 1, null));
        helper.setGone(i22, z15);
        helper.setGone(i18, z15);
        helper.setGone(i21, z15);
        helper.setGone(i21, false);
        boolean z16 = !C41014a.m89917B(item.getPotentialBorrowing());
        int i24 = R$id.tvPotentialBorrow;
        helper.setGone(i24, z16);
        View view10 = helper.getView(i24);
        Intrinsics.checkNotNullExpressionValue(view10, "getView(...)");
        C27046k.m66711z(view10, 0L, new Function0() { // from class: com.kubi.unify.funds.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65108Q(this.f53265b);
            }
        }, 1, null);
        helper.setGone(i19, z16);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.unify.funds.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65109R(item);
            }
        }, 1, null);
        helper.setVisible(R$id.tvSymbolOfflineAlert, m65157e0(item));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyFundsInfoAdapter(@NotNull UnifyFundsInfoFragment fragment) {
        super(R$layout.item_unify_funds_info);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f53182i = fragment;
        this.f53183j = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.funds.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(UnifyFundsInfoAdapter.m65120d0(this.f53209b));
            }
        });
        this.f53184k = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.funds.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65106N();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m65098G0() {
        UnifyDataStreamManager.f53365a.m65347G();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m65101I0(List list, View view, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((RecyclerView) helper.getView(R$id.recyclerview)).setAdapter(new UnifyFundsInfoAdapter$showTradeDialog$1$1(list, view, dialogFragmentHelper, R$layout.unify_item_market_item));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m65109R(UnifyFundsInfoEntity unifyFundsInfoEntity) {
        C4400a c4400aM4038a = Router.f46192a.m56184f("account/coinDetail").m4038a("coin", C27041f.m66668h(unifyFundsInfoEntity.getCurrency())).m4038a("type", 7);
        Integer collateralStatus = unifyFundsInfoEntity.getCollateralStatus();
        c4400aM4038a.m4038a("collateralStatus", Integer.valueOf(collateralStatus != null ? collateralStatus.intValue() : 1)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m65110S(final UnifyFundsInfoAdapter unifyFundsInfoAdapter, boolean z11, final UnifyFundsInfoEntity unifyFundsInfoEntity) {
        IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        FragmentManager childFragmentManager = unifyFundsInfoAdapter.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UnifyConfig unifyConfig = (UnifyConfig) C46392a.f104043a.m102336j(UnifyStoreIds.f53305a.m65252n(), UnifyConfig.class, null);
        iAssetsCenterService.mo15340e(childFragmentManager, z11, unifyConfig != null ? unifyConfig.getAvgCostPriceTime() : null, new Function0() { // from class: com.kubi.unify.funds.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65111T(this.f53205b, unifyFundsInfoEntity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m65112U(boolean z11, UnifyFundsInfoAdapter unifyFundsInfoAdapter, UnifyFundsInfoEntity unifyFundsInfoEntity) {
        if (z11) {
            unifyFundsInfoAdapter.m65153F0(unifyFundsInfoEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m65113V(boolean z11, UnifyFundsInfoAdapter unifyFundsInfoAdapter, UnifyFundsInfoEntity unifyFundsInfoEntity) {
        if (z11) {
            unifyFundsInfoAdapter.m65153F0(unifyFundsInfoEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m65114W(UnifyFundsInfoAdapter unifyFundsInfoAdapter, BaseViewHolder baseViewHolder, UnifyFundsInfoEntity unifyFundsInfoEntity) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        unifyFundsInfoAdapter.m65160h0(itemView, unifyFundsInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m65115X(UnifyFundsInfoAdapter unifyFundsInfoAdapter, BaseViewHolder baseViewHolder, UnifyFundsInfoEntity unifyFundsInfoEntity) {
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        unifyFundsInfoAdapter.m65165u0(context, unifyFundsInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m65116Y(UnifyFundsInfoEntity unifyFundsInfoEntity, UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        UnifyFundsAddDialog unifyFundsAddDialog = UnifyFundsAddDialog.f53255a;
        String currency = unifyFundsInfoEntity.getCurrency();
        FragmentManager childFragmentManager = unifyFundsInfoAdapter.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        unifyFundsAddDialog.m65221f(currency, childFragmentManager, "onRootViewClick");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m65117Z(UnifyFundsInfoAdapter unifyFundsInfoAdapter, BaseViewHolder baseViewHolder, UnifyFundsInfoEntity unifyFundsInfoEntity, CoinInfoEntity coinInfoEntity) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        unifyFundsInfoAdapter.m65166v0(itemView, unifyFundsInfoEntity, coinInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    private final InterfaceC38460c m65119b0() {
        return (InterfaceC38460c) this.f53184k.getValue();
    }

    /* JADX INFO: renamed from: d0 */
    public static final boolean m65120d0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        Bundle arguments = unifyFundsInfoAdapter.f53182i.getArguments();
        return C27025c.m66566d(arguments != null ? Boolean.valueOf(RouteExKt.m56250h(arguments, "isFutures")) : null);
    }

    /* JADX INFO: renamed from: i0 */
    public static final ObservableSource m65124i0(UnifyFundsInfoAdapter unifyFundsInfoAdapter, List chunk) {
        Intrinsics.checkNotNullParameter(chunk, "chunk");
        return unifyFundsInfoAdapter.m65119b0().m86751t(CollectionsKt.joinToString$default(chunk, ",", null, null, 0, null, null, 62, null)).compose(C24217a1.m58390n());
    }

    /* JADX INFO: renamed from: j0 */
    public static final ObservableSource m65126j0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: k0 */
    public static final List m65128k0(List listOfLists) {
        Intrinsics.checkNotNullParameter(listOfLists, "listOfLists");
        return CollectionsKt.flatten(listOfLists);
    }

    /* JADX INFO: renamed from: l0 */
    public static final List m65130l0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (List) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m65132m0(UnifyFundsInfoAdapter unifyFundsInfoAdapter, View view, List list) {
        BaseFragment.hideLoadingDialog$default(unifyFundsInfoAdapter.f53182i, false, 1, null);
        Intrinsics.checkNotNull(list);
        unifyFundsInfoAdapter.m65154H0(view, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m65136o0(UnifyFundsInfoAdapter unifyFundsInfoAdapter, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(unifyFundsInfoAdapter.f53182i, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m65152E0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_funds_unpnl).m54153J4(R$string.unify_funds_unpnl_desc).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "onUnPnlClick");
    }

    /* JADX INFO: renamed from: H0 */
    public final void m65154H0(final View view, final List<? extends TradeItemBean> list) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.unify_dialog_buy_sell_market, true).m54237f4(new Function2() { // from class: com.kubi.unify.funds.f0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UnifyFundsInfoAdapter.m65101I0(list, view, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "onBuySellClick");
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m65156c0() {
        return ((Boolean) this.f53183j.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m65158f0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_funds_ava_balance).m54153J4(R$string.unify_funds_ava_balance_desc).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "onAvailableClick");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m65159g0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_funds_ava_equity).m54153J4(R$string.unify_funds_ava_equity_desc).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "onAvailableEquityClick");
    }

    /* JADX INFO: renamed from: h0 */
    public final void m65160h0(final View view, UnifyFundsInfoEntity unifyFundsInfoEntity) {
        this.f53182i.showLoadingDialog();
        C37890n c37890n = C37890n.f85269a;
        String currency = unifyFundsInfoEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        List listM85584f = InterfaceC37888l.m85584f(c37890n, currency, false, false, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM85584f, 10));
        Iterator it = listM85584f.iterator();
        while (it.hasNext()) {
            arrayList.add(((SymbolInfoEntity) it.next()).getCode());
        }
        if (arrayList.isEmpty()) {
            ToastCompat.m66437C(R$string.coin_no_data);
            BaseFragment.hideLoadingDialog$default(this.f53182i, false, 1, null);
            return;
        }
        Observable observableFromIterable = Observable.fromIterable(CollectionsKt.chunked(arrayList, 50));
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.funds.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoAdapter.m65124i0(this.f53279b, (List) obj);
            }
        };
        Single list = observableFromIterable.flatMap(new Function() { // from class: com.kubi.unify.funds.u
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UnifyFundsInfoAdapter.m65126j0(function1, obj);
            }
        }, true).toList();
        final Function1 function2 = new Function1() { // from class: com.kubi.unify.funds.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoAdapter.m65128k0((List) obj);
            }
        };
        Single singleObserveOn = list.map(new Function() { // from class: com.kubi.unify.funds.w
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return UnifyFundsInfoAdapter.m65130l0(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.unify.funds.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoAdapter.m65132m0(this.f53287b, view, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.unify.funds.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifyFundsInfoAdapter.m65134n0(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.unify.funds.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoAdapter.m65136o0(this.f53293b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = singleObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.unify.funds.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UnifyFundsInfoAdapter.m65138p0(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f53182i.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: q0 */
    public final void m65161q0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_fund_equity).m54153J4(R$string.unify_fund_equity_desc).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "onEquityClick");
    }

    /* JADX INFO: renamed from: r0 */
    public final void m65162r0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_funds_hold_equity).m54153J4(R$string.unify_funds_hold_equity_desc).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "onHoldBalanceClick");
    }

    /* JADX INFO: renamed from: s0 */
    public final void m65163s0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_fund_avg_liabilities).m54153J4(R$string.unify_fund_avg_liabilities_desc_for_assets).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "onLiabilityClick");
    }

    /* JADX INFO: renamed from: t0 */
    public final void m65164t0() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_potential_borrow).m54153J4(R$string.unify_potential_borrow_desc).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "onPotentialBorrowClick");
    }

    /* JADX INFO: renamed from: u0 */
    public final void m65165u0(Context context, UnifyFundsInfoEntity unifyFundsInfoEntity) {
        IUnifyAccountService iUnifyAccountService = IUnifyAccountService.f53155a.get();
        String currency = unifyFundsInfoEntity.getCurrency();
        BigDecimal liability = unifyFundsInfoEntity.getLiability();
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iUnifyAccountService.mo65006v(context, currency, liability, childFragmentManager);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m65166v0(final View view, final UnifyFundsInfoEntity unifyFundsInfoEntity, final CoinInfoEntity coinInfoEntity) {
        DialogFragmentHelper dialogFragmentHelperM54238g4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.unify_dialog_funds_info_detail, true).m54238g4(new Function1() { // from class: com.kubi.unify.funds.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyFundsInfoAdapter.m65146w0(coinInfoEntity, unifyFundsInfoEntity, view, this, (BaseViewHolder) obj);
            }
        });
        FragmentManager childFragmentManager = this.f53182i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54238g4.show(childFragmentManager, "onRootViewClick");
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m65088A0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65158f0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m65090B0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65159g0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m65092C0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65162r0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m65094D0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65164t0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final InterfaceC38460c m65106N() {
        return (InterfaceC38460c) C42597a.m93386b().create(InterfaceC38460c.class);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m65107P(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65162r0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m65108Q(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65164t0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m65111T(UnifyFundsInfoAdapter unifyFundsInfoAdapter, UnifyFundsInfoEntity unifyFundsInfoEntity) {
        unifyFundsInfoAdapter.m65153F0(unifyFundsInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m65118a0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65163s0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m65134n0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m65138p0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m65148x0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65161q0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m65150y0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65163s0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m65151z0(UnifyFundsInfoAdapter unifyFundsInfoAdapter) {
        unifyFundsInfoAdapter.m65152E0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m65153F0(UnifyFundsInfoEntity unifyFundsInfoEntity) {
        String str;
        String plainString;
        BigDecimal bigDecimalM11724a;
        if (m65156c0()) {
            str = "B6UnifiedFuturesTrade";
        } else {
            str = "B5UnifyTrading";
        }
        String str2 = str;
        IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        UnifyFundsInfoFragment unifyFundsInfoFragment = this.f53182i;
        String currency = unifyFundsInfoEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        String str3 = currency;
        BigDecimal avgCostPrice = unifyFundsInfoEntity.getAvgCostPrice();
        if (avgCostPrice != null && (bigDecimalM11724a = C6447a.m11724a(avgCostPrice)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        } else {
            plainString = null;
        }
        iAssetsCenterService.mo15352r(unifyFundsInfoFragment, str3, plainString, new Function0() { // from class: com.kubi.unify.funds.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter.m65098G0();
            }
        }, str2, "unifyFundsEditAvgCost");
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m65157e0(UnifyFundsInfoEntity unifyFundsInfoEntity) {
        String strIsDelisting;
        CoinProperty properties;
        if (unifyFundsInfoEntity.getCurrency() == null) {
            return false;
        }
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(unifyFundsInfoEntity.getCurrency());
        if (coinInfoEntityM85613u != null && (properties = coinInfoEntityM85613u.getProperties()) != null) {
            strIsDelisting = properties.isDelisting();
        } else {
            strIsDelisting = null;
        }
        return Intrinsics.areEqual("TRUE", strIsDelisting);
    }
}
