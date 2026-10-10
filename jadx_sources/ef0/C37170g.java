package ef0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.C4952g;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import com.tencent.bugly.proguard.C33978va;
import ff0.C37443b;
import ff0.C37449h;
import io.noties.markwon.core.CoreProps;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: ef0.g */
/* JADX INFO: compiled from: ListItemSpanFactory.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37170g implements InterfaceC4964s {
    @Override // cf0.InterfaceC4964s
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo5246a(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q) {
        if (CoreProps.ListItemType.BULLET == CoreProps.f86999a.m5238c(interfaceC4962q)) {
            return new C37443b(c4952g.m5182e(), CoreProps.f87000b.m5238c(interfaceC4962q).intValue());
        }
        return new C37449h(c4952g.m5182e(), String.valueOf(CoreProps.f87001c.m5238c(interfaceC4962q)) + C33978va.f72339h + Typography.nbsp);
    }
}
