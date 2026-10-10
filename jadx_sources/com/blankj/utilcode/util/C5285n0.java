package com.blankj.utilcode.util;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: renamed from: com.blankj.utilcode.util.n0 */
/* JADX INFO: compiled from: UriUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5285n0 {
    /* JADX INFO: renamed from: a */
    public static Uri m6316a(@NonNull File file) {
        if (file == null) {
            throw new NullPointerException("Argument 'file' of type File (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        return FileProvider.getUriForFile(C5287o0.m6331a(), C5287o0.m6331a().getPackageName() + ".utilcode.provider", file);
    }
}
