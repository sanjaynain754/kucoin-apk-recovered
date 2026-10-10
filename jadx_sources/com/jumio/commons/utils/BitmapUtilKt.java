package com.jumio.commons.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CameraUtilsKt;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.Size;
import com.jumio.commons.log.Log;
import com.jumio.core.models.AuthorizationModel;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33757kf;
import io.github.crow_misia.libyuv.FilterMode;
import io.github.crow_misia.libyuv.RotateMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import jumio.core.C40697n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;
import ze0.C46771b;
import ze0.C46781l;
import ze0.InterfaceC46774e;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rR\u00020\u000e\u001a(\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00012\n\u0010\f\u001a\u00060\rR\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u001a\u001e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b\u001a6\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002\u001aU\u0010$\u001a\u00020\u0005*\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010'\u001a\u00020 2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010)\u001a\u00020 ¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020\u0005*\u00020\u00052\u0006\u0010,\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020 \u001a\u0012\u0010-\u001a\u00020\u001e*\u00020\u00052\u0006\u0010.\u001a\u00020/\u001a\u001c\u00100\u001a\u00020\u0005*\u00020\u00052\u0006\u00101\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020 \u001a\u001c\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u00102\u001a\u00020/2\b\b\u0002\u0010)\u001a\u00020 \u001a$\u00103\u001a\u00020\u0005*\u00020\u00052\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020/2\b\b\u0002\u0010)\u001a\u00020 \u001a<\u00104\u001a\u0002H5\"\u0004\b\u0000\u00105*\u00020\u00052\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H508\u0012\u0006\u0012\u0004\u0018\u00010907H\u0086@¢\u0006\u0002\u0010:\u001a\u0010\u0010@\u001a\u00020A2\u0006\u00101\u001a\u00020\u000bH\u0002\u001a\u0012\u0010B\u001a\u00020/*\u00020\u00052\u0006\u0010(\u001a\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010;\u001a\u00020\t¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006C"}, m90084d2 = {"TAG", "", "saveBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "file", "Ljava/io/File;", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", C33757kf.f70665k, "", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "Lcom/jumio/core/models/AuthorizationModel;", "readBitmap", "imagePath", "options", "Landroid/graphics/BitmapFactory$Options;", "nv21ToBitmap", "nv21Bytes", "", "width", "height", "applyPreviewFrameCropToHighResolutionFrame", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "centerCrop", "", "cropRect", "scale", "", "cropRotateScale", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", BridgeParamKeyKt.CAPTURE, "maxSize", "recycle", "(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;ZZLjava/lang/Integer;Z)Landroid/graphics/Bitmap;", "crop", "roi", "getCenterCropRoi", "size", "Lcom/jumio/commons/camera/Size;", "rotate", "rotationDegrees", "dstSize", "scaleRotate", "use", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "webpFormat", "getWebpFormat$annotations", "()V", "getWebpFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "rotateModeForDegrees", "Lio/github/crow_misia/libyuv/RotateMode;", "widthHeightForMaxSize", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBitmapUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtil.kt\ncom/jumio/commons/utils/BitmapUtilKt\n+ 2 Timing.kt\nkotlin/system/TimingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n29#2,3:391\n29#2,2:394\n31#2:397\n29#2,3:398\n29#2,3:401\n29#2,3:404\n1#3:396\n*S KotlinDebug\n*F\n+ 1 BitmapUtil.kt\ncom/jumio/commons/utils/BitmapUtilKt\n*L\n89#1:391,3\n209#1:394,2\n209#1:397\n245#1:398,3\n286#1:401,3\n317#1:404,3\n*E\n"})
public final class BitmapUtilKt {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.CompressFormat f13596a;

    public static /* synthetic */ Bitmap cropRotateScale$default(Bitmap bitmap, Frame.Metadata metadata, CameraSettings cameraSettings, Rect rect, boolean z11, boolean z12, Integer num, boolean z13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            rect = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        if ((i11 & 32) != 0) {
            num = null;
        }
        if ((i11 & 64) != 0) {
            z13 = true;
        }
        return cropRotateScale(bitmap, metadata, cameraSettings, rect, z11, z12, num, z13);
    }

    static {
        f13596a = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
    }

    @NotNull
    public static final Bitmap applyPreviewFrameCropToHighResolutionFrame(@NotNull Frame frame, @NotNull CameraSettings cameraSettings, @Nullable Rect rect, boolean z11, @Nullable Rect rect2) {
        Bitmap bitmapCropRotateScale$default;
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        float width = (!CameraUtilsKt.frameRotationMatchesPreviewRotation(frame.getMetadata(), cameraSettings) ? frame.getMetadata().getSize().flip() : frame.getMetadata().getSize()).getWidth() / cameraSettings.getF13517c().getWidth();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(frame.getByteArray(), 0, frame.getByteArray().length);
        if (rect2 != null) {
            Rect rect3 = width == 1.0f ? new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom) : new Rect((int) ((rect2.left * width) + 0.5f), (int) ((rect2.top * width) + 0.5f), (int) ((rect2.right * width) + 0.5f), (int) ((rect2.bottom * width) + 0.5f));
            Intrinsics.checkNotNull(bitmapDecodeByteArray);
            bitmapCropRotateScale$default = crop$default(cropRotateScale$default(bitmapDecodeByteArray, frame.getMetadata(), cameraSettings, rect, true, true, null, false, 96, null), rect3, false, 2, null);
        } else if (z11) {
            Intrinsics.checkNotNull(bitmapDecodeByteArray);
            bitmapCropRotateScale$default = cropRotateScale$default(bitmapDecodeByteArray, frame.getMetadata(), cameraSettings, rect, true, true, null, false, 96, null);
        } else {
            bitmapCropRotateScale$default = bitmapDecodeByteArray;
        }
        Intrinsics.checkNotNullExpressionValue(bitmapCropRotateScale$default, "with(...)");
        return bitmapCropRotateScale$default;
    }

    public static /* synthetic */ Bitmap applyPreviewFrameCropToHighResolutionFrame$default(Frame frame, CameraSettings cameraSettings, Rect rect, boolean z11, Rect rect2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        if ((i11 & 16) != 0) {
            rect2 = null;
        }
        return applyPreviewFrameCropToHighResolutionFrame(frame, cameraSettings, rect, z11, rect2);
    }

    @NotNull
    public static final Bitmap crop(@NotNull Bitmap bitmap, @NotNull Rect roi, boolean z11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(roi, "roi");
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(roi.left, 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(roi.top, 0);
        int iWidth = roi.width();
        Integer numValueOf = Integer.valueOf(iWidth);
        int i11 = iWidth + iCoerceAtLeast;
        Integer num = null;
        if (i11 <= 0 || i11 > bitmap.getWidth()) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : bitmap.getWidth() - iCoerceAtLeast;
        int iHeight = roi.height();
        Integer numValueOf2 = Integer.valueOf(iHeight);
        int i12 = iHeight + iCoerceAtLeast2;
        if (i12 > 0 && i12 <= bitmap.getHeight()) {
            num = numValueOf2;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, iCoerceAtLeast, iCoerceAtLeast2, iIntValue, num != null ? num.intValue() : bitmap.getHeight() - iCoerceAtLeast2);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Log.m14479v("BitmapUtil", "Cropping to " + bitmapCreateBitmap.getWidth() + 'x' + bitmapCreateBitmap.getHeight() + " took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (z11 && !Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap crop$default(Bitmap bitmap, Rect rect, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return crop(bitmap, rect, z11);
    }

    @NotNull
    public static final Bitmap cropRotateScale(@NotNull Bitmap bitmap, @NotNull Frame.Metadata metadata, @NotNull CameraSettings cameraSettings, @Nullable Rect rect, boolean z11, boolean z12, @Nullable Integer num, boolean z13) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Rect rectFrameCropRect = CameraUtilsKt.frameCropRect(metadata, cameraSettings, rect, z11, z12);
        int rotation = metadata.getRotation();
        StringBuilder sb2 = new StringBuilder("Cropping to ");
        sb2.append(rectFrameCropRect);
        sb2.append(" (");
        sb2.append(rectFrameCropRect.width());
        sb2.append('x');
        sb2.append(rectFrameCropRect.height());
        sb2.append("), rotating ");
        sb2.append(rotation);
        sb2.append(" degrees, scaling to ");
        sb2.append(num == null ? "FULL" : num);
        Log.m14479v("BitmapUtil", sb2.toString());
        if (num == null) {
            return rotate(crop(bitmap, rectFrameCropRect, z13), rotation, z13);
        }
        Bitmap bitmapCrop = crop(bitmap, rectFrameCropRect, z13);
        return scaleRotate(bitmapCrop, rotation, widthHeightForMaxSize(bitmapCrop, num.intValue()), z13);
    }

    @NotNull
    public static final Rect getCenterCropRoi(@NotNull Bitmap bitmap, @NotNull Size size) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        int width = (bitmap.getWidth() - size.getWidth()) / 2;
        int height = (bitmap.getHeight() - size.getHeight()) / 2;
        return new Rect(width, height, size.getWidth() + width, size.getWidth() + height);
    }

    @NotNull
    public static final Bitmap.CompressFormat getWebpFormat() {
        return f13596a;
    }

    @NotNull
    public static final Bitmap nv21ToBitmap(@NotNull byte[] nv21Bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(nv21Bytes, "nv21Bytes");
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC46774e interfaceC46774eM103071e = C46771b.INSTANCE.m103071e(i11, i12);
        try {
            C46771b c46771b = (C46771b) interfaceC46774eM103071e;
            InterfaceC46774e interfaceC46774eM103099c = C46781l.INSTANCE.m103099c(i11, i12);
            try {
                C46781l c46781l = (C46781l) interfaceC46774eM103099c;
                c46781l.m103073a().put(nv21Bytes);
                c46781l.m103095g(c46771b);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(interfaceC46774eM103099c, null);
                Bitmap bitmapM103059g = c46771b.m103059g();
                CloseableKt.closeFinally(interfaceC46774eM103071e, null);
                Log.m14479v("BitmapUtil", "Bitmap creation from byte array took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return bitmapM103059g;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(interfaceC46774eM103099c, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(interfaceC46774eM103071e, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public static final Bitmap readBitmap(@NotNull String imagePath, @NotNull AuthorizationModel.SessionKey sessionKey, @Nullable BitmapFactory.Options options) throws Throwable {
        CipherInputStream cipherInputStream;
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        CipherInputStream cipherInputStream2 = null;
        try {
            try {
                cipherInputStream = new CipherInputStream(new FileInputStream(imagePath), sessionKey.getDecryptCipher());
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(cipherInputStream, null, options);
                    cipherInputStream.close();
                    return bitmapDecodeStream;
                } catch (Exception e11) {
                    e = e11;
                    try {
                        Log.printStackTrace(e);
                        if (cipherInputStream != null) {
                            cipherInputStream.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cipherInputStream2 = cipherInputStream;
                        cipherInputStream = cipherInputStream2;
                        if (cipherInputStream != null) {
                            try {
                                cipherInputStream.close();
                            } catch (IOException e12) {
                                Log.printStackTrace(e12);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (cipherInputStream != null) {
                        cipherInputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e13) {
                Log.printStackTrace(e13);
                return null;
            }
        } catch (Exception e14) {
            e = e14;
            cipherInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            cipherInputStream = cipherInputStream2;
            if (cipherInputStream != null) {
                cipherInputStream.close();
            }
            throw th;
        }
    }

    public static /* synthetic */ Bitmap readBitmap$default(String str, AuthorizationModel.SessionKey sessionKey, BitmapFactory.Options options, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            options = null;
        }
        return readBitmap(str, sessionKey, options);
    }

    @NotNull
    public static final Bitmap rotate(@NotNull Bitmap bitmap, int i11, boolean z11) {
        RotateMode rotateMode;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C46771b.Companion aVar = C46771b.INSTANCE;
        C46771b c46771b = (C46771b) aVar.m103071e(bitmap.getWidth(), bitmap.getHeight());
        bitmap.copyPixelsToBuffer(c46771b.m103073a());
        C46771b c46771b2 = (C46771b) aVar.m103071e((i11 == 0 || i11 == 180) ? bitmap.getWidth() : bitmap.getHeight(), (i11 == 0 || i11 == 180) ? bitmap.getHeight() : bitmap.getWidth());
        if (i11 == 90) {
            rotateMode = RotateMode.ROTATE_90;
        } else if (i11 != 180) {
            rotateMode = i11 != 270 ? RotateMode.ROTATE_0 : RotateMode.ROTATE_270;
        } else {
            rotateMode = RotateMode.ROTATE_180;
        }
        c46771b.m103061i(c46771b2, rotateMode);
        Bitmap bitmapM103059g = c46771b2.m103059g();
        c46771b.close();
        c46771b2.close();
        Log.m14479v("BitmapUtil", "Rotating by " + i11 + " took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (z11 && !Intrinsics.areEqual(bitmapM103059g, bitmap)) {
            bitmap.recycle();
        }
        return bitmapM103059g;
    }

    public static /* synthetic */ Bitmap rotate$default(Bitmap bitmap, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        return rotate(bitmap, i11, z11);
    }

    public static final void saveBitmap(@NotNull Bitmap bitmap, @NotNull File file, @NotNull Bitmap.CompressFormat compressFormat, int i11, @NotNull AuthorizationModel.SessionKey sessionKey) throws Throwable {
        CipherOutputStream cipherOutputStream;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        CipherOutputStream cipherOutputStream2 = null;
        try {
            try {
                try {
                    cipherOutputStream = new CipherOutputStream(new FileOutputStream(file), sessionKey.getEncryptCipher());
                    try {
                        bitmap.compress(compressFormat, i11, cipherOutputStream);
                        cipherOutputStream.flush();
                        cipherOutputStream.close();
                    } catch (Exception e11) {
                        e = e11;
                        cipherOutputStream2 = cipherOutputStream;
                        Log.m14471e("BitmapUtil", e);
                        if (cipherOutputStream2 != null) {
                            cipherOutputStream2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cipherOutputStream != null) {
                            try {
                                cipherOutputStream.close();
                            } catch (IOException e12) {
                                Log.m14471e("BitmapUtil", e12);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cipherOutputStream = cipherOutputStream2;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (IOException e14) {
            Log.m14471e("BitmapUtil", e14);
        }
    }

    @NotNull
    public static final Bitmap scale(@NotNull Bitmap bitmap, @NotNull Size dstSize, boolean z11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(dstSize, "dstSize");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C46771b.Companion aVar = C46771b.INSTANCE;
        C46771b c46771b = (C46771b) aVar.m103071e(bitmap.getWidth(), bitmap.getHeight());
        bitmap.copyPixelsToBuffer(c46771b.m103073a());
        C46771b c46771b2 = (C46771b) aVar.m103071e(dstSize.getWidth(), dstSize.getHeight());
        c46771b.m103063k(c46771b2, FilterMode.BILINEAR);
        Bitmap bitmapM103059g = c46771b2.m103059g();
        c46771b.close();
        c46771b2.close();
        Log.m14479v("BitmapUtil", "Scaling to " + dstSize + " took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (z11 && !Intrinsics.areEqual(bitmapM103059g, bitmap)) {
            bitmap.recycle();
        }
        return bitmapM103059g;
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, Size size, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return scale(bitmap, size, z11);
    }

    @NotNull
    public static final Bitmap scaleRotate(@NotNull Bitmap bitmap, int i11, @NotNull Size dstSize, boolean z11) {
        RotateMode rotateMode;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(dstSize, "dstSize");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C46771b.Companion aVar = C46771b.INSTANCE;
        C46771b c46771b = (C46771b) aVar.m103071e(bitmap.getWidth(), bitmap.getHeight());
        bitmap.copyPixelsToBuffer(c46771b.m103073a());
        C46771b c46771b2 = (C46771b) aVar.m103071e(dstSize.getWidth(), dstSize.getHeight());
        C46771b c46771b3 = (C46771b) aVar.m103071e((i11 == 0 || i11 == 180) ? dstSize.getWidth() : dstSize.getHeight(), (i11 == 0 || i11 == 180) ? dstSize.getHeight() : dstSize.getWidth());
        c46771b.m103063k(c46771b2, FilterMode.BILINEAR);
        if (i11 == 90) {
            rotateMode = RotateMode.ROTATE_90;
        } else if (i11 != 180) {
            rotateMode = i11 != 270 ? RotateMode.ROTATE_0 : RotateMode.ROTATE_270;
        } else {
            rotateMode = RotateMode.ROTATE_180;
        }
        c46771b2.m103061i(c46771b3, rotateMode);
        Bitmap bitmapM103059g = c46771b3.m103059g();
        c46771b.close();
        c46771b2.close();
        c46771b3.close();
        Log.m14479v("BitmapUtil", "Scaling to " + dstSize + " / Rotating by " + i11 + " took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (z11 && !Intrinsics.areEqual(bitmapM103059g, bitmap)) {
            bitmap.recycle();
        }
        return bitmapM103059g;
    }

    public static /* synthetic */ Bitmap scaleRotate$default(Bitmap bitmap, int i11, Size size, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return scaleRotate(bitmap, i11, size, z11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object use(@NotNull Bitmap bitmap, @NotNull Function2<? super Bitmap, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        C40697n c40697n;
        if (continuation instanceof C40697n) {
            c40697n = (C40697n) continuation;
            int i11 = c40697n.f90333d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40697n.f90333d = i11 - Integer.MIN_VALUE;
            } else {
                c40697n = new C40697n(continuation);
            }
        } else {
            c40697n = new C40697n(continuation);
        }
        Object objInvoke = c40697n.f90332c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40697n.f90333d;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                c40697n.f90330a = bitmap;
                c40697n.f90331b = SpillingKt.nullOutSpilledVariable(function2);
                c40697n.f90333d = 1;
                objInvoke = function2.invoke(bitmap, c40697n);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap = c40697n.f90330a;
                ResultKt.throwOnFailure(objInvoke);
            }
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return objInvoke;
        } catch (Throwable th2) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th2;
        }
    }

    @NotNull
    public static final Size widthHeightForMaxSize(@NotNull Bitmap bitmap, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Size size = new Size(i11, i11);
        if (bitmap.getWidth() > bitmap.getHeight()) {
            size.setHeight((int) (i11 * (bitmap.getHeight() / bitmap.getWidth())));
            return size;
        }
        size.setWidth((int) (i11 * (bitmap.getWidth() / bitmap.getHeight())));
        return size;
    }

    public static /* synthetic */ void getWebpFormat$annotations() {
    }
}
