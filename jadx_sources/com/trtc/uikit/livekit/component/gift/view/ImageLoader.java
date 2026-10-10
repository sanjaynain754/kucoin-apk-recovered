package com.trtc.uikit.livekit.component.gift.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.ViewProps;
import java.security.MessageDigest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048c2.AbstractC4789f;
import p419l2.C42032f;
import p710w1.InterfaceC45686d;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007J*\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/ImageLoader;", "", "<init>", "()V", "radius", "", "clear", "", "context", "Landroid/content/Context;", "imageView", "Landroid/widget/ImageView;", "loadImage", "url", "", "errorResId", "loadTransform", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "placeholderId", "GlideRoundTransform", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageLoader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ImageLoader f77792a = new ImageLoader();

    /* JADX INFO: compiled from: ImageLoader.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/ImageLoader$GlideRoundTransform;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "dp", "", "<init>", "(I)V", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "outHeight", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GlideRoundTransform extends AbstractC4789f {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Companion f77793b = new Companion(null);

        /* JADX INFO: renamed from: c */
        public static float f77794c;

        /* JADX INFO: compiled from: ImageLoader.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/ImageLoader$GlideRoundTransform$Companion;", "", "<init>", "()V", "radius", "", "roundCrop", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "source", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            /* JADX INFO: renamed from: a */
            public final Bitmap m79683a(InterfaceC45686d interfaceC45686d, Bitmap bitmap) {
                if (bitmap == null) {
                    return null;
                }
                Bitmap bitmapMo100813d = interfaceC45686d.mo100813d(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapMo100813d, "get(...)");
                Canvas canvas = new Canvas(bitmapMo100813d);
                Paint paint = new Paint();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                paint.setAntiAlias(true);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), GlideRoundTransform.f77794c, GlideRoundTransform.f77794c, paint);
                return bitmapMo100813d;
            }
        }

        @Override // p628t1.InterfaceC44610b
        /* JADX INFO: renamed from: a */
        public void mo4268a(@NotNull MessageDigest messageDigest) {
            Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        }

        @Override // p048c2.AbstractC4789f
        @Nullable
        /* JADX INFO: renamed from: c */
        public Bitmap mo4851c(@NotNull InterfaceC45686d pool, @NotNull Bitmap toTransform, int i11, int i12) {
            Intrinsics.checkNotNullParameter(pool, "pool");
            Intrinsics.checkNotNullParameter(toTransform, "toTransform");
            return f77793b.m79683a(pool, toTransform);
        }

        public GlideRoundTransform(int i11) {
            f77794c = Resources.getSystem().getDisplayMetrics().density * i11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m79679b(ImageLoader imageLoader, Context context, ImageView imageView, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        int i14 = i11;
        if ((i13 & 16) != 0) {
            i12 = 15;
        }
        imageLoader.m79680a(context, imageView, str, i14, i12);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: a */
    public final void m79680a(@NotNull Context context, @NotNull ImageView imageView, @Nullable String str, @DrawableRes int i11, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (!TextUtils.isEmpty(str)) {
            ComponentCallbacks2C5309c.m6556t(context).mo6634v(str).mo6614y0(m79681c(context, i11, i12)).m6594E0(imageView);
        } else if (i11 != 0) {
            imageView.setImageResource(i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final C5313g<Drawable> m79681c(Context context, @DrawableRes int i11, int i12) {
        C5313g<Drawable> c5313gMo6606a = ComponentCallbacks2C5309c.m6556t(context).mo6632t(Integer.valueOf(i11)).mo6606a(new C42032f().mo92189c().mo92213o0(new GlideRoundTransform(i12)));
        Intrinsics.checkNotNullExpressionValue(c5313gMo6606a, "apply(...)");
        return c5313gMo6606a;
    }
}
