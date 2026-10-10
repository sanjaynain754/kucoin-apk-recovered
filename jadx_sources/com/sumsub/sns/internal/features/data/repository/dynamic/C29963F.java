package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.internal.core.common.AbstractC28423V;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29954b;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29963F extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public Map f60177a;

    /* JADX INFO: renamed from: b */
    public int f60178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29963F(C29967J c29967j, Continuation continuation) {
        super(3, continuation);
        this.f60179c = c29967j;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C29963F(this.f60179c, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102 A[LOOP:0: B:43:0x00fc->B:45:0x0102, LOOP_END] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        List list;
        SNSInitConfig conf;
        Map<String, String> strings;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60178b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        map = this.f60177a;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        conf = C28468k0.f57983a.getConf();
                        if (conf == null) {
                            conf = new SNSInitConfig((String) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
                        }
                        strings = conf.getStrings();
                        if (strings != null) {
                            for (Map.Entry<String, String> entry : strings.entrySet()) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                        return new C29983l(list, map);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = this.f60177a;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                conf = C28468k0.f57983a.getConf();
                if (conf == null) {
                    conf = new SNSInitConfig((String) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
                }
                strings = conf.getStrings();
                if (strings != null) {
                    while (r1.hasNext()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                return new C29983l(list, map);
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Set set = AbstractC28423V.f57933a;
            String strM69307a = AbstractC28423V.m69307a(C28468k0.f57987e);
            InterfaceC29954b interfaceC29954b = this.f60179c.f60193a;
            this.f60178b = 1;
            obj = interfaceC29954b.m70028a(strM69307a, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : ((Map) obj).entrySet()) {
            if (entry2.getValue() instanceof String) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            arrayList.add(TuplesKt.m90091to(entry3.getKey(), (String) entry3.getValue()));
        }
        Map mutableMap = MapsKt.toMutableMap(MapsKt.toMap(arrayList));
        if (C33048a.f67439B.m71434a()) {
            C29986o c29986o = C29967J.f60191m;
            InterfaceC29954b interfaceC29954b2 = this.f60179c.f60193a;
            this.f60177a = mutableMap;
            this.f60178b = 2;
            Object objM70063a = c29986o.m70063a(interfaceC29954b2, this);
            if (objM70063a != coroutine_suspended) {
                map = mutableMap;
                obj = objM70063a;
                list = (List) obj;
                conf = C28468k0.f57983a.getConf();
                if (conf == null) {
                    conf = new SNSInitConfig((String) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
                }
                strings = conf.getStrings();
                if (strings != null) {
                    while (r1.hasNext()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                return new C29983l(list, map);
            }
        } else {
            InterfaceC29954b interfaceC29954b3 = this.f60179c.f60193a;
            this.f60177a = mutableMap;
            this.f60178b = 3;
            Object objM70032c = interfaceC29954b3.m70032c(this);
            if (objM70032c != coroutine_suspended) {
                map = mutableMap;
                obj = objM70032c;
                list = (List) obj;
                conf = C28468k0.f57983a.getConf();
                if (conf == null) {
                    conf = new SNSInitConfig((String) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
                }
                strings = conf.getStrings();
                if (strings != null) {
                    while (r1.hasNext()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                return new C29983l(list, map);
            }
        }
        return coroutine_suspended;
    }
}
