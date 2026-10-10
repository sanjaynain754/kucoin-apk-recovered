package org.commonmark.internal;

import hh0.C38209a;
import hh0.C38211c;
import hh0.C38212d;
import ih0.C38634p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes61.dex */
public class LinkReferenceDefinitionParser {

    /* JADX INFO: renamed from: d */
    public StringBuilder f95337d;

    /* JADX INFO: renamed from: e */
    public String f95338e;

    /* JADX INFO: renamed from: f */
    public String f95339f;

    /* JADX INFO: renamed from: g */
    public char f95340g;

    /* JADX INFO: renamed from: h */
    public StringBuilder f95341h;

    /* JADX INFO: renamed from: a */
    public State f95334a = State.START_DEFINITION;

    /* JADX INFO: renamed from: b */
    public final StringBuilder f95335b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public final List<C38634p> f95336c = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f95342i = false;

    public enum State {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    /* JADX INFO: renamed from: org.commonmark.internal.LinkReferenceDefinitionParser$a */
    public static /* synthetic */ class C43180a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95344a;

        static {
            int[] iArr = new int[State.values().length];
            f95344a = iArr;
            try {
                iArr[State.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95344a[State.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95344a[State.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95344a[State.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95344a[State.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95344a[State.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m94793b() {
        if (this.f95342i) {
            String strM86207e = C38209a.m86207e(this.f95339f);
            StringBuilder sb2 = this.f95341h;
            this.f95336c.add(new C38634p(this.f95338e, strM86207e, sb2 != null ? C38209a.m86207e(sb2.toString()) : null));
            this.f95337d = null;
            this.f95342i = false;
            this.f95338e = null;
            this.f95339f = null;
            this.f95341h = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m94795d() {
        return this.f95335b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[LOOP:0: B:6:0x0015->B:23:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public void m94797f(CharSequence charSequence) {
        if (this.f95335b.length() != 0) {
            this.f95335b.append('\n');
        }
        this.f95335b.append(charSequence);
        int iM94798g = 0;
        while (iM94798g < charSequence.length()) {
            switch (C43180a.f95344a[this.f95334a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    iM94798g = m94798g(charSequence, iM94798g);
                    if (iM94798g == -1) {
                        this.f95334a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 3:
                    iM94798g = m94796e(charSequence, iM94798g);
                    if (iM94798g == -1) {
                        this.f95334a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 4:
                    iM94798g = m94792a(charSequence, iM94798g);
                    if (iM94798g == -1) {
                        this.f95334a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 5:
                    iM94798g = m94799h(charSequence, iM94798g);
                    if (iM94798g == -1) {
                        this.f95334a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 6:
                    iM94798g = m94800i(charSequence, iM94798g);
                    if (iM94798g == -1) {
                        this.f95334a = State.PARAGRAPH;
                        return;
                    }
                    break;
                default:
                    if (iM94798g == -1) {
                        this.f95334a = State.PARAGRAPH;
                        return;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m94800i(CharSequence charSequence, int i11) {
        int iM86215e = C38211c.m86215e(charSequence, i11, this.f95340g);
        if (iM86215e == -1) {
            return -1;
        }
        this.f95341h.append(charSequence.subSequence(i11, iM86215e));
        if (iM86215e >= charSequence.length()) {
            this.f95341h.append('\n');
            return iM86215e;
        }
        int iM86228m = C38212d.m86228m(charSequence, iM86215e + 1, charSequence.length());
        if (iM86228m != charSequence.length()) {
            return -1;
        }
        this.f95342i = true;
        m94793b();
        this.f95335b.setLength(0);
        this.f95334a = State.START_DEFINITION;
        return iM86228m;
    }

    /* JADX INFO: renamed from: a */
    public final int m94792a(CharSequence charSequence, int i11) {
        String string;
        int iM86228m = C38212d.m86228m(charSequence, i11, charSequence.length());
        int iM86211a = C38211c.m86211a(charSequence, iM86228m);
        if (iM86211a == -1) {
            return -1;
        }
        if (charSequence.charAt(iM86228m) == '<') {
            string = charSequence.subSequence(iM86228m + 1, iM86211a - 1).toString();
        } else {
            string = charSequence.subSequence(iM86228m, iM86211a).toString();
        }
        this.f95339f = string;
        int iM86228m2 = C38212d.m86228m(charSequence, iM86211a, charSequence.length());
        if (iM86228m2 >= charSequence.length()) {
            this.f95342i = true;
            this.f95335b.setLength(0);
        } else if (iM86228m2 == iM86211a) {
            return -1;
        }
        this.f95334a = State.START_TITLE;
        return iM86228m2;
    }

    /* JADX INFO: renamed from: c */
    public List<C38634p> m94794c() {
        m94793b();
        return this.f95336c;
    }

    /* JADX INFO: renamed from: e */
    public final int m94796e(CharSequence charSequence, int i11) {
        int i12;
        int iM86213c = C38211c.m86213c(charSequence, i11);
        if (iM86213c == -1) {
            return -1;
        }
        this.f95337d.append(charSequence, i11, iM86213c);
        if (iM86213c >= charSequence.length()) {
            this.f95337d.append('\n');
            return iM86213c;
        }
        if (charSequence.charAt(iM86213c) != ']' || (i12 = iM86213c + 1) >= charSequence.length() || charSequence.charAt(i12) != ':' || this.f95337d.length() > 999) {
            return -1;
        }
        String strM86204b = C38209a.m86204b(this.f95337d.toString());
        if (strM86204b.isEmpty()) {
            return -1;
        }
        this.f95338e = strM86204b;
        this.f95334a = State.DESTINATION;
        return C38212d.m86228m(charSequence, iM86213c + 2, charSequence.length());
    }

    /* JADX INFO: renamed from: g */
    public final int m94798g(CharSequence charSequence, int i11) {
        int iM86228m = C38212d.m86228m(charSequence, i11, charSequence.length());
        if (iM86228m < charSequence.length() && charSequence.charAt(iM86228m) == '[') {
            this.f95334a = State.LABEL;
            this.f95337d = new StringBuilder();
            int i12 = iM86228m + 1;
            if (i12 >= charSequence.length()) {
                this.f95337d.append('\n');
            }
            return i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final int m94799h(CharSequence charSequence, int i11) {
        int iM86228m = C38212d.m86228m(charSequence, i11, charSequence.length());
        if (iM86228m >= charSequence.length()) {
            this.f95334a = State.START_DEFINITION;
            return iM86228m;
        }
        this.f95340g = (char) 0;
        char cCharAt = charSequence.charAt(iM86228m);
        if (cCharAt != '\"' && cCharAt != '\'') {
            if (cCharAt == '(') {
                this.f95340g = ')';
            }
        } else {
            this.f95340g = cCharAt;
        }
        if (this.f95340g != 0) {
            this.f95334a = State.TITLE;
            this.f95341h = new StringBuilder();
            int i12 = iM86228m + 1;
            if (i12 == charSequence.length()) {
                this.f95341h.append('\n');
            }
            return i12;
        }
        m94793b();
        this.f95334a = State.START_DEFINITION;
        return iM86228m;
    }
}
