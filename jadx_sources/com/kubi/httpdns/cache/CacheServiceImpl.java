package com.kubi.httpdns.cache;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import ck.C4989a;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.httpdns.exception.CacheException;
import com.kubi.utils.extensions.C27024b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: compiled from: CacheServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006&"}, m90084d2 = {"Lcom/kubi/httpdns/cache/CacheServiceImpl;", "Lcom/kubi/httpdns/cache/a;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;)V", "Lcom/kubi/httpdns/cache/HostRecord;", "record", "", "update", "", "fromDisk", "", "b", "(Lcom/kubi/httpdns/cache/HostRecord;IZ)V", "", "host", "Lck/a;", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;)Lck/a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "function", "g", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/kubi/httpdns/HttpDnsConfig;", "", "Ljava/lang/Object;", "cacheLock", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "diskCache", "d", "memoryCache", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CacheServiceImpl implements InterfaceC15195a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object cacheLock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, HostRecord> diskCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, C4989a> memoryCache;

    public CacheServiceImpl(@NotNull HttpDnsConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.cacheLock = new Object();
        this.diskCache = new ConcurrentHashMap<>();
        this.memoryCache = new ConcurrentHashMap<>();
    }

    @Override // com.kubi.httpdns.cache.InterfaceC15195a
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<C4989a> mo31463a() {
        return (List) m31465g(new Function0<List<? extends C4989a>>() { // from class: com.kubi.httpdns.cache.CacheServiceImpl.query.2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends C4989a> invoke() {
                ArrayList arrayList;
                String[] strArrM102346c = C46396e.m102346c("httpdns-dns-cache");
                if (strArrM102346c != null) {
                    CacheServiceImpl cacheServiceImpl = CacheServiceImpl.this;
                    arrayList = new ArrayList();
                    for (String str : strArrM102346c) {
                        C4989a c4989aQuery = cacheServiceImpl.query(str);
                        if (c4989aQuery != null) {
                            arrayList.add(c4989aQuery);
                        }
                    }
                } else {
                    arrayList = null;
                }
                return C27024b.m66560c(arrayList);
            }
        });
    }

    @Override // com.kubi.httpdns.cache.InterfaceC15195a
    /* JADX INFO: renamed from: b */
    public void mo31464b(@NotNull final HostRecord record, final int update, final boolean fromDisk) throws CacheException {
        Intrinsics.checkNotNullParameter(record, "record");
        m31465g(new Function0<Unit>() { // from class: com.kubi.httpdns.cache.CacheServiceImpl$save$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object obj = this.this$0.cacheLock;
                int i11 = update;
                CacheServiceImpl cacheServiceImpl = this.this$0;
                HostRecord hostRecord = record;
                boolean z11 = fromDisk;
                synchronized (obj) {
                    if (i11 >= 1) {
                        try {
                            cacheServiceImpl.memoryCache.put(hostRecord.getHost(), hostRecord.toHttpDnsResult(z11, cacheServiceImpl.config.getAllowMaxTtl()));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (cacheServiceImpl.config.getAllowDiskCache() && i11 >= 2) {
                        cacheServiceImpl.diskCache.put(hostRecord.getHost(), hostRecord);
                    }
                    if (cacheServiceImpl.config.getAllowDiskCache() && i11 >= 3) {
                        C46396e.m102357n("httpdns-dns-cache", hostRecord.getHost(), hostRecord);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.kubi.httpdns.cache.InterfaceC15195a
    @Nullable
    public C4989a query(@NotNull final String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return (C4989a) m31465g(new Function0<C4989a>() { // from class: com.kubi.httpdns.cache.CacheServiceImpl.query.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final C4989a invoke() throws CacheException {
                C4989a c4989a = (C4989a) CacheServiceImpl.this.memoryCache.get(host);
                if (c4989a != null || !CacheServiceImpl.this.config.getAllowDiskCache()) {
                    return c4989a;
                }
                HostRecord hostRecord = (HostRecord) CacheServiceImpl.this.diskCache.get(host);
                if (hostRecord != null) {
                    CacheServiceImpl.this.mo31464b(hostRecord, 1, true);
                    return hostRecord.toHttpDnsResult(true, CacheServiceImpl.this.config.getAllowMaxTtl());
                }
                HostRecord hostRecord2 = (HostRecord) C46396e.m102350g("httpdns-dns-cache", host, HostRecord.class, null);
                if (hostRecord2 == null) {
                    return null;
                }
                CacheServiceImpl.this.mo31464b(hostRecord2, 2, true);
                return hostRecord2.toHttpDnsResult(true, CacheServiceImpl.this.config.getAllowMaxTtl());
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final <T> T m31465g(Function0<? extends T> function) throws CacheException {
        try {
            return function.invoke();
        } catch (CacheException e11) {
            throw e11;
        } catch (Throwable th2) {
            throw new CacheException(th2);
        }
    }
}
