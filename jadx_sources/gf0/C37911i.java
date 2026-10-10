package gf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.messaging.Constants;
import com.kubi.user.protocol.entity.SignTermItem;
import if0.C38528a;
import if0.C38529b;
import io.noties.markwon.html.jsoup.parser.C39213a;
import io.noties.markwon.html.jsoup.parser.C39215c;
import io.noties.markwon.html.jsoup.parser.ParseErrorList;
import io.noties.markwon.html.jsoup.parser.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: gf0.i */
/* JADX INFO: compiled from: MarkwonHtmlParserImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C37911i extends AbstractC37910h {

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public static final Set<String> f85302g = Collections.unmodifiableSet(new HashSet(Arrays.asList(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", Constants.ScionAnalytics.PARAM_LABEL, "map", "object", "q", "samp", "script", "select", "small", TtmlNode.TAG_SPAN, "strong", AuthenticationTokenClaims.JSON_KEY_SUB, "sup", "textarea", "time", TtmlNode.TAG_TT, "var")));

    /* JADX INFO: renamed from: h */
    public static final Set<String> f85303h = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", TtmlNode.RUBY_BASE, "br", "col", "embed", "hr", "img", "input", "keygen", SignTermItem.LINK, "meta", "param", "source", "track", "wbr")));

    /* JADX INFO: renamed from: i */
    public static final Set<String> f85304i = Collections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", TtmlNode.TAG_DIV, CmcdConfiguration.KEY_DEADLINE, "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    /* JADX INFO: renamed from: a */
    public final C37906d f85305a;

    /* JADX INFO: renamed from: b */
    public final AbstractC37916n f85306b;

    /* JADX INFO: renamed from: c */
    public final List<AbstractC37909g.b> f85307c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    public AbstractC37909g.a f85308d = AbstractC37909g.a.m85703j();

    /* JADX INFO: renamed from: e */
    public boolean f85309e;

    /* JADX INFO: renamed from: f */
    public boolean f85310f;

    /* JADX INFO: renamed from: h */
    public static <T extends Appendable & CharSequence> void m85711h(@NonNull T t11) {
        T t12 = t11;
        int length = t12.length();
        if (length <= 0 || '\n' == t12.charAt(length - 1)) {
            return;
        }
        AbstractC37903a.m85677a(t11, '\n');
    }

    /* JADX INFO: renamed from: gf0.i$a */
    /* JADX INFO: compiled from: MarkwonHtmlParserImpl.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f85311a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f85311a = iArr;
            try {
                iArr[Token.TokenType.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85311a[Token.TokenType.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85311a[Token.TokenType.Character.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static C37911i m85710g(@NonNull C37906d c37906d) {
        return new C37911i(c37906d, AbstractC37916n.m85736b());
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static Map<String, String> m85712j(@NonNull Token.C39144g c39144g) {
        C38529b c38529b = c39144g.f87029j;
        int size = c38529b.size();
        if (size <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(size);
        for (C38528a c38528a : c38529b) {
            map.put(c38528a.getKey().toLowerCase(Locale.US), c38528a.getValue());
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m85713m(@NonNull String str) {
        return f85304i.contains(str);
    }

    /* JADX INFO: renamed from: n */
    public static <T extends Appendable & CharSequence> boolean m85714n(@NonNull T t11, @NonNull AbstractC37909g abstractC37909g) {
        return abstractC37909g.f85297b == t11.length();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m85715o(@NonNull String str) {
        return f85302g.contains(str);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m85716p(@NonNull String str) {
        return f85303h.contains(str);
    }

    @Override // gf0.AbstractC37910h
    /* JADX INFO: renamed from: a */
    public void mo85706a(int i11, @NonNull AbstractC37910h.a<InterfaceC37908f.a> aVar) {
        AbstractC37909g.a aVar2 = this.f85308d;
        while (true) {
            AbstractC37909g.a aVar3 = aVar2.f85300e;
            if (aVar3 == null) {
                break;
            } else {
                aVar2 = aVar3;
            }
        }
        if (i11 > -1) {
            aVar2.m85704h(i11);
        }
        List<InterfaceC37908f.a> listMo85700f = aVar2.mo85700f();
        if (listMo85700f.size() > 0) {
            aVar.apply(listMo85700f);
        } else {
            aVar.apply(Collections.EMPTY_LIST);
        }
        this.f85308d = AbstractC37909g.a.m85703j();
    }

    @Override // gf0.AbstractC37910h
    /* JADX INFO: renamed from: b */
    public void mo85707b(int i11, @NonNull AbstractC37910h.a<InterfaceC37908f.b> aVar) {
        if (this.f85307c.size() <= 0) {
            aVar.apply(Collections.EMPTY_LIST);
            return;
        }
        if (i11 > -1) {
            Iterator<AbstractC37909g.b> it = this.f85307c.iterator();
            while (it.hasNext()) {
                it.next().m85705h(i11);
            }
        }
        aVar.apply(Collections.unmodifiableList(this.f85307c));
        this.f85307c.clear();
    }

    @Override // gf0.AbstractC37910h
    /* JADX INFO: renamed from: c */
    public <T extends Appendable & CharSequence> void mo85708c(@NonNull T t11, @NonNull String str) {
        C39215c c39215c = new C39215c(new C39213a(str), ParseErrorList.noTracking());
        while (true) {
            Token tokenM87921t = c39215c.m87921t();
            Token.TokenType tokenType = tokenM87921t.f87011a;
            if (Token.TokenType.EOF == tokenType) {
                return;
            }
            int i11 = a.f85311a[tokenType.ordinal()];
            if (i11 == 1) {
                Token.C39144g c39144g = (Token.C39144g) tokenM87921t;
                if (m85715o(c39144g.f87022c)) {
                    m85726u(t11, c39144g);
                } else {
                    m85723r(t11, c39144g);
                }
            } else if (i11 == 2) {
                Token.C39143f c39143f = (Token.C39143f) tokenM87921t;
                if (m85715o(c39143f.f87022c)) {
                    m85725t(t11, c39143f);
                } else {
                    m85722q(t11, c39143f);
                }
            } else if (i11 == 3) {
                m85724s(t11, (Token.C39139b) tokenM87921t);
            }
            tokenM87921t.mo87843a();
        }
    }

    @Override // gf0.AbstractC37910h
    /* JADX INFO: renamed from: d */
    public void mo85709d() {
        this.f85307c.clear();
        this.f85308d = AbstractC37909g.a.m85703j();
    }

    /* JADX INFO: renamed from: e */
    public void m85717e(@NonNull AbstractC37909g.a aVar, @NonNull AbstractC37909g.a aVar2) {
        List arrayList = aVar.f85301f;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            aVar.f85301f = arrayList;
        }
        arrayList.add(aVar2);
    }

    /* JADX INFO: renamed from: f */
    public <T extends Appendable & CharSequence> void m85718f(@NonNull T t11, @NonNull AbstractC37909g abstractC37909g) {
        String strM85689a = this.f85305a.m85689a(abstractC37909g);
        if (strM85689a != null) {
            AbstractC37903a.m85678b(t11, strM85689a);
        }
    }

    /* JADX INFO: renamed from: i */
    public <T extends Appendable & CharSequence> void m85719i(@NonNull T t11) {
        if (this.f85310f) {
            m85711h(t11);
            this.f85310f = false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public AbstractC37909g.a m85720k(@NonNull String str) {
        AbstractC37909g.a aVar = this.f85308d;
        while (aVar != null && !str.equals(aVar.f85296a) && !aVar.isClosed()) {
            aVar = aVar.f85300e;
        }
        return aVar;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public AbstractC37909g.b m85721l(@NonNull String str) {
        int size = this.f85307c.size();
        while (true) {
            size--;
            if (size <= -1) {
                return null;
            }
            AbstractC37909g.b bVar = this.f85307c.get(size);
            if (str.equals(bVar.f85296a) && bVar.f85299d < 0) {
                return bVar;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public <T extends Appendable & CharSequence> void m85722q(@NonNull T t11, @NonNull Token.C39143f c39143f) {
        String str = c39143f.f87022c;
        AbstractC37909g.a aVarM85720k = m85720k(str);
        if (aVarM85720k != null) {
            if ("pre".equals(str)) {
                this.f85309e = false;
            }
            if (m85714n(t11, aVarM85720k)) {
                m85718f(t11, aVarM85720k);
            }
            aVarM85720k.m85704h(t11.length());
            if (!aVarM85720k.m85701g()) {
                this.f85310f = m85713m(aVarM85720k.f85296a);
            }
            if ("p".equals(str)) {
                AbstractC37903a.m85677a(t11, '\n');
            }
            this.f85308d = aVarM85720k.f85300e;
        }
    }

    /* JADX INFO: renamed from: r */
    public <T extends Appendable & CharSequence> void m85723r(@NonNull T t11, @NonNull Token.C39144g c39144g) {
        String str = c39144g.f87022c;
        if ("p".equals(this.f85308d.f85296a)) {
            this.f85308d.m85704h(t11.length());
            AbstractC37903a.m85677a(t11, '\n');
            this.f85308d = this.f85308d.f85300e;
        } else if ("li".equals(str) && "li".equals(this.f85308d.f85296a)) {
            this.f85308d.m85704h(t11.length());
            this.f85308d = this.f85308d.f85300e;
        }
        if (m85713m(str)) {
            this.f85309e = "pre".equals(str);
            m85711h(t11);
        } else {
            m85719i(t11);
        }
        T t12 = t11;
        AbstractC37909g.a aVarM85702i = AbstractC37909g.a.m85702i(str, t12.length(), m85712j(c39144g), this.f85308d);
        boolean z11 = m85716p(str) || c39144g.f87028i;
        if (z11) {
            String strM85689a = this.f85305a.m85689a(aVarM85702i);
            if (strM85689a != null && strM85689a.length() > 0) {
                AbstractC37903a.m85678b(t11, strM85689a);
            }
            aVarM85702i.m85704h(t12.length());
        }
        m85717e(aVarM85702i.f85300e, aVarM85702i);
        if (z11) {
            return;
        }
        this.f85308d = aVarM85702i;
    }

    /* JADX INFO: renamed from: s */
    public <T extends Appendable & CharSequence> void m85724s(@NonNull T t11, @NonNull Token.C39139b c39139b) {
        if (this.f85309e) {
            AbstractC37903a.m85678b(t11, c39139b.m87845d());
        } else {
            m85719i(t11);
            this.f85306b.mo85737a(t11, c39139b.m87845d());
        }
    }

    /* JADX INFO: renamed from: t */
    public <T extends Appendable & CharSequence> void m85725t(@NonNull T t11, @NonNull Token.C39143f c39143f) {
        AbstractC37909g.b bVarM85721l = m85721l(c39143f.f87022c);
        if (bVarM85721l != null) {
            if (m85714n(t11, bVarM85721l)) {
                m85718f(t11, bVarM85721l);
            }
            bVarM85721l.m85705h(t11.length());
        }
    }

    /* JADX INFO: renamed from: u */
    public <T extends Appendable & CharSequence> void m85726u(@NonNull T t11, @NonNull Token.C39144g c39144g) {
        String str = c39144g.f87022c;
        T t12 = t11;
        AbstractC37909g.b bVar = new AbstractC37909g.b(str, t12.length(), m85712j(c39144g));
        m85719i(t11);
        if (m85716p(str) || c39144g.f87028i) {
            String strM85689a = this.f85305a.m85689a(bVar);
            if (strM85689a != null && strM85689a.length() > 0) {
                AbstractC37903a.m85678b(t11, strM85689a);
            }
            bVar.m85705h(t12.length());
        }
        this.f85307c.add(bVar);
    }

    public C37911i(@NonNull C37906d c37906d, @NonNull AbstractC37916n abstractC37916n) {
        this.f85305a = c37906d;
        this.f85306b = abstractC37916n;
    }
}
