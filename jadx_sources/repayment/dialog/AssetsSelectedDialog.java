package repayment.dialog;

import ai0.C0369f;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.FocusEditTextLinearLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.List;
import kotlinx.coroutines.InterfaceC41775x1;
import l60.C42107b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import repayment.C44044f;
import repayment.InterfaceC44005a;
import repayment.RepayVM;
import repayment.UnifyAssetData;
import repayment.UnifyLiabilityData;
import w00.C45681e;

/* JADX INFO: compiled from: AssetsSelectedDialog.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\"H\u0002J\u0016\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0002J\u0016\u0010,\u001a\u00020\"2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J$\u00100\u001a\u00020\"2\f\u00101\u001a\b\u0012\u0004\u0012\u00020/0.2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\"H\u0002J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\u0018H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015¨\u00068"}, m90084d2 = {"Lrepayment/dialog/AssetsSelectedDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/unify/databinding/FragmentUnifyAssetListDialogBinding;", "getBinding", "()Lcom/kubi/unify/databinding/FragmentUnifyAssetListDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vm", "Lrepayment/RepayVM;", "getVm", "()Lrepayment/RepayVM;", "vm$delegate", "Lkotlin/Lazy;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "adapter", "Lrepayment/adapter/UnifyAssetSelectAdapter;", "getAdapter", "()Lrepayment/adapter/UnifyAssetSelectAdapter;", "adapter$delegate", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initUI", "initData", "Lkotlinx/coroutines/Job;", "startLoadData", "getLiabilityInfo", "Lkotlin/Pair;", "", "Ljava/math/BigDecimal;", "notifyAdapterSelectedAssetsChange", TUIConstants.TUIContact.SELECTED_LIST, "", "Lrepayment/UnifyAssetData;", "showContentUI", "unifyAssetList", "showLoading", "showEmpty", "showContent", "updateSupportSearch", "support", "Companion", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsSelectedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsSelectedDialog.kt\nrepayment/dialog/AssetsSelectedDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,206:1\n143#2,20:207\n106#3,15:227\n49#4:242\n65#4,16:243\n93#4,3:259\n256#5,2:262\n*S KotlinDebug\n*F\n+ 1 AssetsSelectedDialog.kt\nrepayment/dialog/AssetsSelectedDialog\n*L\n38#1:207,20\n42#1:227,15\n69#1:242\n69#1:243,16\n69#1:259,3\n188#1:262,2\n*E\n"})
public final class AssetsSelectedDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f97275q0 = C45681e.m100799e(this, new Function1<AssetsSelectedDialog, C42107b>() { // from class: repayment.dialog.AssetsSelectedDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42107b invoke(@NotNull AssetsSelectedDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42107b.m92369a(fragment.requireView());
        }
    }, new Function1<C42107b, Unit>() { // from class: repayment.dialog.AssetsSelectedDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42107b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42107b c42107b) {
            invoke(c42107b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f97276r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public WrapperLoadingView f97277s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f97278t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f97274v0 = {Reflection.property1(new PropertyReference1Impl(AssetsSelectedDialog.class, "binding", "getBinding()Lcom/kubi/unify/databinding/FragmentUnifyAssetListDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f97273u0 = new Companion(null);

    /* JADX INFO: compiled from: AssetsSelectedDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lrepayment/dialog/AssetsSelectedDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "repayLiability", "Lrepayment/UnifyLiabilityData;", "manager", "Landroidx/fragment/app/FragmentManager;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@Nullable UnifyLiabilityData repayLiability, @NotNull FragmentManager manager) {
            BigDecimal amount;
            Intrinsics.checkNotNullParameter(manager, "manager");
            AssetsSelectedDialog assetsSelectedDialog = new AssetsSelectedDialog();
            Bundle bundle = new Bundle();
            String plainString = null;
            bundle.putString("LIABILITY_CURRENCY", repayLiability != null ? repayLiability.getCurrencyCode() : null);
            if (repayLiability != null && (amount = repayLiability.getAmount()) != null) {
                plainString = amount.toPlainString();
            }
            bundle.putString("LIABILITY_AMOUNT", plainString);
            assetsSelectedDialog.setArguments(bundle);
            assetsSelectedDialog.show(manager, "AssertSelectedDialog");
        }
    }

    /* JADX INFO: renamed from: repayment.dialog.AssetsSelectedDialog$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 AssetsSelectedDialog.kt\nrepayment/dialog/AssetsSelectedDialog\n*L\n1#1,97:1\n78#2:98\n71#3:99\n70#4,2:100\n*E\n"})
    public static final class C44009a implements TextWatcher {
        public C44009a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            AssetsSelectedDialog.this.m97049y4().m96976D(new InterfaceC44005a.SearchAssets(String.valueOf(text)));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m97028G4(AssetsSelectedDialog assetsSelectedDialog, List assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        assetsSelectedDialog.m97042E4(assets);
        return Unit.INSTANCE;
    }

    private final void showContent() {
        C42107b c42107bM97047w4;
        LinearLayout linearLayout;
        if (this.f97277s0 == null && (c42107bM97047w4 = m97047w4()) != null && (linearLayout = c42107bM97047w4.f93464f) != null) {
            this.f97277s0 = WrapperLoadingView.injectView(linearLayout);
        }
        WrapperLoadingView wrapperLoadingView = this.f97277s0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
        m97045I4(true);
    }

    private final void showEmpty() {
        C42107b c42107bM97047w4;
        LinearLayout linearLayout;
        if (this.f97277s0 == null && (c42107bM97047w4 = m97047w4()) != null && (linearLayout = c42107bM97047w4.f93464f) != null) {
            this.f97277s0 = WrapperLoadingView.injectView(linearLayout);
        }
        WrapperLoadingView wrapperLoadingView = this.f97277s0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(R$string.no_records, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        C42107b c42107bM97047w4;
        LinearLayout linearLayout;
        if (this.f97277s0 == null && (c42107bM97047w4 = m97047w4()) != null && (linearLayout = c42107bM97047w4.f93464f) != null) {
            this.f97277s0 = WrapperLoadingView.injectView(linearLayout);
        }
        WrapperLoadingView wrapperLoadingView = this.f97277s0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
        m97045I4(false);
    }

    /* JADX INFO: renamed from: u4 */
    public static final C0369f m97041u4() {
        return new C0369f();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_unify_asset_list_dialog, container);
    }

    /* JADX INFO: renamed from: v4 */
    public final C0369f m97046v4() {
        return (C0369f) this.f97278t0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final C42107b m97047w4() {
        return (C42107b) this.f97275q0.getValue(this, f97274v0[0]);
    }

    /* JADX INFO: renamed from: y4 */
    public final RepayVM m97049y4() {
        return (RepayVM) this.f97276r0.getValue();
    }

    public AssetsSelectedDialog() {
        final Function0 function0 = new Function0() { // from class: repayment.dialog.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetsSelectedDialog.m97029J4(this.f97289b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: repayment.dialog.AssetsSelectedDialog$special$$inlined$viewModels$default$1
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
        this.f97276r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RepayVM.class), new Function0<ViewModelStore>() { // from class: repayment.dialog.AssetsSelectedDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: repayment.dialog.AssetsSelectedDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: repayment.dialog.AssetsSelectedDialog$special$$inlined$viewModels$default$4
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
        this.f97278t0 = LazyKt.lazy(new Function0() { // from class: repayment.dialog.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetsSelectedDialog.m97041u4();
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    private final void m97024A4() {
        KcPrimaryButton kcPrimaryButton;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        BaseTextView baseTextView;
        CheckBox checkBox;
        ClearEditText clearEditText;
        C42107b c42107bM97047w4 = m97047w4();
        if (c42107bM97047w4 != null && (clearEditText = c42107bM97047w4.f93463e) != null) {
            clearEditText.addTextChangedListener(new C44009a());
        }
        C42107b c42107bM97047w5 = m97047w4();
        if (c42107bM97047w5 != null && (checkBox = c42107bM97047w5.f93461c) != null) {
            C27046k.m66711z(checkBox, 0L, new Function0() { // from class: repayment.dialog.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetsSelectedDialog.m97025B4(this.f97290b);
                }
            }, 1, null);
        }
        C42107b c42107bM97047w6 = m97047w4();
        if (c42107bM97047w6 != null && (baseTextView = c42107bM97047w6.f93467i) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: repayment.dialog.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetsSelectedDialog.m97026C4(this.f97291b);
                }
            }, 1, null);
        }
        C42107b c42107bM97047w7 = m97047w4();
        if (c42107bM97047w7 != null && (recyclerView2 = c42107bM97047w7.f93465g) != null) {
            recyclerView2.setItemAnimator(null);
        }
        C42107b c42107bM97047w8 = m97047w4();
        if (c42107bM97047w8 != null && (recyclerView = c42107bM97047w8.f93465g) != null) {
            recyclerView.setAdapter(m97046v4());
        }
        C42107b c42107bM97047w9 = m97047w4();
        if (c42107bM97047w9 != null && (kcPrimaryButton = c42107bM97047w9.f93460b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: repayment.dialog.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetsSelectedDialog.m97027D4(this.f97292b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m97025B4(AssetsSelectedDialog assetsSelectedDialog) {
        CheckBox checkBox;
        C0369f c0369fM97046v4 = assetsSelectedDialog.m97046v4();
        C42107b c42107bM97047w4 = assetsSelectedDialog.m97047w4();
        boolean z11 = false;
        if (c42107bM97047w4 != null && (checkBox = c42107bM97047w4.f93461c) != null && !checkBox.isChecked()) {
            z11 = true;
        }
        c0369fM97046v4.m1447h(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m97026C4(AssetsSelectedDialog assetsSelectedDialog) {
        CheckBox checkBox;
        C42107b c42107bM97047w4 = assetsSelectedDialog.m97047w4();
        if (c42107bM97047w4 != null && (checkBox = c42107bM97047w4.f93461c) != null) {
            checkBox.performClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m97027D4(AssetsSelectedDialog assetsSelectedDialog) {
        assetsSelectedDialog.m97049y4().m96976D(new InterfaceC44005a.OnAssetListDismiss(assetsSelectedDialog.m97046v4().m1448i()));
        assetsSelectedDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final ViewModelStoreOwner m97029J4(AssetsSelectedDialog assetsSelectedDialog) {
        Fragment fragmentRequireParentFragment = assetsSelectedDialog.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: E4 */
    public final void m97042E4(List<UnifyAssetData> list) {
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView;
        CheckBox checkBox;
        boolean z11;
        C42107b c42107bM97047w4 = m97047w4();
        if (c42107bM97047w4 != null && (checkBox = c42107bM97047w4.f93461c) != null) {
            if (list.size() == m97046v4().getItemCount()) {
                z11 = true;
            } else {
                z11 = false;
            }
            checkBox.setChecked(z11);
        }
        C42107b c42107bM97047w5 = m97047w4();
        if (c42107bM97047w5 != null && (baseTextView = c42107bM97047w5.f93468j) != null) {
            baseTextView.setText(C44044f.m97123a(list));
        }
        C42107b c42107bM97047w6 = m97047w4();
        if (c42107bM97047w6 != null && (kcPrimaryButton = c42107bM97047w6.f93460b) != null) {
            kcPrimaryButton.setEnabled(!list.isEmpty());
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m97043F4(List<UnifyAssetData> list, List<UnifyAssetData> list2) {
        if (list.isEmpty()) {
            showEmpty();
        } else {
            showContent();
        }
        m97046v4().m1452n(list, list2, new Function1() { // from class: repayment.dialog.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetsSelectedDialog.m97028G4(this.f97288b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final void m97044H4() {
        Pair<String, BigDecimal> pairM97048x4 = m97048x4();
        m97049y4().m96976D(new InterfaceC44005a.LoadRepayInfo(pairM97048x4.component1(), pairM97048x4.component2()));
    }

    /* JADX INFO: renamed from: I4 */
    public final void m97045I4(boolean z11) {
        FocusEditTextLinearLayout focusEditTextLinearLayout;
        int i11;
        C42107b c42107bM97047w4 = m97047w4();
        if (c42107bM97047w4 != null && (focusEditTextLinearLayout = c42107bM97047w4.f93462d) != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            focusEditTextLinearLayout.setVisibility(i11);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m97024A4();
        m97050z4();
        m97044H4();
    }

    /* JADX INFO: renamed from: x4 */
    public final Pair<String, BigDecimal> m97048x4() {
        String string;
        String string2;
        UnifyLiabilityData value = m97049y4().m96987w().getValue();
        if (value != null) {
            return new Pair<>(C27041f.m66668h(value.getCurrencyCode()), value.getAmount());
        }
        Bundle arguments = getArguments();
        BigDecimal bigDecimal = null;
        if (arguments != null) {
            string = arguments.getString("LIABILITY_CURRENCY");
        } else {
            string = null;
        }
        String strM66668h = C27041f.m66668h(string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("LIABILITY_AMOUNT")) != null) {
            bigDecimal = new BigDecimal(string2);
        }
        return new Pair<>(strM66668h, bigDecimal);
    }

    /* JADX INFO: renamed from: z4 */
    public final InterfaceC41775x1 m97050z4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new AssetsSelectedDialog$initData$1(this, null));
    }
}
