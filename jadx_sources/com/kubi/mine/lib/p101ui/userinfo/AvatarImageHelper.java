package com.kubi.mine.lib.p101ui.userinfo;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AvatarImageHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ(\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/AvatarImageHelper;", "", "<init>", "()V", "TAG", "", "isNeedRotateBitmap", "", "imagePath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateBitmap", "Landroid/graphics/Bitmap;", "createRotatedBitmapIfNeeded", "saveBitmapToCache", "context", "Landroid/content/Context;", "bitmap", "fileName", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateFileSizeBytes", "", "filePath", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AvatarImageHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AvatarImageHelper f35370a = new AvatarImageHelper();

    /* JADX INFO: renamed from: a */
    public final long m42287a(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null && !StringsKt.isBlank(str)) {
            try {
                File file = new File(context.getCacheDir(), str);
                if (file.exists() && file.isFile()) {
                    return RangesKt.coerceAtLeast(file.length(), 0L);
                }
                return 0L;
            } catch (Throwable th2) {
                C44128b.m97261e("AvatarImageHelper", "calculateFileSizeBytes error: " + th2.getMessage());
            }
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m42288b(@NotNull String str, @NotNull Continuation<? super Bitmap> continuation) {
        return C41686h.m91049g(C41782z0.m91392b(), new AvatarImageHelper$createRotatedBitmapIfNeeded$2(str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m42289c(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C41782z0.m91392b(), new AvatarImageHelper$isNeedRotateBitmap$2(str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m42290d(@NotNull String str, @NotNull Continuation<? super Bitmap> continuation) {
        return C41686h.m91049g(C41782z0.m91392b(), new AvatarImageHelper$rotateBitmap$2(str, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m42291e(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull String str, @NotNull Continuation<? super String> continuation) {
        return C41686h.m91049g(C41782z0.m91392b(), new AvatarImageHelper$saveBitmapToCache$2(context, str, bitmap, null), continuation);
    }
}
