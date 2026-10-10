package com.kubi.sdk.site.migration;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.host.HostManager;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.AlertDialogResult;
import com.kubi.sdk.site.R$drawable;
import com.kubi.sdk.site.R$string;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.config.SupportSiteManager;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.sdk.site.exception.SiteMessage;
import com.kubi.utils.C27017c;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.Locale;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: NeedMigrationDialog.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.migration.NeedMigrationDialog$showDialog$2", m90122f = "NeedMigrationDialog.kt", m90123i = {0, 0, 0, 0, 0, 0, 0}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {"topActivity", "currentSite", "globalSite", "australiaSite", "cancelString", "helper", "isTargetChangeSite"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
@SourceDebugExtension({"SMAP\nNeedMigrationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NeedMigrationDialog.kt\ncom/kubi/sdk/site/migration/NeedMigrationDialog$showDialog$2\n+ 2 NeedMigrationDialog.kt\ncom/kubi/sdk/site/migration/NeedMigrationDialog\n+ 3 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n31#2:107\n32#2:111\n31#2:112\n32#2:116\n31#2:117\n32#2:121\n50#3,3:108\n50#3,3:113\n50#3,3:118\n45#3,3:123\n1#4:122\n*S KotlinDebug\n*F\n+ 1 NeedMigrationDialog.kt\ncom/kubi/sdk/site/migration/NeedMigrationDialog$showDialog$2\n*L\n41#1:107\n41#1:111\n42#1:112\n42#1:116\n43#1:117\n43#1:121\n41#1:108,3\n42#1:113,3\n43#1:118,3\n102#1:123,3\n*E\n"})
public final class NeedMigrationDialog$showDialog$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $from;
    final /* synthetic */ String $targetSite;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMigrationDialog$showDialog$2(String str, String str2, Continuation<? super NeedMigrationDialog$showDialog$2> continuation) {
        super(2, continuation);
        this.$targetSite = str;
        this.$from = str2;
    }

    /* JADX INFO: renamed from: g */
    public static final void m58133g(String str, DialogInterface dialogInterface, int i11) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/account/transfer?appNeedLang=true", null, null, null, null, null, null, 126, null);
        C43852m.m96590b("migratePopupWindow", "buttonMigrateImmediately", "immediately1", TuplesKt.m90091to("user_original_siteType", SiteType.INSTANCE.getCurrentSiteType()), TuplesKt.m90091to("user_target_siteType", str));
    }

    /* JADX INFO: renamed from: h */
    public static final void m58134h(String str, DialogInterface dialogInterface, int i11) {
        C43852m.m96590b("migratePopupWindow", "buttonIgnore", "ignore2", TuplesKt.m90091to("user_original_siteType", SiteType.INSTANCE.getCurrentSiteType()), TuplesKt.m90091to("user_target_siteType", str));
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NeedMigrationDialog$showDialog$2(this.$targetSite, this.$from, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((NeedMigrationDialog$showDialog$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        Object objMo91198h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = false;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Activity activityM6125h = C5258a.m6125h();
                FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
                if (fragmentActivity == null) {
                    NeedMigrationDialog needMigrationDialog = NeedMigrationDialog.f47921a;
                    String str = "showDialog failed no TopActivity";
                    C44128b.m97261e("NeedMigrationDialog", str);
                    C43846g.m96568c(new SiteMessage(str, "NeedMigrationDialog", false, 4, null), null, 2, null);
                    return Boxing.boxBoolean(false);
                }
                if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                    NeedMigrationDialog needMigrationDialog2 = NeedMigrationDialog.f47921a;
                    String str2 = "showDialog failed topActivity is finish";
                    C44128b.m97261e("NeedMigrationDialog", str2);
                    C43846g.m96568c(new SiteMessage(str2, "NeedMigrationDialog", false, 4, null), null, 2, null);
                    return Boxing.boxBoolean(false);
                }
                if (GlobalDialogManager.f43651a.m54344i()) {
                    NeedMigrationDialog needMigrationDialog3 = NeedMigrationDialog.f47921a;
                    String str3 = "showDialog failed hasDialog";
                    C44128b.m97261e("NeedMigrationDialog", str3);
                    C43846g.m96568c(new SiteMessage(str3, "NeedMigrationDialog", false, 4, null), null, 2, null);
                    return Boxing.boxBoolean(false);
                }
                SiteType.Companion companion = SiteType.INSTANCE;
                String currentSiteType = companion.getCurrentSiteType();
                String string2 = SiteType.Global.toString();
                String string3 = SiteType.Australia.toString();
                int i12 = ((Intrinsics.areEqual(currentSiteType, string2) && StringsKt.equals(this.$targetSite, string3, true)) || (Intrinsics.areEqual(currentSiteType, string3) && StringsKt.equals(this.$targetSite, string2, true))) ? 1 : 0;
                if (i12 != 0) {
                    int i13 = R$string.site_au_need_migration_dialog_ignore;
                    String currentSiteType2 = companion.getCurrentSiteType();
                    if (currentSiteType2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        String strValueOf = String.valueOf(currentSiteType2.charAt(0));
                        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        sb2.append((Object) upperCase);
                        String strSubstring = currentSiteType2.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        currentSiteType2 = sb2.toString();
                    }
                    string = fragmentActivity.getString(i13, currentSiteType2);
                } else {
                    string = fragmentActivity.getString(R$string.site_need_migration_dialog_ignore);
                }
                Intrinsics.checkNotNull(string);
                AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
                alertDialogFragmentHelperNewInstanceAlert.setPageId("migratePopupWindow");
                AlertDialogFragmentHelper alertDialogFragmentHelperM54157N4 = alertDialogFragmentHelperNewInstanceAlert.m54165V4(R$drawable.ic2_common_warning).m54167X4(R$string.site_need_migration_dialog_title).m54169Z4(true).m54156M4(HtmlCompat.fromHtml(C27017c.f54310a.m66516f(R$string.site_au_need_migration_dialog_ignore, "<b>" + SupportSiteManager.f47892a.m58061e(this.$targetSite) + "</b>"), 0)).m54157N4(true);
                int i14 = R$string.site_need_migration_dialog_start;
                final String str4 = this.$targetSite;
                AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = alertDialogFragmentHelperM54157N4.m54162S4(i14, new DialogInterface.OnClickListener() { // from class: com.kubi.sdk.site.migration.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        NeedMigrationDialog$showDialog$2.m58133g(str4, dialogInterface, i15);
                    }
                });
                final String str5 = this.$targetSite;
                AlertDialogFragmentHelper alertDialogFragmentHelperM54160Q4 = alertDialogFragmentHelperM54162S4.m54160Q4(string, new DialogInterface.OnClickListener() { // from class: com.kubi.sdk.site.migration.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        NeedMigrationDialog$showDialog$2.m58134h(str5, dialogInterface, i15);
                    }
                });
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                alertDialogFragmentHelperM54160Q4.show(supportFragmentManager, "NeedMigrationDialog");
                InterfaceC41769w<AlertDialogResult> interfaceC41769wM54175t4 = alertDialogFragmentHelperM54160Q4.m54175t4();
                this.L$0 = SpillingKt.nullOutSpilledVariable(fragmentActivity);
                this.L$1 = SpillingKt.nullOutSpilledVariable(currentSiteType);
                this.L$2 = SpillingKt.nullOutSpilledVariable(string2);
                this.L$3 = SpillingKt.nullOutSpilledVariable(string3);
                this.L$4 = SpillingKt.nullOutSpilledVariable(string);
                this.L$5 = SpillingKt.nullOutSpilledVariable(alertDialogFragmentHelperM54160Q4);
                this.I$0 = i12;
                this.label = 1;
                objMo91198h = interfaceC41769wM54175t4.mo91198h(this);
                if (objMo91198h == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo91198h = obj;
            }
            AlertDialogResult alertDialogResult = (AlertDialogResult) objMo91198h;
            SiteMigrationConfig.f47922a.m58139e(this.$from);
            if (alertDialogResult == AlertDialogResult.Positive) {
                z11 = true;
            }
        } catch (Exception e11) {
            C44128b.m97263g("NeedMigrationDialog", e11);
            C43846g.m96568c(new SiteException(e11, "NeedMigrationDialog", false, null, 8, null), null, 2, null);
        }
        return Boxing.boxBoolean(z11);
    }
}
