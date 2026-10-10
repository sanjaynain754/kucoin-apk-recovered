package io.trtc.tuikit.atomicx.widget.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import cg0.C4967a;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048c2.AbstractC4789f;
import p048c2.C4781a0;
import p048c2.C4793j;
import p419l2.C42032f;
import p628t1.C44611c;
import p680v1.AbstractC45352c;
import p710w1.InterfaceC45686d;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.utils.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0007J$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0010\u001a\u00020\fH\u0007J4\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\fH\u0002¨\u0006\u001f"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/utils/ImageLoader;", "", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "target", "Landroid/widget/ImageView;", "source", "placeImage", "", "config", "Lio/trtc/tuikit/atomicx/widget/utils/ImageOptions;", "loadGif", "resourceId", "transformBitmap", "Landroid/graphics/Bitmap;", "width", "height", "options", "clear", "loadImageView", "setRenderEffect", "setBuilderOptions", "builder", "Lcom/bumptech/glide/RequestBuilder;", "dpToPx", "dp", "BlurTransformation", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageLoader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ImageLoader f87600a = new ImageLoader();

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.utils.a$a */
    /* JADX INFO: compiled from: ImageLoader.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/utils/ImageLoader$BlurTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.LEVEL, "", "<init>", "(Landroid/content/Context;F)V", "radius", "contextRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "", "outHeight", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends AbstractC4789f {

        /* JADX INFO: renamed from: b */
        public final float f87601b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final WeakReference<Context> f87602c;

        public a(@NotNull Context context, float f11) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f87601b = f11 * 0.25f;
            this.f87602c = new WeakReference<>(context);
        }

        @Override // p628t1.InterfaceC44610b
        /* JADX INFO: renamed from: a */
        public void mo4268a(@NotNull MessageDigest messageDigest) {
            Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
            byte[] bytes = ("blur:" + this.f87601b).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
        }

        @Override // p048c2.AbstractC4789f
        @NotNull
        /* JADX INFO: renamed from: c */
        public Bitmap mo4851c(@NotNull InterfaceC45686d pool, @NotNull Bitmap toTransform, int i11, int i12) {
            Intrinsics.checkNotNullParameter(pool, "pool");
            Intrinsics.checkNotNullParameter(toTransform, "toTransform");
            Context context = this.f87602c.get();
            return context == null ? toTransform : C4967a.m5260a(context, pool, toTransform, (int) this.f87601b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m88216a(Context context, int i11) {
        return (int) TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m88214b(@NotNull Context context, @Nullable ImageView imageView, @Nullable Object obj, @DrawableRes int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        m88215c(context, imageView, obj, new ImageOptions.C39388a().m88213b(i11).m88212a());
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m88215c(@NotNull Context context, @Nullable ImageView imageView, @Nullable Object obj, @NotNull ImageOptions config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (imageView == null) {
            return;
        }
        if (obj == null) {
            imageView.setImageResource(config.getPlaceImage() != 0 ? config.getPlaceImage() : config.getErrorImage());
        } else {
            f87600a.m88217d(context, imageView, obj, config);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m88217d(Context context, ImageView imageView, Object obj, ImageOptions imageOptions) {
        C5313g<Drawable> c5313gMo6633u;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        if (imageOptions.getIsGif()) {
            c5313gMo6633u = ComponentCallbacks2C5309c.m6556t(context.getApplicationContext()).mo6624l().mo6600K0(obj);
            Intrinsics.checkNotNull(c5313gMo6633u);
        } else {
            c5313gMo6633u = ComponentCallbacks2C5309c.m6556t(context.getApplicationContext()).mo6633u(obj);
            Intrinsics.checkNotNull(c5313gMo6633u);
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        m88218e(applicationContext, c5313gMo6633u, imageOptions);
        c5313gMo6633u.m6594E0(imageView);
        m88219f(imageView, imageOptions);
    }

    /* JADX INFO: renamed from: e */
    public final void m88218e(Context context, C5313g<?> c5313g, ImageOptions imageOptions) {
        C42032f c42032f = new C42032f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4793j());
        if (imageOptions.getRoundRadius() > 0) {
            arrayList.add(new C4781a0(m88216a(context, imageOptions.getRoundRadius())));
        }
        if (imageOptions.getBlurEffect() > 0.0f && Build.VERSION.SDK_INT < 31) {
            arrayList.add(new a(context, imageOptions.getBlurEffect()));
        }
        c42032f.mo92213o0(new C44611c(arrayList));
        if (imageOptions.getPlaceImage() != 0) {
            c42032f.mo92188b0(imageOptions.getPlaceImage());
        }
        if (imageOptions.getErrorImage() != 0) {
            c42032f.mo92208m(imageOptions.getErrorImage());
        }
        c42032f.mo92200i(imageOptions.getSkipDiskCache() ? AbstractC45352c.f101955b : AbstractC45352c.f101954a);
        c42032f.mo92207l0(imageOptions.getSkipMemoryCache());
        c5313g.mo6606a(c42032f);
    }

    /* JADX INFO: renamed from: f */
    public final void m88219f(ImageView imageView, ImageOptions imageOptions) {
        float blurEffect = imageOptions.getBlurEffect();
        if (blurEffect > 0.0f && Build.VERSION.SDK_INT >= 31) {
            imageView.setRenderEffect(RenderEffect.createBlurEffect(blurEffect, blurEffect, Shader.TileMode.MIRROR));
        }
    }
}
