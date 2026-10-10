package io.flutter.plugins.sharedpreferences;

import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/util/Map;"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getKeys$prefs$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {248}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SharedPreferencesPlugin$getKeys$prefs$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Map<String, ? extends Object>>, Object> {
    final /* synthetic */ List<String> $allowList;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getKeys$prefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, List<String> list, Continuation<? super SharedPreferencesPlugin$getKeys$prefs$1> continuation) {
        super(2, continuation);
        this.this$0 = sharedPreferencesPlugin;
        this.$allowList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SharedPreferencesPlugin$getKeys$prefs$1(this.this$0, this.$allowList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, ? extends Object>> continuation) {
        return ((SharedPreferencesPlugin$getKeys$prefs$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
        List<String> list = this.$allowList;
        this.label = 1;
        Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
        if (prefs == coroutine_suspended) {
            return coroutine_suspended;
        }
        return prefs;
    }
}
