package p253f6;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f6.b */
/* JADX INFO: compiled from: TransformationUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lf6/b;", "", "<init>", "()V", "Lf6/a;", "transformation", "La4/a;", "Landroid/graphics/Bitmap;", "bitmapReference", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lf6/a;La4/a;)Z", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37381b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37381b f82935a = new C37381b();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m84046a(@Nullable InterfaceC37380a transformation, @Nullable AbstractC0110a<Bitmap> bitmapReference) {
        if (transformation == null || bitmapReference == null) {
            return false;
        }
        Bitmap bitmapM565l = bitmapReference.m565l();
        Intrinsics.checkNotNullExpressionValue(bitmapM565l, "get(...)");
        Bitmap bitmap = bitmapM565l;
        if (transformation.m84045b()) {
            bitmap.setHasAlpha(true);
        }
        transformation.m84044a(bitmap);
        return true;
    }
}
