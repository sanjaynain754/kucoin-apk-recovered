package com.jumio.commons.camera;

import com.jumio.commons.PersistWith;
import com.tencent.live2.impl.V2TXLiveDefInner;
import java.io.Serializable;
import jumio.core.C40557L0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010)\u001a\u00020\u0000J\b\u0010*\u001a\u00020#H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m90084d2 = {"Lcom/jumio/commons/camera/CameraSettings;", "Ljava/io/Serializable;", "<init>", "()V", "scaledPreview", "Lcom/jumio/commons/camera/Size;", "getScaledPreview", "()Lcom/jumio/commons/camera/Size;", "setScaledPreview", "(Lcom/jumio/commons/camera/Size;)V", "surface", "getSurface", V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, "preview", "getPreview", "setPreview", "sensorRotation", "", "getSensorRotation", "()I", "setSensorRotation", "(I)V", "frontFacing", "", "getFrontFacing", "()Z", "setFrontFacing", "(Z)V", "capabilities", "Lcom/jumio/commons/camera/CameraCapabilities;", "getCapabilities", "()Lcom/jumio/commons/camera/CameraCapabilities;", "setCapabilities", "(Lcom/jumio/commons/camera/CameraCapabilities;)V", "info", "", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "isEmpty", "copy", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("CameraSettings")
public final class CameraSettings implements Serializable {

    /* JADX INFO: renamed from: d */
    public int f13518d;

    /* JADX INFO: renamed from: e */
    public boolean f13519e;

    /* JADX INFO: renamed from: a */
    public Size f13515a = new Size(0, 0);

    /* JADX INFO: renamed from: b */
    public Size f13516b = new Size(0, 0);

    /* JADX INFO: renamed from: c */
    public Size f13517c = new Size(0, 0);

    /* JADX INFO: renamed from: f */
    public CameraCapabilities f13520f = new C40557L0();

    /* JADX INFO: renamed from: g */
    public String f13521g = "";

    @NotNull
    public final CameraSettings copy() {
        CameraSettings cameraSettings = new CameraSettings();
        cameraSettings.f13515a = Size.copy$default(this.f13515a, 0, 0, 3, null);
        cameraSettings.f13516b = Size.copy$default(this.f13516b, 0, 0, 3, null);
        cameraSettings.f13517c = Size.copy$default(this.f13517c, 0, 0, 3, null);
        cameraSettings.f13518d = this.f13518d;
        cameraSettings.f13519e = this.f13519e;
        cameraSettings.f13520f = this.f13520f;
        return cameraSettings;
    }

    @NotNull
    /* JADX INFO: renamed from: getCapabilities, reason: from getter */
    public final CameraCapabilities getF13520f() {
        return this.f13520f;
    }

    /* JADX INFO: renamed from: getFrontFacing, reason: from getter */
    public final boolean getF13519e() {
        return this.f13519e;
    }

    @NotNull
    /* JADX INFO: renamed from: getInfo, reason: from getter */
    public final String getF13521g() {
        return this.f13521g;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreview, reason: from getter */
    public final Size getF13517c() {
        return this.f13517c;
    }

    @NotNull
    /* JADX INFO: renamed from: getScaledPreview, reason: from getter */
    public final Size getF13515a() {
        return this.f13515a;
    }

    /* JADX INFO: renamed from: getSensorRotation, reason: from getter */
    public final int getF13518d() {
        return this.f13518d;
    }

    @NotNull
    /* JADX INFO: renamed from: getSurface, reason: from getter */
    public final Size getF13516b() {
        return this.f13516b;
    }

    public final boolean isEmpty() {
        return this.f13517c.isEmpty() && this.f13516b.isEmpty() && this.f13515a.isEmpty();
    }

    public final void setCapabilities(@NotNull CameraCapabilities cameraCapabilities) {
        Intrinsics.checkNotNullParameter(cameraCapabilities, "<set-?>");
        this.f13520f = cameraCapabilities;
    }

    public final void setFrontFacing(boolean z11) {
        this.f13519e = z11;
    }

    public final void setInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f13521g = str;
    }

    public final void setPreview(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.f13517c = size;
    }

    public final void setScaledPreview(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.f13515a = size;
    }

    public final void setSensorRotation(int i11) {
        this.f13518d = i11;
    }

    public final void setSurface(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.f13516b = size;
    }

    @NotNull
    public String toString() {
        return StringsKt.trimMargin$default("\n\t\t\t| scaledPreview: (" + this.f13515a.getWidth() + ',' + this.f13515a.getHeight() + ")\n\t\t\t| surface: (" + this.f13516b.getWidth() + ',' + this.f13516b.getHeight() + ")\n\t\t\t| preview: (" + this.f13517c.getWidth() + ',' + this.f13517c.getHeight() + ")\n\t\t\t| frontFacing: " + this.f13519e + "\n\t\t\t| sensorRotation: " + this.f13518d + "\n\t\t\t| capabilities: " + this.f13520f + "\n\t\t", null, 1, null);
    }
}
