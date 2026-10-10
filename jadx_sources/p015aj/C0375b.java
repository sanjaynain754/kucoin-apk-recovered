package p015aj;

import android.content.Context;
import com.kubi.helpcenter.CustomerServiceHelper;
import com.kubi.helpcenter.UserLabelManager;
import com.kubi.helpcenter.WorkOrderHelper;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p798yi.InterfaceC46507b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: aj.b */
/* JADX INFO: compiled from: HelpCenterService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016JX\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2*\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000fj\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/helpcenter/service/HelpCenterService;", "Lcom/kubi/helpcenter/api/local/IHelpCenterService;", "<init>", "()V", "toHelpChat", "", "activity", "Landroid/content/Context;", "from", "", "source", "Lcom/kubi/helpcenter/api/CustomerServiceType;", "toChatDirectly", "context", "configMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isReset", "", "jumpToWorkOrder", "formId", "clearUserLabel", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHelpCenterService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterService.kt\ncom/kubi/helpcenter/service/HelpCenterService\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,49:1\n25#2,3:50\n25#2,3:53\n25#2,3:56\n*S KotlinDebug\n*F\n+ 1 HelpCenterService.kt\ncom/kubi/helpcenter/service/HelpCenterService\n*L\n21#1:50,3\n34#1:53,3\n47#1:56,3\n*E\n"})
public final class C0375b implements IHelpCenterService {
    @Override // com.kubi.helpcenter.api.local.IHelpCenterService
    /* JADX INFO: renamed from: a */
    public void mo1472a(@NotNull String formId) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        WorkOrderHelper.f25242a.m28899c(formId);
    }

    @Override // com.kubi.helpcenter.api.local.IHelpCenterService
    /* JADX INFO: renamed from: d */
    public void mo1474d(@NotNull Context activity, @Nullable String str, @NotNull CustomerServiceType source) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46507b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46507b) objM56186h).m102579a(activity, str, source);
        } else {
            CustomerServiceHelper.Companion.toChatDirectly$default(CustomerServiceHelper.f25162a, activity, str, source, null, false, 24, null);
        }
    }

    @Override // com.kubi.helpcenter.api.local.IHelpCenterService
    /* JADX INFO: renamed from: e */
    public void mo1475e() {
        UserLabelManager.f25240a.m28894c();
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46507b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46507b) objM56186h).m102580b();
        }
    }

    @Override // com.kubi.helpcenter.api.local.IHelpCenterService
    /* JADX INFO: renamed from: b */
    public void mo1473b(@Nullable Context context, @Nullable String str, @NotNull CustomerServiceType source, @Nullable HashMap<String, String> map, boolean z11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (context != null) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46507b.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h != null) {
                ((InterfaceC46507b) objM56186h).m102579a(context, str, source);
            } else {
                CustomerServiceHelper.f25162a.toChatDirectly(context, str, source, map, z11);
            }
        }
    }
}
