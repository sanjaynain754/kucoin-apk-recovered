package com.tencent.thumbplayer.tcmedia.p156c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.tplayer.C35383a;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.d */
/* JADX INFO: loaded from: classes62.dex */
public class C35295d implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    private C35296e f75894a;

    /* JADX INFO: renamed from: b */
    private C35383a f75895b;

    /* JADX INFO: renamed from: c */
    private ITPPlayListener f75896c;

    /* JADX INFO: renamed from: d */
    private a f75897d = new a();

    /* JADX INFO: renamed from: e */
    private Object f75898e;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.d$a */
    public class a implements ITPPlayListener {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j11) {
            return C35295d.this.f75896c.getPlayInfo(j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            return C35295d.this.f75896c.getAdvRemainTime();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i11, String str) {
            return C35295d.this.f75896c.getContentType(i11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            return C35295d.this.f75896c.getCurrentPlayClipNo();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long[] getCurrentPlayOffset() {
            return C35295d.this.f75896c.getCurrentPlayOffset();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return C35295d.this.f75896c.getCurrentPosition();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i11, String str) {
            return C35295d.this.f75896c.getDataFilePath(i11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i11, String str) {
            return C35295d.this.f75896c.getDataTotalSize(i11, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
            return C35295d.this.f75896c.getPlayInfo(str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            return C35295d.this.f75896c.getPlayerBufferLength();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            C35295d.this.f75896c.onDownloadCdnUrlExpired(map);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            C35349b.d dVar = new C35349b.d();
            dVar.m78082a(str2);
            dVar.m78083b(str3);
            C35295d.this.f75895b.m78353b().m78134a(dVar);
            C35295d.this.f75896c.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
            C35295d.this.f75896c.onDownloadCdnUrlUpdate(str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i11, int i12, String str) {
            C35295d.this.f75896c.onDownloadError(i11, i12, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            C35295d.this.f75896c.onDownloadFinish();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str) {
            C35349b.e eVar = new C35349b.e();
            eVar.m78086b(i12 * 8);
            C35295d.this.f75895b.m78353b().m78134a(eVar);
            C35295d.this.f75896c.onDownloadProgressUpdate(i11, i12, j11, j12, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
            C35349b.f fVar = new C35349b.f();
            fVar.m78089b(str);
            fVar.m78088a(str2);
            C35295d.this.f75895b.m78353b().m78134a(fVar);
            C35295d.this.f75896c.onDownloadProtocolUpdate(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i11) {
            C35295d.this.f75896c.onDownloadStatusUpdate(i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
            return C35295d.this.f75896c.onPlayCallback(i11, obj, obj2, obj3, obj4);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i11, String str, long j11, long j12) {
            return C35295d.this.f75896c.onReadData(i11, str, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i11, String str, long j11, long j12) {
            return C35295d.this.f75896c.onStartReadData(i11, str, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i11, String str, int i12) {
            return C35295d.this.f75896c.onStopReadData(i11, str, i12);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m77971b(Method method, Object[] objArr) {
        if (method.getName().equals("setPlayListener")) {
            this.f75896c = (ITPPlayListener) objArr[0];
            objArr[0] = this.f75897d;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized Object m77972a() {
        try {
            if (this.f75898e == null) {
                this.f75898e = Proxy.newProxyInstance(this.f75894a.getClass().getClassLoader(), this.f75894a.getClass().getInterfaces(), this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f75898e;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        StringBuilder sb2;
        String string;
        m77971b(method, objArr);
        try {
            Object objInvoke = method.invoke(this.f75894a, objArr);
            m77968a(method, objArr);
            return objInvoke;
        } catch (InvocationTargetException e11) {
            if (e11.getTargetException() != null) {
                throw e11.getTargetException();
            }
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = e11.toString();
            sb2.append(string);
            TPLogUtil.m78797e("TPDataTransportManagerProxy", sb2.toString());
            return m77967a(method);
        } catch (Throwable th2) {
            sb2 = new StringBuilder("invokeMethod ");
            sb2.append(method.getName());
            sb2.append(" has excecption: ");
            string = th2.toString();
            sb2.append(string);
            TPLogUtil.m78797e("TPDataTransportManagerProxy", sb2.toString());
            return m77967a(method);
        }
    }

    public C35295d(C35296e c35296e, C35383a c35383a) {
        this.f75894a = c35296e;
        this.f75895b = c35383a;
    }

    /* JADX INFO: renamed from: a */
    private static Object m77967a(Method method) {
        String name = method.getReturnType().getName();
        if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m77968a(Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        if (name.equals("startDownloadPlayByAsset") || name.equals("startDownloadPlay")) {
            m77969a(objArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m77969a(Object[] objArr) {
        this.f75895b.m78353b().m78134a(new C35349b.g());
    }
}
