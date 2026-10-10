package cf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ih0.AbstractC38637s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: cf0.k */
/* JADX INFO: compiled from: MarkwonSpansFactoryImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4956k implements InterfaceC4955j {

    /* JADX INFO: renamed from: a */
    public final Map<Class<? extends AbstractC38637s>, InterfaceC4964s> f5526a;

    /* JADX INFO: renamed from: cf0.k$a */
    /* JADX INFO: compiled from: MarkwonSpansFactoryImpl.java */
    public static class a implements InterfaceC4955j.a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<? extends AbstractC38637s>, InterfaceC4964s> f5527a = new HashMap(3);

        @Override // cf0.InterfaceC4955j.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public <N extends AbstractC38637s> InterfaceC4955j.a mo5195a(@NonNull Class<N> cls, @Nullable InterfaceC4964s interfaceC4964s) {
            if (interfaceC4964s == null) {
                this.f5527a.remove(cls);
                return this;
            }
            this.f5527a.put(cls, interfaceC4964s);
            return this;
        }

        @Override // cf0.InterfaceC4955j.a
        @NonNull
        public InterfaceC4955j build() {
            return new C4956k(Collections.unmodifiableMap(this.f5527a));
        }
    }

    @Override // cf0.InterfaceC4955j
    @Nullable
    public <N extends AbstractC38637s> InterfaceC4964s get(@NonNull Class<N> cls) {
        return this.f5526a.get(cls);
    }

    public C4956k(@NonNull Map<Class<? extends AbstractC38637s>, InterfaceC4964s> map) {
        this.f5526a = map;
    }
}
