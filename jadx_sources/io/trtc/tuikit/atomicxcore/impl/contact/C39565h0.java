package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.BaseConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.h0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39565h0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87868b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39565h0(C39531G0 c39531g0, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87868b = c39531g0;
        this.f87869c = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39565h0(this.f87868b, this.f87869c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39565h0(this.f87868b, this.f87869c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87867a;
        boolean z11 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87868b;
                long j11 = c39531g0.f87779u;
                if (j11 <= 0) {
                    CompletionHandler completionHandler = this.f87869c;
                    if (completionHandler != null) {
                        completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "No more group members");
                    }
                    return Unit.INSTANCE;
                }
                GroupMemberRole groupMemberRole = c39531g0.f87780v;
                this.f87867a = 1;
                obj = C39531G0.m88258a(c39531g0, groupMemberRole, j11, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List listPlus = CollectionsKt.plus((Collection) this.f87868b.f87769k.getValue(), (Iterable) obj);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listPlus) {
                if (hashSet.add(((GroupMember) obj2).getUserID())) {
                    arrayList.add(obj2);
                }
            }
            this.f87868b.f87769k.setValue(arrayList);
            InterfaceC41669n interfaceC41669n = this.f87868b.f87768j;
            Iterator it = arrayList.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (((GroupMember) next).getRole() != GroupMemberRole.OWNER);
            interfaceC41669n.setValue(next);
            C39531G0 c39531g1 = this.f87868b;
            InterfaceC41669n interfaceC41669n2 = c39531g1.f87775q;
            if (c39531g1.f87779u <= 0) {
                z11 = false;
            }
            interfaceC41669n2.setValue(Boxing.boxBoolean(z11));
            CompletionHandler completionHandler2 = this.f87869c;
            if (completionHandler2 != null) {
                completionHandler2.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler3 = this.f87869c;
            if (completionHandler3 != null) {
                completionHandler3.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
