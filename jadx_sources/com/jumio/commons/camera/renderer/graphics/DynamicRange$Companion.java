package com.jumio.commons.camera.renderer.graphics;

import jumio.core.C40654e1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u001f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u0006$"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/graphics/DynamicRange$Companion;", "", "<init>", "()V", "ENCODING_UNSPECIFIED", "", "ENCODING_SDR", "ENCODING_HDR_UNSPECIFIED", "ENCODING_HLG", "ENCODING_HDR10", "ENCODING_HDR10_PLUS", "ENCODING_DOLBY_VISION", "BIT_DEPTH_UNSPECIFIED", "BIT_DEPTH_8_BIT", "BIT_DEPTH_10_BIT", "UNSPECIFIED", "Lcom/jumio/commons/camera/renderer/graphics/DynamicRange;", "getUNSPECIFIED", "()Lcom/jumio/commons/camera/renderer/graphics/DynamicRange;", "SDR", "getSDR", "HDR_UNSPECIFIED_10_BIT", "getHDR_UNSPECIFIED_10_BIT", "HLG_10_BIT", "getHLG_10_BIT", "HDR10_10_BIT", "getHDR10_10_BIT", "HDR10_PLUS_10_BIT", "getHDR10_PLUS_10_BIT", "DOLBY_VISION_10_BIT", "getDOLBY_VISION_10_BIT", "DOLBY_VISION_8_BIT", "getDOLBY_VISION_8_BIT", "getEncodingLabel", "", "encoding", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DynamicRange$Companion {
    @NotNull
    public final C40654e1 getDOLBY_VISION_10_BIT() {
        return C40654e1.f90257j;
    }

    @NotNull
    public final C40654e1 getDOLBY_VISION_8_BIT() {
        return C40654e1.f90258k;
    }

    @NotNull
    public final C40654e1 getHDR10_10_BIT() {
        return C40654e1.f90255h;
    }

    @NotNull
    public final C40654e1 getHDR10_PLUS_10_BIT() {
        return C40654e1.f90256i;
    }

    @NotNull
    public final C40654e1 getHDR_UNSPECIFIED_10_BIT() {
        return C40654e1.f90253f;
    }

    @NotNull
    public final C40654e1 getHLG_10_BIT() {
        return C40654e1.f90254g;
    }

    @NotNull
    public final C40654e1 getSDR() {
        return C40654e1.f90252e;
    }

    @NotNull
    public final C40654e1 getUNSPECIFIED() {
        return C40654e1.f90251d;
    }

    public DynamicRange$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final String access$getEncodingLabel(DynamicRange$Companion dynamicRange$Companion, int i11) {
        dynamicRange$Companion.getClass();
        switch (i11) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }
}
