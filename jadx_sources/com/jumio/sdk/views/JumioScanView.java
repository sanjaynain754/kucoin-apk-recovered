package com.jumio.sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.jumio.core.C9301R;
import com.jumio.core.views.CameraScanView;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.jumio.sdk.scanpart.JumioScanPart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020-H\u0016J\b\u00101\u001a\u00020-H\u0017J\b\u00102\u001a\u00020-H\u0017J\b\u00103\u001a\u00020-H\u0016J\b\u00104\u001a\u00020-H\u0016R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010'R$\u0010(\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010!¨\u00066"}, m90084d2 = {"Lcom/jumio/sdk/views/JumioScanView;", "Lcom/jumio/core/views/CameraScanView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mode", "getMode", "()I", "setMode", "(I)V", "minRatio", "", "getMinRatio", "()F", "ratio", "getRatio", "setRatio", "(F)V", "value", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "cameraFacing", "getCameraFacing", "()Lcom/jumio/sdk/enums/JumioCameraFacing;", "setCameraFacing", "(Lcom/jumio/sdk/enums/JumioCameraFacing;)V", "hasMultipleCameras", "", "getHasMultipleCameras", "()Z", "hasFlash", "getHasFlash", "flash", "getFlash", "setFlash", "(Z)V", "extraction", "getExtraction", "setExtraction", "isShutterEnabled", "attach", "", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "detach", "resume", "pause", "switchCamera", "takePicture", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioScanView extends CameraScanView {
    public static final int MODE_FACE = 1;
    public static final int MODE_ID = 0;

    /* JADX INFO: renamed from: k */
    public int f14759k;

    /* JADX INFO: renamed from: l */
    public float f14760l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioScanView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setFlash(boolean z11) {
        setFlash$jumio_core_release(z11, true, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioScanView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.jumio.core.views.CameraScanView, com.jumio.core.interfaces.ScanViewInterface
    public void attach(@NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        super.attach(scanPart);
    }

    @Override // com.jumio.core.views.CameraScanView
    public float getMinRatio() {
        return this.f14759k == 0 ? 1.33f : 1.0f;
    }

    /* JADX INFO: renamed from: getMode, reason: from getter */
    public final int getF14759k() {
        return this.f14759k;
    }

    @Override // com.jumio.core.views.CameraScanView
    /* JADX INFO: renamed from: getRatio, reason: from getter */
    public float getF14760l() {
        return this.f14760l;
    }

    @Override // com.jumio.core.views.CameraScanView
    public void setCameraFacing(@NotNull JumioCameraFacing value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.setCameraFacing(value);
    }

    public final void setMode(int i11) {
        this.f14759k = i11;
    }

    @Override // com.jumio.core.views.CameraScanView
    public void setRatio(float f11) {
        this.f14760l = f11;
    }

    public /* synthetic */ JumioScanView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.jumio.core.views.CameraScanView, com.jumio.core.interfaces.ScanViewInterface
    public void detach() {
        super.detach();
    }

    @Override // com.jumio.core.views.CameraScanView
    @NotNull
    public JumioCameraFacing getCameraFacing() {
        return super.getCameraFacing();
    }

    @Override // com.jumio.core.views.CameraScanView
    public boolean getExtraction() {
        return super.getExtraction();
    }

    public final boolean getFlash() {
        return isFlashOn$jumio_core_release();
    }

    @Override // com.jumio.core.views.CameraScanView
    public boolean getHasFlash() {
        return super.getHasFlash();
    }

    @Override // com.jumio.core.views.CameraScanView
    public boolean getHasMultipleCameras() {
        return super.getHasMultipleCameras();
    }

    @Override // com.jumio.core.views.CameraScanView
    public boolean isShutterEnabled() {
        return super.isShutterEnabled();
    }

    @Override // com.jumio.core.views.CameraScanView
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        super.pause();
    }

    @Override // com.jumio.core.views.CameraScanView
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        super.resume();
    }

    @Override // com.jumio.core.views.CameraScanView
    public void setExtraction(boolean z11) {
        super.setExtraction(z11);
    }

    @Override // com.jumio.core.views.CameraScanView
    public void switchCamera() {
        super.switchCamera();
    }

    @Override // com.jumio.core.views.CameraScanView
    public void takePicture() {
        super.takePicture();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioScanView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14760l = getMinRatio();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9301R.styleable.JumioScanView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f14759k = typedArrayObtainStyledAttributes.getInt(C9301R.styleable.JumioScanView_jumio_mode, 0);
            setRatio(typedArrayObtainStyledAttributes.getFloat(C9301R.styleable.JumioScanView_jumio_ratio, getMinRatio()));
            setBrandingLogoTopMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(C9301R.styleable.JumioScanView_jumio_branding_logo_top_margin, 0));
            typedArrayObtainStyledAttributes.recycle();
            setFilterTouchesWhenObscured(true);
            setImportantForAccessibility(2);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
