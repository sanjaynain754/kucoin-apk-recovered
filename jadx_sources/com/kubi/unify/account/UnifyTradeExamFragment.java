package com.kubi.unify.account;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5303w0;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.R$color;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyConstant;
import com.kubi.unify.entity.UnifyExam;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l60.C42111f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: UnifyTradeExamFragment.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0006\u0010*\u001a\u00020\u001fR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m90084d2 = {"Lcom/kubi/unify/account/UnifyTradeExamFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/unify/databinding/FragmentUnifyTradeExamBinding;", "getBinding", "()Lcom/kubi/unify/databinding/FragmentUnifyTradeExamBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vm", "Lcom/kubi/unify/account/UnifyAccountViewModel;", "getVm", "()Lcom/kubi/unify/account/UnifyAccountViewModel;", "vm$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/unify/account/UnifyExamAdapter;", "getAdapter", "()Lcom/kubi/unify/account/UnifyExamAdapter;", "adapter$delegate", "list", "", "Lcom/kubi/unify/entity/UnifyExam;", "kotlin.jvm.PlatformType", "getList", "()Ljava/util/List;", "list$delegate", "isBottomSheet", "", "onStart", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "checkEnable", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyTradeExamFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyTradeExamFragment.kt\ncom/kubi/unify/account/UnifyTradeExamFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n143#2,20:138\n106#3,15:158\n1788#4,4:173\n*S KotlinDebug\n*F\n+ 1 UnifyTradeExamFragment.kt\ncom/kubi/unify/account/UnifyTradeExamFragment\n*L\n43#1:138,20\n44#1:158,15\n131#1:173,4\n*E\n"})
public final class UnifyTradeExamFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f53121u0 = {Reflection.property1(new PropertyReference1Impl(UnifyTradeExamFragment.class, "binding", "getBinding()Lcom/kubi/unify/databinding/FragmentUnifyTradeExamBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f53122q0 = C45681e.m100799e(this, new Function1<UnifyTradeExamFragment, C42111f>() { // from class: com.kubi.unify.account.UnifyTradeExamFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42111f invoke(@NotNull UnifyTradeExamFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42111f.m92377a(fragment.requireView());
        }
    }, new Function1<C42111f, Unit>() { // from class: com.kubi.unify.account.UnifyTradeExamFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42111f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42111f c42111f) {
            invoke(c42111f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f53123r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f53124s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f53125t0;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m64953B4(SpannableString spannableString, String str) {
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.unify.account.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnifyTradeExamFragment.m64954C4(view);
            }
        }), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null) + str.length(), 18);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m64955D4(UnifyTradeExamFragment unifyTradeExamFragment, CompoundButton compoundButton, boolean z11) {
        C42111f c42111fM64974v4;
        BubbleTextView bubbleTextView;
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        if (z11 && (c42111fM64974v4 = unifyTradeExamFragment.m64974v4()) != null && (bubbleTextView = c42111fM64974v4.f93508c) != null) {
            ViewExtKt.m66577h(bubbleTextView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final UnifyExamAdapter m64967s4(UnifyTradeExamFragment unifyTradeExamFragment) {
        return new UnifyExamAdapter(unifyTradeExamFragment);
    }

    /* JADX INFO: renamed from: w4 */
    private final List<UnifyExam> m64968w4() {
        return (List) this.f53125t0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    private final UnifyAccountViewModel m64969x4() {
        return (UnifyAccountViewModel) this.f53123r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_unify_trade_exam, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        RecyclerView recyclerView;
        KcPrimaryButton kcPrimaryButton3;
        BubbleTextView bubbleTextView;
        BubbleTextView bubbleTextView2;
        AlignTopCheckBox alignTopCheckBox;
        AlignTopCheckBox alignTopCheckBox2;
        AlignTopCheckBox alignTopCheckBox3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String f19947w = getF19947W();
        if (f19947w == null) {
            f19947w = "";
        }
        C43852m.m96595g(f19947w, "examPage", null, null, 12, null);
        final String string = getString(R$string.unify_term_of_use);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final SpannableString spannableString = new SpannableString(getString(R$string.unify_already_read_and_agree, string));
        C27100x0.m66923d(new Function0() { // from class: com.kubi.unify.account.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyTradeExamFragment.m64953B4(spannableString, string);
            }
        });
        C42111f c42111fM64974v4 = m64974v4();
        if (c42111fM64974v4 != null && (alignTopCheckBox3 = c42111fM64974v4.f93509d) != null) {
            alignTopCheckBox3.setText(spannableString);
        }
        C42111f c42111fM64974v5 = m64974v4();
        if (c42111fM64974v5 != null && (alignTopCheckBox2 = c42111fM64974v5.f93509d) != null) {
            alignTopCheckBox2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C42111f c42111fM64974v6 = m64974v4();
        if (c42111fM64974v6 != null && (alignTopCheckBox = c42111fM64974v6.f93509d) != null) {
            C27046k.m66708w(alignTopCheckBox, new Function2() { // from class: com.kubi.unify.account.s
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifyTradeExamFragment.m64955D4(this.f53148b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C42111f c42111fM64974v7 = m64974v4();
        if (c42111fM64974v7 != null && (bubbleTextView2 = c42111fM64974v7.f93508c) != null) {
            bubbleTextView2.post(new Runnable() { // from class: com.kubi.unify.account.t
                @Override // java.lang.Runnable
                public final void run() {
                    UnifyTradeExamFragment.m64956E4(this.f53149b);
                }
            });
        }
        C42111f c42111fM64974v8 = m64974v4();
        if (c42111fM64974v8 != null && (bubbleTextView = c42111fM64974v8.f93508c) != null) {
            bubbleTextView.setArrowPosPolicy(C5303w0.m6511a() ? BubbleStyle.ArrowPosPolicy.SelfEnd : BubbleStyle.ArrowPosPolicy.SelfBegin);
        }
        C42111f c42111fM64974v9 = m64974v4();
        if (c42111fM64974v9 != null && (kcPrimaryButton3 = c42111fM64974v9.f93507b) != null) {
            C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.unify.account.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyTradeExamFragment.m64971z4(this.f53150b);
                }
            }, 1, null);
        }
        C42111f c42111fM64974v10 = m64974v4();
        if (c42111fM64974v10 != null && (recyclerView = c42111fM64974v10.f93511f) != null) {
            recyclerView.setAdapter(m64973u4());
        }
        m64973u4().replaceData(CollectionsKt.toMutableList((Collection) m64968w4()));
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.header_unify_trade_exam, (ViewGroup) null);
        m64973u4().addHeaderView(viewInflate);
        C42111f c42111fM64974v11 = m64974v4();
        if (c42111fM64974v11 != null && (kcPrimaryButton2 = c42111fM64974v11.f93507b) != null) {
            kcPrimaryButton2.setEnabled(false);
        }
        TextView textView = (TextView) viewInflate.findViewById(R$id.question);
        if (textView != null) {
            textView.setText(getString(R$string.unify_account_test_qa) + " (" + m64968w4().size() + ')');
        }
        C42111f c42111fM64974v12 = m64974v4();
        if (c42111fM64974v12 == null || (kcPrimaryButton = c42111fM64974v12.f93507b) == null) {
            return;
        }
        kcPrimaryButton.setText(getString(R$string.confirm) + " (0/" + m64968w4().size() + ')');
    }

    /* JADX INFO: renamed from: u4 */
    public final UnifyExamAdapter m64973u4() {
        return (UnifyExamAdapter) this.f53124s0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: v4 */
    public final C42111f m64974v4() {
        return (C42111f) this.f53122q0.getValue(this, f53121u0[0]);
    }

    public UnifyTradeExamFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.unify.account.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyTradeExamFragment.m64957F4(this.f53151b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.unify.account.UnifyTradeExamFragment$special$$inlined$viewModels$default$1
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
        this.f53123r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UnifyAccountViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.unify.account.UnifyTradeExamFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.unify.account.UnifyTradeExamFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.unify.account.UnifyTradeExamFragment$special$$inlined$viewModels$default$4
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
        this.f53124s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.account.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyTradeExamFragment.m64967s4(this.f53152b);
            }
        });
        this.f53125t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.account.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyTradeExamFragment.m64970y4(this.f53153b);
            }
        });
        setPageId("B6UnifiedPage");
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m64952A4(UnifyTradeExamFragment unifyTradeExamFragment) {
        unifyTradeExamFragment.dismiss();
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m64954C4(View view) {
        view.cancelPendingInputEvents();
        InterfaceC37766r.a.m85190a(C37304a.f82764a, UnifyConstant.f53295a.m65228g(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m64956E4(UnifyTradeExamFragment unifyTradeExamFragment) {
        BubbleTextView bubbleTextView;
        Integer numValueOf;
        AlignTopCheckBox alignTopCheckBox;
        C42111f c42111fM64974v4 = unifyTradeExamFragment.m64974v4();
        if (c42111fM64974v4 != null && (bubbleTextView = c42111fM64974v4.f93508c) != null) {
            int iM66658b = C27040e.m66658b(10);
            C42111f c42111fM64974v5 = unifyTradeExamFragment.m64974v4();
            if (c42111fM64974v5 != null && (alignTopCheckBox = c42111fM64974v5.f93509d) != null) {
                numValueOf = Integer.valueOf(alignTopCheckBox.getLineCount() * 15);
            } else {
                numValueOf = null;
            }
            ViewExtKt.m66584o(bubbleTextView, iM66658b, 0, 0, C27040e.m66658b(90 + C27039d.m66650j(numValueOf)));
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final ViewModelStoreOwner m64957F4(UnifyTradeExamFragment unifyTradeExamFragment) {
        Fragment parentFragment = unifyTradeExamFragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return unifyTradeExamFragment;
    }

    /* JADX INFO: renamed from: y4 */
    public static final List m64970y4(UnifyTradeExamFragment unifyTradeExamFragment) {
        ArrayList parcelableArrayList;
        Bundle arguments = unifyTradeExamFragment.getArguments();
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("examList");
        } else {
            parcelableArrayList = null;
        }
        if (parcelableArrayList == null) {
            return CollectionsKt.emptyList();
        }
        return parcelableArrayList;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m64971z4(final UnifyTradeExamFragment unifyTradeExamFragment) {
        Boolean boolValueOf;
        BubbleTextView bubbleTextView;
        AlignTopCheckBox alignTopCheckBox;
        C42111f c42111fM64974v4 = unifyTradeExamFragment.m64974v4();
        if (c42111fM64974v4 != null && (alignTopCheckBox = c42111fM64974v4.f93509d) != null) {
            boolValueOf = Boolean.valueOf(alignTopCheckBox.isChecked());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf)) {
            C42111f c42111fM64974v5 = unifyTradeExamFragment.m64974v4();
            if (c42111fM64974v5 != null && (bubbleTextView = c42111fM64974v5.f93508c) != null) {
                ViewExtKt.m66594y(bubbleTextView);
            }
            return Unit.INSTANCE;
        }
        C43852m.m96591c("B6UnifiedPage", "submitAnswer", null, null, 12, null);
        unifyTradeExamFragment.m64969x4().m64943B(new Action() { // from class: com.kubi.unify.account.z
            @Override // io.reactivex.functions.Action
            public final void run() {
                UnifyTradeExamFragment.m64952A4(this.f53154b);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        int iM6182d = C5267e0.m6182d();
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final void m64972t4() {
        C42111f c42111fM64974v4;
        int i11;
        KcPrimaryButton kcPrimaryButton;
        if (getView() != null && (c42111fM64974v4 = m64974v4()) != null) {
            List<UnifyExam> value = m64969x4().m64947x().getValue();
            if (value == null) {
                value = CollectionsKt.emptyList();
            }
            boolean z11 = false;
            if (value != null && value.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 0;
                for (UnifyExam unifyExam : value) {
                    if (Intrinsics.areEqual(unifyExam.getChoose(), unifyExam.getRight()) && (i11 = i11 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            C42111f c42111fM64974v5 = m64974v4();
            if (c42111fM64974v5 != null && (kcPrimaryButton = c42111fM64974v5.f93507b) != null) {
                kcPrimaryButton.setText(getString(R$string.confirm) + '(' + i11 + '/' + value.size() + ')');
            }
            KcPrimaryButton kcPrimaryButton2 = c42111fM64974v4.f93507b;
            if (i11 == value.size()) {
                z11 = true;
            }
            kcPrimaryButton2.setEnabled(z11);
        }
    }
}
