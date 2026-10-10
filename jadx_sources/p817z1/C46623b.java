package p817z1;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p485o2.C42950d;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.b */
/* JADX INFO: compiled from: ByteArrayLoader.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46623b<Data> implements InterfaceC46635n<byte[], Data> {

    /* JADX INFO: renamed from: a */
    public final b<Data> f104382a;

    /* JADX INFO: renamed from: z1.b$a */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    /* JADX INFO: loaded from: classes.dex */
    public static class a implements InterfaceC46636o<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: z1.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        /* JADX INFO: loaded from: classes34.dex */
        public class C47039a implements b<ByteBuffer> {
            public C47039a() {
            }

            @Override // p817z1.C46623b.b
            /* JADX INFO: renamed from: a */
            public Class<ByteBuffer> mo102801a() {
                return ByteBuffer.class;
            }

            @Override // p817z1.C46623b.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer mo102802b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<byte[], ByteBuffer> mo14a(@NonNull C46639r c46639r) {
            return new C46623b(new C47039a());
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.b$b */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public interface b<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo102801a();

        /* JADX INFO: renamed from: b */
        Data mo102802b(byte[] bArr);
    }

    /* JADX INFO: renamed from: z1.b$c */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    public static class c<Data> implements InterfaceC5323d<Data> {

        /* JADX INFO: renamed from: b */
        public final byte[] f104384b;

        /* JADX INFO: renamed from: c */
        public final b<Data> f104385c;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo23a() {
            return this.f104385c.mo102801a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super Data> aVar) {
            aVar.mo6674e(this.f104385c.mo102802b(this.f104384b));
        }

        public c(byte[] bArr, b<Data> bVar) {
            this.f104384b = bArr;
            this.f104385c = bVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
        }
    }

    /* JADX INFO: renamed from: z1.b$d */
    /* JADX INFO: compiled from: ByteArrayLoader.java */
    /* JADX INFO: loaded from: classes.dex */
    public static class d implements InterfaceC46636o<byte[], InputStream> {

        /* JADX INFO: renamed from: z1.b$d$a */
        /* JADX INFO: compiled from: ByteArrayLoader.java */
        /* JADX INFO: loaded from: classes34.dex */
        public class a implements b<InputStream> {
            public a() {
            }

            @Override // p817z1.C46623b.b
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo102801a() {
                return InputStream.class;
            }

            @Override // p817z1.C46623b.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream mo102802b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<byte[], InputStream> mo14a(@NonNull C46639r c46639r) {
            return new C46623b(new a());
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull byte[] bArr) {
        return true;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<Data> mo10a(@NonNull byte[] bArr, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(bArr), new c(bArr, this.f104382a));
    }

    public C46623b(b<Data> bVar) {
        this.f104382a = bVar;
    }
}
