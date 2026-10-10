package com.kubi.quotefacade.favorites.edit;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavEditContainerFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditContainerFragment$onViewCreated$2$1$isChanged$1", m90122f = "FavEditContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFavEditContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavEditContainerFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditContainerFragment$onViewCreated$2$1$isChanged$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1761#2,3:182\n*S KotlinDebug\n*F\n+ 1 FavEditContainerFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditContainerFragment$onViewCreated$2$1$isChanged$1\n*L\n74#1:182,3\n*E\n"})
public final class FavEditContainerFragment$onViewCreated$2$1$isChanged$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ FavEditContainerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavEditContainerFragment$onViewCreated$2$1$isChanged$1(FavEditContainerFragment favEditContainerFragment, Continuation<? super FavEditContainerFragment$onViewCreated$2$1$isChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = favEditContainerFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavEditContainerFragment$onViewCreated$2$1$isChanged$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((FavEditContainerFragment$onViewCreated$2$1$isChanged$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = this.this$0.f41802V;
            boolean z11 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((FavEditChildFragment) it.next()).m51565E3()) {
                        z11 = true;
                        break;
                    }
                }
            }
            return Boxing.boxBoolean(z11);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
