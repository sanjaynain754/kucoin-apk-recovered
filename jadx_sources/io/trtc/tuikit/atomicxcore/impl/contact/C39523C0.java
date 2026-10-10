package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.impl.common.C39497e;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.C0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39523C0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f87727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39531G0 f87728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87729c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f87730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39523C0(C39531G0 c39531g0, String str, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f87728b = c39531g0;
        this.f87729c = str;
        this.f87730d = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39523C0(this.f87728b, this.f87729c, this.f87730d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39523C0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f87727a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C39531G0 c39531g0 = this.f87728b;
                String str = this.f87729c;
                this.f87727a = 1;
                if (C39531G0.m88264a(c39531g0, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f87728b.f87771m.setValue(this.f87729c);
            C39531G0 c39531g1 = this.f87728b;
            InterfaceC41669n interfaceC41669n = c39531g1.f87769k;
            String str2 = this.f87729c;
            do {
                value = interfaceC41669n.getValue();
                List<GroupMember> list = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (GroupMember groupMemberCopy$default : list) {
                    if (Intrinsics.areEqual(groupMemberCopy$default.getUserID(), C39531G0.m88272a(c39531g1))) {
                        groupMemberCopy$default = GroupMember.copy$default(groupMemberCopy$default, null, null, null, str2, null, 0L, 55, null);
                    }
                    arrayList.add(groupMemberCopy$default);
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
            CompletionHandler completionHandler = this.f87730d;
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        } catch (C39497e e11) {
            CompletionHandler completionHandler2 = this.f87730d;
            if (completionHandler2 != null) {
                completionHandler2.onFailure(e11.f87694a, e11.f87695b);
            }
        }
        return Unit.INSTANCE;
    }
}
