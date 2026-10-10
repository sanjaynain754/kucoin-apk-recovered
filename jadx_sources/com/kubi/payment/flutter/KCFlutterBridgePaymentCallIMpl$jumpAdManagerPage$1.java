package com.kubi.payment.flutter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.payment.p2p.P2PProfileFragment;
import f00.C37304a;
import g00.InterfaceC37758j;
import ht.C38346y;
import io.reactivex.functions.Action;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgePaymentCallIMpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1", m90122f = "KCFlutterBridgePaymentCallIMpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKCFlutterBridgePaymentCallIMpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgePaymentCallIMpl.kt\ncom/kubi/payment/flutter/KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,415:1\n295#2,2:416\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgePaymentCallIMpl.kt\ncom/kubi/payment/flutter/KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1\n*L\n342#1:416,2\n*E\n"})
public final class KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1(Context context, Continuation<? super KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
    }

    /* JADX INFO: renamed from: g */
    public static final void m48157g() {
        InterfaceC37758j.a.m85166o(C37304a.f82764a, null, null, null, null, null, 31, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1(this.$ctx, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P2PProfileFragment p2PProfileFragment;
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<Fragment> fragments = ((FragmentActivity) this.$ctx).getSupportFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            Iterator<T> it = fragments.iterator();
            do {
                p2PProfileFragment = null;
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!(((Fragment) next) instanceof P2PProfileFragment));
            if (next instanceof P2PProfileFragment) {
                p2PProfileFragment = (P2PProfileFragment) next;
            }
            if (p2PProfileFragment != null) {
                C38346y.m86496G(p2PProfileFragment, true, new Action() { // from class: com.kubi.payment.flutter.o
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        KCFlutterBridgePaymentCallIMpl$jumpAdManagerPage$1.m48157g();
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
