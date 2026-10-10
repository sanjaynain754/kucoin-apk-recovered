package com.kubi.sdk.site.rebirth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.sdk.site.R$layout;
import com.kubi.sdk.site.SiteService;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.C27012a;
import java.util.ArrayList;
import java.util.Stack;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: AppRebirthEmptyActivity.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u0010J\b\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/AppRebirthEmptyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "TAG", "", "getTAG$LSite_googleRelease", "()Ljava/lang/String;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "siteConfigCacheExist", "", "targetSite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "siteUcConfigCacheExist", "setSystemUI", "finishOther", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppRebirthEmptyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRebirthEmptyActivity.kt\ncom/kubi/sdk/site/rebirth/AppRebirthEmptyActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n774#2:137\n865#2,2:138\n1869#2,2:140\n*S KotlinDebug\n*F\n+ 1 AppRebirthEmptyActivity.kt\ncom/kubi/sdk/site/rebirth/AppRebirthEmptyActivity\n*L\n130#1:137\n130#1:138,2\n131#1:140,2\n*E\n"})
public final class AppRebirthEmptyActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f47936i = "AppRebirthEmptyActivity";

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.AppRebirthEmptyActivity$onResume$1 */
    /* JADX INFO: compiled from: AppRebirthEmptyActivity.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.rebirth.AppRebirthEmptyActivity$onResume$1", m90122f = "AppRebirthEmptyActivity.kt", m90123i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, m90124l = {53, 73, 73, 83, 89}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$launch", "targetSite", "siteConfigDeferred", "ucSiteDeferred", "$this$launch", "targetSite", "siteConfigDeferred", "ucSiteDeferred", "$this$launch", "targetSite", "siteConfigDeferred", "ucSiteDeferred", "finalResult", "$this$launch", "targetSite", "siteConfigDeferred", "ucSiteDeferred", "finalResult"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    @SourceDebugExtension({"SMAP\nAppRebirthEmptyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRebirthEmptyActivity.kt\ncom/kubi/sdk/site/rebirth/AppRebirthEmptyActivity$onResume$1\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,136:1\n23#2,2:137\n*S KotlinDebug\n*F\n+ 1 AppRebirthEmptyActivity.kt\ncom/kubi/sdk/site/rebirth/AppRebirthEmptyActivity$onResume$1\n*L\n77#1:137,2\n*E\n"})
    public static final class C241661 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bundle $bundle;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241661(Bundle bundle, Continuation<? super C241661> continuation) {
            super(2, continuation);
            this.$bundle = bundle;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C241661 c241661 = AppRebirthEmptyActivity.this.new C241661(this.$bundle, continuation);
            c241661.L$0 = obj;
            return c241661;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241661) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x013d  */
        /* JADX WARN: Code duplicated, block: B:37:0x0164 A[PHI: r3 r5 r14
          0x0164: PHI (r3v14 kotlinx.coroutines.r0) = (r3v13 kotlinx.coroutines.r0), (r3v17 kotlinx.coroutines.r0) binds: [B:29:0x013b, B:34:0x015d] A[DONT_GENERATE, DONT_INLINE]
          0x0164: PHI (r5v13 java.lang.String) = (r5v12 java.lang.String), (r5v16 java.lang.String) binds: [B:29:0x013b, B:34:0x015d] A[DONT_GENERATE, DONT_INLINE]
          0x0164: PHI (r14v3 kotlinx.coroutines.r0) = (r14v2 kotlinx.coroutines.r0), (r14v5 kotlinx.coroutines.r0) binds: [B:29:0x013b, B:34:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x0198  */
        /* JADX WARN: Code duplicated, block: B:44:0x01e3 A[PHI: r3 r4 r5 r6
          0x01e3: PHI (r3v19 ??) = (r3v26 ??), (r3v27 ??) binds: [B:42:0x01e0, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x01e3: PHI (r4v24 kotlinx.coroutines.r0) = (r4v19 kotlinx.coroutines.r0), (r4v35 kotlinx.coroutines.r0) binds: [B:42:0x01e0, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x01e3: PHI (r5v17 kotlinx.coroutines.r0) = (r5v15 kotlinx.coroutines.r0), (r5v23 kotlinx.coroutines.r0) binds: [B:42:0x01e0, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x01e3: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v8 java.lang.String) binds: [B:42:0x01e0, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:47:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:51:0x0223  */
        /* JADX WARN: Code duplicated, block: B:54:0x0236  */
        /* JADX WARN: Code duplicated, block: B:55:0x0238  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0153, code lost:
        
            if (r4 == r1) goto L50;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r10v3, types: [android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19, types: [int] */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context, com.kubi.sdk.site.rebirth.AppRebirthEmptyActivity] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC41729r0 interfaceC41729r0M91102b;
            InterfaceC41729r0 interfaceC41729r0M91102b2;
            Object objMo91198h;
            String str;
            Object objMo91198h2;
            InterfaceC41729r0 interfaceC41729r0;
            ?? r11;
            String str2;
            InterfaceC41729r0 interfaceC41729r1;
            ?? r12;
            boolean z11;
            ?? r13;
            boolean z12;
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AppRebirthEmptyActivity.this.m58173H();
                this.L$0 = interfaceC41709m0;
                this.label = 1;
                if (DelayKt.m90350b(100L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 == 2) {
                    interfaceC41729r0M91102b2 = (InterfaceC41729r0) this.L$3;
                    InterfaceC41729r0 interfaceC41729r2 = (InterfaceC41729r0) this.L$2;
                    str = (String) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    interfaceC41729r0M91102b = interfaceC41729r2;
                    objMo91198h = obj;
                    if (((Boolean) objMo91198h).booleanValue()) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                        this.L$2 = interfaceC41729r0M91102b;
                        this.L$3 = interfaceC41729r0M91102b2;
                        this.label = 3;
                        objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
                    } else {
                        interfaceC41729r0 = interfaceC41729r0M91102b2;
                        r11 = 0;
                        str2 = str;
                        interfaceC41729r1 = interfaceC41729r0M91102b;
                        C44128b.m97266j(AppRebirthEmptyActivity.this.getF47936i(), "finalResult=" + r11 + " [" + interfaceC41729r1 + " - " + interfaceC41729r0 + ']');
                        if (r11 == 0) {
                            SiteInfoManager.f47913a.m58114h();
                            C46392a.m102333p(SiteService.f47793a.m58011y(), "");
                        }
                        ?? r14 = AppRebirthEmptyActivity.this;
                        ?? intent = new Intent("get_target_site");
                        intent.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                        intent.putExtra("remoteSiteConfigSuc", r11);
                        r14.sendBroadcast(intent);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.I$0 = r11;
                        this.label = 4;
                        r12 = r11;
                        if (DelayKt.m90350b(2000L, this) != coroutine_suspended) {
                            AppRebirthEmptyActivity appRebirthEmptyActivity = AppRebirthEmptyActivity.this;
                            Intent intent2 = new Intent("get_target_site");
                            intent2.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                            if (r12 != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            intent2.putExtra("remoteSiteConfigSuc", z11);
                            appRebirthEmptyActivity.sendBroadcast(intent2);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                            this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                            this.I$0 = r12;
                            this.label = 5;
                            if (DelayKt.m90350b(4000L, this) != coroutine_suspended) {
                                r13 = r12;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 3) {
                    interfaceC41729r0M91102b2 = (InterfaceC41729r0) this.L$3;
                    InterfaceC41729r0 interfaceC41729r3 = (InterfaceC41729r0) this.L$2;
                    str = (String) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    interfaceC41729r0M91102b = interfaceC41729r3;
                    objMo91198h2 = obj;
                    if (((Boolean) objMo91198h2).booleanValue()) {
                        interfaceC41729r0 = interfaceC41729r0M91102b2;
                        r11 = 1;
                    } else {
                        interfaceC41729r0 = interfaceC41729r0M91102b2;
                        r11 = 0;
                    }
                    str2 = str;
                    interfaceC41729r1 = interfaceC41729r0M91102b;
                    C44128b.m97266j(AppRebirthEmptyActivity.this.getF47936i(), "finalResult=" + r11 + " [" + interfaceC41729r1 + " - " + interfaceC41729r0 + ']');
                    if (r11 == 0) {
                        SiteInfoManager.f47913a.m58114h();
                        C46392a.m102333p(SiteService.f47793a.m58011y(), "");
                    }
                    ?? r15 = AppRebirthEmptyActivity.this;
                    ?? intent3 = new Intent("get_target_site");
                    intent3.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                    intent3.putExtra("remoteSiteConfigSuc", r11);
                    r15.sendBroadcast(intent3);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.I$0 = r11;
                    this.label = 4;
                    r12 = r11;
                    if (DelayKt.m90350b(2000L, this) != coroutine_suspended) {
                        AppRebirthEmptyActivity appRebirthEmptyActivity2 = AppRebirthEmptyActivity.this;
                        Intent intent4 = new Intent("get_target_site");
                        intent4.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                        if (r12 != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        intent4.putExtra("remoteSiteConfigSuc", z11);
                        appRebirthEmptyActivity2.sendBroadcast(intent4);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.I$0 = r12;
                        this.label = 5;
                        if (DelayKt.m90350b(4000L, this) != coroutine_suspended) {
                            r13 = r12;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 4) {
                    int i12 = this.I$0;
                    interfaceC41729r0 = (InterfaceC41729r0) this.L$3;
                    interfaceC41729r1 = (InterfaceC41729r0) this.L$2;
                    str2 = (String) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    r12 = i12;
                    AppRebirthEmptyActivity appRebirthEmptyActivity3 = AppRebirthEmptyActivity.this;
                    Intent intent5 = new Intent("get_target_site");
                    intent5.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                    if (r12 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    intent5.putExtra("remoteSiteConfigSuc", z11);
                    appRebirthEmptyActivity3.sendBroadcast(intent5);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.I$0 = r12;
                    this.label = 5;
                    if (DelayKt.m90350b(4000L, this) != coroutine_suspended) {
                        r13 = r12;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.I$0;
                ResultKt.throwOnFailure(obj);
                r13 = i13;
            }
            AppRebirthEmptyActivity appRebirthEmptyActivity4 = AppRebirthEmptyActivity.this;
            Intent intent6 = new Intent("get_target_site");
            intent6.setPackage(AppRebirthEmptyActivity.this.getPackageName());
            if (r13 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            intent6.putExtra("remoteSiteConfigSuc", z12);
            appRebirthEmptyActivity4.sendBroadcast(intent6);
            return Unit.INSTANCE;
            C44128b.m97266j(AppRebirthEmptyActivity.this.getF47936i(), "onResume currentSiteType=" + SiteType.INSTANCE.getCurrentSiteType() + "，targetSite=" + SiteInfoManager.f47913a.m58110d() + " => " + Thread.currentThread());
            String stringExtra = AppRebirthEmptyActivity.this.getIntent().getStringExtra("app_rebirth_target_site");
            AppRebirthHelper.f47948a.m58198e(AppRebirthEmptyActivity.this, this.$bundle);
            if (stringExtra != null && stringExtra.length() != 0) {
                interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, C42911a.m94120b(), null, new AppRebirthEmptyActivity$onResume$1$siteConfigDeferred$1(AppRebirthEmptyActivity.this, stringExtra, null), 2, null);
                interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, C42911a.m94120b(), null, new AppRebirthEmptyActivity$onResume$1$ucSiteDeferred$1(AppRebirthEmptyActivity.this, null), 2, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(stringExtra);
                this.L$2 = interfaceC41729r0M91102b;
                this.L$3 = interfaceC41729r0M91102b2;
                this.label = 2;
                objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
                if (objMo91198h != coroutine_suspended) {
                    str = stringExtra;
                    if (((Boolean) objMo91198h).booleanValue()) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                        this.L$2 = interfaceC41729r0M91102b;
                        this.L$3 = interfaceC41729r0M91102b2;
                        this.label = 3;
                        objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
                    } else {
                        interfaceC41729r0 = interfaceC41729r0M91102b2;
                        r11 = 0;
                        str2 = str;
                        interfaceC41729r1 = interfaceC41729r0M91102b;
                        C44128b.m97266j(AppRebirthEmptyActivity.this.getF47936i(), "finalResult=" + r11 + " [" + interfaceC41729r1 + " - " + interfaceC41729r0 + ']');
                        if (r11 == 0) {
                            SiteInfoManager.f47913a.m58114h();
                            C46392a.m102333p(SiteService.f47793a.m58011y(), "");
                        }
                        ?? r16 = AppRebirthEmptyActivity.this;
                        ?? intent7 = new Intent("get_target_site");
                        intent7.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                        intent7.putExtra("remoteSiteConfigSuc", r11);
                        r16.sendBroadcast(intent7);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.I$0 = r11;
                        this.label = 4;
                        r12 = r11;
                        if (DelayKt.m90350b(2000L, this) != coroutine_suspended) {
                            AppRebirthEmptyActivity appRebirthEmptyActivity5 = AppRebirthEmptyActivity.this;
                            Intent intent8 = new Intent("get_target_site");
                            intent8.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                            if (r12 != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            intent8.putExtra("remoteSiteConfigSuc", z11);
                            appRebirthEmptyActivity5.sendBroadcast(intent8);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                            this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                            this.I$0 = r12;
                            this.label = 5;
                            if (DelayKt.m90350b(4000L, this) != coroutine_suspended) {
                                r13 = r12;
                                AppRebirthEmptyActivity appRebirthEmptyActivity6 = AppRebirthEmptyActivity.this;
                                Intent intent9 = new Intent("get_target_site");
                                intent9.setPackage(AppRebirthEmptyActivity.this.getPackageName());
                                if (r13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                intent9.putExtra("remoteSiteConfigSuc", z12);
                                appRebirthEmptyActivity6.sendBroadcast(intent9);
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m58172J() {
        EdgeToEdgeCompat.f48106a.m58273k(this);
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getF47936i() {
        return this.f47936i;
    }

    /* JADX INFO: renamed from: H */
    public final void m58173H() {
        Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
        Intrinsics.checkNotNullExpressionValue(stackM66493g, "getActivityStack(...)");
        ArrayList<Activity> arrayList = new ArrayList();
        for (Object obj : stackM66493g) {
            if (!(((Activity) obj) instanceof AppRebirthEmptyActivity)) {
                arrayList.add(obj);
            }
        }
        for (Activity activity : arrayList) {
            activity.overridePendingTransition(0, 0);
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        m58172J();
        setContentView(R$layout.site_empty);
        getOnBackPressedDispatcher().addCallback(new C24165a());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C241661(extras, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.AppRebirthEmptyActivity$a */
    /* JADX INFO: compiled from: AppRebirthEmptyActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/sdk/site/rebirth/AppRebirthEmptyActivity$onCreate$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24165a extends OnBackPressedCallback {
        public C24165a() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }
    }
}
