package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33978va;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes60.dex */
public class Messages {

    /* JADX INFO: loaded from: classes23.dex */
    public interface SharedPreferencesApi {
        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable SharedPreferencesApi sharedPreferencesApi) {
            setUp(binaryMessenger, "", sharedPreferencesApi);
        }

        @NonNull
        Boolean clear(@NonNull String str, @Nullable List<String> list);

        @NonNull
        Map<String, Object> getAll(@NonNull String str, @Nullable List<String> list);

        @NonNull
        Boolean remove(@NonNull String str);

        @NonNull
        Boolean setBool(@NonNull String str, @NonNull Boolean bool);

        @NonNull
        Boolean setDeprecatedStringList(@NonNull String str, @NonNull List<String> list);

        @NonNull
        Boolean setDouble(@NonNull String str, @NonNull Double d11);

        @NonNull
        Boolean setEncodedStringList(@NonNull String str, @NonNull String str2);

        @NonNull
        Boolean setInt(@NonNull String str, @NonNull Long l11);

        @NonNull
        Boolean setString(@NonNull String str, @NonNull String str2);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87587a(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.clear((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87588b(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setEncodedStringList((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87589c(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87590d(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setDeprecatedStringList((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87591e(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setBool((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: f */
        static /* synthetic */ void m87592f(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.getAll((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: g */
        static /* synthetic */ void m87593g(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, sharedPreferencesApi.remove((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        static /* synthetic */ void m87594h(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setInt((String) arrayList2.get(0), (Long) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: i */
        static /* synthetic */ void m87595i(SharedPreferencesApi sharedPreferencesApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setString((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable final SharedPreferencesApi sharedPreferencesApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = C33978va.f72339h + str;
            }
            BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87593g(this.f86813a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87591e(this.f86814a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87595i(this.f86815a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87594h(this.f86816a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87589c(this.f86817a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87588b(this.f86818a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87590d(this.f86819a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87587a(this.f86820a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll" + str2, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (sharedPreferencesApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.SharedPreferencesApi.m87592f(this.f86821a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b11, @NonNull ByteBuffer byteBuffer) {
            return super.readValueOfType(b11, byteBuffer);
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th2) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }
}
