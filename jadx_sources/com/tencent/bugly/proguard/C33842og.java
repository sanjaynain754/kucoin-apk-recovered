package com.tencent.bugly.proguard;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.og */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33842og extends AbstractC33573c {
    @Override // com.tencent.bugly.proguard.AbstractC33573c
    @Nullable
    /* JADX INFO: renamed from: a */
    public C33912s4 mo72623a(@Nullable Drawable drawable) {
        return m74454a(drawable, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC33573c
    @Nullable
    /* JADX INFO: renamed from: b */
    public C33912s4 mo72625b(@Nullable Drawable drawable) {
        return m74454a(drawable, 1);
    }

    /* JADX INFO: renamed from: a */
    public final C33912s4 m74454a(@Nullable Drawable drawable, int i11) {
        Bitmap bitmap;
        if (!(drawable instanceof StateListDrawable)) {
            return null;
        }
        Drawable current = drawable.getCurrent();
        if (!(current instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) current).getBitmap()) == null) {
            return null;
        }
        return new C33912s4(i11, bitmap.getWidth(), bitmap.getHeight(), C33929t1.m75016a(bitmap), "");
    }
}
