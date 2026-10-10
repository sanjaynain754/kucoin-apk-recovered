package com.kubi.helpcenter.api.local;

import android.content.Context;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.router.core.Router;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IHelpCenterService.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J`\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001`\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/helpcenter/api/local/IHelpCenterService;", "", "toHelpChat", "", "activity", "Landroid/content/Context;", "from", "", "source", "Lcom/kubi/helpcenter/api/CustomerServiceType;", "toChatDirectly", "context", "configMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isReset", "", "jumpToWorkOrder", "formId", "clearUserLabel", "Companion", "HelpCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IHelpCenterService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f25326a = Companion.f25327a;

    /* JADX INFO: compiled from: IHelpCenterService.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/helpcenter/api/local/IHelpCenterService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/helpcenter/api/local/IHelpCenterService;", "HelpCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f25327a = new Companion();

        @NotNull
        public final IHelpCenterService get() {
            return (IHelpCenterService) Router.f46192a.m56192n(IHelpCenterService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo1472a(@NotNull String str);

    /* JADX INFO: renamed from: b */
    void mo1473b(@Nullable Context context, @Nullable String str, @NotNull CustomerServiceType customerServiceType, @Nullable HashMap<String, String> map, boolean z11);

    /* JADX INFO: renamed from: d */
    void mo1474d(@NotNull Context context, @Nullable String str, @NotNull CustomerServiceType customerServiceType);

    /* JADX INFO: renamed from: e */
    void mo1475e();

    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m28903c(IHelpCenterService iHelpCenterService, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToWorkOrder");
        }
        if ((i11 & 1) != 0) {
            str = "";
        }
        iHelpCenterService.mo1472a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m28904f(IHelpCenterService iHelpCenterService, Context context, String str, CustomerServiceType customerServiceType, HashMap map, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toChatDirectly");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            customerServiceType = CustomerServiceType.NONE;
        }
        CustomerServiceType customerServiceType2 = customerServiceType;
        if ((i11 & 8) != 0) {
            map = null;
        }
        HashMap map2 = map;
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        iHelpCenterService.mo1473b(context, str2, customerServiceType2, map2, z11);
    }
}
