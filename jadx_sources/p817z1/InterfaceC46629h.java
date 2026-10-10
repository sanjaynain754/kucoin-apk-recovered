package p817z1;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: z1.h */
/* JADX INFO: compiled from: Headers.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC46629h {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final InterfaceC46629h f104406a = new a();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC46629h f104407b = new C46631j.a().m102834c();

    /* JADX INFO: renamed from: z1.h$a */
    /* JADX INFO: compiled from: Headers.java */
    public class a implements InterfaceC46629h {
        @Override // p817z1.InterfaceC46629h
        public Map<String, String> getHeaders() {
            return Collections.EMPTY_MAP;
        }
    }

    Map<String, String> getHeaders();
}
