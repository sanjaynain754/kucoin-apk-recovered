package com.kubi.tradingbotkit.business.beginnerGuide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.business.beginnerGuide.viewModel.GuideStepViewModel;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import n40.C42748c;
import o40.C42961c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.InterfaceC43850k;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GuideStepFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0015\u0010\r¨\u0006'"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "guideStepViewModel", "Lcom/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel;", "getGuideStepViewModel", "()Lcom/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel;", "guideStepViewModel$delegate", "Lkotlin/Lazy;", "pageTitle", "", "getPageTitle", "()I", "pageTitle$delegate", "gridType", "", "getGridType", "()Ljava/lang/String;", "gridType$delegate", "pageIndex", "getPageIndex", "pageIndex$delegate", "getGridTypePage", "Lcom/kubi/tradingbotkit/business/beginnerGuide/IAllPageInfo;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "getPageByIndex", "Lcom/kubi/tradingbotkit/business/beginnerGuide/IGuideInformation;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGuideStepFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideStepFragment.kt\ncom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,113:1\n172#2,9:114\n*S KotlinDebug\n*F\n+ 1 GuideStepFragment.kt\ncom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment\n*L\n40#1:114,9\n*E\n"})
@InterfaceC43850k(pageId = "bot_page_guide_step")
public final class GuideStepFragment extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f52263Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f52264U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52265V = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(GuideStepFragment.m63835w3(this.f52279b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f52266W = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GuideStepFragment.m63832t3(this.f52280b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f52267X = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(GuideStepFragment.m63834v3(this.f52281b));
        }
    });

    /* JADX INFO: compiled from: GuideStepFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment;", "gridType", "", "pageIndex", "", "GRID_TYPE", "PAGE_INDEX", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GuideStepFragment newInstance(@NotNull String gridType, int pageIndex) {
            Intrinsics.checkNotNullParameter(gridType, "gridType");
            GuideStepFragment guideStepFragment = new GuideStepFragment();
            Bundle bundle = new Bundle();
            bundle.putString("grid_type", gridType);
            bundle.putInt("page_index", pageIndex);
            guideStepFragment.setArguments(bundle);
            return guideStepFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.beginnerGuide.GuideStepFragment$a */
    /* JADX INFO: compiled from: GuideStepFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26081a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f52268b;

        public C26081a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52268b = function;
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
            return this.f52268b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52268b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final String m63836n3() {
        return (String) this.f52266W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int iMo63849c = m63839q3().mo63849c();
        if (iMo63849c == 0) {
            iMo63849c = R$layout.btrading_bot_kit_fragment_strategy_introduction;
        }
        View viewInflate = inflater.inflate(iMo63849c, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m63838p3().m63854p().observe(getViewLifecycleOwner(), new C26081a(new Function1() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GuideStepFragment.m63833u3(this.f52277b, view, (Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p3 */
    public final GuideStepViewModel m63838p3() {
        return (GuideStepViewModel) this.f52264U.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public final int m63840r3() {
        return ((Number) this.f52267X.getValue()).intValue();
    }

    /* JADX INFO: renamed from: s3 */
    public final int m63841s3() {
        return ((Number) this.f52265V.getValue()).intValue();
    }

    public GuideStepFragment() {
        final Function0 function0 = null;
        this.f52264U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GuideStepViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.GuideStepFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.GuideStepFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.GuideStepFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public static final String m63832t3(GuideStepFragment guideStepFragment) {
        String string;
        Bundle arguments = guideStepFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("grid_type");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m63833u3(GuideStepFragment guideStepFragment, View view, Map map) {
        if (guideStepFragment.getView() != null && guideStepFragment.isAdded()) {
            IGuideInformation iGuideInformationM63839q3 = guideStepFragment.m63839q3();
            Intrinsics.checkNotNull(map);
            iGuideInformationM63839q3.mo63848b(view, map);
            iGuideInformationM63839q3.mo63850d(view);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final int m63834v3(GuideStepFragment guideStepFragment) {
        Integer numValueOf;
        Bundle arguments = guideStepFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("page_index"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: w3 */
    public static final int m63835w3(GuideStepFragment guideStepFragment) {
        return guideStepFragment.m63839q3().mo63847a();
    }

    /* JADX INFO: renamed from: o3 */
    public final IAllPageInfo m63837o3() {
        if (Intrinsics.areEqual(m63836n3(), "CONTRACT_GRID")) {
            return new C42748c();
        }
        return new C42961c();
    }

    /* JADX INFO: renamed from: q3 */
    public final IGuideInformation m63839q3() {
        IAllPageInfo iAllPageInfoM63837o3 = m63837o3();
        int iM63840r3 = m63840r3();
        if (iM63840r3 != 0) {
            if (iM63840r3 != 1) {
                if (iM63840r3 != 2) {
                    if (iM63840r3 != 3) {
                        return iAllPageInfoM63837o3.mo63844b();
                    }
                    return iAllPageInfoM63837o3.mo63843a();
                }
                return iAllPageInfoM63837o3.mo63846d();
            }
            return iAllPageInfoM63837o3.mo63845c();
        }
        return iAllPageInfoM63837o3.mo63844b();
    }
}
