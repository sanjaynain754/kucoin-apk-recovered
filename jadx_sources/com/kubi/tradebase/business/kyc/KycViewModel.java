package com.kubi.tradebase.business.kyc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.mine.api.entity.KycStyleType;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.user.api.IUserService;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KycViewModel.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\"\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00152\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001cH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradebase/business/kyc/KycViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "response", "Lcom/kubi/tradebase/business/kyc/KycRepository;", "getResponse", "()Lcom/kubi/tradebase/business/kyc/KycRepository;", "_kycStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/mine/api/entity/KycStyleType;", "kycStatus", "Landroidx/lifecycle/LiveData;", "getKycStatus", "()Landroidx/lifecycle/LiveData;", "getKycInfo", "Lcom/kubi/tradebase/business/kyc/NoticeDetailEntity;", "status", "", "onStart", "Lkotlin/Function0;", "", "onComplete", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchKycStatus", "handleSuccess", "it", "completableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "handleFail", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycViewModel.kt\ncom/kubi/tradebase/business/kyc/KycViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n25#2:93\n26#2:95\n1#3:94\n*S KotlinDebug\n*F\n+ 1 KycViewModel.kt\ncom/kubi/tradebase/business/kyc/KycViewModel\n*L\n43#1:93\n43#1:95\n43#1:94\n*E\n"})
public final class KycViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final KycRepository f51543V = new KycRepository();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<KycStyleType> f51544W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final LiveData<KycStyleType> f51545X;

    /* JADX INFO: renamed from: r */
    public final void m63183r(InterfaceC41769w<NoticeDetailEntity> interfaceC41769w) {
        interfaceC41769w.mo91370n(null);
    }

    /* JADX INFO: renamed from: s */
    public final void m63184s(NoticeDetailEntity noticeDetailEntity, InterfaceC41769w<NoticeDetailEntity> interfaceC41769w) {
        String title = noticeDetailEntity != null ? noticeDetailEntity.getTitle() : null;
        if (title == null || title.length() == 0) {
            String content = noticeDetailEntity != null ? noticeDetailEntity.getContent() : null;
            if (content == null || content.length() == 0) {
                m63183r(interfaceC41769w);
                return;
            }
        }
        interfaceC41769w.mo91370n(noticeDetailEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m63179p(KycViewModel kycViewModel, String str, Function0 function0, Function0 function1, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return kycViewModel.m63181o(str, function0, function1, continuation);
    }

    /* JADX INFO: renamed from: n */
    public final void m63180n() {
        if (IUserService.a.get().c()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new KycViewModel$fetchKycStatus$1(this, null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m63181o(@NotNull String str, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @NotNull Continuation<? super NoticeDetailEntity> continuation) {
        KycViewModel$getKycInfo$1 kycViewModel$getKycInfo$1;
        String str2;
        InterfaceC41769w<NoticeDetailEntity> interfaceC41769w;
        if (continuation instanceof KycViewModel$getKycInfo$1) {
            kycViewModel$getKycInfo$1 = (KycViewModel$getKycInfo$1) continuation;
            int i11 = kycViewModel$getKycInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kycViewModel$getKycInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kycViewModel$getKycInfo$1 = new KycViewModel$getKycInfo$1(this, continuation);
            }
        } else {
            kycViewModel$getKycInfo$1 = new KycViewModel$getKycInfo$1(this, continuation);
        }
        Object objM42823d = kycViewModel$getKycInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kycViewModel$getKycInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41769w<NoticeDetailEntity> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            InterfaceC41634e interfaceC41634eM90895S = C41636g.m90895S(C41636g.m90897U(this.f51543V.m63203d(str), new KycViewModel$getKycInfo$2(function0, null)), new KycViewModel$getKycInfo$3(function1, null));
            KycViewModel$getKycInfo$4 kycViewModel$getKycInfo$4 = new KycViewModel$getKycInfo$4(this, interfaceC41769wM91388c, null);
            kycViewModel$getKycInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            kycViewModel$getKycInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
            kycViewModel$getKycInfo$1.L$2 = SpillingKt.nullOutSpilledVariable(function1);
            kycViewModel$getKycInfo$1.L$3 = interfaceC41769wM91388c;
            kycViewModel$getKycInfo$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM90895S, false, kycViewModel$getKycInfo$4, kycViewModel$getKycInfo$1);
            if (objM42823d != coroutine_suspended) {
                str2 = str;
                interfaceC41769w = interfaceC41769wM91388c;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
            return objM42823d;
        }
        interfaceC41769w = (InterfaceC41769w) kycViewModel$getKycInfo$1.L$3;
        function1 = (Function0) kycViewModel$getKycInfo$1.L$2;
        function0 = (Function0) kycViewModel$getKycInfo$1.L$1;
        str2 = (String) kycViewModel$getKycInfo$1.L$0;
        ResultKt.throwOnFailure(objM42823d);
        if (((C19334f) objM42823d).getThrowable() != null) {
            m63183r(interfaceC41769w);
        }
        kycViewModel$getKycInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
        kycViewModel$getKycInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(function0);
        kycViewModel$getKycInfo$1.L$2 = SpillingKt.nullOutSpilledVariable(function1);
        kycViewModel$getKycInfo$1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41769w);
        kycViewModel$getKycInfo$1.label = 2;
        Object objMo91198h = interfaceC41769w.mo91198h(kycViewModel$getKycInfo$1);
        return objMo91198h == coroutine_suspended ? coroutine_suspended : objMo91198h;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final LiveData<KycStyleType> m63182q() {
        return this.f51545X;
    }

    public KycViewModel() {
        MutableLiveData<KycStyleType> mutableLiveData = new MutableLiveData<>();
        this.f51544W = mutableLiveData;
        this.f51545X = mutableLiveData;
    }
}
