package p770xq;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.FlutterError;
import com.kubi.monitor.MonitorLevel;
import com.kubi.monitor.flutter.FlutterCrash;
import io.flutter.plugin.common.MethodCall;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43842c;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: xq.a */
/* JADX INFO: compiled from: FlutterIssuesHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lxq/a;", "", "<init>", "()V", "Lio/flutter/plugin/common/MethodCall;", "call", "", "b", "(Lio/flutter/plugin/common/MethodCall;)V", "Lcom/kubi/monitor/FlutterError;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lio/flutter/plugin/common/MethodCall;)Lcom/kubi/monitor/FlutterError;", "", "", "", "errorElements", "", "Ljava/lang/StackTraceElement;", "c", "(Ljava/util/List;)[Ljava/lang/StackTraceElement;", "component_monitor_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterIssuesHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/monitor/flutter/FlutterIssuesHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,74:1\n1557#2:75\n1628#2,3:76\n37#3:79\n36#3,3:80\n*S KotlinDebug\n*F\n+ 1 FlutterIssuesHandler.kt\ncom/kubi/monitor/flutter/FlutterIssuesHandler\n*L\n58#1:75\n58#1:76,3\n64#1:79\n64#1:80,3\n*E\n"})
public final class C46325a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46325a f103902a = new C46325a();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final FlutterError m102141a(@NotNull MethodCall call) {
        String str;
        Intrinsics.checkNotNullParameter(call, "call");
        String str2 = (String) call.argument("exception");
        if (str2 == null) {
            return null;
        }
        String str3 = (String) call.argument("reason");
        String str4 = str3 == null ? "" : str3;
        Object objArgument = call.argument("fatal");
        Boolean bool = objArgument instanceof Boolean ? (Boolean) objArgument : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str5 = (String) call.argument(TtmlNode.TAG_INFORMATION);
        String str6 = str5 == null ? "" : str5;
        List list = (List) call.argument("stackTraceElements");
        if (str4.length() == 0) {
            str = str2;
        } else {
            str = str2 + ". Error thrown " + str4 + '.';
        }
        Throwable flutterCrash = zBooleanValue ? new FlutterCrash(str) : new com.kubi.monitor.flutter.FlutterError(str);
        if (list != null) {
            flutterCrash.setStackTrace(m102143c(list));
        }
        FlutterError flutterError = new FlutterError(flutterCrash, str2, null, null, null, null, 60, null);
        if (str4.length() > 0) {
            flutterError.setReason(str4);
        }
        if (str6.length() > 0) {
            flutterError.setInformation(str6);
        }
        flutterError.setLevel(zBooleanValue ? MonitorLevel.FATAL : MonitorLevel.ERROR);
        return flutterError;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m102142b(@NotNull MethodCall call) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(call, "call");
        FlutterError flutterErrorM102141a = m102141a(call);
        if (flutterErrorM102141a == null) {
            throw new IllegalArgumentException("exception");
        }
        C43842c.m96558a(flutterErrorM102141a);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final StackTraceElement[] m102143c(List<? extends Map<String, String>> errorElements) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(errorElements, 10));
        Iterator<T> it = errorElements.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str = (String) map.get("file");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = (String) map.get("line");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = (String) map.get("class");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = (String) map.get(FirebaseAnalytics.Param.METHOD);
            if (str5 != null) {
                str2 = str5;
            }
            arrayList.add(new StackTraceElement(str4, str2, str, Integer.parseInt(str3)));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }
}
