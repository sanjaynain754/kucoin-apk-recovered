package com.kubi.sdk.site.rebirth;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.site.R$id;
import com.kubi.sdk.site.R$layout;
import com.kubi.sdk.site.R$string;
import com.kubi.sdk.site.SiteService;
import com.kubi.sdk.site.config.SupportSiteManager;
import com.kubi.sdk.site.helper.ReportHelper;
import com.kubi.utils.C27017c;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SiteLoadingHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J/\u0010\u0011\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u001cJ\u001b\u0010\u001d\u001a\u00020\f*\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u001fJ\u001b\u0010 \u001a\u00020\f*\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b!J'\u0010\"\u001a\u00020\f*\u00020\u001e2\b\b\u0001\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0005H\u0082\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/SiteLoadingHelper;", "", "<init>", "()V", "SITE_CHANGE_TITLE", "", "SITE_CHANGE_SUB_TITLE", "SITE_CHANGE_BLOCK_TITLE", "SITE_CHANGE_BLOCK", "SITE_CHANGE_BLOCK_BUTTON", "SITE_CHANGE_BLOCK_SUB_TITLE", "setSwitchSiteViewStub", "", "activity", "Landroidx/activity/ComponentActivity;", "viewStub", "Landroid/view/ViewStub;", "setSiteLoadingText", "Landroid/os/Bundle;", "siteType", "from", "Lcom/kubi/sdk/site/SiteService$SwitchFromType;", "isDirectly", "", "setSiteLoadingText$LSite_googleRelease", "(Landroid/os/Bundle;Ljava/lang/String;Lcom/kubi/sdk/site/SiteService$SwitchFromType;Ljava/lang/Boolean;)V", "isBlockChangeView", "bundle", "isBlockChangeView$LSite_googleRelease", "setSwitchLoadingView", "Landroid/view/View;", "setSwitchLoadingView$LSite_googleRelease", "setSwitchBlockView", "setSwitchBlockView$LSite_googleRelease", "setTextByBundle", "id", "", "key", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteLoadingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteLoadingHelper.kt\ncom/kubi/sdk/site/rebirth/SiteLoadingHelper\n*L\n1#1,124:1\n116#1,6:125\n116#1,6:131\n116#1,6:137\n*S KotlinDebug\n*F\n+ 1 SiteLoadingHelper.kt\ncom/kubi/sdk/site/rebirth/SiteLoadingHelper\n*L\n110#1:125,6\n111#1:131,6\n112#1:137,6\n*E\n"})
public final class SiteLoadingHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteLoadingHelper f47947a = new SiteLoadingHelper();

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.SiteLoadingHelper$a */
    /* JADX INFO: compiled from: SiteLoadingHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24173a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SiteService.SwitchFromType.values().length];
            try {
                iArr[SiteService.SwitchFromType.Gateway.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SiteService.SwitchFromType.Bridge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SiteService.SwitchFromType.Migration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SiteService.SwitchFromType.Login.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58189a(@Nullable Bundle bundle) {
        if (bundle != null) {
            return bundle.getBoolean("site_change_block");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m58190b(@NotNull Bundle bundle, @NotNull String siteType, @NotNull SiteService.SwitchFromType from, @Nullable Boolean bool) {
        String strM66516f;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(from, "from");
        String strM58061e = SupportSiteManager.f47892a.m58061e(siteType);
        if (strM58061e != null) {
            siteType = strM58061e;
        }
        C27017c c27017c = C27017c.f54310a;
        String strM66516f2 = c27017c.m66516f(R$string.site_changing_to, siteType);
        int i11 = C24173a.$EnumSwitchMapping$0[from.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            strM66516f = c27017c.m66516f(R$string.site_changing_info_by_kyc, siteType);
        } else {
            strM66516f = i11 != 4 ? c27017c.m66516f(R$string.site_changing_info_by_ip, siteType) : c27017c.m66516f(R$string.site_changing_info_by_login, siteType);
        }
        bundle.putString("site_change_sub_title", strM66516f);
        bundle.putString("site_change_title", strM66516f2);
        if (Intrinsics.areEqual(bool, Boolean.TRUE) || !SetsKt.setOf((Object[]) new SiteService.SwitchFromType[]{SiteService.SwitchFromType.Gateway, SiteService.SwitchFromType.Bridge}).contains(from)) {
            return;
        }
        bundle.putBoolean("site_change_block", true);
        String strM66516f3 = c27017c.m66516f(R$string.site_changing_title, new Object[0]);
        String strM66516f4 = c27017c.m66516f(R$string.site_changing_dialog_info_by_kyc, siteType);
        String strM66516f5 = c27017c.m66516f(R$string.site_changing_switch_now, new Object[0]);
        bundle.putString("site_change_block_title", strM66516f3);
        bundle.putString("site_change_block_sub_title", strM66516f4);
        bundle.putString("site_change_block_btn", strM66516f5);
    }

    /* JADX INFO: renamed from: c */
    public final void m58191c(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (bundle == null) {
            return;
        }
        int i11 = R$id.blockTitle;
        String string = bundle.getString("site_change_block_title");
        BaseTextView baseTextView = (BaseTextView) view.findViewById(i11);
        if (string != null && baseTextView != null) {
            baseTextView.setText(string);
        }
        int i12 = R$id.blockSubTitle;
        String string2 = bundle.getString("site_change_block_sub_title");
        BaseTextView baseTextView2 = (BaseTextView) view.findViewById(i12);
        if (string2 != null && baseTextView2 != null) {
            baseTextView2.setText(string2);
        }
        int i13 = R$id.btn_confirm;
        String string3 = bundle.getString("site_change_block_btn");
        BaseTextView baseTextView3 = (BaseTextView) view.findViewById(i13);
        if (string3 == null || baseTextView3 == null) {
            return;
        }
        baseTextView3.setText(string3);
    }

    /* JADX INFO: renamed from: d */
    public final void m58192d(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        String string2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (bundle == null || (string = bundle.getString("site_change_title")) == null || (string2 = bundle.getString("site_change_sub_title")) == null || (baseTextView = (BaseTextView) view.findViewById(R$id.title)) == null || (baseTextView2 = (BaseTextView) view.findViewById(R$id.subTitle)) == null) {
            return;
        }
        baseTextView.setText(string);
        baseTextView2.setText(string2);
    }

    /* JADX INFO: renamed from: e */
    public final void m58193e(@NotNull ComponentActivity activity, @NotNull ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        viewStub.setLayoutResource(R$layout.site_switch_loading);
        View viewInflate = viewStub.inflate();
        Intrinsics.checkNotNull(viewInflate);
        m58192d(viewInflate, activity.getIntent().getExtras());
        ReportHelper.f47911a.m58104c(activity);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new SiteLoadingHelper$setSwitchSiteViewStub$1(activity, null), 3, null);
    }
}
