package com.kubi.transfer.api;

import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.transfer.entity.SearchSymbolEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ITransferService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0016\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/transfer/api/ITransferService;", "", "getSymbolList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/transfer/entity/SearchSymbolEntity;", "createSearchSymbolFragment", "Lcom/kubi/sdk/BaseFragment;", "Companion", "TransferApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITransferService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f52538a = Companion.f52539a;

    /* JADX INFO: compiled from: ITransferService.kt */
    /* JADX INFO: loaded from: classes51.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/transfer/api/ITransferService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/transfer/api/ITransferService;", "TransferApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f52539a = new Companion();

        @NotNull
        public final ITransferService get() {
            return (ITransferService) Router.f46192a.m56192n(ITransferService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<SearchSymbolEntity>> mo64510a();

    @NotNull
    /* JADX INFO: renamed from: b */
    BaseFragment mo64511b();
}
