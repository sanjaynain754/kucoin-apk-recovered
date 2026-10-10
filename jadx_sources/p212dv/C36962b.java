package p212dv;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.entity.ChainItemEntity;
import org.jetbrains.annotations.NotNull;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dv.b */
/* JADX INFO: compiled from: ChainMarketListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/event/ChainMarketListContract$ChainAddOrCancelChainEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "chainItem", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", ViewProps.POSITION, "", "<init>", "(Lcom/kubi/quotefacade/entity/ChainItemEntity;I)V", "getChainItem", "()Lcom/kubi/quotefacade/entity/ChainItemEntity;", "getPosition", "()I", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36962b implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ChainItemEntity f82077a;

    /* JADX INFO: renamed from: b */
    public final int f82078b;

    public C36962b(@NotNull ChainItemEntity chainItem, int i11) {
        Intrinsics.checkNotNullParameter(chainItem, "chainItem");
        this.f82077a = chainItem;
        this.f82078b = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChainItemEntity getF82077a() {
        return this.f82077a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF82078b() {
        return this.f82078b;
    }
}
