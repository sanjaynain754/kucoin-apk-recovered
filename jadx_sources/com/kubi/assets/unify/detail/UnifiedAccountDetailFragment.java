package com.kubi.assets.unify.detail;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.AccountDetailHeaderView;
import com.kubi.assets.detail.BaseAccountDetailFragment;
import com.kubi.assets.detail.FullCoinBean;
import com.kubi.assets.entity.UnifiedAccountDetailEntity;
import com.kubi.assets.entity.UnifiedAccountDetailEntityKt;
import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.assets.entity.UnifyPageEntity;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41775x1;
import mr.C42597a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p365jb.InterfaceC40366c;
import p365jb.UnifiedAccountDetailUiData;
import p402kf.C41014a;
import p429lf.C42179a;
import p637ta.C44828n5;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: UnifiedAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010%\u001a\u00020\u0013H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0018\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0002H\u0014J\b\u00100\u001a\u00020'H\u0016J$\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000203022\u0006\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001cH\u0014J\u0012\u00106\u001a\u0002072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u00108\u001a\u00020'2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u001a\u0010;\u001a\u0002072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J$\u0010<\u001a\u00020'2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0AH\u0002J\b\u0010B\u001a\u000207H\u0002J\u0016\u0010C\u001a\u00020'2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020D0>H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006F"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/UnifiedAccountDetailFragment;", "Lcom/kubi/assets/detail/BaseAccountDetailFragment;", "Lcom/kubi/assets/entity/UnifiedAccountDetailEntity;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "unifiedApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getUnifiedApi", "()Lcom/kubi/assets/AssetV2Api;", "unifiedApi$delegate", "Lkotlin/Lazy;", "code", "", "getCode", "()Ljava/lang/String;", "code$delegate", "isFiat", "", "()Z", "isFiat$delegate", "collateralStatus", "", "getCollateralStatus", "()Ljava/lang/Integer;", "collateralStatus$delegate", "unifiedDetailVM", "Lcom/kubi/assets/unify/detail/UnifiedDetailVM;", "getUnifiedDetailVM", "()Lcom/kubi/assets/unify/detail/UnifiedDetailVM;", "unifiedDetailVM$delegate", "getAccountType", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "startFetchAccountDetail", "Lkotlinx/coroutines/Job;", "initHeaderInfo", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/assets/unify/detail/data/UnifiedAccountDetailUiData;", "startFetchRecommendSymbolQuote", "setRecommendList", "list", "", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol;", "consumer", "Lio/reactivex/functions/Consumer;", "subBottomBtnListFlow", "updateBottomBtnListUI", "Lcom/kubi/assets/unify/detail/BottomFunctionData;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedAccountDetailFragment.kt\ncom/kubi/assets/unify/detail/UnifiedAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n147#2,16:349\n1#3:365\n*S KotlinDebug\n*F\n+ 1 UnifiedAccountDetailFragment.kt\ncom/kubi/assets/unify/detail/UnifiedAccountDetailFragment\n*L\n62#1:349,16\n*E\n"})
public final class UnifiedAccountDetailFragment extends BaseAccountDetailFragment<UnifiedAccountDetailEntity> {

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final InterfaceC24293a f18959h0 = C45681e.m100799e(this, new Function1<UnifiedAccountDetailFragment, C44828n5>() { // from class: com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44828n5 invoke(@NotNull UnifiedAccountDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44828n5.m99182a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44828n5, Unit>() { // from class: com.kubi.assets.unify.detail.UnifiedAccountDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44828n5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44828n5 c44828n5) {
            invoke(c44828n5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f18960i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.detail.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifiedAccountDetailFragment.m19788t5();
        }
    });

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f18961j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.detail.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifiedAccountDetailFragment.m19781e5(this.f18985b);
        }
    });

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f18962k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.detail.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(UnifiedAccountDetailFragment.m19787o5(this.f18986b));
        }
    });

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f18963l0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.detail.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifiedAccountDetailFragment.m19782f5(this.f18987b);
        }
    });

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final Lazy f18964m0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.unify.detail.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifiedAccountDetailFragment.m19789u5();
        }
    });

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ KProperty<Object>[] f18958o0 = {Reflection.property1(new PropertyReference1Impl(UnifiedAccountDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public static final Companion f18957n0 = new Companion(null);

    /* JADX INFO: compiled from: UnifiedAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/unify/detail/UnifiedAccountDetailFragment$Companion;", "", "<init>", "()V", "EXTRA_COLLATERAL_STATUS", "", "startFragment", "", "context", "Landroid/content/Context;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @NotNull UnifiedAssetsEntity entity) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(entity, "entity");
            String string = context.getString(R$string.unified_account_detail_title);
            String name = UnifiedAccountDetailFragment.class.getName();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", entity);
            bundle.putString("code", entity.getCurrency());
            bundle.putBoolean("isFiat", entity.isFiat());
            Integer collateralStatus = entity.getCollateralStatus();
            bundle.putInt("collateralStatus", collateralStatus != null ? collateralStatus.intValue() : 0);
            Unit unit = Unit.INSTANCE;
            BaseFragmentActivity.m56574n0(context, string, name, bundle);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m19780d5(UnifiedAccountDetailFragment unifiedAccountDetailFragment, UnifiedAccountDetailEntity unifiedAccountDetailEntity) {
        AssetsHelper.f18684a.m19168l(unifiedAccountDetailFragment.getContext(), UnifiedAccountDetailEntityKt.mapToAccountDetailEntity(unifiedAccountDetailEntity, unifiedAccountDetailFragment.m15914h4()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public final C44828n5 m19783g4() {
        return (C44828n5) this.f18959h0.getValue(this, f18958o0[0]);
    }

    /* JADX INFO: renamed from: g5 */
    private final String m19784g5() {
        return (String) this.f18961j0.getValue();
    }

    /* JADX INFO: renamed from: i5 */
    public static final BasePageEntity m19785i5(UnifyPageEntity last) {
        Intrinsics.checkNotNullParameter(last, "last");
        BasePageEntity basePageEntity = new BasePageEntity();
        basePageEntity.setItems(last.getItems());
        basePageEntity.setHasNext(C27039d.m66650j(last.getTotalPage()) > C27039d.m66650j(last.getCurrentPage()));
        Long totalNum = last.getTotalNum();
        basePageEntity.setTotalNum(C27039d.m66650j(totalNum != null ? Integer.valueOf((int) totalNum.longValue()) : null));
        return basePageEntity;
    }

    /* JADX INFO: renamed from: j5 */
    public static final BasePageEntity m19786j5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: u5 */
    public static final UnifiedDetailVM m19789u5() {
        return new UnifiedDetailVM();
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    @NotNull
    /* JADX INFO: renamed from: c4 */
    public String mo15911c4() {
        return "UNIFIED";
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final UnifiedAccountDetailEntity item) {
        TextView textView;
        BigDecimal bigDecimalAbs;
        String strM85563b;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tv_type, item.getBizTypeCode());
        int i11 = R$id.tv_time;
        Long tradeDate = item.getTradeDate();
        String strM93915p = null;
        helper.setText(i11, tradeDate != null ? C42179a.m92633f(tradeDate.longValue(), null, true, true, null, 9, null) : null);
        int i12 = R$id.tv_amount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(UnifiedAccountDetailEntityKt.getDirectionSymbol(item));
        BigDecimal totalAmountWithFeeTax = item.getTotalAmountWithFeeTax();
        if (totalAmountWithFeeTax != null && (bigDecimalAbs = totalAmountWithFeeTax.abs()) != null && (strM85563b = C37885i.m85563b(bigDecimalAbs, m15914h4().getCode(), 0, 2, null)) != null) {
            strM93915p = C42828b.m93915p(strM85563b);
        }
        sb2.append(C27041f.m66669i(strM93915p, "--"));
        helper.setText(i12, sb2.toString()).setTextColor(i12, UnifiedAccountDetailEntityKt.getDirectionColor(item, this.mContext));
        View view = getView();
        if (view != null && (textView = (TextView) view.findViewById(i12)) != null) {
            C24256n1.m58513c(textView);
        }
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.unify.detail.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedAccountDetailFragment.m19780d5(this.f18982b, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: h5 */
    public final Integer m19794h5() {
        return (Integer) this.f18963l0.getValue();
    }

    /* JADX INFO: renamed from: k5 */
    public final AssetV2Api m19795k5() {
        return (AssetV2Api) this.f18960i0.getValue();
    }

    /* JADX INFO: renamed from: l5 */
    public final UnifiedDetailVM m19796l5() {
        return (UnifiedDetailVM) this.f18964m0.getValue();
    }

    /* JADX INFO: renamed from: m5 */
    public final void m19797m5(UnifiedAccountDetailUiData unifiedAccountDetailUiData) {
        BigDecimal unAvailableEquity;
        BigDecimal unAvailableEquity2;
        BigDecimal unrealisedPnl;
        String strM85563b;
        BigDecimal liability;
        BigDecimal liability2;
        BigDecimal availableEquity;
        BigDecimal availableEquity2;
        AccountDetailHeaderView accountDetailHeaderView;
        BigDecimal equity;
        BigDecimal bigDecimalAbs;
        BigDecimal equity2;
        AccountDetailHeaderView accountDetailHeaderView2;
        AccountDetailHeaderView accountDetailHeaderView3;
        if (unifiedAccountDetailUiData != null) {
            C44828n5 c44828n5M19783g4 = m19783g4();
            if (c44828n5M19783g4 != null && (accountDetailHeaderView3 = c44828n5M19783g4.f100515e) != null) {
                accountDetailHeaderView3.m15861a(new FullCoinBean(C27041f.m66668h(unifiedAccountDetailUiData.getCurrencyIconUrl()), C27041f.m66669i(unifiedAccountDetailUiData.getCode(), "--"), C27041f.m66669i(unifiedAccountDetailUiData.getCurrencyName(), "--")));
            }
            C44828n5 c44828n5M19783g5 = m19783g4();
            if (c44828n5M19783g5 != null && (accountDetailHeaderView2 = c44828n5M19783g5.f100515e) != null) {
                accountDetailHeaderView2.m15862b(unifiedAccountDetailUiData.getCollateralStatus(), getChildFragmentManager());
            }
        }
        C44828n5 c44828n5M19783g6 = m19783g4();
        String strM89950x = null;
        if (c44828n5M19783g6 != null && (accountDetailHeaderView = c44828n5M19783g6.f100515e) != null) {
            accountDetailHeaderView.m15863c(C27041f.m66669i((unifiedAccountDetailUiData == null || (equity2 = unifiedAccountDetailUiData.getEquity()) == null) ? null : C37885i.m85563b(equity2, unifiedAccountDetailUiData.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((unifiedAccountDetailUiData == null || (equity = unifiedAccountDetailUiData.getEquity()) == null || (bigDecimalAbs = equity.abs()) == null) ? null : C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, unifiedAccountDetailUiData.getCurrency()), null, null, 0, false, false, false, false, 127, null), "--"));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.unify_trading_label_transferable), C27041f.m66669i((unifiedAccountDetailUiData == null || (availableEquity2 = unifiedAccountDetailUiData.getAvailableEquity()) == null) ? null : C37885i.m85563b(availableEquity2, unifiedAccountDetailUiData.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((unifiedAccountDetailUiData == null || (availableEquity = unifiedAccountDetailUiData.getAvailableEquity()) == null) ? null : C41014a.m89950x(C41014a.m89940n(availableEquity, unifiedAccountDetailUiData.getCurrency()), null, null, 0, false, false, false, false, 127, null), "--"), false, null, null, null, null, 248, null));
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.unify_trading_label_debt), C27041f.m66669i((unifiedAccountDetailUiData == null || (liability2 = unifiedAccountDetailUiData.getLiability()) == null) ? null : C37885i.m85563b(liability2, unifiedAccountDetailUiData.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((unifiedAccountDetailUiData == null || (liability = unifiedAccountDetailUiData.getLiability()) == null) ? null : C41014a.m89950x(C41014a.m89940n(liability, unifiedAccountDetailUiData.getCurrency()), null, null, 0, false, false, false, false, 127, null), "--"), false, null, null, null, null, 248, null));
        String string = getString(R$string.unify_trading_unpnl);
        String strM66669i = C27041f.m66669i((unifiedAccountDetailUiData == null || (unrealisedPnl = unifiedAccountDetailUiData.getUnrealisedPnl()) == null || (strM85563b = C37885i.m85563b(unrealisedPnl, unifiedAccountDetailUiData.getCurrency(), 0, 2, null)) == null) ? null : C37885i.m85575n(strM85563b, unifiedAccountDetailUiData.getUnrealisedPnl()), "--");
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(string, strM66669i, null, false, Integer.valueOf(C22890g.m54280e(mContext, C41014a.m89922G(unifiedAccountDetailUiData != null ? unifiedAccountDetailUiData.getUnrealisedPnl() : null, null, 1, null), R$color.c_text40)), null, null, null, 236, null));
        String string2 = getString(R$string.unify_fund_hold_key);
        String strM66669i2 = C27041f.m66669i((unifiedAccountDetailUiData == null || (unAvailableEquity2 = unifiedAccountDetailUiData.getUnAvailableEquity()) == null) ? null : C37885i.m85563b(unAvailableEquity2, unifiedAccountDetailUiData.getCurrency(), 0, 2, null), "--");
        if (unifiedAccountDetailUiData != null && (unAvailableEquity = unifiedAccountDetailUiData.getUnAvailableEquity()) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(unAvailableEquity, unifiedAccountDetailUiData.getCurrency()), null, null, 0, false, false, false, false, 127, null);
        }
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(string2, strM66669i2, C27041f.m66669i(strM89950x, "--"), false, null, null, null, null, 240, null));
        m15904C4(arrayList);
    }

    /* JADX INFO: renamed from: n5 */
    public final boolean m19798n5() {
        return ((Boolean) this.f18962k0.getValue()).booleanValue();
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment, com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m19801r5(m19784g5(), m19798n5());
    }

    /* JADX INFO: renamed from: e5 */
    public static final String m19781e5(UnifiedAccountDetailFragment unifiedAccountDetailFragment) {
        return unifiedAccountDetailFragment.requireActivity().getIntent().getStringExtra("code");
    }

    /* JADX INFO: renamed from: f5 */
    public static final Integer m19782f5(UnifiedAccountDetailFragment unifiedAccountDetailFragment) {
        Integer numValueOf = Integer.valueOf(unifiedAccountDetailFragment.requireActivity().getIntent().getIntExtra("collateralStatus", 0));
        if (numValueOf.intValue() > 0) {
            return numValueOf;
        }
        return null;
    }

    /* JADX INFO: renamed from: o5 */
    public static final boolean m19787o5(UnifiedAccountDetailFragment unifiedAccountDetailFragment) {
        return unifiedAccountDetailFragment.requireActivity().getIntent().getBooleanExtra("isFiat", false);
    }

    /* JADX INFO: renamed from: t5 */
    public static final AssetV2Api m19788t5() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m19790w5(BottomFunctionData bottomFunctionData, UnifiedAccountDetailFragment unifiedAccountDetailFragment) {
        bottomFunctionData.m19850b().invoke(unifiedAccountDetailFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m19791x5(BottomFunctionData bottomFunctionData, UnifiedAccountDetailFragment unifiedAccountDetailFragment) {
        bottomFunctionData.m19850b().invoke(unifiedAccountDetailFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m19792y5(BottomFunctionData bottomFunctionData, UnifiedAccountDetailFragment unifiedAccountDetailFragment) {
        bottomFunctionData.m19850b().invoke(unifiedAccountDetailFragment);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m19800q5(m19784g5());
        m19802s5();
    }

    /* JADX INFO: renamed from: p5 */
    public final void m19799p5(List<? extends InterfaceC40366c> list, Consumer<InterfaceC40366c> consumer) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        BaseTextView baseTextView;
        FrameLayout frameLayout;
        C44828n5 c44828n5M19783g4 = m19783g4();
        if (c44828n5M19783g4 != null && (frameLayout = c44828n5M19783g4.f100522l) != null) {
            ViewExtKt.m66594y(frameLayout);
        }
        C44828n5 c44828n5M19783g5 = m19783g4();
        if (c44828n5M19783g5 != null && (baseTextView = c44828n5M19783g5.f100525o) != null) {
            baseTextView.setVisibility(8);
        }
        C44828n5 c44828n5M19783g6 = m19783g4();
        RecyclerView.Adapter adapter2 = null;
        if (c44828n5M19783g6 != null && (recyclerView4 = c44828n5M19783g6.f100520j) != null) {
            adapter = recyclerView4.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter == null) {
            C44828n5 c44828n5M19783g7 = m19783g4();
            if (c44828n5M19783g7 != null && (recyclerView3 = c44828n5M19783g7.f100520j) != null) {
                ViewExtKt.m66584o(recyclerView3, C27040e.m66658b(10), 0, C27040e.m66658b(10), 0);
            }
            C44828n5 c44828n5M19783g8 = m19783g4();
            if (c44828n5M19783g8 != null && (recyclerView2 = c44828n5M19783g8.f100520j) != null) {
                recyclerView2.setAdapter(new UnifiedAccountDetailFragment$setRecommendList$1(consumer, R$layout.item_asset_header_trade));
            }
        }
        C44828n5 c44828n5M19783g9 = m19783g4();
        if (c44828n5M19783g9 != null && (recyclerView = c44828n5M19783g9.f100520j) != null) {
            adapter2 = recyclerView.getAdapter();
        }
        Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type io.chad.library.adapter.base.BaseQuickAdapter<com.kubi.assets.unify.detail.data.UnifiedRecommendSymbol, io.chad.library.adapter.base.BaseViewHolder>");
        ((BaseQuickAdapter) adapter2).replaceData(list);
    }

    /* JADX INFO: renamed from: q5 */
    public final InterfaceC41775x1 m19800q5(String str) {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UnifiedAccountDetailFragment$startFetchAccountDetail$1(this, str, null));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<UnifiedAccountDetailEntity>> mo16440r3(int i11, int i12) {
        Object obj;
        Object next;
        String value;
        String str;
        Object next2;
        String str2;
        String str3;
        String value2;
        String value3;
        Iterator<T> it = m15915i4().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((ParcelizePair) next).getKey(), "time"));
        ParcelizePair parcelizePair = (ParcelizePair) next;
        if (parcelizePair == null || (value = parcelizePair.getValue()) == null) {
            value = "";
        }
        long jM15917k4 = m15917k4(value.toString());
        String endTime = getF16861b0().f54265b;
        Intrinsics.checkNotNullExpressionValue(endTime, "endTime");
        long j11 = Long.parseLong(endTime);
        AssetV2Api assetV2ApiM19795k5 = m19795k5();
        String code = m15914h4().getCode();
        if (code == null) {
            str = "";
        } else {
            str = code;
        }
        Iterator<T> it2 = m15915i4().iterator();
        do {
            if (it2.hasNext()) {
                next2 = it2.next();
            } else {
                next2 = null;
                break;
            }
        } while (!Intrinsics.areEqual(((ParcelizePair) next2).getKey(), "direction"));
        ParcelizePair parcelizePair2 = (ParcelizePair) next2;
        if (parcelizePair2 == null || (value3 = parcelizePair2.getValue()) == null) {
            str2 = "";
        } else {
            str2 = value3;
        }
        for (Object obj2 : m15915i4()) {
            if (Intrinsics.areEqual(((ParcelizePair) obj2).getKey(), "bizType")) {
                obj = obj2;
                break;
            }
        }
        ParcelizePair parcelizePair3 = (ParcelizePair) obj;
        if (parcelizePair3 == null || (value2 = parcelizePair3.getValue()) == null) {
            str3 = "";
        } else {
            str3 = value2;
        }
        Observable observableObserveOn = assetV2ApiM19795k5.m17133g1(str, str2, i11, str3, i12, jM15917k4, j11).compose(C24217a1.m58390n()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.unify.detail.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return UnifiedAccountDetailFragment.m19785i5((UnifyPageEntity) obj3);
            }
        };
        Observable<BasePageEntity<UnifiedAccountDetailEntity>> map = observableObserveOn.map(new Function() { // from class: com.kubi.assets.unify.detail.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj3) {
                return UnifiedAccountDetailFragment.m19786j5(function1, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: renamed from: r5 */
    public final InterfaceC41775x1 m19801r5(String str, boolean z11) {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UnifiedAccountDetailFragment$startFetchRecommendSymbolQuote$1(z11, this, str, null));
    }

    /* JADX INFO: renamed from: s5 */
    public final InterfaceC41775x1 m19802s5() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UnifiedAccountDetailFragment$subBottomBtnListFlow$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX INFO: renamed from: v5 */
    public final void m19803v5(List<BottomFunctionData> list) {
        C44828n5 c44828n5M19783g4;
        KcPrimaryButton kcPrimaryButton;
        C44828n5 c44828n5M19783g5;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        KcPrimaryButton kcPrimaryButton6;
        Unit unit;
        KcPrimaryButton kcPrimaryButton7;
        KcPrimaryButton kcPrimaryButton8;
        KcPrimaryButton kcPrimaryButton9;
        Unit unit2;
        KcPrimaryButton kcPrimaryButton10;
        KcPrimaryButton kcPrimaryButton11;
        KcPrimaryButton kcPrimaryButton12;
        final BottomFunctionData bottomFunctionData = (BottomFunctionData) CollectionsKt.firstOrNull((List) list);
        Unit unit3 = null;
        if (bottomFunctionData != null) {
            C44828n5 c44828n5M19783g6 = m19783g4();
            if (c44828n5M19783g6 != null && (kcPrimaryButton12 = c44828n5M19783g6.f100524n) != null) {
                kcPrimaryButton12.setText(bottomFunctionData.getFuncBtnText());
            }
            C44828n5 c44828n5M19783g7 = m19783g4();
            if (c44828n5M19783g7 != null && (kcPrimaryButton11 = c44828n5M19783g7.f100524n) != null) {
                kcPrimaryButton11.setVisibility(0);
            }
            C44828n5 c44828n5M19783g8 = m19783g4();
            if (c44828n5M19783g8 != null && (kcPrimaryButton10 = c44828n5M19783g8.f100524n) != null) {
                C27046k.m66711z(kcPrimaryButton10, 0L, new Function0() { // from class: com.kubi.assets.unify.detail.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnifiedAccountDetailFragment.m19790w5(bottomFunctionData, this);
                    }
                }, 1, null);
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                c44828n5M19783g4 = m19783g4();
                if (c44828n5M19783g4 != null) {
                    kcPrimaryButton.setVisibility(8);
                }
            }
        } else {
            c44828n5M19783g4 = m19783g4();
            if (c44828n5M19783g4 != null && (kcPrimaryButton = c44828n5M19783g4.f100524n) != null) {
                kcPrimaryButton.setVisibility(8);
            }
        }
        final BottomFunctionData bottomFunctionData2 = (BottomFunctionData) CollectionsKt.getOrNull(list, 1);
        if (bottomFunctionData2 != null) {
            C44828n5 c44828n5M19783g9 = m19783g4();
            if (c44828n5M19783g9 != null && (kcPrimaryButton9 = c44828n5M19783g9.f100523m) != null) {
                kcPrimaryButton9.setText(bottomFunctionData2.getFuncBtnText());
            }
            C44828n5 c44828n5M19783g10 = m19783g4();
            if (c44828n5M19783g10 != null && (kcPrimaryButton8 = c44828n5M19783g10.f100523m) != null) {
                kcPrimaryButton8.setVisibility(0);
            }
            C44828n5 c44828n5M19783g11 = m19783g4();
            if (c44828n5M19783g11 != null && (kcPrimaryButton7 = c44828n5M19783g11.f100523m) != null) {
                C27046k.m66711z(kcPrimaryButton7, 0L, new Function0() { // from class: com.kubi.assets.unify.detail.j
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnifiedAccountDetailFragment.m19791x5(bottomFunctionData2, this);
                    }
                }, 1, null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                c44828n5M19783g5 = m19783g4();
                if (c44828n5M19783g5 != null) {
                    kcPrimaryButton2.setVisibility(8);
                }
            }
        } else {
            c44828n5M19783g5 = m19783g4();
            if (c44828n5M19783g5 != null && (kcPrimaryButton2 = c44828n5M19783g5.f100523m) != null) {
                kcPrimaryButton2.setVisibility(8);
            }
        }
        final BottomFunctionData bottomFunctionData3 = (BottomFunctionData) CollectionsKt.getOrNull(list, 2);
        if (bottomFunctionData3 != null) {
            C44828n5 c44828n5M19783g12 = m19783g4();
            if (c44828n5M19783g12 != null && (kcPrimaryButton6 = c44828n5M19783g12.f100526p) != null) {
                kcPrimaryButton6.setText(bottomFunctionData3.getFuncBtnText());
            }
            C44828n5 c44828n5M19783g13 = m19783g4();
            if (c44828n5M19783g13 != null && (kcPrimaryButton5 = c44828n5M19783g13.f100526p) != null) {
                kcPrimaryButton5.setVisibility(0);
            }
            C44828n5 c44828n5M19783g14 = m19783g4();
            if (c44828n5M19783g14 != null && (kcPrimaryButton4 = c44828n5M19783g14.f100526p) != null) {
                C27046k.m66711z(kcPrimaryButton4, 0L, new Function0() { // from class: com.kubi.assets.unify.detail.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnifiedAccountDetailFragment.m19792y5(bottomFunctionData3, this);
                    }
                }, 1, null);
                unit3 = Unit.INSTANCE;
            }
            if (unit3 != null) {
                return;
            }
        }
        C44828n5 c44828n5M19783g15 = m19783g4();
        if (c44828n5M19783g15 != null && (kcPrimaryButton3 = c44828n5M19783g15.f100526p) != null) {
            kcPrimaryButton3.setVisibility(8);
        }
    }
}
