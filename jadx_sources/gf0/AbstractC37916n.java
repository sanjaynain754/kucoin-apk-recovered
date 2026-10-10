package gf0;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: gf0.n */
/* JADX INFO: compiled from: TrimmingAppender.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC37916n {

    /* JADX INFO: renamed from: gf0.n$a */
    /* JADX INFO: compiled from: TrimmingAppender.java */
    public static class a extends AbstractC37916n {
        @Override // gf0.AbstractC37916n
        /* JADX INFO: renamed from: a */
        public <T extends Appendable & CharSequence> void mo85737a(@NonNull T t11, @NonNull String str) {
            int length;
            T t12 = t11;
            int length2 = t12.length();
            int length3 = str.length();
            boolean z11 = false;
            for (int i11 = 0; i11 < length3; i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isWhitespace(cCharAt)) {
                    z11 = true;
                } else {
                    if (z11 && (length = t12.length()) > 0 && !Character.isWhitespace(t12.charAt(length - 1))) {
                        AbstractC37903a.m85677a(t11, ' ');
                    }
                    AbstractC37903a.m85677a(t11, cCharAt);
                    z11 = false;
                }
            }
            if (!z11 || length2 >= t12.length()) {
                return;
            }
            AbstractC37903a.m85677a(t11, ' ');
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract <T extends Appendable & CharSequence> void mo85737a(@NonNull T t11, @NonNull String str);

    @NonNull
    /* JADX INFO: renamed from: b */
    public static AbstractC37916n m85736b() {
        return new a();
    }
}
