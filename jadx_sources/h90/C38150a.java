package h90;

import android.graphics.Canvas;
import android.widget.ImageView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.opensource.svgaplayer.SVGAVideoEntity;
import i90.C38493f;
import i90.C38494g;
import j90.C40352a;
import j90.C40357f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: h90.a */
/* JADX INFO: compiled from: SGVADrawer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\f\u0012\b\u0012\u00060\tR\u00020\u00000\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\tR\u00020\u00000\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u00060\tR\u00020\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m90084d2 = {"Lh90/a;", "", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "<init>", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V", "", "frameIndex", "", "Lh90/a$a;", "e", "(I)Ljava/util/List;", "sprites", "", "d", "(Ljava/util/List;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/widget/ImageView$ScaleType;", "scaleType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/Canvas;ILandroid/widget/ImageView$ScaleType;)V", "Lj90/f;", "Lj90/f;", "b", "()Lj90/f;", "scaleInfo", "Lj90/a;", "Lj90/a;", "spritePool", "c", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "()Lcom/opensource/svgaplayer/SVGAVideoEntity;", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public class C38150a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C40357f scaleInfo = new C40357f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C40352a<a> spritePool;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SVGAVideoEntity videoItem;

    /* JADX INFO: renamed from: h90.a$a */
    /* JADX INFO: compiled from: SGVADrawer.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0004\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u001b"}, m90084d2 = {"Lh90/a$a;", "", "", "_matteKey", "_imageKey", "Li90/g;", "_frameEntity", "<init>", "(Lh90/a;Ljava/lang/String;Ljava/lang/String;Li90/g;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "get_matteKey", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "b", "get_imageKey", "e", "c", "Li90/g;", "get_frameEntity", "()Li90/g;", "d", "(Li90/g;)V", "matteKey", "imageKey", "frameEntity", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String _matteKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String _imageKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public C38494g _frameEntity;

        public a(@Nullable String str, @Nullable String str2, C38494g c38494g) {
            this._matteKey = str;
            this._imageKey = str2;
            this._frameEntity = c38494g;
        }

        public /* synthetic */ a(C38150a c38150a, String str, String str2, C38494g c38494g, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : c38494g);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C38494g m86077a() {
            C38494g c38494g = this._frameEntity;
            if (c38494g == null) {
                Intrinsics.throwNpe();
            }
            return c38494g;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String get_imageKey() {
            return this._imageKey;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String get_matteKey() {
            return this._matteKey;
        }

        /* JADX INFO: renamed from: d */
        public final void m86080d(@Nullable C38494g c38494g) {
            this._frameEntity = c38494g;
        }

        /* JADX INFO: renamed from: e */
        public final void m86081e(@Nullable String str) {
            this._imageKey = str;
        }

        /* JADX INFO: renamed from: f */
        public final void m86082f(@Nullable String str) {
            this._matteKey = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo86072a(@NotNull Canvas canvas, int frameIndex, @NotNull ImageView.ScaleType scaleType) {
        this.scaleInfo.m88938f(canvas.getWidth(), canvas.getHeight(), (float) this.videoItem.getVideoSize().getWidth(), (float) this.videoItem.getVideoSize().getHeight(), scaleType);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C40357f getScaleInfo() {
        return this.scaleInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SVGAVideoEntity getVideoItem() {
        return this.videoItem;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<a> m86076e(int frameIndex) {
        String strM87092b;
        List<C38493f> listM67728q = this.videoItem.m67728q();
        ArrayList arrayList = new ArrayList();
        for (C38493f c38493f : listM67728q) {
            a aVarM88926a = null;
            if (frameIndex >= 0 && frameIndex < c38493f.m87091a().size() && (strM87092b = c38493f.getImageKey()) != null && (StringsKt.endsWith$default(strM87092b, ".matte", false, 2, (Object) null) || c38493f.m87091a().get(frameIndex).getAlpha() > 0.0d)) {
                aVarM88926a = this.spritePool.m88926a();
                if (aVarM88926a == null) {
                    aVarM88926a = new a(this, null, null, null, 7, null);
                }
                aVarM88926a.m86082f(c38493f.getMatteKey());
                aVarM88926a.m86081e(c38493f.getImageKey());
                aVarM88926a.m86080d(c38493f.m87091a().get(frameIndex));
            }
            if (aVarM88926a != null) {
                arrayList.add(aVarM88926a);
            }
        }
        return arrayList;
    }

    public C38150a(@NotNull SVGAVideoEntity sVGAVideoEntity) {
        this.videoItem = sVGAVideoEntity;
        this.spritePool = new C40352a<>(Math.max(1, sVGAVideoEntity.m67728q().size()));
    }

    /* JADX INFO: renamed from: d */
    public final void m86075d(@NotNull List<a> sprites) {
        Iterator<T> it = sprites.iterator();
        while (it.hasNext()) {
            this.spritePool.m88928c((a) it.next());
        }
    }
}
