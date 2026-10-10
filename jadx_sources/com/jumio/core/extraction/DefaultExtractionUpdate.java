package com.jumio.core.extraction;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.analytics.MetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/core/extraction/DefaultExtractionUpdate;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "<init>", "()V", "state", "", "getState", "()Ljava/lang/Integer;", "setState", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "metaInfo", "Lcom/jumio/analytics/MetaInfo;", "getMetaInfo", "()Lcom/jumio/analytics/MetaInfo;", "setMetaInfo", "(Lcom/jumio/analytics/MetaInfo;)V", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultExtractionUpdate<T> implements ExtractionUpdateInterface<T> {

    /* JADX INFO: renamed from: a */
    public Integer f13842a;

    /* JADX INFO: renamed from: b */
    public Object f13843b;

    /* JADX INFO: renamed from: c */
    public MetaInfo f13844c;

    @Override // com.jumio.core.extraction.ExtractionUpdateInterface
    @Nullable
    public T getData() {
        return (T) this.f13843b;
    }

    @Override // com.jumio.core.extraction.ExtractionUpdateInterface
    @Nullable
    /* JADX INFO: renamed from: getMetaInfo, reason: from getter */
    public MetaInfo getF13844c() {
        return this.f13844c;
    }

    @Override // com.jumio.core.extraction.ExtractionUpdateInterface
    @Nullable
    /* JADX INFO: renamed from: getState, reason: from getter */
    public Integer getF13842a() {
        return this.f13842a;
    }

    @Override // com.jumio.core.extraction.ExtractionUpdateInterface
    public void setData(@Nullable T t11) {
        this.f13843b = t11;
    }

    @Override // com.jumio.core.extraction.ExtractionUpdateInterface
    public void setMetaInfo(@Nullable MetaInfo metaInfo) {
        this.f13844c = metaInfo;
    }

    @Override // com.jumio.core.extraction.ExtractionUpdateInterface
    public void setState(@Nullable Integer num) {
        this.f13842a = num;
    }

    @NotNull
    public String toString() {
        return "DefaultExtractionUpdate(state=" + getF13842a() + ", data=" + getData() + ", metaInfo=" + getF13844c() + ')';
    }
}
