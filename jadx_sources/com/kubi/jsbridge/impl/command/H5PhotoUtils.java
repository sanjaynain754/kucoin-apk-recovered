package com.kubi.jsbridge.impl.command;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.WorkerThread;
import androidx.media3.common.MimeTypes;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.jsbridge.impl.command.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: H5PhotoUtils.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/command/H5PhotoUtils;", "", "<init>", "()V", "DIR_H5_IMAGES", "", "copyUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "fromUri", "isVideo", "", "uri", "getImgType", "getVideoDimensions", "Lkotlin/Pair;", "", "getVideoDuration", "", "getFileSize", "", "getImageDimensions", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nH5PhotoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 H5PhotoUtils.kt\ncom/kubi/jsbridge/impl/command/H5PhotoUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public final class H5PhotoUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final H5PhotoUtils f27395a = new H5PhotoUtils();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Pair<Integer, Integer> m31623e(@NotNull Context context, @Nullable Uri uri) {
        Integer intOrNull;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                int iIntValue = (strExtractMetadata == null || (intOrNull2 = StringsKt.toIntOrNull(strExtractMetadata)) == null) ? 0 : intOrNull2.intValue();
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                return TuplesKt.m90091to(Integer.valueOf(iIntValue), Integer.valueOf((strExtractMetadata2 == null || (intOrNull = StringsKt.toIntOrNull(strExtractMetadata2)) == null) ? 0 : intOrNull.intValue()));
            } finally {
                mediaMetadataRetriever.release();
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return TuplesKt.m90091to(0, 0);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final long m31624f(@NotNull Context context, @Nullable Uri uri) {
        Long longOrNull;
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return 0L;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                return (strExtractMetadata == null || (longOrNull = StringsKt.toLongOrNull(strExtractMetadata)) == null) ? 0L : longOrNull.longValue();
            } finally {
                mediaMetadataRetriever.release();
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return 0L;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m31625g(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String type = context.getContentResolver().getType(uri);
        return type != null && StringsKt.startsWith$default(type, "video/", false, 2, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b7, please report this as an issue */
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Uri m31626a(@NotNull Context context, @NotNull Uri fromUri) {
        Throwable thM103847exceptionOrNullimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fromUri, "fromUri");
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM31629d = m31629d(context, fromUri);
            File file = new File(context.getCacheDir().getAbsolutePath() + File.separator + "kh5_images");
            file.mkdirs();
            File file2 = new File(file, System.currentTimeMillis() + '-' + UUID.randomUUID() + '.' + strM31629d);
            file2.createNewFile();
            Uri uriFromFile = Uri.fromFile(file2);
            ContentResolver contentResolver = context.getContentResolver();
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriFromFile);
            if (outputStreamOpenOutputStream == null) {
                return null;
            }
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(fromUri);
                if (inputStreamOpenInputStream == null) {
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                    return null;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i11 = inputStreamOpenInputStream.read(bArr);
                        if (i11 == -1) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                            CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                            return uriFromFile;
                        }
                        outputStreamOpenOutputStream.write(bArr, 0, i11);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(outputStreamOpenOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(inputStreamOpenInputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
            Result.Companion companion2 = Result.INSTANCE;
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th)));
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97261e("H5PhotoUtils", "error: " + thM103847exceptionOrNullimpl);
            }
            return null;
        } catch (Throwable th6) {
            Result.Companion companion3 = Result.INSTANCE;
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th6)));
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97261e("H5PhotoUtils", "error: " + thM103847exceptionOrNullimpl);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final double m31627b(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return 0.0d;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    double dDoubleValue = new BigDecimal(String.valueOf(parcelFileDescriptorOpenFileDescriptor.getStatSize())).divide(new BigDecimal("1024")).setScale(2, RoundingMode.HALF_UP).doubleValue();
                    CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, null);
                    return dDoubleValue;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, th2);
                        throw th3;
                    }
                }
            }
            Result.m103844constructorimpl(null);
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        return 0.0d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Pair<Integer, Integer> m31628c(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return TuplesKt.m90091to(0, 0);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                Result.m103844constructorimpl(null);
                return TuplesKt.m90091to(0, 0);
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                Pair<Integer, Integer> pairM90091to = TuplesKt.m90091to(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return pairM90091to;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m31629d(@NotNull Context context, @NotNull Uri fromUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fromUri, "fromUri");
        String type = context.getContentResolver().getType(fromUri);
        if (type == null) {
            return "jpg";
        }
        switch (type.hashCode()) {
            case -1664118616:
                return !type.equals(MimeTypes.VIDEO_H263) ? "jpg" : "3gp";
            case -1662095187:
                return !type.equals(MimeTypes.VIDEO_WEBM) ? "jpg" : "webm";
            case -1487394660:
                type.equals("image/jpeg");
                return "jpg";
            case -879267568:
                return !type.equals("image/gif") ? "jpg" : "gif";
            case -879258763:
                return !type.equals("image/png") ? "jpg" : "png";
            case -107252314:
                return !type.equals("video/quicktime") ? "jpg" : "mov";
            case 1331848029:
                return !type.equals(MimeTypes.VIDEO_MP4) ? "jpg" : "mp4";
            default:
                return "jpg";
        }
    }
}
