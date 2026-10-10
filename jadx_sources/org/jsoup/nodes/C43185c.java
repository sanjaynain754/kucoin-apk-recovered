package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;

/* JADX INFO: renamed from: org.jsoup.nodes.c */
/* JADX INFO: compiled from: CDataNode.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43185c extends C43192j {
    @Override // org.jsoup.nodes.C43192j, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: A */
    public String mo94801A() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.C43192j, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: E */
    public void mo94844E(Appendable appendable, int i11, Document.OutputSettings outputSettings) throws IOException {
        appendable.append("<![CDATA[").append(m95003d0());
    }

    @Override // org.jsoup.nodes.C43192j, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: F */
    public void mo94846F(Appendable appendable, int i11, Document.OutputSettings outputSettings) {
        try {
            appendable.append("]]>");
        } catch (IOException e11) {
            throw new UncheckedIOException(e11);
        }
    }

    public C43185c(String str) {
        super(str);
    }

    @Override // org.jsoup.nodes.C43192j, org.jsoup.nodes.AbstractC43189g
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C43185c mo94812s0() {
        return (C43185c) super.mo94812s0();
    }
}
