package com.kubi.futures.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.futures.dialog.vm.FundingRateViewModel;
import com.kubi.futures.trade.book.FuturesBookViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DrawableDashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36829r;
import f00.C37304a;
import fm.C37569d;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p599rk.C44110b;
import p599rk.C44111c;
import p729wl.C45875l0;
import p830zf.InterfaceC46806k;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import tm.C45042a;
import uk.C45257b;
import w00.C45681e;

/* JADX INFO: compiled from: FundingRateDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010%\u001a\u00020&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00102\u001a\u000200H\u0002J\u0017\u00103\u001a\u0002002\b\u00104\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0002\u00106J\u001a\u00107\u001a\u0002082\u0006\u0010\u0015\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u001a\u0010;\u001a\u0002002\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010:H\u0002J0\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u0002082\u0006\u0010@\u001a\u0002082\u0006\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0002J\b\u0010D\u001a\u000200H\u0002J\"\u0010E\u001a\u0002002\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010F2\b\u0010\u0015\u001a\u0004\u0018\u00010:H\u0002J \u0010G\u001a\u0004\u0018\u00010:2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0F2\u0006\u0010\u0015\u001a\u00020:H\u0002J\u0010\u0010H\u001a\u00020:2\u0006\u0010I\u001a\u00020\"H\u0002J\b\u0010J\u001a\u00020\"H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u001a\u001a\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b!\u0010#¨\u0006L"}, m90084d2 = {"Lcom/kubi/futures/dialog/FundingRateDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/dialog/vm/FundingRateViewModel;", "getViewModel", "()Lcom/kubi/futures/dialog/vm/FundingRateViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bookViewModel", "Lcom/kubi/futures/trade/book/FuturesBookViewModel;", "getBookViewModel", "()Lcom/kubi/futures/trade/book/FuturesBookViewModel;", "bookViewModel$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogFundingRateBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFundingRateBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fundingRate", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "getFundingRate", "()Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "fundingRate$delegate", "positions", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "kotlin.jvm.PlatformType", "getPositions", "()Ljava/util/ArrayList;", "positions$delegate", "isTrial", "", "()Z", "isTrial$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "observeFundingRateCountDown", "updateCountdown", "seconds", "", "(Ljava/lang/Long;)V", "formatRateWithAnnualized", "", "rate", "Ljava/math/BigDecimal;", "bindDirection", "currentRate", "buildDirectionStyledText", "Lcom/kubi/utils/StyledText;", "payer", "payee", "payerColor", "payeeColor", "defaultColor", "showEstimateDialog", "onPositionChanged", "", "calculateFundingCost", "getSideValue", "isInverse", "isBottomSheet", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFundingRateDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FundingRateDialog.kt\ncom/kubi/futures/dialog/FundingRateDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,386:1\n106#2,15:387\n106#2,15:402\n143#3,20:417\n25#4,3:437\n1869#5,2:440\n*S KotlinDebug\n*F\n+ 1 FundingRateDialog.kt\ncom/kubi/futures/dialog/FundingRateDialog\n*L\n82#1:387,15\n84#1:402,15\n86#1:417,20\n156#1:437,3\n357#1:440,2\n*E\n"})
public final class FundingRateDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f22765q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22766r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final InterfaceC24293a f22767s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f22768t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f22769u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f22770v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f22764x0 = {Reflection.property1(new PropertyReference1Impl(FundingRateDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFundingRateBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f22763w0 = new Companion(null);

    /* JADX INFO: compiled from: FundingRateDialog.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/dialog/FundingRateDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "fundingRate", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", ViewProps.POSITION, "Ljava/util/ArrayList;", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "Lkotlin/collections/ArrayList;", "isTrial", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @Nullable FundingRateEntity fundingRate, @Nullable ArrayList<PositionEntity> position, boolean isTrial) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            if (fundingRate == null) {
                return;
            }
            FundingRateDialog fundingRateDialog = new FundingRateDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", fundingRate);
            if (position == null) {
                position = new ArrayList<>();
            }
            bundle.putParcelableArrayList("data_1", position);
            bundle.putBoolean("data_2", isTrial);
            fundingRateDialog.setArguments(bundle);
            fundingRateDialog.show(manager, "FundingRateDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.FundingRateDialog$a */
    /* JADX INFO: compiled from: FundingRateDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13034a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f22771b;

        public C13034a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22771b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f22771b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22771b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m25059E0() {
        return ((Boolean) this.f22770v0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m25063N4(FundingRateDialog fundingRateDialog) {
        if (C45042a.f101445a.m99619g()) {
            Router.f46192a.m56184f("/krn/router?biz=tradeinfo&entry=main&component=kucoin_tradeinfo_rn&route=ArbitragePage").m4048k();
            fundingRateDialog.dismissAllowingStateLoss();
        } else {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101338f0(), null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m25064O4(FundingRateEntity fundingRateEntity, FundingRateDialog fundingRateDialog) {
        if (C45042a.f101445a.m99613a()) {
            Router.f46192a.m56184f("/krn/router?biz=tradeinfo&entry=main&component=kucoin_tradeinfo_rn&route=FundingRatePage").m4048k();
        } else {
            C37304a c37304a = C37304a.f82764a;
            StringBuilder sb2 = new StringBuilder();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(C45875l0.f103336a.m101345m0(), Arrays.copyOf(new Object[]{C27041f.m66668h(fundingRateEntity.getSymbol())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sb2.append(str);
            sb2.append("&displayType=both&needFilter=true&loading=2");
            InterfaceC37766r.a.m85190a(c37304a, sb2.toString(), fundingRateDialog.getString(R$string.bkumex_funding), null, null, null, null, null, 124, null);
        }
        fundingRateDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public static final Unit m25065P4() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101346n0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m25068T4(BaseViewHolder holder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        View view = holder.getView(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.futures.dialog.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25069U4(dialog);
            }
        }, 1, null);
        View view2 = holder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.futures.dialog.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25070V4(dialog);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX INFO: renamed from: A4 */
    public final String m25085A4(FundingRateEntity fundingRateEntity, BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        String strM84684y;
        BigDecimal annualizedFundingRate;
        String strM84684y2;
        if (bigDecimal != null) {
            bigDecimal2 = bigDecimal;
            strM84684y = C42180b.m92642g(bigDecimal2, null, null, 4, false, false, true, 19, null);
            if (strM84684y == null) {
            }
            annualizedFundingRate = fundingRateEntity.getAnnualizedFundingRate(bigDecimal2);
            if (annualizedFundingRate != null || (strM84684y2 = C42180b.m92642g(annualizedFundingRate, null, null, 4, false, false, true, 19, null)) == null) {
                strM84684y2 = C37569d.m84684y();
            }
            return strM84684y + " / " + strM84684y2;
        }
        bigDecimal2 = bigDecimal;
        strM84684y = C37569d.m84684y();
        annualizedFundingRate = fundingRateEntity.getAnnualizedFundingRate(bigDecimal2);
        if (annualizedFundingRate != null) {
            strM84684y2 = C37569d.m84684y();
        } else {
            strM84684y2 = C37569d.m84684y();
        }
        return strM84684y + " / " + strM84684y2;
    }

    /* JADX INFO: renamed from: C4 */
    public final FuturesBookViewModel m25086C4() {
        return (FuturesBookViewModel) this.f22766r0.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final FundingRateEntity m25087D4() {
        return (FundingRateEntity) this.f22768t0.getValue();
    }

    /* JADX INFO: renamed from: E4 */
    public final ArrayList<PositionEntity> m25088E4() {
        return (ArrayList) this.f22769u0.getValue();
    }

    /* JADX INFO: renamed from: F4 */
    public final BigDecimal m25089F4(boolean z11) {
        if (z11) {
            BigDecimal bigDecimal = BigDecimal.ONE;
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalNegate = ONE.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        return bigDecimalNegate;
    }

    /* JADX INFO: renamed from: G4 */
    public final C36829r m25090G4() {
        return (C36829r) this.f22767s0.getValue(this, f22764x0[0]);
    }

    /* JADX INFO: renamed from: H4 */
    public final FundingRateViewModel m25091H4() {
        return (FundingRateViewModel) this.f22765q0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m25094S4() {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bkumex_dialog_funding_rate_estimate, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.futures.dialog.s
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FundingRateDialog.m25068T4((BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "FundingRateEstimateDialog");
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_funding_rate, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Throwable {
        String strM84684y;
        String strM84684y2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36829r c36829rM25090G4 = m25090G4();
        if (c36829rM25090G4 == null) {
            return;
        }
        final FundingRateEntity fundingRateEntityM25087D4 = m25087D4();
        if (fundingRateEntityM25087D4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        KcSecondaryButton tvConfirm1 = c36829rM25090G4.f80937t;
        Intrinsics.checkNotNullExpressionValue(tvConfirm1, "tvConfirm1");
        C27046k.m66711z(tvConfirm1, 0L, new Function0() { // from class: com.kubi.futures.dialog.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25063N4(this.f22840b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c36829rM25090G4.f80936s;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.dialog.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25064O4(fundingRateEntityM25087D4, this);
            }
        }, 1, null);
        BaseTextView learnMore = c36829rM25090G4.f80926i;
        Intrinsics.checkNotNullExpressionValue(learnMore, "learnMore");
        C27046k.m66711z(learnMore, 0L, new Function0() { // from class: com.kubi.futures.dialog.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25065P4();
            }
        }, 1, null);
        DrawableDashTextView nextRateLabel = c36829rM25090G4.f80929l;
        Intrinsics.checkNotNullExpressionValue(nextRateLabel, "nextRateLabel");
        C27046k.m66711z(nextRateLabel, 0L, new Function0() { // from class: com.kubi.futures.dialog.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25066Q4(this.f22861b);
            }
        }, 1, null);
        c36829rM25090G4.f80929l.setNeedDash(true);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46806k.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            KcSecondaryButton tvConfirm2 = c36829rM25090G4.f80937t;
            Intrinsics.checkNotNullExpressionValue(tvConfirm2, "tvConfirm1");
            ((InterfaceC46806k) objM56186h).m103137a(tvConfirm2);
        } else {
            KcSecondaryButton tvConfirm3 = c36829rM25090G4.f80937t;
            Intrinsics.checkNotNullExpressionValue(tvConfirm3, "tvConfirm1");
            C27046k.m66684G(tvConfirm3, true ^ m25059E0());
        }
        BigDecimal currentFundingRate = fundingRateEntityM25087D4.getCurrentFundingRate();
        c36829rM25090G4.f80934q.setText(getString(R$string.kumex_distance_settlement_hour_stub, fundingRateEntityM25087D4.getPeriodHour()));
        c36829rM25090G4.f80921d.setText(m25085A4(fundingRateEntityM25087D4, currentFundingRate));
        c36829rM25090G4.f80931n.setText(m25085A4(fundingRateEntityM25087D4, fundingRateEntityM25087D4.getLastTimeFundingRate()));
        m25096w4(c36829rM25090G4, currentFundingRate);
        BaseTextView baseTextView = c36829rM25090G4.f80932o;
        StringBuilder sb2 = new StringBuilder();
        BigDecimal fundingRateCap = fundingRateEntityM25087D4.getFundingRateCap();
        if (fundingRateCap == null || (strM84684y = C42180b.m92642g(fundingRateCap, null, null, 4, false, false, true, 27, null)) == null) {
            strM84684y = C37569d.m84684y();
        }
        sb2.append(strM84684y);
        sb2.append(" / ");
        BigDecimal fundingRateFloor = fundingRateEntityM25087D4.getFundingRateFloor();
        if (fundingRateFloor == null || (strM84684y2 = C42180b.m92642g(fundingRateFloor, null, null, 4, false, false, true, 27, null)) == null) {
            strM84684y2 = C37569d.m84684y();
        }
        sb2.append(strM84684y2);
        baseTextView.setText(sb2.toString());
        c36829rM25090G4.f80923f.setText(C27017c.f54310a.m66516f(R$string.kumex_funding_rate_new_desc, fundingRateEntityM25087D4.getPeriodHour()));
        m25092J4();
        m25093L4(m25088E4(), fundingRateEntityM25087D4.getLastFundingRate());
        ArrayList<PositionEntity> arrayListM25088E4 = m25088E4();
        if (arrayListM25088E4 == null || arrayListM25088E4.isEmpty()) {
            m25091H4().m25490u(C27041f.m66668h(fundingRateEntityM25087D4.getSymbol()), m25059E0());
        }
        m25091H4().m25489A().observe(getViewLifecycleOwner(), new C13034a(new Function1() { // from class: com.kubi.futures.dialog.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FundingRateDialog.m25062M4(this.f22864b, fundingRateEntityM25087D4, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final void m25096w4(C36829r c36829r, BigDecimal bigDecimal) {
        String str;
        int i11;
        String str2;
        int i12;
        if (bigDecimal == null || C41014a.m89919D(bigDecimal)) {
            c36829r.f80925h.setText(C37569d.m84684y());
            c36829r.f80925h.setTextColor(C27017c.f54310a.m66512a(R$color.c_text30));
            return;
        }
        String string = getString(R$string.funding_rate_long_party);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R$string.funding_rate_short_party);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Context context = c36829r.f80925h.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54281f = C22890g.m54281f(context, true);
        Context context2 = c36829r.f80925h.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM54281f2 = C22890g.m54281f(context2, false);
        int iM66512a = C27017c.f54310a.m66512a(R$color.c_text);
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            str2 = string;
            i12 = iM54281f;
            str = string2;
            i11 = iM54281f2;
        } else {
            str = string;
            i11 = iM54281f;
            str2 = string2;
            i12 = iM54281f2;
        }
        c36829r.f80925h.setTextColor(iM66512a);
        c36829r.f80925h.setText(m25097y4(str2, str, i12, i11, iM66512a));
    }

    /* JADX INFO: renamed from: y4 */
    public final C27096v0 m25097y4(String str, String str2, int i11, int i12, int i13) {
        String string = getString(R$string.funding_rate_payment, str, str2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, str, 0, false, 6, (Object) null);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) string, str2, 0, false, 6, (Object) null);
        if (iIndexOf$default < 0 || iLastIndexOf$default < iIndexOf$default) {
            C27096v0 c27096v0M66905e = new C27096v0().m66905e(string, i13);
            Intrinsics.checkNotNullExpressionValue(c27096v0M66905e, "appendForeground(...)");
            return c27096v0M66905e;
        }
        C27096v0 c27096v0 = new C27096v0();
        if (iIndexOf$default > 0) {
            String strSubstring = string.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            c27096v0.m66905e(strSubstring, i13);
        }
        c27096v0.m66905e(str, i11);
        if (str.length() + iIndexOf$default < iLastIndexOf$default) {
            String strSubstring2 = string.substring(iIndexOf$default + str.length(), iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            c27096v0.m66905e(strSubstring2, i13);
        }
        c27096v0.m66905e(str2, i12);
        int length = iLastIndexOf$default + str2.length();
        if (length < string.length()) {
            String strSubstring3 = string.substring(length);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            c27096v0.m66905e(strSubstring3, i13);
        }
        return c27096v0;
    }

    /* JADX INFO: renamed from: z4 */
    public final BigDecimal m25098z4(List<PositionEntity> list, BigDecimal bigDecimal) throws Throwable {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        ContractEntity contractEntity = null;
        for (PositionEntity positionEntity : list) {
            ContractEntity contractEntityM84661b = C37569d.m84661b(positionEntity);
            if (contractEntityM84661b != null) {
                C45257b c45257b = C45257b.f101798a;
                boolean zIsInverse = contractEntityM84661b.isInverse();
                BigDecimal multiplier = contractEntityM84661b.getMultiplier();
                C44110b c44110bM97191b = C44111c.m97191b(multiplier != null ? C44111c.m97192c(multiplier) : null, null, 1, null);
                BigDecimal markPrice = positionEntity.getMarkPrice();
                C44110b c44110bM97191b2 = C44111c.m97191b(markPrice != null ? C44111c.m97192c(markPrice) : null, null, 1, null);
                BigDecimal currentQty = positionEntity.getCurrentQty();
                C44110b c44110bM100039g = c45257b.m100039g(zIsInverse, c44110bM97191b, c44110bM97191b2, C44111c.m97191b(currentQty != null ? C44111c.m97192c(currentQty) : null, null, 1, null));
                bigDecimalAdd = bigDecimalAdd.add(C27039d.m66656p(c44110bM100039g != null ? c44110bM100039g.getDecimal() : null).multiply(bigDecimal));
                contractEntity = contractEntityM84661b;
            }
        }
        return bigDecimalAdd.multiply(m25089F4(C27025c.m66566d(contractEntity != null ? Boolean.valueOf(contractEntity.isInverse()) : null)));
    }

    public FundingRateDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$2
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
        this.f22765q0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FundingRateViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$5
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
        final Function0 function2 = new Function0() { // from class: com.kubi.futures.dialog.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25084x4(this.f22868b);
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function2.invoke();
            }

            {
                super(0);
            }
        });
        this.f22766r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuturesBookViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function1;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f22767s0 = C45681e.m100799e(this, new Function1<FundingRateDialog, C36829r>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36829r invoke(@NotNull FundingRateDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36829r.m82521a(fragment.requireView());
            }
        }, new Function1<C36829r, Unit>() { // from class: com.kubi.futures.dialog.FundingRateDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36829r it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36829r c36829r) {
                invoke(c36829r);
                return Unit.INSTANCE;
            }
        });
        this.f22768t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25058B4(this.f22871b);
            }
        });
        this.f22769u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FundingRateDialog.m25067R4(this.f22886b);
            }
        });
        this.f22770v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FundingRateDialog.m25060I4(this.f22889b));
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public static final FundingRateEntity m25058B4(FundingRateDialog fundingRateDialog) {
        FundingRateEntity fundingRateEntity;
        Bundle arguments = fundingRateDialog.getArguments();
        if (arguments != null) {
            fundingRateEntity = (FundingRateEntity) arguments.getParcelable("data");
        } else {
            fundingRateEntity = null;
        }
        if (fundingRateEntity == null) {
            return null;
        }
        return fundingRateEntity;
    }

    /* JADX INFO: renamed from: I4 */
    public static final boolean m25060I4(FundingRateDialog fundingRateDialog) {
        Boolean boolValueOf;
        Bundle arguments = fundingRateDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_2"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m25061K4(FundingRateDialog fundingRateDialog, Long l11) {
        fundingRateDialog.m25095W4(l11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m25062M4(FundingRateDialog fundingRateDialog, FundingRateEntity fundingRateEntity, List list) throws Throwable {
        fundingRateDialog.m25093L4(list, fundingRateEntity.getLastFundingRate());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m25066Q4(FundingRateDialog fundingRateDialog) {
        fundingRateDialog.m25094S4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final ArrayList m25067R4(FundingRateDialog fundingRateDialog) {
        Bundle arguments = fundingRateDialog.getArguments();
        if (arguments != null) {
            return arguments.getParcelableArrayList("data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m25069U4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m25070V4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final ViewModelStoreOwner m25084x4(FundingRateDialog fundingRateDialog) {
        Fragment fragmentRequireParentFragment = fundingRateDialog.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: J4 */
    public final void m25092J4() {
        m25086C4().m26915j0().observe(getViewLifecycleOwner(), new C13034a(new Function1() { // from class: com.kubi.futures.dialog.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FundingRateDialog.m25061K4(this.f22843b, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    public final void m25093L4(List<PositionEntity> list, BigDecimal bigDecimal) throws Throwable {
        ContractEntity contractEntityM84661b;
        RoundingMode roundingMode;
        BigDecimal scale;
        PositionEntity positionEntity;
        C36829r c36829rM25090G4 = m25090G4();
        if (c36829rM25090G4 == null) {
            return;
        }
        if (list != null && (positionEntity = (PositionEntity) CollectionsKt.firstOrNull((List) list)) != null) {
            contractEntityM84661b = C37569d.m84661b(positionEntity);
        } else {
            contractEntityM84661b = null;
        }
        if (list != null && !list.isEmpty() && bigDecimal != null && contractEntityM84661b != null) {
            BigDecimal bigDecimalM25098z4 = m25098z4(list, bigDecimal);
            if (C27039d.m66656p(bigDecimalM25098z4).compareTo(BigDecimal.ZERO) > 0) {
                roundingMode = RoundingMode.DOWN;
            } else {
                roundingMode = RoundingMode.UP;
            }
            RoundingMode roundingMode2 = roundingMode;
            if (bigDecimalM25098z4 != null) {
                scale = bigDecimalM25098z4.setScale(8, roundingMode2);
            } else {
                scale = null;
            }
            if (scale != null && !C41014a.m89919D(scale)) {
                String strM92640e = C42180b.m92640e(scale, roundingMode2, 8, true, false, false, 0, null, 120, null);
                LinearLayoutCompat nextRateLl = c36829rM25090G4.f80930m;
                Intrinsics.checkNotNullExpressionValue(nextRateLl, "nextRateLl");
                C27046k.m66685H(nextRateLl);
                DrawableDashTextView nextRateLabel = c36829rM25090G4.f80929l;
                Intrinsics.checkNotNullExpressionValue(nextRateLabel, "nextRateLabel");
                C27046k.m66685H(nextRateLabel);
                c36829rM25090G4.f80920c.setText(' ' + C27041f.m66677q(contractEntityM84661b.getSettleCurrency()));
                c36829rM25090G4.f80927j.setText(strM92640e);
                BaseTextView baseTextView = c36829rM25090G4.f80927j;
                Context context = baseTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                baseTextView.setTextColor(C22890g.m54282g(context, bigDecimalM25098z4, 0, 2, null));
                return;
            }
            LinearLayoutCompat nextRateLl2 = c36829rM25090G4.f80930m;
            Intrinsics.checkNotNullExpressionValue(nextRateLl2, "nextRateLl");
            ViewExtKt.m66577h(nextRateLl2);
            DrawableDashTextView nextRateLabel2 = c36829rM25090G4.f80929l;
            Intrinsics.checkNotNullExpressionValue(nextRateLabel2, "nextRateLabel");
            ViewExtKt.m66577h(nextRateLabel2);
            return;
        }
        LinearLayoutCompat nextRateLl3 = c36829rM25090G4.f80930m;
        Intrinsics.checkNotNullExpressionValue(nextRateLl3, "nextRateLl");
        ViewExtKt.m66577h(nextRateLl3);
        DrawableDashTextView nextRateLabel3 = c36829rM25090G4.f80929l;
        Intrinsics.checkNotNullExpressionValue(nextRateLabel3, "nextRateLabel");
        ViewExtKt.m66577h(nextRateLabel3);
    }

    /* JADX INFO: renamed from: W4 */
    public final void m25095W4(Long l11) {
        String strM66432s;
        C36829r c36829rM25090G4 = m25090G4();
        if (c36829rM25090G4 == null) {
            return;
        }
        BaseTextView baseTextView = c36829rM25090G4.f80919b;
        if (l11 == null) {
            strM66432s = C37569d.m84684y();
        } else {
            strM66432s = TimeUtils.m66432s(l11.longValue());
        }
        baseTextView.setText(strM66432s);
    }
}
