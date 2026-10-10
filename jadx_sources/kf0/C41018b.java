package kf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.C4952g;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import gf0.InterfaceC37908f;
import ih0.C38625g;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: kf0.b */
/* JADX INFO: compiled from: EmphasisHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41018b extends AbstractC41024h {
    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Arrays.asList("i", "em", "cite", "dfn");
    }

    @Override // kf0.AbstractC41024h
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo89974d(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q, @NonNull InterfaceC37908f interfaceC37908f) {
        InterfaceC4964s interfaceC4964s = c4952g.m5180c().get(C38625g.class);
        if (interfaceC4964s == null) {
            return null;
        }
        return interfaceC4964s.mo5246a(c4952g, interfaceC4962q);
    }
}
