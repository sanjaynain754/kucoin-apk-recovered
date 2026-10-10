package com.kubi.kyc.knb;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.kyc.R$string;
import com.kubi.kyc.ui.DialogHelper;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.sdk.protocol.ProtocolException;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import xb0.C46126b;

/* JADX INFO: compiled from: KCFlutterBridgeKycCallImpl.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.knb.KCFlutterBridgeKycCallImpl$checkSumsubPermission$1", m90122f = "KCFlutterBridgeKycCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgeKycCallImpl$checkSumsubPermission$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ FragmentActivity $fragment;
    final /* synthetic */ String[] $permissionsList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgeKycCallImpl$checkSumsubPermission$1(FragmentActivity fragmentActivity, String[] strArr, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgeKycCallImpl$checkSumsubPermission$1> continuation) {
        super(2, continuation);
        this.$fragment = fragmentActivity;
        this.$permissionsList = strArr;
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m36810g(Function2 function2, FragmentActivity fragmentActivity, boolean z11) {
        if (z11) {
            function2.invoke(Boolean.TRUE, null);
        } else {
            String string = fragmentActivity.getString(R$string.camera_authorization_tips, fragmentActivity.getString(com.kubi.sdk.R$string.camera_storage_authorization));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            DialogHelper.m37110d(fragmentActivity, string, supportFragmentManager, null, null, 24, null);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgeKycCallImpl$checkSumsubPermission$1(this.$fragment, this.$permissionsList, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgeKycCallImpl$checkSumsubPermission$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m36811h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C46126b c46126b = new C46126b(this.$fragment);
            String[] strArr = this.$permissionsList;
            Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(c46126b, (String[]) Arrays.copyOf(strArr, strArr.length));
            final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
            final FragmentActivity fragmentActivity = this.$fragment;
            final Function1 function1 = new Function1() { // from class: com.kubi.kyc.knb.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCFlutterBridgeKycCallImpl$checkSumsubPermission$1.m36810g(function2, fragmentActivity, ((Boolean) obj2).booleanValue());
                }
            };
            observableM49936e.subscribe(new Consumer() { // from class: com.kubi.kyc.knb.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    KCFlutterBridgeKycCallImpl$checkSumsubPermission$1.m36811h(function1, obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
