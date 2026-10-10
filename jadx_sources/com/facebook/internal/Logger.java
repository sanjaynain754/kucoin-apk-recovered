package com.facebook.internal;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.LoggingBehavior;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p333i6.C38457p;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0010\"\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010!\u001a\u00060\u001ej\u0002`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R*\u0010(\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, m90084d2 = {"Lcom/facebook/internal/Logger;", "", "Lcom/facebook/LoggingBehavior;", "behavior", "", "tag", "<init>", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "", "e", "()V", TypedValues.Custom.S_STRING, "f", "(Ljava/lang/String;)V", "b", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", "key", "value", "d", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "g", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/LoggingBehavior;", "Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "contents", "", "I", "getPriority", "()I", "setPriority", "(I)V", "priority", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class Logger {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final HashMap<String, String> f9622f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LoggingBehavior behavior;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public StringBuilder contents;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int priority;

    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0014\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0016JC\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0014\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0019J/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Lcom/facebook/internal/Logger$Companion;", "", "<init>", "()V", "", "original", "replace", "", "registerStringToReplace", "(Ljava/lang/String;Ljava/lang/String;)V", "accessToken", "registerAccessToken", "(Ljava/lang/String;)V", "Lcom/facebook/LoggingBehavior;", "behavior", "tag", TypedValues.Custom.S_STRING, "log", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "args", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", "priority", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "LOG_TAG_BASE", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stringsToReplace", "Ljava/util/HashMap;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final synchronized String m10001a(String string) {
            String strReplace$default;
            strReplace$default = string;
            for (Map.Entry entry : Logger.f9622f.entrySet()) {
                strReplace$default = StringsKt.replace$default(strReplace$default, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return strReplace$default;
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            log(behavior, 3, tag, string);
        }

        @JvmStatic
        public final synchronized void registerAccessToken(@NotNull String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            if (!C5501a.m7770F(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        @JvmStatic
        public final synchronized void registerStringToReplace(@NotNull String original, @NotNull String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            Logger.f9622f.put(original, replace);
        }

        public Companion() {
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (C5501a.m7770F(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                log(behavior, 3, tag, str);
            }
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, int priority, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (C5501a.m7770F(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                log(behavior, priority, tag, str);
            }
        }

        @JvmStatic
        public final void log(@NotNull LoggingBehavior behavior, int priority, @NotNull String tag, @NotNull String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (C5501a.m7770F(behavior)) {
                String strM10001a = m10001a(string);
                if (!StringsKt.startsWith$default(tag, "FacebookSDK.", false, 2, (Object) null)) {
                    tag = "FacebookSDK." + tag;
                }
                Log.println(priority, tag, strM10001a);
                if (behavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }
    }

    public Logger(@NotNull LoggingBehavior behavior, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.priority = 3;
        this.behavior = behavior;
        this.tag = "FacebookSDK." + C38457p.m86729h(tag, "tag");
        this.contents = new StringBuilder();
    }

    /* JADX INFO: renamed from: c */
    public final void m9996c(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (m10000g()) {
            StringBuilder sb2 = this.contents;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb2.append(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9997d(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        m9996c("  %s:\t%s\n", key, value);
    }

    /* JADX INFO: renamed from: e */
    public final void m9998e() {
        String string = this.contents.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        m9999f(string);
        this.contents = new StringBuilder();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10000g() {
        return C5501a.m7770F(this.behavior);
    }

    /* JADX INFO: renamed from: b */
    public final void m9995b(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (m10000g()) {
            this.contents.append(string);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9999f(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        INSTANCE.log(this.behavior, this.priority, this.tag, string);
    }
}
