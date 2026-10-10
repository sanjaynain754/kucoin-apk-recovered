package ze0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import io.github.crow_misia.libyuv.FilterMode;
import io.github.crow_misia.libyuv.PlanePrimitive;
import io.github.crow_misia.libyuv.RotateMode;
import io.github.crow_misia.libyuv.Yuv;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ze0.b */
/* JADX INFO: compiled from: AbgrBuffer.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 $2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u0002:\u0001%B=\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006&"}, m90084d2 = {"Lze0/b;", "Lze0/c;", "", "Lze0/d;", "Ljava/nio/ByteBuffer;", "buffer", "Lze0/o;", "plane", "", "width", "height", "Landroid/graphics/Rect;", "cropRect", "Ljava/lang/Runnable;", "releaseCallback", "<init>", "(Ljava/nio/ByteBuffer;Lze0/o;IILandroid/graphics/Rect;Ljava/lang/Runnable;)V", "planeIndex", "Lze0/p;", "rowStride", "left", ViewProps.TOP, CmcdData.Factory.STREAMING_FORMAT_SS, "(IIII)I", "Landroid/graphics/Bitmap;", "g", "()Landroid/graphics/Bitmap;", "f", "Lze0/o;", "r", "()Lze0/o;", "I", "getWidth", "()I", CmcdData.Factory.STREAMING_FORMAT_HLS, "getHeight", "i", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C46771b extends AbstractC46772c implements InterfaceC46773d<C46771b>, InterfaceC46774e {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46784o plane;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: ze0.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AbgrBuffer.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lze0/b$a;", "Lze0/h;", "Lze0/b;", "", "Lze0/m;", "<init>", "()V", "", "width", "height", "g", "(II)Lze0/m;", "Landroid/graphics/Rect;", "cropRect", "d", "(IILandroid/graphics/Rect;)Lze0/b;", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAbgrBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbgrBuffer.kt\nio/github/crow_misia/libyuv/AbgrBuffer$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
    public static final class Companion implements InterfaceC46777h<C46771b> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: f */
        public static final void m103067f(ByteBuffer byteBuffer) {
            Yuv.INSTANCE.freeNativeBuffer(byteBuffer);
        }

        @Override // ze0.InterfaceC46776g
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C46771b mo103068a(int width, int height, @NotNull Rect cropRect) {
            Intrinsics.checkNotNullParameter(cropRect, "cropRect");
            Plane1Capacities plane1CapacitiesM103072g = m103072g(width, height);
            int planeCapacity = plane1CapacitiesM103072g.getPlaneCapacity();
            int planeStride = plane1CapacitiesM103072g.getPlaneStride();
            final ByteBuffer byteBuffer = C46775f.m103077a(CollectionsKt.listOf(C46779j.m103088a(planeCapacity)))[0];
            return new C46771b(byteBuffer, new PlanePrimitive(planeStride, byteBuffer, 0, 4, null), width, height, cropRect, new Runnable() { // from class: ze0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C46771b.Companion.m103067f(byteBuffer);
                }
            }, null);
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public Plane1Capacities m103072g(int width, int height) {
            int i11 = width << 2;
            return new Plane1Capacities(C46779j.m103089b(i11 * height), C46785p.m103110a(i11), null);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C46771b m103071e(int i11, int i12) {
            return (C46771b) InterfaceC46777h.a.m103081a(this, i11, i12);
        }
    }

    public /* synthetic */ C46771b(ByteBuffer byteBuffer, AbstractC46784o abstractC46784o, int i11, int i12, Rect rect, Runnable runnable, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, abstractC46784o, i11, i12, rect, runnable);
    }

    public C46771b(ByteBuffer byteBuffer, AbstractC46784o abstractC46784o, int i11, int i12, Rect rect, Runnable runnable) {
        super(byteBuffer, rect, new AbstractC46784o[]{abstractC46784o}, runnable);
        this.plane = abstractC46784o;
        this.width = i11;
        this.height = i12;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // ze0.InterfaceC46773d
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public AbstractC46784o getPlane() {
        return this.plane;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public Bitmap m103059g() {
        return C46775f.m103079c(m103073a(), getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m103061i(@NotNull C46771b c46771b, @NotNull RotateMode rotateMode) {
        InterfaceC46773d.a.m103075a(this, c46771b, rotateMode);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m103063k(@NotNull C46771b c46771b, @NotNull FilterMode filterMode) {
        InterfaceC46773d.a.m103076b(this, c46771b, filterMode);
    }

    @Override // ze0.InterfaceC46774e
    /* JADX INFO: renamed from: s */
    public int mo103065s(int planeIndex, int rowStride, int left, int top) {
        return C46785p.m103113d(rowStride, top) + (left << 2);
    }
}
