package com.kubi.mine.lib.view;

import android.graphics.BitmapFactory;
import java.io.File;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.mine.lib.view.j */
/* JADX INFO: compiled from: UploadAvatarImageView.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, m90084d2 = {"getImageInfo", "Lcom/kubi/mine/lib/view/ImageInfo;", "path", "", "checkImage", "Lcom/kubi/mine/lib/view/ImageCheckResult;", "imageInfo", "MineLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUploadAvatarImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadAvatarImageView.kt\ncom/kubi/mine/lib/view/UploadAvatarImageViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n1#2:348\n*E\n"})
public final class C19215j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ImageCheckResult m42378a(@Nullable ImageInfo imageInfo) {
        if (imageInfo == null) {
            return ImageCheckResult.INVALID_FORMAT;
        }
        Set of2 = SetsKt.setOf((Object[]) new String[]{"image/jpeg", "image/jpg", "image/png", "image/gif"});
        String lowerCase = imageInfo.getMimeType().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return !of2.contains(lowerCase) ? ImageCheckResult.INVALID_FORMAT : ImageCheckResult.VALID;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ImageInfo m42379b(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        long length = file.length();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        String str = options.outMimeType;
        if (str == null) {
            str = "";
        }
        ImageInfo imageInfo = new ImageInfo(length, i11, i12, str);
        C44128b.m97259c("UploadAvatarImageView", "getImageInfo: " + imageInfo);
        return imageInfo;
    }
}
