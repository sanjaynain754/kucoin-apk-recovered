package p394k6;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.internal.C5760c;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Charsets;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: k6.i */
/* JADX INFO: compiled from: InstrumentUtility.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b!\u0010\"J+\u0010(\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/¨\u00060"}, m90084d2 = {"Lk6/i;", "", "<init>", "()V", "", "e", "", "(Ljava/lang/Throwable;)Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/Thread;", InterfaceC33953u5.f72225u, "g", "(Ljava/lang/Thread;)Ljava/lang/String;", "", "j", "(Ljava/lang/Throwable;)Z", "k", "(Ljava/lang/Thread;)Z", "", "Ljava/io/File;", CmcdData.Factory.STREAM_TYPE_LIVE, "()[Ljava/io/File;", "n", "p", "filename", "deleteOnException", "Lorg/json/JSONObject;", "r", "(Ljava/lang/String;Z)Lorg/json/JSONObject;", "content", "", "t", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "(Ljava/lang/String;)Z", "key", "Lorg/json/JSONArray;", "reports", "Lcom/facebook/GraphRequest$b;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;Lorg/json/JSONArray;Lcom/facebook/GraphRequest$b;)V", "f", "()Ljava/io/File;", "Ljava/lang/StackTraceElement;", "element", "i", "(Ljava/lang/StackTraceElement;)Z", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nInstrumentUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstrumentUtility.kt\ncom/facebook/internal/instrument/InstrumentUtility\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,341:1\n13579#2,2:342\n*S KotlinDebug\n*F\n+ 1 InstrumentUtility.kt\ncom/facebook/internal/instrument/InstrumentUtility\n*L\n134#1:342,2\n*E\n"})
public final class C40926i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40926i f90992a = new C40926i();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m89629h(@Nullable Throwable e11) {
        Throwable th2 = null;
        if (e11 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (e11 != null && e11 != th2) {
            StackTraceElement[] stackTrace = e11.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = e11;
            e11 = e11.getCause();
        }
        return jSONArray.toString();
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m89631j(@Nullable Throwable e11) {
        if (e11 == null) {
            return false;
        }
        Throwable th2 = null;
        while (e11 != null && e11 != th2) {
            StackTraceElement[] stackTrace = e11.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (m89630i(element)) {
                    return true;
                }
            }
            th2 = e11;
            e11 = e11.getCause();
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m89632k(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (m89630i(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    if (!StringsKt.startsWith$default(className, "com.facebook.appevents.codeless", false, 2, (Object) null)) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        if (!StringsKt.startsWith$default(className2, "com.facebook.appevents.suggestedevents", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    if (StringsKt.startsWith$default(methodName, "onClick", false, 2, (Object) null)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        if (StringsKt.startsWith$default(methodName2, "onItemClick", false, 2, (Object) null)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            if (!StringsKt.startsWith$default(methodName3, "onTouch", false, 2, (Object) null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m89626e(@Nullable Throwable e11) {
        if (e11 == null) {
            return null;
        }
        return e11.getCause() == null ? e11.toString() : String.valueOf(e11.getCause());
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m89630i(@NotNull StackTraceElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        if (StringsKt.startsWith$default(className, "com.facebook", false, 2, (Object) null)) {
            return true;
        }
        String className2 = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
        return StringsKt.startsWith$default(className2, "com.meta", false, 2, (Object) null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m89625d(@Nullable String filename) {
        File fileM89627f = m89627f();
        if (fileM89627f != null && filename != null) {
            return new File(fileM89627f, filename).delete();
        }
        return false;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final File m89627f() {
        File file = new File(C5501a.m7799m().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final String m89628g(@NotNull Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final File[] m89633l() {
        File fileM89627f = m89627f();
        if (fileM89627f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM89627f.listFiles(new FilenameFilter() { // from class: k6.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C40926i.m89634m(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m89634m(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final File[] m89635n() {
        File fileM89627f = m89627f();
        if (fileM89627f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM89627f.listFiles(new FilenameFilter() { // from class: k6.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C40926i.m89636o(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m89636o(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final File[] m89637p() {
        File fileM89627f = m89627f();
        if (fileM89627f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM89627f.listFiles(new FilenameFilter() { // from class: k6.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C40926i.m89638q(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m89638q(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).matches(name);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: r */
    public static final JSONObject m89639r(@Nullable String filename, boolean deleteOnException) {
        File fileM89627f = m89627f();
        if (fileM89627f != null && filename != null) {
            try {
                return new JSONObject(C5760c.m10070h0(new FileInputStream(new File(fileM89627f, filename))));
            } catch (Exception unused) {
                if (deleteOnException) {
                    m89625d(filename);
                }
            }
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m89640s(@Nullable String key, @NotNull JSONArray reports, @Nullable GraphRequest.InterfaceC5490b callback) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(key, reports.toString());
                JSONObject jSONObjectM10042B = C5760c.m10042B();
                if (jSONObjectM10042B != null) {
                    Iterator<String> itKeys = jSONObjectM10042B.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectM10042B.get(next));
                    }
                }
                GraphRequest.Companion companion = GraphRequest.INSTANCE;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{C5501a.m7800n()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                companion.newPostRequest(null, str, jSONObject, callback).m7657m();
            } catch (JSONException unused) {
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m89641t(@Nullable String filename, @Nullable String content) {
        File fileM89627f = m89627f();
        if (fileM89627f != null && filename != null && content != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM89627f, filename));
                byte[] bytes = content.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
