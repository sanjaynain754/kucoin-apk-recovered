package w00;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewbinding.ViewBinding;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w00.b */
/* JADX INFO: compiled from: ActivityViewBindings.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a]\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Landroidx/activity/ComponentActivity;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "", "onViewDestroyed", "viewBinder", "Lcom/kubi/sdk/viewbindingdelegate/base/a;", "b", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;", "Landroid/app/Activity;", "activity", "Landroid/view/View;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/app/Activity;)Landroid/view/View;", "sdk_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
@JvmName(name = "ActivityViewBindings")
public final class C45678b {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final View m100787a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup == null) {
            throw new IllegalStateException("Activity has no content view");
        }
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            throw new IllegalStateException("Content view has no children. Provide a root view explicitly");
        }
        if (childCount != 1) {
            throw new IllegalStateException("More than one child view found in the Activity content view");
        }
        View childAt = viewGroup.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "contentView.getChildAt(0)");
        return childAt;
    }

    @JvmName(name = "viewBindingActivityWithCallbacks")
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <A extends ComponentActivity, T extends ViewBinding> InterfaceC24293a<A, T> m100788b(@NotNull ComponentActivity componentActivity, @NotNull Function1<? super T, Unit> onViewDestroyed, @NotNull Function1<? super A, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        return new C45677a(false, onViewDestroyed, viewBinder, 1, null);
    }
}
