package kotlinx.serialization.json.internal;

import kotlinx.serialization.json.JsonElement;
import p852kotlin.DeepRecursiveScope;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "it"}, m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m90122f = "JsonTreeReader.kt", m90123i = {}, m90124l = {115}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, Continuation<? super JsonTreeReader$readDeepRecursive$1> continuation) {
        super(3, continuation);
        this.this$0 = jsonTreeReader;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(DeepRecursiveScope<Unit, JsonElement> deepRecursiveScope, Unit unit, Continuation<? super JsonElement> continuation) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, continuation);
        jsonTreeReader$readDeepRecursive$1.L$0 = deepRecursiveScope;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.L$0;
            byte bMo91819F = this.this$0.lexer.mo91819F();
            if (bMo91819F == 1) {
                return this.this$0.m91808j(true);
            }
            if (bMo91819F == 0) {
                return this.this$0.m91808j(false);
            }
            if (bMo91819F == 6) {
                JsonTreeReader jsonTreeReader = this.this$0;
                this.label = 1;
                obj = jsonTreeReader.m91806h(deepRecursiveScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (bMo91819F == 8) {
                    return this.this$0.m91804f();
                }
                JsonReader.m91812x(this.this$0.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (JsonElement) obj;
    }
}
