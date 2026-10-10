package com.kubi.margin.delegation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.BeepHelper;
import com.kubi.data.entity.MaintenanceEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$raw;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
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
import com.kubi.spot.R$string;
import com.kubi.spot.SpotRemoteConfig;
import com.kubi.spot.api.ISpotService;
import com.kubi.spot.business.delegation.delegateChild.C24837r;
import com.kubi.spot.dialog.order.AmendOrderDialog;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.tradebase.BizType;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27063n;
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
import f00.C37304a;
import g00.InterfaceC37754f;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p206dp.C36931p;
import p569qq.C43841b;
import p569qq.C43852m;
import p671uq.C45290a;
import p768xo.InterfaceC46307h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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
import p852kotlin.text.StringsKt;
import ro.C44128b;
import rs.C44172b;
import t30.C44681a;
import td.C44931a;
import v30.C45375c0;
import v30.C45377d0;
import v30.C45379e0;
import w00.C45681e;

/* JADX INFO: compiled from: MarginDelegationChildFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 l2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001lB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00106\u001a\u000207H\u0014J\b\u00108\u001a\u00020+H\u0014J\b\u00109\u001a\u00020+H\u0014J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0002H\u0014J\u0014\u0010@\u001a\u00020<*\u00020A2\u0006\u0010B\u001a\u00020+H\u0002J\b\u0010C\u001a\u000207H\u0016J\b\u0010D\u001a\u000207H\u0016J&\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020G\u0018\u00010F2\u0006\u0010H\u001a\u00020+2\u0006\u0010I\u001a\u00020+H\u0014J\b\u0010J\u001a\u00020\u001cH\u0002J\b\u0010K\u001a\u00020\u001cH\u0002J:\u0010L\u001a\u00020<2\b\u0010M\u001a\u0004\u0018\u00010\u001c2\b\u0010N\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u001c2\u0006\u0010O\u001a\u0002072\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u001cH\u0003J \u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020R2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010TH\u0014J\u001a\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020A2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\b\u0010Y\u001a\u00020<H\u0002J!\u0010Z\u001a\u00020<2\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0000¢\u0006\u0002\b_J\u0006\u0010`\u001a\u00020<J\u0010\u0010a\u001a\u00020<2\b\u0010/\u001a\u0004\u0018\u00010\u001cJ\b\u0010b\u001a\u00020<H\u0016J\b\u0010c\u001a\u00020<H\u0016J\u0010\u0010d\u001a\u00020<2\u0006\u0010e\u001a\u000207H\u0014J:\u0010f\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u0002Hh\u0018\u00010g\"\u0004\b\u0000\u0010h*\b\u0012\u0004\u0012\u0002Hh0i2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u0002Hh\u0012\u0004\u0012\u0002070kH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bj\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010 \u001a\n \"*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010$R\u001d\u0010&\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0010\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010(\"\u0004\b1\u00102R\u001e\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001c04j\b\u0012\u0004\u0012\u00020\u001c`5X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginDelegationChildFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/spot/entity/DelegationEntity;", "<init>", "()V", "bmarginFragmentDelegationTodoBinding", "Lcom/kubi/margin/databinding/BmarginFragmentDelegationTodoBinding;", "getBmarginFragmentDelegationTodoBinding$MarginLib_googleRelease", "()Lcom/kubi/margin/databinding/BmarginFragmentDelegationTodoBinding;", "bmarginFragmentDelegationTodoBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "guideAddFundsBinding", "Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideLayoutBinding;", "getGuideAddFundsBinding$MarginLib_googleRelease", "()Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideLayoutBinding;", "guideAddFundsBinding$delegate", "Lkotlin/Lazy;", "guideTradeBinding", "Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideTradeLayoutBinding;", "getGuideTradeBinding$MarginLib_googleRelease", "()Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideTradeLayoutBinding;", "guideTradeBinding$delegate", "baseMarginFragment", "Lcom/kubi/margin/trade/BaseMarginFragment;", "getBaseMarginFragment", "()Lcom/kubi/margin/trade/BaseMarginFragment;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "selfLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "mTradeApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/margin/api/MarketApi;", "mTradeApi$delegate", "type", "getType", "()Ljava/lang/String;", "type$delegate", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "symbol", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "cancelIdList", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "needDefaultBackground", "", "getLayout", "getItemLayout", "isUpGreen", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "updateValueTextGravity", "Landroid/view/View;", "gravity", "needAutoLoad", "canLoad", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "getTradeTypeString", "getTrackPageId", "cancelOrder", "orderId", "currentSymbols", "isOco", "unitId", "filterData", "", FirebaseAnalytics.Param.ITEMS, "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "savedInstanceState", "Landroid/os/Bundle;", "bindOrderUpdate", "showGuideLayout", "quoteAvailableBalance", "Ljava/math/BigDecimal;", "quoteBalanceDisplayStr", "", "showGuideLayout$MarginLib_googleRelease", "refreshEntrance", "cancelAllOrders", "showEmpty", "showContent", "onNetworkFinished", "success", "findWithIndex", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "", "predicate", "Lkotlin/Function1;", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginDelegationChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationChildFragment.kt\ncom/kubi/margin/delegation/MarginDelegationChildFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,597:1\n147#2,16:598\n46#3,14:614\n774#4:628\n865#4,2:629\n1878#4,3:638\n76#5,7:631\n1#6:641\n*S KotlinDebug\n*F\n+ 1 MarginDelegationChildFragment.kt\ncom/kubi/margin/delegation/MarginDelegationChildFragment\n*L\n95#1:598,16\n327#1:614,14\n395#1:628\n395#1:629,2\n571#1:638,3\n428#1:631,7\n*E\n"})
public final class MarginDelegationChildFragment extends BasePagingFragment<DelegationEntity> {

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public WrapperLoadingView f32824d0;

    /* JADX INFO: renamed from: j0 */
    public final boolean f32830j0;

    /* JADX INFO: renamed from: l0 */
    public static final /* synthetic */ KProperty<Object>[] f32819l0 = {Reflection.property1(new PropertyReference1Impl(MarginDelegationChildFragment.class, "bmarginFragmentDelegationTodoBinding", "getBmarginFragmentDelegationTodoBinding$MarginLib_googleRelease()Lcom/kubi/margin/databinding/BmarginFragmentDelegationTodoBinding;", 0))};

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f32818k0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f32820Z = C45681e.m100799e(this, new Function1<MarginDelegationChildFragment, C36931p>() { // from class: com.kubi.margin.delegation.MarginDelegationChildFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36931p invoke(@NotNull MarginDelegationChildFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36931p.m82730a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36931p, Unit>() { // from class: com.kubi.margin.delegation.MarginDelegationChildFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36931p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36931p c36931p) {
            invoke(c36931p);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f32821a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDelegationChildFragment.m38061s4(this.f32988b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f32822b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDelegationChildFragment.m38062t4(this.f33010b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final HashMap<String, String> f32823c0 = new HashMap<>();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f32825e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDelegationChildFragment.m38063u4();
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f32826f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDelegationChildFragment.m38065z4(this.f33011b);
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f32827g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginDelegationChildFragment.m38064y4(this.f33012b));
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public String f32828h0 = "";

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final HashSet<String> f32829i0 = new HashSet<>();

    /* JADX INFO: compiled from: MarginDelegationChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/margin/delegation/MarginDelegationChildFragment$Companion;", "", "<init>", "()V", "DELEGATION_TODO", "", "DELEGATION_STOP", "newInstance", "Lcom/kubi/margin/delegation/MarginDelegationChildFragment;", "type", "tradeType", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginDelegationChildFragment newInstance(@NotNull String type, int tradeType) {
            Intrinsics.checkNotNullParameter(type, "type");
            MarginDelegationChildFragment marginDelegationChildFragment = new MarginDelegationChildFragment();
            marginDelegationChildFragment.setArguments(new C27051h().m66724h("type", type).m66720d("tradeType", tradeType).m66717a());
            return marginDelegationChildFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.delegation.MarginDelegationChildFragment$a */
    /* JADX INFO: compiled from: MarginDelegationChildFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17498a implements Function1<DelegationEntity, Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f32831b;

        public C17498a(String str) {
            this.f32831b = str;
        }

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(DelegationEntity delegationEntity) {
            return Boolean.valueOf(Intrinsics.areEqual(delegationEntity.getOrderId(), this.f32831b));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.delegation.MarginDelegationChildFragment$b */
    /* JADX INFO: compiled from: MarginDelegationChildFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17499b implements Function1<DelegationEntity, Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DelegationEntity f32832b;

        public C17499b(DelegationEntity delegationEntity) {
            this.f32832b = delegationEntity;
        }

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(DelegationEntity delegationEntity) {
            return Boolean.valueOf(Intrinsics.areEqual(delegationEntity.getOrderId(), this.f32832b.getOrderId()));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.delegation.MarginDelegationChildFragment$c */
    /* JADX INFO: compiled from: MarginDelegationChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/delegation/MarginDelegationChildFragment$cancelOrder$4", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17501c extends C24223c1 {
        public C17501c() {
            super(MarginDelegationChildFragment.this);
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m38086h(MarginDelegationChildFragment marginDelegationChildFragment, Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            marginDelegationChildFragment.f46495W.notifyItemRangeChanged(0, marginDelegationChildFragment.f46495W.getItemCount());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static final Unit m38087i(final MarginDelegationChildFragment marginDelegationChildFragment) {
            DisposableKt.addTo(ISpotService.f49646a.get().mo60012y(new Function1() { // from class: com.kubi.margin.delegation.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationChildFragment.C17501c.m38088j(marginDelegationChildFragment, obj);
                }
            }), marginDelegationChildFragment.getDestroyDisposable());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m38088j(MarginDelegationChildFragment marginDelegationChildFragment, Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            marginDelegationChildFragment.f46495W.notifyItemRangeChanged(0, marginDelegationChildFragment.f46495W.getItemCount());
            return Unit.INSTANCE;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws JSONException {
            super.accept(th2);
            boolean z11 = th2 instanceof ApiException;
            if (z11 && Intrinsics.areEqual(((ApiException) th2).code, "400100")) {
                MarginDelegationChildFragment.this.mo15906F3();
            } else if (z11 && Intrinsics.areEqual(((ApiException) th2).code, "200001")) {
                ISpotService iSpotService = ISpotService.f49646a.get();
                final MarginDelegationChildFragment marginDelegationChildFragment = MarginDelegationChildFragment.this;
                Function1<? super MaintenanceEntity, Unit> function1 = new Function1() { // from class: com.kubi.margin.delegation.c0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginDelegationChildFragment.C17501c.m38086h(marginDelegationChildFragment, obj);
                    }
                };
                final MarginDelegationChildFragment marginDelegationChildFragment2 = MarginDelegationChildFragment.this;
                DisposableKt.addTo(iSpotService.mo59990a(function1, new Function0() { // from class: com.kubi.margin.delegation.d0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginDelegationChildFragment.C17501c.m38087i(marginDelegationChildFragment2);
                    }
                }), MarginDelegationChildFragment.this.getDestroyDisposable());
            }
            C43841b.m96555b("margin_cancel_order", null, 2, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", false);
            C43852m.m96605q("margin_cancel_order_result", jSONObject);
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

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m38052Z3(DelegationEntity delegationEntity, MarginDelegationChildFragment marginDelegationChildFragment) {
        AmendOrderDialog amendOrderDialogNewInstance = AmendOrderDialog.f50494z0.newInstance(delegationEntity, BizType.MARGIN);
        FragmentManager childFragmentManager = marginDelegationChildFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        amendOrderDialogNewInstance.show(childFragmentManager, "AmendOrderDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m38055c4() {
        ToastCompat.m66437C(R$string.twap_modify_not_supported);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTradeType() {
        return ((Number) this.f32827g0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getType() {
        return (String) this.f32826f0.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ void m38057h4(MarginDelegationChildFragment marginDelegationChildFragment, String str, String str2, String str3, boolean z11, String str4, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str4 = null;
        }
        marginDelegationChildFragment.m38069g4(str, str2, str3, z11, str4);
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m38060k4(String str, MarginDelegationChildFragment marginDelegationChildFragment, Object obj) throws JSONException {
        if (str != null) {
            marginDelegationChildFragment.f32829i0.add(str);
        }
        marginDelegationChildFragment.hideDialogLoading();
        BeepHelper.m23642f("beep_revoke", R$raw.revoke);
        marginDelegationChildFragment.showToast(marginDelegationChildFragment.getString(com.kubi.margin.R$string.cancel_order_ok));
        C43841b.m96557d("margin_cancel_order", "show_toast", null, 4, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", true);
        C43852m.m96605q("margin_cancel_order_result", jSONObject);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final DelegationEntity item) {
        TradeItemBean tradeItemBeanMo39717J;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C45379e0 c45379e0M100288a = C45379e0.m100288a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c45379e0M100288a, "bind(...)");
        if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
            C44931a.f101319a.m99353c(c45379e0M100288a);
        } else {
            C44931a.f101319a.m99351a(c45379e0M100288a);
        }
        final boolean zEquals = StringsKt.equals(item.getSide(), "buy", true);
        final boolean zIsOCO = item.isOCO(1);
        boolean zIsMarket = item.isMarket(1);
        boolean z11 = zIsMarket && zEquals;
        int i11 = R$id.tv_delegation_price;
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        int i12 = R$id.delegation_progressbar;
        ProgressBar progressBar = (ProgressBar) helper.getView(i12);
        Resources resources = getResources();
        boolean z12 = this.f32830j0;
        int i13 = (!(z12 && zEquals) && (z12 || zEquals)) ? R$drawable.shape_delegation_progressbar_red : R$drawable.shape_delegation_progressbar_green;
        Context context = getContext();
        progressBar.setProgressDrawable(ResourcesCompat.getDrawable(resources, i13, context != null ? context.getTheme() : null));
        int i14 = R$id.tv_trade_pair;
        BaseViewHolder text = helper.setText(i14, item.getShowSymbol());
        int i15 = R$id.tv_trade_type;
        BaseViewHolder text2 = text.setText(i15, getString(item.getSideString()) + '/' + item.getTypeString(1));
        Context context2 = getContext();
        Integer numValueOf = context2 != null ? Integer.valueOf(C22890g.m54281f(context2, Intrinsics.areEqual(item.getSide(), "buy"))) : null;
        int i16 = R$color.c_text;
        BaseViewHolder textColor = text2.setTextColor(i15, C27039d.m66651k(numValueOf, getColorRes(i16)));
        int i17 = R$id.tvDealPercent;
        Context context3 = getContext();
        BaseViewHolder gone = textColor.setTextColor(i17, C27039d.m66651k(context3 != null ? Integer.valueOf(C22890g.m54281f(context3, Intrinsics.areEqual(item.getSide(), "buy"))) : null, getColorRes(i16))).setText(R$id.tv_time, C44681a.m98835b(C27039d.m66652l(item.getTime()), null, false, false, null, 15, null)).setText(R$id.tv_amount_type, getString(com.kubi.margin.R$string.dealed) + '/' + getString(com.kubi.margin.R$string.delegation_amount_stub, C27041f.m66669i(item.getUnit(), "--"))).setGone(R$id.tv_hide, item.needShowHideTag());
        int i18 = R$id.tv_cancel_delegation;
        C42579a c42579a = C42579a.f94275a;
        gone.setTextColor(i18, (!c42579a.m93346f().mo60008u(item.getSymbol()) || c42579a.m93346f().mo59995h(item.getSymbol())) ? getColorRes(i16) : getColorRes(R$color.complementary)).setBackgroundRes(i18, (!c42579a.m93346f().mo60008u(item.getSymbol()) || c42579a.m93346f().mo59995h(item.getSymbol())) ? R$drawable.shape_emphasis4_24r : R$drawable.shape_complementary8_24r).setOnClickListener(i18, new View.OnClickListener() { // from class: com.kubi.margin.delegation.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginDelegationChildFragment.m38054b4(this.f33013b, item, zIsOCO, view2);
            }
        });
        if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
            helper.setText(R$id.tvDealAndTotalAmount, new C27096v0().append(item.getAmountFormatterStr(item.getDealSize(), z11)).m66905e(" / " + item.getAmountFormatterStr(item.getSize(), z11), getColorRes(R$color.c_text40)));
            helper.setText(i17, item.getDealPercent());
            helper.setGone(i17, !(C27039d.m66647g(item.getDealSize()) == 0.0d));
            helper.setGone(R$id.tv_trigger_price_label, false);
            helper.setGone(R$id.tv_trigger_price, false);
            helper.setProgress(i12, item.getDealProgress());
            helper.setText(i11, zIsMarket ? "--" : item.getPriceFormatterStr(item.getPrice()));
            helper.setGone(R$id.tv_limit_price_label, false);
            helper.setGone(R$id.tv_limit_price, false);
            helper.setGone(R$id.view_dash, false);
            int i19 = R$id.ivAmendOrder;
            helper.setGone(i19, SpotRemoteConfig.f49637a.m59950r());
            ShapeImageView shapeImageView = (ShapeImageView) helper.getView(i19);
            if (StringsKt.equals(item.getType(), "limit_twap", true)) {
                Intrinsics.checkNotNull(shapeImageView);
                C27046k.m66701p(shapeImageView, getColorRes(R$color.c_icon60));
                View view2 = helper.getView(i19);
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.margin.delegation.y
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginDelegationChildFragment.m38055c4();
                    }
                }, 1, null);
            } else {
                Intrinsics.checkNotNull(shapeImageView);
                C27046k.m66701p(shapeImageView, getColorRes(com.kubi.spot.R$color.c_text));
                View view3 = helper.getView(i19);
                Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
                C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.margin.delegation.z
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginDelegationChildFragment.m38052Z3(item, this);
                    }
                }, 1, null);
            }
        } else {
            C24837r.m60816a(item).mo60812a(helper, item, this);
        }
        BaseMarginFragment baseMarginFragmentM38071m4 = m38071m4();
        String symbol = (baseMarginFragmentM38071m4 == null || (tradeItemBeanMo39717J = baseMarginFragmentM38071m4.mo39717J()) == null) ? null : tradeItemBeanMo39717J.getSymbol();
        String symbol2 = item.getSymbol();
        if (symbol2 == null) {
            symbol2 = "";
        }
        final String strM66669i = C27041f.m66669i(symbol, symbol2);
        TextView textView = (TextView) helper.getView(i14);
        if (Intrinsics.areEqual(strM66669i, item.getSymbol())) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, 0, 0, 0, 6, null);
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, R$drawable.icon_arrow_right_mirrored, C5275i0.m6236a(2.0f), 0, 4, null);
        }
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.margin.delegation.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDelegationChildFragment.m38053a4(strM66669i, item, zEquals);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m38067d4() {
        if (C12573b.f21598a.m23696a()) {
            "action_order_changed".length();
        }
        C12572a.m23692a(this, false, new C17500xe2b1c894("action_order_changed", null, this));
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: g4 */
    public final void m38069g4(String str, String str2, String str3, boolean z11, final String str4) {
        if ("margin_cancel_order".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(margin_cancel_order) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            if (str == null || str.length() == 0) {
                eventParametersBuilderAcquire.m42382c("type", TtmlNode.COMBINE_ALL);
            } else {
                eventParametersBuilderAcquire.m42382c("type", C33789m5.f70921k);
            }
            eventParametersBuilderAcquire.m42382c("marginType", getTradeType() == 1 ? "cross" : "isolated");
            C45290a.f101823a.m100101b("margin_cancel_order", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93346f().mo60008u(str2) && !c42579a.m93346f().mo59995h(str2)) {
            C43841b.m96555b("margin_cancel_order", null, 2, null);
            ToastCompat.m66437C(com.kubi.margin.R$string.outage_tip);
        } else {
            Observable<R> observableCompose = ((z11 && Intrinsics.areEqual(getType(), InterfaceC33730j9.f70350a)) ? m38076q4().m102135s(str) : m38076q4().m102139w(m38077r4(), str, str2, str3)).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.delegation.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationChildFragment.m38058i4(this.f32989b, (Disposable) obj);
                }
            };
            addSubscription(observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.margin.delegation.r
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginDelegationChildFragment.m38059j4(function1, obj);
                }
            }).subscribe(new Consumer() { // from class: com.kubi.margin.delegation.s
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws JSONException {
                    MarginDelegationChildFragment.m38060k4(str4, this, obj);
                }
            }, new C17501c()));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_delegation_todo;
    }

    @Nullable
    /* JADX INFO: renamed from: n4 */
    public final C36931p m38072n4() {
        return (C36931p) this.f32820Z.getValue(this, f32819l0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public final C45375c0 m38073o4() {
        return (C45375c0) this.f32821a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LoadingViewUtils.f48255a.m58509b(this);
        C36931p c36931pM38072n4 = m38072n4();
        if (c36931pM38072n4 != null) {
            c36931pM38072n4.f81869f.setVisibility(8);
            this.f46496X.setEnabled(false);
            this.f46496X.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
            this.f32824d0 = WrapperLoadingView.injectView(this.f46496X);
            if (mo21477p3()) {
                showLoading();
            } else {
                showEmpty();
            }
            m38067d4();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return C42579a.f94275a.m93347g().c();
    }

    @Nullable
    /* JADX INFO: renamed from: p4 */
    public final C45377d0 m38074p4() {
        return (C45377d0) this.f32822b0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    public final InterfaceC46307h m38076q4() {
        return (InterfaceC46307h) this.f32825e0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<DelegationEntity>> mo16440r3(int i11, int i12) {
        this.f32823c0.clear();
        this.f32823c0.put("symbol", C27041f.m66668h(this.f32828h0));
        this.f32823c0.put("page", String.valueOf(i11));
        this.f32823c0.put("size", String.valueOf(i12));
        this.f32823c0.put("tradeType", m38077r4());
        if (StringsKt.equals$default(getType(), InterfaceC33730j9.f70350a, false, 2, null)) {
            return m38076q4().m102129m(this.f32823c0).compose(C24217a1.m58389m());
        }
        this.f32823c0.put("status", "active");
        return InterfaceC46307h.m102117y(m38076q4(), this.f32823c0, false, false, 6, null).compose(C24217a1.m58389m());
    }

    /* JADX INFO: renamed from: w4 */
    public final void m38079w4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f32828h0 = str;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_delegation_view_single;
    }

    public MarginDelegationChildFragment() {
        this.f32830j0 = C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == 0;
    }

    /* JADX INFO: renamed from: P0 */
    private final String m38042P0() {
        if (getTradeType() == 1) {
            return "B4tradingCross";
        }
        return "B4tradingIsolated";
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m38053a4(String str, DelegationEntity delegationEntity, boolean z11) {
        if (!Intrinsics.areEqual(str, delegationEntity.getSymbol())) {
            InterfaceC37754f.a.m85135g(C37304a.f82764a, delegationEntity.getSymbol(), Boolean.valueOf(z11), null, null, null, 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m38054b4(MarginDelegationChildFragment marginDelegationChildFragment, DelegationEntity delegationEntity, boolean z11, View view) {
        C43852m.m96591c(marginDelegationChildFragment.m38042P0(), "orderManagement", "4", null, 8, null);
        String orderId = delegationEntity.getOrderId();
        String symbol = delegationEntity.getSymbol();
        StringBuilder sb2 = new StringBuilder();
        String type = delegationEntity.getType();
        if (type == null) {
            type = "";
        }
        sb2.append(type);
        sb2.append(UserInfo.a.i());
        sb2.append(delegationEntity.getOrderId());
        marginDelegationChildFragment.m38069g4(orderId, symbol, null, z11, sb2.toString());
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m38056f4(MarginDelegationChildFragment marginDelegationChildFragment, String str, DialogInterface dialogInterface, int i11) {
        String str2;
        if (StringsKt.equals$default(marginDelegationChildFragment.getType(), "active", false, 2, null)) {
            str2 = TUIConstants.TUIContact.LIMIT;
        } else {
            str2 = "stop_oco";
        }
        m38057h4(marginDelegationChildFragment, null, str, str2, false, null, 16, null);
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m38058i4(MarginDelegationChildFragment marginDelegationChildFragment, Disposable disposable) {
        marginDelegationChildFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m38059j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s4 */
    public static final C45375c0 m38061s4(MarginDelegationChildFragment marginDelegationChildFragment) {
        C45375c0 c45375c0;
        C36931p c36931pM38072n4 = marginDelegationChildFragment.m38072n4();
        if (c36931pM38072n4 != null && (c45375c0 = c36931pM38072n4.f81865b) != null) {
            return C45375c0.m100280a(c45375c0.getRoot());
        }
        return null;
    }

    /* JADX INFO: renamed from: t4 */
    public static final C45377d0 m38062t4(MarginDelegationChildFragment marginDelegationChildFragment) {
        C45377d0 c45377d0;
        C36931p c36931pM38072n4 = marginDelegationChildFragment.m38072n4();
        if (c36931pM38072n4 != null && (c45377d0 = c36931pM38072n4.f81866c) != null) {
            return C45377d0.m100284a(c45377d0.getRoot());
        }
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    public static final InterfaceC46307h m38063u4() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: y4 */
    public static final int m38064y4(MarginDelegationChildFragment marginDelegationChildFragment) {
        Integer numValueOf;
        Bundle arguments = marginDelegationChildFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 1);
    }

    /* JADX INFO: renamed from: z4 */
    public static final String m38065z4(MarginDelegationChildFragment marginDelegationChildFragment) {
        Bundle arguments = marginDelegationChildFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("type", "active");
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: E3 */
    public void mo22112E3(boolean z11) {
        MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment;
        super.mo22112E3(z11);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof MarginTradeOpenOrdersFragment) {
            marginTradeOpenOrdersFragment = (MarginTradeOpenOrdersFragment) parentFragment;
        } else {
            marginTradeOpenOrdersFragment = null;
        }
        if (marginTradeOpenOrdersFragment != null) {
            List<DelegationEntity> data = this.f46495W.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            marginTradeOpenOrdersFragment.m38111t3(data, Intrinsics.areEqual(getType(), "active"));
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m38068e4(@Nullable final String str) {
        Boolean boolValueOf;
        int i11;
        if (getView() != null && getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                boolValueOf = Boolean.valueOf(activity.isFinishing());
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf) && !this.f46495W.getData().isEmpty()) {
                AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(com.kubi.margin.R$string.onekey_cancel_all);
                if (StringsKt.equals$default(getType(), "active", false, 2, null)) {
                    i11 = com.kubi.margin.R$string.cancel_all_todo_order;
                } else {
                    i11 = com.kubi.margin.R$string.cancel_all_limit_order;
                }
                alertDialogFragmentHelperM54167X4.m54153J4(i11).m54162S4(com.kubi.margin.R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.margin.delegation.b0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        MarginDelegationChildFragment.m38056f4(this.f32848b, str, dialogInterface, i12);
                    }
                }).m54159P4(com.kubi.margin.R$string.cancel, null).m54172c5(getChildFragmentManager());
            }
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final <T> Pair<Integer, T> m38070l4(List<? extends T> list, Function1<? super T, Boolean> function1) {
        int i11 = 0;
        for (T t11 : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(t11).booleanValue()) {
                return new Pair<>(Integer.valueOf(i11), t11);
            }
            i11 = i12;
        }
        return null;
    }

    /* JADX INFO: renamed from: m4 */
    public final BaseMarginFragment m38071m4() {
        Fragment parentFragment;
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 != null) {
            parentFragment = parentFragment2.getParentFragment();
        } else {
            parentFragment = null;
        }
        if (!(parentFragment instanceof BaseMarginFragment)) {
            return null;
        }
        return (BaseMarginFragment) parentFragment;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: q3 */
    public Collection<? extends DelegationEntity> mo38075q3(@Nullable List<DelegationEntity> list) {
        Collection collectionMo38075q3 = super.mo38075q3(list);
        Intrinsics.checkNotNullExpressionValue(collectionMo38075q3, "filterData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo38075q3) {
            DelegationEntity delegationEntity = (DelegationEntity) obj;
            HashSet<String> hashSet = this.f32829i0;
            StringBuilder sb2 = new StringBuilder();
            String type = delegationEntity.getType();
            if (type == null) {
                type = "";
            }
            sb2.append(type);
            sb2.append(UserInfo.a.i());
            sb2.append(delegationEntity.getOrderId());
            if (!hashSet.contains(sb2.toString())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    /* JADX INFO: renamed from: r4 */
    public final String m38077r4() {
        if (getTradeType() == 2) {
            return "MARGIN_ISOLATED_TRADE";
        }
        return "MARGIN_TRADE";
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        WrapperLoadingView wrapperLoadingView = this.f32824d0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        showContent();
        WrapperLoadingView wrapperLoadingView = this.f32824d0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(com.kubi.margin.R$string.no_order, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m38078v4() {
        BaseMarginFragment baseMarginFragmentM38071m4;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        if (getView() != null && isAdded() && (baseMarginFragmentM38071m4 = m38071m4()) != null) {
            if (!C42579a.f94275a.m93347g().c()) {
                C36931p c36931pM38072n4 = m38072n4();
                if (c36931pM38072n4 != null && (linearLayout3 = c36931pM38072n4.f81867d) != null) {
                    ViewExtKt.m66577h(linearLayout3);
                    return;
                }
                return;
            }
            if (baseMarginFragmentM38071m4.getF33666n0() == 0) {
                C36931p c36931pM38072n5 = m38072n4();
                if (c36931pM38072n5 != null && (linearLayout2 = c36931pM38072n5.f81867d) != null) {
                    C27046k.m66685H(linearLayout2);
                    return;
                }
                return;
            }
            C36931p c36931pM38072n6 = m38072n4();
            if (c36931pM38072n6 != null && (linearLayout = c36931pM38072n6.f81867d) != null) {
                ViewExtKt.m66577h(linearLayout);
            }
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final void m38080x4(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence) {
        BaseMarginFragment baseMarginFragmentM38071m4;
        if (isAdded() && (baseMarginFragmentM38071m4 = m38071m4()) != null) {
            String currency = baseMarginFragmentM38071m4.getF33652Z().getCurrency();
            String currencyName = baseMarginFragmentM38071m4.getF33652Z().getCurrencyName();
            if (C17549i0.m38178f(this, bigDecimal)) {
                C17549i0.m38183k(this, charSequence, currency, currencyName);
            } else {
                C17549i0.m38179g(this, charSequence, currency);
            }
        }
    }
}
