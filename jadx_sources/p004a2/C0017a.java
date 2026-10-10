package p004a2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.bumptech.glide.load.data.C5329j;
import java.io.InputStream;
import p628t1.C44612d;
import p628t1.C44613e;
import p817z1.C46628g;
import p817z1.C46634m;
import p817z1.C46639r;
import p817z1.InterfaceC46635n;
import p817z1.InterfaceC46636o;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: compiled from: HttpGlideUrlLoader.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0017a implements InterfaceC46635n<C46628g, InputStream> {

    /* JADX INFO: renamed from: b */
    public static final C44612d<Integer> f25b = C44612d.m98727f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C46634m<C46628g, C46628g> f26a;

    /* JADX INFO: renamed from: a2.a$a */
    /* JADX INFO: compiled from: HttpGlideUrlLoader.java */
    /* JADX INFO: loaded from: classes.dex */
    public static class a implements InterfaceC46636o<C46628g, InputStream> {

        /* JADX INFO: renamed from: a */
        public final C46634m<C46628g, C46628g> f27a = new C46634m<>(500);

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<C46628g, InputStream> mo14a(C46639r c46639r) {
            return new C0017a(this.f27a);
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull C46628g c46628g) {
        return true;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<InputStream> mo10a(@NonNull C46628g c46628g, int i11, int i12, @NonNull C44613e c44613e) {
        C46634m<C46628g, C46628g> c46634m = this.f26a;
        if (c46634m != null) {
            C46628g c46628gM102842a = c46634m.m102842a(c46628g, 0, 0);
            if (c46628gM102842a == null) {
                this.f26a.m102843b(c46628g, 0, 0, c46628g);
            } else {
                c46628g = c46628gM102842a;
            }
        }
        return new InterfaceC46635n.a<>(c46628g, new C5329j(c46628g, ((Integer) c44613e.m98732c(f25b)).intValue()));
    }

    public C0017a(@Nullable C46634m<C46628g, C46628g> c46634m) {
        this.f26a = c46634m;
    }
}
