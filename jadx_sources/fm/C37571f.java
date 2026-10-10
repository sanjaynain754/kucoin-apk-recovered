package fm;

import androidx.credentials.provider.CredentialEntry;
import bm.C4634g;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.UserConfig;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: fm.f */
/* JADX INFO: compiled from: UserConfigEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0006\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\b"}, m90084d2 = {"getDefaultSymbol", "", "Lcom/kubi/kumex/data/platform/model/UserConfig;", "isLot", "", "hasPro", "isPro", "qtyUnit", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37571f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m84694a(@Nullable UserConfig userConfig) {
        String symbol;
        String str = userConfig != null ? (String) userConfig.get("defaultSymbol") : null;
        if (str != null && str.length() != 0) {
            return str;
        }
        ContractEntity contractEntity = (ContractEntity) CollectionsKt.firstOrNull((List) RepositoryServiceLocator.f19236a.m20288g().mo25016k());
        return (contractEntity == null || (symbol = contractEntity.getSymbol()) == null) ? C4634g.m4564a() : symbol;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m84695b(@Nullable UserConfig userConfig) {
        return (userConfig != null ? (String) userConfig.get("isPro") : null) != null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m84696c(@Nullable UserConfig userConfig) {
        return Boolean.parseBoolean(C27041f.m66669i(userConfig != null ? (String) userConfig.get("isLot") : null, CredentialEntry.FALSE_STRING));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m84697d(@Nullable UserConfig userConfig) {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) {
            return Boolean.parseBoolean(C27041f.m66669i(userConfig != null ? (String) userConfig.get("isPro") : null, CredentialEntry.TRUE_STRING));
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m84698e(@Nullable UserConfig userConfig) {
        String str = userConfig != null ? (String) userConfig.get("qtyUnit") : null;
        if (str == null || str.length() == 0) {
            return m84696c(userConfig) ? "QtyUnitOfLot" : "QtyUnitOfCurrency";
        }
        return str;
    }
}
