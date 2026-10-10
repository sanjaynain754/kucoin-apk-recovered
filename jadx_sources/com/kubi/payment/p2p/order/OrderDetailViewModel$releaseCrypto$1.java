package com.kubi.payment.p2p.order;

import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.p2p.data.entities.ReleaseCrypto;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.OrderDetailViewModel$releaseCrypto$1", m90122f = "OrderDetailViewModel.kt", m90123i = {}, m90124l = {248}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class OrderDetailViewModel$releaseCrypto$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    final /* synthetic */ String $validationToken;
    int label;
    final /* synthetic */ OrderDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailViewModel$releaseCrypto$1(OrderDetailViewModel orderDetailViewModel, String str, String str2, Continuation<? super OrderDetailViewModel$releaseCrypto$1> continuation) {
        super(2, continuation);
        this.this$0 = orderDetailViewModel;
        this.$validationToken = str;
        this.$url = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderDetailViewModel$releaseCrypto$1(this.this$0, this.$validationToken, this.$url, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderDetailViewModel$releaseCrypto$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean enabled;
        String linkUrl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.m94034o().setValue(Boxing.boxBoolean(true));
            IP2PRepository iP2PRepository = this.this$0.f39731X;
            String str = this.this$0.f39740g0;
            String str2 = this.$validationToken;
            String str3 = this.$url;
            this.label = 1;
            obj = iP2PRepository.mo48482b(str, str2, str3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            ReleaseCrypto releaseCrypto = (ReleaseCrypto) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            BannerInfo.Banner banner = releaseCrypto.getBanner();
            if (banner != null) {
                enabled = banner.getEnabled();
            } else {
                enabled = null;
            }
            if (C27025c.m66566d(enabled)) {
                BannerInfo.Banner banner2 = releaseCrypto.getBanner();
                if (banner2 != null) {
                    linkUrl = banner2.getLinkUrl();
                } else {
                    linkUrl = null;
                }
                if (C27041f.m66668h(linkUrl).length() > 0) {
                    this.this$0.f39754u0.postValue(releaseCrypto);
                }
            }
            if (C27025c.m66566d(releaseCrypto.getResult())) {
                OrderDetailViewModel.m48744b0(this.this$0, false, 1, null);
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m94034o().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
