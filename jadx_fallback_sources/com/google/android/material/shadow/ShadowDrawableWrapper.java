package com.google.android.material.shadow;

/* JADX INFO: loaded from: classes45.dex */
@java.lang.Deprecated
public class ShadowDrawableWrapper extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
    static final double COS_45 = 0.0d;
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;

    @androidx.annotation.NonNull
    final android.graphics.RectF contentBounds;
    float cornerRadius;

    @androidx.annotation.NonNull
    final android.graphics.Paint cornerShadowPaint;
    android.graphics.Path cornerShadowPath;
    private boolean dirty;

    @androidx.annotation.NonNull
    final android.graphics.Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            com.google.android.material.shadow.ShadowDrawableWrapper.COS_45 = r0
            return
    }

    public ShadowDrawableWrapper(android.content.Context r2, android.graphics.drawable.Drawable r3, float r4, float r5, float r6) {
            r1 = this;
            r1.<init>(r3)
            r3 = 1
            r1.dirty = r3
            r1.addPaddingForCorners = r3
            r3 = 0
            r1.printedShadowClipWarning = r3
            int r0 = com.google.android.material.C7090R.color.design_fab_shadow_start_color
            int r0 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r1.shadowStartColor = r0
            int r0 = com.google.android.material.C7090R.color.design_fab_shadow_mid_color
            int r0 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r1.shadowMiddleColor = r0
            int r0 = com.google.android.material.C7090R.color.design_fab_shadow_end_color
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r0)
            r1.shadowEndColor = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 5
            r2.<init>(r0)
            r1.cornerShadowPaint = r2
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            r1.cornerRadius = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r1.contentBounds = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r2)
            r1.edgeShadowPaint = r4
            r4.setAntiAlias(r3)
            r1.setShadowSize(r5, r6)
            return
    }

    private void buildComponents(@androidx.annotation.NonNull android.graphics.Rect r7) {
            r6 = this;
            float r0 = r6.rawMaxShadowSize
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            android.graphics.RectF r2 = r6.contentBounds
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
            android.graphics.drawable.Drawable r7 = r6.getDrawable()
            android.graphics.RectF r0 = r6.contentBounds
            float r1 = r0.left
            int r1 = (int) r1
            float r2 = r0.top
            int r2 = (int) r2
            float r3 = r0.right
            int r3 = (int) r3
            float r0 = r0.bottom
            int r0 = (int) r0
            r7.setBounds(r1, r2, r3, r0)
            r6.buildShadowCorners()
            return
    }

    private void buildShadowCorners() {
            r15 = this;
            r0 = 3
            r1 = 0
            android.graphics.RectF r2 = new android.graphics.RectF
            float r3 = r15.cornerRadius
            float r4 = -r3
            float r5 = -r3
            r2.<init>(r4, r5, r3, r3)
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r2)
            float r4 = r15.shadowSize
            float r5 = -r4
            float r4 = -r4
            r3.inset(r5, r4)
            android.graphics.Path r4 = r15.cornerShadowPath
            if (r4 != 0) goto L23
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r15.cornerShadowPath = r4
            goto L26
        L23:
            r4.reset()
        L26:
            android.graphics.Path r4 = r15.cornerShadowPath
            android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
            r4.setFillType(r5)
            android.graphics.Path r4 = r15.cornerShadowPath
            float r5 = r15.cornerRadius
            float r5 = -r5
            r6 = 0
            r4.moveTo(r5, r6)
            android.graphics.Path r4 = r15.cornerShadowPath
            float r5 = r15.shadowSize
            float r5 = -r5
            r4.rLineTo(r5, r6)
            android.graphics.Path r4 = r15.cornerShadowPath
            r5 = 1127481344(0x43340000, float:180.0)
            r7 = 1119092736(0x42b40000, float:90.0)
            r4.arcTo(r3, r5, r7, r1)
            android.graphics.Path r4 = r15.cornerShadowPath
            r5 = 1132920832(0x43870000, float:270.0)
            r7 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4.arcTo(r2, r5, r7, r1)
            android.graphics.Path r4 = r15.cornerShadowPath
            r4.close()
            float r4 = r3.top
            float r10 = -r4
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L8d
            float r4 = r15.cornerRadius
            float r4 = r4 / r10
            float r7 = r5 - r4
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            float r7 = r7 + r4
            android.graphics.Paint r14 = r15.cornerShadowPaint
            r8 = r7
            android.graphics.RadialGradient r7 = new android.graphics.RadialGradient
            int r9 = r15.shadowStartColor
            int r11 = r15.shadowMiddleColor
            int r12 = r15.shadowEndColor
            int[] r11 = new int[]{r1, r9, r11, r12}
            r9 = 4
            float[] r12 = new float[r9]
            r12[r1] = r6
            r6 = 1
            r12[r6] = r4
            r4 = 2
            r12[r4] = r8
            r12[r0] = r5
            android.graphics.Shader$TileMode r13 = android.graphics.Shader.TileMode.CLAMP
            r8 = 0
            r9 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.setShader(r7)
        L8d:
            android.graphics.Paint r4 = r15.edgeShadowPaint
            android.graphics.LinearGradient r5 = new android.graphics.LinearGradient
            float r7 = r2.top
            float r9 = r3.top
            int r2 = r15.shadowStartColor
            int r3 = r15.shadowMiddleColor
            int r6 = r15.shadowEndColor
            int[] r10 = new int[]{r2, r3, r6}
            float[] r11 = new float[r0]
            r11 = {x00b4: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r6 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.setShader(r5)
            android.graphics.Paint r0 = r15.edgeShadowPaint
            r0.setAntiAlias(r1)
            return
    }

    public static float calculateHorizontalPadding(float r6, float r7, boolean r8) {
            if (r8 == 0) goto Lc
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = com.google.android.material.shadow.ShadowDrawableWrapper.COS_45
            double r2 = r2 - r4
            double r6 = (double) r7
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
        Lc:
            return r6
    }

    public static float calculateVerticalPadding(float r6, float r7, boolean r8) {
            r0 = 1069547520(0x3fc00000, float:1.5)
            if (r8 == 0) goto L10
            float r6 = r6 * r0
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = com.google.android.material.shadow.ShadowDrawableWrapper.COS_45
            double r2 = r2 - r4
            double r6 = (double) r7
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
            return r6
        L10:
            float r6 = r6 * r0
            return r6
    }

    private void drawShadow(@androidx.annotation.NonNull android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            int r7 = r1.save()
            float r2 = r0.rotation
            android.graphics.RectF r3 = r0.contentBounds
            float r3 = r3.centerX()
            android.graphics.RectF r4 = r0.contentBounds
            float r4 = r4.centerY()
            r1.rotate(r2, r3, r4)
            float r8 = r0.cornerRadius
            float r2 = -r8
            float r3 = r0.shadowSize
            float r3 = r2 - r3
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.width()
            r4 = 1073741824(0x40000000, float:2.0)
            float r9 = r8 * r4
            float r2 = r2 - r9
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r2 <= 0) goto L34
            r10 = r6
            goto L35
        L34:
            r10 = r5
        L35:
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.height()
            float r2 = r2 - r9
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L42
            r11 = r6
            goto L43
        L42:
            r11 = r5
        L43:
            float r2 = r0.rawShadowSize
            r4 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r2
            float r4 = r2 - r4
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r2
            float r5 = r2 - r5
            r12 = 1065353216(0x3f800000, float:1.0)
            float r6 = r2 * r12
            float r2 = r2 - r6
            float r5 = r5 + r8
            float r13 = r8 / r5
            float r4 = r4 + r8
            float r14 = r8 / r4
            float r2 = r2 + r8
            float r15 = r8 / r2
            int r2 = r1.save()
            android.graphics.RectF r4 = r0.contentBounds
            float r5 = r4.left
            float r5 = r5 + r8
            float r4 = r4.top
            float r4 = r4 + r8
            r1.translate(r5, r4)
            r1.scale(r13, r14)
            android.graphics.Path r4 = r0.cornerShadowPath
            android.graphics.Paint r5 = r0.cornerShadowPaint
            r1.drawPath(r4, r5)
            if (r10 == 0) goto L94
            float r4 = r12 / r13
            r1.scale(r4, r12)
            android.graphics.RectF r4 = r0.contentBounds
            float r4 = r4.width()
            float r4 = r4 - r9
            float r5 = r0.cornerRadius
            float r5 = -r5
            android.graphics.Paint r6 = r0.edgeShadowPaint
            r16 = r2
            r2 = 0
            r17 = r12
            r12 = r16
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L97
        L94:
            r17 = r12
            r12 = r2
        L97:
            r1.restoreToCount(r12)
            int r12 = r1.save()
            android.graphics.RectF r2 = r0.contentBounds
            float r4 = r2.right
            float r4 = r4 - r8
            float r2 = r2.bottom
            float r2 = r2 - r8
            r1.translate(r4, r2)
            r1.scale(r13, r15)
            r2 = 1127481344(0x43340000, float:180.0)
            r1.rotate(r2)
            android.graphics.Path r2 = r0.cornerShadowPath
            android.graphics.Paint r4 = r0.cornerShadowPaint
            r1.drawPath(r2, r4)
            if (r10 == 0) goto Ld5
            float r2 = r17 / r13
            r4 = r17
            r1.scale(r2, r4)
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.width()
            float r4 = r2 - r9
            float r2 = r0.cornerRadius
            float r2 = -r2
            float r5 = r0.shadowSize
            float r5 = r5 + r2
            android.graphics.Paint r6 = r0.edgeShadowPaint
            r2 = 0
            r1.drawRect(r2, r3, r4, r5, r6)
        Ld5:
            r1.restoreToCount(r12)
            int r10 = r1.save()
            android.graphics.RectF r2 = r0.contentBounds
            float r4 = r2.left
            float r4 = r4 + r8
            float r2 = r2.bottom
            float r2 = r2 - r8
            r1.translate(r4, r2)
            r1.scale(r13, r15)
            r2 = 1132920832(0x43870000, float:270.0)
            r1.rotate(r2)
            android.graphics.Path r2 = r0.cornerShadowPath
            android.graphics.Paint r4 = r0.cornerShadowPaint
            r1.drawPath(r2, r4)
            if (r11 == 0) goto L110
            r4 = 1065353216(0x3f800000, float:1.0)
            float r12 = r4 / r15
            r1.scale(r12, r4)
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.height()
            float r4 = r2 - r9
            float r2 = r0.cornerRadius
            float r5 = -r2
            android.graphics.Paint r6 = r0.edgeShadowPaint
            r2 = 0
            r1.drawRect(r2, r3, r4, r5, r6)
        L110:
            r1.restoreToCount(r10)
            int r10 = r1.save()
            android.graphics.RectF r2 = r0.contentBounds
            float r4 = r2.right
            float r4 = r4 - r8
            float r2 = r2.top
            float r2 = r2 + r8
            r1.translate(r4, r2)
            r1.scale(r13, r14)
            r2 = 1119092736(0x42b40000, float:90.0)
            r1.rotate(r2)
            android.graphics.Path r2 = r0.cornerShadowPath
            android.graphics.Paint r4 = r0.cornerShadowPaint
            r1.drawPath(r2, r4)
            if (r11 == 0) goto L14b
            r4 = 1065353216(0x3f800000, float:1.0)
            float r12 = r4 / r14
            r1.scale(r12, r4)
            android.graphics.RectF r2 = r0.contentBounds
            float r2 = r2.height()
            float r4 = r2 - r9
            float r2 = r0.cornerRadius
            float r5 = -r2
            android.graphics.Paint r6 = r0.edgeShadowPaint
            r2 = 0
            r1.drawRect(r2, r3, r4, r5, r6)
        L14b:
            r1.restoreToCount(r10)
            r1.restoreToCount(r7)
            return
    }

    private static int toEven(float r2) {
            int r2 = java.lang.Math.round(r2)
            int r0 = r2 % 2
            r1 = 1
            if (r0 != r1) goto La
            int r2 = r2 - r1
        La:
            return r2
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.dirty
            if (r0 == 0) goto Le
            android.graphics.Rect r0 = r1.getBounds()
            r1.buildComponents(r0)
            r0 = 0
            r1.dirty = r0
        Le:
            r1.drawShadow(r2)
            super.draw(r2)
            return
    }

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.cornerRadius
            return r0
    }

    public float getMaxShadowSize() {
            r1 = this;
            float r0 = r1.rawMaxShadowSize
            return r0
    }

    public float getMinHeight() {
            r5 = this;
            float r0 = r5.rawMaxShadowSize
            float r1 = r5.cornerRadius
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r0 * r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r4
            float r1 = r5.rawMaxShadowSize
            float r1 = r1 * r2
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    public float getMinWidth() {
            r4 = this;
            float r0 = r4.rawMaxShadowSize
            float r1 = r4.cornerRadius
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r2
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r2
            float r1 = r4.rawMaxShadowSize
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public boolean getPadding(@androidx.annotation.NonNull android.graphics.Rect r5) {
            r4 = this;
            float r0 = r4.rawMaxShadowSize
            float r1 = r4.cornerRadius
            boolean r2 = r4.addPaddingForCorners
            float r0 = calculateVerticalPadding(r0, r1, r2)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r4.rawMaxShadowSize
            float r2 = r4.cornerRadius
            boolean r3 = r4.addPaddingForCorners
            float r1 = calculateHorizontalPadding(r1, r2, r3)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r5.set(r1, r0, r1, r0)
            r5 = 1
            return r5
    }

    public float getShadowSize() {
            r1 = this;
            float r0 = r1.rawShadowSize
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            r1 = 1
            r0.dirty = r1
            return
    }

    public void setAddPaddingForCorners(boolean r1) {
            r0 = this;
            r0.addPaddingForCorners = r1
            r0.invalidateSelf()
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            super.setAlpha(r2)
            android.graphics.Paint r0 = r1.cornerShadowPaint
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.edgeShadowPaint
            r0.setAlpha(r2)
            return
    }

    public void setCornerRadius(float r2) {
            r1 = this;
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            float r0 = r1.cornerRadius
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            r1.cornerRadius = r2
            r2 = 1
            r1.dirty = r2
            r1.invalidateSelf()
            return
    }

    public void setMaxShadowSize(float r2) {
            r1 = this;
            float r0 = r1.rawShadowSize
            r1.setShadowSize(r0, r2)
            return
    }

    public final void setRotation(float r2) {
            r1 = this;
            float r0 = r1.rotation
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.rotation = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setShadowSize(float r2) {
            r1 = this;
            float r0 = r1.rawMaxShadowSize
            r1.setShadowSize(r2, r0)
            return
    }

    public void setShadowSize(float r3, float r4) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L42
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L42
            int r3 = toEven(r3)
            float r3 = (float) r3
            int r4 = toEven(r4)
            float r4 = (float) r4
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1f
            boolean r3 = r2.printedShadowClipWarning
            if (r3 != 0) goto L1e
            r2.printedShadowClipWarning = r1
        L1e:
            r3 = r4
        L1f:
            float r0 = r2.rawShadowSize
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L2c
            float r0 = r2.rawMaxShadowSize
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L2c
            return
        L2c:
            r2.rawShadowSize = r3
            r2.rawMaxShadowSize = r4
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            r2.shadowSize = r3
            r2.maxShadowSize = r4
            r2.dirty = r1
            r2.invalidateSelf()
            return
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "invalid shadow size"
            r3.<init>(r4)
            throw r3
    }
}
