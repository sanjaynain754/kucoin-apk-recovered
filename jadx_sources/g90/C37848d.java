package g90;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: g90.d */
/* JADX INFO: compiled from: SVGABitmapFileDecoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lg90/d;", "Lg90/c;", "", "<init>", "()V", "data", "Landroid/graphics/BitmapFactory$Options;", "ops", "Landroid/graphics/Bitmap;", "c", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C37848d extends AbstractC37847c<String> {

    /* JADX INFO: renamed from: a */
    public static final C37848d f85226a = new C37848d();

    @Override // g90.AbstractC37847c
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap mo85405b(@NotNull String data, @NotNull BitmapFactory.Options ops) {
        return BitmapFactory.decodeFile(data, ops);
    }
}
