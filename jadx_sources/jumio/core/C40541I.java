package jumio.core;

import com.jumio.core.ServiceLocator;
import com.jumio.core.cdn.CDNCache;
import com.jumio.core.cdn.CDNConfigInterface;
import com.jumio.core.cdn.DefaultCDNConfig;
import com.jumio.core.network.ByteArrayDownloadTask;
import jumio.core.C40541I;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: jumio.core.I */
/* JADX INFO: loaded from: classes61.dex */
public final class C40541I {

    /* JADX INFO: renamed from: a */
    public final CDNCache f90005a;

    /* JADX INFO: renamed from: b */
    public final ByteArrayDownloadTask f90006b;

    public C40541I(CDNCache cdnCache) {
        String value;
        Intrinsics.checkNotNullParameter(cdnCache, "cdnCache");
        this.f90005a = cdnCache;
        CDNConfigInterface cDNConfigInterface = (CDNConfigInterface) ServiceLocator.INSTANCE.getServiceImplementation(CDNConfigInterface.class, new Function0() { // from class: lg0.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40541I.m89191a();
            }
        });
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cDNConfigInterface.getF13762a());
        sb2.append(AbstractC40556L.f90029a);
        MatchResult matchResultFind$default = Regex.find$default(AbstractC40546J.f90014a, "4.17.0 (1)", 0, 2, null);
        sb2.append((matchResultFind$default == null || (value = matchResultFind$default.getValue()) == null) ? "" : value);
        sb2.append(".json");
        this.f90006b = new ByteArrayDownloadTask(sb2.toString(), 30000, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static final CDNConfigInterface m89191a() {
        return new DefaultCDNConfig();
    }
}
