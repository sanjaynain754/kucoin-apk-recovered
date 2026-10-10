package p819z3;

import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: z3.b */
/* JADX INFO: compiled from: DecodeBufferHelper.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46673b implements Pools.Pool<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public static final C46673b f104505a = new C46673b();

    /* JADX INFO: renamed from: b */
    public static int f104506b = 16384;

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<ByteBuffer> f104507c = new a();

    @Override // androidx.core.util.Pools.Pool
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean release(ByteBuffer byteBuffer) {
        return true;
    }

    /* JADX INFO: renamed from: z3.b$a */
    /* JADX INFO: compiled from: DecodeBufferHelper.java */
    public class a extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(C46673b.f104506b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m102893c() {
        return f104506b;
    }

    @Override // androidx.core.util.Pools.Pool
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer acquire() {
        return f104507c.get();
    }
}
