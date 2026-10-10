package com.kubi.search.searchresult;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.search.entity.SearchEventUploadEntity;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: SearchTrackUploader.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchresult.SearchTrackUploader$upload$1", m90122f = "SearchTrackUploader.kt", m90123i = {}, m90124l = {141, 143}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SearchTrackUploader$upload$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $click;
    final /* synthetic */ ArrayList<SearchEventUploadEntity> $uploadList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTrackUploader$upload$1(boolean z11, ArrayList<SearchEventUploadEntity> arrayList, Continuation<? super SearchTrackUploader$upload$1> continuation) {
        super(2, continuation);
        this.$click = z11;
        this.$uploadList = arrayList;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchTrackUploader$upload$1(this.$click, this.$uploadList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SearchTrackUploader$upload$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r5 == r0) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    bool = (Boolean) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                bool = (Boolean) obj;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$click) {
                InterfaceC41634e<Boolean> interfaceC41634eM59635j = SearchTrackUploader.f49043e.m59635j(this.$uploadList);
                this.label = 1;
                obj = RetrofitFlowExKt.m42830k(interfaceC41634eM59635j, this);
            } else {
                InterfaceC41634e<Boolean> interfaceC41634eM59632g = SearchTrackUploader.f49043e.m59632g(this.$uploadList);
                this.label = 2;
                obj = RetrofitFlowExKt.m42830k(interfaceC41634eM59632g, this);
            }
            return coroutine_suspended;
        }
        C44128b.m97266j("searchV2", "SearchTrackUploader upload result=" + bool + ", click=" + this.$click);
        return Unit.INSTANCE;
    }
}
