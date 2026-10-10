package gm;

import bm.C4634g;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: gm.a */
/* JADX INFO: compiled from: GridContractConfig.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/grid/config/GridContractConfig;", "", "<init>", "()V", "KEY_GIRD_SYMBOL", "", "setGridSymbol", "", "symbol", "getSymbol", "getContractList", "", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "observeGridSymbol", "Lio/reactivex/Flowable;", "getFuturesGridContractFirst", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridContractConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridContractConfig.kt\ncom/kubi/kumex/grid/config/GridContractConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n295#2,2:66\n*S KotlinDebug\n*F\n+ 1 GridContractConfig.kt\ncom/kubi/kumex/grid/config/GridContractConfig\n*L\n60#1:66,2\n*E\n"})
public final class C37973a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37973a f85398a = new C37973a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<ContractEntity> m85818a() {
        return RepositoryServiceLocator.f19236a.m20288g().mo25016k();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m85819b() {
        List<ContractEntity> listMo25016k;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        String strM66669i = C27041f.m66669i((String) repositoryServiceLocator.m20290i().mo99981F0().get((Object) "key_gird_symbol"), C4634g.m4564a());
        if (Intrinsics.areEqual(strM66669i, C4634g.m4564a()) || (listMo25016k = repositoryServiceLocator.m20288g().mo25016k()) == null || listMo25016k.isEmpty() || InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), strM66669i, false, 2, null) != null) {
            return strM66669i;
        }
        C46527h0.f104291a.m102670E0(C4634g.m4564a());
        return C4634g.m4564a();
    }

    /* JADX INFO: renamed from: c */
    public final void m85820c(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        RepositoryServiceLocator.f19236a.m20290i().mo99991q(MapsKt.mutableMapOf(new Pair("key_gird_symbol", symbol)));
    }
}
