package com.jumio.commons.utils;

import android.content.Context;
import android.content.res.Configuration;
import androidx.core.content.ContextCompat;
import com.jumio.commons.enums.ScreenAngle;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/commons/utils/DeviceRotationManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "defaultOrientation", "", "isTablet", "", "displayRotation", "getDisplayRotation", "()I", "screenOrientation", "Lcom/jumio/commons/enums/ScreenAngle;", "getScreenOrientation", "()Lcom/jumio/commons/enums/ScreenAngle;", "isScreenPortrait", "()Z", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", "getDeviceDefaultOrientation", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDeviceRotationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceRotationManager.kt\ncom/jumio/commons/utils/DeviceRotationManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class DeviceRotationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public Context f13597a;

    /* JADX INFO: renamed from: b */
    public final int f13598b;

    /* JADX INFO: renamed from: c */
    public final boolean f13599c;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/commons/utils/DeviceRotationManager$Companion;", "", "<init>", "()V", "isTabletDevice", "", "context", "Landroid/content/Context;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public final boolean isTabletDevice(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (context.getResources() == null || context.getResources().getConfiguration() == null || context.getResources().getConfiguration().smallestScreenWidthDp < 600) ? false : true;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final void destroy() {
        this.f13597a = null;
    }

    public DeviceRotationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13597a = context;
        Configuration configuration = context.getResources().getConfiguration();
        int displayRotation = getDisplayRotation();
        int i11 = 2;
        if (((displayRotation != 0 && displayRotation != 2) || configuration.orientation != 2) && ((displayRotation != 1 && displayRotation != 3) || configuration.orientation != 1)) {
            i11 = 1;
        }
        this.f13598b = i11;
        this.f13599c = INSTANCE.isTabletDevice(context);
    }

    public final int getDisplayRotation() {
        Context context = this.f13597a;
        if (context != null) {
            return ContextCompat.getDisplayOrDefault(context).getRotation();
        }
        return 0;
    }

    @NotNull
    public final ScreenAngle getScreenOrientation() {
        int displayRotation = getDisplayRotation();
        if (displayRotation != 0) {
            if (displayRotation != 1) {
                if (displayRotation != 2) {
                    if (displayRotation != 3) {
                        return ScreenAngle.PORTRAIT;
                    }
                    if (this.f13599c && this.f13598b == 2) {
                        return ScreenAngle.PORTRAIT;
                    }
                    return ScreenAngle.INVERTED_LANDSCAPE;
                }
                if (this.f13599c && this.f13598b == 2) {
                    return ScreenAngle.INVERTED_LANDSCAPE;
                }
                return ScreenAngle.INVERTED_PORTRAIT;
            }
            if (this.f13599c && this.f13598b == 2) {
                return ScreenAngle.INVERTED_PORTRAIT;
            }
            return ScreenAngle.LANDSCAPE;
        }
        if (this.f13599c && this.f13598b == 2) {
            return ScreenAngle.LANDSCAPE;
        }
        return ScreenAngle.PORTRAIT;
    }

    public final boolean isScreenPortrait() {
        ScreenAngle screenOrientation = getScreenOrientation();
        if (screenOrientation != ScreenAngle.PORTRAIT && screenOrientation != ScreenAngle.INVERTED_PORTRAIT) {
            return false;
        }
        return true;
    }
}
