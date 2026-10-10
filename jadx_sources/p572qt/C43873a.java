package p572qt;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qt.a */
/* JADX INFO: compiled from: GlideUtils.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/chat/utils/GlideUtils;", "", "<init>", "()V", "loadHeadImage", "", "imageView", "Landroid/widget/ImageView;", "avatar", "", "loadScaledImage", "context", "Landroid/content/Context;", "path", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGlideUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlideUtils.kt\ncom/kubi/payment/chat/utils/GlideUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class C43873a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43873a f96960a = new C43873a();

    /* JADX INFO: renamed from: a */
    public final void m96644a(@NotNull Context context, @NotNull String path, @NotNull ImageView imageView) {
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        float f11 = i13 / i12;
        if (0.0f > f11 || f11 > 0.25f) {
            if (f11 > 3.0f) {
                i13 = 300;
                if (i12 > 300) {
                    i11 = 900;
                    int i14 = i11;
                    i12 = i13;
                    i13 = i14;
                } else if (i12 < 100) {
                    i12 = 100;
                } else {
                    i13 = i12 * 3;
                }
            } else if (i12 > 400) {
                i13 = (int) (400 * f11);
                i12 = 400;
            } else if (i12 < 100) {
                i13 = (int) (100 * f11);
                i12 = 100;
            }
        } else if (i13 > 100) {
            i12 = 400;
            i13 = 100;
        } else {
            i11 = 50;
            if (i13 < 50) {
                i13 = 200;
                int i15 = i11;
                i12 = i13;
                i13 = i15;
            } else {
                i12 = i13 * 4;
            }
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i12;
        layoutParams.height = i13;
        imageView.setLayoutParams(layoutParams);
        ComponentCallbacks2C5309c.m6556t(context).mo6634v(path).m6594E0(imageView);
        imageView.setEnabled(true);
    }
}
