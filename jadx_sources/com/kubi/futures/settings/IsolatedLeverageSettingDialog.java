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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.futures.settings.vm.IsolatedLeverageSettingViewModel;
import com.kubi.futures.settings.vm.UserKycLeverageViewModel;
import com.kubi.futures.trade.submit.panel.header.FuturesHeaderStreamViewModel;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36758f0;
import f00.C37304a;
import fm.C37567b;
import g00.InterfaceC37755g;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
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

/* JADX INFO: compiled from: IsolatedLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 _2\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00107\u001a\u000208H\u0016J&\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010D\u001a\u00020BH\u0002J\u0018\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u000202H\u0002J\u0010\u0010I\u001a\u00020B2\u0006\u0010H\u001a\u000202H\u0002J\b\u0010J\u001a\u00020BH\u0002J\b\u0010K\u001a\u00020BH\u0002J\u0010\u0010L\u001a\u00020B2\u0006\u0010M\u001a\u00020\u001dH\u0002J \u0010N\u001a\u00020B2\u0016\u0010O\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010Q\u0012\u0006\u0012\u0004\u0018\u00010R0PH\u0002J\u0010\u0010S\u001a\u00020B2\u0006\u0010H\u001a\u000202H\u0002J\u0012\u0010T\u001a\u00020B2\b\u0010U\u001a\u0004\u0018\u00010VH\u0002J\b\u0010W\u001a\u00020BH\u0002J\u0017\u0010X\u001a\u00020B2\b\u0010Y\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010ZJ\b\u0010[\u001a\u00020BH\u0016J\b\u0010\\\u001a\u00020BH\u0002J\u0010\u0010]\u001a\u00020B2\u0006\u0010^\u001a\u00020\u001bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001c\u0010\u001eR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b%\u0010\"R\u001d\u0010'\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u000f\u001a\u0004\b)\u0010*R\u001d\u0010,\u001a\u0004\u0018\u00010-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b.\u0010/R#\u00101\u001a\n 3*\u0004\u0018\u000102028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b4\u00105¨\u0006`"}, m90084d2 = {"Lcom/kubi/futures/settings/IsolatedLeverageSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogIsolatedLeverageSettingBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogIsolatedLeverageSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/IsolatedLeverageSettingViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/IsolatedLeverageSettingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "userKycLeverageViewModel", "Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "getUserKycLeverageViewModel", "()Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "userKycLeverageViewModel$delegate", "futuresHeaderStreamViewModel", "Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "getFuturesHeaderStreamViewModel", "()Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "futuresHeaderStreamViewModel$delegate", "blockId", "", "isTrial", "", "()Z", "isTrial$delegate", "pageTrackId", "getPageTrackId", "()Ljava/lang/String;", "pageTrackId$delegate", "symbol", "getSymbol", "symbol$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "currentLeverage", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "getCurrentLeverage", "()Ljava/math/BigDecimal;", "currentLeverage$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "setCurrentLeverage", "textView", "Landroid/widget/TextView;", "leverage", "onInputValueChanged", "initObserver", "fetchRetailLeverageHint", "updateEduTopAnchor", "useRetailHintAnchor", "onEuropeUnlockLeverageLevelChanged", "it", "Lkotlin/Pair;", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "", "setLeverageInput", "kycHintCheck", "kycLeverageInfo", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "warningCheck", "trialLeverageHintCheck", "showTrialCrossMaxLeverage", "(Ljava/lang/Boolean;)V", "onResume", "handleConfirmClick", "trackClick", "locationId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedLeverageSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedLeverageSettingDialog.kt\ncom/kubi/futures/settings/IsolatedLeverageSettingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,476:1\n143#2,20:477\n106#3,15:497\n106#3,15:512\n254#4:527\n*S KotlinDebug\n*F\n+ 1 IsolatedLeverageSettingDialog.kt\ncom/kubi/futures/settings/IsolatedLeverageSettingDialog\n*L\n71#1:477,20\n73#1:497,15\n74#1:512,15\n440#1:527\n*E\n"})
public final class IsolatedLeverageSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public final Lazy f23157A0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f23158q0 = C45681e.m100799e(this, new Function1<IsolatedLeverageSettingDialog, C36758f0>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36758f0 invoke(@NotNull IsolatedLeverageSettingDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36758f0.m82367a(fragment.requireView());
        }
    }, new Function1<C36758f0, Unit>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36758f0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36758f0 c36758f0) {
            invoke(c36758f0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23159r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23160s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23161t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final String f23162u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f23163v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f23164w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f23165x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f23166y0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final Lazy f23167z0;

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ KProperty<Object>[] f23156C0 = {Reflection.property1(new PropertyReference1Impl(IsolatedLeverageSettingDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogIsolatedLeverageSettingBinding;", 0))};

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final Companion f23155B0 = new Companion(null);

    /* JADX INFO: compiled from: IsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/settings/IsolatedLeverageSettingDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/futures/settings/IsolatedLeverageSettingDialog;", "symbol", "", "leverage", "Ljava/math/BigDecimal;", "isTrial", "", "pageId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ IsolatedLeverageSettingDialog newInstance$default(Companion companion, String str, BigDecimal bigDecimal, boolean z11, String str2, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str2 = C17060n0.m36552b();
            }
            return companion.newInstance(str, bigDecimal, z11, str2);
        }

        @NotNull
        public final IsolatedLeverageSettingDialog newInstance(@NotNull String symbol, @NotNull BigDecimal leverage, boolean isTrial, @NotNull String pageId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            IsolatedLeverageSettingDialog isolatedLeverageSettingDialog = new IsolatedLeverageSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putSerializable("data", leverage);
            bundle.putBoolean("data_1", isTrial);
            bundle.putString("data_2", pageId);
            isolatedLeverageSettingDialog.setArguments(bundle);
            return isolatedLeverageSettingDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.IsolatedLeverageSettingDialog$a */
    /* JADX INFO: compiled from: IsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/IsolatedLeverageSettingDialog$initView$6$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13241a implements KcSeekBar.InterfaceC23002a {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.IsolatedLeverageSettingDialog$b */
    /* JADX INFO: compiled from: IsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/IsolatedLeverageSettingDialog$initView$6$2", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13242b implements KcSeekBar.InterfaceC23003b {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23003b
        /* JADX INFO: renamed from: a */
        public String mo21946a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.IsolatedLeverageSettingDialog$c */
    /* JADX INFO: compiled from: IsolatedLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/futures/settings/IsolatedLeverageSettingDialog$initView$7", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "getProgressOnActionUp", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13243c extends KcSeekBar.AbstractC23005d {
        public C13243c() {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            IsolatedLeverageSettingDialog isolatedLeverageSettingDialog = IsolatedLeverageSettingDialog.this;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            isolatedLeverageSettingDialog.m25823s5(bigDecimalValueOf);
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d, com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23004c
        /* JADX INFO: renamed from: b */
        public void mo25745b(KcSeekBar kcSeekBar, int i11, float f11) {
            super.mo25745b(kcSeekBar, i11, f11);
            BigDecimal bigDecimalM26383C = IsolatedLeverageSettingDialog.this.m25837U4().m26383C();
            long j11 = i11;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            if (bigDecimalValueOf.compareTo(bigDecimalM26383C) > 0) {
                IsolatedLeverageSettingDialog isolatedLeverageSettingDialog = IsolatedLeverageSettingDialog.this;
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j11);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                isolatedLeverageSettingDialog.m25823s5(bigDecimalValueOf2);
            }
            IsolatedLeverageSettingDialog.this.m25827u5("4");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.IsolatedLeverageSettingDialog$d */
    /* JADX INFO: compiled from: IsolatedLeverageSettingDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13244d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23169b;

        public C13244d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23169b = function;
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
            return this.f23169b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23169b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final void m25838r5(TextView textView, BigDecimal bigDecimal) {
        String strM36530d = C17054k0.m36530d(bigDecimal, false, 1, null);
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27017c.m66516f(R$string.kumex_modify_leverage_current_leverage, strM36530d));
        HighlightTextHelper.f43497a.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text))));
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m25776E0() {
        return ((Boolean) this.f23163v0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: I4 */
    public static final ContractEntity m25781I4(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), isolatedLeverageSettingDialog.m25789S4(), false, 2, null);
    }

    /* JADX INFO: renamed from: N4 */
    private final ContractEntity m25784N4() {
        return (ContractEntity) this.f23166y0.getValue();
    }

    /* JADX INFO: renamed from: O4 */
    private final BigDecimal m25785O4() {
        return (BigDecimal) this.f23157A0.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    private final FuturesHeaderStreamViewModel m25786P4() {
        return (FuturesHeaderStreamViewModel) this.f23161t0.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    private final WrapperLoadingView m25787Q4() {
        return (WrapperLoadingView) this.f23167z0.getValue();
    }

    /* JADX INFO: renamed from: R4 */
    private final String m25788R4() {
        return (String) this.f23164w0.getValue();
    }

    /* JADX INFO: renamed from: S4 */
    private final String m25789S4() {
        return (String) this.f23165x0.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    private final UserKycLeverageViewModel m25790T4() {
        return (UserKycLeverageViewModel) this.f23160s0.getValue();
    }

    /* JADX INFO: renamed from: V4 */
    private final void m25791V4() {
        BigDecimal f25022z;
        m25827u5("confirmBtn");
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null || (f25022z = c36758f0M25836M4.f79998m.getF25022z()) == null || c36758f0M25836M4.f80007v.getF44406k()) {
            return;
        }
        c36758f0M25836M4.f80007v.m55043o();
        m25786P4().N();
        String plainString = C6447a.m11724a(f25022z.min(m25837U4().m26383C())).toPlainString();
        ConstraintLayout batchLeverageCl = c36758f0M25836M4.f79987b;
        Intrinsics.checkNotNullExpressionValue(batchLeverageCl, "batchLeverageCl");
        if (batchLeverageCl.getVisibility() == 0 && c36758f0M25836M4.f80003r.isChecked()) {
            IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModelM25837U4 = m25837U4();
            String strM25789S4 = m25789S4();
            Intrinsics.checkNotNull(plainString);
            isolatedLeverageSettingViewModelM25837U4.m26386F(strM25789S4, plainString);
            return;
        }
        IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModelM25837U5 = m25837U4();
        String strM25789S5 = m25789S4();
        Intrinsics.checkNotNull(plainString);
        isolatedLeverageSettingViewModelM25837U5.m26387G(strM25789S5, plainString);
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m25799d5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, boolean z11) {
        if (!z11) {
            isolatedLeverageSettingDialog.m25827u5("3");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m25800e5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        isolatedLeverageSettingDialog.m25827u5("1");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m25801f5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        isolatedLeverageSettingDialog.m25827u5("2");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m25803h5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        isolatedLeverageSettingDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m25804i5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        isolatedLeverageSettingDialog.m25818p5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m25810l5() {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m25816o5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        EuropeUnlockLeverageDialog.Companion companion = EuropeUnlockLeverageDialog.f22609w0;
        FragmentManager childFragmentManager = isolatedLeverageSettingDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        EuropeUnlockLeverageDialog.Companion.show$default(companion, childFragmentManager, false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public final C36758f0 m25836M4() {
        return (C36758f0) this.f23158q0.getValue(this, f23156C0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: U4 */
    public final IsolatedLeverageSettingViewModel m25837U4() {
        return (IsolatedLeverageSettingViewModel) this.f23159r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.95f);
        return inflater.inflate(R$layout.bkumex_dialog_isolated_leverage_setting, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * getF43576g0()));
        String strM25788R4 = m25788R4();
        String str = this.f23162u0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = SharedPositionInfo.MARGIN_MODE_ISOLATED.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96593e(strM25788R4, str, "1", jSONObject.put("marginType", lowerCase).put("isTrialFunds", String.valueOf(m25776E0())));
        initView();
        m25792W4();
        WrapperLoadingView wrapperLoadingViewM25787Q4 = m25787Q4();
        if (wrapperLoadingViewM25787Q4 != null) {
            wrapperLoadingViewM25787Q4.showLoading();
        }
    }

    public IsolatedLeverageSettingDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$2
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
        this.f23159r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(IsolatedLeverageSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$7
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
        this.f23160s0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserKycLeverageViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.IsolatedLeverageSettingDialog$special$$inlined$viewModels$default$10
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
        this.f23161t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25783L4(this.f23410b);
            }
        });
        this.f23162u0 = "TradeLev";
        this.f23163v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.p1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(IsolatedLeverageSettingDialog.m25806j5(this.f23420b));
            }
        });
        this.f23164w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.q1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25820q5(this.f23427b);
            }
        });
        this.f23165x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.r1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25825t5(this.f23434b);
            }
        });
        this.f23166y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25781I4(this.f23579b);
            }
        });
        this.f23167z0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25812m5(this.f23587b);
            }
        });
        this.f23157A0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25782J4(this.f23278b);
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public static final BigDecimal m25782J4(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        Serializable serializable;
        Bundle arguments = isolatedLeverageSettingDialog.getArguments();
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

    /* JADX INFO: renamed from: L4 */
    public static final FuturesHeaderStreamViewModel m25783L4(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        return com.kubi.futures.trade.submit.panel.header.p1.a(isolatedLeverageSettingDialog);
    }

    /* JADX INFO: renamed from: W4 */
    private final void m25792W4() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m25837U4().m26384D().observe(viewLifecycleOwner, new C13244d(new Function1() { // from class: com.kubi.futures.settings.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25793X4(this.f23288b, (BigDecimal) obj);
            }
        }));
        m25837U4().m26381A().observe(viewLifecycleOwner, new C13244d(new Function1() { // from class: com.kubi.futures.settings.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25794Y4(this.f23297b, (Boolean) obj);
            }
        }));
        m25790T4().m26440n().observe(viewLifecycleOwner, new C13244d(new Function1() { // from class: com.kubi.futures.settings.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25795Z4(this.f23309b, (KycLeverageEntity) obj);
            }
        }));
        m25837U4().m26382B().observe(viewLifecycleOwner, new C13244d(new Function1() { // from class: com.kubi.futures.settings.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25796a5(this.f23321b, (Pair) obj);
            }
        }));
        m25837U4().m26389z().observe(viewLifecycleOwner, new C13244d(new Function1() { // from class: com.kubi.futures.settings.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25797b5(this.f23330b, (Pair) obj);
            }
        }));
        m25837U4().m24687u().observe(viewLifecycleOwner, new C13244d(new Function1() { // from class: com.kubi.futures.settings.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25798c5(this.f23339b, (Pair) obj);
            }
        }));
        m25835K4();
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m25793X4(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, BigDecimal bigDecimal) {
        C36758f0 c36758f0M25836M4 = isolatedLeverageSettingDialog.m25836M4();
        if (c36758f0M25836M4 == null) {
            return Unit.INSTANCE;
        }
        WrapperLoadingView wrapperLoadingViewM25787Q4 = isolatedLeverageSettingDialog.m25787Q4();
        if (wrapperLoadingViewM25787Q4 != null) {
            wrapperLoadingViewM25787Q4.showContent();
        }
        isolatedLeverageSettingDialog.m25832x5();
        ModifyLeverageInputView modifyLeverageInputView = c36758f0M25836M4.f79998m;
        Intrinsics.checkNotNull(bigDecimal);
        modifyLeverageInputView.setMax(bigDecimal);
        BigDecimal bigDecimalM25785O4 = isolatedLeverageSettingDialog.m25785O4();
        Intrinsics.checkNotNullExpressionValue(bigDecimalM25785O4, "<get-currentLeverage>(...)");
        isolatedLeverageSettingDialog.m25823s5(bigDecimalM25785O4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m25794Y4(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, Boolean bool) {
        isolatedLeverageSettingDialog.m25829v5(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m25795Z4(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, KycLeverageEntity kycLeverageEntity) {
        isolatedLeverageSettingDialog.m25808k5(kycLeverageEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m25796a5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, Pair pair) {
        KcPrimaryButton kcPrimaryButton;
        C36758f0 c36758f0M25836M4 = isolatedLeverageSettingDialog.m25836M4();
        if (c36758f0M25836M4 != null && (kcPrimaryButton = c36758f0M25836M4.f80007v) != null) {
            kcPrimaryButton.mo28851l();
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            isolatedLeverageSettingDialog.dismissAllowingStateLoss();
        } else {
            C17058m0.m36550e(isolatedLeverageSettingDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m25797b5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, Pair pair) {
        KcPrimaryButton kcPrimaryButton;
        C36758f0 c36758f0M25836M4 = isolatedLeverageSettingDialog.m25836M4();
        if (c36758f0M25836M4 != null && (kcPrimaryButton = c36758f0M25836M4.f80007v) != null) {
            kcPrimaryButton.mo28851l();
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            C17058m0.m36548c(isolatedLeverageSettingDialog, R$string.kumex_batch_leverage_success);
            isolatedLeverageSettingDialog.dismissAllowingStateLoss();
        } else {
            C17058m0.m36550e(isolatedLeverageSettingDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m25798c5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, Pair pair) {
        Intrinsics.checkNotNull(pair);
        isolatedLeverageSettingDialog.m25814n5(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m25802g5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        isolatedLeverageSettingDialog.m25791V4();
        return Unit.INSTANCE;
    }

    private final void initView() {
        CharSequence charSequenceM25789S4;
        int i11;
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null) {
            return;
        }
        BaseTextView baseTextView = c36758f0M25836M4.f80004s;
        ContractEntity contractEntityM25784N4 = m25784N4();
        if (contractEntityM25784N4 == null || (charSequenceM25789S4 = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM25784N4)) == null) {
            charSequenceM25789S4 = m25789S4();
        }
        baseTextView.setText(charSequenceM25789S4);
        AppCompatImageView ivBack = c36758f0M25836M4.f79999n;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewExtKt.m66575f(ivBack, new Function1() { // from class: com.kubi.futures.settings.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25803h5(this.f23570b, (View) obj);
            }
        });
        int iM84615e = C37567b.m84615e(m25784N4(), false, 1, null);
        c36758f0M25836M4.f79998m.setPrecision(2);
        c36758f0M25836M4.f79998m.setMin(new BigDecimal("0.01"));
        ModifyLeverageInputView modifyLeverageInputView = c36758f0M25836M4.f79998m;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iM84615e);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        modifyLeverageInputView.setMax(bigDecimalValueOf);
        c36758f0M25836M4.f79998m.setOnValueChangedListener(new Function1() { // from class: com.kubi.futures.settings.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25804i5(this.f23356b, (BigDecimal) obj);
            }
        });
        c36758f0M25836M4.f79998m.setOnFocusChangeListener(new Function1() { // from class: com.kubi.futures.settings.k1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedLeverageSettingDialog.m25799d5(this.f23373b, ((Boolean) obj).booleanValue());
            }
        });
        c36758f0M25836M4.f79998m.setPlusListener(new Function0() { // from class: com.kubi.futures.settings.l1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25800e5(this.f23382b);
            }
        });
        c36758f0M25836M4.f79998m.setSubListener(new Function0() { // from class: com.kubi.futures.settings.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25801f5(this.f23390b);
            }
        });
        KcSeekBar kcSeekBar = c36758f0M25836M4.f80000o;
        float f11 = iM84615e;
        kcSeekBar.setProgressFormatCallback(new C13241a());
        kcSeekBar.setSectionTextFormatCallback(new C13242b());
        kcSeekBar.setMin(0.0f);
        kcSeekBar.setMax(f11);
        if (f11 % 4.0f == 0.0f) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        kcSeekBar.setSectionCount(i11);
        c36758f0M25836M4.f80000o.setOnSimpleProgressChangedListener(new C13243c());
        KcPrimaryButton tvConfirm = c36758f0M25836M4.f80007v;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.settings.n1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedLeverageSettingDialog.m25802g5(this.f23399b);
            }
        }, 1, null);
        BatchLeverageToggleHelper batchLeverageToggleHelper = BatchLeverageToggleHelper.f23307a;
        ConstraintLayout batchLeverageCl = c36758f0M25836M4.f79987b;
        Intrinsics.checkNotNullExpressionValue(batchLeverageCl, "batchLeverageCl");
        KcSwitchButton switchBatch = c36758f0M25836M4.f80003r;
        Intrinsics.checkNotNullExpressionValue(switchBatch, "switchBatch");
        batchLeverageToggleHelper.m26312f(this, batchLeverageCl, switchBatch, m25776E0(), c36758f0M25836M4.f79988c);
        BaseTextView currentLeverage = c36758f0M25836M4.f79991f;
        Intrinsics.checkNotNullExpressionValue(currentLeverage, "currentLeverage");
        m25838r5(currentLeverage, C41014a.m89921F(m25785O4(), "1"));
    }

    /* JADX INFO: renamed from: j5 */
    public static final boolean m25806j5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        Boolean boolValueOf;
        Bundle arguments = isolatedLeverageSettingDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: k5 */
    private final void m25808k5(KycLeverageEntity kycLeverageEntity) {
        boolean zAreEqual;
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null) {
            return;
        }
        if (KuMexDepend.f30378a.m35905g().c()) {
            if (kycLeverageEntity != null) {
                zAreEqual = Intrinsics.areEqual(kycLeverageEntity.getShowGuide(), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                ConstraintLayout hintCl = c36758f0M25836M4.f79997l;
                Intrinsics.checkNotNullExpressionValue(hintCl, "hintCl");
                C27046k.m66685H(hintCl);
                c36758f0M25836M4.f79996k.setText(C27017c.f54310a.m66516f(R$string.kumex_leverage_kyc_guide, C17054k0.m36530d(kycLeverageEntity.getUserMaxLeverage(), false, 1, null), C17054k0.m36530d(kycLeverageEntity.getSiteMaxLeverage(), false, 1, null)));
                BaseTextView verifyTv = c36758f0M25836M4.f80008w;
                Intrinsics.checkNotNullExpressionValue(verifyTv, "verifyTv");
                C27046k.m66711z(verifyTv, 0L, new Function0() { // from class: com.kubi.futures.settings.j1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IsolatedLeverageSettingDialog.m25810l5();
                    }
                }, 1, null);
                return;
            }
        }
        ConstraintLayout hintCl2 = c36758f0M25836M4.f79997l;
        Intrinsics.checkNotNullExpressionValue(hintCl2, "hintCl");
        C27046k.m66700o(hintCl2);
    }

    /* JADX INFO: renamed from: m5 */
    public static final WrapperLoadingView m25812m5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        ConstraintLayout constraintLayout;
        C36758f0 c36758f0M25836M4 = isolatedLeverageSettingDialog.m25836M4();
        if (c36758f0M25836M4 != null && (constraintLayout = c36758f0M25836M4.f79990e) != null) {
            return WrapperLoadingView.injectView(constraintLayout);
        }
        return null;
    }

    /* JADX INFO: renamed from: n5 */
    private final void m25814n5(Pair<EuropeUnlockLeverageLevelEntity, ? extends Throwable> pair) {
        EuropeUnlockLeverageLevelEntity first;
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null) {
            return;
        }
        if (pair.getSecond() != null) {
            C17058m0.m36550e(this, pair.getSecond());
            ShapeConstraintLayout eduCl = c36758f0M25836M4.f79993h;
            Intrinsics.checkNotNullExpressionValue(eduCl, "eduCl");
            ViewExtKt.m66577h(eduCl);
            return;
        }
        Pair<EuropeUnlockLeverageLevelEntity, Throwable> value = m25837U4().m24687u().getValue();
        if (value != null) {
            first = value.getFirst();
        } else {
            first = null;
        }
        if (first != null && C27025c.m66566d(first.getGuide()) && !C41014a.m89917B(first.getLevelLeverage()) && !m25776E0()) {
            ShapeConstraintLayout eduCl2 = c36758f0M25836M4.f79993h;
            Intrinsics.checkNotNullExpressionValue(eduCl2, "eduCl");
            C27046k.m66685H(eduCl2);
            AlignTopTextView alignTopTextView = c36758f0M25836M4.f79994i;
            C27017c c27017c = C27017c.f54310a;
            alignTopTextView.setText(c27017c.m66516f(R$string.kumex_eurpe_leverage_edu_leverage_tips, C27039d.m66656p(first.getLevelLeverage())));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            AlignTopTextView eduHint = c36758f0M25836M4.f79994i;
            Intrinsics.checkNotNullExpressionValue(eduHint, "eduHint");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            Pair pair2 = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text)));
            TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
            if (typefaceSpanM36545b == null) {
                typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
            }
            highlightTextHelper.m54120f(eduHint, pair2, new Pair(textTagEnum, typefaceSpanM36545b));
            BaseTextView eduVerifyTv = c36758f0M25836M4.f79995j;
            Intrinsics.checkNotNullExpressionValue(eduVerifyTv, "eduVerifyTv");
            C27046k.m66711z(eduVerifyTv, 0L, new Function0() { // from class: com.kubi.futures.settings.h1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsolatedLeverageSettingDialog.m25816o5(this.f23348b);
                }
            }, 1, null);
            return;
        }
        ShapeConstraintLayout eduCl3 = c36758f0M25836M4.f79993h;
        Intrinsics.checkNotNullExpressionValue(eduCl3, "eduCl");
        ViewExtKt.m66577h(eduCl3);
    }

    /* JADX INFO: renamed from: p5 */
    private final void m25818p5(BigDecimal bigDecimal) {
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null) {
            return;
        }
        BigDecimal bigDecimalM26383C = m25837U4().m26383C();
        if (m25837U4().m26385E() && bigDecimal.compareTo(bigDecimalM26383C) > 0) {
            m25823s5(bigDecimalM26383C);
            return;
        }
        c36758f0M25836M4.f80000o.setProgress(bigDecimal.floatValue());
        c36758f0M25836M4.f80007v.setEnabled(!C41014a.m89919D(bigDecimal));
        m25832x5();
    }

    /* JADX INFO: renamed from: q5 */
    public static final String m25820q5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        String string;
        Bundle arguments = isolatedLeverageSettingDialog.getArguments();
        if (arguments != null && (string = arguments.getString("data_2")) != null) {
            return string;
        }
        return C17060n0.m36552b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public final void m25823s5(BigDecimal bigDecimal) {
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null) {
            return;
        }
        c36758f0M25836M4.f79998m.setValue(bigDecimal);
    }

    /* JADX INFO: renamed from: t5 */
    public static final String m25825t5(IsolatedLeverageSettingDialog isolatedLeverageSettingDialog) {
        String string;
        Bundle arguments = isolatedLeverageSettingDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5 */
    public final void m25827u5(String str) {
        String strM25788R4 = m25788R4();
        String str2 = this.f23162u0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = SharedPositionInfo.MARGIN_MODE_ISOLATED.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96589a(strM25788R4, str2, str, jSONObject.put("marginType", lowerCase).put("isTrialFunds", String.valueOf(m25776E0())));
    }

    /* JADX INFO: renamed from: v5 */
    private final void m25829v5(Boolean bool) {
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null) {
            return;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            AlignTopTextView trialLeverageHintTv = c36758f0M25836M4.f80006u;
            Intrinsics.checkNotNullExpressionValue(trialLeverageHintTv, "trialLeverageHintTv");
            C27046k.m66685H(trialLeverageHintTv);
            c36758f0M25836M4.f80006u.setText(getString(R$string.kumex_trial_leverage_hint, C17054k0.m36532f(m25837U4().m26383C(), false, 1, null)));
            return;
        }
        AlignTopTextView trialLeverageHintTv2 = c36758f0M25836M4.f80006u;
        Intrinsics.checkNotNullExpressionValue(trialLeverageHintTv2, "trialLeverageHintTv");
        C27046k.m66700o(trialLeverageHintTv2);
    }

    /* JADX INFO: renamed from: x5 */
    private final void m25832x5() {
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 == null) {
            return;
        }
        float fFloatValue = C27039d.m66656p(c36758f0M25836M4.f79998m.getF25022z()).floatValue();
        if (C27039d.m66656p(m25785O4()).compareTo(m25837U4().m26383C()) > 0) {
            AlignTopTextView warning = c36758f0M25836M4.f80009x;
            Intrinsics.checkNotNullExpressionValue(warning, "warning");
            C27046k.m66685H(warning);
            c36758f0M25836M4.f80009x.setText(getString(R$string.kumex_current_lever_higher_max, C17054k0.m36530d(m25837U4().m26383C(), false, 1, null)));
            AlignTopTextView warning2 = c36758f0M25836M4.f80009x;
            Intrinsics.checkNotNullExpressionValue(warning2, "warning");
            C13402k0.m26334a(warning2, R$color.secondary, R$drawable.shape_secondary8_8r);
            return;
        }
        if (fFloatValue > 20.0f) {
            AlignTopTextView warning3 = c36758f0M25836M4.f80009x;
            Intrinsics.checkNotNullExpressionValue(warning3, "warning");
            C27046k.m66685H(warning3);
            AlignTopTextView alignTopTextView = c36758f0M25836M4.f80009x;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.leverage_hight_price_up_down_percent;
            String strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(1.0f / fFloatValue)), null, RoundingMode.HALF_UP, 0, false, false, false, 61, null);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            alignTopTextView.setText(c27017c.m66516f(i11, strM92642g, C42180b.m92642g(ONE, null, null, 0, false, false, false, 63, null)));
            AlignTopTextView warning4 = c36758f0M25836M4.f80009x;
            Intrinsics.checkNotNullExpressionValue(warning4, "warning");
            C13402k0.m26334a(warning4, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        if (fFloatValue >= 10.0f) {
            AlignTopTextView warning5 = c36758f0M25836M4.f80009x;
            Intrinsics.checkNotNullExpressionValue(warning5, "warning");
            C27046k.m66685H(warning5);
            c36758f0M25836M4.f80009x.setText(C27017c.f54310a.m66516f(R$string.current_leverage_high_pay_attention_risk_liquidation, new Object[0]));
            AlignTopTextView warning6 = c36758f0M25836M4.f80009x;
            Intrinsics.checkNotNullExpressionValue(warning6, "warning");
            C13402k0.m26334a(warning6, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        AlignTopTextView warning7 = c36758f0M25836M4.f80009x;
        Intrinsics.checkNotNullExpressionValue(warning7, "warning");
        ViewExtKt.m66577h(warning7);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m25835K4() {
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IsolatedLeverageSettingDialog$fetchRetailLeverageHint$1(c36758f0M25836M4, this, null), 3, null);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        KcSeekBar kcSeekBar;
        super.onResume();
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 != null && (kcSeekBar = c36758f0M25836M4.f80000o) != null) {
            kcSeekBar.requestLayout();
        }
        m25837U4().m24683q();
        m25837U4().m26388y(m25789S4(), m25776E0());
        m25790T4().m26439d(m25789S4(), SharedPositionInfo.MARGIN_MODE_ISOLATED);
    }

    /* JADX INFO: renamed from: w5 */
    public final void m25839w5(boolean z11) {
        ConstraintLayout.LayoutParams layoutParams;
        int id2;
        C36758f0 c36758f0M25836M4 = m25836M4();
        if (c36758f0M25836M4 != null) {
            ViewGroup.LayoutParams layoutParams2 = c36758f0M25836M4.f79993h.getLayoutParams();
            if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams == null) {
                return;
            }
            if (z11) {
                id2 = c36758f0M25836M4.f80001p.getId();
            } else {
                id2 = c36758f0M25836M4.f79997l.getId();
            }
            layoutParams.topToBottom = id2;
            c36758f0M25836M4.f79993h.setLayoutParams(layoutParams);
        }
    }
}
