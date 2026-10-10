package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.d0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39557d0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ GroupMemberRole f87849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f87850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39557d0(C39531G0 c39531g0, GroupMemberRole groupMemberRole, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87848b = c39531g0;
        this.f87849c = groupMemberRole;
        this.f87850d = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39557d0(this.f87848b, this.f87849c, this.f87850d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39557d0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87847a;
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
                C39531G0 c39531g0 = this.f87848b;
                c39531g0.f87779u = 0L;
                GroupMemberRole groupMemberRole = this.f87849c;
                c39531g0.f87780v = groupMemberRole;
                this.f87847a = 1;
                obj = C39531G0.m88258a(c39531g0, groupMemberRole, 0L, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                if (hashSet.add(((GroupMember) obj2).getUserID())) {
                    arrayList.add(obj2);
                }
            }
            this.f87848b.f87769k.setValue(arrayList);
            InterfaceC41669n interfaceC41669n = this.f87848b.f87768j;
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
            C39531G0 c39531g1 = this.f87848b;
            InterfaceC41669n interfaceC41669n2 = c39531g1.f87775q;
            if (c39531g1.f87779u <= 0) {
                z11 = false;
            }
            interfaceC41669n2.setValue(Boxing.boxBoolean(z11));
            CompletionHandler completionHandler = this.f87850d;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87850d;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
