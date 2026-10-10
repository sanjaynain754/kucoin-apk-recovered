package com.tencent.bugly.proguard;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.utils.AndroidVersion;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33929t1 {
    /* JADX INFO: renamed from: a */
    public static int m75016a(@NonNull Bitmap bitmap) {
        if (AndroidVersion.isOverKitKat()) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }
}
