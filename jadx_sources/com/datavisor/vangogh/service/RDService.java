package com.datavisor.vangogh.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.datavisorobfus.C5457z0;
import com.datavisorobfus.InterfaceC5400a0;
import java.io.File;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes34.dex */
public class RDService extends Service {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5400a0.a f7218a = new BinderC5394a();

    /* JADX INFO: renamed from: com.datavisor.vangogh.service.RDService$a */
    public class BinderC5394a extends InterfaceC5400a0.a {
        @Override // com.datavisorobfus.InterfaceC5400a0
        /* JADX INFO: renamed from: a */
        public int mo7087a(String str, String str2) {
            int i11;
            try {
                if (!C5457z0.m7482b(str)) {
                    i11 = 0;
                    break;
                }
                JSONArray jSONArray = new JSONArray(str);
                int i12 = 0;
                while (true) {
                    if (i12 >= jSONArray.length()) {
                        i11 = 0;
                        break;
                    }
                    if (new File(jSONArray.getString(i12)).exists()) {
                        i11 = 1;
                        break;
                    }
                    i12++;
                }
            } catch (Throwable unused) {
            }
            try {
                if (!C5457z0.m7482b(str2)) {
                    return i11;
                }
                JSONArray jSONArray2 = new JSONArray(str2);
                for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                    if (new File(jSONArray2.getString(i13)).exists()) {
                        return i11 | 2;
                    }
                }
                return i11;
            } catch (Throwable unused2) {
                return i11;
            }
        }

        public BinderC5394a() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7218a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        return super.onStartCommand(intent, i11, i12);
    }
}
