package com.kubi.flutter.security.keychain;

import android.app.Application;
import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.security.channel.C12740a;
import com.kubi.flutter.security.channel.SecurityClient;
import com.kubi.safe.C23651g;
import com.kubi.safe.KeyChain;
import com.kubi.safe.KeyChainConfig;
import com.kubi.safe.keychain.SecurityLevel;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KeyChainClient.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0013J\u001c\u0010\u0015\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u001c\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u0018\u0010\u0016J\u001c\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u0019\u0010\u0016J\u001c\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u001a\u0010\u0016J\u001c\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u001b\u0010\u0016J\u001c\u0010\u001c\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u001c\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m90084d2 = {"Lcom/kubi/flutter/security/keychain/KeyChainClient;", "Lcom/kubi/flutter/security/channel/SecurityClient;", "Lcom/kubi/flutter/security/channel/a;", AppsFlyerProperties.CHANNEL, "<init>", "(Lcom/kubi/flutter/security/channel/a;)V", "", FirebaseAnalytics.Param.METHOD, "", "arguments", "e", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category", "", "v", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "t", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "u", "r", "n", CmcdData.Factory.STREAM_TYPE_LIVE, CmcdData.Factory.STREAMING_FORMAT_SS, "o", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/w;", "f", "Lkotlinx/coroutines/w;", "initToggle", "", "g", "Ljava/util/List;", "dirtyObserveFlags", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "component_security_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKeyChainClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyChainClient.kt\ncom/kubi/flutter/security/keychain/KeyChainClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,236:1\n1557#2:237\n1628#2,3:238\n808#2,11:245\n1557#2:256\n1628#2,3:257\n37#3:241\n36#3,3:242\n*S KotlinDebug\n*F\n+ 1 KeyChainClient.kt\ncom/kubi/flutter/security/keychain/KeyChainClient\n*L\n116#1:237\n116#1:238,3\n182#1:245,11\n214#1:256\n214#1:257,3\n116#1:241\n116#1:242,3\n*E\n"})
public final class KeyChainClient extends SecurityClient {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41769w<Unit> initToggle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<String> dirtyObserveFlags;

    /* JADX INFO: renamed from: com.kubi.flutter.security.keychain.KeyChainClient$a */
    /* JADX INFO: compiled from: KeyChainClient.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C12744a<T> implements InterfaceC41635f {
        public C12744a() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<String> list, Continuation<? super Unit> continuation) {
            KeyChainClient.this.m24074f("receiveDirtyData", list);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyChainClient(@NotNull C12740a channel) {
        super(channel);
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.initToggle = C41777y.m91388c(null, 1, null);
        this.dirtyObserveFlags = new ArrayList();
    }

    /* JADX INFO: renamed from: q */
    public static final KeyChainConfig m24087q(KeyChainClient keyChainClient, Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("argument must be a map");
            sb2.append(obj != null ? obj.getClass().getCanonicalName() : null);
            throw new RuntimeException(sb2.toString());
        }
        if (map.size() != 4) {
            throw new RuntimeException("map length must be 4");
        }
        KeyChainConfig.Builder builder = new KeyChainConfig.Builder();
        Object obj2 = map.get("category");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        KeyChainConfig.Builder builderE = builder.e((String) obj2);
        Object obj3 = map.get("authDuration");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        KeyChainConfig.Builder builderC = builderE.c(((Integer) obj3).intValue());
        Object obj4 = map.get("promptTitle");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
        Object obj5 = map.get("promptNegative");
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
        KeyChainConfig.Builder builderD = builderC.d(new C23651g((String) obj4, (String) obj5));
        FlutterPlugin.FlutterPluginBinding baseBinding = keyChainClient.getBaseBinding();
        Intrinsics.checkNotNull(baseBinding);
        Context applicationContext = baseBinding.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return builderD.b((Application) applicationContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0208 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x0149 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0206, code lost:
    
        if (r5.m24095s(r6, r0) == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if (r5.m24094r(r6, r0) == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (m24089k(r0) == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (r5.m24096t(r6, r0) == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        if (r5.m24097u(r6, r0) == r1) goto L120;
     */
    @Override // com.kubi.flutter.security.channel.SecurityClient
    @Nullable
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo24073e(@NotNull String str, @Nullable Object obj, @NotNull Continuation<Object> continuation) throws Throwable {
        KeyChainClient$onReceive$1 keyChainClient$onReceive$1;
        KeyChainClient keyChainClient;
        KeyChainClient keyChainClient2;
        KeyChainClient keyChainClient3;
        KeyChainClient keyChainClient4;
        KeyChainClient keyChainClient5;
        KeyChainClient keyChainClient6;
        KeyChainClient keyChainClient7;
        KeyChainClient keyChainClient8;
        Object objM24091m;
        Object objM24092n;
        Object objM24090l;
        if (continuation instanceof KeyChainClient$onReceive$1) {
            keyChainClient$onReceive$1 = (KeyChainClient$onReceive$1) continuation;
            int i11 = keyChainClient$onReceive$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                keyChainClient$onReceive$1.label = i11 - Integer.MIN_VALUE;
            } else {
                keyChainClient$onReceive$1 = new KeyChainClient$onReceive$1(this, continuation);
            }
        } else {
            keyChainClient$onReceive$1 = new KeyChainClient$onReceive$1(this, continuation);
        }
        Object obj2 = keyChainClient$onReceive$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (keyChainClient$onReceive$1.label) {
            case 0:
                ResultKt.throwOnFailure(obj2);
                switch (str) {
                    case "observeDirtyData":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 14;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient = this;
                            keyChainClient$onReceive$1.L$0 = null;
                            keyChainClient$onReceive$1.L$1 = null;
                            keyChainClient$onReceive$1.label = 15;
                            break;
                        }
                        return coroutine_suspended;
                    case "cleanDirtyData":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 12;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient2 = this;
                            keyChainClient$onReceive$1.L$0 = null;
                            keyChainClient$onReceive$1.L$1 = null;
                            keyChainClient$onReceive$1.label = 13;
                            objM24090l = keyChainClient2.m24090l(obj, keyChainClient$onReceive$1);
                            if (objM24090l != coroutine_suspended) {
                                return objM24090l;
                            }
                        }
                        return coroutine_suspended;
                    case "remove":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 6;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient3 = this;
                            keyChainClient$onReceive$1.L$0 = null;
                            keyChainClient$onReceive$1.L$1 = null;
                            keyChainClient$onReceive$1.label = 7;
                            break;
                        }
                        return coroutine_suspended;
                    case "getAllLevels":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 16;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient4 = this;
                            return keyChainClient4.m24093o(obj);
                        }
                        return coroutine_suspended;
                    case "getAllAlias":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 10;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient5 = this;
                            keyChainClient$onReceive$1.L$0 = null;
                            keyChainClient$onReceive$1.L$1 = null;
                            keyChainClient$onReceive$1.label = 11;
                            objM24092n = keyChainClient5.m24092n(obj, keyChainClient$onReceive$1);
                            if (objM24092n != coroutine_suspended) {
                                return objM24092n;
                            }
                        }
                        return coroutine_suspended;
                    case "get":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 4;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient6 = this;
                            keyChainClient$onReceive$1.L$0 = null;
                            keyChainClient$onReceive$1.L$1 = null;
                            keyChainClient$onReceive$1.label = 5;
                            objM24091m = keyChainClient6.m24091m(obj, keyChainClient$onReceive$1);
                            if (objM24091m != coroutine_suspended) {
                                return objM24091m;
                            }
                        }
                        return coroutine_suspended;
                    case "put":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 2;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient7 = this;
                            keyChainClient$onReceive$1.L$0 = null;
                            keyChainClient$onReceive$1.L$1 = null;
                            keyChainClient$onReceive$1.label = 3;
                            break;
                        }
                        return coroutine_suspended;
                    case "init":
                        m24086p(obj);
                        keyChainClient$onReceive$1.label = 1;
                        break;
                    case "migrate":
                        keyChainClient$onReceive$1.L$0 = this;
                        keyChainClient$onReceive$1.L$1 = obj;
                        keyChainClient$onReceive$1.label = 8;
                        if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                            keyChainClient8 = this;
                            keyChainClient$onReceive$1.L$0 = null;
                            keyChainClient$onReceive$1.L$1 = null;
                            keyChainClient$onReceive$1.label = 9;
                            break;
                        }
                        return coroutine_suspended;
                    default:
                        if (str.equals("observeDirtyData")) {
                            keyChainClient$onReceive$1.L$0 = this;
                            keyChainClient$onReceive$1.L$1 = obj;
                            keyChainClient$onReceive$1.label = 14;
                            if (m24088j(keyChainClient$onReceive$1) != coroutine_suspended) {
                                keyChainClient = this;
                                keyChainClient$onReceive$1.L$0 = null;
                                keyChainClient$onReceive$1.L$1 = null;
                                keyChainClient$onReceive$1.label = 15;
                                break;
                            }
                            return coroutine_suspended;
                        }
                        throw new RuntimeException("not support method: " + str);
                }
            case 1:
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            case 2:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient7 = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                keyChainClient$onReceive$1.L$0 = null;
                keyChainClient$onReceive$1.L$1 = null;
                keyChainClient$onReceive$1.label = 3;
                break;
            case 3:
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            case 4:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient6 = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                keyChainClient$onReceive$1.L$0 = null;
                keyChainClient$onReceive$1.L$1 = null;
                keyChainClient$onReceive$1.label = 5;
                objM24091m = keyChainClient6.m24091m(obj, keyChainClient$onReceive$1);
                if (objM24091m != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM24091m;
            case 5:
                ResultKt.throwOnFailure(obj2);
                return obj2;
            case 6:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient3 = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                keyChainClient$onReceive$1.L$0 = null;
                keyChainClient$onReceive$1.L$1 = null;
                keyChainClient$onReceive$1.label = 7;
                break;
            case 7:
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            case 8:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient8 = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                keyChainClient$onReceive$1.L$0 = null;
                keyChainClient$onReceive$1.L$1 = null;
                keyChainClient$onReceive$1.label = 9;
                break;
            case 9:
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            case 10:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient5 = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                keyChainClient$onReceive$1.L$0 = null;
                keyChainClient$onReceive$1.L$1 = null;
                keyChainClient$onReceive$1.label = 11;
                objM24092n = keyChainClient5.m24092n(obj, keyChainClient$onReceive$1);
                if (objM24092n != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM24092n;
            case 11:
                ResultKt.throwOnFailure(obj2);
                return obj2;
            case 12:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient2 = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                keyChainClient$onReceive$1.L$0 = null;
                keyChainClient$onReceive$1.L$1 = null;
                keyChainClient$onReceive$1.label = 13;
                objM24090l = keyChainClient2.m24090l(obj, keyChainClient$onReceive$1);
                if (objM24090l != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM24090l;
            case 13:
                ResultKt.throwOnFailure(obj2);
                return obj2;
            case 14:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                keyChainClient$onReceive$1.L$0 = null;
                keyChainClient$onReceive$1.L$1 = null;
                keyChainClient$onReceive$1.label = 15;
                break;
            case 15:
                ResultKt.throwOnFailure(obj2);
                return Unit.INSTANCE;
            case 16:
                obj = keyChainClient$onReceive$1.L$1;
                keyChainClient4 = (KeyChainClient) keyChainClient$onReceive$1.L$0;
                ResultKt.throwOnFailure(obj2);
                return keyChainClient4.m24093o(obj);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: j */
    public final Object m24088j(Continuation<? super Unit> continuation) {
        Object objMo91198h = this.initToggle.mo91198h(continuation);
        return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final Object m24089k(Continuation<? super Unit> continuation) {
        InterfaceC41769w<Unit> interfaceC41769w = this.initToggle;
        Unit unit = Unit.INSTANCE;
        interfaceC41769w.mo91370n(unit);
        return unit;
    }

    /* JADX INFO: renamed from: l */
    public final Object m24090l(Object obj, Continuation<Object> continuation) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 1) {
            throw new RuntimeException("list length must be 1");
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        return KeyChain.a((String) obj2, continuation);
    }

    /* JADX INFO: renamed from: m */
    public final Object m24091m(Object obj, Continuation<Object> continuation) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 3) {
            throw new RuntimeException("list length must be 3");
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = list.get(1);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj3;
        Object obj4 = list.get(2);
        return KeyChain.b(str, str2, obj4 instanceof String ? (String) obj4 : null, continuation);
    }

    /* JADX INFO: renamed from: n */
    public final Object m24092n(Object obj, Continuation<Object> continuation) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 1) {
            throw new RuntimeException("list length must be 1");
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        return KeyChain.c((String) obj2, continuation);
    }

    /* JADX INFO: renamed from: r */
    public final Object m24094r(Object obj, Continuation<? super Unit> continuation) {
        Set set = null;
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 6) {
            throw new RuntimeException("list length must be 6");
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = list.get(1);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        SecurityLevel securityLevelValueOf = SecurityLevel.valueOf((String) obj3);
        Object obj4 = list.get(2);
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
        SecurityLevel securityLevelValueOf2 = SecurityLevel.valueOf((String) obj4);
        Object obj5 = list.get(3);
        String str2 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = list.get(4);
        String str3 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = list.get(5);
        List list2 = obj7 instanceof List ? (List) obj7 : null;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj8 : list2) {
                if (obj8 instanceof String) {
                    arrayList.add(obj8);
                }
            }
            set = CollectionsKt.toSet(arrayList);
        }
        Object objI = KeyChain.i(str, securityLevelValueOf, securityLevelValueOf2, str2, str3, set, continuation);
        return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public final Object m24095s(Object obj, Continuation<? super Unit> continuation) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 1) {
            throw new RuntimeException("list length must be 1");
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        Object objM24098v = m24098v((String) obj2, continuation);
        return objM24098v == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM24098v : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public final Object m24096t(Object obj, Continuation<? super Unit> continuation) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 5) {
            throw new RuntimeException("list length must be 5");
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = list.get(1);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj3;
        Object obj4 = list.get(2);
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj4;
        Object obj5 = list.get(3);
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
        SecurityLevel securityLevelValueOf = SecurityLevel.valueOf((String) obj5);
        Object obj6 = list.get(4);
        Object objK = KeyChain.k(str, str2, str3, securityLevelValueOf, obj6 instanceof String ? (String) obj6 : null, continuation);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public final Object m24097u(Object obj, Continuation<? super Unit> continuation) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            throw new RuntimeException("argument must be a list");
        }
        if (list.size() != 3) {
            throw new RuntimeException("list length must be 3");
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = list.get(1);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj3;
        Object obj4 = list.get(2);
        Object objL = KeyChain.l(str, str2, obj4 instanceof String ? (String) obj4 : null, continuation);
        return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public final Object m24098v(String str, Continuation<? super Unit> continuation) {
        if (this.dirtyObserveFlags.contains(str)) {
            return Unit.INSTANCE;
        }
        Object objCollect = KeyChain.a.j(str).collect(new C12744a(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX INFO: renamed from: p */
    private final void m24086p(Object arguments) {
        List list;
        KeyChainConfig[] keyChainConfigArr;
        if (KeyChain.g()) {
            C44128b.m97268l("KeyChainClient", "keychain has been initialized");
            return;
        }
        List list2 = null;
        if (arguments instanceof List) {
            list = (List) arguments;
        } else {
            list = null;
        }
        if (list != null) {
            if (!list.isEmpty()) {
                Function1 function1 = new Function1() { // from class: com.kubi.flutter.security.keychain.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KeyChainClient.m24087q(this.f22242b, obj);
                    }
                };
                KeyChainConfig keyChainConfig = (KeyChainConfig) function1.invoke(list.get(0));
                Object obj = list.get(1);
                if (obj instanceof List) {
                    list2 = (List) obj;
                }
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((KeyChainConfig) function1.invoke(it.next()));
                    }
                    keyChainConfigArr = (KeyChainConfig[]) arrayList.toArray(new KeyChainConfig[0]);
                    if (keyChainConfigArr == null) {
                        keyChainConfigArr = new KeyChainConfig[0];
                    }
                } else {
                    keyChainConfigArr = new KeyChainConfig[0];
                }
                KeyChain.h(keyChainConfig, (KeyChainConfig[]) Arrays.copyOf(keyChainConfigArr, keyChainConfigArr.length));
                return;
            }
            throw new RuntimeException("The configuration list cannot be empty");
        }
        throw new RuntimeException("argument must be a list");
    }

    /* JADX INFO: renamed from: o */
    public final Object m24093o(Object arguments) {
        Set setD = KeyChain.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setD, 10));
        Iterator it = setD.iterator();
        while (it.hasNext()) {
            arrayList.add(((SecurityLevel) it.next()).name());
        }
        return CollectionsKt.toList(arrayList);
    }
}
