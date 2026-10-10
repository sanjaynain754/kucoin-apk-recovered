package com.kubi.utils.stickylayout;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.sdk.utils.R$id;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.kubi.utils.stickylayout.a */
/* JADX INFO: compiled from: SectioningAdapter.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27089a extends RecyclerView.Adapter<g> {

    /* JADX INFO: renamed from: i */
    public ArrayList<f> f54435i;

    /* JADX INFO: renamed from: j */
    public HashMap<Integer, Boolean> f54436j = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public HashMap<Integer, Object> f54437k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public int[] f54438l;

    /* JADX INFO: renamed from: m */
    public int f54439m;

    /* JADX INFO: renamed from: com.kubi.utils.stickylayout.a$b */
    /* JADX INFO: compiled from: SectioningAdapter.java */
    public static class b extends g {
    }

    /* JADX INFO: renamed from: com.kubi.utils.stickylayout.a$d */
    /* JADX INFO: compiled from: SectioningAdapter.java */
    public static class d extends g {
    }

    /* JADX INFO: renamed from: com.kubi.utils.stickylayout.a$e */
    /* JADX INFO: compiled from: SectioningAdapter.java */
    public static class e extends g {

        /* JADX INFO: renamed from: i */
        public int f54440i;

        /* JADX INFO: renamed from: e */
        public final void m66889e(int i11) {
            this.f54440i = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.stickylayout.a$f */
    /* JADX INFO: compiled from: SectioningAdapter.java */
    public static class f {

        /* JADX INFO: renamed from: a */
        public int f54441a;

        /* JADX INFO: renamed from: b */
        public int f54442b;

        /* JADX INFO: renamed from: c */
        public int f54443c;

        /* JADX INFO: renamed from: d */
        public boolean f54444d;

        /* JADX INFO: renamed from: e */
        public boolean f54445e;

        public f() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.stickylayout.a$g */
    /* JADX INFO: compiled from: SectioningAdapter.java */
    public static class g extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public int f54446g;

        /* JADX INFO: renamed from: h */
        public int f54447h;

        /* JADX INFO: renamed from: b */
        public void m66891b(int i11) {
            this.f54447h = i11;
        }

        /* JADX INFO: renamed from: c */
        public final void m66892c(int i11) {
            this.f54446g = i11;
        }

        public g(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: B */
    public b m66863B(ViewGroup viewGroup, int i11) {
        return null;
    }

    /* JADX INFO: renamed from: D */
    public d m66865D(ViewGroup viewGroup, int i11) {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public e m66866E(ViewGroup viewGroup, int i11) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        int iM66881s;
        int i12 = 0;
        try {
            if (this.f54435i == null) {
                m66869g();
            }
            if (i11 < 0) {
                throw new IndexOutOfBoundsException("adapterPosition (" + i11 + ") cannot be < 0");
            }
            if (i11 >= getItemCount()) {
                throw new IndexOutOfBoundsException("adapterPosition (" + i11 + ")  cannot be > getItemCount() (" + getItemCount() + ")");
            }
            int iM66880r = m66880r(i11);
            f fVar = this.f54435i.get(iM66880r);
            int i13 = i11 - fVar.f54441a;
            int iM66875m = m66875m(fVar, i13);
            if (iM66875m == 0) {
                iM66881s = m66881s(iM66880r);
                if (iM66881s < 0 || iM66881s > 255) {
                    throw new IllegalArgumentException("Custom header view type (" + iM66881s + ") must be in range [0,255]");
                }
            } else {
                if (iM66875m != 2) {
                    if (iM66875m == 3) {
                        iM66881s = m66879q(iM66880r);
                        if (iM66881s < 0 || iM66881s > 255) {
                            throw new IllegalArgumentException("Custom footer view type (" + iM66881s + ") must be in range [0,255]");
                        }
                    }
                    return ((i12 & 255) << 8) | (iM66875m & 255);
                }
                if (fVar.f54444d) {
                    i13 -= 2;
                }
                iM66881s = m66882t(iM66880r, i13);
                if (iM66881s < 0 || iM66881s > 255) {
                    throw new IllegalArgumentException("Custom item view type (" + iM66881s + ") must be in range [0,255]");
                }
            }
            i12 = iM66881s;
            return ((i12 & 255) << 8) | (iM66875m & 255);
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m66870h(int i11) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m66871i(int i11) {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public int m66876n(int i11) {
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int m66877o() {
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public int m66879q(int i11) {
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public int m66881s(int i11) {
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int m66882t(int i11, int i12) {
        return 0;
    }

    /* JADX INFO: renamed from: com.kubi.utils.stickylayout.a$c */
    /* JADX INFO: compiled from: SectioningAdapter.java */
    public static class c extends g {
        public c(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: H */
    public static int m66860H(int i11) {
        return i11 & 255;
    }

    /* JADX INFO: renamed from: I */
    public static int m66861I(int i11) {
        return (i11 >> 8) & 255;
    }

    /* JADX INFO: renamed from: C */
    public c m66864C(ViewGroup viewGroup) {
        return new c(new View(viewGroup.getContext()));
    }

    /* JADX INFO: renamed from: G */
    public void m66868G(g gVar, int i11, int i12) {
        gVar.itemView.setTag(R$id.sectioning_adapter_tag_key_view_viewholder, gVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m66869g() {
        int i11;
        this.f54435i = new ArrayList<>();
        int iM66877o = m66877o();
        int i12 = 0;
        for (int i13 = 0; i13 < iM66877o; i13++) {
            f fVar = new f();
            fVar.f54441a = i12;
            fVar.f54444d = m66871i(i13);
            fVar.f54445e = m66870h(i13);
            if (m66883u(i13)) {
                fVar.f54443c = 0;
                fVar.f54442b = m66876n(i13);
            } else {
                int iM66876n = m66876n(i13);
                fVar.f54442b = iM66876n;
                fVar.f54443c = iM66876n;
            }
            if (fVar.f54444d) {
                fVar.f54443c += 2;
            }
            if (fVar.f54445e) {
                fVar.f54443c++;
            }
            this.f54435i.add(fVar);
            i12 += fVar.f54443c;
        }
        this.f54439m = i12;
        this.f54438l = new int[i12];
        int iM66877o2 = m66877o();
        int i14 = 0;
        for (int i15 = 0; i15 < iM66877o2; i15++) {
            f fVar2 = this.f54435i.get(i15);
            int i16 = 0;
            while (true) {
                i11 = fVar2.f54443c;
                if (i16 < i11) {
                    this.f54438l[i14 + i16] = i15;
                    i16++;
                }
            }
            i14 += i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f54435i == null) {
            m66869g();
        }
        return this.f54439m;
    }

    /* JADX INFO: renamed from: j */
    public final int m66872j(int i11, int i12) {
        if (this.f54435i == null) {
            m66869g();
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("sectionIndex " + i11 + " < 0");
        }
        if (i11 < this.f54435i.size()) {
            return i12 + this.f54435i.get(i11).f54441a;
        }
        throw new IndexOutOfBoundsException("sectionIndex " + i11 + " >= sections.size (" + this.f54435i.size() + ")");
    }

    /* JADX INFO: renamed from: m */
    public int m66875m(f fVar, int i11) {
        boolean z11 = fVar.f54444d;
        if (z11 && fVar.f54445e) {
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 1) {
                return 1;
            }
            return i11 == fVar.f54443c - 1 ? 3 : 2;
        }
        if (!z11) {
            return (fVar.f54445e && i11 == fVar.f54443c - 1) ? 3 : 2;
        }
        if (i11 == 0) {
            return 0;
        }
        return i11 == 1 ? 1 : 2;
    }

    /* JADX INFO: renamed from: p */
    public int m66878p(int i11, int i12) {
        if (this.f54435i == null) {
            m66869g();
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("sectionIndex " + i11 + " < 0");
        }
        if (i11 >= this.f54435i.size()) {
            throw new IndexOutOfBoundsException("sectionIndex " + i11 + " >= sections.size (" + this.f54435i.size() + ")");
        }
        f fVar = this.f54435i.get(i11);
        int i13 = i12 - fVar.f54441a;
        if (i13 <= fVar.f54443c) {
            return fVar.f54444d ? i13 - 2 : i13;
        }
        throw new IndexOutOfBoundsException("adapterPosition: " + i12 + " is beyond sectionIndex: " + i11 + " length: " + fVar.f54443c);
    }

    /* JADX INFO: renamed from: r */
    public int m66880r(int i11) {
        if (this.f54435i == null) {
            m66869g();
        }
        if (getItemCount() == 0) {
            return -1;
        }
        if (i11 >= 0 && i11 < getItemCount()) {
            return this.f54438l[i11];
        }
        throw new IndexOutOfBoundsException("adapterPosition " + i11 + " is not in range of items represented by adapter");
    }

    /* JADX INFO: renamed from: u */
    public boolean m66883u(int i11) {
        if (this.f54436j.containsKey(Integer.valueOf(i11))) {
            return this.f54436j.get(Integer.valueOf(i11)).booleanValue();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(g gVar, int i11) {
        int iM66880r = m66880r(i11);
        gVar.m66892c(iM66880r);
        gVar.m66891b(m66876n(iM66880r));
        m66868G(gVar, iM66880r, i11);
        int iM66860H = m66860H(gVar.getItemViewType());
        int iM66861I = m66861I(gVar.getItemViewType());
        if (iM66860H != 0) {
            if (iM66860H != 1) {
                if (iM66860H != 2) {
                    if (iM66860H == 3) {
                        m66884v((b) gVar, iM66880r, iM66861I);
                        return;
                    }
                    throw new IllegalArgumentException("unrecognized viewType: " + iM66860H + " does not correspond to TYPE_ITEM, TYPE_HEADER, TYPE_GHOST_HEADER or TYPE_FOOTER");
                }
                e eVar = (e) gVar;
                int iM66878p = m66878p(iM66880r, i11);
                eVar.m66889e(iM66878p);
                m66887y(eVar, iM66880r, iM66878p, iM66861I);
                return;
            }
            m66885w((c) gVar, iM66880r);
            return;
        }
        m66886x((d) gVar, iM66880r, iM66861I);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public g onCreateViewHolder(ViewGroup viewGroup, int i11) {
        int iM66860H = m66860H(i11);
        int iM66861I = m66861I(i11);
        if (iM66860H != 0) {
            if (iM66860H != 1) {
                if (iM66860H != 2) {
                    if (iM66860H == 3) {
                        return m66863B(viewGroup, iM66861I);
                    }
                    throw new IndexOutOfBoundsException("unrecognized viewType: " + i11 + " does not correspond to TYPE_ITEM, TYPE_HEADER or TYPE_FOOTER");
                }
                return m66866E(viewGroup, iM66861I);
            }
            return m66864C(viewGroup);
        }
        return m66865D(viewGroup, iM66861I);
    }

    /* JADX INFO: renamed from: k */
    public int m66873k(int i11) {
        if (m66871i(i11)) {
            return m66872j(i11, 0);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public int m66874l(int i11) {
        return m66860H(getItemViewType(i11));
    }

    /* JADX INFO: renamed from: y */
    public void m66887y(e eVar, int i11, int i12, int i13) {
    }

    /* JADX INFO: renamed from: v */
    public void m66884v(b bVar, int i11, int i12) {
    }

    /* JADX INFO: renamed from: x */
    public void m66886x(d dVar, int i11, int i12) {
    }

    /* JADX INFO: renamed from: w */
    public void m66885w(c cVar, int i11) {
    }
}
