package com.jumio.core.processor;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.processor.ProcessorImage;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/SingleImageProcessorConfig;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/processor/ProcessorImage;", "Lcom/jumio/core/processor/ImageProcessorConfig;", "image", "getImage", "()Lcom/jumio/core/processor/ProcessorImage;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface SingleImageProcessorConfig<T extends ProcessorImage> extends ImageProcessorConfig<T> {
    @NotNull
    T getImage();
}
