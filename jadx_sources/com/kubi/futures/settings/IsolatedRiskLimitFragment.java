package com.kubi.futures.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bm.C4634g;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.settings.vm.IsolatedRiskLimitViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36808n2;
import fm.C37567b;
import io.reactivex.functions.BiConsumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: IsolatedRiskLimitFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010+\u001a\u00020)H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u0015H\u0002J,\u0010.\u001a\u00020)2\"\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a00H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\b\u00103\u001a\u00020)H\u0002J\b\u00104\u001a\u00020)H\u0002J\u0010\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u0019H\u0002J\u0010\u00107\u001a\u00020)2\u0006\u00108\u001a\u00020\u001aH\u0002J\u0010\u00109\u001a\u00020)2\u0006\u00108\u001a\u00020\u001aH\u0002J\b\u0010:\u001a\u00020)H\u0002J\b\u0010;\u001a\u00020)H\u0002J\u000e\u0010<\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0011R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/futures/settings/IsolatedRiskLimitFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentIsolatedRiskLimitBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentIsolatedRiskLimitBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/IsolatedRiskLimitViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/IsolatedRiskLimitViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "isTrial", "", "()Z", "isTrial$delegate", "limits", "", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "current", "riskLevel", "", "Ljava/lang/Integer;", "blockId", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserver", "handleSubmitResult", "success", "handleUserRiskLimit", "triple", "Lkotlin/Triple;", "initView", "showConfirmAgainDialog", "submitRiskLimit", "showBottomDialog", "generateShowStrings", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "setCurrentRiskLimit", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "setAdjustRiskLimit", "resetAdjustRiskLimit", "notifyBottomButton", "notifySymbol", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedRiskLimitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedRiskLimitFragment.kt\ncom/kubi/futures/settings/IsolatedRiskLimitFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,296:1\n147#2,16:297\n106#3,15:313\n1#4:328\n1869#5,2:329\n*S KotlinDebug\n*F\n+ 1 IsolatedRiskLimitFragment.kt\ncom/kubi/futures/settings/IsolatedRiskLimitFragment\n*L\n49#1:297,16\n53#1:313,15\n212#1:329,2\n*E\n"})
public final class IsolatedRiskLimitFragment extends BaseFragment {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f23170b0 = {Reflection.property1(new PropertyReference1Impl(IsolatedRiskLimitFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentIsolatedRiskLimitBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f23171U = C45681e.m100799e(this, new Function1<IsolatedRiskLimitFragment, C36808n2>() { // from class: com.kubi.futures.settings.IsolatedRiskLimitFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36808n2 invoke(@NotNull IsolatedRiskLimitFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36808n2.m82477a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36808n2, Unit>() { // from class: com.kubi.futures.settings.IsolatedRiskLimitFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36808n2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36808n2 c36808n2) {
            invoke(c36808n2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f23172V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f23173W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public List<ContractRiskLimitEntity> f23174X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public ContractRiskLimitEntity f23175Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public Integer f23176Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final String f23177a0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.IsolatedRiskLimitFragment$a */
    /* JADX INFO: compiled from: IsolatedRiskLimitFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13258a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23178b;

        public C13258a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23178b = function;
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
            return this.f23178b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23178b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m25863z3(IsolatedRiskLimitFragment isolatedRiskLimitFragment, View view) {
        BaseFragment.showLoadingView$default(isolatedRiskLimitFragment, 0, 0, 3, null);
        isolatedRiskLimitFragment.m25873w3().m26394p(isolatedRiskLimitFragment.m25862u3(), isolatedRiskLimitFragment.m25844E0());
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m25843D3(IsolatedRiskLimitFragment isolatedRiskLimitFragment) throws JSONException {
        if (isolatedRiskLimitFragment.f23176Z == null) {
            return Unit.INSTANCE;
        }
        String strM36556f = C17060n0.m36556f();
        String str = isolatedRiskLimitFragment.f23177a0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.Param.LEVEL, C27039d.m66650j(isolatedRiskLimitFragment.f23176Z));
        jSONObject.put("symbol", isolatedRiskLimitFragment.m25862u3());
        jSONObject.put("isTrialFunds", String.valueOf(isolatedRiskLimitFragment.m25844E0()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36556f, str, "5", jSONObject);
        isolatedRiskLimitFragment.m25869O3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m25844E0() {
        return ((Boolean) this.f23173W.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: L3 */
    private final void m25847L3() {
        final List<ContractRiskLimitEntity> list;
        List<BottomSheetDialogHelper.InterfaceC24339a> listM25871t3;
        final ContractRiskLimitEntity contractRiskLimitEntity = this.f23175Y;
        if (contractRiskLimitEntity == null || (list = this.f23174X) == null || (listM25871t3 = m25871t3()) == null) {
            return;
        }
        DialogFragmentHelper dialogFragmentHelperM59002K = BottomSheetDialogHelper.f48599a.m59002K(listM25871t3, new BiConsumer() { // from class: com.kubi.futures.settings.a2
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                IsolatedRiskLimitFragment.m25848M3(this.f23279b, list, contractRiskLimitEntity, (Integer) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, new Function0() { // from class: com.kubi.futures.settings.b2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedRiskLimitFragment.m25849N3(this.f23289b);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM59002K.show(childFragmentManager, "order_type_dialog");
    }

    private final void initView() {
        C36808n2 c36808n2M25872v3 = m25872v3();
        if (c36808n2M25872v3 == null) {
            return;
        }
        if (BrokerConfig.f19211a.m20201d().mo20224E0()) {
            c36808n2M25872v3.f80671m.setEnabled(true);
            AppCompatImageView riskLimitValueIv = c36808n2M25872v3.f80675q;
            Intrinsics.checkNotNullExpressionValue(riskLimitValueIv, "riskLimitValueIv");
            C27046k.m66685H(riskLimitValueIv);
            KcPrimaryButton tvConfirm = c36808n2M25872v3.f80677s;
            Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
            C27046k.m66685H(tvConfirm);
            ConstraintLayout infoCl = c36808n2M25872v3.f80668j;
            Intrinsics.checkNotNullExpressionValue(infoCl, "infoCl");
            C27046k.m66685H(infoCl);
        } else {
            c36808n2M25872v3.f80671m.setEnabled(false);
            AppCompatImageView riskLimitValueIv2 = c36808n2M25872v3.f80675q;
            Intrinsics.checkNotNullExpressionValue(riskLimitValueIv2, "riskLimitValueIv");
            C27046k.m66700o(riskLimitValueIv2);
            KcPrimaryButton tvConfirm2 = c36808n2M25872v3.f80677s;
            Intrinsics.checkNotNullExpressionValue(tvConfirm2, "tvConfirm");
            C27046k.m66700o(tvConfirm2);
            ConstraintLayout infoCl2 = c36808n2M25872v3.f80668j;
            Intrinsics.checkNotNullExpressionValue(infoCl2, "infoCl");
            C27046k.m66700o(infoCl2);
        }
        c36808n2M25872v3.f80673o.setTextColor(getColorRes(R$color.c_text));
        View line = c36808n2M25872v3.f80670l;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        C27046k.m66685H(line);
        LinearLayout llRiskLimit = c36808n2M25872v3.f80671m;
        Intrinsics.checkNotNullExpressionValue(llRiskLimit, "llRiskLimit");
        C27046k.m66711z(llRiskLimit, 0L, new Function0() { // from class: com.kubi.futures.settings.t1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedRiskLimitFragment.m25845E3(this.f23454b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm3 = c36808n2M25872v3.f80677s;
        Intrinsics.checkNotNullExpressionValue(tvConfirm3, "tvConfirm");
        C27046k.m66711z(tvConfirm3, 0L, new Function0() { // from class: com.kubi.futures.settings.u1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedRiskLimitFragment.m25843D3(this.f23462b);
            }
        }, 1, null);
        m25866I3();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m25865H3(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!isAdded() || isRemoving() || isDetached()) {
            return;
        }
        m25866I3();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m25873w3().m26394p(symbol, m25844E0());
    }

    /* JADX INFO: renamed from: I3 */
    public final void m25866I3() {
        C36808n2 c36808n2M25872v3;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m25862u3(), false, 2, null);
        if (contractEntityM99529O == null || (c36808n2M25872v3 = m25872v3()) == null) {
            return;
        }
        this.f23176Z = null;
        BaseTextView baseTextView = c36808n2M25872v3.f80674p;
        ContractRiskLimitEntity contractRiskLimitEntity = this.f23175Y;
        baseTextView.setText(C42828b.m93906g(C42180b.m92640e(C27039d.m66656p(contractRiskLimitEntity != null ? contractRiskLimitEntity.getMaxRiskLimit() : null), null, C27039d.m66650j(Integer.valueOf(C37567b.m84623m(contractEntityM99529O))), true, true, true, 0, null, 97, null), C27041f.m66668h(C37567b.m84620j(contractEntityM99529O)), true, false, 4, null));
        BaseTextView baseTextView2 = c36808n2M25872v3.f80661c;
        C27096v0 c27096v0 = new C27096v0();
        int i11 = R$string.stub;
        String string = getString(i11);
        int i12 = R$color.c_text40;
        baseTextView2.setText(c27096v0.m66905e(string, getColorRes(i12)));
        c36808n2M25872v3.f80662d.setText(new C27096v0().m66905e(getString(i11), getColorRes(i12)));
        m25864G3();
    }

    /* JADX INFO: renamed from: J3 */
    public final void m25867J3(ContractRiskLimitEntity contractRiskLimitEntity) {
        C36808n2 c36808n2M25872v3;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(contractRiskLimitEntity.getSymbol()), false, 2, null);
        if (contractEntityM99529O == null || (c36808n2M25872v3 = m25872v3()) == null) {
            return;
        }
        c36808n2M25872v3.f80674p.setText(C42828b.m93906g(C42180b.m92640e(C27039d.m66656p(contractRiskLimitEntity.getMaxRiskLimit()), null, C27039d.m66650j(Integer.valueOf(C37567b.m84623m(contractEntityM99529O))), true, true, true, 0, null, 97, null), C27041f.m66668h(C37567b.m84620j(contractEntityM99529O)), true, false, 4, null));
        c36808n2M25872v3.f80661c.setText(C6447a.m11724a(C27039d.m66656p(contractRiskLimitEntity.getMaxLeverage())).toEngineeringString() + 'x');
        c36808n2M25872v3.f80662d.setText(C42180b.m92642g(C27039d.m66656p(contractRiskLimitEntity.getMaintainMargin()), null, null, 0, false, false, true, 31, null));
    }

    /* JADX INFO: renamed from: K3 */
    public final void m25868K3(ContractRiskLimitEntity contractRiskLimitEntity) {
        C36808n2 c36808n2M25872v3;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(contractRiskLimitEntity.getSymbol()), false, 2, null);
        if (contractEntityM99529O == null || (c36808n2M25872v3 = m25872v3()) == null) {
            return;
        }
        c36808n2M25872v3.f80674p.setText(C42828b.m93906g(C42180b.m92640e(C27039d.m66656p(contractRiskLimitEntity.getMaxRiskLimit()), null, C27039d.m66650j(Integer.valueOf(C37567b.m84623m(contractEntityM99529O))), true, true, true, 0, null, 97, null), C27041f.m66668h(C37567b.m84620j(contractEntityM99529O)), true, false, 4, null));
        c36808n2M25872v3.f80666h.setText(C6447a.m11724a(C27039d.m66656p(contractRiskLimitEntity.getMaxLeverage())).toEngineeringString() + 'x');
        c36808n2M25872v3.f80667i.setText(C42180b.m92642g(C27039d.m66656p(contractRiskLimitEntity.getMaintainMargin()), null, null, 0, false, false, true, 31, null));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m25869O3() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_risk_limit_adjust_title).m54153J4(R$string.kumex_risk_limit_adjust_content).m54159P4(R$string.close, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.settings.y1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) throws JSONException {
                IsolatedRiskLimitFragment.m25850P3(this.f23580b, dialogInterface, i11);
            }
        }).m54162S4(R$string.kumex_confirm_adjust, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.settings.z1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                IsolatedRiskLimitFragment.m25851Q3(this.f23588b, dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "kumex_risk_limit_adjust_title");
    }

    /* JADX INFO: renamed from: R3 */
    public final void m25870R3() {
        Integer num = this.f23176Z;
        if (num != null) {
            m25873w3().m26397s(m25862u3(), m25844E0(), num.intValue());
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_isolated_risk_limit, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m25840A3();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m25873w3().m26394p(m25862u3(), m25844E0());
    }

    /* JADX INFO: renamed from: t3 */
    public final List<BottomSheetDialogHelper.InterfaceC24339a> m25871t3() {
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m25862u3(), false, 2, null);
        List<ContractRiskLimitEntity> list = this.f23174X;
        if (list == null || list.isEmpty() || contractEntityM99529O == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<ContractRiskLimitEntity> list2 = this.f23174X;
        Intrinsics.checkNotNull(list2);
        for (ContractRiskLimitEntity contractRiskLimitEntity : list2) {
            BigDecimal maxRiskLimit = contractRiskLimitEntity.getMaxRiskLimit();
            String strM93906g = C42828b.m93906g(maxRiskLimit != null ? C42180b.m92640e(maxRiskLimit, null, C37567b.m84623m(contractEntityM99529O), true, true, true, 0, null, 97, null) : null, C27041f.m66668h(C37567b.m84620j(contractEntityM99529O)), true, false, 4, null);
            int i11 = R$string.kumex_risk_limit_content;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27039d.m66656p(contractRiskLimitEntity.getMaxLeverage()));
            sb2.append('x');
            String string = getString(i11, sb2.toString(), C42828b.m93915p(C42180b.m92642g(C27039d.m66656p(contractRiskLimitEntity.getMaintainMargin()), null, null, 0, false, false, true, 31, null)));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Integer level = contractRiskLimitEntity.getLevel();
            Integer level2 = this.f23176Z;
            if (level2 == null) {
                ContractRiskLimitEntity contractRiskLimitEntity2 = this.f23175Y;
                level2 = contractRiskLimitEntity2 != null ? contractRiskLimitEntity2.getLevel() : null;
            }
            arrayList.add(new SelectEntity(null, strM93906g, null, null, null, null, null, null, null, false, Intrinsics.areEqual(level, level2), string, 1021, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v3 */
    public final C36808n2 m25872v3() {
        return (C36808n2) this.f23171U.getValue(this, f23170b0[0]);
    }

    /* JADX INFO: renamed from: w3 */
    public final IsolatedRiskLimitViewModel m25873w3() {
        return (IsolatedRiskLimitViewModel) this.f23172V.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m25874x3(boolean z11) {
        Object next;
        if (z11) {
            ToastCompat.m66437C(R$string.kumex_adjust_submit_tips);
            List<ContractRiskLimitEntity> list = this.f23174X;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (C27039d.m66650j(((ContractRiskLimitEntity) next).getLevel()) != C27039d.m66650j(this.f23176Z));
                ContractRiskLimitEntity contractRiskLimitEntity = (ContractRiskLimitEntity) next;
                if (contractRiskLimitEntity == null) {
                    return;
                }
                this.f23175Y = contractRiskLimitEntity;
                m25868K3(contractRiskLimitEntity);
                m25866I3();
            }
        }
    }

    public IsolatedRiskLimitFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.IsolatedRiskLimitFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.IsolatedRiskLimitFragment$special$$inlined$viewModels$default$2
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
        this.f23172V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(IsolatedRiskLimitViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.IsolatedRiskLimitFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.IsolatedRiskLimitFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.IsolatedRiskLimitFragment$special$$inlined$viewModels$default$5
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
        this.f23173W = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.s1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(IsolatedRiskLimitFragment.m25846F3(this.f23442b));
            }
        });
        this.f23177a0 = "RiskLimit";
    }

    /* JADX INFO: renamed from: A3 */
    private final void m25840A3() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m25873w3().m26395q().observe(viewLifecycleOwner, new C13258a(new Function1() { // from class: com.kubi.futures.settings.v1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedRiskLimitFragment.m25841B3(this.f23471b, (Triple) obj);
            }
        }));
        m25873w3().m26396r().observe(viewLifecycleOwner, new C13258a(new Function1() { // from class: com.kubi.futures.settings.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedRiskLimitFragment.m25842C3(this.f23562b, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m25841B3(IsolatedRiskLimitFragment isolatedRiskLimitFragment, Triple triple) {
        Intrinsics.checkNotNull(triple);
        isolatedRiskLimitFragment.m25875y3(triple);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m25842C3(IsolatedRiskLimitFragment isolatedRiskLimitFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        isolatedRiskLimitFragment.m25874x3(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m25845E3(IsolatedRiskLimitFragment isolatedRiskLimitFragment) throws JSONException {
        String strM36556f = C17060n0.m36556f();
        String str = isolatedRiskLimitFragment.f23177a0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isTrialFunds", String.valueOf(isolatedRiskLimitFragment.m25844E0()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36556f, str, "2", jSONObject);
        isolatedRiskLimitFragment.m25847L3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final boolean m25846F3(IsolatedRiskLimitFragment isolatedRiskLimitFragment) {
        Boolean boolValueOf;
        Bundle arguments = isolatedRiskLimitFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m25848M3(IsolatedRiskLimitFragment isolatedRiskLimitFragment, List list, ContractRiskLimitEntity contractRiskLimitEntity, Integer num, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        C43852m.m96589a(C17060n0.m36556f(), isolatedRiskLimitFragment.f23177a0, "3", new JSONObject().put("isTrialFunds", String.valueOf(isolatedRiskLimitFragment.m25844E0())));
        Intrinsics.checkNotNull(num);
        ContractRiskLimitEntity contractRiskLimitEntity2 = (ContractRiskLimitEntity) list.get(num.intValue());
        if (C27039d.m66650j(contractRiskLimitEntity2.getLevel()) == C27039d.m66650j(contractRiskLimitEntity.getLevel())) {
            isolatedRiskLimitFragment.m25866I3();
            return;
        }
        isolatedRiskLimitFragment.f23176Z = contractRiskLimitEntity2.getLevel();
        isolatedRiskLimitFragment.m25867J3(contractRiskLimitEntity2);
        isolatedRiskLimitFragment.m25864G3();
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m25849N3(IsolatedRiskLimitFragment isolatedRiskLimitFragment) {
        C43852m.m96589a(C17060n0.m36556f(), isolatedRiskLimitFragment.f23177a0, "4", new JSONObject().put("isTrialFunds", String.valueOf(isolatedRiskLimitFragment.m25844E0())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m25850P3(IsolatedRiskLimitFragment isolatedRiskLimitFragment, DialogInterface dialogInterface, int i11) throws JSONException {
        String strM36556f = C17060n0.m36556f();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isTrialFunds", String.valueOf(isolatedRiskLimitFragment.m25844E0()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36556f, "RiskLimitConfirm", "1", jSONObject);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m25851Q3(IsolatedRiskLimitFragment isolatedRiskLimitFragment, DialogInterface dialogInterface, int i11) {
        C43852m.m96589a(C17060n0.m36556f(), "RiskLimitConfirm", "2", new JSONObject().put("symbol", isolatedRiskLimitFragment.m25862u3()).put("number", C27039d.m66650j(isolatedRiskLimitFragment.f23176Z)).put("isTrialFunds", String.valueOf(isolatedRiskLimitFragment.m25844E0())));
        isolatedRiskLimitFragment.m25870R3();
    }

    /* JADX INFO: renamed from: u3 */
    private final String m25862u3() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, C4634g.m4564a());
    }

    /* JADX INFO: renamed from: G3 */
    public final void m25864G3() {
        boolean z11;
        C36808n2 c36808n2M25872v3 = m25872v3();
        if (c36808n2M25872v3 == null) {
            return;
        }
        KcPrimaryButton kcPrimaryButton = c36808n2M25872v3.f80677s;
        if (this.f23176Z != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        kcPrimaryButton.setEnabled(z11);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m25875y3(Triple<Boolean, ? extends List<ContractRiskLimitEntity>, ContractRiskLimitEntity> triple) {
        if (triple.getFirst().booleanValue()) {
            this.f23175Y = triple.getThird();
            this.f23174X = triple.getSecond();
            ContractRiskLimitEntity contractRiskLimitEntity = this.f23175Y;
            if (contractRiskLimitEntity != null) {
                showContentView();
                m25868K3(contractRiskLimitEntity);
                return;
            }
            return;
        }
        BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.settings.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsolatedRiskLimitFragment.m25863z3(this.f23571b, view);
            }
        }, 3, (Object) null);
    }
}
