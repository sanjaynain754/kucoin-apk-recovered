package com.blankj.utilcode.util;

/* JADX INFO: renamed from: com.blankj.utilcode.util.g0 */
/* JADX INFO: compiled from: ShadowUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5271g0 {

    /* JADX INFO: renamed from: com.blankj.utilcode.util.g0$a */
    /* JADX INFO: compiled from: ShadowUtils.java */
    public static class a {

        /* JADX INFO: renamed from: i */
        public static final int f6514i = 0;

        /* JADX INFO: renamed from: a */
        public float f6515a;

        /* JADX INFO: renamed from: b */
        public float f6516b;

        /* JADX INFO: renamed from: c */
        public float f6517c;

        /* JADX INFO: renamed from: d */
        public float f6518d;

        /* JADX INFO: renamed from: e */
        public float f6519e;

        /* JADX INFO: renamed from: f */
        public int f6520f;

        /* JADX INFO: renamed from: g */
        public int f6521g;

        /* JADX INFO: renamed from: h */
        public boolean f6522h;

        static {
                r0 = 1090519040(0x41000000, float:8.0)
                int r0 = com.blankj.utilcode.util.C5299u0.m6484g(r0)
                com.blankj.utilcode.util.C5271g0.a.f6514i = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.f6515a = r0
                r1.f6516b = r0
                r1.f6517c = r0
                r1.f6518d = r0
                r1.f6519e = r0
                r0 = 1140850688(0x44000000, float:512.0)
                r1.f6520f = r0
                r1.f6521g = r0
                r0 = 0
                r1.f6522h = r0
                return
        }

        /* JADX INFO: renamed from: a */
        public android.graphics.drawable.Drawable m6210a(android.graphics.drawable.Drawable r9) {
                r8 = this;
                if (r9 != 0) goto L8
                android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable
                r0 = 0
                r9.<init>(r0)
            L8:
                r2 = r9
                android.graphics.drawable.StateListDrawable r9 = new android.graphics.drawable.StateListDrawable
                r9.<init>()
                r0 = 16842919(0x10100a7, float:2.3694026E-38)
                int[] r0 = new int[]{r0}
                com.blankj.utilcode.util.g0$c r1 = new com.blankj.utilcode.util.g0$c
                float r3 = r8.m6213d()
                float r4 = r8.m6214e()
                float r5 = r8.m6211b()
                int r6 = r8.f6521g
                boolean r7 = r8.f6522h
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r9.addState(r0, r1)
                int[] r0 = android.util.StateSet.WILD_CARD
                com.blankj.utilcode.util.g0$c r1 = new com.blankj.utilcode.util.g0$c
                float r3 = r8.m6213d()
                float r4 = r8.m6215f()
                float r5 = r8.m6212c()
                int r6 = r8.f6520f
                boolean r7 = r8.f6522h
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r9.addState(r0, r1)
                return r9
        }

        /* JADX INFO: renamed from: b */
        public final float m6211b() {
                r2 = this;
                float r0 = r2.f6518d
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Le
                float r0 = r2.m6214e()
                r2.f6518d = r0
            Le:
                float r0 = r2.f6518d
                return r0
        }

        /* JADX INFO: renamed from: c */
        public final float m6212c() {
                r2 = this;
                float r0 = r2.f6519e
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Le
                float r0 = r2.m6215f()
                r2.f6519e = r0
            Le:
                float r0 = r2.f6519e
                return r0
        }

        /* JADX INFO: renamed from: d */
        public final float m6213d() {
                r2 = this;
                float r0 = r2.f6515a
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L9
                r2.f6515a = r1
            L9:
                float r0 = r2.f6515a
                return r0
        }

        /* JADX INFO: renamed from: e */
        public final float m6214e() {
                r2 = this;
                float r0 = r2.f6516b
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Ld
                int r0 = com.blankj.utilcode.util.C5271g0.a.f6514i
                float r0 = (float) r0
                r2.f6516b = r0
            Ld:
                float r0 = r2.f6516b
                return r0
        }

        /* JADX INFO: renamed from: f */
        public final float m6215f() {
                r2 = this;
                float r0 = r2.f6517c
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto Le
                float r0 = r2.m6214e()
                r2.f6517c = r0
            Le:
                float r0 = r2.f6517c
                return r0
        }

        /* JADX INFO: renamed from: g */
        public com.blankj.utilcode.util.C5271g0.a m6216g(int r1) {
                r0 = this;
                com.blankj.utilcode.util.g0$a r1 = r0.m6217h(r1, r1)
                return r1
        }

        /* JADX INFO: renamed from: h */
        public com.blankj.utilcode.util.C5271g0.a m6217h(int r1, int r2) {
                r0 = this;
                r0.f6520f = r1
                r0.f6521g = r2
                return r0
        }

        /* JADX INFO: renamed from: i */
        public com.blankj.utilcode.util.C5271g0.a m6218i(int r1) {
                r0 = this;
                com.blankj.utilcode.util.g0$a r1 = r0.m6219j(r1, r1)
                return r1
        }

        /* JADX INFO: renamed from: j */
        public com.blankj.utilcode.util.C5271g0.a m6219j(int r1, int r2) {
                r0 = this;
                float r1 = (float) r1
                r0.f6516b = r1
                float r1 = (float) r2
                r0.f6517c = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.g0$b */
    /* JADX INFO: compiled from: ShadowUtils.java */
    public static class b extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

        /* JADX INFO: renamed from: b */
        public android.graphics.drawable.Drawable f6523b;

        public b(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.<init>()
                r0.mo6221b(r1)
                return
        }

        /* JADX INFO: renamed from: a */
        public android.graphics.drawable.Drawable mo6220a() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                return r0
        }

        /* JADX INFO: renamed from: b */
        public void mo6221b(android.graphics.drawable.Drawable r3) {
                r2 = this;
                android.graphics.drawable.Drawable r0 = r2.f6523b
                if (r0 == 0) goto L8
                r1 = 0
                r0.setCallback(r1)
            L8:
                r2.f6523b = r3
                if (r3 == 0) goto Lf
                r3.setCallback(r2)
            Lf:
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                r0.draw(r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public android.graphics.drawable.Drawable getCurrent() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                android.graphics.drawable.Drawable r0 = r0.getCurrent()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                int r0 = r0.getIntrinsicHeight()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                int r0 = r0.getIntrinsicWidth()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                int r0 = r0.getMinimumHeight()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                int r0 = r0.getMinimumWidth()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int[] getState() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                int[] r0 = r0.getState()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public android.graphics.Region getTransparentRegion() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                android.graphics.Region r0 = r0.getTransparentRegion()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.invalidateSelf()
                return
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isAutoMirrored() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r0)
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                boolean r0 = r0.isStateful()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public void jumpToCurrentState() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                androidx.core.graphics.drawable.DrawableCompat.jumpToCurrentState(r0)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public boolean onLevelChange(int r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                boolean r2 = r0.setLevel(r2)
                return r2
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                r0.scheduleSelf(r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                r0.setAlpha(r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setAutoMirrored(boolean r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setChangingConfigurations(int r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                r0.setChangingConfigurations(r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                r0.setColorFilter(r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                r0.setDither(r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                r0.setFilterBitmap(r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r2, r3, r4, r5)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                boolean r2 = r0.setState(r2)
                return r2
        }

        @Override // android.graphics.drawable.Drawable
        public void setTint(int r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintList(android.content.res.ColorStateList r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintMode(android.graphics.PorterDuff.Mode r2) {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f6523b
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
                return
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = super.setVisible(r2, r3)
                if (r0 != 0) goto L11
                android.graphics.drawable.Drawable r0 = r1.f6523b
                boolean r2 = r0.setVisible(r2, r3)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                return r2
            L11:
                r2 = 1
                return r2
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                r0.unscheduleSelf(r2)
                return
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.g0$c */
    /* JADX INFO: compiled from: ShadowUtils.java */
    public static class c extends com.blankj.utilcode.util.C5271g0.b {

        /* JADX INFO: renamed from: v */
        public static final double f6524v = 0.0d;

        /* JADX INFO: renamed from: c */
        public float f6525c;

        /* JADX INFO: renamed from: d */
        public float f6526d;

        /* JADX INFO: renamed from: e */
        public float f6527e;

        /* JADX INFO: renamed from: f */
        public float f6528f;

        /* JADX INFO: renamed from: g */
        public android.graphics.Paint f6529g;

        /* JADX INFO: renamed from: h */
        public android.graphics.Paint f6530h;

        /* JADX INFO: renamed from: i */
        public android.graphics.RectF f6531i;

        /* JADX INFO: renamed from: j */
        public float f6532j;

        /* JADX INFO: renamed from: k */
        public android.graphics.Path f6533k;

        /* JADX INFO: renamed from: l */
        public float f6534l;

        /* JADX INFO: renamed from: m */
        public float f6535m;

        /* JADX INFO: renamed from: n */
        public float f6536n;

        /* JADX INFO: renamed from: o */
        public float f6537o;

        /* JADX INFO: renamed from: p */
        public boolean f6538p;

        /* JADX INFO: renamed from: q */
        public final int f6539q;

        /* JADX INFO: renamed from: r */
        public final int f6540r;

        /* JADX INFO: renamed from: s */
        public boolean f6541s;

        /* JADX INFO: renamed from: t */
        public float f6542t;

        /* JADX INFO: renamed from: u */
        public boolean f6543u;

        static {
                r0 = 4631530004285489152(0x4046800000000000, double:45.0)
                double r0 = java.lang.Math.toRadians(r0)
                double r0 = java.lang.Math.cos(r0)
                com.blankj.utilcode.util.C5271g0.c.f6524v = r0
                return
        }

        public c(android.graphics.drawable.Drawable r3, float r4, float r5, float r6, int r7, boolean r8) {
                r2 = this;
                r2.<init>(r3)
                r3 = 1065353216(0x3f800000, float:1.0)
                r2.f6525c = r3
                r2.f6526d = r3
                r2.f6527e = r3
                r2.f6528f = r3
                r0 = 1
                r2.f6538p = r0
                r0 = 0
                r2.f6541s = r0
                r2.f6539q = r7
                r1 = 16777215(0xffffff, float:2.3509886E-38)
                r7 = r7 & r1
                r2.f6540r = r7
                r2.f6543u = r8
                if (r8 == 0) goto L27
                r2.f6525c = r3
                r2.f6526d = r3
                r2.f6527e = r3
                r2.f6528f = r3
            L27:
                android.graphics.Paint r3 = new android.graphics.Paint
                r7 = 5
                r3.<init>(r7)
                r2.f6529g = r3
                android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
                r3.setStyle(r7)
                int r3 = java.lang.Math.round(r4)
                float r3 = (float) r3
                r2.f6532j = r3
                android.graphics.RectF r3 = new android.graphics.RectF
                r3.<init>()
                r2.f6531i = r3
                android.graphics.Paint r3 = new android.graphics.Paint
                android.graphics.Paint r4 = r2.f6529g
                r3.<init>(r4)
                r2.f6530h = r3
                r3.setAntiAlias(r0)
                r2.m6228h(r5, r6)
                return
        }

        /* JADX INFO: renamed from: e */
        public static float m6222e(float r6, float r7, boolean r8) {
                if (r8 == 0) goto Lc
                double r0 = (double) r6
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r4 = com.blankj.utilcode.util.C5271g0.c.f6524v
                double r2 = r2 - r4
                double r6 = (double) r7
                double r2 = r2 * r6
                double r0 = r0 + r2
                float r6 = (float) r0
            Lc:
                return r6
        }

        /* JADX INFO: renamed from: i */
        public static int m6223i(float r2) {
                int r2 = java.lang.Math.round(r2)
                int r0 = r2 % 2
                r1 = 1
                if (r0 != r1) goto La
                int r2 = r2 - r1
            La:
                return r2
        }

        @Override // com.blankj.utilcode.util.C5271g0.b
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable mo6220a() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = super.mo6220a()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ void mo6221b(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.mo6221b(r1)
                return
        }

        /* JADX INFO: renamed from: c */
        public final void m6224c(android.graphics.Rect r7) {
                r6 = this;
                boolean r0 = r6.f6543u
                if (r0 == 0) goto Ld
                int r0 = r7.width()
                int r0 = r0 / 2
                float r0 = (float) r0
                r6.f6532j = r0
            Ld:
                float r0 = r6.f6535m
                float r1 = r6.f6525c
                float r1 = r1 * r0
                android.graphics.RectF r2 = r6.f6531i
                int r3 = r7.left
                float r3 = (float) r3
                float r3 = r3 + r0
                int r4 = r7.top
                float r4 = (float) r4
                float r4 = r4 + r1
                int r5 = r7.right
                float r5 = (float) r5
                float r5 = r5 - r0
                int r7 = r7.bottom
                float r7 = (float) r7
                float r7 = r7 - r1
                r2.set(r3, r4, r5, r7)
                android.graphics.drawable.Drawable r7 = r6.mo6220a()
                android.graphics.RectF r0 = r6.f6531i
                float r1 = r0.left
                int r1 = (int) r1
                float r2 = r0.top
                int r2 = (int) r2
                float r3 = r0.right
                int r3 = (int) r3
                float r0 = r0.bottom
                int r0 = (int) r0
                r7.setBounds(r1, r2, r3, r0)
                r6.m6225d()
                return
        }

        /* JADX INFO: renamed from: d */
        public final void m6225d() {
                r18 = this;
                r0 = r18
                r1 = 2
                r2 = 1
                r3 = 3
                boolean r4 = r0.f6543u
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 1127481344(0x43340000, float:180.0)
                r7 = 0
                r8 = 0
                if (r4 == 0) goto L8e
                android.graphics.RectF r4 = r0.f6531i
                float r4 = r4.width()
                r9 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r9
                float r4 = r4 - r5
                android.graphics.RectF r9 = new android.graphics.RectF
                float r10 = -r4
                r9.<init>(r10, r10, r4, r4)
                android.graphics.RectF r11 = new android.graphics.RectF
                r11.<init>(r9)
                float r12 = r0.f6536n
                float r13 = -r12
                float r12 = -r12
                r11.inset(r13, r12)
                android.graphics.Path r12 = r0.f6533k
                if (r12 != 0) goto L37
                android.graphics.Path r12 = new android.graphics.Path
                r12.<init>()
                r0.f6533k = r12
                goto L3a
            L37:
                r12.reset()
            L3a:
                android.graphics.Path r12 = r0.f6533k
                android.graphics.Path$FillType r13 = android.graphics.Path.FillType.EVEN_ODD
                r12.setFillType(r13)
                android.graphics.Path r12 = r0.f6533k
                r12.moveTo(r10, r8)
                android.graphics.Path r10 = r0.f6533k
                float r12 = r0.f6536n
                float r12 = -r12
                r10.rLineTo(r12, r8)
                android.graphics.Path r10 = r0.f6533k
                r10.arcTo(r11, r6, r6, r7)
                android.graphics.Path r10 = r0.f6533k
                r10.arcTo(r11, r8, r6, r7)
                android.graphics.Path r10 = r0.f6533k
                r10.arcTo(r9, r6, r6, r7)
                android.graphics.Path r10 = r0.f6533k
                r10.arcTo(r9, r8, r6, r7)
                android.graphics.Path r6 = r0.f6533k
                r6.close()
                float r6 = r11.top
                float r12 = -r6
                int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r6 <= 0) goto L8d
                float r4 = r4 / r12
                android.graphics.Paint r6 = r0.f6529g
                android.graphics.RadialGradient r9 = new android.graphics.RadialGradient
                int r10 = r0.f6539q
                int r11 = r0.f6540r
                int[] r13 = new int[]{r7, r10, r11}
                float[] r14 = new float[r3]
                r14[r7] = r8
                r14[r2] = r4
                r14[r1] = r5
                android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
                r10 = 0
                r11 = 0
                r9.<init>(r10, r11, r12, r13, r14, r15)
                r6.setShader(r9)
            L8d:
                return
            L8e:
                android.graphics.RectF r4 = new android.graphics.RectF
                float r9 = r0.f6532j
                float r10 = -r9
                float r11 = -r9
                r4.<init>(r10, r11, r9, r9)
                android.graphics.RectF r9 = new android.graphics.RectF
                r9.<init>(r4)
                float r10 = r0.f6536n
                float r11 = -r10
                float r10 = -r10
                r9.inset(r11, r10)
                android.graphics.Path r10 = r0.f6533k
                if (r10 != 0) goto Laf
                android.graphics.Path r10 = new android.graphics.Path
                r10.<init>()
                r0.f6533k = r10
                goto Lb2
            Laf:
                r10.reset()
            Lb2:
                android.graphics.Path r10 = r0.f6533k
                android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
                r10.setFillType(r11)
                android.graphics.Path r10 = r0.f6533k
                float r11 = r0.f6532j
                float r11 = -r11
                r10.moveTo(r11, r8)
                android.graphics.Path r10 = r0.f6533k
                float r11 = r0.f6536n
                float r11 = -r11
                r10.rLineTo(r11, r8)
                android.graphics.Path r10 = r0.f6533k
                r11 = 1119092736(0x42b40000, float:90.0)
                r10.arcTo(r9, r6, r11, r7)
                android.graphics.Path r6 = r0.f6533k
                r10 = 1132920832(0x43870000, float:270.0)
                r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
                r6.arcTo(r4, r10, r11, r7)
                android.graphics.Path r6 = r0.f6533k
                r6.close()
                float r6 = r9.top
                float r13 = -r6
                int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r6 <= 0) goto L108
                float r6 = r0.f6532j
                float r6 = r6 / r13
                android.graphics.Paint r10 = r0.f6529g
                r11 = r10
                android.graphics.RadialGradient r10 = new android.graphics.RadialGradient
                int r12 = r0.f6539q
                int r14 = r0.f6540r
                int[] r14 = new int[]{r7, r12, r14}
                float[] r15 = new float[r3]
                r15[r7] = r8
                r15[r2] = r6
                r15[r1] = r5
                android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
                r1 = r11
                r11 = 0
                r12 = 0
                r10.<init>(r11, r12, r13, r14, r15, r16)
                r1.setShader(r10)
            L108:
                android.graphics.Paint r1 = r0.f6530h
                android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
                float r12 = r4.top
                float r14 = r9.top
                int r15 = r0.f6539q
                int r2 = r0.f6540r
                android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
                r11 = 0
                r13 = 0
                r16 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17)
                r1.setShader(r10)
                android.graphics.Paint r1 = r0.f6530h
                r1.setAntiAlias(r7)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.f6538p
                if (r0 == 0) goto Le
                android.graphics.Rect r0 = r1.getBounds()
                r1.m6224c(r0)
                r0 = 0
                r1.f6538p = r0
            Le:
                r1.m6227g(r2)
                super.draw(r2)
                return
        }

        /* JADX INFO: renamed from: f */
        public final float m6226f(float r7, float r8, boolean r9) {
                r6 = this;
                if (r9 == 0) goto L10
                float r9 = r6.f6525c
                float r7 = r7 * r9
                double r0 = (double) r7
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r4 = com.blankj.utilcode.util.C5271g0.c.f6524v
                double r2 = r2 - r4
                double r7 = (double) r8
                double r2 = r2 * r7
                double r0 = r0 + r2
                float r7 = (float) r0
                return r7
            L10:
                float r8 = r6.f6525c
                float r7 = r7 * r8
                return r7
        }

        /* JADX INFO: renamed from: g */
        public final void m6227g(android.graphics.Canvas r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                boolean r2 = r0.f6543u
                if (r2 == 0) goto L26
                int r2 = r1.save()
                android.graphics.RectF r3 = r0.f6531i
                float r3 = r3.centerX()
                android.graphics.RectF r4 = r0.f6531i
                float r4 = r4.centerY()
                r1.translate(r3, r4)
                android.graphics.Path r3 = r0.f6533k
                android.graphics.Paint r4 = r0.f6529g
                r1.drawPath(r3, r4)
                r1.restoreToCount(r2)
                return
            L26:
                int r7 = r1.save()
                float r2 = r0.f6542t
                android.graphics.RectF r3 = r0.f6531i
                float r3 = r3.centerX()
                android.graphics.RectF r4 = r0.f6531i
                float r4 = r4.centerY()
                r1.rotate(r2, r3, r4)
                float r8 = r0.f6532j
                float r2 = -r8
                float r3 = r0.f6536n
                float r3 = r2 - r3
                android.graphics.RectF r2 = r0.f6531i
                float r2 = r2.width()
                r4 = 1073741824(0x40000000, float:2.0)
                float r9 = r8 * r4
                float r2 = r2 - r9
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 0
                r6 = 1
                if (r2 <= 0) goto L56
                r10 = r6
                goto L57
            L56:
                r10 = r5
            L57:
                android.graphics.RectF r2 = r0.f6531i
                float r2 = r2.height()
                float r2 = r2 - r9
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L64
                r11 = r6
                goto L65
            L64:
                r11 = r5
            L65:
                float r2 = r0.f6537o
                float r5 = r0.f6526d
                float r5 = r5 * r2
                float r5 = r2 - r5
                float r6 = r0.f6527e
                float r6 = r6 * r2
                float r6 = r2 - r6
                float r12 = r0.f6528f
                float r12 = r12 * r2
                float r2 = r2 - r12
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                r12 = 1065353216(0x3f800000, float:1.0)
                if (r4 != 0) goto L7d
                r13 = r12
                goto L81
            L7d:
                float r6 = r6 + r8
                float r6 = r8 / r6
                r13 = r6
            L81:
                if (r4 != 0) goto L85
                r14 = r12
                goto L89
            L85:
                float r5 = r5 + r8
                float r5 = r8 / r5
                r14 = r5
            L89:
                if (r4 != 0) goto L8d
                r15 = r12
                goto L91
            L8d:
                float r2 = r2 + r8
                float r2 = r8 / r2
                r15 = r2
            L91:
                int r2 = r1.save()
                android.graphics.RectF r4 = r0.f6531i
                float r5 = r4.left
                float r5 = r5 + r8
                float r4 = r4.top
                float r4 = r4 + r8
                r1.translate(r5, r4)
                r1.scale(r13, r14)
                android.graphics.Path r4 = r0.f6533k
                android.graphics.Paint r5 = r0.f6529g
                r1.drawPath(r4, r5)
                if (r10 == 0) goto Lc8
                float r4 = r12 / r13
                r1.scale(r4, r12)
                android.graphics.RectF r4 = r0.f6531i
                float r4 = r4.width()
                float r4 = r4 - r9
                float r5 = r0.f6532j
                float r5 = -r5
                android.graphics.Paint r6 = r0.f6530h
                r16 = r2
                r2 = 0
                r17 = r12
                r12 = r16
                r1.drawRect(r2, r3, r4, r5, r6)
                goto Lcb
            Lc8:
                r17 = r12
                r12 = r2
            Lcb:
                r1.restoreToCount(r12)
                int r12 = r1.save()
                android.graphics.RectF r2 = r0.f6531i
                float r4 = r2.right
                float r4 = r4 - r8
                float r2 = r2.bottom
                float r2 = r2 - r8
                r1.translate(r4, r2)
                r1.scale(r13, r15)
                r2 = 1127481344(0x43340000, float:180.0)
                r1.rotate(r2)
                android.graphics.Path r2 = r0.f6533k
                android.graphics.Paint r4 = r0.f6529g
                r1.drawPath(r2, r4)
                if (r10 == 0) goto L106
                float r2 = r17 / r13
                r4 = r17
                r1.scale(r2, r4)
                android.graphics.RectF r2 = r0.f6531i
                float r2 = r2.width()
                float r4 = r2 - r9
                float r2 = r0.f6532j
                float r5 = -r2
                android.graphics.Paint r6 = r0.f6530h
                r2 = 0
                r1.drawRect(r2, r3, r4, r5, r6)
            L106:
                r1.restoreToCount(r12)
                int r10 = r1.save()
                android.graphics.RectF r2 = r0.f6531i
                float r4 = r2.left
                float r4 = r4 + r8
                float r2 = r2.bottom
                float r2 = r2 - r8
                r1.translate(r4, r2)
                r1.scale(r13, r15)
                r2 = 1132920832(0x43870000, float:270.0)
                r1.rotate(r2)
                android.graphics.Path r2 = r0.f6533k
                android.graphics.Paint r4 = r0.f6529g
                r1.drawPath(r2, r4)
                if (r11 == 0) goto L141
                r4 = 1065353216(0x3f800000, float:1.0)
                float r12 = r4 / r15
                r1.scale(r12, r4)
                android.graphics.RectF r2 = r0.f6531i
                float r2 = r2.height()
                float r4 = r2 - r9
                float r2 = r0.f6532j
                float r5 = -r2
                android.graphics.Paint r6 = r0.f6530h
                r2 = 0
                r1.drawRect(r2, r3, r4, r5, r6)
            L141:
                r1.restoreToCount(r10)
                int r10 = r1.save()
                android.graphics.RectF r2 = r0.f6531i
                float r4 = r2.right
                float r4 = r4 - r8
                float r2 = r2.top
                float r2 = r2 + r8
                r1.translate(r4, r2)
                r1.scale(r13, r14)
                r2 = 1119092736(0x42b40000, float:90.0)
                r1.rotate(r2)
                android.graphics.Path r2 = r0.f6533k
                android.graphics.Paint r4 = r0.f6529g
                r1.drawPath(r2, r4)
                if (r11 == 0) goto L17c
                r4 = 1065353216(0x3f800000, float:1.0)
                float r12 = r4 / r14
                r1.scale(r12, r4)
                android.graphics.RectF r2 = r0.f6531i
                float r2 = r2.height()
                float r4 = r2 - r9
                float r2 = r0.f6532j
                float r5 = -r2
                android.graphics.Paint r6 = r0.f6530h
                r2 = 0
                r1.drawRect(r2, r3, r4, r5, r6)
            L17c:
                r1.restoreToCount(r10)
                r1.restoreToCount(r7)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getChangingConfigurations() {
                r1 = this;
                int r0 = super.getChangingConfigurations()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = super.getCurrent()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
                r1 = this;
                int r0 = super.getIntrinsicHeight()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
                r1 = this;
                int r0 = super.getIntrinsicWidth()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumHeight() {
                r1 = this;
                int r0 = super.getMinimumHeight()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumWidth() {
                r1 = this;
                int r0 = super.getMinimumWidth()
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
                r1 = this;
                r0 = -3
                return r0
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(android.graphics.Rect r5) {
                r4 = this;
                float r0 = r4.f6535m
                float r1 = r4.f6532j
                boolean r2 = r4.f6541s
                float r0 = r4.m6226f(r0, r1, r2)
                double r0 = (double) r0
                double r0 = java.lang.Math.ceil(r0)
                int r0 = (int) r0
                float r1 = r4.f6535m
                float r2 = r4.f6532j
                boolean r3 = r4.f6541s
                float r1 = m6222e(r1, r2, r3)
                double r1 = (double) r1
                double r1 = java.lang.Math.ceil(r1)
                int r1 = (int) r1
                r5.set(r1, r0, r1, r0)
                r5 = 1
                return r5
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int[] getState() {
                r1 = this;
                int[] r0 = super.getState()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
                r1 = this;
                android.graphics.Region r0 = super.getTransparentRegion()
                return r0
        }

        /* JADX INFO: renamed from: h */
        public void m6228h(float r3, float r4) {
                r2 = this;
                r0 = 0
                int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r1 < 0) goto L3c
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 < 0) goto L3c
                int r3 = m6223i(r3)
                float r3 = (float) r3
                int r4 = m6223i(r4)
                float r4 = (float) r4
                int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r0 <= 0) goto L18
                r3 = r4
            L18:
                float r0 = r2.f6537o
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L25
                float r0 = r2.f6535m
                int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r0 != 0) goto L25
                return
            L25:
                r2.f6537o = r3
                r2.f6535m = r4
                float r0 = r2.f6525c
                float r3 = r3 * r0
                int r3 = java.lang.Math.round(r3)
                float r3 = (float) r3
                r2.f6536n = r3
                r2.f6534l = r4
                r3 = 1
                r2.f6538p = r3
                r2.invalidateSelf()
                return
            L3c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "invalid shadow size"
                r3.<init>(r4)
                throw r3
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.invalidateDrawable(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
                r1 = this;
                boolean r0 = super.isAutoMirrored()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isStateful() {
                r1 = this;
                boolean r0 = super.isStateful()
                return r0
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void jumpToCurrentState() {
                r0 = this;
                super.jumpToCurrentState()
                return
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(android.graphics.Rect r1) {
                r0 = this;
                r1 = 1
                r0.f6538p = r1
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                super.scheduleDrawable(r1, r2, r3)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public void setAlpha(int r2) {
                r1 = this;
                super.setAlpha(r2)
                android.graphics.Paint r0 = r1.f6529g
                r0.setAlpha(r2)
                android.graphics.Paint r0 = r1.f6530h
                r0.setAlpha(r2)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setAutoMirrored(boolean r1) {
                r0 = this;
                super.setAutoMirrored(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
                r0 = this;
                super.setChangingConfigurations(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setColorFilter(android.graphics.ColorFilter r1) {
                r0 = this;
                super.setColorFilter(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setDither(boolean r1) {
                r0 = this;
                super.setDither(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setFilterBitmap(boolean r1) {
                r0 = this;
                super.setFilterBitmap(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
                r0 = this;
                super.setHotspot(r1, r2)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
                r0 = this;
                super.setHotspotBounds(r1, r2, r3, r4)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
                r0 = this;
                boolean r1 = super.setState(r1)
                return r1
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTint(int r1) {
                r0 = this;
                super.setTint(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintList(android.content.res.ColorStateList r1) {
                r0 = this;
                super.setTintList(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintMode(android.graphics.PorterDuff.Mode r1) {
                r0 = this;
                super.setTintMode(r1)
                return
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setVisible(boolean r1, boolean r2) {
                r0 = this;
                boolean r1 = super.setVisible(r1, r2)
                return r1
        }

        @Override // com.blankj.utilcode.util.C5271g0.b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
                r0 = this;
                super.unscheduleDrawable(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6208a(android.view.View r4, com.blankj.utilcode.util.C5271g0.a r5) {
            if (r4 == 0) goto L23
            if (r5 != 0) goto L5
            goto L23
        L5:
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r1 = -16
            java.lang.Object r2 = r4.getTag(r1)
            boolean r3 = r2 instanceof android.graphics.drawable.Drawable
            if (r3 == 0) goto L19
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            androidx.core.view.ViewCompat.setBackground(r4, r2)
            return
        L19:
            android.graphics.drawable.Drawable r5 = r5.m6210a(r0)
            androidx.core.view.ViewCompat.setBackground(r4, r5)
            r4.setTag(r1, r5)
        L23:
            return
    }

    /* JADX INFO: renamed from: b */
    public static void m6209b(android.view.View... r4) {
            if (r4 != 0) goto L3
            goto L14
        L3:
            int r0 = r4.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L14
            r2 = r4[r1]
            com.blankj.utilcode.util.g0$a r3 = new com.blankj.utilcode.util.g0$a
            r3.<init>()
            m6208a(r2, r3)
            int r1 = r1 + 1
            goto L5
        L14:
            return
    }
}
