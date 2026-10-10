package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.J0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28067J0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28073M0 f57245b;

    /* JADX INFO: renamed from: a */
    public static final C28150t0 m69060a(AbstractC28073M0 abstractC28073M0, C28150t0 c28150t0) {
        return C28150t0.m69088a(c28150t0, false, abstractC28073M0.getStrings().m70061a("sns_general_poweredBy"), abstractC28073M0.getStrings().m70061a("sns_general_progress_text"), 5);
    }

    /* JADX INFO: renamed from: b */
    public static final C28150t0 m69063b(C28150t0 c28150t0) {
        return C28150t0.m69088a(c28150t0, false, null, null, 30);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r12 == r2) goto L38;
     */
    /* JADX WARN: Type inference failed for: r12v33, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.util.Map] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC28147s defaultState;
        AbstractC28073M0 abstractC28073M0;
        Pair pairM90091to;
        final boolean zBooleanValue = false;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57244a;
        Object obj2 = null;
        bool = null;
        Boolean bool = null;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this.f57245b), "Lifecycle: Preparing view model", null);
                C28059F0 c28059f0 = new C28059F0(this.f57245b, null);
                this.f57244a = 1;
                obj = TimeoutKt.m90469d(AbstractC28073M0.DEFAULT_TIMEOUT, c28059f0, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    if (CollectionsKt.firstOrNull((List) this.f57245b._viewState.mo86421a()) == null || (defaultState = this.f57245b.getDefaultState()) == null) {
                        InterfaceC41669n interfaceC41669n = this.f57245b._viewModelInternalState;
                        final AbstractC28073M0 abstractC28073M1 = this.f57245b;
                        interfaceC41669n.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.a1
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return C28067J0.m69060a(abstractC28073M1, (C28150t0) obj3);
                            }
                        }.invoke(interfaceC41669n.getValue()));
                        abstractC28073M0 = this.f57245b;
                        this.f57244a = 4;
                        if (abstractC28073M0.onPrepare(this) != coroutine_suspended) {
                            InterfaceC41669n interfaceC41669n2 = this.f57245b._viewModelInternalState;
                            interfaceC41669n2.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.b1
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return C28067J0.m69061a((C28150t0) obj3);
                                }
                            }.invoke(interfaceC41669n2.getValue()));
                            C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this.f57245b), "Lifecycle: ViewModel prepared", null);
                            InterfaceC29953a interfaceC29953a = this.f57245b.commonRepository;
                            this.f57244a = 5;
                            obj = ((C29957e) interfaceC29953a).m70035a(this);
                        }
                    } else {
                        InterfaceC41668m interfaceC41668m = this.f57245b._viewState;
                        this.f57244a = 3;
                        if (interfaceC41668m.emit(defaultState, this) != coroutine_suspended) {
                            InterfaceC41669n interfaceC41669n3 = this.f57245b._viewModelInternalState;
                            final AbstractC28073M0 abstractC28073M2 = this.f57245b;
                            interfaceC41669n3.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.a1
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return C28067J0.m69060a(abstractC28073M2, (C28150t0) obj3);
                                }
                            }.invoke(interfaceC41669n3.getValue()));
                            abstractC28073M0 = this.f57245b;
                            this.f57244a = 4;
                            if (abstractC28073M0.onPrepare(this) != coroutine_suspended) {
                                InterfaceC41669n interfaceC41669n4 = this.f57245b._viewModelInternalState;
                                interfaceC41669n4.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.b1
                                    @Override // p852kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return C28067J0.m69061a((C28150t0) obj3);
                                    }
                                }.invoke(interfaceC41669n4.getValue()));
                                C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this.f57245b), "Lifecycle: ViewModel prepared", null);
                                InterfaceC29953a interfaceC29953a2 = this.f57245b.commonRepository;
                                this.f57244a = 5;
                                obj = ((C29957e) interfaceC29953a2).m70035a(this);
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 3) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41669n interfaceC41669n5 = this.f57245b._viewModelInternalState;
                    final AbstractC28073M0 abstractC28073M3 = this.f57245b;
                    interfaceC41669n5.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.a1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return C28067J0.m69060a(abstractC28073M3, (C28150t0) obj3);
                        }
                    }.invoke(interfaceC41669n5.getValue()));
                    abstractC28073M0 = this.f57245b;
                    this.f57244a = 4;
                    if (abstractC28073M0.onPrepare(this) != coroutine_suspended) {
                        InterfaceC41669n interfaceC41669n6 = this.f57245b._viewModelInternalState;
                        interfaceC41669n6.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.b1
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return C28067J0.m69061a((C28150t0) obj3);
                            }
                        }.invoke(interfaceC41669n6.getValue()));
                        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this.f57245b), "Lifecycle: ViewModel prepared", null);
                        InterfaceC29953a interfaceC29953a3 = this.f57245b.commonRepository;
                        this.f57244a = 5;
                        obj = ((C29957e) interfaceC29953a3).m70035a(this);
                    }
                    return coroutine_suspended;
                }
                if (i11 == 4) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41669n interfaceC41669n7 = this.f57245b._viewModelInternalState;
                    interfaceC41669n7.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.b1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return C28067J0.m69061a((C28150t0) obj3);
                        }
                    }.invoke(interfaceC41669n7.getValue()));
                    C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this.f57245b), "Lifecycle: ViewModel prepared", null);
                    InterfaceC29953a interfaceC29953a4 = this.f57245b.commonRepository;
                    this.f57244a = 5;
                    obj = ((C29957e) interfaceC29953a4).m70035a(this);
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            ?? r12 = (Map) obj;
            if (r12 != 0) {
                List listSplit$default = StringsKt.split$default((CharSequence) "minimalisticUi", new char[]{(char) 47}, false, 0, 6, (Object) null);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = r12;
                Iterator<Integer> it = RangesKt.until(0, listSplit$default.size() - 1).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Object obj3 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                        if (obj3 instanceof Boolean) {
                            obj2 = obj3;
                        }
                        bool = (Boolean) obj2;
                        break;
                    }
                    Object obj4 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it).nextInt()));
                    Map map = obj4 instanceof Map ? (Map) obj4 : null;
                    if (map == null) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (!(key instanceof String)) {
                            key = null;
                        }
                        String str = (String) key;
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value == null) {
                                value = null;
                            }
                            if (value != null) {
                                pairM90091to = TuplesKt.m90091to(str, value);
                            }
                            if (pairM90091to != null) {
                                arrayList.add(pairM90091to);
                            }
                        }
                        pairM90091to = null;
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    ?? map2 = MapsKt.toMap(arrayList);
                    if (map2 == 0) {
                        break;
                    }
                    objectRef.element = map2;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            InterfaceC41669n interfaceC41669n8 = this.f57245b._viewModelInternalState;
            interfaceC41669n8.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.c1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return C28067J0.m69062a(zBooleanValue, (C28150t0) obj5);
                }
            }.invoke(interfaceC41669n8.getValue()));
            return Unit.INSTANCE;
            if (((SNSSDKState) obj) == null) {
                throw new IllegalStateException("SDK prepare timeout");
            }
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            C28065I0 c28065i0 = new C28065I0(this.f57245b, null);
            this.f57244a = 2;
            if (C41686h.m91049g(abstractC41697j0M91392b, c28065i0, this) != coroutine_suspended) {
                if (CollectionsKt.firstOrNull((List) this.f57245b._viewState.mo86421a()) == null) {
                    InterfaceC41669n interfaceC41669n9 = this.f57245b._viewModelInternalState;
                    final AbstractC28073M0 abstractC28073M4 = this.f57245b;
                    interfaceC41669n9.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.a1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return C28067J0.m69060a(abstractC28073M4, (C28150t0) obj5);
                        }
                    }.invoke(interfaceC41669n9.getValue()));
                    abstractC28073M0 = this.f57245b;
                    this.f57244a = 4;
                    if (abstractC28073M0.onPrepare(this) != coroutine_suspended) {
                        InterfaceC41669n interfaceC41669n10 = this.f57245b._viewModelInternalState;
                        interfaceC41669n10.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.b1
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                return C28067J0.m69061a((C28150t0) obj5);
                            }
                        }.invoke(interfaceC41669n10.getValue()));
                        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this.f57245b), "Lifecycle: ViewModel prepared", null);
                        InterfaceC29953a interfaceC29953a5 = this.f57245b.commonRepository;
                        this.f57244a = 5;
                        obj = ((C29957e) interfaceC29953a5).m70035a(this);
                    }
                } else {
                    InterfaceC41669n interfaceC41669n11 = this.f57245b._viewModelInternalState;
                    final AbstractC28073M0 abstractC28073M5 = this.f57245b;
                    interfaceC41669n11.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.a1
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return C28067J0.m69060a(abstractC28073M5, (C28150t0) obj5);
                        }
                    }.invoke(interfaceC41669n11.getValue()));
                    abstractC28073M0 = this.f57245b;
                    this.f57244a = 4;
                    if (abstractC28073M0.onPrepare(this) != coroutine_suspended) {
                        InterfaceC41669n interfaceC41669n12 = this.f57245b._viewModelInternalState;
                        interfaceC41669n12.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.b1
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                return C28067J0.m69061a((C28150t0) obj5);
                            }
                        }.invoke(interfaceC41669n12.getValue()));
                        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(this.f57245b), "Lifecycle: ViewModel prepared", null);
                        InterfaceC29953a interfaceC29953a6 = this.f57245b.commonRepository;
                        this.f57244a = 5;
                        obj = ((C29957e) interfaceC29953a6).m70035a(this);
                    }
                }
            }
            return coroutine_suspended;
        } catch (Exception unused) {
            InterfaceC41669n interfaceC41669n13 = this.f57245b._viewModelInternalState;
            interfaceC41669n13.setValue(new Function1() { // from class: com.sumsub.sns.core.presentation.base.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return C28067J0.m69063b((C28150t0) obj5);
                }
            }.invoke(interfaceC41669n13.getValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28067J0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(2, continuation);
        this.f57245b = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28067J0(this.f57245b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28067J0(this.f57245b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static final C28150t0 m69061a(C28150t0 c28150t0) {
        return C28150t0.m69088a(c28150t0, false, null, null, 27);
    }

    /* JADX INFO: renamed from: a */
    public static final C28150t0 m69062a(boolean z11, C28150t0 c28150t0) {
        return C28150t0.m69088a(c28150t0, z11, null, null, 30);
    }
}
