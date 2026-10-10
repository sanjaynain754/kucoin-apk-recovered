package if0;

import hf0.C38193b;
import java.util.Map;

/* JADX INFO: renamed from: if0.a */
/* JADX INFO: compiled from: Attribute.java */
/* JADX INFO: loaded from: classes60.dex */
public class C38528a implements Map.Entry<String, String>, Cloneable {

    /* JADX INFO: renamed from: b */
    public String f86493b;

    /* JADX INFO: renamed from: c */
    public String f86494c;

    /* JADX INFO: renamed from: d */
    public C38529b f86495d;

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C38528a c38528a = (C38528a) obj;
            String str = this.f86493b;
            if (str == null ? c38528a.f86493b != null : !str.equals(c38528a.f86493b)) {
                return false;
            }
            String str2 = this.f86494c;
            String str3 = c38528a.f86494c;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f86493b;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return this.f86494c;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        int iM87155i;
        String strM87154h = this.f86495d.m87154h(this.f86493b);
        C38529b c38529b = this.f86495d;
        if (c38529b != null && (iM87155i = c38529b.m87155i(this.f86493b)) != -1) {
            this.f86495d.f86499d[iM87155i] = str;
        }
        this.f86494c = str;
        return strM87154h;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f86493b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86494c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C38528a(String str, String str2, C38529b c38529b) {
        C38193b.m86181f(str);
        this.f86493b = str.trim();
        C38193b.m86180e(str);
        this.f86494c = str2;
        this.f86495d = c38529b;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38528a clone() {
        try {
            return (C38528a) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }
}
