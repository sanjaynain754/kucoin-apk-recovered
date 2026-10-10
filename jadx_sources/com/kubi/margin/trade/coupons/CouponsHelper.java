package com.kubi.margin.trade.coupons;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p768xo.InterfaceC46300a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CouponsHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0017J,\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/margin/trade/coupons/CouponsHelper;", "", "<init>", "()V", "api", "Lcom/kubi/margin/api/CouponApi;", "getApi", "()Lcom/kubi/margin/api/CouponApi;", "api$delegate", "Lkotlin/Lazy;", "couponsCache", "Ljava/util/HashMap;", "", "Lcom/kubi/margin/api/entity/CouponsOverview;", "Lkotlin/collections/HashMap;", "requestCouponsData", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", FirebaseAnalytics.Param.CURRENCY, "positionType", "symbol", "callBack", "Lio/reactivex/functions/Consumer;", "showCouponsDialog", "positionTag", "showAllCouponsDialog", "data", "", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CouponsHelper f33730a = new CouponsHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f33731b = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.coupons.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CouponsHelper.m40022f();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<String, CouponsOverview> f33732c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC46300a m40022f() {
        return (InterfaceC46300a) RetrofitFlowExKt.m42820a(InterfaceC46300a.class);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m40023j(List list, BaseFragment baseFragment, BaseViewHolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((RecyclerView) it.getView(R$id.recycler_view)).setAdapter(new CouponsHelper$showAllCouponsDialog$1$1(list, baseFragment, R$layout.item_margin_coupons_list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC46300a m40024g() {
        return (InterfaceC46300a) f33731b.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m40025h(@NotNull BaseFragment fragment, @Nullable String str, @NotNull String positionType, @Nullable String str2, @NotNull Consumer<CouponsOverview> callBack) throws Exception {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        callBack.accept(f33732c.get(str + positionType + str2));
        LifecycleOwnerKt.getLifecycleScope(fragment).launchWhenStarted(new CouponsHelper$requestCouponsData$1(positionType, str2, str, callBack, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m40026i(final BaseFragment baseFragment, final List<MarginCouponConfig> list) {
        DialogFragmentHelper dialogFragmentHelperM54238g4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.dialog_margin_coupons_list, true).m54238g4(new Function1() { // from class: com.kubi.margin.trade.coupons.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CouponsHelper.m40023j(list, baseFragment, (BaseViewHolder) obj);
            }
        });
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54238g4.show(childFragmentManager, "showAllCouponsDialog");
    }

    /* JADX INFO: renamed from: k */
    public final void m40027k(@NotNull BaseFragment fragment, @Nullable String str, @NotNull String positionType, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        LifecycleOwnerKt.getLifecycleScope(fragment).launchWhenStarted(new CouponsHelper$showCouponsDialog$1(fragment, positionType, str2, str, null));
    }
}
