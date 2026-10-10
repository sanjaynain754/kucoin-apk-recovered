package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/* JADX INFO: renamed from: org.jsoup.parser.e */
/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43299e {

    /* JADX INFO: renamed from: a */
    public AbstractC43303i f95488a;

    /* JADX INFO: renamed from: b */
    public ParseErrorList f95489b = ParseErrorList.noTracking();

    /* JADX INFO: renamed from: c */
    public C43298d f95490c;

    /* JADX INFO: renamed from: b */
    public static C43299e m95189b() {
        return new C43299e(new C43296b());
    }

    /* JADX INFO: renamed from: g */
    public static C43299e m95190g() {
        return new C43299e(new C43304j());
    }

    /* JADX INFO: renamed from: a */
    public ParseErrorList m95191a() {
        return this.f95489b;
    }

    /* JADX INFO: renamed from: c */
    public List<AbstractC43189g> m95192c(String str, Element element, String str2) {
        return this.f95488a.mo95145f(str, element, str2, this);
    }

    /* JADX INFO: renamed from: d */
    public Document m95193d(Reader reader, String str) {
        return this.f95488a.m95254e(reader, str, this);
    }

    /* JADX INFO: renamed from: e */
    public Document m95194e(String str, String str2) {
        return this.f95488a.m95254e(new StringReader(str), str2, this);
    }

    /* JADX INFO: renamed from: f */
    public C43298d m95195f() {
        return this.f95490c;
    }

    public C43299e(AbstractC43303i abstractC43303i) {
        this.f95488a = abstractC43303i;
        this.f95490c = abstractC43303i.mo95139b();
    }
}
