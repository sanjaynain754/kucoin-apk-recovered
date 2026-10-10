package com.jumio.core.processor;

import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.processor.base.BaseProcessorConfig;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¨\u0006\t"}, m90084d2 = {"initProcessorsFromScanPartModel", "", "Lcom/jumio/core/processor/ImageProcessorHandlerInterface;", "scanPartModel", "Lcom/jumio/core/models/PhysicalIdScanPartModel;", "initFromProcessorConfigs", "processorConfigs", "", "Lcom/jumio/core/processor/ImageProcessorConfig;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageProcessorHandlerInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageProcessorHandlerInterface.kt\ncom/jumio/core/processor/ImageProcessorHandlerInterfaceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1863#2,2:87\n*S KotlinDebug\n*F\n+ 1 ImageProcessorHandlerInterface.kt\ncom/jumio/core/processor/ImageProcessorHandlerInterfaceKt\n*L\n83#1:87,2\n*E\n"})
public final class ImageProcessorHandlerInterfaceKt {
    public static final void initFromProcessorConfigs(@NotNull ImageProcessorHandlerInterface imageProcessorHandlerInterface, @NotNull List<? extends ImageProcessorConfig<?>> processorConfigs) {
        Intrinsics.checkNotNullParameter(imageProcessorHandlerInterface, "<this>");
        Intrinsics.checkNotNullParameter(processorConfigs, "processorConfigs");
        Iterator<T> it = processorConfigs.iterator();
        while (it.hasNext()) {
            imageProcessorHandlerInterface.initProcessorWithConfig((ImageProcessorConfig) it.next());
        }
    }

    public static final void initProcessorsFromScanPartModel(@NotNull ImageProcessorHandlerInterface imageProcessorHandlerInterface, @NotNull PhysicalIdScanPartModel scanPartModel) {
        Intrinsics.checkNotNullParameter(imageProcessorHandlerInterface, "<this>");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        imageProcessorHandlerInterface.reset();
        imageProcessorHandlerInterface.initProcessorWithConfig(new BaseProcessorConfig(new ProcessorImage.BaseImage(scanPartModel.getF14312a().name(), 0L, false, 6, null), 0L, 0L, 6, null));
        initFromProcessorConfigs(imageProcessorHandlerInterface, scanPartModel.getProcessorConfigs());
    }
}
