package repayment.dialog;

import ai0.C0373j;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import l60.C42112g;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
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
import repayment.InterfaceC44005a;
import repayment.InterfaceC44006b;
import repayment.RepayVM;
import repayment.UnifiedRepayFragment;
import repayment.UnifyLiabilityData;
import w00.C45681e;

/* JADX INFO: compiled from: LiabilitySelectedDialog.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020.2\u0006\u0010/\u001a\u00020&H\u0002J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020.H\u0002J\b\u00108\u001a\u00020.H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001f¨\u0006:"}, m90084d2 = {"Lrepayment/dialog/LiabilitySelectedDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/unify/databinding/UnifyLiabilityListDialogBinding;", "getBinding", "()Lcom/kubi/unify/databinding/UnifyLiabilityListDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "initLiabilityCurrency", "", "getInitLiabilityCurrency", "()Ljava/lang/String;", "initLiabilityCurrency$delegate", "Lkotlin/Lazy;", "initAmount", "Ljava/math/BigDecimal;", "getInitAmount", "()Ljava/math/BigDecimal;", "initAmount$delegate", "vm", "Lrepayment/RepayVM;", "getVm", "()Lrepayment/RepayVM;", "vm$delegate", "adapter", "Lrepayment/adapter/UnifyLiabilityDialogAdapter;", "getAdapter", "()Lrepayment/adapter/UnifyLiabilityDialogAdapter;", "adapter$delegate", "getLayoutId", "", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initUI", "initData", "Lkotlinx/coroutines/Job;", "initLoadingView", "showContent", DbParams.KEY_CHANNEL_RESULT, "Lrepayment/RepayContract$UiState$PageLoaded;", "emptyDataUI", "showLoading", "Companion", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiabilitySelectedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiabilitySelectedDialog.kt\nrepayment/dialog/LiabilitySelectedDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,156:1\n143#2,20:157\n106#3,15:177\n*S KotlinDebug\n*F\n+ 1 LiabilitySelectedDialog.kt\nrepayment/dialog/LiabilitySelectedDialog\n*L\n49#1:157,20\n61#1:177,15\n*E\n"})
public final class LiabilitySelectedDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public WrapperLoadingView f97283r0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f97286u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f97287v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f97281x0 = {Reflection.property1(new PropertyReference1Impl(LiabilitySelectedDialog.class, "binding", "getBinding()Lcom/kubi/unify/databinding/UnifyLiabilityListDialogBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f97280w0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f97282q0 = C45681e.m100799e(this, new Function1<LiabilitySelectedDialog, C42112g>() { // from class: repayment.dialog.LiabilitySelectedDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42112g invoke(@NotNull LiabilitySelectedDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42112g.m92379a(fragment.requireView());
        }
    }, new Function1<C42112g, Unit>() { // from class: repayment.dialog.LiabilitySelectedDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42112g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42112g c42112g) {
            invoke(c42112g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f97284s0 = LazyKt.lazy(new Function0() { // from class: repayment.dialog.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiabilitySelectedDialog.m97055F4(this.f97293b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f97285t0 = LazyKt.lazy(new Function0() { // from class: repayment.dialog.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiabilitySelectedDialog.m97053D4(this.f97294b);
        }
    });

    /* JADX INFO: compiled from: LiabilitySelectedDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lrepayment/dialog/LiabilitySelectedDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "selected", "Lrepayment/UnifyLiabilityData;", "manager", "Landroidx/fragment/app/FragmentManager;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@Nullable UnifyLiabilityData selected, @NotNull FragmentManager manager) {
            BigDecimal amount;
            Intrinsics.checkNotNullParameter(manager, "manager");
            LiabilitySelectedDialog liabilitySelectedDialog = new LiabilitySelectedDialog();
            Bundle bundle = new Bundle();
            String plainString = null;
            bundle.putString("LIABILITY_CURRENCY", selected != null ? selected.getCurrencyCode() : null);
            if (selected != null && (amount = selected.getAmount()) != null) {
                plainString = amount.toPlainString();
            }
            bundle.putString("LIABILITY_AMOUNT", plainString);
            liabilitySelectedDialog.setArguments(bundle);
            liabilitySelectedDialog.show(manager, "LiabilitySelectedDialog");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    private final int m97051B4() {
        return R$layout.unify_liability_list_dialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public final RepayVM m97052C4() {
        return (RepayVM) this.f97286u0.getValue();
    }

    /* JADX INFO: renamed from: G4 */
    private final void m97056G4(View view) {
        if (this.f97283r0 == null) {
            this.f97283r0 = WrapperLoadingView.injectView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        WrapperLoadingView wrapperLoadingView = this.f97283r0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final C0373j m97073v4() {
        return new C0373j();
    }

    /* JADX INFO: renamed from: A4 */
    public final String m97074A4() {
        return (String) this.f97284s0.getValue();
    }

    /* JADX INFO: renamed from: J4 */
    public final void m97075J4(InterfaceC44006b.PageLoaded pageLoaded) {
        KcPrimaryButton kcPrimaryButton;
        WrapperLoadingView wrapperLoadingView = this.f97283r0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
        List<UnifyLiabilityData> unifyLiabilityList = pageLoaded.getRepayAsset().getUnifyLiabilityList();
        if (unifyLiabilityList == null) {
            unifyLiabilityList = CollectionsKt.emptyList();
        }
        if (unifyLiabilityList.isEmpty()) {
            m97076w4();
            return;
        }
        C42112g c42112gM97078y4 = m97078y4();
        if (c42112gM97078y4 != null && (kcPrimaryButton = c42112gM97078y4.f93513b) != null) {
            kcPrimaryButton.setEnabled(m97077x4().m1460h() != null);
        }
        m97077x4().m1461i(unifyLiabilityList, m97074A4(), new Function1() { // from class: repayment.dialog.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiabilitySelectedDialog.m97059K4(this.f97296b, (UnifyLiabilityData) obj);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(m97051B4(), container);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m97076w4() {
        WrapperLoadingView wrapperLoadingView = this.f97283r0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(R$string.no_records, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final C0373j m97077x4() {
        return (C0373j) this.f97287v0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final C42112g m97078y4() {
        return (C42112g) this.f97282q0.getValue(this, f97281x0[0]);
    }

    /* JADX INFO: renamed from: z4 */
    public final BigDecimal m97079z4() {
        return (BigDecimal) this.f97285t0.getValue();
    }

    public LiabilitySelectedDialog() {
        final Function0 function0 = new Function0() { // from class: repayment.dialog.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiabilitySelectedDialog.m97060L4(this.f97295b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: repayment.dialog.LiabilitySelectedDialog$special$$inlined$viewModels$default$1
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
        this.f97286u0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RepayVM.class), new Function0<ViewModelStore>() { // from class: repayment.dialog.LiabilitySelectedDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: repayment.dialog.LiabilitySelectedDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: repayment.dialog.LiabilitySelectedDialog$special$$inlined$viewModels$default$4
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
        this.f97287v0 = LazyKt.lazy(new Function0() { // from class: repayment.dialog.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiabilitySelectedDialog.m97073v4();
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public static final BigDecimal m97053D4(LiabilitySelectedDialog liabilitySelectedDialog) {
        String string;
        Bundle arguments = liabilitySelectedDialog.getArguments();
        if (arguments != null && (string = arguments.getString("LIABILITY_AMOUNT")) != null) {
            return new BigDecimal(string);
        }
        return null;
    }

    /* JADX INFO: renamed from: E4 */
    private final InterfaceC41775x1 m97054E4() {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new LiabilitySelectedDialog$initData$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: F4 */
    public static final String m97055F4(LiabilitySelectedDialog liabilitySelectedDialog) {
        String string;
        Bundle arguments = liabilitySelectedDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("LIABILITY_CURRENCY");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: H4 */
    private final void m97057H4() {
        KcPrimaryButton kcPrimaryButton;
        boolean z11;
        final C42112g c42112gM97078y4 = m97078y4();
        if (c42112gM97078y4 != null) {
            FrameLayout flContent = c42112gM97078y4.f93514c;
            Intrinsics.checkNotNullExpressionValue(flContent, "flContent");
            m97056G4(flContent);
            c42112gM97078y4.f93516e.setText(getString(R$string.unify_repay_liabilities_dialog_header_title));
            c42112gM97078y4.f93515d.setItemAnimator(null);
            c42112gM97078y4.f93515d.setAdapter(m97077x4());
            KcPrimaryButton btnConfirm = c42112gM97078y4.f93513b;
            Intrinsics.checkNotNullExpressionValue(btnConfirm, "btnConfirm");
            C27046k.m66711z(btnConfirm, 0L, new Function0() { // from class: repayment.dialog.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiabilitySelectedDialog.m97058I4(this.f97297b, c42112gM97078y4);
                }
            }, 1, null);
            C42112g c42112gM97078y5 = m97078y4();
            if (c42112gM97078y5 != null && (kcPrimaryButton = c42112gM97078y5.f93513b) != null) {
                if (m97074A4().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kcPrimaryButton.setEnabled(z11);
            }
        }
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m97058I4(LiabilitySelectedDialog liabilitySelectedDialog, C42112g c42112g) {
        if (liabilitySelectedDialog.getParentFragment() instanceof UnifiedRepayFragment) {
            liabilitySelectedDialog.m97052C4().m96976D(new InterfaceC44005a.OnLiabilityListDismiss(liabilitySelectedDialog.m97077x4().m1460h()));
        } else {
            UnifyLiabilityData unifyLiabilityDataM1460h = liabilitySelectedDialog.m97077x4().m1460h();
            if (unifyLiabilityDataM1460h != null) {
                UnifiedRepayFragment.Companion companion = UnifiedRepayFragment.f97253Z;
                Context context = c42112g.f93513b.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                companion.start(context, unifyLiabilityDataM1460h.getCurrencyCode(), unifyLiabilityDataM1460h.getAmount());
            }
        }
        liabilitySelectedDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m97059K4(LiabilitySelectedDialog liabilitySelectedDialog, UnifyLiabilityData unifyLiabilityData) {
        KcPrimaryButton kcPrimaryButton;
        boolean z11;
        C42112g c42112gM97078y4 = liabilitySelectedDialog.m97078y4();
        if (c42112gM97078y4 != null && (kcPrimaryButton = c42112gM97078y4.f93513b) != null) {
            if (liabilitySelectedDialog.m97077x4().m1460h() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            kcPrimaryButton.setEnabled(z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final ViewModelStoreOwner m97060L4(LiabilitySelectedDialog liabilitySelectedDialog) {
        Fragment fragmentRequireParentFragment = liabilitySelectedDialog.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m97057H4();
        m97054E4();
    }
}
