package com.sumsub.sns.internal.features.domain.documents;

import android.graphics.Bitmap;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.core.widget.AbstractC28250a;
import java.io.File;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30152w {

    /* JADX INFO: renamed from: a */
    public final Bitmap f60589a;

    /* JADX INFO: renamed from: b */
    public final File f60590b;

    /* JADX INFO: renamed from: c */
    public final int f60591c;

    /* JADX INFO: renamed from: d */
    public final boolean f60592d;

    /* JADX INFO: renamed from: e */
    public final String f60593e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f60594f;

    /* JADX INFO: renamed from: g */
    public final AbstractC30125T f60595g;

    public C30152w(Bitmap bitmap, File file, int i11, boolean z11, String str, CharSequence charSequence, AbstractC30125T abstractC30125T) {
        this.f60589a = bitmap;
        this.f60590b = file;
        this.f60591c = i11;
        this.f60592d = z11;
        this.f60593e = str;
        this.f60594f = charSequence;
        this.f60595g = abstractC30125T;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30152w)) {
            return false;
        }
        C30152w c30152w = (C30152w) obj;
        return Intrinsics.areEqual(this.f60589a, c30152w.f60589a) && Intrinsics.areEqual(this.f60590b, c30152w.f60590b) && this.f60591c == c30152w.f60591c && this.f60592d == c30152w.f60592d && Intrinsics.areEqual(this.f60593e, c30152w.f60593e) && Intrinsics.areEqual(this.f60594f, c30152w.f60594f) && Intrinsics.areEqual(this.f60595g, c30152w.f60595g);
    }

    /* JADX INFO: renamed from: a */
    public static C30152w m70118a(C30152w c30152w, int i11, CharSequence charSequence, AbstractC30125T abstractC30125T, int i12) {
        Bitmap bitmap = c30152w.f60589a;
        File file = c30152w.f60590b;
        if ((i12 & 4) != 0) {
            i11 = c30152w.f60591c;
        }
        int i13 = i11;
        boolean z11 = c30152w.f60592d;
        String str = c30152w.f60593e;
        if ((i12 & 32) != 0) {
            charSequence = c30152w.f60594f;
        }
        CharSequence charSequence2 = charSequence;
        if ((i12 & 64) != 0) {
            abstractC30125T = c30152w.f60595g;
        }
        return new C30152w(bitmap, file, i13, z11, str, charSequence2, abstractC30125T);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f60589a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        File file = this.f60590b;
        int iM69001a = AbstractC27920h.m69001a(this.f60592d, AbstractC28250a.m69223a(this.f60591c, (iHashCode + (file == null ? 0 : file.hashCode())) * 31, 31), 31);
        String str = this.f60593e;
        int iHashCode2 = (iM69001a + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.f60594f;
        return this.f60595g.hashCode() + ((iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Bitmap bitmap = this.f60589a;
        File file = this.f60590b;
        int i11 = this.f60591c;
        boolean z11 = this.f60592d;
        String str = this.f60593e;
        CharSequence charSequence = this.f60594f;
        return "PhotoDocument(photo=" + bitmap + ", file=" + file + ", rotation=" + i11 + ", rotationAvailable=" + z11 + ", key=" + str + ", error=" + ((Object) charSequence) + ", uploadState=" + this.f60595g + ")";
    }

    public /* synthetic */ C30152w(Bitmap bitmap, File file, int i11, boolean z11, String str, CharSequence charSequence, int i12) {
        this(bitmap, file, i11, z11, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : charSequence, C30121O.f60561a);
    }
}
