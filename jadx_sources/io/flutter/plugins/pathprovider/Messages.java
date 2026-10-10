package io.flutter.plugins.pathprovider;

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

/* JADX INFO: loaded from: classes60.dex */
public class Messages {

    /* JADX INFO: loaded from: classes23.dex */
    public interface PathProviderApi {
        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable PathProviderApi pathProviderApi) {
            setUp(binaryMessenger, "", pathProviderApi);
        }

        @Nullable
        String getApplicationCachePath();

        @Nullable
        String getApplicationDocumentsPath();

        @Nullable
        String getApplicationSupportPath();

        @NonNull
        List<String> getExternalCachePaths();

        @Nullable
        String getExternalStoragePath();

        @NonNull
        List<String> getExternalStoragePaths(@NonNull StorageDirectory storageDirectory);

        @Nullable
        String getTemporaryPath();

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87580a(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getExternalStoragePaths((StorageDirectory) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87581b(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getTemporaryPath());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87582c(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getApplicationDocumentsPath());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87583d(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getApplicationCachePath());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87584e(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getApplicationSupportPath());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: f */
        static /* synthetic */ void m87585f(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getExternalCachePaths());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: g */
        static /* synthetic */ void m87586g(PathProviderApi pathProviderApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getExternalStoragePath());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable final PathProviderApi pathProviderApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = C33978va.f72339h + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath" + str2, getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.PathProviderApi.m87581b(this.f86806a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath" + str2, getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.PathProviderApi.m87584e(this.f86807a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath" + str2, getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.PathProviderApi.m87582c(this.f86808a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath" + str2, getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.PathProviderApi.m87583d(this.f86809a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath" + str2, getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.PathProviderApi.m87586g(this.f86810a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths" + str2, getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.PathProviderApi.m87585f(this.f86811a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths" + str2, getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.PathProviderApi.m87580a(this.f86812a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b11, @NonNull ByteBuffer byteBuffer) {
            if (b11 != -127) {
                return super.readValueOfType(b11, byteBuffer);
            }
            Object value = readValue(byteBuffer);
            if (value == null) {
                return null;
            }
            return StorageDirectory.values()[((Long) value).intValue()];
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof StorageDirectory)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((StorageDirectory) obj).index));
            }
        }

        private PigeonCodec() {
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
    public enum StorageDirectory {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);

        final int index;

        StorageDirectory(int i11) {
            this.index = i11;
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
