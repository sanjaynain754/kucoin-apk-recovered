package io.trtc.tuikit.atomicxcore.hybridapi.dispatcher;

import io.trtc.tuikit.atomicxcore.api.login.LoginState;
import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridListenerKey;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher;", "Lio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/Dispatcher;", "eventEmitter", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "baseKey", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridListenerKey;", "dispatchCurrentState", "key", "startObserving", "stopObserving", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoginDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,59:1\n35#2,2:60\n*S KotlinDebug\n*F\n+ 1 LoginDispatcher.kt\nio/trtc/tuikit/atomicxcore/hybridapi/dispatcher/LoginDispatcher\n*L\n52#1:60,2\n*E\n"})
public final class LoginDispatcher extends Dispatcher {

    @NotNull
    private final HybridListenerKey baseKey;

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LoginDispatcher$startObserving$1 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LoginDispatcher$startObserving$1", m90122f = "LoginDispatcher.kt", m90123i = {}, m90124l = {23}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394621 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394621(Continuation<? super C394621> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginDispatcher.this.new C394621(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394621) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<LoginStatus> loginStatus = LoginStore.shared.getLoginState().getLoginStatus();
                final LoginDispatcher loginDispatcher = LoginDispatcher.this;
                InterfaceC41635f<? super LoginStatus> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LoginDispatcher.startObserving.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((LoginStatus) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull LoginStatus loginStatus2, @NotNull Continuation<? super Unit> continuation) {
                        loginDispatcher.dispatchEvent(HybridListenerKey.copy$default(loginDispatcher.baseKey, null, null, "loginStatus", null, null, 27, null), MapsKt.mapOf(TuplesKt.m90091to("loginStatus", Boxing.boxInt(loginStatus2.getValue()))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (loginStatus.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LoginDispatcher$startObserving$2 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LoginDispatcher$startObserving$2", m90122f = "LoginDispatcher.kt", m90123i = {}, m90124l = {31}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C394632 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C394632(Continuation<? super C394632> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginDispatcher.this.new C394632(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C394632) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41678w<UserProfile> loginUserInfo = LoginStore.shared.getLoginState().getLoginUserInfo();
                final LoginDispatcher loginDispatcher = LoginDispatcher.this;
                InterfaceC41635f<? super UserProfile> interfaceC41635f = new InterfaceC41635f() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.LoginDispatcher.startObserving.2.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((UserProfile) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
                    @Nullable
                    public final Object emit(@Nullable UserProfile userProfile, @NotNull Continuation<? super Unit> continuation) {
                        String json;
                        HybridListenerKey hybridListenerKeyCopy$default = HybridListenerKey.copy$default(loginDispatcher.baseKey, null, null, "loginUserInfo", null, null, 27, null);
                        if (userProfile != null) {
                            json = JsonParserKt.getSharedGson().toJson(userProfile);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            if (json == null) {
                                json = "null";
                            }
                        } else {
                            json = "null";
                        }
                        loginDispatcher.dispatchEvent(hybridListenerKeyCopy$default, MapsKt.mapOf(TuplesKt.m90091to("loginUserInfo", json)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (loginUserInfo.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginDispatcher(@NotNull Function2<? super String, ? super String, Unit> eventEmitter) {
        super(eventEmitter);
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        this.baseKey = new HybridListenerKey("state", "LoginStore", "", null, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void dispatchCurrentState(@NotNull HybridListenerKey key) {
        String json;
        Intrinsics.checkNotNullParameter(key, "key");
        LoginState loginState = LoginStore.shared.getLoginState();
        String name = key.getName();
        if (Intrinsics.areEqual(name, "loginStatus")) {
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("loginStatus", Integer.valueOf(loginState.getLoginStatus().getValue().getValue()))));
            return;
        }
        if (Intrinsics.areEqual(name, "loginUserInfo")) {
            UserProfile value = loginState.getLoginUserInfo().getValue();
            if (value != null) {
                json = JsonParserKt.getSharedGson().toJson(value);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                if (json == null) {
                    json = "null";
                }
            } else {
                json = "null";
            }
            dispatchEvent(key, MapsKt.mapOf(TuplesKt.m90091to("loginUserInfo", json)));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void startObserving() {
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394621(null), 2, null);
        C41696j.m91104d(getObserverScope(), C41782z0.m91393c(), null, new C394632(null), 2, null);
    }

    @Override // io.trtc.tuikit.atomicxcore.hybridapi.dispatcher.Dispatcher
    public void stopObserving() {
        getKeys().clear();
    }
}
