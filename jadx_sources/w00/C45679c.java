package w00;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w00.c */
/* JADX INFO: compiled from: FragmentViewBindings.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B7\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lw00/c;", "Landroidx/fragment/app/DialogFragment;", "F", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty;", "", "viewNeedsInitialization", "Lkotlin/Function1;", "viewBinder", "", "onViewDestroyed", "<init>", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "d", "(Landroidx/fragment/app/DialogFragment;)Landroidx/lifecycle/LifecycleOwner;", "e", "(Landroidx/fragment/app/DialogFragment;)Z", "f", "Z", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C45679c<F extends DialogFragment, T extends ViewBinding> extends LifecycleViewBindingProperty<F, T> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean viewNeedsInitialization;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45679c(boolean z11, @NotNull Function1<? super F, ? extends T> viewBinder, @NotNull Function1<? super T, Unit> onViewDestroyed) {
        super(onViewDestroyed, viewBinder);
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        this.viewNeedsInitialization = z11;
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LifecycleOwner mo58549b(@NotNull F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        if (thisRef.getView() == null) {
            return thisRef;
        }
        try {
            LifecycleOwner viewLifecycleOwner = thisRef.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "{\n            try {\n    …)\n            }\n        }");
            return viewLifecycleOwner;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have a view associated with it or the view has been destroyed");
        }
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo58550c(@NotNull F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        if (!this.viewNeedsInitialization) {
            return true;
        }
        if (thisRef.getShowsDialog()) {
            return thisRef.getDialog() != null;
        }
        return thisRef.getView() != null;
    }
}
