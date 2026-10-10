package com.kubi.futures.trade.marginMode;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleKt;
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
import com.google.firebase.messaging.Constants;
import com.kubi.broker.BrokerConfig;
import com.kubi.futures.trade.marginMode.perpetualSwap.p082ui.PerpetualSwapFragment;
import com.kubi.futures.trade.vm.a2;
import com.kubi.futures.trade.vm.b1;
import com.kubi.futures.trade.vm.y1;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ModifyMarginModeErrorEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.dialog.LoadingDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36788k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ModifyMarginModeDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0018\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020\u0007H\u0016J\u0018\u0010?\u001a\u0002072\u0006\u00108\u001a\u00020/2\u0006\u0010@\u001a\u00020\u0007H\u0002J\b\u0010A\u001a\u000207H\u0002J\b\u0010B\u001a\u000207H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b \u0010\rR)\u0010\"\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00050\u00050#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b)\u0010\rR\u000e\u0010-\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/ModifyMarginModeDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "blockId", "", "isTrial", "", "()Z", "isTrial$delegate", "Lkotlin/Lazy;", "pageTrackId", "getPageTrackId", "()Ljava/lang/String;", "pageTrackId$delegate", "viewModel", "Lcom/kubi/futures/trade/marginMode/ModifyMarginModeViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/marginMode/ModifyMarginModeViewModel;", "viewModel$delegate", "futuresViewModel", "Lcom/kubi/futures/trade/vm/IFuturesStreamViewModel;", "getFuturesViewModel", "()Lcom/kubi/futures/trade/vm/IFuturesStreamViewModel;", "futuresViewModel$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogModifyMarginModeBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogModifyMarginModeBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "marginMode", "getMarginMode", "marginMode$delegate", "grays", "", "kotlin.jvm.PlatformType", "getGrays", "()Ljava/util/List;", "grays$delegate", "symbol", "getSymbol", "symbol$delegate", "initType", "", "clickIndex", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "trackConfirm", DbParams.KEY_CHANNEL_RESULT, "handleNotSwitch", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeErrorEntity;", "isBottomSheet", "setCheckBackground", "isChecked", "showLoading", "hideLoading", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifyMarginModeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyMarginModeDialog.kt\ncom/kubi/futures/trade/marginMode/ModifyMarginModeDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n106#2,15:249\n143#3,20:264\n1#4:284\n*S KotlinDebug\n*F\n+ 1 ModifyMarginModeDialog.kt\ncom/kubi/futures/trade/marginMode/ModifyMarginModeDialog\n*L\n75#1:249,15\n85#1:264,20\n*E\n"})
public final class ModifyMarginModeDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final String f23789q0 = "marginModule";

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f23790r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.marginMode.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ModifyMarginModeDialog.m26995F4(this.f23811b));
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f23791s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.marginMode.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyMarginModeDialog.m27002M4(this.f23812b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f23792t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f23793u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final InterfaceC24293a f23794v0;

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f23795w0;

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f23796x0;

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public final Lazy f23797y0;

    /* JADX INFO: renamed from: z0 */
    public int f23798z0;

    /* JADX INFO: renamed from: B0 */
    public static final /* synthetic */ KProperty<Object>[] f23788B0 = {Reflection.property1(new PropertyReference1Impl(ModifyMarginModeDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogModifyMarginModeBinding;", 0))};

    /* JADX INFO: renamed from: A0 */
    @NotNull
    public static final Companion f23787A0 = new Companion(null);

    /* JADX INFO: compiled from: ModifyMarginModeDialog.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/ModifyMarginModeDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/futures/trade/marginMode/ModifyMarginModeDialog;", "symbol", "", "marginMode", "grays", "", "isTrial", "", "pageId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ ModifyMarginModeDialog newInstance$default(Companion companion, String str, String str2, List list, boolean z11, String str3, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                str3 = C17060n0.m36552b();
            }
            return companion.newInstance(str, str2, list, z11, str3);
        }

        @NotNull
        public final ModifyMarginModeDialog newInstance(@NotNull String symbol, @NotNull String marginMode, @NotNull List<String> grays, boolean isTrial, @NotNull String pageId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(marginMode, "marginMode");
            Intrinsics.checkNotNullParameter(grays, "grays");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            ModifyMarginModeDialog modifyMarginModeDialog = new ModifyMarginModeDialog();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putString("data", marginMode);
            bundle.putStringArrayList("data_1", new ArrayList<>(grays));
            bundle.putBoolean("data_2", isTrial);
            bundle.putString("data_3", pageId);
            modifyMarginModeDialog.setArguments(bundle);
            return modifyMarginModeDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$a */
    /* JADX INFO: compiled from: ModifyMarginModeDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13735a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23799b;

        public C13735a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23799b = function;
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
            return this.f23799b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23799b.invoke(obj);
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
    private final boolean m26993E0() {
        return ((Boolean) this.f23790r0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m26998I4(C36788k0 c36788k0, ModifyMarginModeDialog modifyMarginModeDialog, Boolean bool) {
        c36788k0.f80378d.setEnabled(true);
        c36788k0.f80381g.setEnabled(true);
        if (bool.booleanValue()) {
            modifyMarginModeDialog.showLoading();
        } else {
            modifyMarginModeDialog.m26994E4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m26999J4(ModifyMarginModeDialog modifyMarginModeDialog, C36788k0 c36788k0) {
        if (modifyMarginModeDialog.f23798z0 == 0) {
            return Unit.INSTANCE;
        }
        c36788k0.f80378d.setEnabled(false);
        c36788k0.f80381g.setEnabled(false);
        modifyMarginModeDialog.m27021B4().m27028p(modifyMarginModeDialog.m27019z4(), "CROSS", modifyMarginModeDialog.m26993E0());
        C43852m.m96589a(modifyMarginModeDialog.m27018y4(), modifyMarginModeDialog.f23789q0, "2", new JSONObject().put("isTrialFunds", String.valueOf(modifyMarginModeDialog.m26993E0())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m27000K4(ModifyMarginModeDialog modifyMarginModeDialog, C36788k0 c36788k0) {
        if (modifyMarginModeDialog.f23798z0 == 1) {
            return Unit.INSTANCE;
        }
        c36788k0.f80378d.setEnabled(false);
        c36788k0.f80381g.setEnabled(false);
        modifyMarginModeDialog.m27021B4().m27028p(modifyMarginModeDialog.m27019z4(), SharedPositionInfo.MARGIN_MODE_ISOLATED, modifyMarginModeDialog.m26993E0());
        C43852m.m96589a(modifyMarginModeDialog.m27018y4(), modifyMarginModeDialog.f23789q0, "1", new JSONObject().put("isTrialFunds", String.valueOf(modifyMarginModeDialog.m26993E0())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    private final void m27003N4(View view, boolean z11) {
        view.setBackgroundResource(z11 ? R$drawable.shape_border_emphasis_8r : R$drawable.shape_border_emphasis8_8r);
    }

    private final void showLoading() {
        LoadingDialogFragment loadingDialogFragment = new LoadingDialogFragment();
        loadingDialogFragment.setCancelable(false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        loadingDialogFragment.show(childFragmentManager, "Loading");
    }

    /* JADX INFO: renamed from: x4 */
    private final String m27017x4() {
        return (String) this.f23795w0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    private final String m27018y4() {
        return (String) this.f23791s0.getValue();
    }

    /* JADX INFO: renamed from: z4 */
    private final String m27019z4() {
        return (String) this.f23797y0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final C36788k0 m27020A4() {
        return (C36788k0) this.f23794v0.getValue(this, f23788B0[0]);
    }

    /* JADX INFO: renamed from: B4 */
    public final ModifyMarginModeViewModel m27021B4() {
        return (ModifyMarginModeViewModel) this.f23792t0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_modify_margin_mode, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36788k0 c36788k0M27020A4 = m27020A4();
        if (c36788k0M27020A4 == null) {
            return;
        }
        C43852m.m96593e(m27018y4(), this.f23789q0, "1", new JSONObject().put("isTrialFunds", String.valueOf(m26993E0())));
        LinearLayoutCompat isolatedLayout = c36788k0M27020A4.f80381g;
        Intrinsics.checkNotNullExpressionValue(isolatedLayout, "isolatedLayout");
        C27046k.m66684G(isolatedLayout, m27025w4().contains(SharedPositionInfo.MARGIN_MODE_ISOLATED));
        LinearLayoutCompat crossLayout = c36788k0M27020A4.f80378d;
        Intrinsics.checkNotNullExpressionValue(crossLayout, "crossLayout");
        C27046k.m66684G(crossLayout, m27025w4().contains("CROSS"));
        if (Intrinsics.areEqual(m27017x4(), "CROSS")) {
            LinearLayoutCompat crossLayout2 = c36788k0M27020A4.f80378d;
            Intrinsics.checkNotNullExpressionValue(crossLayout2, "crossLayout");
            m27003N4(crossLayout2, true);
            LinearLayoutCompat isolatedLayout2 = c36788k0M27020A4.f80381g;
            Intrinsics.checkNotNullExpressionValue(isolatedLayout2, "isolatedLayout");
            m27003N4(isolatedLayout2, false);
            this.f23798z0 = 0;
        } else {
            LinearLayoutCompat crossLayout3 = c36788k0M27020A4.f80378d;
            Intrinsics.checkNotNullExpressionValue(crossLayout3, "crossLayout");
            m27003N4(crossLayout3, false);
            LinearLayoutCompat isolatedLayout3 = c36788k0M27020A4.f80381g;
            Intrinsics.checkNotNullExpressionValue(isolatedLayout3, "isolatedLayout");
            m27003N4(isolatedLayout3, true);
            this.f23798z0 = 1;
        }
        LinearLayoutCompat crossLayout4 = c36788k0M27020A4.f80378d;
        Intrinsics.checkNotNullExpressionValue(crossLayout4, "crossLayout");
        C27046k.m66711z(crossLayout4, 0L, new Function0() { // from class: com.kubi.futures.trade.marginMode.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginModeDialog.m26999J4(this.f23802b, c36788k0M27020A4);
            }
        }, 1, null);
        LinearLayoutCompat isolatedLayout4 = c36788k0M27020A4.f80381g;
        Intrinsics.checkNotNullExpressionValue(isolatedLayout4, "isolatedLayout");
        C27046k.m66711z(isolatedLayout4, 0L, new Function0() { // from class: com.kubi.futures.trade.marginMode.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginModeDialog.m27000K4(this.f23805b, c36788k0M27020A4);
            }
        }, 1, null);
        BrokerConfig brokerConfig = BrokerConfig.f19211a;
        if (brokerConfig.m20201d().mo20243v0() && brokerConfig.m20201d().mo20237Y0()) {
            BaseTextView modeSetting = c36788k0M27020A4.f80382h;
            Intrinsics.checkNotNullExpressionValue(modeSetting, "modeSetting");
            C27046k.m66685H(modeSetting);
        } else {
            BaseTextView modeSetting2 = c36788k0M27020A4.f80382h;
            Intrinsics.checkNotNullExpressionValue(modeSetting2, "modeSetting");
            C27046k.m66700o(modeSetting2);
        }
        BaseTextView modeSetting3 = c36788k0M27020A4.f80382h;
        Intrinsics.checkNotNullExpressionValue(modeSetting3, "modeSetting");
        C27046k.m66711z(modeSetting3, 0L, new Function0() { // from class: com.kubi.futures.trade.marginMode.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginModeDialog.m27001L4(this.f23807b);
            }
        }, 1, null);
        m27021B4().m27027o().observe(getViewLifecycleOwner(), new C13735a(new Function1() { // from class: com.kubi.futures.trade.marginMode.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginModeDialog.m26997H4(this.f23808b, (Pair) obj);
            }
        }));
        m27021B4().m27026n().observe(getViewLifecycleOwner(), new C13735a(new Function1() { // from class: com.kubi.futures.trade.marginMode.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginModeDialog.m26998I4(c36788k0M27020A4, this, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final a2 m27024v4() {
        return (a2) this.f23793u0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final List<String> m27025w4() {
        return (List) this.f23796x0.getValue();
    }

    public ModifyMarginModeDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$special$$inlined$viewModels$default$2
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
        this.f23792t0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ModifyMarginModeViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$special$$inlined$viewModels$default$5
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
        this.f23793u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.marginMode.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginModeDialog.m27016u4(this.f23813b);
            }
        });
        this.f23794v0 = C45681e.m100799e(this, new Function1<ModifyMarginModeDialog, C36788k0>() { // from class: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36788k0 invoke(@NotNull ModifyMarginModeDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36788k0.m82435a(fragment.requireView());
            }
        }, new Function1<C36788k0, Unit>() { // from class: com.kubi.futures.trade.marginMode.ModifyMarginModeDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36788k0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36788k0 c36788k0) {
                invoke(c36788k0);
                return Unit.INSTANCE;
            }
        });
        this.f23795w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.marginMode.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginModeDialog.m26996G4(this.f23814b);
            }
        });
        this.f23796x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.marginMode.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginModeDialog.m26992C4(this.f23815b);
            }
        });
        this.f23797y0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.marginMode.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginModeDialog.m27004O4(this.f23804b);
            }
        });
        this.f23798z0 = -1;
    }

    /* JADX INFO: renamed from: C4 */
    public static final List m26992C4(ModifyMarginModeDialog modifyMarginModeDialog) {
        ArrayList<String> stringArrayList;
        Bundle arguments = modifyMarginModeDialog.getArguments();
        if (arguments != null && (stringArrayList = arguments.getStringArrayList("data_1")) != null) {
            return stringArrayList;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: E4 */
    private final void m26994E4() {
        LoadingDialogFragment loadingDialogFragment;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("Loading");
        if (fragmentFindFragmentByTag instanceof LoadingDialogFragment) {
            loadingDialogFragment = (LoadingDialogFragment) fragmentFindFragmentByTag;
        } else {
            loadingDialogFragment = null;
        }
        if (loadingDialogFragment != null) {
            loadingDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final boolean m26995F4(ModifyMarginModeDialog modifyMarginModeDialog) {
        Boolean boolValueOf;
        Bundle arguments = modifyMarginModeDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_2"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: G4 */
    public static final String m26996G4(ModifyMarginModeDialog modifyMarginModeDialog) {
        Bundle arguments = modifyMarginModeDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m26997H4(ModifyMarginModeDialog modifyMarginModeDialog, Pair pair) throws JSONException {
        String str;
        ModifyMarginModeResultEntity modifyMarginModeResultEntity = (ModifyMarginModeResultEntity) pair.getSecond();
        Map<String, String> marginMode = modifyMarginModeResultEntity.getMarginMode();
        ModifyMarginModeErrorEntity modifyMarginModeErrorEntity = null;
        Object obj = null;
        if (marginMode != null) {
            str = marginMode.get(modifyMarginModeDialog.m27019z4());
        } else {
            str = null;
        }
        String strM66669i = C27041f.m66669i(str, SharedPositionInfo.MARGIN_MODE_ISOLATED);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            List<ModifyMarginModeErrorEntity> errors = modifyMarginModeResultEntity.getErrors();
            if (errors != null) {
                for (Object obj2 : errors) {
                    if (Intrinsics.areEqual(modifyMarginModeDialog.m27019z4(), ((ModifyMarginModeErrorEntity) obj2).getSymbol())) {
                        obj = obj2;
                        break;
                    }
                }
                modifyMarginModeErrorEntity = (ModifyMarginModeErrorEntity) obj;
            }
            if (modifyMarginModeErrorEntity != null) {
                modifyMarginModeDialog.m27022D4(modifyMarginModeErrorEntity);
                modifyMarginModeDialog.m27023P4(false, strM66669i);
                return Unit.INSTANCE;
            }
            modifyMarginModeDialog.m27023P4(true, strM66669i);
            modifyMarginModeDialog.m27024v4().l().postValue(MapsKt.mapOf(TuplesKt.m90091to(modifyMarginModeDialog.m27019z4(), strM66669i)));
            if (Intrinsics.areEqual(strM66669i, "CROSS")) {
                modifyMarginModeDialog.m27024v4().c(modifyMarginModeDialog.m27019z4());
            }
            modifyMarginModeDialog.dismissAllowingStateLoss();
        } else {
            modifyMarginModeDialog.m27023P4(false, strM66669i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m27001L4(ModifyMarginModeDialog modifyMarginModeDialog) {
        Context context = modifyMarginModeDialog.getContext();
        if (context != null) {
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            String string = modifyMarginModeDialog.getString(R$string.kumex_batch_exchange_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            companion.launch(context, PerpetualSwapFragment.class, string, BundleKt.bundleOf(new Pair("data", Boolean.valueOf(modifyMarginModeDialog.m26993E0()))));
        }
        modifyMarginModeDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final String m27002M4(ModifyMarginModeDialog modifyMarginModeDialog) {
        String string;
        Bundle arguments = modifyMarginModeDialog.getArguments();
        if (arguments != null && (string = arguments.getString("data_3")) != null) {
            return string;
        }
        return C17060n0.m36552b();
    }

    /* JADX INFO: renamed from: O4 */
    public static final String m27004O4(ModifyMarginModeDialog modifyMarginModeDialog) {
        String string;
        Bundle arguments = modifyMarginModeDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: u4 */
    public static final a2 m27016u4(ModifyMarginModeDialog modifyMarginModeDialog) {
        if (modifyMarginModeDialog.m26993E0()) {
            return y1.a(modifyMarginModeDialog);
        }
        return b1.a(modifyMarginModeDialog);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m27022D4(ModifyMarginModeErrorEntity modifyMarginModeErrorEntity) {
        if (Intrinsics.areEqual(modifyMarginModeErrorEntity.getCode(), "50002")) {
            dismissAllowingStateLoss();
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_modify_margin_mode_failed_title).m54153J4(R$string.kumex_modify_margin_mode_failed_desc).m54162S4(R$string.i_already_know, null).m54172c5(getParentFragmentManager());
        } else {
            C17058m0.m36549d(this, modifyMarginModeErrorEntity.getMsg());
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m27023P4(boolean z11, String str) throws JSONException {
        String str2;
        String strM27018y4 = m27018y4();
        String str3 = this.f23789q0;
        JSONObject jSONObject = new JSONObject();
        if (z11) {
            str2 = "success";
        } else {
            str2 = C33864ph.f71456b;
        }
        jSONObject.put("resultType", str2);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject.put("marginType", lowerCase);
        jSONObject.put("isTrialFunds", String.valueOf(m26993E0()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM27018y4, str3, "3", jSONObject);
    }
}
