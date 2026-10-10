package com.jumio.core.processor;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.data.scan.ScanResult;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorData;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/data/scan/ScanResult;", "Lcom/jumio/core/model/StaticModel;", DocumentClassifier.KEY_SIDE, "", "data", "<init>", "(Ljava/lang/String;Lcom/jumio/core/data/scan/ScanResult;)V", "getClassifier", "()Ljava/lang/String;", "getData", "()Lcom/jumio/core/data/scan/ScanResult;", "Lcom/jumio/core/data/scan/ScanResult;", "component1", "component2", "copy", "(Ljava/lang/String;Lcom/jumio/core/data/scan/ScanResult;)Lcom/jumio/core/processor/ProcessorData;", "equals", "", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ProcessorData<T extends ScanResult<?>> implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final String f14474a;

    /* JADX INFO: renamed from: b */
    public final ScanResult f14475b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessorData)) {
            return false;
        }
        ProcessorData processorData = (ProcessorData) other;
        return Intrinsics.areEqual(this.f14474a, processorData.f14474a) && Intrinsics.areEqual(this.f14475b, processorData.f14475b);
    }

    public ProcessorData(@NotNull String classifier, @NotNull T data) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f14474a = classifier;
        this.f14475b = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProcessorData copy$default(ProcessorData processorData, String str, ScanResult scanResult, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = processorData.f14474a;
        }
        if ((i11 & 2) != 0) {
            scanResult = processorData.f14475b;
        }
        return processorData.copy(str, scanResult);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14474a() {
        return this.f14474a;
    }

    @NotNull
    public final T component2() {
        return (T) this.f14475b;
    }

    @NotNull
    public final ProcessorData<T> copy(@NotNull String classifier, @NotNull T data) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(data, "data");
        return new ProcessorData<>(classifier, data);
    }

    @NotNull
    public final String getClassifier() {
        return this.f14474a;
    }

    @NotNull
    public final T getData() {
        return (T) this.f14475b;
    }

    public int hashCode() {
        return this.f14475b.hashCode() + (this.f14474a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProcessorData(classifier=" + this.f14474a + ", data=" + this.f14475b + ')';
    }
}
