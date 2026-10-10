package com.kubi.kucoin.token;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TokenLifecycleManager.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.token.TokenLifecycleManager$getOrCreateRefresh$1", m90122f = "TokenLifecycleManager.kt", m90123i = {0, 0, 0}, m90124l = {580}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-TokenLifecycleManager$getOrCreateRefresh$1$completedResult$1"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nTokenLifecycleManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenLifecycleManager.kt\ncom/kubi/kucoin/token/TokenLifecycleManager$getOrCreateRefresh$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1488:1\n1#2:1489\n774#3:1490\n865#3,2:1491\n1563#3:1493\n1634#3,3:1494\n1869#3,2:1497\n*S KotlinDebug\n*F\n+ 1 TokenLifecycleManager.kt\ncom/kubi/kucoin/token/TokenLifecycleManager$getOrCreateRefresh$1\n*L\n595#1:1490\n595#1:1491,2\n596#1:1493\n596#1:1494,3\n597#1:1497,2\n*E\n"})
public final class TokenLifecycleManager$getOrCreateRefresh$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<TokenLifecycleManager.RefreshMonitorContext> $createdMonitorContext;
    final /* synthetic */ Ref.LongRef $createdTaskGeneration;
    final /* synthetic */ String $expiredToken;
    final /* synthetic */ InterfaceC41729r0<TokenLifecycleRefreshResult> $task;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLifecycleManager$getOrCreateRefresh$1(InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0, Ref.ObjectRef<TokenLifecycleManager.RefreshMonitorContext> objectRef, Ref.LongRef longRef, String str, Continuation<? super TokenLifecycleManager$getOrCreateRefresh$1> continuation) {
        super(2, continuation);
        this.$task = interfaceC41729r0;
        this.$createdMonitorContext = objectRef;
        this.$createdTaskGeneration = longRef;
        this.$expiredToken = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenLifecycleManager$getOrCreateRefresh$1 tokenLifecycleManager$getOrCreateRefresh$1 = new TokenLifecycleManager$getOrCreateRefresh$1(this.$task, this.$createdMonitorContext, this.$createdTaskGeneration, this.$expiredToken, continuation);
        tokenLifecycleManager$getOrCreateRefresh$1.L$0 = obj;
        return tokenLifecycleManager$getOrCreateRefresh$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TokenLifecycleManager$getOrCreateRefresh$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM103844constructorimpl;
        String string;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r0 = this.$task;
                Result.Companion companion = Result.INSTANCE;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                obj = interfaceC41729r0.mo91198h(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((TokenLifecycleRefreshResult) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        TokenLifecycleRefreshResult tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) objM103844constructorimpl;
        TokenLifecycleManager.f28424a.m32927S(this.$task, tokenLifecycleRefreshResult, this.$createdMonitorContext.element);
        Object obj2 = TokenLifecycleManager.f28431h;
        Ref.LongRef longRef = this.$createdTaskGeneration;
        String str = this.$expiredToken;
        final InterfaceC41729r0<TokenLifecycleRefreshResult> interfaceC41729r1 = this.$task;
        synchronized (obj2) {
            if (tokenLifecycleRefreshResult != null) {
                try {
                    String accessToken = tokenLifecycleRefreshResult.getAccessToken();
                    if (accessToken != null) {
                        string = StringsKt.trim((CharSequence) accessToken).toString();
                    } else {
                        string = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            if (longRef.element == TokenLifecycleManager.f28433j) {
                if (Intrinsics.areEqual(tokenLifecycleRefreshResult != null ? tokenLifecycleRefreshResult.getResult() : null, "success") && string.length() > 0 && !Intrinsics.areEqual(string, str)) {
                    Set setEntrySet = TokenLifecycleManager.f28428e.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : setEntrySet) {
                        if (((Map.Entry) obj3).getValue() == interfaceC41729r1) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((String) ((Map.Entry) it.next()).getKey());
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        TokenLifecycleManager.f28424a.m32935a0((String) it2.next(), string);
                    }
                }
            }
            CollectionsKt.removeAll(TokenLifecycleManager.f28428e.entrySet(), new Function1() { // from class: com.kubi.kucoin.token.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return Boolean.valueOf(TokenLifecycleManager$getOrCreateRefresh$1.m32994g(interfaceC41729r1, (Map.Entry) obj4));
                }
            });
            TokenLifecycleManager.f28429f.remove(interfaceC41729r1);
            CollectionsKt.removeAll(TokenLifecycleManager.f28430g.entrySet(), new Function1() { // from class: com.kubi.kucoin.token.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return Boolean.valueOf(TokenLifecycleManager$getOrCreateRefresh$1.m32995h(interfaceC41729r1, (Map.Entry) obj4));
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m32994g(InterfaceC41729r0 interfaceC41729r0, Map.Entry entry) {
        if (entry.getValue() == interfaceC41729r0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m32995h(InterfaceC41729r0 interfaceC41729r0, Map.Entry entry) {
        if (((TokenLifecycleManager.BlockingRefreshBarrier) entry.getValue()).m32959e() == interfaceC41729r0) {
            return true;
        }
        return false;
    }
}
