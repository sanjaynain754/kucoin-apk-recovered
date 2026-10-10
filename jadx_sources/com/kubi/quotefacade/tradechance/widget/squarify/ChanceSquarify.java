package com.kubi.quotefacade.tradechance.widget.squarify;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.widget.squarify.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChanceSquarify.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J0\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002J0\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarify;", "", "<init>", "()V", "squarifyRatio", "", "ratio", "", "parent", "Lcom/kubi/quotefacade/tradechance/widget/squarify/ChanceSquarifyNode;", "x0", "y0", "x1", "y1", "treeMapDice", "treeMapSlice", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChanceSquarify {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ChanceSquarify f42724a = new ChanceSquarify();

    /* JADX INFO: renamed from: b */
    public final void m53289b(ChanceSquarifyNode chanceSquarifyNode, double d11, double d12, double d13, double d14) {
        double f42728d = (d13 - d11) / chanceSquarifyNode.getF42728d();
        double f42728d2 = chanceSquarifyNode.getF42728d();
        if (chanceSquarifyNode.getF42728d() == 0.0d || f42728d == 0.0d) {
            f42728d = f42728d2;
        }
        for (int i11 = 0; i11 < chanceSquarifyNode.m53292b().size(); i11++) {
            ChanceSquarifyNode chanceSquarifyNode2 = chanceSquarifyNode.m53292b().get(i11);
            chanceSquarifyNode2.m53303m(d12);
            chanceSquarifyNode2.m53304n(d14);
            chanceSquarifyNode2.m53301k(d11);
            d11 += chanceSquarifyNode2.getF42728d() * f42728d;
            chanceSquarifyNode2.m53302l(d11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m53290c(ChanceSquarifyNode chanceSquarifyNode, double d11, double d12, double d13, double d14) {
        double f42728d = (d14 - d12) / chanceSquarifyNode.getF42728d();
        double f42728d2 = chanceSquarifyNode.getF42728d();
        if (chanceSquarifyNode.getF42728d() == 0.0d || f42728d == 0.0d) {
            f42728d = f42728d2;
        }
        for (int i11 = 0; i11 < chanceSquarifyNode.m53292b().size(); i11++) {
            ChanceSquarifyNode chanceSquarifyNode2 = chanceSquarifyNode.m53292b().get(i11);
            chanceSquarifyNode2.m53301k(d11);
            chanceSquarifyNode2.m53302l(d13);
            chanceSquarifyNode2.m53303m(d12);
            d12 += chanceSquarifyNode2.getF42728d() * f42728d;
            chanceSquarifyNode2.m53304n(d12);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m53288a(double d11, @NotNull ChanceSquarifyNode chanceSquarifyNode, double d12, double d13, double d14, double d15) {
        double f42728d;
        int i11;
        ChanceSquarifyNode parent = chanceSquarifyNode;
        Intrinsics.checkNotNullParameter(parent, "parent");
        double f42728d2 = parent.getF42728d();
        double d16 = d12;
        double d17 = d13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < parent.m53292b().size()) {
            double d18 = d14 - d16;
            double d19 = d15 - d17;
            do {
                f42728d = parent.m53292b().get(i13).getF42728d();
                i13++;
                if (f42728d != 0.0d) {
                    break;
                }
            } while (i13 < parent.m53292b().size());
            double d21 = f42728d2;
            double dMax = Math.max(d19 / d18, d18 / d19) / (d21 * d11);
            double d22 = 2;
            double dPow = Math.pow(f42728d, d22) * dMax;
            double d23 = d16;
            int i14 = i13;
            double dMax2 = Math.max(f42728d / dPow, dPow / f42728d);
            int size = chanceSquarifyNode.m53292b().size();
            int i15 = i14;
            double d24 = f42728d;
            double d25 = d24;
            while (true) {
                if (i14 >= size) {
                    i11 = i15;
                    break;
                }
                double f42728d3 = chanceSquarifyNode.m53292b().get(i14).getF42728d();
                f42728d += f42728d3;
                if (f42728d3 < d24) {
                    d24 = f42728d3;
                }
                if (f42728d3 > d25) {
                    d25 = f42728d3;
                }
                double dPow2 = Math.pow(f42728d, d22) * dMax;
                double d26 = dMax2;
                double d27 = d22;
                dMax2 = Math.max(d25 / dPow2, dPow2 / d24);
                if (dMax2 > d26) {
                    f42728d -= f42728d3;
                    i11 = i14;
                    break;
                } else {
                    i15 = i14 + 1;
                    i14 = i15;
                    d22 = d27;
                }
            }
            double d28 = f42728d;
            ChanceSquarifyNode chanceSquarifyNode2 = new ChanceSquarifyNode(d28, 0.0d, null, null, 14, null);
            chanceSquarifyNode2.m53299i(d18 < d19);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(chanceSquarifyNode.m53292b().subList(i12, i11));
            chanceSquarifyNode2.m53298h(arrayList);
            if (chanceSquarifyNode2.getF42729e()) {
                double d29 = d21 == 0.0d ? d15 : ((d19 * d28) / d21) + d17;
                d16 = d23;
                m53289b(chanceSquarifyNode2, d16, d17, d14, d29);
                if (d21 != 0.0d) {
                    d17 = d29;
                }
            } else {
                d16 = d23;
                double d31 = d21 == 0.0d ? d14 : d16 + ((d18 * d28) / d21);
                m53290c(chanceSquarifyNode2, d16, d17, d31, d15);
                double d32 = d31;
                if (d21 != 0.0d) {
                    d16 = d32;
                }
            }
            f42728d2 = d21 - d28;
            parent = chanceSquarifyNode;
            i12 = i11;
            i13 = i12;
        }
    }
}
