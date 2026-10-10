package com.jumio.core.processor;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.SingleImageProcessorConfig;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/jumio/core/processor/SingleImageProcessorBase;", "C", "Lcom/jumio/core/processor/SingleImageProcessorConfig;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/processor/ProcessorImage;", "Lcom/jumio/core/processor/ImageProcessorBase;", "config", "<init>", "(Lcom/jumio/core/processor/SingleImageProcessorConfig;)V", "image", "getImage", "()Lcom/jumio/core/processor/ProcessorImage;", "Lcom/jumio/core/processor/ProcessorImage;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SingleImageProcessorBase<C extends SingleImageProcessorConfig<T>, T extends ProcessorImage> extends AbstractC9312a {

    @NotNull
    private final T image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleImageProcessorBase(@NotNull C config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.image = (T) config.getImage();
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface
    @NotNull
    public T getImage() {
        return this.image;
    }
}
