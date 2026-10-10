package coil.size;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p816z0.RealViewSizeResolver;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewSizeResolver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0018J/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcoil/size/ViewSizeResolver;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lcoil/size/SizeResolver;", "", "paramSize", "viewSize", "paddingSize", "", "isWidth", "getDimension", "(IIIZ)I", "getHeight", "()I", "Lcoil/size/PixelSize;", "getSize", "()Lcoil/size/PixelSize;", "getWidth", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "", "removePreDrawListenerSafe", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface ViewSizeResolver<T extends View> extends SizeResolver {

    /* JADX INFO: compiled from: ViewSizeResolver.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcoil/size/ViewSizeResolver$Companion;", "", "()V", "invoke", "Lcoil/size/ViewSizeResolver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "subtractPadding", "", "create", "(Landroid/view/View;Z)Lcoil/size/ViewSizeResolver;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5839a = new Companion();

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        @JvmOverloads
        public final <T extends View> ViewSizeResolver<T> create(@NotNull T view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return create$default(this, view, false, 2, null);
        }

        public static /* synthetic */ ViewSizeResolver create$default(Companion companion, View view, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return companion.create(view, z11);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        @JvmOverloads
        public final <T extends View> ViewSizeResolver<T> create(@NotNull T view, boolean subtractPadding) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new RealViewSizeResolver(view, subtractPadding);
        }
    }
}
