package com.kubi.mine.lib.p101ui;

import android.content.Context;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.utils.C27053i;
import gq.C37994o;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.SettingsFragment$initViews$3", m90122f = "SettingsFragment.kt", m90123i = {0}, m90124l = {246}, m90125m = "invokeSuspend", m90126n = {"totalCacheSize"}, m90127s = {"L$0"})
public final class SettingsFragment$initViews$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C37994o $bind;
    Object L$0;
    int label;
    final /* synthetic */ SettingsFragment this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.SettingsFragment$initViews$3$1 */
    /* JADX INFO: compiled from: SettingsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.ui.SettingsFragment$initViews$3$1", m90122f = "SettingsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C190271 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C37994o $bind;
        final /* synthetic */ String $totalCacheSize;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190271(C37994o c37994o, String str, Continuation<? super C190271> continuation) {
            super(2, continuation);
            this.$bind = c37994o;
            this.$totalCacheSize = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190271(this.$bind, this.$totalCacheSize, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C190271) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$bind.f85578u.setText(this.$totalCacheSize);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$initViews$3(SettingsFragment settingsFragment, C37994o c37994o, Continuation<? super SettingsFragment$initViews$3> continuation) {
        super(2, continuation);
        this.this$0 = settingsFragment;
        this.$bind = c37994o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsFragment$initViews$3(this.this$0, this.$bind, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SettingsFragment$initViews$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C27053i c27053i = C27053i.f54338a;
            Context context = ((OldBaseFragment) this.this$0).mContext;
            Intrinsics.checkNotNullExpressionValue(context, "access$getMContext$p$s-1448905805(...)");
            String strM66736f = c27053i.m66736f(context);
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C190271 c190271 = new C190271(this.$bind, strM66736f, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(strM66736f);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94121c, c190271, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
