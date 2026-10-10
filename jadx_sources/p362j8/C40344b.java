package p362j8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.penfeizhou.animation.apng.decode.APNGParser;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import com.github.penfeizhou.animation.gif.decode.GifParser;
import com.github.penfeizhou.animation.p065io.C6952a;
import com.github.penfeizhou.animation.webp.decode.WebPParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import p010a8.C0191b;
import p194d8.C36639a;
import p194d8.C36641c;
import p304h8.C38144f;
import p396k8.AbstractC40938a;
import p451m8.C42485l;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: j8.b */
/* JADX INFO: compiled from: ByteBufferAnimationDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C40344b implements InterfaceC44614f<ByteBuffer, FrameSeqDecoder> {

    /* JADX INFO: renamed from: j8.b$a */
    /* JADX INFO: compiled from: ByteBufferAnimationDecoder.java */
    public class a extends AbstractC40938a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteBuffer f89607a;

        public a(ByteBuffer byteBuffer) {
            this.f89607a = byteBuffer;
        }

        @Override // p396k8.AbstractC40938a
        /* JADX INFO: renamed from: b */
        public ByteBuffer mo88920b() {
            this.f89607a.position(0);
            return this.f89607a;
        }
    }

    /* JADX INFO: renamed from: j8.b$b */
    /* JADX INFO: compiled from: ByteBufferAnimationDecoder.java */
    public static class b implements InterfaceC45359j<FrameSeqDecoder> {

        /* JADX INFO: renamed from: b */
        public final FrameSeqDecoder f89609b;

        /* JADX INFO: renamed from: c */
        public final int f89610c;

        @Override // p680v1.InterfaceC45359j
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<FrameSeqDecoder> mo4266a() {
            return FrameSeqDecoder.class;
        }

        @Override // p680v1.InterfaceC45359j
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FrameSeqDecoder get() {
            return this.f89609b;
        }

        @Override // p680v1.InterfaceC45359j
        public int getSize() {
            return this.f89610c;
        }

        @Override // p680v1.InterfaceC45359j
        public void recycle() {
            this.f89609b.m12776R();
        }

        public b(FrameSeqDecoder frameSeqDecoder, int i11) {
            this.f89609b = frameSeqDecoder;
            this.f89610c = i11;
        }
    }

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<FrameSeqDecoder> mo4261a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull C44613e c44613e) throws IOException {
        FrameSeqDecoder c36639a;
        a aVar = new a(byteBuffer);
        if (WebPParser.m12803a(new C6952a(byteBuffer))) {
            c36639a = new C42485l(aVar, null);
        } else if (APNGParser.m12746a(new C6952a(byteBuffer))) {
            c36639a = new C0191b(aVar, null);
        } else if (GifParser.m12792b(new C6952a(byteBuffer))) {
            c36639a = new C38144f(aVar, null);
        } else {
            if (!C36641c.m81978a(new C6952a(byteBuffer))) {
                return null;
            }
            c36639a = new C36639a(aVar, null);
        }
        return new b(c36639a, byteBuffer.limit());
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull ByteBuffer byteBuffer, @NonNull C44613e c44613e) {
        if (!((Boolean) c44613e.m98732c(C40343a.f89603b)).booleanValue() && WebPParser.m12803a(new C6952a(byteBuffer))) {
            return true;
        }
        if (!((Boolean) c44613e.m98732c(C40343a.f89604c)).booleanValue() && APNGParser.m12746a(new C6952a(byteBuffer))) {
            return true;
        }
        if (((Boolean) c44613e.m98732c(C40343a.f89602a)).booleanValue() || !GifParser.m12792b(new C6952a(byteBuffer))) {
            return !((Boolean) c44613e.m98732c(C40343a.f89606e)).booleanValue() && C36641c.m81978a(new C6952a(byteBuffer));
        }
        return true;
    }
}
