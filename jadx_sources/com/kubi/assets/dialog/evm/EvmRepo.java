package com.kubi.assets.dialog.evm;

import com.kubi.assets.entity.EvmChainEntity;
import com.kubi.assets.entity.EvmRepeatAddressResponseEntity;
import com.kubi.assets.entity.EvmRepeatEntity;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: EvmRepo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0086@¢\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011H\u0086@¢\u0006\u0002\u0010\u001bR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepo;", "", "<init>", "()V", "evmApi", "Lcom/kubi/assets/dialog/evm/EvmApi;", "kotlin.jvm.PlatformType", "getEvmApi", "()Lcom/kubi/assets/dialog/evm/EvmApi;", "evmApi$delegate", "Lkotlin/Lazy;", "getEvmChainList", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EvmChainEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEvmRepeatAddressList", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "address", "", "memo", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEvmRepeatAddress", "", "list", "Lcom/kubi/assets/entity/EvmRepeatEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EvmRepo {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EvmRepo f17055a = new EvmRepo();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f17056b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.evm.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EvmRepo.m16283d();
        }
    });

    /* JADX INFO: renamed from: e */
    public final EvmApi m16285e() {
        return (EvmApi) f17056b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final EvmApi m16283d() {
        return (EvmApi) C42597a.m93387c().create(EvmApi.class);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m16284c(@NotNull List<EvmRepeatEntity> list, @NotNull Continuation<? super InterfaceC41634e<Boolean>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new EvmRepo$deleteEvmRepeatAddress$2(list, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m16286f(@NotNull Continuation<? super InterfaceC41634e<? extends ArrayList<EvmChainEntity>>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new EvmRepo$getEvmChainList$2(null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m16287g(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super InterfaceC41634e<? extends List<EvmRepeatAddressResponseEntity>>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new EvmRepo$getEvmRepeatAddressList$2(str, str2, null), continuation);
    }
}
