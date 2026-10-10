package org.springframework.web.util.pattern;

import java.util.List;
import org.springframework.util.LinkedMultiValueMap;
import vh0.InterfaceC45553b;
import wh0.InterfaceC45841i;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.a */
/* JADX INFO: compiled from: CaptureTheRestPathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43311a extends AbstractC43315e {

    /* JADX INFO: renamed from: f */
    public final String f95581f;

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: a */
    public int mo95318a() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: b */
    public int mo95319b() {
        return 1;
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: e */
    public boolean mo95320e(int i11, C43316f.a aVar) {
        if (i11 < aVar.f95621c && !aVar.m95351c(i11)) {
            return false;
        }
        if (aVar.f95625g) {
            aVar.f95626h = aVar.f95621c;
        }
        if (!aVar.f95624f) {
            return true;
        }
        InterfaceC45841i<String, String> linkedMultiValueMap = null;
        for (int i12 = i11; i12 < aVar.f95621c; i12++) {
            InterfaceC45553b.a aVar2 = aVar.f95620b.get(i12);
            if (aVar2 instanceof InterfaceC45553b.c) {
                InterfaceC45841i<String, String> interfaceC45841iMo100601b = ((InterfaceC45553b.c) aVar2).mo100601b();
                if (!interfaceC45841iMo100601b.isEmpty()) {
                    if (linkedMultiValueMap == null) {
                        linkedMultiValueMap = new LinkedMultiValueMap<>();
                    }
                    linkedMultiValueMap.addAll(interfaceC45841iMo100601b);
                }
            }
        }
        String str = this.f95581f;
        String strM95321f = m95321f(i11, aVar.f95620b);
        if (linkedMultiValueMap == null) {
            linkedMultiValueMap = AbstractC43315e.f95601e;
        }
        aVar.m95353e(str, strM95321f, linkedMultiValueMap);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final String m95321f(int i11, List<InterfaceC45553b.a> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        while (i11 < size) {
            InterfaceC45553b.a aVar = list.get(i11);
            if (aVar instanceof InterfaceC45553b.c) {
                sb2.append(((InterfaceC45553b.c) aVar).mo100600a());
            } else {
                sb2.append(aVar.value());
            }
            i11++;
        }
        return sb2.toString();
    }

    public String toString() {
        return "CaptureTheRest(/{*" + this.f95581f + "})";
    }

    public C43311a(int i11, char[] cArr, char c11) {
        super(i11, c11);
        this.f95581f = new String(cArr, 2, cArr.length - 3);
    }
}
