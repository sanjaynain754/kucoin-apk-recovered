package com.kubi.sdk.site;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.site.config.SupportSiteManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27017c;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$showRecommendDialog$2", m90122f = "SiteService.kt", m90123i = {0}, m90124l = {572}, m90125m = "invokeSuspend", m90126n = {"$i$f$suspendCancellableCoroutine"}, m90127s = {"I$0"})
@SourceDebugExtension({"SMAP\nSiteService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService$showRecommendDialog$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,571:1\n426#2,11:572\n23#3,2:583\n*S KotlinDebug\n*F\n+ 1 SiteService.kt\ncom/kubi/sdk/site/SiteService$showRecommendDialog$2\n*L\n275#1:572,11\n287#1:583,2\n*E\n"})
public final class SiteService$showRecommendDialog$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $targetSiteType;
    int I$0;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showRecommendDialog$2$a */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24126a implements Function1<FragmentActivity, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f47809b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f47810c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f47811d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Ref.BooleanRef f47812e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC41708m<Boolean> f47813f;

        /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showRecommendDialog$2$a$a */
        /* JADX INFO: compiled from: SiteService.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Ref.BooleanRef f47814b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC41708m<Boolean> f47815c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f47816d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m, String str) {
                this.f47814b = booleanRef;
                this.f47815c = interfaceC41708m;
                this.f47816d = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SiteService$showRecommendDialog$2.m58023a(this.f47814b, this.f47815c, this.f47816d, true);
            }
        }

        /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showRecommendDialog$2$a$b */
        /* JADX INFO: compiled from: SiteService.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Ref.BooleanRef f47817b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC41708m<Boolean> f47818c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f47819d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m, String str) {
                this.f47817b = booleanRef;
                this.f47818c = interfaceC41708m;
                this.f47819d = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SiteService$showRecommendDialog$2.m58023a(this.f47817b, this.f47818c, this.f47819d, false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C24126a(String str, String str2, String str3, Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m) {
            this.f47809b = str;
            this.f47810c = str2;
            this.f47811d = str3;
            this.f47812e = booleanRef;
            this.f47813f = interfaceC41708m;
        }

        /* JADX INFO: renamed from: a */
        public final void m58024a(FragmentActivity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
            SiteService siteService = SiteService.f47793a;
            AlertDialogFragmentHelper alertDialogFragmentHelperM54156M4 = alertDialogFragmentHelperNewInstanceAlert.m54168Y4(siteService.m58012z(this.f47809b, this.f47810c)).m54156M4(siteService.m58007u(this.f47809b, this.f47810c));
            C27017c c27017c = C27017c.f54310a;
            alertDialogFragmentHelperM54156M4.m54163T4(c27017c.m66516f(R$string.site_common_dialog_goto, this.f47810c), new a(this.f47812e, this.f47813f, this.f47809b)).m54160Q4(c27017c.m66516f(R$string.site_common_dialog_keep, this.f47811d), new b(this.f47812e, this.f47813f, this.f47809b)).m54151H4(false).m54172c5(it.getSupportFragmentManager());
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FragmentActivity fragmentActivity) {
            m58024a(fragmentActivity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$showRecommendDialog$2$b */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24127b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f47820b;

        public C24127b(Ref.BooleanRef booleanRef) {
            this.f47820b = booleanRef;
        }

        /* JADX INFO: renamed from: a */
        public final void m58025a(Throwable th2) {
            C44128b.m97266j("SiteService", "continuation invokeOnCancellation");
            this.f47820b.element = true;
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m58025a(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteService$showRecommendDialog$2(String str, Continuation<? super SiteService$showRecommendDialog$2> continuation) {
        super(2, continuation);
        this.$targetSiteType = str;
    }

    /* JADX INFO: renamed from: a */
    public static final void m58023a(Ref.BooleanRef booleanRef, InterfaceC41708m<? super Boolean> interfaceC41708m, String str, boolean z11) {
        if (booleanRef.element || !interfaceC41708m.isActive()) {
            return;
        }
        booleanRef.element = true;
        C46392a.m102333p(SiteService.f47793a.m58011y(), str);
        C44128b.m97266j("SiteService", "showRecommendDialog TARGET_SITE_TYPE_KV putString: " + str);
        Result.Companion companion = Result.INSTANCE;
        interfaceC41708m.resumeWith(Result.m103844constructorimpl(Boolean.valueOf(z11)));
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SiteService$showRecommendDialog$2(this.$targetSiteType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteService$showRecommendDialog$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String strM58061e;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str3 = this.$targetSiteType;
        this.L$0 = str3;
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        SupportSiteManager supportSiteManager = SupportSiteManager.f47892a;
        String strM58061e2 = supportSiteManager.m58061e(str3);
        if (strM58061e2 == null) {
            str = str3;
        } else {
            str = strM58061e2;
        }
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        if (!Intrinsics.areEqual(str3, siteInfoManager.m58110d()) ? (strM58061e = supportSiteManager.m58061e(siteInfoManager.m58110d())) != null : (strM58061e = supportSiteManager.m58061e(SiteService.f47793a.m58005s())) != null) {
            str2 = strM58061e;
        } else {
            str2 = str3;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C42899b.m94073c(new C24126a(str3, str, str2, booleanRef, c41716o));
        c41716o.mo91119t(new C24127b(booleanRef));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
