package androidx.fragment.app;

import androidx.lifecycle.ViewModelStoreOwner;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStoreOwner;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 176)
@SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4\n*L\n1#1,222:1\n*E\n"})
public final class FragmentViewModelLazyKt$viewModels$owner$4 extends Lambda implements Function0<ViewModelStoreOwner> {
    final /* synthetic */ Function0<ViewModelStoreOwner> $ownerProducer;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p852kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelStoreOwner invoke() {
        return this.$ownerProducer.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$owner$4(Function0<? extends ViewModelStoreOwner> function0) {
        super(0);
        this.$ownerProducer = function0;
    }
}
