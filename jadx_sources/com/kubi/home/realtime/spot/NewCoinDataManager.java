package com.kubi.home.realtime.spot;

import com.kubi.home.realtime.RealtimeApi;
import com.kubi.home.realtime.model.SymbolInfo;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.List;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NewCoinDataManager.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u000eR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/realtime/spot/NewCoinDataManager;", "", "<init>", "()V", "api", "Lcom/kubi/home/realtime/RealtimeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/home/realtime/RealtimeApi;", "api$delegate", "Lkotlin/Lazy;", "fetchNewListings", "", "Lcom/kubi/home/realtime/model/SymbolInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewCoinDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCoinDataManager.kt\ncom/kubi/home/realtime/spot/NewCoinDataManager\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n25#2:29\n26#2:31\n1#3:30\n*S KotlinDebug\n*F\n+ 1 NewCoinDataManager.kt\ncom/kubi/home/realtime/spot/NewCoinDataManager\n*L\n23#1:29\n23#1:31\n23#1:30\n*E\n"})
public final class NewCoinDataManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NewCoinDataManager f26174a = new NewCoinDataManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f26175b = LazyKt.lazy(new Function0() { // from class: com.kubi.home.realtime.spot.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewCoinDataManager.m30187b();
        }
    });

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m30188c(@NotNull Continuation<? super List<SymbolInfo>> continuation) {
        NewCoinDataManager$fetchNewListings$1 newCoinDataManager$fetchNewListings$1;
        InterfaceC41769w interfaceC41769wM91388c;
        if (continuation instanceof NewCoinDataManager$fetchNewListings$1) {
            newCoinDataManager$fetchNewListings$1 = (NewCoinDataManager$fetchNewListings$1) continuation;
            int i11 = newCoinDataManager$fetchNewListings$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                newCoinDataManager$fetchNewListings$1.label = i11 - Integer.MIN_VALUE;
            } else {
                newCoinDataManager$fetchNewListings$1 = new NewCoinDataManager$fetchNewListings$1(this, continuation);
            }
        } else {
            newCoinDataManager$fetchNewListings$1 = new NewCoinDataManager$fetchNewListings$1(this, continuation);
        }
        Object objM42825f = newCoinDataManager$fetchNewListings$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = newCoinDataManager$fetchNewListings$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42825f);
            interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            InterfaceC41634e<List<SymbolInfo>> interfaceC41634eM30051a = m30189d().m30051a();
            NewCoinDataManager$fetchNewListings$2 newCoinDataManager$fetchNewListings$2 = new NewCoinDataManager$fetchNewListings$2(interfaceC41769wM91388c, null);
            newCoinDataManager$fetchNewListings$1.L$0 = interfaceC41769wM91388c;
            newCoinDataManager$fetchNewListings$1.label = 1;
            objM42825f = RetrofitFlowExKt.m42825f(interfaceC41634eM30051a, false, newCoinDataManager$fetchNewListings$2, newCoinDataManager$fetchNewListings$1);
            if (objM42825f != coroutine_suspended) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42825f);
            return objM42825f;
        }
        interfaceC41769wM91388c = (InterfaceC41769w) newCoinDataManager$fetchNewListings$1.L$0;
        ResultKt.throwOnFailure(objM42825f);
        if (((C19334f) objM42825f).getThrowable() != null) {
            interfaceC41769wM91388c.mo91370n(null);
        }
        newCoinDataManager$fetchNewListings$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM91388c);
        newCoinDataManager$fetchNewListings$1.label = 2;
        Object objMo91198h = interfaceC41769wM91388c.mo91198h(newCoinDataManager$fetchNewListings$1);
        return objMo91198h == coroutine_suspended ? coroutine_suspended : objMo91198h;
    }

    /* JADX INFO: renamed from: d */
    public final RealtimeApi m30189d() {
        return (RealtimeApi) f26175b.getValue();
    }

    /* JADX INFO: renamed from: b */
    public static final RealtimeApi m30187b() {
        return (RealtimeApi) C42597a.m93388d().create(RealtimeApi.class);
    }
}
