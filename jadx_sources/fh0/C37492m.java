package fh0;

import ih0.C38634p;
import java.util.List;
import java.util.Map;
import jh0.InterfaceC40406b;
import lh0.InterfaceC42224a;

/* JADX INFO: renamed from: fh0.m */
/* JADX INFO: compiled from: InlineParserContextImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37492m implements InterfaceC40406b {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC42224a> f83150a;

    /* JADX INFO: renamed from: b */
    public final Map<String, C38634p> f83151b;

    @Override // jh0.InterfaceC40406b
    /* JADX INFO: renamed from: a */
    public List<InterfaceC42224a> mo84367a() {
        return this.f83150a;
    }

    @Override // jh0.InterfaceC40406b
    /* JADX INFO: renamed from: b */
    public C38634p mo84368b(String str) {
        return this.f83151b.get(str);
    }

    public C37492m(List<InterfaceC42224a> list, Map<String, C38634p> map) {
        this.f83150a = list;
        this.f83151b = map;
    }
}
