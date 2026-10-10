package l10;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.widget.TextView;
import n10.C42700b;
import n10.C42701c;
import n10.C42702d;
import o10.InterfaceC42933c;

/* JADX INFO: renamed from: l10.c */
/* JADX INFO: compiled from: TextColorBuilder.java */
/* JADX INFO: loaded from: classes43.dex */
public final class C42026c {

    /* JADX INFO: renamed from: a */
    public final TextView f92262a;

    /* JADX INFO: renamed from: b */
    public int f92263b;

    /* JADX INFO: renamed from: c */
    public Integer f92264c;

    /* JADX INFO: renamed from: d */
    public Integer f92265d;

    /* JADX INFO: renamed from: e */
    public Integer f92266e;

    /* JADX INFO: renamed from: f */
    public Integer f92267f;

    /* JADX INFO: renamed from: g */
    public Integer f92268g;

    /* JADX INFO: renamed from: h */
    public int[] f92269h;

    /* JADX INFO: renamed from: i */
    public int f92270i;

    /* JADX INFO: renamed from: j */
    public int f92271j;

    /* JADX INFO: renamed from: k */
    public int f92272k;

    /* JADX INFO: renamed from: a */
    public ColorStateList m92154a() {
        int i11;
        Integer num = this.f92264c;
        if (num == null && this.f92265d == null && this.f92266e == null && this.f92267f == null && this.f92268g == null) {
            return ColorStateList.valueOf(this.f92263b);
        }
        int[][] iArr = new int[6][];
        int[] iArr2 = new int[6];
        if (num != null) {
            iArr[0] = new int[]{R.attr.state_pressed};
            iArr2[0] = num.intValue();
            i11 = 1;
        } else {
            i11 = 0;
        }
        Integer num2 = this.f92265d;
        if (num2 != null) {
            iArr[i11] = new int[]{R.attr.state_checked};
            iArr2[i11] = num2.intValue();
            i11++;
        }
        Integer num3 = this.f92266e;
        if (num3 != null) {
            iArr[i11] = new int[]{-16842910};
            iArr2[i11] = num3.intValue();
            i11++;
        }
        Integer num4 = this.f92267f;
        if (num4 != null) {
            iArr[i11] = new int[]{R.attr.state_focused};
            iArr2[i11] = num4.intValue();
            i11++;
        }
        Integer num5 = this.f92268g;
        if (num5 != null) {
            iArr[i11] = new int[]{R.attr.state_selected};
            iArr2[i11] = num5.intValue();
            i11++;
        }
        iArr[i11] = new int[0];
        iArr2[i11] = this.f92263b;
        int i12 = i11 + 1;
        if (i12 != 6) {
            int[][] iArr3 = new int[i12][];
            int[] iArr4 = new int[i12];
            System.arraycopy(iArr, 0, iArr3, 0, i12);
            System.arraycopy(iArr2, 0, iArr4, 0, i12);
            iArr = iArr3;
            iArr2 = iArr4;
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: b */
    public SpannableString m92155b(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        C42700b c42700bM93592f = m92157d() ? new C42700b().m93590d(this.f92269h).m93591e(this.f92270i).m93592f(null) : null;
        C42702d c42702dM93594e = m92158e() ? new C42702d().m93593d(this.f92271j).m93594e(this.f92272k) : null;
        if (c42700bM93592f != null && c42702dM93594e != null) {
            spannableString.setSpan(new C42701c(c42702dM93594e, c42700bM93592f), 0, spannableString.length(), 33);
            return spannableString;
        }
        if (c42700bM93592f != null) {
            spannableString.setSpan(c42700bM93592f, 0, spannableString.length(), 33);
            return spannableString;
        }
        if (c42702dM93594e != null) {
            spannableString.setSpan(c42702dM93594e, 0, spannableString.length(), 33);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: c */
    public void m92156c() {
        this.f92262a.setTextColor(m92154a());
        if (m92157d() || m92158e()) {
            TextView textView = this.f92262a;
            textView.setText(m92155b(textView.getText()));
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m92157d() {
        int[] iArr = this.f92269h;
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m92158e() {
        return this.f92271j != 0 && this.f92272k > 0;
    }

    /* JADX INFO: renamed from: f */
    public C42026c m92159f(int i11) {
        this.f92263b = i11;
        return this;
    }

    public C42026c(TextView textView, TypedArray typedArray, InterfaceC42933c interfaceC42933c) {
        this.f92262a = textView;
        this.f92263b = typedArray.getColor(interfaceC42933c.mo94273g(), textView.getTextColors().getDefaultColor());
        if (typedArray.hasValue(interfaceC42933c.mo94269H())) {
            this.f92264c = Integer.valueOf(typedArray.getColor(interfaceC42933c.mo94269H(), this.f92263b));
        }
        if (interfaceC42933c.mo94272d0() > 0 && typedArray.hasValue(interfaceC42933c.mo94272d0())) {
            this.f92265d = Integer.valueOf(typedArray.getColor(interfaceC42933c.mo94272d0(), this.f92263b));
        }
        if (typedArray.hasValue(interfaceC42933c.mo94276v())) {
            this.f92266e = Integer.valueOf(typedArray.getColor(interfaceC42933c.mo94276v(), this.f92263b));
        }
        if (typedArray.hasValue(interfaceC42933c.mo94275p())) {
            this.f92267f = Integer.valueOf(typedArray.getColor(interfaceC42933c.mo94275p(), this.f92263b));
        }
        if (typedArray.hasValue(interfaceC42933c.mo94268F())) {
            this.f92268g = Integer.valueOf(typedArray.getColor(interfaceC42933c.mo94268F(), this.f92263b));
        }
        if (typedArray.hasValue(interfaceC42933c.mo94267C()) && typedArray.hasValue(interfaceC42933c.mo94270Q())) {
            if (typedArray.hasValue(interfaceC42933c.mo94266B())) {
                this.f92269h = new int[]{typedArray.getColor(interfaceC42933c.mo94267C(), this.f92263b), typedArray.getColor(interfaceC42933c.mo94266B(), this.f92263b), typedArray.getColor(interfaceC42933c.mo94270Q(), this.f92263b)};
            } else {
                this.f92269h = new int[]{typedArray.getColor(interfaceC42933c.mo94267C(), this.f92263b), typedArray.getColor(interfaceC42933c.mo94270Q(), this.f92263b)};
            }
        }
        this.f92270i = typedArray.getColor(interfaceC42933c.mo94277y(), 0);
        if (typedArray.hasValue(interfaceC42933c.mo94271c())) {
            this.f92271j = typedArray.getColor(interfaceC42933c.mo94271c(), 0);
        }
        if (typedArray.hasValue(interfaceC42933c.mo94274h0())) {
            this.f92272k = typedArray.getDimensionPixelSize(interfaceC42933c.mo94274h0(), 0);
        }
    }
}
