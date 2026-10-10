package th;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractMaintainEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.network.websocket.model.Message;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: th.g */
/* JADX INFO: compiled from: PlatformConverter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u000bH\u0000¨\u0006\f"}, m90084d2 = {"mergeSymbolConfig", "", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "config1", "", "config2", "toContractMaintain", "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;", "", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "Lcom/kubi/network/websocket/model/Message;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatformConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformConverter.kt\ncom/kubi/futures/data/platform/PlatformConverterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,57:1\n1869#2,2:58\n1869#2,2:60\n58#3,6:62\n64#3,2:69\n58#3,6:71\n64#3,2:78\n126#4:68\n126#4:77\n*S KotlinDebug\n*F\n+ 1 PlatformConverter.kt\ncom/kubi/futures/data/platform/PlatformConverterKt\n*L\n24#1:58,2\n31#1:60,2\n48#1:62,6\n48#1:69,2\n55#1:71,6\n55#1:78,2\n48#1:68\n55#1:77\n*E\n"})
public final class C44986g {

    /* JADX INFO: renamed from: th.g$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class a extends TypeToken<List<? extends ContractEntity>> {
    }

    /* JADX INFO: renamed from: th.g$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class b extends TypeToken<ContractMaintainEntity> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Map<String, SymbolConfig> m99536a(@NotNull Map<String, SymbolConfig> config1, @NotNull Map<String, SymbolConfig> config2) {
        SymbolConfig symbolConfigBind;
        Intrinsics.checkNotNullParameter(config1, "config1");
        Intrinsics.checkNotNullParameter(config2, "config2");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(config1);
        Iterator<T> it = config2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            SymbolConfig symbolConfig = (SymbolConfig) linkedHashMap.get(entry.getKey());
            if (symbolConfig == null || (symbolConfigBind = symbolConfig.bind((Map) entry.getValue())) == null) {
                symbolConfigBind = (SymbolConfig) entry.getValue();
            }
            linkedHashMap.put(key, symbolConfigBind);
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ContractMaintainEntity m99537b(@NotNull Message message) {
        Object objM66914d;
        Object objM66914d2;
        Intrinsics.checkNotNullParameter(message, "<this>");
        if (Intrinsics.areEqual(message.getSource(), "heartbeat")) {
            if (message.getData() == null || TextUtils.isEmpty(message.getData())) {
                objM66914d2 = null;
            } else {
                try {
                    String data = message.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d2 = C27099x.m66914d(data, new a().getType());
                } catch (Throwable unused) {
                    objM66914d2 = null;
                }
            }
            List list = (List) objM66914d2;
            return (list == null || list.isEmpty()) ? new ContractMaintainEntity(null, null, 3, null) : m99538c(list);
        }
        if (message.getData() == null || TextUtils.isEmpty(message.getData())) {
            objM66914d = null;
        } else {
            try {
                String data2 = message.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new b().getType());
            } catch (Throwable unused2) {
                objM66914d = null;
            }
        }
        ContractMaintainEntity contractMaintainEntity = (ContractMaintainEntity) objM66914d;
        return contractMaintainEntity == null ? new ContractMaintainEntity(null, null, 3, null) : contractMaintainEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ContractMaintainEntity m99538c(@NotNull List<ContractEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ContractMaintainEntity contractMaintainEntity = new ContractMaintainEntity(null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ContractEntity contractEntity : list) {
            String symbol = contractEntity.getSymbol();
            if (symbol != null) {
                if (Intrinsics.areEqual(contractEntity.getStatus(), "Paused")) {
                    arrayList.add(symbol);
                }
                if (Intrinsics.areEqual(contractEntity.getStatus(), "CancelOnly")) {
                    arrayList2.add(symbol);
                }
            }
        }
        contractMaintainEntity.setCancelOnlyContracts(arrayList2);
        contractMaintainEntity.setPausedContracts(arrayList);
        return contractMaintainEntity;
    }
}
