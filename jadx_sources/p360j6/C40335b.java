package p360j6;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: j6.b */
/* JADX INFO: compiled from: GateKeeperRuntimeCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lj6/b;", "", "<init>", "()V", "", "Lcom/facebook/internal/gatekeeper/AppID;", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "Lj6/a;", "gateKeeperList", "", "b", "(Ljava/lang/String;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "gateKeepers", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGateKeeperRuntimeCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GateKeeperRuntimeCache.kt\ncom/facebook/internal/gatekeeper/GateKeeperRuntimeCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,109:1\n1855#2,2:110\n125#3:112\n152#3,3:113\n*S KotlinDebug\n*F\n+ 1 GateKeeperRuntimeCache.kt\ncom/facebook/internal/gatekeeper/GateKeeperRuntimeCache\n*L\n35#1:110,2\n47#1:112\n47#1:113,3\n*E\n"})
public final class C40335b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, GateKeeper>> gateKeepers = new ConcurrentHashMap<>();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<GateKeeper> m88835a(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, GateKeeper>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m88836b(@NotNull String appId, @NotNull List<GateKeeper> gateKeeperList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = new ConcurrentHashMap<>();
        for (GateKeeper gateKeeper : gateKeeperList) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
        this.gateKeepers.put(appId, concurrentHashMap);
    }
}
