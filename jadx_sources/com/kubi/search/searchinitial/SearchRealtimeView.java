package com.kubi.search.searchinitial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradePairNameTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.search.R$color;
import com.kubi.search.R$font;
import com.kubi.search.R$layout;
import com.kubi.search.R$mipmap;
import com.kubi.search.entity.SearchRealtimeEntity;
import com.kubi.search.entity.TopSearchEntityWrap;
import com.kubi.search.utils.SearchExKt;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import nf.C42828b;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q10.C43590j;
import w00.C45682f;

/* JADX INFO: compiled from: SearchRealtimeView.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020 J\f\u0010!\u001a\u00020\u0011*\u00020\u0013H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/search/searchinitial/SearchRealtimeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/search/databinding/SearchLayoutRealtimeViewBinding;", "getBinding$SearchLib_googleRelease", "()Lcom/kubi/search/databinding/SearchLayoutRealtimeViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "attachLifecycleScope", "", "currentEntity", "Lcom/kubi/search/entity/SearchRealtimeEntity;", "countdownJob", "Lkotlinx/coroutines/Job;", "refreshView", "entityWrap", "Lcom/kubi/search/entity/TopSearchEntityWrap;", "refreshTopicInfo", "showComingSoon", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "showCountdown", "showLaunching", "showLaunched", "updateWSData", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "trackClick", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchRealtimeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchRealtimeView.kt\ncom/kubi/search/searchinitial/SearchRealtimeView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,269:1\n52#2:270\n80#2,7:271\n*S KotlinDebug\n*F\n+ 1 SearchRealtimeView.kt\ncom/kubi/search/searchinitial/SearchRealtimeView\n*L\n57#1:270\n57#1:271,7\n*E\n"})
public final class SearchRealtimeView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f48884f = {Reflection.property1(new PropertyReference1Impl(SearchRealtimeView.class, "binding", "getBinding$SearchLib_googleRelease()Lcom/kubi/search/databinding/SearchLayoutRealtimeViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f48885b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LifecycleCoroutineScope f48886c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public SearchRealtimeEntity f48887d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC41775x1 f48888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRealtimeView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f48885b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C43590j>() { // from class: com.kubi.search.searchinitial.SearchRealtimeView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43590j invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C43590j.m95930a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.search_layout_realtime_view, this);
        C27046k.m66700o(this);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m59138B(SearchRealtimeEntity searchRealtimeEntity, SearchRealtimeView searchRealtimeView) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), searchRealtimeEntity.getSymbol(), null, null, null, 14, null);
        searchRealtimeView.m59163F(searchRealtimeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m59140E(SearchRealtimeEntity searchRealtimeEntity, SearchRealtimeView searchRealtimeView) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), searchRealtimeEntity.getSymbol(), null, null, null, 14, null);
        searchRealtimeView.m59163F(searchRealtimeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m59156q(SearchTopicEntity searchTopicEntity) throws JSONException {
        RouteExKt.m56217H(searchTopicEntity != null ? searchTopicEntity.getTopicUrl() : null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("messageId", "merge");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B1SearchOrSearchResultPage", "hotspot", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m59160x(final SearchRealtimeView searchRealtimeView, final SearchRealtimeEntity searchRealtimeEntity) {
        LifecycleCoroutineScope lifecycleCoroutineScope = searchRealtimeView.f48886c;
        if (lifecycleCoroutineScope == null) {
            return Unit.INSTANCE;
        }
        C43590j binding$SearchLib_googleRelease = searchRealtimeView.getBinding$SearchLib_googleRelease();
        if (binding$SearchLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        Group groupLaunched = binding$SearchLib_googleRelease.f96218d;
        Intrinsics.checkNotNullExpressionValue(groupLaunched, "groupLaunched");
        C27046k.m66700o(groupLaunched);
        Group groupNewcoin = binding$SearchLib_googleRelease.f96219e;
        Intrinsics.checkNotNullExpressionValue(groupNewcoin, "groupNewcoin");
        C27046k.m66700o(groupNewcoin);
        Group groupComingsoon = binding$SearchLib_googleRelease.f96216b;
        Intrinsics.checkNotNullExpressionValue(groupComingsoon, "groupComingsoon");
        C27046k.m66700o(groupComingsoon);
        Group groupCountdown = binding$SearchLib_googleRelease.f96217c;
        Intrinsics.checkNotNullExpressionValue(groupCountdown, "groupCountdown");
        C27046k.m66685H(groupCountdown);
        ConstraintLayout layoutContent = binding$SearchLib_googleRelease.f96222h;
        Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
        C27046k.m66710y(layoutContent, 1000L, new Function0() { // from class: com.kubi.search.searchinitial.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59161y(searchRealtimeEntity, searchRealtimeView);
            }
        });
        int iM66653m = (int) (C27039d.m66653m(searchRealtimeEntity.getCountdownTime(), 0L) / ((long) 1000));
        if (iM66653m > 0) {
            InterfaceC41775x1 interfaceC41775x1 = searchRealtimeView.f48888e;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            searchRealtimeView.f48888e = C41636g.m90891O(C41636g.m90896T(C41636g.m90917h(C41636g.m90890N(C41636g.m90887K(new SearchRealtimeView$showCountdown$1$2(iM66653m, null)), C42911a.m94120b()), new SearchRealtimeView$showCountdown$1$3(null)), new SearchRealtimeView$showCountdown$1$4(searchRealtimeView, binding$SearchLib_googleRelease, null)), lifecycleCoroutineScope);
        } else {
            binding$SearchLib_googleRelease.f96224j.setText("--");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final void m59162C(final SearchRealtimeEntity searchRealtimeEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59139D(this.f48933b, searchRealtimeEntity);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m59163F(SearchRealtimeEntity searchRealtimeEntity) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trade_pair", searchRealtimeEntity.getSymbol());
        jSONObject.put("contentType", C27041f.m66668h(searchRealtimeEntity.getSpotTag()));
        jSONObject.put("clickPosition", C33556b3.f68963J);
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B1SearchOrSearchResultPage", "realTopSearch", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m59164G(@NotNull final WsMarketSnapshotEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59141H(this.f48903b, entity);
            }
        });
    }

    @Nullable
    public final C43590j getBinding$SearchLib_googleRelease() {
        return (C43590j) this.f48885b.getValue(this, f48884f[0]);
    }

    /* JADX INFO: renamed from: n */
    public final void m59165n(@NotNull LifecycleCoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.f48886c = lifecycleScope;
    }

    /* JADX INFO: renamed from: o */
    public final void m59166o(final TopSearchEntityWrap topSearchEntityWrap) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59155p(this.f48931b, topSearchEntityWrap);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m59167r(@NotNull final TopSearchEntityWrap entityWrap) {
        Intrinsics.checkNotNullParameter(entityWrap, "entityWrap");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59157s(entityWrap, this);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m59168t(final SearchRealtimeEntity searchRealtimeEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59158u(this.f48929b, searchRealtimeEntity);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m59169w(final SearchRealtimeEntity searchRealtimeEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59160x(this.f48935b, searchRealtimeEntity);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m59170z(final SearchRealtimeEntity searchRealtimeEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59137A(this.f48911b, searchRealtimeEntity);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m59137A(final SearchRealtimeView searchRealtimeView, final SearchRealtimeEntity searchRealtimeEntity) {
        Double dValueOf;
        String strM59537s;
        C43590j binding$SearchLib_googleRelease = searchRealtimeView.getBinding$SearchLib_googleRelease();
        if (binding$SearchLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        Group groupNewcoin = binding$SearchLib_googleRelease.f96219e;
        Intrinsics.checkNotNullExpressionValue(groupNewcoin, "groupNewcoin");
        C27046k.m66700o(groupNewcoin);
        Group groupCountdown = binding$SearchLib_googleRelease.f96217c;
        Intrinsics.checkNotNullExpressionValue(groupCountdown, "groupCountdown");
        C27046k.m66700o(groupCountdown);
        Group groupComingsoon = binding$SearchLib_googleRelease.f96216b;
        Intrinsics.checkNotNullExpressionValue(groupComingsoon, "groupComingsoon");
        C27046k.m66700o(groupComingsoon);
        Group groupLaunched = binding$SearchLib_googleRelease.f96218d;
        Intrinsics.checkNotNullExpressionValue(groupLaunched, "groupLaunched");
        C27046k.m66685H(groupLaunched);
        BaseTextView baseTextView = binding$SearchLib_googleRelease.f96226l;
        TradeItemBean tradeItem = searchRealtimeEntity.getTradeItem();
        if (tradeItem != null) {
            dValueOf = Double.valueOf(tradeItem.getLastDealPrice());
        } else {
            dValueOf = null;
        }
        baseTextView.setText(SearchExKt.m59535q(dValueOf, searchRealtimeEntity.getSymbol()));
        binding$SearchLib_googleRelease.f96227m.setText(searchRealtimeEntity.changeRate24hStr());
        BaseTextView baseTextView2 = binding$SearchLib_googleRelease.f96227m;
        Context context = searchRealtimeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        baseTextView2.setTextColor(C22890g.m54278c(context, searchRealtimeEntity.changeRate24h(), R$color.c_text40));
        BigDecimal bigDecimal = new BigDecimal(C27039d.m66652l(searchRealtimeEntity.getSearchCount()));
        BaseTextView baseTextView3 = binding$SearchLib_googleRelease.f96235u;
        if (C41014a.m89919D(bigDecimal)) {
            strM59537s = "--";
        } else {
            strM59537s = SearchExKt.m59537s(bigDecimal);
        }
        baseTextView3.setText(strM59537s);
        ConstraintLayout layoutContent = binding$SearchLib_googleRelease.f96222h;
        Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
        C27046k.m66710y(layoutContent, 1000L, new Function0() { // from class: com.kubi.search.searchinitial.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59138B(searchRealtimeEntity, searchRealtimeView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m59139D(final SearchRealtimeView searchRealtimeView, final SearchRealtimeEntity searchRealtimeEntity) {
        Double dValueOf;
        C43590j binding$SearchLib_googleRelease = searchRealtimeView.getBinding$SearchLib_googleRelease();
        if (binding$SearchLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        Group groupLaunched = binding$SearchLib_googleRelease.f96218d;
        Intrinsics.checkNotNullExpressionValue(groupLaunched, "groupLaunched");
        C27046k.m66700o(groupLaunched);
        Group groupCountdown = binding$SearchLib_googleRelease.f96217c;
        Intrinsics.checkNotNullExpressionValue(groupCountdown, "groupCountdown");
        C27046k.m66700o(groupCountdown);
        Group groupComingsoon = binding$SearchLib_googleRelease.f96216b;
        Intrinsics.checkNotNullExpressionValue(groupComingsoon, "groupComingsoon");
        C27046k.m66700o(groupComingsoon);
        Group groupNewcoin = binding$SearchLib_googleRelease.f96219e;
        Intrinsics.checkNotNullExpressionValue(groupNewcoin, "groupNewcoin");
        C27046k.m66685H(groupNewcoin);
        BaseTextView baseTextView = binding$SearchLib_googleRelease.f96229o;
        TradeItemBean tradeItem = searchRealtimeEntity.getTradeItem();
        if (tradeItem != null) {
            dValueOf = Double.valueOf(tradeItem.getLastDealPrice());
        } else {
            dValueOf = null;
        }
        baseTextView.setText(SearchExKt.m59535q(dValueOf, searchRealtimeEntity.getSymbol()));
        binding$SearchLib_googleRelease.f96230p.setText(SearchRealtimeEntity.changeRateSinceListStr$default(searchRealtimeEntity, null, 1, null));
        BaseTextView baseTextView2 = binding$SearchLib_googleRelease.f96230p;
        Context context = searchRealtimeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        baseTextView2.setTextColor(C22890g.m54278c(context, SearchRealtimeEntity.changeRateSinceList$default(searchRealtimeEntity, null, 1, null), R$color.c_text40));
        ConstraintLayout layoutContent = binding$SearchLib_googleRelease.f96222h;
        Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
        C27046k.m66710y(layoutContent, 1000L, new Function0() { // from class: com.kubi.search.searchinitial.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59140E(searchRealtimeEntity, searchRealtimeView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m59141H(SearchRealtimeView searchRealtimeView, WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        String strM92642g;
        C43590j binding$SearchLib_googleRelease = searchRealtimeView.getBinding$SearchLib_googleRelease();
        if (binding$SearchLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        SearchRealtimeEntity searchRealtimeEntity = searchRealtimeView.f48887d;
        if (searchRealtimeEntity == null) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(wsMarketSnapshotEntity.getSymbolCode(), searchRealtimeEntity.getSymbol())) {
            return Unit.INSTANCE;
        }
        double lastTradedPrice = wsMarketSnapshotEntity.getLastTradedPrice();
        Group groupNewcoin = binding$SearchLib_googleRelease.f96219e;
        Intrinsics.checkNotNullExpressionValue(groupNewcoin, "groupNewcoin");
        if (C27046k.m66704s(groupNewcoin)) {
            binding$SearchLib_googleRelease.f96229o.setText(SearchExKt.m59535q(Double.valueOf(lastTradedPrice), wsMarketSnapshotEntity.getSymbolCode()));
            binding$SearchLib_googleRelease.f96230p.setText(searchRealtimeEntity.changeRateSinceListStr(Double.valueOf(lastTradedPrice)));
            BaseTextView baseTextView = binding$SearchLib_googleRelease.f96230p;
            Context context = searchRealtimeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            baseTextView.setTextColor(C22890g.m54278c(context, searchRealtimeEntity.changeRateSinceList(Double.valueOf(lastTradedPrice)), R$color.c_text40));
        } else {
            Group groupLaunched = binding$SearchLib_googleRelease.f96218d;
            Intrinsics.checkNotNullExpressionValue(groupLaunched, "groupLaunched");
            if (C27046k.m66704s(groupLaunched)) {
                String strM93915p = null;
                TradeItemBean tradeItemBeanCovertToTradeItemBean$default = WsMarketSnapshotEntity.covertToTradeItemBean$default(wsMarketSnapshotEntity, null, 1, null);
                binding$SearchLib_googleRelease.f96226l.setText(SearchExKt.m59535q(Double.valueOf(lastTradedPrice), wsMarketSnapshotEntity.getSymbolCode()));
                BaseTextView baseTextView2 = binding$SearchLib_googleRelease.f96227m;
                Double changeRate = tradeItemBeanCovertToTradeItemBean$default.getChangeRate();
                if (changeRate != null) {
                    strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(changeRate.doubleValue())), null, null, 0, true, false, false, 23, null);
                } else {
                    strM92642g = null;
                }
                String strM93911l = C42828b.m93911l(strM92642g);
                if (strM93911l != null) {
                    strM93915p = C42828b.m93915p(strM93911l);
                }
                baseTextView2.setText(C27041f.m66668h(strM93915p));
                BaseTextView baseTextView3 = binding$SearchLib_googleRelease.f96227m;
                Context context2 = searchRealtimeView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                baseTextView3.setTextColor(C22890g.m54278c(context2, wsMarketSnapshotEntity.getChangeRate(), R$color.c_text40));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m59155p(SearchRealtimeView searchRealtimeView, TopSearchEntityWrap topSearchEntityWrap) throws JSONException {
        String topicUrl;
        C43590j binding$SearchLib_googleRelease = searchRealtimeView.getBinding$SearchLib_googleRelease();
        if (binding$SearchLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        final SearchTopicEntity entity = topSearchEntityWrap.getEntity();
        if (topSearchEntityWrap.getSameCoin()) {
            String topicTitle = null;
            if (entity != null) {
                topicUrl = entity.getTopicUrl();
            } else {
                topicUrl = null;
            }
            if (C27041f.m66668h(topicUrl).length() > 0) {
                binding$SearchLib_googleRelease.f96221g.setImageResource(R$mipmap.search_topsearch_bg_large);
                Group groupTopic = binding$SearchLib_googleRelease.f96220f;
                Intrinsics.checkNotNullExpressionValue(groupTopic, "groupTopic");
                C27046k.m66685H(groupTopic);
                BaseTextView baseTextView = binding$SearchLib_googleRelease.f96238x;
                if (entity != null) {
                    topicTitle = entity.getTopicTitle();
                }
                if (topicTitle == null) {
                    topicTitle = "";
                }
                baseTextView.setText(topicTitle);
                BaseTextView tvTopicTitle = binding$SearchLib_googleRelease.f96238x;
                Intrinsics.checkNotNullExpressionValue(tvTopicTitle, "tvTopicTitle");
                C27046k.m66710y(tvTopicTitle, 1000L, new Function0() { // from class: com.kubi.search.searchinitial.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchRealtimeView.m59156q(entity);
                    }
                });
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("messageId", "merge");
                Unit unit = Unit.INSTANCE;
                C27023a.m66557d("B1SearchOrSearchResultPage", "hotspot", null, jSONObject, 4, null);
                return Unit.INSTANCE;
            }
        }
        binding$SearchLib_googleRelease.f96221g.setImageResource(R$mipmap.search_topsearch_bg_small);
        Group groupTopic2 = binding$SearchLib_googleRelease.f96220f;
        Intrinsics.checkNotNullExpressionValue(groupTopic2, "groupTopic");
        C27046k.m66700o(groupTopic2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m59157s(TopSearchEntityWrap topSearchEntityWrap, SearchRealtimeView searchRealtimeView) throws JSONException {
        Integer numRealtimeType;
        TradePairNameTextView tradePairNameTextView;
        SearchRealtimeEntity realtimeEntity = topSearchEntityWrap.getRealtimeEntity();
        if (realtimeEntity != null) {
            numRealtimeType = realtimeEntity.realtimeType();
        } else {
            numRealtimeType = null;
        }
        if (realtimeEntity != null && numRealtimeType != null) {
            C27046k.m66685H(searchRealtimeView);
            searchRealtimeView.f48887d = realtimeEntity;
            C43590j binding$SearchLib_googleRelease = searchRealtimeView.getBinding$SearchLib_googleRelease();
            if (binding$SearchLib_googleRelease != null && (tradePairNameTextView = binding$SearchLib_googleRelease.f96239y) != null) {
                TradePairNameTextView.m54902f(tradePairNameTextView, R$font.bold, 20, 0, 4, null);
                TradePairNameTextView.m54905j(tradePairNameTextView, 0, 12, 0, 5, null);
                tradePairNameTextView.setQuoteCurrencyGravity(80);
                tradePairNameTextView.m54910l(realtimeEntity.baseCurrencyName(), realtimeEntity.quoteCurrencyName());
            }
            if (numRealtimeType.intValue() == 0) {
                searchRealtimeView.m59168t(realtimeEntity);
            } else if (numRealtimeType.intValue() == 1) {
                searchRealtimeView.m59169w(realtimeEntity);
            } else if (numRealtimeType.intValue() == 2) {
                searchRealtimeView.m59162C(realtimeEntity);
            } else if (numRealtimeType.intValue() == 3) {
                searchRealtimeView.m59170z(realtimeEntity);
            } else {
                C27046k.m66700o(searchRealtimeView);
            }
            searchRealtimeView.m59166o(topSearchEntityWrap);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trade_pair", realtimeEntity.getSymbol());
            jSONObject.put("contentType", C27041f.m66668h(realtimeEntity.getSpotTag()));
            jSONObject.put("clickPosition", C33556b3.f68963J);
            Unit unit = Unit.INSTANCE;
            C27023a.m66557d("B1SearchOrSearchResultPage", "realTopSearch", null, jSONObject, 4, null);
            return Unit.INSTANCE;
        }
        C27046k.m66700o(searchRealtimeView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m59158u(final SearchRealtimeView searchRealtimeView, final SearchRealtimeEntity searchRealtimeEntity) {
        C43590j binding$SearchLib_googleRelease = searchRealtimeView.getBinding$SearchLib_googleRelease();
        if (binding$SearchLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        Group groupLaunched = binding$SearchLib_googleRelease.f96218d;
        Intrinsics.checkNotNullExpressionValue(groupLaunched, "groupLaunched");
        C27046k.m66700o(groupLaunched);
        Group groupNewcoin = binding$SearchLib_googleRelease.f96219e;
        Intrinsics.checkNotNullExpressionValue(groupNewcoin, "groupNewcoin");
        C27046k.m66700o(groupNewcoin);
        Group groupCountdown = binding$SearchLib_googleRelease.f96217c;
        Intrinsics.checkNotNullExpressionValue(groupCountdown, "groupCountdown");
        C27046k.m66700o(groupCountdown);
        Group groupComingsoon = binding$SearchLib_googleRelease.f96216b;
        Intrinsics.checkNotNullExpressionValue(groupComingsoon, "groupComingsoon");
        C27046k.m66685H(groupComingsoon);
        ConstraintLayout layoutContent = binding$SearchLib_googleRelease.f96222h;
        Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
        C27046k.m66710y(layoutContent, 1000L, new Function0() { // from class: com.kubi.search.searchinitial.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRealtimeView.m59159v(searchRealtimeEntity, searchRealtimeView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m59159v(SearchRealtimeEntity searchRealtimeEntity, SearchRealtimeView searchRealtimeView) throws JSONException {
        if (C27025c.m66566d(searchRealtimeEntity.getPreviewEnableShow())) {
            ISpotService.m59982A(ISpotService.f49646a.get(), searchRealtimeEntity.getSymbol(), 2, null, null, 12, null);
        }
        searchRealtimeView.m59163F(searchRealtimeEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m59161y(SearchRealtimeEntity searchRealtimeEntity, SearchRealtimeView searchRealtimeView) throws JSONException {
        if (C27025c.m66566d(searchRealtimeEntity.getPreviewEnableShow())) {
            ISpotService.m59982A(ISpotService.f49646a.get(), searchRealtimeEntity.getSymbol(), 2, null, null, 12, null);
        }
        searchRealtimeView.m59163F(searchRealtimeEntity);
        return Unit.INSTANCE;
    }
}
