package com.cpiz.android.bubbleview;

/* JADX INFO: renamed from: com.cpiz.android.bubbleview.d */
/* JADX INFO: compiled from: RelativePos.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5393d {

    /* JADX INFO: renamed from: a */
    public int f7216a;

    /* JADX INFO: renamed from: b */
    public int f7217b;

    /* JADX INFO: renamed from: b */
    public int m7083b() {
        return this.f7216a;
    }

    /* JADX INFO: renamed from: c */
    public int m7084c() {
        return this.f7217b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7085d() {
        int i11 = this.f7216a;
        return i11 == 1 || i11 == 2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7086e() {
        int i11 = this.f7217b;
        return i11 == 1 || i11 == 2;
    }

    public C5393d(int i11, int i12) {
        this.f7216a = i11;
        this.f7217b = i12;
    }

    /* JADX INFO: renamed from: a */
    public BubbleStyle.ArrowDirection m7082a() {
        if (m7085d() && !m7086e()) {
            int i11 = this.f7216a;
            if (i11 == 2) {
                return BubbleStyle.ArrowDirection.Left;
            }
            if (i11 == 1) {
                return BubbleStyle.ArrowDirection.Right;
            }
        }
        if (!m7085d() && m7086e()) {
            int i12 = this.f7217b;
            if (i12 == 2) {
                return BubbleStyle.ArrowDirection.Up;
            }
            if (i12 == 1) {
                return BubbleStyle.ArrowDirection.Down;
            }
        }
        return BubbleStyle.ArrowDirection.None;
    }
}
