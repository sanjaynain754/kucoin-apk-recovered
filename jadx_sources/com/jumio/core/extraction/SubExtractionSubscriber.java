package com.jumio.core.extraction;

import com.google.firebase.messaging.Constants;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.model.StaticModel;
import com.jumio.core.model.SubscriberWithUpdate;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R2\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/core/extraction/SubExtractionSubscriber;", "Lcom/jumio/core/model/SubscriberWithUpdate;", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "Lcom/jumio/core/model/StaticModel;", "mergeResults", "Lkotlin/Function2;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getMergeResults", "()Lkotlin/jvm/functions/Function2;", "setMergeResults", DbParams.KEY_CHANNEL_RESULT, "value", "lastUpdate", "getLastUpdate", "()Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "()Ljava/lang/Throwable;", "mergeResult", "original", "reset", "", "onResult", "onError", "onUpdate", "update", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class SubExtractionSubscriber implements SubscriberWithUpdate<ExtractionUpdateInterface<?>, StaticModel> {

    /* JADX INFO: renamed from: a */
    public final Function2 f13896a;

    /* JADX INFO: renamed from: b */
    public StaticModel f13897b;

    /* JADX INFO: renamed from: c */
    public ExtractionUpdateInterface f13898c;

    public SubExtractionSubscriber(Function2 mergeResults) {
        Intrinsics.checkNotNullParameter(mergeResults, "mergeResults");
        this.f13896a = mergeResults;
    }

    @Override // com.jumio.core.model.SubscriberWithUpdate, com.jumio.core.model.Subscriber
    public void onError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
    }

    @Override // com.jumio.core.model.SubscriberWithUpdate, com.jumio.core.model.Subscriber
    public void onResult(@Nullable StaticModel result) {
        this.f13897b = result;
    }

    @Override // com.jumio.core.model.SubscriberWithUpdate
    public void onUpdate(@NotNull ExtractionUpdateInterface<?> update) {
        Intrinsics.checkNotNullParameter(update, "update");
        this.f13898c = update;
        Integer f13842a = update.getF13842a();
        int saveImage = ExtractionUpdateState.INSTANCE.getSaveImage();
        if (f13842a != null && f13842a.intValue() == saveImage) {
            Object data = update.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.jumio.core.extraction.result.ImageExtractionResult");
            ((ImageExtractionResult) data).getBitmap().recycle();
        }
    }
}
