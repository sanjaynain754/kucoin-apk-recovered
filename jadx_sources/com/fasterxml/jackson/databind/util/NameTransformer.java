package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String strReverse = this._t1.reverse(str);
            return strReverse != null ? this._t2.reverse(strReverse) : strReverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.NameTransformer$a */
    public static class C6481a extends NameTransformer {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10704b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f10705c;

        public C6481a(String str, String str2) {
            this.f10704b = str;
            this.f10705c = str2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (!str.startsWith(this.f10704b)) {
                return null;
            }
            String strSubstring = str.substring(this.f10704b.length());
            if (strSubstring.endsWith(this.f10705c)) {
                return strSubstring.substring(0, strSubstring.length() - this.f10705c.length());
            }
            return null;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.f10704b + "','" + this.f10705c + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f10704b + str + this.f10705c;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.NameTransformer$b */
    public static class C6482b extends NameTransformer {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10706b;

        public C6482b(String str) {
            this.f10706b = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.startsWith(this.f10706b)) {
                return str.substring(this.f10706b.length());
            }
            return null;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.f10706b + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f10706b + str;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.NameTransformer$c */
    public static class C6483c extends NameTransformer {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10707b;

        public C6483c(String str) {
            this.f10707b = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.endsWith(this.f10707b)) {
                return str.substring(0, str.length() - this.f10707b.length());
            }
            return null;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.f10707b + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str + this.f10707b;
        }
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        boolean z11 = false;
        boolean z12 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z11 = true;
        }
        if (z12) {
            return z11 ? new C6481a(str, str2) : new C6482b(str);
        }
        return z11 ? new C6483c(str2) : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }
}
