package p783y2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33757kf;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: compiled from: ThumbnailUtility.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Ly2/a;", "", "", "channelName", "<init>", "(Ljava/lang/String;)V", "path", "", C33757kf.f70665k, "", ViewProps.POSITION, "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;IJLio/flutter/plugin/common/MethodChannel$Result;)V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;Ljava/lang/String;IJLio/flutter/plugin/common/MethodChannel$Result;)V", "Ly2/b;", "Ly2/b;", "utility", "video_compress_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C46365a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C46366b utility;

    public C46365a(@NotNull String channelName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        this.utility = new C46366b(channelName);
    }

    /* JADX INFO: renamed from: b */
    public final void m102255b(@NotNull Context context, @NotNull String path, int quality, long position, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(result, "result");
        Bitmap bitmapM102258c = this.utility.m102258c(path, position, result);
        File externalFilesDir = context.getExternalFilesDir("video_compress");
        if (externalFilesDir != null && !externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = path.substring(StringsKt.lastIndexOf$default((CharSequence) path, '/', 0, false, 6, (Object) null), StringsKt.lastIndexOf$default((CharSequence) path, '.', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(strSubstring);
        sb2.append(".jpg");
        File file = new File(externalFilesDir, sb2.toString());
        this.utility.m102257b(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapM102258c.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            file.createNewFile();
            Intrinsics.checkNotNull(byteArray);
            FilesKt.writeBytes(file, byteArray);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        bitmapM102258c.recycle();
        result.success(file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: a */
    public final void m102254a(@NotNull String path, int quality, long position, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(result, "result");
        Bitmap bitmapM102258c = this.utility.m102258c(path, position, result);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapM102258c.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmapM102258c.recycle();
        Intrinsics.checkNotNull(byteArray);
        result.success(CollectionsKt.toByteArray(ArraysKt.toList(byteArray)));
    }
}
