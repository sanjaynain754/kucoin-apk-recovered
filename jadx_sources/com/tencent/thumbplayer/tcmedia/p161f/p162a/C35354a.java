package com.tencent.thumbplayer.tcmedia.p161f.p162a;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.api.TPTimeRange;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequesterListener;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeTimeRange;
import com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener;
import com.tencent.thumbplayer.tcmedia.core.richmedia.async.TPNativeRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.a.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35354a implements ITPRichMediaAsyncRequester {

    /* JADX INFO: renamed from: a */
    private final ITPNativeRichMediaAsyncRequester f76021a;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.a.a$a */
    public class a implements ITPNativeRichMediaAsyncRequesterListener {

        /* JADX INFO: renamed from: b */
        private final ITPRichMediaAsyncRequesterListener f76023b;

        public a(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
            this.f76023b = iTPRichMediaAsyncRequesterListener;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onFeatureDataRequestFailure(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i11, int i12, int i13) {
            this.f76023b.onFeatureDataRequestFailure(C35354a.this, i11, i12, i13);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onFeatureDataRequestSuccess(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i11, int i12, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            this.f76023b.onFeatureDataRequestSuccess(C35354a.this, i11, i12, new TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onRequesterError(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i11) {
            this.f76023b.onRequesterError(C35354a.this, i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onRequesterPrepared(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester) {
            this.f76023b.onRequesterPrepared(C35354a.this);
        }
    }

    /* JADX INFO: renamed from: a */
    private TPRichMediaFeature[] m78151a(TPNativeRichMediaFeature[] tPNativeRichMediaFeatureArr) {
        if (tPNativeRichMediaFeatureArr == null || tPNativeRichMediaFeatureArr.length == 0) {
            return new TPRichMediaFeature[0];
        }
        TPRichMediaFeature[] tPRichMediaFeatureArr = new TPRichMediaFeature[tPNativeRichMediaFeatureArr.length];
        for (int i11 = 0; i11 < tPNativeRichMediaFeatureArr.length; i11++) {
            tPRichMediaFeatureArr[i11] = new TPRichMediaFeature(tPNativeRichMediaFeatureArr[i11]);
        }
        return tPRichMediaFeatureArr;
    }

    /* JADX INFO: renamed from: a */
    private TPNativeTimeRange[] m78152a(TPTimeRange[] tPTimeRangeArr) {
        if (tPTimeRangeArr == null || tPTimeRangeArr.length == 0) {
            return new TPNativeTimeRange[0];
        }
        TPNativeTimeRange[] tPNativeTimeRangeArr = new TPNativeTimeRange[tPTimeRangeArr.length];
        for (int i11 = 0; i11 < tPTimeRangeArr.length; i11++) {
            TPTimeRange tPTimeRange = tPTimeRangeArr[i11];
            if (tPTimeRange == null) {
                return new TPNativeTimeRange[0];
            }
            tPNativeTimeRangeArr[i11] = new TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs());
        }
        return tPNativeTimeRangeArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void cancelRequest(int i11) {
        this.f76021a.cancelRequest(i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public TPRichMediaFeature[] getFeatures() {
        return m78151a(this.f76021a.getFeatures());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void prepareAsync() {
        this.f76021a.prepareAsync();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void release() {
        this.f76021a.release();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMs(int i11, long j11) {
        return this.f76021a.requestFeatureDataAsyncAtTimeMs(i11, j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMsArray(int i11, long[] jArr) {
        return this.f76021a.requestFeatureDataAsyncAtTimeMsArray(i11, jArr);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRange(int i11, TPTimeRange tPTimeRange) {
        if (tPTimeRange != null) {
            return this.f76021a.requestFeatureDataAsyncAtTimeRange(i11, new TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs()));
        }
        TPLogUtil.m78802w("TPRichMediaAsyncRequester", "requestFeatureDataAsyncAtTimeRange, timeRange == null");
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void setRequesterListener(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
        this.f76021a.setRequesterListener(new a(iTPRichMediaAsyncRequesterListener));
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void setRichMediaSource(String str) {
        this.f76021a.setRichMediaSource(str);
    }

    public C35354a(Context context) {
        this.f76021a = new TPNativeRichMediaAsyncRequester(context);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRanges(int i11, TPTimeRange[] tPTimeRangeArr) {
        TPNativeTimeRange[] tPNativeTimeRangeArrM78152a = m78152a(tPTimeRangeArr);
        if (tPNativeTimeRangeArrM78152a.length == 0) {
            TPLogUtil.m78802w("TPRichMediaAsyncRequester", "requestFeatureDataAsyncAtTimeRanges, toNativeTimeRanges return empty array");
            return -1;
        }
        return this.f76021a.requestFeatureDataAsyncAtTimeRanges(i11, tPNativeTimeRangeArrM78152a);
    }
}
