package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.core.util.JsonUtilKt;
import jumio.core.C40526F;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.Charsets;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: jumio.core.F */
/* JADX INFO: loaded from: classes61.dex */
public final class C40526F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40541I f89958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40526F(C40541I c40541i, Continuation continuation) {
        super(2, continuation);
        this.f89958b = c40541i;
    }

    /* JADX INFO: renamed from: a */
    public static final C40551K m89157a(JSONObject jSONObject) {
        return C40551K.f90019d.fromJson(jSONObject);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40526F c40526f = new C40526F(this.f89958b, continuation);
        c40526f.f89957a = obj;
        return c40526f;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40526F c40526f = new C40526F(this.f89958b, (Continuation) obj2);
        c40526f.f89957a = (InterfaceC41709m0) obj;
        return c40526f.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JSONArray jSONArray;
        String value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C40541I c40541i = this.f89958b;
        c40541i.f90006b.setListener(new C40521E(c40541i));
        byte[] bArrStartSync = this.f89958b.f90006b.startSync();
        if (bArrStartSync != null) {
            try {
                jSONArray = new JSONArray(new String(bArrStartSync, Charsets.UTF_8));
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            return JsonUtilKt.map(jSONArray, new Function1() { // from class: lg0.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C40526F.m89157a((JSONObject) obj2);
                }
            });
        }
        StringBuilder sb2 = new StringBuilder("Problem loading preload configuration for version ");
        MatchResult matchResultFind$default = Regex.find$default(AbstractC40546J.f90014a, "4.17.0 (1)", 0, 2, null);
        if (matchResultFind$default == null || (value = matchResultFind$default.getValue()) == null) {
            value = "";
        }
        sb2.append(value);
        sb2.append(". Please ensure the file exists!");
        Log.m14484w("CDNModelPreloader", sb2.toString());
        return null;
    }
}
