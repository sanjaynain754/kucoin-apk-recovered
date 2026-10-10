package p793yc;

import com.kubi.sdk.base.entity.BasePageEntity;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import p721wc.InterfaceC45789a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: yc.e */
/* JADX INFO: compiled from: RequestUiPagingHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\u00020\u0005J\u0017\u0010\u0006\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000b0\n*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u000f0\nH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/handler/RequestUiPagingHandler;", "Req", "Lcom/kubi/core/base/arch/api/IRequest;", "ResponseItemEntity", "UiItemEntity", "", "getUiItemEntity", "responseItem", "(Ljava/lang/Object;)Ljava/lang/Object;", "getObservable", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "req", "(Lcom/kubi/core/base/arch/api/IRequest;)Lio/reactivex/Observable;", "mapUiCompose", "Lcom/kubi/sdk/base/entity/BaseEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestUiPagingHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestUiPagingHandler.kt\ncom/kubi/core/base/arch/api/handler/RequestUiPagingHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1563#2:40\n1634#2,3:41\n*S KotlinDebug\n*F\n+ 1 RequestUiPagingHandler.kt\ncom/kubi/core/base/arch/api/handler/RequestUiPagingHandler\n*L\n26#1:40\n26#1:41,3\n*E\n"})
public interface InterfaceC46463e<Req extends InterfaceC45789a, ResponseItemEntity, UiItemEntity> {
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BasePageEntity<UiItemEntity>> mo66265a(@NotNull Req req);
}
