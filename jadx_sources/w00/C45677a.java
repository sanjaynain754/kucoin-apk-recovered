package w00;

import androidx.activity.ComponentActivity;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w00.a */
/* JADX INFO: compiled from: ActivityViewBindings.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B9\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lw00/a;", "Landroidx/activity/ComponentActivity;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/viewbindingdelegate/base/LifecycleViewBindingProperty;", "", "viewNeedsInitialization", "Lkotlin/Function1;", "", "onViewDestroyed", "viewBinder", "<init>", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "d", "(Landroidx/activity/ComponentActivity;)Landroidx/lifecycle/LifecycleOwner;", "e", "(Landroidx/activity/ComponentActivity;)Z", "f", "Z", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C45677a<A extends ComponentActivity, T extends ViewBinding> extends LifecycleViewBindingProperty<A, T> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean viewNeedsInitialization;

    public /* synthetic */ C45677a(boolean z11, Function1 function1, Function1 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, function1, function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45677a(boolean z11, @NotNull Function1<? super T, Unit> onViewDestroyed, @NotNull Function1<? super A, ? extends T> viewBinder) {
        super(onViewDestroyed, viewBinder);
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.viewNeedsInitialization = z11;
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LifecycleOwner mo58549b(@NotNull A thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return thisRef;
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.LifecycleViewBindingProperty
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo58550c(@NotNull A thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        return (this.viewNeedsInitialization && thisRef.getWindow() == null) ? false : true;
    }
}
