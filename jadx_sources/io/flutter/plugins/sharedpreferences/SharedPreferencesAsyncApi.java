package io.flutter.plugins.sharedpreferences;

import com.tencent.bugly.proguard.C33978va;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessagesAsync.g.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u0000 !2\u00020\u0001:\u0001!J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J \u0010\u001c\u001a\u00020\u00032\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH&J,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH&J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH&¨\u0006\""}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "", "setBool", "", "key", "", "value", "", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "setString", "setInt", "", "setDouble", "", "setEncodedStringList", "setDeprecatedStringList", "", "getString", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getPlatformEncodedStringList", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "clear", "allowList", "getAll", "", "getKeys", "Companion", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface SharedPreferencesAsyncApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: MessagesAsync.g.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "messageChannelSuffix", "", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy<MessagesAsyncPigeonCodec> codec = LazyKt.lazy(new Function0() { // from class: io.flutter.plugins.sharedpreferences.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SharedPreferencesAsyncApi.Companion.codec_delegate$lambda$0();
            }
        });

        @JvmOverloads
        public final void setUp(@NotNull BinaryMessenger binaryMessenger, @Nullable SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, sharedPreferencesAsyncApi, null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesAsyncPigeonCodec codec_delegate$lambda$0() {
            return new MessagesAsyncPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, sharedPreferencesAsyncApi, str);
        }

        @NotNull
        public final MessageCodec<Object> getCodec() {
            return codec.getValue();
        }

        @JvmOverloads
        public final void setUp(@NotNull BinaryMessenger binaryMessenger, @Nullable final SharedPreferencesAsyncApi api, @NotNull String messageChannelSuffix) {
            String str;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = C33978va.f72339h + messageChannelSuffix;
            } else {
                str = "";
            }
            BinaryMessenger.TaskQueue taskQueueMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.w
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.x
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.y
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.z
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.t
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.u
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys" + str, getCodec(), taskQueueMakeBackgroundTaskQueue);
            if (api != null) {
                basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.v
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$10$lambda$9(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setEncodedStringList(str, str2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$lambda$11(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List<String> list2 = (List) obj3;
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDeprecatedStringList(str, list2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$14$lambda$13(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getString(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$16$lambda$15(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getBool(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$18$lambda$17(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getDouble(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$lambda$1(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setBool(str, zBooleanValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$20$lambda$19(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getInt(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$22$lambda$21(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getPlatformEncodedStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$24$lambda$23(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$26$lambda$25(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.clear(list2, (SharedPreferencesPigeonOptions) obj2);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$28$lambda$27(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getAll(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$30$lambda$29(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = CollectionsKt.listOf(sharedPreferencesAsyncApi.getKeys(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$lambda$3(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setString(str, str2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$lambda$5(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setInt(str, jLongValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$lambda$7(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, BasicMessageChannel.Reply reply) {
            List listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDouble(str, dDoubleValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }
    }

    void clear(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options);

    @NotNull
    Map<String, Object> getAll(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options);

    @Nullable
    Boolean getBool(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options);

    @Nullable
    Double getDouble(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options);

    @Nullable
    Long getInt(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options);

    @NotNull
    List<String> getKeys(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options);

    @Nullable
    List<String> getPlatformEncodedStringList(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options);

    @Nullable
    String getString(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options);

    @Nullable
    StringListResult getStringList(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options);

    void setBool(@NotNull String key, boolean value, @NotNull SharedPreferencesPigeonOptions options);

    void setDeprecatedStringList(@NotNull String key, @NotNull List<String> value, @NotNull SharedPreferencesPigeonOptions options);

    void setDouble(@NotNull String key, double value, @NotNull SharedPreferencesPigeonOptions options);

    void setEncodedStringList(@NotNull String key, @NotNull String value, @NotNull SharedPreferencesPigeonOptions options);

    void setInt(@NotNull String key, long value, @NotNull SharedPreferencesPigeonOptions options);

    void setString(@NotNull String key, @NotNull String value, @NotNull SharedPreferencesPigeonOptions options);
}
