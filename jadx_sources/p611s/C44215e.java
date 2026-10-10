package p611s;

import ai.advance.sdk.global.iqa.lib.enums.CardSide;
import ai.advance.sdk.global.iqa.lib.enums.CardType;

/* JADX INFO: renamed from: s.e */
/* JADX INFO: loaded from: classes23.dex */
public class C44215e {

    /* JADX INFO: renamed from: a */
    public String f97623a;

    /* JADX INFO: renamed from: b */
    public CardSide f97624b;

    /* JADX INFO: renamed from: c */
    public CardType f97625c;

    /* JADX INFO: renamed from: d */
    public String f97626d;

    /* JADX INFO: renamed from: e */
    public int f97627e;

    /* JADX INFO: renamed from: s.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public String f97628a;

        /* JADX INFO: renamed from: b */
        public CardSide f97629b;

        /* JADX INFO: renamed from: c */
        public CardType f97630c;

        /* JADX INFO: renamed from: d */
        public int f97631d;

        /* JADX INFO: renamed from: a */
        public C44215e m97491a() {
            C44215e c44215e = new C44215e();
            c44215e.f97625c = this.f97630c;
            c44215e.f97623a = this.f97628a;
            c44215e.f97627e = this.f97631d;
            c44215e.f97624b = this.f97629b;
            return c44215e;
        }

        /* JADX INFO: renamed from: b */
        public b m97492b(CardSide cardSide) {
            this.f97629b = cardSide;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m97493c(CardType cardType) {
            this.f97630c = cardType;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m97494d(String str) {
            this.f97628a = str;
            return this;
        }
    }

    public C44215e() {
    }
}
