package com.kubi.assets.filter;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import io.reactivex.functions.Action;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42917g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetFilterHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.filter.AssetFilterHelper$fetchFilterTypeList$1", m90122f = "AssetFilterHelper.kt", m90123i = {}, m90124l = {141}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper$fetchFilterTypeList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,295:1\n25#2:296\n26#2:300\n1#3:297\n19#4,2:298\n*S KotlinDebug\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper$fetchFilterTypeList$1\n*L\n146#1:296\n146#1:300\n146#1:297\n148#1:298,2\n*E\n"})
public final class AssetFilterHelper$fetchFilterTypeList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Action $callBack;
    final /* synthetic */ String $type;
    final /* synthetic */ String $typeKey;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.filter.AssetFilterHelper$fetchFilterTypeList$1$1 */
    /* JADX INFO: compiled from: AssetFilterHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.filter.AssetFilterHelper$fetchFilterTypeList$1$1", m90122f = "AssetFilterHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper$fetchFilterTypeList$1$1\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,295:1\n19#2,2:296\n*S KotlinDebug\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper$fetchFilterTypeList$1$1\n*L\n142#1:296,2\n*E\n"})
    public static final class C99251 extends SuspendLambda implements Function2<Map<String, ? extends String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Action $callBack;
        final /* synthetic */ String $typeKey;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends String> map, Continuation<? super Unit> continuation) {
            return invoke2((Map<String, String>) map, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C99251(String str, Action action, Continuation<? super C99251> continuation) {
            super(2, continuation);
            this.$typeKey = str;
            this.$callBack = action;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99251 c99251 = new C99251(this.$typeKey, this.$callBack, continuation);
            c99251.L$0 = obj;
            return c99251;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<String, String> map, Continuation<? super Unit> continuation) {
            return ((C99251) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Map map = (Map) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final String str = this.$typeKey;
            final Action action = this.$callBack;
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.filter.h
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AssetFilterHelper$fetchFilterTypeList$1.C99251.m16590f(str, map, action);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m16590f(String str, Map map, Action action) throws Exception {
            AssetFilterHelper.f17337c.put(str, map);
            if (action != null) {
                action.run();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFilterHelper$fetchFilterTypeList$1(String str, String str2, Action action, Continuation<? super AssetFilterHelper$fetchFilterTypeList$1> continuation) {
        super(2, continuation);
        this.$type = str;
        this.$typeKey = str2;
        this.$callBack = action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m16588f(Action action) throws Exception {
        if (action != null) {
            action.run();
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetFilterHelper$fetchFilterTypeList$1(this.$type, this.$typeKey, this.$callBack, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetFilterHelper$fetchFilterTypeList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM16583k = AssetFilterHelper.f17335a.m16583k(this.$type);
            C99251 c99251 = new C99251(this.$typeKey, this.$callBack, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM16583k, false, c99251, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        final Action action = this.$callBack;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            throwable.printStackTrace();
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.filter.g
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AssetFilterHelper$fetchFilterTypeList$1.m16588f(action);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
