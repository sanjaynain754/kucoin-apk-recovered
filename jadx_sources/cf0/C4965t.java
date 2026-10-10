package cf0;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: cf0.t */
/* JADX INFO: compiled from: SpannableBuilder.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4965t implements Appendable, CharSequence {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f5542b;

    /* JADX INFO: renamed from: c */
    public final Deque<a> f5543c;

    public C4965t() {
        this("");
    }

    /* JADX INFO: renamed from: cf0.t$a */
    /* JADX INFO: compiled from: SpannableBuilder.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Object f5544a;

        /* JADX INFO: renamed from: b */
        public int f5545b;

        /* JADX INFO: renamed from: c */
        public int f5546c;

        /* JADX INFO: renamed from: d */
        public final int f5547d;

        public a(@NonNull Object obj, int i11, int i12, int i13) {
            this.f5544a = obj;
            this.f5545b = i11;
            this.f5546c = i12;
            this.f5547d = i13;
        }
    }

    /* JADX INFO: renamed from: cf0.t$b */
    /* JADX INFO: compiled from: SpannableBuilder.java */
    public static class b extends SpannableStringBuilder {
        public b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public C4965t(@NonNull CharSequence charSequence) {
        this.f5543c = new ArrayDeque(8);
        this.f5542b = new StringBuilder(charSequence);
        m5254e(0, charSequence);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static boolean m5247g(int i11, int i12, int i13) {
        return i13 > i12 && i12 >= 0 && i13 <= i11;
    }

    /* JADX INFO: renamed from: j */
    public static void m5248j(@NonNull C4965t c4965t, @Nullable Object obj, int i11, int i12) {
        if (obj == null || !m5247g(c4965t.length(), i11, i12)) {
            return;
        }
        m5249k(c4965t, obj, i11, i12);
    }

    /* JADX INFO: renamed from: k */
    public static void m5249k(@NonNull C4965t c4965t, @Nullable Object obj, int i11, int i12) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                c4965t.m5257i(obj, i11, i12, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                m5249k(c4965t, obj2, i11, i12);
            }
        }
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4965t append(char c11) {
        this.f5542b.append(c11);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.f5542b.charAt(i11);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C4965t m5253d(@NonNull String str) {
        this.f5542b.append(str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m5254e(int i11, @Nullable CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z11 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z11) {
                    for (int i12 = 0; i12 < length; i12++) {
                        Object obj = spans[i12];
                        m5257i(obj, spanned.getSpanStart(obj) + i11, spanned.getSpanEnd(obj) + i11, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i13 = length - 1; i13 >= 0; i13--) {
                    Object obj2 = spans[i13];
                    m5257i(obj2, spanned.getSpanStart(obj2) + i11, spanned.getSpanEnd(obj2) + i11, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public char m5256h() {
        return this.f5542b.charAt(length() - 1);
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C4965t m5257i(@NonNull Object obj, int i11, int i12, int i13) {
        this.f5543c.push(new a(obj, i11, i12, i13));
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public SpannableStringBuilder m5258l() {
        b bVar = new b(this.f5542b);
        for (a aVar : this.f5543c) {
            bVar.setSpan(aVar.f5544a, aVar.f5545b, aVar.f5546c, aVar.f5547d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f5542b.length();
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f5542b.toString();
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4965t append(@NonNull CharSequence charSequence) {
        m5254e(length(), charSequence);
        this.f5542b.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4965t append(CharSequence charSequence, int i11, int i12) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i11, i12);
        m5254e(length(), charSequenceSubSequence);
        this.f5542b.append(charSequenceSubSequence);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<a> m5255f(int i11, int i12) {
        int i13;
        int length = length();
        if (!m5247g(length, i11, i12)) {
            return Collections.EMPTY_LIST;
        }
        if (i11 == 0 && length == i12) {
            ArrayList arrayList = new ArrayList(this.f5543c);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> itDescendingIterator = this.f5543c.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            a next = itDescendingIterator.next();
            int i14 = next.f5545b;
            if ((i14 >= i11 && i14 < i12) || (((i13 = next.f5546c) <= i12 && i13 > i11) || (i14 < i11 && i13 > i12))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        List<a> listM5255f = m5255f(i11, i12);
        if (listM5255f.isEmpty()) {
            return this.f5542b.subSequence(i11, i12);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f5542b.subSequence(i11, i12));
        int length = spannableStringBuilder.length();
        for (a aVar : listM5255f) {
            int iMax = Math.max(0, aVar.f5545b - i11);
            spannableStringBuilder.setSpan(aVar.f5544a, iMax, Math.min(length, (aVar.f5546c - aVar.f5545b) + iMax), aVar.f5547d);
        }
        return spannableStringBuilder;
    }
}
