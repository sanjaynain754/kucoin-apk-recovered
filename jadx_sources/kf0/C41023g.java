package kf0;

import androidx.annotation.NonNull;
import cf0.C4952g;
import cf0.C4965t;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import gf0.AbstractC37912j;
import gf0.AbstractC37915m;
import gf0.InterfaceC37908f;
import ih0.C38636r;
import io.noties.markwon.core.CoreProps;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: kf0.g */
/* JADX INFO: compiled from: ListHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41023g extends AbstractC37915m {
    /* JADX INFO: renamed from: d */
    public static int m89977d(@NonNull InterfaceC37908f.a aVar) {
        int i11 = 0;
        while (true) {
            aVar = aVar.mo85699d();
            if (aVar == null) {
                return i11;
            }
            if ("ul".equals(aVar.name()) || "ol".equals(aVar.name())) {
                i11++;
            }
        }
    }

    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Arrays.asList("ol", "ul");
    }

    @Override // gf0.AbstractC37915m
    /* JADX INFO: renamed from: a */
    public void mo85734a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37912j abstractC37912j, @NonNull InterfaceC37908f interfaceC37908f) {
        if (interfaceC37908f.mo85698e()) {
            InterfaceC37908f.a aVarMo85695a = interfaceC37908f.mo85695a();
            boolean zEquals = "ol".equals(aVarMo85695a.name());
            boolean zEquals2 = "ul".equals(aVarMo85695a.name());
            if (zEquals || zEquals2) {
                C4952g c4952gMo5202o = interfaceC4957l.mo5202o();
                InterfaceC4962q interfaceC4962qMo5200h = interfaceC4957l.mo5200h();
                InterfaceC4964s interfaceC4964s = c4952gMo5202o.m5180c().get(C38636r.class);
                int iM89977d = m89977d(aVarMo85695a);
                int i11 = 1;
                for (InterfaceC37908f.a aVar : aVarMo85695a.mo85700f()) {
                    AbstractC37915m.m85733c(interfaceC4957l, abstractC37912j, aVar);
                    if (interfaceC4964s != null && "li".equals(aVar.name())) {
                        if (zEquals) {
                            CoreProps.f86999a.m5239d(interfaceC4962qMo5200h, CoreProps.ListItemType.ORDERED);
                            CoreProps.f87001c.m5239d(interfaceC4962qMo5200h, Integer.valueOf(i11));
                            i11++;
                        } else {
                            CoreProps.f86999a.m5239d(interfaceC4962qMo5200h, CoreProps.ListItemType.BULLET);
                            CoreProps.f87000b.m5239d(interfaceC4962qMo5200h, Integer.valueOf(iM89977d));
                        }
                        C4965t.m5248j(interfaceC4957l.builder(), interfaceC4964s.mo5246a(c4952gMo5202o, interfaceC4962qMo5200h), aVar.start(), aVar.mo85697c());
                    }
                }
            }
        }
    }
}
