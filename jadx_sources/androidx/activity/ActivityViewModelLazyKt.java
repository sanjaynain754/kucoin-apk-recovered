package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u001aC\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b¨\u0006\n"}, m90084d2 = {"viewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "activity-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ActivityViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1 */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$1\n*L\n1#1,90:1\n*E\n"})
    public static final class C04191 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getMViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04191(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2 */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$2\n*L\n1#1,90:1\n*E\n"})
    public static final class C04202 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04202(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3 */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    public static final class C04213 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getMViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04213(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4 */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    public static final class C04224 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            return (function0 == null || (creationExtrasInvoke = function0.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04224(Function0<? extends CreationExtras> function0, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_viewModels = componentActivity;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(ComponentActivity componentActivity, Function0<? extends ViewModelProvider.Factory> function0) {
        if (function0 == null) {
            function0 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new C04191(componentActivity), function0, new C04202(componentActivity));
    }

    public static /* synthetic */ Lazy viewModels$default(ComponentActivity componentActivity, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        if (function0 == null) {
            function0 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new C04191(componentActivity), function0, new C04202(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(ComponentActivity componentActivity, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function1) {
        if (function1 == null) {
            function1 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new C04213(componentActivity), function1, new C04224(function0, componentActivity));
    }

    public static /* synthetic */ Lazy viewModels$default(ComponentActivity componentActivity, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if (function1 == null) {
            function1 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new C04213(componentActivity), function1, new C04224(function0, componentActivity));
    }
}
