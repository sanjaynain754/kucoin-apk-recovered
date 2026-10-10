package com.tencent.thumbplayer.tcmedia.p156c.p157a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest;
import com.tencent.thumbplayer.tcmedia.utils.C35433m;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35291c implements ITPAssetResourceLoadingDataRequest {

    /* JADX INFO: renamed from: a */
    private static String f75874a = "TPAssetResourceLoadingDataRequest";

    /* JADX INFO: renamed from: b */
    private long f75875b;

    /* JADX INFO: renamed from: c */
    private long f75876c;

    /* JADX INFO: renamed from: d */
    private boolean f75877d;

    /* JADX INFO: renamed from: e */
    private long f75878e;

    /* JADX INFO: renamed from: f */
    private long f75879f;

    /* JADX INFO: renamed from: g */
    private long f75880g;

    /* JADX INFO: renamed from: h */
    private int f75881h;

    /* JADX INFO: renamed from: i */
    private b f75882i;

    /* JADX INFO: renamed from: j */
    private C35433m f75883j = new C35433m();

    /* JADX INFO: renamed from: k */
    private String f75884k;

    /* JADX INFO: renamed from: l */
    private RandomAccessFile f75885l;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        long f75886a;

        /* JADX INFO: renamed from: b */
        byte[] f75887b;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.c$b */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 256) {
                return;
            }
            a aVar = (a) message.obj;
            long j11 = aVar.f75886a;
            byte[] bArr = aVar.f75887b;
            int i11 = message.arg1;
            C35291c c35291c = C35291c.this;
            if (!c35291c.m77947a(j11, bArr, c35291c.f75884k)) {
                TPLogUtil.m78797e(C35291c.f75874a, "write data failed");
                return;
            }
            C35291c.this.f75883j.writeLock().lock();
            C35291c.this.f75878e = ((long) i11) + j11;
            C35291c.this.f75883j.writeLock().unlock();
            TPLogUtil.m78800i(C35291c.f75874a, "write data from " + j11 + " , with dataLength" + i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m77951a() {
        return this.f75881h;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void notifyDataReady(long j11, long j12) {
        long j13 = j12 + j11;
        long j14 = this.f75875b;
        if (j13 > this.f75876c + j14) {
            TPLogUtil.m78797e(f75874a, "data exceed the max request offset");
            return;
        }
        if (j11 < j14) {
            TPLogUtil.m78802w(f75874a, "the notify data offset is less than request offset");
        }
        if (j13 < this.f75879f) {
            TPLogUtil.m78797e(f75874a, "data not reach current offset");
            return;
        }
        this.f75883j.writeLock().lock();
        this.f75879f = j13;
        this.f75878e = j13;
        this.f75883j.writeLock().unlock();
    }

    /* JADX INFO: renamed from: a */
    public int m77952a(long j11) {
        this.f75883j.readLock().lock();
        long j12 = this.f75878e;
        this.f75883j.readLock().unlock();
        if (j11 >= j12) {
            return -1;
        }
        if (j11 >= this.f75875b) {
            return (int) (j12 - j11);
        }
        TPLogUtil.m78797e(f75874a, "Offset less than mRequestedOffset");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m77956b() {
        b bVar = this.f75882i;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
            this.f75882i = null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getCurrentOffset() {
        this.f75883j.readLock().lock();
        long j11 = this.f75879f;
        this.f75883j.readLock().unlock();
        return j11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedLength() {
        return this.f75876c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public long getRequestedOffset() {
        return this.f75875b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingDataRequest
    public void respondWithData(byte[] bArr) {
        if (this.f75880g > this.f75876c) {
            TPLogUtil.m78800i(f75874a, "respond full data");
            return;
        }
        int length = bArr.length;
        a aVar = new a();
        aVar.f75886a = this.f75879f;
        aVar.f75887b = bArr;
        m77946a(256, length, 0, aVar);
        TPLogUtil.m78800i(f75874a, "respond data from:" + this.f75879f + ", dataLength:" + length);
        this.f75883j.writeLock().lock();
        long j11 = (long) length;
        this.f75879f = this.f75879f + j11;
        this.f75880g = this.f75880g + j11;
        this.f75883j.writeLock().unlock();
    }

    public C35291c(long j11, long j12, boolean z11) {
        this.f75875b = j11;
        this.f75879f = j11;
        this.f75878e = j11;
        this.f75876c = j12;
        this.f75877d = z11;
    }

    /* JADX INFO: renamed from: a */
    public void m77953a(int i11) {
        this.f75881h = i11;
    }

    /* JADX INFO: renamed from: a */
    private void m77946a(int i11, int i12, int i13, Object obj) {
        b bVar = this.f75882i;
        if (bVar != null) {
            Message messageObtainMessage = bVar.obtainMessage();
            messageObtainMessage.what = i11;
            messageObtainMessage.arg1 = i12;
            messageObtainMessage.arg2 = i13;
            messageObtainMessage.obj = obj;
            this.f75882i.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77954a(Looper looper) {
        this.f75882i = new b(looper);
    }

    /* JADX INFO: renamed from: a */
    public void m77955a(String str) {
        this.f75884k = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x002f A[EXC_TOP_SPLITTER, PHI: r4
      0x002f: PHI (r4v3 java.io.RandomAccessFile) = (r4v2 java.io.RandomAccessFile), (r4v7 java.io.RandomAccessFile) binds: [B:20:0x0042, B:14:0x002d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public boolean m77947a(long j11, byte[] bArr, String str) {
        RandomAccessFile randomAccessFile;
        try {
            try {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rw");
                    this.f75885l = randomAccessFile2;
                    randomAccessFile2.seek(j11);
                    this.f75885l.write(bArr);
                    RandomAccessFile randomAccessFile3 = this.f75885l;
                    if (randomAccessFile3 != null) {
                        try {
                            randomAccessFile3.close();
                        } catch (IOException unused) {
                            TPLogUtil.m78797e(f75874a, "fail to close mRandomAccessFile");
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    RandomAccessFile randomAccessFile4 = this.f75885l;
                    if (randomAccessFile4 != null) {
                        try {
                            randomAccessFile4.close();
                        } catch (IOException unused2) {
                            TPLogUtil.m78797e(f75874a, "fail to close mRandomAccessFile");
                        }
                    }
                    throw th2;
                }
            } catch (IOException unused3) {
                TPLogUtil.m78797e(f75874a, "fail to write data");
                randomAccessFile = this.f75885l;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                        TPLogUtil.m78797e(f75874a, "fail to close mRandomAccessFile");
                    }
                }
                return false;
            }
        } catch (FileNotFoundException unused5) {
            TPLogUtil.m78797e(f75874a, "file not found");
            randomAccessFile = this.f75885l;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return false;
        }
    }
}
