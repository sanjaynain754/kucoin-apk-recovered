package jumio.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.H */
/* JADX INFO: loaded from: classes61.dex */
public final class C40536H extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f89984a;

    /* JADX INFO: renamed from: b */
    public Object f89985b;

    /* JADX INFO: renamed from: c */
    public int f89986c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f89987d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ EnumC40613W2 f89988e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List f89989f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C40541I f89990g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40536H(EnumC40613W2 enumC40613W2, List list, C40541I c40541i, Continuation continuation) {
        super(2, continuation);
        this.f89988e = enumC40613W2;
        this.f89989f = list;
        this.f89990g = c40541i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40536H c40536h = new C40536H(this.f89988e, this.f89989f, this.f89990g, continuation);
        c40536h.f89987d = obj;
        return c40536h;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40536H) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object objM90345a;
        int i12;
        Object next;
        boolean z11;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f89987d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f89986c;
        int i14 = 1;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            HashMap map = AbstractC40740v2.f90454a;
            EnumC40613W2 plugin = this.f89988e;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            String[] strArr = (String[]) AbstractC40740v2.f90454a.get(plugin);
            if (strArr == null) {
                strArr = new String[0];
            }
            String[] strArr2 = strArr;
            if (strArr2.length == 0) {
                return Boxing.boxBoolean(true);
            }
            ArrayList arrayList = new ArrayList();
            List list = this.f89989f;
            C40541I c40541i = this.f89990g;
            int length = strArr2.length;
            int i15 = 0;
            while (i15 < length) {
                String str = strArr2[i15];
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i12 = i14;
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str2 = ((C40551K) next).f90020a;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    i12 = i14;
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                        break;
                    }
                    i14 = i12;
                }
                C40551K c40551k = (C40551K) next;
                if (c40551k != null) {
                    arrayList.add(C41696j.m91102b(interfaceC41709m0, C41782z0.m91392b(), null, new C40531G(c40541i, c40551k, null), 2, null));
                }
                i15++;
                i14 = i12;
            }
            this.f89987d = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.f89984a = SpillingKt.nullOutSpilledVariable(strArr2);
            this.f89985b = SpillingKt.nullOutSpilledVariable(arrayList);
            i11 = i14;
            this.f89986c = i11;
            objM90345a = AwaitKt.m90345a(arrayList, this);
            if (objM90345a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM90345a = obj;
            i11 = 1;
        }
        List list2 = (List) objM90345a;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!((Boolean) it2.next()).booleanValue()) {
                    z11 = 0;
                }
            }
            z11 = i11;
        } else {
            z11 = i11;
        }
        return Boxing.boxBoolean(z11);
    }
}
