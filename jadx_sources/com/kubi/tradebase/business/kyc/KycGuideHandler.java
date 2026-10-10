package com.kubi.tradebase.business.kyc;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.tradebase.R$drawable;
import com.kubi.tradebase.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.tradebase.business.kyc.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KycGuideHandler.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001c\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/tradebase/business/kyc/KycGuideHandler;", "", "<init>", "()V", "showKycGuideDialog", "", "noticeDetailEntity", "Lcom/kubi/tradebase/business/kyc/NoticeDetailEntity;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "pageId", "", "blockId", "setTitle", "setMessage", "setRefuseButtonText", "setAgreeButtonText", "consumeRefuseButtonEvent", "consumeAgreeButtonEvent", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycGuideHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycGuideHandler.kt\ncom/kubi/tradebase/business/kyc/KycGuideHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class KycGuideHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KycGuideHandler f51552a = new KycGuideHandler();

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m63189k(KycGuideHandler kycGuideHandler, NoticeDetailEntity noticeDetailEntity, FragmentManager fragmentManager, String str, String str2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        kycGuideHandler.m63199j(noticeDetailEntity, fragmentManager, str, str2);
    }

    /* JADX INFO: renamed from: l */
    public static final void m63190l(String str, BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<unused var>");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        if (str != null) {
            C43852m.m96595g(str, "KYCIdentification", null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m63191m(String str, String str2, DialogInterface dialogInterface, int i11) {
        f51552a.m63194e(str);
        if (str == null || str2 == null) {
            return;
        }
        C43852m.m96591c(str, str2, "2", null, 8, null);
    }

    /* JADX INFO: renamed from: n */
    public static final void m63192n(NoticeDetailEntity noticeDetailEntity, String str, String str2, DialogInterface dialogInterface, int i11) {
        f51552a.m63193d(noticeDetailEntity, str);
        if (str == null || str2 == null) {
            return;
        }
        C43852m.m96591c(str, str2, "1", null, 8, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m63193d(NoticeDetailEntity noticeDetailEntity, String str) {
        String buttonAgreeAppUrl;
        Router router = Router.f46192a;
        String str2 = null;
        if (noticeDetailEntity != null && (buttonAgreeAppUrl = noticeDetailEntity.getButtonAgreeAppUrl()) != null && buttonAgreeAppUrl.length() > 0) {
            str2 = buttonAgreeAppUrl;
        }
        router.m56184f(C27041f.m66669i(str2, "user/kyc")).m4048k();
        if (str != null) {
            C43852m.m96591c(str, "KYCIdentification", null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m63194e(String str) {
        if (str != null) {
            C43852m.m96591c(str, "KYCIdentification", "2", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m63195f(NoticeDetailEntity noticeDetailEntity) {
        return C27041f.m66669i(noticeDetailEntity != null ? noticeDetailEntity.getButtonAgree() : null, C27017c.f54310a.m66516f(R$string.forcekyc_tips_main_account_auth_now, new Object[0]));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m63196g(@Nullable NoticeDetailEntity noticeDetailEntity) {
        return C27041f.m66669i(noticeDetailEntity != null ? noticeDetailEntity.getContent() : null, C27017c.f54310a.m66516f(R$string.forcekyc_tips_main_account_msg, new Object[0]));
    }

    /* JADX INFO: renamed from: h */
    public final String m63197h(NoticeDetailEntity noticeDetailEntity) {
        return C27041f.m66669i(noticeDetailEntity != null ? noticeDetailEntity.getButtonRefuse() : null, C27017c.f54310a.m66516f(R$string.close, new Object[0]));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m63198i(@Nullable NoticeDetailEntity noticeDetailEntity) {
        return C27041f.m66669i(noticeDetailEntity != null ? noticeDetailEntity.getTitle() : null, C27017c.f54310a.m66516f(R$string.forcekyc_tips_main_account_title, new Object[0]));
    }

    /* JADX INFO: renamed from: j */
    public final void m63199j(@Nullable final NoticeDetailEntity noticeDetailEntity, @NotNull FragmentManager childFragmentManager, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_error).m54169Z4(true).m54157N4(true).m54168Y4(m63198i(noticeDetailEntity)).m54156M4(m63196g(noticeDetailEntity)).m54161R4(0).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.tradebase.business.kyc.b
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                KycGuideHandler.m63190l(str, baseViewHolder, dialogFragmentHelper);
            }
        }).m54160Q4(m63197h(noticeDetailEntity), new DialogInterface.OnClickListener() { // from class: com.kubi.tradebase.business.kyc.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                KycGuideHandler.m63191m(str, str2, dialogInterface, i11);
            }
        }).m54163T4(m63195f(noticeDetailEntity), new DialogInterface.OnClickListener() { // from class: com.kubi.tradebase.business.kyc.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                KycGuideHandler.m63192n(noticeDetailEntity, str, str2, dialogInterface, i11);
            }
        }).show(childFragmentManager, "KycGuideDialog");
    }
}
