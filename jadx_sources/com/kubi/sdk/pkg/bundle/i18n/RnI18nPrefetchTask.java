package com.kubi.sdk.pkg.bundle.i18n;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.kubi.sdk.pkg.util.C23985b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41713n0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import rg0.C44091j;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: RnI18nPrefetchTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 )2\u00020\u0001:\u0002*\u001fB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;", "", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;", "storage", "Lcom/kubi/sdk/pkg/bundle/i18n/a;", "fetcher", "", "maxConcurrent", "", "", "inflight", "<init>", "(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;Lcom/kubi/sdk/pkg/bundle/i18n/a;ILjava/util/Set;)V", "", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;", "metadata", "Lcom/kubi/sdk/pkg/bundle/i18n/b;", "locale", "", "i", "(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;", "g", "(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/b;)Ljava/util/List;", "cdn", "projectId", "f", "(Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/b;Ljava/lang/String;)Ljava/lang/String;", "item", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;", "b", "Lcom/kubi/sdk/pkg/bundle/i18n/a;", "c", "Ljava/util/Set;", "Lrg0/g;", "d", "Lrg0/g;", "semaphore", "e", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnI18nPrefetchTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1045#2:162\n1360#2:163\n1446#2,2:164\n1603#2,9:166\n1855#2:175\n1856#2:177\n1612#2:178\n1448#2,3:179\n1#3:176\n*S KotlinDebug\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask\n*L\n67#1:162\n68#1:163\n68#1:164,2\n74#1:166,9\n74#1:175\n74#1:177\n74#1:178\n68#1:179,3\n74#1:176\n*E\n"})
public final class RnI18nPrefetchTask {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f47324f = "rnI18nPrefetch";

    /* JADX INFO: renamed from: g */
    public static final int f47325g = 1;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Regex f47326h = new Regex("^[A-Za-z0-9._-]+$");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final RnI18nStorage storage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC23947a fetcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> inflight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44088g semaphore;

    /* JADX INFO: compiled from: RnI18nPrefetchTask.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$Companion;", "", "()V", "DEFAULT_MAX_CONCURRENT", "", "getDEFAULT_MAX_CONCURRENT", "()I", "SAFE_COMPONENT", "Lkotlin/text/Regex;", "getSAFE_COMPONENT", "()Lkotlin/text/Regex;", "TAG", "", "getTAG", "()Ljava/lang/String;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getDEFAULT_MAX_CONCURRENT() {
            return RnI18nPrefetchTask.f47325g;
        }

        @NotNull
        public final Regex getSAFE_COMPONENT() {
            return RnI18nPrefetchTask.f47326h;
        }

        @NotNull
        public final String getTAG() {
            return RnI18nPrefetchTask.f47324f;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.i18n.RnI18nPrefetchTask$a, reason: from toString */
    /* JADX INFO: compiled from: RnI18nPrefetchTask.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;", "", "", "projectId", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class DownloadItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String projectId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String url;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadItem)) {
                return false;
            }
            DownloadItem downloadItem = (DownloadItem) other;
            return Intrinsics.areEqual(this.projectId, downloadItem.projectId) && Intrinsics.areEqual(this.url, downloadItem.url);
        }

        public DownloadItem(@NotNull String projectId, @NotNull String url) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(url, "url");
            this.projectId = projectId;
            this.url = url;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getProjectId() {
            return this.projectId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (this.projectId.hashCode() * 31) + this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return "DownloadItem(projectId=" + this.projectId + ", url=" + this.url + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.i18n.RnI18nPrefetchTask$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask\n*L\n1#1,328:1\n67#2:329\n*E\n"})
    public static final class C23946b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Integer priority = ((RnI18nBundleMeta) t11).getI18n().getPriority();
            Integer numValueOf = Integer.valueOf(priority != null ? priority.intValue() : Integer.MAX_VALUE);
            Integer priority2 = ((RnI18nBundleMeta) t12).getI18n().getPriority();
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(priority2 != null ? priority2.intValue() : Integer.MAX_VALUE));
        }
    }

    public RnI18nPrefetchTask(@NotNull RnI18nStorage storage, @NotNull InterfaceC23947a fetcher, int i11, @NotNull Set<String> inflight) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        Intrinsics.checkNotNullParameter(inflight, "inflight");
        this.storage = storage;
        this.fetcher = fetcher;
        this.inflight = inflight;
        this.semaphore = C44091j.m97148b(RangesKt.coerceAtLeast(i11, 1), 0, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final String m57571f(String cdn, RnI18nLocaleContext locale, String projectId) {
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(cdn);
        if (httpUrl == null || !Intrinsics.areEqual(httpUrl.scheme(), ProxyConfig.MATCH_HTTPS) || httpUrl.username().length() > 0 || httpUrl.password().length() > 0 || httpUrl.query() != null || httpUrl.fragment() != null) {
            return null;
        }
        return httpUrl.newBuilder().addPathSegment("i18n").addPathSegment(locale.getSiteType()).addPathSegment(locale.getLang()).addPathSegment(projectId + ".json").build().getUrl();
    }

    /* JADX INFO: renamed from: g */
    public final List<DownloadItem> m57572g(List<RnI18nBundleMeta> metadata, RnI18nLocaleContext locale) {
        List listEmptyList;
        String string;
        String strM57571f;
        HashSet hashSet = new HashSet();
        List<RnI18nBundleMeta> listSortedWith = CollectionsKt.sortedWith(metadata, new C23946b());
        ArrayList arrayList = new ArrayList();
        for (RnI18nBundleMeta rnI18nBundleMeta : listSortedWith) {
            if (rnI18nBundleMeta.getI18n().shouldNativePrefetch(locale.getSiteType(), locale.getLang())) {
                String cdn = rnI18nBundleMeta.getI18n().getCdn();
                if (cdn == null || (string = StringsKt.trim((CharSequence) cdn).toString()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    List<String> listProjectIds = rnI18nBundleMeta.getI18n().projectIds();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listProjectIds) {
                        DownloadItem downloadItem = null;
                        if (f47326h.matches(str) && hashSet.add(str) && (strM57571f = m57571f(string, locale, str)) != null) {
                            downloadItem = new DownloadItem(str, strM57571f);
                        }
                        if (downloadItem != null) {
                            arrayList2.add(downloadItem);
                        }
                    }
                    listEmptyList = arrayList2;
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listEmptyList);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d2 A[Catch: all -> 0x0107, CancellationException -> 0x010b, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ea A[Catch: all -> 0x0107, CancellationException -> 0x010b, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0110 A[Catch: all -> 0x0107, CancellationException -> 0x010b, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0137 A[Catch: all -> 0x0107, CancellationException -> 0x010b, TRY_ENTER, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:48:0x013d A[Catch: all -> 0x0107, CancellationException -> 0x010b, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0140 A[Catch: all -> 0x0107, CancellationException -> 0x010b, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0158 A[Catch: all -> 0x0107, CancellationException -> 0x010b, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:52:0x018b A[Catch: all -> 0x0107, CancellationException -> 0x010b, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x010b, all -> 0x0107, blocks: (B:32:0x00ca, B:34:0x00d2, B:36:0x00ea, B:43:0x012f, B:42:0x0110, B:46:0x0137, B:48:0x013d, B:49:0x0140, B:51:0x0158, B:52:0x018b), top: B:75:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00ea, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0110, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0158, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x018b, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public final Object m57573h(DownloadItem downloadItem, RnI18nLocaleContext rnI18nLocaleContext, Continuation<? super Unit> continuation) throws Throwable {
        RnI18nPrefetchTask$download$1 rnI18nPrefetchTask$download$1;
        String str;
        Throwable th2;
        RnI18nPrefetchTask rnI18nPrefetchTask;
        CancellationException cancellationException;
        Object objMo57549a;
        Throwable th3;
        String str2;
        RnI18nHttpResult rnI18nHttpResult;
        String body;
        Unit unit;
        if (continuation instanceof RnI18nPrefetchTask$download$1) {
            rnI18nPrefetchTask$download$1 = (RnI18nPrefetchTask$download$1) continuation;
            int i11 = rnI18nPrefetchTask$download$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rnI18nPrefetchTask$download$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rnI18nPrefetchTask$download$1 = new RnI18nPrefetchTask$download$1(this, continuation);
            }
        } else {
            rnI18nPrefetchTask$download$1 = new RnI18nPrefetchTask$download$1(this, continuation);
        }
        Object obj = rnI18nPrefetchTask$download$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rnI18nPrefetchTask$download$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            str = downloadItem.getProjectId() + '|' + rnI18nLocaleContext.getSiteType() + '|' + rnI18nLocaleContext.getLang();
            if (!this.inflight.add(str)) {
                return Unit.INSTANCE;
            }
            RnI18nHttpValidator rnI18nHttpValidator = this.storage.m57594r(downloadItem.getProjectId(), rnI18nLocaleContext.getSiteType(), rnI18nLocaleContext.getLang()) == null ? new RnI18nHttpValidator(null, null, 3, null) : this.storage.m57595s(downloadItem.getProjectId(), rnI18nLocaleContext.getSiteType(), rnI18nLocaleContext.getLang());
            try {
                InterfaceC23947a interfaceC23947a = this.fetcher;
                String url = downloadItem.getUrl();
                rnI18nPrefetchTask$download$1.L$0 = this;
                rnI18nPrefetchTask$download$1.L$1 = downloadItem;
                rnI18nPrefetchTask$download$1.L$2 = rnI18nLocaleContext;
                rnI18nPrefetchTask$download$1.L$3 = str;
                rnI18nPrefetchTask$download$1.label = 1;
                objMo57549a = interfaceC23947a.mo57549a(url, rnI18nHttpValidator, rnI18nPrefetchTask$download$1);
                if (objMo57549a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rnI18nPrefetchTask = this;
                rnI18nHttpResult = (RnI18nHttpResult) objMo57549a;
                if (rnI18nHttpResult.getNotModified()) {
                    if (rnI18nPrefetchTask.storage.m57597u(downloadItem.getProjectId(), rnI18nLocaleContext.getSiteType(), rnI18nLocaleContext.getLang(), rnI18nHttpResult.getValidator())) {
                        C23985b.f47489a.m57877e(f47324f, "i18n CDN 未变化: " + downloadItem.getProjectId());
                    } else {
                        C23985b.m57873d(C23985b.f47489a, f47324f, "i18n 304 本地文件不可用，跳过重复请求: " + downloadItem.getProjectId(), null, 4, null);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    body = rnI18nHttpResult.getBody();
                    if (body == null) {
                        if (rnI18nPrefetchTask.storage.m57600x(downloadItem.getProjectId(), rnI18nLocaleContext.getSiteType(), rnI18nLocaleContext.getLang(), body, rnI18nHttpResult.getValidator())) {
                            C23985b.f47489a.m57877e(f47324f, "i18n 预取成功: " + downloadItem.getProjectId() + '_' + rnI18nLocaleContext.getSiteType() + '_' + rnI18nLocaleContext.getLang());
                        } else {
                            C23985b.m57873d(C23985b.f47489a, f47324f, "i18n 响应不是合法 JSON 对象: " + downloadItem.getProjectId(), null, 4, null);
                        }
                        rnI18nPrefetchTask.inflight.remove(str);
                        return Unit.INSTANCE;
                    }
                    unit = Unit.INSTANCE;
                }
                rnI18nPrefetchTask.inflight.remove(str);
                return unit;
            } catch (CancellationException e11) {
                cancellationException = e11;
                rnI18nPrefetchTask = this;
                str2 = str;
                throw cancellationException;
            } catch (Throwable th4) {
                th2 = th4;
                rnI18nPrefetchTask = this;
                C23985b.m57873d(C23985b.f47489a, f47324f, "i18n 预取失败: " + downloadItem.getProjectId() + ", " + th2.getMessage(), null, 4, null);
                rnI18nPrefetchTask.inflight.remove(str);
                return Unit.INSTANCE;
            }
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) rnI18nPrefetchTask$download$1.L$3;
        rnI18nLocaleContext = (RnI18nLocaleContext) rnI18nPrefetchTask$download$1.L$2;
        DownloadItem downloadItem2 = (DownloadItem) rnI18nPrefetchTask$download$1.L$1;
        rnI18nPrefetchTask = (RnI18nPrefetchTask) rnI18nPrefetchTask$download$1.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            objMo57549a = obj;
            str = str2;
            downloadItem = downloadItem2;
            try {
                rnI18nHttpResult = (RnI18nHttpResult) objMo57549a;
                if (rnI18nHttpResult.getNotModified()) {
                    if (rnI18nPrefetchTask.storage.m57597u(downloadItem.getProjectId(), rnI18nLocaleContext.getSiteType(), rnI18nLocaleContext.getLang(), rnI18nHttpResult.getValidator())) {
                        C23985b.f47489a.m57877e(f47324f, "i18n CDN 未变化: " + downloadItem.getProjectId());
                    } else {
                        C23985b.m57873d(C23985b.f47489a, f47324f, "i18n 304 本地文件不可用，跳过重复请求: " + downloadItem.getProjectId(), null, 4, null);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    body = rnI18nHttpResult.getBody();
                    if (body == null) {
                        if (rnI18nPrefetchTask.storage.m57600x(downloadItem.getProjectId(), rnI18nLocaleContext.getSiteType(), rnI18nLocaleContext.getLang(), body, rnI18nHttpResult.getValidator())) {
                            C23985b.f47489a.m57877e(f47324f, "i18n 预取成功: " + downloadItem.getProjectId() + '_' + rnI18nLocaleContext.getSiteType() + '_' + rnI18nLocaleContext.getLang());
                        } else {
                            C23985b.m57873d(C23985b.f47489a, f47324f, "i18n 响应不是合法 JSON 对象: " + downloadItem.getProjectId(), null, 4, null);
                        }
                        rnI18nPrefetchTask.inflight.remove(str);
                        return Unit.INSTANCE;
                    }
                    unit = Unit.INSTANCE;
                }
                rnI18nPrefetchTask.inflight.remove(str);
                return unit;
            } catch (CancellationException e12) {
                cancellationException = e12;
                str2 = str;
                try {
                    throw cancellationException;
                } catch (Throwable th5) {
                    str = str2;
                    th3 = th5;
                }
            } catch (Throwable th6) {
                th2 = th6;
                try {
                    C23985b.m57873d(C23985b.f47489a, f47324f, "i18n 预取失败: " + downloadItem.getProjectId() + ", " + th2.getMessage(), null, 4, null);
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
        } catch (CancellationException e13) {
            cancellationException = e13;
            throw cancellationException;
        } catch (Throwable th8) {
            th2 = th8;
            str = str2;
            downloadItem = downloadItem2;
            C23985b.m57873d(C23985b.f47489a, f47324f, "i18n 预取失败: " + downloadItem.getProjectId() + ", " + th2.getMessage(), null, 4, null);
            rnI18nPrefetchTask.inflight.remove(str);
            return Unit.INSTANCE;
        }
        rnI18nPrefetchTask.inflight.remove(str);
        throw th3;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m57574i(@NotNull List<RnI18nBundleMeta> list, @NotNull RnI18nLocaleContext rnI18nLocaleContext, @NotNull Continuation<? super Unit> continuation) {
        Regex regex = f47326h;
        if (!regex.matches(rnI18nLocaleContext.getSiteType()) || !regex.matches(rnI18nLocaleContext.getLang())) {
            return Unit.INSTANCE;
        }
        List<DownloadItem> listM57572g = m57572g(list, rnI18nLocaleContext);
        C23985b.f47489a.m57877e(f47324f, "i18n 预取计划: metadata=" + list.size() + ", eligibleFiles=" + listM57572g.size() + ", context=" + rnI18nLocaleContext.getSiteType() + '/' + rnI18nLocaleContext.getLang());
        Object objM91130f = C41713n0.m91130f(new RnI18nPrefetchTask$execute$2(listM57572g, this, rnI18nLocaleContext, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RnI18nPrefetchTask(RnI18nStorage rnI18nStorage, InterfaceC23947a interfaceC23947a, int i11, Set set, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        i11 = (i12 & 4) != 0 ? f47325g : i11;
        if ((i12 & 8) != 0) {
            set = Collections.newSetFromMap(new ConcurrentHashMap());
            Intrinsics.checkNotNullExpressionValue(set, "newSetFromMap(Concurrent…shMap<String, Boolean>())");
        }
        this(rnI18nStorage, interfaceC23947a, i11, set);
    }
}
