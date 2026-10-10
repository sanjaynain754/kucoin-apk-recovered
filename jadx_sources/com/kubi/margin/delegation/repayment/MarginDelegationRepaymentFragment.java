package com.kubi.margin.delegation.repayment;

import android.os.Bundle;
import android.view.View;
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
import com.kubi.margin.entity.DelegationRepaymentEntity;
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
import p206dp.C36928n0;
import p206dp.C36929o;
import p429lf.C42179a;
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

/* JADX INFO: compiled from: MarginDelegationRepaymentFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010'\u001a\u00020\u001aH\u0014J\b\u0010(\u001a\u00020\u001cH\u0014J\b\u0010)\u001a\u00020\u001cH\u0014J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0002H\u0014J\u0012\u00102\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u00103\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000eH\u0002J&\u00107\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000209\u0018\u0001082\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001cH\u0014J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000eH\u0002J\u001a\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u00020-H\u0016J\u0006\u0010J\u001a\u00020-J\u0006\u0010K\u001a\u00020-J\u000e\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020NJ\b\u0010O\u001a\u00020-H\u0016J\b\u0010P\u001a\u00020-H\u0016J\b\u0010Q\u001a\u00020\u001cH\u0014R#\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b$\u0010%R\u000e\u0010<\u001a\u00020=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006S"}, m90084d2 = {"Lcom/kubi/margin/delegation/repayment/MarginDelegationRepaymentFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/margin/entity/DelegationRepaymentEntity;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentDelegationRepaymentBinding;", "getBinding$annotations", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentDelegationRepaymentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "symbol", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "coin", "getCoin", "setCoin", "timeType", "isFilter", "", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "mTradeApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/margin/api/MarketApi;", "mTradeApi$delegate", "needDefaultBackground", "getLayout", "getItemLayout", "canLoad", "needAutoLoad", "onLoad", "", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getSymbolName", "getCurrencyName", FirebaseAnalytics.Param.CURRENCY, "getStatusByType", "status", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getStart", "value", "filterView", "Lcom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt;", "getFilterView", "()Lcom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshData", "updateCoin", "updateSymbol", "setFilterData", "time", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "showContent", "showEmpty", "getEndFooterText", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginDelegationRepaymentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationRepaymentFragment.kt\ncom/kubi/margin/delegation/repayment/MarginDelegationRepaymentFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n147#2,16:288\n1#3:304\n*S KotlinDebug\n*F\n+ 1 MarginDelegationRepaymentFragment.kt\ncom/kubi/margin/delegation/repayment/MarginDelegationRepaymentFragment\n*L\n50#1:288,16\n*E\n"})
public final class MarginDelegationRepaymentFragment extends BasePagingFragment<DelegationRepaymentEntity> {

    /* JADX INFO: renamed from: e0 */
    public boolean f32998e0;

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ KProperty<Object>[] f32992k0 = {Reflection.property1(new PropertyReference1Impl(MarginDelegationRepaymentFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentDelegationRepaymentBinding;", 0))};

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f32991j0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f32993Z = C45681e.m100799e(this, new Function1<MarginDelegationRepaymentFragment, C36929o>() { // from class: com.kubi.margin.delegation.repayment.MarginDelegationRepaymentFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36929o invoke(@NotNull MarginDelegationRepaymentFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36929o.m82726a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36929o, Unit>() { // from class: com.kubi.margin.delegation.repayment.MarginDelegationRepaymentFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36929o it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36929o c36929o) {
            invoke(c36929o);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final HashMap<String, String> f32994a0 = new HashMap<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f32995b0 = "";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f32996c0 = "";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public String f32997d0 = "THREE_MONTH";

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f32999f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.repayment.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginDelegationRepaymentFragment.m38282a4(this.f33003b));
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f33000g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.repayment.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDelegationRepaymentFragment.m38277U3();
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public TimeUtils.C27004b f33001h0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MarginDelegationFilterViewExt f33002i0 = new MarginDelegationFilterViewExt();

    /* JADX INFO: compiled from: MarginDelegationRepaymentFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/delegation/repayment/MarginDelegationRepaymentFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/delegation/repayment/MarginDelegationRepaymentFragment;", "tradeType", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginDelegationRepaymentFragment newInstance(int tradeType) {
            MarginDelegationRepaymentFragment marginDelegationRepaymentFragment = new MarginDelegationRepaymentFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("tradeType", tradeType);
            marginDelegationRepaymentFragment.setArguments(bundle);
            return marginDelegationRepaymentFragment;
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
    private final String m38272P3(String str) {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        return C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null);
    }

    /* JADX INFO: renamed from: Q3 */
    private final InterfaceC46307h m38273Q3() {
        return (InterfaceC46307h) this.f33000g0.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    private final String m38276T3(String str) {
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        return C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null);
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m38278V3(MarginDelegationRepaymentFragment marginDelegationRepaymentFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        marginDelegationRepaymentFragment.m38285Z3((FilterType.InterfaceC23033b) it.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m38279W3(C36929o c36929o) {
        DropMenuView dropMenuView = c36929o.f81855e;
        if (dropMenuView != null) {
            dropMenuView.m55148k();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f33001h0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull DelegationRepaymentEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (getTradeType() == 2) {
            helper.setGone(R$id.tv_coin, true);
            int i11 = R$id.tv_coin_value;
            helper.setGone(i11, true);
            helper.setText(i11, m38272P3(item.getCurrency()));
            helper.setText(R$id.tv_trade_pair, m38276T3(item.getBorrowerAccountTag()));
        } else {
            helper.setGone(R$id.tv_coin, false);
            helper.setGone(R$id.tv_coin_value, false);
            helper.setText(R$id.tv_trade_pair, m38272P3(item.getCurrency()));
        }
        int i12 = R$id.tv_amount_value;
        View view = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i13 = R$id.tv_lever_repay_principal_value;
        View view2 = helper.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i14 = R$id.tv_lever_borrow_interest_value;
        View view3 = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C44172b.m97383c((TextView) view3, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BaseViewHolder text = helper.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(item.getCreatedAt()), null, false, false, null, 15, null));
        int i15 = R$id.tv_status;
        String status = item.getStatus();
        BaseViewHolder text2 = text.setText(i15, C27041f.m66668h(status != null ? m38275S3(status) : null));
        BigDecimal actualAmount = item.getActualAmount();
        BaseViewHolder text3 = text2.setText(i12, C27041f.m66669i(actualAmount != null ? C37886j.m85578b(actualAmount, item.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        BigDecimal repayPrincipalAmount = item.getRepayPrincipalAmount();
        BaseViewHolder text4 = text3.setText(i13, C27041f.m66669i(repayPrincipalAmount != null ? C37886j.m85578b(repayPrincipalAmount, item.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        BigDecimal repayInterestAmount = item.getRepayInterestAmount();
        text4.setText(i14, C27041f.m66669i(repayInterestAmount != null ? C37886j.m85578b(repayInterestAmount, item.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
    }

    @Nullable
    /* JADX INFO: renamed from: O3 */
    public final C36929o m38284O3() {
        return (C36929o) this.f32993Z.getValue(this, f32992k0[0]);
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m38285Z3(@NotNull FilterType.InterfaceC23033b time) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.f32998e0 = true;
        this.f32997d0 = time.getF44545b();
        m38286b4();
        m38287c4();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_delegation_repayment;
    }

    public final int getTradeType() {
        return ((Number) this.f32999f0.getValue()).intValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36929o c36929oM38284O3 = m38284O3();
        if (c36929oM38284O3 != null) {
            c36929oM38284O3.f81856f.setEnabled(getParentFragment() instanceof MarginDelegationFragment);
            c36929oM38284O3.f81856f.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
            MarginDelegationFilterViewExt marginDelegationFilterViewExt = this.f33002i0;
            DropMenuView mDropMenuView = c36929oM38284O3.f81855e;
            Intrinsics.checkNotNullExpressionValue(mDropMenuView, "mDropMenuView");
            BaseTextView ivFilter = c36929oM38284O3.f81853c;
            Intrinsics.checkNotNullExpressionValue(ivFilter, "ivFilter");
            marginDelegationFilterViewExt.m38167F(mDropMenuView, ivFilter, this.mContext, new Function1() { // from class: com.kubi.margin.delegation.repayment.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationRepaymentFragment.m38278V3(this.f33004b, (List) obj);
                }
            });
            BaseTextView ivFilter2 = c36929oM38284O3.f81853c;
            Intrinsics.checkNotNullExpressionValue(ivFilter2, "ivFilter");
            C27046k.m66711z(ivFilter2, 0L, new Function0() { // from class: com.kubi.margin.delegation.repayment.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationRepaymentFragment.m38279W3(c36929oM38284O3);
                }
            }, 1, null);
            MarginDelegationFilterViewExt marginDelegationFilterViewExt2 = this.f33002i0;
            BaseTextView tvChoosePairs = c36929oM38284O3.f81859i;
            Intrinsics.checkNotNullExpressionValue(tvChoosePairs, "tvChoosePairs");
            marginDelegationFilterViewExt2.m38171t(tvChoosePairs, getTradeType(), this, new Function0() { // from class: com.kubi.margin.delegation.repayment.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationRepaymentFragment.m38280X3(this.f33006b);
                }
            });
            MarginDelegationFilterViewExt marginDelegationFilterViewExt3 = this.f33002i0;
            BaseTextView tvChooseCoin = c36929oM38284O3.f81858h;
            Intrinsics.checkNotNullExpressionValue(tvChooseCoin, "tvChooseCoin");
            marginDelegationFilterViewExt3.m38170q(tvChooseCoin, this, new Function0() { // from class: com.kubi.margin.delegation.repayment.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationRepaymentFragment.m38281Y3(this.f33007b);
                }
            });
            if (getTradeType() == 2) {
                BaseTextView tvChoosePairs2 = c36929oM38284O3.f81859i;
                Intrinsics.checkNotNullExpressionValue(tvChoosePairs2, "tvChoosePairs");
                ViewExtKt.m66594y(tvChoosePairs2);
                View split1 = c36929oM38284O3.f81857g;
                Intrinsics.checkNotNullExpressionValue(split1, "split1");
                ViewExtKt.m66594y(split1);
                return;
            }
            BaseTextView tvChoosePairs3 = c36929oM38284O3.f81859i;
            Intrinsics.checkNotNullExpressionValue(tvChoosePairs3, "tvChoosePairs");
            ViewExtKt.m66577h(tvChoosePairs3);
            View split2 = c36929oM38284O3.f81857g;
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
    public Observable<BasePageEntity<DelegationRepaymentEntity>> mo16440r3(int i11, int i12) {
        this.f32994a0.clear();
        this.f32994a0.put(AppsFlyerProperties.CURRENCY_CODE, this.f32996c0);
        if (!this.f32998e0) {
            this.f32997d0 = "THREE_MONTH";
        }
        this.f32994a0.put("startAt", m38274R3(this.f32997d0));
        this.f32994a0.put("endAt", this.f33001h0.f54265b);
        this.f32994a0.put("page", String.valueOf(i11));
        this.f32994a0.put("size", String.valueOf(i12));
        if (getTradeType() == 2) {
            this.f32994a0.put("borrowerAccountTag", this.f32995b0);
        }
        this.f32994a0.put("borrowerAccountType", getTradeType() == 2 ? SharedPositionInfo.MARGIN_MODE_ISOLATED : "MARGIN");
        return m38273Q3().m102124g(this.f32994a0).compose(C24217a1.m58389m());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.delegation_no_more_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bmargin_item_delegation_repayment_view;
    }

    /* JADX INFO: renamed from: R3 */
    private final String m38274R3(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1480287667) {
            if (iHashCode != -170154913) {
                if (iHashCode == 1346794279 && str.equals("ONE_MONTH")) {
                    return String.valueOf(this.f33001h0.m66434a(30, 6));
                }
                return "";
            }
            if (str.equals("THREE_MONTH")) {
                return String.valueOf(this.f33001h0.m66434a(90, 6));
            }
            return "";
        }
        if (str.equals("ONE_WEEK")) {
            return String.valueOf(this.f33001h0.m66434a(7, 6));
        }
        return "";
    }

    /* JADX INFO: renamed from: S3 */
    private final String m38275S3(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 399612135) {
            if (iHashCode != 1980572282) {
                if (iHashCode == 2073854099 && str.equals("FINISH")) {
                    String string = getString(R$string.lever_borrow_status_finish);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                }
                return "";
            }
            if (str.equals("CANCEL")) {
                String string2 = getString(R$string.lever_borrow_status_cancle);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            return "";
        }
        if (!str.equals("PREPARE")) {
            return "";
        }
        String string3 = getString(R$string.lever_borrow_status_handle);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public static final InterfaceC46307h m38277U3() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m38280X3(MarginDelegationRepaymentFragment marginDelegationRepaymentFragment) {
        marginDelegationRepaymentFragment.m38287c4();
        marginDelegationRepaymentFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m38281Y3(MarginDelegationRepaymentFragment marginDelegationRepaymentFragment) {
        marginDelegationRepaymentFragment.m38286b4();
        marginDelegationRepaymentFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final int m38282a4(MarginDelegationRepaymentFragment marginDelegationRepaymentFragment) {
        Integer numValueOf;
        Bundle arguments = marginDelegationRepaymentFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 1);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m38286b4() {
        String str;
        C36929o c36929oM38284O3 = m38284O3();
        if (c36929oM38284O3 != null) {
            Object tag = c36929oM38284O3.f81858h.getTag();
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str == null || Intrinsics.areEqual(str, getString(R$string.all))) {
                str = "";
            }
            this.f32996c0 = str;
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final void m38287c4() {
        String str;
        C36929o c36929oM38284O3 = m38284O3();
        if (c36929oM38284O3 != null) {
            Object tag = c36929oM38284O3.f81859i.getTag();
            if (tag instanceof String) {
                str = (String) tag;
            } else {
                str = null;
            }
            if (str == null || Intrinsics.areEqual(str, getString(R$string.all))) {
                str = "";
            }
            this.f32995b0 = str;
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
        C36929o c36929oM38284O3 = m38284O3();
        if (c36929oM38284O3 != null && (c36928n0 = c36929oM38284O3.f81852b) != null && (root = c36928n0.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C36929o c36929oM38284O4 = m38284O3();
        if (c36929oM38284O4 != null && (swipeRefreshRecyclerView = c36929oM38284O4.f81856f) != null) {
            ViewExtKt.m66594y(swipeRefreshRecyclerView);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        super.showContent();
        C36929o c36929oM38284O3 = m38284O3();
        if (c36929oM38284O3 != null) {
            LinearLayout root = c36929oM38284O3.f81852b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.m66594y(root);
            SwipeRefreshRecyclerView mSwipeRecyclerView = c36929oM38284O3.f81856f;
            Intrinsics.checkNotNullExpressionValue(mSwipeRecyclerView, "mSwipeRecyclerView");
            ViewExtKt.m66577h(mSwipeRecyclerView);
            c36929oM38284O3.f81852b.f81849b.setImageResource(R$drawable.ic2_common_empty);
            c36929oM38284O3.f81852b.f81850c.setText(R$string.no_records);
        }
    }
}
