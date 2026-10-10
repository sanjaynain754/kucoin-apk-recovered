package com.kubi.quotefacade.rank.list;

import com.kubi.quotefacade.entity.RankEntity;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.quotefacade.rank.list.d */
/* JADX INFO: compiled from: RankListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListContract$FetchDataListEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "dataList", "", "Lcom/kubi/quotefacade/entity/RankEntity;", "isSubscribe", "", "<init>", "(Ljava/util/List;Z)V", "getDataList", "()Ljava/util/List;", "()Z", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22477d implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final List<RankEntity> f42513a;

    /* JADX INFO: renamed from: b */
    public final boolean f42514b;

    public C22477d(@Nullable List<RankEntity> list, boolean z11) {
        this.f42513a = list;
        this.f42514b = z11;
    }

    public /* synthetic */ C22477d(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z11);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<RankEntity> m52911a() {
        return this.f42513a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF42514b() {
        return this.f42514b;
    }
}
