package kf0;

import android.text.style.UnderlineSpan;
import androidx.annotation.NonNull;
import cf0.C4965t;
import cf0.InterfaceC4957l;
import gf0.AbstractC37912j;
import gf0.AbstractC37915m;
import gf0.InterfaceC37908f;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: kf0.m */
/* JADX INFO: compiled from: UnderlineHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41029m extends AbstractC37915m {
    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Arrays.asList("u", "ins");
    }

    @Override // gf0.AbstractC37915m
    /* JADX INFO: renamed from: a */
    public void mo85734a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37912j abstractC37912j, @NonNull InterfaceC37908f interfaceC37908f) {
        if (interfaceC37908f.mo85698e()) {
            AbstractC37915m.m85733c(interfaceC4957l, abstractC37912j, interfaceC37908f.mo85695a());
        }
        C4965t.m5248j(interfaceC4957l.builder(), new UnderlineSpan(), interfaceC37908f.start(), interfaceC37908f.mo85697c());
    }
}
