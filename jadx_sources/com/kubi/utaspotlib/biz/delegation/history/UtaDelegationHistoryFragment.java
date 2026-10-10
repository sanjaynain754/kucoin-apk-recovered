package com.kubi.utaspotlib.biz.delegation.history;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.core.biz.order.record.history.C12036c;
import com.kubi.core.biz.order.record.history.ChooseSymbolView;
import com.kubi.core.biz.order.record.history.CoreDelegationHistoryFilterViewHelper;
import com.kubi.core.biz.order.record.history.DelegationTradeAccount;
import com.kubi.core.biz.order.record.history.HistoryDelegationContract$Intent;
import com.kubi.core.biz.order.record.history.MixAccountHistoryDelegationVM;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.user.api.IUserService;
import com.kubi.utaspotlib.R$color;
import com.kubi.utaspotlib.R$drawable;
import com.kubi.utaspotlib.R$id;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utaspotlib.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660ud.FilterData;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
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
import q70.C43656c;
import qe0.C43724b;
import v30.C45413z;
import w00.C45681e;

/* JADX INFO: compiled from: UtaDelegationHistoryFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 p2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001pB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00108\u001a\u000209H\u0014J\b\u0010:\u001a\u000209H\u0014J\b\u0010;\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020\fH\u0016J\b\u0010=\u001a\u00020>H\u0016J\u001c\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010C\u001a\u00020>H\u0014J$\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020F0E2\u0006\u0010G\u001a\u0002092\u0006\u0010H\u001a\u000209H\u0014J\u001a\u0010I\u001a\u00020>2\u0006\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u00020>H\u0016J\u0018\u0010O\u001a\u00020>2\u0006\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u000209H\u0016J\"\u0010O\u001a\u00020>2\u0006\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u0002092\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010O\u001a\u00020>H\u0016J\b\u0010T\u001a\u00020>H\u0016J\b\u0010U\u001a\u00020VH\u0002J$\u0010W\u001a\u00020>2\b\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010\u00062\u0006\u0010[\u001a\u00020\u0006H\u0002J\b\u0010\\\u001a\u00020>H\u0002J\b\u0010]\u001a\u00020>H\u0002J\u0010\u0010^\u001a\u00020>2\u0006\u0010_\u001a\u00020`H\u0002J\b\u0010a\u001a\u00020>H\u0002J\b\u0010b\u001a\u00020>H\u0002J\b\u0010c\u001a\u00020>H\u0002J\b\u0010d\u001a\u00020\u0006H\u0002J\u0012\u0010e\u001a\u00020>2\b\u0010f\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010g\u001a\u00020>2\b\u0010h\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010i\u001a\u00020>2\b\u0010j\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010k\u001a\u00020>H\u0002J\f\u0010l\u001a\u00020>*\u00020YH\u0002J\f\u0010m\u001a\u00020>*\u00020YH\u0002J\b\u0010n\u001a\u00020\fH\u0014J\b\u0010o\u001a\u000209H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00102\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00104\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010/R\u0014\u00106\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010/¨\u0006q"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "<init>", "()V", "tradeType", "", "getTradeType", "()Ljava/lang/String;", "tradeType$delegate", "Lkotlin/Lazy;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "isUpGreen", "bizVm", "Lcom/kubi/core/biz/order/record/history/MixAccountHistoryDelegationVM;", "getBizVm", "()Lcom/kubi/core/biz/order/record/history/MixAccountHistoryDelegationVM;", "bizVm$delegate", "binding", "Lcom/kubi/utaspotlib/databinding/UtaDelegationHistoryFragmentBinding;", "getBinding", "()Lcom/kubi/utaspotlib/databinding/UtaDelegationHistoryFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "filterBinding", "Lcom/kubi/tradecorebiz/databinding/HistoryOrdersFilterToolbarLayoutBinding;", "getFilterBinding", "()Lcom/kubi/tradecorebiz/databinding/HistoryOrdersFilterToolbarLayoutBinding;", "filterBinding$delegate", "filterViewHelper", "Lcom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper;", "getFilterViewHelper", "()Lcom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper;", "filterViewHelper$delegate", "mAccountFilterPopup", "Lcom/zyyoona7/popup/EasyPopup;", "getMAccountFilterPopup", "()Lcom/zyyoona7/popup/EasyPopup;", "mPairPopup", "getMPairPopup", "mSidePopup", "getMSidePopup", "mTypePopup", "getMTypePopup", "mFilterPopup", "getMFilterPopup", "getLayout", "", "getItemLayout", "canLoad", "needAutoLoad", "onLoad", "", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "setHeader", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "showEmpty", "res1", "res2", "onClickListener", "Landroid/view/View$OnClickListener;", "showContent", "startCollectData", "Lkotlinx/coroutines/Job;", "setPopupTextAndColor", "bindingText", "Landroid/widget/TextView;", "text", "defaultText", "initFilterView", "initMixAccountFilterView", "updateAccountFilterText", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "onPairClick", "onSideClick", "onTypeClick", "getOrderTypeArgsCompat", "updatePairTextColor", "pair", "updateSideTextColor", "side", "updateTypeTextColor", "type", "onTimeAndStatusClick", "aroundIconAndTintColor", "defaultAroundIconAndTintColor", "needDefaultBackground", "getEndFooterText", "Companion", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtaDelegationHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaDelegationHistoryFragment.kt\ncom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,508:1\n1#2:509\n106#3,15:510\n147#4,16:525\n*S KotlinDebug\n*F\n+ 1 UtaDelegationHistoryFragment.kt\ncom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryFragment\n*L\n65#1:510,15\n67#1:525,16\n*E\n"})
public final class UtaDelegationHistoryFragment extends BasePagingFragment<HistoryOrdersUiData$ItemEntity> {

    /* JADX INFO: renamed from: a0 */
    public boolean f54132a0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f54135d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC24293a f54136e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f54137f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f54138g0;

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f54130i0 = {Reflection.property1(new PropertyReference1Impl(UtaDelegationHistoryFragment.class, "binding", "getBinding()Lcom/kubi/utaspotlib/databinding/UtaDelegationHistoryFragmentBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f54129h0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f54131Z = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtaDelegationHistoryFragment.m66070J4(this.f54141b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f54133b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtaDelegationHistoryFragment.m66110y4(this.f54147b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    public final boolean f54134c0 = DayNightThemeManager.f28592a.m33189n();

    /* JADX INFO: compiled from: UtaDelegationHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryFragment$Companion;", "", "<init>", "()V", "DEFAULT_TIME_TYPE", "", "DEFAULT_FILTER_STATUS", "newInstance", "Lcom/kubi/utaspotlib/biz/delegation/history/UtaDelegationHistoryFragment;", "tradeType", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final UtaDelegationHistoryFragment newInstance(@NotNull String tradeType) {
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            UtaDelegationHistoryFragment utaDelegationHistoryFragment = new UtaDelegationHistoryFragment();
            utaDelegationHistoryFragment.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("tradeType", tradeType)));
            return utaDelegationHistoryFragment;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m66087X3(UtaDelegationHistoryFragment utaDelegationHistoryFragment, List list) {
        String f44545b = ((FilterType.InterfaceC23033b) list.get(0)).getF44545b();
        String f44545b2 = ((FilterType.InterfaceC23033b) list.get(1)).getF44545b();
        if (Intrinsics.areEqual(f44545b2, "ALL")) {
            f44545b2 = "";
        }
        utaDelegationHistoryFragment.m66115k4().m22244r(new HistoryDelegationContract$Intent.UpdateRequestArgs(FilterData.m99818b(utaDelegationHistoryFragment.m66115k4().m22240n().getFilterData(), null, null, f44545b, null, f44545b2, null, 43, null)));
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

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int res1, int res2) {
        super.showEmpty(res1, res2);
        WrapperLoadingView wrapperLoadingViewM66100n4 = m66100n4();
        if (wrapperLoadingViewM66100n4 != null) {
            wrapperLoadingViewM66100n4.showEmpty(res1, res2, (View.OnClickListener) null);
        }
    }

    /* JADX INFO: renamed from: H4 */
    private final void m66066H4(TextView textView, String str, String str2) {
        if (str != null) {
            Context context = this.mContext;
            if (!Intrinsics.areEqual(str, context != null ? context.getString(R$string.all) : null)) {
                if (textView != null) {
                    textView.setText(str);
                }
                if (textView != null) {
                    Context mContext = this.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    textView.setTextColor(C27046k.m66699n(mContext, R$color.brandGreen));
                    return;
                }
                return;
            }
        }
        if (textView != null) {
            textView.setText(str2);
        }
        if (textView != null) {
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            textView.setTextColor(C27046k.m66699n(mContext2, R$color.c_text40));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m66086W3(UtaDelegationHistoryFragment utaDelegationHistoryFragment, FilterType.C23032a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        utaDelegationHistoryFragment.m66115k4().m22244r(new HistoryDelegationContract$Intent.ChangeDelegationTradeAccount(C12036c.m22245a(it.getF44545b())));
        Context context = utaDelegationHistoryFragment.mContext;
        utaDelegationHistoryFragment.m66077N4(context != null ? context.getString(R$string.type) : null);
        utaDelegationHistoryFragment.m66115k4().m22244r(new HistoryDelegationContract$Intent.UpdateRequestArgs(FilterData.m99818b(utaDelegationHistoryFragment.m66115k4().m22240n().getFilterData(), null, null, null, null, null, "", 31, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m66088Y3(UtaDelegationHistoryFragment utaDelegationHistoryFragment, ChooseSymbolView.FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getName();
        Context context = utaDelegationHistoryFragment.mContext;
        String code = !Intrinsics.areEqual(name, context != null ? context.getString(R$string.all) : null) ? it.getCode() : "";
        utaDelegationHistoryFragment.m66073L4(it.getName());
        utaDelegationHistoryFragment.m66115k4().m22244r(new HistoryDelegationContract$Intent.UpdateRequestArgs(FilterData.m99818b(utaDelegationHistoryFragment.m66115k4().m22240n().getFilterData(), code, null, null, null, null, null, 62, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m66089Z3(UtaDelegationHistoryFragment utaDelegationHistoryFragment, FilterType.C23032a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String f44545b = it.getF44545b();
        utaDelegationHistoryFragment.m66075M4(it.getF44544a());
        utaDelegationHistoryFragment.m66115k4().m22244r(new HistoryDelegationContract$Intent.UpdateRequestArgs(FilterData.m99818b(utaDelegationHistoryFragment.m66115k4().m22240n().getFilterData(), null, null, null, f44545b, null, null, 55, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m66090a4(UtaDelegationHistoryFragment utaDelegationHistoryFragment, FilterType.C23032a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String f44545b = it.getF44545b();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = f44545b.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        utaDelegationHistoryFragment.m66077N4(it.getF44544a());
        utaDelegationHistoryFragment.m66115k4().m22244r(new HistoryDelegationContract$Intent.UpdateRequestArgs(FilterData.m99818b(utaDelegationHistoryFragment.m66115k4().m22240n().getFilterData(), null, null, null, null, null, lowerCase, 31, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    private final void m66093d4(TextView textView) {
        C27046k.m66694i(textView, R$drawable.ic_triangle_top_12, C5275i0.m6236a(5.0f), 0, 4, null);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C27046k.m66702q(textView, C27046k.m66699n(context, R$color.brandGreen));
        textView.setTextColor(getColorRes(R$color.primary));
    }

    /* JADX INFO: renamed from: g4 */
    private final void m66095g4(TextView textView) {
        C27046k.m66694i(textView, com.kubi.tradecorebiz.R$drawable.ic_triangle_bottom_12, C5275i0.m6236a(5.0f), 0, 4, null);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C27046k.m66702q(textView, C27046k.m66699n(context, com.kubi.tradecorebiz.R$color.c_icon60));
        textView.setTextColor(getColorRes(R$color.c_text40));
    }

    /* JADX INFO: renamed from: i4 */
    public static final CoreDelegationHistoryFilterViewHelper m66097i4() {
        return new CoreDelegationHistoryFilterViewHelper();
    }

    /* JADX INFO: renamed from: l4 */
    private final C45413z m66098l4() {
        return (C45413z) this.f54137f0.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    private final CoreDelegationHistoryFilterViewHelper m66099m4() {
        return (CoreDelegationHistoryFilterViewHelper) this.f54138g0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    private final WrapperLoadingView m66100n4() {
        return (WrapperLoadingView) this.f54133b0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    private final String m66106u4() {
        return (String) this.f54131Z.getValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final void m66112K4(DelegationTradeAccount delegationTradeAccount) {
        String strM66516f;
        if (Intrinsics.areEqual(delegationTradeAccount, DelegationTradeAccount.b.f20621a)) {
            strM66516f = C27017c.f54310a.m66516f(R$string.uta_account_uta, new Object[0]);
        } else {
            if (!Intrinsics.areEqual(delegationTradeAccount, DelegationTradeAccount.a.f20619a)) {
                throw new NoWhenBranchMatchedException();
            }
            strM66516f = C27017c.f54310a.m66516f(R$string.uta_account_spot, new Object[0]);
        }
        C45413z c45413zM66098l4 = m66098l4();
        m66066H4(c45413zM66098l4 != null ? c45413zM66098l4.f102425f : null, strM66516f, delegationTradeAccount.getName());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: e4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        if (baseViewHolder == null || historyOrdersUiData$ItemEntity == null) {
            return;
        }
        new UtaSpotDelegationHistoryNormalItemViewCore(m66106u4()).m99817c(baseViewHolder, historyOrdersUiData$ItemEntity, this.f54134c0, this);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.uta_delegation_history_fragment;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF54132a0() {
        return this.f54132a0;
    }

    /* JADX INFO: renamed from: j4 */
    public final C43656c m66114j4() {
        return (C43656c) this.f54136e0.getValue(this, f54130i0[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final MixAccountHistoryDelegationVM m66115k4() {
        return (MixAccountHistoryDelegationVM) this.f54135d0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WrapperLoadingView wrapperLoadingViewM66100n4 = m66100n4();
        if (wrapperLoadingViewM66100n4 != null) {
            LoadingViewUtils.f48255a.m58510c(wrapperLoadingViewM66100n4);
        }
        C43656c c43656cM66114j4 = m66114j4();
        if (c43656cM66114j4 != null && (swipeRefreshRecyclerView = c43656cM66114j4.f96360d) != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
        }
        m66068I4();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return IUserService.a.get().c();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f54132a0 = z11;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.delegation_no_more_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.trade_core_item_delegation_view;
    }

    public UtaDelegationHistoryFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationHistoryFragment.m66094f4(this.f54148b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f54135d0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MixAccountHistoryDelegationVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f54136e0 = C45681e.m100799e(this, new Function1<UtaDelegationHistoryFragment, C43656c>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43656c invoke(@NotNull UtaDelegationHistoryFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C43656c.m96072a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C43656c, Unit>() { // from class: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C43656c it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43656c c43656c) {
                invoke(c43656c);
                return Unit.INSTANCE;
            }
        });
        this.f54137f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationHistoryFragment.m66096h4(this.f54149b);
            }
        });
        this.f54138g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UtaDelegationHistoryFragment.m66097i4();
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m66058A4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM66098l4 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l4 != null && (baseTextView = c45413zM66098l4.f102423d) != null) {
            utaDelegationHistoryFragment.m66093d4(baseTextView);
        }
        C43724b c43724bM66103q4 = utaDelegationHistoryFragment.m66103q4();
        C45413z c45413zM66098l5 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l5 != null) {
            relativeLayout = c45413zM66098l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM66103q4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    private final void m66059B4() {
        BaseTextView baseTextView;
        String string;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        CharSequence text;
        BaseTextView baseTextView4;
        if (m66115k4().m22240n().getFilterData().getSide().length() > 0) {
            C45413z c45413zM66098l4 = m66098l4();
            if (c45413zM66098l4 != null && (baseTextView4 = c45413zM66098l4.f102424e) != null) {
                baseTextView4.setText(m66099m4().m22214F().get(m66115k4().m22240n().getFilterData().getSide()));
            }
            C45413z c45413zM66098l5 = m66098l4();
            if (c45413zM66098l5 != null && (baseTextView3 = c45413zM66098l5.f102424e) != null && (text = baseTextView3.getText()) != null) {
                string = text.toString();
            } else {
                string = null;
            }
            m66075M4(string);
            C45413z c45413zM66098l6 = m66098l4();
            if (c45413zM66098l6 != null && (baseTextView2 = c45413zM66098l6.f102424e) != null) {
                m66095g4(baseTextView2);
            }
        }
        C45413z c45413zM66098l7 = m66098l4();
        if (c45413zM66098l7 != null && (baseTextView = c45413zM66098l7.f102424e) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaDelegationHistoryFragment.m66060C4(this.f54152b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m66060C4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM66098l4 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l4 != null && (baseTextView = c45413zM66098l4.f102424e) != null) {
            utaDelegationHistoryFragment.m66093d4(baseTextView);
        }
        C43724b c43724bM66104r4 = utaDelegationHistoryFragment.m66104r4();
        C45413z c45413zM66098l5 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l5 != null) {
            relativeLayout = c45413zM66098l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM66104r4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    private final void m66061D4() {
        C45413z c45413zM66098l4;
        ImageView imageView;
        ImageView imageView2;
        if ((!Intrinsics.areEqual(m66115k4().m22240n().getFilterData().getTimeType(), "THREE_MONTH") || !Intrinsics.areEqual(m66115k4().m22240n().getFilterData().getFilterStatus(), "")) && (c45413zM66098l4 = m66098l4()) != null && (imageView = c45413zM66098l4.f102421b) != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            C27046k.m66701p(imageView, C27046k.m66699n(mContext, R$color.brandGreen));
        }
        C45413z c45413zM66098l5 = m66098l4();
        if (c45413zM66098l5 != null && (imageView2 = c45413zM66098l5.f102421b) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaDelegationHistoryFragment.m66062E4(this.f54154b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m66062E4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        RelativeLayout relativeLayout;
        ImageView imageView;
        C45413z c45413zM66098l4 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l4 != null && (imageView = c45413zM66098l4.f102421b) != null) {
            Context mContext = utaDelegationHistoryFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            C27046k.m66701p(imageView, C27046k.m66699n(mContext, R$color.brandGreen));
        }
        C43724b c43724bM66102p4 = utaDelegationHistoryFragment.m66102p4();
        C45413z c45413zM66098l5 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l5 != null) {
            relativeLayout = c45413zM66098l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM66102p4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    private final void m66063F4() {
        BaseTextView baseTextView;
        String string;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        CharSequence text;
        BaseTextView baseTextView4;
        if (m66115k4().m22240n().getFilterData().getOrderType().length() > 0) {
            C45413z c45413zM66098l4 = m66098l4();
            if (c45413zM66098l4 != null && (baseTextView4 = c45413zM66098l4.f102426g) != null) {
                baseTextView4.setText(m66116t4());
            }
            C45413z c45413zM66098l5 = m66098l4();
            if (c45413zM66098l5 != null && (baseTextView3 = c45413zM66098l5.f102426g) != null && (text = baseTextView3.getText()) != null) {
                string = text.toString();
            } else {
                string = null;
            }
            m66077N4(string);
            C45413z c45413zM66098l6 = m66098l4();
            if (c45413zM66098l6 != null && (baseTextView2 = c45413zM66098l6.f102426g) != null) {
                m66095g4(baseTextView2);
            }
        }
        C45413z c45413zM66098l7 = m66098l4();
        if (c45413zM66098l7 != null && (baseTextView = c45413zM66098l7.f102426g) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaDelegationHistoryFragment.m66064G4(this.f54150b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m66064G4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM66098l4 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l4 != null && (baseTextView = c45413zM66098l4.f102426g) != null) {
            utaDelegationHistoryFragment.m66093d4(baseTextView);
        }
        C43724b c43724bM66105s4 = utaDelegationHistoryFragment.m66105s4();
        C45413z c45413zM66098l5 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l5 != null) {
            relativeLayout = c45413zM66098l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM66105s4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    private final InterfaceC41775x1 m66068I4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UtaDelegationHistoryFragment$startCollectData$1(this, null));
    }

    /* JADX INFO: renamed from: J4 */
    public static final String m66070J4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        String string;
        Bundle arguments = utaDelegationHistoryFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tradeType");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "TRADE");
    }

    /* JADX INFO: renamed from: L4 */
    private final void m66073L4(String str) {
        BaseTextView baseTextView;
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            baseTextView = c45413zM66098l4.f102423d;
        } else {
            baseTextView = null;
        }
        String string = this.mContext.getString(R$string.trade_pair);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m66066H4(baseTextView, str, string);
    }

    /* JADX INFO: renamed from: M4 */
    private final void m66075M4(String str) {
        BaseTextView baseTextView;
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            baseTextView = c45413zM66098l4.f102424e;
        } else {
            baseTextView = null;
        }
        String string = this.mContext.getString(R$string.direction);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m66066H4(baseTextView, str, string);
    }

    /* JADX INFO: renamed from: N4 */
    private final void m66077N4(String str) {
        BaseTextView baseTextView;
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            baseTextView = c45413zM66098l4.f102426g;
        } else {
            baseTextView = null;
        }
        String string = this.mContext.getString(R$string.type);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m66066H4(baseTextView, str, string);
    }

    /* JADX INFO: renamed from: f4 */
    public static final ViewModelStoreOwner m66094f4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        Fragment fragmentRequireParentFragment = utaDelegationHistoryFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: h4 */
    public static final C45413z m66096h4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        C45413z c45413z;
        C43656c c43656cM66114j4 = utaDelegationHistoryFragment.m66114j4();
        if (c43656cM66114j4 != null && (c45413z = c43656cM66114j4.f96361e) != null) {
            return C45413z.m100363a(c45413z.getRoot());
        }
        return null;
    }

    /* JADX INFO: renamed from: o4 */
    private final C43724b m66101o4() {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM66099m4 = m66099m4();
        FragmentActivity activity = getActivity();
        DelegationTradeAccount account = m66115k4().m22240n().getAccount();
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            baseTextView = c45413zM66098l4.f102425f;
        } else {
            baseTextView = null;
        }
        return coreDelegationHistoryFilterViewHelperM66099m4.m22218L(activity, account, baseTextView, new Function1() { // from class: com.kubi.utaspotlib.biz.delegation.history.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtaDelegationHistoryFragment.m66086W3(this.f54146b, (FilterType.C23032a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    private final C43724b m66102p4() {
        ImageView imageView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM66099m4 = m66099m4();
        FragmentActivity activity = getActivity();
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            imageView = c45413zM66098l4.f102421b;
        } else {
            imageView = null;
        }
        return coreDelegationHistoryFilterViewHelperM66099m4.m22226u(activity, imageView, m66115k4().m22240n().getFilterData().getTimeType(), m66115k4().m22240n().getFilterData().getFilterStatus(), m66115k4().m22240n().getAccount(), new Consumer() { // from class: com.kubi.utaspotlib.biz.delegation.history.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UtaDelegationHistoryFragment.m66087X3(this.f54145b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    private final C43724b m66103q4() {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM66099m4 = m66099m4();
        FragmentActivity activity = getActivity();
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            baseTextView = c45413zM66098l4.f102423d;
        } else {
            baseTextView = null;
        }
        return coreDelegationHistoryFilterViewHelperM66099m4.m22212A(activity, baseTextView, m66106u4(), m66115k4().m22240n().getFilterData().getSymbol(), new Function1() { // from class: com.kubi.utaspotlib.biz.delegation.history.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtaDelegationHistoryFragment.m66088Y3(this.f54143b, (ChooseSymbolView.FilterChooseData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    private final C43724b m66104r4() {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM66099m4 = m66099m4();
        FragmentActivity activity = getActivity();
        String side = m66115k4().m22240n().getFilterData().getSide();
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            baseTextView = c45413zM66098l4.f102424e;
        } else {
            baseTextView = null;
        }
        return coreDelegationHistoryFilterViewHelperM66099m4.m22215G(activity, side, baseTextView, new Function1() { // from class: com.kubi.utaspotlib.biz.delegation.history.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtaDelegationHistoryFragment.m66089Z3(this.f54144b, (FilterType.C23032a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    private final C43724b m66105s4() {
        BaseTextView baseTextView;
        CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelperM66099m4 = m66099m4();
        FragmentActivity activity = getActivity();
        DelegationTradeAccount account = m66115k4().m22240n().getAccount();
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null) {
            baseTextView = c45413zM66098l4.f102426g;
        } else {
            baseTextView = null;
        }
        return coreDelegationHistoryFilterViewHelperM66099m4.m22219O(activity, account, baseTextView, m66115k4().m22240n().getFilterData().getOrderType(), new Function1() { // from class: com.kubi.utaspotlib.biz.delegation.history.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtaDelegationHistoryFragment.m66090a4(this.f54142b, (FilterType.C23032a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    private final void m66107v4() {
        RelativeLayout relativeLayout;
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null && (relativeLayout = c45413zM66098l4.f102422c) != null) {
            ViewExtKt.m66594y(relativeLayout);
        }
        this.f46495W.addHeaderView(new View(getContext()));
        LinearLayout headerLayout = this.f46495W.getHeaderLayout();
        int i11 = R$id.rc_hide_divider;
        Boolean bool = Boolean.TRUE;
        headerLayout.setTag(i11, bool);
        this.f46495W.addFooterView(new View(getContext()));
        this.f46495W.removeAllFooterView();
        this.f46495W.getFooterLayout().setTag(i11, bool);
        m66111z4();
        m66059B4();
        m66063F4();
        m66061D4();
        m66108w4();
    }

    /* JADX INFO: renamed from: w4 */
    private final void m66108w4() {
        BaseTextView baseTextView;
        ImageView imageView;
        View view;
        BaseTextView baseTextView2;
        m66112K4(m66115k4().m22240n().getAccount());
        C45413z c45413zM66098l4 = m66098l4();
        if (c45413zM66098l4 != null && (baseTextView2 = c45413zM66098l4.f102425f) != null) {
            ViewExtKt.m66594y(baseTextView2);
        }
        C45413z c45413zM66098l5 = m66098l4();
        if (c45413zM66098l5 != null && (view = c45413zM66098l5.f102427h) != null) {
            ViewExtKt.m66594y(view);
        }
        C45413z c45413zM66098l6 = m66098l4();
        if (c45413zM66098l6 != null && (imageView = c45413zM66098l6.f102421b) != null) {
            ViewExtKt.m66594y(imageView);
        }
        C45413z c45413zM66098l7 = m66098l4();
        if (c45413zM66098l7 != null && (baseTextView = c45413zM66098l7.f102425f) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaDelegationHistoryFragment.m66109x4(this.f54151b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m66109x4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        RelativeLayout relativeLayout;
        BaseTextView baseTextView;
        C45413z c45413zM66098l4 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l4 != null && (baseTextView = c45413zM66098l4.f102425f) != null) {
            utaDelegationHistoryFragment.m66093d4(baseTextView);
        }
        C43724b c43724bM66101o4 = utaDelegationHistoryFragment.m66101o4();
        C45413z c45413zM66098l5 = utaDelegationHistoryFragment.m66098l4();
        if (c45413zM66098l5 != null) {
            relativeLayout = c45413zM66098l5.f102422c;
        } else {
            relativeLayout = null;
        }
        c43724bM66101o4.mo54253b0(relativeLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final WrapperLoadingView m66110y4(UtaDelegationHistoryFragment utaDelegationHistoryFragment) {
        FrameLayout frameLayout;
        C43656c c43656cM66114j4 = utaDelegationHistoryFragment.m66114j4();
        if (c43656cM66114j4 != null) {
            frameLayout = c43656cM66114j4.f96358b;
        } else {
            frameLayout = null;
        }
        return WrapperLoadingView.injectView(frameLayout);
    }

    /* JADX INFO: renamed from: z4 */
    private final void m66111z4() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        CharSequence text;
        BaseTextView baseTextView4;
        String showSymbol;
        if (m66115k4().m22240n().getFilterData().getSymbol().length() > 0) {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(m66115k4().m22240n().getFilterData().getSymbol());
            C45413z c45413zM66098l4 = m66098l4();
            String string = null;
            if (c45413zM66098l4 != null && (baseTextView4 = c45413zM66098l4.f102423d) != null) {
                if (symbolInfoEntityM85601B != null) {
                    showSymbol = symbolInfoEntityM85601B.getShowSymbol();
                } else {
                    showSymbol = null;
                }
                baseTextView4.setText(C27041f.m66669i(showSymbol, StringsKt.replace$default(m66115k4().m22240n().getFilterData().getSymbol(), C33820nf.f71144W, "/", false, 4, (Object) null)));
            }
            C45413z c45413zM66098l5 = m66098l4();
            if (c45413zM66098l5 != null && (baseTextView3 = c45413zM66098l5.f102423d) != null && (text = baseTextView3.getText()) != null) {
                string = text.toString();
            }
            m66073L4(string);
            C45413z c45413zM66098l6 = m66098l4();
            if (c45413zM66098l6 != null && (baseTextView2 = c45413zM66098l6.f102423d) != null) {
                m66095g4(baseTextView2);
            }
        }
        C45413z c45413zM66098l7 = m66098l4();
        if (c45413zM66098l7 != null && (baseTextView = c45413zM66098l7.f102423d) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.utaspotlib.biz.delegation.history.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaDelegationHistoryFragment.m66058A4(this.f54153b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
        m66107v4();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<HistoryOrdersUiData$ItemEntity>> mo16440r3(int i11, int i12) {
        return m66115k4().m22239d(i11, i12, m66106u4());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        WrapperLoadingView wrapperLoadingViewM66100n4 = m66100n4();
        if (wrapperLoadingViewM66100n4 != null) {
            wrapperLoadingViewM66100n4.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int res1, int res2, @Nullable View.OnClickListener onClickListener) {
        super.showEmpty(res1, res2, onClickListener);
        WrapperLoadingView wrapperLoadingViewM66100n4 = m66100n4();
        if (wrapperLoadingViewM66100n4 != null) {
            wrapperLoadingViewM66100n4.showEmpty(res1, res2, onClickListener);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        super.showLoading();
        WrapperLoadingView wrapperLoadingViewM66100n4 = m66100n4();
        if (wrapperLoadingViewM66100n4 != null) {
            wrapperLoadingViewM66100n4.showLoading();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final String m66116t4() {
        String orderType = m66115k4().m22240n().getFilterData().getOrderType();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = orderType.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String str = m66099m4().m22228z(DelegationTradeAccount.b.f20621a).get(upperCase);
        if (str != null && str.length() != 0) {
            return str;
        }
        m66115k4().m22244r(new HistoryDelegationContract$Intent.UpdateRequestArgs(FilterData.m99818b(m66115k4().m22240n().getFilterData(), null, null, null, null, null, "", 31, null)));
        String string = this.mContext.getString(R$string.type);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        super.showEmpty();
        WrapperLoadingView wrapperLoadingViewM66100n4 = m66100n4();
        if (wrapperLoadingViewM66100n4 != null) {
            wrapperLoadingViewM66100n4.showEmpty(R$string.no_order, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }
}
