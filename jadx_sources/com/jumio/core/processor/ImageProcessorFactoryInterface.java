package com.jumio.core.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&¨\u0006\u0006À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/ImageProcessorFactoryInterface;", "", "createImageProcessor", "Lcom/jumio/core/processor/ImageProcessorInterface;", "imageProcessorConfig", "Lcom/jumio/core/processor/ImageProcessorConfig;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ImageProcessorFactoryInterface {
    @Nullable
    ImageProcessorInterface createImageProcessor(@NotNull ImageProcessorConfig<?> imageProcessorConfig);
}
