package io.trtc.tuikit.atomicxcore.impl.conversation;

import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.O */
/* JADX INFO: loaded from: classes61.dex */
public final class C39616O extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f88002a;

    /* JADX INFO: renamed from: b */
    public int f88003b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f88004c;

    public C39616O(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C39616O c39616o = new C39616O(continuation);
        c39616o.f88004c = obj;
        return c39616o;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C39616O c39616o = new C39616O((Continuation) obj2);
        c39616o.f88004c = (InterfaceC41709m0) obj;
        return c39616o.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb A[LOOP:0: B:25:0x00c5->B:27:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00fa A[LOOP:1: B:29:0x00f4->B:31:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0129 A[LOOP:2: B:33:0x0123->B:35:0x0129, LOOP_END] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0;
        InterfaceC41729r0 interfaceC41729r1;
        List list;
        InterfaceC41729r0 interfaceC41729r2;
        List list2;
        Object objMo91198h;
        List list3;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f88003b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        list3 = (List) this.f88002a;
                        list = (List) this.f88004c;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    list = (List) this.f88002a;
                    interfaceC41729r2 = (InterfaceC41729r0) this.f88004c;
                    ResultKt.throwOnFailure(obj);
                    list2 = (List) obj;
                    this.f88004c = list;
                    this.f88002a = list2;
                    this.f88003b = 3;
                    objMo91198h = interfaceC41729r2.mo91198h(this);
                    if (objMo91198h != coroutine_suspended) {
                        list3 = list2;
                        obj = objMo91198h;
                    }
                    return coroutine_suspended;
                }
            } else {
                interfaceC41729r0 = (InterfaceC41729r0) this.f88002a;
                interfaceC41729r1 = (InterfaceC41729r0) this.f88004c;
                ResultKt.throwOnFailure(obj);
            }
            List list4 = (List) obj;
            ConcurrentHashMap concurrentHashMap = C39617P.f88006b;
            concurrentHashMap.clear();
            C39617P.f88007c.clear();
            C39617P.f88008d.clear();
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj2 : list) {
                linkedHashMap.put(((ConversationInfo) obj2).getConversationID(), obj2);
            }
            concurrentHashMap.putAll(linkedHashMap);
            ConcurrentHashMap concurrentHashMap2 = C39617P.f88007c;
            linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
            for (Object obj3 : list3) {
                linkedHashMap2.put(((ConversationInfo) obj3).getConversationID(), obj3);
            }
            concurrentHashMap2.putAll(linkedHashMap2);
            ConcurrentHashMap concurrentHashMap3 = C39617P.f88008d;
            linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
            for (Object obj4 : list4) {
                linkedHashMap3.put(((ConversationInfo) obj4).getConversationID(), obj4);
            }
            concurrentHashMap3.putAll(linkedHashMap3);
            return Boxing.boxBoolean(C39617P.f88013i.mo90855d(Unit.INSTANCE));
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f88004c;
        InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new C39614M(null), 3, null);
        InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new C39613L(null), 3, null);
        InterfaceC41729r0 interfaceC41729r0M91102b3 = C41696j.m91102b(interfaceC41709m0, null, null, new C39615N(null), 3, null);
        this.f88004c = interfaceC41729r0M91102b2;
        this.f88002a = interfaceC41729r0M91102b3;
        this.f88003b = 1;
        Object objMo91198h2 = interfaceC41729r0M91102b.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            interfaceC41729r0 = interfaceC41729r0M91102b3;
            obj = objMo91198h2;
            interfaceC41729r1 = interfaceC41729r0M91102b2;
        }
        return coroutine_suspended;
        List list5 = (List) obj;
        this.f88004c = interfaceC41729r0;
        this.f88002a = list5;
        this.f88003b = 2;
        Object objMo91198h3 = interfaceC41729r1.mo91198h(this);
        if (objMo91198h3 != coroutine_suspended) {
            InterfaceC41729r0 interfaceC41729r3 = interfaceC41729r0;
            list = list5;
            obj = objMo91198h3;
            interfaceC41729r2 = interfaceC41729r3;
            list2 = (List) obj;
            this.f88004c = list;
            this.f88002a = list2;
            this.f88003b = 3;
            objMo91198h = interfaceC41729r2.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                list3 = list2;
                obj = objMo91198h;
                List list6 = (List) obj;
                ConcurrentHashMap concurrentHashMap4 = C39617P.f88006b;
                concurrentHashMap4.clear();
                C39617P.f88007c.clear();
                C39617P.f88008d.clear();
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                while (r1.hasNext()) {
                    linkedHashMap.put(((ConversationInfo) obj2).getConversationID(), obj2);
                }
                concurrentHashMap4.putAll(linkedHashMap);
                ConcurrentHashMap concurrentHashMap5 = C39617P.f88007c;
                linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                while (r0.hasNext()) {
                    linkedHashMap2.put(((ConversationInfo) obj3).getConversationID(), obj3);
                }
                concurrentHashMap5.putAll(linkedHashMap2);
                ConcurrentHashMap concurrentHashMap6 = C39617P.f88008d;
                linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list6, 10)), 16));
                while (r14.hasNext()) {
                    linkedHashMap3.put(((ConversationInfo) obj4).getConversationID(), obj4);
                }
                concurrentHashMap6.putAll(linkedHashMap3);
                return Boxing.boxBoolean(C39617P.f88013i.mo90855d(Unit.INSTANCE));
            }
        }
        return coroutine_suspended;
    }
}
