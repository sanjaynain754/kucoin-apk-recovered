package io.trtc.tuikit.atomicxcore.impl.search;

import io.trtc.tuikit.atomicxcore.api.search.SearchOption;
import io.trtc.tuikit.atomicxcore.api.search.SearchType;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39969d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88850a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SearchType f88852c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C39981p f88853d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f88854e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchOption f88855f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39969d(SearchType searchType, C39981p c39981p, List list, SearchOption searchOption, Continuation continuation) {
        super(2, continuation);
        this.f88852c = searchType;
        this.f88853d = c39981p;
        this.f88854e = list;
        this.f88855f = searchOption;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39969d c39969d = new C39969d(this.f88852c, this.f88853d, this.f88854e, this.f88855f, continuation);
        c39969d.f88851b = obj;
        return c39969d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39969d) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (io.trtc.tuikit.atomicxcore.impl.search.C39981p.m88373a(r1, r7, r8, (p852kotlin.coroutines.jvm.internal.ContinuationImpl) r10) == r0) goto L41;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88850a;
        try {
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                SearchType searchType = this.f88852c;
                C39981p c39981p = this.f88853d;
                List list = this.f88854e;
                SearchOption searchOption = this.f88855f;
                Result.Companion companion = Result.INSTANCE;
                if (Intrinsics.areEqual(searchType, SearchType.User)) {
                    this.f88850a = 1;
                    if (C39981p.m88377c(c39981p, list, searchOption, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(searchType, SearchType.Friend)) {
                    this.f88850a = 2;
                    if (C39981p.m88375a(c39981p, list, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(searchType, SearchType.Group)) {
                    this.f88850a = 3;
                    if (C39981p.m88376b(c39981p, list, searchOption, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(searchType, SearchType.GroupMember)) {
                    this.f88850a = 4;
                    if (C39981p.m88374a(c39981p, list, searchOption, (SuspendLambda) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(searchType, SearchType.Message)) {
                    this.f88850a = 5;
                }
                return Result.m103843boximpl(objM103844constructorimpl);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m103843boximpl(objM103844constructorimpl);
    }
}
