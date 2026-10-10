package repayment;

import ai0.C0364a;
import ai0.C0365b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import k10.DialogC40864b;
import l60.C42110e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import repayment.ext.C44039e;
import repayment.ext.C44042h;
import repayment.ext.RepayFragmentExtKt;
import w00.C45681e;

/* JADX INFO: compiled from: UnifiedRepayFragment.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020,H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u00061"}, m90084d2 = {"Lrepayment/UnifiedRepayFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "vm", "Lrepayment/RepayVM;", "getVm$BUnifyAccountLib_googleRelease", "()Lrepayment/RepayVM;", "vm$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/unify/databinding/FragmentUnifyRepayCurrencyBinding;", "getBinding$BUnifyAccountLib_googleRelease", "()Lcom/kubi/unify/databinding/FragmentUnifyRepayCurrencyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "emptyAssetsStubValue", "", "getEmptyAssetsStubValue$BUnifyAccountLib_googleRelease", "()Ljava/lang/String;", "loadingDialog", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "getLoadingDialog$BUnifyAccountLib_googleRelease", "()Lcom/kubi/sdk/widget/loading/LoadingDialog;", "loadingDialog$delegate", "assetsIconAdapter", "Lrepayment/adapter/RepayAssetIconAdapter;", "getAssetsIconAdapter$BUnifyAccountLib_googleRelease", "()Lrepayment/adapter/RepayAssetIconAdapter;", "assetsIconAdapter$delegate", "assetDetailAdapter", "Lrepayment/adapter/RepayAssetValueDetailAdapter;", "getAssetDetailAdapter$BUnifyAccountLib_googleRelease", "()Lrepayment/adapter/RepayAssetValueDetailAdapter;", "assetDetailAdapter$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initUI", "initData", "Companion", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedRepayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedRepayFragment.kt\nrepayment/UnifiedRepayFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,104:1\n106#2,15:105\n147#3,16:120\n*S KotlinDebug\n*F\n+ 1 UnifiedRepayFragment.kt\nrepayment/UnifiedRepayFragment\n*L\n33#1:105,15\n34#1:120,16\n*E\n"})
public final class UnifiedRepayFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f97255U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f97256V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f97257W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f97258X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f97259Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f97254a0 = {Reflection.property1(new PropertyReference1Impl(UnifiedRepayFragment.class, "binding", "getBinding$BUnifyAccountLib_googleRelease()Lcom/kubi/unify/databinding/FragmentUnifyRepayCurrencyBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f97253Z = new Companion(null);

    /* JADX INFO: compiled from: UnifiedRepayFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lrepayment/UnifiedRepayFragment$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "liabilityCurrency", "", "amount", "Ljava/math/BigDecimal;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, BigDecimal bigDecimal, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                bigDecimal = null;
            }
            companion.start(context, str, bigDecimal);
        }

        public final void start(@NotNull Context context, @Nullable String liabilityCurrency, @Nullable BigDecimal amount) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.repay_coin), UnifiedRepayFragment.class.getName(), new C27051h().m66724h("LIABILITY_CURRENCY", liabilityCurrency).m66724h("LIABILITY_AMOUNT", amount != null ? amount.toPlainString() : null).m66717a());
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static final C0365b m96997n3() {
        return new C0365b();
    }

    /* JADX INFO: renamed from: o3 */
    public static final C0364a m96998o3() {
        return new C0364a();
    }

    /* JADX INFO: renamed from: y3 */
    public static final DialogC40864b m97002y3(UnifiedRepayFragment unifiedRepayFragment) {
        Context contextRequireContext = unifiedRepayFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new DialogC40864b(contextRequireContext, false, 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_unify_repay_currency, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: p3 */
    public final C0365b m97003p3() {
        return (C0365b) this.f97259Y.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q3 */
    public final C0364a m97004q3() {
        return (C0364a) this.f97258X.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: r3 */
    public final C42110e m97005r3() {
        return (C42110e) this.f97256V.getValue(this, f97254a0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: s3 */
    public final String m97006s3() {
        return "0 " + C41016c.m89965c();
    }

    @NotNull
    /* JADX INFO: renamed from: t3 */
    public final DialogC40864b m97007t3() {
        return (DialogC40864b) this.f97257W.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: u3 */
    public final RepayVM m97008u3() {
        return (RepayVM) this.f97255U.getValue();
    }

    public UnifiedRepayFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: repayment.UnifiedRepayFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: repayment.UnifiedRepayFragment$special$$inlined$viewModels$default$2
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
        this.f97255U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RepayVM.class), new Function0<ViewModelStore>() { // from class: repayment.UnifiedRepayFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: repayment.UnifiedRepayFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: repayment.UnifiedRepayFragment$special$$inlined$viewModels$default$5
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
        this.f97256V = C45681e.m100799e(this, new Function1<UnifiedRepayFragment, C42110e>() { // from class: repayment.UnifiedRepayFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C42110e invoke(@NotNull UnifiedRepayFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C42110e.m92375a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C42110e, Unit>() { // from class: repayment.UnifiedRepayFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C42110e it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C42110e c42110e) {
                invoke(c42110e);
                return Unit.INSTANCE;
            }
        });
        this.f97257W = LazyKt.lazy(new Function0() { // from class: repayment.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedRepayFragment.m97002y3(this.f97310b);
            }
        });
        this.f97258X = LazyKt.lazy(new Function0() { // from class: repayment.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedRepayFragment.m96998o3();
            }
        });
        this.f97259Y = LazyKt.lazy(new Function0() { // from class: repayment.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedRepayFragment.m96997n3();
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    private final void m96999v3() {
        String string;
        String string2;
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
        m97008u3().m96976D(new InterfaceC44005a.LoadRepayInfo(strM66668h, bigDecimal));
    }

    /* JADX INFO: renamed from: w3 */
    private final void m97000w3() {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        BaseTextView baseTextView;
        C44039e.m97109h(this);
        C44042h.m97119d(this);
        C42110e c42110eM97005r3 = m97005r3();
        if (c42110eM97005r3 != null && (baseTextView = c42110eM97005r3.f93502t) != null) {
            baseTextView.setText(R$string.stub);
        }
        C42110e c42110eM97005r4 = m97005r3();
        if (c42110eM97005r4 != null && (kcPrimaryButton2 = c42110eM97005r4.f93487e) != null) {
            kcPrimaryButton2.setEnabled(false);
        }
        C42110e c42110eM97005r5 = m97005r3();
        if (c42110eM97005r5 != null && (kcPrimaryButton = c42110eM97005r5.f93487e) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: repayment.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifiedRepayFragment.m97001x3(this.f97311b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m97001x3(UnifiedRepayFragment unifiedRepayFragment) {
        unifiedRepayFragment.showLoadingDialog();
        unifiedRepayFragment.m97008u3().m96976D(InterfaceC44005a.b.f97261a);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m97000w3();
        m96999v3();
        RepayFragmentExtKt.m97090c(this);
    }
}
