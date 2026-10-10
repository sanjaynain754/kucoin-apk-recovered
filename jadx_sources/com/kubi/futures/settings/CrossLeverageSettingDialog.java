package com.kubi.futures.settings;

import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import ci.InterfaceC4984e;
import cm.C5003h;
import cm.FuturesStreamsData;
import com.blankj.utilcode.util.C5267e0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.messaging.Constants;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.futures.settings.vm.CrossLeverageSettingViewModel;
import com.kubi.futures.settings.vm.UserKycLeverageViewModel;
import com.kubi.futures.trade.submit.panel.header.FuturesHeaderStreamViewModel;
import com.kubi.futures.view.ModifyLeverageInputView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMargin;
import com.kubi.kumex.data.trade.model.CrossLeverageEntity;
import com.kubi.kumex.data.trade.model.CrossOrderOfSymbol;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.logic.calculator.Calculator;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
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
import dm.C36793l;
import f00.C37304a;
import fm.C37567b;
import fm.C37569d;
import g00.InterfaceC37755g;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p599rk.C44110b;
import p599rk.C44111c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import tk.C45039a;
import w00.C45681e;

/* JADX INFO: compiled from: CrossLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 z2\u00020\u0001:\u0001zB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010A\u001a\u00020BH\u0016J&\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u001a\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020D2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010N\u001a\u00020LH\u0002J\u0012\u0010O\u001a\u00020L2\b\u0010P\u001a\u0004\u0018\u000101H\u0002J\u0010\u0010Q\u001a\u00020L2\u0006\u0010P\u001a\u000201H\u0002J\b\u0010R\u001a\u00020LH\u0002J\u0012\u0010S\u001a\u00020L2\b\u0010T\u001a\u0004\u0018\u000101H\u0002J \u0010U\u001a\u00020L2\u0016\u0010V\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010X\u0012\u0006\u0012\u0004\u0018\u00010Y0WH\u0002JH\u0010Z\u001a\u00020L2\u0006\u0010[\u001a\u00020%2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010_\u001a\u00020`2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020b0]2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020e0dH\u0002J@\u0010f\u001a\u0002012\u0006\u0010[\u001a\u00020%2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020e0d2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020b0]H\u0002J\u001a\u0010g\u001a\u0004\u0018\u0001012\u0006\u0010h\u001a\u0002012\u0006\u0010_\u001a\u00020`H\u0002J@\u0010i\u001a\u0002012\u0006\u0010[\u001a\u00020%2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020b0]2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020e0dH\u0002J\u0012\u0010j\u001a\u00020%2\b\u0010k\u001a\u0004\u0018\u00010lH\u0002J\u0012\u0010m\u001a\u00020L2\b\u0010:\u001a\u0004\u0018\u000101H\u0002J\u0010\u0010n\u001a\u00020L2\u0006\u0010P\u001a\u000201H\u0002J\u0012\u0010o\u001a\u00020L2\b\u0010p\u001a\u0004\u0018\u00010qH\u0002J\b\u0010r\u001a\u00020LH\u0002J\u0017\u0010s\u001a\u00020L2\b\u0010t\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010uJ\b\u0010v\u001a\u00020LH\u0016J\b\u0010w\u001a\u00020LH\u0002J\u0010\u0010x\u001a\u00020L2\u0006\u0010y\u001a\u00020 H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b$\u0010&R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b)\u0010\"R\u001d\u0010+\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b-\u0010.R\u001d\u00100\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b2\u00103R\u000e\u00105\u001a\u00020 X\u0082D¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n 7*\u0004\u0018\u00010101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\n 7*\u0004\u0018\u00010101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00109\u001a\n 7*\u0004\u0018\u00010101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010<\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u000f\u001a\u0004\b>\u0010?¨\u0006{"}, m90084d2 = {"Lcom/kubi/futures/settings/CrossLeverageSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogCrossLeverageSettingBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogCrossLeverageSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/settings/vm/CrossLeverageSettingViewModel;", "getViewModel", "()Lcom/kubi/futures/settings/vm/CrossLeverageSettingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "userKycLeverageViewModel", "Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "getUserKycLeverageViewModel", "()Lcom/kubi/futures/settings/vm/UserKycLeverageViewModel;", "userKycLeverageViewModel$delegate", "futuresViewModel", "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "getFuturesViewModel", "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "futuresViewModel$delegate", "futuresHeaderStreamViewModel", "Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "getFuturesHeaderStreamViewModel", "()Lcom/kubi/futures/trade/submit/panel/header/FuturesHeaderStreamViewModel;", "futuresHeaderStreamViewModel$delegate", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "isTrial", "", "()Z", "isTrial$delegate", "pageTrackId", "getPageTrackId", "pageTrackId$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "currentLeverage", "Ljava/math/BigDecimal;", "getCurrentLeverage", "()Ljava/math/BigDecimal;", "currentLeverage$delegate", "blockId", "currentSymbolOfMargin", "kotlin.jvm.PlatformType", "currentSymbolOfIMR", "currentSymbolOfMMR", "adjustLeverage", "hasComposeException", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "setCurrentLeverage", "leverage", "onInputValueChanged", "initObserver", "onUnifyPosOrderMarginChanged", "value", "onEuropeUnlockLeverageLevelChanged", "it", "Lkotlin/Pair;", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;", "", "onStreamKeyDataLiveDataChanged", "isHedge", "balances", "", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "leverages", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "positions", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "positionCouples", "", "Lcom/kubi/futures/trade/submit/panel/footer/PositionCouple;", "calcMargin", "calcIMR", "mmr", "calcMMR", "handleComposeException", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/futures/exception/IFuturesCoreApiException;", "setAdjustLeverageMarginChanged", "setLeverageInput", "kycHintCheck", "kycLeverageInfo", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "warningCheck", "trialLeverageHintCheck", "showTrialCrossMaxLeverage", "(Ljava/lang/Boolean;)V", "onResume", "handleConfirmClick", "trackClick", "locationId", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossLeverageSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossLeverageSettingDialog.kt\ncom/kubi/futures/settings/CrossLeverageSettingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,736:1\n143#2,20:737\n106#3,15:757\n106#3,15:772\n1#4:787\n254#5:788\n*S KotlinDebug\n*F\n+ 1 CrossLeverageSettingDialog.kt\ncom/kubi/futures/settings/CrossLeverageSettingDialog\n*L\n95#1:737,20\n97#1:757,15\n98#1:772,15\n687#1:788\n*E\n"})
public final class CrossLeverageSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public final String f23128A0;

    /* JADX INFO: renamed from: B0 */
    public BigDecimal f23129B0;

    /* JADX INFO: renamed from: C0 */
    public BigDecimal f23130C0;

    /* JADX INFO: renamed from: D0 */
    public BigDecimal f23131D0;

    /* JADX INFO: renamed from: E0 */
    @Nullable
    public BigDecimal f23132E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f23133F0;

    /* JADX INFO: renamed from: G0 */
    @NotNull
    public final Lazy f23134G0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f23135q0 = C45681e.m100799e(this, new Function1<CrossLeverageSettingDialog, C36793l>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36793l invoke(@NotNull CrossLeverageSettingDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36793l.m82446a(fragment.requireView());
        }
    }, new Function1<C36793l, Unit>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36793l it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36793l c36793l) {
            invoke(c36793l);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23136r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23137s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23138t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f23139u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f23140v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f23141w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f23142x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f23143y0;

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final Lazy f23144z0;

    /* JADX INFO: renamed from: P0 */
    public static final /* synthetic */ KProperty<Object>[] f23127P0 = {Reflection.property1(new PropertyReference1Impl(CrossLeverageSettingDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogCrossLeverageSettingBinding;", 0))};

    /* JADX INFO: renamed from: K0 */
    @NotNull
    public static final Companion f23126K0 = new Companion(null);

    /* JADX INFO: compiled from: CrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/settings/CrossLeverageSettingDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/futures/settings/CrossLeverageSettingDialog;", "symbol", "", "leverage", "Ljava/math/BigDecimal;", "isTrial", "", "pageId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ CrossLeverageSettingDialog newInstance$default(Companion companion, String str, BigDecimal bigDecimal, boolean z11, String str2, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str2 = C17060n0.m36552b();
            }
            return companion.newInstance(str, bigDecimal, z11, str2);
        }

        @NotNull
        public final CrossLeverageSettingDialog newInstance(@NotNull String symbol, @Nullable BigDecimal leverage, boolean isTrial, @NotNull String pageId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            CrossLeverageSettingDialog crossLeverageSettingDialog = new CrossLeverageSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            if (leverage != null) {
                bundle.putSerializable("data", leverage);
            }
            bundle.putBoolean("data_1", isTrial);
            bundle.putString("data_2", pageId);
            crossLeverageSettingDialog.setArguments(bundle);
            return crossLeverageSettingDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.CrossLeverageSettingDialog$a */
    /* JADX INFO: compiled from: CrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/CrossLeverageSettingDialog$initView$7$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13232a implements KcSeekBar.InterfaceC23002a {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.CrossLeverageSettingDialog$b */
    /* JADX INFO: compiled from: CrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/settings/CrossLeverageSettingDialog$initView$7$2", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13233b implements KcSeekBar.InterfaceC23003b {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23003b
        /* JADX INFO: renamed from: a */
        public String mo21946a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C17054k0.m36529c(bigDecimalValueOf, false);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.CrossLeverageSettingDialog$c */
    /* JADX INFO: compiled from: CrossLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/futures/settings/CrossLeverageSettingDialog$initView$8", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "getProgressOnActionUp", "bubbleSeekBar", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13234c extends KcSeekBar.AbstractC23005d {
        public C13234c() {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            CrossLeverageSettingDialog crossLeverageSettingDialog = CrossLeverageSettingDialog.this;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            crossLeverageSettingDialog.m25733I5(bigDecimalValueOf);
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d, com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23004c
        /* JADX INFO: renamed from: b */
        public void mo25745b(KcSeekBar kcSeekBar, int i11, float f11) {
            super.mo25745b(kcSeekBar, i11, f11);
            BigDecimal bigDecimalM26361E = CrossLeverageSettingDialog.this.m25742c5().m26361E();
            long j11 = i11;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            if (bigDecimalValueOf.compareTo(bigDecimalM26361E) > 0) {
                CrossLeverageSettingDialog crossLeverageSettingDialog = CrossLeverageSettingDialog.this;
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j11);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                crossLeverageSettingDialog.m25733I5(bigDecimalValueOf2);
            }
            CrossLeverageSettingDialog.this.m25677K5("4");
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final BigDecimal m25737N4(boolean z11, List<SimpleBalanceEntity> list, List<PositionEntity> list2, Map<String, com.kubi.futures.trade.submit.panel.footer.r0> map) {
        Object next;
        CrossHedgeQtyMargin crossHedgeQtyMargin;
        Object next2;
        BigDecimal bigDecimalE;
        String currency;
        ContractEntity contractEntityM25683U4;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            currency = ((SimpleBalanceEntity) next).getCurrency();
            contractEntityM25683U4 = m25683U4();
        } while (!Intrinsics.areEqual(currency, contractEntityM25683U4 != null ? contractEntityM25683U4.getSettleCurrency() : null));
        SimpleBalanceEntity simpleBalanceEntity = (SimpleBalanceEntity) next;
        if (simpleBalanceEntity == null || (crossHedgeQtyMargin = simpleBalanceEntity.getHedgeQtyMargin()) == null) {
            crossHedgeQtyMargin = new CrossHedgeQtyMargin();
        }
        CrossOrderOfSymbol crossOrderOfSymbol = (CrossOrderOfSymbol) crossHedgeQtyMargin.get((Object) m25688a5());
        if (crossOrderOfSymbol == null) {
            crossOrderOfSymbol = new CrossOrderOfSymbol(m25683U4(), null, null, null, null, null, 62, null);
        }
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            PositionEntity positionEntity = (PositionEntity) next2;
            if (Intrinsics.areEqual(positionEntity.getSymbol(), m25688a5()) && C37569d.m84649A(positionEntity)) {
                break;
            }
        }
        PositionEntity positionEntity2 = (PositionEntity) next2;
        if (positionEntity2 == null) {
            positionEntity2 = new PositionEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 131071, null);
        }
        if (z11) {
            com.kubi.futures.trade.submit.panel.footer.r0 r0Var = map.get(m25688a5());
            if (r0Var == null) {
                r0Var = new com.kubi.futures.trade.submit.panel.footer.r0((PositionEntity) null, (PositionEntity) null, 3, (DefaultConstructorMarker) null);
            }
            C45039a c45039a = C45039a.f101443a;
            ContractEntity contractEntityM25683U5 = m25683U4();
            C44110b c44110bM97192c = C44111c.m97192c(C27039d.m66656p(contractEntityM25683U5 != null ? contractEntityM25683U5.getMultiplier() : null));
            C44110b c44110bM97192c2 = C44111c.m97192c(C27039d.m66656p(crossOrderOfSymbol.getBidOrderSize()));
            C44110b c44110bM97192c3 = C44111c.m97192c(C27039d.m66656p(crossOrderOfSymbol.getAskOrderSize()));
            PositionEntity positionEntityC = r0Var.c();
            C44110b c44110bM97192c4 = C44111c.m97192c(C27039d.m66656p(positionEntityC != null ? positionEntityC.getCurrentQty() : null));
            PositionEntity positionEntityD = r0Var.d();
            bigDecimalE = c45039a.m99606i(c44110bM97192c, c44110bM97192c2, c44110bM97192c4, c44110bM97192c3, C44111c.m97192c(C27039d.m66656p(positionEntityD != null ? positionEntityD.getCurrentQty() : null))).getDecimal();
        } else {
            BigDecimal bigDecimalM66656p = C27039d.m66656p(positionEntity2.getCurrentQty());
            ContractEntity contractEntityM25683U6 = m25683U4();
            bigDecimalE = com.kubi.futures.model.trade.order.a.e(crossOrderOfSymbol, bigDecimalM66656p, contractEntityM25683U6 != null ? contractEntityM25683U6.getMultiplier() : null);
        }
        com.kubi.kumex.logic.calculator.cross.b bVarCross = Calculator.a.cross();
        ContractEntity contractEntityM25683U7 = m25683U4();
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntityM25683U7 != null ? contractEntityM25683U7.getMmrLimit() : null, "0.3");
        ContractEntity contractEntityM25683U8 = m25683U4();
        BigDecimal bigDecimalM66656p2 = C27039d.m66656p(contractEntityM25683U8 != null ? contractEntityM25683U8.getM() : null);
        ContractEntity contractEntityM25683U9 = m25683U4();
        return bVarCross.n(bigDecimalM89921F, bigDecimalM66656p2, C27039d.m66656p(contractEntityM25683U9 != null ? contractEntityM25683U9.getMmrLevConstant() : null), bigDecimalE);
    }

    /* JADX INFO: renamed from: B5 */
    public static final Unit m25664B5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        EuropeUnlockLeverageDialog.Companion companion = EuropeUnlockLeverageDialog.f22609w0;
        FragmentManager childFragmentManager = crossLeverageSettingDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        EuropeUnlockLeverageDialog.Companion.show$default(companion, childFragmentManager, false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m25667E0() {
        return ((Boolean) this.f23141w0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: P4 */
    public static final ContractEntity m25679P4(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), crossLeverageSettingDialog.m25688a5(), false, 2, null);
    }

    /* JADX INFO: renamed from: U4 */
    private final ContractEntity m25683U4() {
        return (ContractEntity) this.f23143y0.getValue();
    }

    /* JADX INFO: renamed from: W4 */
    private final FuturesHeaderStreamViewModel m25684W4() {
        return (FuturesHeaderStreamViewModel) this.f23139u0.getValue();
    }

    /* JADX INFO: renamed from: X4 */
    private final com.kubi.futures.trade.vm.u m25685X4() {
        return (com.kubi.futures.trade.vm.u) this.f23138t0.getValue();
    }

    /* JADX INFO: renamed from: Y4 */
    private final WrapperLoadingView m25686Y4() {
        return (WrapperLoadingView) this.f23134G0.getValue();
    }

    /* JADX INFO: renamed from: Z4 */
    private final String m25687Z4() {
        return (String) this.f23142x0.getValue();
    }

    /* JADX INFO: renamed from: a5 */
    private final String m25688a5() {
        return (String) this.f23140v0.getValue();
    }

    /* JADX INFO: renamed from: e5 */
    private final void m25689e5() {
        BigDecimal f25022z;
        m25677K5("confirmBtn");
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null || (f25022z = c36793lM25739T4.f80442q.getF25022z()) == null || c36793lM25739T4.f80423B.getF44406k()) {
            return;
        }
        c36793lM25739T4.f80423B.m55043o();
        m25684W4().N();
        String plainString = C6447a.m11724a(f25022z.min(m25742c5().m26361E())).toPlainString();
        ConstraintLayout batchLeverageCl = c36793lM25739T4.f80428c;
        Intrinsics.checkNotNullExpressionValue(batchLeverageCl, "batchLeverageCl");
        if (batchLeverageCl.getVisibility() == 0 && c36793lM25739T4.f80449x.isChecked()) {
            CrossLeverageSettingViewModel crossLeverageSettingViewModelM25742c5 = m25742c5();
            String strM25688a5 = m25688a5();
            Intrinsics.checkNotNull(plainString);
            crossLeverageSettingViewModelM25742c5.m26363G(strM25688a5, plainString);
            return;
        }
        CrossLeverageSettingViewModel crossLeverageSettingViewModelM25742c6 = m25742c5();
        String strM25688a6 = m25688a5();
        Intrinsics.checkNotNull(plainString);
        crossLeverageSettingViewModelM25742c6.m26364H(strM25688a6, plainString, m25667E0());
    }

    /* JADX INFO: renamed from: p5 */
    public static final Unit m25707p5(CrossLeverageSettingDialog crossLeverageSettingDialog, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        crossLeverageSettingDialog.m25728C5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m25709q5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(R$string.kumex_modify_margin_margin, R$string.kumex_cross_modify_position_leverage_desc, null, 4, null);
        FragmentManager childFragmentManager = crossLeverageSettingDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "CrossLeverageModifyMargin");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final Unit m25711r5(CrossLeverageSettingDialog crossLeverageSettingDialog, boolean z11) {
        if (!z11) {
            crossLeverageSettingDialog.m25677K5("3");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m25713s5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        crossLeverageSettingDialog.m25677K5("1");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static final Unit m25715t5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        crossLeverageSettingDialog.m25677K5("2");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m25719v5(CrossLeverageSettingDialog crossLeverageSettingDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        crossLeverageSettingDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m25724y5() {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D5 */
    public final void m25729D5(boolean z11, List<SimpleBalanceEntity> list, SymbolsCrossLeverage symbolsCrossLeverage, List<PositionEntity> list2, Map<String, com.kubi.futures.trade.submit.panel.footer.r0> map) {
        String strM92640e;
        if (BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.UNIFIED) {
            return;
        }
        BigDecimal currentSymbolOfMMR = m25737N4(z11, list, list2, map);
        this.f23131D0 = currentSymbolOfMMR;
        Intrinsics.checkNotNullExpressionValue(currentSymbolOfMMR, "currentSymbolOfMMR");
        this.f23130C0 = m25735M4(currentSymbolOfMMR, symbolsCrossLeverage);
        this.f23129B0 = m25738O4(z11, map, list, list2);
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        if (C41014a.m89922G(this.f23129B0, null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
            ConstraintLayout clAdjust = c36793lM25739T4.f80431f;
            Intrinsics.checkNotNullExpressionValue(clAdjust, "clAdjust");
            ViewExtKt.m66577h(clAdjust);
            ConstraintLayout clTitle = c36793lM25739T4.f80433h;
            Intrinsics.checkNotNullExpressionValue(clTitle, "clTitle");
            ViewExtKt.m66577h(clTitle);
        } else {
            ConstraintLayout clAdjust2 = c36793lM25739T4.f80431f;
            Intrinsics.checkNotNullExpressionValue(clAdjust2, "clAdjust");
            C27046k.m66685H(clAdjust2);
            ConstraintLayout clTitle2 = c36793lM25739T4.f80433h;
            Intrinsics.checkNotNullExpressionValue(clTitle2, "clTitle");
            C27046k.m66685H(clTitle2);
            BaseTextView baseTextView = c36793lM25739T4.f80445t;
            BigDecimal bigDecimal = this.f23129B0;
            if (bigDecimal != null) {
                strM92640e = C42180b.m92640e(bigDecimal, RoundingMode.DOWN, C37567b.m84623m(m25683U4()), true, true, true, 0, null, 96, null);
            } else {
                strM92640e = null;
            }
            baseTextView.setText(strM92640e);
        }
        CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) symbolsCrossLeverage.get((Object) m25688a5());
        m25732H5(crossLeverageEntity != null ? crossLeverageEntity.getLeverage() : null);
        BigDecimal bigDecimal2 = this.f23132E0;
        if (bigDecimal2 != null) {
            m25731G5(bigDecimal2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX INFO: renamed from: G5 */
    public final void m25731G5(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalDivide;
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        if (bigDecimal != null) {
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal3) > 0 && !this.f23133F0) {
                if (C41014a.m89922G(this.f23129B0, null, 1, null).compareTo(bigDecimal3) <= 0) {
                    ConstraintLayout clAdjust = c36793lM25739T4.f80431f;
                    Intrinsics.checkNotNullExpressionValue(clAdjust, "clAdjust");
                    ViewExtKt.m66577h(clAdjust);
                    ConstraintLayout clTitle = c36793lM25739T4.f80433h;
                    Intrinsics.checkNotNullExpressionValue(clTitle, "clTitle");
                    ViewExtKt.m66577h(clTitle);
                    return;
                }
                if (BrokerConfig.f19211a.m20201d().mo4515x() != MultiBizType.UNIFIED) {
                    com.kubi.kumex.logic.calculator.cross.b bVarCross = Calculator.a.cross();
                    BigDecimal currentSymbolOfMMR = this.f23131D0;
                    Intrinsics.checkNotNullExpressionValue(currentSymbolOfMMR, "currentSymbolOfMMR");
                    ContractEntity contractEntityM25683U4 = m25683U4();
                    BigDecimal bigDecimalJ = bVarCross.j(bigDecimal, currentSymbolOfMMR, C41014a.m89921F(contractEntityM25683U4 != null ? contractEntityM25683U4.getF() : null, "1.3"));
                    if (C41014a.m89922G(this.f23130C0, null, 1, null).compareTo(bigDecimal3) <= 0) {
                        c36793lM25739T4.f80444s.setText(C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
                        return;
                    }
                    BigDecimal bigDecimal4 = this.f23129B0;
                    if (bigDecimal4 == null || (bigDecimalMultiply = bigDecimal4.multiply(bigDecimalJ)) == null) {
                        bigDecimal2 = null;
                    } else {
                        bigDecimalDivide = bigDecimalMultiply.divide(this.f23130C0, 12, RoundingMode.HALF_UP);
                    }
                    c36793lM25739T4.f80444s.setText(C27041f.m66669i(bigDecimal2 != null ? C42180b.m92640e(bigDecimal2, RoundingMode.DOWN, C37567b.m84623m(m25683U4()), true, true, true, 0, null, 96, null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0])));
                    return;
                }
                BigDecimal currentSymbolOfMargin = this.f23129B0;
                Intrinsics.checkNotNullExpressionValue(currentSymbolOfMargin, "currentSymbolOfMargin");
                bigDecimalDivide = currentSymbolOfMargin.divide(bigDecimal, RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                bigDecimal2 = bigDecimalDivide;
                c36793lM25739T4.f80444s.setText(C27041f.m66669i(bigDecimal2 != null ? C42180b.m92640e(bigDecimal2, RoundingMode.DOWN, C37567b.m84623m(m25683U4()), true, true, true, 0, null, 96, null) : null, C27017c.f54310a.m66516f(R$string.stub, new Object[0])));
                return;
            }
        }
        c36793lM25739T4.f80444s.setText(C27017c.f54310a.m66516f(R$string.stub, new Object[0]));
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: T4 */
    public final C36793l m25739T4() {
        return (C36793l) this.f23135q0.getValue(this, f23127P0[0]);
    }

    /* JADX INFO: renamed from: V4 */
    public final BigDecimal m25740V4() {
        return (BigDecimal) this.f23144z0.getValue();
    }

    /* JADX INFO: renamed from: b5 */
    public final UserKycLeverageViewModel m25741b5() {
        return (UserKycLeverageViewModel) this.f23137s0.getValue();
    }

    /* JADX INFO: renamed from: c5 */
    public final CrossLeverageSettingViewModel m25742c5() {
        return (CrossLeverageSettingViewModel) this.f23136r0.getValue();
    }

    /* JADX INFO: renamed from: d5 */
    public final boolean m25743d5(InterfaceC4984e interfaceC4984e) {
        CrossLeverageEntity crossLeverageEntity;
        if (interfaceC4984e == null) {
            this.f23133F0 = false;
            return false;
        }
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 != null) {
            ConstraintLayout clAdjust = c36793lM25739T4.f80431f;
            Intrinsics.checkNotNullExpressionValue(clAdjust, "clAdjust");
            C27046k.m66685H(clAdjust);
            ConstraintLayout clTitle = c36793lM25739T4.f80433h;
            Intrinsics.checkNotNullExpressionValue(clTitle, "clTitle");
            C27046k.m66685H(clTitle);
            c36793lM25739T4.f80445t.setText(C37569d.m84684y());
        }
        SymbolsCrossLeverage symbolsCrossLeverage = (SymbolsCrossLeverage) m25685X4().B().getValue();
        m25732H5(C5003h.m5397a((symbolsCrossLeverage == null || (crossLeverageEntity = (CrossLeverageEntity) symbolsCrossLeverage.get((Object) m25688a5())) == null) ? null : crossLeverageEntity.getLeverage()));
        m25731G5(null);
        this.f23133F0 = true;
        return true;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.95f);
        return inflater.inflate(R$layout.bkumex_dialog_cross_leverage_setting, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * getF43576g0()));
        String strM25687Z4 = m25687Z4();
        String str = this.f23128A0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = "CROSS".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96593e(strM25687Z4, str, "1", jSONObject.put("marginType", lowerCase).put("isTrialFunds", String.valueOf(m25667E0())));
        m25685X4().b();
        WrapperLoadingView wrapperLoadingViewM25686Y4 = m25686Y4();
        if (wrapperLoadingViewM25686Y4 != null) {
            wrapperLoadingViewM25686Y4.showLoading();
        }
        initView();
        m25690f5();
    }

    public CrossLeverageSettingDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$2
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
        this.f23136r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CrossLeverageSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$5
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
        final Function0<Fragment> function2 = new Function0<Fragment>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$6
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
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$7
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
        this.f23137s0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserKycLeverageViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.settings.CrossLeverageSettingDialog$special$$inlined$viewModels$default$10
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
        this.f23138t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25682S4(this.f23432b);
            }
        });
        this.f23139u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25681R4(this.f23440b);
            }
        });
        this.f23140v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25675J5(this.f23449b);
            }
        });
        this.f23141w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CrossLeverageSettingDialog.m25721w5(this.f23460b));
            }
        });
        this.f23142x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25670F5(this.f23557b);
            }
        });
        this.f23143y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25679P4(this.f23569b);
            }
        });
        this.f23144z0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25680Q4(this.f23578b);
            }
        });
        this.f23128A0 = "TradeLev";
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.f23129B0 = bigDecimal;
        this.f23130C0 = bigDecimal;
        this.f23131D0 = bigDecimal;
        this.f23134G0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.settings.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25726z5(this.f23586b);
            }
        });
    }

    /* JADX INFO: renamed from: F5 */
    public static final String m25670F5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        String string;
        Bundle arguments = crossLeverageSettingDialog.getArguments();
        if (arguments != null && (string = arguments.getString("data_2")) != null) {
            return string;
        }
        return C17060n0.m36552b();
    }

    /* JADX INFO: renamed from: J5 */
    public static final String m25675J5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        String string;
        Bundle arguments = crossLeverageSettingDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K5 */
    public final void m25677K5(String str) {
        String strM25687Z4 = m25687Z4();
        String str2 = this.f23128A0;
        JSONObject jSONObject = new JSONObject();
        String lowerCase = "CROSS".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        C43852m.m96589a(strM25687Z4, str2, str, jSONObject.put("marginType", lowerCase).put("isTrialFunds", String.valueOf(m25667E0())));
    }

    /* JADX INFO: renamed from: Q4 */
    public static final BigDecimal m25680Q4(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        Serializable serializable;
        Bundle arguments = crossLeverageSettingDialog.getArguments();
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

    /* JADX INFO: renamed from: R4 */
    public static final FuturesHeaderStreamViewModel m25681R4(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        return com.kubi.futures.trade.submit.panel.header.p1.a(crossLeverageSettingDialog);
    }

    /* JADX INFO: renamed from: S4 */
    public static final com.kubi.futures.trade.vm.u m25682S4(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        return com.kubi.futures.trade.vm.v.b(crossLeverageSettingDialog, crossLeverageSettingDialog.m25688a5(), crossLeverageSettingDialog.m25667E0(), (String) null, (MultiBizType) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: f5 */
    private final void m25690f5() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m25742c5().m26362F().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25691g5(this.f23347b, (BigDecimal) obj);
            }
        }));
        m25742c5().m26358B().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25692h5(this.f23355b, (Boolean) obj);
            }
        }));
        m25741b5().m26440n().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25693i5(this.f23364b, (KycLeverageEntity) obj);
            }
        }));
        m25742c5().m26359C().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25695j5(this.f23380b, (Pair) obj);
            }
        }));
        m25742c5().m26357A().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25697k5(this.f23388b, (Pair) obj);
            }
        }));
        m25685X4().C().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25699l5(this.f23397b, (InterfaceC4984e) obj);
            }
        }));
        m25685X4().D().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25701m5(this.f23408b, (FuturesStreamsData) obj);
            }
        }));
        m25742c5().m24687u().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25703n5(this.f23418b, (Pair) obj);
            }
        }));
        m25742c5().mo26360D().observe(viewLifecycleOwner, new C13402k0.a(new Function1() { // from class: com.kubi.futures.settings.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25705o5(this.f23425b, (BigDecimal) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m25691g5(CrossLeverageSettingDialog crossLeverageSettingDialog, BigDecimal bigDecimal) {
        ModifyLeverageInputView modifyLeverageInputView;
        crossLeverageSettingDialog.m25736M5();
        crossLeverageSettingDialog.m25733I5(C41014a.m89921F(crossLeverageSettingDialog.m25740V4(), "3"));
        C36793l c36793lM25739T4 = crossLeverageSettingDialog.m25739T4();
        if (c36793lM25739T4 != null && (modifyLeverageInputView = c36793lM25739T4.f80442q) != null) {
            modifyLeverageInputView.setMax(crossLeverageSettingDialog.m25742c5().m26361E());
        }
        WrapperLoadingView wrapperLoadingViewM25686Y4 = crossLeverageSettingDialog.m25686Y4();
        if (wrapperLoadingViewM25686Y4 != null) {
            wrapperLoadingViewM25686Y4.showContent();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m25692h5(CrossLeverageSettingDialog crossLeverageSettingDialog, Boolean bool) {
        crossLeverageSettingDialog.m25734L5(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m25693i5(CrossLeverageSettingDialog crossLeverageSettingDialog, KycLeverageEntity kycLeverageEntity) {
        crossLeverageSettingDialog.m25744x5(kycLeverageEntity);
        return Unit.INSTANCE;
    }

    private final void initView() {
        CharSequence charSequenceM25688a5;
        int i11;
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        BaseTextView baseTextView = c36793lM25739T4.f80450y;
        ContractEntity contractEntityM25683U4 = m25683U4();
        if (contractEntityM25683U4 == null || (charSequenceM25688a5 = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM25683U4)) == null) {
            charSequenceM25688a5 = m25688a5();
        }
        baseTextView.setText(charSequenceM25688a5);
        AppCompatImageView ivBack = c36793lM25739T4.f80443r;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        ViewExtKt.m66575f(ivBack, new Function1() { // from class: com.kubi.futures.settings.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25719v5(this.f23371b, (View) obj);
            }
        });
        int iM84615e = C37567b.m84615e(m25683U4(), false, 1, null);
        c36793lM25739T4.f80442q.setPrecision(2);
        c36793lM25739T4.f80442q.setMin(new BigDecimal("0.01"));
        ModifyLeverageInputView modifyLeverageInputView = c36793lM25739T4.f80442q;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(iM84615e);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        modifyLeverageInputView.setMax(bigDecimalValueOf);
        c36793lM25739T4.f80442q.setOnValueChangedListener(new Function1() { // from class: com.kubi.futures.settings.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25707p5(this.f23469b, (BigDecimal) obj);
            }
        });
        c36793lM25739T4.f80446u.setNeedDash(true);
        DashTextView marginLabel = c36793lM25739T4.f80446u;
        Intrinsics.checkNotNullExpressionValue(marginLabel, "marginLabel");
        C27046k.m66711z(marginLabel, 0L, new Function0() { // from class: com.kubi.futures.settings.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25709q5(this.f23296b);
            }
        }, 1, null);
        c36793lM25739T4.f80442q.setOnFocusChangeListener(new Function1() { // from class: com.kubi.futures.settings.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossLeverageSettingDialog.m25711r5(this.f23308b, ((Boolean) obj).booleanValue());
            }
        });
        c36793lM25739T4.f80442q.setPlusListener(new Function0() { // from class: com.kubi.futures.settings.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25713s5(this.f23320b);
            }
        });
        c36793lM25739T4.f80442q.setSubListener(new Function0() { // from class: com.kubi.futures.settings.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25715t5(this.f23329b);
            }
        });
        KcSeekBar kcSeekBar = c36793lM25739T4.f80447v;
        float f11 = iM84615e;
        kcSeekBar.setProgressFormatCallback(new C13232a());
        kcSeekBar.setSectionTextFormatCallback(new C13233b());
        kcSeekBar.setMin(0.0f);
        kcSeekBar.setMax(f11);
        if (f11 % 4.0f == 0.0f) {
            i11 = 4;
        } else {
            i11 = 5;
        }
        kcSeekBar.setSectionCount(i11);
        c36793lM25739T4.f80447v.setOnSimpleProgressChangedListener(new C13234c());
        KcPrimaryButton tvConfirm = c36793lM25739T4.f80423B;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.settings.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossLeverageSettingDialog.m25717u5(this.f23338b);
            }
        }, 1, null);
        BatchLeverageToggleHelper batchLeverageToggleHelper = BatchLeverageToggleHelper.f23307a;
        ConstraintLayout batchLeverageCl = c36793lM25739T4.f80428c;
        Intrinsics.checkNotNullExpressionValue(batchLeverageCl, "batchLeverageCl");
        KcSwitchButton switchBatch = c36793lM25739T4.f80449x;
        Intrinsics.checkNotNullExpressionValue(switchBatch, "switchBatch");
        batchLeverageToggleHelper.m26312f(this, batchLeverageCl, switchBatch, m25667E0(), c36793lM25739T4.f80429d);
        if (C41014a.m89917B(m25740V4())) {
            m25732H5(null);
        } else {
            m25732H5(m25740V4());
        }
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m25695j5(CrossLeverageSettingDialog crossLeverageSettingDialog, Pair pair) {
        KcPrimaryButton kcPrimaryButton;
        C36793l c36793lM25739T4 = crossLeverageSettingDialog.m25739T4();
        if (c36793lM25739T4 != null && (kcPrimaryButton = c36793lM25739T4.f80423B) != null) {
            kcPrimaryButton.mo28851l();
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            crossLeverageSettingDialog.dismissAllowingStateLoss();
        } else {
            C17058m0.m36550e(crossLeverageSettingDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m25697k5(CrossLeverageSettingDialog crossLeverageSettingDialog, Pair pair) {
        KcPrimaryButton kcPrimaryButton;
        C36793l c36793lM25739T4 = crossLeverageSettingDialog.m25739T4();
        if (c36793lM25739T4 != null && (kcPrimaryButton = c36793lM25739T4.f80423B) != null) {
            kcPrimaryButton.mo28851l();
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            C17058m0.m36548c(crossLeverageSettingDialog, R$string.kumex_batch_leverage_success);
            crossLeverageSettingDialog.dismissAllowingStateLoss();
        } else {
            C17058m0.m36550e(crossLeverageSettingDialog, (Throwable) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m25699l5(CrossLeverageSettingDialog crossLeverageSettingDialog, InterfaceC4984e interfaceC4984e) {
        crossLeverageSettingDialog.m25743d5(interfaceC4984e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m25701m5(CrossLeverageSettingDialog crossLeverageSettingDialog, FuturesStreamsData futuresStreamsData) {
        crossLeverageSettingDialog.m25729D5(futuresStreamsData.getIsHedge(), futuresStreamsData.m5399a(), futuresStreamsData.getLeverageMap(), futuresStreamsData.m5402d(), futuresStreamsData.m5401c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m25703n5(CrossLeverageSettingDialog crossLeverageSettingDialog, Pair pair) {
        Intrinsics.checkNotNull(pair);
        crossLeverageSettingDialog.m25727A5(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m25705o5(CrossLeverageSettingDialog crossLeverageSettingDialog, BigDecimal bigDecimal) {
        crossLeverageSettingDialog.m25730E5(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m25717u5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        crossLeverageSettingDialog.m25689e5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w5 */
    public static final boolean m25721w5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        Boolean boolValueOf;
        Bundle arguments = crossLeverageSettingDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_1"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: z5 */
    public static final WrapperLoadingView m25726z5(CrossLeverageSettingDialog crossLeverageSettingDialog) {
        ConstraintLayout constraintLayout;
        C36793l c36793lM25739T4 = crossLeverageSettingDialog.m25739T4();
        if (c36793lM25739T4 != null && (constraintLayout = c36793lM25739T4.f80432g) != null) {
            return WrapperLoadingView.injectView(constraintLayout);
        }
        return null;
    }

    /* JADX INFO: renamed from: A5 */
    public final void m25727A5(Pair<EuropeUnlockLeverageLevelEntity, ? extends Throwable> pair) {
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        if (pair.getSecond() != null) {
            C17058m0.m36550e(this, pair.getSecond());
            ShapeConstraintLayout eduCl = c36793lM25739T4.f80437l;
            Intrinsics.checkNotNullExpressionValue(eduCl, "eduCl");
            ViewExtKt.m66577h(eduCl);
            return;
        }
        EuropeUnlockLeverageLevelEntity first = pair.getFirst();
        if (first != null && C27025c.m66566d(first.getGuide()) && !m25667E0()) {
            ShapeConstraintLayout eduCl2 = c36793lM25739T4.f80437l;
            Intrinsics.checkNotNullExpressionValue(eduCl2, "eduCl");
            C27046k.m66685H(eduCl2);
            AlignTopTextView alignTopTextView = c36793lM25739T4.f80438m;
            C27017c c27017c = C27017c.f54310a;
            alignTopTextView.setText(c27017c.m66516f(R$string.kumex_eurpe_leverage_edu_leverage_tips, C27039d.m66656p(first.getLevelLeverage())));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            AlignTopTextView eduHint = c36793lM25739T4.f80438m;
            Intrinsics.checkNotNullExpressionValue(eduHint, "eduHint");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            Pair pair2 = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text)));
            TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
            if (typefaceSpanM36545b == null) {
                typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
            }
            highlightTextHelper.m54120f(eduHint, pair2, new Pair(textTagEnum, typefaceSpanM36545b));
            BaseTextView eduVerifyTv = c36793lM25739T4.f80439n;
            Intrinsics.checkNotNullExpressionValue(eduVerifyTv, "eduVerifyTv");
            C27046k.m66711z(eduVerifyTv, 0L, new Function0() { // from class: com.kubi.futures.settings.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrossLeverageSettingDialog.m25664B5(this.f23277b);
                }
            }, 1, null);
            return;
        }
        ShapeConstraintLayout eduCl3 = c36793lM25739T4.f80437l;
        Intrinsics.checkNotNullExpressionValue(eduCl3, "eduCl");
        ViewExtKt.m66577h(eduCl3);
    }

    /* JADX INFO: renamed from: C5 */
    public final void m25728C5(BigDecimal bigDecimal) {
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        BigDecimal bigDecimalM26361E = m25742c5().m26361E();
        if (bigDecimal.compareTo(bigDecimalM26361E) > 0) {
            m25733I5(bigDecimalM26361E);
            return;
        }
        this.f23132E0 = bigDecimal;
        c36793lM25739T4.f80447v.setProgress(bigDecimal.floatValue());
        c36793lM25739T4.f80423B.setEnabled(!C41014a.m89919D(bigDecimal));
        m25736M5();
        m25731G5(bigDecimal);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    /* JADX INFO: renamed from: E5 */
    public final void m25730E5(BigDecimal bigDecimal) {
        String strM92640e;
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        this.f23129B0 = C27039d.m66656p(bigDecimal);
        if (!C41014a.m89917B(bigDecimal) && !C41014a.m89917B(m25740V4())) {
            ConstraintLayout clAdjust = c36793lM25739T4.f80431f;
            Intrinsics.checkNotNullExpressionValue(clAdjust, "clAdjust");
            C27046k.m66685H(clAdjust);
            ConstraintLayout clTitle = c36793lM25739T4.f80433h;
            Intrinsics.checkNotNullExpressionValue(clTitle, "clTitle");
            C27046k.m66685H(clTitle);
            BaseTextView baseTextView = c36793lM25739T4.f80445t;
            if (bigDecimal != null) {
                BigDecimal bigDecimalDivide = bigDecimal.divide(C27039d.m66656p(m25740V4()), RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                if (bigDecimalDivide != null) {
                    strM92640e = C42180b.m92640e(bigDecimalDivide, RoundingMode.DOWN, C37567b.m84623m(m25683U4()), true, true, true, 0, null, 96, null);
                } else {
                    strM92640e = null;
                }
            } else {
                strM92640e = null;
            }
            baseTextView.setText(strM92640e);
            return;
        }
        c36793lM25739T4.f80445t.setText(C37569d.m84684y());
    }

    /* JADX INFO: renamed from: H5 */
    public final void m25732H5(BigDecimal bigDecimal) {
        String strM84684y;
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        if (bigDecimal == null || (strM84684y = C17054k0.m36530d(bigDecimal, false, 1, null)) == null) {
            strM84684y = C37569d.m84684y();
        }
        DashTextView dashTextView = c36793lM25739T4.f80435j;
        C27017c c27017c = C27017c.f54310a;
        dashTextView.setText(c27017c.m66516f(R$string.kumex_modify_leverage_current_leverage, strM84684y));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        DashTextView currentLeverage = c36793lM25739T4.f80435j;
        Intrinsics.checkNotNullExpressionValue(currentLeverage, "currentLeverage");
        highlightTextHelper.m54120f(currentLeverage, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text))));
    }

    /* JADX INFO: renamed from: I5 */
    public final void m25733I5(BigDecimal bigDecimal) {
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        c36793lM25739T4.f80442q.setValue(bigDecimal);
    }

    /* JADX INFO: renamed from: L5 */
    public final void m25734L5(Boolean bool) {
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            AlignTopTextView trialLeverageHintTv = c36793lM25739T4.f80422A;
            Intrinsics.checkNotNullExpressionValue(trialLeverageHintTv, "trialLeverageHintTv");
            C27046k.m66685H(trialLeverageHintTv);
            c36793lM25739T4.f80422A.setText(getString(R$string.kumex_trial_leverage_hint, C17054k0.m36532f(m25742c5().m26361E(), false, 1, null)));
            return;
        }
        AlignTopTextView trialLeverageHintTv2 = c36793lM25739T4.f80422A;
        Intrinsics.checkNotNullExpressionValue(trialLeverageHintTv2, "trialLeverageHintTv");
        C27046k.m66700o(trialLeverageHintTv2);
    }

    /* JADX INFO: renamed from: M4 */
    public final BigDecimal m25735M4(BigDecimal bigDecimal, SymbolsCrossLeverage symbolsCrossLeverage) {
        BigDecimal leverage;
        CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) symbolsCrossLeverage.get((Object) m25688a5());
        BigDecimal f11 = null;
        if (crossLeverageEntity != null) {
            leverage = crossLeverageEntity.getLeverage();
        } else {
            leverage = null;
        }
        BigDecimal bigDecimalM5397a = C5003h.m5397a(leverage);
        com.kubi.kumex.logic.calculator.cross.b bVarCross = Calculator.a.cross();
        ContractEntity contractEntityM25683U4 = m25683U4();
        if (contractEntityM25683U4 != null) {
            f11 = contractEntityM25683U4.getF();
        }
        return bVarCross.j(bigDecimalM5397a, bigDecimal, C41014a.m89921F(f11, "1.3"));
    }

    /* JADX INFO: renamed from: M5 */
    public final void m25736M5() {
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        float fFloatValue = C27039d.m66656p(c36793lM25739T4.f80442q.getF25022z()).floatValue();
        if (C27039d.m66656p(m25740V4()).compareTo(m25742c5().m26361E()) > 0) {
            AlignTopTextView warning = c36793lM25739T4.f80425D;
            Intrinsics.checkNotNullExpressionValue(warning, "warning");
            C27046k.m66685H(warning);
            c36793lM25739T4.f80425D.setText(getString(R$string.kumex_current_lever_higher_max, C17054k0.m36530d(m25742c5().m26361E(), false, 1, null)));
            AlignTopTextView warning2 = c36793lM25739T4.f80425D;
            Intrinsics.checkNotNullExpressionValue(warning2, "warning");
            C13402k0.m26334a(warning2, R$color.secondary, R$drawable.shape_secondary8_8r);
            return;
        }
        if (fFloatValue > 20.0f) {
            AlignTopTextView warning3 = c36793lM25739T4.f80425D;
            Intrinsics.checkNotNullExpressionValue(warning3, "warning");
            C27046k.m66685H(warning3);
            AlignTopTextView alignTopTextView = c36793lM25739T4.f80425D;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.leverage_hight_price_up_down_percent;
            String strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(1.0f / fFloatValue)), null, RoundingMode.HALF_UP, 0, false, false, false, 61, null);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            alignTopTextView.setText(c27017c.m66516f(i11, strM92642g, C42180b.m92642g(ONE, null, null, 0, false, false, false, 63, null)));
            AlignTopTextView warning4 = c36793lM25739T4.f80425D;
            Intrinsics.checkNotNullExpressionValue(warning4, "warning");
            C13402k0.m26334a(warning4, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        if (fFloatValue >= 10.0f) {
            AlignTopTextView warning5 = c36793lM25739T4.f80425D;
            Intrinsics.checkNotNullExpressionValue(warning5, "warning");
            C27046k.m66685H(warning5);
            c36793lM25739T4.f80425D.setText(C27017c.f54310a.m66516f(R$string.current_leverage_high_pay_attention_risk_liquidation, new Object[0]));
            AlignTopTextView warning6 = c36793lM25739T4.f80425D;
            Intrinsics.checkNotNullExpressionValue(warning6, "warning");
            C13402k0.m26334a(warning6, R$color.complementary, R$drawable.shape_complementary8_8r);
            return;
        }
        AlignTopTextView warning7 = c36793lM25739T4.f80425D;
        Intrinsics.checkNotNullExpressionValue(warning7, "warning");
        ViewExtKt.m66577h(warning7);
    }

    /* JADX INFO: renamed from: O4 */
    public final BigDecimal m25738O4(boolean z11, Map<String, com.kubi.futures.trade.submit.panel.footer.r0> map, List<SimpleBalanceEntity> list, List<PositionEntity> list2) {
        String settleCurrency;
        Object next;
        CrossHedgeQtyMargin crossHedgeQtyMargin;
        Object next2;
        String currency;
        String settleCurrency2;
        Iterator<T> it = list.iterator();
        do {
            settleCurrency = null;
            if (it.hasNext()) {
                next = it.next();
                currency = ((SimpleBalanceEntity) next).getCurrency();
                ContractEntity contractEntityM25683U4 = m25683U4();
                if (contractEntityM25683U4 != null) {
                    settleCurrency2 = contractEntityM25683U4.getSettleCurrency();
                } else {
                    settleCurrency2 = null;
                }
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(currency, settleCurrency2));
        SimpleBalanceEntity simpleBalanceEntity = (SimpleBalanceEntity) next;
        if (simpleBalanceEntity == null || (crossHedgeQtyMargin = simpleBalanceEntity.getHedgeQtyMargin()) == null) {
            crossHedgeQtyMargin = new CrossHedgeQtyMargin();
        }
        if (z11) {
            String strM25688a5 = m25688a5();
            ContractEntity contractEntityM25683U5 = m25683U4();
            if (contractEntityM25683U5 != null) {
                settleCurrency = contractEntityM25683U5.getSettleCurrency();
            }
            return com.kubi.futures.model.trade.order.a.a(crossHedgeQtyMargin, strM25688a5, false, C27041f.m66668h(settleCurrency), map);
        }
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                PositionEntity positionEntity = (PositionEntity) next2;
                if (Intrinsics.areEqual(positionEntity.getSymbol(), m25688a5()) && C37569d.m84649A(positionEntity)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        PositionEntity positionEntity2 = (PositionEntity) next2;
        if (positionEntity2 == null) {
            positionEntity2 = new PositionEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 131071, null);
        }
        String strM25688a6 = m25688a5();
        ContractEntity contractEntityM25683U6 = m25683U4();
        if (contractEntityM25683U6 != null) {
            settleCurrency = contractEntityM25683U6.getSettleCurrency();
        }
        return com.kubi.futures.model.trade.order.a.f(crossHedgeQtyMargin, strM25688a6, false, C27041f.m66668h(settleCurrency), CollectionsKt.mutableListOf(positionEntity2));
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        KcSeekBar kcSeekBar;
        super.onResume();
        m25742c5().m24683q();
        m25742c5().m26366z(m25688a5(), m25667E0());
        m25741b5().m26439d(m25688a5(), "CROSS");
        m25742c5().mo26365y(m25688a5());
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 != null && (kcSeekBar = c36793lM25739T4.f80447v) != null) {
            kcSeekBar.requestLayout();
        }
    }

    /* JADX INFO: renamed from: x5 */
    public final void m25744x5(KycLeverageEntity kycLeverageEntity) {
        boolean zAreEqual;
        C36793l c36793lM25739T4 = m25739T4();
        if (c36793lM25739T4 == null) {
            return;
        }
        if (KuMexDepend.f30378a.m35905g().c()) {
            if (kycLeverageEntity != null) {
                zAreEqual = Intrinsics.areEqual(kycLeverageEntity.getShowGuide(), Boolean.TRUE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                ConstraintLayout hintCl = c36793lM25739T4.f80441p;
                Intrinsics.checkNotNullExpressionValue(hintCl, "hintCl");
                C27046k.m66685H(hintCl);
                c36793lM25739T4.f80440o.setText(C27017c.f54310a.m66516f(R$string.kumex_leverage_kyc_guide, C17054k0.m36530d(kycLeverageEntity.getUserMaxLeverage(), false, 1, null), C17054k0.m36530d(kycLeverageEntity.getSiteMaxLeverage(), false, 1, null)));
                BaseTextView verifyTv = c36793lM25739T4.f80424C;
                Intrinsics.checkNotNullExpressionValue(verifyTv, "verifyTv");
                C27046k.m66711z(verifyTv, 0L, new Function0() { // from class: com.kubi.futures.settings.b0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CrossLeverageSettingDialog.m25724y5();
                    }
                }, 1, null);
                return;
            }
        }
        ConstraintLayout hintCl2 = c36793lM25739T4.f80441p;
        Intrinsics.checkNotNullExpressionValue(hintCl2, "hintCl");
        C27046k.m66700o(hintCl2);
    }
}
