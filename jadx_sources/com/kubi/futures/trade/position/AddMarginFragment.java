package com.kubi.futures.trade.position;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.settings.C13392j;
import com.kubi.futures.trade.position.vm.AddMarginViewModel;
import com.kubi.futures.view.ModifyMarginInputView;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.C17071w;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36855v1;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AddMarginFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u001e\u0010\u0019\u001a\u00020\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0002J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020 H\u0014J\u001e\u0010\"\u001a\u00020\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0002J\u0012\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010&\u001a\u00020\u0010H\u0002J\b\u0010'\u001a\u00020\u0010H\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006,"}, m90084d2 = {"Lcom/kubi/futures/trade/position/AddMarginFragment;", "Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "futuresViewModel", "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "getFuturesViewModel", "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "futuresViewModel$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initInputView", "inputView", "Lcom/kubi/futures/view/ModifyMarginInputView;", "initObserver", "handleAutoMarginResult", "it", "Lkotlin/Pair;", "", "", "onBalanceChanged", "balance", "Ljava/math/BigDecimal;", "getAvailableBalance", "handleSubmitResult", "handleInputBalance", "input", "", "handleTapConfirm", "trackConfirm", "handleAutoMarginSwitch", "switch", "Landroidx/appcompat/widget/SwitchCompat;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAddMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddMarginFragment.kt\ncom/kubi/futures/trade/position/AddMarginFragment\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,329:1\n220#2,5:330\n*S KotlinDebug\n*F\n+ 1 AddMarginFragment.kt\ncom/kubi/futures/trade/position/AddMarginFragment\n*L\n51#1:330,5\n*E\n"})
public final class AddMarginFragment extends ChildModifyMarginFragment {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f24052b0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f24053Z = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddMarginFragment.m27480w4(this.f24181b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f24054a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddMarginFragment.m27465X3(this.f24194b);
        }
    });

    /* JADX INFO: compiled from: AddMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/trade/position/AddMarginFragment$Companion;", "", "<init>", "()V", "newInstance", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Fragment newInstance(@NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(position, "position");
            AddMarginFragment addMarginFragment = new AddMarginFragment();
            addMarginFragment.setArguments(BundleKt.bundleOf(new Pair("data", position)));
            return addMarginFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.AddMarginFragment$a */
    /* JADX INFO: compiled from: AddMarginFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13887a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24055b;

        public C13887a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24055b = function;
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
            return this.f24055b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24055b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m27468i4(AddMarginFragment addMarginFragment, CharSequence charSequence) throws Throwable {
        addMarginFragment.m27485d4(charSequence != null ? charSequence.toString() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m27474o4(AddMarginFragment addMarginFragment, SimpleBalanceEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        addMarginFragment.m27490r4(it.getAvailableBalance());
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m27475p4(AddMarginFragment addMarginFragment, PositionEntity position) throws Throwable {
        Intrinsics.checkNotNullParameter(position, "position");
        addMarginFragment.m27505E3(position);
        C36855v1 c36855v1M27509s3 = addMarginFragment.m27509s3();
        if (c36855v1M27509s3 != null) {
            if (C27025c.m66566d(position.getAutoDeposit()) != c36855v1M27509s3.f81211e.isChecked()) {
                c36855v1M27509s3.f81211e.setChecked(C27025c.m66566d(position.getAutoDeposit()));
            }
            addMarginFragment.m27482Z3().m28029O(position);
            addMarginFragment.m27482Z3().m27793d0(c36855v1M27509s3.f81220n.getInputValue(), position);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m27479u4(AddMarginFragment addMarginFragment, SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        addMarginFragment.m27484b4(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final AddMarginViewModel m27480w4(AddMarginFragment addMarginFragment) {
        return (AddMarginViewModel) new ViewModelProvider(addMarginFragment).get(AddMarginViewModel.class);
    }

    /* JADX INFO: renamed from: Y3 */
    public final com.kubi.futures.trade.vm.u m27481Y3() {
        return (com.kubi.futures.trade.vm.u) this.f24054a0.getValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public final AddMarginViewModel m27482Z3() {
        return (AddMarginViewModel) this.f24053Z.getValue();
    }

    @Override // com.kubi.futures.trade.position.ChildModifyMarginFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null) {
            return;
        }
        c36855v1M27509s3.f81232z.setCompoundDrawablesRelative(null, null, null, null);
        c36855v1M27509s3.f81232z.setText(R$string.uta_isolate_margin_max_add_title);
        c36855v1M27509s3.f81232z.setNeedDash(m27512v3());
        DashTextView questionLabel = c36855v1M27509s3.f81232z;
        Intrinsics.checkNotNullExpressionValue(questionLabel, "questionLabel");
        C27046k.m66711z(questionLabel, 0L, new Function0() { // from class: com.kubi.futures.trade.position.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddMarginFragment.m27477s4(this.f24119b);
            }
        }, 1, null);
        c36855v1M27509s3.f81208b.setText(R$string.kumex_modify_margin_add_after);
        KcPrimaryButton tvConfirm = c36855v1M27509s3.f81206D;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.position.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddMarginFragment.m27478t4(this.f24167b);
            }
        }, 1, null);
        KcSmallSwitchButton autoSwitch = c36855v1M27509s3.f81211e;
        Intrinsics.checkNotNullExpressionValue(autoSwitch, "autoSwitch");
        ViewExKt.m36487m(autoSwitch, new Function1() { // from class: com.kubi.futures.trade.position.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginFragment.m27479u4(this.f24177b, (SwitchCompat) obj);
            }
        });
        m27481Y3().b();
        ModifyMarginInputView inputView = c36855v1M27509s3.f81220n;
        Intrinsics.checkNotNullExpressionValue(inputView, "inputView");
        m27488g4(inputView);
        m27469j4();
        m27482Z3().m28030z(getF24059W());
        Group autoGroup = c36855v1M27509s3.f81209c;
        Intrinsics.checkNotNullExpressionValue(autoGroup, "autoGroup");
        C27046k.m66684G(autoGroup, BrokerConfig.f19211a.m20201d().mo20223C0());
    }

    /* JADX INFO: renamed from: X3 */
    public static final com.kubi.futures.trade.vm.u m27465X3(AddMarginFragment addMarginFragment) {
        String symbol;
        Boolean boolValueOf;
        PositionEntity f24059w = addMarginFragment.getF24059W();
        String positionSide = null;
        if (f24059w != null) {
            symbol = f24059w.getSymbol();
        } else {
            symbol = null;
        }
        String strM66668h = C27041f.m66668h(symbol);
        PositionEntity f24059w2 = addMarginFragment.getF24059W();
        if (f24059w2 != null) {
            boolValueOf = Boolean.valueOf(f24059w2.isTrialFunds());
        } else {
            boolValueOf = null;
        }
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        PositionEntity f24059w3 = addMarginFragment.getF24059W();
        if (f24059w3 != null) {
            positionSide = f24059w3.getPositionSide();
        }
        return com.kubi.futures.trade.vm.v.b(addMarginFragment, strM66668h, zM66566d, positionSide, (MultiBizType) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m27466c4(AddMarginFragment addMarginFragment, SwitchCompat switchCompat) {
        PositionEntity f24059w = addMarginFragment.getF24059W();
        if (f24059w == null) {
            return Unit.INSTANCE;
        }
        addMarginFragment.showLoadingDialog();
        addMarginFragment.m27482Z3().m27795j0(!switchCompat.isChecked(), f24059w);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m27467h4(ModifyMarginInputView modifyMarginInputView, AddMarginFragment addMarginFragment) {
        modifyMarginInputView.setInputValue(addMarginFragment.mo27489r3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    private final void m27469j4() {
        String settleCurrency;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m27481Y3().a(new Observer() { // from class: com.kubi.futures.trade.position.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                AddMarginFragment.m27475p4(this.f24199b, (PositionEntity) obj);
            }
        });
        m27482Z3().m28025F().observe(viewLifecycleOwner, new C13887a(new Function1() { // from class: com.kubi.futures.trade.position.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginFragment.m27476q4(this.f24203b, (PositionRenderInfo) obj);
            }
        }));
        m27482Z3().m27789Z().observe(viewLifecycleOwner, new C13887a(new Function1() { // from class: com.kubi.futures.trade.position.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginFragment.m27470k4(this.f24209b, (PositionRenderInfo) obj);
            }
        }));
        m27482Z3().m27792c0().observe(viewLifecycleOwner, new C13887a(new Function1() { // from class: com.kubi.futures.trade.position.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginFragment.m27471l4(this.f24218b, (Pair) obj);
            }
        }));
        m27482Z3().m27791b0().observe(viewLifecycleOwner, new C13887a(new Function1() { // from class: com.kubi.futures.trade.position.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginFragment.m27472m4(this.f24228b, (Pair) obj);
            }
        }));
        if (m27512v3()) {
            m27482Z3().m27790a0().observe(viewLifecycleOwner, new C13887a(new Function1() { // from class: com.kubi.futures.trade.position.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddMarginFragment.m27473n4(this.f24126b, (BigDecimal) obj);
                }
            }));
            AddMarginViewModel addMarginViewModelM27482Z3 = m27482Z3();
            PositionEntity f24059w = getF24059W();
            if (f24059w != null) {
                settleCurrency = f24059w.getSettleCurrency();
            } else {
                settleCurrency = null;
            }
            addMarginViewModelM27482Z3.m27794e0(C27041f.m66668h(C27041f.m66677q(settleCurrency)));
            return;
        }
        m27481Y3().E(new Observer() { // from class: com.kubi.futures.trade.position.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AddMarginFragment.m27474o4(this.f24131b, (SimpleBalanceEntity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m27470k4(AddMarginFragment addMarginFragment, PositionRenderInfo positionRenderInfo) {
        Intrinsics.checkNotNull(positionRenderInfo);
        addMarginFragment.m27514x3(positionRenderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m27471l4(AddMarginFragment addMarginFragment, Pair pair) throws JSONException {
        Intrinsics.checkNotNull(pair);
        addMarginFragment.m27486e4(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m27472m4(AddMarginFragment addMarginFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        addMarginFragment.m27483a4(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m27473n4(AddMarginFragment addMarginFragment, BigDecimal bigDecimal) {
        addMarginFragment.m27490r4(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m27476q4(AddMarginFragment addMarginFragment, PositionRenderInfo positionRenderInfo) {
        Intrinsics.checkNotNull(positionRenderInfo);
        addMarginFragment.m27515y3(positionRenderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m27477s4(AddMarginFragment addMarginFragment) {
        if (!addMarginFragment.m27512v3()) {
            return Unit.INSTANCE;
        }
        addMarginFragment.m27507G3(R$string.uta_isolate_margin_max_add_title, R$string.uta_isolate_margin_max_add_desc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m27478t4(AddMarginFragment addMarginFragment) throws JSONException {
        addMarginFragment.m27487f4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m27483a4(Pair<Boolean, ? extends Throwable> pair) {
        PositionEntity f24059w = getF24059W();
        if (f24059w != null) {
            Throwable second = pair.getSecond();
            BaseFragment.hideLoadingDialog$default(this, false, 1, null);
            if (second != null) {
                if (Intrinsics.areEqual(RepositoryServiceLocator.f19236a.m20288g().mo24997Y(C27041f.m66668h(f24059w.getSymbol())), "Paused")) {
                    C17058m0.m36548c(this, R$string.can_not_operate_margin);
                } else {
                    C17058m0.m36550e(this, second);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m27484b4(final SwitchCompat switchCompat) {
        if (C13392j.m26326m()) {
            BaseDialogFragment baseDialogFragmentM33701t = C15943u.m33701t(!switchCompat.isChecked(), null, new Function0() { // from class: com.kubi.futures.trade.position.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddMarginFragment.m27466c4(this.f24157b, switchCompat);
                }
            }, 2, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogFragmentM33701t.show(childFragmentManager, "auto_ensure_dialog");
            return;
        }
        PositionEntity f24059w = getF24059W();
        if (f24059w == null) {
            return;
        }
        showLoadingDialog();
        m27482Z3().m27795j0(!switchCompat.isChecked(), f24059w);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m27485d4(String str) throws Throwable {
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null) {
            return;
        }
        if (!Intrinsics.areEqual(c36855v1M27509s3.f81231y.getTag(), Boolean.TRUE)) {
            c36855v1M27509s3.f81231y.setProgress(0.0f);
        }
        BigDecimal bigDecimalM36622d = C17071w.m36622d(str);
        BigDecimal bigDecimalMo27489r3 = mo27489r3();
        boolean z11 = false;
        if (bigDecimalM36622d != null && bigDecimalM36622d.compareTo(BigDecimal.ZERO) == 0) {
            c36855v1M27509s3.f81206D.setEnabled(false);
            return;
        }
        if (C27039d.m66656p(bigDecimalM36622d).compareTo(C27039d.m66656p(bigDecimalMo27489r3)) > 0) {
            c36855v1M27509s3.f81220n.m28884m(getStringRes(R$string.kumex_modify_margin_add_error_tips, new Object[0]));
            c36855v1M27509s3.f81206D.setEnabled(false);
            return;
        }
        c36855v1M27509s3.f81220n.m28883l();
        KcPrimaryButton kcPrimaryButton = c36855v1M27509s3.f81206D;
        if (str == null || str.length() == 0) {
            z11 = true;
        }
        kcPrimaryButton.setEnabled(!z11);
        m27482Z3().m27793d0(bigDecimalM36622d, getF24059W());
    }

    /* JADX INFO: renamed from: e4 */
    public final void m27486e4(Pair<Boolean, ? extends Throwable> pair) throws JSONException {
        String str;
        ModifyMarginDialog modifyMarginDialog;
        KcPrimaryButton kcPrimaryButton;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (kcPrimaryButton = c36855v1M27509s3.f81206D) != null) {
            kcPrimaryButton.mo28851l();
        }
        Boolean boolValueOf = null;
        if (pair.getFirst().booleanValue()) {
            ToastCompat.m66437C(R$string.kumex_modify_margin_reduce_submit_success);
            if (m27512v3()) {
                m27482Z3().m28028I();
            }
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof ModifyMarginDialog) {
                modifyMarginDialog = (ModifyMarginDialog) parentFragment;
            } else {
                modifyMarginDialog = null;
            }
            if (modifyMarginDialog != null) {
                modifyMarginDialog.dismissAllowingStateLoss();
            }
            str = "success";
        } else {
            C17058m0.m36550e(this, pair.getSecond());
            str = "failure";
        }
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AdjResult", str);
        jSONObject.put("MarginDirection", "AddMargin");
        PositionEntity f24059w = getF24059W();
        if (f24059w != null) {
            boolValueOf = Boolean.valueOf(f24059w.isTrialFunds());
        }
        jSONObject.put("isTrialFunds", String.valueOf(C27025c.m66566d(boolValueOf)));
        jSONObject.put("positionMode", m27508H3());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustMargin", "6", jSONObject);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m27487f4() throws JSONException {
        PositionEntity f24059w;
        BigDecimal inputValue;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (f24059w = getF24059W()) != null && !c36855v1M27509s3.f81206D.getF44406k() && (inputValue = c36855v1M27509s3.f81220n.getInputValue()) != null && inputValue.compareTo(BigDecimal.ZERO) > 0) {
            if (C27039d.m66656p(inputValue).compareTo(mo27489r3()) > 0) {
                c36855v1M27509s3.f81220n.m28884m(getStringRes(R$string.kumex_modify_margin_add_error_tips, new Object[0]));
                c36855v1M27509s3.f81206D.setEnabled(false);
            } else {
                c36855v1M27509s3.f81206D.m55043o();
                m27491v4();
                m27482Z3().m27796l0(C27041f.m66668h(f24059w.getSymbol()), f24059w.isTrialFunds(), inputValue, C27041f.m66668h(f24059w.getPositionSide()));
            }
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m27488g4(final ModifyMarginInputView modifyMarginInputView) {
        PositionEntity f24059w = getF24059W();
        if (f24059w == null) {
            return;
        }
        modifyMarginInputView.setSuffixText(C27041f.m66668h(C27041f.m66677q(f24059w.getSettleCurrency())));
        modifyMarginInputView.setSubTitleRes(R$string.kumex_modify_margin_add_margin);
        modifyMarginInputView.setActionListener(new Function0() { // from class: com.kubi.futures.trade.position.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddMarginFragment.m27467h4(modifyMarginInputView, this);
            }
        });
        modifyMarginInputView.setTextWatcher(new Function1() { // from class: com.kubi.futures.trade.position.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddMarginFragment.m27468i4(this.f24150b, (CharSequence) obj);
            }
        });
        int iM66650j = C27039d.m66650j(Integer.valueOf(C37567b.m84613c(m27510t3())));
        String plainString = C6447a.m11724a(C17071w.m36619a(String.valueOf(Math.pow(10.0d, ((double) iM66650j) * (-1.0d))), new BigDecimal("0.01"))).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        modifyMarginInputView.setInputHint(plainString);
        modifyMarginInputView.setPrecision(iM66650j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.futures.trade.position.ChildModifyMarginFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public BigDecimal mo27489r3() {
        BigDecimal availableBalance;
        Integer numValueOf = null;
        if (m27512v3()) {
            availableBalance = m27482Z3().m27790a0().getValue();
        } else {
            SimpleBalanceEntity simpleBalanceEntity = (SimpleBalanceEntity) m27481Y3().z().getValue();
            if (simpleBalanceEntity != null) {
                availableBalance = simpleBalanceEntity.getAvailableBalance();
            } else {
                availableBalance = null;
            }
        }
        BigDecimal bigDecimalM66656p = C27039d.m66656p(availableBalance);
        ContractEntity contractEntityM27510t3 = m27510t3();
        if (contractEntityM27510t3 != null) {
            numValueOf = Integer.valueOf(C37567b.m84613c(contractEntityM27510t3));
        }
        BigDecimal scale = bigDecimalM66656p.setScale(C27039d.m66651k(numValueOf, 2), RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    /* JADX INFO: renamed from: r4 */
    public final void m27490r4(BigDecimal bigDecimal) {
        C36855v1 c36855v1M27509s3;
        PositionEntity f24059w = getF24059W();
        if (f24059w == null || (c36855v1M27509s3 = m27509s3()) == null) {
            return;
        }
        BaseTextView baseTextView = c36855v1M27509s3.f81212f;
        String strM92640e = null;
        Integer numValueOf = null;
        if (bigDecimal != null) {
            ContractEntity contractEntityM27510t3 = m27510t3();
            if (contractEntityM27510t3 != null) {
                numValueOf = Integer.valueOf(C37567b.m84613c(contractEntityM27510t3));
            }
            strM92640e = C42180b.m92640e(bigDecimal, null, C27039d.m66651k(numValueOf, 2), true, false, true, 0, null, 105, null);
        }
        baseTextView.setText(C42828b.m93906g(C27041f.m66669i(strM92640e, C37569d.m84684y()), C27041f.m66668h(C27041f.m66677q(f24059w.getSettleCurrency())), true, false, 4, null));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m27491v4() throws JSONException {
        String leverage;
        String leverage2;
        String entryPrice;
        String entryPrice2;
        String liquidation;
        String liquidation2;
        ModifyMarginInputView modifyMarginInputView;
        BigDecimal inputValue;
        BigDecimal bigDecimalM11724a;
        PositionEntity f24059w = getF24059W();
        if (f24059w == null) {
            return;
        }
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        PositionRenderInfo value = m27482Z3().m28025F().getValue();
        PositionRenderInfo value2 = m27482Z3().m27789Z().getValue();
        jSONObject.put("MarginDirection", "AddMargin");
        String plainString = null;
        if (value != null) {
            leverage = value.getLeverage();
        } else {
            leverage = null;
        }
        jSONObject.put("lev1", C27041f.m66668h(leverage));
        if (value2 != null) {
            leverage2 = value2.getLeverage();
        } else {
            leverage2 = null;
        }
        jSONObject.put("lev2", C27041f.m66668h(leverage2));
        if (value != null) {
            entryPrice = value.getEntryPrice();
        } else {
            entryPrice = null;
        }
        jSONObject.put("openPrice1", C27041f.m66668h(entryPrice));
        if (value2 != null) {
            entryPrice2 = value2.getEntryPrice();
        } else {
            entryPrice2 = null;
        }
        jSONObject.put("openPrice2", C27041f.m66668h(entryPrice2));
        if (value != null) {
            liquidation = value.getLiquidation();
        } else {
            liquidation = null;
        }
        jSONObject.put("liqPrice1", C27041f.m66668h(liquidation));
        if (value2 != null) {
            liquidation2 = value2.getLiquidation();
        } else {
            liquidation2 = null;
        }
        jSONObject.put("liqPrice2", C27041f.m66668h(liquidation2));
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (modifyMarginInputView = c36855v1M27509s3.f81220n) != null && (inputValue = modifyMarginInputView.getInputValue()) != null && (bigDecimalM11724a = C6447a.m11724a(inputValue)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        }
        jSONObject.put("ChooseMargin", C27041f.m66668h(plainString));
        jSONObject.put("symbol", C27041f.m66668h(f24059w.getSymbol()));
        jSONObject.put("isTrialFunds", String.valueOf(f24059w.isTrialFunds()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustLeverage", "6", jSONObject);
    }
}
