package com.jumio.core.processor.challenge;

import com.jumio.core.data.scan.ByteArrayResult;
import com.jumio.core.processor.MultiImageProcessorConfig;
import com.jumio.core.processor.ProcessorData;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.SingleDataProcessorConfig;
import java.util.List;
import jumio.core.AbstractC40749x1;
import jumio.core.C40610W;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m90084d2 = {"Lcom/jumio/core/processor/challenge/CameraChallengeProcessorConfig;", "Lcom/jumio/core/processor/MultiImageProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$ChallengeImage;", "Lcom/jumio/core/processor/SingleDataProcessorConfig;", "Lcom/jumio/core/data/scan/ByteArrayResult;", "cameraChallengeData", "Lcom/jumio/core/models/CameraChallengeData;", "processorData", "Lcom/jumio/core/processor/ProcessorData;", "startUpTime", "", "coolDownTime", "<init>", "(Lcom/jumio/core/models/CameraChallengeData;Lcom/jumio/core/processor/ProcessorData;JJ)V", "getCameraChallengeData", "()Lcom/jumio/core/models/CameraChallengeData;", "getProcessorData", "()Lcom/jumio/core/processor/ProcessorData;", "getStartUpTime", "()J", "getCoolDownTime", "images", "", "getImages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CameraChallengeProcessorConfig implements MultiImageProcessorConfig<ProcessorImage.ChallengeImage>, SingleDataProcessorConfig<ByteArrayResult> {

    /* JADX INFO: renamed from: a */
    public final C40610W f14508a;

    /* JADX INFO: renamed from: b */
    public final ProcessorData f14509b;

    /* JADX INFO: renamed from: c */
    public final long f14510c;

    /* JADX INFO: renamed from: d */
    public final long f14511d;

    public CameraChallengeProcessorConfig(@NotNull C40610W cameraChallengeData, @NotNull ProcessorData<ByteArrayResult> processorData, long j11, long j12) {
        Intrinsics.checkNotNullParameter(cameraChallengeData, "cameraChallengeData");
        Intrinsics.checkNotNullParameter(processorData, "processorData");
        this.f14508a = cameraChallengeData;
        this.f14509b = processorData;
        this.f14510c = j11;
        this.f14511d = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChallengeProcessorConfig)) {
            return false;
        }
        CameraChallengeProcessorConfig cameraChallengeProcessorConfig = (CameraChallengeProcessorConfig) other;
        return Intrinsics.areEqual(this.f14508a, cameraChallengeProcessorConfig.f14508a) && Intrinsics.areEqual(this.f14509b, cameraChallengeProcessorConfig.f14509b) && this.f14510c == cameraChallengeProcessorConfig.f14510c && this.f14511d == cameraChallengeProcessorConfig.f14511d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CameraChallengeProcessorConfig copy$default(CameraChallengeProcessorConfig cameraChallengeProcessorConfig, C40610W c40610w, ProcessorData processorData, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c40610w = cameraChallengeProcessorConfig.f14508a;
        }
        if ((i11 & 2) != 0) {
            processorData = cameraChallengeProcessorConfig.f14509b;
        }
        if ((i11 & 4) != 0) {
            j11 = cameraChallengeProcessorConfig.f14510c;
        }
        if ((i11 & 8) != 0) {
            j12 = cameraChallengeProcessorConfig.f14511d;
        }
        long j13 = j12;
        return cameraChallengeProcessorConfig.copy(c40610w, processorData, j11, j13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C40610W getF14508a() {
        return this.f14508a;
    }

    @NotNull
    public final ProcessorData<ByteArrayResult> component2() {
        return this.f14509b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getF14510c() {
        return this.f14510c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getF14511d() {
        return this.f14511d;
    }

    @NotNull
    public final CameraChallengeProcessorConfig copy(@NotNull C40610W cameraChallengeData, @NotNull ProcessorData<ByteArrayResult> processorData, long j11, long j12) {
        Intrinsics.checkNotNullParameter(cameraChallengeData, "cameraChallengeData");
        Intrinsics.checkNotNullParameter(processorData, "processorData");
        return new CameraChallengeProcessorConfig(cameraChallengeData, processorData, j11, j12);
    }

    @NotNull
    public final C40610W getCameraChallengeData() {
        return this.f14508a;
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getCoolDownTime() {
        return this.f14511d;
    }

    @Override // com.jumio.core.processor.MultiImageProcessorConfig
    @NotNull
    public List<ProcessorImage.ChallengeImage> getImages() {
        return this.f14508a.f90154d;
    }

    @Override // com.jumio.core.processor.SingleDataProcessorConfig
    @NotNull
    public ProcessorData<ByteArrayResult> getProcessorData() {
        return this.f14509b;
    }

    @Override // com.jumio.core.processor.ImageProcessorConfig
    public long getStartUpTime() {
        return this.f14510c;
    }

    public int hashCode() {
        return Long.hashCode(this.f14511d) + AbstractC40749x1.m89269a(this.f14510c, (this.f14509b.hashCode() + (this.f14508a.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "CameraChallengeProcessorConfig(cameraChallengeData=" + this.f14508a + ", processorData=" + this.f14509b + ", startUpTime=" + this.f14510c + ", coolDownTime=" + this.f14511d + ')';
    }

    public /* synthetic */ CameraChallengeProcessorConfig(C40610W c40610w, ProcessorData processorData, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40610w, processorData, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? 0L : j12);
    }
}
