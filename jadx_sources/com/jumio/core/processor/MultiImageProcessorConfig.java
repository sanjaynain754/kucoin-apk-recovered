package com.jumio.core.processor;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.processor.ProcessorImage;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/MultiImageProcessorConfig;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/processor/ProcessorImage;", "Lcom/jumio/core/processor/ImageProcessorConfig;", "images", "", "getImages", "()Ljava/util/List;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface MultiImageProcessorConfig<T extends ProcessorImage> extends ImageProcessorConfig<T> {
    @NotNull
    List<T> getImages();
}
