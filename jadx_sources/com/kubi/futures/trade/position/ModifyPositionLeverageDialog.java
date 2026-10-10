package com.kubi.futures.trade.position;

import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.position.vm.AddMarginViewModel;
import com.kubi.futures.trade.position.vm.ModifyPositionLeverageViewModel;
import com.kubi.futures.trade.position.vm.ReduceMarginViewModel;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36824q0;
import fm.C37567b;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: ModifyPositionLeverageDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00103\u001a\u00020*H\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010?\u001a\u00020=H\u0002J\u001e\u0010@\u001a\u00020=2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010C0BH\u0002J\b\u0010D\u001a\u00020EH\u0002J\u001c\u0010F\u001a\u00020=2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020G0BH\u0002J\u0010\u0010H\u001a\u00020=2\u0006\u0010A\u001a\u00020 H\u0002J\u0010\u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020GH\u0002J\u0010\u0010K\u001a\u00020=2\u0006\u0010A\u001a\u00020GH\u0002J\b\u0010L\u001a\u00020=H\u0002J\b\u0010M\u001a\u00020=H\u0002J\u0010\u0010N\u001a\u00020=2\u0006\u0010O\u001a\u00020GH\u0002J\u0012\u0010P\u001a\u00020=2\b\u0010J\u001a\u0004\u0018\u00010GH\u0002J\u0010\u0010Q\u001a\u00020=2\u0006\u0010A\u001a\u00020GH\u0002J\u0010\u0010R\u001a\u00020=2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u00020=2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010V\u001a\u00020=2\u0006\u0010J\u001a\u00020GH\u0002J\u0012\u0010W\u001a\u00020=2\b\u0010X\u001a\u0004\u0018\u00010EH\u0002J\b\u0010Y\u001a\u00020=H\u0002J\u0010\u0010Z\u001a\u00020E2\u0006\u0010[\u001a\u00020*H\u0002J\b\u0010\\\u001a\u00020=H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001d\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b+\u0010,R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionLeverageBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionLeverageBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addMarginViewModel", "Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;", "getAddMarginViewModel", "()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;", "addMarginViewModel$delegate", "reduceMarginViewModel", "Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;", "getReduceMarginViewModel", "()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;", "reduceMarginViewModel$delegate", "futuresViewModel", "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "getFuturesViewModel", "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "futuresViewModel$delegate", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "currencyPrecision", "", "getCurrencyPrecision", "()I", "currencyPrecision$delegate", "trackLeverageNotAdjustOnce", "", "debounceTime", "", "alreadySetInitLeverage", "initType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserver", "handleSubmitResult", "it", "Lkotlin/Pair;", "", "toTrackPositionMode", "", "onLeverageRangeChanged", "Ljava/math/BigDecimal;", "onPositionChanged", "formatLeverage", "leverage", "onMarginChanged", "initView", "handleConfirm", "trackConfirm", ViewProps.MARGIN, "onInputValueChanged", "handleLeverageChanged", "onAfterPositionInfoChanged", "info", "Lcom/kubi/futures/trade/position/PositionRenderInfo;", "onCurrentPositionInfoChanged", "showWarning", "showError", "errorMessage", "showLeverageRangeTips", "getStringRes", "stringRes", "onResume", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifyPositionLeverageDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyPositionLeverageDialog.kt\ncom/kubi/futures/trade/position/ModifyPositionLeverageDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,606:1\n143#2,20:607\n220#3,5:627\n220#3,5:632\n220#3,5:637\n*S KotlinDebug\n*F\n+ 1 ModifyPositionLeverageDialog.kt\ncom/kubi/futures/trade/position/ModifyPositionLeverageDialog\n*L\n65#1:607,20\n67#1:627,5\n69#1:632,5\n71#1:637,5\n*E\n"})
public final class ModifyPositionLeverageDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    public boolean f24080A0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24081q0 = C45681e.m100799e(this, new Function1<ModifyPositionLeverageDialog, C36824q0>() { // from class: com.kubi.futures.trade.position.ModifyPositionLeverageDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36824q0 invoke(@NotNull ModifyPositionLeverageDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36824q0.m82510a(fragment.requireView());
        }
    }, new Function1<C36824q0, Unit>() { // from class: com.kubi.futures.trade.position.ModifyPositionLeverageDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36824q0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36824q0 c36824q0) {
            invoke(c36824q0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24082r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.d2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyPositionLeverageDialog.m27563H5(this.f24145b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24083s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.e2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyPositionLeverageDialog.m27566K4(this.f24154b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24084t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.f2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyPositionLeverageDialog.m27556C5(this.f24161b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f24085u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.g2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyPositionLeverageDialog.m27569O4(this.f24173b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f24086v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.h2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyPositionLeverageDialog.m27554B5(this.f24179b);
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f24087w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.i2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyPositionLeverageDialog.m27567L4(this.f24191b);
        }
    });

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f24088x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.j2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(ModifyPositionLeverageDialog.m27568M4(this.f24196b));
        }
    });

    /* JADX INFO: renamed from: y0 */
    public boolean f24089y0;

    /* JADX INFO: renamed from: z0 */
    public long f24090z0;

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ KProperty<Object>[] f24079C0 = {Reflection.property1(new PropertyReference1Impl(ModifyPositionLeverageDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionLeverageBinding;", 0))};

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final Companion f24078B0 = new Companion(null);

    /* JADX INFO: compiled from: ModifyPositionLeverageDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(position, "position");
            ModifyPositionLeverageDialog modifyPositionLeverageDialog = new ModifyPositionLeverageDialog();
            modifyPositionLeverageDialog.setArguments(BundleKt.bundleOf(new Pair("data", position)));
            modifyPositionLeverageDialog.show(manager, "ModifyPositionLeverageDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ModifyPositionLeverageDialog$a */
    /* JADX INFO: compiled from: ModifyPositionLeverageDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/position/ModifyPositionLeverageDialog$initView$3$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13897a implements KcSeekBar.InterfaceC23002a {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ModifyPositionLeverageDialog$b */
    /* JADX INFO: compiled from: ModifyPositionLeverageDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/trade/position/ModifyPositionLeverageDialog$initView$3$2", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13898b implements KcSeekBar.InterfaceC23003b {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23003b
        /* JADX INFO: renamed from: a */
        public String mo21946a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ModifyPositionLeverageDialog$c */
    /* JADX INFO: compiled from: ModifyPositionLeverageDialog.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/futures/trade/position/ModifyPositionLeverageDialog$initView$4", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "getProgressOnActionUp", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13899c extends KcSeekBar.AbstractC23005d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C36824q0 f24091a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ModifyPositionLeverageDialog f24092b;

        public C13899c(C36824q0 c36824q0, ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
            this.f24091a = c36824q0;
            this.f24092b = modifyPositionLeverageDialog;
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            BigDecimal bigDecimalValueOf;
            ModifyLeverageInputView modifyLeverageInputView = this.f24091a.f80862l;
            if (i11 < 1.0f) {
                bigDecimalValueOf = BigDecimal.ONE;
            } else {
                bigDecimalValueOf = BigDecimal.valueOf(i11);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            }
            Intrinsics.checkNotNull(bigDecimalValueOf);
            modifyLeverageInputView.setValue(bigDecimalValueOf);
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d, com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23004c
        /* JADX INFO: renamed from: b */
        public void mo25745b(KcSeekBar kcSeekBar, int i11, float f11) {
            super.mo25745b(kcSeekBar, i11, f11);
            C43852m.m96589a(C17060n0.m36552b(), "AdjustLeverage", "4", new JSONObject().put("isTrialFunds", String.valueOf(this.f24092b.m27572U4().isTrialFunds())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ModifyPositionLeverageDialog$d */
    /* JADX INFO: compiled from: ModifyPositionLeverageDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13900d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24093b;

        public C13900d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24093b = function;
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
            return this.f24093b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24093b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final String m27619N4(BigDecimal bigDecimal) {
        return C17054k0.m36530d(bigDecimal, false, 1, null);
    }

    /* JADX INFO: renamed from: C5 */
    public static final ReduceMarginViewModel m27556C5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        return (ReduceMarginViewModel) new ViewModelProvider(modifyPositionLeverageDialog).get(ReduceMarginViewModel.class);
    }

    /* JADX INFO: renamed from: H5 */
    public static final ModifyPositionLeverageViewModel m27563H5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        return (ModifyPositionLeverageViewModel) new ViewModelProvider(modifyPositionLeverageDialog).get(ModifyPositionLeverageViewModel.class);
    }

    /* JADX INFO: renamed from: K4 */
    public static final AddMarginViewModel m27566K4(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        return (AddMarginViewModel) new ViewModelProvider(modifyPositionLeverageDialog).get(AddMarginViewModel.class);
    }

    /* JADX INFO: renamed from: L4 */
    public static final ContractEntity m27567L4(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(modifyPositionLeverageDialog.m27572U4().getSymbol()), false, 2, null);
    }

    /* JADX INFO: renamed from: R4 */
    private final ContractEntity m27570R4() {
        return (ContractEntity) this.f24087w0.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    private final com.kubi.futures.trade.vm.u m27571T4() {
        return (com.kubi.futures.trade.vm.u) this.f24085u0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public final PositionEntity m27572U4() {
        return (PositionEntity) this.f24086v0.getValue();
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m27581h5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, PositionEntity it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        modifyPositionLeverageDialog.m27625X4().m27933z(it);
    }

    /* JADX INFO: renamed from: i5 */
    public static final void m27582i5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, SimpleBalanceEntity it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        modifyPositionLeverageDialog.m27625X4().m27931x(C27039d.m66656p(it.getAvailableBalance()));
    }

    private final void initView() {
        CharSequence symbol;
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 == null) {
            return;
        }
        AppCompatImageView ivBack = c36824q0M27621Q4.f80863m;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewExtKt.m66575f(ivBack, new Function1() { // from class: com.kubi.futures.trade.position.k2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27590m5(this.f24201b, (View) obj);
            }
        });
        BaseTextView baseTextView = c36824q0M27621Q4.f80873w;
        ContractEntity contractEntityM27570R4 = m27570R4();
        if (contractEntityM27570R4 == null || (symbol = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM27570R4)) == null) {
            symbol = m27572U4().getSymbol();
        }
        baseTextView.setText(symbol);
        c36824q0M27621Q4.f80862l.setPrecision(2);
        c36824q0M27621Q4.f80862l.setOnValueChangedListener(new Function1() { // from class: com.kubi.futures.trade.position.l2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27592n5(this.f24205b, (BigDecimal) obj);
            }
        });
        KcSeekBar kcSeekBar = c36824q0M27621Q4.f80871u;
        float fM84614d = C37567b.m84614d(m27570R4(), true);
        kcSeekBar.setProgressFormatCallback(new C13897a());
        kcSeekBar.setSectionTextFormatCallback(new C13898b());
        kcSeekBar.setMin(0.0f);
        kcSeekBar.setMax(fM84614d);
        kcSeekBar.setSectionCount(fM84614d % 4.0f == 0.0f ? 4 : 5);
        c36824q0M27621Q4.f80871u.setOnSimpleProgressChangedListener(new C13899c(c36824q0M27621Q4, this));
        c36824q0M27621Q4.f80864n.setNeedDash(true);
        DashTextView leverage = c36824q0M27621Q4.f80864n;
        Intrinsics.checkNotNullExpressionValue(leverage, "leverage");
        C27046k.m66711z(leverage, 0L, new Function0() { // from class: com.kubi.futures.trade.position.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyPositionLeverageDialog.m27594o5(this.f24212b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c36824q0M27621Q4.f80875y;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.position.o2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyPositionLeverageDialog.m27596p5(this.f24231b);
            }
        }, 1, null);
        c36824q0M27621Q4.f80862l.setPlusListener(new Function0() { // from class: com.kubi.futures.trade.position.p2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyPositionLeverageDialog.m27598q5(this.f24237b);
            }
        });
        c36824q0M27621Q4.f80862l.setSubListener(new Function0() { // from class: com.kubi.futures.trade.position.q2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyPositionLeverageDialog.m27600r5(this.f24242b);
            }
        });
        c36824q0M27621Q4.f80862l.setOnFocusChangeListener(new Function1() { // from class: com.kubi.futures.trade.position.r2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27602s5(this.f24245b, ((Boolean) obj).booleanValue());
            }
        });
        c36824q0M27621Q4.f80862l.setLimitRangeListener(new Function2() { // from class: com.kubi.futures.trade.position.s2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ModifyPositionLeverageDialog.m27604t5(this.f24248b, (BigDecimal) obj, (BigDecimal) obj2);
            }
        });
        BaseTextView baseTextView2 = c36824q0M27621Q4.f80861k;
        baseTextView2.setPaintFlags(baseTextView2.getPaintFlags() | 8);
        Intrinsics.checkNotNull(baseTextView2);
        C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.futures.trade.position.t2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyPositionLeverageDialog.m27606u5(this.f24251b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m27590m5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        modifyPositionLeverageDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m27592n5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, BigDecimal it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        modifyPositionLeverageDialog.m27612x5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m27602s5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, boolean z11) {
        if (z11) {
            C43852m.m96589a(C17060n0.m36552b(), "AdjustLeverage", "1", new JSONObject().put("isTrialFunds", String.valueOf(modifyPositionLeverageDialog.m27572U4().isTrialFunds())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static final Unit m27604t5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, BigDecimal min, BigDecimal max) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        if (min.compareTo(max) >= 0) {
            return Unit.INSTANCE;
        }
        if (System.currentTimeMillis() - modifyPositionLeverageDialog.f24090z0 > 3000) {
            modifyPositionLeverageDialog.f24090z0 = System.currentTimeMillis();
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.kumex_modify_leverage_adjust_range, modifyPositionLeverageDialog.m27619N4(min) + " - " + modifyPositionLeverageDialog.m27619N4(max)), new Object[0]);
            C43852m.m96589a(C17060n0.m36552b(), "AdjustLeverage", "8", new JSONObject().put("isTrialFunds", String.valueOf(modifyPositionLeverageDialog.m27572U4().isTrialFunds())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m27606u5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        IsolatedPositionLeverageDescDialog.Companion companion = IsolatedPositionLeverageDescDialog.f24070q0;
        FragmentManager childFragmentManager = modifyPositionLeverageDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D5 */
    public final void m27616D5() {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(R$string.kumex_modify_leverage_adjust_title, R$string.kumex_modify_leverage_adjust_desc, null, 4, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "kumex_modify_leverage_adjust_title");
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: P4 */
    public final AddMarginViewModel m27620P4() {
        return (AddMarginViewModel) this.f24083s0.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final C36824q0 m27621Q4() {
        return (C36824q0) this.f24081q0.getValue(this, f24079C0[0]);
    }

    /* JADX INFO: renamed from: S4 */
    public final int m27622S4() {
        return ((Number) this.f24088x0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: V4 */
    public final ReduceMarginViewModel m27623V4() {
        return (ReduceMarginViewModel) this.f24084t0.getValue();
    }

    /* JADX INFO: renamed from: W4 */
    public final String m27624W4(int i11) {
        return C27017c.f54310a.m66516f(i11, new Object[0]);
    }

    /* JADX INFO: renamed from: X4 */
    public final ModifyPositionLeverageViewModel m27625X4() {
        return (ModifyPositionLeverageViewModel) this.f24082r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.95f);
        return inflater.inflate(R$layout.bkumex_dialog_position_leverage, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * getF43576g0()));
        C43852m.m96593e(C17060n0.m36552b(), "AdjustLeverage", "1", new JSONObject().put("isTrialFunds", String.valueOf(m27572U4().isTrialFunds())));
        m27571T4().b();
        initView();
        m27575b5();
    }

    /* JADX INFO: renamed from: B5 */
    public static final PositionEntity m27554B5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        PositionEntity positionEntity;
        Bundle arguments = modifyPositionLeverageDialog.getArguments();
        if (arguments != null && (positionEntity = (PositionEntity) arguments.getParcelable("data")) != null) {
            return positionEntity;
        }
        return new PositionEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 131071, null);
    }

    /* JADX INFO: renamed from: F5 */
    private final String m27560F5() {
        String positionSide = m27572U4().getPositionSide();
        if (positionSide != null) {
            int iHashCode = positionSide.hashCode();
            if (iHashCode != 2044801) {
                if (iHashCode != 2342524) {
                    if (iHashCode == 78875740 && positionSide.equals(SharedPositionInfo.SIDE_SHORT)) {
                        return "2";
                    }
                    return "none";
                }
                if (positionSide.equals(SharedPositionInfo.SIDE_LONG)) {
                    return "2";
                }
                return "none";
            }
            if (positionSide.equals("BOTH")) {
                return "1";
            }
            return "none";
        }
        return "none";
    }

    /* JADX INFO: renamed from: M4 */
    public static final int m27568M4(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        return C27039d.m66650j(Integer.valueOf(C37567b.m84613c(modifyPositionLeverageDialog.m27570R4())));
    }

    /* JADX INFO: renamed from: O4 */
    public static final com.kubi.futures.trade.vm.u m27569O4(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        return com.kubi.futures.trade.vm.v.b(modifyPositionLeverageDialog, C27041f.m66668h(modifyPositionLeverageDialog.m27572U4().getSymbol()), modifyPositionLeverageDialog.m27572U4().isTrialFunds(), modifyPositionLeverageDialog.m27572U4().getPositionSide(), (MultiBizType) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: Y4 */
    private final void m27573Y4() throws JSONException {
        RoundingMode roundingMode;
        BigDecimal bigDecimalM84617g;
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 != null) {
            BigDecimal value = m27625X4().m27930w().getValue();
            if (value == null) {
                showError(C27017c.f54310a.m66516f(R$string.kumex_modify_leverage_so_smal, new Object[0]));
                return;
            }
            int iM27622S4 = m27622S4();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (value.compareTo(bigDecimal) >= 0) {
                roundingMode = RoundingMode.UP;
            } else {
                roundingMode = RoundingMode.DOWN;
            }
            BigDecimal scale = value.setScale(iM27622S4, roundingMode);
            BigDecimal bigDecimalAbs = scale.abs();
            ContractEntity contractEntityM27570R4 = m27570R4();
            if (contractEntityM27570R4 != null) {
                bigDecimalM84617g = C37567b.m84617g(contractEntityM27570R4);
            } else {
                bigDecimalM84617g = null;
            }
            if (bigDecimalAbs.compareTo(C27039d.m66656p(bigDecimalM84617g)) < 0) {
                showError(C27017c.f54310a.m66516f(R$string.kumex_modify_leverage_so_smal, new Object[0]));
                return;
            }
            if (c36824q0M27621Q4.f80875y.getF44406k()) {
                return;
            }
            c36824q0M27621Q4.f80875y.m55043o();
            Intrinsics.checkNotNull(scale);
            m27618G5(scale);
            if (scale.compareTo(bigDecimal) > 0) {
                m27620P4().m27796l0(C27041f.m66668h(m27572U4().getSymbol()), m27572U4().isTrialFunds(), scale, C27041f.m66668h(m27572U4().getPositionSide()));
                return;
            }
            ReduceMarginViewModel reduceMarginViewModelM27623V4 = m27623V4();
            String strM66668h = C27041f.m66668h(m27572U4().getSymbol());
            boolean zIsTrialFunds = m27572U4().isTrialFunds();
            BigDecimal bigDecimalAbs2 = scale.abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs2, "abs(...)");
            reduceMarginViewModelM27623V4.m27950f0(strM66668h, zIsTrialFunds, bigDecimalAbs2, C27041f.m66668h(m27572U4().getPositionSide()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: a5 */
    private final void m27574a5(Pair<Boolean, ? extends Throwable> pair) throws JSONException {
        String str;
        KcPrimaryButton kcPrimaryButton;
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 != null && (kcPrimaryButton = c36824q0M27621Q4.f80875y) != null) {
            kcPrimaryButton.mo28851l();
        }
        if (pair.getFirst().booleanValue()) {
            ToastCompat.m66437C(R$string.kumex_modify_leverage_success);
            dismissAllowingStateLoss();
            str = "success";
        } else {
            Throwable second = pair.getSecond();
            if (second != null) {
                if (second instanceof ApiException) {
                    ApiException apiException = (ApiException) second;
                    if (Intrinsics.areEqual(apiException.code, "200013") || Intrinsics.areEqual(apiException.code, "200012")) {
                        if (Intrinsics.areEqual(apiException.code, "200013")) {
                            C17058m0.m36548c(this, R$string.kumex_modify_margin_reduce_fail_risk_change);
                        } else {
                            C17058m0.m36548c(this, R$string.kumex_modify_margin_reduce_fail_max_amount);
                        }
                    } else {
                        C17058m0.m36550e(this, pair.getSecond());
                    }
                } else {
                    C17058m0.m36550e(this, pair.getSecond());
                }
            }
            str = "failure";
        }
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AdjResult", str);
        jSONObject.put("symbol", C27041f.m66668h(m27572U4().getSymbol()));
        jSONObject.put("isTrialFunds", String.valueOf(m27572U4().isTrialFunds()));
        jSONObject.put("positionMode", m27560F5());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustLeverage", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, jSONObject);
    }

    /* JADX INFO: renamed from: b5 */
    private final void m27575b5() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m27625X4().m27927t().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27584j5(this.f24135b, (PositionRenderInfo) obj);
            }
        }));
        m27625X4().m27930w().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.n2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27586k5(this.f24221b, (BigDecimal) obj);
            }
        }));
        m27620P4().m27789Z().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.u2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27588l5(this.f24254b, (PositionRenderInfo) obj);
            }
        }));
        m27623V4().m27945a0().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.v2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27576c5(this.f24262b, (PositionRenderInfo) obj);
            }
        }));
        m27625X4().m27929v().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.w2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27577d5(this.f24436b, (PositionEntity) obj);
            }
        }));
        m27625X4().m27928u().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.x2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27578e5(this.f24442b, (Pair) obj);
            }
        }));
        m27620P4().m27792c0().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.y2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27579f5(this.f24448b, (Pair) obj);
            }
        }));
        m27623V4().m27948d0().observe(viewLifecycleOwner, new C13900d(new Function1() { // from class: com.kubi.futures.trade.position.z2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyPositionLeverageDialog.m27580g5(this.f24453b, (Pair) obj);
            }
        }));
        m27571T4().a(new Observer() { // from class: com.kubi.futures.trade.position.a3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                ModifyPositionLeverageDialog.m27581h5(this.f24124b, (PositionEntity) obj);
            }
        });
        m27571T4().E(new Observer() { // from class: com.kubi.futures.trade.position.b3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                ModifyPositionLeverageDialog.m27582i5(this.f24129b, (SimpleBalanceEntity) obj);
            }
        });
        m27620P4().m28030z(m27572U4());
        m27623V4().m28030z(m27572U4());
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m27576c5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, PositionRenderInfo positionRenderInfo) {
        Intrinsics.checkNotNull(positionRenderInfo);
        modifyPositionLeverageDialog.m27608v5(positionRenderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m27577d5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, PositionEntity positionEntity) throws Throwable {
        Intrinsics.checkNotNull(positionEntity);
        modifyPositionLeverageDialog.m27615A5(positionEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m27578e5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, Pair pair) throws Throwable {
        Intrinsics.checkNotNull(pair);
        modifyPositionLeverageDialog.m27627y5(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m27579f5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, Pair pair) throws JSONException {
        Intrinsics.checkNotNull(pair);
        modifyPositionLeverageDialog.m27574a5(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m27580g5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, Pair pair) throws JSONException {
        Intrinsics.checkNotNull(pair);
        modifyPositionLeverageDialog.m27574a5(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m27584j5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, PositionRenderInfo positionRenderInfo) {
        Intrinsics.checkNotNull(positionRenderInfo);
        modifyPositionLeverageDialog.m27610w5(positionRenderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m27586k5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, BigDecimal bigDecimal) throws Throwable {
        Intrinsics.checkNotNull(bigDecimal);
        modifyPositionLeverageDialog.m27628z5(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m27588l5(ModifyPositionLeverageDialog modifyPositionLeverageDialog, PositionRenderInfo positionRenderInfo) {
        Intrinsics.checkNotNull(positionRenderInfo);
        modifyPositionLeverageDialog.m27608v5(positionRenderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m27594o5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        C43852m.m96589a(C17060n0.m36552b(), "AdjustLeverage", "5", new JSONObject().put("isTrialFunds", String.valueOf(modifyPositionLeverageDialog.m27572U4().isTrialFunds())));
        modifyPositionLeverageDialog.m27616D5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    public static final Unit m27596p5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) throws JSONException {
        modifyPositionLeverageDialog.m27573Y4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m27598q5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        C43852m.m96589a(C17060n0.m36552b(), "AdjustLeverage", "2", new JSONObject().put("isTrialFunds", String.valueOf(modifyPositionLeverageDialog.m27572U4().isTrialFunds())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final Unit m27600r5(ModifyPositionLeverageDialog modifyPositionLeverageDialog) {
        C43852m.m96589a(C17060n0.m36552b(), "AdjustLeverage", "3", new JSONObject().put("isTrialFunds", String.valueOf(modifyPositionLeverageDialog.m27572U4().isTrialFunds())));
        return Unit.INSTANCE;
    }

    private final void showError(String errorMessage) {
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 == null) {
            return;
        }
        if (errorMessage != null && errorMessage.length() != 0) {
            c36824q0M27621Q4.f80875y.setEnabled(false);
            AlignTopTextView error = c36824q0M27621Q4.f80860j;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            C27046k.m66685H(error);
            c36824q0M27621Q4.f80860j.setText(errorMessage);
            return;
        }
        AlignTopTextView error2 = c36824q0M27621Q4.f80860j;
        Intrinsics.checkNotNullExpressionValue(error2, "error");
        ViewExtKt.m66577h(error2);
        c36824q0M27621Q4.f80875y.setEnabled(true);
    }

    /* JADX INFO: renamed from: v5 */
    private final void m27608v5(PositionRenderInfo positionRenderInfo) {
        int iM66512a;
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 == null) {
            return;
        }
        if (Intrinsics.areEqual(positionRenderInfo.getMargin(), m27624W4(R$string.stub))) {
            iM66512a = C27017c.f54310a.m66512a(R$color.c_text30);
        } else {
            iM66512a = C27017c.f54310a.m66512a(R$color.c_text);
        }
        c36824q0M27621Q4.f80868r.setTextColor(iM66512a);
        c36824q0M27621Q4.f80865o.setTextColor(iM66512a);
        c36824q0M27621Q4.f80857g.setTextColor(iM66512a);
        c36824q0M27621Q4.f80868r.setText(positionRenderInfo.getMargin());
        c36824q0M27621Q4.f80865o.setText(positionRenderInfo.getLiquidation());
        c36824q0M27621Q4.f80857g.setText(positionRenderInfo.getEntryPrice());
    }

    /* JADX INFO: renamed from: w5 */
    private final void m27610w5(PositionRenderInfo positionRenderInfo) {
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 == null) {
            return;
        }
        int iM66512a = C27017c.f54310a.m66512a(R$color.c_text);
        c36824q0M27621Q4.f80869s.setTextColor(iM66512a);
        c36824q0M27621Q4.f80866p.setTextColor(iM66512a);
        c36824q0M27621Q4.f80858h.setTextColor(iM66512a);
        c36824q0M27621Q4.f80869s.setText(positionRenderInfo.getMargin());
        c36824q0M27621Q4.f80866p.setText(positionRenderInfo.getLiquidation());
        c36824q0M27621Q4.f80858h.setText(positionRenderInfo.getEntryPrice());
    }

    /* JADX INFO: renamed from: x5 */
    private final void m27612x5(BigDecimal bigDecimal) throws Throwable {
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 == null) {
            return;
        }
        BigDecimal bigDecimalM66656p = C27039d.m66656p(bigDecimal);
        showError(null);
        m27626Z4(bigDecimalM66656p);
        m27617E5(bigDecimalM66656p);
        c36824q0M27621Q4.f80871u.setProgress(bigDecimalM66656p.floatValue());
    }

    /* JADX INFO: renamed from: A5 */
    public final void m27615A5(PositionEntity positionEntity) throws Throwable {
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 == null) {
            return;
        }
        BigDecimal f25022z = c36824q0M27621Q4.f80862l.getF25022z();
        if (!this.f24080A0) {
            this.f24080A0 = true;
            c36824q0M27621Q4.f80862l.setValue(C27039d.m66656p(positionEntity.getRealLeverage()));
        } else {
            m27626Z4(C27039d.m66656p(f25022z));
        }
        BaseTextView baseTextView = c36824q0M27621Q4.f80856f;
        C27017c c27017c = C27017c.f54310a;
        baseTextView.setText(c27017c.m66516f(R$string.kumex_modify_leverage_current_leverage, m27619N4(C27039d.m66656p(positionEntity.getRealLeverage()))));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView currentLeverage = c36824q0M27621Q4.f80856f;
        Intrinsics.checkNotNullExpressionValue(currentLeverage, "currentLeverage");
        highlightTextHelper.m54120f(currentLeverage, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text))));
    }

    /* JADX INFO: renamed from: E5 */
    public final void m27617E5(BigDecimal bigDecimal) {
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 == null) {
            return;
        }
        if (bigDecimal.compareTo(BigDecimal.TEN) >= 0) {
            AlignTopTextView warning = c36824q0M27621Q4.f80876z;
            Intrinsics.checkNotNullExpressionValue(warning, "warning");
            C27046k.m66685H(warning);
        } else {
            AlignTopTextView warning2 = c36824q0M27621Q4.f80876z;
            Intrinsics.checkNotNullExpressionValue(warning2, "warning");
            ViewExtKt.m66577h(warning2);
        }
    }

    /* JADX INFO: renamed from: G5 */
    public final void m27618G5(BigDecimal bigDecimal) throws JSONException {
        PositionRenderInfo value;
        String entryPrice;
        String entryPrice2;
        String liquidation;
        String liquidation2;
        String plainString;
        BigDecimal realLeverage;
        BigDecimal bigDecimalM11724a;
        ModifyLeverageInputView modifyLeverageInputView;
        BigDecimal f25022z;
        BigDecimal bigDecimalM11724a2;
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        PositionRenderInfo value2 = m27625X4().m27927t().getValue();
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            value = m27620P4().m27789Z().getValue();
        } else {
            value = m27623V4().m27945a0().getValue();
        }
        String plainString2 = null;
        if (value2 != null) {
            entryPrice = value2.getEntryPrice();
        } else {
            entryPrice = null;
        }
        jSONObject.put("openPrice1", C27041f.m66668h(entryPrice));
        if (value != null) {
            entryPrice2 = value.getEntryPrice();
        } else {
            entryPrice2 = null;
        }
        jSONObject.put("openPrice2", C27041f.m66668h(entryPrice2));
        if (value2 != null) {
            liquidation = value2.getLiquidation();
        } else {
            liquidation = null;
        }
        jSONObject.put("liqPrice1", C27041f.m66668h(liquidation));
        if (value != null) {
            liquidation2 = value.getLiquidation();
        } else {
            liquidation2 = null;
        }
        jSONObject.put("liqPrice2", C27041f.m66668h(liquidation2));
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 != null && (modifyLeverageInputView = c36824q0M27621Q4.f80862l) != null && (f25022z = modifyLeverageInputView.getF25022z()) != null && (bigDecimalM11724a2 = C6447a.m11724a(f25022z)) != null) {
            plainString = bigDecimalM11724a2.toPlainString();
        } else {
            plainString = null;
        }
        jSONObject.put("chooseLev", C27041f.m66668h(plainString));
        PositionEntity value3 = m27625X4().m27929v().getValue();
        if (value3 != null && (realLeverage = value3.getRealLeverage()) != null && (bigDecimalM11724a = C6447a.m11724a(realLeverage)) != null) {
            plainString2 = bigDecimalM11724a.toPlainString();
        }
        jSONObject.put("currentLev", C27041f.m66668h(plainString2));
        jSONObject.put("symbol", C27041f.m66668h(m27572U4().getSymbol()));
        jSONObject.put("isTrialFunds", String.valueOf(m27572U4().isTrialFunds()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustLeverage", "6", jSONObject);
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m27626Z4(BigDecimal bigDecimal) throws Throwable {
        BigDecimal first;
        BigDecimal second;
        Pair<BigDecimal, BigDecimal> value = m27625X4().m27928u().getValue();
        if (value != null) {
            first = value.getFirst();
        } else {
            first = null;
        }
        Pair<BigDecimal, BigDecimal> value2 = m27625X4().m27928u().getValue();
        if (value2 != null) {
            second = value2.getSecond();
        } else {
            second = null;
        }
        if (first != null && bigDecimal.compareTo(first) < 0) {
            showError(C27017c.f54310a.m66516f(R$string.kumex_modify_leverage_min_tips, C42180b.m92640e(first, null, 0, true, false, false, 0, null, 123, null)));
        } else if (second != null && bigDecimal.compareTo(second) > 0) {
            showError(C27017c.f54310a.m66516f(R$string.kumex_modify_leverage_max_tips, C42180b.m92640e(second, null, 0, true, false, false, 0, null, 123, null)));
        } else {
            showError(null);
            m27625X4().m27932y(bigDecimal);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ConstraintLayout root;
        super.onResume();
        m27625X4().m27926s(C27041f.m66668h(m27572U4().getSymbol()), m27572U4().isTrialFunds(), C27041f.m66668h(m27572U4().getPositionSide()));
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 != null && (root = c36824q0M27621Q4.getRoot()) != null) {
            root.requestLayout();
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final void m27627y5(Pair<? extends BigDecimal, ? extends BigDecimal> pair) throws Throwable {
        String str;
        BigDecimal realLeverage;
        C36824q0 c36824q0M27621Q4 = m27621Q4();
        if (c36824q0M27621Q4 != null) {
            if (pair.getFirst().compareTo(pair.getSecond()) >= 0) {
                c36824q0M27621Q4.f80864n.setText(C27017c.f54310a.m66516f(R$string.kumex_modify_leverage_invaild, new Object[0]));
                PositionEntity value = m27625X4().m27929v().getValue();
                if (value != null) {
                    realLeverage = value.getRealLeverage();
                } else {
                    realLeverage = null;
                }
                BigDecimal bigDecimalM66656p = C27039d.m66656p(realLeverage);
                c36824q0M27621Q4.f80862l.setMin(bigDecimalM66656p);
                c36824q0M27621Q4.f80862l.setMax(bigDecimalM66656p);
                c36824q0M27621Q4.f80862l.setSubAndPlusEnabled(false);
                if (!this.f24089y0) {
                    this.f24089y0 = true;
                    C43852m.m96589a(C17060n0.m36552b(), "AdjustLeverage", "9", new JSONObject().put("isTrialFunds", String.valueOf(m27572U4().isTrialFunds())));
                    return;
                }
                return;
            }
            BigDecimal first = pair.getFirst();
            BigDecimal second = pair.getSecond();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C37567b.m84614d(m27570R4(), true));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal bigDecimalMin = second.min(bigDecimalValueOf);
            c36824q0M27621Q4.f80862l.setMin(first);
            ModifyLeverageInputView modifyLeverageInputView = c36824q0M27621Q4.f80862l;
            Intrinsics.checkNotNull(bigDecimalMin);
            modifyLeverageInputView.setMax(bigDecimalMin);
            if (C5303w0.m6511a()) {
                str = m27619N4(bigDecimalMin) + " - " + m27619N4(first);
            } else {
                str = m27619N4(first) + " - " + m27619N4(bigDecimalMin);
            }
            c36824q0M27621Q4.f80864n.setText(C27017c.f54310a.m66516f(R$string.kumex_modify_leverage_adjust_range, str));
            PositionEntity value2 = m27625X4().m27929v().getValue();
            if (value2 != null) {
                m27615A5(value2);
            }
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final void m27628z5(BigDecimal bigDecimal) throws Throwable {
        RoundingMode roundingMode;
        int iM27622S4 = m27622S4();
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            roundingMode = RoundingMode.UP;
        } else {
            roundingMode = RoundingMode.DOWN;
        }
        BigDecimal scale = bigDecimal.setScale(iM27622S4, roundingMode);
        if (scale.compareTo(bigDecimal2) >= 0) {
            showError(null);
        }
        PositionEntity value = m27625X4().m27929v().getValue();
        if (scale.compareTo(bigDecimal2) > 0) {
            m27620P4().m27793d0(scale, value);
        } else {
            m27623V4().m27949e0(scale.abs(), value);
        }
    }
}
