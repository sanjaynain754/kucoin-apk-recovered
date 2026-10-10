package com.kubi.utils.netdiagno;

import androidx.media3.common.PlaybackException;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes54.dex */
public class LDNetSocket {

    /* JADX INFO: renamed from: h */
    public static LDNetSocket f54362h;

    /* JADX INFO: renamed from: a */
    public InterfaceC27071a f54363a;

    /* JADX INFO: renamed from: c */
    public InetAddress[] f54365c;

    /* JADX INFO: renamed from: d */
    public List<String> f54366d;

    /* JADX INFO: renamed from: e */
    public boolean[] f54367e;

    /* JADX INFO: renamed from: b */
    public int f54364b = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;

    /* JADX INFO: renamed from: f */
    public final long[] f54368f = new long[4];

    /* JADX INFO: renamed from: g */
    public boolean f54369g = true;

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetSocket$a */
    public interface InterfaceC27071a {
        /* JADX INFO: renamed from: c */
        void mo66794c(String str);

        /* JADX INFO: renamed from: d */
        void mo66795d(String str);
    }

    /* JADX INFO: renamed from: c */
    public final void m66790c(InetSocketAddress inetSocketAddress, int i11, int i12) throws Throwable {
        Socket socket = null;
        try {
            try {
                try {
                    Socket socket2 = new Socket();
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        socket2.connect(inetSocketAddress, i11);
                        this.f54368f[i12] = System.currentTimeMillis() - jCurrentTimeMillis;
                        socket2.close();
                    } catch (SocketTimeoutException e11) {
                        e = e11;
                        socket = socket2;
                        this.f54368f[i12] = -1;
                        e.printStackTrace();
                        if (socket != null) {
                            socket.close();
                        }
                    } catch (IOException e12) {
                        e = e12;
                        socket = socket2;
                        this.f54368f[i12] = -2;
                        e.printStackTrace();
                        if (socket != null) {
                            socket.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        socket = socket2;
                        if (socket != null) {
                            try {
                                socket.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            } catch (SocketTimeoutException e15) {
                e = e15;
            } catch (IOException e16) {
                e = e16;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public native void startJNITelnet(String str, String str2);

    /* JADX INFO: renamed from: e */
    public static LDNetSocket m66787e() {
        if (f54362h == null) {
            f54362h = new LDNetSocket();
        }
        return f54362h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final boolean m66789b(InetAddress inetAddress, String str) throws Throwable {
        Object[] objArr;
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        if (inetAddress != null && str != null) {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 80);
            this.f54363a.mo66794c("Connect to host: " + str + "...\n");
            int i11 = 0;
            while (true) {
                if (i11 >= 4) {
                    objArr = 0;
                    break;
                }
                m66790c(inetSocketAddress, this.f54364b, i11);
                long j11 = this.f54368f[i11];
                if (j11 == -1) {
                    this.f54363a.mo66794c((i11 + 1) + "'s time=TimeOut,\n");
                    this.f54364b = this.f54364b + TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY;
                    if (i11 > 0 && this.f54368f[i11 - 1] == -1) {
                        objArr = -1;
                        break;
                    }
                    i11++;
                } else {
                    if (j11 == -2) {
                        this.f54363a.mo66794c((i11 + 1) + "'s time=IOException\n");
                        if (i11 > 0 && this.f54368f[i11 - 1] == -2) {
                            objArr = -2;
                            break;
                        }
                    } else {
                        this.f54363a.mo66794c((i11 + 1) + "'s time=" + this.f54368f[i11] + "ms,\n");
                    }
                    i11++;
                }
            }
            if (objArr != -1 && objArr != -2) {
                long j12 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < 4; i13++) {
                    long j13 = this.f54368f[i13];
                    if (j13 > 0) {
                        j12 += j13;
                        i12++;
                    }
                }
                if (i12 > 0) {
                    sb2.append("average=" + (j12 / ((long) i12)) + "ms");
                }
                z11 = true;
            }
        }
        this.f54363a.mo66794c(sb2.toString());
        return z11;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m66791d(String str) {
        InetAddress[] inetAddressArr = this.f54365c;
        if (inetAddressArr == null || this.f54366d == null) {
            this.f54363a.mo66795d("DNS解析失败,主机地址不可达");
        } else {
            int length = inetAddressArr.length;
            this.f54367e = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                if (i11 != 0) {
                    this.f54363a.mo66794c(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                this.f54367e[i11] = m66789b(this.f54365c[i11], this.f54366d.get(i11));
            }
            for (boolean z11 : this.f54367e) {
                if (z11) {
                    this.f54363a.mo66795d(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    return true;
                }
            }
        }
        this.f54363a.mo66795d(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m66792f(InterfaceC27071a interfaceC27071a) {
        this.f54363a = interfaceC27071a;
    }

    /* JADX INFO: renamed from: g */
    public void m66793g() {
        if (f54362h != null) {
            f54362h = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m66788a(String str) {
        return m66791d(str);
    }
}
