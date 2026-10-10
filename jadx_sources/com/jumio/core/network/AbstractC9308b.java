package com.jumio.core.network;

import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.jumio.core.network.b */
/* JADX INFO: loaded from: classes56.dex */
public abstract class AbstractC9308b implements DownloadTask.ProgressListener {
    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressDone(Object obj, Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressException(Exception exc, Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public final Object onProgressUpdate(float f11, Continuation continuation) {
        return Unit.INSTANCE;
    }
}
