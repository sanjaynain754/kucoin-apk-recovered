package com.tencent.thumbplayer.tcmedia.api.richmedia;

/* JADX INFO: loaded from: classes62.dex */
public interface ITPRichMediaAsyncRequesterListener {
    void onFeatureDataRequestFailure(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i11, int i12, int i13);

    void onFeatureDataRequestSuccess(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i11, int i12, TPRichMediaFeatureData tPRichMediaFeatureData);

    void onRequesterError(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i11);

    void onRequesterPrepared(ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester);
}
