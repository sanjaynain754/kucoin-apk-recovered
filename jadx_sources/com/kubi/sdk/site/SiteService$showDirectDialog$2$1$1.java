package com.kubi.sdk.site;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.resources.dialog.CountdownAlertDialog;
import com.kubi.utils.C27017c;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService$showDirectDialog$2$1$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,571:1\n23#2,2:572\n*S KotlinDebug\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService$showDirectDialog$2$1$1\n*L\n321#1:572,2\n*E\n"})
public final class SiteService$showDirectDialog$2$1$1 implements Function1<FragmentActivity, Unit> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f47799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41708m<Boolean> f47800c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC41709m0 f47801d;

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$1 */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$1", m90122f = "SiteService.kt", m90123i = {0, 0, 1, 1}, m90124l = {361, 362}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "i", "$this$flow", "i"}, m90127s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class C241201 extends SuspendLambda implements Function2<InterfaceC41635f<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $totalSeconds;
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241201(int i11, Continuation<? super C241201> continuation) {
            super(2, continuation);
            this.$totalSeconds = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241201 c241201 = new C241201(this.$totalSeconds, continuation);
            c241201.L$0 = obj;
            return c241201;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41635f<? super Integer> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C241201) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        /* JADX WARN: Code duplicated, block: B:15:0x003e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0053  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:19:0x0050). Please report as a decompilation issue!!! */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i11;
            int i12;
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i13 = this.label;
            if (i13 == 0) {
                ResultKt.throwOnFailure(obj);
                i11 = this.$totalSeconds - 1;
                if (-1 < i11) {
                    return Unit.INSTANCE;
                }
                this.L$0 = interfaceC41635f;
                this.I$0 = i11;
                this.label = 1;
                if (DelayKt.m90350b(1000L, this) != coroutine_suspended) {
                    i12 = i11;
                    Integer numBoxInt = Boxing.boxInt(i12);
                    this.L$0 = interfaceC41635f;
                    this.I$0 = i12;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            if (i13 == 1) {
                i12 = this.I$0;
                ResultKt.throwOnFailure(obj);
                Integer numBoxInt2 = Boxing.boxInt(i12);
                this.L$0 = interfaceC41635f;
                this.I$0 = i12;
                this.label = 2;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = this.I$0;
                ResultKt.throwOnFailure(obj);
            }
            i11 = i12 - 1;
            if (-1 < i11) {
                return Unit.INSTANCE;
            }
            this.L$0 = interfaceC41635f;
            this.I$0 = i11;
            this.label = 1;
            if (DelayKt.m90350b(1000L, this) != coroutine_suspended) {
                i12 = i11;
                Integer numBoxInt3 = Boxing.boxInt(i12);
                this.L$0 = interfaceC41635f;
                this.I$0 = i12;
                this.label = 2;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$2 */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$2", m90122f = "SiteService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241212 extends SuspendLambda implements Function2<InterfaceC41635f<? super Integer>, Continuation<? super Unit>, Object> {
        int label;

        public C241212(Continuation<? super C241212> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C241212(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41635f<? super Integer> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C241212) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C44128b.m97259c("SiteService", "showDirectDialog countdown start");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$3 */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "sec", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$3", m90122f = "SiteService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241223 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41709m0 $$this$withContext;
        final /* synthetic */ String $cachedMessageText;
        final /* synthetic */ String $cachedPositiveText;
        final /* synthetic */ InterfaceC41708m<Boolean> $continuation;
        final /* synthetic */ CountdownAlertDialog $dialog;
        final /* synthetic */ Ref.BooleanRef $resumed;
        final /* synthetic */ String $targetSiteType;
        final /* synthetic */ int $totalSeconds;
        /* synthetic */ int I$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$3$a */
        /* JADX INFO: compiled from: SiteService.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements Function0<Unit> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Ref.BooleanRef f47802b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC41708m<Boolean> f47803c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f47804d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m, String str) {
                this.f47802b = booleanRef;
                this.f47803c = interfaceC41708m;
                this.f47804d = str;
            }

            /* JADX INFO: renamed from: a */
            public final void m58020a() {
                SiteService$showDirectDialog$2$1$1.m58018g(this.f47802b, this.f47803c, this.f47804d, true);
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m58020a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C241223(InterfaceC41708m<? super Boolean> interfaceC41708m, Ref.BooleanRef booleanRef, InterfaceC41709m0 interfaceC41709m0, CountdownAlertDialog countdownAlertDialog, String str, int i11, String str2, String str3, Continuation<? super C241223> continuation) {
            super(2, continuation);
            this.$continuation = interfaceC41708m;
            this.$resumed = booleanRef;
            this.$$this$withContext = interfaceC41709m0;
            this.$dialog = countdownAlertDialog;
            this.$cachedMessageText = str;
            this.$totalSeconds = i11;
            this.$cachedPositiveText = str2;
            this.$targetSiteType = str3;
        }

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C241223) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241223 c241223 = new C241223(this.$continuation, this.$resumed, this.$$this$withContext, this.$dialog, this.$cachedMessageText, this.$totalSeconds, this.$cachedPositiveText, this.$targetSiteType, continuation);
            c241223.I$0 = ((Number) obj).intValue();
            return c241223;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM103844constructorimpl;
            int i11 = this.I$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.$continuation.isActive() || this.$resumed.element) {
                C44128b.m97259c("SiteService", "showDirectDialog already resumed, skip sec=" + i11);
                return Unit.INSTANCE;
            }
            C44128b.m97266j("SiteService", "showDirectDialog countdown sec=" + i11);
            CountdownAlertDialog countdownAlertDialog = this.$dialog;
            String str = this.$cachedMessageText;
            int i12 = this.$totalSeconds;
            String str2 = this.$cachedPositiveText;
            Ref.BooleanRef booleanRef = this.$resumed;
            InterfaceC41708m<Boolean> interfaceC41708m = this.$continuation;
            String str3 = this.$targetSiteType;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(countdownAlertDialog.m54201o4(SiteService$showDirectDialog$2$1$1.m58016e(str, i12, i11)).m54202p4(SiteService$showDirectDialog$2$1$1.m58017f(str2, i12, i11), new a(booleanRef, interfaceC41708m, str3)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97262f("SiteService", "showDirectDialog update failed", thM103847exceptionOrNullimpl);
            }
            if (i11 <= 0) {
                C44128b.m97266j("SiteService", "showDirectDialog countdown finished, auto confirm");
                SiteService$showDirectDialog$2$1$1.m58018g(this.$resumed, this.$continuation, this.$targetSiteType, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$4 */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$4", m90122f = "SiteService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241234 extends SuspendLambda implements Function3<InterfaceC41635f<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41708m<Boolean> $continuation;
        final /* synthetic */ Ref.BooleanRef $resumed;
        final /* synthetic */ String $targetSiteType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C241234(Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m, String str, Continuation<? super C241234> continuation) {
            super(3, continuation);
            this.$resumed = booleanRef;
            this.$continuation = interfaceC41708m;
            this.$targetSiteType = str;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super Integer> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            return new C241234(this.$resumed, this.$continuation, this.$targetSiteType, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j("SiteService", "showDirectDialog flow completed");
                SiteService$showDirectDialog$2$1$1.m58018g(this.$resumed, this.$continuation, this.$targetSiteType, true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$a */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24124a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public static final C24124a f47805b = new C24124a();

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m58021a(th2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: a */
        public final void m58021a(Throwable th2) {
            InterfaceC41775x1 interfaceC41775x1 = SiteService.f47794b;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            SiteService.f47794b = null;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showDirectDialog$2$1$1$b */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24125b implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f47806b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC41708m<Boolean> f47807c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f47808d;

        /* JADX WARN: Multi-variable type inference failed */
        public C24125b(Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m, String str) {
            this.f47806b = booleanRef;
            this.f47807c = interfaceC41708m;
            this.f47808d = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m58022a() {
            SiteService$showDirectDialog$2$1$1.m58018g(this.f47806b, this.f47807c, this.f47808d, true);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m58022a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SiteService$showDirectDialog$2$1$1(String str, InterfaceC41708m<? super Boolean> interfaceC41708m, InterfaceC41709m0 interfaceC41709m0) {
        this.f47799b = str;
        this.f47800c = interfaceC41708m;
        this.f47801d = interfaceC41709m0;
    }

    /* JADX INFO: renamed from: g */
    public static final void m58018g(Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m, String str, boolean z11) {
        if (booleanRef.element || !interfaceC41708m.isActive()) {
            return;
        }
        booleanRef.element = true;
        C46392a.m102333p(SiteService.f47793a.m58011y(), str);
        C44128b.m97266j("SiteService", "showDirectDialog TARGET_SITE_TYPE_KV putString: " + str);
        Result.Companion companion = Result.INSTANCE;
        interfaceC41708m.resumeWith(Result.m103844constructorimpl(Boolean.valueOf(z11)));
    }

    /* JADX INFO: renamed from: d */
    public final void m58019d(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.site_direct_dialog_message, this.f47799b, String.valueOf(5));
        String strM66516f2 = c27017c.m66516f(R$string.site_direct_dialog_goto, String.valueOf(5));
        CountdownAlertDialog countdownAlertDialogM54200n4 = CountdownAlertDialog.f43556B0.newInstance().m54203q4(c27017c.m66516f(R$string.site_direct_dialog_title, new Object[0])).m54201o4(m58016e(strM66516f, 5, 5)).m54202p4(m58017f(strM66516f2, 5, 5), new C24125b(booleanRef, this.f47800c, this.f47799b)).m54200n4(R$drawable.ic2_close_withcircle_24);
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        countdownAlertDialogM54200n4.show(supportFragmentManager, "countdown_dialog");
        countdownAlertDialogM54200n4.m54191p3();
        C44128b.m97266j("SiteService", "showDirectDialog show with initial 5 seconds");
        InterfaceC41775x1 interfaceC41775x1 = SiteService.f47794b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        SiteService.f47794b = C41636g.m90891O(C41636g.m90890N(C41636g.m90895S(C41636g.m90896T(C41636g.m90897U(C41636g.m90887K(new C241201(5, null)), new C241212(null)), new C241223(this.f47800c, booleanRef, this.f47801d, countdownAlertDialogM54200n4, strM66516f, 5, strM66516f2, this.f47799b, null)), new C241234(booleanRef, this.f47800c, this.f47799b, null)), C42911a.m94121c()), LifecycleOwnerKt.getLifecycleScope(activity));
        this.f47800c.mo91119t(C24124a.f47805b);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentActivity fragmentActivity) {
        m58019d(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final String m58016e(String str, int i11, int i12) {
        return StringsKt.replace$default(str, String.valueOf(i11), String.valueOf(i12), false, 4, (Object) null);
    }

    /* JADX INFO: renamed from: f */
    public static final String m58017f(String str, int i11, int i12) {
        return StringsKt.replace$default(str, String.valueOf(i11), String.valueOf(i12), false, 4, (Object) null);
    }
}
