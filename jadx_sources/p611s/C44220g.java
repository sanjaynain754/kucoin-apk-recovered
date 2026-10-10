package p611s;

import ai.advance.sdk.global.iqa.lib.enums.CardSide;
import ai.advance.sdk.global.iqa.lib.enums.CardType;

/* JADX INFO: renamed from: s.g */
/* JADX INFO: loaded from: classes23.dex */
public class C44220g {

    /* JADX INFO: renamed from: a */
    public String f97651a;

    /* JADX INFO: renamed from: b */
    public CardSide f97652b;

    /* JADX INFO: renamed from: c */
    public CardType f97653c;

    /* JADX INFO: renamed from: d */
    public boolean f97654d;

    /* JADX INFO: renamed from: e */
    public String f97655e;

    /* JADX INFO: renamed from: f */
    public String f97656f;

    /* JADX INFO: renamed from: g */
    public int f97657g;

    /* JADX INFO: renamed from: h */
    public int f97658h;

    /* JADX INFO: renamed from: i */
    public boolean f97659i;

    /* JADX INFO: renamed from: j */
    public boolean f97660j;

    /* JADX INFO: renamed from: k */
    public int f97661k;

    /* JADX INFO: renamed from: s.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f97662a;

        /* JADX INFO: renamed from: b */
        public CardSide f97663b;

        /* JADX INFO: renamed from: c */
        public CardType f97664c;

        /* JADX INFO: renamed from: d */
        public boolean f97665d;

        /* JADX INFO: renamed from: e */
        public String f97666e;

        /* JADX INFO: renamed from: f */
        public String f97667f;

        /* JADX INFO: renamed from: g */
        public int f97668g;

        /* JADX INFO: renamed from: h */
        public int f97669h;

        /* JADX INFO: renamed from: i */
        public int f97670i;

        /* JADX INFO: renamed from: j */
        public boolean f97671j;

        /* JADX INFO: renamed from: k */
        public boolean f97672k;

        /* JADX INFO: renamed from: a */
        public a m97506a(String str) {
            this.f97667f = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C44220g m97507b() {
            C44220g c44220g = new C44220g();
            c44220g.f97654d = this.f97665d;
            c44220g.f97658h = this.f97669h;
            c44220g.f97651a = this.f97662a;
            c44220g.f97652b = this.f97663b;
            c44220g.f97661k = this.f97670i;
            c44220g.f97653c = this.f97664c;
            c44220g.f97657g = this.f97668g;
            c44220g.f97655e = this.f97666e;
            c44220g.f97656f = this.f97667f;
            c44220g.f97659i = this.f97671j;
            c44220g.f97660j = this.f97672k;
            return c44220g;
        }

        /* JADX INFO: renamed from: c */
        public a m97508c(CardSide cardSide) {
            this.f97663b = cardSide;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m97509d(CardType cardType) {
            this.f97664c = cardType;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m97510e(String str) {
            this.f97666e = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m97511f(boolean z11) {
            this.f97672k = z11;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m97512g(boolean z11) {
            this.f97665d = z11;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m97513h(int i11) {
            this.f97670i = i11;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m97514i(String str) {
            this.f97662a = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m97515j(int i11) {
            this.f97668g = i11;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m97516k(int i11) {
            this.f97669h = i11;
            this.f97671j = i11 == 1;
            return this;
        }
    }

    public String toString() {
        return "DetectorConfig{region='" + this.f97651a + "', cardSide=" + this.f97652b + ", cardType=" + this.f97653c + ", isScanMode=" + this.f97654d + ", eventId='" + this.f97655e + "', pageId='" + this.f97656f + "', scanTimeoutLimitSeconds=" + this.f97657g + ", screenOrient=" + this.f97658h + ", isPortrait=" + this.f97659i + ", isFrontCamera=" + this.f97660j + '}';
    }
}
