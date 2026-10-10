package com.jumio.core.processor.base;

import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.SingleImageProcessorConfig;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/core/processor/base/BaseProcessorConfig;", "Lcom/jumio/core/processor/SingleImageProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$BaseImage;", "image", "startUpTime", "", "coolDownTime", "<init>", "(Lcom/jumio/core/processor/ProcessorImage$BaseImage;JJ)V", "getImage", "()Lcom/jumio/core/processor/ProcessorImage$BaseImage;", "getStartUpTime", "()J", "getCoolDownTime", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BaseProcessorConfig implements SingleImageProcessorConfig<ProcessorImage.BaseImage> {

    /* JADX INFO: renamed from: a */
    public final ProcessorImage.BaseImage f14495a;

    /* JADX INFO: renamed from: b */
    public final long f14496b;

    /* JADX INFO: renamed from: c */
    public final long f14497c;

    public BaseProcessorConfig(@NotNull ProcessorImage.BaseImage image, long j11, long j12) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f14495a = image;
        this.f14496b = j11;
        this.f14497c = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseProcessorConfig)) {
            return false;
        }
        BaseProcessorConfig baseProcessorConfig = (BaseProcessorConfig) other;
        return Intrinsics.areEqual(this.f14495a, baseProcessorConfig.f14495a) && this.f14496b == baseProcessorConfig.f14496b && this.f14497c == baseProcessorConfig.f14497c;
    }

    public static /* synthetic */ BaseProcessorConfig copy$default(BaseProcessorConfig baseProcessorConfig, ProcessorImage.BaseImage baseImage, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            baseImage = baseProcessorConfig.f14495a;
        }
        if ((i11 & 2) != 0) {
            j11 = baseProcessorConfig.f14496b;
        }
        if ((i11 & 4) != 0) {
            j12 = baseProcessorConfig.f14497c;
        }
        return baseProcessorConfig.copy(baseImage, j11, j12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProcessorImage.BaseImage getF14495a() {
        return this.f14495a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getF14496b() {
        return this.f14496b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getF14497c() {
        return this.f14497c;
    }

    @NotNull
    public final BaseProcessorConfig copy(@NotNull ProcessorImage.BaseImage image, long startUpTime, long coolDownTime) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BaseProcessorConfig(image, startUpTime, coolDownTime);
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getCoolDownTime() {
        return this.f14497c;
    }

    @Override // com.jumio.core.processor.SingleImageProcessorConfig
    @NotNull
    public ProcessorImage.BaseImage getImage() {
        return this.f14495a;
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getStartUpTime() {
        return this.f14496b;
    }

    public int hashCode() {
        return Long.hashCode(this.f14497c) + AbstractC40749x1.m89269a(this.f14496b, this.f14495a.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "BaseProcessorConfig(image=" + this.f14495a + ", startUpTime=" + this.f14496b + ", coolDownTime=" + this.f14497c + ')';
    }

    public /* synthetic */ BaseProcessorConfig(ProcessorImage.BaseImage baseImage, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseImage, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? 0L : j12);
    }
}
