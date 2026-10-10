package com.kubi.mine.lib.p101ui;

import android.content.Context;
import com.kubi.mine.R$string;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.utils.C27053i;
import gq.C37994o;
import kotlinx.coroutines.AbstractC41697j0;
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
import ro.C44128b;

/* JADX INFO: compiled from: SettingsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.SettingsFragment$initViews$2$2", m90122f = "SettingsFragment.kt", m90123i = {0, 1}, m90124l = {227, 233}, m90125m = "invokeSuspend", m90126n = {"totalCacheSize", "e"}, m90127s = {"L$0", "L$0"})
public final class SettingsFragment$initViews$2$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C37994o $bind;
    Object L$0;
    int label;
    final /* synthetic */ SettingsFragment this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.SettingsFragment$initViews$2$2$1 */
    /* JADX INFO: compiled from: SettingsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.ui.SettingsFragment$initViews$2$2$1", m90122f = "SettingsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C190251 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C37994o $bind;
        final /* synthetic */ String $totalCacheSize;
        int label;
        final /* synthetic */ SettingsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190251(SettingsFragment settingsFragment, C37994o c37994o, String str, Continuation<? super C190251> continuation) {
            super(2, continuation);
            this.this$0 = settingsFragment;
            this.$bind = c37994o;
            this.$totalCacheSize = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190251(this.this$0, this.$bind, this.$totalCacheSize, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C190251) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BaseFragment.hideLoadingDialog$default(this.this$0, false, 1, null);
                this.$bind.f85578u.setText(this.$totalCacheSize);
                SettingsFragment settingsFragment = this.this$0;
                settingsFragment.showToast(settingsFragment.getString(R$string.clear_cache_succeed));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.SettingsFragment$initViews$2$2$2 */
    /* JADX INFO: compiled from: SettingsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.ui.SettingsFragment$initViews$2$2$2", m90122f = "SettingsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C190262 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SettingsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190262(SettingsFragment settingsFragment, Continuation<? super C190262> continuation) {
            super(2, continuation);
            this.this$0 = settingsFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190262(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C190262) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BaseFragment.hideLoadingDialog$default(this.this$0, false, 1, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$initViews$2$2(SettingsFragment settingsFragment, C37994o c37994o, Continuation<? super SettingsFragment$initViews$2$2> continuation) {
        super(2, continuation);
        this.this$0 = settingsFragment;
        this.$bind = c37994o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsFragment$initViews$2$2(this.this$0, this.$bind, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SettingsFragment$initViews$2$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r0, r2, r8) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r9, r2, r8) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        return r1;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C27053i c27053i = C27053i.f54338a;
                Context context = ((OldBaseFragment) this.this$0).mContext;
                Intrinsics.checkNotNullExpressionValue(context, "access$getMContext$p$s-1448905805(...)");
                c27053i.m66732b(context);
                Context context2 = ((OldBaseFragment) this.this$0).mContext;
                Intrinsics.checkNotNullExpressionValue(context2, "access$getMContext$p$s-1448905805(...)");
                String strM66736f = c27053i.m66736f(context2);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                C190251 c190251 = new C190251(this.this$0, this.$bind, strM66736f, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(strM66736f);
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = (Exception) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    C44128b.m97263g(this.this$0.getTAG(), exc);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e11) {
            exc = e11;
            AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
            C190262 c190262 = new C190262(this.this$0, null);
            this.L$0 = exc;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
