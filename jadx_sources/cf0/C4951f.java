package cf0;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import df0.C36671a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jh0.C40408d;

/* JADX INFO: renamed from: cf0.f */
/* JADX INFO: compiled from: MarkwonBuilderImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4951f implements AbstractC4950e.a {

    /* JADX INFO: renamed from: a */
    public final Context f5502a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC4954i> f5503b = new ArrayList(3);

    /* JADX INFO: renamed from: c */
    public TextView.BufferType f5504c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: d */
    public boolean f5505d = true;

    @NonNull
    /* JADX INFO: renamed from: b */
    public static List<InterfaceC4954i> m5177b(@NonNull List<InterfaceC4954i> list) {
        return new C4961p(list).m5243e();
    }

    @Override // cf0.AbstractC4950e.a
    @NonNull
    /* JADX INFO: renamed from: a */
    public AbstractC4950e.a mo5176a(@NonNull InterfaceC4954i interfaceC4954i) {
        this.f5503b.add(interfaceC4954i);
        return this;
    }

    @Override // cf0.AbstractC4950e.a
    @NonNull
    public AbstractC4950e build() {
        if (this.f5503b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<InterfaceC4954i> listM5177b = m5177b(this.f5503b);
        C40408d.b bVar = new C40408d.b();
        C36671a.a aVarM82056i = C36671a.m82056i(this.f5502a);
        C4952g.b bVar2 = new C4952g.b();
        C4959n.a aVar = new C4959n.a();
        C4956k.a aVar2 = new C4956k.a();
        for (InterfaceC4954i interfaceC4954i : listM5177b) {
            interfaceC4954i.configureParser(bVar);
            interfaceC4954i.configureTheme(aVarM82056i);
            interfaceC4954i.configureConfiguration(bVar2);
            interfaceC4954i.configureVisitor(aVar);
            interfaceC4954i.configureSpansFactory(aVar2);
        }
        C4952g c4952gM5190h = bVar2.m5190h(aVarM82056i.m82101z(), aVar2.build());
        return new C4953h(this.f5504c, null, bVar.m89048f(), AbstractC4958m.m5210b(aVar, c4952gM5190h), c4952gM5190h, Collections.unmodifiableList(listM5177b), this.f5505d);
    }

    public C4951f(@NonNull Context context) {
        this.f5502a = context;
    }
}
