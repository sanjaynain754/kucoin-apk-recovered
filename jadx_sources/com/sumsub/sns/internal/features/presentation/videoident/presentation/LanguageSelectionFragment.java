package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.adapter.decorator.C28094b;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.features.presentation.videoident.AbstractC32895a;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\u00038PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionFragment;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel;", "<init>", "()V", "", "language", "", "waitTimeSec", "", "finishWithLanguage", "(Ljava/lang/String;J)V", "", "getLayoutId", "()Ljava/lang/Integer;", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/r;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/r;)V", "state", "handleState", "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel$ViewState;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/w;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/w;)Z", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel$idensic_mobile_sdk_aar_defaultRelease", "()Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionViewModel;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "Landroid/widget/TextView;", "title$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getTitle", "()Landroid/widget/TextView;", "title", "Landroidx/recyclerview/widget/RecyclerView;", "list$delegate", "getList", "()Landroidx/recyclerview/widget/RecyclerView;", "list", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageItemAdapter;", "adapter", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageItemAdapter;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLanguageSelectionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSelectionFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,138:1\n106#2,15:139\n*S KotlinDebug\n*F\n+ 1 LanguageSelectionFragment.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionFragment\n*L\n26#1:139,15\n*E\n"})
public final class LanguageSelectionFragment extends AbstractC28064I<LanguageSelectionViewModel.ViewState, LanguageSelectionViewModel> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {AbstractC28118g.m69077a(LanguageSelectionFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(LanguageSelectionFragment.class, "list", "getList()Landroidx/recyclerview/widget/RecyclerView;", 0)};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String RESULT_KEY_SELECTED_LANGUAGE = "lang";
    private LanguageItemAdapter adapter;

    /* JADX INFO: renamed from: list$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadOnlyProperty list;

    @NotNull
    private final Screen screen;

    /* JADX INFO: renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadOnlyProperty title;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionFragment$Companion;", "", "<init>", "()V", "RESULT_KEY_SELECTED_LANGUAGE", "", "getInstance", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/LanguageSelectionFragment;", "state", "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSViewState$LanguageSelection;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final LanguageSelectionFragment getInstance(@NotNull SNSViewState.LanguageSelection state) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(LanguageSelectionViewModel.ARG_LANGS, new ArrayList<>(state.getLanguages()));
            bundle.putString("lang", state.getSelectedLanguage());
            bundle.putString(LanguageSelectionViewModel.ARG_ID_DOC_SET_TYPE, state.getIdDocSetType());
            LanguageSelectionFragment languageSelectionFragment = new LanguageSelectionFragment();
            languageSelectionFragment.setArguments(bundle);
            return languageSelectionFragment;
        }
    }

    private final RecyclerView getList() {
        return (RecyclerView) this.list.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0(LanguageSelectionFragment languageSelectionFragment) {
        return new LanguageSelectionViewModelFactory(languageSelectionFragment, languageSelectionFragment.getArguments(), languageSelectionFragment.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_video_ident_language_selection);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public Screen getF63762g() {
        return this.screen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    public LanguageSelectionViewModel getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (LanguageSelectionViewModel) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleEvent(@NotNull InterfaceC28145r event) {
        if (!(event instanceof LanguageSelectionViewModel.FinishWithLanguage)) {
            super.handleEvent(event);
        } else {
            LanguageSelectionViewModel.FinishWithLanguage finishWithLanguage = (LanguageSelectionViewModel.FinishWithLanguage) event;
            finishWithLanguage(finishWithLanguage.getLanguage(), finishWithLanguage.getWaitTimeSec());
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleState(@NotNull LanguageSelectionViewModel.ViewState state, @Nullable Bundle savedInstanceState) {
        AbstractC32895a.m71366a("lang selection state: " + state);
        TextView title = getTitle();
        if (title != null) {
            AbstractC28458h.m69341a(title, state.getTitle());
        }
        LanguageItemAdapter languageItemAdapter = this.adapter;
        if (languageItemAdapter == null) {
            languageItemAdapter = null;
        }
        languageItemAdapter.setItems(state.getLanguages());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public boolean onFinishCalled(@NotNull AbstractC28503w finishReason) {
        AbstractC32895a.m71366a("LanguageSelectionFragment.onFinishCalled: " + finishReason);
        m69084e();
        AbstractC28133l.setResult$default(this, 0, null, 2, null);
        return false;
    }

    public LanguageSelectionFragment() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LanguageSelectionFragment.viewModel_delegate$lambda$0(this.f67386b);
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function1.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function2 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(LanguageSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function2;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
        this.screen = Screen.VideoidentLangSelectorScreen;
        this.title = new C28404L(R$id.sns_title);
        this.list = new C28404L(R$id.sns_list);
    }

    private final void finishWithLanguage(String language, long waitTimeSec) {
        C28367f.m69257a(getAnalyticsDelegate(), getF63762g(), getF63761f(), Control.ContinueButton, MapsKt.mapOf(TuplesKt.m90091to("lang", language), TuplesKt.m90091to("waitTimeSec", Long.valueOf(waitTimeSec))), 16);
        Bundle bundle = new Bundle();
        bundle.putString("lang", language);
        Unit unit = Unit.INSTANCE;
        AbstractC28133l.setResult$default(this, 0, bundle, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(LanguageSelectionFragment languageSelectionFragment, LanguageSelectionViewModel.ViewState.Language language) {
        C28367f.m69257a(languageSelectionFragment.getAnalyticsDelegate(), languageSelectionFragment.getF63762g(), languageSelectionFragment.getF63761f(), Control.ListItem, MapsKt.mapOf(TuplesKt.m90091to("lang", String.valueOf(language.getId())), TuplesKt.m90091to("waitTimeSec", Long.valueOf(language.getWaitTimeSec()))), 16);
        languageSelectionFragment.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onItemSelected(language);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @NotNull
    /* JADX INFO: renamed from: getIdDocSetType */
    public String getF63761f() {
        String idDocSetType = getViewModel$idensic_mobile_sdk_aar_defaultRelease().getIdDocSetType();
        if (idDocSetType == null) {
            return "VIDEO_IDENT";
        }
        return idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView list = getList();
        if (list != null) {
            list.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        RecyclerView list2 = getList();
        if (list2 != null) {
            list2.addItemDecoration(new C28094b(getResources().getDimensionPixelSize(R$dimen.sns_margin_small)));
        }
        RecyclerView list3 = getList();
        if (list3 != null) {
            LanguageItemAdapter languageItemAdapter = new LanguageItemAdapter();
            this.adapter = languageItemAdapter;
            languageItemAdapter.setSelectionCallback(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.videoident.presentation.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LanguageSelectionFragment.onViewCreated$lambda$2$lambda$1(this.f67388b, (LanguageSelectionViewModel.ViewState.Language) obj);
                }
            });
            list3.setAdapter(languageItemAdapter);
        }
    }
}
