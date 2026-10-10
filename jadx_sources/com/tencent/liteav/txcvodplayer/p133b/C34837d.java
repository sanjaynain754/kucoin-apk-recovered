package com.tencent.liteav.txcvodplayer.p133b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C34837d {

    /* JADX INFO: renamed from: c */
    protected InterfaceC34838e f73982c;

    /* JADX INFO: renamed from: d */
    protected C34839f f73983d;

    /* JADX INFO: renamed from: e */
    public boolean f73984e;

    /* JADX INFO: renamed from: h */
    private Thread f73987h;

    /* JADX INFO: renamed from: a */
    final String f73980a = new String(Base64.decode("aHR0cDovL3BsYXl2aWRlby5xY2xvdWQuY29tL2dldHBsYXlpbmZvL3Yy", 0));

    /* JADX INFO: renamed from: b */
    final String f73981b = new String(Base64.decode("aHR0cHM6Ly9wbGF5dmlkZW8ucWNsb3VkLmNvbS9nZXRwbGF5aW5mby92Mg==", 0));

    /* JADX INFO: renamed from: f */
    private final int f73985f = 0;

    /* JADX INFO: renamed from: g */
    private final int f73986g = 1;

    /* JADX INFO: renamed from: i */
    private Handler f73988i = new Handler(Looper.getMainLooper()) { // from class: com.tencent.liteav.txcvodplayer.b.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C34837d c34837d = C34837d.this;
            InterfaceC34838e interfaceC34838e = c34837d.f73982c;
            if (interfaceC34838e == null) {
                return;
            }
            int i11 = message.what;
            if (i11 == 0) {
                interfaceC34838e.mo75986a(c34837d);
            } else {
                if (i11 != 1) {
                    return;
                }
                interfaceC34838e.mo75987a(c34837d, (String) message.obj, message.arg1);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public final int m76391a(final int i11, final String str, final String str2, final String str3, final int i12, final String str4) {
        if (i11 == 0 || str == null) {
            return -1;
        }
        if ((str2 != null || i12 > 0) && str4 == null) {
            return -1;
        }
        Thread thread = new Thread("getPlayInfo") { // from class: com.tencent.liteav.txcvodplayer.b.d.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws Throwable {
                BufferedReader bufferedReader = null;
                try {
                    try {
                        try {
                            Looper.prepare();
                            C34837d c34837d = C34837d.this;
                            String str5 = c34837d.f73984e ? String.format(Locale.ROOT, "%s/%d/%s", c34837d.f73981b, Integer.valueOf(i11), str) : String.format(Locale.ROOT, "%s/%d/%s", c34837d.f73980a, Integer.valueOf(i11), str);
                            String str6 = str2;
                            String str7 = str3;
                            int i13 = i12;
                            String str8 = str4;
                            StringBuilder sb2 = new StringBuilder();
                            if (str6 != null) {
                                sb2.append("t=" + str6 + "&");
                            }
                            if (str7 != null) {
                                sb2.append("us=" + str7 + "&");
                            }
                            if (str8 != null) {
                                sb2.append("sign=" + str8 + "&");
                            }
                            if (i13 >= 0) {
                                sb2.append("exper=" + i13 + "&");
                            }
                            if (sb2.length() > 1) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            String string = sb2.toString();
                            if (string != null) {
                                str5 = str5 + "?" + string;
                            }
                            URL url = new URL(str5);
                            LiteavLog.m76079d("TXCVodPlayerNetApi", "getplayinfo: ".concat(String.valueOf(str5)));
                            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() == 200) {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        } else {
                                            sb3.append(line);
                                        }
                                    }
                                    C34837d.m76390a(C34837d.this, sb3.toString());
                                    bufferedReader = bufferedReader2;
                                } catch (JSONException unused) {
                                    bufferedReader = bufferedReader2;
                                    C34837d.this.m76394a("Incorrect format", -2);
                                    if (bufferedReader == null) {
                                        return;
                                    }
                                    bufferedReader.close();
                                    return;
                                } catch (Exception e11) {
                                    e = e11;
                                    bufferedReader = bufferedReader2;
                                    LiteavLog.m76079d("TXCVodPlayerNetApi", "http exception: " + e.getMessage());
                                    C34837d.this.m76394a("The request was exceptional", -2);
                                    if (bufferedReader == null) {
                                        return;
                                    }
                                    bufferedReader.close();
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                C34837d.this.m76394a("Request failed", -1);
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (JSONException unused3) {
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (IOException unused4) {
                }
            }
        };
        this.f73987h = thread;
        thread.start();
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m76394a(String str, int i11) {
        Message message = new Message();
        message.what = 1;
        message.arg1 = i11;
        message.obj = str;
        this.f73988i.sendMessage(message);
    }

    /* JADX INFO: renamed from: a */
    public final void m76393a(InterfaceC34838e interfaceC34838e) {
        this.f73982c = interfaceC34838e;
    }

    /* JADX INFO: renamed from: a */
    public final C34839f m76392a() {
        return this.f73983d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76390a(C34837d c34837d, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        int i11 = jSONObject.getInt("code");
        if (i11 != 0) {
            String string = jSONObject.getString("message");
            LiteavLog.m76083e("TXCVodPlayerNetApi", string);
            c34837d.m76394a(string, i11);
        } else {
            C34839f c34839f = new C34839f(jSONObject);
            c34837d.f73983d = c34839f;
            if (c34839f.m76399a() == null) {
                c34837d.m76394a("No playback address", -3);
            } else {
                c34837d.f73988i.sendEmptyMessage(0);
            }
        }
    }
}
