package com.kubi.spot.business.delegation.delegateChild;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.BeepHelper;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.spot.R$layout;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.spot.api.ISpotService;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.businessTrack.DurationTrackManager;
import com.kubi.spot.business.delegation.TradeOpenOrdersFragment;
import com.kubi.spot.dialog.order.AmendOrderDialog;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.helper.TradeManager;
import com.kubi.tradebase.BizType;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$raw;
import com.kubi.tradecorebiz.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import f30.C37347r;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41775x1;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43841b;
import p569qq.C43852m;
import p671uq.C45290a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import t20.C44649k0;
import td.C44931a;
import v30.C45375c0;
import v30.C45379e0;
import w00.C45681e;

/* JADX INFO: compiled from: DelegationChildFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\r\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020&H\u0014J\b\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020\u0013H\u0002J\b\u0010+\u001a\u00020)H\u0016J\u001c\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010\u0002H\u0014J\u0014\u00102\u001a\u00020.*\u0002032\u0006\u00104\u001a\u00020&H\u0002J\b\u00105\u001a\u00020)H\u0016J&\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000208\u0018\u0001072\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020&H\u0014J\u001a\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u0002032\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0006\u0010?\u001a\u00020.J!\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0002\bEJ\u0010\u0010F\u001a\u00020.2\b\u0010!\u001a\u0004\u0018\u00010\u0013J.\u0010G\u001a\u00020.2\b\u0010H\u001a\u0004\u0018\u00010\u00132\b\u0010I\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0006\u0010J\u001a\u00020)H\u0002J\b\u0010K\u001a\u00020.H\u0016J\b\u0010L\u001a\u00020.H\u0016J\u0010\u0010M\u001a\u00020.2\u0006\u0010N\u001a\u00020)H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010$R\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/spot/entity/DelegationEntity;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/KucoinFragmentDelegationTodoTradeBinding;", "getBinding$SpotLib_googleRelease", "()Lcom/kubi/spot/databinding/KucoinFragmentDelegationTodoTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "guideBinding", "Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideLayoutBinding;", "getGuideBinding$SpotLib_googleRelease", "()Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideLayoutBinding;", "guideBinding$delegate", "Lkotlin/Lazy;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "selfLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "mTradeApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/spot/api/MarketApi;", "mTradeApi$delegate", "type", "getType", "()Ljava/lang/String;", "type$delegate", "symbol", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "getLayout", "", "getItemLayout", "needDefaultBackground", "", "getTradeTypeString", "canLoad", "isUpGreen", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "updateValueTextGravity", "Landroid/view/View;", "gravity", "needAutoLoad", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "savedInstanceState", "Landroid/os/Bundle;", "refreshEntrance", "showGuideLayout", "Lkotlinx/coroutines/Job;", "quoteBalanceDisplayStr", "", FirebaseAnalytics.Param.CURRENCY, "showGuideLayout$SpotLib_googleRelease", "cancelAllOrders", "cancelOrder", "orderId", "currentSymbols", "isOco", "showContent", "showEmpty", "onNetworkFinished", "success", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationChildFragment.kt\ncom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,505:1\n147#2,16:506\n1#3:522\n81#4,2:523\n46#5,14:525\n*S KotlinDebug\n*F\n+ 1 DelegationChildFragment.kt\ncom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment\n*L\n84#1:506,16\n289#1:523,2\n404#1:525,14\n*E\n"})
public final class DelegationChildFragment extends BasePagingFragment<DelegationEntity> {

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public WrapperLoadingView f49966c0;

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f49962i0 = {Reflection.property1(new PropertyReference1Impl(DelegationChildFragment.class, "binding", "getBinding$SpotLib_googleRelease()Lcom/kubi/spot/databinding/KucoinFragmentDelegationTodoTradeBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f49961h0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f49963Z = C45681e.m100799e(this, new Function1<DelegationChildFragment, C44649k0>() { // from class: com.kubi.spot.business.delegation.delegateChild.DelegationChildFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44649k0 invoke(@NotNull DelegationChildFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44649k0.m98774a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44649k0, Unit>() { // from class: com.kubi.spot.business.delegation.delegateChild.DelegationChildFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44649k0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44649k0 c44649k0) {
            invoke(c44649k0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f49964a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateChild.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationChildFragment.m60790i4(this.f49976b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final HashMap<String, String> f49965b0 = new HashMap<>();

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f49967d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateChild.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationChildFragment.m60791j4();
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f49968e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.delegation.delegateChild.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DelegationChildFragment.m60792n4(this.f49978b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public String f49969f0 = "";

    /* JADX INFO: renamed from: g0 */
    public final boolean f49970g0 = DayNightThemeManager.f28592a.m33189n();

    /* JADX INFO: compiled from: DelegationChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment$Companion;", "", "<init>", "()V", "DELEGATION_TODO", "", "DELEGATION_STOP", "newInstance", "Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment;", "type", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DelegationChildFragment newInstance(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            DelegationChildFragment delegationChildFragment = new DelegationChildFragment();
            delegationChildFragment.setArguments(new C27051h().m66724h("type", type).m66717a());
            return delegationChildFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateChild.DelegationChildFragment$a */
    /* JADX INFO: compiled from: DelegationChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/delegation/delegateChild/DelegationChildFragment$cancelOrder$4", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24819a extends C24223c1 {
        public C24819a() {
            super(DelegationChildFragment.this);
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m60805h(DelegationChildFragment delegationChildFragment, MaintenanceEntity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            delegationChildFragment.f46495W.notifyItemRangeChanged(0, delegationChildFragment.f46495W.getItemCount());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m60806i(final DelegationChildFragment delegationChildFragment) {
            DisposableKt.addTo(TradeManager.f50593a.m61839j(new Function1() { // from class: com.kubi.spot.business.delegation.delegateChild.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DelegationChildFragment.C24819a.m60807j(delegationChildFragment, (MaintenanceEntity) obj);
                }
            }), delegationChildFragment.getDestroyDisposable());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m60807j(DelegationChildFragment delegationChildFragment, MaintenanceEntity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            delegationChildFragment.f46495W.notifyItemRangeChanged(0, delegationChildFragment.f46495W.getItemCount());
            return Unit.INSTANCE;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws JSONException {
            super.accept(th2);
            if ((th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "200001")) {
                TradeManager tradeManager = TradeManager.f50593a;
                final DelegationChildFragment delegationChildFragment = DelegationChildFragment.this;
                Function1<? super MaintenanceEntity, Unit> function1 = new Function1() { // from class: com.kubi.spot.business.delegation.delegateChild.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DelegationChildFragment.C24819a.m60805h(delegationChildFragment, (MaintenanceEntity) obj);
                    }
                };
                final DelegationChildFragment delegationChildFragment2 = DelegationChildFragment.this;
                DisposableKt.addTo(tradeManager.m61842q(function1, new Function0() { // from class: com.kubi.spot.business.delegation.delegateChild.n
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DelegationChildFragment.C24819a.m60806i(delegationChildFragment2);
                    }
                }), DelegationChildFragment.this.getDestroyDisposable());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", false);
            C43852m.m96605q("spot_cancel_order_result", jSONObject);
            C43841b.m96555b("spot_cancel_order", null, 2, null);
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

    /* JADX INFO: renamed from: W3 */
    public static final Unit m60783W3() {
        ToastCompat.m66437C(R$string.twap_modify_not_supported);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m60784X3(DelegationEntity delegationEntity, DelegationChildFragment delegationChildFragment) {
        C43852m.m96590b("B5orderList", "ModifyOrder", "ModifyOrderButton", TuplesKt.m90091to("pricing_type", TUIConstants.TUIContact.LIMIT));
        AmendOrderDialog amendOrderDialogNewInstance = AmendOrderDialog.f50494z0.newInstance(delegationEntity, BizType.SPOT);
        FragmentManager childFragmentManager = delegationChildFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        amendOrderDialogNewInstance.show(childFragmentManager, "AmendOrderDialog");
        return Unit.INSTANCE;
    }

    private final String getType() {
        return (String) this.f49968e0.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    private final String m60789h4() {
        return "TRADE";
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable final DelegationEntity delegationEntity) {
        TradeItemBean tradeItemBeanMo60180J;
        if (baseViewHolder == null || delegationEntity == null) {
            return;
        }
        C45379e0 c45379e0M100288a = C45379e0.m100288a(baseViewHolder.itemView);
        Intrinsics.checkNotNullExpressionValue(c45379e0M100288a, "bind(...)");
        if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
            C44931a.f101319a.m99353c(c45379e0M100288a);
        } else {
            C44931a.f101319a.m99351a(c45379e0M100288a);
        }
        boolean zEquals = StringsKt.equals(delegationEntity.getSide(), "buy", true);
        final boolean zIsOCO = delegationEntity.isOCO(1);
        boolean zIsMarket = delegationEntity.isMarket(1);
        DurationTrackManager.Companion companion = DurationTrackManager.f49767c;
        String strM60321f = companion.getInstance().m60321f(delegationEntity.getOrderId());
        if (strM60321f != null) {
            C43841b.m96556c("click_submit_spot_order", "data_load_finish", strM60321f);
            companion.getInstance().m60325k(delegationEntity.getOrderId());
        }
        boolean z11 = zIsMarket && zEquals;
        int i11 = R$id.delegation_progressbar;
        ProgressBar progressBar = (ProgressBar) baseViewHolder.getView(i11);
        Resources resources = getResources();
        boolean z12 = this.f49970g0;
        int i12 = (!(z12 && zEquals) && (z12 || zEquals)) ? R$drawable.shape_delegation_progressbar_red : R$drawable.shape_delegation_progressbar_green;
        Context context = getContext();
        progressBar.setProgressDrawable(ResourcesCompat.getDrawable(resources, i12, context != null ? context.getTheme() : null));
        int i13 = R$id.tv_trade_pair;
        BaseViewHolder text = baseViewHolder.setText(i13, delegationEntity.getShowSymbol());
        int i14 = R$id.tv_trade_type;
        BaseViewHolder text2 = text.setText(i14, getString(delegationEntity.getSideString()) + " / " + delegationEntity.getTypeString(1));
        Context context2 = getContext();
        Integer numValueOf = context2 != null ? Integer.valueOf(C22890g.m54281f(context2, Intrinsics.areEqual(delegationEntity.getSide(), "buy"))) : null;
        int i15 = R$color.c_text;
        BaseViewHolder gone = text2.setTextColor(i14, C27039d.m66651k(numValueOf, getColorRes(i15))).setText(R$id.tv_time, C37347r.m83944d(C27039d.m66652l(delegationEntity.getTime()))).setText(R$id.tv_amount_type, getString(R$string.dealed) + '/' + getString(R$string.delegation_amount_stub, C27041f.m66669i(delegationEntity.getUnit(), "--"))).setGone(R$id.tv_hide, delegationEntity.needShowHideTag());
        int i16 = R$id.tv_cancel_delegation;
        TradeManager tradeManager = TradeManager.f50593a;
        gone.setTextColor(i16, (!tradeManager.m61840o(delegationEntity.getSymbol()) || tradeManager.m61837h(delegationEntity.getSymbol())) ? getColorRes(i15) : getColorRes(R$color.complementary)).setBackgroundRes(i16, (!tradeManager.m61840o(delegationEntity.getSymbol()) || tradeManager.m61837h(delegationEntity.getSymbol())) ? R$drawable.shape_emphasis4_24r : R$drawable.shape_complementary8_24r).setOnClickListener(i16, new View.OnClickListener() { // from class: com.kubi.spot.business.delegation.delegateChild.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DelegationChildFragment.m60782V3(this.f49981b, delegationEntity, zIsOCO, view);
            }
        });
        if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
            int i17 = R$id.tvDealAndTotalAmount;
            C27096v0 c27096v0Append = new C27096v0().append(delegationEntity.getAmountFormatterStr(delegationEntity.getDealSize(), z11));
            String str = " / " + delegationEntity.getAmountFormatterStr(delegationEntity.getSize(), z11);
            int i18 = R$color.c_text40;
            baseViewHolder.setText(i17, c27096v0Append.m66905e(str, getColorRes(i18)));
            int i19 = R$id.tvDealPercent;
            baseViewHolder.setTextColor(i19, getColorRes(i18));
            baseViewHolder.setText(i19, delegationEntity.getDealPercent());
            baseViewHolder.setGone(i19, delegationEntity.getDealPercentValue().compareTo(BigDecimal.ZERO) != 0);
            baseViewHolder.setGone(R$id.tv_trigger_price_label, false);
            baseViewHolder.setGone(R$id.tv_trigger_price, false);
            baseViewHolder.setProgress(i11, delegationEntity.getDealProgress());
            baseViewHolder.setText(R$id.tv_delegation_price, zIsMarket ? "--" : delegationEntity.getPriceFormatterStr(delegationEntity.getPrice()));
            baseViewHolder.setGone(R$id.tv_limit_price_label, false);
            baseViewHolder.setGone(R$id.tv_limit_price, false);
            baseViewHolder.setGone(R$id.view_dash, false);
            int i21 = R$id.ivAmendOrder;
            baseViewHolder.setGone(i21, SpotRemoteConfig.f49637a.m59953u());
            ShapeImageView shapeImageView = (ShapeImageView) baseViewHolder.getView(i21);
            if (StringsKt.equals(delegationEntity.getType(), "limit_twap", true)) {
                Intrinsics.checkNotNull(shapeImageView);
                C27046k.m66701p(shapeImageView, getColorRes(R$color.c_icon60));
                View view = baseViewHolder.getView(i21);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateChild.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DelegationChildFragment.m60783W3();
                    }
                }, 1, null);
            } else {
                Intrinsics.checkNotNull(shapeImageView);
                C27046k.m66701p(shapeImageView, getColorRes(i15));
                View view2 = baseViewHolder.getView(i21);
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateChild.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DelegationChildFragment.m60784X3(delegationEntity, this);
                    }
                }, 1, null);
            }
        } else {
            C24837r.m60816a(delegationEntity).mo60812a(baseViewHolder, delegationEntity, this);
        }
        Fragment parentFragment = getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        BaseTradeFragment baseTradeFragment = parentFragment2 instanceof BaseTradeFragment ? (BaseTradeFragment) parentFragment2 : null;
        final String strM66669i = C27041f.m66669i((baseTradeFragment == null || (tradeItemBeanMo60180J = baseTradeFragment.mo60180J()) == null) ? null : tradeItemBeanMo60180J.getSymbol(), C27041f.m66668h(delegationEntity.getSymbol()));
        TextView textView = (TextView) baseViewHolder.getView(i13);
        if (Intrinsics.areEqual(strM66669i, delegationEntity.getSymbol())) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, 0, 0, 0, 6, null);
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, R$drawable.icon_arrow_right_mirrored, C5275i0.m6236a(2.0f), 0, 4, null);
        }
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateChild.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationChildFragment.m60781U3(strM66669i, delegationEntity);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m60795a4(String str, String str2, String str3, boolean z11) {
        if ("spot_cancel_order".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(spot_cancel_order) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            if (str == null || str.length() == 0) {
                eventParametersBuilderAcquire.m42382c("type", TtmlNode.COMBINE_ALL);
            } else {
                eventParametersBuilderAcquire.m42382c("type", C33789m5.f70921k);
            }
            C45290a.f101823a.m100101b("spot_cancel_order", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        TradeManager tradeManager = TradeManager.f50593a;
        if (tradeManager.m61840o(str2) && !tradeManager.m61837h(str2)) {
            C43841b.m96555b("spot_cancel_order", null, 2, null);
            ToastCompat.m66437C(R$string.outage_tip);
            return;
        }
        Observable<R> observableCompose = ((z11 && Intrinsics.areEqual(getType(), InterfaceC33730j9.f70350a)) ? m60798g4().m82951s(str) : m60798g4().m82955w(m60789h4(), str, str2, str3)).delay(1L, TimeUnit.SECONDS).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.business.delegation.delegateChild.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationChildFragment.m60786b4(this.f49988b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.spot.business.delegation.delegateChild.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationChildFragment.m60787c4(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.spot.business.delegation.delegateChild.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                DelegationChildFragment.m60788d4(this.f49977b, obj);
            }
        }, new C24819a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Nullable
    /* JADX INFO: renamed from: e4 */
    public final C44649k0 m60796e4() {
        return (C44649k0) this.f49963Z.getValue(this, f49962i0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: f4 */
    public final C45375c0 m60797f4() {
        return (C45375c0) this.f49964a0.getValue();
    }

    /* JADX INFO: renamed from: g4 */
    public final InterfaceC37053d m60798g4() {
        return (InterfaceC37053d) this.f49967d0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_delegation_todo_trade;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m60800l4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f49969f0 = str;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C45375c0 c45375c0;
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LoadingViewUtils.f48255a.m58509b(this);
        this.f46496X.setEnabled(false);
        this.f46496X.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
        this.f49966c0 = WrapperLoadingView.injectView(this.f46496X);
        C44649k0 c44649k0M60796e4 = m60796e4();
        if (c44649k0M60796e4 != null && (c45375c0 = c44649k0M60796e4.f99173b) != null && (root = c45375c0.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        if (mo21477p3()) {
            showLoading();
        } else {
            showEmpty();
        }
        if (C12573b.f21598a.m23696a()) {
            "EVENT_ORDER_REFRESH".length();
        }
        C12572a.m23692a(this, true, new DelegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1("EVENT_ORDER_REFRESH", null, this));
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
        this.f49965b0.clear();
        this.f49965b0.put("symbol", C27041f.m66668h(this.f49969f0));
        this.f49965b0.put("page", String.valueOf(i11));
        this.f49965b0.put("size", String.valueOf(i12));
        this.f49965b0.put("tradeType", m60789h4());
        if (StringsKt.equals$default(getType(), InterfaceC33730j9.f70350a, false, 2, null)) {
            return m60798g4().m82945m(this.f49965b0).compose(C24217a1.m58389m());
        }
        this.f49965b0.put("status", "active");
        return InterfaceC37053d.m82914P(m60798g4(), this.f49965b0, false, false, 6, null).compose(C24217a1.m58389m());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return com.kubi.tradecorebiz.R$layout.kucoin_item_delegation_view_single;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m60781U3(String str, DelegationEntity delegationEntity) {
        if (!Intrinsics.areEqual(str, delegationEntity.getSymbol())) {
            ISpotService.m59984g(ISpotService.f49646a.get(), C27041f.m66668h(delegationEntity.getSymbol()), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m60782V3(DelegationChildFragment delegationChildFragment, DelegationEntity delegationEntity, boolean z11, View view) {
        delegationChildFragment.m60795a4(delegationEntity.getOrderId(), delegationEntity.getSymbol(), null, z11);
        C43852m.m96590b("B5trading", "orderCancel", "1", TuplesKt.m90091to("symbol", C27041f.m66668h(delegationEntity.getSymbol())));
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m60785Z3(DelegationChildFragment delegationChildFragment, String str, DialogInterface dialogInterface, int i11) {
        String str2;
        if (StringsKt.equals$default(delegationChildFragment.getType(), "active", false, 2, null)) {
            str2 = TUIConstants.TUIContact.LIMIT;
        } else {
            str2 = "stop_oco";
        }
        delegationChildFragment.m60795a4(null, str, str2, false);
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m60786b4(DelegationChildFragment delegationChildFragment, Disposable disposable) {
        delegationChildFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m60787c4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m60788d4(DelegationChildFragment delegationChildFragment, Object obj) throws JSONException {
        Fragment parentFragment;
        delegationChildFragment.hideDialogLoading();
        BeepHelper.m23642f("beep_revoke", R$raw.revoke);
        delegationChildFragment.showToast(delegationChildFragment.getString(R$string.cancel_order_ok));
        BaseTradeFragment baseTradeFragment = null;
        C43841b.m96557d("spot_cancel_order", "show_toast", null, 4, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", true);
        C43852m.m96605q("spot_cancel_order_result", jSONObject);
        Fragment parentFragment2 = delegationChildFragment.getParentFragment();
        if (parentFragment2 != null) {
            parentFragment = parentFragment2.getParentFragment();
        } else {
            parentFragment = null;
        }
        if (parentFragment instanceof BaseTradeFragment) {
            baseTradeFragment = (BaseTradeFragment) parentFragment;
        }
        if (baseTradeFragment == null) {
            return;
        }
        baseTradeFragment.mo60199m2();
    }

    /* JADX INFO: renamed from: i4 */
    public static final C45375c0 m60790i4(DelegationChildFragment delegationChildFragment) {
        C45375c0 c45375c0;
        C44649k0 c44649k0M60796e4 = delegationChildFragment.m60796e4();
        if (c44649k0M60796e4 != null && (c45375c0 = c44649k0M60796e4.f99173b) != null) {
            return C45375c0.m100280a(c45375c0.getRoot());
        }
        return null;
    }

    /* JADX INFO: renamed from: j4 */
    public static final InterfaceC37053d m60791j4() {
        return (InterfaceC37053d) C42597a.m93386b().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m60792n4(DelegationChildFragment delegationChildFragment) {
        Bundle arguments = delegationChildFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("type", "active");
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: E3 */
    public void mo22112E3(boolean z11) {
        TradeOpenOrdersFragment tradeOpenOrdersFragment;
        super.mo22112E3(z11);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof TradeOpenOrdersFragment) {
            tradeOpenOrdersFragment = (TradeOpenOrdersFragment) parentFragment;
        } else {
            tradeOpenOrdersFragment = null;
        }
        if (tradeOpenOrdersFragment != null) {
            tradeOpenOrdersFragment.m60760q3(this.f46495W.getData().isEmpty(), Intrinsics.areEqual(getType(), "active"));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m60794Y3(@Nullable final String str) {
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
                C43852m.m96591c("B5orderList", "cancelAll", null, null, 12, null);
                AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.onekey_cancel_all);
                if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
                    i11 = R$string.cancel_all_todo_order;
                } else {
                    i11 = R$string.cancel_all_limit_order;
                }
                alertDialogFragmentHelperM54167X4.m54153J4(i11).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.spot.business.delegation.delegateChild.f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        DelegationChildFragment.m60785Z3(this.f49979b, str, dialogInterface, i12);
                    }
                }).m54159P4(R$string.cancel, null).m54172c5(getChildFragmentManager());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60799k4() {
        Fragment parentFragment;
        C45375c0 c45375c0;
        ConstraintLayout root;
        C45375c0 c45375c1;
        ConstraintLayout root2;
        C45375c0 c45375c2;
        ConstraintLayout root3;
        if (isAdded()) {
            if (!IUserService.a.get().c()) {
                C44649k0 c44649k0M60796e4 = m60796e4();
                if (c44649k0M60796e4 != null && (c45375c2 = c44649k0M60796e4.f99173b) != null && (root3 = c45375c2.getRoot()) != null) {
                    ViewExtKt.m66577h(root3);
                    return;
                }
                return;
            }
            Fragment parentFragment2 = getParentFragment();
            BaseTradeFragment baseTradeFragment = null;
            if (parentFragment2 != null) {
                parentFragment = parentFragment2.getParentFragment();
            } else {
                parentFragment = null;
            }
            if (parentFragment instanceof BaseTradeFragment) {
                baseTradeFragment = (BaseTradeFragment) parentFragment;
            }
            if (baseTradeFragment != null) {
                if (baseTradeFragment.getF49743l0() == 0) {
                    C44649k0 c44649k0M60796e5 = m60796e4();
                    if (c44649k0M60796e5 != null && (c45375c1 = c44649k0M60796e5.f99173b) != null && (root2 = c45375c1.getRoot()) != null) {
                        C27046k.m66685H(root2);
                        return;
                    }
                    return;
                }
                C44649k0 c44649k0M60796e6 = m60796e4();
                if (c44649k0M60796e6 != null && (c45375c0 = c44649k0M60796e6.f99173b) != null && (root = c45375c0.getRoot()) != null) {
                    ViewExtKt.m66577h(root);
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m4 */
    public final InterfaceC41775x1 m60801m4(@Nullable CharSequence charSequence, @Nullable String str) {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new DelegationChildFragment$showGuideLayout$1(this, charSequence, str, null));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        WrapperLoadingView wrapperLoadingView = this.f49966c0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        showContent();
        WrapperLoadingView wrapperLoadingView = this.f49966c0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(R$string.no_order, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }
}
