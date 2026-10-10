package p345ik;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.system.ErrnoException;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.interpret.NoServerException;
import dk.C36724a;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import ro.C44128b;

/* JADX INFO: renamed from: ik.a */
/* JADX INFO: compiled from: CommonUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bR0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0016j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u001c\u0010\u001d\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0016j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001f"}, m90084d2 = {"Lik/a;", "", "<init>", "()V", "", "host", "", "c", "(Ljava/lang/String;)Z", "ip", "d", "", "ips", "", "speeds", "e", "([Ljava/lang/String;[I)[Ljava/lang/String;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sHostCheckResult", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "PATTERN", "sIpCheckResult", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtil.kt\ncom/kubi/httpdns/utils/CommonUtil\n+ 2 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,99:1\n36#2,14:100\n36#2,14:125\n1549#3:114\n1620#3,3:115\n1045#3:118\n1549#3:119\n1620#3,3:120\n37#4,2:123\n*S KotlinDebug\n*F\n+ 1 CommonUtil.kt\ncom/kubi/httpdns/utils/CommonUtil\n*L\n47#1:100,14\n95#1:125,14\n75#1:114\n75#1:115,3\n77#1:118\n79#1:119\n79#1:120,3\n81#1:123,2\n*E\n"})
public final class C38653a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38653a f86655a = new C38653a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Boolean> sHostCheckResult = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Pattern PATTERN = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){6}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^::([\\da-fA-F]{1,4}:){0,4}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:):([\\da-fA-F]{1,4}:){0,3}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){2}:([\\da-fA-F]{1,4}:){0,2}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){3}:([\\da-fA-F]{1,4}:){0,1}((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){4}:((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$|^([\\da-fA-F]{1,4}:){7}[\\da-fA-F]{1,4}$|^:((:[\\da-fA-F]{1,4}){1,6}|:)$|^[\\da-fA-F]{1,4}:((:[\\da-fA-F]{1,4}){1,5}|:)$|^([\\da-fA-F]{1,4}:){2}((:[\\da-fA-F]{1,4}){1,4}|:)$|^([\\da-fA-F]{1,4}:){3}((:[\\da-fA-F]{1,4}){1,3}|:)$|^([\\da-fA-F]{1,4}:){4}((:[\\da-fA-F]{1,4}){1,2}|:)$|^([\\da-fA-F]{1,4}:){5}:([\\da-fA-F]{1,4})?$|^([\\da-fA-F]{1,4}:){6}:$");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, Boolean> sIpCheckResult = new HashMap<>();

    /* JADX INFO: renamed from: ik.a$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CommonUtil.kt\ncom/kubi/httpdns/utils/CommonUtil\n*L\n1#1,328:1\n78#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues((Integer) ((Pair) t11).getSecond(), (Integer) ((Pair) t12).getSecond());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87375a(String host) {
        try {
            char[] charArray = host.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
            if (charArray.length != 0 && charArray.length <= 255) {
                for (char c11 : charArray) {
                    if (('A' > c11 || c11 >= '[') && (('a' > c11 || c11 >= '{') && !(('0' <= c11 && c11 < ':') || c11 == '.' || c11 == '-'))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            if ((e11 instanceof SocketException) || (e11 instanceof NoServerException) || (e11 instanceof SocketTimeoutException) || (e11 instanceof ErrnoException)) {
                C44128b.m97263g("CommonUtil", e11);
            } else {
                C36724a.m82299b(e11, "CommonUtil");
            }
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m87376b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                String typeName = activeNetworkInfo.getTypeName();
                return typeName == null ? C38654b.f86659a.m87383d() : typeName;
            }
        } catch (Throwable th2) {
            if ((th2 instanceof SocketException) || (th2 instanceof NoServerException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof ErrnoException)) {
                C44128b.m97263g("CommonUtil", th2);
            } else {
                C36724a.m82299b(th2, "CommonUtil");
            }
        }
        return C38654b.f86659a.m87383d();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87377c(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        HashMap<String, Boolean> map = sHostCheckResult;
        Boolean bool = map.get(host);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zM87375a = m87375a(host);
        map.put(host, Boolean.valueOf(zM87375a));
        return zM87375a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m87378d(@NotNull String ip2) {
        Intrinsics.checkNotNullParameter(ip2, "ip");
        HashMap<String, Boolean> map = sIpCheckResult;
        Boolean bool = map.get(ip2);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zMatches = PATTERN.matcher(ip2).matches();
        map.put(ip2, Boolean.valueOf(zMatches));
        return zMatches;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String[] m87379e(@NotNull String[] ips, @NotNull int[] speeds) {
        Intrinsics.checkNotNullParameter(ips, "ips");
        Intrinsics.checkNotNullParameter(speeds, "speeds");
        IntRange indices = ArraysKt.getIndices(ips);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(TuplesKt.m90091to(ips[iNextInt], Integer.valueOf(speeds[iNextInt])));
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new a());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Pair) it2.next()).getFirst());
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }
}
