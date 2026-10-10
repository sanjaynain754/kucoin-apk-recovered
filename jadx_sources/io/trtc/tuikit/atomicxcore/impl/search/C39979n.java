package io.trtc.tuikit.atomicxcore.impl.search;

import com.tencent.imsdk.BaseConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.search.SearchOption;
import io.trtc.tuikit.atomicxcore.api.search.SearchType;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.search.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C39979n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88884a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SearchType f88886c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C39981p f88887d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SearchOption f88888e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CompletionHandler f88889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39979n(SearchType searchType, C39981p c39981p, SearchOption searchOption, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f88886c = searchType;
        this.f88887d = c39981p;
        this.f88888e = searchOption;
        this.f88889f = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39979n c39979n = new C39979n(this.f88886c, this.f88887d, this.f88888e, this.f88889f, continuation);
        c39979n.f88885b = obj;
        return c39979n;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39979n) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
    
        if (io.trtc.tuikit.atomicxcore.impl.search.C39981p.m88373a(r1, r10, r7, (p852kotlin.coroutines.jvm.internal.ContinuationImpl) r9) == r0) goto L62;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        CompletionHandler completionHandler;
        Throwable thM103847exceptionOrNullimpl;
        C39497e c39497e;
        String str;
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88884a;
        try {
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                SearchType searchType = this.f88886c;
                C39981p c39981p = this.f88887d;
                SearchOption searchOption = this.f88888e;
                Result.Companion companion = Result.INSTANCE;
                int value = searchType.getValue();
                if (value == SearchType.User.getValue()) {
                    if (((Boolean) c39981p.f88901j.getValue()).booleanValue()) {
                        List list = c39981p.f88893b;
                        this.f88884a = 1;
                        if (C39981p.m88377c(c39981p, list, searchOption, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (value == SearchType.Friend.getValue()) {
                    if (((Boolean) c39981p.f88904m.getValue()).booleanValue()) {
                        throw new C39497e(BaseConstants.ERR_INVALID_PARAMETERS, "Friend search does not support pagination");
                    }
                } else if (value == SearchType.Group.getValue()) {
                    if (((Boolean) c39981p.f88907p.getValue()).booleanValue()) {
                        if (searchOption.isCloudSearch()) {
                            List list2 = c39981p.f88893b;
                            this.f88884a = 2;
                            if (C39981p.m88376b(c39981p, list2, searchOption, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new C39497e(BaseConstants.ERR_INVALID_PARAMETERS, "Local group search does not support pagination");
                        }
                    }
                } else if (value == SearchType.GroupMember.getValue()) {
                    if (((Boolean) c39981p.f88910s.getValue()).booleanValue()) {
                        if (searchOption.isCloudSearch()) {
                            List list3 = c39981p.f88893b;
                            this.f88884a = 3;
                            if (C39981p.m88374a(c39981p, list3, searchOption, (SuspendLambda) this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new C39497e(BaseConstants.ERR_INVALID_PARAMETERS, "Local group member search does not support pagination");
                        }
                    }
                } else if (value == SearchType.Message.getValue()) {
                    if (((Boolean) c39981p.f88913v.getValue()).booleanValue()) {
                        List list4 = c39981p.f88893b;
                        this.f88884a = 4;
                    }
                } else {
                    throw new C39497e(BaseConstants.ERR_INVALID_PARAMETERS, "Invalid search type");
                }
                completionHandler = this.f88889f;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl == null) {
                    if (completionHandler != null) {
                        completionHandler.onSuccess();
                    }
                } else {
                    if (thM103847exceptionOrNullimpl instanceof C39497e) {
                        c39497e = (C39497e) thM103847exceptionOrNullimpl;
                    } else {
                        c39497e = null;
                    }
                    str = "Search more failed";
                    if (c39497e == null) {
                        c39497e = new C39497e(BaseConstants.ERR_INVALID_PARAMETERS, "Search more failed");
                    }
                    if (completionHandler != null) {
                        int i12 = c39497e.f87694a;
                        message = c39497e.getMessage();
                        if (message != null) {
                            str = message;
                        }
                        completionHandler.onFailure(i12, str);
                    }
                }
                return Unit.INSTANCE;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        completionHandler = this.f88889f;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } else {
            if (thM103847exceptionOrNullimpl instanceof C39497e) {
                c39497e = (C39497e) thM103847exceptionOrNullimpl;
            } else {
                c39497e = null;
            }
            str = "Search more failed";
            if (c39497e == null) {
                c39497e = new C39497e(BaseConstants.ERR_INVALID_PARAMETERS, "Search more failed");
            }
            if (completionHandler != null) {
                int i13 = c39497e.f87694a;
                message = c39497e.getMessage();
                if (message != null) {
                    str = message;
                }
                completionHandler.onFailure(i13, str);
            }
        }
        return Unit.INSTANCE;
    }
}
