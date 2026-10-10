package com.tencent.thumbplayer.tcmedia.p150a;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35231a;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35228c implements C35227b.a, InterfaceC35231a {

    /* JADX INFO: renamed from: a */
    private Map<Integer, TPCaptureCallBack> f75505a = new HashMap();

    /* JADX INFO: renamed from: b */
    private String f75506b;

    /* JADX INFO: renamed from: c */
    private FileDescriptor f75507c;

    /* JADX INFO: renamed from: d */
    private AssetFileDescriptor f75508d;

    public C35228c(AssetFileDescriptor assetFileDescriptor) {
        this.f75508d = assetFileDescriptor;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35231a
    /* JADX INFO: renamed from: a */
    public void mo77349a() {
        this.f75505a.clear();
    }

    public C35228c(FileDescriptor fileDescriptor) {
        this.f75507c = fileDescriptor;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p150a.C35227b.a
    /* JADX INFO: renamed from: a */
    public void mo77333a(int i11, int i12) {
        TPCaptureCallBack tPCaptureCallBack = this.f75505a.get(Integer.valueOf(i11));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoFailed(i12);
        }
    }

    public C35228c(String str) {
        this.f75506b = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p150a.C35227b.a
    /* JADX INFO: renamed from: a */
    public void mo77334a(int i11, long j11, int i12, int i13, Bitmap bitmap, long j12) {
        TPCaptureCallBack tPCaptureCallBack = this.f75505a.get(Integer.valueOf(i11));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoSuccess(bitmap);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35231a
    /* JADX INFO: renamed from: a */
    public void mo77350a(long j11, TPImageGeneratorParams tPImageGeneratorParams, TPCaptureCallBack tPCaptureCallBack) {
        C35227b.d dVar = new C35227b.d();
        dVar.f75499a = this.f75506b;
        dVar.f75500b = this.f75507c;
        dVar.f75501c = this.f75508d;
        dVar.f75502d = j11;
        dVar.f75503e = tPImageGeneratorParams.width;
        dVar.f75504f = tPImageGeneratorParams.height;
        this.f75505a.put(Integer.valueOf(C35227b.m77329a().m77332a(dVar, this)), tPCaptureCallBack);
    }
}
