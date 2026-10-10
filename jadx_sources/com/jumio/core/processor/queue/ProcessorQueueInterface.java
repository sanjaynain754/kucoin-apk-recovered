package com.jumio.core.processor.queue;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.jumio.core.processor.ImageProcessorInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u000bH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0010\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u0011À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/queue/ProcessorQueueInterface;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/jumio/core/processor/ImageProcessorInterface;", "getEntries", "()Ljava/util/List;", "isEmpty", "", "()Z", "add", "", "image", "removeFirst", "peekFirst", "moveToNext", "clear", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ProcessorQueueInterface {
    void add(@NotNull ImageProcessorInterface image);

    void clear();

    @NotNull
    List<ImageProcessorInterface> getEntries();

    boolean isEmpty();

    @Nullable
    ImageProcessorInterface moveToNext();

    @Nullable
    ImageProcessorInterface peekFirst();

    void removeFirst();
}
