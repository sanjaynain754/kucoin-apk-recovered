package h90;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.media.SoundPool;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.opensource.svgaplayer.C27322e;
import com.opensource.svgaplayer.C27326h;
import com.opensource.svgaplayer.InterfaceC27318a;
import com.opensource.svgaplayer.SVGAVideoEntity;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.tencent.bugly.proguard.C33590cg;
import i90.C38488a;
import i90.C38489b;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TypeCastException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: h90.b */
/* JADX INFO: compiled from: SVGACanvasDrawer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000fFB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\u000e2\n\u0010\u001f\u001a\u00060\u0013R\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u000e2\n\u0010\u001f\u001a\u00060\u0013R\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#J3\u0010'\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001f\u001a\u00060\u0013R\u00020\u00012\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u000e2\n\u0010\u001f\u001a\u00060\u0013R\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010#J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u00020\u000e2\n\u0010\u001f\u001a\u00060\u0013R\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010!R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R0\u00108\u001a\u001e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020$03j\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020$`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010:R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010=R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, m90084d2 = {"Lh90/b;", "Lh90/a;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "Lcom/opensource/svgaplayer/e;", "dynamicItem", "<init>", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/e;)V", "Landroid/graphics/Canvas;", "canvas", "", "frameIndex", "Landroid/widget/ImageView$ScaleType;", "scaleType", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/Canvas;ILandroid/widget/ImageView$ScaleType;)V", "spriteIndex", "", "Lh90/a$a;", "sprites", "", "k", "(ILjava/util/List;)Z", CmcdData.Factory.STREAM_TYPE_LIVE, "n", "(I)V", "Landroid/graphics/Matrix;", ViewProps.TRANSFORM, "o", "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;", "sprite", "i", "(Lh90/a$a;Landroid/graphics/Canvas;I)V", "g", "(Lh90/a$a;Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "drawingBitmap", "frameMatrix", "j", "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Lh90/a$a;Landroid/graphics/Matrix;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "matrix", "", "m", "(Landroid/graphics/Matrix;)F", "f", "Lh90/b$b;", "d", "Lh90/b$b;", "sharedValues", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "e", "Ljava/util/HashMap;", "drawTextCache", "Lh90/b$a;", "Lh90/b$a;", "pathCache", "", "[Ljava/lang/Boolean;", "beginIndexList", "endIndexList", "", "[F", "matrixScaleTempValues", "Lcom/opensource/svgaplayer/e;", "getDynamicItem", "()Lcom/opensource/svgaplayer/e;", "b", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C38151b extends C38150a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final b sharedValues;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final HashMap<String, Bitmap> drawTextCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final a pathCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Boolean[] beginIndexList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Boolean[] endIndexList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float[] matrixScaleTempValues;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C27322e dynamicItem;

    /* JADX INFO: renamed from: h90.b$a */
    /* JADX INFO: compiled from: SVGACanvasDrawer.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0012j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lh90/b$a;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;", "shape", "Landroid/graphics/Path;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;)Landroid/graphics/Path;", "", "I", "canvasWidth", "canvasHeight", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", C33590cg.f69440j, "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int canvasWidth;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int canvasHeight;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final HashMap<SVGAVideoShapeEntity, Path> cache = new HashMap<>();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Path m86093a(@NotNull SVGAVideoShapeEntity shape) {
            if (!this.cache.containsKey(shape)) {
                Path path = new Path();
                path.set(shape.getShapePath());
                this.cache.put(shape, path);
            }
            Path path2 = this.cache.get(shape);
            if (path2 == null) {
                Intrinsics.throwNpe();
            }
            return path2;
        }

        /* JADX INFO: renamed from: b */
        public final void m86094b(@NotNull Canvas canvas) {
            if (this.canvasWidth != canvas.getWidth() || this.canvasHeight != canvas.getHeight()) {
                this.cache.clear();
            }
            this.canvasWidth = canvas.getWidth();
            this.canvasHeight = canvas.getHeight();
        }
    }

    /* JADX INFO: renamed from: h90.b$b */
    /* JADX INFO: compiled from: SVGACanvasDrawer.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006J\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010#\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006&"}, m90084d2 = {"Lh90/b$b;", "", "<init>", "()V", "Landroid/graphics/Paint;", "f", "()Landroid/graphics/Paint;", "Landroid/graphics/Path;", "g", "()Landroid/graphics/Path;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/graphics/Matrix;", "c", "()Landroid/graphics/Matrix;", "d", "b", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "", "width", "height", "Landroid/graphics/Canvas;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(II)Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "sharedPaint", "Landroid/graphics/Path;", "sharedPath", "sharedPath2", "Landroid/graphics/Matrix;", "sharedMatrix", "sharedMatrix2", "shareMattePaint", "Landroid/graphics/Canvas;", "shareMatteCanvas", "Landroid/graphics/Bitmap;", "sharedMatteBitmap", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Paint sharedPaint = new Paint();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Path sharedPath = new Path();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final Path sharedPath2 = new Path();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final Matrix sharedMatrix = new Matrix();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final Matrix sharedMatrix2 = new Matrix();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final Paint shareMattePaint = new Paint();

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public Canvas shareMatteCanvas;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public Bitmap sharedMatteBitmap;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Canvas m86095a(int width, int height) {
            if (this.shareMatteCanvas == null) {
                this.sharedMatteBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
            }
            return new Canvas(this.sharedMatteBitmap);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Paint m86096b() {
            this.shareMattePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            return this.shareMattePaint;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Matrix m86097c() {
            this.sharedMatrix.reset();
            return this.sharedMatrix;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Matrix m86098d() {
            this.sharedMatrix2.reset();
            return this.sharedMatrix2;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Bitmap m86099e() {
            Bitmap bitmap = this.sharedMatteBitmap;
            if (bitmap != null) {
                return bitmap;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Paint m86100f() {
            this.sharedPaint.reset();
            return this.sharedPaint;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final Path m86101g() {
            this.sharedPath.reset();
            return this.sharedPath;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Path m86102h() {
            this.sharedPath2.reset();
            return this.sharedPath2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    @Override // h90.C38150a
    /* JADX INFO: renamed from: a */
    public void mo86072a(@NotNull Canvas canvas, int frameIndex, @NotNull ImageView.ScaleType scaleType) {
        int i11;
        int i12;
        C38150a.a aVar;
        C38150a.a aVar2;
        super.mo86072a(canvas, frameIndex, scaleType);
        m86091n(frameIndex);
        this.pathCache.m86094b(canvas);
        List<C38150a.a> listM86076e = m86076e(frameIndex);
        if (listM86076e.size() <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = null;
        this.beginIndexList = null;
        this.endIndexList = null;
        boolean z11 = false;
        String str = listM86076e.get(0).get_imageKey();
        int i13 = 2;
        boolean zEndsWith$default = str != null ? StringsKt.endsWith$default(str, ".matte", false, 2, (Object) null) : false;
        int i14 = -1;
        int iSaveLayer = -1;
        int i15 = 0;
        for (Object obj2 : listM86076e) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C38150a.a aVar3 = (C38150a.a) obj2;
            String str2 = aVar3.get_imageKey();
            if (str2 == null) {
                if (m86088k(i15, listM86076e)) {
                    aVar = aVar3;
                    i11 = i14;
                    i12 = i15;
                    iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
                } else {
                    i11 = i14;
                    i12 = i15;
                    aVar = aVar3;
                }
                m86086i(aVar, canvas, frameIndex);
                if (!m86089l(i12, listM86076e) && (aVar2 = (C38150a.a) linkedHashMap.get(aVar.get_matteKey())) != null) {
                    m86086i(aVar2, this.sharedValues.m86095a(canvas.getWidth(), canvas.getHeight()), frameIndex);
                    canvas.drawBitmap(this.sharedValues.m86099e(), 0.0f, 0.0f, this.sharedValues.m86096b());
                    if (iSaveLayer != i11) {
                        canvas.restoreToCount(iSaveLayer);
                    } else {
                        canvas.restore();
                    }
                }
            } else {
                if (!zEndsWith$default) {
                    m86086i(aVar3, canvas, frameIndex);
                } else if (StringsKt.endsWith$default(str2, ".matte", z11, i13, obj)) {
                    linkedHashMap.put(str2, aVar3);
                } else {
                    if (m86088k(i15, listM86076e)) {
                        aVar = aVar3;
                        i11 = i14;
                        i12 = i15;
                        iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
                    } else {
                        i11 = i14;
                        i12 = i15;
                        aVar = aVar3;
                    }
                    m86086i(aVar, canvas, frameIndex);
                    if (!m86089l(i12, listM86076e)) {
                    }
                }
                i11 = i14;
            }
            i14 = i11;
            i15 = i16;
            obj = null;
            z11 = false;
            i13 = 2;
        }
        m86075d(listM86076e);
    }

    /* JADX INFO: renamed from: h */
    public final void m86085h(C38150a.a sprite, Canvas canvas) {
        float[] lineDash;
        String lineJoin;
        String lineCap;
        int fill;
        Matrix matrixM86092o = m86092o(sprite.m86077a().getTransform());
        for (SVGAVideoShapeEntity sVGAVideoShapeEntity : sprite.m86077a().m87097d()) {
            sVGAVideoShapeEntity.m67762a();
            if (sVGAVideoShapeEntity.getShapePath() != null) {
                Paint paintM86100f = this.sharedValues.m86100f();
                paintM86100f.reset();
                paintM86100f.setAntiAlias(getVideoItem().getAntiAlias());
                double d11 = 255;
                paintM86100f.setAlpha((int) (sprite.m86077a().getAlpha() * d11));
                Path pathM86101g = this.sharedValues.m86101g();
                pathM86101g.reset();
                pathM86101g.addPath(this.pathCache.m86093a(sVGAVideoShapeEntity));
                Matrix matrixM86098d = this.sharedValues.m86098d();
                matrixM86098d.reset();
                Matrix matrix = sVGAVideoShapeEntity.getCom.facebook.react.uimanager.ViewProps.TRANSFORM java.lang.String();
                if (matrix != null) {
                    matrixM86098d.postConcat(matrix);
                }
                matrixM86098d.postConcat(matrixM86092o);
                pathM86101g.transform(matrixM86098d);
                SVGAVideoShapeEntity.C27323a styles = sVGAVideoShapeEntity.getStyles();
                if (styles != null && (fill = styles.getFill()) != 0) {
                    paintM86100f.setStyle(Paint.Style.FILL);
                    paintM86100f.setColor(fill);
                    int iMin = Math.min(255, Math.max(0, (int) (sprite.m86077a().getAlpha() * d11)));
                    if (iMin != 255) {
                        paintM86100f.setAlpha(iMin);
                    }
                    if (sprite.m86077a().getMaskPath() != null) {
                        canvas.save();
                    }
                    C38489b maskPath = sprite.m86077a().getMaskPath();
                    if (maskPath != null) {
                        Path pathM86102h = this.sharedValues.m86102h();
                        maskPath.m87087a(pathM86102h);
                        pathM86102h.transform(matrixM86092o);
                        canvas.clipPath(pathM86102h);
                    }
                    canvas.drawPath(pathM86101g, paintM86100f);
                    if (sprite.m86077a().getMaskPath() != null) {
                        canvas.restore();
                    }
                }
                SVGAVideoShapeEntity.C27323a styles2 = sVGAVideoShapeEntity.getStyles();
                if (styles2 != null) {
                    float f11 = 0;
                    if (styles2.getStrokeWidth() > f11) {
                        paintM86100f.setAlpha((int) (sprite.m86077a().getAlpha() * d11));
                        paintM86100f.setStyle(Paint.Style.STROKE);
                        SVGAVideoShapeEntity.C27323a styles3 = sVGAVideoShapeEntity.getStyles();
                        if (styles3 != null) {
                            paintM86100f.setColor(styles3.getStroke());
                            int iMin2 = Math.min(255, Math.max(0, (int) (sprite.m86077a().getAlpha() * d11)));
                            if (iMin2 != 255) {
                                paintM86100f.setAlpha(iMin2);
                            }
                        }
                        float fM86090m = m86090m(matrixM86092o);
                        SVGAVideoShapeEntity.C27323a styles4 = sVGAVideoShapeEntity.getStyles();
                        if (styles4 != null) {
                            paintM86100f.setStrokeWidth(styles4.getStrokeWidth() * fM86090m);
                        }
                        SVGAVideoShapeEntity.C27323a styles5 = sVGAVideoShapeEntity.getStyles();
                        if (styles5 != null && (lineCap = styles5.getLineCap()) != null) {
                            if (StringsKt.equals(lineCap, "butt", true)) {
                                paintM86100f.setStrokeCap(Paint.Cap.BUTT);
                            } else if (StringsKt.equals(lineCap, "round", true)) {
                                paintM86100f.setStrokeCap(Paint.Cap.ROUND);
                            } else if (StringsKt.equals(lineCap, "square", true)) {
                                paintM86100f.setStrokeCap(Paint.Cap.SQUARE);
                            }
                        }
                        SVGAVideoShapeEntity.C27323a styles6 = sVGAVideoShapeEntity.getStyles();
                        if (styles6 != null && (lineJoin = styles6.getLineJoin()) != null) {
                            if (StringsKt.equals(lineJoin, "miter", true)) {
                                paintM86100f.setStrokeJoin(Paint.Join.MITER);
                            } else if (StringsKt.equals(lineJoin, "round", true)) {
                                paintM86100f.setStrokeJoin(Paint.Join.ROUND);
                            } else if (StringsKt.equals(lineJoin, "bevel", true)) {
                                paintM86100f.setStrokeJoin(Paint.Join.BEVEL);
                            }
                        }
                        SVGAVideoShapeEntity.C27323a styles7 = sVGAVideoShapeEntity.getStyles();
                        if (styles7 != null) {
                            paintM86100f.setStrokeMiter(styles7.getMiterLimit() * fM86090m);
                        }
                        SVGAVideoShapeEntity.C27323a styles8 = sVGAVideoShapeEntity.getStyles();
                        if (styles8 != null && (lineDash = styles8.getLineDash()) != null && lineDash.length == 3 && (lineDash[0] > f11 || lineDash[1] > f11)) {
                            float f12 = lineDash[0];
                            if (f12 < 1.0f) {
                                f12 = 1.0f;
                            }
                            float f13 = f12 * fM86090m;
                            float f14 = lineDash[1];
                            if (f14 < 0.1f) {
                                f14 = 0.1f;
                            }
                            paintM86100f.setPathEffect(new DashPathEffect(new float[]{f13, f14 * fM86090m}, lineDash[2] * fM86090m));
                        }
                        if (sprite.m86077a().getMaskPath() != null) {
                            canvas.save();
                        }
                        C38489b maskPath2 = sprite.m86077a().getMaskPath();
                        if (maskPath2 != null) {
                            Path pathM86102h2 = this.sharedValues.m86102h();
                            maskPath2.m87087a(pathM86102h2);
                            pathM86102h2.transform(matrixM86092o);
                            canvas.clipPath(pathM86102h2);
                        }
                        canvas.drawPath(pathM86101g, paintM86100f);
                        if (sprite.m86077a().getMaskPath() != null) {
                            canvas.restore();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m86087j(Canvas canvas, Bitmap drawingBitmap, C38150a.a sprite, Matrix frameMatrix) {
        int i11;
        TextPaint drawingTextPaint;
        if (this.dynamicItem.getIsTextDirty()) {
            this.drawTextCache.clear();
            this.dynamicItem.m67761l(false);
        }
        String str = sprite.get_imageKey();
        if (str != null) {
            String str2 = this.dynamicItem.m67757h().get(str);
            Bitmap bitmapCreateBitmap = null;
            if (str2 != null && (drawingTextPaint = this.dynamicItem.m67758i().get(str)) != null && (bitmapCreateBitmap = this.drawTextCache.get(str)) == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(drawingBitmap.getWidth(), drawingBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Rect rect = new Rect(0, 0, drawingBitmap.getWidth(), drawingBitmap.getHeight());
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                Intrinsics.checkExpressionValueIsNotNull(drawingTextPaint, "drawingTextPaint");
                drawingTextPaint.setAntiAlias(true);
                Paint.FontMetrics fontMetrics = drawingTextPaint.getFontMetrics();
                float f11 = 2;
                canvas2.drawText(str2, rect.centerX(), (rect.centerY() - (fontMetrics.top / f11)) - (fontMetrics.bottom / f11), drawingTextPaint);
                HashMap<String, Bitmap> map = this.drawTextCache;
                if (bitmapCreateBitmap == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
                map.put(str, bitmapCreateBitmap);
            }
            BoringLayout it = this.dynamicItem.m67750a().get(str);
            if (it != null && (bitmapCreateBitmap = this.drawTextCache.get(str)) == null) {
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                TextPaint paint = it.getPaint();
                Intrinsics.checkExpressionValueIsNotNull(paint, "it.paint");
                paint.setAntiAlias(true);
                bitmapCreateBitmap = Bitmap.createBitmap(drawingBitmap.getWidth(), drawingBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                canvas3.translate(0.0f, (drawingBitmap.getHeight() - it.getHeight()) / 2);
                it.draw(canvas3);
                HashMap<String, Bitmap> map2 = this.drawTextCache;
                if (bitmapCreateBitmap == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
                map2.put(str, bitmapCreateBitmap);
            }
            StaticLayout it2 = this.dynamicItem.m67756g().get(str);
            if (it2 != null && (bitmapCreateBitmap = this.drawTextCache.get(str)) == null) {
                Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                TextPaint paint2 = it2.getPaint();
                Intrinsics.checkExpressionValueIsNotNull(paint2, "it.paint");
                paint2.setAntiAlias(true);
                try {
                    Field field = StaticLayout.class.getDeclaredField("mMaximumVisibleLineCount");
                    Intrinsics.checkExpressionValueIsNotNull(field, "field");
                    field.setAccessible(true);
                    i11 = field.getInt(it2);
                } catch (Exception unused) {
                    i11 = Integer.MAX_VALUE;
                }
                StaticLayout layout = StaticLayout.Builder.obtain(it2.getText(), 0, it2.getText().length(), it2.getPaint(), drawingBitmap.getWidth()).setAlignment(it2.getAlignment()).setMaxLines(i11).setEllipsize(TextUtils.TruncateAt.END).build();
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawingBitmap.getWidth(), drawingBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas4 = new Canvas(bitmapCreateBitmap2);
                int height = drawingBitmap.getHeight();
                Intrinsics.checkExpressionValueIsNotNull(layout, "layout");
                canvas4.translate(0.0f, (height - layout.getHeight()) / 2);
                layout.draw(canvas4);
                HashMap<String, Bitmap> map3 = this.drawTextCache;
                if (bitmapCreateBitmap2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
                map3.put(str, bitmapCreateBitmap2);
                bitmapCreateBitmap = bitmapCreateBitmap2;
            }
            if (bitmapCreateBitmap != null) {
                Paint paintM86100f = this.sharedValues.m86100f();
                paintM86100f.setAntiAlias(getVideoItem().getAntiAlias());
                paintM86100f.setAlpha((int) (sprite.m86077a().getAlpha() * ((double) 255)));
                if (sprite.m86077a().getMaskPath() == null) {
                    paintM86100f.setFilterBitmap(getVideoItem().getAntiAlias());
                    canvas.drawBitmap(bitmapCreateBitmap, frameMatrix, paintM86100f);
                    return;
                }
                C38489b maskPath = sprite.m86077a().getMaskPath();
                if (maskPath != null) {
                    canvas.save();
                    canvas.concat(frameMatrix);
                    canvas.clipRect(0, 0, drawingBitmap.getWidth(), drawingBitmap.getHeight());
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    paintM86100f.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                    Path pathM86101g = this.sharedValues.m86101g();
                    maskPath.m87087a(pathM86101g);
                    canvas.drawPath(pathM86101g, paintM86100f);
                    canvas.restore();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m86088k(int spriteIndex, List<C38150a.a> sprites) {
        Boolean bool;
        String str;
        C38150a.a aVar;
        if (this.beginIndexList == null) {
            int size = sprites.size();
            Boolean[] boolArr = new Boolean[size];
            for (int i11 = 0; i11 < size; i11++) {
                boolArr[i11] = Boolean.FALSE;
            }
            int i12 = 0;
            for (Object obj : sprites) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C38150a.a aVar2 = (C38150a.a) obj;
                String str2 = aVar2.get_imageKey();
                if ((str2 == null || !StringsKt.endsWith$default(str2, ".matte", false, 2, (Object) null)) && (str = aVar2.get_matteKey()) != null && str.length() > 0 && (aVar = sprites.get(i12 - 1)) != null) {
                    String str3 = aVar.get_matteKey();
                    if (str3 == null || str3.length() == 0) {
                        boolArr[i12] = Boolean.TRUE;
                    } else if (!Intrinsics.areEqual(aVar.get_matteKey(), aVar2.get_matteKey())) {
                        boolArr[i12] = Boolean.TRUE;
                    }
                }
                i12 = i13;
            }
            this.beginIndexList = boolArr;
        }
        Boolean[] boolArr2 = this.beginIndexList;
        if (boolArr2 == null || (bool = boolArr2[spriteIndex]) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m86089l(int spriteIndex, List<C38150a.a> sprites) {
        Boolean bool;
        String str;
        if (this.endIndexList == null) {
            int size = sprites.size();
            Boolean[] boolArr = new Boolean[size];
            for (int i11 = 0; i11 < size; i11++) {
                boolArr[i11] = Boolean.FALSE;
            }
            int i12 = 0;
            for (Object obj : sprites) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C38150a.a aVar = (C38150a.a) obj;
                String str2 = aVar.get_imageKey();
                if ((str2 == null || !StringsKt.endsWith$default(str2, ".matte", false, 2, (Object) null)) && (str = aVar.get_matteKey()) != null && str.length() > 0) {
                    if (i12 == sprites.size() - 1) {
                        boolArr[i12] = Boolean.TRUE;
                    } else {
                        C38150a.a aVar2 = sprites.get(i13);
                        if (aVar2 != null) {
                            String str3 = aVar2.get_matteKey();
                            if (str3 == null || str3.length() == 0) {
                                boolArr[i12] = Boolean.TRUE;
                            } else if (!Intrinsics.areEqual(aVar2.get_matteKey(), aVar.get_matteKey())) {
                                boolArr[i12] = Boolean.TRUE;
                            }
                        }
                    }
                }
                i12 = i13;
            }
            this.endIndexList = boolArr;
        }
        Boolean[] boolArr2 = this.endIndexList;
        if (boolArr2 == null || (bool = boolArr2[spriteIndex]) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final float m86090m(Matrix matrix) {
        matrix.getValues(this.matrixScaleTempValues);
        float[] fArr = this.matrixScaleTempValues;
        float f11 = fArr[0];
        if (f11 == 0.0f) {
            return 0.0f;
        }
        double d11 = f11;
        double d12 = fArr[3];
        double d13 = fArr[1];
        double d14 = fArr[4];
        if (d11 * d14 == d12 * d13) {
            return 0.0f;
        }
        double dSqrt = Math.sqrt((d11 * d11) + (d12 * d12));
        double d15 = d11 / dSqrt;
        double d16 = d12 / dSqrt;
        double d17 = (d15 * d13) + (d16 * d14);
        double d18 = d13 - (d15 * d17);
        double d19 = d14 - (d17 * d16);
        double dSqrt2 = Math.sqrt((d18 * d18) + (d19 * d19));
        if (d15 * (d19 / dSqrt2) < d16 * (d18 / dSqrt2)) {
            dSqrt = -dSqrt;
        }
        return Math.abs(getScaleInfo().getRatioX() ? (float) dSqrt : (float) dSqrt2);
    }

    /* JADX INFO: renamed from: o */
    public final Matrix m86092o(Matrix transform) {
        Matrix matrixM86097c = this.sharedValues.m86097c();
        matrixM86097c.postScale(getScaleInfo().getScaleFx(), getScaleInfo().getScaleFy());
        matrixM86097c.postTranslate(getScaleInfo().getTranFx(), getScaleInfo().getTranFy());
        matrixM86097c.preConcat(transform);
        return matrixM86097c;
    }

    public C38151b(@NotNull SVGAVideoEntity sVGAVideoEntity, @NotNull C27322e c27322e) {
        super(sVGAVideoEntity);
        this.dynamicItem = c27322e;
        this.sharedValues = new b();
        this.drawTextCache = new HashMap<>();
        this.pathCache = new a();
        this.matrixScaleTempValues = new float[16];
    }

    /* JADX INFO: renamed from: f */
    public final void m86083f(C38150a.a sprite, Canvas canvas, int frameIndex) {
        String str = sprite.get_imageKey();
        if (str != null) {
            Function2<Canvas, Integer, Boolean> function2 = this.dynamicItem.m67751b().get(str);
            if (function2 != null) {
                Matrix matrixM86092o = m86092o(sprite.m86077a().getTransform());
                canvas.save();
                canvas.concat(matrixM86092o);
                function2.invoke(canvas, Integer.valueOf(frameIndex));
                canvas.restore();
            }
            Function4<Canvas, Integer, Integer, Integer, Boolean> function4 = this.dynamicItem.m67752c().get(str);
            if (function4 != null) {
                Matrix matrixM86092o2 = m86092o(sprite.m86077a().getTransform());
                canvas.save();
                canvas.concat(matrixM86092o2);
                function4.invoke(canvas, Integer.valueOf(frameIndex), Integer.valueOf((int) sprite.m86077a().getLayout().getWidth()), Integer.valueOf((int) sprite.m86077a().getLayout().getHeight()));
                canvas.restore();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m86084g(C38150a.a sprite, Canvas canvas) {
        String strSubstring;
        String str = sprite.get_imageKey();
        if (str != null && !Intrinsics.areEqual(this.dynamicItem.m67753d().get(str), Boolean.TRUE)) {
            if (StringsKt.endsWith$default(str, ".matte", false, 2, (Object) null)) {
                strSubstring = str.substring(0, str.length() - 6);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                strSubstring = str;
            }
            Bitmap bitmap = this.dynamicItem.m67755f().get(strSubstring);
            if (bitmap == null) {
                bitmap = getVideoItem().m67726o().get(strSubstring);
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                Matrix matrixM86092o = m86092o(sprite.m86077a().getTransform());
                Paint paintM86100f = this.sharedValues.m86100f();
                paintM86100f.setAntiAlias(getVideoItem().getAntiAlias());
                paintM86100f.setFilterBitmap(getVideoItem().getAntiAlias());
                paintM86100f.setAlpha((int) (sprite.m86077a().getAlpha() * ((double) 255)));
                if (sprite.m86077a().getMaskPath() != null) {
                    C38489b maskPath = sprite.m86077a().getMaskPath();
                    if (maskPath != null) {
                        canvas.save();
                        Path pathM86101g = this.sharedValues.m86101g();
                        maskPath.m87087a(pathM86101g);
                        pathM86101g.transform(matrixM86092o);
                        canvas.clipPath(pathM86101g);
                        matrixM86092o.preScale((float) (sprite.m86077a().getLayout().getWidth() / ((double) bitmap2.getWidth())), (float) (sprite.m86077a().getLayout().getHeight() / ((double) bitmap2.getHeight())));
                        if (!bitmap2.isRecycled()) {
                            canvas.drawBitmap(bitmap2, matrixM86092o, paintM86100f);
                        }
                        canvas.restore();
                    } else {
                        return;
                    }
                } else {
                    matrixM86092o.preScale((float) (sprite.m86077a().getLayout().getWidth() / ((double) bitmap2.getWidth())), (float) (sprite.m86077a().getLayout().getHeight() / ((double) bitmap2.getHeight())));
                    if (!bitmap2.isRecycled()) {
                        canvas.drawBitmap(bitmap2, matrixM86092o, paintM86100f);
                    }
                }
                InterfaceC27318a interfaceC27318a = this.dynamicItem.m67754e().get(str);
                if (interfaceC27318a != null) {
                    float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                    matrixM86092o.getValues(fArr);
                    interfaceC27318a.m67738a(str, (int) fArr[2], (int) fArr[5], (int) ((bitmap2.getWidth() * fArr[0]) + fArr[2]), (int) ((bitmap2.getHeight() * fArr[4]) + fArr[5]));
                }
                m86087j(canvas, bitmap2, sprite, matrixM86092o);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m86086i(C38150a.a sprite, Canvas canvas, int frameIndex) {
        m86084g(sprite, canvas);
        m86085h(sprite, canvas);
        m86083f(sprite, canvas, frameIndex);
    }

    /* JADX INFO: renamed from: n */
    public final void m86091n(int frameIndex) {
        Integer soundID;
        for (C38488a c38488a : getVideoItem().m67723l()) {
            if (c38488a.getStartFrame() == frameIndex) {
                C27326h c27326h = C27326h.f55530e;
                if (c27326h.m67797b()) {
                    Integer soundID2 = c38488a.getSoundID();
                    if (soundID2 != null) {
                        c38488a.m87085e(Integer.valueOf(c27326h.m67799d(soundID2.intValue())));
                    }
                } else {
                    SoundPool soundPool = getVideoItem().getSoundPool();
                    if (soundPool != null && (soundID = c38488a.getSoundID()) != null) {
                        c38488a.m87085e(Integer.valueOf(soundPool.play(soundID.intValue(), 1.0f, 1.0f, 1, 0, 1.0f)));
                    }
                }
            }
            if (c38488a.getEndFrame() <= frameIndex) {
                Integer playID = c38488a.getPlayID();
                if (playID != null) {
                    int iIntValue = playID.intValue();
                    C27326h c27326h2 = C27326h.f55530e;
                    if (c27326h2.m67797b()) {
                        c27326h2.m67800e(iIntValue);
                    } else {
                        SoundPool soundPool2 = getVideoItem().getSoundPool();
                        if (soundPool2 != null) {
                            soundPool2.stop(iIntValue);
                        }
                    }
                }
                c38488a.m87085e(null);
            }
        }
    }
}
