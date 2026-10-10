package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import p192d6.C36621b;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.n */
/* JADX INFO: compiled from: RoundedNinePatchDrawable.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5594n extends AbstractC5593m {
    public C5594n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // com.facebook.drawee.drawable.AbstractC5593m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("RoundedNinePatchDrawable#draw");
        }
        if (!mo8688k()) {
            super.draw(canvas);
            if (C36621b.m81959d()) {
                C36621b.m81958b();
                return;
            }
            return;
        }
        mo8689m();
        m8698l();
        canvas.clipPath(this.f8323f);
        super.draw(canvas);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }
}
