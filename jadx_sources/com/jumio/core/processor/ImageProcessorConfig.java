package com.jumio.core.processor;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.processor.ProcessorImage;
import java.io.Serializable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/ImageProcessorConfig;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/processor/ProcessorImage;", "Ljava/io/Serializable;", "startUpTime", "", "getStartUpTime", "()J", "coolDownTime", "getCoolDownTime", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ImageProcessorConfig<T extends ProcessorImage> extends Serializable {
    long getCoolDownTime();

    long getStartUpTime();
}
