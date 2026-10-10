package com.kubi.kumex.trade.menu.p092vm;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.Article;
import com.kubi.kumex.data.platform.model.FuturesCampaignActivityEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import th.InterfaceC44974a;

/* JADX INFO: compiled from: AnnouncementViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.trade.menu.vm.AnnouncementViewModel$fetchCampaignActivities$2", m90122f = "AnnouncementViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AnnouncementViewModel$fetchCampaignActivities$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<Pair<Boolean, List<Article>>> $announcementData;
    final /* synthetic */ AnnouncementType $announcementType;
    final /* synthetic */ String $lang;
    int label;
    final /* synthetic */ AnnouncementViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementViewModel$fetchCampaignActivities$2(AnnouncementViewModel announcementViewModel, AnnouncementType announcementType, String str, MutableLiveData<Pair<Boolean, List<Article>>> mutableLiveData, Continuation<? super AnnouncementViewModel$fetchCampaignActivities$2> continuation) {
        super(2, continuation);
        this.this$0 = announcementViewModel;
        this.$announcementType = announcementType;
        this.$lang = str;
        this.$announcementData = mutableLiveData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnnouncementViewModel$fetchCampaignActivities$2(this.this$0, this.$announcementType, this.$lang, this.$announcementData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AnnouncementViewModel$fetchCampaignActivities$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Article> listEmptyList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesCampaignActivityEntity futuresCampaignActivityEntityM99449c0 = InterfaceC44974a.m99449c0(RepositoryServiceLocator.f19236a.m20288g(), 1, 1000, this.$lang, this.this$0.m36382o(this.$announcementType), null, 16, null);
            MutableLiveData<Pair<Boolean, List<Article>>> mutableLiveData = this.$announcementData;
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            if (futuresCampaignActivityEntityM99449c0 == null || (listEmptyList = futuresCampaignActivityEntityM99449c0.getItems()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            mutableLiveData.postValue(new Pair<>(boolBoxBoolean, listEmptyList));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
