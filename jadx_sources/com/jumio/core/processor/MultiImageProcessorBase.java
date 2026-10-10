package com.jumio.core.processor;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.core.processor.MultiImageProcessorConfig;
import com.jumio.core.processor.ProcessorImage;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00018\u00018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/core/processor/MultiImageProcessorBase;", "C", "Lcom/jumio/core/processor/MultiImageProcessorConfig;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/processor/ProcessorImage;", "Lcom/jumio/core/processor/ImageProcessorBase;", "Lcom/jumio/core/processor/MultiImageProcessorInterface;", "config", "<init>", "(Lcom/jumio/core/processor/MultiImageProcessorConfig;)V", "currentImageIndex", "", "currentImage", "getCurrentImage", "()Lcom/jumio/core/processor/ProcessorImage;", "nextImage", "getNextImage", "nextImages", "", "getNextImages", "()Ljava/util/List;", "images", "getImages", "image", "getImage", "reset", "", "moveToNextImage", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MultiImageProcessorBase<C extends MultiImageProcessorConfig<T>, T extends ProcessorImage> extends AbstractC9312a implements MultiImageProcessorInterface {

    /* JADX INFO: renamed from: a */
    public int f14472a;

    /* JADX INFO: renamed from: b */
    public final List f14473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiImageProcessorBase(@NotNull C config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14473b = config.getImages();
    }

    @NotNull
    public final T getCurrentImage() {
        return this.f14472a < getImages().size() ? getImages().get(this.f14472a) : (T) CollectionsKt.last((List) getImages());
    }

    @Override // com.jumio.core.processor.MultiImageProcessorInterface
    @NotNull
    public List<T> getImages() {
        return this.f14473b;
    }

    @Nullable
    public final T getNextImage() {
        if (this.f14472a + 1 < getImages().size()) {
            return getImages().get(this.f14472a + 1);
        }
        return null;
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface
    @NotNull
    public T getImage() {
        return (T) getCurrentImage();
    }

    @NotNull
    public final List<T> getNextImages() {
        return CollectionsKt.drop(getImages(), this.f14472a);
    }

    public final void moveToNextImage() {
        resetStart();
        resetHoldStillTimestamp();
        resetCoolDownTimestamp();
        this.f14472a++;
        setImageStarted(true);
    }

    @Override // com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    public void reset() {
        super.reset();
        this.f14472a = 0;
    }
}
