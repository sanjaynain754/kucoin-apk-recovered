package com.kubi.httpdns.cache;

import androidx.media3.exoplayer.upstream.CmcdData;
import ck.C4989a;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.httpdns.exception.CacheException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.httpdns.cache.a */
/* JADX INFO: compiled from: ICacheService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/httpdns/cache/a;", "", "Lcom/kubi/httpdns/cache/HostRecord;", "record", "", "update", "", "fromDisk", "", "b", "(Lcom/kubi/httpdns/cache/HostRecord;IZ)V", "", "host", "Lck/a;", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;)Lck/a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC15195a {

    /* JADX INFO: renamed from: com.kubi.httpdns.cache.a$a */
    /* JADX INFO: compiled from: ICacheService.kt */
    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m31468a(InterfaceC15195a interfaceC15195a, HostRecord hostRecord, int i11, boolean z11, int i12, Object obj) throws CacheException {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
            }
            if ((i12 & 2) != 0) {
                i11 = 3;
            }
            if ((i12 & 4) != 0) {
                z11 = false;
            }
            interfaceC15195a.mo31464b(hostRecord, i11, z11);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    List<C4989a> mo31463a() throws CacheException;

    /* JADX INFO: renamed from: b */
    void mo31464b(@NotNull HostRecord record, int update, boolean fromDisk) throws CacheException;

    @Nullable
    C4989a query(@NotNull String host) throws CacheException;
}
