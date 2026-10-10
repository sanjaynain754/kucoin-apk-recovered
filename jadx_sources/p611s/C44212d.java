package p611s;

import ai.advance.sdk.global.iqa.lib.enums.CardSide;
import ai.advance.sdk.global.iqa.lib.enums.CardType;

/* JADX INFO: renamed from: s.d */
/* JADX INFO: loaded from: classes23.dex */
public class C44212d {

    /* JADX INFO: renamed from: a */
    public String f97609a;

    /* JADX INFO: renamed from: b */
    public CardSide f97610b;

    /* JADX INFO: renamed from: c */
    public CardType f97611c;

    /* JADX INFO: renamed from: d */
    public String f97612d;

    /* JADX INFO: renamed from: e */
    public int f97613e;

    /* JADX INFO: renamed from: f */
    public boolean f97614f;

    /* JADX INFO: renamed from: g */
    public int f97615g = 20;

    /* JADX INFO: renamed from: s.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f97616a;

        /* JADX INFO: renamed from: b */
        public CardSide f97617b;

        /* JADX INFO: renamed from: c */
        public CardType f97618c;

        /* JADX INFO: renamed from: d */
        public boolean f97619d;

        /* JADX INFO: renamed from: e */
        public int f97620e;

        /* JADX INFO: renamed from: f */
        public int f97621f;

        /* JADX INFO: renamed from: a */
        public C44212d m97483a() {
            C44212d c44212d = new C44212d();
            c44212d.f97610b = this.f97617b;
            c44212d.f97611c = this.f97618c;
            c44212d.f97609a = this.f97616a;
            c44212d.f97613e = this.f97620e;
            c44212d.f97615g = this.f97621f;
            c44212d.f97614f = this.f97619d;
            return c44212d;
        }

        /* JADX INFO: renamed from: b */
        public a m97484b(CardSide cardSide) {
            this.f97617b = cardSide;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m97485c(CardType cardType) {
            this.f97618c = cardType;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m97486d(String str) {
            this.f97616a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m97487e(int i11) {
            this.f97621f = i11;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m97488f(boolean z11) {
            this.f97619d = z11;
            return this;
        }
    }
}
