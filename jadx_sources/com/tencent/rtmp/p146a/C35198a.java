package com.tencent.rtmp.p146a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.TXImageSprite;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.rtmp.a.a */
/* JADX INFO: loaded from: classes56.dex */
public final class C35198a extends TXImageSprite {

    /* JADX INFO: renamed from: a */
    private final BitmapFactory.Options f75358a;

    /* JADX INFO: renamed from: b */
    private HandlerThread f75359b;

    /* JADX INFO: renamed from: c */
    private Handler f75360c;

    /* JADX INFO: renamed from: d */
    private List<c> f75361d;

    /* JADX INFO: renamed from: e */
    private Map<String, BitmapRegionDecoder> f75362e;

    /* JADX INFO: renamed from: com.tencent.rtmp.a.a$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C35198a> f75364a;

        /* JADX INFO: renamed from: b */
        private String f75365b;

        /* JADX INFO: renamed from: a */
        private static float m77246a(String str) {
            String str2;
            String str3;
            String[] strArrSplit = str.split(C33844oi.f71346o);
            if (strArrSplit.length == 3) {
                String str4 = strArrSplit[0];
                str3 = strArrSplit[1];
                str2 = strArrSplit[2];
            } else if (strArrSplit.length == 2) {
                str3 = strArrSplit[0];
                str2 = strArrSplit[1];
            } else if (strArrSplit.length == 1) {
                str2 = strArrSplit[0];
                str3 = null;
            } else {
                str2 = null;
                str3 = null;
            }
            float fFloatValue = str3 != null ? 0.0f + (Float.valueOf(str3).floatValue() * 60.0f) : 0.0f;
            return str2 != null ? fFloatValue + Float.valueOf(str2).floatValue() : fFloatValue;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            String line;
            int i11;
            C35198a c35198a = this.f75364a.get();
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        InputStream inputStreamM77241a = C35198a.m77241a(this.f75365b);
                        if (inputStreamM77241a == null) {
                            return;
                        }
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamM77241a));
                        try {
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null || line2.length() == 0 || !line2.contains("WEBVTT")) {
                                LiteavLog.m76083e("TXImageSprite", "DownloadAndParseVTTFileTask : getVTT File Error!");
                                if (c35198a != null) {
                                    c35198a.m77243a();
                                }
                            } else {
                                do {
                                    line = bufferedReader2.readLine();
                                    if (line != null && line.contains("-->")) {
                                        String[] strArrSplit = line.split(" --> ");
                                        if (strArrSplit.length == 2) {
                                            String line3 = bufferedReader2.readLine();
                                            c cVar = new c((byte) 0);
                                            cVar.f75369a = m77246a(strArrSplit[0]);
                                            cVar.f75370b = m77246a(strArrSplit[1]);
                                            cVar.f75371c = line3;
                                            int iIndexOf = line3.indexOf(RunnableC33958ua.f72251f);
                                            if (iIndexOf != -1) {
                                                cVar.f75372d = line3.substring(0, iIndexOf);
                                            }
                                            int iIndexOf2 = line3.indexOf("=");
                                            if (iIndexOf2 != -1 && (i11 = iIndexOf2 + 1) < line3.length()) {
                                                String[] strArrSplit2 = line3.substring(i11, line3.length()).split(",");
                                                if (strArrSplit2.length == 4) {
                                                    cVar.f75373e = Integer.valueOf(strArrSplit2[0]).intValue();
                                                    cVar.f75374f = Integer.valueOf(strArrSplit2[1]).intValue();
                                                    cVar.f75375g = Integer.valueOf(strArrSplit2[2]).intValue();
                                                    cVar.f75376h = Integer.valueOf(strArrSplit2[3]).intValue();
                                                }
                                            }
                                            if (c35198a != null && c35198a.f75361d != null) {
                                                c35198a.f75361d.add(cVar);
                                            }
                                        }
                                    }
                                } while (line != null);
                            }
                            bufferedReader2.close();
                            return;
                        } catch (IOException e11) {
                            e = e11;
                            bufferedReader = bufferedReader2;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                LiteavLog.m76084e("TXImageSprite", "load image sprite failed.", e);
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException unused2) {
            }
        }

        public a(C35198a c35198a, String str) {
            this.f75364a = new WeakReference<>(c35198a);
            this.f75365b = str;
        }
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.a.a$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C35198a> f75366a;

        /* JADX INFO: renamed from: b */
        private String f75367b;

        /* JADX INFO: renamed from: c */
        private String f75368c;

        @Override // java.lang.Runnable
        public final void run() {
            C35198a c35198a = this.f75366a.get();
            if (this.f75366a == null || c35198a == null) {
                return;
            }
            InputStream inputStreamM77241a = null;
            try {
                try {
                    try {
                        inputStreamM77241a = C35198a.m77241a(this.f75368c);
                        String lastPathSegment = Uri.parse(this.f75368c).getLastPathSegment();
                        if (c35198a.f75362e != null) {
                            c35198a.f75362e.put(lastPathSegment, BitmapRegionDecoder.newInstance(inputStreamM77241a, true));
                        }
                        if (inputStreamM77241a != null) {
                            inputStreamM77241a.close();
                        }
                    } catch (IOException e11) {
                        LiteavLog.m76084e("TXImageSprite", "load bitmap from network failed.", e11);
                        if (inputStreamM77241a != null) {
                            inputStreamM77241a.close();
                        }
                    }
                } catch (Throwable th2) {
                    if (inputStreamM77241a != null) {
                        try {
                            inputStreamM77241a.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException unused2) {
            }
        }

        public b(C35198a c35198a, String str, String str2) {
            this.f75366a = new WeakReference<>(c35198a);
            this.f75367b = str;
            this.f75368c = str2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.rtmp.a.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public float f75369a;

        /* JADX INFO: renamed from: b */
        public float f75370b;

        /* JADX INFO: renamed from: c */
        public String f75371c;

        /* JADX INFO: renamed from: d */
        public String f75372d;

        /* JADX INFO: renamed from: e */
        public int f75373e;

        /* JADX INFO: renamed from: f */
        public int f75374f;

        /* JADX INFO: renamed from: g */
        public int f75375g;

        /* JADX INFO: renamed from: h */
        public int f75376h;

        private c() {
        }

        public /* synthetic */ c(byte b11) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77243a() {
        if (this.f75360c != null) {
            LiteavLog.m76087i("TXImageSprite", " remove all tasks!");
            this.f75360c.removeCallbacksAndMessages(null);
            this.f75360c.post(new Runnable() { // from class: com.tencent.rtmp.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C35198a.this.f75361d != null) {
                        C35198a.this.f75361d.clear();
                    }
                    if (C35198a.this.f75362e != null) {
                        for (BitmapRegionDecoder bitmapRegionDecoder : C35198a.this.f75362e.values()) {
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                        }
                        C35198a.this.f75362e.clear();
                    }
                }
            });
        }
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final Bitmap getThumbnail(float f11) {
        c cVar;
        if (this.f75361d.size() == 0) {
            return null;
        }
        int size = this.f75361d.size() - 1;
        int i11 = 0;
        while (true) {
            int i12 = ((size - i11) / 2) + i11;
            if (this.f75361d.get(i12).f75369a <= f11 && this.f75361d.get(i12).f75370b > f11) {
                cVar = this.f75361d.get(i12);
                break;
            }
            if (i11 < size) {
                if (f11 < this.f75361d.get(i12).f75370b) {
                    if (f11 >= this.f75361d.get(i12).f75369a) {
                        cVar = null;
                        break;
                    }
                    size = i12 - 1;
                } else {
                    i11 = i12 + 1;
                }
            } else {
                cVar = this.f75361d.get(i11);
                break;
            }
        }
        if (cVar == null) {
            return null;
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.f75362e.get(cVar.f75372d);
        if (bitmapRegionDecoder == null) {
            return null;
        }
        Rect rect = new Rect();
        int i13 = cVar.f75373e;
        rect.left = i13;
        int i14 = cVar.f75374f;
        rect.top = i14;
        rect.right = i13 + cVar.f75375g;
        rect.bottom = i14 + cVar.f75376h;
        return bitmapRegionDecoder.decodeRegion(rect, this.f75358a);
    }

    public C35198a(Context context) {
        super(context);
        this.f75358a = new BitmapFactory.Options();
        ArrayList arrayList = new ArrayList();
        this.f75361d = arrayList;
        this.f75361d = Collections.synchronizedList(arrayList);
        HashMap map = new HashMap();
        this.f75362e = map;
        this.f75362e = Collections.synchronizedMap(map);
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final void release() {
        m77243a();
        if (this.f75359b != null && this.f75360c != null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                this.f75359b.quitSafely();
            } else {
                this.f75359b.quit();
            }
            this.f75360c = null;
            this.f75359b = null;
        }
    }

    @Override // com.tencent.rtmp.TXImageSprite
    public final void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e("TXImageSprite", "setVTTUrlAndImageUrls: vttUrl can't be null!");
            return;
        }
        m77243a();
        if (this.f75359b == null) {
            HandlerThread handlerThread = new HandlerThread("SuperVodThumbnailsWorkThread");
            this.f75359b = handlerThread;
            handlerThread.start();
            this.f75360c = new Handler(this.f75359b.getLooper());
        }
        this.f75360c.post(new a(this, str));
        if (list != null && list.size() != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f75360c.post(new b(this, str, it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InputStream m77241a(String str) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        uRLConnection.connect();
        uRLConnection.getInputStream();
        uRLConnection.setConnectTimeout(15000);
        uRLConnection.setReadTimeout(15000);
        return uRLConnection.getInputStream();
    }
}
