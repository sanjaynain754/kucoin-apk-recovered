package f60;

import com.kubi.sdk.BaseFragment;
import com.kubi.transfer.TransferApi;
import com.kubi.transfer.api.ITransferService;
import com.kubi.transfer.entity.SearchSymbolEntity;
import com.kubi.transfer.search.symbol.SearchSymbolFragment;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: f60.b */
/* JADX INFO: compiled from: TransferService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/transfer/service/TransferService;", "Lcom/kubi/transfer/api/ITransferService;", "<init>", "()V", "api", "Lcom/kubi/transfer/TransferApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/transfer/TransferApi;", "api$delegate", "Lkotlin/Lazy;", "getSymbolList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/transfer/entity/SearchSymbolEntity;", "createSearchSymbolFragment", "Lcom/kubi/sdk/BaseFragment;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37383b implements ITransferService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f82936b = LazyKt.lazy(new Function0() { // from class: f60.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37383b.m84048d();
        }
    });

    @Override // com.kubi.transfer.api.ITransferService
    @NotNull
    /* JADX INFO: renamed from: b */
    public BaseFragment mo64511b() {
        return new SearchSymbolFragment();
    }

    /* JADX INFO: renamed from: e */
    public final TransferApi m84049e() {
        return (TransferApi) this.f82936b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final TransferApi m84048d() {
        return (TransferApi) C42597a.m93387c().create(TransferApi.class);
    }

    @Override // com.kubi.transfer.api.ITransferService
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC41634e<List<SearchSymbolEntity>> mo64510a() {
        return TransferApi.m64495h(m84049e(), null, 1, null);
    }
}
