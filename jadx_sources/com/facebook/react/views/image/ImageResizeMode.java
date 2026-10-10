package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.react.common.ReactConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageResizeMode.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/react/views/image/ImageResizeMode;", "", "<init>", "()V", "", "resizeModeValue", "Lcom/facebook/drawee/drawable/q;", "toScaleType", "(Ljava/lang/String;)Lcom/facebook/drawee/drawable/q;", "Landroid/graphics/Shader$TileMode;", "toTileMode", "(Ljava/lang/String;)Landroid/graphics/Shader$TileMode;", "defaultValue", "()Lcom/facebook/drawee/drawable/q;", "defaultTileMode", "()Landroid/graphics/Shader$TileMode;", "RESIZE_MODE_CONTAIN", "Ljava/lang/String;", "RESIZE_MODE_COVER", "RESIZE_MODE_STRETCH", "RESIZE_MODE_CENTER", "RESIZE_MODE_REPEAT", "RESIZE_MODE_NONE", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ImageResizeMode {

    @NotNull
    public static final ImageResizeMode INSTANCE = new ImageResizeMode();

    @NotNull
    private static final String RESIZE_MODE_CENTER = "center";

    @NotNull
    private static final String RESIZE_MODE_CONTAIN = "contain";

    @NotNull
    private static final String RESIZE_MODE_COVER = "cover";

    @NotNull
    private static final String RESIZE_MODE_NONE = "none";

    @NotNull
    private static final String RESIZE_MODE_REPEAT = "repeat";

    @NotNull
    private static final String RESIZE_MODE_STRETCH = "stretch";

    @JvmStatic
    @NotNull
    public static final Shader.TileMode defaultTileMode() {
        return Shader.TileMode.CLAMP;
    }

    @JvmStatic
    @NotNull
    public static final InterfaceC5597q defaultValue() {
        InterfaceC5597q CENTER_CROP = InterfaceC5597q.f8359i;
        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @NotNull
    public static final InterfaceC5597q toScaleType(@Nullable String resizeModeValue) {
        if (resizeModeValue != null) {
            switch (resizeModeValue.hashCode()) {
                case -1881872635:
                    if (resizeModeValue.equals(RESIZE_MODE_STRETCH)) {
                        InterfaceC5597q FIT_XY = InterfaceC5597q.f8351a;
                        Intrinsics.checkNotNullExpressionValue(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (resizeModeValue.equals("center")) {
                        InterfaceC5597q CENTER_INSIDE = InterfaceC5597q.f8358h;
                        Intrinsics.checkNotNullExpressionValue(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (resizeModeValue.equals(RESIZE_MODE_REPEAT)) {
                        return ScaleTypeStartInside.INSTANCE.getINSTANCE();
                    }
                    break;
                case 3387192:
                    if (resizeModeValue.equals("none")) {
                        return ScaleTypeStartInside.INSTANCE.getINSTANCE();
                    }
                    break;
                case 94852023:
                    if (resizeModeValue.equals(RESIZE_MODE_COVER)) {
                        InterfaceC5597q CENTER_CROP = InterfaceC5597q.f8359i;
                        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (resizeModeValue.equals(RESIZE_MODE_CONTAIN)) {
                        InterfaceC5597q FIT_CENTER = InterfaceC5597q.f8355e;
                        Intrinsics.checkNotNullExpressionValue(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (resizeModeValue != null) {
            C45999a.m101488I(ReactConstants.TAG, "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return defaultValue();
    }

    @JvmStatic
    @NotNull
    public static final Shader.TileMode toTileMode(@Nullable String resizeModeValue) {
        if (Intrinsics.areEqual(RESIZE_MODE_CONTAIN, resizeModeValue) || Intrinsics.areEqual(RESIZE_MODE_COVER, resizeModeValue) || Intrinsics.areEqual(RESIZE_MODE_STRETCH, resizeModeValue) || Intrinsics.areEqual("center", resizeModeValue) || Intrinsics.areEqual("none", resizeModeValue)) {
            return Shader.TileMode.CLAMP;
        }
        if (Intrinsics.areEqual(RESIZE_MODE_REPEAT, resizeModeValue)) {
            return Shader.TileMode.REPEAT;
        }
        if (resizeModeValue != null) {
            C45999a.m101488I(ReactConstants.TAG, "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return defaultTileMode();
    }

    private ImageResizeMode() {
    }
}
