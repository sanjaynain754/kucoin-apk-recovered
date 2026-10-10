package com.jumio.core.processor.tilted;

import com.jumio.core.processor.MultiImageProcessorConfig;
import com.jumio.core.processor.ProcessorImage;
import java.util.List;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/core/processor/tilted/TiltedProcessorConfig;", "Lcom/jumio/core/processor/MultiImageProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$TiltedImage;", "images", "", "startUpTime", "", "coolDownTime", "<init>", "(Ljava/util/List;JJ)V", "getImages", "()Ljava/util/List;", "getStartUpTime", "()J", "getCoolDownTime", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TiltedProcessorConfig implements MultiImageProcessorConfig<ProcessorImage.TiltedImage> {

    /* JADX INFO: renamed from: a */
    public final List f14523a;

    /* JADX INFO: renamed from: b */
    public final long f14524b;

    /* JADX INFO: renamed from: c */
    public final long f14525c;

    public TiltedProcessorConfig(@NotNull List<ProcessorImage.TiltedImage> images, long j11, long j12) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f14523a = images;
        this.f14524b = j11;
        this.f14525c = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TiltedProcessorConfig)) {
            return false;
        }
        TiltedProcessorConfig tiltedProcessorConfig = (TiltedProcessorConfig) other;
        return Intrinsics.areEqual(this.f14523a, tiltedProcessorConfig.f14523a) && this.f14524b == tiltedProcessorConfig.f14524b && this.f14525c == tiltedProcessorConfig.f14525c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TiltedProcessorConfig copy$default(TiltedProcessorConfig tiltedProcessorConfig, List list, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tiltedProcessorConfig.f14523a;
        }
        if ((i11 & 2) != 0) {
            j11 = tiltedProcessorConfig.f14524b;
        }
        if ((i11 & 4) != 0) {
            j12 = tiltedProcessorConfig.f14525c;
        }
        return tiltedProcessorConfig.copy(list, j11, j12);
    }

    @NotNull
    public final List<ProcessorImage.TiltedImage> component1() {
        return this.f14523a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getF14524b() {
        return this.f14524b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getF14525c() {
        return this.f14525c;
    }

    @NotNull
    public final TiltedProcessorConfig copy(@NotNull List<ProcessorImage.TiltedImage> images, long startUpTime, long coolDownTime) {
        Intrinsics.checkNotNullParameter(images, "images");
        return new TiltedProcessorConfig(images, startUpTime, coolDownTime);
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getCoolDownTime() {
        return this.f14525c;
    }

    @Override // com.jumio.core.processor.MultiImageProcessorConfig
    @NotNull
    public List<ProcessorImage.TiltedImage> getImages() {
        return this.f14523a;
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getStartUpTime() {
        return this.f14524b;
    }

    public int hashCode() {
        return Long.hashCode(this.f14525c) + AbstractC40749x1.m89269a(this.f14524b, this.f14523a.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "TiltedProcessorConfig(images=" + this.f14523a + ", startUpTime=" + this.f14524b + ", coolDownTime=" + this.f14525c + ')';
    }

    public /* synthetic */ TiltedProcessorConfig(List list, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? 0L : j12);
    }
}
