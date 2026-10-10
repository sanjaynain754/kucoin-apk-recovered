package com.jumio.core.camera;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/core/camera/CameraDataSettingsModel;", "Lcom/jumio/core/model/StaticModel;", "enabled", "", "maxFrames", "", "minSequenceLen", "threshold", "", "<init>", "(ZIID)V", "getEnabled", "()Z", "getMaxFrames", "()I", "getMinSequenceLen", "getThreshold", "()D", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("CameraDataSettingsModel")
public final class CameraDataSettingsModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final boolean f13724a;

    /* JADX INFO: renamed from: b */
    public final int f13725b;

    /* JADX INFO: renamed from: c */
    public final int f13726c;

    /* JADX INFO: renamed from: d */
    public final double f13727d;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/camera/CameraDataSettingsModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/camera/CameraDataSettingsModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final CameraDataSettingsModel fromJson(@NotNull JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new CameraDataSettingsModel(jsonObject.optBoolean("enabled", true), jsonObject.optInt("maxFrames", 300), jsonObject.optInt("minSequenceLen", 5), jsonObject.optDouble("threshold", 0.99999d));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CameraDataSettingsModel() {
        this(false, 0, 0, 0.0d, 15, null);
    }

    public CameraDataSettingsModel(boolean z11, int i11, int i12, double d11) {
        this.f13724a = z11;
        this.f13725b = i11;
        this.f13726c = i12;
        this.f13727d = d11;
    }

    /* JADX INFO: renamed from: getEnabled, reason: from getter */
    public final boolean getF13724a() {
        return this.f13724a;
    }

    /* JADX INFO: renamed from: getMaxFrames, reason: from getter */
    public final int getF13725b() {
        return this.f13725b;
    }

    /* JADX INFO: renamed from: getMinSequenceLen, reason: from getter */
    public final int getF13726c() {
        return this.f13726c;
    }

    /* JADX INFO: renamed from: getThreshold, reason: from getter */
    public final double getF13727d() {
        return this.f13727d;
    }

    public /* synthetic */ CameraDataSettingsModel(boolean z11, int i11, int i12, double d11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z11, (i13 & 2) != 0 ? 300 : i11, (i13 & 4) != 0 ? 5 : i12, (i13 & 8) != 0 ? 0.99999d : d11);
    }
}
