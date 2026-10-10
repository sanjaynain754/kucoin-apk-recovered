package com.tencent.liteav.videoproducer.capture;

import com.tencent.bugly.proguard.C33556b3;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videoproducer.p139a.C34947a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C34958c {
    /* JADX INFO: renamed from: a */
    public static Size m76735a(List<Size> list, EnumC34747l enumC34747l, int i11, int i12) {
        double d11;
        Size size = new Size(i11, i12);
        LiteavLog.m76087i("CameraSupervisor", "preview wanted: " + size + " cameraRotation:" + enumC34747l);
        if (list == null) {
            LiteavLog.m76083e("CameraSupervisor", "findBestMatchedPreviewSize getPreviewSizes null");
            return size;
        }
        if (enumC34747l == EnumC34747l.ROTATION_90 || enumC34747l == EnumC34747l.ROTATION_270) {
            size.swap();
        }
        double dAspectRatio = size.aspectRatio();
        Size size2 = new Size(C33556b3.f69051i, C33556b3.f69051i);
        int i13 = size.width;
        int i14 = size2.width;
        if (i13 > i14 || size.height > size2.height) {
            int i15 = size.height;
            if (i13 > i15) {
                size2.height = (i14 * i15) / i13;
            } else {
                size2.width = (size2.height * i13) / i15;
            }
        } else {
            size2.set(size);
        }
        ArrayList<Size> arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        long j11 = Long.MAX_VALUE;
        for (Size size3 : list) {
            sb2.append(size3);
            sb2.append(", ");
            long jRound = (size3.width < size2.width || size3.height < size2.height) ? Long.MAX_VALUE : Math.round(Math.abs(size3.aspectRatio() - dAspectRatio) * 10.0d);
            if (jRound < j11) {
                arrayList.clear();
                arrayList.add(size3);
                j11 = jRound;
            } else if (jRound == j11) {
                arrayList.add(size3);
            }
        }
        LiteavLog.m76087i("CameraSupervisor", "support preview size list: ".concat(String.valueOf(sb2)));
        Collections.sort(arrayList, C34959d.m76737a());
        Size size4 = (Size) arrayList.get(0);
        int area = size.getArea() * 1000;
        double dAbs = Double.MAX_VALUE;
        for (Size size5 : arrayList) {
            LiteavLog.m76087i("CameraSupervisor", "size in same buck ".concat(String.valueOf(size5)));
            if (dAspectRatio > size5.aspectRatio()) {
                int i16 = size5.width;
                d11 = ((double) ((i16 * i16) * 1000)) / dAspectRatio;
            } else {
                int i17 = size5.height;
                d11 = ((double) (i17 * i17)) * dAspectRatio * 1000.0d;
            }
            double d12 = area;
            if (d11 / d12 >= 0.9d) {
                double d13 = d11 - d12;
                if (Math.abs(d13) < dAbs) {
                    dAbs = Math.abs(d13);
                    size4 = size5;
                }
            }
        }
        LiteavLog.m76087i("CameraSupervisor", "best match preview size ".concat(String.valueOf(size4)));
        return new Size(size4.width, size4.height);
    }

    /* JADX INFO: renamed from: a */
    public static C34947a m76736a(C34947a[] c34947aArr, int i11, boolean z11) {
        if (c34947aArr != null && c34947aArr.length != 0) {
            int i12 = 0;
            for (C34947a c34947a : c34947aArr) {
                LiteavLog.m76087i("CameraSupervisor", "supported fps range: ".concat(String.valueOf(c34947a)));
            }
            if (!z11) {
                Arrays.sort(c34947aArr, C34960e.m76738a());
                int length = c34947aArr.length;
                while (i12 < length) {
                    C34947a c34947a2 = c34947aArr[i12];
                    if (c34947a2.f74592a >= i11) {
                        return c34947a2;
                    }
                    i12++;
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (C34947a c34947a3 : c34947aArr) {
                if (c34947a3.f74592a < c34947a3.f74593b) {
                    arrayList.add(c34947a3);
                }
            }
            C34947a[] c34947aArr2 = (C34947a[]) arrayList.toArray(new C34947a[0]);
            Arrays.sort(c34947aArr2, C34961f.m76739a());
            int length2 = c34947aArr2.length;
            while (i12 < length2) {
                C34947a c34947a4 = c34947aArr2[i12];
                if (i11 <= c34947a4.f74593b) {
                    return c34947a4;
                }
                i12++;
            }
            if (c34947aArr2.length > 0) {
                return c34947aArr2[c34947aArr2.length - 1];
            }
        }
        return null;
    }
}
