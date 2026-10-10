package com.jumio.core.extraction;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.analytics.MetaInfo;
import com.jumio.core.Injected;
import com.jumio.core.ServiceLocator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0014R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00018\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/extraction/ExtractionUpdateInterface;", ExifInterface.GPS_DIRECTION_TRUE, "", "state", "", "getState", "()Ljava/lang/Integer;", "setState", "(Ljava/lang/Integer;)V", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "metaInfo", "Lcom/jumio/analytics/MetaInfo;", "getMetaInfo", "()Lcom/jumio/analytics/MetaInfo;", "setMetaInfo", "(Lcom/jumio/analytics/MetaInfo;)V", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ExtractionUpdateInterface<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f13863a;

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u0001H\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/jumio/core/extraction/ExtractionUpdateInterface$Companion;", "", "<init>", "()V", "build", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", ExifInterface.GPS_DIRECTION_TRUE, "state", "", "data", "metaInfo", "Lcom/jumio/analytics/MetaInfo;", "(ILjava/lang/Object;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f13863a = new Companion();

        /* JADX INFO: renamed from: a */
        public static final ExtractionUpdateInterface m14529a() {
            return new DefaultExtractionUpdate();
        }

        public static /* synthetic */ ExtractionUpdateInterface build$default(Companion companion, int i11, Object obj, MetaInfo metaInfo, int i12, Object obj2) {
            if ((i12 & 4) != 0) {
                metaInfo = null;
            }
            return companion.build(i11, obj, metaInfo);
        }

        @NotNull
        public final <T> ExtractionUpdateInterface<T> build(int state, @Nullable T data, @Nullable MetaInfo metaInfo) {
            ExtractionUpdateInterface<T> extractionUpdateInterface = (ExtractionUpdateInterface) ServiceLocator.INSTANCE.getServiceImplementation(ExtractionUpdateInterface.class, new Function0() { // from class: com.jumio.core.extraction.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExtractionUpdateInterface.Companion.m14529a();
                }
            });
            Intrinsics.checkNotNull(extractionUpdateInterface, "null cannot be cast to non-null type com.jumio.core.extraction.ExtractionUpdateInterface<T of com.jumio.core.extraction.ExtractionUpdateInterface.Companion.build>");
            extractionUpdateInterface.setState(Integer.valueOf(state));
            extractionUpdateInterface.setData(data);
            extractionUpdateInterface.setMetaInfo(metaInfo);
            return extractionUpdateInterface;
        }
    }

    @Nullable
    T getData();

    @Nullable
    /* JADX INFO: renamed from: getMetaInfo */
    MetaInfo getF13844c();

    @Nullable
    /* JADX INFO: renamed from: getState */
    Integer getF13842a();

    void setData(@Nullable T t11);

    void setMetaInfo(@Nullable MetaInfo metaInfo);

    void setState(@Nullable Integer num);
}
