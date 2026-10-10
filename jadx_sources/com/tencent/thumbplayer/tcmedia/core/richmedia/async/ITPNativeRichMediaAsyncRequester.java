package com.tencent.thumbplayer.tcmedia.core.richmedia.async;

import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeTimeRange;

/* JADX INFO: loaded from: classes64.dex */
public interface ITPNativeRichMediaAsyncRequester {
    void cancelRequest(int i11);

    TPNativeRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    int requestFeatureDataAsyncAtTimeMs(int i11, long j11);

    int requestFeatureDataAsyncAtTimeMsArray(int i11, long[] jArr);

    int requestFeatureDataAsyncAtTimeRange(int i11, TPNativeTimeRange tPNativeTimeRange);

    int requestFeatureDataAsyncAtTimeRanges(int i11, TPNativeTimeRange[] tPNativeTimeRangeArr);

    void setRequesterListener(ITPNativeRichMediaAsyncRequesterListener iTPNativeRichMediaAsyncRequesterListener);

    void setRichMediaSource(String str);
}
