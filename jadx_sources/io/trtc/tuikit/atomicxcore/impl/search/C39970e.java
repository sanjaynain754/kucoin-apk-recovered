package io.trtc.tuikit.atomicxcore.impl.search;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.search.SearchOption;
import io.trtc.tuikit.atomicxcore.api.search.SearchType;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39970e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88856a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88857b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f88858c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f88859d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C39981p f88860e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List f88861f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SearchOption f88862g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39970e(ArrayList arrayList, CompletionHandler completionHandler, C39981p c39981p, List list, SearchOption searchOption, Continuation continuation) {
        super(2, continuation);
        this.f88858c = arrayList;
        this.f88859d = completionHandler;
        this.f88860e = c39981p;
        this.f88861f = list;
        this.f88862g = searchOption;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39970e c39970e = new C39970e(this.f88858c, this.f88859d, this.f88860e, this.f88861f, this.f88862g, continuation);
        c39970e.f88857b = obj;
        return c39970e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39970e) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af A[SYNTHETIC] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        C39497e c39497e;
        Object next;
        Result result;
        Throwable thM103847exceptionOrNullimpl;
        CompletionHandler completionHandler;
        int i11;
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f88856a;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f88857b;
            ArrayList arrayList = this.f88858c;
            C39981p c39981p = this.f88860e;
            List list = this.f88861f;
            SearchOption searchOption = this.f88862g;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C41696j.m91102b(interfaceC41709m0, null, null, new C39969d((SearchType) it2.next(), c39981p, list, searchOption, null), 3, null));
                c39981p = c39981p;
                list = list;
                searchOption = searchOption;
            }
            this.f88856a = 1;
            obj = AwaitKt.m90345a(arrayList2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List list2 = (List) obj;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (Result.m103851isSuccessimpl(((Result) it3.next()).getValue())) {
                    CompletionHandler completionHandler2 = this.f88859d;
                    if (completionHandler2 != null) {
                        completionHandler2.onSuccess();
                    }
                }
            }
            it = list2.iterator();
            do {
                c39497e = null;
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Result.m103850isFailureimpl(((Result) next).getValue()));
            result = (Result) next;
            if (result != null) {
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(result.getValue());
            } else {
                thM103847exceptionOrNullimpl = null;
            }
            if (thM103847exceptionOrNullimpl instanceof C39497e) {
                c39497e = (C39497e) thM103847exceptionOrNullimpl;
            }
            completionHandler = this.f88859d;
            if (completionHandler != null) {
                if (c39497e != null) {
                    i11 = c39497e.f87694a;
                } else {
                    i11 = -1;
                }
                if (c39497e != null || (message = c39497e.getMessage()) == null) {
                    message = "Search failed";
                }
                completionHandler.onFailure(i11, message);
            }
        } else {
            it = list2.iterator();
            do {
                c39497e = null;
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Result.m103850isFailureimpl(((Result) next).getValue()));
            result = (Result) next;
            if (result != null) {
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(result.getValue());
            } else {
                thM103847exceptionOrNullimpl = null;
            }
            if (thM103847exceptionOrNullimpl instanceof C39497e) {
                c39497e = (C39497e) thM103847exceptionOrNullimpl;
            }
            completionHandler = this.f88859d;
            if (completionHandler != null) {
                if (c39497e != null) {
                    i11 = c39497e.f87694a;
                } else {
                    i11 = -1;
                }
                if (c39497e != null) {
                    message = "Search failed";
                } else {
                    message = "Search failed";
                }
                completionHandler.onFailure(i11, message);
            }
        }
        return Unit.INSTANCE;
    }
}
