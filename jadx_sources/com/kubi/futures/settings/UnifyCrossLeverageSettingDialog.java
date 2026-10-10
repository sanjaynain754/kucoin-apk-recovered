package com.kubi.futures.settings;

import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
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
import ci.InterfaceC4984e;
import cm.C5003h;
import com.blankj.utilcode.util.C5267e0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.messaging.Constants;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.futures.settings.vm.UnifyCrossLeverageSettingViewModel;
import com.kubi.futures.settings.vm.UserKycLeverageViewModel;
import com.kubi.futures.trade.submit.panel.header.FuturesHeaderStreamViewModel;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.CrossLeverageEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36777i1;
import f00.C37304a;
import fm.C37567b;
import fm.C37569d;
import g00.InterfaceC37755g;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: UnifyCrossLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010<\u001a\u00020=H\u0016J&\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u001a\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010I\u001a\u00020GH\u0002J\u0012\u0010J\u001a\u00020G2\b\u0010K\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010L\u001a\u00020G2\u0006\u0010K\u001a\u00020.H\u0002J\b\u0010M\u001a\u00020GH\u0002J\u0012\u0010N\u001a\u00020G2\b\u0010O\u001a\u0004\u0018\u00010.H\u0002J\u0012\u0010P\u001a\u00020%2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\u0012\u0010S\u001a\u00020G2\b\u00105\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010T\u001a\u00020G2\u0006\u0010K\u001a\u00020.H\u0002J\u0012\u0010U\u001a\u00020G2\b\u0010V\u001a\u0004\u0018\u00010WH\u0002J\b\u0010X\u001a\u00020GH\u0002J\b\u0010Y\u001a\u00020GH\u0016J\b\u0010Z\u001a\u00020GH\u0002J\u0010\u0010[\u001a\u00020G2\u0006\u0010\\\u001a\u00020 H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b$\u0010&R\u001d\u0010(\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u000f\u001a\u0004\b*\u0010+R\u001d\u0010-\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u000f\u001a\u0004\b/\u00100R\u000e\u00102\u001a\u00020 X\u0082D¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\n 4*\u0004\u0018\u00010.0.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u00107\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u000f\u001a\u0004\b9\u0010:¨\u0006^"}, m90084d2 = {"Lcom/kubi/futures/settings/UnifyCrossLeverageSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogUnifyCrossLeverageSettingBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogUnifyCrossLeverageSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/UnifyCrossLeverageSettingViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/UnifyCrossLeverageSettingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "userKycLeverageViewModel", "Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "getUserKycLeverageViewModel", "()Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "userKycLeverageViewModel$delegate", "futuresViewModel", "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "getFuturesViewModel", "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "futuresViewModel$delegate", "futuresHeaderStreamViewModel", "Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "getFuturesHeaderStreamViewModel", "()Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "futuresHeaderStreamViewModel$delegate", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "isTrial", "", "()Z", "isTrial$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "currentLeverage", "Ljava/math/BigDecimal;", "getCurrentLeverage", "()Ljava/math/BigDecimal;", "currentLeverage$delegate", "blockId", "currentSymbolOfMargin", "kotlin.jvm.PlatformType", "adjustLeverage", "hasComposeException", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "setCurrentLeverage", "leverage", "onInputValueChanged", "initObserver", "onUnifyPosOrderMarginChanged", "value", "handleComposeException", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "setAdjustLeverageMarginChanged", "setLeverageInput", "kycHintCheck", "kycLeverageInfo", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "warningCheck", "onResume", "handleConfirmClick", "trackClick", "locationId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyCrossLeverageSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyCrossLeverageSettingDialog.kt\ncom/kubi/futures/settings/UnifyCrossLeverageSettingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,458:1\n143#2,20:459\n106#3,15:479\n106#3,15:494\n*S KotlinDebug\n*F\n+ 1 UnifyCrossLeverageSettingDialog.kt\ncom/kubi/futures/settings/UnifyCrossLeverageSettingDialog\n*L\n66#1:459,20\n68#1:479,15\n69#1:494,15\n*E\n"})
public final class UnifyCrossLeverageSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    public BigDecimal f23242A0;

    /* JADX INFO: renamed from: B0 */
    @Nullable
    public BigDecimal f23243B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f23244C0;

    /* JADX INFO: renamed from: D0 */
    @NotNull
    public final Lazy f23245D0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f23246q0 = C45681e.m100799e(this, new Function1<UnifyCrossLeverageSettingDialog, C36777i1>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36777i1 invoke(@NotNull UnifyCrossLeverageSettingDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36777i1.m82412a(fragment.requireView());
        }
    }, new Function1<C36777i1, Unit>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36777i1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36777i1 c36777i1) {
            invoke(c36777i1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23247r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23248s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23249t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f23250u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f23251v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f23252w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f23253x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f23254y0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final String f23255z0;

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ KProperty<Object>[] f23241F0 = {Reflection.property1(new PropertyReference1Impl(UnifyCrossLeverageSettingDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogUnifyCrossLeverageSettingBinding;", 0))};

    /* JADX INFO: renamed from: E0 */
    @NotNull
    public static final Companion f23240E0 = new Companion(null);

    /* JADX INFO: compiled from: UnifyCrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/settings/UnifyCrossLeverageSettingDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/futures/settings/UnifyCrossLeverageSettingDialog;", "symbol", "", "leverage", "Ljava/math/BigDecimal;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final UnifyCrossLeverageSettingDialog newInstance(@NotNull String symbol, @Nullable BigDecimal leverage) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog = new UnifyCrossLeverageSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            if (leverage != null) {
                bundle.putSerializable("data", leverage);
            }
            unifyCrossLeverageSettingDialog.setArguments(bundle);
            return unifyCrossLeverageSettingDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$a */
    /* JADX INFO: compiled from: UnifyCrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/UnifyCrossLeverageSettingDialog$initView$7$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13279a implements KcSeekBar.InterfaceC23002a {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$b */
    /* JADX INFO: compiled from: UnifyCrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/UnifyCrossLeverageSettingDialog$initView$7$2", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13280b implements KcSeekBar.InterfaceC23003b {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23003b
        /* JADX INFO: renamed from: a */
        public String mo21946a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$c */
    /* JADX INFO: compiled from: UnifyCrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/futures/settings/UnifyCrossLeverageSettingDialog$initView$8", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "getProgressOnActionUp", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13281c extends KcSeekBar.AbstractC23005d {
        public C13281c() {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog = UnifyCrossLeverageSettingDialog.this;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            unifyCrossLeverageSettingDialog.m26221q5(bigDecimalValueOf);
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d, com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23004c
        /* JADX INFO: renamed from: b */
        public void mo25745b(KcSeekBar kcSeekBar, int i11, float f11) {
            super.mo25745b(kcSeekBar, i11, f11);
            BigDecimal bigDecimalM26361E = UnifyCrossLeverageSettingDialog.this.m26235S4().m26361E();
            long j11 = i11;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            if (bigDecimalValueOf.compareTo(bigDecimalM26361E) > 0) {
                UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog = UnifyCrossLeverageSettingDialog.this;
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j11);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                unifyCrossLeverageSettingDialog.m26221q5(bigDecimalValueOf2);
            }
            UnifyCrossLeverageSettingDialog.this.m26225s5("4");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$d */
    /* JADX INFO: compiled from: UnifyCrossLeverageSettingDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13282d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23257b;

        public C13282d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23257b = function;
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
            return this.f23257b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23257b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m26176E0() {
        return ((Boolean) this.f23252w0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G4 */
    public static final ContractEntity m26179G4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), unifyCrossLeverageSettingDialog.m26188Q4(), false, 2, null);
    }

    /* JADX INFO: renamed from: L4 */
    private final ContractEntity m26183L4() {
        return (ContractEntity) this.f23253x0.getValue();
    }

    /* JADX INFO: renamed from: M4 */
    private final BigDecimal m26184M4() {
        return (BigDecimal) this.f23254y0.getValue();
    }

    /* JADX INFO: renamed from: N4 */
    private final FuturesHeaderStreamViewModel m26185N4() {
        return (FuturesHeaderStreamViewModel) this.f23250u0.getValue();
    }

    /* JADX INFO: renamed from: O4 */
    private final com.kubi.futures.trade.vm.u m26186O4() {
        return (com.kubi.futures.trade.vm.u) this.f23249t0.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    private final WrapperLoadingView m26187P4() {
        return (WrapperLoadingView) this.f23245D0.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    private final String m26188Q4() {
        return (String) this.f23251v0.getValue();
    }

    /* JADX INFO: renamed from: R4 */
    private final UserKycLeverageViewModel m26189R4() {
        return (UserKycLeverageViewModel) this.f23248s0.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    private final boolean m26190T4(InterfaceC4984e interfaceC4984e) {
        CrossLeverageEntity crossLeverageEntity;
        if (interfaceC4984e == null) {
            this.f23244C0 = false;
            return false;
        }
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 != null) {
            ConstraintLayout clAdjust = c36777i1M26234K4.f80236d;
            Intrinsics.checkNotNullExpressionValue(clAdjust, "clAdjust");
            C27046k.m66685H(clAdjust);
            ConstraintLayout clTitle = c36777i1M26234K4.f80238f;
            Intrinsics.checkNotNullExpressionValue(clTitle, "clTitle");
            C27046k.m66685H(clTitle);
            c36777i1M26234K4.f80247o.setText(C37569d.m84684y());
        }
        SymbolsCrossLeverage symbolsCrossLeverage = (SymbolsCrossLeverage) m26186O4().B().getValue();
        m26219p5(C5003h.m5397a((symbolsCrossLeverage == null || (crossLeverageEntity = (CrossLeverageEntity) symbolsCrossLeverage.get((Object) m26188Q4())) == null) ? null : crossLeverageEntity.getLeverage()));
        m26217o5(null);
        this.f23244C0 = true;
        return true;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m26198b5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(R$string.kumex_modify_margin_margin, R$string.kumex_cross_modify_position_leverage_desc, null, 4, null);
        FragmentManager childFragmentManager = unifyCrossLeverageSettingDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "CrossLeverageModifyMargin");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m26199c5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, boolean z11) {
        if (!z11) {
            unifyCrossLeverageSettingDialog.m26225s5("3");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m26200d5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        unifyCrossLeverageSettingDialog.m26225s5("1");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m26201e5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        unifyCrossLeverageSettingDialog.m26225s5("2");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m26203g5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        unifyCrossLeverageSettingDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m26204h5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        unifyCrossLeverageSettingDialog.m26213m5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public static final Unit m26209k5() {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public final C36777i1 m26234K4() {
        return (C36777i1) this.f23246q0.getValue(this, f23241F0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: S4 */
    public final UnifyCrossLeverageSettingViewModel m26235S4() {
        return (UnifyCrossLeverageSettingViewModel) this.f23247r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.95f);
        return inflater.inflate(R$layout.bkumex_dialog_unify_cross_leverage_setting, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * getF43576g0()));
        String strM36552b = C17060n0.m36552b();
        String str = this.f23255z0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = "CROSS".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96593e(strM36552b, str, "1", jSONObject.put("marginType", lowerCase).put("isTrialFunds", false));
        m26186O4().b();
        WrapperLoadingView wrapperLoadingViewM26187P4 = m26187P4();
        if (wrapperLoadingViewM26187P4 != null) {
            wrapperLoadingViewM26187P4.showLoading();
        }
        initView();
        m26192V4();
    }

    public UnifyCrossLeverageSettingDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$2
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
        this.f23247r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UnifyCrossLeverageSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$7
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
        this.f23248s0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserKycLeverageViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.UnifyCrossLeverageSettingDialog$special$$inlined$viewModels$default$10
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
        this.f23249t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.e6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26182J4(this.f23326b);
            }
        });
        this.f23250u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.f6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26181I4(this.f23336b);
            }
        });
        this.f23251v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.g6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26223r5(this.f23344b);
            }
        });
        this.f23252w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.h6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(UnifyCrossLeverageSettingDialog.m26205i5(this.f23352b));
            }
        });
        this.f23253x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.i6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26179G4(this.f23362b);
            }
        });
        this.f23254y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.j6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26180H4(this.f23369b);
            }
        });
        this.f23255z0 = "TradeLev";
        this.f23242A0 = BigDecimal.ZERO;
        this.f23245D0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.k6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26211l5(this.f23378b);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public static final BigDecimal m26180H4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        Serializable serializable;
        Bundle arguments = unifyCrossLeverageSettingDialog.getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("data");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof BigDecimal)) {
            return null;
        }
        return (BigDecimal) serializable;
    }

    /* JADX INFO: renamed from: I4 */
    public static final FuturesHeaderStreamViewModel m26181I4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        return com.kubi.futures.trade.submit.panel.header.p1.a(unifyCrossLeverageSettingDialog);
    }

    /* JADX INFO: renamed from: J4 */
    public static final com.kubi.futures.trade.vm.u m26182J4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        return com.kubi.futures.trade.vm.v.b(unifyCrossLeverageSettingDialog, unifyCrossLeverageSettingDialog.m26188Q4(), unifyCrossLeverageSettingDialog.m26176E0(), (String) null, (MultiBizType) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: U4 */
    private final void m26191U4() {
        BigDecimal f25022z;
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null || (f25022z = c36777i1M26234K4.f80244l.getF25022z()) == null || c36777i1M26234K4.f80253u.getF44406k()) {
            return;
        }
        c36777i1M26234K4.f80253u.m55043o();
        m26185N4().N();
        BigDecimal bigDecimalMin = f25022z.min(m26235S4().m26361E());
        UnifyCrossLeverageSettingViewModel unifyCrossLeverageSettingViewModelM26235S4 = m26235S4();
        String strM26188Q4 = m26188Q4();
        String plainString = C6447a.m11724a(bigDecimalMin).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        unifyCrossLeverageSettingViewModelM26235S4.m26364H(strM26188Q4, plainString, m26176E0());
    }

    /* JADX INFO: renamed from: V4 */
    private final void m26192V4() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m26235S4().m26362F().observe(viewLifecycleOwner, new C13282d(new Function1() { // from class: com.kubi.futures.settings.s6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26193W4(this.f23448b, (BigDecimal) obj);
            }
        }));
        m26189R4().m26440n().observe(viewLifecycleOwner, new C13282d(new Function1() { // from class: com.kubi.futures.settings.t6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26194X4(this.f23459b, (KycLeverageEntity) obj);
            }
        }));
        m26235S4().m26359C().observe(viewLifecycleOwner, new C13282d(new Function1() { // from class: com.kubi.futures.settings.u6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26195Y4(this.f23468b, (Pair) obj);
            }
        }));
        m26186O4().C().observe(viewLifecycleOwner, new C13282d(new Function1() { // from class: com.kubi.futures.settings.c6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26196Z4(this.f23305b, (InterfaceC4984e) obj);
            }
        }));
        m26235S4().mo26360D().observe(viewLifecycleOwner, new C13282d(new Function1() { // from class: com.kubi.futures.settings.d6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26197a5(this.f23317b, (BigDecimal) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m26193W4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, BigDecimal bigDecimal) {
        ModifyLeverageInputView modifyLeverageInputView;
        unifyCrossLeverageSettingDialog.m26227t5();
        unifyCrossLeverageSettingDialog.m26221q5(C41014a.m89921F(unifyCrossLeverageSettingDialog.m26184M4(), "3"));
        C36777i1 c36777i1M26234K4 = unifyCrossLeverageSettingDialog.m26234K4();
        if (c36777i1M26234K4 != null && (modifyLeverageInputView = c36777i1M26234K4.f80244l) != null) {
            modifyLeverageInputView.setMax(unifyCrossLeverageSettingDialog.m26235S4().m26361E());
        }
        WrapperLoadingView wrapperLoadingViewM26187P4 = unifyCrossLeverageSettingDialog.m26187P4();
        if (wrapperLoadingViewM26187P4 != null) {
            wrapperLoadingViewM26187P4.showContent();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m26194X4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, KycLeverageEntity kycLeverageEntity) {
        unifyCrossLeverageSettingDialog.m26207j5(kycLeverageEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m26195Y4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, Pair pair) {
        KcPrimaryButton kcPrimaryButton;
        C36777i1 c36777i1M26234K4 = unifyCrossLeverageSettingDialog.m26234K4();
        if (c36777i1M26234K4 != null && (kcPrimaryButton = c36777i1M26234K4.f80253u) != null) {
            kcPrimaryButton.mo28851l();
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            unifyCrossLeverageSettingDialog.dismissAllowingStateLoss();
        } else {
            C17058m0.m36550e(unifyCrossLeverageSettingDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m26196Z4(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, InterfaceC4984e interfaceC4984e) {
        unifyCrossLeverageSettingDialog.m26190T4(interfaceC4984e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m26197a5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog, BigDecimal bigDecimal) {
        unifyCrossLeverageSettingDialog.m26215n5(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m26202f5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        unifyCrossLeverageSettingDialog.m26191U4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final boolean m26205i5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        Boolean boolValueOf;
        Bundle arguments = unifyCrossLeverageSettingDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    private final void initView() {
        CharSequence charSequenceM26188Q4;
        int i11;
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        BaseTextView baseTextView = c36777i1M26234K4.f80251s;
        ContractEntity contractEntityM26183L4 = m26183L4();
        if (contractEntityM26183L4 == null || (charSequenceM26188Q4 = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM26183L4)) == null) {
            charSequenceM26188Q4 = m26188Q4();
        }
        baseTextView.setText(charSequenceM26188Q4);
        AppCompatImageView ivBack = c36777i1M26234K4.f80245m;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewExtKt.m66575f(ivBack, new Function1() { // from class: com.kubi.futures.settings.b6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26203g5(this.f23293b, (View) obj);
            }
        });
        int iM84615e = C37567b.m84615e(m26183L4(), false, 1, null);
        c36777i1M26234K4.f80244l.setPrecision(2);
        c36777i1M26234K4.f80244l.setMin(new BigDecimal("0.01"));
        ModifyLeverageInputView modifyLeverageInputView = c36777i1M26234K4.f80244l;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iM84615e);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        modifyLeverageInputView.setMax(bigDecimalValueOf);
        c36777i1M26234K4.f80244l.setOnValueChangedListener(new Function1() { // from class: com.kubi.futures.settings.m6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26204h5(this.f23395b, (BigDecimal) obj);
            }
        });
        c36777i1M26234K4.f80248p.setNeedDash(true);
        DashTextView marginLabel = c36777i1M26234K4.f80248p;
        Intrinsics.checkNotNullExpressionValue(marginLabel, "marginLabel");
        C27046k.m66711z(marginLabel, 0L, new Function0() { // from class: com.kubi.futures.settings.n6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26198b5(this.f23406b);
            }
        }, 1, null);
        c36777i1M26234K4.f80244l.setOnFocusChangeListener(new Function1() { // from class: com.kubi.futures.settings.o6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyCrossLeverageSettingDialog.m26199c5(this.f23416b, ((Boolean) obj).booleanValue());
            }
        });
        c36777i1M26234K4.f80244l.setPlusListener(new Function0() { // from class: com.kubi.futures.settings.p6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26200d5(this.f23424b);
            }
        });
        c36777i1M26234K4.f80244l.setSubListener(new Function0() { // from class: com.kubi.futures.settings.q6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26201e5(this.f23431b);
            }
        });
        KcSeekBar kcSeekBar = c36777i1M26234K4.f80249q;
        float f11 = iM84615e;
        kcSeekBar.setProgressFormatCallback(new C13279a());
        kcSeekBar.setSectionTextFormatCallback(new C13280b());
        kcSeekBar.setMin(0.0f);
        kcSeekBar.setMax(f11);
        if (f11 % 4.0f == 0.0f) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        kcSeekBar.setSectionCount(i11);
        c36777i1M26234K4.f80249q.setOnSimpleProgressChangedListener(new C13281c());
        KcPrimaryButton tvConfirm = c36777i1M26234K4.f80253u;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.settings.r6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyCrossLeverageSettingDialog.m26202f5(this.f23439b);
            }
        }, 1, null);
        if (C41014a.m89917B(m26184M4())) {
            m26219p5(null);
        } else {
            m26219p5(m26184M4());
        }
    }

    /* JADX INFO: renamed from: j5 */
    private final void m26207j5(KycLeverageEntity kycLeverageEntity) {
        boolean zAreEqual;
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        if (KuMexDepend.f30378a.m35905g().c()) {
            if (kycLeverageEntity != null) {
                zAreEqual = Intrinsics.areEqual(kycLeverageEntity.getShowGuide(), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                ConstraintLayout hintCl = c36777i1M26234K4.f80243k;
                Intrinsics.checkNotNullExpressionValue(hintCl, "hintCl");
                C27046k.m66685H(hintCl);
                c36777i1M26234K4.f80242j.setText(C27017c.f54310a.m66516f(R$string.kumex_leverage_kyc_guide, C17054k0.m36530d(kycLeverageEntity.getUserMaxLeverage(), false, 1, null), C17054k0.m36530d(kycLeverageEntity.getSiteMaxLeverage(), false, 1, null)));
                BaseTextView verifyTv = c36777i1M26234K4.f80254v;
                Intrinsics.checkNotNullExpressionValue(verifyTv, "verifyTv");
                C27046k.m66711z(verifyTv, 0L, new Function0() { // from class: com.kubi.futures.settings.l6
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnifyCrossLeverageSettingDialog.m26209k5();
                    }
                }, 1, null);
                return;
            }
        }
        ConstraintLayout hintCl2 = c36777i1M26234K4.f80243k;
        Intrinsics.checkNotNullExpressionValue(hintCl2, "hintCl");
        C27046k.m66700o(hintCl2);
    }

    /* JADX INFO: renamed from: l5 */
    public static final WrapperLoadingView m26211l5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        ConstraintLayout constraintLayout;
        C36777i1 c36777i1M26234K4 = unifyCrossLeverageSettingDialog.m26234K4();
        if (c36777i1M26234K4 != null && (constraintLayout = c36777i1M26234K4.f80237e) != null) {
            return WrapperLoadingView.injectView(constraintLayout);
        }
        return null;
    }

    /* JADX INFO: renamed from: m5 */
    private final void m26213m5(BigDecimal bigDecimal) {
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        this.f23243B0 = bigDecimal;
        BigDecimal bigDecimalM26361E = m26235S4().m26361E();
        if (bigDecimal.compareTo(bigDecimalM26361E) > 0) {
            m26221q5(bigDecimalM26361E);
            return;
        }
        c36777i1M26234K4.f80249q.setProgress(bigDecimal.floatValue());
        c36777i1M26234K4.f80253u.setEnabled(!C41014a.m89919D(bigDecimal));
        m26227t5();
        m26217o5(bigDecimal);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    /* JADX INFO: renamed from: n5 */
    private final void m26215n5(BigDecimal bigDecimal) {
        String strM92640e;
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        this.f23242A0 = C27039d.m66656p(bigDecimal);
        if (!C41014a.m89917B(bigDecimal) && !C41014a.m89917B(m26184M4())) {
            ConstraintLayout clAdjust = c36777i1M26234K4.f80236d;
            Intrinsics.checkNotNullExpressionValue(clAdjust, "clAdjust");
            C27046k.m66685H(clAdjust);
            ConstraintLayout clTitle = c36777i1M26234K4.f80238f;
            Intrinsics.checkNotNullExpressionValue(clTitle, "clTitle");
            C27046k.m66685H(clTitle);
            BaseTextView baseTextView = c36777i1M26234K4.f80247o;
            if (bigDecimal != null) {
                BigDecimal bigDecimalDivide = bigDecimal.divide(C27039d.m66656p(m26184M4()), RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                if (bigDecimalDivide != null) {
                    strM92640e = C42180b.m92640e(bigDecimalDivide, RoundingMode.DOWN, C37567b.m84623m(m26183L4()), true, true, true, 0, null, 96, null);
                } else {
                    strM92640e = null;
                }
            } else {
                strM92640e = null;
            }
            baseTextView.setText(strM92640e);
            return;
        }
        c36777i1M26234K4.f80247o.setText(C37569d.m84684y());
    }

    /* JADX INFO: renamed from: o5 */
    private final void m26217o5(BigDecimal bigDecimal) {
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        if (bigDecimal != null) {
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal2) > 0 && !this.f23244C0) {
                if (C41014a.m89922G(this.f23242A0, null, 1, null).compareTo(bigDecimal2) <= 0) {
                    Group adjustGroup = c36777i1M26234K4.f80234b;
                    Intrinsics.checkNotNullExpressionValue(adjustGroup, "adjustGroup");
                    ViewExtKt.m66577h(adjustGroup);
                    return;
                }
                Group adjustGroup2 = c36777i1M26234K4.f80234b;
                Intrinsics.checkNotNullExpressionValue(adjustGroup2, "adjustGroup");
                C27046k.m66685H(adjustGroup2);
                BigDecimal currentSymbolOfMargin = this.f23242A0;
                Intrinsics.checkNotNullExpressionValue(currentSymbolOfMargin, "currentSymbolOfMargin");
                BigDecimal bigDecimalDivide = currentSymbolOfMargin.divide(bigDecimal, RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                c36777i1M26234K4.f80246n.setText(C27041f.m66669i(C42180b.m92640e(bigDecimalDivide, RoundingMode.DOWN, C37567b.m84623m(m26183L4()), true, true, true, 0, null, 96, null), C27017c.f54310a.m66516f(R$string.stub, new Object[0])));
                return;
            }
        }
        c36777i1M26234K4.f80246n.setText(C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    /* JADX INFO: renamed from: p5 */
    private final void m26219p5(BigDecimal bigDecimal) {
        String strM84684y;
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        if (bigDecimal == null || (strM84684y = C17054k0.m36530d(bigDecimal, false, 1, null)) == null) {
            strM84684y = C37569d.m84684y();
        }
        DashTextView dashTextView = c36777i1M26234K4.f80240h;
        C27017c c27017c = C27017c.f54310a;
        dashTextView.setText(c27017c.m66516f(R$string.kumex_modify_leverage_current_leverage, strM84684y));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        DashTextView currentLeverage = c36777i1M26234K4.f80240h;
        Intrinsics.checkNotNullExpressionValue(currentLeverage, "currentLeverage");
        highlightTextHelper.m54120f(currentLeverage, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public final void m26221q5(BigDecimal bigDecimal) {
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        c36777i1M26234K4.f80244l.setValue(bigDecimal);
    }

    /* JADX INFO: renamed from: r5 */
    public static final String m26223r5(UnifyCrossLeverageSettingDialog unifyCrossLeverageSettingDialog) {
        String string;
        Bundle arguments = unifyCrossLeverageSettingDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public final void m26225s5(String str) {
        String strM36552b = C17060n0.m36552b();
        String str2 = this.f23255z0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = "CROSS".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96589a(strM36552b, str2, str, jSONObject.put("marginType", lowerCase).put("isTrialFunds", String.valueOf(m26176E0())));
    }

    /* JADX INFO: renamed from: t5 */
    private final void m26227t5() {
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 == null) {
            return;
        }
        float fFloatValue = C27039d.m66656p(c36777i1M26234K4.f80244l.getF25022z()).floatValue();
        if (C27039d.m66656p(m26184M4()).compareTo(m26235S4().m26361E()) > 0) {
            AlignTopTextView warning = c36777i1M26234K4.f80255w;
            Intrinsics.checkNotNullExpressionValue(warning, "warning");
            C27046k.m66685H(warning);
            c36777i1M26234K4.f80255w.setText(getString(R$string.kumex_current_lever_higher_max, C17054k0.m36530d(m26235S4().m26361E(), false, 1, null)));
            AlignTopTextView warning2 = c36777i1M26234K4.f80255w;
            Intrinsics.checkNotNullExpressionValue(warning2, "warning");
            C13402k0.m26334a(warning2, R$color.secondary, R$drawable.shape_secondary8_8r);
            return;
        }
        if (fFloatValue > 20.0f) {
            AlignTopTextView warning3 = c36777i1M26234K4.f80255w;
            Intrinsics.checkNotNullExpressionValue(warning3, "warning");
            C27046k.m66685H(warning3);
            AlignTopTextView alignTopTextView = c36777i1M26234K4.f80255w;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.leverage_hight_price_up_down_percent;
            String strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(1.0f / fFloatValue)), null, RoundingMode.HALF_UP, 0, false, false, false, 61, null);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            alignTopTextView.setText(c27017c.m66516f(i11, strM92642g, C42180b.m92642g(ONE, null, null, 0, false, false, false, 63, null)));
            AlignTopTextView warning4 = c36777i1M26234K4.f80255w;
            Intrinsics.checkNotNullExpressionValue(warning4, "warning");
            C13402k0.m26334a(warning4, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        if (fFloatValue >= 10.0f) {
            AlignTopTextView warning5 = c36777i1M26234K4.f80255w;
            Intrinsics.checkNotNullExpressionValue(warning5, "warning");
            C27046k.m66685H(warning5);
            c36777i1M26234K4.f80255w.setText(C27017c.f54310a.m66516f(R$string.current_leverage_high_pay_attention_risk_liquidation, new Object[0]));
            AlignTopTextView warning6 = c36777i1M26234K4.f80255w;
            Intrinsics.checkNotNullExpressionValue(warning6, "warning");
            C13402k0.m26334a(warning6, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        AlignTopTextView warning7 = c36777i1M26234K4.f80255w;
        Intrinsics.checkNotNullExpressionValue(warning7, "warning");
        ViewExtKt.m66577h(warning7);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        KcSeekBar kcSeekBar;
        super.onResume();
        m26235S4().m26366z(m26188Q4(), m26176E0());
        m26189R4().m26439d(m26188Q4(), "CROSS");
        m26235S4().mo26365y(m26188Q4());
        C36777i1 c36777i1M26234K4 = m26234K4();
        if (c36777i1M26234K4 != null && (kcSeekBar = c36777i1M26234K4.f80249q) != null) {
            kcSeekBar.requestLayout();
        }
    }
}
