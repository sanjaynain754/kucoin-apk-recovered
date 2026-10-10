package com.tencent.thumbplayer.tcmedia.p156c.p157a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.TPAssetResourceLoadingContentInformationRequest;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLFileSystem;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLIOUtil;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.b */
/* JADX INFO: loaded from: classes62.dex */
public class C35290b implements InterfaceC35289a {

    /* JADX INFO: renamed from: a */
    private static String f75856a = "TPAssetResourceLoader";

    /* JADX INFO: renamed from: b */
    private Context f75857b;

    /* JADX INFO: renamed from: c */
    private ITPAssetResourceLoaderListener f75858c;

    /* JADX INFO: renamed from: d */
    private long f75859d = 0;

    /* JADX INFO: renamed from: e */
    private String f75860e = "";

    /* JADX INFO: renamed from: f */
    private String f75861f = "";

    /* JADX INFO: renamed from: g */
    private String f75862g = "";

    /* JADX INFO: renamed from: h */
    private String f75863h = ".mp4";

    /* JADX INFO: renamed from: i */
    private int f75864i = 0;

    /* JADX INFO: renamed from: j */
    private ArrayList<C35292d> f75865j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    private TPAssetResourceLoadingContentInformationRequest f75866k;

    /* JADX INFO: renamed from: l */
    private HandlerThread f75867l;

    /* JADX INFO: renamed from: m */
    private HandlerThread f75868m;

    /* JADX INFO: renamed from: n */
    private a f75869n;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.b$a */
    public class a extends Handler {
        /* JADX INFO: renamed from: a */
        private void m77942a(long j11, long j12, String str, int i11, int i12) {
            C35292d c35292d = new C35292d(j11, j12, i12, m77943a(j11, j12));
            c35292d.m77959a(C35290b.this.f75868m.getLooper());
            c35292d.m77961a(C35290b.this.mo77919b(i11, str));
            c35292d.m77960a(C35290b.this.f75866k);
            if (C35290b.this.f75858c.shouldWaitForLoadingOfRequestedResource(c35292d)) {
                C35290b.this.m77932a(c35292d);
                TPLogUtil.m78800i(C35290b.f75856a, "add to mLoadingRequests, requestId: ".concat(String.valueOf(i12)));
            }
        }

        public a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        private boolean m77943a(long j11, long j12) {
            boolean z11 = C35290b.this.f75859d > 0 && j12 + j11 >= C35290b.this.f75859d;
            if (z11) {
                C35290b.this.m77941f();
            }
            return z11;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TPLogUtil.m78796d(C35290b.f75856a, "mCallbackForResourceLoaderHandler msg : " + message.what);
            if (C35290b.this.f75858c != null) {
                int i11 = message.what;
                if (i11 != 256) {
                    if (i11 != 257) {
                        return;
                    }
                    TPLogUtil.m78800i(C35290b.f75856a, "stop read data");
                    C35290b.this.m77934b(message.arg1);
                    return;
                }
                TPLogUtil.m78800i(C35290b.f75856a, "start read data");
                b bVar = (b) message.obj;
                long j11 = bVar.f75871a;
                long j12 = bVar.f75872b;
                String str = bVar.f75873c;
                int i12 = message.arg1;
                int i13 = message.arg2;
                TPLogUtil.m78800i(C35290b.f75856a, "start read data, requestStart: " + j11 + " requestEnd:" + j12 + " requestId:" + i13);
                long jM77924a = C35290b.this.m77924a(j11, j12);
                if (jM77924a <= 0) {
                    TPLogUtil.m78797e(C35290b.f75856a, "requestLength invalid, check requestStart and requestEnd");
                } else {
                    m77942a(j11, jM77924a, str, i12, i13);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        long f75871a;

        /* JADX INFO: renamed from: b */
        long f75872b;

        /* JADX INFO: renamed from: c */
        String f75873c;

        private b() {
        }
    }

    /* JADX INFO: renamed from: e */
    private String m77939e() {
        return this.f75861f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public synchronized void m77941f() {
        try {
            ArrayList<C35292d> arrayList = this.f75865j;
            if (arrayList != null) {
                for (C35292d c35292d : arrayList) {
                    c35292d.m77962b();
                    this.f75858c.didCancelLoadingRequest(c35292d);
                }
                this.f75865j.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: a */
    public int mo77913a(int i11, String str, int i12) {
        if (this.f75858c == null) {
            TPLogUtil.m78797e(f75856a, "listener not set");
            return 0;
        }
        m77929a(257, i12, 0, (Object) null);
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: b */
    public int mo77918b(int i11, String str, long j11, long j12) {
        TPLogUtil.m78796d(f75856a, "read data, offset:" + j11 + ", length:" + j12);
        int iMin = (int) Math.min((long) m77923a(j11), j12);
        if (iMin <= 0) {
            return -1;
        }
        TPLogUtil.m78796d(f75856a, "on read data, fileId: " + i11 + " readOffset: " + j11 + " readLength:" + j12 + " readyLength:" + iMin);
        return iMin;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: a */
    public int mo77914a(int i11, String str, long j11, long j12) {
        if (this.f75858c == null) {
            TPLogUtil.m78797e(f75856a, "listener not set");
            return 0;
        }
        TPLogUtil.m78800i(f75856a, "onStartReadData, fileId:" + i11 + ", fileKey:" + str + ", requestStart:" + j11 + ", requestEnd:" + j12);
        int i12 = this.f75864i + 1;
        b bVar = new b();
        bVar.f75871a = j11;
        bVar.f75872b = j12;
        bVar.f75873c = str;
        m77929a(256, i11, i12, bVar);
        this.f75864i = i12;
        return i12;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: c */
    public String mo77921c(int i11, String str) {
        return this.f75860e;
    }

    public C35290b(Context context, Looper looper) {
        this.f75857b = context;
        if (looper == null) {
            HandlerThread handlerThreadM78922b = C35435o.m78917a().m78922b();
            this.f75867l = handlerThreadM78922b;
            looper = handlerThreadM78922b.getLooper();
        }
        this.f75869n = new a(looper);
        this.f75868m = C35435o.m78917a().m78919a("TPAssetResourceLoader-dataWriteThread");
    }

    /* JADX INFO: renamed from: a */
    private synchronized int m77923a(long j11) {
        if (this.f75865j == null) {
            return 0;
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f75865j.size(); i11++) {
            iMax = Math.max(iMax, this.f75865j.get(i11).m77957a(j11));
        }
        return iMax;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: b */
    public String mo77919b(int i11, String str) {
        String strM77939e = m77939e();
        return !TextUtils.isEmpty(strM77939e) ? strM77939e : m77928a(this.f75857b, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: c */
    public void mo77922c() {
        TPLogUtil.m78800i(f75856a, "release start");
        mo77920b();
        C35435o.m78917a().m78921a(this.f75867l, this.f75869n);
        C35435o.m78917a().m78921a(this.f75868m, (Handler) null);
        this.f75867l = null;
        this.f75868m = null;
        this.f75869n = null;
        this.f75865j = null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: a */
    public long mo77915a(int i11, String str) {
        return this.f75859d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: b */
    public void mo77920b() {
        TPLogUtil.m78800i(f75856a, "reset start");
        m77941f();
        this.f75859d = 0L;
        this.f75860e = "";
        this.f75861f = "";
        if (!TextUtils.isEmpty(this.f75862g)) {
            try {
                new File(this.f75862g).deleteOnExit();
                this.f75862g = "";
            } catch (Exception e11) {
                TPLogUtil.m78797e(f75856a, "reset, delete cache file has exception:" + e11.toString());
            }
        }
        a aVar = this.f75869n;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public long m77924a(long j11, long j12) {
        if (j12 > 0) {
            return j12 - j11;
        }
        long j13 = this.f75859d;
        if (j13 <= 0) {
            return 536870912L;
        }
        return j13 - j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m77934b(int i11) {
        C35292d c35292dM77927a = m77927a(i11);
        if (c35292dM77927a != null) {
            c35292dM77927a.m77962b();
            TPLogUtil.m78800i(f75856a, "handleStopReadData, cancel the loading request with id ".concat(String.valueOf(i11)));
            m77935b(c35292dM77927a);
            this.f75858c.didCancelLoadingRequest(c35292dM77927a);
            return;
        }
        TPLogUtil.m78797e(f75856a, "TPAssetLoader can't find the request " + i11 + " with current loading requests");
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m77935b(C35292d c35292d) {
        ArrayList<C35292d> arrayList = this.f75865j;
        if (arrayList != null) {
            arrayList.remove(c35292d);
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized C35292d m77927a(int i11) {
        if (this.f75865j == null) {
            return null;
        }
        for (int i12 = 0; i12 < this.f75865j.size(); i12++) {
            C35292d c35292d = this.f75865j.get(i12);
            if (c35292d.getLoadingDataRequest().m77951a() == i11) {
                return c35292d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String m77928a(Context context, int i11) {
        if (TextUtils.isEmpty(this.f75862g)) {
            File externalCacheFile = TPDLFileSystem.getExternalCacheFile(context, "resourceLoader", new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + C33820nf.f71144W + i11 + this.f75863h);
            TPDLIOUtil.createFile(externalCacheFile);
            this.f75862g = externalCacheFile.getAbsolutePath();
        }
        return this.f75862g;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: a */
    public void mo77916a() {
        if (this.f75858c == null) {
            TPLogUtil.m78797e(f75856a, "listener not set");
            return;
        }
        TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest = new TPAssetResourceLoadingContentInformationRequest();
        this.f75866k = tPAssetResourceLoadingContentInformationRequest;
        this.f75858c.fillInContentInformation(tPAssetResourceLoadingContentInformationRequest);
        TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest2 = this.f75866k;
        this.f75860e = tPAssetResourceLoadingContentInformationRequest2.contentType;
        this.f75859d = tPAssetResourceLoadingContentInformationRequest2.dataTotalSize;
        this.f75861f = tPAssetResourceLoadingContentInformationRequest2.dataFilePath;
        TPLogUtil.m78800i(f75856a, "proxy start, mDataTotalSize: " + this.f75859d + " businessPath:" + this.f75861f);
    }

    /* JADX INFO: renamed from: a */
    private void m77929a(int i11, int i12, int i13, Object obj) {
        a aVar = this.f75869n;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = i11;
            messageObtainMessage.arg1 = i12;
            messageObtainMessage.arg2 = i13;
            messageObtainMessage.obj = obj;
            this.f75869n.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.p157a.InterfaceC35289a
    /* JADX INFO: renamed from: a */
    public void mo77917a(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener) {
        this.f75858c = iTPAssetResourceLoaderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m77932a(C35292d c35292d) {
        ArrayList<C35292d> arrayList = this.f75865j;
        if (arrayList != null) {
            arrayList.add(c35292d);
        }
    }
}
