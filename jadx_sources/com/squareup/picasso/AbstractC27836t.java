package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import okio.Source;

/* JADX INFO: renamed from: com.squareup.picasso.t */
/* JADX INFO: compiled from: RequestHandler.java */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27836t {

    /* JADX INFO: renamed from: com.squareup.picasso.t$a */
    /* JADX INFO: compiled from: RequestHandler.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Picasso.LoadedFrom f56850a;

        /* JADX INFO: renamed from: b */
        public final Bitmap f56851b;

        /* JADX INFO: renamed from: c */
        public final Source f56852c;

        /* JADX INFO: renamed from: d */
        public final int f56853d;

        public a(@NonNull Bitmap bitmap, @NonNull Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) C27841y.m68938d(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public a(@NonNull Source source, @NonNull Picasso.LoadedFrom loadedFrom) {
            this(null, (Source) C27841y.m68938d(source, "source == null"), loadedFrom, 0);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public Bitmap m68915a() {
            return this.f56851b;
        }

        /* JADX INFO: renamed from: b */
        public int m68916b() {
            return this.f56853d;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public Picasso.LoadedFrom m68917c() {
            return this.f56850a;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public Source m68918d() {
            return this.f56852c;
        }

        public a(@Nullable Bitmap bitmap, @Nullable Source source, @NonNull Picasso.LoadedFrom loadedFrom, int i11) {
            if ((bitmap != null) != (source != null)) {
                this.f56851b = bitmap;
                this.f56852c = source;
                this.f56850a = (Picasso.LoadedFrom) C27841y.m68938d(loadedFrom, "loadedFrom == null");
                this.f56853d = i11;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo68781c(C27834r c27834r);

    /* JADX INFO: renamed from: e */
    public int mo68784e() {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract a mo68782f(C27834r c27834r, int i11) throws IOException;

    /* JADX INFO: renamed from: h */
    public boolean mo68785h(boolean z11, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo68786i() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m68911a(int i11, int i12, int i13, int i14, BitmapFactory.Options options, C27834r c27834r) {
        int iMax;
        double dFloor;
        if (i14 > i12 || i13 > i11) {
            if (i12 == 0) {
                dFloor = Math.floor(i13 / i11);
            } else if (i11 == 0) {
                dFloor = Math.floor(i14 / i12);
            } else {
                int iFloor = (int) Math.floor(i14 / i12);
                int iFloor2 = (int) Math.floor(i13 / i11);
                iMax = c27834r.f56811l ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m68912b(int i11, int i12, BitmapFactory.Options options, C27834r c27834r) {
        m68911a(i11, i12, options.outWidth, options.outHeight, options, c27834r);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m68914g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    /* JADX INFO: renamed from: d */
    public static BitmapFactory.Options m68913d(C27834r c27834r) {
        boolean z11;
        boolean zM68893c = c27834r.m68893c();
        if (c27834r.f56818s != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!zM68893c && !z11 && !c27834r.f56817r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zM68893c;
        boolean z12 = c27834r.f56817r;
        options.inInputShareable = z12;
        options.inPurgeable = z12;
        if (z11) {
            options.inPreferredConfig = c27834r.f56818s;
        }
        return options;
    }
}
