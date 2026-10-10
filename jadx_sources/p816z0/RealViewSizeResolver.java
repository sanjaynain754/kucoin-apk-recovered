package p816z0;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.size.ViewSizeResolver;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z0.b, reason: from toString */
/* JADX INFO: compiled from: RealViewSizeResolver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lz0/b;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lcoil/size/ViewSizeResolver;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/view/View;", "b", "()Landroid/view/View;", "Z", "()Z", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final T view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean subtractPadding;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealViewSizeResolver)) {
            return false;
        }
        RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) other;
        return Intrinsics.areEqual(m102787b(), realViewSizeResolver.m102787b()) && getSubtractPadding() == realViewSizeResolver.getSubtractPadding();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public T m102787b() {
        return this.view;
    }

    @NotNull
    public String toString() {
        return "RealViewSizeResolver(view=" + m102787b() + ", subtractPadding=" + getSubtractPadding() + ')';
    }

    public RealViewSizeResolver(@NotNull T view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.subtractPadding = z11;
    }

    public int hashCode() {
        return (m102787b().hashCode() * 31) + Boolean.hashCode(getSubtractPadding());
    }
}
