package com.kubi.copytrading;

import com.google.gson.reflect.TypeToken;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: compiled from: CopyTradingConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.CopyTradingConfig$fetchIsSupportLeadTrading$1", m90122f = "CopyTradingConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCopyTradingConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchIsSupportLeadTrading$1\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n250#2,2:311\n149#3:313\n1#4:314\n*S KotlinDebug\n*F\n+ 1 CopyTradingConfig.kt\ncom/kubi/copytrading/CopyTradingConfig$fetchIsSupportLeadTrading$1\n*L\n114#1:311,2\n113#1:313\n*E\n"})
public final class CopyTradingConfig$fetchIsSupportLeadTrading$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.kubi.copytrading.CopyTradingConfig$fetchIsSupportLeadTrading$1$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C11435a extends TypeToken<List<? extends LeadUserEntity>> {
    }

    public CopyTradingConfig$fetchIsSupportLeadTrading$1(Continuation<? super CopyTradingConfig$fetchIsSupportLeadTrading$1> continuation) {
        super(2, continuation);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m20611g() {
        Object obj;
        String strM102351h = C46396e.m102351h("copyTrading", CopyTradingConfig.f19710a.m20603t(), "");
        C27099x c27099x = C27099x.f54458a;
        List list = (List) C27099x.m66914d(strM102351h, new C11435a().getType());
        CopyTradingConfig.f19714e.clear();
        CopyTradingConfig.f19714e.addAll(list);
        Iterator it = CopyTradingConfig.f19714e.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String uid = ((LeadUserEntity) next).getUid();
            LeadUserEntity leadUserEntity = CopyTradingConfig.f19715f;
            if (Intrinsics.areEqual(uid, leadUserEntity != null ? leadUserEntity.getUid() : null)) {
                obj = next;
                break;
            }
        }
        LeadUserEntity leadUserEntity2 = (LeadUserEntity) obj;
        if (leadUserEntity2 == null) {
            leadUserEntity2 = (LeadUserEntity) CollectionsKt.firstOrNull((List) CopyTradingConfig.f19714e);
        }
        CopyTradingConfig.f19715f = leadUserEntity2;
        CopyTradingConfig.f19713d.setValue(new Pair(CopyTradingConfig.f19715f, CopyTradingConfig.f19715f));
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingConfig$fetchIsSupportLeadTrading$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CopyTradingConfig$fetchIsSupportLeadTrading$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C27100x0.m66924e(new Function0() { // from class: com.kubi.copytrading.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CopyTradingConfig$fetchIsSupportLeadTrading$1.m20611g();
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
