package gf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gf0.g */
/* JADX INFO: compiled from: HtmlTagImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC37909g implements InterfaceC37908f {

    /* JADX INFO: renamed from: a */
    public final String f85296a;

    /* JADX INFO: renamed from: b */
    public final int f85297b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f85298c;

    /* JADX INFO: renamed from: d */
    public int f85299d = -1;

    /* JADX INFO: renamed from: gf0.g$a */
    /* JADX INFO: compiled from: HtmlTagImpl.java */
    public static class a extends AbstractC37909g implements InterfaceC37908f.a {

        /* JADX INFO: renamed from: e */
        public final a f85300e;

        /* JADX INFO: renamed from: f */
        public List<a> f85301f;

        @Override // gf0.InterfaceC37908f
        /* JADX INFO: renamed from: e */
        public boolean mo85698e() {
            return true;
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public static a m85702i(@NonNull String str, int i11, @NonNull Map<String, String> map, @Nullable a aVar) {
            return new a(str, i11, map, aVar);
        }

        @NonNull
        /* JADX INFO: renamed from: j */
        public static a m85703j() {
            return new a("", 0, Collections.EMPTY_MAP, null);
        }

        @Override // gf0.AbstractC37909g, gf0.InterfaceC37908f
        @NonNull
        /* JADX INFO: renamed from: b */
        public Map<String, String> mo85696b() {
            return this.f85298c;
        }

        @Override // gf0.InterfaceC37908f.a
        @Nullable
        /* JADX INFO: renamed from: d */
        public InterfaceC37908f.a mo85699d() {
            return this.f85300e;
        }

        @Override // gf0.InterfaceC37908f.a
        @NonNull
        /* JADX INFO: renamed from: f */
        public List<InterfaceC37908f.a> mo85700f() {
            List<a> list = this.f85301f;
            return list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BlockImpl{name='");
            sb2.append(this.f85296a);
            sb2.append('\'');
            sb2.append(", start=");
            sb2.append(this.f85297b);
            sb2.append(", end=");
            sb2.append(this.f85299d);
            sb2.append(", attributes=");
            sb2.append(this.f85298c);
            sb2.append(", parent=");
            a aVar = this.f85300e;
            sb2.append(aVar != null ? aVar.f85296a : null);
            sb2.append(", children=");
            sb2.append(this.f85301f);
            sb2.append('}');
            return sb2.toString();
        }

        public a(@NonNull String str, int i11, @NonNull Map<String, String> map, @Nullable a aVar) {
            super(str, i11, map);
            this.f85300e = aVar;
        }

        /* JADX INFO: renamed from: h */
        public void m85704h(int i11) {
            if (!isClosed()) {
                this.f85299d = i11;
                List<a> list = this.f85301f;
                if (list != null) {
                    Iterator<a> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().m85704h(i11);
                    }
                }
            }
        }

        @Override // gf0.InterfaceC37908f
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC37908f.a mo85695a() {
            return this;
        }
    }

    /* JADX INFO: renamed from: gf0.g$b */
    /* JADX INFO: compiled from: HtmlTagImpl.java */
    public static class b extends AbstractC37909g implements InterfaceC37908f.b {
        @Override // gf0.InterfaceC37908f
        /* JADX INFO: renamed from: e */
        public boolean mo85698e() {
            return false;
        }

        @Override // gf0.InterfaceC37908f
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC37908f.a mo85695a() {
            throw new ClassCastException("Cannot cast Inline instance to Block");
        }

        public String toString() {
            return "InlineImpl{name='" + this.f85296a + "', start=" + this.f85297b + ", end=" + this.f85299d + ", attributes=" + this.f85298c + '}';
        }

        public b(@NonNull String str, int i11, @NonNull Map<String, String> map) {
            super(str, i11, map);
        }

        /* JADX INFO: renamed from: h */
        public void m85705h(int i11) {
            if (!isClosed()) {
                this.f85299d = i11;
            }
        }
    }

    @Override // gf0.InterfaceC37908f
    @NonNull
    /* JADX INFO: renamed from: b */
    public Map<String, String> mo85696b() {
        return this.f85298c;
    }

    @Override // gf0.InterfaceC37908f
    /* JADX INFO: renamed from: c */
    public int mo85697c() {
        return this.f85299d;
    }

    /* JADX INFO: renamed from: g */
    public boolean m85701g() {
        return this.f85297b == this.f85299d;
    }

    @Override // gf0.InterfaceC37908f
    public boolean isClosed() {
        return this.f85299d > -1;
    }

    @Override // gf0.InterfaceC37908f
    @NonNull
    public String name() {
        return this.f85296a;
    }

    @Override // gf0.InterfaceC37908f
    public int start() {
        return this.f85297b;
    }

    public AbstractC37909g(@NonNull String str, int i11, @NonNull Map<String, String> map) {
        this.f85296a = str;
        this.f85297b = i11;
        this.f85298c = map;
    }
}
