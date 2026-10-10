package p275fy;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fy.a */
/* JADX INFO: compiled from: MultiItemAdapterEx.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/adapter/BaseQuickVH;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "<init>", "(Landroidx/viewbinding/ViewBinding;)V", "getViewBinding", "()Landroidx/viewbinding/ViewBinding;", "Landroidx/viewbinding/ViewBinding;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37728a<T extends ViewBinding> extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final T f85006g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37728a(@NotNull T viewBinding) {
        super(viewBinding.getRoot());
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        this.f85006g = viewBinding;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final T m85032b() {
        return this.f85006g;
    }
}
