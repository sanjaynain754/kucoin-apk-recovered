package com.kubi.kucoin.data.platform;

import com.kubi.host.HostManager;
import com.kubi.restful.C23198n;
import mr.C42597a;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.data.platform.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IPAddressHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/IPAddressHelper;", "", "<init>", "()V", "platformMemory", "Lcom/kubi/kucoin/data/platform/IPAddressMemory;", "getIpAddress", "", "fetchIpAddress", "fetchIp", "Lokhttp3/ResponseBody;", "url", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IPAddressHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final IPAddressHelper f27740a = new IPAddressHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final IPAddressMemory f27741b = (IPAddressMemory) new C23198n.a().m55669a().m55665b(IPAddressMemory.class);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ResponseBody m32047a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return ((IPAddressApi) C42597a.m93391g().create(IPAddressApi.class)).m32046a(url);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m32048b() throws Exception {
        String strM32045a = C15293a.m32045a(m32047a(HostManager.a.v()));
        IPAddressMemory.m32051d(f27741b, strM32045a, null, null, 6, null);
        return strM32045a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m32049c() throws Exception {
        String strM32050b = IPAddressMemory.m32050b(f27741b, null, null, 3, null);
        return strM32050b == null ? "" : strM32050b;
    }
}
