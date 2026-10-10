package com.kubi.home.widgets.banner.full;

import com.kubi.home.entity.WidgetBannerEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BannerFullWidget.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/home/entity/WidgetBannerEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.widgets.banner.full.BannerFullWidget$bindUIState$2", m90122f = "BannerFullWidget.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBannerFullWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerFullWidget.kt\ncom/kubi/home/widgets/banner/full/BannerFullWidget$bindUIState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class BannerFullWidget$bindUIState$2 extends SuspendLambda implements Function2<List<? extends WidgetBannerEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BannerFullWidget this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends WidgetBannerEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<WidgetBannerEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerFullWidget$bindUIState$2(BannerFullWidget bannerFullWidget, Continuation<? super BannerFullWidget$bindUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = bannerFullWidget;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BannerFullWidget$bindUIState$2 bannerFullWidget$bindUIState$2 = new BannerFullWidget$bindUIState$2(this.this$0, continuation);
        bannerFullWidget$bindUIState$2.L$0 = obj;
        return bannerFullWidget$bindUIState$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<WidgetBannerEntity> list, Continuation<? super Unit> continuation) {
        return ((BannerFullWidget$bindUIState$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (list != null) {
            this.this$0.m31117v3(list);
        }
        return Unit.INSTANCE;
    }
}
