package p212dv;

import com.kubi.quotefacade.entity.ChainListEntity;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dv.c */
/* JADX INFO: compiled from: ChainMarketListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketListContract$ChainListDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "chainListEntity", "Lcom/kubi/quotefacade/entity/ChainListEntity;", "<init>", "(Lcom/kubi/quotefacade/entity/ChainListEntity;)V", "getChainListEntity", "()Lcom/kubi/quotefacade/entity/ChainListEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36963c implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ChainListEntity f82079a;

    public C36963c(@NotNull ChainListEntity chainListEntity) {
        Intrinsics.checkNotNullParameter(chainListEntity, "chainListEntity");
        this.f82079a = chainListEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChainListEntity getF82079a() {
        return this.f82079a;
    }
}
