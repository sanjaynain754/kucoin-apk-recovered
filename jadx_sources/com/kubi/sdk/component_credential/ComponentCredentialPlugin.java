package com.kubi.sdk.component_credential;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.appsflyer.AppsFlyerProperties;
import com.blankj.utilcode.util.C5258a;
import com.kubi.credential.model.CredentialType;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import p200df.C36670b;
import p230ef.AbstractC37151b;
import p230ef.AbstractC37156g;
import p230ef.C37154e;
import p230ef.C37155f;
import p230ef.C37158i;
import p230ef.C37159j;
import p230ef.C37161l;
import p230ef.C37163n;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ComponentCredentialPlugin.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/component_credential/ComponentCredentialPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/BinaryMessenger;", "messages", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lio/flutter/plugin/common/BinaryMessenger;)V", "Lio/flutter/plugin/common/MethodChannel;", "b", "Lio/flutter/plugin/common/MethodChannel;", AppsFlyerProperties.CHANNEL, "component_credential_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ComponentCredentialPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: com.kubi.sdk.component_credential.ComponentCredentialPlugin$onMethodCall$1 */
    /* JADX INFO: compiled from: ComponentCredentialPlugin.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.sdk.component_credential.ComponentCredentialPlugin$onMethodCall$1", m90122f = "ComponentCredentialPlugin.kt", m90123i = {0}, m90124l = {67}, m90125m = "invokeSuspend", m90126n = {"credentialJSONInfo"}, m90127s = {"L$0"})
    public static final class C236931 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ String $argument;
        final /* synthetic */ MethodChannel.Result $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C236931(FragmentActivity fragmentActivity, String str, MethodChannel.Result result, Continuation<? super C236931> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$argument = str;
            this.$result = result;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C236931(this.$activity, this.$argument, this.$result, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C236931) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String registrationResponseJson;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        registrationResponseJson = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C36670b c36670b = C36670b.f79491a;
                    FragmentActivity fragmentActivity = this.$activity;
                    C37154e c37154e = new C37154e(this.$argument, null, null, false, false, 30, null);
                    this.L$0 = "";
                    this.label = 1;
                    Object objMo23421a = c36670b.mo23421a(fragmentActivity, c37154e, this);
                    if (objMo23421a != coroutine_suspended) {
                        registrationResponseJson = "";
                        obj = objMo23421a;
                    } else {
                        return coroutine_suspended;
                    }
                }
                AbstractC37151b abstractC37151b = (AbstractC37151b) obj;
                if (abstractC37151b instanceof C37155f) {
                    registrationResponseJson = ((C37155f) abstractC37151b).getRegistrationResponseJson();
                }
                if (registrationResponseJson.length() == 0) {
                    this.$result.error("CREDENTIAL_CREATION_FAILED", "Failed to create credential.", null);
                } else {
                    this.$result.success(registrationResponseJson);
                }
            } catch (Exception e11) {
                this.$result.error("CREDENTIAL_CREATION_ERROR", "Error occurred while creating credential: " + e11.getMessage(), null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.component_credential.ComponentCredentialPlugin$onMethodCall$2 */
    /* JADX INFO: compiled from: ComponentCredentialPlugin.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.sdk.component_credential.ComponentCredentialPlugin$onMethodCall$2", m90122f = "ComponentCredentialPlugin.kt", m90123i = {}, m90124l = {108}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C236942 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ String $argument;
        final /* synthetic */ MethodChannel.Result $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C236942(FragmentActivity fragmentActivity, String str, MethodChannel.Result result, Continuation<? super C236942> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$argument = str;
            this.$result = result;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C236942(this.$activity, this.$argument, this.$result, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C236942) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C37163n c37163n;
            String authenticationResponseJson;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C36670b c36670b = C36670b.f79491a;
                    FragmentActivity fragmentActivity = this.$activity;
                    C37158i c37158i = new C37158i(CollectionsKt.listOf(new C37161l(this.$argument, null, null, 6, null)), null, false, null, false, 30, null);
                    this.label = 1;
                    obj = c36670b.mo23422b(fragmentActivity, c37158i, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                C37159j c37159j = (C37159j) obj;
                String str = "";
                if (c37159j.getCredential() instanceof C37163n) {
                    AbstractC37156g credential = c37159j.getCredential();
                    if (credential instanceof C37163n) {
                        c37163n = (C37163n) credential;
                    } else {
                        c37163n = null;
                    }
                    if (c37163n != null && (authenticationResponseJson = c37163n.getAuthenticationResponseJson()) != null) {
                        str = authenticationResponseJson;
                    }
                }
                if (!StringsKt.isBlank(str)) {
                    this.$result.success(str);
                } else {
                    this.$result.error("CREDENTIAL_RETRIEVAL_FAILED", "Failed to retrieve credential.", null);
                }
            } catch (Exception e11) {
                this.$result.error("CREDENTIAL_RETRIEVAL_ERROR", "Error occurred while retrieving credential: " + e11.getMessage(), null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.component_credential.ComponentCredentialPlugin$onMethodCall$3 */
    /* JADX INFO: compiled from: ComponentCredentialPlugin.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "com.kubi.sdk.component_credential.ComponentCredentialPlugin$onMethodCall$3", m90122f = "ComponentCredentialPlugin.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C236953 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $argument;
        final /* synthetic */ MethodChannel.Result $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C236953(String str, MethodChannel.Result result, Continuation<? super C236953> continuation) {
            super(2, continuation);
            this.$argument = str;
            this.$result = result;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C236953(this.$argument, this.$result, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C236953) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArrayM83134b = new C37161l(this.$argument, null, null, 6, null).m83134b();
                    if (jSONArrayM83134b == null) {
                        this.$result.success(arrayList);
                    } else {
                        int length = jSONArrayM83134b.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            String string = jSONArrayM83134b.getString(i11);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            arrayList.add(string);
                        }
                        this.$result.success(arrayList);
                    }
                } catch (Exception e11) {
                    this.$result.error("CREDENTIAL_RETRIEVAL_ERROR", "Error occurred while retrieving credential: " + e11.getMessage(), null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m56601a(BinaryMessenger messages) {
        MethodChannel methodChannel = new MethodChannel(messages, "component_credential");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        m56601a(binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        Activity activityM6125h = C5258a.m6125h();
        FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        if (fragmentActivity == null) {
            result.error("ACTIVITY_NOT_FOUND", "No active FragmentActivity found to create credential.", null);
            return;
        }
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -985278615:
                    if (str.equals("getAllowCredentials")) {
                        String str2 = (String) call.argument(JPushConstants.Analysis.KEY_JSON);
                        if (str2 == null || str2.length() == 0) {
                            result.error("ARGUMENT_ERROR", "Argument for createCredential must be a non-empty JSON string.", null);
                            return;
                        } else {
                            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new C236953(str2, result, null), 3, null);
                            return;
                        }
                    }
                    break;
                case -981163955:
                    if (str.equals("getCredential")) {
                        String str3 = (String) call.argument(JPushConstants.Analysis.KEY_JSON);
                        if (str3 == null || str3.length() == 0) {
                            result.error("ARGUMENT_ERROR", "Argument for createCredential must be a non-empty JSON string.", null);
                            return;
                        } else {
                            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new C236942(fragmentActivity, str3, result, null), 3, null);
                            return;
                        }
                    }
                    break;
                case 1142119027:
                    if (str.equals("createCredential")) {
                        String str4 = (String) call.argument(JPushConstants.Analysis.KEY_JSON);
                        if (str4 == null || str4.length() == 0) {
                            result.error("ARGUMENT_ERROR", "Argument for createCredential must be a non-empty JSON string.", null);
                            return;
                        } else {
                            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new C236931(fragmentActivity, str4, result, null), 3, null);
                            return;
                        }
                    }
                    break;
                case 1860421445:
                    if (str.equals("isSupport")) {
                        result.success(Boolean.valueOf(C36670b.f79491a.mo23423c().contains(CredentialType.PASSKEYS)));
                        return;
                    }
                    break;
            }
        }
        result.error("METHOD_NOT_IMPLEMENTED", "Method " + call.method + " is not implemented in ComponentCredentialPlugin", null);
        Unit unit = Unit.INSTANCE;
    }
}
