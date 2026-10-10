package com.kubi.margin.delegation.interest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.appsflyer.AppsFlyerProperties;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.delegation.MarginDelegationFragment;
import com.kubi.margin.delegation.borrowing.MarginDelegationFilterViewExt;
import com.kubi.margin.entity.DelegationInterestEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36925m;
import p206dp.C36928n0;
import p429lf.C42179a;
import p429lf.C42180b;
import p768xo.InterfaceC46307h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginDelegationInterestFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010'\u001a\u00020\u001aH\u0014J\b\u0010(\u001a\u00020\u001cH\u0014J\b\u0010)\u001a\u00020\u001cH\u0014J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0002H\u0014J\u0012\u00102\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u00103\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eH\u0002J&\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000207\u0018\u0001062\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0014J\u0010\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u000eH\u0002J\u001a\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010G\u001a\u00020-H\u0016J\u0006\u0010H\u001a\u00020-J\u0006\u0010I\u001a\u00020-J\u000e\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u00020LJ\b\u0010M\u001a\u00020-H\u0016J\b\u0010N\u001a\u00020-H\u0016J\b\u0010O\u001a\u00020\u001cH\u0014R#\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b$\u0010%R\u000e\u0010:\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006Q"}, m90084d2 = {"Lcom/kubi/margin/delegation/interest/MarginDelegationInterestFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/margin/entity/DelegationInterestEntity;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentDelegationInterestBinding;", "getBinding$annotations", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentDelegationInterestBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "symbol", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "coin", "getCoin", "setCoin", "timeType", "isFilter", "", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "mTradeApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/margin/api/MarketApi;", "mTradeApi$delegate", "needDefaultBackground", "getLayout", "getItemLayout", "canLoad", "needAutoLoad", "onLoad", "", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getSymbolName", "getCurrencyName", FirebaseAnalytics.Param.CURRENCY, "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getStart", "value", "filterView", "Lcom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt;", "getFilterView", "()Lcom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshData", "updateCoin", "updateSymbol", "setFilterData", "time", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "showContent", "showEmpty", "getEndFooterText", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginDelegationInterestFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationInterestFragment.kt\ncom/kubi/margin/delegation/interest/MarginDelegationInterestFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,261:1\n147#2,16:262\n*S KotlinDebug\n*F\n+ 1 MarginDelegationInterestFragment.kt\ncom/kubi/margin/delegation/interest/MarginDelegationInterestFragment\n*L\n50#1:262,16\n*E\n"})
public final class MarginDelegationInterestFragment extends BasePagingFragment<DelegationInterestEntity> {

    /* JADX INFO: renamed from: e0 */
    public boolean f32920e0;

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ KProperty<Object>[] f32914k0 = {Reflection.property1(new PropertyReference1Impl(MarginDelegationInterestFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentDelegationInterestBinding;", 0))};

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f32913j0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f32915Z = C45681e.m100799e(this, new Function1<MarginDelegationInterestFragment, C36925m>() { // from class: com.kubi.margin.delegation.interest.MarginDelegationInterestFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36925m invoke(@NotNull MarginDelegationInterestFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36925m.m82718a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36925m, Unit>() { // from class: com.kubi.margin.delegation.interest.MarginDelegationInterestFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36925m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36925m c36925m) {
            invoke(c36925m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final HashMap<String, String> f32916a0 = new HashMap<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f32917b0 = "";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f32918c0 = "";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public String f32919d0 = "THREE_MONTH";

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f32921f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.interest.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginDelegationInterestFragment.m38200Z3(this.f32925b));
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f32922g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.interest.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDelegationInterestFragment.m38195T3();
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public TimeUtils.C27004b f32923h0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MarginDelegationFilterViewExt f32924i0 = new MarginDelegationFilterViewExt();

    /* JADX INFO: compiled from: MarginDelegationInterestFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/delegation/interest/MarginDelegationInterestFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/delegation/interest/MarginDelegationInterestFragment;", "tradeType", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginDelegationInterestFragment newInstance(int tradeType) {
            MarginDelegationInterestFragment marginDelegationInterestFragment = new MarginDelegationInterestFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("tradeType", tradeType);
            marginDelegationInterestFragment.setArguments(bundle);
            return marginDelegationInterestFragment;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: B3 */
    public boolean mo21464B3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: P3 */
    private final String m38191P3(String str) {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        return C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null);
    }

    /* JADX INFO: renamed from: Q3 */
    private final InterfaceC46307h m38192Q3() {
        return (InterfaceC46307h) this.f32922g0.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    private final String m38194S3(String str) {
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        return C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m38196U3(MarginDelegationInterestFragment marginDelegationInterestFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        marginDelegationInterestFragment.m38203Y3((FilterType.InterfaceC23033b) it.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m38197V3(C36925m c36925m) {
        DropMenuView dropMenuView = c36925m.f81812e;
        if (dropMenuView != null) {
            dropMenuView.m55148k();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f32923h0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull DelegationInterestEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (getTradeType() == 2) {
            helper.setGone(R$id.tv_coin, true);
            int i11 = R$id.tv_coin_value;
            helper.setGone(i11, true);
            helper.setText(i11, m38191P3(item.getCurrency()));
            helper.setText(R$id.tv_trade_pair, m38194S3(item.getBorrowerAccountTag()));
        } else {
            helper.setGone(R$id.tv_coin, false);
            helper.setGone(R$id.tv_coin_value, false);
            helper.setText(R$id.tv_trade_pair, m38191P3(item.getCurrency()));
        }
        int i12 = R$id.tv_amount_value;
        View view = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BaseViewHolder text = helper.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(item.getCreatedAt()), null, false, false, null, 15, null));
        BigDecimal interestAmount = item.getInterestAmount();
        BaseViewHolder text2 = text.setText(i12, C27041f.m66669i(interestAmount != null ? C37886j.m85578b(interestAmount, item.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        int i13 = R$id.tv_repay_dayinterest_value;
        BigDecimal dayRatio = item.getDayRatio();
        text2.setText(i13, C42180b.m92649n(dayRatio != null ? C42180b.m92642g(dayRatio, null, null, 20, false, false, false, 59, null) : null));
    }

    @Nullable
    /* JADX INFO: renamed from: O3 */
    public final C36925m m38202O3() {
        return (C36925m) this.f32915Z.getValue(this, f32914k0[0]);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m38203Y3(@NotNull FilterType.InterfaceC23033b time) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.f32920e0 = true;
        this.f32919d0 = time.getF44545b();
        m38204a4();
        m38205b4();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_delegation_interest;
    }

    public final int getTradeType() {
        return ((Number) this.f32921f0.getValue()).intValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36925m c36925mM38202O3 = m38202O3();
        if (c36925mM38202O3 != null) {
            c36925mM38202O3.f81813f.setEnabled(getParentFragment() instanceof MarginDelegationFragment);
            c36925mM38202O3.f81813f.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
            MarginDelegationFilterViewExt marginDelegationFilterViewExt = this.f32924i0;
            DropMenuView mDropMenuView = c36925mM38202O3.f81812e;
            Intrinsics.checkNotNullExpressionValue(mDropMenuView, "mDropMenuView");
            BaseTextView ivFilter = c36925mM38202O3.f81810c;
            Intrinsics.checkNotNullExpressionValue(ivFilter, "ivFilter");
            marginDelegationFilterViewExt.m38167F(mDropMenuView, ivFilter, this.mContext, new Function1() { // from class: com.kubi.margin.delegation.interest.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationInterestFragment.m38196U3(this.f32926b, (List) obj);
                }
            });
            BaseTextView ivFilter2 = c36925mM38202O3.f81810c;
            Intrinsics.checkNotNullExpressionValue(ivFilter2, "ivFilter");
            C27046k.m66711z(ivFilter2, 0L, new Function0() { // from class: com.kubi.margin.delegation.interest.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationInterestFragment.m38197V3(c36925mM38202O3);
                }
            }, 1, null);
            MarginDelegationFilterViewExt marginDelegationFilterViewExt2 = this.f32924i0;
            BaseTextView tvChoosePairs = c36925mM38202O3.f81816i;
            Intrinsics.checkNotNullExpressionValue(tvChoosePairs, "tvChoosePairs");
            marginDelegationFilterViewExt2.m38171t(tvChoosePairs, getTradeType(), this, new Function0() { // from class: com.kubi.margin.delegation.interest.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationInterestFragment.m38198W3(this.f32928b);
                }
            });
            MarginDelegationFilterViewExt marginDelegationFilterViewExt3 = this.f32924i0;
            BaseTextView tvChooseCoin = c36925mM38202O3.f81815h;
            Intrinsics.checkNotNullExpressionValue(tvChooseCoin, "tvChooseCoin");
            marginDelegationFilterViewExt3.m38170q(tvChooseCoin, this, new Function0() { // from class: com.kubi.margin.delegation.interest.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationInterestFragment.m38199X3(this.f32929b);
                }
            });
            if (getTradeType() == 2) {
                BaseTextView tvChoosePairs2 = c36925mM38202O3.f81816i;
                Intrinsics.checkNotNullExpressionValue(tvChoosePairs2, "tvChoosePairs");
                ViewExtKt.m66594y(tvChoosePairs2);
                View split1 = c36925mM38202O3.f81814g;
                Intrinsics.checkNotNullExpressionValue(split1, "split1");
                ViewExtKt.m66594y(split1);
                return;
            }
            BaseTextView tvChoosePairs3 = c36925mM38202O3.f81816i;
            Intrinsics.checkNotNullExpressionValue(tvChoosePairs3, "tvChoosePairs");
            ViewExtKt.m66577h(tvChoosePairs3);
            View split2 = c36925mM38202O3.f81814g;
            Intrinsics.checkNotNullExpressionValue(split2, "split1");
            ViewExtKt.m66577h(split2);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return C42579a.f94275a.m93347g().c();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<DelegationInterestEntity>> mo16440r3(int i11, int i12) {
        this.f32916a0.clear();
        this.f32916a0.put(AppsFlyerProperties.CURRENCY_CODE, this.f32918c0);
        if (!this.f32920e0) {
            this.f32919d0 = "THREE_MONTH";
        }
        this.f32916a0.put("startAt", m38193R3(this.f32919d0));
        this.f32916a0.put("endAt", this.f32923h0.f54265b);
        this.f32916a0.put("page", String.valueOf(i11));
        this.f32916a0.put("size", String.valueOf(i12));
        if (getTradeType() == 2) {
            this.f32916a0.put("borrowerAccountTag", this.f32917b0);
        }
        this.f32916a0.put("borrowerAccountType", getTradeType() == 2 ? SharedPositionInfo.MARGIN_MODE_ISOLATED : "MARGIN");
        return m38192Q3().m102134r(this.f32916a0).compose(C24217a1.m58389m());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.delegation_no_more_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bmargin_item_delegation_interest_view;
    }

    /* JADX INFO: renamed from: R3 */
    private final String m38193R3(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1480287667) {
            if (iHashCode != -170154913) {
                if (iHashCode == 1346794279 && str.equals("ONE_MONTH")) {
                    return String.valueOf(this.f32923h0.m66434a(30, 6));
                }
                return "";
            }
            if (str.equals("THREE_MONTH")) {
                return String.valueOf(this.f32923h0.m66434a(90, 6));
            }
            return "";
        }
        if (str.equals("ONE_WEEK")) {
            return String.valueOf(this.f32923h0.m66434a(7, 6));
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public static final InterfaceC46307h m38195T3() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m38198W3(MarginDelegationInterestFragment marginDelegationInterestFragment) {
        marginDelegationInterestFragment.m38205b4();
        marginDelegationInterestFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m38199X3(MarginDelegationInterestFragment marginDelegationInterestFragment) {
        marginDelegationInterestFragment.m38204a4();
        marginDelegationInterestFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final int m38200Z3(MarginDelegationInterestFragment marginDelegationInterestFragment) {
        Integer numValueOf;
        Bundle arguments = marginDelegationInterestFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 1);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m38204a4() {
        String str;
        C36925m c36925mM38202O3 = m38202O3();
        if (c36925mM38202O3 != null) {
            Object tag = c36925mM38202O3.f81815h.getTag();
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str == null || Intrinsics.areEqual(str, getString(R$string.all))) {
                str = "";
            }
            this.f32918c0 = str;
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m38205b4() {
        String str;
        C36925m c36925mM38202O3 = m38202O3();
        if (c36925mM38202O3 != null) {
            Object tag = c36925mM38202O3.f81816i.getTag();
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str == null || Intrinsics.areEqual(str, getString(R$string.all))) {
                str = "";
            }
            this.f32917b0 = str;
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        C36928n0 c36928n0;
        LinearLayout root;
        super.showContent();
        C36925m c36925mM38202O3 = m38202O3();
        if (c36925mM38202O3 != null && (c36928n0 = c36925mM38202O3.f81809b) != null && (root = c36928n0.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C36925m c36925mM38202O4 = m38202O3();
        if (c36925mM38202O4 != null && (swipeRefreshRecyclerView = c36925mM38202O4.f81813f) != null) {
            ViewExtKt.m66594y(swipeRefreshRecyclerView);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        C36928n0 c36928n0;
        BaseTextView baseTextView;
        C36928n0 c36928n1;
        ImageView imageView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        C36928n0 c36928n2;
        LinearLayout root;
        super.showContent();
        C36925m c36925mM38202O3 = m38202O3();
        if (c36925mM38202O3 != null && (c36928n2 = c36925mM38202O3.f81809b) != null && (root = c36928n2.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
        C36925m c36925mM38202O4 = m38202O3();
        if (c36925mM38202O4 != null && (swipeRefreshRecyclerView = c36925mM38202O4.f81813f) != null) {
            ViewExtKt.m66577h(swipeRefreshRecyclerView);
        }
        C36925m c36925mM38202O5 = m38202O3();
        if (c36925mM38202O5 != null && (c36928n1 = c36925mM38202O5.f81809b) != null && (imageView = c36928n1.f81849b) != null) {
            imageView.setImageResource(R$drawable.ic2_common_empty);
        }
        C36925m c36925mM38202O6 = m38202O3();
        if (c36925mM38202O6 != null && (c36928n0 = c36925mM38202O6.f81809b) != null && (baseTextView = c36928n0.f81850c) != null) {
            baseTextView.setText(R$string.no_records);
        }
    }
}
