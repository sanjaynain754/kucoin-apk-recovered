package com.jumio.core.processor.queue;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.jumio.core.processor.ImageProcessorInterface;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/core/processor/queue/ProcessorQueue;", "Lcom/jumio/core/processor/queue/ProcessorQueueInterface;", "<init>", "()V", "queueLock", "", "queue", "", "Lcom/jumio/core/processor/ImageProcessorInterface;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "getEntries", "()Ljava/util/List;", "isEmpty", "", "()Z", "add", "", "image", "removeFirst", "peekFirst", "moveToNext", "clear", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProcessorQueue implements ProcessorQueueInterface {

    /* JADX INFO: renamed from: a */
    public final Object f14521a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayList f14522b = new ArrayList();

    @Override // com.jumio.core.processor.queue.ProcessorQueueInterface
    public void add(@NotNull ImageProcessorInterface image) {
        Intrinsics.checkNotNullParameter(image, "image");
        synchronized (this.f14521a) {
            this.f14522b.add(image);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.jumio.core.processor.queue.ProcessorQueueInterface
    public void clear() {
        synchronized (this.f14521a) {
            this.f14522b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.jumio.core.processor.queue.ProcessorQueueInterface
    @NotNull
    public List<ImageProcessorInterface> getEntries() {
        List<ImageProcessorInterface> list;
        synchronized (this.f14521a) {
            list = CollectionsKt.toList(this.f14522b);
        }
        return list;
    }

    @Override // com.jumio.core.processor.queue.ProcessorQueueInterface
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f14521a) {
            zIsEmpty = this.f14522b.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // com.jumio.core.processor.queue.ProcessorQueueInterface
    @Nullable
    public ImageProcessorInterface moveToNext() {
        synchronized (this.f14521a) {
            if (this.f14522b.isEmpty()) {
                return null;
            }
            this.f14522b.remove(0);
            return (ImageProcessorInterface) CollectionsKt.firstOrNull((List) this.f14522b);
        }
    }

    @Override // com.jumio.core.processor.queue.ProcessorQueueInterface
    @Nullable
    public ImageProcessorInterface peekFirst() {
        ImageProcessorInterface imageProcessorInterface;
        synchronized (this.f14521a) {
            imageProcessorInterface = (ImageProcessorInterface) CollectionsKt.firstOrNull((List) this.f14522b);
        }
        return imageProcessorInterface;
    }

    @Override // com.jumio.core.processor.queue.ProcessorQueueInterface
    public void removeFirst() {
        synchronized (this.f14521a) {
            try {
                if (!this.f14522b.isEmpty()) {
                    this.f14522b.remove(0);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
