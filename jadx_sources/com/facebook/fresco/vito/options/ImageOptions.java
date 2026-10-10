package com.facebook.fresco.vito.options;

import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p332i5.InterfaceC38440a;
import p712w3.C45706f;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImageOptions.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00072\u00020\u0001:\u0002abB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010&\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010,\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u00102\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00105\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u001e\u0010\bR\u001a\u00108\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010\u0011R\u0019\u0010;\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%R\u0019\u0010>\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+R\u001c\u0010@\u001a\u0004\u0018\u00010\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0019\u001a\u0004\b<\u0010\u001bR\u001a\u0010C\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u001e\u001a\u0004\bB\u0010\u0011R\u0019\u0010E\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\bD\u0010+R\u0019\u0010F\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bA\u00101R\u0019\u0010H\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bG\u0010#\u001a\u0004\b?\u0010%R\u0017\u0010J\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u00104\u001a\u0004\b9\u0010\bR\u0019\u0010O\u001a\u0004\u0018\u00010K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b3\u0010NR\u001a\u0010R\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u001e\u001a\u0004\bQ\u0010\u0011R\u0019\u0010S\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bQ\u0010#\u001a\u0004\bP\u0010%R\u0019\u0010U\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\bT\u0010%R\u0014\u0010V\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104R\u0017\u0010W\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\bL\u0010\u0011R\u0014\u0010X\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00104R\u0014\u0010Y\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0017\u0010Z\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\bZ\u0010\bR\u0019\u0010^\u001a\u0004\u0018\u00010[8\u0006¢\u0006\f\n\u0004\b:\u0010\\\u001a\u0004\b6\u0010]R\u0017\u0010_\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\bG\u0010\bR\u0017\u0010`\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\bI\u0010\b¨\u0006c"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/ImageOptions;", "Lcom/facebook/fresco/vito/options/a;", "Lcom/facebook/fresco/vito/options/ImageOptions$a;", "builder", "<init>", "(Lcom/facebook/fresco/vito/options/ImageOptions$a;)V", "", "R", "()Z", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "", "otherObject", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lw3/f$a;", "e", "()Lw3/f$a;", "q", "Ljava/lang/Integer;", "J", "()Ljava/lang/Integer;", "placeholderColor", "r", "I", "M", "placeholderRes", "Landroid/graphics/drawable/Drawable;", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/graphics/drawable/Drawable;", "K", "()Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "Lcom/facebook/drawee/drawable/q;", "t", "Lcom/facebook/drawee/drawable/q;", "N", "()Lcom/facebook/drawee/drawable/q;", "placeholderScaleType", "Landroid/graphics/PointF;", "u", "Landroid/graphics/PointF;", "L", "()Landroid/graphics/PointF;", "placeholderFocusPoint", "v", "Z", "placeholderApplyRoundingOptions", "w", "P", "progressRes", "x", "O", "progressDrawable", "y", "Q", "progressScaleType", "z", "errorColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "errorRes", "C", "errorScaleType", "errorFocusPoint", "D", "errorDrawable", ExifInterface.LONGITUDE_EAST, "errorApplyRoundingOptions", "Landroid/graphics/ColorFilter;", "F", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "actualImageColorFilter", "G", "H", "overlayRes", "overlayDrawable", "getBackgroundDrawable", "backgroundDrawable", "_resizeToViewport", "fadeDurationMs", "_autoPlay", "_autoStop", "isPerfMediaRemountInstrumentationFix", "Li5/a;", "Li5/a;", "()Li5/a;", "customDrawableFactory", "experimentalDynamicSize", "experimentalDynamicSizeWithCacheFallback", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ImageOptions extends C5619a {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: S */
    @NotNull
    public static ImageOptions f8569S;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @DrawableRes
    public final int errorRes;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5597q errorScaleType;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public final PointF errorFocusPoint;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public final Drawable errorDrawable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final boolean errorApplyRoundingOptions;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final ColorFilter actualImageColorFilter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @DrawableRes
    public final int overlayRes;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final Drawable overlayDrawable;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final Drawable backgroundDrawable;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final boolean _resizeToViewport;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final int fadeDurationMs;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final boolean _autoPlay;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final boolean _autoStop;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final boolean isPerfMediaRemountInstrumentationFix;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC38440a customDrawableFactory;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final boolean experimentalDynamicSize;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final boolean experimentalDynamicSizeWithCacheFallback;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @ColorInt
    @Nullable
    public final Integer placeholderColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @DrawableRes
    public final int placeholderRes;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final Drawable placeholderDrawable;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5597q placeholderScaleType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public final PointF placeholderFocusPoint;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final boolean placeholderApplyRoundingOptions;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @DrawableRes
    public final int progressRes;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public final Drawable progressDrawable;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5597q progressScaleType;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @ColorInt
    @Nullable
    public final Integer errorColor;

    /* JADX INFO: compiled from: ImageOptions.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/ImageOptions$Companion;", "", "<init>", "()V", "Lcom/facebook/fresco/vito/options/ImageOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "()Lcom/facebook/fresco/vito/options/ImageOptions;", "imageOptions", "", "setDefaults", "(Lcom/facebook/fresco/vito/options/ImageOptions;)V", "Lcom/facebook/fresco/vito/options/ImageOptions$a;", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_EXTEND, "(Lcom/facebook/fresco/vito/options/ImageOptions;)Lcom/facebook/fresco/vito/options/ImageOptions$a;", "create", "()Lcom/facebook/fresco/vito/options/ImageOptions$a;", "defaultImageOptions", "Lcom/facebook/fresco/vito/options/ImageOptions;", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final C5618a extend(@NotNull ImageOptions imageOptions) {
            Intrinsics.checkNotNullParameter(imageOptions, "imageOptions");
            return new C5618a(imageOptions);
        }

        @JvmStatic
        public final void setDefaults(@NotNull ImageOptions imageOptions) {
            Intrinsics.checkNotNullParameter(imageOptions, "imageOptions");
            ImageOptions.f8569S = imageOptions;
        }

        @JvmStatic
        @NotNull
        public final C5618a create() {
            return extend(defaults());
        }

        @JvmStatic
        @NotNull
        public final ImageOptions defaults() {
            return ImageOptions.f8569S;
        }
    }

    /* JADX INFO: renamed from: com.facebook.fresco.vito.options.ImageOptions$a */
    /* JADX INFO: compiled from: ImageOptions.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001a\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010\u001eR$\u0010D\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010!\u001a\u0004\bB\u0010#\"\u0004\bC\u0010%R$\u0010H\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010'\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R$\u0010L\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0013\u001a\u0004\bJ\u0010\u0015\"\u0004\bK\u0010\u0017R\"\u0010O\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001a\u001a\u0004\bM\u0010\u001c\"\u0004\bN\u0010\u001eR$\u0010S\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010'\u001a\u0004\bQ\u0010)\"\u0004\bR\u0010+R$\u0010V\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010/\u001a\u0004\bT\u00101\"\u0004\bU\u00103R$\u0010X\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010!\u001a\u0004\bP\u0010#\"\u0004\bW\u0010%R\"\u0010Z\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bI\u00109\"\u0004\bY\u0010;R$\u0010a\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b.\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bb\u0010\u001a\u001a\u0004\bc\u0010\u001c\"\u0004\bd\u0010\u001eR$\u0010h\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010!\u001a\u0004\b\u001a\u0010#\"\u0004\bg\u0010%R$\u0010j\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\bA\u0010#\"\u0004\bi\u0010%R\"\u0010m\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u00107\u001a\u0004\bk\u00109\"\u0004\bl\u0010;R\"\u0010p\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u00107\u001a\u0004\b6\u00109\"\u0004\bo\u0010;R\"\u0010r\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\b=\u00109\"\u0004\bq\u0010;R\"\u0010t\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\bn\u00109\"\u0004\bs\u0010;R\"\u0010v\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\bf\u0010\u001c\"\u0004\bu\u0010\u001eR$\u0010|\u001a\u0004\u0018\u00010w8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010x\u001a\u0004\bE\u0010y\"\u0004\bz\u0010{R\"\u0010~\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u00107\u001a\u0004\b\\\u00109\"\u0004\b}\u0010;R#\u0010\u0080\u0001\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u00107\u001a\u0004\bb\u00109\"\u0004\b\u007f\u0010;¨\u0006\u0081\u0001"}, m90084d2 = {"Lcom/facebook/fresco/vito/options/ImageOptions$a;", "Lcom/facebook/fresco/vito/options/a$a;", "<init>", "()V", "Lcom/facebook/fresco/vito/options/ImageOptions;", "defaultOptions", "(Lcom/facebook/fresco/vito/options/ImageOptions;)V", "Lcom/facebook/drawee/drawable/q;", "placeholderScaleType", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/facebook/drawee/drawable/q;)Lcom/facebook/fresco/vito/options/ImageOptions$a;", "errorScaleType", "t", "progressScaleType", ExifInterface.LONGITUDE_WEST, CmcdData.Factory.STREAMING_FORMAT_SS, "()Lcom/facebook/fresco/vito/options/ImageOptions;", "", "q", "Ljava/lang/Integer;", "M", "()Ljava/lang/Integer;", "set_placeholderColor$options_release", "(Ljava/lang/Integer;)V", "_placeholderColor", "r", "I", "P", "()I", "set_placeholderRes$options_release", "(I)V", "_placeholderRes", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "N", "()Landroid/graphics/drawable/Drawable;", "set_placeholderDrawable$options_release", "(Landroid/graphics/drawable/Drawable;)V", "_placeholderDrawable", "Lcom/facebook/drawee/drawable/q;", "Q", "()Lcom/facebook/drawee/drawable/q;", "set_placeholderScaleType$options_release", "(Lcom/facebook/drawee/drawable/q;)V", "_placeholderScaleType", "Landroid/graphics/PointF;", "u", "Landroid/graphics/PointF;", "O", "()Landroid/graphics/PointF;", "set_placeholderFocusPoint$options_release", "(Landroid/graphics/PointF;)V", "_placeholderFocusPoint", "", "v", "Z", "L", "()Z", "set_placeholderApplyRoundingOptions$options_release", "(Z)V", "_placeholderApplyRoundingOptions", "w", ExifInterface.LATITUDE_SOUTH, "set_progressRes$options_release", "_progressRes", "x", "R", "set_progressDrawable$options_release", "_progressDrawable", "y", ExifInterface.GPS_DIRECTION_TRUE, "set_progressScaleType$options_release", "_progressScaleType", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "set_errorColor$options_release", "_errorColor", "D", "set_errorRes$options_release", "_errorRes", "B", ExifInterface.LONGITUDE_EAST, "set_errorScaleType$options_release", "_errorScaleType", "C", "set_errorFocusPoint$options_release", "_errorFocusPoint", "set_errorDrawable$options_release", "_errorDrawable", "set_errorApplyRoundingOptions$options_release", "_errorApplyRoundingOptions", "Landroid/graphics/ColorFilter;", "F", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "set_actualImageColorFilter$options_release", "(Landroid/graphics/ColorFilter;)V", "_actualImageColorFilter", "G", "J", "set_overlayRes$options_release", "_overlayRes", "H", "set_overlayDrawable$options_release", "_overlayDrawable", "set_backgroundDrawable$options_release", "_backgroundDrawable", "U", "set_resizeToViewport$options_release", "_resizeToViewport", "K", "set_autoPlay$options_release", "_autoPlay", "set_autoStop$options_release", "_autoStop", "set_perfMediaRemountInstrumentationFix$options_release", "_perfMediaRemountInstrumentationFix", "set_fadeDurationMs$options_release", "_fadeDurationMs", "Li5/a;", "Li5/a;", "()Li5/a;", "set_customDrawableFactory$options_release", "(Li5/a;)V", "_customDrawableFactory", "set_experimentalDynamicSize$options_release", "_experimentalDynamicSize", "set_experimentalDynamicSizeWithCacheFallback$options_release", "_experimentalDynamicSizeWithCacheFallback", "options_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageOptions.kt\ncom/facebook/fresco/vito/options/ImageOptions$Builder\n*L\n1#1,492:1\n466#1,2:493\n466#1,2:495\n466#1,2:497\n466#1,2:499\n466#1,2:501\n466#1,2:503\n466#1,2:505\n466#1,2:507\n466#1,2:509\n466#1,2:511\n466#1,2:513\n466#1,2:515\n466#1,2:517\n466#1,2:519\n466#1,2:521\n466#1,2:523\n466#1,2:525\n466#1,2:527\n466#1,2:529\n466#1,2:531\n466#1,2:533\n466#1,2:535\n466#1,2:537\n466#1,2:539\n466#1,2:541\n466#1,2:543\n466#1,2:545\n466#1,2:547\n466#1,2:549\n466#1,2:551\n466#1,2:553\n*S KotlinDebug\n*F\n+ 1 ImageOptions.kt\ncom/facebook/fresco/vito/options/ImageOptions$Builder\n*L\n288#1:493,2\n297#1:495,2\n304#1:497,2\n310#1:499,2\n319#1:501,2\n326#1:503,2\n330#1:505,2\n335#1:507,2\n339#1:509,2\n345#1:511,2\n351#1:513,2\n355#1:515,2\n359#1:517,2\n365#1:519,2\n369#1:521,2\n372#1:523,2\n377#1:525,2\n382#1:527,2\n387#1:529,2\n391#1:531,2\n396#1:533,2\n401#1:535,2\n403#1:537,2\n412#1:539,2\n419#1:541,2\n421#1:543,2\n432#1:545,2\n441#1:547,2\n450#1:549,2\n454#1:551,2\n459#1:553,2\n*E\n"})
    public static final class C5618a extends C5619a.a<C5618a> {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @DrawableRes
        public int _errorRes;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5597q _errorScaleType;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public PointF _errorFocusPoint;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @Nullable
        public Drawable _errorDrawable;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        public boolean _errorApplyRoundingOptions;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @Nullable
        public ColorFilter _actualImageColorFilter;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @DrawableRes
        public int _overlayRes;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @Nullable
        public Drawable _overlayDrawable;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @Nullable
        public Drawable _backgroundDrawable;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        public boolean _resizeToViewport;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        public boolean _autoPlay;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        public boolean _autoStop;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        public boolean _perfMediaRemountInstrumentationFix;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        public int _fadeDurationMs;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        @Nullable
        public InterfaceC38440a _customDrawableFactory;

        /* JADX INFO: renamed from: P, reason: from kotlin metadata */
        public boolean _experimentalDynamicSize;

        /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
        public boolean _experimentalDynamicSizeWithCacheFallback;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @ColorInt
        @Nullable
        public Integer _placeholderColor;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @DrawableRes
        public int _placeholderRes;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public Drawable _placeholderDrawable;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5597q _placeholderScaleType;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public PointF _placeholderFocusPoint;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        public boolean _placeholderApplyRoundingOptions;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @DrawableRes
        public int _progressRes;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public Drawable _progressDrawable;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5597q _progressScaleType;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @ColorInt
        @Nullable
        public Integer _errorColor;

        public C5618a() {
            this._autoStop = true;
        }

        @Nullable
        /* JADX INFO: renamed from: A, reason: from getter */
        public final Integer get_errorColor() {
            return this._errorColor;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final Drawable get_errorDrawable() {
            return this._errorDrawable;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final PointF get_errorFocusPoint() {
            return this._errorFocusPoint;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final int get_errorRes() {
            return this._errorRes;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final InterfaceC5597q get_errorScaleType() {
            return this._errorScaleType;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final boolean get_experimentalDynamicSize() {
            return this._experimentalDynamicSize;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final boolean get_experimentalDynamicSizeWithCacheFallback() {
            return this._experimentalDynamicSizeWithCacheFallback;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final int get_fadeDurationMs() {
            return this._fadeDurationMs;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final Drawable get_overlayDrawable() {
            return this._overlayDrawable;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final int get_overlayRes() {
            return this._overlayRes;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final boolean get_perfMediaRemountInstrumentationFix() {
            return this._perfMediaRemountInstrumentationFix;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean get_placeholderApplyRoundingOptions() {
            return this._placeholderApplyRoundingOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final Integer get_placeholderColor() {
            return this._placeholderColor;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final Drawable get_placeholderDrawable() {
            return this._placeholderDrawable;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final PointF get_placeholderFocusPoint() {
            return this._placeholderFocusPoint;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final int get_placeholderRes() {
            return this._placeholderRes;
        }

        @Nullable
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final InterfaceC5597q get_placeholderScaleType() {
            return this._placeholderScaleType;
        }

        @Nullable
        /* JADX INFO: renamed from: R, reason: from getter */
        public final Drawable get_progressDrawable() {
            return this._progressDrawable;
        }

        /* JADX INFO: renamed from: S, reason: from getter */
        public final int get_progressRes() {
            return this._progressRes;
        }

        @Nullable
        /* JADX INFO: renamed from: T, reason: from getter */
        public final InterfaceC5597q get_progressScaleType() {
            return this._progressScaleType;
        }

        /* JADX INFO: renamed from: U, reason: from getter */
        public final boolean get_resizeToViewport() {
            return this._resizeToViewport;
        }

        @NotNull
        /* JADX INFO: renamed from: V */
        public final C5618a m8919V(@Nullable InterfaceC5597q placeholderScaleType) {
            this._placeholderScaleType = placeholderScaleType;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final C5618a m8920W(@Nullable InterfaceC5597q progressScaleType) {
            this._progressScaleType = progressScaleType;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: s */
        public ImageOptions m8921s() {
            return new ImageOptions(this);
        }

        @NotNull
        /* JADX INFO: renamed from: t */
        public final C5618a m8922t(@Nullable InterfaceC5597q errorScaleType) {
            this._errorScaleType = errorScaleType;
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final ColorFilter get_actualImageColorFilter() {
            return this._actualImageColorFilter;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean get_autoPlay() {
            return this._autoPlay;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean get_autoStop() {
            return this._autoStop;
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final Drawable get_backgroundDrawable() {
            return this._backgroundDrawable;
        }

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final InterfaceC38440a get_customDrawableFactory() {
            return this._customDrawableFactory;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean get_errorApplyRoundingOptions() {
            return this._errorApplyRoundingOptions;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5618a(@NotNull ImageOptions defaultOptions) {
            super(defaultOptions);
            Intrinsics.checkNotNullParameter(defaultOptions, "defaultOptions");
            this._autoStop = true;
            this._placeholderColor = defaultOptions.getPlaceholderColor();
            this._placeholderRes = defaultOptions.getPlaceholderRes();
            this._placeholderDrawable = defaultOptions.getPlaceholderDrawable();
            this._placeholderScaleType = defaultOptions.getPlaceholderScaleType();
            this._placeholderFocusPoint = defaultOptions.getPlaceholderFocusPoint();
            this._placeholderApplyRoundingOptions = defaultOptions.getPlaceholderApplyRoundingOptions();
            this._progressRes = defaultOptions.getProgressRes();
            this._progressDrawable = defaultOptions.getProgressDrawable();
            this._progressScaleType = defaultOptions.getProgressScaleType();
            this._errorColor = defaultOptions.getErrorColor();
            this._errorRes = defaultOptions.getErrorRes();
            this._errorScaleType = defaultOptions.getErrorScaleType();
            this._errorFocusPoint = defaultOptions.getErrorFocusPoint();
            this._errorDrawable = defaultOptions.getErrorDrawable();
            this._errorApplyRoundingOptions = defaultOptions.getErrorApplyRoundingOptions();
            this._actualImageColorFilter = defaultOptions.getActualImageColorFilter();
            this._overlayRes = defaultOptions.getOverlayRes();
            this._overlayDrawable = defaultOptions.getOverlayDrawable();
            this._resizeToViewport = defaultOptions.get_resizeToViewport();
            this._autoPlay = defaultOptions.get_autoPlay();
            this._autoStop = defaultOptions.get_autoStop();
            this._fadeDurationMs = defaultOptions.getFadeDurationMs();
            this._customDrawableFactory = defaultOptions.getCustomDrawableFactory();
            this._experimentalDynamicSize = defaultOptions.getExperimentalDynamicSize();
            this._experimentalDynamicSizeWithCacheFallback = defaultOptions.getExperimentalDynamicSizeWithCacheFallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C5618a c5618a = new C5618a();
        InterfaceC5597q interfaceC5597q = InterfaceC5597q.f8358h;
        f8569S = ((C5618a) c5618a.m8919V(interfaceC5597q).m8920W(interfaceC5597q).m8922t(interfaceC5597q).m8968e(Priority.HIGH)).m8921s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOptions(@NotNull C5618a builder) {
        super(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.placeholderColor = builder.get_placeholderColor();
        this.placeholderRes = builder.get_placeholderRes();
        this.placeholderDrawable = builder.get_placeholderDrawable();
        this.placeholderScaleType = builder.get_placeholderScaleType();
        this.placeholderFocusPoint = builder.get_placeholderFocusPoint();
        this.placeholderApplyRoundingOptions = builder.get_placeholderApplyRoundingOptions();
        this.progressRes = builder.get_progressRes();
        this.progressDrawable = builder.get_progressDrawable();
        this.progressScaleType = builder.get_progressScaleType();
        this.errorColor = builder.get_errorColor();
        this.errorRes = builder.get_errorRes();
        this.errorScaleType = builder.get_errorScaleType();
        this.errorFocusPoint = builder.get_errorFocusPoint();
        this.errorDrawable = builder.get_errorDrawable();
        this.errorApplyRoundingOptions = builder.get_errorApplyRoundingOptions();
        this.actualImageColorFilter = builder.get_actualImageColorFilter();
        this.overlayRes = builder.get_overlayRes();
        this.overlayDrawable = builder.get_overlayDrawable();
        this.backgroundDrawable = builder.get_backgroundDrawable();
        this._resizeToViewport = builder.get_resizeToViewport();
        this.fadeDurationMs = builder.get_fadeDurationMs();
        this._autoPlay = builder.get_autoPlay();
        this._autoStop = builder.get_autoStop();
        this.isPerfMediaRemountInstrumentationFix = builder.get_perfMediaRemountInstrumentationFix();
        this.customDrawableFactory = builder.get_customDrawableFactory();
        this.experimentalDynamicSize = builder.get_experimentalDynamicSize();
        this.experimentalDynamicSizeWithCacheFallback = builder.get_experimentalDynamicSizeWithCacheFallback();
    }

    @Nullable
    /* JADX INFO: renamed from: A, reason: from getter */
    public final PointF getErrorFocusPoint() {
        return this.errorFocusPoint;
    }

    @DrawableRes
    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getErrorRes() {
        return this.errorRes;
    }

    @Nullable
    /* JADX INFO: renamed from: C, reason: from getter */
    public final InterfaceC5597q getErrorScaleType() {
        return this.errorScaleType;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getExperimentalDynamicSize() {
        return this.experimentalDynamicSize;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getExperimentalDynamicSizeWithCacheFallback() {
        return this.experimentalDynamicSizeWithCacheFallback;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final int getFadeDurationMs() {
        return this.fadeDurationMs;
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: from getter */
    public final Drawable getOverlayDrawable() {
        return this.overlayDrawable;
    }

    @DrawableRes
    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getOverlayRes() {
        return this.overlayRes;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getPlaceholderApplyRoundingOptions() {
        return this.placeholderApplyRoundingOptions;
    }

    @ColorInt
    @Nullable
    /* JADX INFO: renamed from: J, reason: from getter */
    public final Integer getPlaceholderColor() {
        return this.placeholderColor;
    }

    @Nullable
    /* JADX INFO: renamed from: K, reason: from getter */
    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    @Nullable
    /* JADX INFO: renamed from: L, reason: from getter */
    public final PointF getPlaceholderFocusPoint() {
        return this.placeholderFocusPoint;
    }

    @DrawableRes
    /* JADX INFO: renamed from: M, reason: from getter */
    public final int getPlaceholderRes() {
        return this.placeholderRes;
    }

    @Nullable
    /* JADX INFO: renamed from: N, reason: from getter */
    public final InterfaceC5597q getPlaceholderScaleType() {
        return this.placeholderScaleType;
    }

    @Nullable
    /* JADX INFO: renamed from: O, reason: from getter */
    public final Drawable getProgressDrawable() {
        return this.progressDrawable;
    }

    @DrawableRes
    /* JADX INFO: renamed from: P, reason: from getter */
    public final int getProgressRes() {
        return this.progressRes;
    }

    @Nullable
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final InterfaceC5597q getProgressScaleType() {
        return this.progressScaleType;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean get_autoPlay() {
        return this._autoPlay;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final boolean get_autoStop() {
        return this._autoStop;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean get_resizeToViewport() {
        return this._resizeToViewport;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a4, code lost:
    
        if (r3.errorDrawable == r4.errorDrawable) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject != null && Intrinsics.areEqual(ImageOptions.class, otherObject.getClass())) {
            ImageOptions imageOptions = (ImageOptions) otherObject;
            if (this.isPerfMediaRemountInstrumentationFix) {
                if (!Intrinsics.areEqual(this.placeholderColor, imageOptions.placeholderColor) || this.placeholderRes != imageOptions.placeholderRes || !C45706f.m100883a(this.placeholderDrawable, imageOptions.placeholderDrawable) || !C45706f.m100883a(this.placeholderScaleType, imageOptions.placeholderScaleType) || !C45706f.m100883a(this.placeholderFocusPoint, imageOptions.placeholderFocusPoint) || this.placeholderApplyRoundingOptions != imageOptions.placeholderApplyRoundingOptions || !Intrinsics.areEqual(this.errorColor, imageOptions.errorColor) || this.errorRes != imageOptions.errorRes || !C45706f.m100883a(this.errorScaleType, imageOptions.errorScaleType) || !C45706f.m100883a(this.errorFocusPoint, imageOptions.errorFocusPoint) || this.errorApplyRoundingOptions != imageOptions.errorApplyRoundingOptions || this.overlayRes != imageOptions.overlayRes || !C45706f.m100883a(this.overlayDrawable, imageOptions.overlayDrawable) || !C45706f.m100883a(this.errorDrawable, imageOptions.errorDrawable) || this.progressRes != imageOptions.progressRes || !C45706f.m100883a(this.progressDrawable, imageOptions.progressDrawable) || !C45706f.m100883a(this.progressScaleType, imageOptions.progressScaleType) || !C45706f.m100883a(this.actualImageColorFilter, imageOptions.actualImageColorFilter) || this._resizeToViewport != imageOptions._resizeToViewport || this.fadeDurationMs != imageOptions.fadeDurationMs || this._autoPlay != imageOptions._autoPlay || this._autoStop != imageOptions._autoStop || !C45706f.m100883a(this.customDrawableFactory, imageOptions.customDrawableFactory) || !C45706f.m100883a(this.errorDrawable, imageOptions.errorDrawable) || this.isPerfMediaRemountInstrumentationFix != imageOptions.isPerfMediaRemountInstrumentationFix) {
                    return false;
                }
            } else if (Intrinsics.areEqual(this.placeholderColor, imageOptions.placeholderColor)) {
                if (this.placeholderRes == imageOptions.placeholderRes) {
                    if (C45706f.m100883a(this.placeholderDrawable, imageOptions.placeholderDrawable)) {
                        if (C45706f.m100883a(this.placeholderScaleType, imageOptions.placeholderScaleType)) {
                            if (C45706f.m100883a(this.placeholderFocusPoint, imageOptions.placeholderFocusPoint)) {
                                if (this.placeholderApplyRoundingOptions == imageOptions.placeholderApplyRoundingOptions) {
                                    if (Intrinsics.areEqual(this.errorColor, imageOptions.errorColor)) {
                                        if (this.errorRes == imageOptions.errorRes) {
                                            if (C45706f.m100883a(this.errorScaleType, imageOptions.errorScaleType)) {
                                                if (C45706f.m100883a(this.errorFocusPoint, imageOptions.errorFocusPoint)) {
                                                    if (this.errorApplyRoundingOptions == imageOptions.errorApplyRoundingOptions) {
                                                        if (this.overlayRes == imageOptions.overlayRes) {
                                                            if (C45706f.m100883a(this.overlayDrawable, imageOptions.overlayDrawable)) {
                                                                if (C45706f.m100883a(this.errorDrawable, imageOptions.errorDrawable)) {
                                                                    if (this.progressRes == imageOptions.progressRes) {
                                                                        if (this.progressDrawable == imageOptions.progressDrawable) {
                                                                            if (this.progressScaleType == imageOptions.progressScaleType) {
                                                                                if (C45706f.m100883a(this.actualImageColorFilter, imageOptions.actualImageColorFilter)) {
                                                                                    if (this._resizeToViewport == imageOptions._resizeToViewport) {
                                                                                        if (this.fadeDurationMs == imageOptions.fadeDurationMs) {
                                                                                            if (this._autoPlay == imageOptions._autoPlay) {
                                                                                                if (this._autoStop == imageOptions._autoStop) {
                                                                                                    if (C45706f.m100883a(this.customDrawableFactory, imageOptions.customDrawableFactory)) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return m8934g(imageOptions);
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final ColorFilter getActualImageColorFilter() {
        return this.actualImageColorFilter;
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public final InterfaceC38440a getCustomDrawableFactory() {
        return this.customDrawableFactory;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getErrorApplyRoundingOptions() {
        return this.errorApplyRoundingOptions;
    }

    @ColorInt
    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public final Integer getErrorColor() {
        return this.errorColor;
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final Drawable getErrorDrawable() {
        return this.errorDrawable;
    }

    @Override // com.facebook.fresco.vito.options.C5619a, com.facebook.fresco.vito.options.C5620b
    @NotNull
    /* JADX INFO: renamed from: e */
    public C45706f.a mo8892e() {
        C45706f.a aVarM100886b = super.mo8892e().m100886b("placeholderColor", this.placeholderColor).m100885a("placeholderRes", this.placeholderRes).m100886b("placeholderDrawable", this.placeholderDrawable).m100886b("placeholderScaleType", this.placeholderScaleType).m100886b("placeholderFocusPoint", this.placeholderFocusPoint).m100887c("placeholderApplyRoundingOptions", this.placeholderApplyRoundingOptions).m100885a("progressRes", this.progressRes).m100886b("progressDrawable", this.progressDrawable).m100886b("progressScaleType", this.progressScaleType).m100886b("errorColor", this.errorColor).m100885a("errorRes", this.errorRes).m100886b("errorScaleType", this.errorScaleType).m100886b("errorFocusPoint", this.errorFocusPoint).m100886b("errorDrawable", this.errorDrawable).m100887c("errorApplyRoundingOptions", this.errorApplyRoundingOptions).m100886b("actualImageColorFilter", this.actualImageColorFilter).m100885a("overlayRes", this.overlayRes).m100886b("overlayDrawable", this.overlayDrawable).m100886b("backgroundDrawable", this.backgroundDrawable).m100887c("resizeToViewport", this._resizeToViewport).m100887c("autoPlay", this._autoPlay).m100887c("autoStop", this._autoStop).m100887c("mPerfMediaRemountInstrumentationFix", this.isPerfMediaRemountInstrumentationFix).m100885a("fadeDurationMs", this.fadeDurationMs).m100886b("customDrawableFactory", this.customDrawableFactory);
        Intrinsics.checkNotNullExpressionValue(aVarM100886b, "add(...)");
        return aVarM100886b;
    }

    @Override // com.facebook.fresco.vito.options.C5619a, com.facebook.fresco.vito.options.C5620b
    public int hashCode() {
        int iIntValue;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iIntValue2;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        int iHashCode10;
        int iHashCode11;
        int iHashCode12 = super.hashCode() * 31;
        Integer num = this.placeholderColor;
        int iHashCode13 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i11 = (((iHashCode12 + iIntValue) * 31) + this.placeholderRes) * 31;
        Drawable drawable = this.placeholderDrawable;
        if (drawable != null) {
            iHashCode = drawable.hashCode();
        } else {
            iHashCode = 0;
        }
        int i12 = (i11 + iHashCode) * 31;
        InterfaceC5597q interfaceC5597q = this.placeholderScaleType;
        if (interfaceC5597q != null) {
            iHashCode2 = interfaceC5597q.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i13 = (i12 + iHashCode2) * 31;
        PointF pointF = this.placeholderFocusPoint;
        if (pointF != null) {
            iHashCode3 = pointF.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i14 = (((i13 + iHashCode3) * 31) + (this.placeholderApplyRoundingOptions ? 1 : 0)) * 31;
        Integer num2 = this.errorColor;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        int i15 = (((i14 + iIntValue2) * 31) + this.errorRes) * 31;
        InterfaceC5597q interfaceC5597q2 = this.errorScaleType;
        if (interfaceC5597q2 != null) {
            iHashCode4 = interfaceC5597q2.hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i16 = (i15 + iHashCode4) * 31;
        PointF pointF2 = this.errorFocusPoint;
        if (pointF2 != null) {
            iHashCode5 = pointF2.hashCode();
        } else {
            iHashCode5 = 0;
        }
        int i17 = (i16 + iHashCode5) * 31;
        Drawable drawable2 = this.errorDrawable;
        if (drawable2 != null) {
            iHashCode6 = drawable2.hashCode();
        } else {
            iHashCode6 = 0;
        }
        int i18 = (((((i17 + iHashCode6) * 31) + (this.errorApplyRoundingOptions ? 1 : 0)) * 31) + this.overlayRes) * 31;
        Drawable drawable3 = this.overlayDrawable;
        if (drawable3 != null) {
            iHashCode7 = drawable3.hashCode();
        } else {
            iHashCode7 = 0;
        }
        int i19 = (i18 + iHashCode7) * 31;
        Drawable drawable4 = this.backgroundDrawable;
        if (drawable4 != null) {
            iHashCode8 = drawable4.hashCode();
        } else {
            iHashCode8 = 0;
        }
        int i21 = (i19 + iHashCode8) * 31;
        Drawable drawable5 = this.progressDrawable;
        if (drawable5 != null) {
            iHashCode9 = drawable5.hashCode();
        } else {
            iHashCode9 = 0;
        }
        int i22 = (i21 + iHashCode9) * 31;
        InterfaceC5597q interfaceC5597q3 = this.progressScaleType;
        if (interfaceC5597q3 != null) {
            iHashCode10 = interfaceC5597q3.hashCode();
        } else {
            iHashCode10 = 0;
        }
        int i23 = (i22 + iHashCode10) * 31;
        ColorFilter colorFilter = this.actualImageColorFilter;
        if (colorFilter != null) {
            iHashCode11 = colorFilter.hashCode();
        } else {
            iHashCode11 = 0;
        }
        int i24 = (((((((((((((i23 + iHashCode11) * 31) + (this._resizeToViewport ? 1 : 0)) * 31) + this.fadeDurationMs) * 31) + (this._autoPlay ? 1 : 0)) * 31) + (this._autoStop ? 1 : 0)) * 31) + (this.isPerfMediaRemountInstrumentationFix ? 1 : 0)) * 31) + this.progressRes) * 31;
        InterfaceC38440a interfaceC38440a = this.customDrawableFactory;
        if (interfaceC38440a != null) {
            iHashCode13 = interfaceC38440a.hashCode();
        }
        return i24 + iHashCode13;
    }

    @NotNull
    public String toString() {
        return "ImageOptions{" + mo8892e() + "}";
    }
}
