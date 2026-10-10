package org.jsoup.nodes;

import org.jsoup.parser.C43296b;
import org.jsoup.parser.C43299e;

/* JADX INFO: renamed from: org.jsoup.nodes.h */
/* JADX INFO: compiled from: NodeUtils.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C43190h {
    /* JADX INFO: renamed from: a */
    public static Document.OutputSettings m95000a(AbstractC43189g abstractC43189g) {
        Document documentM94970G = abstractC43189g.m94970G();
        if (documentM94970G != null) {
            return documentM94970G.m94813s1();
        }
        return new Document("").m94813s1();
    }

    /* JADX INFO: renamed from: b */
    public static C43299e m95001b(AbstractC43189g abstractC43189g) {
        Document documentM94970G = abstractC43189g.m94970G();
        if (documentM94970G != null && documentM94970G.m94815u1() != null) {
            return documentM94970G.m94815u1();
        }
        return new C43299e(new C43296b());
    }
}
