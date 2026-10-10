package ze0;

import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import io.github.crow_misia.libyuv.PlanePrimitive;
import io.github.crow_misia.libyuv.Yuv;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ze0.l */
/* JADX INFO: compiled from: Nv21Buffer.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 '2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0002:\u0001(BE\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006)"}, m90084d2 = {"Lze0/l;", "Lze0/c;", "", "Ljava/nio/ByteBuffer;", "buffer", "Lze0/o;", "planeY", "planeVU", "", "width", "height", "Landroid/graphics/Rect;", "cropRect", "Ljava/lang/Runnable;", "releaseCallback", "<init>", "(Ljava/nio/ByteBuffer;Lze0/o;Lze0/o;IILandroid/graphics/Rect;Ljava/lang/Runnable;)V", "planeIndex", "Lze0/p;", "rowStride", "left", ViewProps.TOP, CmcdData.Factory.STREAMING_FORMAT_SS, "(IIII)I", "Lze0/b;", "dst", "", "g", "(Lze0/b;)V", "f", "Lze0/o;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lze0/o;", "getPlaneVU", "I", "getWidth", "()I", "i", "getHeight", "j", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C46781l extends AbstractC46772c implements InterfaceC46774e {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46784o planeY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AbstractC46784o planeVU;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: ze0.l$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Nv21Buffer.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lze0/l$a;", "Lze0/g;", "Lze0/l;", "", "Lze0/n;", "<init>", "()V", "", "width", "height", "g", "(II)Lze0/n;", "Landroid/graphics/Rect;", "cropRect", "e", "(IILandroid/graphics/Rect;)Lze0/l;", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nNv21Buffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nv21Buffer.kt\nio/github/crow_misia/libyuv/Nv21Buffer$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
    public static final class Companion implements InterfaceC46776g<C46781l> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m103098f(ByteBuffer byteBuffer) {
            Yuv.INSTANCE.freeNativeBuffer(byteBuffer);
        }

        @Override // ze0.InterfaceC46776g
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C46781l mo103068a(int width, int height, @NotNull Rect cropRect) {
            Intrinsics.checkNotNullParameter(cropRect, "cropRect");
            Plane2Capacities plane2CapacitiesM103102g = m103102g(width, height);
            int plane1Capacity = plane2CapacitiesM103102g.getPlane1Capacity();
            int plane2Capacity = plane2CapacitiesM103102g.getPlane2Capacity();
            int plane1Stride = plane2CapacitiesM103102g.getPlane1Stride();
            int plane2Stride = plane2CapacitiesM103102g.getPlane2Stride();
            ByteBuffer[] byteBufferArrM103077a = C46775f.m103077a(CollectionsKt.listOf((Object[]) new C46779j[]{C46779j.m103088a(plane1Capacity), C46779j.m103088a(plane2Capacity)}));
            ByteBuffer byteBuffer = byteBufferArrM103077a[0];
            ByteBuffer byteBuffer2 = byteBufferArrM103077a[1];
            final ByteBuffer byteBuffer3 = byteBufferArrM103077a[2];
            return new C46781l(byteBuffer3, new PlanePrimitive(plane1Stride, byteBuffer, 0, 4, null), new PlanePrimitive(plane2Stride, byteBuffer2, 0, 4, null), width, height, cropRect, new Runnable() { // from class: ze0.k
                @Override // java.lang.Runnable
                public final void run() {
                    C46781l.Companion.m103098f(byteBuffer3);
                }
            }, null);
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public Plane2Capacities m103102g(int width, int height) {
            return new Plane2Capacities(C46779j.m103089b(width * height), C46779j.m103089b(((width + 1) >> 1) * height), C46785p.m103110a(width), C46785p.m103110a(width), null);
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C46781l m103099c(int i11, int i12) {
            return (C46781l) InterfaceC46776g.a.m103080a(this, i11, i12);
        }
    }

    public /* synthetic */ C46781l(ByteBuffer byteBuffer, AbstractC46784o abstractC46784o, AbstractC46784o abstractC46784o2, int i11, int i12, Rect rect, Runnable runnable, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, abstractC46784o, abstractC46784o2, i11, i12, rect, runnable);
    }

    public C46781l(ByteBuffer byteBuffer, AbstractC46784o abstractC46784o, AbstractC46784o abstractC46784o2, int i11, int i12, Rect rect, Runnable runnable) {
        super(byteBuffer, rect, new AbstractC46784o[]{abstractC46784o, abstractC46784o2}, runnable);
        this.planeY = abstractC46784o;
        this.planeVU = abstractC46784o2;
        this.width = i11;
        this.height = i12;
    }

    /* JADX INFO: renamed from: g */
    public final void m103095g(@NotNull C46771b dst) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Pair<Integer, Integer> pairM103082a = C46778i.m103082a(this, dst);
        Yuv.INSTANCE.convertNV21ToABGR(getPlaneY().getBuffer(), getPlaneY().getRowStride(), C46778i.m103087f(this, 0), this.planeVU.getBuffer(), this.planeVU.getRowStride(), C46778i.m103087f(this, 1), dst.getPlane().getBuffer(), dst.getPlane().getRowStride(), C46778i.m103087f(dst, 0), pairM103082a.component1().intValue(), pairM103082a.component2().intValue());
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public AbstractC46784o getPlaneY() {
        return this.planeY;
    }

    @Override // ze0.InterfaceC46774e
    /* JADX INFO: renamed from: s */
    public int mo103065s(int planeIndex, int rowStride, int left, int top) {
        return planeIndex == 0 ? C46785p.m103113d(rowStride, top) + left : C46785p.m103113d(rowStride, top >> 1) + (left & (-2));
    }
}
