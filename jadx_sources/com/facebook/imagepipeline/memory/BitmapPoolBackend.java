package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p008a6.AbstractC0163w;
import p284g6.C37818c;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BitmapPoolBackend.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/imagepipeline/memory/BitmapPoolBackend;", "La6/w;", "Landroid/graphics/Bitmap;", "<init>", "()V", "bitmap", "", "f", "(Landroid/graphics/Bitmap;)V", "", "size", "c", "(I)Landroid/graphics/Bitmap;", "d", "(Landroid/graphics/Bitmap;)I", "", "e", "(Landroid/graphics/Bitmap;)Z", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class BitmapPoolBackend extends AbstractC0163w<Bitmap> {
    /* JADX INFO: renamed from: e */
    public final boolean m9484e(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C45999a.m101494O("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        C45999a.m101494O("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // p008a6.InterfaceC0140d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int mo626a(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return C37818c.m85341j(bitmap);
    }

    @Override // p008a6.AbstractC0163w, p008a6.InterfaceC0140d0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void put(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (m9484e(bitmap)) {
            super.put(bitmap);
        }
    }

    @Override // p008a6.AbstractC0163w, p008a6.InterfaceC0140d0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int size) {
        Bitmap bitmap = (Bitmap) super.get(size);
        if (bitmap != null && m9484e(bitmap)) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        return null;
    }
}
