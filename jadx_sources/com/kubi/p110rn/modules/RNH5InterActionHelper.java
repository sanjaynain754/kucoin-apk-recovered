package com.kubi.p110rn.modules;

import com.kubi.p110rn.RNConstantKt;
import com.kubi.sdk.util.C24267r0;
import com.kubi.web.api.IWebService;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RNH5InterActionHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J0\u0010\u000e\u001a\u00020\n2&\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\bH\u0007J\b\u0010\u0010\u001a\u00020\nH\u0007J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002R.\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/rn/modules/RNH5InterActionHelper;", "", "<init>", "()V", "disposableMap", "Ljava/util/HashMap;", "", "Lio/reactivex/disposables/Disposable;", "Lkotlin/collections/HashMap;", "registerDisposable", "", "eventName", "disposable", "unRegisterDisposable", RNH5InterActionHelperKt.EVENT_NAME_FROM_RN, "paramMap", "release", "disposeTarget", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNH5InterActionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNH5InterActionHelper.kt\ncom/kubi/rn/modules/RNH5InterActionHelper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,91:1\n47#2,4:92\n216#3,2:96\n*S KotlinDebug\n*F\n+ 1 RNH5InterActionHelper.kt\ncom/kubi/rn/modules/RNH5InterActionHelper\n*L\n38#1:92,4\n53#1:96,2\n*E\n"})
public final class RNH5InterActionHelper {

    @NotNull
    public static final RNH5InterActionHelper INSTANCE = new RNH5InterActionHelper();

    @NotNull
    private static final HashMap<String, Disposable> disposableMap = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.rn.modules.RNH5InterActionHelper$onInterCommunicateFromRN$2 */
    /* JADX INFO: compiled from: RNH5InterActionHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.modules.RNH5InterActionHelper$onInterCommunicateFromRN$2", m90122f = "RNH5InterActionHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nRNH5InterActionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNH5InterActionHelper.kt\ncom/kubi/rn/modules/RNH5InterActionHelper$onInterCommunicateFromRN$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n216#2,2:92\n1#3:94\n*S KotlinDebug\n*F\n+ 1 RNH5InterActionHelper.kt\ncom/kubi/rn/modules/RNH5InterActionHelper$onInterCommunicateFromRN$2\n*L\n43#1:92,2\n*E\n"})
    public static final class C235702 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ HashMap<String, Object> $paramMap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C235702(HashMap<String, Object> map, Continuation<? super C235702> continuation) {
            super(2, continuation);
            this.$paramMap = map;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235702(this.$paramMap, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C235702) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM103844constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap<String, Object> map = this.$paramMap;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    IWebService.f54644a.get().mo36738a(RNH5InterActionHelperKt.EVENT_NAME_FROM_RN);
                    C44128b.m97266j(RNConstantKt.LOG_TAG, "RN通知H5: " + string);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C24267r0.m58519c(thM103847exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void disposeTarget(Disposable disposable) {
        if (disposable == null || disposable.getDisposed()) {
            return;
        }
        disposable.dispose();
    }

    @JvmStatic
    public static final void onInterCommunicateFromRN(@NotNull HashMap<String, Object> paramMap) {
        Intrinsics.checkNotNullParameter(paramMap, "paramMap");
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("RN通知H5").plus(C42911a.m94121c()).plus(new C23569xc7ee629e(CoroutineExceptionHandler.INSTANCE))), null, null, new C235702(paramMap, null), 3, null);
    }

    @JvmStatic
    public static final void registerDisposable(@NotNull String eventName, @NotNull Disposable disposable) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        disposableMap.put(eventName, disposable);
    }

    @JvmStatic
    public static final void release() {
        Iterator<Map.Entry<String, Disposable>> it = disposableMap.entrySet().iterator();
        while (it.hasNext()) {
            INSTANCE.disposeTarget(it.next().getValue());
        }
        disposableMap.clear();
    }

    @JvmStatic
    public static final void unRegisterDisposable(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        INSTANCE.disposeTarget(disposableMap.get(eventName));
    }

    private RNH5InterActionHelper() {
    }
}
