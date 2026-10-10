package com.jumio.commons.camera;

import android.hardware.camera2.params.ColorSpaceTransform;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.enums.FlashState;
import java.io.Serializable;
import java.util.Arrays;
import jumio.core.AbstractC40637b0;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@p852kotlin.Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u00012B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0083\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\b\u0010\u001aJ\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\rH\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0006\u0010-\u001a\u00020\u0000J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J'\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00063"}, m90084d2 = {"Lcom/jumio/commons/camera/Frame;", "", "byteArray", "", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "directCameraFrame", "", "<init>", "([BLcom/jumio/commons/camera/Frame$Metadata;Z)V", "size", "Lcom/jumio/commons/camera/Size;", "rotation", "", "iso", "lensPosition", "", "shutterSpeed", "", "colorSpaceTransform", "Landroid/hardware/camera2/params/ColorSpaceTransform;", "aperture", "orientation", "isPortrait", "imageFormat", "timeStamp", "([BLcom/jumio/commons/camera/Size;IIFJLandroid/hardware/camera2/params/ColorSpaceTransform;FIZIJ)V", "getByteArray", "()[B", "setByteArray", "([B)V", "getMetadata", "()Lcom/jumio/commons/camera/Frame$Metadata;", "setMetadata", "(Lcom/jumio/commons/camera/Frame$Metadata;)V", "getDirectCameraFrame", "()Z", "setDirectCameraFrame", "(Z)V", "equals", "other", "", "hashCode", "toString", "", "deepCopy", "component1", "component2", "component3", "copy", "Metadata", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Frame implements Cloneable {

    /* JADX INFO: renamed from: a */
    public byte[] f13528a;

    /* JADX INFO: renamed from: b */
    public Metadata f13529b;

    /* JADX INFO: renamed from: c */
    public boolean f13530c;

    @p852kotlin.Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010FH\u0096\u0002J\b\u0010G\u001a\u00020\u0005H\u0016J\b\u0010H\u001a\u00020IH\u0016J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0010J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\bHÆ\u0003J\t\u0010P\u001a\u00020\nHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0010HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\u0010HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010Y\u001a\u00020\u0017HÆ\u0003J\u0099\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u00104\"\u0004\b5\u00106R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R\u001a\u0010\u0013\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u00104\"\u0004\b;\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006["}, m90084d2 = {"Lcom/jumio/commons/camera/Frame$Metadata;", "Ljava/io/Serializable;", "size", "Lcom/jumio/commons/camera/Size;", "rotation", "", "iso", "shutterSpeed", "", "lensPosition", "", "colorSpaceTransform", "", "aperture", "orientation", "isPortrait", "", "imageFormat", "timestamp", "isFlashOn", "cameraConnectionData", "Lcom/jumio/core/camera/CameraConnectionData;", "flashState", "Lcom/jumio/core/enums/FlashState;", "<init>", "(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;)V", "getSize", "()Lcom/jumio/commons/camera/Size;", "setSize", "(Lcom/jumio/commons/camera/Size;)V", "getRotation", "()I", "setRotation", "(I)V", "getIso", "setIso", "getShutterSpeed", "()J", "setShutterSpeed", "(J)V", "getLensPosition", "()F", "setLensPosition", "(F)V", "getColorSpaceTransform", "()[F", "setColorSpaceTransform", "([F)V", "getAperture", "setAperture", "getOrientation", "setOrientation", "()Z", "setPortrait", "(Z)V", "getImageFormat", "setImageFormat", "getTimestamp", "setTimestamp", "setFlashOn", "getCameraConnectionData", "()Lcom/jumio/core/camera/CameraConnectionData;", "setCameraConnectionData", "(Lcom/jumio/core/camera/CameraConnectionData;)V", "getFlashState", "()Lcom/jumio/core/enums/FlashState;", "setFlashState", "(Lcom/jumio/core/enums/FlashState;)V", "equals", "other", "", "hashCode", "toString", "", "deepCopy", "hasFlashFired", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Metadata implements Serializable {

        /* JADX INFO: renamed from: a */
        public Size f13531a;

        /* JADX INFO: renamed from: b */
        public int f13532b;

        /* JADX INFO: renamed from: c */
        public int f13533c;

        /* JADX INFO: renamed from: d */
        public long f13534d;

        /* JADX INFO: renamed from: e */
        public float f13535e;

        /* JADX INFO: renamed from: f */
        public float[] f13536f;

        /* JADX INFO: renamed from: g */
        public float f13537g;

        /* JADX INFO: renamed from: h */
        public int f13538h;

        /* JADX INFO: renamed from: i */
        public boolean f13539i;

        /* JADX INFO: renamed from: j */
        public int f13540j;

        /* JADX INFO: renamed from: k */
        public long f13541k;

        /* JADX INFO: renamed from: l */
        public boolean f13542l;

        /* JADX INFO: renamed from: m */
        public CameraConnectionData f13543m;

        /* JADX INFO: renamed from: n */
        public FlashState f13544n;

        public Metadata() {
            this(null, 0, 0, 0L, 0.0f, null, 0.0f, 0, false, 0, 0L, false, null, null, 16383, null);
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, Size size, int i11, int i12, long j11, float f11, float[] fArr, float f12, int i13, boolean z11, int i14, long j12, boolean z12, CameraConnectionData cameraConnectionData, FlashState flashState, int i15, Object obj) {
            return metadata.copy((i15 & 1) != 0 ? metadata.f13531a : size, (i15 & 2) != 0 ? metadata.f13532b : i11, (i15 & 4) != 0 ? metadata.f13533c : i12, (i15 & 8) != 0 ? metadata.f13534d : j11, (i15 & 16) != 0 ? metadata.f13535e : f11, (i15 & 32) != 0 ? metadata.f13536f : fArr, (i15 & 64) != 0 ? metadata.f13537g : f12, (i15 & 128) != 0 ? metadata.f13538h : i13, (i15 & 256) != 0 ? metadata.f13539i : z11, (i15 & 512) != 0 ? metadata.f13540j : i14, (i15 & 1024) != 0 ? metadata.f13541k : j12, (i15 & 2048) != 0 ? metadata.f13542l : z12, (i15 & 4096) != 0 ? metadata.f13543m : cameraConnectionData, (i15 & 8192) != 0 ? metadata.f13544n : flashState);
        }

        @NotNull
        public final Metadata copy(@NotNull Size size, int rotation, int iso, long shutterSpeed, float lensPosition, @Nullable float[] colorSpaceTransform, float aperture, int orientation, boolean isPortrait, int imageFormat, long timestamp, boolean isFlashOn, @Nullable CameraConnectionData cameraConnectionData, @NotNull FlashState flashState) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(flashState, "flashState");
            return new Metadata(size, rotation, iso, shutterSpeed, lensPosition, colorSpaceTransform, aperture, orientation, isPortrait, imageFormat, timestamp, isFlashOn, cameraConnectionData, flashState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(Metadata.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.jumio.commons.camera.Frame.Metadata");
            Metadata metadata = (Metadata) other;
            return Intrinsics.areEqual(this.f13531a, metadata.f13531a) && this.f13532b == metadata.f13532b && this.f13533c == metadata.f13533c && this.f13535e == metadata.f13535e && this.f13534d == metadata.f13534d && Arrays.equals(this.f13536f, metadata.f13536f) && this.f13537g == metadata.f13537g && this.f13538h == metadata.f13538h && this.f13539i == metadata.f13539i && this.f13540j == metadata.f13540j && this.f13541k == metadata.f13541k && this.f13542l == metadata.f13542l && Intrinsics.areEqual(this.f13543m, metadata.f13543m) && this.f13544n == metadata.f13544n;
        }

        public Metadata(@NotNull Size size, int i11, int i12, long j11, float f11, @Nullable float[] fArr, float f12, int i13, boolean z11, int i14, long j12, boolean z12, @Nullable CameraConnectionData cameraConnectionData, @NotNull FlashState flashState) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(flashState, "flashState");
            this.f13531a = size;
            this.f13532b = i11;
            this.f13533c = i12;
            this.f13534d = j11;
            this.f13535e = f11;
            this.f13536f = fArr;
            this.f13537g = f12;
            this.f13538h = i13;
            this.f13539i = z11;
            this.f13540j = i14;
            this.f13541k = j12;
            this.f13542l = z12;
            this.f13543m = cameraConnectionData;
            this.f13544n = flashState;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Size getF13531a() {
            return this.f13531a;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final int getF13540j() {
            return this.f13540j;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final long getF13541k() {
            return this.f13541k;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getF13542l() {
            return this.f13542l;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final CameraConnectionData getF13543m() {
            return this.f13543m;
        }

        @NotNull
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final FlashState getF13544n() {
            return this.f13544n;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getF13532b() {
            return this.f13532b;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getF13533c() {
            return this.f13533c;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getF13534d() {
            return this.f13534d;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getF13535e() {
            return this.f13535e;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float[] getF13536f() {
            return this.f13536f;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final float getF13537g() {
            return this.f13537g;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getF13538h() {
            return this.f13538h;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getF13539i() {
            return this.f13539i;
        }

        @NotNull
        public final Metadata deepCopy() {
            Metadata metadataCopy$default = copy$default(this, null, 0, 0, 0L, 0.0f, null, 0.0f, 0, false, 0, 0L, false, null, null, 16383, null);
            metadataCopy$default.f13531a = new Size(this.f13531a.getWidth(), this.f13531a.getHeight());
            return metadataCopy$default;
        }

        public final float getAperture() {
            return this.f13537g;
        }

        @Nullable
        public final CameraConnectionData getCameraConnectionData() {
            return this.f13543m;
        }

        @Nullable
        public final float[] getColorSpaceTransform() {
            return this.f13536f;
        }

        @NotNull
        public final FlashState getFlashState() {
            return this.f13544n;
        }

        public final int getImageFormat() {
            return this.f13540j;
        }

        public final int getIso() {
            return this.f13533c;
        }

        public final float getLensPosition() {
            return this.f13535e;
        }

        public final int getOrientation() {
            return this.f13538h;
        }

        public final int getRotation() {
            return this.f13532b;
        }

        public final long getShutterSpeed() {
            return this.f13534d;
        }

        @NotNull
        public final Size getSize() {
            return this.f13531a;
        }

        public final long getTimestamp() {
            return this.f13541k;
        }

        public final boolean hasFlashFired() {
            if (!this.f13542l) {
                return false;
            }
            FlashState flashState = this.f13544n;
            return flashState == FlashState.FIRED || flashState == FlashState.UNAVAILABLE;
        }

        public int hashCode() {
            int iM89269a = AbstractC40749x1.m89269a(this.f13534d, (Float.hashCode(this.f13535e) + (((((this.f13531a.hashCode() * 31) + this.f13532b) * 31) + this.f13533c) * 31)) * 31, 31);
            float[] fArr = this.f13536f;
            int iM89251a = AbstractC40637b0.m89251a(this.f13542l, AbstractC40749x1.m89269a(this.f13541k, (AbstractC40637b0.m89251a(this.f13539i, (((Float.hashCode(this.f13537g) + ((iM89269a + (fArr != null ? fArr.hashCode() : 0)) * 31)) * 31) + this.f13538h) * 31, 31) + this.f13540j) * 31, 31), 31);
            CameraConnectionData cameraConnectionData = this.f13543m;
            return this.f13544n.hashCode() + ((iM89251a + (cameraConnectionData != null ? cameraConnectionData.hashCode() : 0)) * 31);
        }

        public final boolean isFlashOn() {
            return this.f13542l;
        }

        public final boolean isPortrait() {
            return this.f13539i;
        }

        public final void setAperture(float f11) {
            this.f13537g = f11;
        }

        public final void setCameraConnectionData(@Nullable CameraConnectionData cameraConnectionData) {
            this.f13543m = cameraConnectionData;
        }

        public final void setColorSpaceTransform(@Nullable float[] fArr) {
            this.f13536f = fArr;
        }

        public final void setFlashOn(boolean z11) {
            this.f13542l = z11;
        }

        public final void setFlashState(@NotNull FlashState flashState) {
            Intrinsics.checkNotNullParameter(flashState, "<set-?>");
            this.f13544n = flashState;
        }

        public final void setImageFormat(int i11) {
            this.f13540j = i11;
        }

        public final void setIso(int i11) {
            this.f13533c = i11;
        }

        public final void setLensPosition(float f11) {
            this.f13535e = f11;
        }

        public final void setOrientation(int i11) {
            this.f13538h = i11;
        }

        public final void setPortrait(boolean z11) {
            this.f13539i = z11;
        }

        public final void setRotation(int i11) {
            this.f13532b = i11;
        }

        public final void setShutterSpeed(long j11) {
            this.f13534d = j11;
        }

        public final void setSize(@NotNull Size size) {
            Intrinsics.checkNotNullParameter(size, "<set-?>");
            this.f13531a = size;
        }

        public final void setTimestamp(long j11) {
            this.f13541k = j11;
        }

        @NotNull
        public String toString() {
            return StringsKt.trimMargin$default("\n\t\t\t| size: " + this.f13531a + "\n\t\t\t| rotation: " + this.f13532b + "\n\t\t\t| iso: " + this.f13533c + "\n\t\t\t| lensPosition: " + this.f13535e + "\n\t\t\t| shutterSpeed: " + this.f13534d + "\n\t\t\t| colorSpaceTransform: " + this.f13536f + "\n\t\t\t| aperture: " + this.f13537g + "\n\t\t\t| orientation: " + this.f13538h + "\n\t\t\t| isPortrait: " + this.f13539i + "\n\t\t\t| imageFormat: " + this.f13540j + "\n\t\t\t| timestamp: " + this.f13541k + "\n\t\t\t| isFlashOn: " + this.f13542l + "\n\t\t\t| cameraConnection: " + this.f13543m + "\n\t\t\t| flashState: " + this.f13544n + "\n\t\t", null, 1, null);
        }

        public /* synthetic */ Metadata(Size size, int i11, int i12, long j11, float f11, float[] fArr, float f12, int i13, boolean z11, int i14, long j12, boolean z12, CameraConnectionData cameraConnectionData, FlashState flashState, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? new Size(0, 0) : size, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0L : j11, (i15 & 16) != 0 ? 0.0f : f11, (i15 & 32) != 0 ? null : fArr, (i15 & 64) == 0 ? f12 : 0.0f, (i15 & 128) != 0 ? 0 : i13, (i15 & 256) != 0 ? false : z11, (i15 & 512) != 0 ? 17 : i14, (i15 & 1024) != 0 ? System.currentTimeMillis() : j12, (i15 & 2048) != 0 ? false : z12, (i15 & 4096) != 0 ? null : cameraConnectionData, (i15 & 8192) != 0 ? FlashState.UNAVAILABLE : flashState);
        }
    }

    public Frame(@NotNull byte[] byteArray, @NotNull Metadata metadata, boolean z11) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f13528a = byteArray;
        this.f13529b = metadata;
        this.f13530c = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Frame.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.jumio.commons.camera.Frame");
        Frame frame = (Frame) other;
        return Arrays.equals(this.f13528a, frame.f13528a) && Intrinsics.areEqual(this.f13529b, frame.f13529b);
    }

    public static /* synthetic */ Frame copy$default(Frame frame, byte[] bArr, Metadata metadata, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr = frame.f13528a;
        }
        if ((i11 & 2) != 0) {
            metadata = frame.f13529b;
        }
        if ((i11 & 4) != 0) {
            z11 = frame.f13530c;
        }
        return frame.copy(bArr, metadata, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getF13528a() {
        return this.f13528a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Metadata getF13529b() {
        return this.f13529b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getF13530c() {
        return this.f13530c;
    }

    @NotNull
    public final Frame copy(@NotNull byte[] byteArray, @NotNull Metadata metadata, boolean directCameraFrame) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new Frame(byteArray, metadata, directCameraFrame);
    }

    @NotNull
    public final Frame deepCopy() {
        return new Frame(FrameKt.access$deepCopy(this.f13528a), this.f13529b.deepCopy(), false, 4, null);
    }

    @NotNull
    public final byte[] getByteArray() {
        return this.f13528a;
    }

    public final boolean getDirectCameraFrame() {
        return this.f13530c;
    }

    @NotNull
    public final Metadata getMetadata() {
        return this.f13529b;
    }

    public int hashCode() {
        return this.f13529b.hashCode() + (Arrays.hashCode(this.f13528a) * 31);
    }

    public final void setByteArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.f13528a = bArr;
    }

    public final void setDirectCameraFrame(boolean z11) {
        this.f13530c = z11;
    }

    public final void setMetadata(@NotNull Metadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "<set-?>");
        this.f13529b = metadata;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Frame(byteArray=");
        String string = Arrays.toString(this.f13528a);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(", metadata=");
        sb2.append(this.f13529b);
        sb2.append(')');
        return sb2.toString();
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    public /* synthetic */ Frame(byte[] bArr, Metadata metadata, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new byte[0] : bArr, metadata, (i11 & 4) != 0 ? false : z11);
    }

    public /* synthetic */ Frame(byte[] bArr, Size size, int i11, int i12, float f11, long j11, ColorSpaceTransform colorSpaceTransform, float f12, int i13, boolean z11, int i14, long j12, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? new byte[0] : bArr, (i15 & 2) != 0 ? new Size(0, 0) : size, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0.0f : f11, (i15 & 32) != 0 ? 0L : j11, (i15 & 64) != 0 ? null : colorSpaceTransform, (i15 & 128) == 0 ? f12 : 0.0f, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) == 0 ? z11 : false, (i15 & 1024) != 0 ? 17 : i14, (i15 & 2048) != 0 ? System.currentTimeMillis() : j12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Frame(@NotNull byte[] byteArray, @NotNull Size size, int i11, int i12, float f11, long j11, @Nullable ColorSpaceTransform colorSpaceTransform, float f12, int i13, boolean z11, int i14, long j12) {
        this(byteArray, new Metadata(size, i11, i12, j11, f11, colorSpaceTransform != null ? FrameKt.toFloatArray(colorSpaceTransform) : null, f12, i13, z11, i14, j12, false, null, null, 14336, null), false, 4, null);
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(size, "size");
    }
}
