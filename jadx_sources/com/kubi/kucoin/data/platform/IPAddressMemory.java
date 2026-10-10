package com.kubi.kucoin.data.platform;

import com.kubi.kucoin.data.AKuCoinMemoryProxy;
import com.kubi.restful.AbstractC23185a;
import com.kubi.restful.InterfaceC23192h;
import com.kubi.restful.InterfaceC23193i;
import com.kubi.restful.InterfaceC23194j;
import com.kubi.restful.InterfaceC23195k;
import com.kubi.restful.InterfaceC23196l;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kucoin.data.platform.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IPAddressMemory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/IPAddressMemory;", "", "insertIpAddress", "", "value", "", "proxy", "Lcom/kubi/restful/BaseProxy;", "type", "Ljava/lang/reflect/Type;", "getIpAddress", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPAddressMemory {
    @InterfaceC23192h(key = "ip_address")
    /* JADX INFO: renamed from: a */
    boolean m32052a(@InterfaceC23196l @NotNull String str, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Exception;

    @InterfaceC23194j(key = "ip_address")
    @Nullable
    /* JADX INFO: renamed from: c */
    String m32053c(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Exception;

    /* JADX INFO: renamed from: b */
    static /* synthetic */ String m32050b(IPAddressMemory iPAddressMemory, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIpAddress");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = AKuCoinMemoryProxy.f27714d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = String.class;
        }
        return iPAddressMemory.m32053c(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ boolean m32051d(IPAddressMemory iPAddressMemory, String str, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertIpAddress");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = AKuCoinMemoryProxy.f27714d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return iPAddressMemory.m32052a(str, abstractC23185a, type);
    }
}
