package cf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: cf0.r */
/* JADX INFO: compiled from: RenderPropsImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4963r implements InterfaceC4962q {

    /* JADX INFO: renamed from: a */
    public final Map<C4960o, Object> f5541a = new HashMap(3);

    @Override // cf0.InterfaceC4962q
    /* JADX INFO: renamed from: a */
    public <T> void mo5244a(@NonNull C4960o<T> c4960o, @Nullable T t11) {
        if (t11 == null) {
            this.f5541a.remove(c4960o);
        } else {
            this.f5541a.put(c4960o, t11);
        }
    }

    @Override // cf0.InterfaceC4962q
    @Nullable
    /* JADX INFO: renamed from: b */
    public <T> T mo5245b(@NonNull C4960o<T> c4960o) {
        return (T) this.f5541a.get(c4960o);
    }
}
