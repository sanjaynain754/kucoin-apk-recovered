package com.kubi.spot.business.delegation.delegationList;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.BeepHelper;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$raw;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.DelegationFragment;
import com.kubi.spot.business.delegation.DelegationTracker;
import com.kubi.spot.business.delegation.delegationList.DelegationListFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.helper.TradeManager;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import f30.C37330a;
import f30.C37347r;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m20.C42414n;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import rs.C44172b;

/* JADX INFO: compiled from: DelegationListFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\b\u0010!\u001a\u00020 H\u0002J\u001c\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020 H\u0014J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J&\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020,\u0018\u00010+2\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001dH\u0014J\b\u0010/\u001a\u00020 H\u0002J.\u00100\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010\u00072\b\u00102\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u00103\u001a\u00020 H\u0002J\u0012\u00104\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u001a\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0006\u00108\u001a\u00020\u0019J\u0006\u00109\u001a\u00020\u0019J\u0010\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020 H\u0014J\b\u0010<\u001a\u00020\u0019H\u0016R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegationList/DelegationListFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/spot/entity/DelegationEntity;", "<init>", "()V", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mTradeApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/spot/api/MarketApi;", "mTradeApi$delegate", "Lkotlin/Lazy;", "type", "getType", "()Ljava/lang/String;", "type$delegate", "tradeType", "getTradeType", "tradeType$delegate", "symbol", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayout", "", "getItemLayout", "isUpGreen", "", "isStopOrder", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "canLoad", "needDefaultBackground", "needAutoLoad", "onLoad", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "checkParentFilterCurrent", "cancelOrder", "orderId", "currentSymbols", "isOco", "getTrackNameByType", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "cancelAllOrders", "showCancelAll", "onNetworkFinished", "success", "showEmpty", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationListFragment.kt\ncom/kubi/spot/business/delegation/delegationList/DelegationListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n1#2:407\n*E\n"})
public final class DelegationListFragment extends BasePagingFragment<DelegationEntity> {

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f50053f0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final HashMap<String, String> f50054Z = new HashMap<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f50055a0 = LazyKt.lazy(new Function0() { // from class: m20.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationListFragment.m60942h4();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f50056b0 = LazyKt.lazy(new Function0() { // from class: m20.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationListFragment.m60944k4(this.f94020b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f50057c0 = LazyKt.lazy(new Function0() { // from class: m20.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationListFragment.m60943j4(this.f94021b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public String f50058d0 = "";

    /* JADX INFO: renamed from: e0 */
    public final boolean f50059e0 = DayNightThemeManager.f28592a.m33189n();

    /* JADX INFO: compiled from: DelegationListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegationList/DelegationListFragment$Companion;", "", "<init>", "()V", "DELEGATION_TODO", "", "DELEGATION_STOP", "newInstance", "Lcom/kubi/spot/business/delegation/delegationList/DelegationListFragment;", "type", "symbol", "tradeType", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DelegationListFragment newInstance(@NotNull String type, @Nullable String symbol, @NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            DelegationListFragment delegationListFragment = new DelegationListFragment();
            delegationListFragment.setArguments(new C27051h().m66724h("type", type).m66724h("symbol", symbol).m66724h("tradeType", tradeType).m66717a());
            return delegationListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegationList.DelegationListFragment$a */
    /* JADX INFO: compiled from: DelegationListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/delegation/delegationList/DelegationListFragment$cancelOrder$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24873a extends C24223c1 {
        public C24873a() {
            super(DelegationListFragment.this);
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m60954h(DelegationListFragment delegationListFragment, MaintenanceEntity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            delegationListFragment.f46495W.notifyItemRangeChanged(0, delegationListFragment.f46495W.getItemCount());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m60955i(final DelegationListFragment delegationListFragment) {
            delegationListFragment.addSubscription(TradeManager.f50593a.m61839j(new Function1() { // from class: m20.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DelegationListFragment.C24873a.m60956j(delegationListFragment, (MaintenanceEntity) obj);
                }
            }));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m60956j(DelegationListFragment delegationListFragment, MaintenanceEntity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            delegationListFragment.f46495W.notifyItemRangeChanged(0, delegationListFragment.f46495W.getItemCount());
            return Unit.INSTANCE;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws JSONException {
            super.accept(th2);
            boolean z11 = th2 instanceof ApiException;
            if (z11 && Intrinsics.areEqual(((ApiException) th2).code, "400100")) {
                DelegationListFragment.this.mo15906F3();
            }
            if (z11 && Intrinsics.areEqual(((ApiException) th2).code, "200001")) {
                final DelegationListFragment delegationListFragment = DelegationListFragment.this;
                TradeManager tradeManager = TradeManager.f50593a;
                Function1<? super MaintenanceEntity, Unit> function1 = new Function1() { // from class: m20.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DelegationListFragment.C24873a.m60954h(delegationListFragment, (MaintenanceEntity) obj);
                    }
                };
                final DelegationListFragment delegationListFragment2 = DelegationListFragment.this;
                delegationListFragment.addSubscription(tradeManager.m61842q(function1, new Function0() { // from class: m20.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DelegationListFragment.C24873a.m60955i(delegationListFragment2);
                    }
                }));
            }
            DelegationListFragment delegationListFragment3 = DelegationListFragment.this;
            String strM60948e4 = delegationListFragment3.m60948e4(delegationListFragment3.m60941f4());
            if (strM60948e4 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", false);
                C43852m.m96605q(strM60948e4, jSONObject);
            }
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

    /* JADX INFO: renamed from: Y3 */
    private final void m60936Y3(String str, String str2, String str3, boolean z11) {
        TradeManager tradeManager = TradeManager.f50593a;
        if (tradeManager.m61840o(str2) && !tradeManager.m61837h(str2)) {
            ToastCompat.m66437C(R$string.outage_tip);
            return;
        }
        Observable<R> observableCompose = ((z11 && Intrinsics.areEqual(getType(), InterfaceC33730j9.f70350a)) ? m60940d4().m82951s(str) : m60940d4().m82955w(m60941f4(), str, str2, str3)).delay(1L, TimeUnit.SECONDS).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: m20.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationListFragment.m60937Z3(this.f94027b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: m20.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationListFragment.m60938a4(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: m20.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                DelegationListFragment.m60939b4(this.f94029b, obj);
            }
        }, new C24873a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: d4 */
    private final InterfaceC37053d m60940d4() {
        return (InterfaceC37053d) this.f50055a0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public final String m60941f4() {
        return (String) this.f50057c0.getValue();
    }

    private final String getType() {
        return (String) this.f50056b0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [android.view.ViewGroup$MarginLayoutParams, android.widget.FrameLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [io.chad.library.adapter.base.BaseViewHolder] */
    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable final DelegationEntity delegationEntity) {
        ?? r11;
        Object obj;
        if (baseViewHolder == 0 || delegationEntity == null) {
            return;
        }
        boolean zEquals = StringsKt.equals(delegationEntity.getSide(), "buy", true);
        final boolean zIsOCO = delegationEntity.isOCO(1);
        boolean zIsMarket = delegationEntity.isMarket(1);
        boolean z11 = zIsMarket && zEquals;
        int i11 = R$id.delegation_progressbar;
        ProgressBar progressBar = (ProgressBar) baseViewHolder.getView(i11);
        Resources resources = getResources();
        boolean z12 = this.f50059e0;
        int i12 = (!(z12 && zEquals) && (z12 || zEquals)) ? R$drawable.shape_delegation_progressbar_red : R$drawable.shape_delegation_progressbar_green;
        Context context = getContext();
        progressBar.setProgressDrawable(ResourcesCompat.getDrawable(resources, i12, context != null ? context.getTheme() : null));
        int i13 = R$id.tv_delegation_price;
        View view = baseViewHolder.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        int i14 = R$id.tv_trade_pair;
        View view2 = baseViewHolder.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: m20.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationListFragment.m60933U3(this.f94022b);
            }
        }, 1, null);
        BaseViewHolder text = baseViewHolder.setText(i14, delegationEntity.getShowSymbol());
        int i15 = R$id.tv_trade_type;
        BaseViewHolder text2 = text.setText(i15, getString(delegationEntity.getSideString()) + " / " + delegationEntity.getTypeString(1));
        Context context2 = getContext();
        Integer numValueOf = context2 != null ? Integer.valueOf(C22890g.m54281f(context2, Intrinsics.areEqual(delegationEntity.getSide(), "buy"))) : null;
        int i16 = R$color.c_text;
        BaseViewHolder textColor = text2.setTextColor(i15, C27039d.m66651k(numValueOf, getColorRes(i16)));
        int i17 = R$id.tvDealPercent;
        Context context3 = getContext();
        BaseViewHolder gone = textColor.setTextColor(i17, C27039d.m66651k(context3 != null ? Integer.valueOf(C22890g.m54281f(context3, Intrinsics.areEqual(delegationEntity.getSide(), "buy"))) : null, getColorRes(i16))).setText(R$id.tv_time, C37347r.m83944d(C27039d.m66652l(delegationEntity.getTime()))).setText(R$id.tv_amount_type, getString(R$string.dealed) + '/' + getString(R$string.delegation_amount_stub, C27041f.m66669i(delegationEntity.getUnit(), "--"))).setGone(R$id.tv_hide, delegationEntity.needShowHideTag());
        int i18 = R$id.tv_cancel_delegation;
        TradeManager tradeManager = TradeManager.f50593a;
        gone.setTextColor(i18, (!tradeManager.m61840o(delegationEntity.getSymbol()) || tradeManager.m61837h(delegationEntity.getSymbol())) ? getColorRes(i16) : getColorRes(R$color.complementary)).setBackgroundRes(i18, (!tradeManager.m61840o(delegationEntity.getSymbol()) || tradeManager.m61837h(delegationEntity.getSymbol())) ? R$drawable.shape_emphasis4_24r : R$drawable.shape_complementary8_24r).setOnClickListener(i18, new View.OnClickListener() { // from class: m20.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DelegationListFragment.m60934V3(this.f94023b, delegationEntity, zIsOCO, view3);
            }
        });
        if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
            baseViewHolder.setText(R$id.tvDealAndTotalAmount, new C27096v0().append(delegationEntity.getAmountFormatterStr(delegationEntity.getDealSize(), z11)).append(" / ").m66905e(delegationEntity.getAmountFormatterStr(delegationEntity.getSize(), z11), getColorRes(R$color.c_text40)));
            baseViewHolder.setText(i17, delegationEntity.getDealPercent());
            obj = null;
            baseViewHolder.setGone(i17, C41014a.m89922G(delegationEntity.getDealSize(), null, 1, null).compareTo(BigDecimal.ZERO) != 0);
            r11 = 0;
            baseViewHolder.setGone(R$id.tv_trigger_price_label, false);
            baseViewHolder.setGone(R$id.tv_trigger_price, false);
            baseViewHolder.setProgress(i11, delegationEntity.getDealProgress());
            baseViewHolder.setText(i13, zIsMarket ? "--" : delegationEntity.getPriceFormatterStr(delegationEntity.getPrice()));
            baseViewHolder.setGone(R$id.tv_limit_price_label, false);
            baseViewHolder.setGone(R$id.tv_limit_price, false);
            baseViewHolder.setGone(R$id.view_dash, false);
        } else {
            r11 = 0;
            obj = null;
            C42414n.m93104a(delegationEntity).mo93102a(baseViewHolder, delegationEntity, this);
        }
        if (m60949g4()) {
            baseViewHolder.setGone(i17, r11);
            baseViewHolder.setGone(i11, r11);
            ViewGroup.LayoutParams layoutParams = baseViewHolder.getView(R$id.tvDealAndTotalAmount).getLayoutParams();
            ?? r14 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : obj;
            if (r14 != 0) {
                r14.setMarginEnd(r11);
                ((FrameLayout.LayoutParams) r14).gravity = GravityCompat.END;
            }
            TextView textView = (TextView) baseViewHolder.getView(i13);
            textView.setGravity(GravityCompat.END);
            textView.setTextAlignment(6);
            TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_trigger_price);
            textView2.setGravity(GravityCompat.END);
            textView2.setTextAlignment(6);
            TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_limit_price);
            textView3.setGravity(GravityCompat.END);
            textView3.setTextAlignment(6);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_delegation_todo;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m60950i4() {
        BaseQuickAdapter<T, BaseViewHolder> baseQuickAdapter = this.f46495W;
        boolean z11 = (baseQuickAdapter != 0 ? baseQuickAdapter.getData() : null) == null || this.f46495W.getData().isEmpty();
        Fragment parentFragment = getParentFragment();
        DelegationFragment delegationFragment = parentFragment instanceof DelegationFragment ? (DelegationFragment) parentFragment : null;
        if (delegationFragment != null) {
            delegationFragment.m60598H3(!z11 && this.f46494V.booleanValue(), Intrinsics.areEqual(getType(), "active"));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LoadingViewUtils.f48255a.m58509b(this);
        this.f46496X.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return IUserService.a.get().c();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<DelegationEntity>> mo16440r3(int i11, int i12) {
        this.f50054Z.clear();
        if (m60947c4()) {
            this.f50054Z.put("symbol", C27041f.m66668h(this.f50058d0));
        }
        this.f50054Z.put("page", String.valueOf(i11));
        this.f50054Z.put("size", String.valueOf(i12));
        this.f50054Z.put("tradeType", m60941f4());
        if (StringsKt.equals$default(getType(), InterfaceC33730j9.f70350a, false, 2, null)) {
            return m60940d4().m82945m(this.f50054Z).compose(C24217a1.m58389m());
        }
        this.f50054Z.put("status", "active");
        return InterfaceC37053d.m82914P(m60940d4(), this.f50054Z, false, false, 6, null).compose(C24217a1.m58389m());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        showEmpty(R$string.no_order, R$drawable.ic2_common_empty);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_delegation_view_single_list;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m60933U3(DelegationListFragment delegationListFragment) {
        if (Intrinsics.areEqual(delegationListFragment.m60941f4(), "TRADE")) {
            DelegationTracker.f50071a.m60957a(delegationListFragment.getType());
            C37330a.m83911c(delegationListFragment.f50058d0, false, 0, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m60934V3(DelegationListFragment delegationListFragment, DelegationEntity delegationEntity, boolean z11, View view) {
        delegationListFragment.m60936Y3(delegationEntity.getOrderId(), delegationEntity.getSymbol(), null, z11);
        if (Intrinsics.areEqual(delegationListFragment.m60941f4(), "TRADE")) {
            C43852m.m96591c("B5orderList", "cancel", null, null, 12, null);
        } else {
            C43852m.m96591c("B4TradeHistory", "cancle", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m60935X3(DelegationListFragment delegationListFragment, DialogInterface dialogInterface, int i11) {
        String str;
        String strM66668h;
        if (StringsKt.equals$default(delegationListFragment.getType(), "active", false, 2, null)) {
            str = TUIConstants.TUIContact.LIMIT;
        } else {
            str = "stop_oco";
        }
        if (delegationListFragment.m60947c4()) {
            strM66668h = C27041f.m66668h(delegationListFragment.f50058d0);
        } else {
            strM66668h = "";
        }
        delegationListFragment.m60936Y3(null, strM66668h, str, false);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m60937Z3(DelegationListFragment delegationListFragment, Disposable disposable) {
        delegationListFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m60938a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m60939b4(DelegationListFragment delegationListFragment, Object obj) throws JSONException {
        delegationListFragment.hideDialogLoading();
        BeepHelper.m23642f("beep_revoke", R$raw.revoke);
        delegationListFragment.showToast(delegationListFragment.getString(R$string.cancel_order_ok));
        delegationListFragment.mo15906F3();
        String strM60948e4 = delegationListFragment.m60948e4(delegationListFragment.m60941f4());
        if (strM60948e4 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", true);
            C43852m.m96605q(strM60948e4, jSONObject);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static final InterfaceC37053d m60942h4() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: j4 */
    public static final String m60943j4(DelegationListFragment delegationListFragment) {
        String string;
        Bundle arguments = delegationListFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tradeType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "TRADE");
    }

    /* JADX INFO: renamed from: k4 */
    public static final String m60944k4(DelegationListFragment delegationListFragment) {
        Bundle arguments = delegationListFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("type", "active");
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: E3 */
    public void mo22112E3(boolean z11) {
        super.mo22112E3(z11);
        m60950i4();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m60946W3() {
        Boolean boolValueOf;
        int i11;
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                boolValueOf = Boolean.valueOf(activity.isFinishing());
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf) && !this.f46495W.getData().isEmpty()) {
                if (Intrinsics.areEqual(m60941f4(), "TRADE")) {
                    C43852m.m96591c("B5orderList", "cancelAll", null, null, 12, null);
                }
                AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.onekey_cancel_all);
                if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
                    i11 = R$string.cancel_all_todo_order;
                } else {
                    i11 = R$string.cancel_all_limit_order;
                }
                alertDialogFragmentHelperM54167X4.m54153J4(i11).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: m20.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        DelegationListFragment.m60935X3(this.f94026b, dialogInterface, i12);
                    }
                }).m54159P4(R$string.cancel, null).m54172c5(getChildFragmentManager());
            }
        }
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m60947c4() {
        Boolean boolValueOf;
        View view;
        KuCheckBox kuCheckBox;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null && (kuCheckBox = (KuCheckBox) view.findViewById(R$id.ctx_current)) != null) {
            boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: e4 */
    public final String m60948e4(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1011438257) {
            if (iHashCode != -515941517) {
                if (iHashCode == 80083268 && str.equals("TRADE")) {
                    return "spot_cancel_order_result";
                }
                return null;
            }
            if (!str.equals("MARGIN_TRADE")) {
                return null;
            }
            return "margin_cancel_order_result";
        }
        if (!str.equals("MARGIN_ISOLATED_TRADE")) {
            return null;
        }
        return "margin_cancel_order_result";
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m60949g4() {
        return Intrinsics.areEqual(getType(), InterfaceC33730j9.f70350a);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        this.f50058d0 = C27041f.m66668h(string);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        mo15906F3();
    }
}
