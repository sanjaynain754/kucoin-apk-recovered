package com.jumio.core.processor.flash;

import com.jumio.core.data.scan.ByteArrayResult;
import com.jumio.core.processor.ProcessorData;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.SingleDataProcessorConfig;
import com.jumio.core.processor.SingleImageProcessorConfig;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m90084d2 = {"Lcom/jumio/core/processor/flash/FlashProcessorConfig;", "Lcom/jumio/core/processor/SingleImageProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$FlashImage;", "Lcom/jumio/core/processor/SingleDataProcessorConfig;", "Lcom/jumio/core/data/scan/ByteArrayResult;", "image", "processorData", "Lcom/jumio/core/processor/ProcessorData;", "startUpTime", "", "coolDownTime", "manualEnabled", "", "<init>", "(Lcom/jumio/core/processor/ProcessorImage$FlashImage;Lcom/jumio/core/processor/ProcessorData;JJZ)V", "getImage", "()Lcom/jumio/core/processor/ProcessorImage$FlashImage;", "getProcessorData", "()Lcom/jumio/core/processor/ProcessorData;", "getStartUpTime", "()J", "getCoolDownTime", "getManualEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlashProcessorConfig implements SingleImageProcessorConfig<ProcessorImage.FlashImage>, SingleDataProcessorConfig<ByteArrayResult> {

    /* JADX INFO: renamed from: a */
    public final ProcessorImage.FlashImage f14516a;

    /* JADX INFO: renamed from: b */
    public final ProcessorData f14517b;

    /* JADX INFO: renamed from: c */
    public final long f14518c;

    /* JADX INFO: renamed from: d */
    public final long f14519d;

    /* JADX INFO: renamed from: e */
    public final boolean f14520e;

    public FlashProcessorConfig(@NotNull ProcessorImage.FlashImage image, @NotNull ProcessorData<ByteArrayResult> processorData, long j11, long j12, boolean z11) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(processorData, "processorData");
        this.f14516a = image;
        this.f14517b = processorData;
        this.f14518c = j11;
        this.f14519d = j12;
        this.f14520e = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashProcessorConfig)) {
            return false;
        }
        FlashProcessorConfig flashProcessorConfig = (FlashProcessorConfig) other;
        return Intrinsics.areEqual(this.f14516a, flashProcessorConfig.f14516a) && Intrinsics.areEqual(this.f14517b, flashProcessorConfig.f14517b) && this.f14518c == flashProcessorConfig.f14518c && this.f14519d == flashProcessorConfig.f14519d && this.f14520e == flashProcessorConfig.f14520e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlashProcessorConfig copy$default(FlashProcessorConfig flashProcessorConfig, ProcessorImage.FlashImage flashImage, ProcessorData processorData, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            flashImage = flashProcessorConfig.f14516a;
        }
        if ((i11 & 2) != 0) {
            processorData = flashProcessorConfig.f14517b;
        }
        if ((i11 & 4) != 0) {
            j11 = flashProcessorConfig.f14518c;
        }
        if ((i11 & 8) != 0) {
            j12 = flashProcessorConfig.f14519d;
        }
        if ((i11 & 16) != 0) {
            z11 = flashProcessorConfig.f14520e;
        }
        boolean z12 = z11;
        long j13 = j12;
        return flashProcessorConfig.copy(flashImage, processorData, j11, j13, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProcessorImage.FlashImage getF14516a() {
        return this.f14516a;
    }

    @NotNull
    public final ProcessorData<ByteArrayResult> component2() {
        return this.f14517b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getF14518c() {
        return this.f14518c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getF14519d() {
        return this.f14519d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getF14520e() {
        return this.f14520e;
    }

    @NotNull
    public final FlashProcessorConfig copy(@NotNull ProcessorImage.FlashImage image, @NotNull ProcessorData<ByteArrayResult> processorData, long startUpTime, long coolDownTime, boolean manualEnabled) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(processorData, "processorData");
        return new FlashProcessorConfig(image, processorData, startUpTime, coolDownTime, manualEnabled);
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getCoolDownTime() {
        return this.f14519d;
    }

    @Override // com.jumio.core.processor.SingleImageProcessorConfig
    @NotNull
    public ProcessorImage.FlashImage getImage() {
        return this.f14516a;
    }

    public final boolean getManualEnabled() {
        return this.f14520e;
    }

    @Override // com.jumio.core.processor.SingleDataProcessorConfig
    @NotNull
    public ProcessorData<ByteArrayResult> getProcessorData() {
        return this.f14517b;
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getStartUpTime() {
        return this.f14518c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f14520e) + AbstractC40749x1.m89269a(this.f14519d, AbstractC40749x1.m89269a(this.f14518c, (this.f14517b.hashCode() + (this.f14516a.hashCode() * 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "FlashProcessorConfig(image=" + this.f14516a + ", processorData=" + this.f14517b + ", startUpTime=" + this.f14518c + ", coolDownTime=" + this.f14519d + ", manualEnabled=" + this.f14520e + ')';
    }

    public /* synthetic */ FlashProcessorConfig(ProcessorImage.FlashImage flashImage, ProcessorData processorData, long j11, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(flashImage, processorData, (i11 & 4) != 0 ? 400L : j11, (i11 & 8) != 0 ? 600L : j12, (i11 & 16) != 0 ? false : z11);
    }
}
