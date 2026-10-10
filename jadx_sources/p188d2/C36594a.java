package p188d2;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.InterfaceC5324e;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: d2.a */
/* JADX INFO: compiled from: ByteBufferRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public class C36594a implements InterfaceC5324e<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f79400a;

    /* JADX INFO: renamed from: d2.a$a */
    /* JADX INFO: compiled from: ByteBufferRewinder.java */
    public static class a implements InterfaceC5324e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo6663a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5324e<ByteBuffer> mo6664b(ByteBuffer byteBuffer) {
            return new C36594a(byteBuffer);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5324e
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo6660a() {
        this.f79400a.position(0);
        return this.f79400a;
    }

    public C36594a(ByteBuffer byteBuffer) {
        this.f79400a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5324e
    /* JADX INFO: renamed from: b */
    public void mo6661b() {
    }
}
