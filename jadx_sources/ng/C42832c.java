package ng;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ng.c */
/* JADX INFO: compiled from: SystemBootTimeSpace.java */
/* JADX INFO: loaded from: classes13.dex */
public class C42832c {

    /* JADX INFO: renamed from: ng.c$a */
    /* JADX INFO: compiled from: SystemBootTimeSpace.java */
    /* JADX INFO: loaded from: classes.dex */
    public interface a {
        @NonNull
        /* JADX INFO: renamed from: b */
        Long mo93923b();

        /* JADX INFO: renamed from: a */
        static void m93926a(BinaryMessenger binaryMessenger, final a aVar) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "flutter/system_boot_time", getCodec());
            if (aVar != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: ng.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        C42832c.a.m93927c(this.f94892a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m93927c(a aVar, Object obj, BasicMessageChannel.Reply reply) {
            HashMap map = new HashMap();
            try {
                map.put(DbParams.KEY_CHANNEL_RESULT, aVar.mo93923b());
            } catch (Error | RuntimeException e11) {
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, C42832c.m93925b(e11));
            }
            reply.reply(map);
        }

        static MessageCodec<Object> getCodec() {
            return b.f94893a;
        }
    }

    /* JADX INFO: renamed from: ng.c$b */
    /* JADX INFO: compiled from: SystemBootTimeSpace.java */
    /* JADX INFO: loaded from: classes.dex */
    public static class b extends StandardMessageCodec {

        /* JADX INFO: renamed from: a */
        public static final b f94893a = new b();
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, Object> m93925b(Throwable th2) {
        HashMap map = new HashMap();
        map.put("message", th2.toString());
        map.put("code", th2.getClass().getSimpleName());
        map.put("details", "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return map;
    }
}
