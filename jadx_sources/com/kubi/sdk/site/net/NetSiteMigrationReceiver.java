package com.kubi.sdk.site.net;

import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.sdk.site.helper.ReportHelper;
import com.kubi.user.account.AccountChangeType;
import com.kubi.user.account.MultiAccountBizErrorHandler;
import com.tencent.bugly.proguard.C33863pg;
import f00.C37304a;
import g00.InterfaceC37761m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p569qq.C43846g;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: NetSiteMigrationReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/site/net/NetSiteMigrationReceiver;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "handle", "", "errorInfo", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "handleLegacySiteMigration", "invoke", "Companion", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetSiteMigrationReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetSiteMigrationReceiver.kt\ncom/kubi/sdk/site/net/NetSiteMigrationReceiver\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,70:1\n45#2,3:71\n*S KotlinDebug\n*F\n+ 1 NetSiteMigrationReceiver.kt\ncom/kubi/sdk/site/net/NetSiteMigrationReceiver\n*L\n66#1:71,3\n*E\n"})
public final class NetSiteMigrationReceiver implements InterfaceC46255c {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f47934b = new Companion(null);

    /* JADX INFO: compiled from: NetSiteMigrationReceiver.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/site/net/NetSiteMigrationReceiver$Companion;", "", "<init>", "()V", "TAG", "", "SITE_MIGRATION", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.net.NetSiteMigrationReceiver$a */
    /* JADX INFO: compiled from: NetSiteMigrationReceiver.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24161a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MultiAccountBizErrorHandler.DispatchResult.values().length];
            try {
                iArr[MultiAccountBizErrorHandler.DispatchResult.NON_CURRENT_HANDLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultiAccountBizErrorHandler.DispatchResult.SKIPPED_NO_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MultiAccountBizErrorHandler.DispatchResult.LEGACY_EXECUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Unit m58162c() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m58164d() throws JSONException {
        InterfaceC37761m.a.m85176a(C37304a.f82764a, C33863pg.f71438h, null, null, null, 14, null);
        ReportHelper.f47911a.m58103b(SiteType.INSTANCE.getCurrentSiteType(), "", C33863pg.f71438h, "TRANSFERRING");
    }

    /* JADX INFO: renamed from: e */
    public void m58165e(@NotNull BizErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        try {
            m58163b(errorInfo);
        } catch (Exception e11) {
            C44128b.m97263g("NetSiteErrorReceiver", e11);
            C43846g.m96568c(new SiteException(e11, "NetSiteErrorReceiver", false, null, 8, null), null, 2, null);
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m58165e((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m58163b(BizErrorInfo bizErrorInfo) throws JSONException {
        String strOptString = bizErrorInfo.getBody().optString("code");
        if (strOptString != null && Intrinsics.areEqual(strOptString, "4116")) {
            int i11 = C24161a.$EnumSwitchMapping$0[MultiAccountBizErrorHandler.m65468b(MultiAccountBizErrorHandler.f53654a, bizErrorInfo.getRequest().header("X-APP-TOKEN"), AccountChangeType.TYPE_4116, new Function0() { // from class: com.kubi.sdk.site.net.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetSiteMigrationReceiver.m58162c();
                }
            }, null, 8, null).ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    m58164d();
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
