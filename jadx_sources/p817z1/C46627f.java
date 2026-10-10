package p817z1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p485o2.C42950d;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.f */
/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46627f<Data> implements InterfaceC46635n<File, Data> {

    /* JADX INFO: renamed from: a */
    public final d<Data> f104394a;

    /* JADX INFO: renamed from: z1.f$a */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class a<Data> implements InterfaceC46636o<File, Data> {

        /* JADX INFO: renamed from: a */
        public final d<Data> f104395a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC46635n<File, Data> mo14a(@NonNull C46639r c46639r) {
            return new C46627f(this.f104395a);
        }

        public a(d<Data> dVar) {
            this.f104395a = dVar;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public final void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.f$b */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: z1.f$b$a */
        /* JADX INFO: compiled from: FileLoader.java */
        public class a implements d<ParcelFileDescriptor> {
            @Override // p817z1.C46627f.d
            /* JADX INFO: renamed from: a */
            public Class<ParcelFileDescriptor> mo102814a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p817z1.C46627f.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo102816c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // p817z1.C46627f.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo102815b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: renamed from: z1.f$c */
    /* JADX INFO: compiled from: FileLoader.java */
    public static final class c<Data> implements InterfaceC5323d<Data> {

        /* JADX INFO: renamed from: b */
        public final File f104396b;

        /* JADX INFO: renamed from: c */
        public final d<Data> f104397c;

        /* JADX INFO: renamed from: d */
        public Data f104398d;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo23a() {
            return this.f104397c.mo102814a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
            Data data = this.f104398d;
            if (data != null) {
                try {
                    this.f104397c.mo102815b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super Data> aVar) {
            try {
                Data dataMo102816c = this.f104397c.mo102816c(this.f104396b);
                this.f104398d = dataMo102816c;
                aVar.mo6674e(dataMo102816c);
            } catch (FileNotFoundException e11) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e11);
                }
                aVar.mo6675f(e11);
            }
        }

        public c(File file, d<Data> dVar) {
            this.f104396b = file;
            this.f104397c = dVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
        }
    }

    /* JADX INFO: renamed from: z1.f$d */
    /* JADX INFO: compiled from: FileLoader.java */
    public interface d<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo102814a();

        /* JADX INFO: renamed from: b */
        void mo102815b(Data data) throws IOException;

        /* JADX INFO: renamed from: c */
        Data mo102816c(File file) throws FileNotFoundException;
    }

    /* JADX INFO: renamed from: z1.f$e */
    /* JADX INFO: compiled from: FileLoader.java */
    public static class e extends a<InputStream> {

        /* JADX INFO: renamed from: z1.f$e$a */
        /* JADX INFO: compiled from: FileLoader.java */
        public class a implements d<InputStream> {
            @Override // p817z1.C46627f.d
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo102814a() {
                return InputStream.class;
            }

            @Override // p817z1.C46627f.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream mo102816c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // p817z1.C46627f.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo102815b(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull File file) {
        return true;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<Data> mo10a(@NonNull File file, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(file), new c(file, this.f104394a));
    }

    public C46627f(d<Data> dVar) {
        this.f104394a = dVar;
    }
}
