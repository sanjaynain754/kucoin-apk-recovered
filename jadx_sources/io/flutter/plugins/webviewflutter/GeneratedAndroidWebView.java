package io.flutter.plugins.webviewflutter;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes60.dex */
public class GeneratedAndroidWebView {

    public static final class ConsoleMessage {

        @NonNull
        private ConsoleMessageLevel level;

        @NonNull
        private Long lineNumber;

        @NonNull
        private String message;

        @NonNull
        private String sourceId;

        public static final class Builder {

            @Nullable
            private ConsoleMessageLevel level;

            @Nullable
            private Long lineNumber;

            @Nullable
            private String message;

            @Nullable
            private String sourceId;

            @NonNull
            public ConsoleMessage build() {
                ConsoleMessage consoleMessage = new ConsoleMessage();
                consoleMessage.setLineNumber(this.lineNumber);
                consoleMessage.setMessage(this.message);
                consoleMessage.setLevel(this.level);
                consoleMessage.setSourceId(this.sourceId);
                return consoleMessage;
            }

            @NonNull
            public Builder setLevel(@NonNull ConsoleMessageLevel consoleMessageLevel) {
                this.level = consoleMessageLevel;
                return this;
            }

            @NonNull
            public Builder setLineNumber(@NonNull Long l11) {
                this.lineNumber = l11;
                return this;
            }

            @NonNull
            public Builder setMessage(@NonNull String str) {
                this.message = str;
                return this;
            }

            @NonNull
            public Builder setSourceId(@NonNull String str) {
                this.sourceId = str;
                return this;
            }
        }

        @NonNull
        public static ConsoleMessage fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            ConsoleMessage consoleMessage = new ConsoleMessage();
            Object obj = arrayList.get(0);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            consoleMessage.setLineNumber(lValueOf);
            consoleMessage.setMessage((String) arrayList.get(1));
            consoleMessage.setLevel(ConsoleMessageLevel.values()[((Integer) arrayList.get(2)).intValue()]);
            consoleMessage.setSourceId((String) arrayList.get(3));
            return consoleMessage;
        }

        @NonNull
        public ConsoleMessageLevel getLevel() {
            return this.level;
        }

        @NonNull
        public Long getLineNumber() {
            return this.lineNumber;
        }

        @NonNull
        public String getMessage() {
            return this.message;
        }

        @NonNull
        public String getSourceId() {
            return this.sourceId;
        }

        public void setLevel(@NonNull ConsoleMessageLevel consoleMessageLevel) {
            if (consoleMessageLevel == null) {
                throw new IllegalStateException("Nonnull field \"level\" is null.");
            }
            this.level = consoleMessageLevel;
        }

        public void setLineNumber(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"lineNumber\" is null.");
            }
            this.lineNumber = l11;
        }

        public void setMessage(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"message\" is null.");
            }
            this.message = str;
        }

        public void setSourceId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"sourceId\" is null.");
            }
            this.sourceId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.lineNumber);
            arrayList.add(this.message);
            ConsoleMessageLevel consoleMessageLevel = this.level;
            arrayList.add(consoleMessageLevel == null ? null : Integer.valueOf(consoleMessageLevel.index));
            arrayList.add(this.sourceId);
            return arrayList;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface CookieManagerHostApi {
        void attachInstance(@NonNull Long l11);

        void removeAllCookies(@NonNull Long l11, @NonNull Result<Boolean> result);

        void setAcceptThirdPartyCookies(@NonNull Long l11, @NonNull Long l12, @NonNull Boolean bool);

        void setCookie(@NonNull Long l11, @NonNull String str, @NonNull String str2);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87636a(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            cookieManagerHostApi.attachInstance(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87637b(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            Boolean bool = (Boolean) arrayList2.get(2);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            cookieManagerHostApi.setAcceptThirdPartyCookies(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()), bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87638c(CookieManagerHostApi cookieManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            cookieManagerHostApi.setCookie(lValueOf, str, str2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87639d(CookieManagerHostApi cookieManagerHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            Number number = (Number) ((ArrayList) obj).get(0);
            cookieManagerHostApi.removeAllCookies(number == null ? null : Long.valueOf(number.longValue()), new Result<Boolean>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.1
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void success(Boolean bool) {
                    arrayList.add(0, bool);
                    reply.reply(arrayList);
                }

                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void error(Throwable th2) {
                    reply.reply(GeneratedAndroidWebView.wrapError(th2));
                }
            });
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final CookieManagerHostApi cookieManagerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.attachInstance", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.m87636a(this.f86886a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setCookie", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.m87638c(this.f86890a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.removeAllCookies", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.m87639d(this.f86894a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setAcceptThirdPartyCookies", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CookieManagerHostApi.m87637b(this.f86898a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
        }
    }

    public static class CustomViewCallbackFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.h
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public CustomViewCallbackFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface CustomViewCallbackHostApi {
        void onCustomViewHidden(@NonNull Long l11);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87641a(CustomViewCallbackHostApi customViewCallbackHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            customViewCallbackHostApi.onCustomViewHidden(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final CustomViewCallbackHostApi customViewCallbackHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackHostApi.onCustomViewHidden", getCodec());
            if (customViewCallbackHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.CustomViewCallbackHostApi.m87641a(this.f86906a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class DownloadListenerFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        /* JADX INFO: loaded from: classes60.dex */
        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void onDownloadStart(@NonNull Long l11, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull Long l12, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerFlutterApi.onDownloadStart", getCodec()).send(new ArrayList(Arrays.asList(l11, str, str2, str3, str4, l12)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.j
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public DownloadListenerFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface DownloadListenerHostApi {
        void create(@NonNull Long l11);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87643a(DownloadListenerHostApi downloadListenerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            downloadListenerHostApi.create(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final DownloadListenerHostApi downloadListenerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerHostApi.create", getCodec());
            if (downloadListenerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.DownloadListenerHostApi.m87643a(this.f86914a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    public static class FileChooserParamsFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(@NonNull Long l11, @NonNull Boolean bool, @NonNull List<String> list, @NonNull FileChooserMode fileChooserMode, @Nullable String str, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FileChooserParamsFlutterApi.create", getCodec()).send(new ArrayList(Arrays.asList(l11, bool, list, Integer.valueOf(fileChooserMode.index), str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.l
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public FileChooserParamsFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface FlutterAssetManagerHostApi {
        @NonNull
        String getAssetFilePathByName(@NonNull String str);

        @NonNull
        List<String> list(@NonNull String str);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87645a(FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.list((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87646b(FlutterAssetManagerHostApi flutterAssetManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.getAssetFilePathByName((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.list", getCodec());
            if (flutterAssetManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.FlutterAssetManagerHostApi.m87645a(this.f86923a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.getAssetFilePathByName", getCodec());
            if (flutterAssetManagerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.FlutterAssetManagerHostApi.m87646b(this.f86927a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    public static class GeolocationPermissionsCallbackFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.o
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public GeolocationPermissionsCallbackFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface GeolocationPermissionsCallbackHostApi {
        void invoke(@NonNull Long l11, @NonNull String str, @NonNull Boolean bool, @NonNull Boolean bool2);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87648a(GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Boolean bool = (Boolean) arrayList2.get(2);
            Boolean bool2 = (Boolean) arrayList2.get(3);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            geolocationPermissionsCallbackHostApi.invoke(lValueOf, str, bool, bool2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackHostApi.invoke", getCodec());
            if (geolocationPermissionsCallbackHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi.m87648a(this.f86936a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    public static class HttpAuthHandlerFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.q
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public HttpAuthHandlerFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface HttpAuthHandlerHostApi {
        void cancel(@NonNull Long l11);

        void proceed(@NonNull Long l11, @NonNull String str, @NonNull String str2);

        @NonNull
        Boolean useHttpAuthUsernamePassword(@NonNull Long l11);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87650a(HttpAuthHandlerHostApi httpAuthHandlerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            httpAuthHandlerHostApi.cancel(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87651b(HttpAuthHandlerHostApi httpAuthHandlerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, httpAuthHandlerHostApi.useHttpAuthUsernamePassword(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87652c(HttpAuthHandlerHostApi httpAuthHandlerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            httpAuthHandlerHostApi.proceed(lValueOf, str, str2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final HttpAuthHandlerHostApi httpAuthHandlerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.useHttpAuthUsernamePassword", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.HttpAuthHandlerHostApi.m87651b(this.f86950a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.cancel", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.t
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.HttpAuthHandlerHostApi.m87650a(this.f86954a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.proceed", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.HttpAuthHandlerHostApi.m87652c(this.f86958a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface InstanceManagerHostApi {
        void clear();

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87653a(InstanceManagerHostApi instanceManagerHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                instanceManagerHostApi.clear();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final InstanceManagerHostApi instanceManagerHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.InstanceManagerHostApi.clear", getCodec());
            if (instanceManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.InstanceManagerHostApi.m87653a(this.f86962a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    public static class JavaObjectFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void dispose(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaObjectFlutterApi.dispose", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.w
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public JavaObjectFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface JavaObjectHostApi {
        void dispose(@NonNull Long l11);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87655a(JavaObjectHostApi javaObjectHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            javaObjectHostApi.dispose(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final JavaObjectHostApi javaObjectHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaObjectHostApi.dispose", getCodec());
            if (javaObjectHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.x
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.JavaObjectHostApi.m87655a(this.f86970a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class JavaScriptChannelFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        /* JADX INFO: loaded from: classes60.dex */
        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void postMessage(@NonNull Long l11, @NonNull String str, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelFlutterApi.postMessage", getCodec()).send(new ArrayList(Arrays.asList(l11, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.y
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public JavaScriptChannelFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface JavaScriptChannelHostApi {
        void create(@NonNull Long l11, @NonNull String str);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87657a(JavaScriptChannelHostApi javaScriptChannelHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            javaScriptChannelHostApi.create(lValueOf, str);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final JavaScriptChannelHostApi javaScriptChannelHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelHostApi.create", getCodec());
            if (javaScriptChannelHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.JavaScriptChannelHostApi.m87657a(this.f86979a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }
    }

    public static class PermissionRequestFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(@NonNull Long l11, @NonNull List<String> list, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestFlutterApi.create", getCodec()).send(new ArrayList(Arrays.asList(l11, list)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.a0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public PermissionRequestFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface PermissionRequestHostApi {
        void deny(@NonNull Long l11);

        void grant(@NonNull Long l11, @NonNull List<String> list);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87659a(PermissionRequestHostApi permissionRequestHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            List<String> list = (List) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            permissionRequestHostApi.grant(lValueOf, list);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87660b(PermissionRequestHostApi permissionRequestHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            permissionRequestHostApi.deny(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final PermissionRequestHostApi permissionRequestHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.grant", getCodec());
            if (permissionRequestHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.b0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.PermissionRequestHostApi.m87659a(this.f86878a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.deny", getCodec());
            if (permissionRequestHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.c0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.PermissionRequestHostApi.m87660b(this.f86881a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    public interface Result<T> {
        void error(@NonNull Throwable th2);

        void success(T t11);
    }

    public static class ViewFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ViewFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.d0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public ViewFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class WebChromeClientFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        /* JADX INFO: loaded from: classes60.dex */
        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return WebChromeClientFlutterApiCodec.INSTANCE;
        }

        public void onConsoleMessage(@NonNull Long l11, @NonNull ConsoleMessage consoleMessage, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onConsoleMessage", getCodec()).send(new ArrayList(Arrays.asList(l11, consoleMessage)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.i0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onGeolocationPermissionsHidePrompt(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsHidePrompt", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.o0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onGeolocationPermissionsShowPrompt(@NonNull Long l11, @NonNull Long l12, @NonNull String str, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsShowPrompt", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.e0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onHideCustomView(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onHideCustomView", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.g0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onJsAlert(@NonNull Long l11, @NonNull String str, @NonNull String str2, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsAlert", getCodec()).send(new ArrayList(Arrays.asList(l11, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.h0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onJsConfirm(@NonNull Long l11, @NonNull String str, @NonNull String str2, @NonNull final Reply<Boolean> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsConfirm", getCodec()).send(new ArrayList(Arrays.asList(l11, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.n0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply((Boolean) obj);
                }
            });
        }

        public void onJsPrompt(@NonNull Long l11, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull final Reply<String> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsPrompt", getCodec()).send(new ArrayList(Arrays.asList(l11, str, str2, str3)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.k0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply((String) obj);
                }
            });
        }

        public void onPermissionRequest(@NonNull Long l11, @NonNull Long l12, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onPermissionRequest", getCodec()).send(new ArrayList(Arrays.asList(l11, l12)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.j0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onProgressChanged(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onProgressChanged", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, l13)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.m0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onShowCustomView(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowCustomView", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, l13)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.l0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onShowFileChooser(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13, @NonNull final Reply<List<String>> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowFileChooser", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, l13)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.f0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply((List) obj);
                }
            });
        }

        public WebChromeClientFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    public static class WebChromeClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebChromeClientFlutterApiCodec INSTANCE = new WebChromeClientFlutterApiCodec();

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b11, @NonNull ByteBuffer byteBuffer) {
            return b11 != -128 ? super.readValueOfType(b11, byteBuffer) : ConsoleMessage.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof ConsoleMessage)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((ConsoleMessage) obj).toList());
            }
        }

        private WebChromeClientFlutterApiCodec() {
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface WebChromeClientHostApi {
        void create(@NonNull Long l11);

        void setSynchronousReturnValueForOnConsoleMessage(@NonNull Long l11, @NonNull Boolean bool);

        void setSynchronousReturnValueForOnJsAlert(@NonNull Long l11, @NonNull Boolean bool);

        void setSynchronousReturnValueForOnJsConfirm(@NonNull Long l11, @NonNull Boolean bool);

        void setSynchronousReturnValueForOnJsPrompt(@NonNull Long l11, @NonNull Boolean bool);

        void setSynchronousReturnValueForOnShowFileChooser(@NonNull Long l11, @NonNull Boolean bool);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87673a(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87674b(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87675c(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsAlert(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87676d(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87677e(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.create(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: f */
        static /* synthetic */ void m87678f(WebChromeClientHostApi webChromeClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final WebChromeClientHostApi webChromeClientHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.create", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.p0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.m87677e(this.f86937a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.q0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.m87676d(this.f86942a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.r0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.m87674b(this.f86947a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsAlert", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.s0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.m87675c(this.f86951a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.t0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.m87673a(this.f86955a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebChromeClientHostApi.m87678f(this.f86959a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
        }
    }

    public static final class WebResourceErrorData {

        @NonNull
        private String description;

        @NonNull
        private Long errorCode;

        public static final class Builder {

            @Nullable
            private String description;

            @Nullable
            private Long errorCode;

            @NonNull
            public WebResourceErrorData build() {
                WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
                webResourceErrorData.setErrorCode(this.errorCode);
                webResourceErrorData.setDescription(this.description);
                return webResourceErrorData;
            }

            @NonNull
            public Builder setDescription(@NonNull String str) {
                this.description = str;
                return this;
            }

            @NonNull
            public Builder setErrorCode(@NonNull Long l11) {
                this.errorCode = l11;
                return this;
            }
        }

        @NonNull
        public static WebResourceErrorData fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            WebResourceErrorData webResourceErrorData = new WebResourceErrorData();
            Object obj = arrayList.get(0);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webResourceErrorData.setErrorCode(lValueOf);
            webResourceErrorData.setDescription((String) arrayList.get(1));
            return webResourceErrorData;
        }

        @NonNull
        public String getDescription() {
            return this.description;
        }

        @NonNull
        public Long getErrorCode() {
            return this.errorCode;
        }

        public void setDescription(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.description = str;
        }

        public void setErrorCode(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"errorCode\" is null.");
            }
            this.errorCode = l11;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.errorCode);
            arrayList.add(this.description);
            return arrayList;
        }
    }

    public static final class WebResourceRequestData {

        @NonNull
        private Boolean hasGesture;

        @NonNull
        private Boolean isForMainFrame;

        @Nullable
        private Boolean isRedirect;

        @NonNull
        private String method;

        @NonNull
        private Map<String, String> requestHeaders;

        @NonNull
        private String url;

        public static final class Builder {

            @Nullable
            private Boolean hasGesture;

            @Nullable
            private Boolean isForMainFrame;

            @Nullable
            private Boolean isRedirect;

            @Nullable
            private String method;

            @Nullable
            private Map<String, String> requestHeaders;

            @Nullable
            private String url;

            @NonNull
            public WebResourceRequestData build() {
                WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
                webResourceRequestData.setUrl(this.url);
                webResourceRequestData.setIsForMainFrame(this.isForMainFrame);
                webResourceRequestData.setIsRedirect(this.isRedirect);
                webResourceRequestData.setHasGesture(this.hasGesture);
                webResourceRequestData.setMethod(this.method);
                webResourceRequestData.setRequestHeaders(this.requestHeaders);
                return webResourceRequestData;
            }

            @NonNull
            public Builder setHasGesture(@NonNull Boolean bool) {
                this.hasGesture = bool;
                return this;
            }

            @NonNull
            public Builder setIsForMainFrame(@NonNull Boolean bool) {
                this.isForMainFrame = bool;
                return this;
            }

            @NonNull
            public Builder setIsRedirect(@Nullable Boolean bool) {
                this.isRedirect = bool;
                return this;
            }

            @NonNull
            public Builder setMethod(@NonNull String str) {
                this.method = str;
                return this;
            }

            @NonNull
            public Builder setRequestHeaders(@NonNull Map<String, String> map) {
                this.requestHeaders = map;
                return this;
            }

            @NonNull
            public Builder setUrl(@NonNull String str) {
                this.url = str;
                return this;
            }
        }

        @NonNull
        public static WebResourceRequestData fromList(@NonNull ArrayList<Object> arrayList) {
            WebResourceRequestData webResourceRequestData = new WebResourceRequestData();
            webResourceRequestData.setUrl((String) arrayList.get(0));
            webResourceRequestData.setIsForMainFrame((Boolean) arrayList.get(1));
            webResourceRequestData.setIsRedirect((Boolean) arrayList.get(2));
            webResourceRequestData.setHasGesture((Boolean) arrayList.get(3));
            webResourceRequestData.setMethod((String) arrayList.get(4));
            webResourceRequestData.setRequestHeaders((Map) arrayList.get(5));
            return webResourceRequestData;
        }

        @NonNull
        public Boolean getHasGesture() {
            return this.hasGesture;
        }

        @NonNull
        public Boolean getIsForMainFrame() {
            return this.isForMainFrame;
        }

        @Nullable
        public Boolean getIsRedirect() {
            return this.isRedirect;
        }

        @NonNull
        public String getMethod() {
            return this.method;
        }

        @NonNull
        public Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        @NonNull
        public String getUrl() {
            return this.url;
        }

        public void setHasGesture(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"hasGesture\" is null.");
            }
            this.hasGesture = bool;
        }

        public void setIsForMainFrame(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
            }
            this.isForMainFrame = bool;
        }

        public void setIsRedirect(@Nullable Boolean bool) {
            this.isRedirect = bool;
        }

        public void setMethod(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"method\" is null.");
            }
            this.method = str;
        }

        public void setRequestHeaders(@NonNull Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"requestHeaders\" is null.");
            }
            this.requestHeaders = map;
        }

        public void setUrl(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.url = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.url);
            arrayList.add(this.isForMainFrame);
            arrayList.add(this.isRedirect);
            arrayList.add(this.hasGesture);
            arrayList.add(this.method);
            arrayList.add(this.requestHeaders);
            return arrayList;
        }
    }

    public static final class WebResourceResponseData {

        @NonNull
        private Long statusCode;

        public static final class Builder {

            @Nullable
            private Long statusCode;

            @NonNull
            public WebResourceResponseData build() {
                WebResourceResponseData webResourceResponseData = new WebResourceResponseData();
                webResourceResponseData.setStatusCode(this.statusCode);
                return webResourceResponseData;
            }

            @NonNull
            public Builder setStatusCode(@NonNull Long l11) {
                this.statusCode = l11;
                return this;
            }
        }

        @NonNull
        public static WebResourceResponseData fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            WebResourceResponseData webResourceResponseData = new WebResourceResponseData();
            Object obj = arrayList.get(0);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webResourceResponseData.setStatusCode(lValueOf);
            return webResourceResponseData;
        }

        @NonNull
        public Long getStatusCode() {
            return this.statusCode;
        }

        public void setStatusCode(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"statusCode\" is null.");
            }
            this.statusCode = l11;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.statusCode);
            return arrayList;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface WebSettingsHostApi {
        void create(@NonNull Long l11, @NonNull Long l12);

        @NonNull
        String getUserAgentString(@NonNull Long l11);

        void setAllowFileAccess(@NonNull Long l11, @NonNull Boolean bool);

        void setBuiltInZoomControls(@NonNull Long l11, @NonNull Boolean bool);

        void setDisplayZoomControls(@NonNull Long l11, @NonNull Boolean bool);

        void setDomStorageEnabled(@NonNull Long l11, @NonNull Boolean bool);

        void setJavaScriptCanOpenWindowsAutomatically(@NonNull Long l11, @NonNull Boolean bool);

        void setJavaScriptEnabled(@NonNull Long l11, @NonNull Boolean bool);

        void setLoadWithOverviewMode(@NonNull Long l11, @NonNull Boolean bool);

        void setMediaPlaybackRequiresUserGesture(@NonNull Long l11, @NonNull Boolean bool);

        void setSupportMultipleWindows(@NonNull Long l11, @NonNull Boolean bool);

        void setSupportZoom(@NonNull Long l11, @NonNull Boolean bool);

        void setTextZoom(@NonNull Long l11, @NonNull Long l12);

        void setUseWideViewPort(@NonNull Long l11, @NonNull Boolean bool);

        void setUserAgentString(@NonNull Long l11, @Nullable String str);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87679a(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setJavaScriptEnabled(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87680b(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setTextZoom(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87681c(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setSupportZoom(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87682d(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setMediaPlaybackRequiresUserGesture(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87683e(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webSettingsHostApi.getUserAgentString(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: f */
        static /* synthetic */ void m87684f(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setUserAgentString(lValueOf, str);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: g */
        static /* synthetic */ void m87685g(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setDisplayZoomControls(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        /* JADX INFO: renamed from: h */
        static /* synthetic */ void m87686h(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.create(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: i */
        static /* synthetic */ void m87687i(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setUseWideViewPort(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: j */
        static /* synthetic */ void m87688j(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setLoadWithOverviewMode(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: k */
        static /* synthetic */ void m87689k(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setBuiltInZoomControls(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: l */
        static /* synthetic */ void m87690l(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setSupportMultipleWindows(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: m */
        static /* synthetic */ void m87691m(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setAllowFileAccess(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: n */
        static /* synthetic */ void m87692n(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: o */
        static /* synthetic */ void m87693o(WebSettingsHostApi webSettingsHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webSettingsHostApi.setDomStorageEnabled(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final WebSettingsHostApi webSettingsHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.create", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87686h(this.f86963a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDomStorageEnabled", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.g1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87693o(this.f86900a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.h1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87692n(this.f86904a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportMultipleWindows", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.i1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87690l(this.f86908a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptEnabled", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.j1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87679a(this.f86912a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUserAgentString", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.w0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87684f(this.f86967a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.x0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87682d(this.f86971a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportZoom", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.y0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87681c(this.f86975a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setLoadWithOverviewMode", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87688j(this.f86980a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUseWideViewPort", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.a1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87687i(this.f86873a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDisplayZoomControls", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.b1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87685g(this.f86879a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setBuiltInZoomControls", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.c1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87689k(this.f86882a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setAllowFileAccess", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.d1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87691m(this.f86888a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setTextZoom", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.e1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87680b(this.f86892a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.getUserAgentString", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.f1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebSettingsHostApi.m87683e(this.f86896a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface WebStorageHostApi {
        void create(@NonNull Long l11);

        void deleteAllData(@NonNull Long l11);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87694a(WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webStorageHostApi.create(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87695b(WebStorageHostApi webStorageHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webStorageHostApi.deleteAllData(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final WebStorageHostApi webStorageHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.create", getCodec());
            if (webStorageHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.k1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebStorageHostApi.m87694a(this.f86916a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.deleteAllData", getCodec());
            if (webStorageHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.l1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebStorageHostApi.m87695b(this.f86920a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class WebViewClientFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        /* JADX INFO: loaded from: classes60.dex */
        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return WebViewClientFlutterApiCodec.INSTANCE;
        }

        public void doUpdateVisitedHistory(@NonNull Long l11, @NonNull Long l12, @NonNull String str, @NonNull Boolean bool, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.doUpdateVisitedHistory", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, str, bool)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.r1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onPageFinished(@NonNull Long l11, @NonNull Long l12, @NonNull String str, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageFinished", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.s1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onPageStarted(@NonNull Long l11, @NonNull Long l12, @NonNull String str, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageStarted", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.o1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onReceivedError(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13, @NonNull String str, @NonNull String str2, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedError", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, l13, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.n1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onReceivedHttpAuthRequest(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13, @NonNull String str, @NonNull String str2, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpAuthRequest", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, l13, str, str2)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.t1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onReceivedHttpError(@NonNull Long l11, @NonNull Long l12, @NonNull WebResourceRequestData webResourceRequestData, @NonNull WebResourceResponseData webResourceResponseData, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpError", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, webResourceRequestData, webResourceResponseData)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.u1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onReceivedRequestError(@NonNull Long l11, @NonNull Long l12, @NonNull WebResourceRequestData webResourceRequestData, @NonNull WebResourceErrorData webResourceErrorData, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedRequestError", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, webResourceRequestData, webResourceErrorData)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.q1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void requestLoading(@NonNull Long l11, @NonNull Long l12, @NonNull WebResourceRequestData webResourceRequestData, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.requestLoading", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, webResourceRequestData)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.p1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void urlLoading(@NonNull Long l11, @NonNull Long l12, @NonNull String str, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.urlLoading", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, str)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.m1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public WebViewClientFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    public static class WebViewClientFlutterApiCodec extends StandardMessageCodec {
        public static final WebViewClientFlutterApiCodec INSTANCE = new WebViewClientFlutterApiCodec();

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebResourceErrorData) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((WebResourceErrorData) obj).toList());
            } else if (obj instanceof WebResourceRequestData) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((WebResourceRequestData) obj).toList());
            } else if (!(obj instanceof WebResourceResponseData)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((WebResourceResponseData) obj).toList());
            }
        }

        private WebViewClientFlutterApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b11, @NonNull ByteBuffer byteBuffer) {
            switch (b11) {
                case -128:
                    return WebResourceErrorData.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return WebResourceRequestData.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return WebResourceResponseData.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b11, byteBuffer);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface WebViewClientHostApi {
        void create(@NonNull Long l11);

        void setSynchronousReturnValueForShouldOverrideUrlLoading(@NonNull Long l11, @NonNull Boolean bool);

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87705a(WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewClientHostApi.create(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87706b(WebViewClientHostApi webViewClientHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final WebViewClientHostApi webViewClientHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.create", getCodec());
            if (webViewClientHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewClientHostApi.m87705a(this.f86964a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading", getCodec());
            if (webViewClientHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.w1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewClientHostApi.m87706b(this.f86968a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class WebViewFlutterApi {

        @NonNull
        private final BinaryMessenger binaryMessenger;

        /* JADX INFO: loaded from: classes60.dex */
        public interface Reply<T> {
            void reply(T t11);
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return new StandardMessageCodec();
        }

        public void create(@NonNull Long l11, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.create", getCodec()).send(new ArrayList(Collections.singletonList(l11)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.y1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public void onScrollChanged(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13, @NonNull Long l14, @NonNull Long l15, @NonNull final Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.onScrollChanged", getCodec()).send(new ArrayList(Arrays.asList(l11, l12, l13, l14, l15)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.x1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    reply.reply(null);
                }
            });
        }

        public WebViewFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface WebViewHostApi {
        void addJavaScriptChannel(@NonNull Long l11, @NonNull Long l12);

        @NonNull
        Boolean canGoBack(@NonNull Long l11);

        @NonNull
        Boolean canGoForward(@NonNull Long l11);

        void clearCache(@NonNull Long l11, @NonNull Boolean bool);

        void create(@NonNull Long l11);

        void evaluateJavascript(@NonNull Long l11, @NonNull String str, @NonNull Result<String> result);

        @NonNull
        WebViewPoint getScrollPosition(@NonNull Long l11);

        @NonNull
        Long getScrollX(@NonNull Long l11);

        @NonNull
        Long getScrollY(@NonNull Long l11);

        @Nullable
        String getTitle(@NonNull Long l11);

        @Nullable
        String getUrl(@NonNull Long l11);

        void goBack(@NonNull Long l11);

        void goForward(@NonNull Long l11);

        void loadData(@NonNull Long l11, @NonNull String str, @Nullable String str2, @Nullable String str3);

        void loadDataWithBaseUrl(@NonNull Long l11, @Nullable String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5);

        void loadUrl(@NonNull Long l11, @NonNull String str, @NonNull Map<String, String> map);

        void postUrl(@NonNull Long l11, @NonNull String str, @NonNull byte[] bArr);

        void reload(@NonNull Long l11);

        void removeJavaScriptChannel(@NonNull Long l11, @NonNull Long l12);

        void scrollBy(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13);

        void scrollTo(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13);

        void setBackgroundColor(@NonNull Long l11, @NonNull Long l12);

        void setDownloadListener(@NonNull Long l11, @Nullable Long l12);

        void setWebChromeClient(@NonNull Long l11, @Nullable Long l12);

        void setWebContentsDebuggingEnabled(@NonNull Boolean bool);

        void setWebViewClient(@NonNull Long l11, @NonNull Long l12);

        String takeScreenShot(Long l11);

        /* JADX INFO: renamed from: A */
        static /* synthetic */ void m87709A(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.canGoBack(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87710a(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.goForward(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87711b(WebViewHostApi webViewHostApi, Object obj, final BasicMessageChannel.Reply reply) {
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            webViewHostApi.evaluateJavascript(number == null ? null : Long.valueOf(number.longValue()), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void success(String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }

                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void error(Throwable th2) {
                    reply.reply(GeneratedAndroidWebView.wrapError(th2));
                }
            });
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87712c(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setDownloadListener(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87713d(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.canGoForward(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87714e(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollY(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: f */
        static /* synthetic */ void m87715f(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setWebChromeClient(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: g */
        static /* synthetic */ void m87716g(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getTitle(lValueOf));
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return WebViewHostApiCodec.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        static /* synthetic */ void m87717h(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            String str3 = (String) arrayList2.get(3);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.loadData(lValueOf, str, str2, str3);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: i */
        static /* synthetic */ void m87718i(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setBackgroundColor(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: j */
        static /* synthetic */ void m87719j(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getUrl(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: k */
        static /* synthetic */ void m87720k(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.goBack(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: l */
        static /* synthetic */ void m87721l(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollPosition(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: m */
        static /* synthetic */ void m87722m(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            Number number3 = (Number) arrayList2.get(2);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.scrollTo(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()), number3 == null ? null : Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: n */
        static /* synthetic */ void m87723n(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                webViewHostApi.setWebContentsDebuggingEnabled((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: o */
        static /* synthetic */ void m87724o(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            String str2 = (String) arrayList2.get(2);
            String str3 = (String) arrayList2.get(3);
            String str4 = (String) arrayList2.get(4);
            String str5 = (String) arrayList2.get(5);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.loadDataWithBaseUrl(lValueOf, str, str2, str3, str4, str5);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: p */
        static /* synthetic */ void m87725p(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.create(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: q */
        static /* synthetic */ void m87726q(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, webViewHostApi.takeScreenShot(Long.valueOf(((Number) ((ArrayList) obj).get(0)).longValue())));
            } catch (Throwable th2) {
                arrayList = GeneratedAndroidWebView.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: r */
        static /* synthetic */ void m87727r(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.addJavaScriptChannel(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: s */
        static /* synthetic */ void m87728s(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.reload(lValueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable final WebViewHostApi webViewHostApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.create", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87725p(this.f86981a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadData", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.b2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87717h(this.f86880a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadDataWithBaseUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.j2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87724o(this.f86913a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.l2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87729t(this.f86921a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.postUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.m2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87735z(this.f86926a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.n2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87719j(this.f86930a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.WebViewHostApi.takeScreenShot", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.o2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87726q(this.f86934a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoBack", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.p2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87709A(this.f86939a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoForward", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.q2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87713d(this.f86944a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goBack", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.r2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87720k(this.f86949a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goForward", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.k2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87710a(this.f86917a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.reload", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.s2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87728s(this.f86953a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.clearCache", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.t2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87734y(this.f86957a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.evaluateJavascript", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.u2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87711b(this.f86961a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getTitle", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.v2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87716g(this.f86965a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollTo", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.w2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87722m(this.f86969a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollBy", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.x2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87733x(this.f86973a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollX", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.y2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87730u(this.f86977a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel18.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollY", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.z2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87714e(this.f86982a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel19.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollPosition", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.a2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87721l(this.f86874a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel20.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebContentsDebuggingEnabled", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel21.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.c2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87723n(this.f86883a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel21.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebViewClient", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel22.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.d2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87731v(this.f86889a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel22.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.addJavaScriptChannel", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel23.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.e2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87727r(this.f86893a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel23.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel24 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.removeJavaScriptChannel", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel24.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.f2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87732w(this.f86897a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel24.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel25 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setDownloadListener", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel25.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.g2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87712c(this.f86901a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel25.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel26 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebChromeClient", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel26.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.h2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87715f(this.f86905a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel26.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel27 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setBackgroundColor", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel27.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.i2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        GeneratedAndroidWebView.WebViewHostApi.m87718i(this.f86909a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel27.setMessageHandler(null);
            }
        }

        /* JADX INFO: renamed from: t */
        static /* synthetic */ void m87729t(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            Map<String, String> map = (Map) arrayList2.get(2);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.loadUrl(lValueOf, str, map);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: u */
        static /* synthetic */ void m87730u(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            Number number = (Number) ((ArrayList) obj).get(0);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollX(lValueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: v */
        static /* synthetic */ void m87731v(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.setWebViewClient(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: w */
        static /* synthetic */ void m87732w(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.removeJavaScriptChannel(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: x */
        static /* synthetic */ void m87733x(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Number number2 = (Number) arrayList2.get(1);
            Number number3 = (Number) arrayList2.get(2);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.scrollBy(lValueOf, number2 == null ? null : Long.valueOf(number2.longValue()), number3 == null ? null : Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: y */
        static /* synthetic */ void m87734y(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            Boolean bool = (Boolean) arrayList2.get(1);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.clearCache(lValueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: z */
        static /* synthetic */ void m87735z(WebViewHostApi webViewHostApi, Object obj, BasicMessageChannel.Reply reply) {
            Long lValueOf;
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            Number number = (Number) arrayList2.get(0);
            String str = (String) arrayList2.get(1);
            byte[] bArr = (byte[]) arrayList2.get(2);
            if (number == null) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(number.longValue());
                } catch (Throwable th2) {
                    arrayList = GeneratedAndroidWebView.wrapError(th2);
                }
            }
            webViewHostApi.postUrl(lValueOf, str, bArr);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class WebViewHostApiCodec extends StandardMessageCodec {
        public static final WebViewHostApiCodec INSTANCE = new WebViewHostApiCodec();

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b11, @NonNull ByteBuffer byteBuffer) {
            return b11 != -128 ? super.readValueOfType(b11, byteBuffer) : WebViewPoint.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof WebViewPoint)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((WebViewPoint) obj).toList());
            }
        }

        private WebViewHostApiCodec() {
        }
    }

    public static final class WebViewPoint {

        /* JADX INFO: renamed from: x */
        @NonNull
        private Long f86868x;

        /* JADX INFO: renamed from: y */
        @NonNull
        private Long f86869y;

        public static final class Builder {

            /* JADX INFO: renamed from: x */
            @Nullable
            private Long f86870x;

            /* JADX INFO: renamed from: y */
            @Nullable
            private Long f86871y;

            @NonNull
            public WebViewPoint build() {
                WebViewPoint webViewPoint = new WebViewPoint();
                webViewPoint.setX(this.f86870x);
                webViewPoint.setY(this.f86871y);
                return webViewPoint;
            }

            @NonNull
            public Builder setX(@NonNull Long l11) {
                this.f86870x = l11;
                return this;
            }

            @NonNull
            public Builder setY(@NonNull Long l11) {
                this.f86871y = l11;
                return this;
            }
        }

        @NonNull
        public static WebViewPoint fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            WebViewPoint webViewPoint = new WebViewPoint();
            Object obj = arrayList.get(0);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            webViewPoint.setX(lValueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            webViewPoint.setY(lValueOf2);
            return webViewPoint;
        }

        @NonNull
        public Long getX() {
            return this.f86868x;
        }

        @NonNull
        public Long getY() {
            return this.f86869y;
        }

        public void setX(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f86868x = l11;
        }

        public void setY(@NonNull Long l11) {
            if (l11 == null) {
                throw new IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f86869y = l11;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f86868x);
            arrayList.add(this.f86869y);
            return arrayList;
        }
    }

    public enum ConsoleMessageLevel {
        DEBUG(0),
        ERROR(1),
        LOG(2),
        TIP(3),
        WARNING(4),
        UNKNOWN(5);

        final int index;

        ConsoleMessageLevel(int i11) {
            this.index = i11;
        }
    }

    public enum FileChooserMode {
        OPEN(0),
        OPEN_MULTIPLE(1),
        SAVE(2);

        final int index;

        FileChooserMode(int i11) {
            this.index = i11;
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
