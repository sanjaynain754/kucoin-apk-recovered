package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.p065io.InterfaceC6956e;
import com.github.penfeizhou.animation.p065io.Reader;

/* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.a */
/* JADX INFO: compiled from: Frame.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6949a<R extends Reader, W extends InterfaceC6956e> {
    public int frameDuration;
    public int frameHeight;
    public int frameWidth;
    public int frameX;
    public int frameY;
    protected final R reader;
    protected final Rect srcRect = new Rect();
    protected final Rect dstRect = new Rect();

    public abstract Bitmap draw(Canvas canvas, Paint paint, int i11, Bitmap bitmap, W w11);

    public AbstractC6949a(R r11) {
        this.reader = r11;
    }
}
