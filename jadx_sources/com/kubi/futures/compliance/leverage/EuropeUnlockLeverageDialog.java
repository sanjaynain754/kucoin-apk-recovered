package com.kubi.futures.compliance.leverage;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import androidx.core.widget.NestedScrollView;
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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import dm.C36823q;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.Iterator;
import java.util.List;
import l10.C42025b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p729wl.C45875l0;
import p852kotlin.Function;
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
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;
import w00.C45681e;

/* JADX INFO: compiled from: EuropeUnlockLeverageDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\bH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020(H\u0002J\b\u00100\u001a\u00020(H\u0002J\b\u00101\u001a\u00020\bH\u0002J\b\u00102\u001a\u00020\bH\u0002J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020\bH\u0002J\b\u00105\u001a\u00020(H\u0002J\u0010\u00106\u001a\u00020(2\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020(H\u0002J\b\u0010:\u001a\u00020(H\u0002J\b\u0010;\u001a\u00020(H\u0002J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u000208H\u0002J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u000208H\u0002J\u0012\u0010?\u001a\u0004\u0018\u00010@2\u0006\u00107\u001a\u000208H\u0002J\u0012\u0010A\u001a\u0004\u0018\u00010\u00062\u0006\u00107\u001a\u000208H\u0002J\b\u0010B\u001a\u00020(H\u0016J\b\u0010C\u001a\u00020\u0010H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006E"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "taskNames", "", "", "requestCount", "", "unlockViewModel", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageViewModel;", "getUnlockViewModel", "()Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageViewModel;", "unlockViewModel$delegate", "Lkotlin/Lazy;", "isFinish", "", "()Z", "isFinish$delegate", "wrapLoading", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getWrapLoading", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "wrapLoading$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogEuropeUnlockLeverageBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogEuropeUnlockLeverageBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserver", "showContent", "showError", "initView", "setLevel", "setStageSuccess", "setCompleteStatus", "getFinishCount", "getTotalCount", "setHeight", "measureScrollViewHeight", "setStageOne", NotificationCompat.CATEGORY_NAVIGATION, "task", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "setStageTwo", "setStageThree", "setHint", "getStageTitle", FirebaseAnalytics.Param.LEVEL, "getStageDesc", "buildOrderTask", "Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageFillOrderEvent;", "buildH5Task", "onResume", "isLastLevelAllComplete", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEuropeUnlockLeverageDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuropeUnlockLeverageDialog.kt\ncom/kubi/futures/compliance/leverage/EuropeUnlockLeverageDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,602:1\n106#2,15:603\n143#3,20:618\n172#4,2:638\n1788#5,4:640\n1788#5,4:644\n*S KotlinDebug\n*F\n+ 1 EuropeUnlockLeverageDialog.kt\ncom/kubi/futures/compliance/leverage/EuropeUnlockLeverageDialog\n*L\n77#1:603,15\n89#1:618,20\n207#1:638,2\n276#1:640,4\n599#1:644,4\n*E\n"})
public final class EuropeUnlockLeverageDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final List<String> f22611q0 = CollectionsKt.listOf((Object[]) new String[]{"ACADEMY_BASIC_EXAM", "ACADEMY_ADVANCED_EXAM", "ACADEMY_HIGH_EXAM", "FUTURE_LIMIT_PRICE_LONG", "FUTURE_LIMIT_PRICE_SHORT", "FUTURE_MARKET_PRICE_LONG", "FUTURE_MARKET_PRICE_SHORT", "FUTURE_LONG_STOP", "FUTURE_SHORT_STOP"});

    /* JADX INFO: renamed from: r0 */
    public int f22612r0 = 2;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22613s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f22614t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f22615u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final InterfaceC24293a f22616v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f22610x0 = {Reflection.property1(new PropertyReference1Impl(EuropeUnlockLeverageDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogEuropeUnlockLeverageBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f22609w0 = new Companion(null);

    /* JADX INFO: compiled from: EuropeUnlockLeverageDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/futures/compliance/leverage/EuropeUnlockLeverageDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "isFinish", "", "isNotice", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void show$default(Companion companion, FragmentManager fragmentManager, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            companion.show(fragmentManager, z11, z12);
        }

        public final void show(@NotNull FragmentManager manager, boolean isFinish, boolean isNotice) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            EuropeUnlockLeverageDialog europeUnlockLeverageDialog = new EuropeUnlockLeverageDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("data_2", isFinish);
            bundle.putBoolean("data_1", isNotice);
            europeUnlockLeverageDialog.setArguments(bundle);
            europeUnlockLeverageDialog.show(manager, "EuropeUnlockLeverageDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$a */
    /* JADX INFO: compiled from: EuropeUnlockLeverageDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12881a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f22617b;

        public C12881a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22617b = function;
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
            return this.f22617b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22617b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: e5 */
    public static final void m24631e5(EuropeUnlockLeverageDialog europeUnlockLeverageDialog, View view) {
        europeUnlockLeverageDialog.f22612r0 = 2;
        WrapperLoadingView wrapperLoadingViewM24650E4 = europeUnlockLeverageDialog.m24650E4();
        if (wrapperLoadingViewM24650E4 != null) {
            wrapperLoadingViewM24650E4.showLoading();
        }
        europeUnlockLeverageDialog.m24648C4().m24683q();
        europeUnlockLeverageDialog.m24648C4().m24684r();
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m24619G4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog, Pair pair) {
        int i11 = europeUnlockLeverageDialog.f22612r0;
        if (i11 > 0) {
            europeUnlockLeverageDialog.f22612r0 = i11 - 1;
        }
        europeUnlockLeverageDialog.showContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m24620H4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog, Pair pair) {
        int i11 = europeUnlockLeverageDialog.f22612r0;
        if (i11 > 0) {
            europeUnlockLeverageDialog.f22612r0 = i11 - 1;
        }
        europeUnlockLeverageDialog.showContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m24625T4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101348p0(), null, null, null, null, null, null, 126, null);
        europeUnlockLeverageDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m24627Y4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog) {
        Router.f46192a.m56184f(C45875l0.f103336a.m101348p0()).m4048k();
        europeUnlockLeverageDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final void showContent() {
        if (this.f22612r0 > 0) {
            return;
        }
        Pair<List<EuropeUnlockLeverageLevelTaskEntity>, Throwable> value = m24648C4().m24689w().getValue();
        Pair<EuropeUnlockLeverageLevelEntity, Throwable> value2 = m24648C4().m24687u().getValue();
        if ((value != null ? value.getSecond() : null) == null) {
            if ((value2 != null ? value2.getSecond() : null) == null) {
                WrapperLoadingView wrapperLoadingViewM24650E4 = m24650E4();
                if (wrapperLoadingViewM24650E4 != null) {
                    wrapperLoadingViewM24650E4.showContent();
                }
                m24658U4();
                return;
            }
        }
        m24630d5();
    }

    /* JADX INFO: renamed from: C4 */
    public final EuropeUnlockLeverageViewModel m24648C4() {
        return (EuropeUnlockLeverageViewModel) this.f22613s0.getValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final C36823q m24649D4() {
        return (C36823q) this.f22616v0.getValue(this, f22610x0[0]);
    }

    /* JADX INFO: renamed from: E4 */
    public final WrapperLoadingView m24650E4() {
        return (WrapperLoadingView) this.f22615u0.getValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final boolean m24651K4() {
        return ((Boolean) this.f22614t0.getValue()).booleanValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_europe_unlock_leverage, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m24656Q4();
        m24618F4();
        WrapperLoadingView wrapperLoadingViewM24650E4 = m24650E4();
        if (wrapperLoadingViewM24650E4 != null) {
            wrapperLoadingViewM24650E4.showLoading();
        }
        m24648C4().m24683q();
        m24648C4().m24684r();
    }

    public EuropeUnlockLeverageDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$special$$inlined$viewModels$default$2
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
        this.f22613s0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EuropeUnlockLeverageViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$special$$inlined$viewModels$default$5
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
        this.f22614t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(EuropeUnlockLeverageDialog.m24623L4(this.f22627b));
            }
        });
        this.f22615u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.leverage.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeUnlockLeverageDialog.m24632f5(this.f22629b);
            }
        });
        this.f22616v0 = C45681e.m100799e(this, new Function1<EuropeUnlockLeverageDialog, C36823q>() { // from class: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36823q invoke(@NotNull EuropeUnlockLeverageDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36823q.m82508a(fragment.requireView());
            }
        }, new Function1<C36823q, Unit>() { // from class: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36823q it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36823q c36823q) {
                invoke(c36823q);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    private final int m24617B4() {
        Integer numValueOf;
        List<EuropeUnlockLeverageLevelTaskEntity> listM24688v = m24648C4().m24688v();
        if (listM24688v != null) {
            numValueOf = Integer.valueOf(listM24688v.size());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: F4 */
    private final void m24618F4() {
        m24648C4().m24687u().observe(getViewLifecycleOwner(), new C12881a(new Function1() { // from class: com.kubi.futures.compliance.leverage.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeUnlockLeverageDialog.m24619G4(this.f22667b, (Pair) obj);
            }
        }));
        m24648C4().m24689w().observe(getViewLifecycleOwner(), new C12881a(new Function1() { // from class: com.kubi.futures.compliance.leverage.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EuropeUnlockLeverageDialog.m24620H4(this.f22668b, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m24621I4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog) {
        europeUnlockLeverageDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m24622J4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog) {
        europeUnlockLeverageDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final boolean m24623L4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog) {
        Boolean boolValueOf;
        Bundle arguments = europeUnlockLeverageDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data_2"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: R4 */
    public static final void m24624R4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog) {
        europeUnlockLeverageDialog.m24653N4();
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m24626W4(EuropeUnlockLeverageDialog europeUnlockLeverageDialog, EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        europeUnlockLeverageDialog.m24654O4(europeUnlockLeverageLevelTaskEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m24628a5(EuropeUnlockLeverageDialog europeUnlockLeverageDialog, EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        europeUnlockLeverageDialog.m24654O4(europeUnlockLeverageLevelTaskEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m24629c5(EuropeUnlockLeverageDialog europeUnlockLeverageDialog, EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        europeUnlockLeverageDialog.m24654O4(europeUnlockLeverageLevelTaskEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    private final void m24630d5() {
        WrapperLoadingView wrapperLoadingViewM24650E4 = m24650E4();
        if (wrapperLoadingViewM24650E4 != null) {
            wrapperLoadingViewM24650E4.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.futures.compliance.leverage.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EuropeUnlockLeverageDialog.m24631e5(this.f22661b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f5 */
    public static final WrapperLoadingView m24632f5(EuropeUnlockLeverageDialog europeUnlockLeverageDialog) {
        LinearLayout linearLayout;
        C36823q c36823qM24649D4 = europeUnlockLeverageDialog.m24649D4();
        if (c36823qM24649D4 != null && (linearLayout = c36823qM24649D4.f80826b) != null) {
            return WrapperLoadingView.injectView(linearLayout);
        }
        return null;
    }

    private final void initView() {
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null) {
            return;
        }
        AppCompatImageView close = c36823qM24649D4.f80827c;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeUnlockLeverageDialog.m24621I4(this.f22665b);
            }
        }, 1, null);
        KcPrimaryButton know = c36823qM24649D4.f80832h;
        Intrinsics.checkNotNullExpressionValue(know, "know");
        C27046k.m66711z(know, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeUnlockLeverageDialog.m24622J4(this.f22666b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: y4 */
    private final int m24646y4() {
        Integer numValueOf;
        List<EuropeUnlockLeverageLevelTaskEntity> listM24688v = m24648C4().m24688v();
        if (listM24688v != null) {
            int i11 = 0;
            if (!listM24688v.isEmpty()) {
                Iterator<T> it = listM24688v.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((EuropeUnlockLeverageLevelTaskEntity) it.next()).getStatus(), "FINISHED") && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            numValueOf = Integer.valueOf(i11);
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: A4 */
    public final String m24647A4(EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        String strM66668h = C27041f.m66668h(europeUnlockLeverageLevelTaskEntity.getTaskName());
        switch (strM66668h.hashCode()) {
            case -1051849623:
                if (strM66668h.equals("FUTURE_LONG_STOP")) {
                    String string = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_limit_long_trigger);
                    Intrinsics.checkNotNull(string);
                    return string;
                }
                break;
            case -976928711:
                if (strM66668h.equals("FUTURE_MARKET_PRICE_LONG")) {
                    String string2 = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_market_long);
                    Intrinsics.checkNotNull(string2);
                    return string2;
                }
                break;
            case -497053198:
                if (strM66668h.equals("FUTURE_LIMIT_PRICE_LONG")) {
                    String string3 = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_limit_long);
                    Intrinsics.checkNotNull(string3);
                    return string3;
                }
                break;
            case -213761473:
                if (strM66668h.equals("FUTURE_MARKET_PRICE_SHORT")) {
                    String string4 = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_market_short);
                    Intrinsics.checkNotNull(string4);
                    return string4;
                }
                break;
            case 1777477542:
                if (strM66668h.equals("FUTURE_LIMIT_PRICE_SHORT")) {
                    String string5 = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_limit_short);
                    Intrinsics.checkNotNull(string5);
                    return string5;
                }
                break;
        }
        String string6 = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_limit_short_trigger);
        Intrinsics.checkNotNull(string6);
        return string6;
    }

    /* JADX INFO: renamed from: M4 */
    public final boolean m24652M4() {
        Integer numValueOf;
        int i11;
        List<EuropeUnlockLeverageLevelTaskEntity> listM24688v = m24648C4().m24688v();
        if (listM24688v != null) {
            if (listM24688v.isEmpty()) {
                i11 = 0;
            } else {
                Iterator<T> it = listM24688v.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((EuropeUnlockLeverageLevelTaskEntity) it.next()).getStatus(), "FINISHED") && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            numValueOf = Integer.valueOf(i11);
        } else {
            numValueOf = null;
        }
        if (C27039d.m66650j(numValueOf) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: N4 */
    public final int m24653N4() {
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null) {
            return 0;
        }
        c36823qM24649D4.f80834j.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c36823qM24649D4.f80834j.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: O4 */
    public final void m24654O4(EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        EuropeUnlockLeverageFillOrderEvent europeUnlockLeverageFillOrderEventM24664x4 = m24664x4(europeUnlockLeverageLevelTaskEntity);
        if (europeUnlockLeverageFillOrderEventM24664x4 != null) {
            EuropeTrialSimulationOrderDialog.Companion companion = EuropeTrialSimulationOrderDialog.f22596y0;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            companion.show(childFragmentManager, europeUnlockLeverageFillOrderEventM24664x4, m24646y4(), m24617B4());
            return;
        }
        String strM24663w4 = m24663w4(europeUnlockLeverageLevelTaskEntity);
        if (strM24663w4 != null && strM24663w4.length() != 0) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, strM24663w4, null, null, null, null, null, null, 126, null);
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: P4 */
    public final void m24655P4() {
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntityM24686t;
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null || (europeUnlockLeverageLevelEntityM24686t = m24648C4().m24686t()) == null) {
            return;
        }
        c36823qM24649D4.f80850z.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_success_task_title, C27039d.m66656p(europeUnlockLeverageLevelEntityM24686t.getLevelLeverage())));
        c36823qM24649D4.f80847w.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_success_task_desc, "Level " + C27039d.m66650j(europeUnlockLeverageLevelEntityM24686t.getLevel()), C27039d.m66656p(europeUnlockLeverageLevelEntityM24686t.getLevelLeverage())));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView successDesc = c36823qM24649D4.f80847w;
        Intrinsics.checkNotNullExpressionValue(successDesc, "successDesc");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)));
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(R$font.medium);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(successDesc, pair, new Pair(textTagEnum, typefaceSpanM36545b));
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m24656Q4() {
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null) {
            return;
        }
        c36823qM24649D4.getRoot().post(new Runnable() { // from class: com.kubi.futures.compliance.leverage.s
            @Override // java.lang.Runnable
            public final void run() {
                EuropeUnlockLeverageDialog.m24624R4(this.f22660b);
            }
        });
    }

    /* JADX INFO: renamed from: S4 */
    public final void m24657S4() {
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntityM24686t;
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null || (europeUnlockLeverageLevelEntityM24686t = m24648C4().m24686t()) == null) {
            return;
        }
        c36823qM24649D4.f80824B.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_lock, C27039d.m66656p(europeUnlockLeverageLevelEntityM24686t.getNextLevelLeverage())));
        c36823qM24649D4.f80828d.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_desc, C27039d.m66656p(europeUnlockLeverageLevelEntityM24686t.getLevelLeverage())));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView desc = c36823qM24649D4.f80828d;
        Intrinsics.checkNotNullExpressionValue(desc, "desc");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$color.c_text;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i11)));
        int i12 = R$font.medium;
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(i12);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(desc, pair, new Pair(textTagEnum, typefaceSpanM36545b));
        ShapeConstraintLayout hintLayout = c36823qM24649D4.f80831g;
        Intrinsics.checkNotNullExpressionValue(hintLayout, "hintLayout");
        C27046k.m66685H(hintLayout);
        c36823qM24649D4.f80830f.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_hint, C27039d.m66656p(europeUnlockLeverageLevelEntityM24686t.getMaxLevelLeverage())));
        BaseTextView hintDesc = c36823qM24649D4.f80830f;
        Intrinsics.checkNotNullExpressionValue(hintDesc, "hintDesc");
        Pair pair2 = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i11)));
        TypefaceSpan typefaceSpanM36545b2 = C17056l0.m36545b(i12);
        if (typefaceSpanM36545b2 == null) {
            typefaceSpanM36545b2 = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(hintDesc, pair2, new Pair(textTagEnum, typefaceSpanM36545b2));
        c36823qM24649D4.f80829e.setText(getString(R$string.newbie_view_more) + Typography.greater);
        BaseTextView hintAction = c36823qM24649D4.f80829e;
        Intrinsics.checkNotNullExpressionValue(hintAction, "hintAction");
        C27046k.m66711z(hintAction, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeUnlockLeverageDialog.m24625T4(this.f22635b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: U4 */
    public final void m24658U4() {
        if (m24651K4()) {
            m24660X4();
        } else {
            m24657S4();
        }
        m24659V4();
        m24662b5();
        m24661Z4();
        m24656Q4();
    }

    /* JADX INFO: renamed from: V4 */
    public final void m24659V4() {
        final EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity;
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null) {
            return;
        }
        List<EuropeUnlockLeverageLevelTaskEntity> listM24688v = m24648C4().m24688v();
        if (listM24688v != null) {
            europeUnlockLeverageLevelTaskEntity = (EuropeUnlockLeverageLevelTaskEntity) CollectionsKt.firstOrNull((List) listM24688v);
        } else {
            europeUnlockLeverageLevelTaskEntity = null;
        }
        if (europeUnlockLeverageLevelTaskEntity != null && this.f22611q0.contains(C27041f.m66668h(europeUnlockLeverageLevelTaskEntity.getTaskName()))) {
            ShapeConstraintLayout stageOne = c36823qM24649D4.f80835k;
            Intrinsics.checkNotNullExpressionValue(stageOne, "stageOne");
            C27046k.m66711z(stageOne, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EuropeUnlockLeverageDialog.m24626W4(this.f22631b, europeUnlockLeverageLevelTaskEntity);
                }
            }, 1, null);
            boolean zAreEqual = Intrinsics.areEqual(europeUnlockLeverageLevelTaskEntity.getStatus(), "FINISHED");
            c36823qM24649D4.f80836l.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_basic_time, "20"));
            if (zAreEqual) {
                c36823qM24649D4.f80835k.setEnabled(false);
                c36823qM24649D4.f80837m.setImageResource(R$drawable.ic2_success_filled_20);
                C42025b c42025bM92149k = c36823qM24649D4.f80835k.getShapeDrawableBuilder().m92149k(C27040e.m66658b(12));
                C27017c c27017c = C27017c.f54310a;
                c42025bM92149k.m92152n(c27017c.m66512a(R$color.c_cover8)).m92153o(C27040e.m66658b(1)).m92143e();
                c36823qM24649D4.f80838n.setTextColor(c27017c.m66512a(R$color.c_text40));
                return;
            }
            c36823qM24649D4.f80835k.setEnabled(true);
            c36823qM24649D4.f80837m.setImageResource(R$drawable.ic2_arrow_right2_20);
            C42025b c42025bM92149k2 = c36823qM24649D4.f80835k.getShapeDrawableBuilder().m92149k(C27040e.m66658b(12));
            C27017c c27017c2 = C27017c.f54310a;
            c42025bM92149k2.m92152n(c27017c2.m66512a(R$color.emphasis)).m92153o(C27040e.m66658b(1)).m92143e();
            c36823qM24649D4.f80838n.setTextColor(c27017c2.m66512a(R$color.c_text));
            return;
        }
        ShapeConstraintLayout stageOne2 = c36823qM24649D4.f80835k;
        Intrinsics.checkNotNullExpressionValue(stageOne2, "stageOne");
        ViewExtKt.m66577h(stageOne2);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m24660X4() {
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntityM24686t;
        boolean zM24652M4 = m24652M4();
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null || (europeUnlockLeverageLevelEntityM24686t = m24648C4().m24686t()) == null) {
            return;
        }
        List<EuropeUnlockLeverageLevelTaskEntity> listM24688v = m24648C4().m24688v();
        if (listM24688v == null) {
            listM24688v = CollectionsKt.emptyList();
        }
        Iterator<EuropeUnlockLeverageLevelTaskEntity> it = listM24688v.iterator();
        while (it.hasNext()) {
            if (this.f22611q0.contains(C27041f.m66668h(it.next().getTaskName()))) {
                BaseTextView title = c36823qM24649D4.f80823A;
                Intrinsics.checkNotNullExpressionValue(title, "title");
                ViewExtKt.m66577h(title);
                AppCompatImageView close = c36823qM24649D4.f80827c;
                Intrinsics.checkNotNullExpressionValue(close, "close");
                ViewExtKt.m66577h(close);
                BaseTextView desc = c36823qM24649D4.f80828d;
                Intrinsics.checkNotNullExpressionValue(desc, "desc");
                ViewExtKt.m66577h(desc);
                BaseTextView unlockLeverage = c36823qM24649D4.f80824B;
                Intrinsics.checkNotNullExpressionValue(unlockLeverage, "unlockLeverage");
                ViewExtKt.m66577h(unlockLeverage);
                Group successGroup = c36823qM24649D4.f80848x;
                Intrinsics.checkNotNullExpressionValue(successGroup, "successGroup");
                C27046k.m66685H(successGroup);
                if (!zM24652M4) {
                    ShapeConstraintLayout hintLayout = c36823qM24649D4.f80831g;
                    Intrinsics.checkNotNullExpressionValue(hintLayout, "hintLayout");
                    C27046k.m66685H(hintLayout);
                    c36823qM24649D4.f80831g.getShapeDrawableBuilder().m92149k(0.0f).m92151m(0).m92143e();
                    ShapeConstraintLayout hintLayout2 = c36823qM24649D4.f80831g;
                    Intrinsics.checkNotNullExpressionValue(hintLayout2, "hintLayout");
                    hintLayout2.setPadding(0, 0, 0, 0);
                    BaseTextView hintDesc = c36823qM24649D4.f80830f;
                    Intrinsics.checkNotNullExpressionValue(hintDesc, "hintDesc");
                    ViewExtKt.m66577h(hintDesc);
                    BaseTextView hintAction = c36823qM24649D4.f80829e;
                    Intrinsics.checkNotNullExpressionValue(hintAction, "hintAction");
                    C27046k.m66685H(hintAction);
                    c36823qM24649D4.f80829e.setText(getString(R$string.newbie_view_more) + Typography.greater);
                    BaseTextView hintAction2 = c36823qM24649D4.f80829e;
                    Intrinsics.checkNotNullExpressionValue(hintAction2, "hintAction");
                    C27046k.m66711z(hintAction2, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.u
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EuropeUnlockLeverageDialog.m24627Y4(this.f22662b);
                        }
                    }, 1, null);
                    m24655P4();
                    return;
                }
                ShapeConstraintLayout hintLayout3 = c36823qM24649D4.f80831g;
                Intrinsics.checkNotNullExpressionValue(hintLayout3, "hintLayout");
                ViewExtKt.m66577h(hintLayout3);
                int iM24646y4 = m24646y4();
                BaseTextView baseTextView = c36823qM24649D4.f80850z;
                int i11 = R$string.kumex_eurpe_leverage_edu_unlock_leverage_success;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iM24646y4);
                sb2.append('/');
                sb2.append(m24617B4());
                baseTextView.setText(getString(i11, sb2.toString()));
                c36823qM24649D4.f80847w.setText(getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_success_desc, String.valueOf(m24617B4() - iM24646y4), "Level " + C27039d.m66650j(europeUnlockLeverageLevelEntityM24686t.getNextLevel()), C27039d.m66656p(europeUnlockLeverageLevelEntityM24686t.getNextLevelLeverage())));
                HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
                BaseTextView successDesc = c36823qM24649D4.f80847w;
                Intrinsics.checkNotNullExpressionValue(successDesc, "successDesc");
                HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
                C27017c c27017c = C27017c.f54310a;
                int i12 = R$color.c_text;
                Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i12)));
                int i13 = R$font.medium;
                TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(i13);
                if (typefaceSpanM36545b == null) {
                    typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
                }
                Pair pair2 = new Pair(textTagEnum, typefaceSpanM36545b);
                HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN1;
                Pair pair3 = new Pair(textTagEnum2, new ForegroundColorSpan(c27017c.m66512a(i12)));
                TypefaceSpan typefaceSpanM36545b2 = C17056l0.m36545b(i13);
                if (typefaceSpanM36545b2 == null) {
                    typefaceSpanM36545b2 = new TypefaceSpan("sans-serif-medium");
                }
                highlightTextHelper.m54120f(successDesc, pair, pair2, pair3, new Pair(textTagEnum2, typefaceSpanM36545b2));
                return;
            }
        }
        BaseTextView title2 = c36823qM24649D4.f80823A;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        ViewExtKt.m66577h(title2);
        AppCompatImageView close2 = c36823qM24649D4.f80827c;
        Intrinsics.checkNotNullExpressionValue(close2, "close");
        ViewExtKt.m66577h(close2);
        BaseTextView desc2 = c36823qM24649D4.f80828d;
        Intrinsics.checkNotNullExpressionValue(desc2, "desc");
        ViewExtKt.m66577h(desc2);
        ShapeConstraintLayout hintLayout4 = c36823qM24649D4.f80831g;
        Intrinsics.checkNotNullExpressionValue(hintLayout4, "hintLayout");
        ViewExtKt.m66577h(hintLayout4);
        BaseTextView unlockLeverage2 = c36823qM24649D4.f80824B;
        Intrinsics.checkNotNullExpressionValue(unlockLeverage2, "unlockLeverage");
        ViewExtKt.m66577h(unlockLeverage2);
        Group successGroup2 = c36823qM24649D4.f80848x;
        Intrinsics.checkNotNullExpressionValue(successGroup2, "successGroup");
        C27046k.m66685H(successGroup2);
        View line = c36823qM24649D4.f80833i;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        ViewExtKt.m66577h(line);
        m24655P4();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m24661Z4() {
        int iM54281f;
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null) {
            return;
        }
        List<EuropeUnlockLeverageLevelTaskEntity> listM24688v = m24648C4().m24688v();
        if (listM24688v == null) {
            listM24688v = CollectionsKt.emptyList();
        }
        final EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity = (EuropeUnlockLeverageLevelTaskEntity) CollectionsKt.getOrNull(listM24688v, 2);
        if (europeUnlockLeverageLevelTaskEntity != null && this.f22611q0.contains(C27041f.m66668h(europeUnlockLeverageLevelTaskEntity.getTaskName()))) {
            ShapeConstraintLayout stageThree = c36823qM24649D4.f80839o;
            Intrinsics.checkNotNullExpressionValue(stageThree, "stageThree");
            C27046k.m66711z(stageThree, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EuropeUnlockLeverageDialog.m24628a5(this.f22637b, europeUnlockLeverageLevelTaskEntity);
                }
            }, 1, null);
            c36823qM24649D4.f80840p.setText(m24665z4(europeUnlockLeverageLevelTaskEntity));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView stageThreeDesc = c36823qM24649D4.f80840p;
            Intrinsics.checkNotNullExpressionValue(stageThreeDesc, "stageThreeDesc");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$color.c_text40;
            highlightTextHelper.m54120f(stageThreeDesc, new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i11))));
            c36823qM24649D4.f80842r.setText(m24647A4(europeUnlockLeverageLevelTaskEntity));
            if (Intrinsics.areEqual(europeUnlockLeverageLevelTaskEntity.getStatus(), "FINISHED")) {
                c36823qM24649D4.f80839o.setEnabled(false);
                c36823qM24649D4.f80841q.setImageResource(R$drawable.ic2_success_filled_20);
                c36823qM24649D4.f80839o.getShapeDrawableBuilder().m92149k(C27040e.m66658b(12)).m92152n(c27017c.m66512a(R$color.c_cover8)).m92153o(C27040e.m66658b(1)).m92143e();
                iM54281f = c27017c.m66512a(i11);
                c36823qM24649D4.f80842r.setTextColor(iM54281f);
            } else {
                c36823qM24649D4.f80839o.setEnabled(true);
                c36823qM24649D4.f80841q.setImageResource(R$drawable.ic2_arrow_right2_20);
                c36823qM24649D4.f80839o.getShapeDrawableBuilder().m92149k(C27040e.m66658b(12)).m92152n(c27017c.m66512a(R$color.emphasis)).m92153o(C27040e.m66658b(1)).m92143e();
                c36823qM24649D4.f80842r.setTextColor(c27017c.m66512a(R$color.c_text));
                Context context = c36823qM24649D4.f80842r.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iM54281f = C22890g.m54281f(context, StringsKt.contains$default((CharSequence) europeUnlockLeverageLevelTaskEntity.getTaskName(), (CharSequence) SharedPositionInfo.SIDE_LONG, false, 2, (Object) null));
            }
            BaseTextView stageThreeTitle = c36823qM24649D4.f80842r;
            Intrinsics.checkNotNullExpressionValue(stageThreeTitle, "stageThreeTitle");
            highlightTextHelper.m54120f(stageThreeTitle, new Pair(textTagEnum, new ForegroundColorSpan(iM54281f)));
            return;
        }
        ShapeConstraintLayout stageThree2 = c36823qM24649D4.f80839o;
        Intrinsics.checkNotNullExpressionValue(stageThree2, "stageThree");
        ViewExtKt.m66577h(stageThree2);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m24662b5() {
        int iM54281f;
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 == null) {
            return;
        }
        List<EuropeUnlockLeverageLevelTaskEntity> listM24688v = m24648C4().m24688v();
        if (listM24688v == null) {
            listM24688v = CollectionsKt.emptyList();
        }
        final EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity = (EuropeUnlockLeverageLevelTaskEntity) CollectionsKt.getOrNull(listM24688v, 1);
        if (europeUnlockLeverageLevelTaskEntity != null && this.f22611q0.contains(C27041f.m66668h(europeUnlockLeverageLevelTaskEntity.getTaskName()))) {
            ShapeConstraintLayout stageTwo = c36823qM24649D4.f80843s;
            Intrinsics.checkNotNullExpressionValue(stageTwo, "stageTwo");
            C27046k.m66711z(stageTwo, 0L, new Function0() { // from class: com.kubi.futures.compliance.leverage.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EuropeUnlockLeverageDialog.m24629c5(this.f22663b, europeUnlockLeverageLevelTaskEntity);
                }
            }, 1, null);
            c36823qM24649D4.f80844t.setText(m24665z4(europeUnlockLeverageLevelTaskEntity));
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView stageTwoDesc = c36823qM24649D4.f80844t;
            Intrinsics.checkNotNullExpressionValue(stageTwoDesc, "stageTwoDesc");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$color.c_text40;
            highlightTextHelper.m54120f(stageTwoDesc, new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i11))));
            c36823qM24649D4.f80846v.setText(m24647A4(europeUnlockLeverageLevelTaskEntity));
            if (Intrinsics.areEqual(europeUnlockLeverageLevelTaskEntity.getStatus(), "FINISHED")) {
                c36823qM24649D4.f80843s.setEnabled(false);
                c36823qM24649D4.f80845u.setImageResource(R$drawable.ic2_success_filled_20);
                c36823qM24649D4.f80843s.getShapeDrawableBuilder().m92149k(C27040e.m66658b(12)).m92152n(c27017c.m66512a(R$color.c_cover8)).m92153o(C27040e.m66658b(1)).m92143e();
                iM54281f = c27017c.m66512a(i11);
                c36823qM24649D4.f80846v.setTextColor(iM54281f);
            } else {
                c36823qM24649D4.f80843s.setEnabled(true);
                c36823qM24649D4.f80845u.setImageResource(R$drawable.ic2_arrow_right2_20);
                c36823qM24649D4.f80843s.getShapeDrawableBuilder().m92149k(C27040e.m66658b(12)).m92152n(c27017c.m66512a(R$color.emphasis)).m92153o(C27040e.m66658b(1)).m92143e();
                Context context = c36823qM24649D4.f80846v.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iM54281f = C22890g.m54281f(context, StringsKt.contains$default((CharSequence) europeUnlockLeverageLevelTaskEntity.getTaskName(), (CharSequence) SharedPositionInfo.SIDE_LONG, false, 2, (Object) null));
                c36823qM24649D4.f80846v.setTextColor(c27017c.m66512a(R$color.c_text));
            }
            BaseTextView stageTwoTitle = c36823qM24649D4.f80846v;
            Intrinsics.checkNotNullExpressionValue(stageTwoTitle, "stageTwoTitle");
            highlightTextHelper.m54120f(stageTwoTitle, new Pair(textTagEnum, new ForegroundColorSpan(iM54281f)));
            return;
        }
        ShapeConstraintLayout stageTwo2 = c36823qM24649D4.f80843s;
        Intrinsics.checkNotNullExpressionValue(stageTwo2, "stageTwo");
        ViewExtKt.m66577h(stageTwo2);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        NestedScrollView nestedScrollView;
        super.onResume();
        C36823q c36823qM24649D4 = m24649D4();
        if (c36823qM24649D4 != null && (nestedScrollView = c36823qM24649D4.f80834j) != null) {
            nestedScrollView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final String m24663w4(EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        if (!Intrinsics.areEqual(europeUnlockLeverageLevelTaskEntity.getStatus(), "FINISHED")) {
            return C45875l0.f103336a.m101348p0();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r3.equals("FUTURE_LIMIT_PRICE_SHORT") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r3.equals("FUTURE_MARKET_PRICE_SHORT") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r3.equals("FUTURE_LIMIT_PRICE_LONG") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (p852kotlin.jvm.internal.Intrinsics.areEqual(r17.getTaskName(), "FUTURE_LIMIT_PRICE_LONG") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r9 = "buy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r1 = com.kubi.kumex.logic.constant.OrderTradeType.Limit;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r3.equals("FUTURE_MARKET_PRICE_LONG") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (p852kotlin.jvm.internal.Intrinsics.areEqual(r17.getTaskName(), "FUTURE_MARKET_PRICE_LONG") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r9 = "buy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r1 = com.kubi.kumex.logic.constant.OrderTradeType.Market;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r3.equals("FUTURE_LONG_STOP") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r3.equals("FUTURE_SHORT_STOP") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        if (p852kotlin.jvm.internal.Intrinsics.areEqual(r17.getTaskName(), "FUTURE_LONG_STOP") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        r9 = "buy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        r1 = com.kubi.kumex.logic.constant.OrderTradeType.Limit;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        return new com.kubi.futures.compliance.leverage.EuropeUnlockLeverageFillOrderEvent(com.kubi.utils.extensions.C27039d.m66656p(r0.getNextLevelLeverage()), r1, r9, true, r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: x4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EuropeUnlockLeverageFillOrderEvent m24664x4(EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntityM24686t = m24648C4().m24686t();
        if (europeUnlockLeverageLevelEntityM24686t == null || !this.f22611q0.contains(europeUnlockLeverageLevelTaskEntity.getTaskName())) {
            return null;
        }
        String taskName = europeUnlockLeverageLevelTaskEntity.getTaskName();
        boolean z11 = false;
        String str = "sell";
        switch (taskName.hashCode()) {
            case -1539329535:
                break;
            case -1051849623:
                break;
            case -976928711:
                break;
            case -497053198:
                break;
            case -213761473:
                break;
            case 1777477542:
                break;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final String m24665z4(EuropeUnlockLeverageLevelTaskEntity europeUnlockLeverageLevelTaskEntity) {
        String strM66668h = C27041f.m66668h(europeUnlockLeverageLevelTaskEntity.getTaskName());
        if (!Intrinsics.areEqual(strM66668h, "FUTURE_LONG_STOP") && !Intrinsics.areEqual(strM66668h, "FUTURE_SHORT_STOP")) {
            String string = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_condition);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getString(R$string.kumex_eurpe_leverage_edu_unlock_leverage_limit_trigger_condition);
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}
