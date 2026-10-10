package com.jumio.core.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\tÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/model/SubscriberWithUpdate;", "Update", "", "Result", "Lcom/jumio/core/model/Subscriber;", "onUpdate", "", "update", "(Ljava/lang/Object;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface SubscriberWithUpdate<Update, Result> extends Subscriber<Result> {
    @Override // com.jumio.core.model.Subscriber
    /* synthetic */ void onError(@NotNull Throwable th2);

    @Override // com.jumio.core.model.Subscriber
    /* synthetic */ void onResult(@Nullable Object obj);

    void onUpdate(@NotNull Update update);
}
