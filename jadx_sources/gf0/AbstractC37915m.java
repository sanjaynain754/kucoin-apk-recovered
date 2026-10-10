package gf0;

import androidx.annotation.NonNull;
import cf0.InterfaceC4957l;
import java.util.Collection;

/* JADX INFO: renamed from: gf0.m */
/* JADX INFO: compiled from: TagHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC37915m {
    /* JADX INFO: renamed from: a */
    public abstract void mo85734a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37912j abstractC37912j, @NonNull InterfaceC37908f interfaceC37908f);

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract Collection<String> mo85735b();

    /* JADX INFO: renamed from: c */
    public static void m85733c(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37912j abstractC37912j, @NonNull InterfaceC37908f.a aVar) {
        for (InterfaceC37908f.a aVar2 : aVar.mo85700f()) {
            if (aVar2.isClosed()) {
                AbstractC37915m abstractC37915mMo85728b = abstractC37912j.mo85728b(aVar2.name());
                if (abstractC37915mMo85728b != null) {
                    abstractC37915mMo85728b.mo85734a(interfaceC4957l, abstractC37912j, aVar2);
                } else {
                    m85733c(interfaceC4957l, abstractC37912j, aVar2);
                }
            }
        }
    }
}
