package p817z1;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p485o2.C42950d;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.e */
/* JADX INFO: compiled from: DataUrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C46626e<Model, Data> implements InterfaceC46635n<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final a<Data> f104388a;

    /* JADX INFO: renamed from: z1.e$a */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    public interface a<Data> {
        /* JADX INFO: renamed from: a */
        Class<Data> mo102808a();

        /* JADX INFO: renamed from: b */
        void mo102809b(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;
    }

    /* JADX INFO: renamed from: z1.e$b */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class b<Data> implements InterfaceC5323d<Data> {

        /* JADX INFO: renamed from: b */
        public final String f104389b;

        /* JADX INFO: renamed from: c */
        public final a<Data> f104390c;

        /* JADX INFO: renamed from: d */
        public Data f104391d;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo23a() {
            return this.f104390c.mo102808a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
            try {
                this.f104390c.mo102809b(this.f104391d);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super Data> aVar) {
            try {
                Data dataDecode = this.f104390c.decode(this.f104389b);
                this.f104391d = dataDecode;
                aVar.mo6674e(dataDecode);
            } catch (IllegalArgumentException e11) {
                aVar.mo6675f(e11);
            }
        }

        public b(String str, a<Data> aVar) {
            this.f104389b = str;
            this.f104390c = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
        }
    }

    /* JADX INFO: renamed from: z1.e$c */
    /* JADX INFO: compiled from: DataUrlLoader.java */
    public static final class c<Model> implements InterfaceC46636o<Model, InputStream> {

        /* JADX INFO: renamed from: a */
        public final a<InputStream> f104392a = new a();

        /* JADX INFO: renamed from: z1.e$c$a */
        /* JADX INFO: compiled from: DataUrlLoader.java */
        public class a implements a<InputStream> {
            public a() {
            }

            @Override // p817z1.C46626e.a
            /* JADX INFO: renamed from: a */
            public Class<InputStream> mo102808a() {
                return InputStream.class;
            }

            @Override // p817z1.C46626e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // p817z1.C46626e.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void mo102809b(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Model, InputStream> mo14a(@NonNull C46639r c46639r) {
            return new C46626e(this.f104392a);
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: a */
    public InterfaceC46635n.a<Data> mo10a(@NonNull Model model, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(model), new b(model.toString(), this.f104388a));
    }

    public C46626e(a<Data> aVar) {
        this.f104388a = aVar;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: b */
    public boolean mo11b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }
}
