package com.trtc.uikit.livekit.features.anchorboardcast.view.settings;

import com.kubi.search.searchresult.SearchCategory$Companion;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveCardInfoListEntity;
import java.util.Iterator;
import java.util.List;
import je0.C40397b;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SettingsListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.features.anchorboardcast.view.settings.SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1", m90122f = "SettingsListAdapter.kt", m90123i = {}, m90124l = {317}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSettingsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsListAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1761#2,3:349\n*S KotlinDebug\n*F\n+ 1 SettingsListAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1\n*L\n318#1:349,3\n*E\n"})
public final class SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $roomId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1(String str, Continuation<? super SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1> continuation) {
        super(2, continuation);
        this.$roomId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1(this.$roomId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SettingsListAdapter$handleWeb3$2$isWeb3CardMounted$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        List<LiveCardInfoListEntity.LiveCardInfo> listEmptyList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
            String str = this.$roomId;
            this.label = 1;
            obj = interfaceC42178aM89024b.m92613a(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        LiveCardInfoListEntity liveCardInfoListEntity = (LiveCardInfoListEntity) obj;
        if (liveCardInfoListEntity != null) {
            listEmptyList = liveCardInfoListEntity.getCards();
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList != null && listEmptyList.isEmpty()) {
            z11 = false;
        } else {
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((LiveCardInfoListEntity.LiveCardInfo) it.next()).getCardType(), SearchCategory$Companion.WEB3)) {
                }
            }
            z11 = false;
        }
        return Boxing.boxBoolean(z11);
    }
}
