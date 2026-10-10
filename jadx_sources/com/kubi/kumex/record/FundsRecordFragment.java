package com.kubi.kumex.record;

import am.HistoryFundsParams;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.kumex.record.filter.AssetFilterHelper;
import com.kubi.kumex.record.filter.IFilterDialogCallBack;
import com.kubi.kumex.record.filter.RecordFilterDialogFragment;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36754e2;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p595rg.InterfaceC44074b;
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
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: FundsRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0014J$\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020-0,2\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*H\u0014J\u0018\u00100\u001a\u00020#2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0002H\u0014J\b\u00104\u001a\u00020#H\u0002J\b\u00105\u001a\u00020#H\u0016J\"\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u00020#H\u0016J\b\u0010<\u001a\u00020*H\u0014J\b\u0010=\u001a\u00020>H\u0002J(\u0010?\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/kumex/record/FundsRecordFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "Lcom/kubi/kumex/record/filter/IFilterDialogCallBack;", "<init>", "()V", "bkumexFragmentFundsRecordBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentFundsRecordBinding;", "getBkumexFragmentFundsRecordBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFundsRecordBinding;", "bkumexFragmentFundsRecordBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "Lkotlin/Lazy;", "fundsType", "bizType", "sideType", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "timeType", "mLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshData", "onErrorCallBack", "throwable", "", "getItemLayout", "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "record", "initListener", "showLoading", "showEmpty", "res1", "res2", "onClickListener", "Landroid/view/View$OnClickListener;", "showContent", "getEndFooterText", "getStartTime", "", "filterCallBack", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nFundsRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FundsRecordFragment.kt\ncom/kubi/kumex/record/FundsRecordFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,214:1\n147#2,16:215\n*S KotlinDebug\n*F\n+ 1 FundsRecordFragment.kt\ncom/kubi/kumex/record/FundsRecordFragment\n*L\n54#1:215,16\n*E\n"})
public final class FundsRecordFragment extends BasePagingFragment<FundsRecordEntity> implements IFilterDialogCallBack {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f29901Z = C45681e.m100799e(this, new Function1<FundsRecordFragment, C36754e2>() { // from class: com.kubi.kumex.record.FundsRecordFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36754e2 invoke(@NotNull FundsRecordFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36754e2.m82359a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36754e2, Unit>() { // from class: com.kubi.kumex.record.FundsRecordFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36754e2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36754e2 c36754e2) {
            invoke(c36754e2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f29902a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FundsRecordFragment.m35190O3(this.f30369b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f29903b0 = "selfFunds";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f29904c0 = "";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public String f29905d0 = "";

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public TimeUtils.C27004b f29906e0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public String f29907f0 = "ONE_MONTH";

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public WrapperLoadingView f29908g0;

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f29900i0 = {Reflection.property1(new PropertyReference1Impl(FundsRecordFragment.class, "bkumexFragmentFundsRecordBinding", "getBkumexFragmentFundsRecordBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFundsRecordBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f29899h0 = new Companion(null);

    /* JADX INFO: compiled from: FundsRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/record/FundsRecordFragment$Companion;", "", "<init>", "()V", "SELF_FUNDS", "", "TRIAL_FUNDS", "newInstance", "Lcom/kubi/kumex/record/FundsRecordFragment;", "bundle", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FundsRecordFragment newInstance(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            FundsRecordFragment fundsRecordFragment = new FundsRecordFragment();
            fundsRecordFragment.setArguments(bundle);
            return fundsRecordFragment;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m35189N3(FundsRecordFragment fundsRecordFragment, FundsRecordEntity fundsRecordEntity) {
        IAssetsCenterService.f16464a.get().mo15338c(fundsRecordFragment.getContext(), fundsRecordEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    private final String m35191Q3() {
        return (String) this.f29902a0.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public static final BasePageEntity m35192R3(FundsRecordFragment fundsRecordFragment, int i11, int i12) {
        InterfaceC44074b interfaceC44074bM20272m = MultiBizFacadeManager.f19232a.m20272m(MultiBizType.CLASSIC);
        long jM35199S3 = fundsRecordFragment.m35199S3();
        String endTime = fundsRecordFragment.f29906e0.f54265b;
        Intrinsics.checkNotNullExpressionValue(endTime, "endTime");
        Long longOrNull = StringsKt.toLongOrNull(endTime);
        return interfaceC44074bM20272m.mo83054Q0(new HistoryFundsParams(fundsRecordFragment.f29905d0, fundsRecordFragment.f29904c0, fundsRecordFragment.f29903b0, fundsRecordFragment.m35191Q3(), i11, i12, jM35199S3, longOrNull));
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m35194U3(final FundsRecordFragment fundsRecordFragment, View it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        AssetFilterHelper.f30236a.m35748f(LifecycleOwnerKt.getLifecycleScope(fundsRecordFragment), fundsRecordFragment.f29903b0, new Action() { // from class: com.kubi.kumex.record.a0
            @Override // io.reactivex.functions.Action
            public final void run() {
                FundsRecordFragment.m35195V3(this.f29941b);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: D3 */
    public void mo35196D3(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        super.mo35196D3(throwable);
        C19331c.m42836c(throwable, null, 2, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f29906e0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: M3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final FundsRecordEntity record) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(record, "record");
        int iM54291p = Intrinsics.areEqual(record.getSide(), "IN") ? C22890g.m54291p(C27017c.f54310a.m66513b()) : C27017c.f54310a.m66512a(R$color.c_text);
        String formatAmount = record.getFormatAmount();
        String strM92633f = C42179a.m92633f(C27039d.m66652l(record.getTimestamp()), null, true, true, null, 9, null);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) itemView.findViewById(R$id.fundsTitle);
        String typeName = record.getTypeName();
        String type = record.getType();
        if (type == null) {
            type = "";
        }
        appCompatTextView.setText(C27041f.m66669i(typeName, type));
        ShowHideTextView showHideTextView = (ShowHideTextView) itemView.findViewById(R$id.fundsAmount);
        showHideTextView.setText(formatAmount);
        showHideTextView.setTextColor(iM54291p);
        ((ShowHideTextView) itemView.findViewById(R$id.fundsTime)).setText(strM92633f);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) itemView.findViewById(R$id.trialTag);
        Intrinsics.checkNotNull(appCompatTextView2);
        C27046k.m66684G(appCompatTextView2, Intrinsics.areEqual(this.f29903b0, "trialFunds"));
        appCompatTextView2.setText(C27092t0.m66896a(record.getPrizeType()));
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.kumex.record.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundsRecordFragment.m35189N3(this.f30372b, record);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: P3 */
    public final C36754e2 m35198P3() {
        return (C36754e2) this.f29901Z.getValue(this, f29900i0[0]);
    }

    /* JADX INFO: renamed from: S3 */
    public final long m35199S3() {
        String str = this.f29907f0;
        int iHashCode = str.hashCode();
        if (iHashCode == -1480287667) {
            if (str.equals("ONE_WEEK")) {
                return this.f29906e0.m66434a(7, 6);
            }
            return 0L;
        }
        if (iHashCode == 1314132820) {
            if (str.equals("HALF_MONTH")) {
                return this.f29906e0.m66434a(15, 6);
            }
            return 0L;
        }
        if (iHashCode == 1346794279 && str.equals("ONE_MONTH")) {
            return this.f29906e0.m66434a(30, 6);
        }
        return 0L;
    }

    @Override // com.kubi.kumex.record.filter.IFilterDialogCallBack
    /* JADX INFO: renamed from: j2 */
    public void mo35200j2(@NotNull String sideType, @NotNull String timeType, @NotNull String fundsType, @NotNull String bizType) {
        Intrinsics.checkNotNullParameter(sideType, "sideType");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        this.f29903b0 = fundsType;
        this.f29904c0 = bizType;
        this.f29907f0 = timeType;
        this.f29905d0 = sideType;
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_funds_record, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36754e2 c36754e2M35198P3 = m35198P3();
        this.f29908g0 = WrapperLoadingView.injectView(c36754e2M35198P3 != null ? c36754e2M35198P3.f79952b : null);
        m35193T3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<FundsRecordEntity>> mo16440r3(final int i11, final int i12) {
        Observable<BasePageEntity<FundsRecordEntity>> observableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.kumex.record.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundsRecordFragment.m35192R3(this.f29943b, i12, i11);
            }
        }).toObservable().subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int res1, int res2, @Nullable View.OnClickListener onClickListener) {
        WrapperLoadingView wrapperLoadingView = this.f29908g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(res1, res2, onClickListener);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        WrapperLoadingView wrapperLoadingView = this.f29908g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.coin_no_more_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bkumex_item_funds_record;
    }

    /* JADX INFO: renamed from: O3 */
    public static final String m35190O3(FundsRecordFragment fundsRecordFragment) {
        String strM56239b0;
        Bundle arguments = fundsRecordFragment.getArguments();
        if (arguments != null) {
            strM56239b0 = RouteExKt.m56239b0(arguments, "coin");
        } else {
            strM56239b0 = null;
        }
        return C27041f.m66668h(strM56239b0);
    }

    /* JADX INFO: renamed from: T3 */
    private final void m35193T3() throws Exception {
        C36754e2 c36754e2M35198P3 = m35198P3();
        if (c36754e2M35198P3 != null) {
            c36754e2M35198P3.f79953c.setText(getString(R$string.funds_record_stub, C27041f.m66677q(m35191Q3()) + ' '));
            ImageView type = c36754e2M35198P3.f79954d;
            Intrinsics.checkNotNullExpressionValue(type, "type");
            ViewExtKt.m66575f(type, new Function1() { // from class: com.kubi.kumex.record.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FundsRecordFragment.m35194U3(this.f30365b, (View) obj);
                }
            });
            AssetFilterHelper assetFilterHelper = AssetFilterHelper.f30236a;
            AssetFilterHelper.m35743g(assetFilterHelper, LifecycleOwnerKt.getLifecycleScope(this), "selfFunds", null, 4, null);
            AssetFilterHelper.m35743g(assetFilterHelper, LifecycleOwnerKt.getLifecycleScope(this), "trialFunds", null, 4, null);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m35195V3(FundsRecordFragment fundsRecordFragment) {
        if (fundsRecordFragment.getView() != null && fundsRecordFragment.getHost() != null) {
            DialogFragmentHelper dialogFragmentHelperNewInstance = RecordFilterDialogFragment.f30245x0.newInstance(fundsRecordFragment.f29905d0, fundsRecordFragment.f29907f0, fundsRecordFragment.f29903b0, fundsRecordFragment.f29904c0);
            FragmentManager childFragmentManager = fundsRecordFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperNewInstance.show(childFragmentManager, "bkumexFragmentFundsRecordBinding.type");
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        this.f46496X.setBackgroundColor(ContextCompat.getColor(this.mContext, R$color.c_overlay));
        WrapperLoadingView wrapperLoadingView = this.f29908g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }
}
