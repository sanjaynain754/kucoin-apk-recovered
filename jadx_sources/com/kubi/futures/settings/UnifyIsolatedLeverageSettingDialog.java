package com.kubi.futures.settings;

import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cm.UnifyChangeLeverageResult;
import com.blankj.utilcode.util.C5267e0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.futures.settings.vm.UnifyIsolatedLeverageSettingViewModel;
import com.kubi.futures.settings.vm.UserKycLeverageViewModel;
import com.kubi.futures.trade.submit.panel.header.FuturesHeaderStreamViewModel;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36783j1;
import f00.C37304a;
import fm.C37567b;
import fm.C37569d;
import g00.InterfaceC37755g;
import g00.InterfaceC37766r;
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

/* JADX INFO: compiled from: UnifyIsolatedLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00105\u001a\u000206H\u0016J&\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010B\u001a\u00020@H\u0002J\u0018\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u000200H\u0002J\u0010\u0010L\u001a\u00020@2\u0006\u0010F\u001a\u000200H\u0002J\b\u0010M\u001a\u00020@H\u0002J\u0010\u0010N\u001a\u00020@2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020@2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010R\u001a\u00020H2\u0006\u0010F\u001a\u000200H\u0002J\b\u0010S\u001a\u00020@H\u0002J\u0010\u0010T\u001a\u00020@2\u0006\u0010F\u001a\u000200H\u0002J\u0012\u0010U\u001a\u00020@2\b\u0010V\u001a\u0004\u0018\u00010WH\u0002J\b\u0010X\u001a\u00020@H\u0002J\b\u0010Y\u001a\u00020@H\u0016J\b\u0010Z\u001a\u00020@H\u0002J\u0010\u0010[\u001a\u00020@2\u0006\u0010\\\u001a\u00020 H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b\"\u0010#R\u001d\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b'\u0010(R\u001d\u0010*\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u000f\u001a\u0004\b,\u0010-R#\u0010/\u001a\n 1*\u0004\u0018\u000100008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b2\u00103R\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^"}, m90084d2 = {"Lcom/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogUnifyIsolatedLeverageSettingBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogUnifyIsolatedLeverageSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/UnifyIsolatedLeverageSettingViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/UnifyIsolatedLeverageSettingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "userKycLeverageViewModel", "Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "getUserKycLeverageViewModel", "()Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "userKycLeverageViewModel$delegate", "futuresHeaderStreamViewModel", "Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "getFuturesHeaderStreamViewModel", "()Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "futuresHeaderStreamViewModel$delegate", "positionFuturesViewModel", "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "getPositionFuturesViewModel", "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "positionFuturesViewModel$delegate", "blockId", "", "symbol", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "currentLeverage", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "getCurrentLeverage", "()Ljava/math/BigDecimal;", "currentLeverage$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "setCurrentLeverage", "textView", "Landroid/widget/TextView;", "leverage", "isFirstSetInput", "", "hasInitializedLeverageInput", "hasUserAdjustedLeverage", "latestPositionSide", "onInputValueChanged", "initObserver", "onCurrentCalculateResult", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "onAfterCalculateResult", "isLeverageBackToInitial", "resetAfterToStub", "setLeverageInput", "kycHintCheck", "kycLeverageInfo", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "warningCheck", "onResume", "handleConfirmClick", "trackClick", "locationId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyIsolatedLeverageSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyIsolatedLeverageSettingDialog.kt\ncom/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n143#2,20:586\n106#3,15:606\n106#3,15:621\n1#4:636\n*S KotlinDebug\n*F\n+ 1 UnifyIsolatedLeverageSettingDialog.kt\ncom/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog\n*L\n73#1:586,20\n75#1:606,15\n76#1:621,15\n*E\n"})
public final class UnifyIsolatedLeverageSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    public boolean f23260A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f23261B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f23262C0;

    /* JADX INFO: renamed from: D0 */
    @NotNull
    public String f23263D0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f23264q0 = C45681e.m100799e(this, new Function1<UnifyIsolatedLeverageSettingDialog, C36783j1>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36783j1 invoke(@NotNull UnifyIsolatedLeverageSettingDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36783j1.m82424a(fragment.requireView());
        }
    }, new Function1<C36783j1, Unit>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36783j1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36783j1 c36783j1) {
            invoke(c36783j1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23265r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23266s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23267t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f23268u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final String f23269v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f23270w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f23271x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f23272y0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final Lazy f23273z0;

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ KProperty<Object>[] f23259F0 = {Reflection.property1(new PropertyReference1Impl(UnifyIsolatedLeverageSettingDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogUnifyIsolatedLeverageSettingBinding;", 0))};

    /* JADX INFO: renamed from: E0 */
    @NotNull
    public static final Companion f23258E0 = new Companion(null);

    /* JADX INFO: compiled from: UnifyIsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog;", "symbol", "", "leverage", "Ljava/math/BigDecimal;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final UnifyIsolatedLeverageSettingDialog newInstance(@NotNull String symbol, @NotNull BigDecimal leverage) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog = new UnifyIsolatedLeverageSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putSerializable("data", leverage);
            unifyIsolatedLeverageSettingDialog.setArguments(bundle);
            return unifyIsolatedLeverageSettingDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$a */
    /* JADX INFO: compiled from: UnifyIsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog$initView$7$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13295a implements KcSeekBar.InterfaceC23002a {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$b */
    /* JADX INFO: compiled from: UnifyIsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog$initView$7$2", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13296b implements KcSeekBar.InterfaceC23003b {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23003b
        /* JADX INFO: renamed from: a */
        public String mo21946a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$c */
    /* JADX INFO: compiled from: UnifyIsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/futures/settings/UnifyIsolatedLeverageSettingDialog$initView$8", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "getProgressOnActionUp", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13297c extends KcSeekBar.AbstractC23005d {
        public C13297c() {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog = UnifyIsolatedLeverageSettingDialog.this;
            long j11 = i11;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            unifyIsolatedLeverageSettingDialog.m26289v5(bigDecimalValueOf);
            UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog2 = UnifyIsolatedLeverageSettingDialog.this;
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            if (unifyIsolatedLeverageSettingDialog2.m26300l5(bigDecimalValueOf2)) {
                UnifyIsolatedLeverageSettingDialog.this.m26303t5();
                return;
            }
            UnifyIsolatedLeverageSettingDialog.this.f23262C0 = true;
            UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModelM26299V4 = UnifyIsolatedLeverageSettingDialog.this.m26299V4();
            String strM26253T4 = UnifyIsolatedLeverageSettingDialog.this.m26253T4();
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(j11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
            unifyIsolatedLeverageSettingViewModelM26299V4.m26431K(strM26253T4, bigDecimalValueOf3, "BOTH");
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d, com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23004c
        /* JADX INFO: renamed from: b */
        public void mo25745b(KcSeekBar kcSeekBar, int i11, float f11) {
            super.mo25745b(kcSeekBar, i11, f11);
            BigDecimal bigDecimalM26361E = UnifyIsolatedLeverageSettingDialog.this.m26299V4().m26361E();
            long j11 = i11;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            if (bigDecimalValueOf.compareTo(bigDecimalM26361E) > 0) {
                UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog = UnifyIsolatedLeverageSettingDialog.this;
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j11);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                unifyIsolatedLeverageSettingDialog.m26289v5(bigDecimalValueOf2);
            } else {
                bigDecimalM26361E = BigDecimal.valueOf(j11);
                Intrinsics.checkNotNullExpressionValue(bigDecimalM26361E, "valueOf(...)");
            }
            if (!UnifyIsolatedLeverageSettingDialog.this.m26300l5(bigDecimalM26361E)) {
                UnifyIsolatedLeverageSettingDialog.this.f23262C0 = true;
                UnifyIsolatedLeverageSettingDialog.this.m26299V4().m26431K(UnifyIsolatedLeverageSettingDialog.this.m26253T4(), bigDecimalM26361E, "BOTH");
            } else {
                UnifyIsolatedLeverageSettingDialog.this.m26303t5();
            }
            UnifyIsolatedLeverageSettingDialog.this.m26293x5("4");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$d */
    /* JADX INFO: compiled from: UnifyIsolatedLeverageSettingDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13298d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23275b;

        public C13298d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23275b = function;
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
            return this.f23275b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23275b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: u5 */
    private final void m26287u5(TextView textView, BigDecimal bigDecimal) {
        String strM36530d = C17054k0.m36530d(bigDecimal, false, 1, null);
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27017c.m66516f(R$string.kumex_modify_leverage_current_leverage, strM36530d));
        HighlightTextHelper.f43497a.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text))));
    }

    /* JADX INFO: renamed from: t5 */
    public final void m26303t5() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        this.f23262C0 = false;
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 != null && (baseTextView2 = c36783j1M26297N4.f80314r) != null) {
            baseTextView2.setText(C37569d.m84684y());
        }
        C36783j1 c36783j1M26297N5 = m26297N4();
        if (c36783j1M26297N5 == null || (baseTextView = c36783j1M26297N5.f80311o) == null) {
            return;
        }
        baseTextView.setText(C37569d.m84684y());
    }

    /* JADX INFO: renamed from: K4 */
    public static final ContractEntity m26246K4(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), unifyIsolatedLeverageSettingDialog.m26253T4(), false, 2, null);
    }

    /* JADX INFO: renamed from: O4 */
    private final ContractEntity m26249O4() {
        return (ContractEntity) this.f23271x0.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    private final BigDecimal m26250P4() {
        return (BigDecimal) this.f23273z0.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    private final FuturesHeaderStreamViewModel m26251Q4() {
        return (FuturesHeaderStreamViewModel) this.f23267t0.getValue();
    }

    /* JADX INFO: renamed from: R4 */
    private final WrapperLoadingView m26252R4() {
        return (WrapperLoadingView) this.f23272y0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public final String m26253T4() {
        return (String) this.f23270w0.getValue();
    }

    /* JADX INFO: renamed from: U4 */
    private final UserKycLeverageViewModel m26254U4() {
        return (UserKycLeverageViewModel) this.f23266s0.getValue();
    }

    /* JADX INFO: renamed from: d5 */
    public static final void m26262d5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, PositionEntity position) {
        BigDecimal bigDecimalM26250P4;
        ModifyLeverageInputView modifyLeverageInputView;
        Intrinsics.checkNotNullParameter(position, "position");
        unifyIsolatedLeverageSettingDialog.f23263D0 = C37569d.m84683x(position);
        if (position.getRealLeverage() != null) {
            BigDecimal realLeverage = position.getRealLeverage();
            if (realLeverage == null) {
                return;
            } else {
                unifyIsolatedLeverageSettingDialog.m26299V4().m26437R(unifyIsolatedLeverageSettingDialog.m26253T4(), realLeverage, "BOTH");
            }
        }
        C36783j1 c36783j1M26297N4 = unifyIsolatedLeverageSettingDialog.m26297N4();
        if (c36783j1M26297N4 == null || (modifyLeverageInputView = c36783j1M26297N4.f80309m) == null || (bigDecimalM26250P4 = modifyLeverageInputView.getF25022z()) == null) {
            bigDecimalM26250P4 = unifyIsolatedLeverageSettingDialog.m26250P4();
        }
        if (bigDecimalM26250P4.compareTo(BigDecimal.ZERO) <= 0) {
            bigDecimalM26250P4 = null;
        }
        if (bigDecimalM26250P4 == null) {
            bigDecimalM26250P4 = unifyIsolatedLeverageSettingDialog.m26250P4();
        }
        if (unifyIsolatedLeverageSettingDialog.f23262C0) {
            UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModelM26299V4 = unifyIsolatedLeverageSettingDialog.m26299V4();
            String strM26253T4 = unifyIsolatedLeverageSettingDialog.m26253T4();
            Intrinsics.checkNotNull(bigDecimalM26250P4);
            unifyIsolatedLeverageSettingViewModelM26299V4.m26436Q(strM26253T4, bigDecimalM26250P4, "BOTH");
        }
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m26263e5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, boolean z11) {
        if (!z11) {
            unifyIsolatedLeverageSettingDialog.m26293x5("3");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m26264f5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        unifyIsolatedLeverageSettingDialog.m26293x5("1");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m26265g5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        unifyIsolatedLeverageSettingDialog.m26293x5("2");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m26267i5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        unifyIsolatedLeverageSettingDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m26269j5() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/support/26693511734809?appNeedLang=true", null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m26271k5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        unifyIsolatedLeverageSettingDialog.m26282r5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m26276n5() {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: N4 */
    public final C36783j1 m26297N4() {
        return (C36783j1) this.f23264q0.getValue(this, f23259F0[0]);
    }

    /* JADX INFO: renamed from: S4 */
    public final com.kubi.futures.trade.vm.u m26298S4() {
        return (com.kubi.futures.trade.vm.u) this.f23268u0.getValue();
    }

    /* JADX INFO: renamed from: V4 */
    public final UnifyIsolatedLeverageSettingViewModel m26299V4() {
        return (UnifyIsolatedLeverageSettingViewModel) this.f23265r0.getValue();
    }

    /* JADX INFO: renamed from: l5 */
    public final boolean m26300l5(BigDecimal bigDecimal) {
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return bigDecimal.setScale(2, roundingMode).compareTo(m26250P4().setScale(2, roundingMode)) == 0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.95f);
        return inflater.inflate(R$layout.bkumex_dialog_unify_isolated_leverage_setting, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * getF43576g0()));
        String strM36552b = C17060n0.m36552b();
        String str = this.f23269v0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = SharedPositionInfo.MARGIN_MODE_ISOLATED.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96593e(strM36552b, str, "1", jSONObject.put("marginType", lowerCase).put("isTrialFunds", CredentialEntry.FALSE_STRING));
        initView();
        m26256X4();
        m26298S4().b();
        WrapperLoadingView wrapperLoadingViewM26252R4 = m26252R4();
        if (wrapperLoadingViewM26252R4 != null) {
            wrapperLoadingViewM26252R4.showLoading();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX INFO: renamed from: p5 */
    public final void m26301p5(UnifyChangeLeverageResult unifyChangeLeverageResult) {
        String strM84684y;
        String strM84684y2;
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null) {
            return;
        }
        if (this.f23262C0) {
            BaseTextView baseTextView = c36783j1M26297N4.f80314r;
            BigDecimal posMargin = unifyChangeLeverageResult.getPosMargin();
            if (posMargin == null) {
                strM84684y = C37569d.m84684y();
            } else {
                ContractEntity contractEntityM26249O4 = m26249O4();
                strM84684y = C42180b.m92640e(posMargin, null, C27039d.m66651k(contractEntityM26249O4 != null ? Integer.valueOf(C37567b.m84612b(contractEntityM26249O4)) : null, 2), true, true, true, 0, null, 97, null);
                if (strM84684y == null) {
                    strM84684y = C37569d.m84684y();
                }
            }
            baseTextView.setText(strM84684y);
            BaseTextView baseTextView2 = c36783j1M26297N4.f80311o;
            BigDecimal posPreLiqPrice = unifyChangeLeverageResult.getPosPreLiqPrice();
            if (posPreLiqPrice == null) {
                strM84684y2 = C37569d.m84684y();
            } else {
                BigDecimal bigDecimal = posPreLiqPrice.compareTo(BigDecimal.ZERO) > 0 ? posPreLiqPrice : null;
                if (bigDecimal == null || (strM84684y2 = C17054k0.m36540n(bigDecimal, m26249O4(), this.f23263D0, false, false, 12, null)) == null) {
                    strM84684y2 = C37569d.m84684y();
                }
            }
            baseTextView2.setText(strM84684y2);
        }
        BigDecimal riskLimitMax = unifyChangeLeverageResult.getRiskLimitMax();
        String strM84684y3 = (riskLimitMax == null || riskLimitMax.compareTo(BigDecimal.ZERO) <= 0) ? C37569d.m84684y() : C42180b.m92640e(riskLimitMax, null, C37567b.m84623m(m26249O4()), true, true, false, 0, null, 113, null);
        AlignTopTextView alignTopTextView = c36783j1M26297N4.f80308l;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.uta_isolate_lever_maxpos_order_value;
        ContractEntity contractEntityM26249O5 = m26249O4();
        alignTopTextView.setText(c27017c.m66516f(i11, strM84684y3, C27041f.m66668h(C27041f.m66677q(contractEntityM26249O5 != null ? contractEntityM26249O5.getSettleCurrency() : null))));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        AlignTopTextView holdPosition = c36783j1M26297N4.f80308l;
        Intrinsics.checkNotNullExpressionValue(holdPosition, "holdPosition");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        int i12 = R$color.c_text;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i12)));
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(holdPosition, pair, new Pair(textTagEnum, typefaceSpanM36545b));
        BigDecimal bigDecimalM66656p = C27039d.m66656p(unifyChangeLeverageResult.getPosPreDeltaMargin());
        if (bigDecimalM66656p.compareTo(BigDecimal.ZERO) <= 0) {
            KycLeverageEntity value = m26254U4().m26440n().getValue();
            if (value != null) {
                m26274m5(value);
                return;
            }
            ConstraintLayout hintCl = c36783j1M26297N4.f80307k;
            Intrinsics.checkNotNullExpressionValue(hintCl, "hintCl");
            ViewExtKt.m66577h(hintCl);
            return;
        }
        ConstraintLayout hintCl2 = c36783j1M26297N4.f80307k;
        Intrinsics.checkNotNullExpressionValue(hintCl2, "hintCl");
        C27046k.m66685H(hintCl2);
        BaseTextView verifyTv = c36783j1M26297N4.f80295A;
        Intrinsics.checkNotNullExpressionValue(verifyTv, "verifyTv");
        ViewExtKt.m66577h(verifyTv);
        String strM92640e = bigDecimalM66656p.compareTo(new BigDecimal("0.01")) < 0 ? "<0.01" : C42180b.m92640e(bigDecimalM66656p, RoundingMode.UP, C37567b.m84623m(m26249O4()), false, true, true, 0, null, 100, null);
        AlignTopTextView alignTopTextView2 = c36783j1M26297N4.f80306j;
        int i13 = R$string.uta_isolate_lever_reduce_amount_desc;
        ContractEntity contractEntityM26249O6 = m26249O4();
        alignTopTextView2.setText(c27017c.m66516f(i13, strM92640e, C27041f.m66669i(contractEntityM26249O6 != null ? contractEntityM26249O6.getSettleCurrency() : null, "USDT")));
        AlignTopTextView hint = c36783j1M26297N4.f80306j;
        Intrinsics.checkNotNullExpressionValue(hint, "hint");
        highlightTextHelper.m54120f(hint, new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i12))));
    }

    public UnifyIsolatedLeverageSettingDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$2
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
        this.f23265r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UnifyIsolatedLeverageSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$7
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
        this.f23266s0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserKycLeverageViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.UnifyIsolatedLeverageSettingDialog$special$$inlined$viewModels$default$10
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
        this.f23267t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.m7
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26248M4(this.f23396b);
            }
        });
        this.f23268u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.n7
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26284s5(this.f23407b);
            }
        });
        this.f23269v0 = "TradeLev";
        this.f23270w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.o7
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26291w5(this.f23417b);
            }
        });
        this.f23271x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.w6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26246K4(this.f23568b);
            }
        });
        this.f23272y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.x6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26278o5(this.f23577b);
            }
        });
        this.f23273z0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.y6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26247L4(this.f23585b);
            }
        });
        this.f23260A0 = true;
        this.f23263D0 = "buy";
    }

    /* JADX INFO: renamed from: L4 */
    public static final BigDecimal m26247L4(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        Serializable serializable;
        Bundle arguments = unifyIsolatedLeverageSettingDialog.getArguments();
        BigDecimal bigDecimal = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("data");
        } else {
            serializable = null;
        }
        if (serializable instanceof BigDecimal) {
            bigDecimal = (BigDecimal) serializable;
        }
        if (bigDecimal == null) {
            return BigDecimal.ONE;
        }
        return bigDecimal;
    }

    /* JADX INFO: renamed from: M4 */
    public static final FuturesHeaderStreamViewModel m26248M4(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        return com.kubi.futures.trade.submit.panel.header.p1.a(unifyIsolatedLeverageSettingDialog);
    }

    /* JADX INFO: renamed from: W4 */
    private final void m26255W4() {
        BigDecimal f25022z;
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null || (f25022z = c36783j1M26297N4.f80309m.getF25022z()) == null || c36783j1M26297N4.f80322z.getF44406k()) {
            return;
        }
        c36783j1M26297N4.f80322z.m55043o();
        m26251Q4().N();
        BigDecimal bigDecimalMin = f25022z.min(m26299V4().m26361E());
        UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModelM26299V4 = m26299V4();
        String strM26253T4 = m26253T4();
        String plainString = C6447a.m11724a(bigDecimalMin).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        unifyIsolatedLeverageSettingViewModelM26299V4.m26364H(strM26253T4, plainString, false);
    }

    /* JADX INFO: renamed from: X4 */
    private final void m26256X4() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m26299V4().m26362F().observe(viewLifecycleOwner, new C13298d(new Function1() { // from class: com.kubi.futures.settings.z6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26257Y4(this.f23593b, (BigDecimal) obj);
            }
        }));
        m26254U4().m26440n().observe(viewLifecycleOwner, new C13298d(new Function1() { // from class: com.kubi.futures.settings.a7
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26258Z4(this.f23286b, (KycLeverageEntity) obj);
            }
        }));
        m26299V4().m26359C().observe(viewLifecycleOwner, new C13298d(new Function1() { // from class: com.kubi.futures.settings.b7
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26259a5(this.f23294b, (Pair) obj);
            }
        }));
        m26299V4().m26435P().observe(viewLifecycleOwner, new C13298d(new Function1() { // from class: com.kubi.futures.settings.c7
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26260b5(this.f23306b, (UnifyChangeLeverageResult) obj);
            }
        }));
        m26299V4().m26434O().observe(viewLifecycleOwner, new C13298d(new Function1() { // from class: com.kubi.futures.settings.d7
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26261c5(this.f23318b, (UnifyChangeLeverageResult) obj);
            }
        }));
        m26298S4().a(new Observer() { // from class: com.kubi.futures.settings.e7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UnifyIsolatedLeverageSettingDialog.m26262d5(this.f23327b, (PositionEntity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m26257Y4(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, BigDecimal bigDecimal) {
        BigDecimal bigDecimalMin;
        C36783j1 c36783j1M26297N4 = unifyIsolatedLeverageSettingDialog.m26297N4();
        if (c36783j1M26297N4 == null) {
            return Unit.INSTANCE;
        }
        WrapperLoadingView wrapperLoadingViewM26252R4 = unifyIsolatedLeverageSettingDialog.m26252R4();
        if (wrapperLoadingViewM26252R4 != null) {
            wrapperLoadingViewM26252R4.showContent();
        }
        unifyIsolatedLeverageSettingDialog.m26295y5();
        ModifyLeverageInputView modifyLeverageInputView = c36783j1M26297N4.f80309m;
        Intrinsics.checkNotNull(bigDecimal);
        modifyLeverageInputView.setMax(bigDecimal);
        BigDecimal bigDecimalM26361E = unifyIsolatedLeverageSettingDialog.m26299V4().m26361E();
        if (unifyIsolatedLeverageSettingDialog.f23261B0) {
            BigDecimal f25022z = c36783j1M26297N4.f80309m.getF25022z();
            if (f25022z == null) {
                f25022z = unifyIsolatedLeverageSettingDialog.m26250P4();
            }
            bigDecimalMin = f25022z.min(bigDecimalM26361E);
        } else {
            bigDecimalMin = unifyIsolatedLeverageSettingDialog.m26250P4().min(bigDecimalM26361E);
        }
        BigDecimal f25022z2 = c36783j1M26297N4.f80309m.getF25022z();
        if (!unifyIsolatedLeverageSettingDialog.f23261B0 || f25022z2 == null || !Intrinsics.areEqual(f25022z2, bigDecimalMin)) {
            Intrinsics.checkNotNull(bigDecimalMin);
            unifyIsolatedLeverageSettingDialog.m26289v5(bigDecimalMin);
        }
        unifyIsolatedLeverageSettingDialog.f23261B0 = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m26258Z4(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, KycLeverageEntity kycLeverageEntity) {
        unifyIsolatedLeverageSettingDialog.m26274m5(kycLeverageEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m26259a5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, Pair pair) {
        KcPrimaryButton kcPrimaryButton;
        C36783j1 c36783j1M26297N4 = unifyIsolatedLeverageSettingDialog.m26297N4();
        if (c36783j1M26297N4 != null && (kcPrimaryButton = c36783j1M26297N4.f80322z) != null) {
            kcPrimaryButton.mo28851l();
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            unifyIsolatedLeverageSettingDialog.dismissAllowingStateLoss();
        } else {
            C17058m0.m36550e(unifyIsolatedLeverageSettingDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m26260b5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, UnifyChangeLeverageResult unifyChangeLeverageResult) {
        Intrinsics.checkNotNull(unifyChangeLeverageResult);
        unifyIsolatedLeverageSettingDialog.m26302q5(unifyChangeLeverageResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m26261c5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog, UnifyChangeLeverageResult unifyChangeLeverageResult) {
        Intrinsics.checkNotNull(unifyChangeLeverageResult);
        unifyIsolatedLeverageSettingDialog.m26301p5(unifyChangeLeverageResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m26266h5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        unifyIsolatedLeverageSettingDialog.m26255W4();
        return Unit.INSTANCE;
    }

    private final void initView() {
        CharSequence charSequenceM26253T4;
        int i11;
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null) {
            return;
        }
        BaseTextView baseTextView = c36783j1M26297N4.f80320x;
        ContractEntity contractEntityM26249O4 = m26249O4();
        if (contractEntityM26249O4 == null || (charSequenceM26253T4 = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM26249O4)) == null) {
            charSequenceM26253T4 = m26253T4();
        }
        baseTextView.setText(charSequenceM26253T4);
        AppCompatImageView ivBack = c36783j1M26297N4.f80310n;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewExtKt.m66575f(ivBack, new Function1() { // from class: com.kubi.futures.settings.v6
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26267i5(this.f23477b, (View) obj);
            }
        });
        BaseTextView riskLimit = c36783j1M26297N4.f80318v;
        Intrinsics.checkNotNullExpressionValue(riskLimit, "riskLimit");
        C27046k.m66711z(riskLimit, 0L, new Function0() { // from class: com.kubi.futures.settings.g7
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26269j5();
            }
        }, 1, null);
        int iM84615e = C37567b.m84615e(m26249O4(), false, 1, null);
        c36783j1M26297N4.f80309m.setPrecision(2);
        c36783j1M26297N4.f80309m.setMin(new BigDecimal("0.01"));
        ModifyLeverageInputView modifyLeverageInputView = c36783j1M26297N4.f80309m;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iM84615e);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        modifyLeverageInputView.setMax(bigDecimalValueOf);
        c36783j1M26297N4.f80309m.setOnValueChangedListener(new Function1() { // from class: com.kubi.futures.settings.h7
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26271k5(this.f23353b, (BigDecimal) obj);
            }
        });
        c36783j1M26297N4.f80309m.setOnFocusChangeListener(new Function1() { // from class: com.kubi.futures.settings.i7
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyIsolatedLeverageSettingDialog.m26263e5(this.f23363b, ((Boolean) obj).booleanValue());
            }
        });
        c36783j1M26297N4.f80309m.setPlusListener(new Function0() { // from class: com.kubi.futures.settings.j7
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26264f5(this.f23370b);
            }
        });
        c36783j1M26297N4.f80309m.setSubListener(new Function0() { // from class: com.kubi.futures.settings.k7
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26265g5(this.f23379b);
            }
        });
        KcSeekBar kcSeekBar = c36783j1M26297N4.f80317u;
        float f11 = iM84615e;
        kcSeekBar.setProgressFormatCallback(new C13295a());
        kcSeekBar.setSectionTextFormatCallback(new C13296b());
        kcSeekBar.setMin(0.0f);
        kcSeekBar.setMax(f11);
        if (f11 % 4.0f == 0.0f) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        kcSeekBar.setSectionCount(i11);
        c36783j1M26297N4.f80317u.setOnSimpleProgressChangedListener(new C13297c());
        KcPrimaryButton tvConfirm = c36783j1M26297N4.f80322z;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.settings.l7
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyIsolatedLeverageSettingDialog.m26266h5(this.f23387b);
            }
        }, 1, null);
        DashTextView currentLeverage = c36783j1M26297N4.f80304h;
        Intrinsics.checkNotNullExpressionValue(currentLeverage, "currentLeverage");
        m26287u5(currentLeverage, C41014a.m89921F(m26250P4(), "1"));
        c36783j1M26297N4.f80314r.setText(C37569d.m84684y());
        c36783j1M26297N4.f80311o.setText(C37569d.m84684y());
    }

    /* JADX INFO: renamed from: m5 */
    private final void m26274m5(KycLeverageEntity kycLeverageEntity) {
        boolean zAreEqual;
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null) {
            return;
        }
        if (KuMexDepend.f30378a.m35905g().c()) {
            if (kycLeverageEntity != null) {
                zAreEqual = Intrinsics.areEqual(kycLeverageEntity.getShowGuide(), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                ConstraintLayout hintCl = c36783j1M26297N4.f80307k;
                Intrinsics.checkNotNullExpressionValue(hintCl, "hintCl");
                C27046k.m66685H(hintCl);
                BaseTextView verifyTv = c36783j1M26297N4.f80295A;
                Intrinsics.checkNotNullExpressionValue(verifyTv, "verifyTv");
                C27046k.m66685H(verifyTv);
                c36783j1M26297N4.f80306j.setText(C27017c.f54310a.m66516f(R$string.kumex_leverage_kyc_guide, C17054k0.m36530d(kycLeverageEntity.getUserMaxLeverage(), false, 1, null), C17054k0.m36530d(kycLeverageEntity.getSiteMaxLeverage(), false, 1, null)));
                BaseTextView verifyTv2 = c36783j1M26297N4.f80295A;
                Intrinsics.checkNotNullExpressionValue(verifyTv2, "verifyTv");
                C27046k.m66711z(verifyTv2, 0L, new Function0() { // from class: com.kubi.futures.settings.f7
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnifyIsolatedLeverageSettingDialog.m26276n5();
                    }
                }, 1, null);
                return;
            }
        }
        ConstraintLayout hintCl2 = c36783j1M26297N4.f80307k;
        Intrinsics.checkNotNullExpressionValue(hintCl2, "hintCl");
        C27046k.m66700o(hintCl2);
    }

    /* JADX INFO: renamed from: o5 */
    public static final WrapperLoadingView m26278o5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        ConstraintLayout constraintLayout;
        C36783j1 c36783j1M26297N4 = unifyIsolatedLeverageSettingDialog.m26297N4();
        if (c36783j1M26297N4 != null && (constraintLayout = c36783j1M26297N4.f80301e) != null) {
            return WrapperLoadingView.injectView(constraintLayout);
        }
        return null;
    }

    /* JADX INFO: renamed from: r5 */
    private final void m26282r5(BigDecimal bigDecimal) {
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null) {
            return;
        }
        BigDecimal bigDecimalM26361E = m26299V4().m26361E();
        if (bigDecimal.compareTo(bigDecimalM26361E) > 0) {
            m26289v5(bigDecimalM26361E);
            return;
        }
        c36783j1M26297N4.f80317u.setProgress(bigDecimal.floatValue());
        c36783j1M26297N4.f80322z.setEnabled(!C41014a.m89919D(bigDecimal));
        m26295y5();
        if (!this.f23260A0) {
            if (m26300l5(bigDecimal)) {
                m26303t5();
            } else {
                this.f23262C0 = true;
                m26299V4().m26431K(m26253T4(), bigDecimal, "BOTH");
            }
        }
        this.f23260A0 = false;
    }

    /* JADX INFO: renamed from: s5 */
    public static final com.kubi.futures.trade.vm.u m26284s5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        return com.kubi.futures.trade.vm.v.b(unifyIsolatedLeverageSettingDialog, unifyIsolatedLeverageSettingDialog.m26253T4(), false, "BOTH", (MultiBizType) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public final void m26289v5(BigDecimal bigDecimal) {
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null) {
            return;
        }
        c36783j1M26297N4.f80309m.setValue(bigDecimal);
    }

    /* JADX INFO: renamed from: w5 */
    public static final String m26291w5(UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog) {
        String string;
        Bundle arguments = unifyIsolatedLeverageSettingDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x5 */
    public final void m26293x5(String str) {
        String strM36552b = C17060n0.m36552b();
        String str2 = this.f23269v0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = SharedPositionInfo.MARGIN_MODE_ISOLATED.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96589a(strM36552b, str2, str, jSONObject.put("marginType", lowerCase).put("isTrialFunds", CredentialEntry.FALSE_STRING));
    }

    /* JADX INFO: renamed from: y5 */
    private final void m26295y5() {
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null) {
            return;
        }
        float fFloatValue = C27039d.m66656p(c36783j1M26297N4.f80309m.getF25022z()).floatValue();
        if (C27039d.m66656p(m26250P4()).compareTo(m26299V4().m26361E()) > 0) {
            AlignTopTextView warning = c36783j1M26297N4.f80296B;
            Intrinsics.checkNotNullExpressionValue(warning, "warning");
            C27046k.m66685H(warning);
            c36783j1M26297N4.f80296B.setText(getString(R$string.kumex_current_lever_higher_max, C17054k0.m36530d(m26299V4().m26361E(), false, 1, null)));
            AlignTopTextView warning2 = c36783j1M26297N4.f80296B;
            Intrinsics.checkNotNullExpressionValue(warning2, "warning");
            C13402k0.m26334a(warning2, R$color.secondary, R$drawable.shape_secondary8_8r);
            return;
        }
        if (fFloatValue > 20.0f) {
            AlignTopTextView warning3 = c36783j1M26297N4.f80296B;
            Intrinsics.checkNotNullExpressionValue(warning3, "warning");
            C27046k.m66685H(warning3);
            AlignTopTextView alignTopTextView = c36783j1M26297N4.f80296B;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.leverage_hight_price_up_down_percent;
            String strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(1.0f / fFloatValue)), null, RoundingMode.HALF_UP, 0, false, false, false, 61, null);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            alignTopTextView.setText(c27017c.m66516f(i11, strM92642g, C42180b.m92642g(ONE, null, null, 0, false, false, false, 63, null)));
            AlignTopTextView warning4 = c36783j1M26297N4.f80296B;
            Intrinsics.checkNotNullExpressionValue(warning4, "warning");
            C13402k0.m26334a(warning4, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        if (fFloatValue >= 10.0f) {
            AlignTopTextView warning5 = c36783j1M26297N4.f80296B;
            Intrinsics.checkNotNullExpressionValue(warning5, "warning");
            C27046k.m66685H(warning5);
            c36783j1M26297N4.f80296B.setText(C27017c.f54310a.m66516f(R$string.current_leverage_high_pay_attention_risk_liquidation, new Object[0]));
            AlignTopTextView warning6 = c36783j1M26297N4.f80296B;
            Intrinsics.checkNotNullExpressionValue(warning6, "warning");
            C13402k0.m26334a(warning6, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        AlignTopTextView warning7 = c36783j1M26297N4.f80296B;
        Intrinsics.checkNotNullExpressionValue(warning7, "warning");
        ViewExtKt.m66577h(warning7);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        BigDecimal bigDecimalM26250P4;
        ModifyLeverageInputView modifyLeverageInputView;
        KcSeekBar kcSeekBar;
        super.onResume();
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 != null && (kcSeekBar = c36783j1M26297N4.f80317u) != null) {
            kcSeekBar.requestLayout();
        }
        m26299V4().m26366z(m26253T4(), false);
        m26254U4().m26439d(m26253T4(), SharedPositionInfo.MARGIN_MODE_ISOLATED);
        UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModelM26299V4 = m26299V4();
        String strM26253T4 = m26253T4();
        BigDecimal bigDecimalM26250P5 = m26250P4();
        Intrinsics.checkNotNullExpressionValue(bigDecimalM26250P5, "<get-currentLeverage>(...)");
        unifyIsolatedLeverageSettingViewModelM26299V4.m26432L(strM26253T4, bigDecimalM26250P5, "BOTH");
        C36783j1 c36783j1M26297N5 = m26297N4();
        if (c36783j1M26297N5 == null || (modifyLeverageInputView = c36783j1M26297N5.f80309m) == null || (bigDecimalM26250P4 = modifyLeverageInputView.getF25022z()) == null) {
            bigDecimalM26250P4 = m26250P4();
        }
        if (bigDecimalM26250P4.compareTo(BigDecimal.ZERO) <= 0) {
            bigDecimalM26250P4 = null;
        }
        if (bigDecimalM26250P4 == null) {
            bigDecimalM26250P4 = m26250P4();
        }
        UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModelM26299V5 = m26299V4();
        String strM26253T5 = m26253T4();
        Intrinsics.checkNotNull(bigDecimalM26250P4);
        unifyIsolatedLeverageSettingViewModelM26299V5.m26431K(strM26253T5, bigDecimalM26250P4, "BOTH");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX INFO: renamed from: q5 */
    public final void m26302q5(UnifyChangeLeverageResult unifyChangeLeverageResult) {
        String strM84684y;
        UnifyIsolatedLeverageSettingDialog unifyIsolatedLeverageSettingDialog;
        String strM84684y2;
        String strM84684y3;
        BigDecimal bigDecimal;
        Integer numValueOf;
        C36783j1 c36783j1M26297N4 = m26297N4();
        if (c36783j1M26297N4 == null) {
            return;
        }
        BigDecimal currentMargin = unifyChangeLeverageResult.getCurrentMargin();
        BigDecimal bigDecimalM66656p = C27039d.m66656p(currentMargin);
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalM66656p.compareTo(bigDecimal2) <= 0 && C27039d.m66656p(unifyChangeLeverageResult.getPosPreLiqPrice()).compareTo(bigDecimal2) <= 0) {
            Group adjustGroup = c36783j1M26297N4.f80298b;
            Intrinsics.checkNotNullExpressionValue(adjustGroup, "adjustGroup");
            ViewExtKt.m66577h(adjustGroup);
        } else {
            Group adjustGroup2 = c36783j1M26297N4.f80298b;
            Intrinsics.checkNotNullExpressionValue(adjustGroup2, "adjustGroup");
            C27046k.m66685H(adjustGroup2);
        }
        BaseTextView baseTextView = c36783j1M26297N4.f80315s;
        String settleCurrency = null;
        if (currentMargin != null) {
            ContractEntity contractEntityM26249O4 = m26249O4();
            if (contractEntityM26249O4 != null) {
                numValueOf = Integer.valueOf(C37567b.m84612b(contractEntityM26249O4));
            } else {
                numValueOf = null;
            }
            strM84684y = C42180b.m92640e(currentMargin, null, C27039d.m66651k(numValueOf, 2), true, true, true, 0, null, 97, null);
            if (strM84684y == null) {
                strM84684y = C37569d.m84684y();
            }
        } else {
            strM84684y = C37569d.m84684y();
        }
        baseTextView.setText(strM84684y);
        BaseTextView baseTextView2 = c36783j1M26297N4.f80312p;
        BigDecimal posPreLiqPrice = unifyChangeLeverageResult.getPosPreLiqPrice();
        if (posPreLiqPrice != null) {
            if (posPreLiqPrice.compareTo(bigDecimal2) > 0) {
                bigDecimal = posPreLiqPrice;
            } else {
                bigDecimal = null;
            }
            if (bigDecimal != null) {
                unifyIsolatedLeverageSettingDialog = this;
                strM84684y2 = C17054k0.m36540n(bigDecimal, m26249O4(), unifyIsolatedLeverageSettingDialog.f23263D0, false, false, 12, null);
                if (strM84684y2 == null) {
                }
            } else {
                unifyIsolatedLeverageSettingDialog = this;
            }
            strM84684y2 = C37569d.m84684y();
        } else {
            unifyIsolatedLeverageSettingDialog = this;
            strM84684y2 = C37569d.m84684y();
        }
        baseTextView2.setText(strM84684y2);
        BigDecimal riskLimitMax = unifyChangeLeverageResult.getRiskLimitMax();
        if (riskLimitMax != null && riskLimitMax.compareTo(bigDecimal2) > 0) {
            strM84684y3 = C42180b.m92640e(riskLimitMax, null, C37567b.m84623m(unifyIsolatedLeverageSettingDialog.m26249O4()), true, true, false, 0, null, 113, null);
        } else {
            strM84684y3 = C37569d.m84684y();
        }
        AlignTopTextView alignTopTextView = c36783j1M26297N4.f80308l;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.uta_isolate_lever_maxpos_order_value;
        ContractEntity contractEntityM26249O5 = unifyIsolatedLeverageSettingDialog.m26249O4();
        if (contractEntityM26249O5 != null) {
            settleCurrency = contractEntityM26249O5.getSettleCurrency();
        }
        alignTopTextView.setText(c27017c.m66516f(i11, strM84684y3, C27041f.m66668h(C27041f.m66677q(settleCurrency))));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        AlignTopTextView holdPosition = c36783j1M26297N4.f80308l;
        Intrinsics.checkNotNullExpressionValue(holdPosition, "holdPosition");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text)));
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(holdPosition, pair, new Pair(textTagEnum, typefaceSpanM36545b));
    }
}
