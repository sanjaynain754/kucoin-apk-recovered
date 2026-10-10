package com.github.penfeizhou.animation.gif.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;
import p304h8.C38141c;
import p304h8.C38145g;
import p335i8.C38483a;

/* JADX INFO: loaded from: classes45.dex */
public class GifFrame extends AbstractC6949a<GifReader, C38483a> {
    private static final int DEFAULT_DELAY = 10;
    private static final ThreadLocal<byte[]> sDataBlock;
    public final C38141c colorTable;
    public final int disposalMethod;
    private final int imageDataOffset;
    private final boolean interlace;
    private final int lzwMinCodeSize;
    public final int transparentColorIndex;

    private native void uncompressLZW(GifReader gifReader, int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14, boolean z11, byte[] bArr);

    static {
        System.loadLibrary("animation-decoder-gif");
        sDataBlock = new ThreadLocal<>();
    }

    @Override // com.github.penfeizhou.animation.decode.AbstractC6949a
    public Bitmap draw(Canvas canvas, Paint paint, int i11, Bitmap bitmap, C38483a c38483a) {
        try {
            c38483a.m87080c((this.frameWidth * this.frameHeight) / (i11 * i11));
            encode(c38483a.m87079b(), i11);
            bitmap.copyPixelsFromBuffer(c38483a.m87078a().rewind());
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            this.srcRect.bottom = bitmap.getHeight();
            Rect rect2 = this.dstRect;
            int i12 = this.frameX;
            float f11 = i11;
            rect2.left = (int) (i12 / f11);
            rect2.top = (int) (this.frameY / f11);
            rect2.right = (int) ((i12 / f11) + bitmap.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f11) + bitmap.getHeight());
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, paint);
            return bitmap;
        } catch (Exception e11) {
            e11.printStackTrace();
            return bitmap;
        }
    }

    public void encode(int[] iArr, int i11) throws IOException {
        ((GifReader) this.reader).reset();
        ((GifReader) this.reader).skip(this.imageDataOffset);
        ThreadLocal<byte[]> threadLocal = sDataBlock;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[255];
            threadLocal.set(bArr);
        }
        uncompressLZW((GifReader) this.reader, this.colorTable.m86060b(), this.transparentColorIndex, iArr, this.frameWidth / i11, this.frameHeight / i11, this.lzwMinCodeSize, this.interlace, bArr);
    }

    public boolean transparencyFlag() {
        return this.transparentColorIndex >= 0;
    }

    public GifFrame(GifReader gifReader, C38141c c38141c, @Nullable C6951b c6951b, C38145g c38145g) {
        super(gifReader);
        if (c6951b != null) {
            this.disposalMethod = c6951b.m12796c();
            int i11 = c6951b.f11607c;
            this.frameDuration = (i11 <= 0 ? 10 : i11) * 10;
            if (c6951b.m12797d()) {
                this.transparentColorIndex = c6951b.f11608d;
            } else {
                this.transparentColorIndex = -1;
            }
        } else {
            this.disposalMethod = 0;
            this.transparentColorIndex = -1;
        }
        this.frameX = c38145g.f85822a;
        this.frameY = c38145g.f85823b;
        this.frameWidth = c38145g.f85824c;
        this.frameHeight = c38145g.f85825d;
        this.interlace = c38145g.m86066b();
        if (c38145g.m86067c()) {
            this.colorTable = c38145g.f85827f;
        } else {
            this.colorTable = c38141c;
        }
        this.lzwMinCodeSize = c38145g.f85828g;
        this.imageDataOffset = c38145g.f85829h;
    }
}
