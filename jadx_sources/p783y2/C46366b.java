package p783y2;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: y2.b */
/* JADX INFO: compiled from: Utility.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f¨\u0006 "}, m90084d2 = {"Ly2/b;", "", "", "channelName", "<init>", "(Ljava/lang/String;)V", "", "orientation", "", "e", "(I)Z", "Ljava/io/File;", "file", "", "b", "(Ljava/io/File;)V", "Landroid/content/Context;", "context", "path", "Lorg/json/JSONObject;", "d", "(Landroid/content/Context;Ljava/lang/String;)Lorg/json/JSONObject;", "", ViewProps.POSITION, "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "Landroid/graphics/Bitmap;", "c", "(Ljava/lang/String;JLio/flutter/plugin/common/MethodChannel$Result;)Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Ljava/lang/String;", "video_compress_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C46366b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String channelName;

    public C46366b(@NotNull String channelName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        this.channelName = channelName;
    }

    /* JADX INFO: renamed from: a */
    public final void m102256a(@NotNull Context context, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(result, "result");
        File externalFilesDir = context.getExternalFilesDir("video_compress");
        result.success(externalFilesDir != null ? Boolean.valueOf(FilesKt.deleteRecursively(externalFilesDir)) : null);
    }

    /* JADX INFO: renamed from: b */
    public final void m102257b(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            file.delete();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Bitmap m102258c(@NotNull String path, long position, @NotNull MethodChannel.Result result) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(result, "result");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmapCreateScaledBitmap = null;
        try {
            try {
                mediaMetadataRetriever.setDataSource(path);
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(position, 2);
                try {
                    mediaMetadataRetriever.release();
                } catch (RuntimeException unused) {
                    result.error(this.channelName, "Ignore failures while cleaning up", null);
                }
                bitmapCreateScaledBitmap = frameAtTime;
            } catch (IllegalArgumentException unused2) {
                result.error(this.channelName, "Assume this is a corrupt video file", null);
                try {
                    mediaMetadataRetriever.release();
                } catch (RuntimeException unused3) {
                    result.error(this.channelName, "Ignore failures while cleaning up", null);
                }
            } catch (RuntimeException unused4) {
                result.error(this.channelName, "Assume this is a corrupt video file", null);
                mediaMetadataRetriever.release();
            }
            if (bitmapCreateScaledBitmap == null) {
                result.success(new Integer[0]);
            }
            Intrinsics.checkNotNull(bitmapCreateScaledBitmap);
            int width = bitmapCreateScaledBitmap.getWidth();
            int height = bitmapCreateScaledBitmap.getHeight();
            int iMax = Math.max(width, height);
            if (iMax > 512) {
                float f11 = 512.0f / iMax;
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, Math.round(width * f11), Math.round(f11 * height), true);
            }
            Intrinsics.checkNotNull(bitmapCreateScaledBitmap);
            return bitmapCreateScaledBitmap;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused5) {
                result.error(this.channelName, "Ignore failures while cleaning up", null);
            }
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final JSONObject m102259d(@NotNull Context context, @NotNull String path) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, Uri.fromFile(file));
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(7);
        if (strExtractMetadata2 == null) {
            strExtractMetadata2 = "";
        }
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(3);
        String str = strExtractMetadata3 != null ? strExtractMetadata3 : "";
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
        long j11 = Long.parseLong(strExtractMetadata);
        long j12 = Long.parseLong(strExtractMetadata4);
        long j13 = Long.parseLong(strExtractMetadata5);
        long length = file.length();
        String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(24);
        Integer intOrNull = strExtractMetadata6 != null ? StringsKt.toIntOrNull(strExtractMetadata6) : null;
        if (intOrNull != null && m102260e(intOrNull.intValue())) {
            j12 = j13;
            j13 = j12;
        }
        mediaMetadataRetriever.release();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", path);
        jSONObject.put("title", strExtractMetadata2);
        jSONObject.put("author", str);
        jSONObject.put("width", j12);
        jSONObject.put("height", j13);
        jSONObject.put(TypedValues.TransitionType.S_DURATION, j11);
        jSONObject.put("filesize", length);
        if (intOrNull != null) {
            jSONObject.put("orientation", intOrNull.intValue());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m102260e(int orientation) {
        return (orientation == 90 || orientation == 270) ? false : true;
    }
}
