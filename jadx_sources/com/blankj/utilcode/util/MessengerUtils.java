package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public class MessengerUtils {

    /* JADX INFO: renamed from: a */
    public static ConcurrentHashMap<String, InterfaceC5237a> f6373a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public static Map<String, Object> f6374b = new HashMap();

    public static class ServerService extends Service {

        /* JADX INFO: renamed from: b */
        public final ConcurrentHashMap<Integer, Messenger> f6375b = new ConcurrentHashMap<>();

        /* JADX INFO: renamed from: c */
        @SuppressLint({"HandlerLeak"})
        public final Handler f6376c;

        /* JADX INFO: renamed from: d */
        public final Messenger f6377d;

        /* JADX INFO: renamed from: com.blankj.utilcode.util.MessengerUtils$ServerService$a */
        public class HandlerC5236a extends Handler {
            public HandlerC5236a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i11 = message.what;
                if (i11 == 0) {
                    ServerService.this.f6375b.put(Integer.valueOf(message.arg1), message.replyTo);
                    return;
                }
                if (i11 == 1) {
                    ServerService.this.f6375b.remove(Integer.valueOf(message.arg1));
                } else if (i11 != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.m6051e(message);
                    ServerService.this.m6050d(message);
                }
            }
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i11, int i12) {
            Bundle extras;
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message messageObtain = Message.obtain(this.f6376c, 2);
                messageObtain.replyTo = this.f6377d;
                messageObtain.setData(extras);
                m6051e(messageObtain);
                m6050d(messageObtain);
            }
            return 2;
        }

        /* JADX INFO: renamed from: e */
        public final void m6051e(Message message) {
            for (Messenger messenger : this.f6375b.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(message);
                    } catch (RemoteException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }

        @Override // android.app.Service
        @Nullable
        public IBinder onBind(Intent intent) {
            return this.f6377d.getBinder();
        }

        public ServerService() {
            HandlerC5236a handlerC5236a = new HandlerC5236a();
            this.f6376c = handlerC5236a;
            this.f6377d = new Messenger(handlerC5236a);
        }

        /* JADX INFO: renamed from: d */
        public final void m6050d(Message message) {
            String string;
            InterfaceC5237a interfaceC5237a;
            Bundle data = message.getData();
            if (data != null && (string = data.getString("MESSENGER_UTILS")) != null && (interfaceC5237a = (InterfaceC5237a) MessengerUtils.f6373a.get(string)) != null) {
                interfaceC5237a.m6052a(data);
            }
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.MessengerUtils$a */
    public interface InterfaceC5237a {
        /* JADX INFO: renamed from: a */
        void m6052a(Bundle bundle);
    }
}
