package com.facebook.fresco.vito.options;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.request.InterfaceC5742b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p585r5.C43928c;
import p712w3.C45706f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.facebook.fresco.vito.options.a */
/* JADX INFO: compiled from: DecodedImageOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001NB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010,\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u00102\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u00108\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010<\u001a\u0002098\u0006¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b.\u0010;R\u0019\u0010@\u001a\u0004\u0018\u00010=8\u0006¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\b(\u0010?R\u0017\u0010C\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010A\u001a\u0004\bB\u0010\bR\u0017\u0010E\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bD\u0010\bR\u0019\u0010I\u001a\u0004\u0018\u00010F8\u0006¢\u0006\f\n\u0004\b$\u0010G\u001a\u0004\b4\u0010HR\u0019\u0010M\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010L¨\u0006O"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/a;", "Lcom/facebook/fresco/vito/options/b;", "Lcom/facebook/fresco/vito/options/a$a;", "builder", "<init>", "(Lcom/facebook/fresco/vito/options/a$a;)V", "", "f", "()Z", "other", "g", "(Lcom/facebook/fresco/vito/options/a;)Z", "", "hashCode", "()I", "Lw3/f$a;", "e", "()Lw3/f$a;", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "d", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "p", "()Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "Lcom/facebook/imagepipeline/core/DownsampleMode;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleOverride", "Lcom/facebook/imagepipeline/common/RotationOptions;", "Lcom/facebook/imagepipeline/common/RotationOptions;", "q", "()Lcom/facebook/imagepipeline/common/RotationOptions;", "rotationOptions", "Lcom/facebook/imagepipeline/request/b;", "Lcom/facebook/imagepipeline/request/b;", "o", "()Lcom/facebook/imagepipeline/request/b;", "postprocessor", "Lr5/c;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lr5/c;", "m", "()Lr5/c;", "imageDecodeOptions", "Lcom/facebook/fresco/vito/options/RoundingOptions;", "i", "Lcom/facebook/fresco/vito/options/RoundingOptions;", "r", "()Lcom/facebook/fresco/vito/options/RoundingOptions;", "roundingOptions", "Lcom/facebook/fresco/vito/options/BorderOptions;", "j", "Lcom/facebook/fresco/vito/options/BorderOptions;", "k", "()Lcom/facebook/fresco/vito/options/BorderOptions;", "borderOptions", "Lcom/facebook/drawee/drawable/q;", "Lcom/facebook/drawee/drawable/q;", "()Lcom/facebook/drawee/drawable/q;", "actualImageScaleType", "Landroid/graphics/PointF;", "Landroid/graphics/PointF;", "()Landroid/graphics/PointF;", "actualImageFocusPoint", "Z", "getMLocalThumbnailPreviewsEnabled", "mLocalThumbnailPreviewsEnabled", "n", "loadThumbnailOnly", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ljava/lang/Boolean;", CmcdData.Factory.STREAMING_FORMAT_SS, "()Ljava/lang/Boolean;", "isProgressiveDecodingEnabled", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class C5619a extends C5620b {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final ResizeOptions resizeOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final DownsampleMode downsampleOverride;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final RotationOptions rotationOptions;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5742b postprocessor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final C43928c imageDecodeOptions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final RoundingOptions roundingOptions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final BorderOptions borderOptions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5597q actualImageScaleType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final PointF actualImageFocusPoint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean mLocalThumbnailPreviewsEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean loadThumbnailOnly;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public final Boolean isProgressiveDecodingEnabled;

    /* JADX INFO: renamed from: com.facebook.fresco.vito.options.a$a */
    /* JADX INFO: compiled from: DecodedImageOptions.kt */
    @Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010<\u001a\u0004\b4\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010B\u001a\u0004\b$\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\b\u001c\u0010J\"\u0004\bK\u0010LR\"\u0010T\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bO\u0010Q\"\u0004\bR\u0010SR\"\u0010V\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010P\u001a\u0004\bH\u0010Q\"\u0004\bU\u0010SR$\u0010]\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\b,\u0010Z\"\u0004\b[\u0010\\R$\u0010b\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010^\u001a\u0004\bX\u0010_\"\u0004\b`\u0010a¨\u0006c"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/a$a;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/fresco/vito/options/b$a;", "<init>", "()V", "Lcom/facebook/fresco/vito/options/a;", "decodedImageOptions", "(Lcom/facebook/fresco/vito/options/a;)V", "Lcom/facebook/fresco/vito/options/ImageOptions;", "defaultOptions", "(Lcom/facebook/fresco/vito/options/ImageOptions;)V", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "d", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "p", "()Lcom/facebook/imagepipeline/common/ResizeOptions;", "setResizeOptions$options_release", "(Lcom/facebook/imagepipeline/common/ResizeOptions;)V", "resizeOptions", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "j", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "setDownsampleOverride$options_release", "(Lcom/facebook/imagepipeline/core/DownsampleMode;)V", "downsampleOverride", "Lcom/facebook/imagepipeline/common/RotationOptions;", "f", "Lcom/facebook/imagepipeline/common/RotationOptions;", "q", "()Lcom/facebook/imagepipeline/common/RotationOptions;", "setRotationOptions$options_release", "(Lcom/facebook/imagepipeline/common/RotationOptions;)V", "rotationOptions", "Lcom/facebook/imagepipeline/request/b;", "g", "Lcom/facebook/imagepipeline/request/b;", "n", "()Lcom/facebook/imagepipeline/request/b;", "setPostprocessor$options_release", "(Lcom/facebook/imagepipeline/request/b;)V", "postprocessor", "Lr5/c;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lr5/c;", "k", "()Lr5/c;", "setImageDecodeOptions$options_release", "(Lr5/c;)V", "imageDecodeOptions", "Lcom/facebook/fresco/vito/options/RoundingOptions;", "i", "Lcom/facebook/fresco/vito/options/RoundingOptions;", "r", "()Lcom/facebook/fresco/vito/options/RoundingOptions;", "setRoundingOptions$options_release", "(Lcom/facebook/fresco/vito/options/RoundingOptions;)V", "roundingOptions", "Lcom/facebook/fresco/vito/options/BorderOptions;", "Lcom/facebook/fresco/vito/options/BorderOptions;", "()Lcom/facebook/fresco/vito/options/BorderOptions;", "setBorderOptions$options_release", "(Lcom/facebook/fresco/vito/options/BorderOptions;)V", "borderOptions", "Lcom/facebook/drawee/drawable/q;", "Lcom/facebook/drawee/drawable/q;", "()Lcom/facebook/drawee/drawable/q;", "setActualImageScaleType$options_release", "(Lcom/facebook/drawee/drawable/q;)V", "actualImageScaleType", "Landroid/graphics/PointF;", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/graphics/PointF;", "()Landroid/graphics/PointF;", "setActualFocusPoint$options_release", "(Landroid/graphics/PointF;)V", "actualFocusPoint", "", "m", "Z", "()Z", "setLocalThumbnailPreviewsEnabled$options_release", "(Z)V", "localThumbnailPreviewsEnabled", "setLoadThumbnailOnly$options_release", "loadThumbnailOnly", "Landroid/graphics/Bitmap$Config;", "o", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "setBitmapConfig$options_release", "(Landroid/graphics/Bitmap$Config;)V", "bitmapConfig", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setProgressiveDecodingEnabled$options_release", "(Ljava/lang/Boolean;)V", "progressiveDecodingEnabled", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDecodedImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecodedImageOptions.kt\ncom/facebook/fresco/vito/options/DecodedImageOptions$Builder\n*L\n1#1,205:1\n200#1,2:206\n200#1,2:208\n200#1,2:210\n200#1,2:212\n200#1,2:214\n200#1,2:216\n200#1,2:218\n200#1,2:220\n200#1,2:222\n200#1,2:224\n200#1,2:226\n200#1,2:228\n200#1,2:230\n*S KotlinDebug\n*F\n+ 1 DecodedImageOptions.kt\ncom/facebook/fresco/vito/options/DecodedImageOptions$Builder\n*L\n134#1:206,2\n142#1:208,2\n146#1:210,2\n150#1:212,2\n154#1:214,2\n164#1:216,2\n168#1:218,2\n170#1:220,2\n175#1:222,2\n183#1:224,2\n187#1:226,2\n191#1:228,2\n193#1:230,2\n*E\n"})
    public static class a<T extends a<T>> extends C5620b.a<T> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public ResizeOptions resizeOptions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public DownsampleMode downsampleOverride;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public RotationOptions rotationOptions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5742b postprocessor;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public C43928c imageDecodeOptions;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public RoundingOptions roundingOptions;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public BorderOptions borderOptions;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public InterfaceC5597q actualImageScaleType;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public PointF actualFocusPoint;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public boolean localThumbnailPreviewsEnabled;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public boolean loadThumbnailOnly;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public Boolean progressiveDecodingEnabled;

        public a() {
            InterfaceC5597q CENTER_CROP = InterfaceC5597q.f8359i;
            Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
            this.actualImageScaleType = CENTER_CROP;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final PointF getActualFocusPoint() {
            return this.actualFocusPoint;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC5597q getActualImageScaleType() {
            return this.actualImageScaleType;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final Bitmap.Config getBitmapConfig() {
            return this.bitmapConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final BorderOptions getBorderOptions() {
            return this.borderOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final DownsampleMode getDownsampleOverride() {
            return this.downsampleOverride;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final C43928c getImageDecodeOptions() {
            return this.imageDecodeOptions;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getLoadThumbnailOnly() {
            return this.loadThumbnailOnly;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getLocalThumbnailPreviewsEnabled() {
            return this.localThumbnailPreviewsEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final InterfaceC5742b getPostprocessor() {
            return this.postprocessor;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final Boolean getProgressiveDecodingEnabled() {
            return this.progressiveDecodingEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final ResizeOptions getResizeOptions() {
            return this.resizeOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final RotationOptions getRotationOptions() {
            return this.rotationOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final RoundingOptions getRoundingOptions() {
            return this.roundingOptions;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C5619a decodedImageOptions) {
            super(decodedImageOptions);
            Intrinsics.checkNotNullParameter(decodedImageOptions, "decodedImageOptions");
            InterfaceC5597q CENTER_CROP = InterfaceC5597q.f8359i;
            Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
            this.actualImageScaleType = CENTER_CROP;
            this.resizeOptions = decodedImageOptions.getResizeOptions();
            this.downsampleOverride = decodedImageOptions.getDownsampleOverride();
            this.rotationOptions = decodedImageOptions.getRotationOptions();
            this.postprocessor = decodedImageOptions.getPostprocessor();
            this.imageDecodeOptions = decodedImageOptions.getImageDecodeOptions();
            this.roundingOptions = decodedImageOptions.getRoundingOptions();
            this.borderOptions = decodedImageOptions.getBorderOptions();
            this.actualImageScaleType = decodedImageOptions.getActualImageScaleType();
            this.actualFocusPoint = decodedImageOptions.getActualImageFocusPoint();
            this.localThumbnailPreviewsEnabled = decodedImageOptions.getMLocalThumbnailPreviewsEnabled();
            this.loadThumbnailOnly = decodedImageOptions.getLoadThumbnailOnly();
            this.bitmapConfig = decodedImageOptions.getBitmapConfig();
            this.progressiveDecodingEnabled = decodedImageOptions.getIsProgressiveDecodingEnabled();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ImageOptions defaultOptions) {
            this((C5619a) defaultOptions);
            Intrinsics.checkNotNullParameter(defaultOptions, "defaultOptions");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5619a(@NotNull a<?> builder) {
        super(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.resizeOptions = builder.getResizeOptions();
        this.downsampleOverride = builder.getDownsampleOverride();
        this.rotationOptions = builder.getRotationOptions();
        this.postprocessor = builder.getPostprocessor();
        this.imageDecodeOptions = builder.getImageDecodeOptions();
        this.roundingOptions = builder.getRoundingOptions();
        this.borderOptions = builder.getBorderOptions();
        this.actualImageScaleType = builder.getActualImageScaleType();
        this.actualImageFocusPoint = builder.getActualFocusPoint();
        this.mLocalThumbnailPreviewsEnabled = builder.getLocalThumbnailPreviewsEnabled();
        this.loadThumbnailOnly = builder.getLoadThumbnailOnly();
        this.bitmapConfig = builder.getBitmapConfig();
        this.isProgressiveDecodingEnabled = builder.getProgressiveDecodingEnabled();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getMLocalThumbnailPreviewsEnabled() {
        return this.mLocalThumbnailPreviewsEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final PointF getActualImageFocusPoint() {
        return this.actualImageFocusPoint;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC5597q getActualImageScaleType() {
        return this.actualImageScaleType;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final BorderOptions getBorderOptions() {
        return this.borderOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final DownsampleMode getDownsampleOverride() {
        return this.downsampleOverride;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final C43928c getImageDecodeOptions() {
        return this.imageDecodeOptions;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getLoadThumbnailOnly() {
        return this.loadThumbnailOnly;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC5742b getPostprocessor() {
        return this.postprocessor;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final ResizeOptions getResizeOptions() {
        return this.resizeOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final RotationOptions getRotationOptions() {
        return this.rotationOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final RoundingOptions getRoundingOptions() {
        return this.roundingOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getIsProgressiveDecodingEnabled() {
        return this.isProgressiveDecodingEnabled;
    }

    @Override // com.facebook.fresco.vito.options.C5620b
    @NotNull
    /* JADX INFO: renamed from: e */
    public C45706f.a mo8892e() {
        C45706f.a aVarM100886b = super.mo8892e().m100886b("resizeOptions", this.resizeOptions).m100886b("downsampleOverride", this.downsampleOverride).m100886b("rotationOptions", this.rotationOptions).m100886b("postprocessor", this.postprocessor).m100886b("imageDecodeOptions", this.imageDecodeOptions).m100886b("roundingOptions", this.roundingOptions).m100886b("borderOptions", this.borderOptions).m100886b("actualImageScaleType", this.actualImageScaleType).m100886b("actualImageFocusPoint", this.actualImageFocusPoint).m100887c("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).m100887c("loadThumbnailOnly", this.loadThumbnailOnly).m100886b("bitmapConfig", this.bitmapConfig).m100886b("progressiveRenderingEnabled", this.isProgressiveDecodingEnabled);
        Intrinsics.checkNotNullExpressionValue(aVarM100886b, "add(...)");
        return aVarM100886b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8934g(@NotNull C5619a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (C45706f.m100883a(this.resizeOptions, other.resizeOptions) && C45706f.m100883a(this.downsampleOverride, other.downsampleOverride) && C45706f.m100883a(this.rotationOptions, other.rotationOptions) && C45706f.m100883a(this.postprocessor, other.postprocessor) && C45706f.m100883a(this.imageDecodeOptions, other.imageDecodeOptions) && C45706f.m100883a(this.roundingOptions, other.roundingOptions) && C45706f.m100883a(this.borderOptions, other.borderOptions) && C45706f.m100883a(this.actualImageScaleType, other.actualImageScaleType) && C45706f.m100883a(this.actualImageFocusPoint, other.actualImageFocusPoint) && this.mLocalThumbnailPreviewsEnabled == other.mLocalThumbnailPreviewsEnabled && this.loadThumbnailOnly == other.loadThumbnailOnly && this.isProgressiveDecodingEnabled == other.isProgressiveDecodingEnabled && C45706f.m100883a(this.bitmapConfig, other.bitmapConfig)) {
            return m8960a(other);
        }
        return false;
    }

    @Override // com.facebook.fresco.vito.options.C5620b
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        int iHashCode10 = super.hashCode() * 31;
        ResizeOptions resizeOptions = this.resizeOptions;
        int iHashCode11 = 0;
        if (resizeOptions != null) {
            iHashCode = resizeOptions.hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = (iHashCode10 + iHashCode) * 31;
        DownsampleMode downsampleMode = this.downsampleOverride;
        if (downsampleMode != null) {
            iHashCode2 = downsampleMode.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i12 = (i11 + iHashCode2) * 31;
        RotationOptions rotationOptions = this.rotationOptions;
        if (rotationOptions != null) {
            iHashCode3 = rotationOptions.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i13 = (i12 + iHashCode3) * 31;
        InterfaceC5742b interfaceC5742b = this.postprocessor;
        if (interfaceC5742b != null) {
            iHashCode4 = interfaceC5742b.hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i14 = (i13 + iHashCode4) * 31;
        C43928c c43928c = this.imageDecodeOptions;
        if (c43928c != null) {
            iHashCode5 = c43928c.hashCode();
        } else {
            iHashCode5 = 0;
        }
        int i15 = (i14 + iHashCode5) * 31;
        RoundingOptions roundingOptions = this.roundingOptions;
        if (roundingOptions != null) {
            iHashCode6 = roundingOptions.hashCode();
        } else {
            iHashCode6 = 0;
        }
        int i16 = (i15 + iHashCode6) * 31;
        BorderOptions borderOptions = this.borderOptions;
        if (borderOptions != null) {
            iHashCode7 = borderOptions.hashCode();
        } else {
            iHashCode7 = 0;
        }
        int iHashCode12 = (((i16 + iHashCode7) * 31) + this.actualImageScaleType.hashCode()) * 31;
        PointF pointF = this.actualImageFocusPoint;
        if (pointF != null) {
            iHashCode8 = pointF.hashCode();
        } else {
            iHashCode8 = 0;
        }
        int i17 = (((((iHashCode12 + iHashCode8) * 31) + (this.mLocalThumbnailPreviewsEnabled ? 1 : 0)) * 31) + (this.loadThumbnailOnly ? 1 : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        if (config != null) {
            iHashCode9 = config.hashCode();
        } else {
            iHashCode9 = 0;
        }
        int i18 = (i17 + iHashCode9) * 31;
        Boolean bool = this.isProgressiveDecodingEnabled;
        if (bool != null) {
            iHashCode11 = bool.hashCode();
        }
        return i18 + iHashCode11;
    }
}
