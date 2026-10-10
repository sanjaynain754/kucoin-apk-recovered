package kf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.C4952g;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import gf0.InterfaceC37908f;
import ih0.C38628j;
import io.noties.markwon.core.CoreProps;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: kf0.c */
/* JADX INFO: compiled from: HeadingHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41019c extends AbstractC41024h {
    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
    }

    @Override // kf0.AbstractC41024h
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo89974d(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q, @NonNull InterfaceC37908f interfaceC37908f) {
        int i11;
        InterfaceC4964s interfaceC4964s = c4952g.m5180c().get(C38628j.class);
        if (interfaceC4964s == null) {
            return null;
        }
        try {
            i11 = Integer.parseInt(interfaceC37908f.name().substring(1));
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
            i11 = 0;
        }
        if (i11 < 1 || i11 > 6) {
            return null;
        }
        CoreProps.f87002d.m5239d(interfaceC4962q, Integer.valueOf(i11));
        return interfaceC4964s.mo5246a(c4952g, interfaceC4962q);
    }
}
