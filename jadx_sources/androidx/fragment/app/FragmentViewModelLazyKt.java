package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aZ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aD\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aV\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012²\u0006\u0016\u0010\u0013\u001a\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008a\u0084\u0002²\u0006\u0016\u0010\u0013\u001a\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008a\u0084\u0002"}, m90084d2 = {"activityViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "createViewModelLazy", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "viewModels", "ownerProducer", "Landroidx/lifecycle/ViewModelStoreOwner;", "fragment-ktx_release", TUIConstants.TUIChat.OWNER}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FragmentViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1\n*L\n1#1,222:1\n*E\n"})
    public static final class C25601 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25601(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2\n*L\n1#1,222:1\n*E\n"})
    public static final class C25612 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25612(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3\n*L\n1#1,222:1\n*E\n"})
    public static final class C25623 extends Lambda implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25623(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4\n*L\n1#1,222:1\n*E\n"})
    public static final class C25634 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25634(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
    public static final class C25645 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25645(Function0<? extends CreationExtras> function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            if (function0 != null && (creationExtrasInvoke = function0.invoke()) != null) {
                return creationExtrasInvoke;
            }
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
    public static final class C25656 extends Lambda implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25656(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2\n*L\n1#1,222:1\n*E\n"})
    public static final class C25692 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ Lazy<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25692(Lazy<? extends ViewModelStoreOwner> lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m103548viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,222:1\n*E\n"})
    public static final class C25703 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ Lazy<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25703(Lazy<? extends ViewModelStoreOwner> lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwnerM103548viewModels$lambda0 = FragmentViewModelLazyKt.m103548viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103548viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103548viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4\n*L\n1#1,222:1\n*E\n"})
    public static final class C25714 extends Lambda implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Lazy<ViewModelStoreOwner> $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25714(Fragment fragment, Lazy<? extends ViewModelStoreOwner> lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM103548viewModels$lambda0 = FragmentViewModelLazyKt.m103548viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103548viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103548viewModels$lambda0 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6\n*L\n1#1,222:1\n*E\n"})
    public static final class C25736 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ Lazy<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25736(Lazy<? extends ViewModelStoreOwner> lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m103549viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
    public static final class C25747 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ Lazy<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25747(Function0<? extends CreationExtras> function0, Lazy<? extends ViewModelStoreOwner> lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            if (function0 != null && (creationExtrasInvoke = function0.invoke()) != null) {
                return creationExtrasInvoke;
            }
            ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8 */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
    public static final class C25758 extends Lambda implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Lazy<ViewModelStoreOwner> $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25758(Fragment fragment, Lazy<? extends ViewModelStoreOwner> lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> activityViewModels(Fragment fragment, Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25601 c25601 = new C25601(fragment);
        C25612 c25612 = new C25612(fragment);
        if (function0 == null) {
            function0 = new C25623(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25601, c25612, function0);
    }

    public static /* synthetic */ Lazy activityViewModels$default(Fragment fragment, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25601 c25601 = new C25601(fragment);
        C25612 c25612 = new C25612(fragment);
        if (function0 == null) {
            function0 = new C25623(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25601, c25612, function0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ Lazy createViewModelLazy(final Fragment fragment, KClass viewModelClass, Function0 storeProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        return createViewModelLazy(fragment, viewModelClass, storeProducer, new Function0<CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, function0);
    }

    public static /* synthetic */ Lazy createViewModelLazy$default(Fragment fragment, KClass kClass, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(Fragment fragment, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25692 c25692 = new C25692(lazy);
        C25703 c25703 = new C25703(lazy);
        if (function0 == null) {
            function0 = new C25714(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25692, c25703, function0);
    }

    public static /* synthetic */ Lazy viewModels$default(final Fragment fragment, Function0 ownerProducer, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ownerProducer = new Function0<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final Fragment invoke() {
                    return fragment;
                }

                {
                    super(0);
                }
            };
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25692 c25692 = new C25692(lazy);
        C25703 c25703 = new C25703(lazy);
        if (function0 == null) {
            function0 = new C25714(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25692, c25703, function0);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> activityViewModels(Fragment fragment, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25634 c25634 = new C25634(fragment);
        C25645 c25645 = new C25645(function0, fragment);
        if (function1 == null) {
            function1 = new C25656(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25634, c25645, function1);
    }

    @MainThread
    @NotNull
    public static final <VM extends ViewModel> Lazy<VM> createViewModelLazy(@NotNull final Fragment fragment, @NotNull KClass<VM> viewModelClass, @NotNull Function0<? extends ViewModelStore> storeProducer, @NotNull Function0<? extends CreationExtras> extrasProducer, @Nullable Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        if (function0 == null) {
            function0 = new Function0<ViewModelProvider.Factory>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            };
        }
        return new ViewModelLazy(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static /* synthetic */ Lazy createViewModelLazy$default(final Fragment fragment, KClass kClass, Function0 function0, Function0 function1, Function0 function2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = new Function0<CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final CreationExtras invoke() {
                    CreationExtras defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }

                {
                    super(0);
                }
            };
        }
        if ((i11 & 8) != 0) {
            function2 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function1, function2);
    }

    public static /* synthetic */ Lazy activityViewModels$default(Fragment fragment, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25634 c25634 = new C25634(fragment);
        C25645 c25645 = new C25645(function0, fragment);
        if (function1 == null) {
            function1 = new C25656(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25634, c25645, function1);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(Fragment fragment, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25736 c25736 = new C25736(lazy);
        C25747 c25747 = new C25747(function0, lazy);
        if (function1 == null) {
            function1 = new C25758(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25736, c25747, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m103548viewModels$lambda0(Lazy<? extends ViewModelStoreOwner> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m103549viewModels$lambda1(Lazy<? extends ViewModelStoreOwner> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ Lazy viewModels$default(final Fragment fragment, Function0 ownerProducer, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ownerProducer = new Function0<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final Fragment invoke() {
                    return fragment;
                }

                {
                    super(0);
                }
            };
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C25736 c25736 = new C25736(lazy);
        C25747 c25747 = new C25747(function0, lazy);
        if (function1 == null) {
            function1 = new C25758(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c25736, c25747, function1);
    }
}
