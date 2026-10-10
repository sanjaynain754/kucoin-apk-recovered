package com.sumsub.sns.internal.p126ml.facedetector.utils;

import android.graphics.PointF;
import android.graphics.RectF;
import com.sumsub.sns.internal.p126ml.facedetector.models.C33359c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.facedetector.utils.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33367b {
    /* JADX INFO: renamed from: a */
    public static final int m71668a(C33359c c33359c, C33359c c33359c2) {
        return Float.compare(c33359c2.f68034a, c33359c.f68034a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m71672b(C33359c c33359c, C33359c c33359c2) {
        return Float.compare(c33359c2.f68034a, c33359c.f68034a);
    }

    /* JADX INFO: renamed from: a */
    public static List m71670a(ArrayList arrayList) {
        ArrayList arrayList2;
        if (arrayList.size() == 0) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        final Function2 function2 = new Function2() { // from class: com.sumsub.sns.internal.ml.facedetector.utils.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C33367b.m71672b((C33359c) obj, (C33359c) obj2));
            }
        };
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.sumsub.sns.internal.ml.facedetector.utils.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C33367b.m71673b(function2, obj, obj2);
            }
        });
        while (!arrayList.isEmpty()) {
            int size = arrayList.size();
            arrayList5.clear();
            arrayList4.clear();
            C33359c c33359c = (C33359c) arrayList.get(0);
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                C33359c c33359c2 = (C33359c) obj;
                RectF rectF = c33359c2.f68035b;
                RectF rectF2 = c33359c.f68035b;
                float fMax = Math.max(0.0f, Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left)) * Math.max(0.0f, Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top));
                float f11 = (((rectF2.bottom - rectF2.top) * (rectF2.right - rectF2.left)) + ((rectF.bottom - rectF.top) * (rectF.right - rectF.left))) - fMax;
                if ((f11 > 0.0f ? fMax / f11 : 0.0f) > 0.3f) {
                    arrayList5.add(c33359c2);
                } else {
                    arrayList4.add(c33359c2);
                }
            }
            if (arrayList5.isEmpty()) {
                arrayList2 = arrayList5;
            } else {
                RectF rectF3 = new RectF();
                ArrayList arrayList6 = new ArrayList(c33359c.f68036c.size());
                int size3 = c33359c.f68036c.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    arrayList6.add(new PointF());
                }
                int size4 = arrayList5.size();
                float f12 = 0.0f;
                int i13 = 0;
                while (i13 < size4) {
                    Object obj2 = arrayList5.get(i13);
                    i13++;
                    C33359c c33359c3 = (C33359c) obj2;
                    float f13 = c33359c3.f68034a;
                    f12 += f13;
                    float f14 = rectF3.top;
                    RectF rectF4 = c33359c3.f68035b;
                    rectF3.top = (rectF4.top * f13) + f14;
                    rectF3.bottom = (rectF4.bottom * f13) + rectF3.bottom;
                    rectF3.left = (rectF4.left * f13) + rectF3.left;
                    rectF3.right = (rectF4.right * f13) + rectF3.right;
                    int size5 = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size5) {
                        PointF pointF = (PointF) arrayList6.get(i14);
                        ArrayList arrayList7 = arrayList5;
                        pointF.x = (((PointF) c33359c3.f68036c.get(i14)).x * c33359c3.f68034a) + pointF.x;
                        PointF pointF2 = (PointF) arrayList6.get(i14);
                        pointF2.y = (((PointF) c33359c3.f68036c.get(i14)).y * c33359c3.f68034a) + pointF2.y;
                        i14++;
                        arrayList5 = arrayList7;
                    }
                }
                arrayList2 = arrayList5;
                rectF3.top /= f12;
                rectF3.bottom /= f12;
                rectF3.left /= f12;
                rectF3.right /= f12;
                int size6 = arrayList6.size();
                for (int i15 = 0; i15 < size6; i15++) {
                    ((PointF) arrayList6.get(i15)).x /= f12;
                    ((PointF) arrayList6.get(i15)).y /= f12;
                }
                c33359c = new C33359c(f12 / arrayList2.size(), rectF3, arrayList6);
            }
            arrayList3.add(c33359c);
            if (size == arrayList4.size()) {
                break;
            }
            arrayList.clear();
            arrayList.addAll(arrayList4);
            arrayList5 = arrayList2;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: b */
    public static final int m71673b(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: a */
    public static List m71671a(List list, int i11) {
        if (list.size() == 0) {
            return list;
        }
        final Function2 function2 = new Function2() { // from class: com.sumsub.sns.internal.ml.facedetector.utils.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C33367b.m71668a((C33359c) obj, (C33359c) obj2));
            }
        };
        CollectionsKt.sortWith(list, new Comparator() { // from class: com.sumsub.sns.internal.ml.facedetector.utils.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C33367b.m71669a(function2, obj, obj2);
            }
        });
        return list.subList(0, Math.min(i11, list.size()));
    }

    /* JADX INFO: renamed from: a */
    public static final int m71669a(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }
}
