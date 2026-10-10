package org.jsoup.select;

import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import oh0.C43093c;
import org.jsoup.nodes.Element;

/* JADX INFO: renamed from: org.jsoup.select.b */
/* JADX INFO: compiled from: CombiningEvaluator.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC43306b extends AbstractC43307c {

    /* JADX INFO: renamed from: a */
    public final ArrayList<AbstractC43307c> f95547a;

    /* JADX INFO: renamed from: b */
    public int f95548b;

    /* JADX INFO: renamed from: org.jsoup.select.b$a */
    /* JADX INFO: compiled from: CombiningEvaluator.java */
    public static final class a extends AbstractC43306b {
        public a(Collection<AbstractC43307c> collection) {
            super(collection);
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            for (int i11 = 0; i11 < this.f95548b; i11++) {
                if (!this.f95547a.get(i11).mo95282a(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public a(AbstractC43307c... abstractC43307cArr) {
            this(Arrays.asList(abstractC43307cArr));
        }

        public String toString() {
            return C43093c.m94691j(this.f95547a, C33627eb.f69716f);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.select.b$b */
    /* JADX INFO: compiled from: CombiningEvaluator.java */
    public static final class b extends AbstractC43306b {
        public b(Collection<AbstractC43307c> collection) {
            if (this.f95548b > 1) {
                this.f95547a.add(new a(collection));
            } else {
                this.f95547a.addAll(collection);
            }
            m95281d();
        }

        @Override // org.jsoup.select.AbstractC43307c
        /* JADX INFO: renamed from: a */
        public boolean mo95282a(Element element, Element element2) {
            for (int i11 = 0; i11 < this.f95548b; i11++) {
                if (this.f95547a.get(i11).mo95282a(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void m95283e(AbstractC43307c abstractC43307c) {
            this.f95547a.add(abstractC43307c);
            m95281d();
        }

        public String toString() {
            return C43093c.m94691j(this.f95547a, ", ");
        }

        public b(AbstractC43307c... abstractC43307cArr) {
            this(Arrays.asList(abstractC43307cArr));
        }

        public b() {
        }
    }

    public AbstractC43306b() {
        this.f95548b = 0;
        this.f95547a = new ArrayList<>();
    }

    /* JADX INFO: renamed from: b */
    public void m95279b(AbstractC43307c abstractC43307c) {
        this.f95547a.set(this.f95548b - 1, abstractC43307c);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC43307c m95280c() {
        int i11 = this.f95548b;
        if (i11 > 0) {
            return this.f95547a.get(i11 - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m95281d() {
        this.f95548b = this.f95547a.size();
    }

    public AbstractC43306b(Collection<AbstractC43307c> collection) {
        this();
        this.f95547a.addAll(collection);
        m95281d();
    }
}
