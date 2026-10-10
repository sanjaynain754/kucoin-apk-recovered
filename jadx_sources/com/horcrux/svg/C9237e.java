package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.e */
/* JADX INFO: compiled from: GlyphPathBag.java */
/* JADX INFO: loaded from: classes56.dex */
public class C9237e {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Path> f13223a;

    /* JADX INFO: renamed from: b */
    public final int[][] f13224b;

    /* JADX INFO: renamed from: c */
    public final Paint f13225c;

    /* JADX INFO: renamed from: a */
    public final int m14235a(char c11) {
        int[] iArr = this.f13224b[c11 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c11 & 255];
    }

    public C9237e(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.f13223a = arrayList;
        this.f13224b = new int[256][];
        this.f13225c = paint;
        arrayList.add(new Path());
    }

    /* JADX INFO: renamed from: b */
    public Path m14236b(char c11, String str) {
        Path path;
        int iM14235a = m14235a(c11);
        if (iM14235a != 0) {
            path = this.f13223a.get(iM14235a);
        } else {
            Path path2 = new Path();
            this.f13225c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f13224b;
            int i11 = c11 >> '\b';
            int[] iArr2 = iArr[i11];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i11] = iArr2;
            }
            iArr2[c11 & 255] = this.f13223a.size();
            this.f13223a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
