package com.jumio.core.processor;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/MultiImageProcessorInterface;", "Lcom/jumio/core/processor/ImageProcessorInterface;", "images", "", "Lcom/jumio/core/processor/ProcessorImage;", "getImages", "()Ljava/util/List;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface MultiImageProcessorInterface extends ImageProcessorInterface {
    @NotNull
    List<ProcessorImage> getImages();
}
