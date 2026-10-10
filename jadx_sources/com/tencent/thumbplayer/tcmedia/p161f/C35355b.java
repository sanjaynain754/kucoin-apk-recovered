package com.tencent.thumbplayer.tcmedia.p161f;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizerListener;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaRequestExtraInfo;
import com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaInnerProcessorCallback;
import com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessor;
import com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaProcessor;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaRequestExtraInfo;
import com.tencent.thumbplayer.tcmedia.p161f.p163b.C35356a;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.C35417c;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b */
/* JADX INFO: loaded from: classes64.dex */
public class C35355b implements InterfaceC35353a {

    /* JADX INFO: renamed from: a */
    private ITPNativeRichMediaProcessor f76024a;

    /* JADX INFO: renamed from: b */
    private a f76025b;

    /* JADX INFO: renamed from: c */
    private b f76026c;

    /* JADX INFO: renamed from: d */
    private C35417c f76027d;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b$a */
    public class a implements ITPNativeRichMediaInnerProcessorCallback {

        /* JADX INFO: renamed from: b */
        private InterfaceC35353a.a f76029b;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m78155a(InterfaceC35353a.a aVar) {
            this.f76029b = aVar;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaInnerProcessorCallback
        public long onGetCurrentPositionMs(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            InterfaceC35353a.a aVar = this.f76029b;
            if (aVar == null) {
                return -1L;
            }
            long jMo77760a = aVar.mo77760a(C35355b.this);
            C35355b.this.m78153a(311, (int) jMo77760a, 0, null, null);
            return jMo77760a;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.b$b */
    public class b implements ITPNativeRichMediaProcessorCallback {

        /* JADX INFO: renamed from: b */
        private ITPRichMediaSynchronizerListener f76031b;

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public void m78156a(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
            this.f76031b = iTPRichMediaSynchronizerListener;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onDeselectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i11) {
            C35355b.this.m78153a(305, i11, 0, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f76031b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onDeselectFeatureSuccess(C35355b.this, i11);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaError(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i11) {
            C35355b.this.m78153a(308, i11, 0, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f76031b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaError(C35355b.this, i11);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureData(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i11, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f76031b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureData(C35355b.this, i11, new TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureFailure(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i11, int i12) {
            C35355b.this.m78153a(310, i11, i12, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f76031b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaFeatureFailure(C35355b.this, i11, i12);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaInfo(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i11, long j11, long j12, long j13, Object obj) {
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f76031b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaInfo(C35355b.this, i11, j11, j12, j13, obj);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaPrepared(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
            C35355b.this.m78153a(301, 0, 0, null, C35355b.this.getFeatures());
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f76031b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onRichMediaPrepared(C35355b.this);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onSelectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i11) {
            C35355b.this.m78153a(303, i11, 0, null, null);
            ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener = this.f76031b;
            if (iTPRichMediaSynchronizerListener != null) {
                iTPRichMediaSynchronizerListener.onSelectFeatureSuccess(C35355b.this, i11);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p161f.InterfaceC35353a
    /* JADX INFO: renamed from: a */
    public void mo78148a(float f11) {
        this.f76024a.setPlaybackRate(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78153a(int i11, int i12, int i13, String str, Object obj) {
        this.f76027d.mo78183a(i11, i12, i13, str, obj);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void deselectFeatureAsync(int i11) {
        this.f76024a.deselectFeatureAsync(i11);
        m78153a(304, i11, 0, null, null);
    }

    public void finalize() throws Throwable {
        this.f76024a.setInnerProcessorCallback(null);
        this.f76024a.setProcessorCallback(null);
        this.f76024a.release();
        this.f76026c.m78156a(null);
        this.f76025b.m78155a(null);
        super.finalize();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public TPRichMediaFeature[] getFeatures() {
        TPNativeRichMediaFeature tPNativeRichMediaFeature;
        TPNativeRichMediaFeature[] features = this.f76024a.getFeatures();
        if (features == null) {
            return new TPRichMediaFeature[0];
        }
        TPRichMediaFeature[] tPRichMediaFeatureArr = new TPRichMediaFeature[features.length];
        for (int i11 = 0; i11 < features.length && (tPNativeRichMediaFeature = features[i11]) != null; i11++) {
            tPRichMediaFeatureArr[i11] = new TPRichMediaFeature(tPNativeRichMediaFeature);
        }
        return tPRichMediaFeatureArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void prepareAsync() {
        this.f76024a.prepareAsync();
        m78153a(300, 0, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void release() {
        this.f76024a.setInnerProcessorCallback(null);
        this.f76024a.setProcessorCallback(null);
        this.f76024a.release();
        this.f76026c.m78156a(null);
        this.f76025b.m78155a(null);
        m78153a(307, 0, 0, null, null);
        this.f76027d.mo78694c();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void reset() {
        this.f76024a.reset();
        m78153a(306, 0, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void selectFeatureAsync(int i11, TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo) {
        TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo = new TPNativeRichMediaRequestExtraInfo();
        tPNativeRichMediaRequestExtraInfo.setActOnOptional(tPRichMediaRequestExtraInfo.getActOnOption());
        this.f76024a.selectFeatureAsync(i11, tPNativeRichMediaRequestExtraInfo);
        m78153a(302, i11, 0, null, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void setListener(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
        this.f76026c.m78156a(iTPRichMediaSynchronizerListener);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer
    public void setRichMediaSource(String str) {
        this.f76024a.setRichMediaSource(str);
        m78153a(309, 0, 0, str, null);
    }

    public C35355b(Context context) {
        this.f76024a = new TPNativeRichMediaProcessor(context);
        a aVar = new a();
        this.f76025b = aVar;
        this.f76024a.setInnerProcessorCallback(aVar);
        b bVar = new b();
        this.f76026c = bVar;
        this.f76024a.setProcessorCallback(bVar);
        C35417c c35417c = new C35417c();
        this.f76027d = c35417c;
        c35417c.mo78693a(new C35356a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.p161f.InterfaceC35353a
    /* JADX INFO: renamed from: a */
    public void mo78149a(long j11) {
        this.f76024a.seek(j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p161f.InterfaceC35353a
    /* JADX INFO: renamed from: a */
    public void mo78150a(InterfaceC35353a.a aVar) {
        this.f76025b.m78155a(aVar);
    }
}
