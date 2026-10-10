package com.squareup.picasso;

import java.io.PrintWriter;

/* JADX INFO: renamed from: com.squareup.picasso.w */
/* JADX INFO: compiled from: StatsSnapshot.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27839w {

    /* JADX INFO: renamed from: a */
    public final int f56872a;

    /* JADX INFO: renamed from: b */
    public final int f56873b;

    /* JADX INFO: renamed from: c */
    public final long f56874c;

    /* JADX INFO: renamed from: d */
    public final long f56875d;

    /* JADX INFO: renamed from: e */
    public final long f56876e;

    /* JADX INFO: renamed from: f */
    public final long f56877f;

    /* JADX INFO: renamed from: g */
    public final long f56878g;

    /* JADX INFO: renamed from: h */
    public final long f56879h;

    /* JADX INFO: renamed from: i */
    public final long f56880i;

    /* JADX INFO: renamed from: j */
    public final long f56881j;

    /* JADX INFO: renamed from: k */
    public final int f56882k;

    /* JADX INFO: renamed from: l */
    public final int f56883l;

    /* JADX INFO: renamed from: m */
    public final int f56884m;

    /* JADX INFO: renamed from: n */
    public final long f56885n;

    /* JADX INFO: renamed from: a */
    public void m68933a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f56872a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f56873b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f56873b / this.f56872a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f56874c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f56875d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f56882k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f56876e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f56879h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f56883l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f56877f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f56884m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f56878g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f56880i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f56881j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f56872a + ", size=" + this.f56873b + ", cacheHits=" + this.f56874c + ", cacheMisses=" + this.f56875d + ", downloadCount=" + this.f56882k + ", totalDownloadSize=" + this.f56876e + ", averageDownloadSize=" + this.f56879h + ", totalOriginalBitmapSize=" + this.f56877f + ", totalTransformedBitmapSize=" + this.f56878g + ", averageOriginalBitmapSize=" + this.f56880i + ", averageTransformedBitmapSize=" + this.f56881j + ", originalBitmapCount=" + this.f56883l + ", transformedBitmapCount=" + this.f56884m + ", timeStamp=" + this.f56885n + '}';
    }

    public C27839w(int i11, int i12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i13, int i14, int i15, long j19) {
        this.f56872a = i11;
        this.f56873b = i12;
        this.f56874c = j11;
        this.f56875d = j12;
        this.f56876e = j13;
        this.f56877f = j14;
        this.f56878g = j15;
        this.f56879h = j16;
        this.f56880i = j17;
        this.f56881j = j18;
        this.f56882k = i13;
        this.f56883l = i14;
        this.f56884m = i15;
        this.f56885n = j19;
    }
}
