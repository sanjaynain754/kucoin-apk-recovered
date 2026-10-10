package fh0;

import ih0.AbstractC38619a;
import ih0.C38629k;
import ih0.C38639u;
import java.util.regex.Pattern;
import kh0.AbstractC41041a;
import kh0.AbstractC41042b;
import kh0.AbstractC41046f;
import kh0.C41043c;
import kh0.InterfaceC41047g;
import kh0.InterfaceC41048h;

/* JADX INFO: renamed from: fh0.k */
/* JADX INFO: compiled from: HtmlBlockParser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37490k extends AbstractC41041a {

    /* JADX INFO: renamed from: e */
    public static final Pattern[][] f83143e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a */
    public final C38629k f83144a;

    /* JADX INFO: renamed from: b */
    public final Pattern f83145b;

    /* JADX INFO: renamed from: c */
    public boolean f83146c;

    /* JADX INFO: renamed from: d */
    public C37480a f83147d;

    /* JADX INFO: renamed from: fh0.k$b */
    /* JADX INFO: compiled from: HtmlBlockParser.java */
    public static class b extends AbstractC41042b {
        @Override // kh0.InterfaceC41045e
        /* JADX INFO: renamed from: a */
        public AbstractC41046f mo84315a(InterfaceC41048h interfaceC41048h, InterfaceC41047g interfaceC41047g) {
            int iMo84333b = interfaceC41048h.mo84333b();
            CharSequence line = interfaceC41048h.getLine();
            if (interfaceC41048h.mo84334c() < 4 && line.charAt(iMo84333b) == '<') {
                for (int i11 = 1; i11 <= 7; i11++) {
                    if (i11 != 7 || !(interfaceC41047g.mo84353a().mo84311c() instanceof C38639u)) {
                        Pattern pattern = C37490k.f83143e[i11][0];
                        Pattern pattern2 = C37490k.f83143e[i11][1];
                        if (pattern.matcher(line.subSequence(iMo84333b, line.length())).find()) {
                            return AbstractC41046f.m90006d(new C37490k(pattern2)).mo84317b(interfaceC41048h.getIndex());
                        }
                    }
                }
            }
            return AbstractC41046f.m90005c();
        }
    }

    public C37490k(Pattern pattern) {
        this.f83144a = new C38629k();
        this.f83146c = false;
        this.f83147d = new C37480a();
        this.f83145b = pattern;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: c */
    public AbstractC38619a mo84311c() {
        return this.f83144a;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: d */
    public void mo84328d(CharSequence charSequence) {
        this.f83147d.m84303a(charSequence);
        Pattern pattern = this.f83145b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f83146c = true;
    }

    @Override // kh0.AbstractC41041a, kh0.InterfaceC41044d
    /* JADX INFO: renamed from: f */
    public void mo84358f() {
        this.f83144a.m87341o(this.f83147d.m84304b());
        this.f83147d = null;
    }

    @Override // kh0.InterfaceC41044d
    /* JADX INFO: renamed from: h */
    public C41043c mo84313h(InterfaceC41048h interfaceC41048h) {
        if (this.f83146c) {
            return C41043c.m90004d();
        }
        return (interfaceC41048h.mo84332a() && this.f83145b == null) ? C41043c.m90004d() : C41043c.m90002b(interfaceC41048h.getIndex());
    }
}
