package p817z1;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p485o2.C42950d;
import p523p2.C43354a;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.d */
/* JADX INFO: compiled from: ByteBufferFileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46625d implements InterfaceC46635n<File, ByteBuffer> {

    /* JADX INFO: renamed from: z1.d$a */
    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static final class a implements InterfaceC5323d<ByteBuffer> {

        /* JADX INFO: renamed from: b */
        public final File f104387b;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo23a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo6674e(C43354a.m95476a(this.f104387b));
            } catch (IOException e11) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e11);
                }
                aVar.mo6675f(e11);
            }
        }

        public a(File file) {
            this.f104387b = file;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
        }
    }

    /* JADX INFO: renamed from: z1.d$b */
    /* JADX INFO: compiled from: ByteBufferFileLoader.java */
    public static class b implements InterfaceC46636o<File, ByteBuffer> {
        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<File, ByteBuffer> mo14a(@NonNull C46639r c46639r) {
            return new C46625d();
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull File file) {
        return true;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<ByteBuffer> mo10a(@NonNull File file, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(file), new a(file));
    }
}
