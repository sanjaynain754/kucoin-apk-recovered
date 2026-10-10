package p212dv;

import com.kubi.quotefacade.entity.ChainItemEntity;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dv.d */
/* JADX INFO: compiled from: ChainMarketListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u0007\u0010\bR-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketListContract$ChainRepeatListDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "map", "Ljava/util/HashMap;", "", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/util/HashMap;)V", "getMap", "()Ljava/util/HashMap;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36964d implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HashMap<String, ChainItemEntity> f82080a;

    public C36964d(@NotNull HashMap<String, ChainItemEntity> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f82080a = map;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HashMap<String, ChainItemEntity> m82782a() {
        return this.f82080a;
    }
}
