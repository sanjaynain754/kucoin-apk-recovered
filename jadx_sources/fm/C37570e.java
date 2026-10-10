package fm;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: fm.e */
/* JADX INFO: compiled from: SymbolConfigEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u000f\u001a\f\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\t\u001a\f\u0010\u000b\u001a\u00020\u0007*\u0004\u0018\u00010\t\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u000f¨\u0006\u0012"}, m90084d2 = {"getKycLeverage", "Ljava/math/BigDecimal;", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "getUserLeverage", "", "(Lcom/kubi/kumex/data/platform/model/SymbolConfig;)Ljava/lang/Double;", "isFavourite", "", "symbol", "", "(Lcom/kubi/kumex/data/platform/model/SymbolConfig;Ljava/lang/String;)Ljava/lang/Boolean;", "isStick", "(Lcom/kubi/kumex/data/platform/model/SymbolConfig;)Ljava/lang/Boolean;", "toFavouriteList", "", "", "filterFavoritesUnlessSymbol", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolConfigEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolConfigEx.kt\ncom/kubi/kumex/extensions/SymbolConfigExKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n774#2:65\n865#2,2:66\n1563#2:68\n1634#2,3:69\n1056#2:72\n*S KotlinDebug\n*F\n+ 1 SymbolConfigEx.kt\ncom/kubi/kumex/extensions/SymbolConfigExKt\n*L\n33#1:65\n33#1:66,2\n33#1:68\n33#1:69,3\n33#1:72\n*E\n"})
public final class C37570e {

    /* JADX INFO: renamed from: fm.e$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SymbolConfigEx.kt\ncom/kubi/kumex/extensions/SymbolConfigExKt\n*L\n1#1,328:1\n33#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues((String) t11, (String) t12);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<String> m84686a(@NotNull Map<String, SymbolConfig> map) {
        List<String> mutableList;
        Intrinsics.checkNotNullParameter(map, "<this>");
        List<ContractEntity> listMo25016k = RepositoryServiceLocator.f19236a.m20288g().mo25016k();
        synchronized (map) {
            try {
                mutableList = CollectionsKt.toMutableList((Collection) m84693h(map));
                Iterator<String> it = mutableList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<ContractEntity> it2 = listMo25016k.iterator();
                    do {
                        if (!it2.hasNext()) {
                            it.remove();
                            break;
                        }
                    } while (!Intrinsics.areEqual(it2.next().getSymbol(), next));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mutableList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BigDecimal m84687b(@Nullable SymbolConfig symbolConfig) {
        String str;
        return C41014a.m89921F((symbolConfig == null || (str = (String) symbolConfig.get("userMaxLeverage")) == null) ? null : StringsKt.toBigDecimalOrNull(str), "5");
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Double m84688c(@Nullable SymbolConfig symbolConfig) {
        String str;
        if (symbolConfig == null || (str = (String) symbolConfig.get("leverage")) == null) {
            return null;
        }
        return DowngradeExKt.m66539i(str);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Boolean m84689d(@Nullable SymbolConfig symbolConfig, @NotNull String symbol) {
        String str;
        String strM66669i;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (!kuMexDepend.m35905g().c()) {
            return Boolean.valueOf(kuMexDepend.m35903e().mo50715s(symbol));
        }
        if (symbolConfig == null || (str = (String) symbolConfig.get("favourite")) == null || (strM66669i = C27041f.m66669i(str, CredentialEntry.FALSE_STRING)) == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(strM66669i));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m84690e(@Nullable String str) {
        return C27025c.m66566d(m84689d(RepositoryServiceLocator.f19236a.m20288g().mo24996X(C27041f.m66668h(str)), C27041f.m66668h(str)));
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final Boolean m84691f(@Nullable SymbolConfig symbolConfig) {
        String str;
        String strM66669i;
        if (symbolConfig == null || (str = (String) symbolConfig.get(ViewProps.TOP)) == null || (strM66669i = C27041f.m66669i(str, CredentialEntry.FALSE_STRING)) == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(strM66669i));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m84692g(@Nullable String str) {
        return C27025c.m66566d(m84691f(RepositoryServiceLocator.f19236a.m20288g().mo24996X(C27041f.m66668h(str))));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final List<String> m84693h(@NotNull Map<String, SymbolConfig> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Set<Map.Entry<String, SymbolConfig>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (C27025c.m66566d(m84689d((SymbolConfig) entry.getValue(), (String) entry.getKey()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Map.Entry) it.next()).getKey());
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList2, new a()));
    }
}
