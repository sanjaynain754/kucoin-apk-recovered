package io.flutter.plugins.urllauncher;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33978va;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes60.dex */
public class Messages {

    public static final class BrowserOptions {

        @NonNull
        private Boolean showTitle;

        public static final class Builder {

            @Nullable
            private Boolean showTitle;

            @NonNull
            public BrowserOptions build() {
                BrowserOptions browserOptions = new BrowserOptions();
                browserOptions.setShowTitle(this.showTitle);
                return browserOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setShowTitle(@NonNull Boolean bool) {
                this.showTitle = bool;
                return this;
            }
        }

        @NonNull
        public static BrowserOptions fromList(@NonNull ArrayList<Object> arrayList) {
            BrowserOptions browserOptions = new BrowserOptions();
            browserOptions.setShowTitle((Boolean) arrayList.get(0));
            return browserOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || BrowserOptions.class != obj.getClass()) {
                return false;
            }
            return this.showTitle.equals(((BrowserOptions) obj).showTitle);
        }

        @NonNull
        public Boolean getShowTitle() {
            return this.showTitle;
        }

        public int hashCode() {
            return Objects.hash(this.showTitle);
        }

        public void setShowTitle(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.showTitle = bool;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.showTitle);
            return arrayList;
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b11, @NonNull ByteBuffer byteBuffer) {
            if (b11 != -127) {
                return b11 != -126 ? super.readValueOfType(b11, byteBuffer) : BrowserOptions.fromList((ArrayList) readValue(byteBuffer));
            }
            return WebViewOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebViewOptions) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((WebViewOptions) obj).toList());
            } else if (!(obj instanceof BrowserOptions)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((BrowserOptions) obj).toList());
            }
        }

        private PigeonCodec() {
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface UrlLauncherApi {
        static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable UrlLauncherApi urlLauncherApi) {
            setUp(binaryMessenger, "", urlLauncherApi);
        }

        @NonNull
        Boolean canLaunchUrl(@NonNull String str);

        void closeWebView();

        @NonNull
        Boolean launchUrl(@NonNull String str, @NonNull Map<String, String> map);

        @NonNull
        Boolean openUrlInApp(@NonNull String str, @NonNull Boolean bool, @NonNull WebViewOptions webViewOptions, @NonNull BrowserOptions browserOptions);

        @NonNull
        Boolean supportsCustomTabs();

        /* JADX INFO: renamed from: a */
        static /* synthetic */ void m87612a(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: b */
        static /* synthetic */ void m87613b(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                urlLauncherApi.closeWebView();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: c */
        static /* synthetic */ void m87614c(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, urlLauncherApi.supportsCustomTabs());
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: d */
        static /* synthetic */ void m87615d(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (WebViewOptions) arrayList2.get(2), (BrowserOptions) arrayList2.get(3)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: renamed from: e */
        static /* synthetic */ void m87616e(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = Messages.wrapError(th2);
            }
            reply.reply(arrayList);
        }

        @NonNull
        static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        static void setUp(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @Nullable final UrlLauncherApi urlLauncherApi) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = C33978va.f72339h + str;
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl" + str2, getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.m87616e(this.f86837a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl" + str2, getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.m87612a(this.f86838a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp" + str2, getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.m87615d(this.f86839a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs" + str2, getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.m87614c(this.f86840a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView" + str2, getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.m87613b(this.f86841a, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }
    }

    public static final class WebViewOptions {

        @NonNull
        private Boolean enableDomStorage;

        @NonNull
        private Boolean enableJavaScript;

        @NonNull
        private Map<String, String> headers;

        public static final class Builder {

            @Nullable
            private Boolean enableDomStorage;

            @Nullable
            private Boolean enableJavaScript;

            @Nullable
            private Map<String, String> headers;

            @NonNull
            public WebViewOptions build() {
                WebViewOptions webViewOptions = new WebViewOptions();
                webViewOptions.setEnableJavaScript(this.enableJavaScript);
                webViewOptions.setEnableDomStorage(this.enableDomStorage);
                webViewOptions.setHeaders(this.headers);
                return webViewOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnableDomStorage(@NonNull Boolean bool) {
                this.enableDomStorage = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnableJavaScript(@NonNull Boolean bool) {
                this.enableJavaScript = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHeaders(@NonNull Map<String, String> map) {
                this.headers = map;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && WebViewOptions.class == obj.getClass()) {
                WebViewOptions webViewOptions = (WebViewOptions) obj;
                if (this.enableJavaScript.equals(webViewOptions.enableJavaScript) && this.enableDomStorage.equals(webViewOptions.enableDomStorage) && this.headers.equals(webViewOptions.headers)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public static WebViewOptions fromList(@NonNull ArrayList<Object> arrayList) {
            WebViewOptions webViewOptions = new WebViewOptions();
            webViewOptions.setEnableJavaScript((Boolean) arrayList.get(0));
            webViewOptions.setEnableDomStorage((Boolean) arrayList.get(1));
            webViewOptions.setHeaders((Map) arrayList.get(2));
            return webViewOptions;
        }

        @NonNull
        public Boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        @NonNull
        public Boolean getEnableJavaScript() {
            return this.enableJavaScript;
        }

        @NonNull
        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            return Objects.hash(this.enableJavaScript, this.enableDomStorage, this.headers);
        }

        public void setEnableDomStorage(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.enableDomStorage = bool;
        }

        public void setEnableJavaScript(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.enableJavaScript = bool;
        }

        public void setHeaders(@NonNull Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.headers = map;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.enableJavaScript);
            arrayList.add(this.enableDomStorage);
            arrayList.add(this.headers);
            return arrayList;
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
