package p684v5;

import java.util.Collections;
import java.util.List;
import p712w3.C45708h;
import p749x5.C46079m;
import p749x5.InterfaceC46080n;

/* JADX INFO: renamed from: v5.g */
/* JADX INFO: compiled from: SimpleProgressiveJpegConfig.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45426g implements InterfaceC45424e {

    /* JADX INFO: renamed from: a */
    public final b f102463a;

    /* JADX INFO: renamed from: v5.g$a */
    /* JADX INFO: compiled from: SimpleProgressiveJpegConfig.java */
    public static class a implements b {
        @Override // p684v5.C45426g.b
        /* JADX INFO: renamed from: b */
        public int mo100398b() {
            return 0;
        }

        public a() {
        }

        @Override // p684v5.C45426g.b
        /* JADX INFO: renamed from: a */
        public List<Integer> mo100397a() {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: v5.g$b */
    /* JADX INFO: compiled from: SimpleProgressiveJpegConfig.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        List<Integer> mo100397a();

        /* JADX INFO: renamed from: b */
        int mo100398b();
    }

    public C45426g() {
        this(new a());
    }

    @Override // p684v5.InterfaceC45424e
    /* JADX INFO: renamed from: c */
    public boolean mo100389c() {
        return true;
    }

    public C45426g(b bVar) {
        this.f102463a = (b) C45708h.m100896g(bVar);
    }

    @Override // p684v5.InterfaceC45424e
    /* JADX INFO: renamed from: a */
    public int mo100387a(int i11) {
        List<Integer> listMo100397a = this.f102463a.mo100397a();
        if (listMo100397a == null || listMo100397a.isEmpty()) {
            return i11 + 1;
        }
        for (int i12 = 0; i12 < listMo100397a.size(); i12++) {
            if (listMo100397a.get(i12).intValue() > i11) {
                return listMo100397a.get(i12).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // p684v5.InterfaceC45424e
    /* JADX INFO: renamed from: b */
    public InterfaceC46080n mo100388b(int i11) {
        return C46079m.m101588d(i11, i11 >= this.f102463a.mo100398b(), false);
    }
}
