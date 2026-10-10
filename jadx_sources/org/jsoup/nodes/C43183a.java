package org.jsoup.nodes;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import nh0.C42841b;
import oh0.C43093c;
import org.jsoup.SerializationException;

/* JADX INFO: renamed from: org.jsoup.nodes.a */
/* JADX INFO: compiled from: Attribute.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43183a implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: e */
    public static final String[] f95375e = {"allowfullscreen", BaseJavaModule.METHOD_TYPE_ASYNC, "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", ViewProps.HIDDEN, "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: b */
    public String f95376b;

    /* JADX INFO: renamed from: c */
    public String f95377c;

    /* JADX INFO: renamed from: d */
    public C43184b f95378d;

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C43183a c43183a = (C43183a) obj;
            String str = this.f95376b;
            if (str == null ? c43183a.f95376b != null : !str.equals(c43183a.f95376b)) {
                return false;
            }
            String str2 = this.f95377c;
            String str3 = c43183a.f95377c;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m94917g(String str) {
        return Arrays.binarySearch(f95375e, str) >= 0;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f95376b;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return C43184b.m94929h(this.f95377c);
    }

    /* JADX INFO: renamed from: e */
    public void m94923e(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        m94916f(this.f95376b, this.f95377c, appendable, outputSettings);
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        String strM94946l = this.f95377c;
        C43184b c43184b = this.f95378d;
        if (c43184b != null) {
            strM94946l = c43184b.m94946l(this.f95376b);
            int iM94952y = this.f95378d.m94952y(this.f95376b);
            if (iM94952y != -1) {
                this.f95378d.f95382d[iM94952y] = str;
            }
        }
        this.f95377c = str;
        return C43184b.m94929h(strM94946l);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f95376b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f95377c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C43183a(String str, String str2, C43184b c43184b) {
        C42841b.m93957i(str);
        String strTrim = str.trim();
        C42841b.m93955g(strTrim);
        this.f95376b = strTrim;
        this.f95377c = str2;
        this.f95378d = c43184b;
    }

    /* JADX INFO: renamed from: f */
    public static void m94916f(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(str);
        if (!m94918i(str, str2, outputSettings)) {
            appendable.append("=\"");
            Entities.m94912e(appendable, C43184b.m94929h(str2), outputSettings, true, false, false);
            appendable.append('\"');
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m94918i(String str, String str2, Document.OutputSettings outputSettings) {
        if (outputSettings.m94829k() == Document.OutputSettings.Syntax.html) {
            if (str2 != null) {
                if (("".equals(str2) || str2.equalsIgnoreCase(str)) && m94917g(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C43183a clone() {
        try {
            return (C43183a) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public String m94922d() {
        StringBuilder sbM94683b = C43093c.m94683b();
        try {
            m94923e(sbM94683b, new Document("").m94813s1());
            return C43093c.m94694m(sbM94683b);
        } catch (IOException e11) {
            throw new SerializationException(e11);
        }
    }

    public String toString() {
        return m94922d();
    }
}
