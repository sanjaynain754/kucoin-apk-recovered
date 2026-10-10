package org.springframework.web.util.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import wh0.AbstractC45833a;
import zh0.C46879e;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.c */
/* JADX INFO: compiled from: InternalPathPatternParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43313c {

    /* JADX INFO: renamed from: a */
    public final C46879e f95584a;

    /* JADX INFO: renamed from: c */
    public int f95586c;

    /* JADX INFO: renamed from: d */
    public int f95587d;

    /* JADX INFO: renamed from: e */
    public int f95588e;

    /* JADX INFO: renamed from: j */
    public int f95593j;

    /* JADX INFO: renamed from: k */
    public int f95594k;

    /* JADX INFO: renamed from: l */
    public List<String> f95595l;

    /* JADX INFO: renamed from: m */
    public AbstractC43315e f95596m;

    /* JADX INFO: renamed from: n */
    public AbstractC43315e f95597n;

    /* JADX INFO: renamed from: b */
    public char[] f95585b = new char[0];

    /* JADX INFO: renamed from: f */
    public boolean f95589f = false;

    /* JADX INFO: renamed from: g */
    public boolean f95590g = false;

    /* JADX INFO: renamed from: h */
    public boolean f95591h = false;

    /* JADX INFO: renamed from: i */
    public int f95592i = 0;

    /* JADX INFO: renamed from: b */
    public final int m95325b(char[] cArr, int i11) {
        while (i11 < cArr.length) {
            if (cArr[i11] == ':') {
                return i11 + 1;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final void m95331h() {
        this.f95593j = -1;
        this.f95588e = 0;
        this.f95591h = false;
        this.f95592i = 0;
        this.f95589f = false;
        this.f95590g = false;
        this.f95594k = -1;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC43315e m95324a() {
        if (this.f95591h) {
            throw new PatternParseException(this.f95587d, this.f95585b, PatternParseException.PatternMessage.MISSING_CLOSE_CAPTURE, new Object[0]);
        }
        char cM100605b = this.f95584a.m103208a().m100605b();
        int i11 = this.f95592i;
        if (i11 <= 0) {
            if (this.f95589f) {
                return this.f95587d - 1 == this.f95593j ? new C43320j(this.f95593j, cM100605b) : new C43317g(this.f95593j, m95326c(), this.f95584a.m103209b(), this.f95585b, cM100605b);
            }
            return this.f95588e != 0 ? new C43319i(this.f95593j, m95326c(), this.f95588e, this.f95584a.m103209b(), cM100605b) : new C43314d(this.f95593j, m95326c(), this.f95584a.m103209b(), cM100605b);
        }
        if (i11 == 1 && this.f95593j == this.f95594k && this.f95585b[this.f95587d - 1] == '}') {
            if (this.f95590g) {
                return new C43311a(this.f95593j, m95326c(), cM100605b);
            }
            try {
                C43312b c43312b = new C43312b(this.f95593j, m95326c(), this.f95584a.m103209b(), cM100605b);
                m95330g(this.f95593j, c43312b.m95323f());
                return c43312b;
            } catch (PatternSyntaxException e11) {
                throw new PatternParseException(e11, e11.getIndex() + m95325b(this.f95585b, this.f95593j), this.f95585b, PatternParseException.PatternMessage.REGEX_PATTERN_SYNTAX_EXCEPTION, new Object[0]);
            }
        }
        if (this.f95590g) {
            throw new PatternParseException(this.f95593j, this.f95585b, PatternParseException.PatternMessage.CAPTURE_ALL_IS_STANDALONE_CONSTRUCT, new Object[0]);
        }
        C43317g c43317g = new C43317g(this.f95593j, m95326c(), this.f95584a.m103209b(), this.f95585b, cM100605b);
        Iterator<String> it = c43317g.m95357g().iterator();
        while (it.hasNext()) {
            m95330g(this.f95593j, it.next());
        }
        return c43317g;
    }

    /* JADX INFO: renamed from: c */
    public final char[] m95326c() {
        int i11 = this.f95587d;
        int i12 = this.f95593j;
        char[] cArr = new char[i11 - i12];
        System.arraycopy(this.f95585b, i12, cArr, 0, i11 - i12);
        return cArr;
    }

    /* JADX INFO: renamed from: d */
    public C43316f m95327d(String str) throws PatternParseException {
        AbstractC45833a.m101250a(str, "Path pattern must not be null");
        char[] charArray = str.toCharArray();
        this.f95585b = charArray;
        this.f95586c = charArray.length;
        this.f95596m = null;
        this.f95597n = null;
        this.f95595l = null;
        this.f95593j = -1;
        this.f95587d = 0;
        m95331h();
        while (true) {
            int i11 = this.f95587d;
            if (i11 >= this.f95586c) {
                if (this.f95593j != -1) {
                    m95329f(m95324a());
                }
                return new C43316f(str, this.f95584a, this.f95596m);
            }
            char c11 = this.f95585b[i11];
            char cM100605b = this.f95584a.m103208a().m100605b();
            if (c11 == cM100605b) {
                if (this.f95593j != -1) {
                    m95329f(m95324a());
                }
                if (m95328e()) {
                    m95329f(new C43321k(this.f95587d, cM100605b));
                    this.f95587d += 2;
                } else {
                    m95329f(new C43318h(this.f95587d, cM100605b));
                }
            } else {
                if (this.f95593j == -1) {
                    this.f95593j = this.f95587d;
                }
                if (c11 == '?') {
                    this.f95588e++;
                } else if (c11 == '{') {
                    if (this.f95591h) {
                        throw new PatternParseException(this.f95587d, this.f95585b, PatternParseException.PatternMessage.ILLEGAL_NESTED_CAPTURE, new Object[0]);
                    }
                    this.f95591h = true;
                    this.f95594k = this.f95587d;
                } else if (c11 == '}') {
                    if (!this.f95591h) {
                        throw new PatternParseException(this.f95587d, this.f95585b, PatternParseException.PatternMessage.MISSING_OPEN_CAPTURE, new Object[0]);
                    }
                    this.f95591h = false;
                    if (this.f95590g && this.f95587d + 1 < this.f95586c) {
                        throw new PatternParseException(this.f95587d + 1, this.f95585b, PatternParseException.PatternMessage.NO_MORE_DATA_EXPECTED_AFTER_CAPTURE_THE_REST, new Object[0]);
                    }
                    this.f95592i++;
                } else if (c11 == ':') {
                    if (this.f95591h && !this.f95590g) {
                        m95332i();
                        this.f95591h = false;
                        this.f95592i++;
                    }
                } else if (c11 == '*') {
                    if (this.f95591h && this.f95594k == this.f95587d - 1) {
                        this.f95590g = true;
                    }
                    this.f95589f = true;
                }
                if (!this.f95591h) {
                    continue;
                } else {
                    if (this.f95594k + 1 + (this.f95590g ? 1 : 0) == this.f95587d && !Character.isJavaIdentifierStart(c11)) {
                        throw new PatternParseException(this.f95587d, this.f95585b, PatternParseException.PatternMessage.ILLEGAL_CHARACTER_AT_START_OF_CAPTURE_DESCRIPTOR, Character.toString(c11));
                    }
                    if (this.f95587d > this.f95594k + 1 + (this.f95590g ? 1 : 0) && !Character.isJavaIdentifierPart(c11) && c11 != '-') {
                        throw new PatternParseException(this.f95587d, this.f95585b, PatternParseException.PatternMessage.ILLEGAL_CHARACTER_IN_CAPTURE_DESCRIPTOR, Character.toString(c11));
                    }
                }
            }
            this.f95587d++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95328e() {
        int i11 = this.f95587d;
        if (i11 + 2 >= this.f95586c) {
            return false;
        }
        char[] cArr = this.f95585b;
        if (cArr[i11 + 1] == '*' && cArr[i11 + 2] == '*') {
            char cM100605b = this.f95584a.m103208a().m100605b();
            int i12 = this.f95587d;
            int i13 = i12 + 3;
            int i14 = this.f95586c;
            if (i13 < i14 && this.f95585b[i12 + 3] == cM100605b) {
                throw new PatternParseException(this.f95587d, this.f95585b, PatternParseException.PatternMessage.NO_MORE_DATA_EXPECTED_AFTER_CAPTURE_THE_REST, new Object[0]);
            }
            if (i12 + 3 == i14) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m95329f(AbstractC43315e abstractC43315e) {
        if (abstractC43315e instanceof C43311a) {
            AbstractC43315e abstractC43315e2 = this.f95597n;
            if (abstractC43315e2 == null) {
                this.f95596m = abstractC43315e;
                this.f95597n = abstractC43315e;
            } else {
                if (!(abstractC43315e2 instanceof C43318h)) {
                    throw new IllegalStateException("Expected SeparatorPathElement but was " + this.f95597n);
                }
                AbstractC43315e abstractC43315e3 = abstractC43315e2.f95605d;
                if (abstractC43315e3 == null) {
                    this.f95596m = abstractC43315e;
                    abstractC43315e.f95605d = null;
                } else {
                    abstractC43315e3.f95604c = abstractC43315e;
                    abstractC43315e.f95605d = abstractC43315e3;
                }
                this.f95597n = abstractC43315e;
            }
        } else if (this.f95596m == null) {
            this.f95596m = abstractC43315e;
            this.f95597n = abstractC43315e;
        } else {
            AbstractC43315e abstractC43315e4 = this.f95597n;
            if (abstractC43315e4 != null) {
                abstractC43315e4.f95604c = abstractC43315e;
                abstractC43315e.f95605d = abstractC43315e4;
                this.f95597n = abstractC43315e;
            }
        }
        m95331h();
    }

    /* JADX INFO: renamed from: g */
    public final void m95330g(int i11, String str) {
        if (this.f95595l == null) {
            this.f95595l = new ArrayList();
        }
        if (this.f95595l.contains(str)) {
            throw new PatternParseException(i11, this.f95585b, PatternParseException.PatternMessage.ILLEGAL_DOUBLE_CAPTURE, str);
        }
        this.f95595l.add(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m95332i() {
        int i11 = this.f95587d + 1;
        this.f95587d = i11;
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            int i13 = this.f95587d;
            if (i13 >= this.f95586c) {
                throw new PatternParseException(this.f95587d - 1, this.f95585b, PatternParseException.PatternMessage.MISSING_CLOSE_CAPTURE, new Object[0]);
            }
            char c11 = this.f95585b[i13];
            if (c11 != '\\' || z11) {
                if (c11 == '{' && !z11) {
                    i12++;
                } else if (c11 == '}' && !z11) {
                    if (i12 == 0) {
                        if (i11 == i13) {
                            throw new PatternParseException(i11, this.f95585b, PatternParseException.PatternMessage.MISSING_REGEX_CONSTRAINT, new Object[0]);
                        }
                        return;
                    }
                    i12--;
                }
                if (c11 == this.f95584a.m103208a().m100605b() && !z11) {
                    throw new PatternParseException(this.f95587d, this.f95585b, PatternParseException.PatternMessage.MISSING_CLOSE_CAPTURE, new Object[0]);
                }
                this.f95587d++;
                z11 = false;
            } else {
                this.f95587d = i13 + 1;
                z11 = true;
            }
        }
    }

    public C43313c(C46879e c46879e) {
        this.f95584a = c46879e;
    }
}
