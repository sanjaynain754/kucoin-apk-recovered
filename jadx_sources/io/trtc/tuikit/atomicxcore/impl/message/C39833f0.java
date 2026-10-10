package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchDirection;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchOption;
import java.util.ArrayList;
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
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.f0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39833f0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f88504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MessageFetchOption f88505c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f88506d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f88507e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C39829d0 f88508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39833f0(C39857r0 c39857r0, Ref.ObjectRef objectRef, MessageFetchOption messageFetchOption, Ref.ObjectRef objectRef2, ArrayList arrayList, C39829d0 c39829d0, Continuation continuation) {
        super(2, continuation);
        this.f88503a = c39857r0;
        this.f88504b = objectRef;
        this.f88505c = messageFetchOption;
        this.f88506d = objectRef2;
        this.f88507e = arrayList;
        this.f88508f = c39829d0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39833f0(this.f88503a, this.f88504b, this.f88505c, this.f88506d, this.f88507e, this.f88508f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C39833f0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41669n interfaceC41669n = this.f88503a.f88592f;
        boolean z12 = false;
        if (((List) this.f88504b.element).size() >= this.f88505c.getPageCount()) {
            z11 = true;
        } else {
            z11 = false;
        }
        interfaceC41669n.setValue(Boxing.boxBoolean(z11));
        InterfaceC41669n interfaceC41669n2 = this.f88503a.f88593g;
        if (((List) this.f88506d.element).size() >= this.f88505c.getPageCount()) {
            z12 = true;
        }
        interfaceC41669n2.setValue(Boxing.boxBoolean(z12));
        this.f88503a.f88591e.setValue(this.f88507e);
        if (!this.f88507e.isEmpty()) {
            this.f88503a.m88337a(new MessageEvent.FetchMessages(this.f88507e, MessageFetchDirection.BOTH));
        }
        this.f88508f.onSuccess();
        return Unit.INSTANCE;
    }
}
