package org.jsoup.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.messaging.Constants;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.Map;
import nh0.C42841b;
import oh0.C43092b;

/* JADX INFO: renamed from: org.jsoup.parser.f */
/* JADX INFO: compiled from: Tag.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43300f implements Cloneable {

    /* JADX INFO: renamed from: k */
    public static final Map<String, C43300f> f95491k = new HashMap();

    /* JADX INFO: renamed from: l */
    public static final String[] f95492l;

    /* JADX INFO: renamed from: m */
    public static final String[] f95493m;

    /* JADX INFO: renamed from: n */
    public static final String[] f95494n;

    /* JADX INFO: renamed from: o */
    public static final String[] f95495o;

    /* JADX INFO: renamed from: p */
    public static final String[] f95496p;

    /* JADX INFO: renamed from: q */
    public static final String[] f95497q;

    /* JADX INFO: renamed from: r */
    public static final String[] f95498r;

    /* JADX INFO: renamed from: b */
    public String f95499b;

    /* JADX INFO: renamed from: c */
    public String f95500c;

    /* JADX INFO: renamed from: d */
    public boolean f95501d = true;

    /* JADX INFO: renamed from: e */
    public boolean f95502e = true;

    /* JADX INFO: renamed from: f */
    public boolean f95503f = false;

    /* JADX INFO: renamed from: g */
    public boolean f95504g = false;

    /* JADX INFO: renamed from: h */
    public boolean f95505h = false;

    /* JADX INFO: renamed from: i */
    public boolean f95506i = false;

    /* JADX INFO: renamed from: j */
    public boolean f95507j = false;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43300f)) {
            return false;
        }
        C43300f c43300f = (C43300f) obj;
        return this.f95499b.equals(c43300f.f95499b) && this.f95503f == c43300f.f95503f && this.f95502e == c43300f.f95502e && this.f95501d == c43300f.f95501d && this.f95505h == c43300f.f95505h && this.f95504g == c43300f.f95504g && this.f95506i == c43300f.f95506i && this.f95507j == c43300f.f95507j;
    }

    /* JADX INFO: renamed from: m */
    public C43300f m95210m() {
        this.f95504g = true;
        return this;
    }

    static {
        String[] strArr = {"html", TtmlNode.TAG_HEAD, TtmlNode.TAG_BODY, "frameset", "script", "noscript", TtmlNode.TAG_STYLE, "meta", SignTermItem.LINK, "title", TypedValues.AttributesType.S_FRAME, "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", TtmlNode.TAG_DIV, "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", CmcdConfiguration.KEY_DEADLINE, "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", TtmlNode.CENTER};
        f95492l = strArr;
        f95493m = new String[]{"object", TtmlNode.RUBY_BASE, "font", TtmlNode.TAG_TT, "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", TtmlNode.ATTR_TTS_RUBY, "rt", "rp", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "img", "br", "wbr", "map", "q", AuthenticationTokenClaims.JSON_KEY_SUB, "sup", "bdo", "iframe", "embed", TtmlNode.TAG_SPAN, "input", "select", "textarea", Constants.ScionAnalytics.PARAM_LABEL, "button", "optgroup", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", CmcdData.Factory.STREAMING_FORMAT_SS};
        f95494n = new String[]{"meta", SignTermItem.LINK, TtmlNode.RUBY_BASE, TypedValues.AttributesType.S_FRAME, "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f95495o = new String[]{"title", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", TtmlNode.TAG_STYLE, "ins", "del", CmcdData.Factory.STREAMING_FORMAT_SS};
        f95496p = new String[]{"pre", "plaintext", "title", "textarea"};
        f95497q = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f95498r = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (String str : strArr) {
            m95196l(new C43300f(str));
        }
        for (String str2 : f95493m) {
            C43300f c43300f = new C43300f(str2);
            c43300f.f95501d = false;
            c43300f.f95502e = false;
            m95196l(c43300f);
        }
        for (String str3 : f95494n) {
            C43300f c43300f2 = f95491k.get(str3);
            C42841b.m93957i(c43300f2);
            c43300f2.f95503f = true;
        }
        for (String str4 : f95495o) {
            C43300f c43300f3 = f95491k.get(str4);
            C42841b.m93957i(c43300f3);
            c43300f3.f95502e = false;
        }
        for (String str5 : f95496p) {
            C43300f c43300f4 = f95491k.get(str5);
            C42841b.m93957i(c43300f4);
            c43300f4.f95505h = true;
        }
        for (String str6 : f95497q) {
            C43300f c43300f5 = f95491k.get(str6);
            C42841b.m93957i(c43300f5);
            c43300f5.f95506i = true;
        }
        for (String str7 : f95498r) {
            C43300f c43300f6 = f95491k.get(str7);
            C42841b.m93957i(c43300f6);
            c43300f6.f95507j = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m95196l(C43300f c43300f) {
        f95491k.put(c43300f.f95499b, c43300f);
    }

    /* JADX INFO: renamed from: n */
    public static C43300f m95197n(String str) {
        return m95198o(str, C43298d.f95485d);
    }

    /* JADX INFO: renamed from: b */
    public boolean m95200b() {
        return this.f95502e;
    }

    /* JADX INFO: renamed from: c */
    public String m95201c() {
        return this.f95499b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m95202d() {
        return this.f95501d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m95203e() {
        return this.f95503f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m95204f() {
        return this.f95506i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m95205g() {
        return !this.f95501d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m95206h() {
        return f95491k.containsKey(this.f95499b);
    }

    public int hashCode() {
        return (((((((((((((this.f95499b.hashCode() * 31) + (this.f95501d ? 1 : 0)) * 31) + (this.f95502e ? 1 : 0)) * 31) + (this.f95503f ? 1 : 0)) * 31) + (this.f95504g ? 1 : 0)) * 31) + (this.f95505h ? 1 : 0)) * 31) + (this.f95506i ? 1 : 0)) * 31) + (this.f95507j ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m95207i() {
        return this.f95503f || this.f95504g;
    }

    /* JADX INFO: renamed from: j */
    public String m95208j() {
        return this.f95500c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m95209k() {
        return this.f95505h;
    }

    public String toString() {
        return this.f95499b;
    }

    public C43300f(String str) {
        this.f95499b = str;
        this.f95500c = C43092b.m94679a(str);
    }

    /* JADX INFO: renamed from: o */
    public static C43300f m95198o(String str, C43298d c43298d) {
        C42841b.m93957i(str);
        Map<String, C43300f> map = f95491k;
        C43300f c43300f = map.get(str);
        if (c43300f == null) {
            String strM95186c = c43298d.m95186c(str);
            C42841b.m93955g(strM95186c);
            String strM94679a = C43092b.m94679a(strM95186c);
            C43300f c43300f2 = map.get(strM94679a);
            if (c43300f2 == null) {
                C43300f c43300f3 = new C43300f(strM95186c);
                c43300f3.f95501d = false;
                return c43300f3;
            }
            if (c43298d.m95188e() && !strM95186c.equals(strM94679a)) {
                C43300f c43300fClone = c43300f2.clone();
                c43300fClone.f95499b = strM95186c;
                return c43300fClone;
            }
            return c43300f2;
        }
        return c43300f;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C43300f clone() {
        try {
            return (C43300f) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }
}
